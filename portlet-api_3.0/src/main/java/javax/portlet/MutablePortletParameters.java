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
 * The <CODE>MutablePortletParameters</CODE> provides methods that allow  
 * setting parameters to record a potential future portlet state.
 * <p>
 * For example, these methods can be used to set render parameters on 
 * a <code>PortletURL</code> object. When the portlet URL containing
 * these parameters is activated, the state represented by the parameters
 * becomes the new current state.
 * <p>
 * If the target MutablePortletParameters object was retrieved from 
 * a response or a URL, changes made will be immediately active. 
 * The new state will be available during subsequent requests as defined 
 * by the response or URL object. 
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
    * @see #clear(ClearOption)
    * 
    * @since 3.0
    */
   public enum ClearOption {

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
     * Sets a String parameter. 
     * If the parameter already exists, this method replaces 
     * all existing values with the new value.
     * <p>
     * The parameters should not be encoded prior to calling this
     * method.
     * <p>
     * A parameter value of <code>null</code> or the empty string ("")
     * creates a parameter with a value of the empty string ("").
     * <p>
     * To remove a parameter, use {@link #removeParameter(String)}.
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
     * Sets a String array parameter. 
     * If the parameter already exists, this method replaces 
     * all existing values with the new value array.
     * <p>
     * The parameters should not be encoded prior to calling this
     * method.
     * <p>
     * A parameter value of <code>null</code> or the empty string ("")
     * creates a parameter with a value of the empty string ("").
     * <p>
     * To remove a parameter, use {@link #removeParameter(String)}.
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

    public void setParameter (String name, String... values);

    
    /**
     * <div class="changed_added_3_0">
     * Removes the given public or private parameter. 
     * All values associated with the name are removed.
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
     * those of the input PortletParameters object.
     * <p>
     * The parameters are copied so that after the operation completes, there 
     * is no linkage to the input object.
     * </div>
     *   
     * @param params - input portlet parameters
     * @since  3.0
     */
    
    public void set(PortletParameters params);
    
    
    /**
     * <div class="changed_added_3_0">
     * Clears all currently set private parameters.
     * Same as calling {@link #clear(ClearOption)} with the parameter set to
     * CLEAR_PRIVATE_PARAMETERS.
     * </div> 
     * @since 3.0
     */
    
    public void clear();
    
    
    /**
     * <div class="changed_added_3_0">
     * Clears all currently set parameters according to the specified clear behavior.
     * <p>
     * <ul>
     * <li>CLEAR_PRIVATE_PARAMETERS - clears all private parameters.</li>
     * <li>CLEAR_PUBLIC_PARAMETERS - clears all public parameters.</li>
     * <li>CLEAR_ALL_PARAMETERS - clears all private and public parameters.</li>
     * </ul>
     * </div> 
     * @param clearOption Specfies which parameters are to be cleared.
     * @since 3.0
     */
    
    public void clear(ClearOption clearOption);
}
