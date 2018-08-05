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
package com.khubla.quadrigacx.reqresp;

import com.khubla.quadrigacx.BaseResponse;

public class SellMarketOrderResponse extends BaseResponse {
   private double amount;
   private double[][] orders_matched;

   public double getAmount() {
      return amount;
   }

   public double[][] getOrders_matched() {
      return orders_matched;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }

   public void setOrders_matched(double[][] orders_matched) {
      this.orders_matched = orders_matched;
   }
}
