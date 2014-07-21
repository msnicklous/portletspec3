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

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.tck.beans.TestCaseDetails;
import javax.portlet.tck.beans.JSR286ApiTestCaseDetails;
import javax.portlet.tck.beans.TestResult;

/**
 * This portlet implements several test cases for the JSR 362 TCK. The test case names
 * are defined in the /src/main/resources/xml-resources/additionalTCs.xml
 * file. The build process will integrate the test case names defined in the 
 * additionalTCs.xml file into the complete list of test case names for execution by the driver.
 */
public class V2CompatApiPortletTests1 implements Portlet {
   private static final String LOG_CLASS = 
         V2CompatApiPortletTests1.class.getName();
   private final Logger LOGGER = Logger.getLogger(LOG_CLASS);
   
   private PortletConfig config = null;

   @Override
   public void init(PortletConfig config) throws PortletException {
      this.config = config;
   }

   @Override
   public void destroy() {
   }

   @Override
   public void processAction(ActionRequest request, ActionResponse response)
         throws PortletException, IOException {
   }

   @Override
   public void render(RenderRequest request, RenderResponse response)
         throws PortletException, IOException {
      
      if (LOGGER.isLoggable(Level.FINE)) {
         LOGGER.logp(Level.FINE, LOG_CLASS, "render", "Entry");
      }

      PrintWriter writer = response.getWriter();

      // Create result objects for the tests

      /* TestCase: PortletConfig_hasGetPortletName */
      /* Details: "Has a getPortletName() method" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETPORTLETNAME);
      
      /* TestCase: PortletConfig_getPortletName */
      /* Details: "Returns a String containing the portlet name" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(PORTLETCONFIG_GETPORTLETNAME);
      
      /* TestCase: PortletConfig_hasGetPortletContext */
      /* Details: "Has a getPortletContext() method" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETPORTLETCONTEXT);
      
      /* TestCase: PortletConfig_getPortletContext */
      /* Details: "Returns the PortletContext object associated with the portlet" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(PORTLETCONFIG_GETPORTLETCONTEXT);
      
      /* TestCase: PortletConfig_hasGetResourceBundle */
      /* Details: "Has a getResourceBundle(java.util.Locale locale) method" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETRESOURCEBUNDLE);
      
      /* TestCase: PortletConfig_getResourceBundle */
      /* Details: "Returns the ResourceBundle for the specified locale" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(PORTLETCONFIG_GETRESOURCEBUNDLE);
      
      /* TestCase: PortletConfig_hasGetInitParameter */
      /* Details: "Has a getInitParameter(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETINITPARAMETER);
      
      /* TestCase: PortletConfig_getInitParameter1 */
      /* Details: "Returns a String containing the initialization parameter value for the given name" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(PORTLETCONFIG_GETINITPARAMETER1);
      
      /* TestCase: PortletConfig_getInitParameter2 */
      /* Details: "Returns null if the specified initialization parameter does not exist" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(PORTLETCONFIG_GETINITPARAMETER2);
      
      /* TestCase: PortletConfig_getInitParameter3 */
      /* Details: "Throws IllegalArgumentException if the name parameter is null" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(PORTLETCONFIG_GETINITPARAMETER3);
      
      /* TestCase: PortletConfig_hasGetInitParameterNames */
      /* Details: "Has a getInitParameterNames() method" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETINITPARAMETERNAMES);
      
      /* TestCase: PortletConfig_getInitParameterNames1 */
      /* Details: "Returns an java.util.Enumeration<java.lang.String> containing the names of the initialization parameters" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(PORTLETCONFIG_GETINITPARAMETERNAMES1);
      
      /* TestCase: PortletConfig_getInitParameterNames2 */
      /* Details: "Returns an empty Enumeration if there are no initialization parameters available " */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(PORTLETCONFIG_GETINITPARAMETERNAMES2);
      
      /* TestCase: PortletConfig_hasGetPublicRenderParameterNames */
      /* Details: "Has a getPublicRenderParameterNames() method" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETPUBLICRENDERPARAMETERNAMES);
      
      /* TestCase: PortletConfig_getPublicRenderParameterNames1 */
      /* Details: "Returns an java.util.Enumeration<java.lang.String> containing the names of the public render parameters" */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(PORTLETCONFIG_GETPUBLICRENDERPARAMETERNAMES1);
      
      /* TestCase: PortletConfig_getPublicRenderParameterNames2 */
      /* Details: "Returns an empty Enumeration if there are no public render parameters are defined " */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(PORTLETCONFIG_GETPUBLICRENDERPARAMETERNAMES2);
      
      /* TestCase: PortletConfig_hasGetDefaultNamespace */
      /* Details: "Has a getDefaultNamespace() method" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETDEFAULTNAMESPACE);
      
      /* TestCase: PortletConfig_getDefaultNamespace1 */
      /* Details: "Returns a String containing the default namespace for events and public render parameters as defined in the deployment descriptor" */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(PORTLETCONFIG_GETDEFAULTNAMESPACE1);
      
      /* TestCase: PortletConfig_getDefaultNamespace2 */
      /* Details: "Returns XMLConstants.NULL_NS_URI if no default namespace is defined in the deployment descriptor " */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(PORTLETCONFIG_GETDEFAULTNAMESPACE2);
      
      /* TestCase: PortletConfig_hasGetPublishingEventQNames */
      /* Details: "Has a getPublishingEventQNames() method" */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETPUBLISHINGEVENTQNAMES);
      
