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
public class V2CompatApiResponseTests5 implements Portlet {
   private static final String LOG_CLASS = 
         V2CompatApiResponseTests5.class.getName();
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

      /* TestCase: MimeResponse_extendsPortletResponse1 */
      /* Details: "MimeResponse extends PortletResponse" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(MIMERESPONSE_EXTENDSPORTLETRESPONSE1);
      
      /* TestCase: MimeResponse_extendsPortletResponse2 */
      /* Details: "All tests described for the PortletResponse execute correctly with the MimeResponse" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(MIMERESPONSE_EXTENDSPORTLETRESPONSE2);
      
      /* TestCase: MimeResponse_fieldEXPIRATION_CACHE */
      /* Details: "Has String field EXPIRATION_CACHE with value of "portlet.expiration-cache"" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(MIMERESPONSE_FIELDEXPIRATION_CACHE);
      
      /* TestCase: MimeResponse_fieldCACHE_SCOPE */
      /* Details: "Has String field CACHE_SCOPE with value of "portlet.cache-scope"" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(MIMERESPONSE_FIELDCACHE_SCOPE);
      
      /* TestCase: MimeResponse_fieldPUBLIC_SCOPE */
      /* Details: "Has String field PUBLIC_SCOPE with value of "portlet.public-scope"" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(MIMERESPONSE_FIELDPUBLIC_SCOPE);
      
      /* TestCase: MimeResponse_fieldPRIVATE_SCOPE */
      /* Details: "Has String field PRIVATE_SCOPE with value of "portlet.private-scope"" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(MIMERESPONSE_FIELDPRIVATE_SCOPE);
      
      /* TestCase: MimeResponse_fieldETAG */
      /* Details: "Has String field ETAG with value of "portlet.ETag"" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(MIMERESPONSE_FIELDETAG);
      
      /* TestCase: MimeResponse_fieldUSE_CACHED_CONTENT */
      /* Details: "Has String field USE_CACHED_CONTENT with value of "portlet.use-cached-content"" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(MIMERESPONSE_FIELDUSE_CACHED_CONTENT);
      
      /* TestCase: MimeResponse_fieldNAMESPACED_RESPONSE */
      /* Details: "Has String field NAMESPACED_RESPONSE with value of "X-JAVAX-PORTLET-NAMESPACED-RESPONSE"" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(MIMERESPONSE_FIELDNAMESPACED_RESPONSE);
      
      /* TestCase: MimeResponse_fieldMARKUP_HEAD_ELEMENT */
      /* Details: "Has String field MARKUP_HEAD_ELEMENT with value of "javax.portlet.markup.head.element"" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(MIMERESPONSE_FIELDMARKUP_HEAD_ELEMENT);
      
      /* TestCase: MimeResponse_hasGetContentType */
      /* Details: "Has a getContentType() method" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(MIMERESPONSE_HASGETCONTENTTYPE);
      
      /* TestCase: MimeResponse_getContentType1 */
      /* Details: "Returns a String containing the MIME type that can be used with the response" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(MIMERESPONSE_GETCONTENTTYPE1);
      
      /* TestCase: MimeResponse_getContentType2 */
      /* Details: "Returns null if no content type is set" */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(MIMERESPONSE_GETCONTENTTYPE2);
      
      /* TestCase: MimeResponse_hasSetContentType */
      /* Details: "Has a setContentType(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(MIMERESPONSE_HASSETCONTENTTYPE);
      
      /* TestCase: MimeResponse_setContentType1 */
      /* Details: "Sets the MIME type for the response" */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(MIMERESPONSE_SETCONTENTTYPE1);
      
      /* TestCase: MimeResponse_setContentType2 */
      /* Details: "Has no effect if called after the getWriter method has been called" */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(MIMERESPONSE_SETCONTENTTYPE2);
      
      /* TestCase: MimeResponse_setContentType3 */
      /* Details: "Has no effect if called after the getPortletOutputStream method has been called" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(MIMERESPONSE_SETCONTENTTYPE3);
      
      /* TestCase: MimeResponse_setContentType4 */
      /* Details: "Throws IllegalArgumentException if the specified MIME type is invalid" */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(MIMERESPONSE_SETCONTENTTYPE4);
      
      /* TestCase: MimeResponse_hasGetCharacterEncoding */
      /* Details: "Has a getCharacterEncoding() method" */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(MIMERESPONSE_HASGETCHARACTERENCODING);
      
      /* TestCase: MimeResponse_getCharacterEncoding */
      /* Details: "Returns a String containing the name of the charset used for the response body" */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(MIMERESPONSE_GETCHARACTERENCODING);
      
      /* TestCase: MimeResponse_hasGetWriter */
      /* Details: "Has a getWriter() method" */
      /* TODO: implement test */
      TestResult tr20 = tcd.getTestResultFailed(MIMERESPONSE_HASGETWRITER);
      
