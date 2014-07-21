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

package javax.portlet.tck.URLTests.portlets;

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
public class V2CompatApiURLTests1 implements Portlet {
   private static final String LOG_CLASS = 
         V2CompatApiURLTests1.class.getName();
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

      /* TestCase: BaseURL_hasSetParameterA */
      /* Details: "Has a setParameter(java.lang.String, java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(BASEURL_HASSETPARAMETERA);
      
      /* TestCase: BaseURL_setParameterA1 */
      /* Details: "Sets the parameter value for the specified name" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(BASEURL_SETPARAMETERA1);
      
      /* TestCase: BaseURL_setParameterA2 */
      /* Details: "For a render URL, a private parameter can be set" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(BASEURL_SETPARAMETERA2);
      
      /* TestCase: BaseURL_setParameterA3 */
      /* Details: "For a render URL, a public parameter can be set" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(BASEURL_SETPARAMETERA3);
      
      /* TestCase: BaseURL_setParameterA4 */
      /* Details: "For an action URL, an action parameter can be set" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(BASEURL_SETPARAMETERA4);
      
      /* TestCase: BaseURL_setParameterA5 */
      /* Details: "For a resource URL, a resource parameter can be set" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(BASEURL_SETPARAMETERA5);
      
      /* TestCase: BaseURL_setParameterA6 */
      /* Details: "All previously existing values for the specified key are removed" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(BASEURL_SETPARAMETERA6);
      
      /* TestCase: BaseURL_setParameterA7 */
      /* Details: "If the value is null, all values for the specified key are removed" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(BASEURL_SETPARAMETERA7);
      
      /* TestCase: BaseURL_setParameterA8 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(BASEURL_SETPARAMETERA8);
      
      /* TestCase: BaseURL_hasSetParameterB */
      /* Details: "Has a setParameter(java.lang.String, java.lang.String[]) method" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(BASEURL_HASSETPARAMETERB);
      
      /* TestCase: BaseURL_setParameterB1 */
      /* Details: "Sets the parameter value array for the specified name" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(BASEURL_SETPARAMETERB1);
      
      /* TestCase: BaseURL_setParameterB2 */
      /* Details: "For a render URL, a private parameter can be set" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(BASEURL_SETPARAMETERB2);
      
      /* TestCase: BaseURL_setParameterB3 */
      /* Details: "For a render URL, a public parameter can be set" */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(BASEURL_SETPARAMETERB3);
      
      /* TestCase: BaseURL_setParameterB4 */
      /* Details: "For an action URL, an action parameter can be set" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(BASEURL_SETPARAMETERB4);
      
      /* TestCase: BaseURL_setParameterB5 */
      /* Details: "For a resource URL, a resource parameter can be set" */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(BASEURL_SETPARAMETERB5);
      
      /* TestCase: BaseURL_setParameterB6 */
      /* Details: "All previously existing values for the specified key are removed" */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(BASEURL_SETPARAMETERB6);
      
      /* TestCase: BaseURL_setParameterB7 */
      /* Details: "If the value is null, all values for the specified key are removed" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(BASEURL_SETPARAMETERB7);
      
      /* TestCase: BaseURL_setParameterB8 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(BASEURL_SETPARAMETERB8);
      
      /* TestCase: BaseURL_hasSetParameters */
      /* Details: "Has a setParameters(java.util.Map<java.lang.String,java.lang.String[]>) method" */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(BASEURL_HASSETPARAMETERS);
      
      /* TestCase: BaseURL_setParameters1 */
      /* Details: "Sets the parameter map to the specified value" */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(BASEURL_SETPARAMETERS1);
      
      /* TestCase: BaseURL_setParameters2 */
      /* Details: "For a render URL, public parameters can be set through the map" */
      /* TODO: implement test */
      TestResult tr20 = tcd.getTestResultFailed(BASEURL_SETPARAMETERS2);
      
      /* TestCase: BaseURL_setParameters3 */
      /* Details: "For a render URL, private parameters can be set through the map" */
      /* TODO: implement test */
      TestResult tr21 = tcd.getTestResultFailed(BASEURL_SETPARAMETERS3);
      
