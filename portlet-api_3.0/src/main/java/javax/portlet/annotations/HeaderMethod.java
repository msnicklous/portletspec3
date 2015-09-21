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
 * Designates a method corresponding to the doHeaders method of GenericPortlet.
 * The annotated method must have the following signature:
 * <p>
 *    <code>public void &lt;methodName&gt;(RenderRequest, RenderResponse)</code>
 * <p>   
 * where the method name can be freely selected.
 * <p>
 * The method declaration may contain a throws clause. Exceptions declared in the 
 * throws clause should be of type {@link javax.portlet.PortletException} or
 * {@link java.io.IOException}. 
 * Checked exceptions of any other type will be caught, wrapped with a PortletException, 
 * and rethrown.
 * <p>
 * The header method can be used to set properties such as cookies, header values, and 
 * XML elements for the header section of the aggregated portal document. 
 * </div>
 *    
 * @see javax.portlet.PortletResponse the add and set properties methods of PortletResponse
 * @see javax.portlet.MimeResponse#MARKUP_HEAD_ELEMENT MimeResponse#MARKUP_HEAD_ELEMENT
 * @see javax.portlet.GenericPortlet#doHeaders(javax.portlet.RenderRequest, javax.portlet.RenderResponse) doHeaders
 */

@Retention(RUNTIME) @Target({METHOD})
public @interface HeaderMethod {
   
   /**
    * The portlet names for which the header method applies.
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
    * The portlet mode rendered by the annotated method.
    * <p>
    * If an portlet mode is specified, the bean enabler will dispatch Render requests with 
    * matching portlet mode values to this method. 
    * <p>
    * If this field is empty, the method will be executed for all
    * Render requests not dispatched by portlet mode to other RenderMethods.
    * 
    * @return     The portlet mode
    */
   String   portletMode() default "view";
   
   /**
    * Specifies name of the device attribute to examine in order to perform method dispatching.
    * <p>
    * The device attribute is obtained through the CC/PP Profile object.
    * <p>
    * This element provides metadata for use during conditional dispatching.
    * 
    * 
    * @see PortletRequest#CCPP_PROFILE
    * @see RenderMethod#deviceMatch()
    * 
    * @return The device attrribute name
    */
   String   deviceAttribute() default "";
   
   /**
    * Regular expression used in conjunction with the deviceAttribute element.
    * <p>
    * If the device attribute value is not empty, the attribute is retrieved from the 
    * javax.ccpp.Profile object. The returned value is matched against the 
    * regular expression specified in this attribute.
    * <p>
    * This element provides metadata for use during conditional dispatching.
    * 
    * @see RenderMethod#deviceAttribute()
    * @see RenderMethod#portletMode()
    * 
    * @return     The device attribute match string 
    */
   String   deviceMatch() default "";
   
   /**
    * <div class='container-change'>
    * The locales supported by the portlet.
    * An array of String values, each of which represents a single locale.
    * <p>
    * The locale is specified as a language tag as defined in 
    * IETF BCP 47, "Tags for Identifying Languages".
    * <p>
    * This element provides metadata for use during conditional dispatching.
    * </div>
    * 
    * @see     java.util.Locale
    * @see     java.util.Locale#forLanguageTag forLanguageTag
    * @see     <a href="https://tools.ietf.org/html/bcp47">IETF BCP 47</a>
    * 
    * @return  An array of language tag strings
    */
   String[]   locales() default {"en"};
   
   /**
    * Sets the content type, or the MIME type, of content generated by the method.
    * The content type will be set before the annotated method body is executed.
    * <p>
    * If this field is empty, no content type will be set.
    * The portlet can then set the content type using the portlet API
    * <code>RenderResponse#setContentType</code> method.
    * 
    * @see        javax.portlet.RenderResponse#setContentType(String) RenderResponse#setContentType
    * 
    * @return     The content type
    */
   String   contentType() default "text/html";
   
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
