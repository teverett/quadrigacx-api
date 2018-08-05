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

import org.testng.Assert;
import org.testng.annotations.Test;

import com.khubla.quadrigacx.Quadrigacx.TransactionTimeframe;
import com.khubla.quadrigacx.reqresp.BalanceResponse;
import com.khubla.quadrigacx.reqresp.OpenOrderResponse;
import com.khubla.quadrigacx.reqresp.OrderBookResponse;
import com.khubla.quadrigacx.reqresp.TradingInfoResponse;
import com.khubla.quadrigacx.reqresp.TransactionResponse;
import com.khubla.quadrigacx.reqresp.UserTransactionResponse;

@Test(enabled = false)
public class TestQuadrigacx {
   @Test(enabled = false)
   public void testGetBalance() {
      try {
         final QuadrigacxAuthData authData = TestAuthHelper.getTestQuadrigacxAuthData();
         final Quadrigacx quadrigacx = new Quadrigacx(authData);
         final BalanceResponse balance = quadrigacx.getBalance();
         Assert.assertNotNull(balance);
         if (null != balance.getError()) {
            System.out.println(balance.getError().getMessage());
         }
         Assert.assertNull(balance.getError());
         Assert.assertFalse(balance.isError());
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   @Test(enabled = false)
   public void testGetOpenOrders() {
      try {
         final QuadrigacxAuthData authData = TestAuthHelper.getTestQuadrigacxAuthData();
         final Quadrigacx quadrigacx = new Quadrigacx(authData);
         final OpenOrderResponse[] openOrderResponse = quadrigacx.getOpenOrders(Quadrigacx.Book.btc_cad);
         Assert.assertNotNull(openOrderResponse);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   @Test(enabled = false)
   public void testGetOrderBook() {
      try {
         final QuadrigacxAuthData authData = TestAuthHelper.getTestQuadrigacxAuthData();
         final Quadrigacx quadrigacx = new Quadrigacx(authData);
         final OrderBookResponse orderBookResponse = quadrigacx.getOrderBook(Quadrigacx.Book.btc_cad);
         Assert.assertNotNull(orderBookResponse);
         Assert.assertFalse(orderBookResponse.isError());
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   @Test
   public void testGetTicker() {
      try {
         final QuadrigacxAuthData authData = TestAuthHelper.getTestQuadrigacxAuthData();
         final Quadrigacx quadrigacx = new Quadrigacx(authData);
         final TradingInfoResponse tradingInfo = quadrigacx.getTradingInfo(Quadrigacx.Book.btc_cad);
         Assert.assertNotNull(tradingInfo);
         Assert.assertFalse(tradingInfo.isError());
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   @Test
   public void testGetTransactions() {
      try {
         final QuadrigacxAuthData authData = TestAuthHelper.getTestQuadrigacxAuthData();
         final Quadrigacx quadrigacx = new Quadrigacx(authData);
         final TransactionResponse[] transactions = quadrigacx.getTransactions(Quadrigacx.Book.btc_cad, TransactionTimeframe.hour);
         Assert.assertNotNull(transactions);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   @Test(enabled = false)
   public void testGetUserTransactions() {
      try {
         final QuadrigacxAuthData authData = TestAuthHelper.getTestQuadrigacxAuthData();
         final Quadrigacx quadrigacx = new Quadrigacx(authData);
         final UserTransactionResponse[] userTransactions = quadrigacx.getUserTransactions(0, 50, Quadrigacx.Sort.asc, Quadrigacx.Book.btc_cad);
         Assert.assertNotNull(userTransactions);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   /**
    * the keys below are from the quadrigacx docs
    */
   @Test
   public void testSignature() {
      try {
         final String sig = QuadrigacxSignature.generateSignature("1391683499", "230664ae53cbe5a07c6c389910540729", "JJHlXeDcFM", "3");
         Assert.assertNotNull(sig);
         Assert.assertTrue(sig.compareTo("cdbf5cc64c70e1485fcf976cdf367960c2b28cfc28080973ce677cebb6db9681") == 0);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}
