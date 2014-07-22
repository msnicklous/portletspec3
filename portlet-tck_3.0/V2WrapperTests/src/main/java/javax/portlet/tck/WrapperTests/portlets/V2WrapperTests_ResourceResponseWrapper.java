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
public class V2WrapperTests_ResourceResponseWrapper implements Portlet {
   private static final String LOG_CLASS = 
         V2WrapperTests_ResourceResponseWrapper.class.getName();
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

      /* TestCase: ResourceResponseWrapper_extendsPortletResponseWrapper */
      /* Details: "Extends PortletResponseWrapper" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_EXTENDSPORTLETRESPONSEWRAPPER);
      
      /* TestCase: ResourceResponseWrapper_implementsResourceResponse */
      /* Details: "Implements ResourceResponse" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_IMPLEMENTSRESOURCERESPONSE);
      
      /* TestCase: ResourceResponseWrapper_constructor */
      /* Details: "Constructs ResourceResponseWrapper with specified wrapped ResourceResponse object" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_CONSTRUCTOR);
      
      /* TestCase: ResourceResponseWrapper_hasFlushBuffer */
      /* Details: "Has a flushBuffer() method" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASFLUSHBUFFER);
      
      /* TestCase: ResourceResponseWrapper_flushBuffer */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_FLUSHBUFFER);
      
      /* TestCase: ResourceResponseWrapper_hasGetBufferSize */
      /* Details: "Has a getBufferSize() method" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASGETBUFFERSIZE);
      
      /* TestCase: ResourceResponseWrapper_getBufferSize */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_GETBUFFERSIZE);
      
      /* TestCase: ResourceResponseWrapper_hasGetCharacterEncoding */
      /* Details: "Has a getCharacterEncoding() method" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASGETCHARACTERENCODING);
      
      /* TestCase: ResourceResponseWrapper_getCharacterEncoding */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_GETCHARACTERENCODING);
      
      /* TestCase: ResourceResponseWrapper_hasGetContentType */
      /* Details: "Has a getContentType() method" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASGETCONTENTTYPE);
      
      /* TestCase: ResourceResponseWrapper_getContentType */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_GETCONTENTTYPE);
      
      /* TestCase: ResourceResponseWrapper_hasGetLocale */
      /* Details: "Has a getLocale() method" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASGETLOCALE);
      
      /* TestCase: ResourceResponseWrapper_getLocale */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_GETLOCALE);
      
      /* TestCase: ResourceResponseWrapper_hasGetPortletOutputStream */
      /* Details: "Has a getPortletOutputStream() method" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASGETPORTLETOUTPUTSTREAM);
      
      /* TestCase: ResourceResponseWrapper_getPortletOutputStream */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_GETPORTLETOUTPUTSTREAM);
      
      /* TestCase: ResourceResponseWrapper_hasGetWriter */
      /* Details: "Has a getWriter() method" */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASGETWRITER);
      
      /* TestCase: ResourceResponseWrapper_getWriter */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_GETWRITER);
      
      /* TestCase: ResourceResponseWrapper_hasIsCommitted */
      /* Details: "Has a isCommitted() method" */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASISCOMMITTED);
      
      /* TestCase: ResourceResponseWrapper_isCommitted */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_ISCOMMITTED);
      
      /* TestCase: ResourceResponseWrapper_hasReset */
      /* Details: "Has a reset() method" */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASRESET);
      
      /* TestCase: ResourceResponseWrapper_reset */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr20 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_RESET);
      
      /* TestCase: ResourceResponseWrapper_hasResetBuffer */
      /* Details: "Has a resetBuffer() method" */
      /* TODO: implement test */
      TestResult tr21 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASRESETBUFFER);
      
      /* TestCase: ResourceResponseWrapper_resetBuffer */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr22 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_RESETBUFFER);
      
      /* TestCase: ResourceResponseWrapper_hasSetBufferSize */
      /* Details: "Has a setBufferSize(int) method" */
      /* TODO: implement test */
      TestResult tr23 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASSETBUFFERSIZE);
      
      /* TestCase: ResourceResponseWrapper_setBufferSize */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr24 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_SETBUFFERSIZE);
      
      /* TestCase: ResourceResponseWrapper_hasSetContentType */
      /* Details: "Has a setContentType() method" */
      /* TODO: implement test */
      TestResult tr25 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASSETCONTENTTYPE);
      
      /* TestCase: ResourceResponseWrapper_setContentType */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr26 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_SETCONTENTTYPE);
      
      /* TestCase: ResourceResponseWrapper_hasGetCacheControl */
      /* Details: "Has a getCacheControl() method" */
      /* TODO: implement test */
      TestResult tr27 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASGETCACHECONTROL);
      
      /* TestCase: ResourceResponseWrapper_getCacheControl */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr28 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_GETCACHECONTROL);
      
      /* TestCase: ResourceResponseWrapper_hasSetCharacterEncoding */
      /* Details: "Has a setCharacterEncoding(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr29 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASSETCHARACTERENCODING);
      
      /* TestCase: ResourceResponseWrapper_setCharacterEncoding */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr30 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_SETCHARACTERENCODING);
      
      /* TestCase: ResourceResponseWrapper_hasSetLocale */
      /* Details: "Has a setLocale(java.util.Locale) method" */
      /* TODO: implement test */
      TestResult tr31 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASSETLOCALE);
      
      /* TestCase: ResourceResponseWrapper_setLocale */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr32 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_SETLOCALE);
      
      /* TestCase: ResourceResponseWrapper_hasSetContentLength */
      /* Details: "Has a setContentLength(int) method" */
      /* TODO: implement test */
      TestResult tr33 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASSETCONTENTLENGTH);
      
      /* TestCase: ResourceResponseWrapper_setContentLength */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr34 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_SETCONTENTLENGTH);
      
      /* TestCase: ResourceResponseWrapper_hasGetResponse */
      /* Details: "Has a getResponse() method" */
      /* TODO: implement test */
      TestResult tr35 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASGETRESPONSE);
      
      /* TestCase: ResourceResponseWrapper_getResponse */
      /* Details: "Returns wrapped RespurceResponse object" */
      /* TODO: implement test */
      TestResult tr36 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_GETRESPONSE);
      
      /* TestCase: ResourceResponseWrapper_hasSetResponse */
      /* Details: "Has a setResponse(ResourceResponse) method" */
      /* TODO: implement test */
      TestResult tr37 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASSETRESPONSE);
      
      /* TestCase: ResourceResponseWrapper_setResponse */
      /* Details: "Allows wrapped ResourceResponse object to be set" */
      /* TODO: implement test */
      TestResult tr38 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_SETRESPONSE);
      
      /* TestCase: ResourceResponseWrapper_hasCreateActionURL */
      /* Details: "Has a createActionURL() method" */
      /* TODO: implement test */
      TestResult tr39 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASCREATEACTIONURL);
      
      /* TestCase: ResourceResponseWrapper_createActionURL */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr40 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_CREATEACTIONURL);
      
      /* TestCase: ResourceResponseWrapper_hasCreateRenderURL */
      /* Details: "Has a createRenderURL() method" */
      /* TODO: implement test */
      TestResult tr41 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASCREATERENDERURL);
      
      /* TestCase: ResourceResponseWrapper_createRenderURL */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr42 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_CREATERENDERURL);
      
      /* TestCase: ResourceResponseWrapper_hasCreateResourceURL */
      /* Details: "Has a createResourceURL() method" */
      /* TODO: implement test */
      TestResult tr43 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASCREATERESOURCEURL);
      
      /* TestCase: ResourceResponseWrapper_createResourceURL */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr44 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_CREATERESOURCEURL);
      


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


   }

}

