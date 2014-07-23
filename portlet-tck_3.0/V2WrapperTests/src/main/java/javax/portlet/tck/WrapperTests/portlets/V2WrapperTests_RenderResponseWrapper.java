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
public class V2WrapperTests_RenderResponseWrapper implements Portlet {
   private static final String LOG_CLASS = 
         V2WrapperTests_RenderResponseWrapper.class.getName();
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

      /* TestCase: RenderResponseWrapper_extendsPortletResponseWrapper */
      /* Details: "Extends PortletResponseWrapper" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_EXTENDSPORTLETRESPONSEWRAPPER);
      
      /* TestCase: RenderResponseWrapper_implementsRenderResponse */
      /* Details: "Implements RenderResponse" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_IMPLEMENTSRENDERRESPONSE);
      
      /* TestCase: RenderResponseWrapper_constructor */
      /* Details: "Constructs RenderResponseWrapper with specified wrapped RenderResponse object" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_CONSTRUCTOR);
      
      /* TestCase: RenderResponseWrapper_hasFlushBuffer */
      /* Details: "Has a flushBuffer() throws java.io.IOException method" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASFLUSHBUFFER);
      
      /* TestCase: RenderResponseWrapper_flushBuffer */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_FLUSHBUFFER);
      
      /* TestCase: RenderResponseWrapper_hasGetBufferSize */
      /* Details: "Has a getBufferSize() method" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASGETBUFFERSIZE);
      
      /* TestCase: RenderResponseWrapper_getBufferSize */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_GETBUFFERSIZE);
      
      /* TestCase: RenderResponseWrapper_hasGetCharacterEncoding */
      /* Details: "Has a getCharacterEncoding() method" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASGETCHARACTERENCODING);
      
      /* TestCase: RenderResponseWrapper_getCharacterEncoding */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_GETCHARACTERENCODING);
      
      /* TestCase: RenderResponseWrapper_hasGetContentType */
      /* Details: "Has a getContentType() method" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASGETCONTENTTYPE);
      
      /* TestCase: RenderResponseWrapper_getContentType */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_GETCONTENTTYPE);
      
      /* TestCase: RenderResponseWrapper_hasGetLocale */
      /* Details: "Has a getLocale() method" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASGETLOCALE);
      
      /* TestCase: RenderResponseWrapper_getLocale */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_GETLOCALE);
      
      /* TestCase: RenderResponseWrapper_hasGetPortletOutputStream */
      /* Details: "Has a getPortletOutputStream() throws java.io.IOException method" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASGETPORTLETOUTPUTSTREAM);
      
      /* TestCase: RenderResponseWrapper_getPortletOutputStream */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_GETPORTLETOUTPUTSTREAM);
      
      /* TestCase: RenderResponseWrapper_hasGetWriter */
      /* Details: "Has a getWriter() throws java.io.IOException method" */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASGETWRITER);
      
      /* TestCase: RenderResponseWrapper_getWriter */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_GETWRITER);
      
      /* TestCase: RenderResponseWrapper_hasIsCommitted */
      /* Details: "Has a isCommitted() method" */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASISCOMMITTED);
      
      /* TestCase: RenderResponseWrapper_isCommitted */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_ISCOMMITTED);
      
      /* TestCase: RenderResponseWrapper_hasReset */
      /* Details: "Has a reset() method" */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASRESET);
      
      /* TestCase: RenderResponseWrapper_reset */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr20 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_RESET);
      
      /* TestCase: RenderResponseWrapper_hasResetBuffer */
      /* Details: "Has a resetBuffer() method" */
      /* TODO: implement test */
      TestResult tr21 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASRESETBUFFER);
      
      /* TestCase: RenderResponseWrapper_resetBuffer */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr22 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_RESETBUFFER);
      
      /* TestCase: RenderResponseWrapper_hasSetBufferSize */
      /* Details: "Has a setBufferSize(int) method" */
      /* TODO: implement test */
      TestResult tr23 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASSETBUFFERSIZE);
      
      /* TestCase: RenderResponseWrapper_setBufferSize */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr24 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_SETBUFFERSIZE);
      
      /* TestCase: RenderResponseWrapper_hasSetContentType */
      /* Details: "Has a setContentType(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr25 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASSETCONTENTTYPE);
      
      /* TestCase: RenderResponseWrapper_setContentType */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr26 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_SETCONTENTTYPE);
      
      /* TestCase: RenderResponseWrapper_hasSetTitle */
      /* Details: "Has a setTitle(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr27 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASSETTITLE);
      
      /* TestCase: RenderResponseWrapper_setTitle */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr28 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_SETTITLE);
      
      /* TestCase: RenderResponseWrapper_hasGetCacheControl */
      /* Details: "Has a getCacheControl() method" */
      /* TODO: implement test */
      TestResult tr29 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASGETCACHECONTROL);
      
      /* TestCase: RenderResponseWrapper_getCacheControl */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr30 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_GETCACHECONTROL);
      
      /* TestCase: RenderResponseWrapper_hasSetNextPossiblePortletModes */
      /* Details: "Has a setNextPossiblePortletModes(java.util.Collection<PortletMode>) method" */
      /* TODO: implement test */
      TestResult tr31 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASSETNEXTPOSSIBLEPORTLETMODES);
      
      /* TestCase: RenderResponseWrapper_setNextPossiblePortletModes */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr32 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_SETNEXTPOSSIBLEPORTLETMODES);
      
      /* TestCase: RenderResponseWrapper_hasGetResponse */
      /* Details: "Has a getResponse() method" */
      /* TODO: implement test */
      TestResult tr33 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASGETRESPONSE);
      
      /* TestCase: RenderResponseWrapper_getResponse */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr34 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_GETRESPONSE);
      
      /* TestCase: RenderResponseWrapper_hasSetResponse */
      /* Details: "Has a setResponse(RenderResponse) method" */
      /* TODO: implement test */
      TestResult tr35 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASSETRESPONSE);
      
      /* TestCase: RenderResponseWrapper_setResponse */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr36 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_SETRESPONSE);
      
      /* TestCase: RenderResponseWrapper_hasCreateActionURL */
      /* Details: "Has a createActionURL() throws java.lang.IllegalStateException method" */
      /* TODO: implement test */
      TestResult tr37 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASCREATEACTIONURL);
      
      /* TestCase: RenderResponseWrapper_createActionURL */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr38 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_CREATEACTIONURL);
      
      /* TestCase: RenderResponseWrapper_hasCreateRenderURL */
      /* Details: "Has a createRenderURL() throws java.lang.IllegalStateException method" */
      /* TODO: implement test */
      TestResult tr39 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASCREATERENDERURL);
      
      /* TestCase: RenderResponseWrapper_createRenderURL */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr40 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_CREATERENDERURL);
      
      /* TestCase: RenderResponseWrapper_hasCreateResourceURL */
      /* Details: "Has a createResourceURL() throws java.lang.IllegalStateException method" */
      /* TODO: implement test */
      TestResult tr41 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_HASCREATERESOURCEURL);
      
      /* TestCase: RenderResponseWrapper_createResourceURL */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr42 = tcd.getTestResultFailed(RENDERRESPONSEWRAPPER_CREATERESOURCEURL);
      


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

