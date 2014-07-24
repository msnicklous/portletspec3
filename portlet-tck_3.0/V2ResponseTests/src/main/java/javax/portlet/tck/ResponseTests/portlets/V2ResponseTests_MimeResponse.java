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

package javax.portlet.tck.ResponseTests.portlets;

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
public class V2ResponseTests_MimeResponse implements Portlet {
   private static final String LOG_CLASS = 
         V2ResponseTests_MimeResponse.class.getName();
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
      // ClassChecker cc = new ClassChecker(MimeResponse);

      // Create result objects for the tests

      /* TestCase: MimeResponse_implementsPortletResponse1 */
      /* Details: "Implements PortletResponse" */
      TestResult tr0 = tcd.getTestResultFailed(MIMERESPONSE_IMPLEMENTSPORTLETRESPONSE1);
      // TODO: access the class under test and uncomment this code.
      // {
      //    tr0.setTcSuccess(cc.implementsInterface(PortletResponse.class));
      // }

      /* TestCase: MimeResponse_implementsPortletResponse2 */
      /* Details: "All tests described for the PortletResponse execute correctly with the MimeResponse" */
      TestResult tr1 = tcd.getTestResultFailed(MIMERESPONSE_IMPLEMENTSPORTLETRESPONSE2);
      /* TODO: implement test */

      /* TestCase: MimeResponse_fieldEXPIRATION_CACHE */
      /* Details: "Has String field EXPIRATION_CACHE with value of \"portlet.expiration-cache\"" */
      TestResult tr2 = tcd.getTestResultFailed(MIMERESPONSE_FIELDEXPIRATION_CACHE);
      // TODO: access the class under test and uncomment this code.
      // {
      //    tr2.setTcSuccess(cc.hasField("EXPIRATION_CACHE", "portlet.expiration-cache""));
      // }

      /* TestCase: MimeResponse_fieldCACHE_SCOPE */
      /* Details: "Has String field CACHE_SCOPE with value of \"portlet.cache-scope\"" */
      TestResult tr3 = tcd.getTestResultFailed(MIMERESPONSE_FIELDCACHE_SCOPE);
      // TODO: access the class under test and uncomment this code.
      // {
      //    tr3.setTcSuccess(cc.hasField("CACHE_SCOPE", "portlet.cache-scope""));
      // }

      /* TestCase: MimeResponse_fieldPUBLIC_SCOPE */
      /* Details: "Has String field PUBLIC_SCOPE with value of \"portlet.public-scope\"" */
      TestResult tr4 = tcd.getTestResultFailed(MIMERESPONSE_FIELDPUBLIC_SCOPE);
      // TODO: access the class under test and uncomment this code.
      // {
      //    tr4.setTcSuccess(cc.hasField("PUBLIC_SCOPE", "portlet.public-scope""));
      // }

      /* TestCase: MimeResponse_fieldPRIVATE_SCOPE */
      /* Details: "Has String field PRIVATE_SCOPE with value of \"portlet.private-scope\"" */
      TestResult tr5 = tcd.getTestResultFailed(MIMERESPONSE_FIELDPRIVATE_SCOPE);
      // TODO: access the class under test and uncomment this code.
      // {
      //    tr5.setTcSuccess(cc.hasField("PRIVATE_SCOPE", "portlet.private-scope""));
      // }

      /* TestCase: MimeResponse_fieldETAG */
      /* Details: "Has String field ETAG with value of \"portlet.ETag\"" */
      TestResult tr6 = tcd.getTestResultFailed(MIMERESPONSE_FIELDETAG);
      // TODO: access the class under test and uncomment this code.
      // {
      //    tr6.setTcSuccess(cc.hasField("ETAG", "portlet.ETag""));
      // }

      /* TestCase: MimeResponse_fieldUSE_CACHED_CONTENT */
      /* Details: "Has String field USE_CACHED_CONTENT with value of \"portlet.use-cached-content\"" */
      TestResult tr7 = tcd.getTestResultFailed(MIMERESPONSE_FIELDUSE_CACHED_CONTENT);
      // TODO: access the class under test and uncomment this code.
      // {
      //    tr7.setTcSuccess(cc.hasField("USE_CACHED_CONTENT", "portlet.use-cached-content""));
      // }

