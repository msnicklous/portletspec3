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
 * <div class="changed_added_3_0">
 * This is a marker interface for a render URL.
 * <p>
 * A render URL is created with {@link MimeResponse#createRenderURL()}. 
 * </div>
 * @since   3.0
 */
public interface RenderURL extends PortletURL
{



   /**
    * <div class="changed_added_3_0">
    * Sets a fragment identifier on the URL.
    * <p>
    * Any previously set fragment identifier will be replaced.
    * <p>
    * The fragment identifier consists of additional information appended
    * to the URL after a '#' character. A URL can have only a single fragment
    * identifier. The fragment identifier must be formed according to 
    * <a href="http://tools.ietf.org/html/rfc3986">rfc3986</a>.
    * <p>
    * The fragment identifier is often used to address a named anchor such as 
    * <code>&lt;a name="#fragmentIdentifier"&gt;</code>, but it can also be 
    * used for other purposes such as to pass information to a JavaScript routine.
    * <p>
    * The fragment identifier will not be namespaced. The portlet is responsible for 
    * performing any required namespacing. However, the fragment identifier string 
    * will be escaped as required.
    * <p>
    * Setting the fragment identifier to <code>null</code> will remove a 
    * fragment identifier previously set through this method. Setting the 
    * empty string as the fragment identifier will create an empty fragment 
    * identifier. 
    * </div>
    *
    * @param fragment
    *            The fragment identifier to be added to the URL
    *                
    * @since 3.0
    * 
    * @see #getFragmentIdentifier
    * @see #setFragmentIdentifierPermitted
    */
   public void setFragmentIdentifier(String fragment);


   /**
    * <div class="changed_added_3_0">
    * Gets the fragment identifier previously set on the URL using the 
    * {@link #setFragmentIdentifier} method.
    * </div>
    *
    * @return 
    *         The fragment identifier set on the URL, or 
    *         <code>null</code> if no fragment identifier has been set.
    *
    * @since 3.0
    * @see #setFragmentIdentifier
    */
   public String getFragmentIdentifier();


   /**
    * <div class="changed_added_3_0">
    * Indicates whether a fragment identifier is permitted on the URL. 
    * <p>
    * If the fragment identifier is permitted,
    * a fragment identifier set by the portlet will be appended to the URL. 
    * If the portlet does not set a fragment identifier, the portal 
    * implementation may append a fragment identifier to the URL.
    * <p>
    * If the fragment identifier is not permitted, no fragment identifier will 
    * be appended to the URL.
    * <p>
    * By default, the fragment identifier is permitted. 
    * </div>
    *
    * @param permit 
    *            <code>true</code> if the fragment parameter is permitted, or
    *            <code>false</code> if it is not.
    *
    * @since 3.0
    * 
    * @see #setFragmentIdentifier(String)
    * @see #isFragmentIdentifierPermitted()
    */
   public void setFragmentIdentifierPermitted(boolean permit);


   /**
    * <div class="changed_added_3_0">
    * Indicates whether the fragment identifier on the URL is permitted.
    * </div>
    *
    * @return    <code>true</code> if the fragment parameter is permitted, or
    *            <code>false</code> if it is not.
    * 
    * @since 3.0
    * @see #setFragmentIdentifierPermitted
    */
   public boolean isFragmentIdentifierPermitted();
}