      /* TestCase: BaseURL_setParameters4 */
      /* Details: "For an action URL, action parameters can be set through the map" */
      /* TODO: implement test */
      TestResult tr22 = tcd.getTestResultFailed(BASEURL_SETPARAMETERS4);
      
      /* TestCase: BaseURL_setParameters5 */
      /* Details: "For a resource URL, resource parameters can be set through the map" */
      /* TODO: implement test */
      TestResult tr23 = tcd.getTestResultFailed(BASEURL_SETPARAMETERS5);
      
      /* TestCase: BaseURL_setParameters6 */
      /* Details: "Previously existing private, action, or resource parameters not contained in the specified input map are removed" */
      /* TODO: implement test */
      TestResult tr24 = tcd.getTestResultFailed(BASEURL_SETPARAMETERS6);
      
      /* TestCase: BaseURL_setParameters7 */
      /* Details: "Previously existing public parameters not contained in the specified input map remain unchanged" */
      /* TODO: implement test */
      TestResult tr25 = tcd.getTestResultFailed(BASEURL_SETPARAMETERS7);
      
      /* TestCase: BaseURL_setParameters8 */
      /* Details: "Parameters that are set are available in requests initiated through the URL" */
      /* TODO: implement test */
      TestResult tr26 = tcd.getTestResultFailed(BASEURL_SETPARAMETERS8);
      
      /* TestCase: BaseURL_setParameters9 */
      /* Details: "Throws IllegalArgumentException if the input map is null" */
      /* TODO: implement test */
      TestResult tr27 = tcd.getTestResultFailed(BASEURL_SETPARAMETERS9);
      
      /* TestCase: BaseURL_setParameters10 */
      /* Details: "Throws IllegalArgumentException if any key in the map is null" */
      /* TODO: implement test */
      TestResult tr28 = tcd.getTestResultFailed(BASEURL_SETPARAMETERS10);
      
      /* TestCase: BaseURL_setParameters11 */
      /* Details: "Throws IllegalArgumentException if any key in the map is the empty string ("") " */
      /* TODO: implement test */
      TestResult tr29 = tcd.getTestResultFailed(BASEURL_SETPARAMETERS11);
      
      /* TestCase: BaseURL_setParameters12 */
      /* Details: "Throws IllegalArgumentException if the values array for any key is null " */
      /* TODO: implement test */
      TestResult tr30 = tcd.getTestResultFailed(BASEURL_SETPARAMETERS12);
      
      /* TestCase: BaseURL_setParameters13 */
      /* Details: "Throws IllegalArgumentException if any element in any values array is null " */
      /* TODO: implement test */
      TestResult tr31 = tcd.getTestResultFailed(BASEURL_SETPARAMETERS13);
      
      /* TestCase: BaseURL_setParameters14 */
      /* Details: "Throws IllegalStateException if the method is invoked after the sendRedirect method has been called" */
      /* TODO: implement test */
      TestResult tr32 = tcd.getTestResultFailed(BASEURL_SETPARAMETERS14);
      
      /* TestCase: BaseURL_hasSetSecure */
      /* Details: "Has a setSecure(boolean) method" */
      /* TODO: implement test */
      TestResult tr33 = tcd.getTestResultFailed(BASEURL_HASSETSECURE);
      
      /* TestCase: BaseURL_setSecure1 */
      /* Details: "Returns void" */
      /* TODO: implement test */
      TestResult tr34 = tcd.getTestResultFailed(BASEURL_SETSECURE1);
      
      /* TestCase: BaseURL_setSecure2 */
      /* Details: "If the input parameter is true, the resulting URL uses a secure connection (HTTPS)" */
      /* TODO: implement test */
      TestResult tr35 = tcd.getTestResultFailed(BASEURL_SETSECURE2);
      
      /* TestCase: BaseURL_setSecure3 */
      /* Details: "If the input parameter is false, the resulting URL can use either a secure or non-secure connection" */
      /* TODO: implement test */
      TestResult tr36 = tcd.getTestResultFailed(BASEURL_SETSECURE3);
      
