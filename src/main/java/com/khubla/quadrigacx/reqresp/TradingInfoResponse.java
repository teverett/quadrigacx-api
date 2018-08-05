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

public class TradingInfoResponse extends BaseResponse {
   private double last;
   private double high;
   private double low;
   private double vwap;
   private double bid;
   private double ask;
   private double volume;
   private Date timestamp;

   public double getAsk() {
      return ask;
   }

   public double getBid() {
      return bid;
   }

   public double getHigh() {
      return high;
   }

   public double getLast() {
      return last;
   }

   public double getLow() {
      return low;
   }

   public Date getTimestamp() {
      return timestamp;
   }

   public double getVolume() {
      return volume;
   }

   public double getVwap() {
      return vwap;
   }

   public void setAsk(double ask) {
      this.ask = ask;
   }

   public void setBid(double bid) {
      this.bid = bid;
   }

   public void setHigh(double high) {
      this.high = high;
   }

   public void setLast(double last) {
      this.last = last;
   }

   public void setLow(double low) {
      this.low = low;
   }

   public void setTimestamp(Date timestamp) {
      this.timestamp = timestamp;
   }

   public void setVolume(double volume) {
      this.volume = volume;
   }

   public void setVwap(double vwap) {
      this.vwap = vwap;
   }
}
