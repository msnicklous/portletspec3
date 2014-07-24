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
public class V2WrapperTests_ResourceRequestWrapper implements Portlet {
   private static final String LOG_CLASS = 
         V2WrapperTests_ResourceRequestWrapper.class.getName();
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
      ClassChecker cc = new ClassChecker(ResourceRequestWrapper.class);

      // Create result objects for the tests

      /* TestCase: ResourceRequestWrapper_extendsPortletRequestWrapper */
      /* Details: "Extends PortletRequestWrapper" */
      TestResult tr0 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_EXTENDSPORTLETREQUESTWRAPPER);
      {
         tr0.setTcSuccess(cc.hasSuperclass(PortletRequestWrapper.class));
      }

      /* TestCase: ResourceRequestWrapper_implementsResourceRequest */
      /* Details: "Implements ResourceRequest" */
      TestResult tr1 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_IMPLEMENTSRESOURCEREQUEST);
      {
         tr1.setTcSuccess(cc.implementsInterface(ResourceRequest.class));
      }

      /* TestCase: ResourceRequestWrapper_constructor */
      /* Details: "Provides constructor ResourceRequestWrapper(ResourceRequest) with specified wrapped ResourceRequest object" */
      TestResult tr2 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_CONSTRUCTOR);
      {
         Class<?>[] parms = {ResourceRequest.class};
         tr2.setTcSuccess(cc.hasConstructor(parms));
      }

      /* TestCase: ResourceRequestWrapper_hasGetPortletInputStream */
      /* Details: "Has a getPortletInputStream() throws java.io.IOException method" */
      TestResult tr3 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETPORTLETINPUTSTREAM);
      {
         String name = "getPortletInputStream";
         Class<?>[] exceptions = {java.io.IOException.class};
         Class<?>[] parms = null;
         tr3.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceRequestWrapper_getPortletInputStream */
      /* Details: "Calls wrapped method" */
      TestResult tr4 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETPORTLETINPUTSTREAM);
      /* TODO: implement test */

      /* TestCase: ResourceRequestWrapper_hasGetReader */
      /* Details: "Has a getReader() throws java.io.UnsupportedEncodingException, java.io.IOException method" */
      TestResult tr5 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETREADER);
      {
         String name = "getReader";
         Class<?>[] exceptions = {java.io.UnsupportedEncodingException.class, java.io.IOException.class};
         Class<?>[] parms = null;
         tr5.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceRequestWrapper_getReader */
      /* Details: "Calls wrapped method" */
      TestResult tr6 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETREADER);
      /* TODO: implement test */

      /* TestCase: ResourceRequestWrapper_hasSetCharacterEncoding */
      /* Details: "Has a setCharacterEncoding() throws java.io.UnsupportedEncodingException method" */
      TestResult tr7 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASSETCHARACTERENCODING);
      {
         String name = "setCharacterEncoding";
         Class<?>[] exceptions = {java.io.UnsupportedEncodingException.class};
         Class<?>[] parms = null;
         tr7.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceRequestWrapper_setCharacterEncoding */
      /* Details: "Calls wrapped method" */
      TestResult tr8 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_SETCHARACTERENCODING);
      /* TODO: implement test */

      /* TestCase: ResourceRequestWrapper_hasGetRequest */
      /* Details: "Has a getRequest() method" */
      TestResult tr9 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETREQUEST);
      {
         String name = "getRequest";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr9.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceRequestWrapper_getRequest */
      /* Details: "Returns wrapped ResourceRequest object" */
      TestResult tr10 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETREQUEST);
      /* TODO: implement test */

      /* TestCase: ResourceRequestWrapper_hasSetRequest */
      /* Details: "Has a setRequest(ResourceRequest) method" */
      TestResult tr11 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASSETREQUEST);
      {
         String name = "setRequest";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {ResourceRequest.class};
         tr11.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceRequestWrapper_setRequest */
      /* Details: "Allows wrapped ResourceRequest object to be set" */
      TestResult tr12 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_SETREQUEST);
      /* TODO: implement test */

      /* TestCase: ResourceRequestWrapper_hasGetCharacterEncoding */
      /* Details: "Has a getCharacterEncoding() method" */
      TestResult tr13 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETCHARACTERENCODING);
      {
         String name = "getCharacterEncoding";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr13.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceRequestWrapper_getCharacterEncoding */
      /* Details: "Calls wrapped method" */
      TestResult tr14 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETCHARACTERENCODING);
      /* TODO: implement test */

      /* TestCase: ResourceRequestWrapper_hasGetContentLength */
      /* Details: "Has a getContentLength() method" */
      TestResult tr15 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETCONTENTLENGTH);
      {
         String name = "getContentLength";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr15.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceRequestWrapper_getContentLength */
      /* Details: "Calls wrapped method" */
      TestResult tr16 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETCONTENTLENGTH);
      /* TODO: implement test */

      /* TestCase: ResourceRequestWrapper_hasGetContentType */
      /* Details: "Has a getContentType() method" */
      TestResult tr17 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETCONTENTTYPE);
      {
         String name = "getContentType";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr17.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceRequestWrapper_getContentType */
      /* Details: "Calls wrapped method" */
      TestResult tr18 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETCONTENTTYPE);
      /* TODO: implement test */

      /* TestCase: ResourceRequestWrapper_hasGetETag */
      /* Details: "Has a getETag() method" */
      TestResult tr19 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETETAG);
      {
         String name = "getETag";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr19.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceRequestWrapper_getETag */
      /* Details: "Calls wrapped method" */
      TestResult tr20 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETETAG);
      /* TODO: implement test */

      /* TestCase: ResourceRequestWrapper_hasGetMethod */
      /* Details: "Has a getMethod() method" */
      TestResult tr21 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETMETHOD);
      {
         String name = "getMethod";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr21.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceRequestWrapper_getMethod */
      /* Details: "Calls wrapped method" */
      TestResult tr22 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETMETHOD);
      /* TODO: implement test */

      /* TestCase: ResourceRequestWrapper_hasGetResourceID */
      /* Details: "Has a getResourceID() method" */
      TestResult tr23 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETRESOURCEID);
      {
         String name = "getResourceID";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr23.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceRequestWrapper_getResourceID */
      /* Details: "Calls wrapped method" */
      TestResult tr24 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETRESOURCEID);
      /* TODO: implement test */

      /* TestCase: ResourceRequestWrapper_hasGetPrivateRenderParameterMap */
      /* Details: "Has a getPrivateRenderParameterMap() method" */
      TestResult tr25 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETPRIVATERENDERPARAMETERMAP);
      {
         String name = "getPrivateRenderParameterMap";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr25.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceRequestWrapper_getPrivateRenderParameterMap */
      /* Details: "Calls wrapped method" */
      TestResult tr26 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETPRIVATERENDERPARAMETERMAP);
      /* TODO: implement test */

      /* TestCase: ResourceRequestWrapper_hasGetCacheability */
      /* Details: "Has a getCacheability() method" */
      TestResult tr27 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_HASGETCACHEABILITY);
      {
         String name = "getCacheability";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr27.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: ResourceRequestWrapper_getCacheability */
      /* Details: "Calls wrapped method" */
      TestResult tr28 = tcd.getTestResultFailed(RESOURCEREQUESTWRAPPER_GETCACHEABILITY);
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


   }

}

