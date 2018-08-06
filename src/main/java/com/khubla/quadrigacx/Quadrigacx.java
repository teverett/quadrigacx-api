/*
 *   Copyright 2018, Tom Everett
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.khubla.quadrigacx;

import java.util.Hashtable;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider;

import com.khubla.quadrigacx.reqresp.BalanceResponse;
import com.khubla.quadrigacx.reqresp.BuyLimitOrderRequest;
import com.khubla.quadrigacx.reqresp.BuyLimitOrderResponse;
import com.khubla.quadrigacx.reqresp.BuyMarketOrderRequest;
import com.khubla.quadrigacx.reqresp.BuyMarketOrderResponse;
import com.khubla.quadrigacx.reqresp.CancelOrderRequest;
import com.khubla.quadrigacx.reqresp.LookupOrderRequest;
import com.khubla.quadrigacx.reqresp.OpenOrderResponse;
import com.khubla.quadrigacx.reqresp.OpenOrdersRequest;
import com.khubla.quadrigacx.reqresp.OrderBookResponse;
import com.khubla.quadrigacx.reqresp.OrderResponse;
import com.khubla.quadrigacx.reqresp.SellLimitOrderRequest;
import com.khubla.quadrigacx.reqresp.SellLimitOrderResponse;
import com.khubla.quadrigacx.reqresp.SellMarketOrderRequest;
import com.khubla.quadrigacx.reqresp.SellMarketOrderResponse;
import com.khubla.quadrigacx.reqresp.TradingInfoResponse;
import com.khubla.quadrigacx.reqresp.TransactionResponse;
import com.khubla.quadrigacx.reqresp.UserTransactionRequest;
import com.khubla.quadrigacx.reqresp.UserTransactionResponse;

/**
 * https://www.quadrigacx.com/api_info
 *
 * @author tom
 *
 */
public class Quadrigacx {
   /**
    * books
    */
   /*
    * bch - bitcoin cash
    */
   /*
    * eth - ethereum
    */
   /*
    * ltc - litecoin
    */
   /*
    * btg - bitcoin gold
    */
   /*
    * btc - bitcoin
    */
   public enum Book {
      btc_cad, btc_usd, eth_cad, eth_btc, ltc_cad, ltc_btc, bch_cad, bch_btc, btg_cad, btg_btc
   }

   /**
    * currencies
    */
   public enum Currency {
      cad, usd, btc, ltc, bch, btg, eth
   };

   /**
    * order status
    * @author tom
    *
    */
   public enum OrderStatus {
      cancelled(-1), active(0), partiallyfilled(1), complete(2);
      private final int value;

      OrderStatus(final int newValue) {
         value = newValue;
      }

      public int getValue() {
         return value;
      }
   };

   /**
    * order type
    * @author tom
    *
    */
   public enum OrderType {
      buy(0), sell(1);
      private final int value;

      OrderType(final int newValue) {
         value = newValue;
      }

      public int getValue() {
         return value;
      }
   }

   /**
    * sort
    */
   public enum Sort {
      asc, desc
   }

   /**
    * transaction side
    * @author tom
    *
    */
   public enum TransactionSide {
      buy, sell
   }

   /**
    * transaction timeframe
    * @author tom
    *
    */
   public enum TransactionTimeframe {
      minute, hour
   }

   /**
    * transaction type
    * @author tom
    *
    */
   public enum TransactionType {
      deposit(0), withdrawl(1), trade(2);
      private final int value;

      TransactionType(final int newValue) {
         value = newValue;
      }

      public int getValue() {
         return value;
      }
   }

   /**
    * root api
    */
   private static final String ROOT_API = "https://api.quadrigacx.com/v2";
   /**
    * auth data
    */
   private final QuadrigacxAuthData authData;

   public Quadrigacx(QuadrigacxAuthData authData) {
      this.authData = authData;
   }

