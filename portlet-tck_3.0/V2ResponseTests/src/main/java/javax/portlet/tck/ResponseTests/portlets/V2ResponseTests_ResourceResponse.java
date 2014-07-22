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
import static javax.portlet.tck.beans.JSR286ApiTestCaseDetails.*;
import javax.portlet.tck.beans.TestResult;

/**
 * This portlet implements several test cases for the JSR 362 TCK. The test case names
 * are defined in the /src/main/resources/xml-resources/additionalTCs.xml
 * file. The build process will integrate the test case names defined in the 
 * additionalTCs.xml file into the complete list of test case names for execution by the driver.
 */
public class V2ResponseTests_ResourceResponse implements Portlet {
   private static final String LOG_CLASS = 
         V2ResponseTests_ResourceResponse.class.getName();
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

      /* TestCase: ResourceResponse_extendsMimeResponse1 */
      /* Details: "ResourceResponse extends MimeResponse" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(RESOURCERESPONSE_EXTENDSMIMERESPONSE1);
      
      /* TestCase: ResourceResponse_extendsMimeResponse2 */
      /* Details: "All tests described for the PortletResponse execute correctly with the ResourceResponse" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(RESOURCERESPONSE_EXTENDSMIMERESPONSE2);
      
      /* TestCase: ResourceResponse_extendsMimeResponse3 */
      /* Details: "All tests described for the MimeResponse execute correctly with the ResourceResponse" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(RESOURCERESPONSE_EXTENDSMIMERESPONSE3);
      
      /* TestCase: ResourceResponse_fieldHTTP_STATUS_CODE */
      /* Details: "Has String field HTTP_STATUS_CODE with value of "portlet.http-status-code"" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(RESOURCERESPONSE_FIELDHTTP_STATUS_CODE);
      
      /* TestCase: ResourceResponse_hasSetLocale */
      /* Details: "Has a setLocale(java.util.Locale) method" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(RESOURCERESPONSE_HASSETLOCALE);
      
      /* TestCase: ResourceResponse_setLocale1 */
      /* Details: "Sets the locale of the response" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(RESOURCERESPONSE_SETLOCALE1);
      
      /* TestCase: ResourceResponse_setLocale2 */
      /* Details: "Has no effect if called after the getWriter method has been called" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(RESOURCERESPONSE_SETLOCALE2);
      
      /* TestCase: ResourceResponse_setLocale3 */
      /* Details: "Has no effect if called after the getPortletOutputStream method has been called" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(RESOURCERESPONSE_SETLOCALE3);
      
      /* TestCase: ResourceResponse_setLocale4 */
      /* Details: "Throws IllegalArgumentException if the Locale parameter is null" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(RESOURCERESPONSE_SETLOCALE4);
      
      /* TestCase: ResourceResponse_hasSetCharacterEncoding */
      /* Details: "Has a setCharacterEncoding(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(RESOURCERESPONSE_HASSETCHARACTERENCODING);
      
      /* TestCase: ResourceResponse_setCharacterEncoding1 */
      /* Details: "Sets the character encoding of the response" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(RESOURCERESPONSE_SETCHARACTERENCODING1);
      
      /* TestCase: ResourceResponse_setCharacterEncoding2 */
      /* Details: "Has no effect if called after the getWriter method has been called" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(RESOURCERESPONSE_SETCHARACTERENCODING2);
      
      /* TestCase: ResourceResponse_setCharacterEncoding3 */
      /* Details: "Has no effect if called after the getPortletOutputStream method has been called" */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(RESOURCERESPONSE_SETCHARACTERENCODING3);
      
      /* TestCase: ResourceResponse_setCharacterEncoding4 */
      /* Details: "Throws IllegalArgumentException if the Locale parameter is null" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(RESOURCERESPONSE_SETCHARACTERENCODING4);
      
      /* TestCase: ResourceResponse_hasSetContentLength */
      /* Details: "Has a setContentLength(int) method" */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(RESOURCERESPONSE_HASSETCONTENTLENGTH);
      
      /* TestCase: ResourceResponse_setContentLength1 */
      /* Details: "Sets the length of the content body" */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(RESOURCERESPONSE_SETCONTENTLENGTH1);
      
      /* TestCase: ResourceResponse_setContentLength2 */
      /* Details: "Has no effect if called after the getWriter method has been called" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(RESOURCERESPONSE_SETCONTENTLENGTH2);
      
      /* TestCase: ResourceResponse_setContentLength3 */
      /* Details: "Has no effect if called after the getPortletOutputStream method has been called" */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(RESOURCERESPONSE_SETCONTENTLENGTH3);
      
      /* TestCase: ResourceResponse_hasCreateRenderURL */
      /* Details: "Has a createRenderURL() method" */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(RESOURCERESPONSE_HASCREATERENDERURL);
      
      /* TestCase: ResourceResponse_createRenderURL1 */
      /* Details: "Tests described for overridden method in MimeResponse execute correctly" */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(RESOURCERESPONSE_CREATERENDERURL1);
      
      /* TestCase: ResourceResponse_createRenderURL2 */
      /* Details: "Throws IllegalStateException if the cacheability level for the resource URL triggering the serveResource call is not PAGE" */
      /* TODO: implement test */
      TestResult tr20 = tcd.getTestResultFailed(RESOURCERESPONSE_CREATERENDERURL2);
      
      /* TestCase: ResourceResponse_hasCreateActionURL */
      /* Details: "Has a createActionURL() method" */
      /* TODO: implement test */
      TestResult tr21 = tcd.getTestResultFailed(RESOURCERESPONSE_HASCREATEACTIONURL);
      
      /* TestCase: ResourceResponse_createActionURL1 */
      /* Details: "Tests described for overridden method in MimeResponse execute correctly" */
      /* TODO: implement test */
      TestResult tr22 = tcd.getTestResultFailed(RESOURCERESPONSE_CREATEACTIONURL1);
      
      /* TestCase: ResourceResponse_createActionURL2 */
      /* Details: "Throws IllegalStateException if the cacheability level for the resource URL triggering the serveResource call is not PAGE" */
      /* TODO: implement test */
      TestResult tr23 = tcd.getTestResultFailed(RESOURCERESPONSE_CREATEACTIONURL2);
      
      /* TestCase: ResourceResponse_hasCreateResourceURL */
      /* Details: "Has a createResourceURL() method" */
      /* TODO: implement test */
      TestResult tr24 = tcd.getTestResultFailed(RESOURCERESPONSE_HASCREATERESOURCEURL);
      
      /* TestCase: ResourceResponse_createResourceURL1 */
      /* Details: "Tests described for overridden method in MimeResponse execute correctly" */
      /* TODO: implement test */
      TestResult tr25 = tcd.getTestResultFailed(RESOURCERESPONSE_CREATERESOURCEURL1);
      
      /* TestCase: ResourceResponse_createResourceURL2 */
      /* Details: "Throws IllegalStateException if the cacheability level for the resource URL triggering the serveResource call is not PAGE" */
      /* TODO: implement test */
      TestResult tr26 = tcd.getTestResultFailed(RESOURCERESPONSE_CREATERESOURCEURL2);
      


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


   }

}

