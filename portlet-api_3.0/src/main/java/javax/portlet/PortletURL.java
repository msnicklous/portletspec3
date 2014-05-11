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

package javax.portlet;



/**
 * <span class="changed_modified_3_0">The</span> 
 * <CODE>PortletURL</CODE> interface represents a URL
 * that reference the portlet itself.
 * <p>
 * A PortletURL is created through the <CODE>RenderResponse</CODE>
 * or <code>ResourceResponse</code>.
 * Parameters, a portlet mode, a window state and a security level
 * can be added to <CODE>PortletURL</CODE> objects. 
 * <P>
 * There are two types of PortletURLs:
 * <ul>
 * <li>Action URLs, they are created with <CODE>createActionURL</CODE>, and 
 *     trigger an action request followed by a render request.
 * <li>Render URLs, they are created with <CODE>createRenderURL</CODE>, and
 *     trigger a render request.
 * </ul>
 * <p>
 * The string representation of a PortletURL does not need to be a valid 
 * URL at the time the portlet is generating its content. It may contain  
 * special tokens that will be converted to a valid URL, by the portal, 
 * before the content is returned to the client.
 */
public interface PortletURL extends BaseURL, MutablePortletState
{

   /**
    * <div class="changed_added_3_0">
    * Gets the render parameter values set for this response.
    * <p>
    * Initially these are the same as the render parameter values set on the
    * portlet request during which the URL is created.  
    * <p>
    * Modifying the parameter values encapsulated by the returned object directly
    * modifies the render parameters applied to the URL.
    * </div>
    * 
    * @return   a <code>MutableRenderParameters</code> object representing
    *           the private and public render parameters
    * @since    3.0
    * @see      PortletParameters 
    * @see      RenderParameters 
    * @see      MutablePortletParameters 
    * @see      MutableRenderParameters 
    */

   @Override
   public MutableRenderParameters getRenderParameters();


   /**
    * Removes the specified public render parameter.
    * The name must reference a public render parameter defined
    * in the portlet deployment descriptor under the
    * <code>public-render-parameter</code> element with the
    * <code>identifier</code> mapping to the parameter name.
    * 
    * @param name       a <code>String</code> specifying 
    *             the name of the public render parameter to be removed
    *
    * @exception  java.lang.IllegalArgumentException 
    *                            if name is <code>null</code>.
    * @since 2.0
    * 
    * @deprecated use {@link BaseURL#getRenderParameters()} instead.
    */
   
   @Deprecated
   public void removePublicRenderParameter(String name);
}
