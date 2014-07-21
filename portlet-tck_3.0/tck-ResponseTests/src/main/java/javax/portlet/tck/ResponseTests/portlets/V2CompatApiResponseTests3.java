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

package javax.portlet.tck.ResponseTests.portlets;

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
public class V2CompatApiResponseTests3 implements Portlet {
   private static final String LOG_CLASS = 
         V2CompatApiResponseTests3.class.getName();
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

      /* TestCase: ActionResponse_extendsStateAwareResponse1 */
      /* Details: "ActionResponse extends StateAwareResponse" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(ACTIONRESPONSE_EXTENDSSTATEAWARERESPONSE1);
      
      /* TestCase: ActionResponse_extendsStateAwareResponse2 */
      /* Details: "All tests described for the PortletResponse execute correctly with the ActionResponse" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(ACTIONRESPONSE_EXTENDSSTATEAWARERESPONSE2);
      
      /* TestCase: ActionResponse_extendsStateAwareResponse3 */
      /* Details: "All tests described for the StateAwareResponse execute correctly with the ActionResponse" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(ACTIONRESPONSE_EXTENDSSTATEAWARERESPONSE3);
      
      /* TestCase: ActionResponse_hasSendRedirectA */
      /* Details: "Has a sendRedirect(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(ACTIONRESPONSE_HASSENDREDIRECTA);
      
      /* TestCase: ActionResponse_sendRedirectA1 */
      /* Details: "Allows a redirect response to be sent to the client" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTA1);
      
      /* TestCase: ActionResponse_sendRedirectA2 */
      /* Details: "Throws IllegalArgumentException if a relative path URL is specified" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTA2);
      
      /* TestCase: ActionResponse_sendRedirectA3 */
      /* Details: "Throws IllegalStateException if setPortletMode has been called before this method " */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTA3);
      
      /* TestCase: ActionResponse_sendRedirectA4 */
      /* Details: "Throws IllegalStateException if setWindowState has been called before this method " */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTA4);
      
      /* TestCase: ActionResponse_sendRedirectA5 */
      /* Details: "Throws IllegalStateException if setRenderParameter has been called before this method " */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTA5);
      
      /* TestCase: ActionResponse_sendRedirectA6 */
      /* Details: "Throws IllegalStateException if setRenderParameters has been called before this method " */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTA6);
      
      /* TestCase: ActionResponse_sendRedirectA7 */
      /* Details: "Throws IllegalStateException if removePublicRenderParameter has been called before this method" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTA7);
      
      /* TestCase: ActionResponse_sendRedirectA8 */
      /* Details: "Throws IOException if an IO problem occurs " */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTA8);
      
      /* TestCase: ActionResponse_hasSendRedirectB */
      /* Details: "Has a sendRedirect(java.lang.String, java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(ACTIONRESPONSE_HASSENDREDIRECTB);
      
      /* TestCase: ActionResponse_sendRedirectB1 */
      /* Details: "Allows a redirect response to be sent to the client" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTB1);
      
      /* TestCase: ActionResponse_sendRedirectB2 */
      /* Details: "Encodes a render URL as a parameter under the specified name on the redirect URL" */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTB2);
      
      /* TestCase: ActionResponse_sendRedirectB3 */
      /* Details: "The encoded render URL contains the currently set PortletMode" */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTB3);
      
      /* TestCase: ActionResponse_sendRedirectB4 */
      /* Details: "The encoded render URL contains the currently set WindowState" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTB4);
      
      /* TestCase: ActionResponse_sendRedirectB5 */
      /* Details: "The encoded render URL contains the currently set render parameters" */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTB5);
      
      /* TestCase: ActionResponse_sendRedirectB6 */
      /* Details: "Throws IllegalArgumentException if a relative path URL is specified" */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTB6);
      
      /* TestCase: ActionResponse_sendRedirectB7 */
      /* Details: "Throws IllegalStateException if setPortletMode has been called before this method " */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTB7);
      
      /* TestCase: ActionResponse_sendRedirectB8 */
      /* Details: "Throws IllegalStateException if setWindowState has been called before this method " */
      /* TODO: implement test */
      TestResult tr20 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTB8);
      
      /* TestCase: ActionResponse_sendRedirectB9 */
      /* Details: "Throws IllegalStateException if setRenderParameter has been called before this method " */
      /* TODO: implement test */
      TestResult tr21 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTB9);
      
      /* TestCase: ActionResponse_sendRedirectB10 */
      /* Details: "Throws IllegalStateException if setRenderParameters has been called before this method " */
      /* TODO: implement test */
      TestResult tr22 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTB10);
      
      /* TestCase: ActionResponse_sendRedirectB11 */
      /* Details: "Throws IllegalStateException if removePublicRenderParameter has been called before this method" */
      /* TODO: implement test */
      TestResult tr23 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTB11);
      
      /* TestCase: ActionResponse_sendRedirectB12 */
      /* Details: "Throws IOException if an IO problem occurs " */
      /* TODO: implement test */
      TestResult tr24 = tcd.getTestResultFailed(ACTIONRESPONSE_SENDREDIRECTB12);
      


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


   }

}

