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
public class V2WrapperTests_PortletResponseWrapper implements Portlet {
   private static final String LOG_CLASS = 
         V2WrapperTests_PortletResponseWrapper.class.getName();
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
      ClassChecker cc = new ClassChecker(PortletResponseWrapper.class);

      // Create result objects for the tests

      /* TestCase: PortletResponseWrapper_implementsPortletResponse */
      /* Details: "Implements PortletResponse" */
      TestResult tr0 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_IMPLEMENTSPORTLETRESPONSE);
      {
         tr0.setTcSuccess(cc.implementsInterface(PortletResponse.class));
      }

      /* TestCase: PortletResponseWrapper_constructor */
      /* Details: "Provides constructor PortletResponseWrapper(PortletResponse) with specified wrapped PortletResponse object" */
      TestResult tr1 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_CONSTRUCTOR);
      {
         Class<?>[] parms = {PortletResponse.class};
         tr1.setTcSuccess(cc.hasConstructor(parms));
      }

      /* TestCase: PortletResponseWrapper_hasAddPropertyA */
      /* Details: "Has a addProperty(javax.servlet.http.Cookie) method" */
      TestResult tr2 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASADDPROPERTYA);
      {
         String name = "addProperty";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {javax.servlet.http.Cookie.class};
         tr2.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletResponseWrapper_addPropertyA */
      /* Details: "Calls wrapped method" */
      TestResult tr3 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_ADDPROPERTYA);
      /* TODO: implement test */

      /* TestCase: PortletResponseWrapper_hasAddPropertyB */
      /* Details: "Has a addProperty(java.lang.String, org.w3c.dom.Element) method" */
      TestResult tr4 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASADDPROPERTYB);
      {
         String name = "addProperty";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class, org.w3c.dom.Element.class};
         tr4.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletResponseWrapper_addPropertyB */
      /* Details: "Calls wrapped method" */
      TestResult tr5 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_ADDPROPERTYB);
      /* TODO: implement test */

      /* TestCase: PortletResponseWrapper_hasAddPropertyC */
      /* Details: "Has a addProperty(java.lang.String, java.lang.String) method" */
      TestResult tr6 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASADDPROPERTYC);
      {
         String name = "addProperty";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class, java.lang.String.class};
         tr6.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletResponseWrapper_addPropertyC */
      /* Details: "Calls wrapped method" */
      TestResult tr7 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_ADDPROPERTYC);
      /* TODO: implement test */

      /* TestCase: PortletResponseWrapper_hasEncodeURL */
      /* Details: "Has a encodeURL(java.lang.String) method" */
      TestResult tr8 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASENCODEURL);
      {
         String name = "encodeURL";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class};
         tr8.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletResponseWrapper_encodeURL */
      /* Details: "Calls wrapped method" */
      TestResult tr9 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_ENCODEURL);
      /* TODO: implement test */

      /* TestCase: PortletResponseWrapper_hasGetNamespace */
      /* Details: "Has a getNamespace() method" */
      TestResult tr10 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASGETNAMESPACE);
      {
         String name = "getNamespace";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr10.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletResponseWrapper_getNamespace */
      /* Details: "Calls wrapped method" */
      TestResult tr11 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_GETNAMESPACE);
      /* TODO: implement test */

      /* TestCase: PortletResponseWrapper_hasSetProperty */
      /* Details: "Has a setProperty(java.lang.String, java.lang.String) method" */
      TestResult tr12 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASSETPROPERTY);
      {
         String name = "setProperty";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class, java.lang.String.class};
         tr12.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletResponseWrapper_setProperty */
      /* Details: "Calls wrapped method" */
      TestResult tr13 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_SETPROPERTY);
      /* TODO: implement test */

      /* TestCase: PortletResponseWrapper_hasGetResponse */
      /* Details: "Has a getResponse() method" */
      TestResult tr14 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASGETRESPONSE);
      {
         String name = "getResponse";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr14.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletResponseWrapper_getResponse */
      /* Details: "Returns wrapped PortletResponse object" */
      TestResult tr15 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_GETRESPONSE);
      /* TODO: implement test */

      /* TestCase: PortletResponseWrapper_hasSetResponse */
      /* Details: "Has a setResponse(PortletResponse) method" */
      TestResult tr16 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASSETRESPONSE);
      {
         String name = "setResponse";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {PortletResponse.class};
         tr16.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletResponseWrapper_setResponse */
      /* Details: "Allows wrapped PortletResponse object to be set" */
      TestResult tr17 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_SETRESPONSE);
      /* TODO: implement test */

      /* TestCase: PortletResponseWrapper_hasCreateElement */
      /* Details: "Has a createElement(java.lang.String) method" */
      TestResult tr18 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_HASCREATEELEMENT);
      {
         String name = "createElement";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class};
         tr18.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletResponseWrapper_createElement */
      /* Details: "Calls wrapped method" */
      TestResult tr19 = tcd.getTestResultFailed(PORTLETRESPONSEWRAPPER_CREATEELEMENT);
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


   }

}

