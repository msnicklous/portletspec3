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
package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.portlet.PortletRequest;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * <div class='changed_added_3_0'>
 * Designates a method corresponding to the portlet API serveResource method.
 * <p>
 * The annotated method must have one of the following signatures:
 * <ul>
 * <li>
 * <code>public void &lt;methodName&gt;(ResourceRequest, ResourceResponse)</code>
 * <p>
 * This corresponds to the <code>serveResource</code> method.
 * </li>   
 * <li>
 * <code>public String &lt;methodName&gt;()</code>
 * <p>
 * The String returned by the method will be written to the response unchanged. 
 * </li>   
 * <li>
 * <code>public void &lt;methodName&gt;()</code>
 * <p>
 * Intended for use when only a resource include is needed. 
 * </li>   
 * </ul> 
 * where the method name can be freely selected.
 * <p>
 * The method declaration may contain a throws clause. Exceptions declared in the 
 * throws clause should be of type {@link javax.portlet.PortletException} or
 * {@link java.io.IOException}. 
 * Checked exceptions of any other type will be caught, wrapped with a PortletException, 
 * and rethrown.
 * </div>
 * 
 * @see     javax.portlet.ResourceServingPortlet#serveResource(javax.portlet.ResourceRequest, javax.portlet.ResourceResponse) ResourceServingPortlet#serveResource
 *
 */

@Retention(RUNTIME) @Target({METHOD})
public @interface ServeResourceMethod {
   
   /**
    * The portlet names for which the serve resource method applies.
    * <p>
    * The annotated method can apply to multiple portlets within the portlet
    * application. The names of the portlets to which the resources apply must be 
    * specified in this field.
    * <p>
    * A wildcard character '*' can be specified in the first portletName array element 
    * to indicate that the resource declarations are to apply to all portlets in 
    * the portlet application.
    * If specified, the wildcard character must appear alone in the first array element.
    * 
    * @return     The portlet names
    */
   String[]   portletNames();
   
   /**
    * The resource ID.
    * <p>
    * If a resource ID is specified, the bean enabler will dispatch Resource requests with 
    * matching values of the resource ID to this method. 
    * <p>
    * If this field is empty, 
    * the method will be executed for all Resource requests not dispatched 
    * to other named ResourceMethods.
    * 
    * @return     The resource ID
    */
   String   resourceID() default "";
   
   /**
    * Specifies name of the device attribute to examine in order to perform method dispatching.
    * <p>
    * The device attribute is obtained through the CC/PP Profile object.
    * <p>
    * 
    * 
    * @see PortletRequest#CCPP_PROFILE
    * @see #deviceMatch()
    * 
    * @return     The device attribute name
    */
   String   deviceAttribute() default "";
   
   /**
    * Regular expression used in conjunction with the deviceAttribute element.
    * <p>
    * If the device attribute value is not empty, the attribute is retrieved from the 
    * javax.ccpp.Profile object. The returned value is matched against the 
    * regular expression specified in this attribute.
    * <p>
    * The portlet container
    * attempts to locate the appropriate annotated method for the given resource ID
    * and device attribute data, with the device attribute match having precedence. 
    * A render method with matching device attribute data but an empty resource ID
    * element will take precedence over a render method with empty or not matching
    * device attribute data but a matching resource ID.  
    * 
    * @see #deviceAttribute()
    * @see #resourceID()
    * 
    * @return     The device attribute match string
    */
   String   deviceMatch() default "";
   
   /**
    * Sets the character encoding for content generated by the annotated method.
    * The character encoding will be set before the annotated method body is executed.
    * <p>
    * If this field is empty, the character encoding will not be set.
    * The portlet can then set the character encoding using the portlet API
    * <code>ResourceResponse#setCharacterEncoding</code> method.
    * 
    * @see        javax.portlet.ResourceResponse#setCharacterEncoding(String) ResourceResponse#setCharacterEncoding
    * 
    * @return     The character encoding
    */
   String   characterEncoding() default "UTF-8";
   
   /**
    * Sets the content type, or the MIME type, of content generated by the method.
    * The content type will be set before the annotated method body is executed.
    * <p>
    * If this field is empty, no content type will be set.
    * The portlet can then set the content type using the portlet API
    * <code>ResourceResponse#setContentType</code> method.
    * 
    * @see        javax.portlet.ResourceResponse#setContentType(String) ResourceResponse#setContentType
    * 
    * @return     The content type
    */
   String   contentType() default "text/html";
   
   /**
    * Specifies a resource, such as a JSP, an HTML file, or a servlet, to be included.
    * <p>
    * The resource will be included using the 
    * <code>PortletRequestDispatcher#include</code> method after the method body 
    * has been executed.
    * <p>
    * If this field is empty, no resource will be included.
    * 
    * @see        javax.portlet.PortletRequestDispatcher
    * @see        javax.portlet.PortletRequestDispatcher#include(javax.portlet.PortletRequest, javax.portlet.PortletResponse) PortletRequestDispatcher#include
    * 
    * @return     The resource to be included
    */
   String   include() default "";
   
   /**
    * The ordinal number for this annotated method.
    * <p>
    * The ordinal number determines the order of execution if multiple methods
    * are annotated.
    * Annotated methods with a lower ordinal number are executed before methods with
    * a higher ordinal number.
    * 
    * @return     The ordinal number
    */
   int        ordinal() default 0;
}