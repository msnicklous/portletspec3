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

package javax.portlet.tck.EnvironmentTests.portlets;

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
public class V2EnvironmentTests_PortletSession implements Portlet {
   private static final String LOG_CLASS = 
         V2EnvironmentTests_PortletSession.class.getName();
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

      /* TestCase: PortletSession_hasGetAttributeA */
      /* Details: "Has a getAttribute(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(PORTLETSESSION_HASGETATTRIBUTEA);
      
      /* TestCase: PortletSession_getAttributeA1 */
      /* Details: "Returns a java.lang.Object for the specified attribute name in the PORTLET_SCOPE" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(PORTLETSESSION_GETATTRIBUTEA1);
      
      /* TestCase: PortletSession_getAttributeA2 */
      /* Details: "Returns null if no attribute with the specified name exists in the PORTLET_SCOPE" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(PORTLETSESSION_GETATTRIBUTEA2);
      
      /* TestCase: PortletSession_getAttributeA3 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(PORTLETSESSION_GETATTRIBUTEA3);
      
      /* TestCase: PortletSession_getAttributeA4 */
      /* Details: "Throws IllegalStateException if the method is called on an invalidated session" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(PORTLETSESSION_GETATTRIBUTEA4);
      
      /* TestCase: PortletSession_hasGetAttributeB */
      /* Details: "Has a getAttribute(java.lang.String, int) method" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(PORTLETSESSION_HASGETATTRIBUTEB);
      
      /* TestCase: PortletSession_getAttributeB1 */
      /* Details: "Returns a java.lang.Object for the specified attribute name in the specified scope" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(PORTLETSESSION_GETATTRIBUTEB1);
      
      /* TestCase: PortletSession_getAttributeB2 */
      /* Details: "Returns null if no attribute with the specified name exists in the specified scope" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(PORTLETSESSION_GETATTRIBUTEB2);
      
      /* TestCase: PortletSession_getAttributeB3 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(PORTLETSESSION_GETATTRIBUTEB3);
      
      /* TestCase: PortletSession_getAttributeB4 */
      /* Details: "Throws IllegalStateException if the method is called on an invalidated session" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(PORTLETSESSION_GETATTRIBUTEB4);
      
      /* TestCase: PortletSession_hasGetAttributeNamesA */
      /* Details: "Has a getAttributeNames() method" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(PORTLETSESSION_HASGETATTRIBUTENAMESA);
      
      /* TestCase: PortletSession_getAttributeNamesA1 */
      /* Details: "Returns a java.util.Enumeration<java.lang.String> of the available attribute names in the PORTLET_SCOPE" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(PORTLETSESSION_GETATTRIBUTENAMESA1);
      
      /* TestCase: PortletSession_getAttributeNamesA2 */
      /* Details: "Returns an empty Enumeration if there are no attributes available in the PORTLET_SCOPE" */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(PORTLETSESSION_GETATTRIBUTENAMESA2);
      
      /* TestCase: PortletSession_hasGetAttributeNamesB */
      /* Details: "Has a getAttributeNames(int) method" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(PORTLETSESSION_HASGETATTRIBUTENAMESB);
      
      /* TestCase: PortletSession_getAttributeNamesB1 */
      /* Details: "Returns a java.util.Enumeration<java.lang.String> of the available attribute names in the specified scope" */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(PORTLETSESSION_GETATTRIBUTENAMESB1);
      
      /* TestCase: PortletSession_getAttributeNamesB2 */
      /* Details: "Returns an empty Enumeration if there are no attributes available in the specified scope" */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(PORTLETSESSION_GETATTRIBUTENAMESB2);
      
      /* TestCase: PortletSession_hasGetCreationTime */
      /* Details: "Has a getCreationTime() method" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(PORTLETSESSION_HASGETCREATIONTIME);
      
      /* TestCase: PortletSession_getCreationTime1 */
      /* Details: "Returns a long containing the time the session was created in milliseconds since 1/1/1970  " */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(PORTLETSESSION_GETCREATIONTIME1);
      
