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

public class OrderResponse extends BaseResponse {
   private String id;
   private String book;
   private double price;
   private double amount;
   private OrderType type;
   private OrderStatus status;
   private Date created;
   private Date updated;

   public double getAmount() {
      return amount;
   }

   public String getBook() {
      return book;
   }

   public Date getCreated() {
      return created;
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

   public Date getUpdated() {
      return updated;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }

   public void setBook(String book) {
      this.book = book;
   }

   public void setCreated(Date created) {
      this.created = created;
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

   public void setUpdated(Date updated) {
      this.updated = updated;
   }
}
