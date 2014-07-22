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
public class V2WrapperTests_EventResponseWrapper implements Portlet {
   private static final String LOG_CLASS = 
         V2WrapperTests_EventResponseWrapper.class.getName();
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

      /* TestCase: EventResponseWrapper_extendsPortletResponseWrapper */
      /* Details: "Extends PortletResponseWrapper" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_EXTENDSPORTLETRESPONSEWRAPPER);
      
      /* TestCase: EventResponseWrapper_implementsEventResponse */
      /* Details: "Implements EventResponse" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_IMPLEMENTSEVENTRESPONSE);
      
      /* TestCase: EventResponseWrapper_constructor */
      /* Details: "Constructs EventResponseWrapper with specified wrapped EventResponse object" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_CONSTRUCTOR);
      
      /* TestCase: EventResponseWrapper_hasSetEventA */
      /* Details: "Has a setEvent(javax.xml.namespace.QName, java.io.Serializable) method" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETEVENTA);
      
      /* TestCase: EventResponseWrapper_setEventA */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETEVENTA);
      
      /* TestCase: EventResponseWrapper_hasSetEventB */
      /* Details: "Has a setEvent(java.lang.String name, java.io.Serializable) method" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETEVENTB);
      
      /* TestCase: EventResponseWrapper_setEventB */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETEVENTB);
      
      /* TestCase: EventResponseWrapper_hasSetPortletMode */
      /* Details: "Has a setPortletMode(PortletMode) method" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETPORTLETMODE);
      
      /* TestCase: EventResponseWrapper_setPortletMode */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETPORTLETMODE);
      
      /* TestCase: EventResponseWrapper_hasSetRenderParameterA */
      /* Details: "Has a setRenderParameter(java.lang.String, java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETRENDERPARAMETERA);
      
      /* TestCase: EventResponseWrapper_setRenderParameterA */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETRENDERPARAMETERA);
      
      /* TestCase: EventResponseWrapper_hasSetRenderParameterB */
      /* Details: "Has a setRenderParameter(java.lang.String, java.lang.String[]) method" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETRENDERPARAMETERB);
      
      /* TestCase: EventResponseWrapper_setRenderParameterB */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETRENDERPARAMETERB);
      
      /* TestCase: EventResponseWrapper_hasSetRenderParametersA */
      /* Details: "Has a setRenderParameters(java.util.Map<java.lang.String,java.lang.String[]>) method" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETRENDERPARAMETERSA);
      
      /* TestCase: EventResponseWrapper_setRenderParametersA */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETRENDERPARAMETERSA);
      
      /* TestCase: EventResponseWrapper_hasSetRenderParametersB */
      /* Details: "Has a setRenderParameters(EventRequest) method" */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETRENDERPARAMETERSB);
      
      /* TestCase: EventResponseWrapper_setRenderParametersB */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETRENDERPARAMETERSB);
      
      /* TestCase: EventResponseWrapper_hasSetWindowState */
      /* Details: "Has a setWindowState(WindowState) method" */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETWINDOWSTATE);
      
      /* TestCase: EventResponseWrapper_setWindowState */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETWINDOWSTATE);
      
      /* TestCase: EventResponseWrapper_hasGetResponse */
      /* Details: "Has a getResponse() method" */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASGETRESPONSE);
      
      /* TestCase: EventResponseWrapper_getResponse */
      /* Details: "Returns wrapped EventResponse obect" */
      /* TODO: implement test */
      TestResult tr20 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_GETRESPONSE);
      
      /* TestCase: EventResponseWrapper_hasSetResponse */
      /* Details: "Has a setResponse(EventResponse) method" */
      /* TODO: implement test */
      TestResult tr21 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETRESPONSE);
      
      /* TestCase: EventResponseWrapper_setResponse */
      /* Details: "Allows wrapped EventResponse object to be set" */
      /* TODO: implement test */
      TestResult tr22 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETRESPONSE);
      
      /* TestCase: EventResponseWrapper_hasGetPortletMode */
      /* Details: "Has a getPortletMode() method" */
      /* TODO: implement test */
      TestResult tr23 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASGETPORTLETMODE);
      
      /* TestCase: EventResponseWrapper_getPortletMode */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr24 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_GETPORTLETMODE);
      
      /* TestCase: EventResponseWrapper_hasGetRenderParameterMap */
      /* Details: "Has a getRenderParameterMap() method" */
      /* TODO: implement test */
      TestResult tr25 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASGETRENDERPARAMETERMAP);
      
      /* TestCase: EventResponseWrapper_getRenderParameterMap1 */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr26 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_GETRENDERPARAMETERMAP1);
      
      /* TestCase: EventResponseWrapper_getRenderParameterMap2 */
      /* Details: "Returns java.util.Map<java.lang.String,java.lang.String[]> object" */
      /* TODO: implement test */
      TestResult tr27 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_GETRENDERPARAMETERMAP2);
      
      /* TestCase: EventResponseWrapper_hasGetWindowState */
      /* Details: "Has a getWindowState() method" */
      /* TODO: implement test */
      TestResult tr28 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASGETWINDOWSTATE);
      
      /* TestCase: EventResponseWrapper_getWindowState */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr29 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_GETWINDOWSTATE);
      
      /* TestCase: EventResponseWrapper_hasRemovePublicRenderParameter */
      /* Details: "Has a removePublicRenderParameter(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr30 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASREMOVEPUBLICRENDERPARAMETER);
      
      /* TestCase: EventResponseWrapper_removePublicRenderParameter */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr31 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_REMOVEPUBLICRENDERPARAMETER);
      


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


   }

}

