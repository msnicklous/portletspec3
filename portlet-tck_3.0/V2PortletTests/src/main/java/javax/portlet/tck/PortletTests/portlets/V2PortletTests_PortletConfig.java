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

package javax.portlet.tck.PortletTests.portlets;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Enumeration;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.portlet.*;
import javax.portlet.filter.*;
import javax.portlet.tck.beans.ClassChecker;
import javax.portlet.tck.beans.TestCaseDetails;
import javax.portlet.tck.beans.JSR286ApiTestCaseDetails;
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.*;
import javax.portlet.tck.beans.TestResult;

/**
 * This portlet implements several test cases for the JSR 362 TCK. The test case names
 * are defined in the /src/main/resources/xml-resources/additionalTCs.xml
 * file. The build process will integrate the test case names defined in the 
 * additionalTCs.xml file into the complete list of test case names for execution by the driver.
 */
public class V2PortletTests_PortletConfig implements Portlet {
   private static final String LOG_CLASS = 
         V2PortletTests_PortletConfig.class.getName();
   private final Logger LOGGER = Logger.getLogger(LOG_CLASS);
   
   private PortletConfig portletConfig = null;

   @Override
   public void init(PortletConfig config) throws PortletException {
      this.portletConfig = config;
   }

   @Override
   public void destroy() {
   }

   @Override
   public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
         throws PortletException, IOException {
   }

   @Override
   public void render(RenderRequest renderRequest, RenderResponse renderResponse)
         throws PortletException, IOException {
      
      if (LOGGER.isLoggable(Level.FINE)) {
         LOGGER.logp(Level.FINE, LOG_CLASS, "render", "Entry");
      }

      PrintWriter writer = renderResponse.getWriter();
      JSR286ApiTestCaseDetails tcd = new JSR286ApiTestCaseDetails();
      ClassChecker cc = new ClassChecker(portletConfig.getClass());

      // Create result objects for the tests

      /* TestCase: PortletConfig_hasGetPortletName */
      /* Details: "Has a getPortletName() method" */
      TestResult tr0 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETPORTLETNAME);
      {
         String name = "getPortletName";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr0.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletConfig_getPortletName */
      /* Details: "Returns a String containing the portlet name" */
      TestResult tr1 = tcd.getTestResultFailed(PORTLETCONFIG_GETPORTLETNAME);
      /* TODO: implement test */

      /* TestCase: PortletConfig_hasGetPortletContext */
      /* Details: "Has a getPortletContext() method" */
      TestResult tr2 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETPORTLETCONTEXT);
      {
         String name = "getPortletContext";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr2.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletConfig_getPortletContext */
      /* Details: "Returns the PortletContext object associated with the portlet" */
      TestResult tr3 = tcd.getTestResultFailed(PORTLETCONFIG_GETPORTLETCONTEXT);
      /* TODO: implement test */

      /* TestCase: PortletConfig_hasGetResourceBundle */
      /* Details: "Has a getResourceBundle(java.util.Locale locale) method" */
      TestResult tr4 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETRESOURCEBUNDLE);
      {
         String name = "getResourceBundle";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.util.Locale.class};
         tr4.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletConfig_getResourceBundle */
      /* Details: "Returns the ResourceBundle for the specified locale" */
      TestResult tr5 = tcd.getTestResultFailed(PORTLETCONFIG_GETRESOURCEBUNDLE);
      /* TODO: implement test */

