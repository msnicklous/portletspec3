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

package javax.portlet.tck.URLTests.portlets;

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
public class V2CompatApiURLTests2 implements Portlet {
   private static final String LOG_CLASS = 
         V2CompatApiURLTests2.class.getName();
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

      /* TestCase: PortletURL_extendsBaseURL1 */
      /* Details: "PortletURL extends BaseURL" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(PORTLETURL_EXTENDSBASEURL1);
      
      /* TestCase: PortletURL_extendsBaseURL2 */
      /* Details: "All tests described for the BaseURL execute correctly with the PortletURL" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(PORTLETURL_EXTENDSBASEURL2);
      
      /* TestCase: PortletURL_hasSetWindowState */
      /* Details: "Has a setWindowState(WindowState) method" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(PORTLETURL_HASSETWINDOWSTATE);
      
      /* TestCase: PortletURL_setWindowState1 */
      /* Details: "Sets the WindowState to be used when the URL is activated" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(PORTLETURL_SETWINDOWSTATE1);
      
      /* TestCase: PortletURL_setWindowState2 */
      /* Details: "Throws WindowStateException if the portal does not support the specified Window State" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(PORTLETURL_SETWINDOWSTATE2);
      
      /* TestCase: PortletURL_setWindowState3 */
      /* Details: "Throws WindowStateException if the specified WindowState is not declared in the deployment descriptor" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(PORTLETURL_SETWINDOWSTATE3);
      
      /* TestCase: PortletURL_setWindowState4 */
      /* Details: "Throws WindowStateException if the user is not allowed to switch to the specified WindowState" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(PORTLETURL_SETWINDOWSTATE4);
      
      /* TestCase: PortletURL_hasSetPortletMode */
      /* Details: "Has a setPortletMode() method" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(PORTLETURL_HASSETPORTLETMODE);
      
      /* TestCase: PortletURL_setPortletMode1 */
      /* Details: "Sets the PortletMode to be used when the URL is activated" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(PORTLETURL_SETPORTLETMODE1);
      
      /* TestCase: PortletURL_setPortletMode2 */
      /* Details: "Throws PortletModeException if the portal does not support the specified Window State" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(PORTLETURL_SETPORTLETMODE2);
      
      /* TestCase: PortletURL_setPortletMode3 */
      /* Details: "Throws PortletModeException if the specified PortletMode is not declared in the deployment descriptor" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(PORTLETURL_SETPORTLETMODE3);
      
      /* TestCase: PortletURL_setPortletMode4 */
      /* Details: "Throws PortletModeException if the user is not allowed to switch to the specified PortletMode" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(PORTLETURL_SETPORTLETMODE4);
      
      /* TestCase: PortletURL_hasGetPortletMode */
      /* Details: "Has a getPortletMode() method" */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(PORTLETURL_HASGETPORTLETMODE);
      
      /* TestCase: PortletURL_getPortletMode1 */
      /* Details: "Returns the PortletMode object set on the URL" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(PORTLETURL_GETPORTLETMODE1);
      
      /* TestCase: PortletURL_getPortletMode2 */
      /* Details: "Returns null if the PortletMode has not been set" */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(PORTLETURL_GETPORTLETMODE2);
      
      /* TestCase: PortletURL_hasGetWindowState */
      /* Details: "Has a getWindowState() method" */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(PORTLETURL_HASGETWINDOWSTATE);
      
      /* TestCase: PortletURL_getWindowState1 */
      /* Details: "Returns the WindowState object set on the URL" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(PORTLETURL_GETWINDOWSTATE1);
      
      /* TestCase: PortletURL_getWindowState2 */
      /* Details: "Returns null if the Window State has not been set" */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(PORTLETURL_GETWINDOWSTATE2);
      
      /* TestCase: PortletURL_hasRemovePublicRenderParameter */
      /* Details: "Has a removePublicRenderParameter(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(PORTLETURL_HASREMOVEPUBLICRENDERPARAMETER);
      
      /* TestCase: PortletURL_removePublicRenderParameter1 */
      /* Details: "Removes the specified public render parameter" */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(PORTLETURL_REMOVEPUBLICRENDERPARAMETER1);
      
      /* TestCase: PortletURL_removePublicRenderParameter2 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      /* TODO: implement test */
      TestResult tr20 = tcd.getTestResultFailed(PORTLETURL_REMOVEPUBLICRENDERPARAMETER2);
      


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


   }

}