   public BuyLimitOrderResponse buyLimitOrder(Book book, double amount, double price) {
      final Client client = getClient();
      final WebTarget apiWebTarget = client.target(ROOT_API).path("buy");
      final BuyLimitOrderRequest buyLimitOrderParameters = new BuyLimitOrderRequest(authData, amount, price, book.name());
      final Invocation.Builder invocationBuilder = apiWebTarget.request(MediaType.APPLICATION_JSON);
      return invocationBuilder.post(Entity.entity(buyLimitOrderParameters, MediaType.APPLICATION_JSON), BuyLimitOrderResponse.class);
   }

   public BuyMarketOrderResponse buyMarketOrder(Book book, double amount) {
      final Client client = getClient();
      final WebTarget apiWebTarget = client.target(ROOT_API).path("buy");
      final BuyMarketOrderRequest buyMarketOrderParameters = new BuyMarketOrderRequest(authData, amount, book.name());
      final Invocation.Builder invocationBuilder = apiWebTarget.request(MediaType.APPLICATION_JSON);
      return invocationBuilder.post(Entity.entity(buyMarketOrderParameters, MediaType.APPLICATION_JSON), BuyMarketOrderResponse.class);
   }

   public boolean CancelOrder(String id) {
      final Client client = getClient();
      final WebTarget apiWebTarget = client.target(ROOT_API).path("cancel_order");
      final CancelOrderRequest cancelOrderParameters = new CancelOrderRequest(authData, id);
      final Invocation.Builder invocationBuilder = apiWebTarget.request(MediaType.APPLICATION_JSON);
      return invocationBuilder.post(Entity.entity(cancelOrderParameters, MediaType.APPLICATION_JSON), Boolean.class);
   }

   public BalanceResponse getBalance() {
      final Client client = getClient();
      final WebTarget apiWebTarget = client.target(ROOT_API).path("balance");
      final BaseRequest auth = new BaseRequest(authData);
      final Invocation.Builder invocationBuilder = apiWebTarget.request(MediaType.APPLICATION_JSON);
      // System.out.println(invocationBuilder.post(Entity.entity(auth, MediaType.APPLICATION_JSON), String.class));
      return invocationBuilder.post(Entity.entity(auth, MediaType.APPLICATION_JSON), BalanceResponse.class);
   }

   private Client getClient() {
      final ClientConfig config = new ClientConfig();
      config.register(JacksonJsonProvider.class);
      return ClientBuilder.newClient(config);
   }

   public double getFee(Book book) {
      final BalanceResponse balanceResponse = getBalance();
      if (false == balanceResponse.isError()) {
         final Hashtable<Book, Double> fees = new Hashtable<Book, Double>();
         fees.put(Book.bch_btc, balanceResponse.getFees().getBch_btc());
         fees.put(Book.bch_cad, balanceResponse.getFees().getBch_cad());
         fees.put(Book.btc_cad, balanceResponse.getFees().getBtc_cad());
         fees.put(Book.btc_usd, balanceResponse.getFees().getBtc_usd());
         fees.put(Book.btg_btc, balanceResponse.getFees().getBtg_btc());
         fees.put(Book.btg_cad, balanceResponse.getFees().getBtg_cad());
         fees.put(Book.eth_btc, balanceResponse.getFees().getEth_btc());
         fees.put(Book.eth_cad, balanceResponse.getFees().getEth_cad());
         return fees.get(book);
      } else {
         throw new RuntimeException("Error :" + balanceResponse.getError().getMessage());
      }
   }

   public OpenOrderResponse[] getOpenOrders(Book book) {
      final Client client = getClient();
      final WebTarget apiWebTarget = client.target(ROOT_API).path("open_orders");
      final OpenOrdersRequest openOrdersParameters = new OpenOrdersRequest(authData, book.name());
      final Invocation.Builder invocationBuilder = apiWebTarget.request(MediaType.APPLICATION_JSON);
      System.out.println(invocationBuilder.post(Entity.entity(openOrdersParameters, MediaType.APPLICATION_JSON), String.class));
      return invocationBuilder.post(Entity.entity(openOrdersParameters, MediaType.APPLICATION_JSON), OpenOrderResponse[].class);
   }