      /* TestCase: BaseURL_setSecure4 */
      /* Details: "Throws a PortletSecurityException if the run-time environment does not support the setting" */
      /* TODO: implement test */
      TestResult tr37 = tcd.getTestResultFailed(BASEURL_SETSECURE4);
      
      /* TestCase: BaseURL_hasToString */
      /* Details: "Has a toString() method" */
      /* TODO: implement test */
      TestResult tr38 = tcd.getTestResultFailed(BASEURL_HASTOSTRING);
      
      /* TestCase: BaseURL_toString */
      /* Details: "Returns a String containing the portlet URL representation to be included in the markup" */
      /* TODO: implement test */
      TestResult tr39 = tcd.getTestResultFailed(BASEURL_TOSTRING);
      
      /* TestCase: BaseURL_hasGetParameterMap */
      /* Details: "Has a getParameterMap() method" */
      /* TODO: implement test */
      TestResult tr40 = tcd.getTestResultFailed(BASEURL_HASGETPARAMETERMAP);
      
      /* TestCase: BaseURL_getParameterMap1 */
      /* Details: "Returns an java.util.Map<java.lang.String,java.lang.String[]> object for the parameter names and values if parameters are available" */
      /* TODO: implement test */
      TestResult tr41 = tcd.getTestResultFailed(BASEURL_GETPARAMETERMAP1);
      
      /* TestCase: BaseURL_getParameterMap2 */
      /* Details: "For a render URL, the returned map contains all public and private parameters for the request" */
      /* TODO: implement test */
      TestResult tr42 = tcd.getTestResultFailed(BASEURL_GETPARAMETERMAP2);
      
      /* TestCase: BaseURL_getParameterMap3 */
      /* Details: "For an action URL, the returned map contains all action parameters for the request" */
      /* TODO: implement test */
      TestResult tr43 = tcd.getTestResultFailed(BASEURL_GETPARAMETERMAP3);
      
      /* TestCase: BaseURL_getParameterMap4 */
      /* Details: "For a resource URL, the returned map contains all resource parameters for the request" */
      /* TODO: implement test */
      TestResult tr44 = tcd.getTestResultFailed(BASEURL_GETPARAMETERMAP4);
      
      /* TestCase: BaseURL_getParameterMap5 */
      /* Details: "For a resource URL, the returned map does not contain any render parameters for the request" */
      /* TODO: implement test */
      TestResult tr45 = tcd.getTestResultFailed(BASEURL_GETPARAMETERMAP5);
      
      /* TestCase: BaseURL_getParameterMap6 */
      /* Details: "Returns an empty map if no parameters exist" */
      /* TODO: implement test */
      TestResult tr46 = tcd.getTestResultFailed(BASEURL_GETPARAMETERMAP6);
      
      /* TestCase: BaseURL_hasWriteA */
      /* Details: "Has a write(java.io.Writer) method" */
      /* TODO: implement test */
      TestResult tr47 = tcd.getTestResultFailed(BASEURL_HASWRITEA);
      
      /* TestCase: BaseURL_writeA1 */
      /* Details: "Writes the URL to the output stream through the provided Writer" */
      /* TODO: implement test */
      TestResult tr48 = tcd.getTestResultFailed(BASEURL_WRITEA1);
      
      /* TestCase: BaseURL_writeA2 */
      /* Details: "The written URL is XML escaped (although it may be a token rather than a valid URL)" */
      /* TODO: implement test */
      TestResult tr49 = tcd.getTestResultFailed(BASEURL_WRITEA2);
      
      /* TestCase: BaseURL_writeA3 */
      /* Details: "Throws IOException if an error occurs during IO " */
      /* TODO: implement test */
      TestResult tr50 = tcd.getTestResultFailed(BASEURL_WRITEA3);
      
      /* TestCase: BaseURL_hasWriteB */
      /* Details: "Has a write(java.io.Writer, boolean) method" */
      /* TODO: implement test */
      TestResult tr51 = tcd.getTestResultFailed(BASEURL_HASWRITEB);
      
      /* TestCase: BaseURL_writeB1 */
      /* Details: "Writes the URL to the output stream through the provided Writer" */
      /* TODO: implement test */
      TestResult tr52 = tcd.getTestResultFailed(BASEURL_WRITEB1);
      