      /* TestCase: PortletSession_getCreationTime2 */
      /* Details: "Throws IllegalStateException if this method is called on an invalidated session" */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(PORTLETSESSION_GETCREATIONTIME2);
      
      /* TestCase: PortletSession_hasGetId */
      /* Details: "Has a getId() method" */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(PORTLETSESSION_HASGETID);
      
      /* TestCase: PortletSession_getId */
      /* Details: "Returns a String containing a unique identifier for the session" */
      /* TODO: implement test */
      TestResult tr20 = tcd.getTestResultFailed(PORTLETSESSION_GETID);
      
      /* TestCase: PortletSession_hasGetLastAccessedTime */
      /* Details: "Has a getLastAccessedTime() method" */
      /* TODO: implement test */
      TestResult tr21 = tcd.getTestResultFailed(PORTLETSESSION_HASGETLASTACCESSEDTIME);
      
      /* TestCase: PortletSession_getLastAccessedTime */
      /* Details: "Returns a long containing the last time the session was accessed in milliseconds since 1/1/1970" */
      /* TODO: implement test */
      TestResult tr22 = tcd.getTestResultFailed(PORTLETSESSION_GETLASTACCESSEDTIME);
      
      /* TestCase: PortletSession_hasGetMaxInactiveInterval */
      /* Details: "Has a getMaxInactiveInterval() method" */
      /* TODO: implement test */
      TestResult tr23 = tcd.getTestResultFailed(PORTLETSESSION_HASGETMAXINACTIVEINTERVAL);
      
      /* TestCase: PortletSession_getMaxInactiveInterval */
      /* Details: "Returns the maximum time interval, in seconds, for which the portlet container keeps this session open between client accesses" */
      /* TODO: implement test */
      TestResult tr24 = tcd.getTestResultFailed(PORTLETSESSION_GETMAXINACTIVEINTERVAL);
      
      /* TestCase: PortletSession_hasInvalidate */
      /* Details: "Has a invalidate() method" */
      /* TODO: implement test */
      TestResult tr25 = tcd.getTestResultFailed(PORTLETSESSION_HASINVALIDATE);
      
      /* TestCase: PortletSession_invalidate1 */
      /* Details: "Invalidates this session (all scopes) and unbinds any objects bound to it" */
      /* TODO: implement test */
      TestResult tr26 = tcd.getTestResultFailed(PORTLETSESSION_INVALIDATE1);
      
      /* TestCase: PortletSession_invalidate2 */
      /* Details: "The underlying HTTP session is also invalidated" */
      /* TODO: implement test */
      TestResult tr27 = tcd.getTestResultFailed(PORTLETSESSION_INVALIDATE2);
      
      /* TestCase: PortletSession_hasIsNew */
      /* Details: "Has a isNew() method" */
      /* TODO: implement test */
      TestResult tr28 = tcd.getTestResultFailed(PORTLETSESSION_HASISNEW);
      
      /* TestCase: PortletSession_isNew1 */
      /* Details: "Returns true if the client has not yet joined the session" */
      /* TODO: implement test */
      TestResult tr29 = tcd.getTestResultFailed(PORTLETSESSION_ISNEW1);
      
      /* TestCase: PortletSession_isNew2 */
      /* Details: "Returns false if the client has joined the session" */
      /* TODO: implement test */
      TestResult tr30 = tcd.getTestResultFailed(PORTLETSESSION_ISNEW2);
      
      /* TestCase: PortletSession_hasRemoveAttributeA */
      /* Details: "Has a removeAttribute(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr31 = tcd.getTestResultFailed(PORTLETSESSION_HASREMOVEATTRIBUTEA);
      
      /* TestCase: PortletSession_removeAttributeA1 */
      /* Details: "Removes the attribute specified by the name from the PORTLET_SCOPE" */
      /* TODO: implement test */
      TestResult tr32 = tcd.getTestResultFailed(PORTLETSESSION_REMOVEATTRIBUTEA1);
      
