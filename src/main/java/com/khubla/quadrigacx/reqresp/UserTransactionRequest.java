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

import com.khubla.quadrigacx.BaseRequest;
import com.khubla.quadrigacx.QuadrigacxAuthData;

public class UserTransactionRequest extends BaseRequest {
   private int offset = 0;
   private int limit = 50;
   private String sort = "asc";
   private String book;

   public UserTransactionRequest(QuadrigacxAuthData authData, int offset, int limit, String sort, String book) {
      super(authData);
      this.offset = offset;
      this.limit = limit;
      this.sort = sort;
      this.book = book;
   }

   public String getBook() {
      return book;
   }

   public int getLimit() {
      return limit;
   }

   public int getOffset() {
      return offset;
   }

   public String getSort() {
      return sort;
   }

   public void setBook(String book) {
      this.book = book;
   }

   public void setLimit(int limit) {
      this.limit = limit;
   }

   public void setOffset(int offset) {
      this.offset = offset;
   }

   public void setSort(String sort) {
      this.sort = sort;
   }
}
