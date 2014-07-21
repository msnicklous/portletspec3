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
public class V2CompatApiResponseTests6 implements Portlet {
   private static final String LOG_CLASS = 
         V2CompatApiResponseTests6.class.getName();
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

      /* TestCase: RenderResponse_extendsMimeResponse1 */
      /* Details: "RenderResponse extends MimeResponse" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(RENDERRESPONSE_EXTENDSMIMERESPONSE1);
      
      /* TestCase: RenderResponse_extendsMimeResponse2 */
      /* Details: "All tests described for the PortletResponse execute correctly with the RenderResponse" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(RENDERRESPONSE_EXTENDSMIMERESPONSE2);
      
      /* TestCase: RenderResponse_extendsMimeResponse3 */
      /* Details: "All tests described for the MimeResponse execute correctly with the RenderResponse" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(RENDERRESPONSE_EXTENDSMIMERESPONSE3);
      
      /* TestCase: RenderResponse_hasSetTitle */
      /* Details: "Has a setTitle(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(RENDERRESPONSE_HASSETTITLE);
      
      /* TestCase: RenderResponse_setTitle1 */
      /* Details: "Returns void" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(RENDERRESPONSE_SETTITLE1);
      
      /* TestCase: RenderResponse_setTitle2 */
      /* Details: "Sets the portlet title to the specified value" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(RENDERRESPONSE_SETTITLE2);
      
      /* TestCase: RenderResponse_hasSetNextPossiblePortletModes */
      /* Details: "Has a setNextPossiblePortletModes(java.util.Collection<PortletMode> portletModes) method" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(RENDERRESPONSE_HASSETNEXTPOSSIBLEPORTLETMODES);
      
      /* TestCase: RenderResponse_setNextPossiblePortletModes1 */
      /* Details: "Returns void" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(RENDERRESPONSE_SETNEXTPOSSIBLEPORTLETMODES1);
      
      /* TestCase: RenderResponse_setNextPossiblePortletModes2 */
      /* Details: "Sets the next possible portlet modes to the specified value" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(RENDERRESPONSE_SETNEXTPOSSIBLEPORTLETMODES2);
      
      /* TestCase: RenderResponse_hasSetContentType */
      /* Details: "Has a setContentType() method" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(RENDERRESPONSE_HASSETCONTENTTYPE);
      
      /* TestCase: RenderResponse_setContentType1 */
      /* Details: "The portlet container will ignore any character encoding specified as part of the content type for render calls" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(RENDERRESPONSE_SETCONTENTTYPE1);
      
      /* TestCase: RenderResponse_setContentType2 */
      /* Details: "Throws IllegalArgumentException if the content type is not valid" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(RENDERRESPONSE_SETCONTENTTYPE2);
      


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


   }

}

