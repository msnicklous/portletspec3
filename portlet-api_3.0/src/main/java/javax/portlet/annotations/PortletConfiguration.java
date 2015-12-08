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

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * <div class='changed_added_3_0'>
 * Annotation for the portlet configuration. 
 * Many of these configuration parameters also appear in
 * the portlet deployment descriptor.
 * <p>
 * The portlet deployment descriptor can continue to be used. 
 * Values of configuration parameters appearing in the deployment descriptor have 
 * precedence over the corresponding values defined in the annotation.   
 * </div>
 */
@Retention(RUNTIME) @Target({TYPE})
public @interface PortletConfiguration {
   
   /**
    * The portlet name for the annotated type.
    * 
    * @return  The portlet name
    */
   String   portletName();
   
   /**
    * The portlet initialization parameters.
    * 
    * @return     An array of initialization parameters
    */
   InitParameter[] initParams() default {};
   
   /**
    * The portlet container runtime options.
    * 
    * @return     An array of portlet runtime options
    */
   RuntimeOption[] runtimeOptions() default {};
   
   /**
    * <div class='container-change'>
    * The locales supported by the portlet.
    * An array of String values, each of which represents a single locale.
    * <p>
    * The locale is specified as a language tag as defined in 
    * IETF BCP 47, "Tags for Identifying Languages".
    * </div>
    * 
    * @see     java.util.Locale
    * @see     java.util.Locale#forLanguageTag forLanguageTag
    * @see     <a href="https://tools.ietf.org/html/bcp47">IETF BCP 47</a>
    * 
    * @return  An array of language tag strings
    */
   String[]   supportedLocales() default {"en"};
   
   /**
    * <div class='not-supported'>
    * Locale specific static title for this portlet.
    * </div>
    * 
    * @return The portlet title
    */
   LocaleString[]   title() default {};
   
   /**
    * <div class='container-change'>
    * Locale specific short version of the static title.
    * </div>
    * 
    * @return The short title
    */
   LocaleString[]   shortTitle() default {};
   
   /**
    * <div class='container-change'>
    * The display-name type contains a locale-specific short name that is intended to be displayed by tools. 
    * It is used by display-name elements. 
    * The display name need not be unique.
    * </div>
    * 
    * @return  The display name
    */
   LocaleString[]   displayName() default {};
   
   /**
    * <div class='container-change'>
    * The portlet description.
    * It provides locale-specific text describing the portlet for use by the portal application or by tools.
    * </div>
    * 
    * @return  The portlet description
    */
   LocaleString[]   description() default {};
   
   /**
    * <div class='container-change'>
    * Locale specific keywords associated with this portlet. 
    * The keywords are separated by commas within the value of the 
    * <code>LocaleString</code> array element.
    * </div>
    *
    * @return  The keywords
    */
   LocaleString[]   keywords() default {};
   
   /**
    * <div class='container-change'>
    * The portlet preferences.
    * </div>
    * 
    * @return     The portlet preferences
    */
   Preference[]  prefs() default {};
   
   /**
    * <div class='container-change'>
    * The public render parameter identifiers used by the portlet.
    * </div>
    * 
    * @return     The array of public render parameters.
    */
   String[]  publicParams() default {};

   /**
    * <div class='container-change'>
    * The resource bundle name for this portlet.
    * Name of the resource bundle containing the language specific 
    * portlet information in different languages.
    * <p>
    * the file name is specified without 
    * the language specific part (e.g. _en) or the file extension.
    * </div>
    * 
    * @return     The resource bundle name
    */
   String   resourceBundle()  default "";
   
   /**
    * <div class='container-change'>
    * The supported portlet modes and window states for a given <code>MIME</code> type.
    * </div>
    * 
    * @return     The supported portlet modes and window states
    */
   Supports[] supports() default {@Supports(mimeType="text/html")};
   
   /**
    * <div class='not-supported'>
    * The cache scope, which defines whether generated portlet content is private
    * for the user or can be shared across different users.
    * <p>
    * If this field is set to <code>TRUE</code>, cached information can be shared 
    * between users. 
    * Otherwise cached information will be considered private
    * to the user.
    * <p>
    * This value is set before the annotated method is called.
    * </div>
    *  
    * @return     The cache scope
    */
   boolean   cacheScopePublic() default false;
   
   /**
    * <div class='not-supported'>
    * Expiration-time defines the time in seconds after which the portlet output expires.
    * A value of -1 indicates that the output never expires.
    * <p>
    * This value is set before the annotated method is called.
    * </div>
    *  
    * @return     The expiration time
    */
   int   cacheExpirationTime() default 0;
   
   /**
    * <div class='container-change'>
    * The dependencies the portlet may have on external resources.
    * The resources can represent client-side prerequisites such as JavaScript libraries
    * or stylesheet resources that are shared among portlets.
    * </div>
    * 
    * @return     The dependencies
    */
   Dependency[]      dependencies() default {};
   
   /**
    * <div class='container-change'>
    * The security role references. 
    * </div>
    * 
    * @return  The security role references
    */
   SecurityRoleRef[]   roleRefs() default {};
}
