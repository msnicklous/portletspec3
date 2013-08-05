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
 * The <CODE>MutablePortletParameters</CODE> provides methods that allow  
 * setting parameters to record a potential future portlet state.
 * <p>
 * For example, these methods can be used to set parameters on 
 * a <code>PortletURL</code> object. When the portlet URL containing
 * these parameters is activated, the state represented by the parameters
 * becomes the new current state.
 *
 * @since 3.0
 */
public interface MutablePortletParameters extends PortletParameters {

    /**
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
     *
     * @param   name
     *          the parameter name
     * @param   value
     *          the parameter value
     *
     * @exception  java.lang.IllegalArgumentException 
     *                            if name is <code>null</code>.
     */

    public void setParameter (String name, String value);


    /**
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
     */

    public void setParameter (String name, String[] values);


    /**
     * Sets a parameter map for this URL.
     * <p>
     * All previously set parameters are cleared.
     * <p>
     * The <code>PortletURL</code> implementation 'x-www-form-urlencoded' encodes
     * all  parameter names and values. Developers should not encode them.
     * <p>
     * A portlet container may prefix the attribute names internally, 
     * in order to preserve a unique namespace for the portlet.
     *
     * @param  parameters   Map containing parameter names for 
     *                      the render phase as 
     *                      keys and parameter values as map 
     *                      values. The keys in the parameter
     *                      map must be of type String. The values 
     *                      in the parameter map must be of type
     *                      String array (<code>String[]</code>).
     *
     * @exception   java.lang.IllegalArgumentException 
     *                      if parameters is <code>null</code>, if
     *                      any of the keys in the Map are <code>null</code>, 
     *                      if any of the keys is not a String, or if any of 
     *                      the values is not a String array.
     
     
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
     */

    public void setParameters(java.util.Map<String, String[]> parameters);

    
    /**
     * Removes the given parameter. All values associated with the 
     * name provided are removed.
     *
     * @param   name
     *          the parameter name
     *
     * @exception  java.lang.IllegalArgumentException 
     *                            if name is <code>null</code>.
     */

    public void removeParameter (String name);
}