      /* TestCase: PortletConfig_hasGetInitParameter */
      /* Details: "Has a getInitParameter(java.lang.String) method" */
      TestResult tr6 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETINITPARAMETER);
      {
         String name = "getInitParameter";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class};
         tr6.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletConfig_getInitParameter1 */
      /* Details: "Returns a String containing the initialization parameter value for the given name" */
      TestResult tr7 = tcd.getTestResultFailed(PORTLETCONFIG_GETINITPARAMETER1);
      /* TODO: implement test */

      /* TestCase: PortletConfig_getInitParameter2 */
      /* Details: "Returns null if the specified initialization parameter does not exist" */
      TestResult tr8 = tcd.getTestResultFailed(PORTLETCONFIG_GETINITPARAMETER2);
      /* TODO: implement test */

      /* TestCase: PortletConfig_getInitParameter3 */
      /* Details: "Throws IllegalArgumentException if the name parameter is null" */
      TestResult tr9 = tcd.getTestResultFailed(PORTLETCONFIG_GETINITPARAMETER3);
      /* TODO: implement test */

      /* TestCase: PortletConfig_hasGetInitParameterNames */
      /* Details: "Has a getInitParameterNames() method" */
      TestResult tr10 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETINITPARAMETERNAMES);
      {
         String name = "getInitParameterNames";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr10.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletConfig_getInitParameterNames1 */
      /* Details: "Returns an java.util.Enumeration<java.lang.String> containing the names of the initialization parameters" */
      TestResult tr11 = tcd.getTestResultFailed(PORTLETCONFIG_GETINITPARAMETERNAMES1);
      /* TODO: implement test */

      /* TestCase: PortletConfig_getInitParameterNames2 */
      /* Details: "Returns an empty Enumeration if there are no initialization parameters available " */
      TestResult tr12 = tcd.getTestResultFailed(PORTLETCONFIG_GETINITPARAMETERNAMES2);
      /* TODO: implement test */

      /* TestCase: PortletConfig_hasGetPublicRenderParameterNames */
      /* Details: "Has a getPublicRenderParameterNames() method" */
      TestResult tr13 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETPUBLICRENDERPARAMETERNAMES);
      {
         String name = "getPublicRenderParameterNames";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr13.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletConfig_getPublicRenderParameterNames1 */
      /* Details: "Returns an java.util.Enumeration<java.lang.String> containing the names of the public render parameters" */
      TestResult tr14 = tcd.getTestResultFailed(PORTLETCONFIG_GETPUBLICRENDERPARAMETERNAMES1);
      /* TODO: implement test */

      /* TestCase: PortletConfig_getPublicRenderParameterNames2 */
      /* Details: "Returns an empty Enumeration if there are no public render parameters are defined " */
      TestResult tr15 = tcd.getTestResultFailed(PORTLETCONFIG_GETPUBLICRENDERPARAMETERNAMES2);
      /* TODO: implement test */

      /* TestCase: PortletConfig_hasGetDefaultNamespace */
      /* Details: "Has a getDefaultNamespace() method" */
      TestResult tr16 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETDEFAULTNAMESPACE);
      {
         String name = "getDefaultNamespace";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr16.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletConfig_getDefaultNamespace1 */
      /* Details: "Returns a String containing the default namespace for events and public render parameters as defined in the deployment descriptor" */
      TestResult tr17 = tcd.getTestResultFailed(PORTLETCONFIG_GETDEFAULTNAMESPACE1);
      /* TODO: implement test */

      /* TestCase: PortletConfig_getDefaultNamespace2 */
      /* Details: "Returns XMLConstants.NULL_NS_URI if no default namespace is defined in the deployment descriptor " */
      TestResult tr18 = tcd.getTestResultFailed(PORTLETCONFIG_GETDEFAULTNAMESPACE2);
      /* TODO: implement test */

      /* TestCase: PortletConfig_hasGetPublishingEventQNames */
      /* Details: "Has a getPublishingEventQNames() method" */
      TestResult tr19 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETPUBLISHINGEVENTQNAMES);
      {
         String name = "getPublishingEventQNames";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr19.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletConfig_getPublishingEventQNames1 */
      /* Details: "Returns an java.util.Enumeration<java.lang.String> containing the publishing event qnames as defined in the deployment descriptor" */
      TestResult tr20 = tcd.getTestResultFailed(PORTLETCONFIG_GETPUBLISHINGEVENTQNAMES1);
      /* TODO: implement test */

      /* TestCase: PortletConfig_getPublishingEventQNames2 */
      /* Details: "Returns an empty Enumeration if there are no processing events are defined" */
      TestResult tr21 = tcd.getTestResultFailed(PORTLETCONFIG_GETPUBLISHINGEVENTQNAMES2);
      /* TODO: implement test */

      /* TestCase: PortletConfig_hasGetProcessingEventQNames */
      /* Details: "Has a getProcessingEventQNames() method" */
      TestResult tr22 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETPROCESSINGEVENTQNAMES);
      {
         String name = "getProcessingEventQNames";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr22.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletConfig_getProcessingEventQNames1 */
      /* Details: "Returns an java.util.Enumeration<java.lang.String> containing the processing event qnames as defined in the deployment descriptor" */
      TestResult tr23 = tcd.getTestResultFailed(PORTLETCONFIG_GETPROCESSINGEVENTQNAMES1);
      /* TODO: implement test */

      /* TestCase: PortletConfig_getProcessingEventQNames2 */
      /* Details: "Returns an empty Enumeration if there are no processing events are defined" */
      TestResult tr24 = tcd.getTestResultFailed(PORTLETCONFIG_GETPROCESSINGEVENTQNAMES2);
      /* TODO: implement test */

      /* TestCase: PortletConfig_hasGetSupportedLocales */
      /* Details: "Has a getSupportedLocales() method" */
      TestResult tr25 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETSUPPORTEDLOCALES);
      {
         String name = "getSupportedLocales";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr25.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletConfig_getSupportedLocales1 */
      /* Details: "Returns an java.util.Enumeration<java.lang.String> containing the names of the supported locales as defined in the deployment descriptor" */
      TestResult tr26 = tcd.getTestResultFailed(PORTLETCONFIG_GETSUPPORTEDLOCALES1);
      /* TODO: implement test */

      /* TestCase: PortletConfig_getSupportedLocales2 */
      /* Details: "Returns an empty Enumeration if there are no supported locales are defined" */
      TestResult tr27 = tcd.getTestResultFailed(PORTLETCONFIG_GETSUPPORTEDLOCALES2);
      /* TODO: implement test */

      /* TestCase: PortletConfig_hasGetContainerRuntimeOptions */
      /* Details: "Has a getContainerRuntimeOptions() method" */
      TestResult tr28 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETCONTAINERRUNTIMEOPTIONS);
      {
         String name = "getContainerRuntimeOptions";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr28.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletConfig_getContainerRuntimeOptions1 */
      /* Details: "Returns an java.util.Map<java.lang.String,java.lang.String[]> object containing the container runtime options as defined in the deployment descriptor" */
      TestResult tr29 = tcd.getTestResultFailed(PORTLETCONFIG_GETCONTAINERRUNTIMEOPTIONS1);
      /* TODO: implement test */

      /* TestCase: PortletConfig_getContainerRuntimeOptions2 */
      /* Details: "If the same option is defined at the portlet application and at the portlet level, the definition at the portlet level takes precedence" */
      TestResult tr30 = tcd.getTestResultFailed(PORTLETCONFIG_GETCONTAINERRUNTIMEOPTIONS2);
      /* TODO: implement test */

      /* TestCase: PortletConfig_getContainerRuntimeOptions3 */
      /* Details: "If the portlet container does not support a runtime option defined in the portlet descriptor, that option will not be returned in this map" */
      TestResult tr31 = tcd.getTestResultFailed(PORTLETCONFIG_GETCONTAINERRUNTIMEOPTIONS3);
      /* TODO: implement test */

      /* TestCase: PortletConfig_getContainerRuntimeOptions4 */
      /* Details: "Returns an empty map if no container runtime options have been defined " */
      TestResult tr32 = tcd.getTestResultFailed(PORTLETCONFIG_GETCONTAINERRUNTIMEOPTIONS4);
      /* TODO: implement test */



      // Write the results to the output stream

      tr0.writeTo(writer);
      tr1.writeTo(writer);
      tr2.writeTo(writer);
      tr3.writeTo(writer);
      tr4.writeTo(writer);
      tr5.writeTo(writer);
      tr6.writeTo(writer);
      tr7.writeTo(writer);
      tr8.writeTo(writer);
      tr9.writeTo(writer);
      tr10.writeTo(writer);
      tr11.writeTo(writer);
      tr12.writeTo(writer);
      tr13.writeTo(writer);
      tr14.writeTo(writer);
      tr15.writeTo(writer);
      tr16.writeTo(writer);
      tr17.writeTo(writer);
      tr18.writeTo(writer);
      tr19.writeTo(writer);
      tr20.writeTo(writer);
      tr21.writeTo(writer);
      tr22.writeTo(writer);
      tr23.writeTo(writer);
      tr24.writeTo(writer);
      tr25.writeTo(writer);
      tr26.writeTo(writer);
      tr27.writeTo(writer);
      tr28.writeTo(writer);
      tr29.writeTo(writer);
      tr30.writeTo(writer);
      tr31.writeTo(writer);
      tr32.writeTo(writer);


   }

}

