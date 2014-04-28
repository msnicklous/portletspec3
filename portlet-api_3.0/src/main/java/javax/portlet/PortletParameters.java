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
 * The <CODE>PortletParameters</CODE> interface defines the API 
 * for accessing the parameters that are set for the portlet or on a portlet URL.
 * <p>
 * Portlet parameters store state information that the portlet needs to render itself,
 * generate content by serving resources, or make decisions when executing portlet
 * actions. Conceptually the portlet parameters correspond to query string parameters
 * that are stored in the URL used to access the portlet, although they are not
 * required to actually be present on the URL as visible parameters.
 * <p>
 * Private parameters parameters are available exclusively to a single portlet. 
 * Public parameters can be shared between portlets.
 * <p>
 * The portlet parameters governing the request can be read during all portlet
 * execution phases through the {@link PortletParameters} object available 
 * from the portlet request object. Portlet parameters
 * can be set for subsequent or future portlet execution phases through
 * the {@link MutablePortletParameters} object available from the
 * portlet response object or from the portlet URL.
 * <p>
 * Different types of portlet parameters are distinguished 
 * according to their use. 
 * <dl>
 * <dt>Render Parameters</dt>
 * <dd>
 * Set on the response during the Action and Event phases to govern content
 * generation during the Render and Resource phases. Also set on render URLs
 * to move the portlet to a new render state when the URL is triggered.
 * <p>
 * Refer to {@link PortletRequest#getRenderParameters()},
 * {@link StateAwareResponse#getRenderParameters()}, and
 * {@link PortletURL#getRenderParameters()}.
 * <p>
 * Example: Render URLs with differing render parameters can be used to
 * implement tabbed navigation within a portlet.
 * </dd> 
 * <dt>Resource Parameters</dt>
 * <dd>
 * Provide additional information about the content to be generated when
 * serving a resource for the governing render state.
 * Set on resource URLs and made available to the portlet through the
 * resource request when the URL is triggered.
 * <p>
 * Refer to {@link ResourceRequest#getResourceParameters()} and
 * {@link ResourceURL#getResourceParameters()}.
 * <p>
 * Example: Portlets may require several different pieces of content 
 * to be served for the governing render state.
 * Resource URLs with differing resource parameters can be used to
 * determine which content is to be served for a specific request.
 * </dd> 
 * <dt>Action Parameters</dt>
 * <dd>
 * Provide additional information about the action to be executed
 * for the governing render state.
 * Set on action URLs and made available to the portlet through the
 * action request when the URL is triggered.
 * <p>
 * Refer to {@link ActionRequest#getActionParameters()} and
 * {@link ActionURL#getActionParameters()}.
 * <p>
 * Example: Portlets may render a number of buttons or links
 * for the governing render state.
 * Action URLs with differing action parameters can be used to
 * determine which action is to be executed for a specific request.
 * </dd> 
 * </dl>
 * </div>
 * @see     MutablePortletParameters
 * @since   3.0 
 */
public interface PortletParameters extends Cloneable
{

  /**
   * <div class="changed_added_3_0">
   * Returns the value of a request parameter as a <code>String</code>,
   * or <code>null</code> if the parameter does not exist. Request parameters
   * are extra information sent with the request. The returned parameter 
   * is "x-www-form-urlencoded" decoded.
   * <p>
   * Only parameters targeted to the current portlet are accessible.
   * <p>
   * This method should only be used if the 
   * parameter has only one value. If the parameter might have
   * more than one value, use {@link #getParameterValues}.
   * <p>
   * If this method is used with a multivalued
   * parameter, the value returned is equal to the first value
   * in the array returned by <code>getParameterValues</code>.
   * </div>
   *
   * @param name 	a <code>String</code> specifying the 
   *			name of the parameter
   *
   * @return		a <code>String</code> representing the 
   *			single value of the parameter, or <code>null</code> if 
   *        the parameter does not exist.
   *
   * @see 		#getParameterValues
   * @since    3.0
   *
   * @exception  java.lang.IllegalArgumentException 
   *                            if name is <code>null</code>.
   *
   */
  
  public String getParameter(String name);


  /**
   * <div class="changed_added_3_0">
   * Returns an <code>Enumeration</code> of <code>String</code>
   * objects containing the names of the parameters contained
   * in this request. If the request has 
   * no parameters, the method returns an 
   * empty <code>Enumeration</code>. 
   * <p>
   * Only parameters targeted to the current portlet are returned.
   * </div>
   *
   *
   * @return		an <code>Enumeration</code> of <code>String</code>
   *			objects, each <code>String</code> containing
   * 			the name of a request parameter; or an 
   *			empty <code>Enumeration</code> if the
   *			request has no parameters.
   *
   * @since 3.0
   */

  public java.util.Enumeration<String> getParameterNames();


  /**
   * <div class="changed_added_3_0">
   * Returns an array of <code>String</code> objects containing 
   * all of the values the given request parameter has, or 
   * <code>null</code> if the parameter does not exist.
   * The returned parameters are "x-www-form-urlencoded" decoded.
   * <p>
   * If the parameter has a single value, the array has a length
   * of 1.
   * </div>
   *
   * @param name	a <code>String</code> containing the name of 
   *			the parameter the value of which is requested
   *
   * @return		an array of <code>String</code> objects 
   *			containing the parameter values, or <code>null</code> 
   *        if the parameter does not exist.
   *
   * @see		#getParameter
   * @since    3.0
   *
   * @exception  java.lang.IllegalArgumentException 
   *                            if name is <code>null</code>.
   *
   */

  public String[] getParameterValues(String name);

  
  /** 
   * <div class="changed_added_3_0">
   * Returns an immutable <code>Map</code> of all public and private parameters 
   * currently 
   * set for this portlet. Request parameters represent the current portlet state.
   * The returned parameters are "x-www-form-urlencoded" decoded.
   * <p>
   * If no parameters exist, this method returns an empty <code>Map</code>.
   * <p>
   * The map may be modified, but modifications do not take effect until the 
   * <code>setParameters()</code> method is called with the modified map as a parameter.
   * </div>
   *             
   * @return     <code>Map</code> containing parameter names as 
   *             keys and parameter values as map values, or an empty <code>Map</code>
   *             if no parameters exist. The keys in the parameter
   *             map are of type String. The values in the parameter map are of type
   *             String array (<code>String[]</code>).
   *
   * @since 3.0
   */

  public java.util.Map<String, String[]> getParameterMap();

  
  /**
   * <div class="changed_added_3_0">
   * Returns a boolean value indicating whether the given
   * parameter is a public render parameter.
   * </div> 
   *
   * @param   name
   *          the parameter name
   *
   * @return  <code>true</code> if the given parameter
   *           is a public render parameter.
   *           <code>false</code> otherwise
   *
   * @exception  java.lang.IllegalArgumentException 
   *                            if name is <code>null</code>.
   * 
   * @since    3.0
   */

  public boolean isPublicRenderParameter (String name);

  /**
   * <div class="changed_added_3_0">
   * Returns a MutablePortletParameters object encapsulating the same
   * parameters as the original object. The parameters are copied so
   * that there is no linkage to the original object.
   * </div>
   * 
   * @return Mutable clone of PortletParameters object
   * 
   * @since  3.0
   */
  
  public MutablePortletParameters clone();

}