      /* TestCase: MimeResponse_fieldNAMESPACED_RESPONSE */
      /* Details: "Has String field NAMESPACED_RESPONSE with value of \"X-JAVAX-PORTLET-NAMESPACED-RESPONSE\"" */
      TestResult tr8 = tcd.getTestResultFailed(MIMERESPONSE_FIELDNAMESPACED_RESPONSE);
      // TODO: access the class under test and uncomment this code.
      // {
      //    tr8.setTcSuccess(cc.hasField("NAMESPACED_RESPONSE", "X-JAVAX-PORTLET-NAMESPACED-RESPONSE""));
      // }

      /* TestCase: MimeResponse_fieldMARKUP_HEAD_ELEMENT */
      /* Details: "Has String field MARKUP_HEAD_ELEMENT with value of \"javax.portlet.markup.head.element\"" */
      TestResult tr9 = tcd.getTestResultFailed(MIMERESPONSE_FIELDMARKUP_HEAD_ELEMENT);
      // TODO: access the class under test and uncomment this code.
      // {
      //    tr9.setTcSuccess(cc.hasField("MARKUP_HEAD_ELEMENT", "javax.portlet.markup.head.element""));
      // }

      /* TestCase: MimeResponse_hasGetContentType */
      /* Details: "Has a getContentType() method" */
      TestResult tr10 = tcd.getTestResultFailed(MIMERESPONSE_HASGETCONTENTTYPE);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getContentType";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr10.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: MimeResponse_getContentType1 */
      /* Details: "Returns a String containing the MIME type that can be used with the response" */
      TestResult tr11 = tcd.getTestResultFailed(MIMERESPONSE_GETCONTENTTYPE1);
      /* TODO: implement test */

      /* TestCase: MimeResponse_getContentType2 */
      /* Details: "Returns null if no content type is set" */
      TestResult tr12 = tcd.getTestResultFailed(MIMERESPONSE_GETCONTENTTYPE2);
      /* TODO: implement test */

      /* TestCase: MimeResponse_hasSetContentType */
      /* Details: "Has a setContentType(java.lang.String) method" */
      TestResult tr13 = tcd.getTestResultFailed(MIMERESPONSE_HASSETCONTENTTYPE);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "setContentType";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = {java.lang.String.class};
      //    tr13.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: MimeResponse_setContentType1 */
      /* Details: "Sets the MIME type for the response" */
      TestResult tr14 = tcd.getTestResultFailed(MIMERESPONSE_SETCONTENTTYPE1);
      /* TODO: implement test */

      /* TestCase: MimeResponse_setContentType2 */
      /* Details: "Has no effect if called after the getWriter method has been called" */
      TestResult tr15 = tcd.getTestResultFailed(MIMERESPONSE_SETCONTENTTYPE2);
      /* TODO: implement test */

      /* TestCase: MimeResponse_setContentType3 */
      /* Details: "Has no effect if called after the getPortletOutputStream method has been called" */
      TestResult tr16 = tcd.getTestResultFailed(MIMERESPONSE_SETCONTENTTYPE3);
      /* TODO: implement test */

      /* TestCase: MimeResponse_setContentType4 */
      /* Details: "Throws IllegalArgumentException if the specified MIME type is invalid" */
      TestResult tr17 = tcd.getTestResultFailed(MIMERESPONSE_SETCONTENTTYPE4);
      /* TODO: implement test */

      /* TestCase: MimeResponse_hasGetCharacterEncoding */
      /* Details: "Has a getCharacterEncoding() method" */
      TestResult tr18 = tcd.getTestResultFailed(MIMERESPONSE_HASGETCHARACTERENCODING);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getCharacterEncoding";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr18.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: MimeResponse_getCharacterEncoding */
      /* Details: "Returns a String containing the name of the charset used for the response body" */
      TestResult tr19 = tcd.getTestResultFailed(MIMERESPONSE_GETCHARACTERENCODING);
      /* TODO: implement test */

      /* TestCase: MimeResponse_hasGetWriter */
      /* Details: "Has a getWriter() throws java.io.IOException method" */
      TestResult tr20 = tcd.getTestResultFailed(MIMERESPONSE_HASGETWRITER);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getWriter";
      //    Class<?>[] exceptions = {java.io.IOException.class};
      //    Class<?>[] parms = null;
      //    tr20.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: MimeResponse_getWriter1 */
      /* Details: "Returns a PrintWriter object" */
      TestResult tr21 = tcd.getTestResultFailed(MIMERESPONSE_GETWRITER1);
      /* TODO: implement test */

      /* TestCase: MimeResponse_getWriter2 */
      /* Details: "Throws IllegalStateException if called after the getPortletOutputStream method has been called" */
      TestResult tr22 = tcd.getTestResultFailed(MIMERESPONSE_GETWRITER2);
      /* TODO: implement test */

