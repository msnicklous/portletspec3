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

package javax.portlet.tck.ExceptionTests.portlets;

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
public class V2ExceptionTests_ValidatorException implements Portlet {
   private static final String LOG_CLASS = 
         V2ExceptionTests_ValidatorException.class.getName();
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

      /* TestCase: ValidatorException_extendsPortletException */
      /* Details: "ValidatorException extends PortletException" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(VALIDATOREXCEPTION_EXTENDSPORTLETEXCEPTION);
      
      /* TestCase: ValidatorException_constructor1 */
      /* Details: "Provides constructor ValidatorException(java.lang.String, java.util.Collection<java.lang.String>)" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(VALIDATOREXCEPTION_CONSTRUCTOR1);
      
      /* TestCase: ValidatorException_constructor2 */
      /* Details: "For ValidatorException(java.lang.String, java.util.Collection<java.lang.String>), the failedKeys parameter may be null" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(VALIDATOREXCEPTION_CONSTRUCTOR2);
      
      /* TestCase: ValidatorException_constructor3 */
      /* Details: "Provides constructor ValidatorException(java.lang.String, java.lang.Throwable, java.util.Collection<java.lang.String>)" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(VALIDATOREXCEPTION_CONSTRUCTOR3);
      
      /* TestCase: ValidatorException_constructor4 */
      /* Details: "For ValidatorException(java.lang.String, java.lang.Throwable, java.util.Collection<java.lang.String>), the failedKeys parameter may be null" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(VALIDATOREXCEPTION_CONSTRUCTOR4);
      
      /* TestCase: ValidatorException_constructor5 */
      /* Details: "Provides constructor ValidatorException(java.lang.Throwable, java.util.Collection<java.lang.String>)" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(VALIDATOREXCEPTION_CONSTRUCTOR5);
      
      /* TestCase: ValidatorException_constructor6 */
      /* Details: "For ValidatorException(java.lang.Throwable, java.util.Collection<java.lang.String>), the failedKeys parameter may be null" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(VALIDATOREXCEPTION_CONSTRUCTOR6);
      
      /* TestCase: ValidatorException_hasGetFailedKeys */
      /* Details: "Has a getFailedKeys() method" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(VALIDATOREXCEPTION_HASGETFAILEDKEYS);
      
      /* TestCase: ValidatorException_getFailedKeys1 */
      /* Details: "Returns a java.util.Enumeration<java.lang.String> object containing the preference keys that failed validation" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(VALIDATOREXCEPTION_GETFAILEDKEYS1);
      
      /* TestCase: ValidatorException_getFailedKeys2 */
      /* Details: "Returns an empty enmueration if no failed keys are available" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(VALIDATOREXCEPTION_GETFAILEDKEYS2);
      


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