      /* TestCase: PortletSession_removeAttributeA2 */
      /* Details: "If there is no attribute by the specified name in the the PORTLET_SCOPE, this method does nothing" */
      /* TODO: implement test */
      TestResult tr33 = tcd.getTestResultFailed(PORTLETSESSION_REMOVEATTRIBUTEA2);
      
      /* TestCase: PortletSession_removeAttributeA3 */
      /* Details: "If an attribute was removed, the HttpSessionAttributeListener.attributeRemoved method is called on all HttpSessionAttributeListeners in the web application" */
      /* TODO: implement test */
      TestResult tr34 = tcd.getTestResultFailed(PORTLETSESSION_REMOVEATTRIBUTEA3);
      
      /* TestCase: PortletSession_removeAttributeA4 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      /* TODO: implement test */
      TestResult tr35 = tcd.getTestResultFailed(PORTLETSESSION_REMOVEATTRIBUTEA4);
      
      /* TestCase: PortletSession_hasRemoveAttributeB */
      /* Details: "Has a removeAttribute(java.lang.String, int) method" */
      /* TODO: implement test */
      TestResult tr36 = tcd.getTestResultFailed(PORTLETSESSION_HASREMOVEATTRIBUTEB);
      
      /* TestCase: PortletSession_removeAttributeB1 */
      /* Details: "Removes the attribute specified by the name from the specified scope" */
      /* TODO: implement test */
      TestResult tr37 = tcd.getTestResultFailed(PORTLETSESSION_REMOVEATTRIBUTEB1);
      
      /* TestCase: PortletSession_removeAttributeB2 */
      /* Details: "If there is no attribute by the specified name in the specified scope, this method does nothing" */
      /* TODO: implement test */
      TestResult tr38 = tcd.getTestResultFailed(PORTLETSESSION_REMOVEATTRIBUTEB2);
      
      /* TestCase: PortletSession_removeAttributeB3 */
      /* Details: "If an attribute was removed, the HttpSessionAttributeListener.attributeRemoved method is called on all HttpSessionAttributeListeners in the web application" */
      /* TODO: implement test */
      TestResult tr39 = tcd.getTestResultFailed(PORTLETSESSION_REMOVEATTRIBUTEB3);
      
      /* TestCase: PortletSession_removeAttributeB4 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      /* TODO: implement test */
      TestResult tr40 = tcd.getTestResultFailed(PORTLETSESSION_REMOVEATTRIBUTEB4);
      
      /* TestCase: PortletSession_hasSetAttributeA */
      /* Details: "Has a setAttribute(java.lang.String, java.lang.Object) method" */
      /* TODO: implement test */
      TestResult tr41 = tcd.getTestResultFailed(PORTLETSESSION_HASSETATTRIBUTEA);
      
      /* TestCase: PortletSession_setAttributeA1 */
      /* Details: "Stores an attribute object under the specified name in the PORTLET_SCOPE" */
      /* TODO: implement test */
      TestResult tr42 = tcd.getTestResultFailed(PORTLETSESSION_SETATTRIBUTEA1);
      
      /* TestCase: PortletSession_setAttributeA2 */
      /* Details: "Replaces the attribute by the specified name if the attribute already exists" */
      /* TODO: implement test */
      TestResult tr43 = tcd.getTestResultFailed(PORTLETSESSION_SETATTRIBUTEA2);
      
      /* TestCase: PortletSession_setAttributeA3 */
      /* Details: "Removes the attribute by the specified name if the object is null" */
      /* TODO: implement test */
      TestResult tr44 = tcd.getTestResultFailed(PORTLETSESSION_SETATTRIBUTEA3);
      
      /* TestCase: PortletSession_setAttributeA4 */
      /* Details: "If the attribute object implements HttpSessionBindingListener, its HttpSessionBindingListener.valueBound method is called" */
      /* TODO: implement test */
      TestResult tr45 = tcd.getTestResultFailed(PORTLETSESSION_SETATTRIBUTEA4);
      
