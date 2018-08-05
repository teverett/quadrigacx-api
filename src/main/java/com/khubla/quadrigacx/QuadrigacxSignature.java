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

import javax.crypto.spec.SecretKeySpec;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

public class QuadrigacxSignature {
   public static String generateSignature(String nonce, String secret, String key, String clientId) {
      try {
         final String data = nonce + clientId + key;
         final SecretKeySpec secretKeySpec = new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256");
         final HashFunction hashFunction = Hashing.hmacSha256(secretKeySpec);
         final HashCode hashCode = hashFunction.hashBytes(data.getBytes("UTF-8"));
         return hashCode.toString();
      } catch (final Exception e) {
         e.printStackTrace();
         return null;
      }
   }
}
