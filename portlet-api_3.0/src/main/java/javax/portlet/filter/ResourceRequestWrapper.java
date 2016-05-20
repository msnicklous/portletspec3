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

import java.util.Map;

import javax.portlet.PortletAsyncContext;
import javax.portlet.ResourceParameters;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.DispatcherType;

/**
 * <span class="changed_modified_3_0">The</span>  
 * <code>ResourceRequestWrapper</code> provides a convenient 
 * implementation of the <code>ResourceRequest</code> interface 
 * that can be subclassed by developers.
 * This class implements the Wrapper or Decorator pattern. 
 * Methods default to calling through to the wrapped request object.
 *
 * @since 2.0
 * @see ResourceRequest
 */
public class ResourceRequestWrapper extends ClientDataRequestWrapper implements ResourceRequest {

   /**
    * Creates an <code>ResourceRequest</code> adaptor 
    * wrapping the given request object.
    * 
    * @param request  the resource request to wrap
    * @throws java.lang.IllegalArgumentException if the request is <code>null</code>
    */
   public ResourceRequestWrapper(ResourceRequest request) {
      super(request);
   }

   /**
    * Return the wrapped request object.
    * 
    * @return the wrapped request
    */
   public ResourceRequest getRequest() {
      return (ResourceRequest) super.getRequest();
   }

   /**
    * Sets the request object being wrapped.
    * 
    * @param request the request to set
    * @throws java.lang.IllegalArgumentException   if the request is null.
    */
   public void setRequest(ResourceRequest request) {
      super.setRequest(request);
   }

   /**
    * The default behavior of this method is to call 
    * <code>getETag()</code> on the wrapped request object.
    */
   public String getETag() {
      return ((ResourceRequest)wrapped).getETag();
   }

   /**
    * The default behavior of this method is to call 
    * <code>getResourceID()</code> on the wrapped request object.
    */
   public String getResourceID() {
      return ((ResourceRequest)wrapped).getResourceID();
   }

   /**
    * The default behavior of this method is to call 
    * <code>getPrivateRenderParameterMap()</code> on the wrapped request object.
    */
   @Deprecated
   public Map<String, String[]> getPrivateRenderParameterMap() {
      return ((ResourceRequest)wrapped).getPrivateRenderParameterMap();
   }

   /**
    *  The default behavior of this method is to call 
    * <code>getCacheability()</code> on the wrapped response object.
    */
   public String getCacheability() {
      return ((ResourceRequest)wrapped).getCacheability();
   }

   /**
    * <div class="changed_modified_3_0">  
    *  The default behavior of this method is to call 
    * <code>getResourceParameters()</code> on the wrapped response object.
    * </div>
    */
   public ResourceParameters getResourceParameters() {
      return ((ResourceRequest)wrapped).getResourceParameters();
   }

   @Override
   public PortletAsyncContext startPortletAsync() throws IllegalStateException {
      return ((ResourceRequest)wrapped).startPortletAsync();
   }

   @Override
   public PortletAsyncContext startPortletAsync(ResourceRequest request, ResourceResponse response) throws IllegalStateException {
      return ((ResourceRequest)wrapped).startPortletAsync(request, response);
   }

   @Override
   public boolean isAsyncStarted() {
      return ((ResourceRequest)wrapped).isAsyncStarted();
   }

   @Override
   public boolean isAsyncSupported() {
      return ((ResourceRequest)wrapped).isAsyncSupported();
   }

   @Override
   public PortletAsyncContext getPortletAsyncContext() {
      return ((ResourceRequest)wrapped).getPortletAsyncContext();
   }

   @Override
   public DispatcherType getDispatcherType() {
      return ((ResourceRequest)wrapped).getDispatcherType();
   }

}
