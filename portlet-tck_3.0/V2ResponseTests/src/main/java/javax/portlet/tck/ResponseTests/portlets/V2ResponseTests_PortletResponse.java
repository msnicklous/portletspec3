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
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.*;
import javax.portlet.tck.beans.TestResult;

/**
 * This portlet implements several test cases for the JSR 362 TCK. The test case names
 * are defined in the /src/main/resources/xml-resources/additionalTCs.xml
 * file. The build process will integrate the test case names defined in the 
 * additionalTCs.xml file into the complete list of test case names for execution by the driver.
 */
public class V2ResponseTests_PortletResponse implements Portlet {
   private static final String LOG_CLASS = 
         V2ResponseTests_PortletResponse.class.getName();
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

      /* TestCase: PortletResponse_hasAddPropertyA */
      /* Details: "Has a addProperty(javax.servlet.http.Cookie) method" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(PORTLETRESPONSE_HASADDPROPERTYA);
      
      /* TestCase: PortletResponse_addPropertyA1 */
      /* Details: "Adds the specified cookie property to the response" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(PORTLETRESPONSE_ADDPROPERTYA1);
      
      /* TestCase: PortletResponse_addPropertyA2 */
      /* Details: "Throws IllegalArgumentException if the specified cookie is null" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(PORTLETRESPONSE_ADDPROPERTYA2);
      
      /* TestCase: PortletResponse_hasAddPropertyB */
      /* Details: "Has a addProperty(java.lang.String key, org.w3c.dom.Element element) method" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(PORTLETRESPONSE_HASADDPROPERTYB);
      
      /* TestCase: PortletResponse_addPropertyB1 */
      /* Details: "Adds an XML DOM Element to the response for the specified key" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(PORTLETRESPONSE_ADDPROPERTYB1);
      
      /* TestCase: PortletResponse_addPropertyB2 */
      /* Details: "If a DOM Element for the specified key already exists, the new element is added in addition to the existing element" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(PORTLETRESPONSE_ADDPROPERTYB2);
      
      /* TestCase: PortletResponse_addPropertyB3 */
      /* Details: "If the specified DOM Element value is null, the key is removed from the response" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(PORTLETRESPONSE_ADDPROPERTYB3);
      
      /* TestCase: PortletResponse_addPropertyB4 */
      /* Details: "Throws IllegalArgumentException if the specified key is null" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(PORTLETRESPONSE_ADDPROPERTYB4);
      
      /* TestCase: PortletResponse_hasAddPropertyC */
      /* Details: "Has a addProperty(java.lang.String, java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(PORTLETRESPONSE_HASADDPROPERTYC);
      
      /* TestCase: PortletResponse_addPropertyC1 */
      /* Details: "Adds a property value to an existing key to allow the key to have multiple values" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(PORTLETRESPONSE_ADDPROPERTYC1);
      
      /* TestCase: PortletResponse_addPropertyC2 */
      /* Details: "Throws IllegalArgumentException if the specified key is null" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(PORTLETRESPONSE_ADDPROPERTYC2);
      
      /* TestCase: PortletResponse_hasSetProperty */
      /* Details: "Has a setProperty(java.lang.String, java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(PORTLETRESPONSE_HASSETPROPERTY);
      
      /* TestCase: PortletResponse_setProperty1 */
      /* Details: "Sets a property value for the specified key" */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(PORTLETRESPONSE_SETPROPERTY1);
      
      /* TestCase: PortletResponse_setProperty2 */
      /* Details: "Resets any existing property values for the specified key" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(PORTLETRESPONSE_SETPROPERTY2);
      
      /* TestCase: PortletResponse_setProperty3 */
      /* Details: "Throws IllegalArgumentException if the specified key is null" */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(PORTLETRESPONSE_SETPROPERTY3);
      
      /* TestCase: PortletResponse_hasEncodeURL */
      /* Details: "Has a encodeURL(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(PORTLETRESPONSE_HASENCODEURL);
      
      /* TestCase: PortletResponse_encodeURL1 */
      /* Details: "Returns a String representing the encoded URL" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(PORTLETRESPONSE_ENCODEURL1);
      
      /* TestCase: PortletResponse_encodeURL2 */
      /* Details: "Throws IllegalArgumentException if the input string is not an absolute URL and does not start with at \"/\" character" */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(PORTLETRESPONSE_ENCODEURL2);
      
      /* TestCase: PortletResponse_hasGetNamespace */
      /* Details: "Has a getNamespace() method" */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(PORTLETRESPONSE_HASGETNAMESPACE);
      
      /* TestCase: PortletResponse_getNamespace1 */
      /* Details: "Returns a String containing the namespace value" */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(PORTLETRESPONSE_GETNAMESPACE1);
      
      /* TestCase: PortletResponse_getNamespace2 */
      /* Details: "The returned namespace is constant for the lifetime of the portlet window" */
      /* TODO: implement test */
      TestResult tr20 = tcd.getTestResultFailed(PORTLETRESPONSE_GETNAMESPACE2);
      
      /* TestCase: PortletResponse_hasCreateElement */
      /* Details: "Has a createElement() throws org.w3c.dom.DOMException method" */
      /* TODO: implement test */
      TestResult tr21 = tcd.getTestResultFailed(PORTLETRESPONSE_HASCREATEELEMENT);
      
      /* TestCase: PortletResponse_createElement1 */
      /* Details: "Returns an org.w3c.dom.Element object for the specified tag name" */
      /* TODO: implement test */
      TestResult tr22 = tcd.getTestResultFailed(PORTLETRESPONSE_CREATEELEMENT1);
      
      /* TestCase: PortletResponse_createElement2 */
      /* Details: "The returned Element has nodeName set to the the specified tag name " */
      /* TODO: implement test */
      TestResult tr23 = tcd.getTestResultFailed(PORTLETRESPONSE_CREATEELEMENT2);
      
      /* TestCase: PortletResponse_createElement3 */
      /* Details: "The returned Element has localName set to null" */
      /* TODO: implement test */
      TestResult tr24 = tcd.getTestResultFailed(PORTLETRESPONSE_CREATEELEMENT3);
      
      /* TestCase: PortletResponse_createElement4 */
      /* Details: "The returned Element has prefix set to null" */
      /* TODO: implement test */
      TestResult tr25 = tcd.getTestResultFailed(PORTLETRESPONSE_CREATEELEMENT4);
      
      /* TestCase: PortletResponse_createElement5 */
      /* Details: "The returned Element has namespaceURI set to null" */
      /* TODO: implement test */
      TestResult tr26 = tcd.getTestResultFailed(PORTLETRESPONSE_CREATEELEMENT5);
      
      /* TestCase: PortletResponse_createElement6 */
      /* Details: "Throws org.w3c.dom.DOMException - INVALID_CHARACTER_ERR if the specified name contains an illegal character. " */
      /* TODO: implement test */
      TestResult tr27 = tcd.getTestResultFailed(PORTLETRESPONSE_CREATEELEMENT6);
      


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


   }

}

