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

public class BalanceResponse extends BaseResponse {
   /**
    * note that fees are in units of %.  So a fee of .5 is ".5%" or 5/1000.
    * @author tom
    *
    */
   public class Fees {
      private double btc_cad;
      private double btc_usd;
      private double eth_cad;
      private double eth_btc;
      private double ltc_cad;
      private double ltc_btc;
      private double bch_cad;
      private double bch_btc;
      private double btg_cad;
      private double btg_btc;

      public double getBch_btc() {
         return bch_btc;
      }

      public double getBch_cad() {
         return bch_cad;
      }

      public double getBtc_cad() {
         return btc_cad;
      }

      public double getBtc_usd() {
         return btc_usd;
      }

      public double getBtg_btc() {
         return btg_btc;
      }

      public double getBtg_cad() {
         return btg_cad;
      }

      public double getEth_btc() {
         return eth_btc;
      }

      public double getEth_cad() {
         return eth_cad;
      }

      public double getLtc_btc() {
         return ltc_btc;
      }

      public double getLtc_cad() {
         return ltc_cad;
      }

      public void setBch_btc(double bch_btc) {
         this.bch_btc = bch_btc;
      }

      public void setBch_cad(double bch_cad) {
         this.bch_cad = bch_cad;
      }

      public void setBtc_cad(double btc_cad) {
         this.btc_cad = btc_cad;
      }

      public void setBtc_usd(double btc_usd) {
         this.btc_usd = btc_usd;
      }

      public void setBtg_btc(double btg_btc) {
         this.btg_btc = btg_btc;
      }

      public void setBtg_cad(double btg_cad) {
         this.btg_cad = btg_cad;
      }

      public void setEth_btc(double eth_btc) {
         this.eth_btc = eth_btc;
      }

      public void setEth_cad(double eth_cad) {
         this.eth_cad = eth_cad;
      }

      public void setLtc_btc(double ltc_btc) {
         this.ltc_btc = ltc_btc;
      }

      public void setLtc_cad(double ltc_cad) {
         this.ltc_cad = ltc_cad;
      }
   }

   private double cad_balance;
   private double btc_balance;
   private double cad_reserved;
   private double btc_reserved;
   private double bch_reserved;
   private double bch_balance;
   private double btg_available;
   private double btg_balance;
   private double btg_reserved;
   private double eth_available;
   private double eth_reserved;
   private double eth_balance;
   private double ltc_available;
   private double ltc_reserved;
   private double ltc_balance;
   private double etc_available;
   private double etc_reserved;
   private double etc_balance;
   private double fee;
   private double usd_available;
   private double usd_reserved;
   private double usd_balance;
   private double xau_available;
   private double xau_reserved;
   private double xau_balance;
   private double cad_available;
   private double btc_available;
   private double bch_available;
   private Fees fees;

   public double getBch_available() {
      return bch_available;
   }

   public double getBch_balance() {
      return bch_balance;
   }

   public double getBch_reserved() {
      return bch_reserved;
   }

   public double getBtc_available() {
      return btc_available;
   }

   public double getBtc_balance() {
      return btc_balance;
   }

   public double getBtc_reserved() {
      return btc_reserved;
   }

   public double getBtg_available() {
      return btg_available;
   }

   public double getBtg_balance() {
      return btg_balance;
   }

   public double getBtg_reserved() {
      return btg_reserved;
   }

   public double getCad_available() {
      return cad_available;
   }

   public double getCad_balance() {
      return cad_balance;
   }

   public double getCad_reserved() {
      return cad_reserved;
   }

   public double getEtc_available() {
      return etc_available;
   }

   public double getEtc_balance() {
      return etc_balance;
   }

   public double getEtc_reserved() {
      return etc_reserved;
   }

   public double getEth_available() {
      return eth_available;
   }

   public double getEth_balance() {
      return eth_balance;
   }

   public double getEth_reserved() {
      return eth_reserved;
   }

   public double getFee() {
      return fee;
   }

   public Fees getFees() {
      return fees;
   }

   public double getLtc_available() {
      return ltc_available;
   }

   public double getLtc_balance() {
      return ltc_balance;
   }

   public double getLtc_reserved() {
      return ltc_reserved;
   }

   public double getUsd_available() {
      return usd_available;
   }

   public double getUsd_balance() {
      return usd_balance;
   }

   public double getUsd_reserved() {
      return usd_reserved;
   }

   public double getXau_available() {
      return xau_available;
   }

   public double getXau_balance() {
      return xau_balance;
   }

   public double getXau_reserved() {
      return xau_reserved;
   }

   public void setBch_available(double bch_available) {
      this.bch_available = bch_available;
   }

   public void setBch_balance(double bch_balance) {
      this.bch_balance = bch_balance;
   }

   public void setBch_reserved(double bch_reserved) {
      this.bch_reserved = bch_reserved;
   }

   public void setBtc_available(double btc_available) {
      this.btc_available = btc_available;
   }

   public void setBtc_balance(double btc_balance) {
      this.btc_balance = btc_balance;
   }

   public void setBtc_reserved(double btc_reserved) {
      this.btc_reserved = btc_reserved;
   }

   public void setBtg_available(double btg_available) {
      this.btg_available = btg_available;
   }

   public void setBtg_balance(double btg_balance) {
      this.btg_balance = btg_balance;
   }

   public void setBtg_reserved(double btg_reserved) {
      this.btg_reserved = btg_reserved;
   }

   public void setCad_available(double cad_available) {
      this.cad_available = cad_available;
   }

   public void setCad_balance(double cad_balance) {
      this.cad_balance = cad_balance;
   }

   public void setCad_reserved(double cad_reserved) {
      this.cad_reserved = cad_reserved;
   }

   public void setEtc_available(double etc_available) {
      this.etc_available = etc_available;
   }

   public void setEtc_balance(double etc_balance) {
      this.etc_balance = etc_balance;
   }

   public void setEtc_reserved(double etc_reserved) {
      this.etc_reserved = etc_reserved;
   }

   public void setEth_available(double eth_available) {
      this.eth_available = eth_available;
   }

   public void setEth_balance(double eth_balance) {
      this.eth_balance = eth_balance;
   }

   public void setEth_reserved(double eth_reserved) {
      this.eth_reserved = eth_reserved;
   }

   public void setFee(double fee) {
      this.fee = fee;
   }

   public void setFees(Fees fees) {
      this.fees = fees;
   }

   public void setLtc_available(double ltc_available) {
      this.ltc_available = ltc_available;
   }

   public void setLtc_balance(double ltc_balance) {
      this.ltc_balance = ltc_balance;
   }

   public void setLtc_reserved(double ltc_reserved) {
      this.ltc_reserved = ltc_reserved;
   }

   public void setUsd_available(double usd_available) {
      this.usd_available = usd_available;
   }

   public void setUsd_balance(double usd_balance) {
      this.usd_balance = usd_balance;
   }

   public void setUsd_reserved(double usd_reserved) {
      this.usd_reserved = usd_reserved;
   }

   public void setXau_available(double xau_available) {
      this.xau_available = xau_available;
   }

   public void setXau_balance(double xau_balance) {
      this.xau_balance = xau_balance;
   }

   public void setXau_reserved(double xau_reserved) {
      this.xau_reserved = xau_reserved;
   }
}
