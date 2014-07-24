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
public class V2WrapperTests_RenderRequestWrapper implements Portlet {
   private static final String LOG_CLASS = 
         V2WrapperTests_RenderRequestWrapper.class.getName();
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
      ClassChecker cc = new ClassChecker(RenderRequestWrapper.class);

      // Create result objects for the tests

      /* TestCase: RenderRequestWrapper_extendsPortletRequestWrapper */
      /* Details: "Extends PortletRequestWrapper" */
      TestResult tr0 = tcd.getTestResultFailed(RENDERREQUESTWRAPPER_EXTENDSPORTLETREQUESTWRAPPER);
      {
         tr0.setTcSuccess(cc.hasSuperclass(PortletRequestWrapper.class));
      }

      /* TestCase: RenderRequestWrapper_implementsRenderRequest */
      /* Details: "Implements RenderRequest" */
      TestResult tr1 = tcd.getTestResultFailed(RENDERREQUESTWRAPPER_IMPLEMENTSRENDERREQUEST);
      {
         tr1.setTcSuccess(cc.implementsInterface(RenderRequest.class));
      }

      /* TestCase: RenderRequestWrapper_constructor */
      /* Details: "Provides constructor RenderRequestWrapper(RenderRequest) with specified wrapped RenderRequest object" */
      TestResult tr2 = tcd.getTestResultFailed(RENDERREQUESTWRAPPER_CONSTRUCTOR);
      {
         Class<?>[] parms = {RenderRequest.class};
         tr2.setTcSuccess(cc.hasConstructor(parms));
      }

      /* TestCase: RenderRequestWrapper_hasGetRequest */
      /* Details: "Has a getRequest() method" */
      TestResult tr3 = tcd.getTestResultFailed(RENDERREQUESTWRAPPER_HASGETREQUEST);
      {
         String name = "getRequest";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr3.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderRequestWrapper_getRequest */
      /* Details: "Returns wrapped RenderRequest object" */
      TestResult tr4 = tcd.getTestResultFailed(RENDERREQUESTWRAPPER_GETREQUEST);
      /* TODO: implement test */

      /* TestCase: RenderRequestWrapper_hasSetRequest */
      /* Details: "Has a setRequest(RenderRequest) method" */
      TestResult tr5 = tcd.getTestResultFailed(RENDERREQUESTWRAPPER_HASSETREQUEST);
      {
         String name = "setRequest";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {RenderRequest.class};
         tr5.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderRequestWrapper_setRequest */
      /* Details: "Allows wrapped RenderRequest object to be set " */
      TestResult tr6 = tcd.getTestResultFailed(RENDERREQUESTWRAPPER_SETREQUEST);
      /* TODO: implement test */

      /* TestCase: RenderRequestWrapper_hasGetETag */
      /* Details: "Has a getETag() method" */
      TestResult tr7 = tcd.getTestResultFailed(RENDERREQUESTWRAPPER_HASGETETAG);
      {
         String name = "getETag";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr7.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderRequestWrapper_getETag */
      /* Details: "Calls wrapped method" */
      TestResult tr8 = tcd.getTestResultFailed(RENDERREQUESTWRAPPER_GETETAG);
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


   }

}

