/*  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

/*
 * This source code implements specifications defined by the Java
 * Community Process. In order to remain compliant with the specification
 * DO NOT add / change / or delete method signatures!
 */

package javax.portlet.filter;

import java.util.Locale;

import javax.portlet.ResourceResponse;

/**
 * <span class="changed_modified_3_0">The</span>  
 * <code>ResourceResponseWrapper</code> provides a convenient 
 * implementation of the <code>ResourceResponse</code> interface 
 * that can be subclassed by developers wishing to adapt the response.
 * This class implements the Wrapper or Decorator pattern. 
 * Methods default to calling through to the wrapped response object.
 *
 * @since 2.0
 * @see ResourceResponse
 */

public class ResourceResponseWrapper extends MimeResponseWrapper implements ResourceResponse {

   ResourceResponse response;

   /**
    * Creates an <code>ResourceResponse</code> adaptor 
    * wrapping the given response object.
    * 
    * @param response  the event response to wrap
    * @throws java.lang.IllegalArgumentException if the response is <code>null</code>
    */
   public ResourceResponseWrapper(ResourceResponse response) {
      super(response);
      this.response = response;
   }

   /**
    * Return the wrapped response object.
    * 
    * @return the wrapped response
    */
   public ResourceResponse getResponse() {
      return response;
   }

   /**
    * Sets the response object being wrapped.
    * 
    * @param response the response to set
    * @throws java.lang.IllegalArgumentException   if the response is null.
    */
   public void setResponse(ResourceResponse response) {
      if ( response == null) {
         throw new java.lang.IllegalArgumentException("Response is null");
      }
      super.setResponse(response);
      this.response = response;
   }


   /**
    * The default behavior of this method is to call 
    * <code>setCharacterEncoding(String charset)</code> on the wrapped response object.
    */
   public void setCharacterEncoding(String charset) {
      response.setCharacterEncoding(charset);
      return;
   }

   /**
    * The default behavior of this method is to call 
    * <code>setLocale(Locale loc)</code> on the wrapped response object.
    */
   public void setLocale(Locale loc) {
      response.setLocale(loc);
      return;
   }

   /**
    *  The default behavior of this method is to call 
    * <code>setContentLength()</code> on the wrapped response object.
    */
   public void setContentLength(int len) {
      response.setContentLength(len);
   }

   /**
    * <div class="changed_added_3_0">
    *  The default behavior of this method is to call 
    * <code>setStatus()</code> on the wrapped response object.
    * </div>
    */
   public void setStatus(int sc) {
      response.setStatus(sc);
   }


}