      /* TestCase: BaseURL_writeB2 */
      /* Details: "If the escapeXML parameter is true, the written URL is XML escaped (although it may be a token rather than a valid URL)" */
      /* TODO: implement test */
      TestResult tr53 = tcd.getTestResultFailed(BASEURL_WRITEB2);
      
      /* TestCase: BaseURL_writeB3 */
      /* Details: "If the escapeXML parameter is false, no excaping is performed" */
      /* TODO: implement test */
      TestResult tr54 = tcd.getTestResultFailed(BASEURL_WRITEB3);
      
      /* TestCase: BaseURL_writeB4 */
      /* Details: "Throws IOException if an error occurs during IO " */
      /* TODO: implement test */
      TestResult tr55 = tcd.getTestResultFailed(BASEURL_WRITEB4);
      
      /* TestCase: BaseURL_hasAddProperty */
      /* Details: "Has a addProperty(java.lang.String, java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr56 = tcd.getTestResultFailed(BASEURL_HASADDPROPERTY);
      
      /* TestCase: BaseURL_addProperty1 */
      /* Details: "Adds a property value to an existing key" */
      /* TODO: implement test */
      TestResult tr57 = tcd.getTestResultFailed(BASEURL_ADDPROPERTY1);
      
      /* TestCase: BaseURL_addProperty2 */
      /* Details: "Existing property values for the key are retained" */
      /* TODO: implement test */
      TestResult tr58 = tcd.getTestResultFailed(BASEURL_ADDPROPERTY2);
      
      /* TestCase: BaseURL_addProperty3 */
      /* Details: "Throws IllegalArgumentException if the specified key is null" */
      /* TODO: implement test */
      TestResult tr59 = tcd.getTestResultFailed(BASEURL_ADDPROPERTY3);
      
      /* TestCase: BaseURL_hasSetProperty */
      /* Details: "Has a setProperty() method" */
      /* TODO: implement test */
      TestResult tr60 = tcd.getTestResultFailed(BASEURL_HASSETPROPERTY);
      
      /* TestCase: BaseURL_setProperty1 */
      /* Details: "Sets a property value for the specified key" */
      /* TODO: implement test */
      TestResult tr61 = tcd.getTestResultFailed(BASEURL_SETPROPERTY1);
      
      /* TestCase: BaseURL_setProperty2 */
      /* Details: "Resets any existing property values for the specified key" */
      /* TODO: implement test */
      TestResult tr62 = tcd.getTestResultFailed(BASEURL_SETPROPERTY2);
      
      /* TestCase: BaseURL_setProperty3 */
      /* Details: "Throws IllegalArgumentException if the specified key is null" */
      /* TODO: implement test */
      TestResult tr63 = tcd.getTestResultFailed(BASEURL_SETPROPERTY3);
      


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
      tr28.writeTo(writer);
      tr29.writeTo(writer);
      tr30.writeTo(writer);
      tr31.writeTo(writer);
      tr32.writeTo(writer);
      tr33.writeTo(writer);
      tr34.writeTo(writer);
      tr35.writeTo(writer);
      tr36.writeTo(writer);
      tr37.writeTo(writer);
      tr38.writeTo(writer);
      tr39.writeTo(writer);
      tr40.writeTo(writer);
      tr41.writeTo(writer);
      tr42.writeTo(writer);
      tr43.writeTo(writer);
      tr44.writeTo(writer);
      tr45.writeTo(writer);
      tr46.writeTo(writer);
      tr47.writeTo(writer);
      tr48.writeTo(writer);
      tr49.writeTo(writer);
      tr50.writeTo(writer);
      tr51.writeTo(writer);
      tr52.writeTo(writer);
      tr53.writeTo(writer);
      tr54.writeTo(writer);
      tr55.writeTo(writer);
      tr56.writeTo(writer);
      tr57.writeTo(writer);
      tr58.writeTo(writer);
      tr59.writeTo(writer);
      tr60.writeTo(writer);
      tr61.writeTo(writer);
      tr62.writeTo(writer);
      tr63.writeTo(writer);


   }

}

