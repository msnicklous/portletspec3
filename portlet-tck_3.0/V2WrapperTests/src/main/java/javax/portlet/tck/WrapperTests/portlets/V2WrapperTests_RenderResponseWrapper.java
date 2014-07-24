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
public class V2WrapperTests_RenderResponseWrapper implements Portlet {
   private static final String LOG_CLASS = 
         V2WrapperTests_RenderResponseWrapper.class.getName();
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
      ClassChecker cc = new ClassChecker(RenderResponseWrapper.class);

      // Create result objects for the tests

      /* TestCase: RenderResponseWrapper_extendsPortletResponseWrapper */
      /* Details: "Extends PortletResponseWrapper" */
      TestResult tr0 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_EXTENDSPORTLETRESPONSEWRAPPER);
      {
         tr0.setTcSuccess(cc.hasSuperclass(PortletResponseWrapper.class));
      }

      /* TestCase: RenderResponseWrapper_implementsRenderResponse */
      /* Details: "Implements RenderResponse" */
      TestResult tr1 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_IMPLEMENTSRENDERRESPONSE);
      {
         tr1.setTcSuccess(cc.implementsInterface(RenderResponse.class));
      }

      /* TestCase: RenderResponseWrapper_constructor */
      /* Details: "Provides constructor RenderResponseWrapper(RenderResponse) with specified wrapped RenderResponse object" */
      TestResult tr2 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_CONSTRUCTOR);
      {
         Class<?>[] parms = {RenderResponse.class};
         tr2.setTcSuccess(cc.hasConstructor(parms));
      }

      /* TestCase: RenderResponseWrapper_hasFlushBuffer */
      /* Details: "Has a flushBuffer() throws java.io.IOException method" */
      TestResult tr3 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASFLUSHBUFFER);
      {
         String name = "flushBuffer";
         Class<?>[] exceptions = {java.io.IOException.class};
         Class<?>[] parms = null;
         tr3.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_flushBuffer */
      /* Details: "Calls wrapped method" */
      TestResult tr4 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_FLUSHBUFFER);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasGetBufferSize */
      /* Details: "Has a getBufferSize() method" */
      TestResult tr5 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASGETBUFFERSIZE);
      {
         String name = "getBufferSize";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr5.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_getBufferSize */
      /* Details: "Calls wrapped method" */
      TestResult tr6 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_GETBUFFERSIZE);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasGetCharacterEncoding */
      /* Details: "Has a getCharacterEncoding() method" */
      TestResult tr7 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASGETCHARACTERENCODING);
      {
         String name = "getCharacterEncoding";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr7.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_getCharacterEncoding */
      /* Details: "Calls wrapped method" */
      TestResult tr8 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_GETCHARACTERENCODING);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasGetContentType */
      /* Details: "Has a getContentType() method" */
      TestResult tr9 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASGETCONTENTTYPE);
      {
         String name = "getContentType";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr9.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_getContentType */
      /* Details: "Calls wrapped method" */
      TestResult tr10 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_GETCONTENTTYPE);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasGetLocale */
      /* Details: "Has a getLocale() method" */
      TestResult tr11 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASGETLOCALE);
      {
         String name = "getLocale";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr11.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_getLocale */
      /* Details: "Calls wrapped method" */
      TestResult tr12 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_GETLOCALE);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasGetPortletOutputStream */
      /* Details: "Has a getPortletOutputStream() throws java.io.IOException method" */
      TestResult tr13 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASGETPORTLETOUTPUTSTREAM);
      {
         String name = "getPortletOutputStream";
         Class<?>[] exceptions = {java.io.IOException.class};
         Class<?>[] parms = null;
         tr13.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_getPortletOutputStream */
      /* Details: "Calls wrapped method" */
      TestResult tr14 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_GETPORTLETOUTPUTSTREAM);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasGetWriter */
      /* Details: "Has a getWriter() throws java.io.IOException method" */
      TestResult tr15 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASGETWRITER);
      {
         String name = "getWriter";
         Class<?>[] exceptions = {java.io.IOException.class};
         Class<?>[] parms = null;
         tr15.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_getWriter */
      /* Details: "Calls wrapped method" */
      TestResult tr16 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_GETWRITER);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasIsCommitted */
      /* Details: "Has a isCommitted() method" */
      TestResult tr17 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASISCOMMITTED);
      {
         String name = "isCommitted";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr17.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_isCommitted */
      /* Details: "Calls wrapped method" */
      TestResult tr18 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_ISCOMMITTED);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasReset */
      /* Details: "Has a reset() method" */
      TestResult tr19 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASRESET);
      {
         String name = "reset";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr19.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_reset */
      /* Details: "Calls wrapped method" */
      TestResult tr20 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_RESET);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasResetBuffer */
      /* Details: "Has a resetBuffer() method" */
      TestResult tr21 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASRESETBUFFER);
      {
         String name = "resetBuffer";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr21.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_resetBuffer */
      /* Details: "Calls wrapped method" */
      TestResult tr22 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_RESETBUFFER);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasSetBufferSize */
      /* Details: "Has a setBufferSize(int) method" */
      TestResult tr23 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASSETBUFFERSIZE);
      {
         String name = "setBufferSize";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {int.class};
         tr23.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_setBufferSize */
      /* Details: "Calls wrapped method" */
      TestResult tr24 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_SETBUFFERSIZE);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasSetContentType */
      /* Details: "Has a setContentType(java.lang.String) method" */
      TestResult tr25 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASSETCONTENTTYPE);
      {
         String name = "setContentType";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class};
         tr25.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_setContentType */
      /* Details: "Calls wrapped method" */
      TestResult tr26 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_SETCONTENTTYPE);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasSetTitle */
      /* Details: "Has a setTitle(java.lang.String) method" */
      TestResult tr27 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASSETTITLE);
      {
         String name = "setTitle";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class};
         tr27.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_setTitle */
      /* Details: "Calls wrapped method" */
      TestResult tr28 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_SETTITLE);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasGetCacheControl */
      /* Details: "Has a getCacheControl() method" */
      TestResult tr29 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASGETCACHECONTROL);
      {
         String name = "getCacheControl";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr29.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_getCacheControl */
      /* Details: "Calls wrapped method" */
      TestResult tr30 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_GETCACHECONTROL);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasSetNextPossiblePortletModes */
      /* Details: "Has a setNextPossiblePortletModes(java.util.Collection<PortletMode>) method" */
      TestResult tr31 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASSETNEXTPOSSIBLEPORTLETMODES);
      {
         String name = "setNextPossiblePortletModes";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.util.Collection.class};
         tr31.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_setNextPossiblePortletModes */
      /* Details: "Calls wrapped method" */
      TestResult tr32 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_SETNEXTPOSSIBLEPORTLETMODES);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasGetResponse */
      /* Details: "Has a getResponse() method" */
      TestResult tr33 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASGETRESPONSE);
      {
         String name = "getResponse";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr33.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_getResponse */
      /* Details: "Calls wrapped method" */
      TestResult tr34 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_GETRESPONSE);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasSetResponse */
      /* Details: "Has a setResponse(RenderResponse) method" */
      TestResult tr35 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASSETRESPONSE);
      {
         String name = "setResponse";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {RenderResponse.class};
         tr35.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_setResponse */
      /* Details: "Calls wrapped method" */
      TestResult tr36 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_SETRESPONSE);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasCreateActionURL */
      /* Details: "Has a createActionURL() throws java.lang.IllegalStateException method" */
      TestResult tr37 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASCREATEACTIONURL);
      {
         String name = "createActionURL";
         Class<?>[] exceptions = {java.lang.IllegalStateException.class};
         Class<?>[] parms = null;
         tr37.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_createActionURL */
      /* Details: "Calls wrapped method" */
      TestResult tr38 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_CREATEACTIONURL);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasCreateRenderURL */
      /* Details: "Has a createRenderURL() throws java.lang.IllegalStateException method" */
      TestResult tr39 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASCREATERENDERURL);
      {
         String name = "createRenderURL";
         Class<?>[] exceptions = {java.lang.IllegalStateException.class};
         Class<?>[] parms = null;
         tr39.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_createRenderURL */
      /* Details: "Calls wrapped method" */
      TestResult tr40 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_CREATERENDERURL);
      /* TODO: implement test */

      /* TestCase: RenderResponseWrapper_hasCreateResourceURL */
      /* Details: "Has a createResourceURL() throws java.lang.IllegalStateException method" */
      TestResult tr41 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASCREATERESOURCEURL);
      {
         String name = "createResourceURL";
         Class<?>[] exceptions = {java.lang.IllegalStateException.class};
         Class<?>[] parms = null;
         tr41.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: RenderResponseWrapper_createResourceURL */
      /* Details: "Calls wrapped method" */
      TestResult tr42 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_CREATERESOURCEURL);
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


   }

}