      /* TestCase: MimeResponse_getWriter3 */
      /* Details: "Throws IOException if an IO problem occurs" */
      TestResult tr23 = tcd.getTestResultFailed(MIMERESPONSE_GETWRITER3);
      /* TODO: implement test */

      /* TestCase: MimeResponse_hasGetLocale */
      /* Details: "Has a getLocale() method" */
      TestResult tr24 = tcd.getTestResultFailed(MIMERESPONSE_HASGETLOCALE);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getLocale";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr24.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: MimeResponse_getLocale */
      /* Details: "Returns an java.util.Locale representing the locale assigned to the response" */
      TestResult tr25 = tcd.getTestResultFailed(MIMERESPONSE_GETLOCALE);
      /* TODO: implement test */

      /* TestCase: MimeResponse_hasSetBufferSize */
      /* Details: "Has a setBufferSize(int) method" */
      TestResult tr26 = tcd.getTestResultFailed(MIMERESPONSE_HASSETBUFFERSIZE);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "setBufferSize";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = {int.class};
      //    tr26.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: MimeResponse_setBufferSize1 */
      /* Details: "Sets the preferred buffer size for the response body" */
      TestResult tr27 = tcd.getTestResultFailed(MIMERESPONSE_SETBUFFERSIZE1);
      /* TODO: implement test */

      /* TestCase: MimeResponse_setBufferSize2 */
      /* Details: "Throws IllegalStateException if called after content has been written" */
      TestResult tr28 = tcd.getTestResultFailed(MIMERESPONSE_SETBUFFERSIZE2);
      /* TODO: implement test */

      /* TestCase: MimeResponse_hasGetBufferSize */
      /* Details: "Has a getBufferSize() method" */
      TestResult tr29 = tcd.getTestResultFailed(MIMERESPONSE_HASGETBUFFERSIZE);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getBufferSize";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr29.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: MimeResponse_getBufferSize1 */
      /* Details: "Returns an int designating the actual buffer size used for the response" */
      TestResult tr30 = tcd.getTestResultFailed(MIMERESPONSE_GETBUFFERSIZE1);
      /* TODO: implement test */

      /* TestCase: MimeResponse_getBufferSize2 */
      /* Details: "Returns null if buffering is not used" */
      TestResult tr31 = tcd.getTestResultFailed(MIMERESPONSE_GETBUFFERSIZE2);
      /* TODO: implement test */

      /* TestCase: MimeResponse_hasFlushBuffer */
      /* Details: "Has a flushBuffer() throws java.io.IOException method" */
      TestResult tr32 = tcd.getTestResultFailed(MIMERESPONSE_HASFLUSHBUFFER);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "flushBuffer";
      //    Class<?>[] exceptions = {java.io.IOException.class};
      //    Class<?>[] parms = null;
      //    tr32.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: MimeResponse_flushBuffer1 */
      /* Details: "Returns void and flushes buffer to OutputStream" */
      TestResult tr33 = tcd.getTestResultFailed(MIMERESPONSE_FLUSHBUFFER1);
      /* TODO: implement test */

      /* TestCase: MimeResponse_flushBuffer2 */
      /* Details: "Throws IOException if an IO problem occurs" */
      TestResult tr34 = tcd.getTestResultFailed(MIMERESPONSE_FLUSHBUFFER2);
      /* TODO: implement test */

      /* TestCase: MimeResponse_hasResetBuffer */
      /* Details: "Has a resetBuffer() method" */
      TestResult tr35 = tcd.getTestResultFailed(MIMERESPONSE_HASRESETBUFFER);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "resetBuffer";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr35.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: MimeResponse_resetBuffer1 */
      /* Details: "Returns void and clears and data and properties from the buffer" */
      TestResult tr36 = tcd.getTestResultFailed(MIMERESPONSE_RESETBUFFER1);
      /* TODO: implement test */

      /* TestCase: MimeResponse_resetBuffer2 */
      /* Details: "Throws IllegalStateException if called after the response has been committed" */
      TestResult tr37 = tcd.getTestResultFailed(MIMERESPONSE_RESETBUFFER2);
      /* TODO: implement test */

      /* TestCase: MimeResponse_hasIsCommitted */
      /* Details: "Has a isCommitted() method" */
      TestResult tr38 = tcd.getTestResultFailed(MIMERESPONSE_HASISCOMMITTED);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "isCommitted";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr38.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: MimeResponse_isCommitted1 */
      /* Details: "Returns true if the response has been committed" */
      TestResult tr39 = tcd.getTestResultFailed(MIMERESPONSE_ISCOMMITTED1);
      /* TODO: implement test */

