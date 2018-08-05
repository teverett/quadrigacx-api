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

import java.util.Date;

import com.khubla.quadrigacx.BaseResponse;

public class OrderBookResponse extends BaseResponse {
   private Date timestamp;
   private double[][] bids;
   private double[][] asks;

   public double[][] getAsks() {
      return asks;
   }

   public double[][] getBids() {
      return bids;
   }

   public Date getTimestamp() {
      return timestamp;
   }

   public void setAsks(double[][] asks) {
      this.asks = asks;
   }

   public void setBids(double[][] bids) {
      this.bids = bids;
   }

   public void setTimestamp(Date timestamp) {
      this.timestamp = timestamp;
   }
}
