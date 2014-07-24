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

package javax.portlet.tck.FilterTests.portlets;

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
public class V2FilterTests_FilterConfig implements Portlet {
   private static final String LOG_CLASS = 
         V2FilterTests_FilterConfig.class.getName();
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
      // ClassChecker cc = new ClassChecker(FilterConfig);

      // Create result objects for the tests

      /* TestCase: FilterConfig_hasGetFilterName */
      /* Details: "Has a getFilterName() method" */
      TestResult tr0 = tcd.getTestResultFailed(FILTERCONFIG_HASGETFILTERNAME);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getFilterName";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr0.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: FilterConfig_getFilterName */
      /* Details: "getFilterName method returns filter name as defined in deployment descriptor" */
      TestResult tr1 = tcd.getTestResultFailed(FILTERCONFIG_GETFILTERNAME);
      /* TODO: implement test */

      /* TestCase: FilterConfig_hasGetPortletContext */
      /* Details: "Has a getPortletContext() method" */
      TestResult tr2 = tcd.getTestResultFailed(FILTERCONFIG_HASGETPORTLETCONTEXT);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getPortletContext";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr2.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: FilterConfig_getPortletContext */
      /* Details: "Returns reference to PortletContext object" */
      TestResult tr3 = tcd.getTestResultFailed(FILTERCONFIG_GETPORTLETCONTEXT);
      /* TODO: implement test */

      /* TestCase: FilterConfig_hasGetInitParameter */
      /* Details: "Has a getInitParameter(java.lang.String) method" */
      TestResult tr4 = tcd.getTestResultFailed(FILTERCONFIG_HASGETINITPARAMETER);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getInitParameter";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = {java.lang.String.class};
      //    tr4.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: FilterConfig_getInitParameter1 */
      /* Details: "Returns null if initialization parameter does not exist" */
      TestResult tr5 = tcd.getTestResultFailed(FILTERCONFIG_GETINITPARAMETER1);
      /* TODO: implement test */

      /* TestCase: FilterConfig_getInitParameter2 */
      /* Details: "Returns value of specified initialization parameter" */
      TestResult tr6 = tcd.getTestResultFailed(FILTERCONFIG_GETINITPARAMETER2);
      /* TODO: implement test */

      /* TestCase: FilterConfig_hasGetInitParameterNames */
      /* Details: "Has a getInitParameterNames() method" */
      TestResult tr7 = tcd.getTestResultFailed(FILTERCONFIG_HASGETINITPARAMETERNAMES);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getInitParameterNames";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr7.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: FilterConfig_getInitParameterNames1 */
      /* Details: "Returns empty Enumeration if no parameters defined" */
      TestResult tr8 = tcd.getTestResultFailed(FILTERCONFIG_GETINITPARAMETERNAMES1);
      /* TODO: implement test */

      /* TestCase: FilterConfig_getInitParameterNames2 */
      /* Details: "Returns an Enumeration of initialization parameters defined in deployment descriptor" */
      TestResult tr9 = tcd.getTestResultFailed(FILTERCONFIG_GETINITPARAMETERNAMES2);
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

