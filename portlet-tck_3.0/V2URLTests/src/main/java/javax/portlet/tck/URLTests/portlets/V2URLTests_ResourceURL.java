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

package javax.portlet.tck.URLTests.portlets;

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
public class V2URLTests_ResourceURL implements Portlet {
   private static final String LOG_CLASS = 
         V2URLTests_ResourceURL.class.getName();
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

      /* TestCase: ResourceURL_fieldFULL */
      /* Details: "Has String field FULL with value of "FULL" " */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(RESOURCEURL_FIELDFULL);
      
      /* TestCase: ResourceURL_fieldPAGE */
      /* Details: "Has String field PAGE with value of "PAGE" " */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(RESOURCEURL_FIELDPAGE);
      
      /* TestCase: ResourceURL_fieldPORTLET */
      /* Details: "Has String field PORTLET with value of "PORTLET" " */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(RESOURCEURL_FIELDPORTLET);
      
      /* TestCase: ResourceURL_fieldSHARED */
      /* Details: "Has String field SHARED with value of "SHARED" " */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(RESOURCEURL_FIELDSHARED);
      
      /* TestCase: ResourceURL_extendsBaseURL1 */
      /* Details: "ResourceURL extends BaseURL" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(RESOURCEURL_EXTENDSBASEURL1);
      
      /* TestCase: ResourceURL_extendsBaseURL2 */
      /* Details: "All tests described for the BaseURL execute correctly with the ResourceURL" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(RESOURCEURL_EXTENDSBASEURL2);
      
      /* TestCase: ResourceURL_hasSetResourceID */
      /* Details: "Has a setResourceID(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(RESOURCEURL_HASSETRESOURCEID);
      
      /* TestCase: ResourceURL_setResourceID */
      /* Details: "Sets the specified String as the portlet resource ID" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(RESOURCEURL_SETRESOURCEID);
      
      /* TestCase: ResourceURL_hasGetCacheability */
      /* Details: "Has a getCacheability() method" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(RESOURCEURL_HASGETCACHEABILITY);
      
      /* TestCase: ResourceURL_getCacheability */
      /* Details: "Returns a String containing the cacheability level set on the resource URL" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(RESOURCEURL_GETCACHEABILITY);
      
      /* TestCase: ResourceURL_hasSetCacheability */
      /* Details: "Has a setCacheability(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(RESOURCEURL_HASSETCACHEABILITY);
      
      /* TestCase: ResourceURL_setCacheability1 */
      /* Details: "Sets the cacheability level for the resource URL" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(RESOURCEURL_SETCACHEABILITY1);
      
      /* TestCase: ResourceURL_setCacheability2 */
      /* Details: "Throws IllegalArgumentException if the input parameter does not have a value of "FULL", "PAGE", or "PORTLET"" */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(RESOURCEURL_SETCACHEABILITY2);
      
      /* TestCase: ResourceURL_setCacheability3 */
      /* Details: "Throws IllegalStateException if the specified cacheability level is weaker than the cacheability level for the parent resource URL" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(RESOURCEURL_SETCACHEABILITY3);
      


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


   }

}

