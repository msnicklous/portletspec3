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
public class V2PortletTests_Event implements Portlet {
   private static final String LOG_CLASS = 
         V2PortletTests_Event.class.getName();
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
      // TODO: access the class under test and uncomment this code.
      // ClassChecker cc = new ClassChecker(Event);

      // Create result objects for the tests

      /* TestCase: Event_hasGetQName */
      /* Details: "Has a getQName() method" */
      TestResult tr0 = tcd.getTestResultFailed(EVENT_HASGETQNAME);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getQName";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr0.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: Event_getQName1 */
      /* Details: "Returns the javax.xml.namespace.QName object for the Event" */
      TestResult tr1 = tcd.getTestResultFailed(EVENT_GETQNAME1);
      /* TODO: implement test */

      /* TestCase: Event_getQName2 */
      /* Details: "Returned value may not be null" */
      TestResult tr2 = tcd.getTestResultFailed(EVENT_GETQNAME2);
      /* TODO: implement test */

      /* TestCase: Event_hasGetName */
      /* Details: "Has a getName() method" */
      TestResult tr3 = tcd.getTestResultFailed(EVENT_HASGETNAME);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getName";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr3.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: Event_getName1 */
      /* Details: "Returns a String containing the event local name" */
      TestResult tr4 = tcd.getTestResultFailed(EVENT_GETNAME1);
      /* TODO: implement test */

      /* TestCase: Event_getName2 */
      /* Details: "Returned value may not be null" */
      TestResult tr5 = tcd.getTestResultFailed(EVENT_GETNAME2);
      /* TODO: implement test */

      /* TestCase: Event_hasGetValue */
      /* Details: "Has a getValue() method" */
      TestResult tr6 = tcd.getTestResultFailed(EVENT_HASGETVALUE);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getValue";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr6.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: Event_getValue1 */
      /* Details: "Returns a java.io.Serializable object representing the event payload" */
      TestResult tr7 = tcd.getTestResultFailed(EVENT_GETVALUE1);
      /* TODO: implement test */

      /* TestCase: Event_getValue2 */
      /* Details: "Returned value is null if the event has no payload" */
      TestResult tr8 = tcd.getTestResultFailed(EVENT_GETVALUE2);
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