   public OrderResponse getOrder(String id) {
      final Client client = getClient();
      final WebTarget apiWebTarget = client.target(ROOT_API).path("lookup_order");
      final LookupOrderRequest lookupOrderParameters = new LookupOrderRequest(authData, id);
      final Invocation.Builder invocationBuilder = apiWebTarget.request(MediaType.APPLICATION_JSON);
      return invocationBuilder.post(Entity.entity(lookupOrderParameters, MediaType.APPLICATION_JSON), OrderResponse.class);
   }

   /**
    * https://api.quadrigacx.com/v2/order_book
    */
   public OrderBookResponse getOrderBook(Book book) {
      final Client client = getClient();
      final WebTarget apiWebTarget = client.target(ROOT_API).path("order_book");
      final Invocation.Builder invocationBuilder = apiWebTarget.queryParam("book", book.name()).request(MediaType.APPLICATION_JSON);
      return invocationBuilder.get(OrderBookResponse.class);
   }

   /**
    * https://api.quadrigacx.com/v2/ticker?book=XXX
    */
   public TradingInfoResponse getTradingInfo(Book book) {
      final Client client = getClient();
      final WebTarget apiWebTarget = client.target(ROOT_API).path("ticker");
      final Invocation.Builder invocationBuilder = apiWebTarget.queryParam("book", book.name()).request(MediaType.APPLICATION_JSON);
      return invocationBuilder.get(TradingInfoResponse.class);
   }

   /**
    * https://api.quadrigacx.com/v2/transactions
    */
   public TransactionResponse[] getTransactions(Book book, TransactionTimeframe transactionTimeframe) {
      final Client client = getClient();
      final WebTarget apiWebTarget = client.target(ROOT_API).path("transactions");
      final String timeframe = transactionTimeframe == TransactionTimeframe.hour ? "hour" : "minute";
      final Invocation.Builder invocationBuilder = apiWebTarget.queryParam("book", book.name()).queryParam("time", timeframe).request(MediaType.APPLICATION_JSON);
      return invocationBuilder.get(TransactionResponse[].class);
   }

   public UserTransactionResponse[] getUserTransactions(int offset, int limit, Sort sort, Book book) {
      final Client client = getClient();
      final WebTarget apiWebTarget = client.target(ROOT_API).path("user_transactions");
      final UserTransactionRequest userTransactionParameters = new UserTransactionRequest(authData, offset, limit, sort.toString(), book.name());
      final Invocation.Builder invocationBuilder = apiWebTarget.request(MediaType.APPLICATION_JSON);
      return invocationBuilder.post(Entity.entity(userTransactionParameters, MediaType.APPLICATION_JSON), UserTransactionResponse[].class);
   }

   public SellLimitOrderResponse sellLimitOrder(Book book, double amount, double price) {
      final Client client = getClient();
      final WebTarget apiWebTarget = client.target(ROOT_API).path("sell");
      final SellLimitOrderRequest sellLimitOrderParameters = new SellLimitOrderRequest(authData, amount, price, book.name());
      final Invocation.Builder invocationBuilder = apiWebTarget.request(MediaType.APPLICATION_JSON);
      return invocationBuilder.post(Entity.entity(sellLimitOrderParameters, MediaType.APPLICATION_JSON), SellLimitOrderResponse.class);
   }

   public SellMarketOrderResponse sellMarketOrder(Book book, double amount) {
      final Client client = getClient();
      final WebTarget apiWebTarget = client.target(ROOT_API).path("sell");
      final SellMarketOrderRequest sellMarketOrderParameters = new SellMarketOrderRequest(authData, amount, book.name());
      final Invocation.Builder invocationBuilder = apiWebTarget.request(MediaType.APPLICATION_JSON);
      return invocationBuilder.post(Entity.entity(sellMarketOrderParameters, MediaType.APPLICATION_JSON), SellMarketOrderResponse.class);
   }
}
