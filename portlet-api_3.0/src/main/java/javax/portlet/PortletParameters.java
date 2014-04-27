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
 * that are stored in the URL, although they are not required to actually be present 
 * as visible URL parameters.
 * <p>
 * There are two types of portlet parameters: private parameters and public parameters.
 * Private parameters parameters can only be read and set by a single portlet. Public
 * parameters are shared between portlets.
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
   * Returns a MutablePortletParameters object containing the same
   * parameters as the original object.
   * </div>
   * 
   * @return Mutable clone of PortletParameters object
   * 
   * @throws CloneNotSupportedException
   * 
   * @since  3.0
   */
  
  public MutablePortletParameters clone() throws CloneNotSupportedException;

}
