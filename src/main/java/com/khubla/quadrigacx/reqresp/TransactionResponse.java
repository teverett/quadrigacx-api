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
import com.khubla.quadrigacx.Quadrigacx.TransactionSide;

public class TransactionResponse extends BaseResponse {
   private double amount;
   private Date date;
   private double price;
   private double tid;
   private TransactionSide side;

   public double getAmount() {
      return amount;
   }

   public Date getDate() {
      return date;
   }

   public double getPrice() {
      return price;
   }

   public TransactionSide getSide() {
      return side;
   }

   public double getTid() {
      return tid;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }

   public void setDate(Date date) {
      this.date = date;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public void setSide(TransactionSide side) {
      this.side = side;
   }

   public void setTid(double tid) {
      this.tid = tid;
   }
}