      /* TestCase: PortletSession_setAttributeA5 */
      /* Details: "If an existing attribute object implements HttpSessionBindingListener and is replaced, its HttpSessionBindingListener.valueUnbound method is called" */
      /* TODO: implement test */
      TestResult tr46 = tcd.getTestResultFailed(PORTLETSESSION_SETATTRIBUTEA5);
      
      /* TestCase: PortletSession_setAttributeA6 */
      /* Details: "If an attribute was replaced, the HttpSessionAttributeListener.attributeReplaced method is called on all HttpSessionAttributeListeners in the web application" */
      /* TODO: implement test */
      TestResult tr47 = tcd.getTestResultFailed(PORTLETSESSION_SETATTRIBUTEA6);
      
      /* TestCase: PortletSession_setAttributeA7 */
      /* Details: "If a new attribute was added, the HttpSessionAttributeListener.attributeAdded method is called on all HttpSessionAttributeListeners in the web application" */
      /* TODO: implement test */
      TestResult tr48 = tcd.getTestResultFailed(PORTLETSESSION_SETATTRIBUTEA7);
      
      /* TestCase: PortletSession_setAttributeA8 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      /* TODO: implement test */
      TestResult tr49 = tcd.getTestResultFailed(PORTLETSESSION_SETATTRIBUTEA8);
      
      /* TestCase: PortletSession_hasSetAttributeB */
      /* Details: "Has a setAttribute(java.lang.String, java.lang.Object, int) method" */
      /* TODO: implement test */
      TestResult tr50 = tcd.getTestResultFailed(PORTLETSESSION_HASSETATTRIBUTEB);
      
      /* TestCase: PortletSession_setAttributeB1 */
      /* Details: "Stores an attribute object under the specified name in the specified scope" */
      /* TODO: implement test */
      TestResult tr51 = tcd.getTestResultFailed(PORTLETSESSION_SETATTRIBUTEB1);
      
      /* TestCase: PortletSession_setAttributeB2 */
      /* Details: "Replaces the attribute by the specified name if the attribute already exists" */
      /* TODO: implement test */
      TestResult tr52 = tcd.getTestResultFailed(PORTLETSESSION_SETATTRIBUTEB2);
      
      /* TestCase: PortletSession_setAttributeB3 */
      /* Details: "Removes the attribute by the specified name if the object is null" */
      /* TODO: implement test */
      TestResult tr53 = tcd.getTestResultFailed(PORTLETSESSION_SETATTRIBUTEB3);
      
      /* TestCase: PortletSession_setAttributeB4 */
      /* Details: "If the attribute object implements HttpSessionBindingListener, its HttpSessionBindingListener.valueBound method is called" */
      /* TODO: implement test */
      TestResult tr54 = tcd.getTestResultFailed(PORTLETSESSION_SETATTRIBUTEB4);
      
      /* TestCase: PortletSession_setAttributeB5 */
      /* Details: "If an existing attribute object implements HttpSessionBindingListener and is replaced, its HttpSessionBindingListener.valueUnbound method is called" */
      /* TODO: implement test */
      TestResult tr55 = tcd.getTestResultFailed(PORTLETSESSION_SETATTRIBUTEB5);
      
      /* TestCase: PortletSession_setAttributeB6 */
      /* Details: "If an attribute was replaced, the HttpSessionAttributeListener.attributeReplaced method is called on all HttpSessionAttributeListeners in the web application" */
      /* TODO: implement test */
      TestResult tr56 = tcd.getTestResultFailed(PORTLETSESSION_SETATTRIBUTEB6);
      
      /* TestCase: PortletSession_setAttributeB7 */
      /* Details: "If a new attribute was added, the HttpSessionAttributeListener.attributeAdded method is called on all HttpSessionAttributeListeners in the web application" */
      /* TODO: implement test */
      TestResult tr57 = tcd.getTestResultFailed(PORTLETSESSION_SETATTRIBUTEB7);
      
      /* TestCase: PortletSession_setAttributeB8 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      /* TODO: implement test */
      TestResult tr58 = tcd.getTestResultFailed(PORTLETSESSION_SETATTRIBUTEB8);
      
