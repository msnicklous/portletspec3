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
import javax.portlet.tck.beans.TestResult;

/**
 * This portlet implements several test cases for the JSR 362 TCK. The test case names
 * are defined in the /src/main/resources/xml-resources/additionalTCs.xml
 * file. The build process will integrate the test case names defined in the 
 * additionalTCs.xml file into the complete list of test case names for execution by the driver.
 */
public class V2CompatApiRequestTests5 implements Portlet {
   private static final String LOG_CLASS = 
         V2CompatApiRequestTests5.class.getName();
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

      /* TestCase: ResourceRequest_extendsClientDataRequest1 */
      /* Details: "ResourceRequest extends ClientDataRequest" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(RESOURCEREQUEST_EXTENDSCLIENTDATAREQUEST1);
      
      /* TestCase: ResourceRequest_extendsClientDataRequest2 */
      /* Details: "All tests described for the ClientDataRequest execute correctly with the ResourceRequest" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(RESOURCEREQUEST_EXTENDSCLIENTDATAREQUEST2);
      
      /* TestCase: ResourceRequest_extendsClientDataRequest3 */
      /* Details: "All tests described for the PortletRequest execute correctly with the ResourceRequest" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(RESOURCEREQUEST_EXTENDSCLIENTDATAREQUEST3);
      
      /* TestCase: ResourceRequest_fieldETAG */
      /* Details: "Has String field ETAG with value of "portlet.ETag" " */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(RESOURCEREQUEST_FIELDETAG);
      
      /* TestCase: ResourceRequest_hasgetETag */
      /* Details: "Has a getETag() method" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(RESOURCEREQUEST_HASGETETAG);
      
      /* TestCase: ResourceRequest_getETag1 */
      /* Details: "Returns a String containing the validation tag if the portlet container has a cached response for this request" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(RESOURCEREQUEST_GETETAG1);
      
      /* TestCase: ResourceRequest_getETag2 */
      /* Details: "Returns null if there is no cached response" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(RESOURCEREQUEST_GETETAG2);
      
      /* TestCase: ResourceRequest_hasgetResourceID */
      /* Details: "Has a getResourceID() method" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(RESOURCEREQUEST_HASGETRESOURCEID);
      
      /* TestCase: ResourceRequest_getResourceID1 */
      /* Details: "Returns a String containing the resource ID set on the resource URL" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(RESOURCEREQUEST_GETRESOURCEID1);
      
      /* TestCase: ResourceRequest_getResourceID2 */
      /* Details: "Returns null if no resource ID was set on the URL" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(RESOURCEREQUEST_GETRESOURCEID2);
      
      /* TestCase: ResourceRequest_hasgetPrivateRenderParameterMap */
      /* Details: "Has a getPrivateRenderParameterMap() method" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(RESOURCEREQUEST_HASGETPRIVATERENDERPARAMETERMAP);
      
      /* TestCase: ResourceRequest_getPrivateRenderParameterMap1 */
      /* Details: "Returns a java.util.Map<java.lang.String,java.lang.String[]> object containing the private render parameters for the request" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(RESOURCEREQUEST_GETPRIVATERENDERPARAMETERMAP1);
      
      /* TestCase: ResourceRequest_getPrivateRenderParameterMap2 */
      /* Details: "The returned map does not contain the resource parameters set on the URL" */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(RESOURCEREQUEST_GETPRIVATERENDERPARAMETERMAP2);
      
      /* TestCase: ResourceRequest_getPrivateRenderParameterMap3 */
      /* Details: "The returned map is immutable" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(RESOURCEREQUEST_GETPRIVATERENDERPARAMETERMAP3);
      
      /* TestCase: ResourceRequest_getPrivateRenderParameterMap4 */
      /* Details: "Returns an empty map if there are no private render parameters" */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(RESOURCEREQUEST_GETPRIVATERENDERPARAMETERMAP4);
      
      /* TestCase: ResourceRequest_hasgetResponseContentType */
      /* Details: "Has a getResponseContentType() method" */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(RESOURCEREQUEST_HASGETRESPONSECONTENTTYPE);
      
      /* TestCase: ResourceRequest_getResponseContentType */
      /* Details: "Returns a String containing the preferred content type for the resonse" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(RESOURCEREQUEST_GETRESPONSECONTENTTYPE);
      
      /* TestCase: ResourceRequest_hasgetResponseContentTypes */
      /* Details: "Has a getResponseContentTypes() method" */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(RESOURCEREQUEST_HASGETRESPONSECONTENTTYPES);
      
      /* TestCase: ResourceRequest_getResponseContentTypes */
      /* Details: "Returns an java.util.Enumeration<java.lang.String> object containing the content types that will be accepted for the response" */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(RESOURCEREQUEST_GETRESPONSECONTENTTYPES);
      
      /* TestCase: ResourceRequest_hasgetCacheability */
      /* Details: "Has a getCacheability() method" */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(RESOURCEREQUEST_HASGETCACHEABILITY);
      
      /* TestCase: ResourceRequest_getCacheability */
      /* Details: "Returns a String containing the cache level of the resource request" */
      /* TODO: implement test */
      TestResult tr20 = tcd.getTestResultFailed(RESOURCEREQUEST_GETCACHEABILITY);
      


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


   }

}

