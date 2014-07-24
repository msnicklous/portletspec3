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
public class V2WrapperTests_ResourceResponseWrapper implements Portlet {
   private static final String LOG_CLASS = 
         V2WrapperTests_ResourceResponseWrapper.class.getName();
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
      ClassChecker cc = new ClassChecker(ResourceResponseWrapper.class);

      // Create result objects for the tests

      /* TestCase: ResourceResponseWrapper_extendsPortletResponseWrapper */
      /* Details: "Extends PortletResponseWrapper" */
      TestResult tr0 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_EXTENDSPORTLETRESPONSEWRAPPER);
      {
         tr0.setTcSuccess(cc.hasSuperclass(PortletResponseWrapper.class));
      }

      /* TestCase: ResourceResponseWrapper_implementsResourceResponse */
      /* Details: "Implements ResourceResponse" */
      TestResult tr1 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_IMPLEMENTSRESOURCERESPONSE);
      {
         tr1.setTcSuccess(cc.implementsInterface(ResourceResponse.class));
      }

      /* TestCase: ResourceResponseWrapper_constructor */
      /* Details: "Provides constructor ResourceResponseWrapper(ResourceResponse) with specified wrapped ResourceResponse object" */
      TestResult tr2 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_CONSTRUCTOR);
      {
         Class<?>[] parms = {ResourceResponse.class};
         tr2.setTcSuccess(cc.hasConstructor(parms));
      }

      /* TestCase: ResourceResponseWrapper_hasFlushBuffer */
      /* Details: "Has a flushBuffer() throws java.io.IOException method" */
      TestResult tr3 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASFLUSHBUFFER);
      {
         String name = "flushBuffer";
         Class<?>[] exceptions = {java.io.IOException.class};
         Class<?>[] parms = null;
         tr3.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_flushBuffer */
      /* Details: "Calls wrapped method" */
      TestResult tr4 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_FLUSHBUFFER);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasGetBufferSize */
      /* Details: "Has a getBufferSize() method" */
      TestResult tr5 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASGETBUFFERSIZE);
      {
         String name = "getBufferSize";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr5.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_getBufferSize */
      /* Details: "Calls wrapped method" */
      TestResult tr6 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_GETBUFFERSIZE);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasGetCharacterEncoding */
      /* Details: "Has a getCharacterEncoding() method" */
      TestResult tr7 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASGETCHARACTERENCODING);
      {
         String name = "getCharacterEncoding";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr7.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_getCharacterEncoding */
      /* Details: "Calls wrapped method" */
      TestResult tr8 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_GETCHARACTERENCODING);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasGetContentType */
      /* Details: "Has a getContentType() method" */
      TestResult tr9 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASGETCONTENTTYPE);
      {
         String name = "getContentType";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr9.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_getContentType */
      /* Details: "Calls wrapped method" */
      TestResult tr10 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_GETCONTENTTYPE);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasGetLocale */
      /* Details: "Has a getLocale() method" */
      TestResult tr11 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASGETLOCALE);
      {
         String name = "getLocale";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr11.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_getLocale */
      /* Details: "Calls wrapped method" */
      TestResult tr12 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_GETLOCALE);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasGetPortletOutputStream */
      /* Details: "Has a getPortletOutputStream() throws java.io.IOException method" */
      TestResult tr13 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASGETPORTLETOUTPUTSTREAM);
      {
         String name = "getPortletOutputStream";
         Class<?>[] exceptions = {java.io.IOException.class};
         Class<?>[] parms = null;
         tr13.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_getPortletOutputStream */
      /* Details: "Calls wrapped method" */
      TestResult tr14 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_GETPORTLETOUTPUTSTREAM);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasGetWriter */
      /* Details: "Has a getWriter() throws java.io.IOException method" */
      TestResult tr15 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASGETWRITER);
      {
         String name = "getWriter";
         Class<?>[] exceptions = {java.io.IOException.class};
         Class<?>[] parms = null;
         tr15.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_getWriter */
      /* Details: "Calls wrapped method" */
      TestResult tr16 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_GETWRITER);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasIsCommitted */
      /* Details: "Has a isCommitted() method" */
      TestResult tr17 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASISCOMMITTED);
      {
         String name = "isCommitted";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr17.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_isCommitted */
      /* Details: "Calls wrapped method" */
      TestResult tr18 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_ISCOMMITTED);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasReset */
      /* Details: "Has a reset() method" */
      TestResult tr19 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASRESET);
      {
         String name = "reset";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr19.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_reset */
      /* Details: "Calls wrapped method" */
      TestResult tr20 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_RESET);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasResetBuffer */
      /* Details: "Has a resetBuffer() method" */
      TestResult tr21 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASRESETBUFFER);
      {
         String name = "resetBuffer";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr21.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_resetBuffer */
      /* Details: "Calls wrapped method" */
      TestResult tr22 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_RESETBUFFER);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasSetBufferSize */
      /* Details: "Has a setBufferSize(int) method" */
      TestResult tr23 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASSETBUFFERSIZE);
      {
         String name = "setBufferSize";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {int.class};
         tr23.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_setBufferSize */
      /* Details: "Calls wrapped method" */
      TestResult tr24 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_SETBUFFERSIZE);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasSetContentType */
      /* Details: "Has a setContentType() method" */
      TestResult tr25 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASSETCONTENTTYPE);
      {
         String name = "setContentType";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr25.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_setContentType */
      /* Details: "Calls wrapped method" */
      TestResult tr26 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_SETCONTENTTYPE);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasGetCacheControl */
      /* Details: "Has a getCacheControl() method" */
      TestResult tr27 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASGETCACHECONTROL);
      {
         String name = "getCacheControl";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr27.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_getCacheControl */
      /* Details: "Calls wrapped method" */
      TestResult tr28 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_GETCACHECONTROL);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasSetCharacterEncoding */
      /* Details: "Has a setCharacterEncoding(java.lang.String) method" */
      TestResult tr29 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASSETCHARACTERENCODING);
      {
         String name = "setCharacterEncoding";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class};
         tr29.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_setCharacterEncoding */
      /* Details: "Calls wrapped method" */
      TestResult tr30 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_SETCHARACTERENCODING);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasSetLocale */
      /* Details: "Has a setLocale(java.util.Locale) method" */
      TestResult tr31 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASSETLOCALE);
      {
         String name = "setLocale";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.util.Locale.class};
         tr31.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_setLocale */
      /* Details: "Calls wrapped method" */
      TestResult tr32 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_SETLOCALE);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasSetContentLength */
      /* Details: "Has a setContentLength(int) method" */
      TestResult tr33 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASSETCONTENTLENGTH);
      {
         String name = "setContentLength";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {int.class};
         tr33.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_setContentLength */
      /* Details: "Calls wrapped method" */
      TestResult tr34 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_SETCONTENTLENGTH);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasGetResponse */
      /* Details: "Has a getResponse() method" */
      TestResult tr35 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASGETRESPONSE);
      {
         String name = "getResponse";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr35.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_getResponse */
      /* Details: "Returns wrapped RespurceResponse object" */
      TestResult tr36 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_GETRESPONSE);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasSetResponse */
      /* Details: "Has a setResponse(ResourceResponse) method" */
      TestResult tr37 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASSETRESPONSE);
      {
         String name = "setResponse";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {ResourceResponse.class};
         tr37.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_setResponse */
      /* Details: "Allows wrapped ResourceResponse object to be set" */
      TestResult tr38 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_SETRESPONSE);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasCreateActionURL */
      /* Details: "Has a createActionURL() throws java.lang.IllegalStateException method" */
      TestResult tr39 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASCREATEACTIONURL);
      {
         String name = "createActionURL";
         Class<?>[] exceptions = {java.lang.IllegalStateException.class};
         Class<?>[] parms = null;
         tr39.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_createActionURL */
      /* Details: "Calls wrapped method" */
      TestResult tr40 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_CREATEACTIONURL);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasCreateRenderURL */
      /* Details: "Has a createRenderURL() throws java.lang.IllegalStateException method" */
      TestResult tr41 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASCREATERENDERURL);
      {
         String name = "createRenderURL";
         Class<?>[] exceptions = {java.lang.IllegalStateException.class};
         Class<?>[] parms = null;
         tr41.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_createRenderURL */
      /* Details: "Calls wrapped method" */
      TestResult tr42 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_CREATERENDERURL);
      /* TODO: implement test */

      /* TestCase: ResourceResponseWrapper_hasCreateResourceURL */
      /* Details: "Has a createResourceURL() throws java.lang.IllegalStateException method" */
      TestResult tr43 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_HASCREATERESOURCEURL);
      {
         String name = "createResourceURL";
         Class<?>[] exceptions = {java.lang.IllegalStateException.class};
         Class<?>[] parms = null;
         tr43.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceResponseWrapper_createResourceURL */
      /* Details: "Calls wrapped method" */
      TestResult tr44 = tcd.getTestResultFailed(RESOURCERESPONSEWRAPPER_CREATERESOURCEURL);
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
      tr43.writeTo(writer);
      tr44.writeTo(writer);


   }

}