      /* TestCase: MimeResponse_getWriter1 */
      /* Details: "Returns a PrintWriter object" */
      /* TODO: implement test */
      TestResult tr21 = tcd.getTestResultFailed(MIMERESPONSE_GETWRITER1);
      
      /* TestCase: MimeResponse_getWriter2 */
      /* Details: "Throws IllegalStateException if called after the getPortletOutputStream method has been called" */
      /* TODO: implement test */
      TestResult tr22 = tcd.getTestResultFailed(MIMERESPONSE_GETWRITER2);
      
      /* TestCase: MimeResponse_getWriter3 */
      /* Details: "Throws IOException if an IO problem occurs" */
      /* TODO: implement test */
      TestResult tr23 = tcd.getTestResultFailed(MIMERESPONSE_GETWRITER3);
      
      /* TestCase: MimeResponse_hasGetLocale */
      /* Details: "Has a getLocale() method" */
      /* TODO: implement test */
      TestResult tr24 = tcd.getTestResultFailed(MIMERESPONSE_HASGETLOCALE);
      
      /* TestCase: MimeResponse_getLocale */
      /* Details: "Returns an java.util.Locale representing the locale assigned to the response" */
      /* TODO: implement test */
      TestResult tr25 = tcd.getTestResultFailed(MIMERESPONSE_GETLOCALE);
      
      /* TestCase: MimeResponse_hasSetBufferSize */
      /* Details: "Has a setBufferSize(int) method" */
      /* TODO: implement test */
      TestResult tr26 = tcd.getTestResultFailed(MIMERESPONSE_HASSETBUFFERSIZE);
      
      /* TestCase: MimeResponse_setBufferSize1 */
      /* Details: "Sets the preferred buffer size for the response body" */
      /* TODO: implement test */
      TestResult tr27 = tcd.getTestResultFailed(MIMERESPONSE_SETBUFFERSIZE1);
      
      /* TestCase: MimeResponse_setBufferSize2 */
      /* Details: "Throws IllegalStateException if called after content has been written" */
      /* TODO: implement test */
      TestResult tr28 = tcd.getTestResultFailed(MIMERESPONSE_SETBUFFERSIZE2);
      
      /* TestCase: MimeResponse_hasGetBufferSize */
      /* Details: "Has a getBufferSize() method" */
      /* TODO: implement test */
      TestResult tr29 = tcd.getTestResultFailed(MIMERESPONSE_HASGETBUFFERSIZE);
      
      /* TestCase: MimeResponse_getBufferSize1 */
      /* Details: "Returns an int designating the actual buffer size used for the response" */
      /* TODO: implement test */
      TestResult tr30 = tcd.getTestResultFailed(MIMERESPONSE_GETBUFFERSIZE1);
      
      /* TestCase: MimeResponse_getBufferSize2 */
      /* Details: "Returns null if buffering is not used" */
      /* TODO: implement test */
      TestResult tr31 = tcd.getTestResultFailed(MIMERESPONSE_GETBUFFERSIZE2);
      
      /* TestCase: MimeResponse_hasFlushBuffer */
      /* Details: "Has a flushBuffer() method" */
      /* TODO: implement test */
      TestResult tr32 = tcd.getTestResultFailed(MIMERESPONSE_HASFLUSHBUFFER);
      
      /* TestCase: MimeResponse_flushBuffer1 */
      /* Details: "Returns void and flushes buffer to OutputStream" */
      /* TODO: implement test */
      TestResult tr33 = tcd.getTestResultFailed(MIMERESPONSE_FLUSHBUFFER1);
      
      /* TestCase: MimeResponse_flushBuffer2 */
      /* Details: "Throws IOException if an IO problem occurs" */
      /* TODO: implement test */
      TestResult tr34 = tcd.getTestResultFailed(MIMERESPONSE_FLUSHBUFFER2);
      
      /* TestCase: MimeResponse_hasResetBuffer */
      /* Details: "Has a resetBuffer() method" */
      /* TODO: implement test */
      TestResult tr35 = tcd.getTestResultFailed(MIMERESPONSE_HASRESETBUFFER);
      
      /* TestCase: MimeResponse_resetBuffer1 */
      /* Details: "Returns void and clears and data and properties from the buffer" */
      /* TODO: implement test */
      TestResult tr36 = tcd.getTestResultFailed(MIMERESPONSE_RESETBUFFER1);
      
      /* TestCase: MimeResponse_resetBuffer2 */
      /* Details: "Throws IllegalStateException if called after the response has been committed" */
      /* TODO: implement test */
      TestResult tr37 = tcd.getTestResultFailed(MIMERESPONSE_RESETBUFFER2);
      
      /* TestCase: MimeResponse_hasIsCommitted */
      /* Details: "Has a isCommitted() method" */
      /* TODO: implement test */
      TestResult tr38 = tcd.getTestResultFailed(MIMERESPONSE_HASISCOMMITTED);
      
