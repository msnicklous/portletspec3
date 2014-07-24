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
public class V2PortletTests_WindowState implements Portlet {
   private static final String LOG_CLASS = 
         V2PortletTests_WindowState.class.getName();
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
      ClassChecker cc = new ClassChecker(WindowState.class);

      // Create result objects for the tests

      /* TestCase: WindowState_fieldMAXIMIZED */
      /* Details: "Has String field MAXIMIZED with value of \"MAXIMIZED\" " */
      TestResult tr0 = tcd.getTestResultFailed(WINDOWSTATE_FIELDMAXIMIZED);
      {
         tr0.setTcSuccess(cc.hasField("MAXIMIZED", "MAXIMIZED"));
      }

      /* TestCase: WindowState_fieldMINIMIZED */
      /* Details: "Has String field MINIMIZED with value of \"MINIMIZED\" " */
      TestResult tr1 = tcd.getTestResultFailed(WINDOWSTATE_FIELDMINIMIZED);
      {
         tr1.setTcSuccess(cc.hasField("MINIMIZED", "MINIMIZED"));
      }

      /* TestCase: WindowState_fieldNORMAL */
      /* Details: "Has String field NORMAL with value of \"NORMAL\" " */
      TestResult tr2 = tcd.getTestResultFailed(WINDOWSTATE_FIELDNORMAL);
      {
         tr2.setTcSuccess(cc.hasField("NORMAL", "NORMAL"));
      }

      /* TestCase: WindowState_constructor */
      /* Details: "Has a WindowState(java.lang.String) constructor that creates a new WindowState with the specified name" */
      TestResult tr3 = tcd.getTestResultFailed(WINDOWSTATE_CONSTRUCTOR);
      {
         String name = "WindowState";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class};
         tr3.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: WindowState_hasToString */
      /* Details: "Has a toString() method" */
      TestResult tr4 = tcd.getTestResultFailed(WINDOWSTATE_HASTOSTRING);
      {
         String name = "toString";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr4.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: WindowState_toString */
      /* Details: "Returns a String representation of the portlet mode" */
      TestResult tr5 = tcd.getTestResultFailed(WINDOWSTATE_TOSTRING);
      /* TODO: implement test */

      /* TestCase: WindowState_hasHashCode */
      /* Details: "Has a hashCode() method" */
      TestResult tr6 = tcd.getTestResultFailed(WINDOWSTATE_HASHASHCODE);
      {
         String name = "hashCode";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr6.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: WindowState_hashCode */
      /* Details: "Returns an int containing the has code for the portlet mode" */
      TestResult tr7 = tcd.getTestResultFailed(WINDOWSTATE_HASHCODE);
      /* TODO: implement test */

      /* TestCase: WindowState_hasEquals */
      /* Details: "Has a equals(java.lang.Object) method" */
      TestResult tr8 = tcd.getTestResultFailed(WINDOWSTATE_HASEQUALS);
      {
         String name = "equals";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.Object.class};
         tr8.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: WindowState_equals */
      /* Details: "Returns true if the WindowState equals the specified WindowState" */
      TestResult tr9 = tcd.getTestResultFailed(WINDOWSTATE_EQUALS);
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


   }

}