      /* TestCase: MimeResponse_isCommitted2 */
      /* Details: "Returns false if the response has not been committed" */
      TestResult tr40 = tcd.getTestResultFailed(MIMERESPONSE_ISCOMMITTED2);
      /* TODO: implement test */

      /* TestCase: MimeResponse_hasReset */
      /* Details: "Has a reset() method" */
      TestResult tr41 = tcd.getTestResultFailed(MIMERESPONSE_HASRESET);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "reset";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr41.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: MimeResponse_reset1 */
      /* Details: "Returns void and clears and data and properties from the buffer" */
      TestResult tr42 = tcd.getTestResultFailed(MIMERESPONSE_RESET1);
      /* TODO: implement test */

      /* TestCase: MimeResponse_reset2 */
      /* Details: "Throws IllegalStateException if called after the response has been committed" */
      TestResult tr43 = tcd.getTestResultFailed(MIMERESPONSE_RESET2);
      /* TODO: implement test */

      /* TestCase: MimeResponse_hasGetPortletOutputStream */
      /* Details: "Has a getPortletOutputStream() throws java.io.IOException method" */
      TestResult tr44 = tcd.getTestResultFailed(MIMERESPONSE_HASGETPORTLETOUTPUTSTREAM);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getPortletOutputStream";
      //    Class<?>[] exceptions = {java.io.IOException.class};
      //    Class<?>[] parms = null;
      //    tr44.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: MimeResponse_getPortletOutputStream1 */
      /* Details: "Returns a PortletOutputStream object" */
      TestResult tr45 = tcd.getTestResultFailed(MIMERESPONSE_GETPORTLETOUTPUTSTREAM1);
      /* TODO: implement test */

      /* TestCase: MimeResponse_getPortletOutputStream2 */
      /* Details: "Throws IllegalStateException if called after the getWriter method has been called" */
      TestResult tr46 = tcd.getTestResultFailed(MIMERESPONSE_GETPORTLETOUTPUTSTREAM2);
      /* TODO: implement test */

      /* TestCase: MimeResponse_getPortletOutputStream3 */
      /* Details: "Throws IOException if an IO problem occurs" */
      TestResult tr47 = tcd.getTestResultFailed(MIMERESPONSE_GETPORTLETOUTPUTSTREAM3);
      /* TODO: implement test */

      /* TestCase: MimeResponse_hasCreateRenderURL */
      /* Details: "Has a createRenderURL() method" */
      TestResult tr48 = tcd.getTestResultFailed(MIMERESPONSE_HASCREATERENDERURL);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "createRenderURL";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr48.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: MimeResponse_createRenderURL */
      /* Details: "Returns a PortletURL object representing a render URL targeting the portlet" */
      TestResult tr49 = tcd.getTestResultFailed(MIMERESPONSE_CREATERENDERURL);
      /* TODO: implement test */

      /* TestCase: MimeResponse_hasCreateActionURL */
      /* Details: "Has a createActionURL() method" */
      TestResult tr50 = tcd.getTestResultFailed(MIMERESPONSE_HASCREATEACTIONURL);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "createActionURL";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr50.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: MimeResponse_createActionURL */
      /* Details: "Returns a PortletURL object representing an action URL targeting the portlet" */
      TestResult tr51 = tcd.getTestResultFailed(MIMERESPONSE_CREATEACTIONURL);
      /* TODO: implement test */

      /* TestCase: MimeResponse_hasCreateResourceURL */
      /* Details: "Has a createResourceURL() method" */
      TestResult tr52 = tcd.getTestResultFailed(MIMERESPONSE_HASCREATERESOURCEURL);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "createResourceURL";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr52.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: MimeResponse_createResourceURL */
      /* Details: "Returns a ResourceURL object targeting the portlet" */
      TestResult tr53 = tcd.getTestResultFailed(MIMERESPONSE_CREATERESOURCEURL);
      /* TODO: implement test */

      /* TestCase: MimeResponse_hasGetCacheControl */
      /* Details: "Has a getCacheControl() method" */
      TestResult tr54 = tcd.getTestResultFailed(MIMERESPONSE_HASGETCACHECONTROL);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getCacheControl";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr54.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: MimeResponse_getCacheControl */
      /* Details: "Returns a CacheControl object" */
      TestResult tr55 = tcd.getTestResultFailed(MIMERESPONSE_GETCACHECONTROL);
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


   }

}