      /* TestCase: PortletSession_hasSetMaxInactiveInterval */
      /* Details: "Has a setMaxInactiveInterval(int) method" */
      /* TODO: implement test */
      TestResult tr59 = tcd.getTestResultFailed(PORTLETSESSION_HASSETMAXINACTIVEINTERVAL);
      
      /* TestCase: PortletSession_setMaxInactiveInterval1 */
      /* Details: "Specifies the time in seconds between client requests before the portlet contaner invalidates the session" */
      /* TODO: implement test */
      TestResult tr60 = tcd.getTestResultFailed(PORTLETSESSION_SETMAXINACTIVEINTERVAL1);
      
      /* TestCase: PortletSession_setMaxInactiveInterval2 */
      /* Details: "If the specified time is negative, the session should never timeout" */
      /* TODO: implement test */
      TestResult tr61 = tcd.getTestResultFailed(PORTLETSESSION_SETMAXINACTIVEINTERVAL2);
      
      /* TestCase: PortletSession_hasGetPortletContext */
      /* Details: "Has a getPortletContext() method" */
      /* TODO: implement test */
      TestResult tr62 = tcd.getTestResultFailed(PORTLETSESSION_HASGETPORTLETCONTEXT);
      
      /* TestCase: PortletSession_getPortletContext */
      /* Details: "Returns the PortletContext object for this session" */
      /* TODO: implement test */
      TestResult tr63 = tcd.getTestResultFailed(PORTLETSESSION_GETPORTLETCONTEXT);
      
      /* TestCase: PortletSession_hasGetAttributeMapA */
      /* Details: "Has a getAttributeMap() method" */
      /* TODO: implement test */
      TestResult tr64 = tcd.getTestResultFailed(PORTLETSESSION_HASGETATTRIBUTEMAPA);
      
      /* TestCase: PortletSession_getAttributeMapA1 */
      /* Details: "Returns an java.util.Map<java.lang.String,java.lang.Object> object for the attributes available in the PORTLET_SCOPE" */
      /* TODO: implement test */
      TestResult tr65 = tcd.getTestResultFailed(PORTLETSESSION_GETATTRIBUTEMAPA1);
      
      /* TestCase: PortletSession_getAttributeMapA2 */
      /* Details: "Returns an empty map if no attributes exist in the PORTLET_SCOPE" */
      /* TODO: implement test */
      TestResult tr66 = tcd.getTestResultFailed(PORTLETSESSION_GETATTRIBUTEMAPA2);
      
      /* TestCase: PortletSession_hasGetAttributeMapB */
      /* Details: "Has a getAttributeMap(int) method" */
      /* TODO: implement test */
      TestResult tr67 = tcd.getTestResultFailed(PORTLETSESSION_HASGETATTRIBUTEMAPB);
      
      /* TestCase: PortletSession_getAttributeMapB1 */
      /* Details: "Returns an java.util.Map<java.lang.String,java.lang.Object> object for the attributes available in the PORTLET_SCOPE" */
      /* TODO: implement test */
      TestResult tr68 = tcd.getTestResultFailed(PORTLETSESSION_GETATTRIBUTEMAPB1);
      
      /* TestCase: PortletSession_getAttributeMapB2 */
      /* Details: "Returns an empty map if no attributes exist in the PORTLET_SCOPE" */
      /* TODO: implement test */
      TestResult tr69 = tcd.getTestResultFailed(PORTLETSESSION_GETATTRIBUTEMAPB2);
      


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
      tr56.writeTo(writer);
      tr57.writeTo(writer);
      tr58.writeTo(writer);
      tr59.writeTo(writer);
      tr60.writeTo(writer);
      tr61.writeTo(writer);
      tr62.writeTo(writer);
      tr63.writeTo(writer);
      tr64.writeTo(writer);
      tr65.writeTo(writer);
      tr66.writeTo(writer);
      tr67.writeTo(writer);
      tr68.writeTo(writer);
      tr69.writeTo(writer);


   }

}

