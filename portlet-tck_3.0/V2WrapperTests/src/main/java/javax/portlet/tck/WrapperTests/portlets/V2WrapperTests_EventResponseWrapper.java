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
public class V2WrapperTests_EventResponseWrapper implements Portlet {
   private static final String LOG_CLASS = 
         V2WrapperTests_EventResponseWrapper.class.getName();
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
      ClassChecker cc = new ClassChecker(EventResponseWrapper.class);

      // Create result objects for the tests

      /* TestCase: EventResponseWrapper_extendsPortletResponseWrapper */
      /* Details: "Extends PortletResponseWrapper" */
      TestResult tr0 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_EXTENDSPORTLETRESPONSEWRAPPER);
      {
         tr0.setTcSuccess(cc.hasSuperclass(PortletResponseWrapper.class));
      }

      /* TestCase: EventResponseWrapper_implementsEventResponse */
      /* Details: "Implements EventResponse" */
      TestResult tr1 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_IMPLEMENTSEVENTRESPONSE);
      {
         tr1.setTcSuccess(cc.implementsInterface(EventResponse.class));
      }

      /* TestCase: EventResponseWrapper_constructor */
      /* Details: "Provides constructor EventResponseWrapper(EventResponse) with specified wrapped EventResponse object" */
      TestResult tr2 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_CONSTRUCTOR);
      {
         Class<?>[] parms = {EventResponse.class};
         tr2.setTcSuccess(cc.hasConstructor(parms));
      }

      /* TestCase: EventResponseWrapper_hasSetEventA */
      /* Details: "Has a setEvent(javax.xml.namespace.QName, java.io.Serializable) method" */
      TestResult tr3 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETEVENTA);
      {
         String name = "setEvent";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {javax.xml.namespace.QName.class, java.io.Serializable.class};
         tr3.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: EventResponseWrapper_setEventA */
      /* Details: "Calls wrapped method" */
      TestResult tr4 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETEVENTA);
      /* TODO: implement test */

      /* TestCase: EventResponseWrapper_hasSetEventB */
      /* Details: "Has a setEvent(java.lang.String name, java.io.Serializable) method" */
      TestResult tr5 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETEVENTB);
      {
         String name = "setEvent";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class, java.io.Serializable.class};
         tr5.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: EventResponseWrapper_setEventB */
      /* Details: "Calls wrapped method" */
      TestResult tr6 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETEVENTB);
      /* TODO: implement test */

      /* TestCase: EventResponseWrapper_hasSetPortletMode */
      /* Details: "Has a setPortletMode(PortletMode) throws javax.portlet.PortletModeException method" */
      TestResult tr7 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETPORTLETMODE);
      {
         String name = "setPortletMode";
         Class<?>[] exceptions = {javax.portlet.PortletModeException.class};
         Class<?>[] parms = {PortletMode.class};
         tr7.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: EventResponseWrapper_setPortletMode */
      /* Details: "Calls wrapped method" */
      TestResult tr8 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETPORTLETMODE);
      /* TODO: implement test */

      /* TestCase: EventResponseWrapper_hasSetRenderParameterA */
      /* Details: "Has a setRenderParameter(java.lang.String, java.lang.String) method" */
      TestResult tr9 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETRENDERPARAMETERA);
      {
         String name = "setRenderParameter";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class, java.lang.String.class};
         tr9.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: EventResponseWrapper_setRenderParameterA */
      /* Details: "Calls wrapped method" */
      TestResult tr10 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETRENDERPARAMETERA);
      /* TODO: implement test */

      /* TestCase: EventResponseWrapper_hasSetRenderParameterB */
      /* Details: "Has a setRenderParameter(java.lang.String, java.lang.String[]) method" */
      TestResult tr11 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETRENDERPARAMETERB);
      {
         String name = "setRenderParameter";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class, java.lang.String[].class};
         tr11.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: EventResponseWrapper_setRenderParameterB */
      /* Details: "Calls wrapped method" */
      TestResult tr12 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETRENDERPARAMETERB);
      /* TODO: implement test */

      /* TestCase: EventResponseWrapper_hasSetRenderParametersA */
      /* Details: "Has a setRenderParameters(java.util.Map<java.lang.String,java.lang.String[]>) method" */
      TestResult tr13 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETRENDERPARAMETERSA);
      {
         String name = "setRenderParameters";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.util.Map.class};
         tr13.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: EventResponseWrapper_setRenderParametersA */
      /* Details: "Calls wrapped method" */
      TestResult tr14 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETRENDERPARAMETERSA);
      /* TODO: implement test */

      /* TestCase: EventResponseWrapper_hasSetRenderParametersB */
      /* Details: "Has a setRenderParameters(EventRequest) method" */
      TestResult tr15 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETRENDERPARAMETERSB);
      {
         String name = "setRenderParameters";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {EventRequest.class};
         tr15.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: EventResponseWrapper_setRenderParametersB */
      /* Details: "Calls wrapped method" */
      TestResult tr16 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETRENDERPARAMETERSB);
      /* TODO: implement test */

      /* TestCase: EventResponseWrapper_hasSetWindowState */
      /* Details: "Has a setWindowState(WindowState) throws javax.portlet.WindowStateException method" */
      TestResult tr17 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETWINDOWSTATE);
      {
         String name = "setWindowState";
         Class<?>[] exceptions = {javax.portlet.WindowStateException.class};
         Class<?>[] parms = {WindowState.class};
         tr17.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: EventResponseWrapper_setWindowState */
      /* Details: "Calls wrapped method" */
      TestResult tr18 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETWINDOWSTATE);
      /* TODO: implement test */

      /* TestCase: EventResponseWrapper_hasGetResponse */
      /* Details: "Has a getResponse() method" */
      TestResult tr19 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASGETRESPONSE);
      {
         String name = "getResponse";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr19.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: EventResponseWrapper_getResponse */
      /* Details: "Returns wrapped EventResponse obect" */
      TestResult tr20 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_GETRESPONSE);
      /* TODO: implement test */

      /* TestCase: EventResponseWrapper_hasSetResponse */
      /* Details: "Has a setResponse(EventResponse) method" */
      TestResult tr21 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASSETRESPONSE);
      {
         String name = "setResponse";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {EventResponse.class};
         tr21.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: EventResponseWrapper_setResponse */
      /* Details: "Allows wrapped EventResponse object to be set" */
      TestResult tr22 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_SETRESPONSE);
      /* TODO: implement test */

      /* TestCase: EventResponseWrapper_hasGetPortletMode */
      /* Details: "Has a getPortletMode() method" */
      TestResult tr23 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASGETPORTLETMODE);
      {
         String name = "getPortletMode";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr23.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: EventResponseWrapper_getPortletMode */
      /* Details: "Calls wrapped method" */
      TestResult tr24 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_GETPORTLETMODE);
      /* TODO: implement test */

      /* TestCase: EventResponseWrapper_hasGetRenderParameterMap */
      /* Details: "Has a getRenderParameterMap() method" */
      TestResult tr25 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASGETRENDERPARAMETERMAP);
      {
         String name = "getRenderParameterMap";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr25.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: EventResponseWrapper_getRenderParameterMap1 */
      /* Details: "Calls wrapped method" */
      TestResult tr26 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_GETRENDERPARAMETERMAP1);
      /* TODO: implement test */

      /* TestCase: EventResponseWrapper_getRenderParameterMap2 */
      /* Details: "Returns java.util.Map<java.lang.String,java.lang.String[]> object" */
      TestResult tr27 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_GETRENDERPARAMETERMAP2);
      /* TODO: implement test */

      /* TestCase: EventResponseWrapper_hasGetWindowState */
      /* Details: "Has a getWindowState() method" */
      TestResult tr28 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASGETWINDOWSTATE);
      {
         String name = "getWindowState";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr28.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: EventResponseWrapper_getWindowState */
      /* Details: "Calls wrapped method" */
      TestResult tr29 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_GETWINDOWSTATE);
      /* TODO: implement test */

      /* TestCase: EventResponseWrapper_hasRemovePublicRenderParameter */
      /* Details: "Has a removePublicRenderParameter(java.lang.String) method" */
      TestResult tr30 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_HASREMOVEPUBLICRENDERPARAMETER);
      {
         String name = "removePublicRenderParameter";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class};
         tr30.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: EventResponseWrapper_removePublicRenderParameter */
      /* Details: "Calls wrapped method" */
      TestResult tr31 = tcd.getTestResultFailed(EVENTRESPONSEWRAPPER_REMOVEPUBLICRENDERPARAMETER);
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

