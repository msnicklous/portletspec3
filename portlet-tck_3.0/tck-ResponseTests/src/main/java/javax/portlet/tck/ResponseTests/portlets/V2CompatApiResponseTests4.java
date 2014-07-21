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
public class V2CompatApiResponseTests4 implements Portlet {
   private static final String LOG_CLASS = 
         V2CompatApiResponseTests4.class.getName();
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

      /* TestCase: EventResponse_extendsStateAwareResponse1 */
      /* Details: "EventResponse extends StateAwareResponse" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(EVENTRESPONSE_EXTENDSSTATEAWARERESPONSE1);
      
      /* TestCase: EventResponse_extendsStateAwareResponse2 */
      /* Details: "All tests described for the PortletResponse execute correctly with the EventResponse" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(EVENTRESPONSE_EXTENDSSTATEAWARERESPONSE2);
      
      /* TestCase: EventResponse_extendsStateAwareResponse3 */
      /* Details: "All tests described for the StateAwareResponse execute correctly with the EventResponse" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(EVENTRESPONSE_EXTENDSSTATEAWARERESPONSE3);
      
      /* TestCase: EventResponse_hasSetRenderParameters */
      /* Details: "Has a setRenderParameters(EventRequest) method" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(EVENTRESPONSE_HASSETRENDERPARAMETERS);
      
      /* TestCase: EventResponse_setRenderParameters1 */
      /* Details: "Copies all render parameters set on the EventRequest to the EventResponse" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(EVENTRESPONSE_SETRENDERPARAMETERS1);
      
      /* TestCase: EventResponse_setRenderParameters2 */
      /* Details: "Throws IllegalArgumentException if the input EventRequest parameter is null" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(EVENTRESPONSE_SETRENDERPARAMETERS2);
      


      // Write the results to the output stream

      tr0.writeTo(writer);
      tr1.writeTo(writer);
      tr2.writeTo(writer);
      tr3.writeTo(writer);
      tr4.writeTo(writer);
      tr5.writeTo(writer);


   }

}

