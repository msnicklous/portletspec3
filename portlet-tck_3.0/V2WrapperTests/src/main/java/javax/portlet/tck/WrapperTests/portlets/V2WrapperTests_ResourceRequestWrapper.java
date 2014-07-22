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
public class V2WrapperTests_ResourceRequestWrapper implements Portlet {
   private static final String LOG_CLASS = 
         V2WrapperTests_ResourceRequestWrapper.class.getName();
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

      /* TestCase: ResourceRequestWrapper_extendsPortletRequestWrapper */
      /* Details: "Extends PortletRequestWrapper" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_EXTENDSPORTLETREQUESTWRAPPER);
      
      /* TestCase: ResourceRequestWrapper_implementsResourceRequest */
      /* Details: "Implements ResourceRequest" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_IMPLEMENTSRESOURCEREQUEST);
      
      /* TestCase: ResourceRequestWrapper_constructor */
      /* Details: "Constructs ResourceRequestWrapper with specified wrapped ResourceRequest object" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_CONSTRUCTOR);
      
      /* TestCase: ResourceRequestWrapper_hasGetPortletInputStream */
      /* Details: "Has a getPortletInputStream() method" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETPORTLETINPUTSTREAM);
      
      /* TestCase: ResourceRequestWrapper_getPortletInputStream */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETPORTLETINPUTSTREAM);
      
      /* TestCase: ResourceRequestWrapper_hasGetReader */
      /* Details: "Has a getReader() method" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETREADER);
      
      /* TestCase: ResourceRequestWrapper_getReader */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETREADER);
      
      /* TestCase: ResourceRequestWrapper_hasSetCharacterEncoding */
      /* Details: "Has a setCharacterEncoding() method" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASSETCHARACTERENCODING);
      
      /* TestCase: ResourceRequestWrapper_setCharacterEncoding */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_SETCHARACTERENCODING);
      
      /* TestCase: ResourceRequestWrapper_hasGetRequest */
      /* Details: "Has a getRequest() method" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETREQUEST);
      
      /* TestCase: ResourceRequestWrapper_getRequest */
      /* Details: "Returns wrapped ResourceRequest object" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETREQUEST);
      
      /* TestCase: ResourceRequestWrapper_hasSetRequest */
      /* Details: "Has a setRequest(ResourceRequest) method" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASSETREQUEST);
      
      /* TestCase: ResourceRequestWrapper_setRequest */
      /* Details: "Allows wrapped ResourceRequest object to be set" */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_SETREQUEST);
      
      /* TestCase: ResourceRequestWrapper_hasGetCharacterEncoding */
      /* Details: "Has a getCharacterEncoding() method" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETCHARACTERENCODING);
      
      /* TestCase: ResourceRequestWrapper_getCharacterEncoding */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETCHARACTERENCODING);
      
      /* TestCase: ResourceRequestWrapper_hasGetContentLength */
      /* Details: "Has a getContentLength() method" */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETCONTENTLENGTH);
      
      /* TestCase: ResourceRequestWrapper_getContentLength */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETCONTENTLENGTH);
      
      /* TestCase: ResourceRequestWrapper_hasGetContentType */
      /* Details: "Has a getContentType() method" */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETCONTENTTYPE);
      
      /* TestCase: ResourceRequestWrapper_getContentType */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETCONTENTTYPE);
      
      /* TestCase: ResourceRequestWrapper_hasGetETag */
      /* Details: "Has a getETag() method" */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETETAG);
      
      /* TestCase: ResourceRequestWrapper_getETag */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr20 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETETAG);
      
      /* TestCase: ResourceRequestWrapper_hasGetMethod */
      /* Details: "Has a getMethod() method" */
      /* TODO: implement test */
      TestResult tr21 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETMETHOD);
      
      /* TestCase: ResourceRequestWrapper_getMethod */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr22 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETMETHOD);
      
      /* TestCase: ResourceRequestWrapper_hasGetResourceID */
      /* Details: "Has a getResourceID() method" */
      /* TODO: implement test */
      TestResult tr23 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETRESOURCEID);
      
      /* TestCase: ResourceRequestWrapper_getResourceID */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr24 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETRESOURCEID);
      
      /* TestCase: ResourceRequestWrapper_hasGetPrivateRenderParameterMap */
      /* Details: "Has a getPrivateRenderParameterMap() method" */
      /* TODO: implement test */
      TestResult tr25 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETPRIVATERENDERPARAMETERMAP);
      
      /* TestCase: ResourceRequestWrapper_getPrivateRenderParameterMap */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr26 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETPRIVATERENDERPARAMETERMAP);
      
      /* TestCase: ResourceRequestWrapper_hasGetCacheability */
      /* Details: "Has a getCacheability() method" */
      /* TODO: implement test */
      TestResult tr27 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETCACHEABILITY);
      
      /* TestCase: ResourceRequestWrapper_getCacheability */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr28 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETCACHEABILITY);
      


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

