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
 * The current state of the portlet is represented by the private and public 
 * parameters that are set for the request or for the URL from which the 
 * portlet state object was obtained. The <CODE>PortletState</CODE> 
 * interface defines the API for accessing these parameters.
 * <p>
 * Depending on the object from which the portlet state is obtained, 
 * the <code>PortletState> object can be either writable or read-only. 
 * If methods are used on a read-only portlet state object that would 
 * modify the portlet state, a <code>javax.portlet.ReadOnlyException</code>
 * will be thrown. 
 */
public interface PortletState
{

  /**
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
   *
   * @param name 	a <code>String</code> specifying the 
   *			name of the parameter
   *
   * @return		a <code>String</code> representing the 
   *			single value of the parameter, or <code>null</code> if 
   *        the parameter does not exist.
   *
   * @see 		#getParameterValues
   *
   * @exception  java.lang.IllegalArgumentException 
   *                            if name is <code>null</code>.
   *
   */
  
  public String getParameter(String name);


  /**
   *
   * Returns an <code>Enumeration</code> of <code>String</code>
   * objects containing the names of the parameters contained
   * in this request. If the request has 
   * no parameters, the method returns an 
   * empty <code>Enumeration</code>. 
   * <p>
   * Only parameters targeted to the current portlet are returned.
   *
   *
   * @return		an <code>Enumeration</code> of <code>String</code>
   *			objects, each <code>String</code> containing
   * 			the name of a request parameter; or an 
   *			empty <code>Enumeration</code> if the
   *			request has no parameters.
   */

  public java.util.Enumeration<String> getParameterNames();


  /**
   * Returns an array of <code>String</code> objects containing 
   * all of the values the given request parameter has, or 
   * <code>null</code> if the parameter does not exist.
   * The returned parameters are "x-www-form-urlencoded" decoded.
   * <p>
   * If the parameter has a single value, the array has a length
   * of 1.
   *
   *
   * @param name	a <code>String</code> containing the name of 
   *			the parameter the value of which is requested
   *
   * @return		an array of <code>String</code> objects 
   *			containing the parameter values, or <code>null</code> 
   *        if the parameter does not exist.
   *
   * @see		#getParameter
   *
   * @exception  java.lang.IllegalArgumentException 
   *                            if name is <code>null</code>.
   *
   */

  public String[] getParameterValues(String name);

  
  /** 
   * Returns a <code>Map</code> of all public and private parameters currently 
   * set for this portlet. Request parameters represent the current portlet state.
   * The returned parameters are "x-www-form-urlencoded" decoded.
   * <p>
   * If no parameters exist, this method returns an empty <code>Map</code>.
   * <p>
   * The map may be modified, but modifications do not take effect until the 
   * <code>setParameters()</code> method is called with the modified map as a parameter.
   *             
   * @return     <code>Map</code> containing parameter names as 
   *             keys and parameter values as map values, or an empty <code>Map</code>
   *             if no parameters exist. The keys in the parameter
   *             map are of type String. The values in the parameter map are of type
   *             String array (<code>String[]</code>).
   *
   * @since 2.0
   */

  public java.util.Map<String, String[]> getParameterMap();

  
  /**
   * Returns a boolean value indicating whether the given
   * parameter is a public render parameter. 
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
   */

  public boolean isPublicRenderParameter (String name);

  
  /**
   * Returns a boolean value indicating whether the 
   * <code>PortletState</code> is read-only.
   *
   * @param   name
   *          the parameter name
   *
   * @return  <code>true</code> if the portlet state
   *           is read-only.
   *           <code>false</code> otherwise
   */

  public boolean isReadOnly ();


