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

package javax.portlet.tck.RequestTests.portlets;

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
public class V2RequestTests_ClientDataRequest implements Portlet {
   private static final String LOG_CLASS = 
         V2RequestTests_ClientDataRequest.class.getName();
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

      /* TestCase: ClientDataRequest_extendsPortletRequest1 */
      /* Details: "ClientDataRequest extendsPortletRequest" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(CLIENTDATAREQUEST_EXTENDSPORTLETREQUEST1);
      
      /* TestCase: ClientDataRequest_extendsPortletRequest2 */
      /* Details: "All tests described for the PortletRequest execute correctly with the ClientDataRequest" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(CLIENTDATAREQUEST_EXTENDSPORTLETREQUEST2);
      
      /* TestCase: ClientDataRequest_hasGetPortletInputStream */
      /* Details: "Has a getPortletInputStream() throws java.io.IOException method" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(CLIENTDATAREQUEST_HASGETPORTLETINPUTSTREAM);
      
      /* TestCase: ClientDataRequest_getPortletInputStream1 */
      /* Details: "Returns an InputStream object" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(CLIENTDATAREQUEST_GETPORTLETINPUTSTREAM1);
      
      /* TestCase: ClientDataRequest_getPortletInputStream2 */
      /* Details: "Throws IllegalStateException if getReader was already called" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(CLIENTDATAREQUEST_GETPORTLETINPUTSTREAM2);
      
      /* TestCase: ClientDataRequest_getPortletInputStream3 */
      /* Details: "Throws IllegalStateException if the request has HTTP POST data of type application/x-www-form-urlencoded" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(CLIENTDATAREQUEST_GETPORTLETINPUTSTREAM3);
      
      /* TestCase: ClientDataRequest_getPortletInputStream4 */
      /* Details: "Throws IOException if an error occurs during IO" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(CLIENTDATAREQUEST_GETPORTLETINPUTSTREAM4);
      
      /* TestCase: ClientDataRequest_hasSetCharacterEncoding */
      /* Details: "Has a setCharacterEncoding(java.lang.String) throws java.io.UnsupportedEncodingException method" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(CLIENTDATAREQUEST_HASSETCHARACTERENCODING);
      
      /* TestCase: ClientDataRequest_setCharacterEncoding1 */
      /* Details: "Allows the character encoding for the body of the request to be overridden" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(CLIENTDATAREQUEST_SETCHARACTERENCODING1);
      
      /* TestCase: ClientDataRequest_setCharacterEncoding2 */
      /* Details: "Throws IllegalStateException if method is called after reading request parameters" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(CLIENTDATAREQUEST_SETCHARACTERENCODING2);
      
      /* TestCase: ClientDataRequest_setCharacterEncoding3 */
      /* Details: "Throws IllegalStateException if method is called after using the getReader() method" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(CLIENTDATAREQUEST_SETCHARACTERENCODING3);
      
      /* TestCase: ClientDataRequest_setCharacterEncoding4 */
      /* Details: "Throws UnsupportedEncodingException if the specified encoding is not valid" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(CLIENTDATAREQUEST_SETCHARACTERENCODING4);
      
      /* TestCase: ClientDataRequest_hasGetReader */
      /* Details: "Has a getReader() throws java.io.UnsupportedEncodingException, java.io.IOException method" */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(CLIENTDATAREQUEST_HASGETREADER);
      
      /* TestCase: ClientDataRequest_getReader1 */
      /* Details: "Returns a BufferedReader object for reading the request" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(CLIENTDATAREQUEST_GETREADER1);
      
      /* TestCase: ClientDataRequest_getReader2 */
      /* Details: "Throws IllegalStateException if getPortletInputStream was already called" */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(CLIENTDATAREQUEST_GETREADER2);
      
      /* TestCase: ClientDataRequest_getReader3 */
      /* Details: "Throws IllegalStateException if the request has HTTP POST data of type application/x-www-form-urlencoded" */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(CLIENTDATAREQUEST_GETREADER3);
      
      /* TestCase: ClientDataRequest_getReader4 */
      /* Details: "Throws IOException if an error occurs during IO" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(CLIENTDATAREQUEST_GETREADER4);
      
      /* TestCase: ClientDataRequest_getReader5 */
      /* Details: "Throws UnsupportedEncodingException if the character set encoding is not valid so that the text cannot be decoded" */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(CLIENTDATAREQUEST_GETREADER5);
      
      /* TestCase: ClientDataRequest_hasGetCharacterEncoding */
      /* Details: "Has a getCharacterEncoding() method" */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(CLIENTDATAREQUEST_HASGETCHARACTERENCODING);
      
      /* TestCase: ClientDataRequest_getCharacterEncoding1 */
      /* Details: "Returns a String containing the name of the character encoding used in the request body" */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(CLIENTDATAREQUEST_GETCHARACTERENCODING1);
      
      /* TestCase: ClientDataRequest_getCharacterEncoding2 */
      /* Details: "Returns null if the request does not specify a character encoding" */
      /* TODO: implement test */
      TestResult tr20 = tcd.getTestResultFailed(CLIENTDATAREQUEST_GETCHARACTERENCODING2);
      
      /* TestCase: ClientDataRequest_hasGetContentType */
      /* Details: "Has a getContentType() method" */
      /* TODO: implement test */
      TestResult tr21 = tcd.getTestResultFailed(CLIENTDATAREQUEST_HASGETCONTENTTYPE);
      
      /* TestCase: ClientDataRequest_getContentType1 */
      /* Details: "Returns a String containing the MIME type of the request body" */
      /* TODO: implement test */
      TestResult tr22 = tcd.getTestResultFailed(CLIENTDATAREQUEST_GETCONTENTTYPE1);
      
      /* TestCase: ClientDataRequest_getContentType2 */
      /* Details: "Returns null if the MIME type is unknown" */
      /* TODO: implement test */
      TestResult tr23 = tcd.getTestResultFailed(CLIENTDATAREQUEST_GETCONTENTTYPE2);
      
      /* TestCase: ClientDataRequest_hasGetContentLength */
      /* Details: "Has a getContentLength() method" */
      /* TODO: implement test */
      TestResult tr24 = tcd.getTestResultFailed(CLIENTDATAREQUEST_HASGETCONTENTLENGTH);
      
      /* TestCase: ClientDataRequest_getContentLength1 */
      /* Details: "Returns the length in bytes of the request body" */
      /* TODO: implement test */
      TestResult tr25 = tcd.getTestResultFailed(CLIENTDATAREQUEST_GETCONTENTLENGTH1);
      
      /* TestCase: ClientDataRequest_getContentLength2 */
      /* Details: "Returns -1 if the length is unknown" */
      /* TODO: implement test */
      TestResult tr26 = tcd.getTestResultFailed(CLIENTDATAREQUEST_GETCONTENTLENGTH2);
      
      /* TestCase: ClientDataRequest_hasGetMethod */
      /* Details: "Has a getMethod() method" */
      /* TODO: implement test */
      TestResult tr27 = tcd.getTestResultFailed(CLIENTDATAREQUEST_HASGETMETHOD);
      
      /* TestCase: ClientDataRequest_getMethod */
      /* Details: "Returns a String containing the name of the HTTP method with which the request was made" */
      /* TODO: implement test */
      TestResult tr28 = tcd.getTestResultFailed(CLIENTDATAREQUEST_GETMETHOD);
      


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


   }

}

