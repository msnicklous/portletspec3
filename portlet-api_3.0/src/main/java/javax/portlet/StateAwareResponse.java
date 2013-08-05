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
 * The <CODE>StateAwareResponse</CODE> represents a response that can modify
 * state information or send events.<BR>
 * It extends the PortletResponse interface.
 * 
 * @since 2.0
 * @see PortletResponse
 */
public interface StateAwareResponse extends PortletResponse, MutablePortletParameters, MutableViewState {

	/**
     * Sets a parameter map for the render request.
     * <p> 
     * See description of {@link javax.portlet.MutablePortletParameters#setParameters(java.util.Map)}
     * which provides the same function. 
     */

	public void setRenderParameters(java.util.Map<String, String[]> parameters);

	/**
     * Sets a String parameter for the render request.
      * <p> 
     * See description of {@link javax.portlet.MutablePortletParameters#setParameter(String, String)}
     * which provides the same function. 
     */

	public void setRenderParameter(String key, String value);

	/**
     * Sets a String array parameter for the render request.
     * <p> 
     * See description of {@link javax.portlet.MutablePortletParameters#setParameter(String, String[])}
     * which provides the same function. 
     */

	public void setRenderParameter(String key, String[] values);

	/**
     * Publishes an Event with the given payload.
     * <p>
     * The object type of the value must be compliant with the specified event
     * type in the portlet deployment descriptor.
     * <p>
     * The value must have a valid JAXB binding and be serializable.
     * 
     * @param name
     *            the event name to publish, must not be <code>null</code>
     * @param value
     *            the value of this event, must have a valid JAXB binding and 
     *            be serializable, or <code>null</code>.
     * 
     * @exception java.lang.IllegalArgumentException
     *                if name is <code>null</code>, the value is not
     *                serializable, the value does not have a valid JAXB binding, the
     *                object type of the value is not the same as specified in
     *                the portlet deployment descriptor for this event name.
     * @since 2.0
     */
	public void setEvent(javax.xml.namespace.QName name, java.io.Serializable value);

	/**
     * Publishes an Event with the given payload in the default namespace.
     * <p>
     * The name is treated as local part of the event QName and the namespace
     * is either taken from the <code>default-event-namespace</code> element
     * in the portlet deployment descriptor, or if this element is not provided
     * the XML default namespace XMLConstants.NULL_NS_URI is used.
     * <p>
     * The object type of the value must be compliant with the specified event
     * type in the portlet deployment descriptor.
     * <p>
     * The value must have a valid JAXB binding and be serializable.
     * 
     * @param name
     *            the local part of the event name to publish, must not be <code>null</code>
     * @param value
     *            the value of this event, must have a valid JAXB binding and 
     *            be serializable, or <code>null</code>.
     * 
     * @exception java.lang.IllegalArgumentException
     *                if name is <code>null</code>, the value is not
     *                serializable, the value does not have a valid JAXB binding, the
     *                object type of the value is not the same as specified in
     *                the portlet deployment descriptor for this event name.
     * @since 2.0
     */
	public void setEvent(String name, java.io.Serializable value);


	/**
     * Returns a <code>Map</code> of the render parameters currently set on
     * this response.
     * <p> 
     * See description of {@link javax.portlet.PortletParameters#getParameterMap()}
     * which provides the same function. 
     */

	public java.util.Map<String, String[]> getRenderParameterMap();


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
    */
   public void removePublicRenderParameter(String name);
	
}