  /**
   * Sets the given String parameter on the portlet state object. 
   * <p>
   * This method replaces all parameters with the given key.
   * <p>
   * The parameters do not need to be encoded prior to calling this
   * method.
   * <p>
   * A portlet container may prefix the attribute names internally 
   * in order to preserve a unique namespace for the portlet.
   * <p>
   * A parameter value of <code>null</code> indicates that this
   * parameter should be removed. 
   * <p>
   * When this method is used on a read-only object, such as that obtained from 
   * a <code>RenderRequest</code> object, a ReadOnlyException will be thrown.
   *
   * @param   name
   *          the parameter name
   * @param   value
   *          the parameter value
   *
   * @exception  java.lang.IllegalArgumentException 
   *                            if name is <code>null</code>.
    *            javax.portlet.ReadOnlyException 
   *                    if the parameter is read-only and cannot be set.
  */

  public void setParameter (String name, String value);


  /**
   * Sets the given String array parameter on the portlet state object. 
   * <p>
   * This method replaces all values associated with the given name.
   * <p>
   * The parameters do not need to be encoded prior to calling this
   * method.
   * <p>
   * A portlet container may prefix the attribute names internally 
   * in order to preserve a unique namespace for the portlet.
   * <p>
   * A parameter value of <code>null</code> indicates that this
   * parameter should be removed. If the values String array is not null,
   * no individual element of the array may be null.
   * <p>
   * When this method is used on a read-only object, such as that obtained from 
   * a <code>RenderRequest</code> object, a ReadOnlyException will be thrown.
   *
   * @param   name
   *          the parameter name
   * @param   values
   *          the parameter values
   *
   * @exception  java.lang.IllegalArgumentException 
   *                            if name is <code>null</code> or one of the 
   *                            elements  of the values String array is 
   *                            <code>null</code>.
   *            javax.portlet.ReadOnlyException 
   *                    if the parameter is read-only and cannot be set.
   */

  public void setParameter (String name, String[] values);


  /**
   * Sets a parameter map for the portlet state object.
   * <p>
   * This method can be used to set both public and private render parameters. 
   * <p>
   * These parameters will be accessible during all subsequent request processing 
   * taht the current portlet state object is associated with.
   * <p>
   * Any previously set private render parameter that is not contained in the new map
   * is removed. However, public render parameters cannot be removed by excluding
   * them from the map. Public render parameters that are not included in the map
   * remain unchanged.
   * <p>
   * The given parameters do not need to be encoded prior to calling this method.
   * <p>
   * When this method is used on a read-only object, such as that obtained from 
   * a <code>RenderRequest</code> object, a ReadOnlyException will be thrown.
   * <p>
   * @param parameters - Map containing parameter names for the render phase as keys and parameter values
   *                     as map values. The keys in the parameter map must be of type String and may not
   *                     be <code>null</code> or the null string (""). The values in the parameter map must be of type
   *                     String array (<code>String[]</code>). Neither the values array nor any of its elements may be
   *                     <code>null</code>; however, the null string ("") is allowed.
   *                     Map containing parameter names for the render phase as keys and parameter values
   * <p>
   * @exception java.lang.IllegalArgumentException - if parameters is <code>null</code>, if 
   *                     any of the keys in the Map are <code>null</code> or the null string, if any of the keys is
   *                     not a <code>String</code>, if any of the values is not a String array, or if any of the String
   *                     array elements are null. 
   *            java.lang.IllegalStateException - if the method is
   *                    invoked after sendRedirect has been called.
   *            javax.portlet.ReadOnlyException 
   *                    if the parameter is read-only and cannot be set.
*/

  public void setParameters(java.util.Map<String, String[]> parameters);

  
  /**
   * Removes the given public or private parameter. All values associated with the 
   * name provided are removed. 
   * <p>
   * When this method is used on a read-only object, such as that obtained from a <code>RenderRequest</code> object,
   * a ReadOnlyException will be thrown.
   *
   * @param   name
   *          the parameter name
   *
   * @exception  java.lang.IllegalArgumentException 
   *                            if name is <code>null</code>.
   *             javax.portlet.ReadOnlyException 
   *                            if the parameter is read-only and cannot be removed.
   */

  public void removeParameter (String name);
}
