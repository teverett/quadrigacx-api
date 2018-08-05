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
import com.khubla.quadrigacx.Quadrigacx.OrderStatus;
import com.khubla.quadrigacx.Quadrigacx.OrderType;

public class OpenOrderResponse extends BaseResponse {
   private String id;
   private Date datetime;
   private OrderType type;
   private double price;
   private double amount;
   private OrderStatus status;

   public double getAmount() {
      return amount;
   }

   public Date getDatetime() {
      return datetime;
   }

   public String getId() {
      return id;
   }

   public double getPrice() {
      return price;
   }

   public OrderStatus getStatus() {
      return status;
   }

   public OrderType getType() {
      return type;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }

   public void setDatetime(Date datetime) {
      this.datetime = datetime;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public void setStatus(OrderStatus status) {
      this.status = status;
   }

   public void setType(OrderType type) {
      this.type = type;
   }
}