      /* TestCase: PortletConfig_getPublishingEventQNames1 */
      /* Details: "Returns an java.util.Enumeration<java.lang.String> containing the publishing event qnames as defined in the deployment descriptor" */
      /* TODO: implement test */
      TestResult tr20 = tcd.getTestResultFailed(PORTLETCONFIG_GETPUBLISHINGEVENTQNAMES1);
      
      /* TestCase: PortletConfig_getPublishingEventQNames2 */
      /* Details: "Returns an empty Enumeration if there are no processing events are defined" */
      /* TODO: implement test */
      TestResult tr21 = tcd.getTestResultFailed(PORTLETCONFIG_GETPUBLISHINGEVENTQNAMES2);
      
      /* TestCase: PortletConfig_hasGetProcessingEventQNames */
      /* Details: "Has a getProcessingEventQNames() method" */
      /* TODO: implement test */
      TestResult tr22 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETPROCESSINGEVENTQNAMES);
      
      /* TestCase: PortletConfig_getProcessingEventQNames1 */
      /* Details: "Returns an java.util.Enumeration<java.lang.String> containing the processing event qnames as defined in the deployment descriptor" */
      /* TODO: implement test */
      TestResult tr23 = tcd.getTestResultFailed(PORTLETCONFIG_GETPROCESSINGEVENTQNAMES1);
      
      /* TestCase: PortletConfig_getProcessingEventQNames2 */
      /* Details: "Returns an empty Enumeration if there are no processing events are defined" */
      /* TODO: implement test */
      TestResult tr24 = tcd.getTestResultFailed(PORTLETCONFIG_GETPROCESSINGEVENTQNAMES2);
      
      /* TestCase: PortletConfig_hasGetSupportedLocales */
      /* Details: "Has a getSupportedLocales() method" */
      /* TODO: implement test */
      TestResult tr25 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETSUPPORTEDLOCALES);
      
      /* TestCase: PortletConfig_getSupportedLocales1 */
      /* Details: "Returns an java.util.Enumeration<java.lang.String> containing the names of the supported locales as defined in the deployment descriptor" */
      /* TODO: implement test */
      TestResult tr26 = tcd.getTestResultFailed(PORTLETCONFIG_GETSUPPORTEDLOCALES1);
      
      /* TestCase: PortletConfig_getSupportedLocales2 */
      /* Details: "Returns an empty Enumeration if there are no supported locales are defined" */
      /* TODO: implement test */
      TestResult tr27 = tcd.getTestResultFailed(PORTLETCONFIG_GETSUPPORTEDLOCALES2);
      
      /* TestCase: PortletConfig_hasGetContainerRuntimeOptions */
      /* Details: "Has a getContainerRuntimeOptions() method" */
      /* TODO: implement test */
      TestResult tr28 = tcd.getTestResultFailed(PORTLETCONFIG_HASGETCONTAINERRUNTIMEOPTIONS);
      
      /* TestCase: PortletConfig_getContainerRuntimeOptions1 */
      /* Details: "Returns an java.util.Map<java.lang.String,java.lang.String[]> object containing the container runtime options as defined in the deployment descriptor" */
      /* TODO: implement test */
      TestResult tr29 = tcd.getTestResultFailed(PORTLETCONFIG_GETCONTAINERRUNTIMEOPTIONS1);
      
      /* TestCase: PortletConfig_getContainerRuntimeOptions2 */
      /* Details: "If the same option is defined at the portlet application and at the portlet level, the definition at the portlet level takes precedence" */
      /* TODO: implement test */
      TestResult tr30 = tcd.getTestResultFailed(PORTLETCONFIG_GETCONTAINERRUNTIMEOPTIONS2);
      
      /* TestCase: PortletConfig_getContainerRuntimeOptions3 */
      /* Details: "If the portlet container does not support a runtime option defined in the portlet descriptor, that option will not be returned in this map" */
      /* TODO: implement test */
      TestResult tr31 = tcd.getTestResultFailed(PORTLETCONFIG_GETCONTAINERRUNTIMEOPTIONS3);
      
      /* TestCase: PortletConfig_getContainerRuntimeOptions4 */
      /* Details: "Returns an empty map if no container runtime options have been defined " */
      /* TODO: implement test */
      TestResult tr32 = tcd.getTestResultFailed(PORTLETCONFIG_GETCONTAINERRUNTIMEOPTIONS4);
      


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

