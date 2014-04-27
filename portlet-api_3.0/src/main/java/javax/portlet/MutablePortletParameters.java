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

import javax.portlet.MimeResponse.UrlFlag;

/**
 * <div class="changed_added_3_0">
 * The <CODE>MutablePortletParameters</CODE> provides methods that allow  
 * setting parameters to record a potential future portlet state.
 * <p>
 * For example, these methods can be used to set parameters on 
 * a <code>PortletURL</code> object. When the portlet URL containing
 * these parameters is activated, the state represented by the parameters
 * becomes the new current state.
 * </div>
 *
 * @see   PortletParameters
 * @since 3.0
 */
public interface MutablePortletParameters extends PortletParameters {

   
   /**
    * <div class="changed_added_3_0">
    * Specifies which parameters are to be cleared
    * </div>
    * 
    * @see #clear(ClearBehavior)
    * 
    * @since 3.0
    */
   public enum ClearBehavior {

      /**
       * <div class="changed_added_3_0">
       * Specifies that all private parameters are to be cleared.
       * </div>
       *  
       * @since 3.0
       */
      CLEAR_PRIVATE_PARAMETERS,

      /**
       * <div class="changed_added_3_0">
       * Specifies that all public parameters are to be cleared.
       * </div>
       *  
       * @since 3.0
       */
      CLEAR_PUBLIC_PARAMETERS,

      /**
       * <div class="changed_added_3_0">
       * Specifies that all parameters, both public and private, are to be cleared.
       * </div>
       *  
       * @since 3.0
       */
      CLEAR_ALL_PARAMETERS,
   }

   
   /** 
    * <div class="changed_added_3_0">
    * Returns a mutable <code>Map</code> of all public and private parameters currently 
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
     * Sets the given String parameter to this URL. 
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
     * </div>
     *
     * @param   name
     *          the parameter name
     * @param   value
     *          the parameter value
     *
     * @since  3.0
     *
     * @exception  java.lang.IllegalArgumentException 
     *                            if name is <code>null</code>.
     */

    public void setParameter (String name, String value);


    /**
     * <div class="changed_added_3_0">
     * Sets the given String array parameter to this URL. 
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
     * parameter should be removed. If the values String array is not null,
     * no individual element of the array may be null.
     * </div>
     *
     * @param   name
     *          the parameter name
     * @param   values
     *          the parameter values
     *
     * @since  3.0
     *
     * @exception  java.lang.IllegalArgumentException 
     *                            if name is <code>null</code> or one of the 
     *                            elements  of the values String array is 
     *                            <code>null</code>.
     */

    public void setParameter (String name, String[] values);


    /**
     * <div class="changed_added_3_0">
     * Sets a parameter map for the render request.
     * <p>
     * This method can be used to set both public and private render parameters. 
     * <p>
     * These parameters will be accessible in all subsequent render calls via the
     * PortletRequest.getParameter call until a new request is targeted to the portlet.
     * <p>
     * Any previously set private render parameter that is not contained in the new map
     * is removed. However, public render parameters cannot be removed by excluding
     * them from the map. Public render parameters that are not included in the map
     * remain unchanged.
     * <p>
     * The given parameters do not need to be encoded prior to calling this method.
     * <p>
     * The portlet should not modify the map any further after calling this method.
     * </div>
     * 
     * @param parameters - Map containing parameter names for the render phase as keys and parameter values
     *                     as map values. The keys in the parameter map must be of type String and may not
     *                     be <code>null</code> or the null string (""). The values in the parameter map must be of type
     *                     String array (<code>String[]</code>). Neither the values array nor any of its elements may be
     *                     <code>null</code>; however, the null string ("") is allowed.
     *                     Map containing parameter names for the render phase as keys and parameter values
     * 
     * @exception java.lang.IllegalArgumentException - if parameters is <code>null</code>, if 
     *                     any of the keys in the Map are <code>null</code> or the null string, if any of the keys is
     *                     not a <code>String</code>, if any of the values is not a String array, or if any of the String
     *                     array elements are null. 
     *            java.lang.IllegalStateException - if the method is
     *                    invoked after sendRedirect has been called.
     * 
     * @since  3.0
     */

    public void setParameters(java.util.Map<String, String[]> parameters);

    
    /**
     * <div class="changed_added_3_0">
     * Removes the given parameter. All values associated with the 
     * name provided are removed.
     * </div>
     *
     * @param   name
     *          the parameter name
     *
     * @exception  java.lang.IllegalArgumentException 
     *                            if name is <code>null</code>.
     * 
     * @since  3.0
     */

    public void removeParameter (String name);
    
    
    /**
     * <div class="changed_added_3_0">
     * Makes the public and private parameters identical to 
     * those of the input PortletParameters object. Any public or private parameters
     * not contained in the input object will be cleared, and any new parameters
     * will be set.
     * <p>
     * After the operation completes, there will be no linkage between the input
     * PortletParameters object and the target object.
     * </div>
     *   
     * @param params - input portlet parameters
     * @since  3.0
     */
    
    public void set(PortletParameters params);
    
    
    /**
     * <div class="changed_added_3_0">
     * Clears all currently set private parameters.
     * Same as calling {@link #clear(ClearBehavior)} with the parameter set to
     * CLEAR_PRIVATE_PARAMETERS.
     * </div> 
     * @since 3.0
     */
    
    public void clear();
    
    
    /**
     * <div class="changed_added_3_0">
     * Clears all currently set parameters according to the specified clear behavior.
     * <ul>
     * <li>CLEAR_PRIVATE_PARAMETERS - clears all private parameters.</li>
     * <li>CLEAR_PUBLIC_PARAMETERS - clears all public parameters.</li>
     * <li>CLEAR_ALL_PARAMETERS - clears all private and public parameters.</li>
     * </ul>
     * </div> 
     * @param clearBehavior Specfies which parameters are to be cleared.
     * @since 3.0
     */
    
    public void clear(ClearBehavior clearBehavior);
}
