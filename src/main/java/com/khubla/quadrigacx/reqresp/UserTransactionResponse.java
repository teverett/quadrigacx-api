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
import com.khubla.quadrigacx.Quadrigacx.TransactionType;

public class UserTransactionResponse extends BaseResponse {
   private Date datetime;
   private String id;
   private TransactionType type;
   private String method;
   private String order_id;
   private double fee;
   private double rate;

   public Date getDatetime() {
      return datetime;
   }

   public double getFee() {
      return fee;
   }

   public String getId() {
      return id;
   }

   public String getMethod() {
      return method;
   }

   public String getOrder_id() {
      return order_id;
   }

   public double getRate() {
      return rate;
   }

   public TransactionType getType() {
      return type;
   }

   public void setDatetime(Date datetime) {
      this.datetime = datetime;
   }

   public void setFee(double fee) {
      this.fee = fee;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setMethod(String method) {
      this.method = method;
   }

   public void setOrder_id(String order_id) {
      this.order_id = order_id;
   }

   public void setRate(double rate) {
      this.rate = rate;
   }

   public void setType(TransactionType type) {
      this.type = type;
   }
}
