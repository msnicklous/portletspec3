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

package javax.portlet.tck.FilterTests.portlets;

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
public class V2CompatApiFilterTests1 implements Portlet {
   private static final String LOG_CLASS = 
         V2CompatApiFilterTests1.class.getName();
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

      /* TestCase: FilterChain_hasDoFilterForAction */
      /* Details: "Has a doFilter(ActionRequest, ActionResponse) method" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(FILTERCHAIN_HASDOFILTERFORACTION);
      
      /* TestCase: FilterChain_invokeActionFilter */
      /* Details: "Invoking doFilter(ActionRequest, ActionResponse) causes next filter to be invoked" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(FILTERCHAIN_INVOKEACTIONFILTER);
      
      /* TestCase: FilterChain_invokeActionFilter2 */
      /* Details: "Invoking doFilter(ActionRequest, ActionResponse) causes portlet action method to be invoked" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(FILTERCHAIN_INVOKEACTIONFILTER2);
      
      /* TestCase: FilterChain_invokeActionException */
      /* Details: "Invoking doFilter(ActionRequest, ActionResponse) throws PortletException" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(FILTERCHAIN_INVOKEACTIONEXCEPTION);
      
      /* TestCase: FilterChain_invokeActionException2 */
      /* Details: "Invoking doFilter(ActionRequest, ActionResponse) throws IOException" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(FILTERCHAIN_INVOKEACTIONEXCEPTION2);
      
      /* TestCase: FilterChain_hasDoFilterForEvent */
      /* Details: "Has a doFilter(EventRequest, EventResponse) method" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(FILTERCHAIN_HASDOFILTERFOREVENT);
      
      /* TestCase: FilterChain_invokeEventFilter */
      /* Details: "Invoking doFilter(EventRequest, EventResponse) causes next filter to be invoked" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(FILTERCHAIN_INVOKEEVENTFILTER);
      
      /* TestCase: FilterChain_invokeEventFilter2 */
      /* Details: "Invoking doFilter(EventRequest, EventResponse) causes portlet Event method to be invoked" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(FILTERCHAIN_INVOKEEVENTFILTER2);
      
      /* TestCase: FilterChain_invokeEventException */
      /* Details: "Invoking doFilter(EventRequest, EventResponse) throws PortletException" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(FILTERCHAIN_INVOKEEVENTEXCEPTION);
      
      /* TestCase: FilterChain_invokeEventException2 */
      /* Details: "Invoking doFilter(EventRequest, EventResponse) throws IOException" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(FILTERCHAIN_INVOKEEVENTEXCEPTION2);
      
      /* TestCase: FilterChain_hasDoFilterForRender */
      /* Details: "Has a doFilter(RenderRequest, RenderResponse) method" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(FILTERCHAIN_HASDOFILTERFORRENDER);
      
      /* TestCase: FilterChain_invokeRenderFilter */
      /* Details: "Invoking doFilter(RenderRequest, RenderResponse) causes next filter to be invoked" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(FILTERCHAIN_INVOKERENDERFILTER);
      
      /* TestCase: FilterChain_invokeRenderFilter2 */
      /* Details: "Invoking doFilter(RenderRequest, RenderResponse) causes portlet Render method to be invoked" */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(FILTERCHAIN_INVOKERENDERFILTER2);
      
      /* TestCase: FilterChain_invokeRenderException */
      /* Details: "Invoking doFilter(RenderRequest, RenderResponse) throws PortletException" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(FILTERCHAIN_INVOKERENDEREXCEPTION);
      
      /* TestCase: FilterChain_invokeRenderException2 */
      /* Details: "Invoking doFilter(RenderRequest, RenderResponse) throws IOException" */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(FILTERCHAIN_INVOKERENDEREXCEPTION2);
      
      /* TestCase: FilterChain_hasDoFilterForResource */
      /* Details: "Has a doFilter(ResourceRequest, ResourceResponse) method" */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(FILTERCHAIN_HASDOFILTERFORRESOURCE);
      
      /* TestCase: FilterChain_invokeResourceFilter */
      /* Details: "Invoking doFilter(ResourceRequest, ResourceResponse) causes next filter to be invoked" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(FILTERCHAIN_INVOKERESOURCEFILTER);
      
      /* TestCase: FilterChain_invokeResourceFilter2 */
      /* Details: "Invoking doFilter(ResourceRequest, ResourceResponse) causes portlet Resource method to be invoked" */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(FILTERCHAIN_INVOKERESOURCEFILTER2);
      
      /* TestCase: FilterChain_invokeResourceException */
      /* Details: "Invoking doFilter(ResourceRequest, ResourceResponse) throws PortletException" */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(FILTERCHAIN_INVOKERESOURCEEXCEPTION);
      
      /* TestCase: FilterChain_invokeResourceException2 */
      /* Details: "Invoking doFilter(ResourceRequest, ResourceResponse) throws IOException" */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(FILTERCHAIN_INVOKERESOURCEEXCEPTION2);
      


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


   }

}

