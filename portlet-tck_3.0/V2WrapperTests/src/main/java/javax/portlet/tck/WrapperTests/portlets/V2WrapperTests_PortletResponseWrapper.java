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

package javax.portlet.tck.WrapperTests.portlets;

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
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.*;
import javax.portlet.tck.beans.TestResult;

/**
 * This portlet implements several test cases for the JSR 362 TCK. The test case names
 * are defined in the /src/main/resources/xml-resources/additionalTCs.xml
 * file. The build process will integrate the test case names defined in the 
 * additionalTCs.xml file into the complete list of test case names for execution by the driver.
 */
public class V2WrapperTests_PortletResponseWrapper implements Portlet {
   private static final String LOG_CLASS = 
         V2WrapperTests_PortletResponseWrapper.class.getName();
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
      JSR286ApiTestCaseDetails tcd = new JSR286ApiTestCaseDetails();

      // Create result objects for the tests

      /* TestCase: PortletResponseWrapper_implementsPortletResponse */
      /* Details: "Implements PortletResponse" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_IMPLEMENTSPORTLETRESPONSE);
      
      /* TestCase: PortletResponseWrapper_constructor */
      /* Details: "Constructs PortletResponseWrapper with specified wrapped PortletResponse object" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_CONSTRUCTOR);
      
      /* TestCase: PortletResponseWrapper_hasAddPropertyA */
      /* Details: "Has a addProperty(javax.servlet.http.Cookie) method" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASADDPROPERTYA);
      
      /* TestCase: PortletResponseWrapper_addPropertyA */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_ADDPROPERTYA);
      
      /* TestCase: PortletResponseWrapper_hasAddPropertyB */
      /* Details: "Has a addProperty(java.lang.String, org.w3c.dom.Element) method" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASADDPROPERTYB);
      
      /* TestCase: PortletResponseWrapper_addPropertyB */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_ADDPROPERTYB);
      
      /* TestCase: PortletResponseWrapper_hasAddPropertyC */
      /* Details: "Has a addProperty(java.lang.String, java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASADDPROPERTYC);
      
      /* TestCase: PortletResponseWrapper_addPropertyC */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_ADDPROPERTYC);
      
      /* TestCase: PortletResponseWrapper_hasEncodeURL */
      /* Details: "Has a encodeURL(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASENCODEURL);
      
      /* TestCase: PortletResponseWrapper_encodeURL */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_ENCODEURL);
      
      /* TestCase: PortletResponseWrapper_hasGetNamespace */
      /* Details: "Has a getNamespace() method" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASGETNAMESPACE);
      
      /* TestCase: PortletResponseWrapper_getNamespace */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_GETNAMESPACE);
      
      /* TestCase: PortletResponseWrapper_hasSetProperty */
      /* Details: "Has a setProperty(java.lang.String, java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASSETPROPERTY);
      
      /* TestCase: PortletResponseWrapper_setProperty */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_SETPROPERTY);
      
      /* TestCase: PortletResponseWrapper_hasGetResponse */
      /* Details: "Has a getResponse() method" */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASGETRESPONSE);
      
      /* TestCase: PortletResponseWrapper_getResponse */
      /* Details: "Returns wrapped PortletResponse object" */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_GETRESPONSE);
      
      /* TestCase: PortletResponseWrapper_hasSetResponse */
      /* Details: "Has a setResponse(PortletResponse) method" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASSETRESPONSE);
      
      /* TestCase: PortletResponseWrapper_setResponse */
      /* Details: "Allows wrapped PortletResponse object to be set" */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_SETRESPONSE);
      
      /* TestCase: PortletResponseWrapper_hasCreateElement */
      /* Details: "Has a createElement(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASCREATEELEMENT);
      
      /* TestCase: PortletResponseWrapper_createElement */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_CREATEELEMENT);
      


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


   }

}