      /* TestCase: MimeResponse_isCommitted1 */
      /* Details: "Returns true if the response has been committed" */
      /* TODO: implement test */
      TestResult tr39 = tcd.getTestResultFailed(MIMERESPONSE_ISCOMMITTED1);
      
      /* TestCase: MimeResponse_isCommitted2 */
      /* Details: "Returns false if the response has not been committed" */
      /* TODO: implement test */
      TestResult tr40 = tcd.getTestResultFailed(MIMERESPONSE_ISCOMMITTED2);
      
      /* TestCase: MimeResponse_hasReset */
      /* Details: "Has a reset() method" */
      /* TODO: implement test */
      TestResult tr41 = tcd.getTestResultFailed(MIMERESPONSE_HASRESET);
      
      /* TestCase: MimeResponse_reset1 */
      /* Details: "Returns void and clears and data and properties from the buffer" */
      /* TODO: implement test */
      TestResult tr42 = tcd.getTestResultFailed(MIMERESPONSE_RESET1);
      
      /* TestCase: MimeResponse_reset2 */
      /* Details: "Throws IllegalStateException if called after the response has been committed" */
      /* TODO: implement test */
      TestResult tr43 = tcd.getTestResultFailed(MIMERESPONSE_RESET2);
      
      /* TestCase: MimeResponse_hasGetPortletOutputStream */
      /* Details: "Has a getPortletOutputStream() method" */
      /* TODO: implement test */
      TestResult tr44 = tcd.getTestResultFailed(MIMERESPONSE_HASGETPORTLETOUTPUTSTREAM);
      
      /* TestCase: MimeResponse_getPortletOutputStream1 */
      /* Details: "Returns a PortletOutputStream object" */
      /* TODO: implement test */
      TestResult tr45 = tcd.getTestResultFailed(MIMERESPONSE_GETPORTLETOUTPUTSTREAM1);
      
      /* TestCase: MimeResponse_getPortletOutputStream2 */
      /* Details: "Throws IllegalStateException if called after the getWriter method has been called" */
      /* TODO: implement test */
      TestResult tr46 = tcd.getTestResultFailed(MIMERESPONSE_GETPORTLETOUTPUTSTREAM2);
      
      /* TestCase: MimeResponse_getPortletOutputStream3 */
      /* Details: "Throws IOException if an IO problem occurs" */
      /* TODO: implement test */
      TestResult tr47 = tcd.getTestResultFailed(MIMERESPONSE_GETPORTLETOUTPUTSTREAM3);
      
      /* TestCase: MimeResponse_hasCreateRenderURL */
      /* Details: "Has a createRenderURL() method" */
      /* TODO: implement test */
      TestResult tr48 = tcd.getTestResultFailed(MIMERESPONSE_HASCREATERENDERURL);
      
      /* TestCase: MimeResponse_createRenderURL */
      /* Details: "Returns a PortletURL object representing a render URL targeting the portlet" */
      /* TODO: implement test */
      TestResult tr49 = tcd.getTestResultFailed(MIMERESPONSE_CREATERENDERURL);
      
      /* TestCase: MimeResponse_hasCreateActionURL */
      /* Details: "Has a createActionURL() method" */
      /* TODO: implement test */
      TestResult tr50 = tcd.getTestResultFailed(MIMERESPONSE_HASCREATEACTIONURL);
      
      /* TestCase: MimeResponse_createActionURL */
      /* Details: "Returns a PortletURL object representing an action URL targeting the portlet" */
      /* TODO: implement test */
      TestResult tr51 = tcd.getTestResultFailed(MIMERESPONSE_CREATEACTIONURL);
      
      /* TestCase: MimeResponse_hasCreateResourceURL */
      /* Details: "Has a createResourceURL() method" */
      /* TODO: implement test */
      TestResult tr52 = tcd.getTestResultFailed(MIMERESPONSE_HASCREATERESOURCEURL);
      
      /* TestCase: MimeResponse_createResourceURL */
      /* Details: "Returns a ResourceURL object targeting the portlet" */
      /* TODO: implement test */
      TestResult tr53 = tcd.getTestResultFailed(MIMERESPONSE_CREATERESOURCEURL);
      
      /* TestCase: MimeResponse_hasGetCacheControl */
      /* Details: "Has a getCacheControl() method" */
      /* TODO: implement test */
      TestResult tr54 = tcd.getTestResultFailed(MIMERESPONSE_HASGETCACHECONTROL);
      
      /* TestCase: MimeResponse_getCacheControl */
      /* Details: "Returns a CacheControl object" */
      /* TODO: implement test */
      TestResult tr55 = tcd.getTestResultFailed(MIMERESPONSE_GETCACHECONTROL);
      


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

