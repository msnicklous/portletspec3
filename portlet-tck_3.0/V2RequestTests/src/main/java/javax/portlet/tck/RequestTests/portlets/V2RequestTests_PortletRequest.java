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
public class V2RequestTests_PortletRequest implements Portlet {
   private static final String LOG_CLASS = 
         V2RequestTests_PortletRequest.class.getName();
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

      /* TestCase: PortletRequest_fieldUSER_INFO */
      /* Details: "Has String field USER_INFO with value of \"javax.portlet.userinfo\" " */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(PORTLETREQUEST_FIELDUSER_INFO);
      
      /* TestCase: PortletRequest_fieldCCPP_PROFILE */
      /* Details: "Has String field CCPP_PROFILE with value of \"javax.portlet.ccpp\" " */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(PORTLETREQUEST_FIELDCCPP_PROFILE);
      
      /* TestCase: PortletRequest_fieldBASIC_AUTH */
      /* Details: "Has String field BASIC_AUTH with value of \"BASIC\" " */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(PORTLETREQUEST_FIELDBASIC_AUTH);
      
      /* TestCase: PortletRequest_fieldFORM_AUTH */
      /* Details: "Has String field FORM_AUTH with value of \"FORM\" " */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(PORTLETREQUEST_FIELDFORM_AUTH);
      
      /* TestCase: PortletRequest_fieldCLIENT_CERT_AUTH */
      /* Details: "Has String field CLIENT_CERT_AUTH with value of \"CLIENT_CERT\" " */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(PORTLETREQUEST_FIELDCLIENT_CERT_AUTH);
      
      /* TestCase: PortletRequest_fieldDIGEST_AUTH */
      /* Details: "Has String field DIGEST_AUTH with value of \"DIGEST\" " */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(PORTLETREQUEST_FIELDDIGEST_AUTH);
      
      /* TestCase: PortletRequest_fieldACTION_PHASE */
      /* Details: "Has String field ACTION_PHASE with value of \"ACTION_PHASE\" " */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(PORTLETREQUEST_FIELDACTION_PHASE);
      
      /* TestCase: PortletRequest_fieldEVENT_PHASE */
      /* Details: "Has String field EVENT_PHASE with value of \"EVENT_PHASE\" " */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(PORTLETREQUEST_FIELDEVENT_PHASE);
      
      /* TestCase: PortletRequest_fieldRENDER_PHASE */
      /* Details: "Has String field RENDER_PHASE with value of \"RENDER_PHASE\" " */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(PORTLETREQUEST_FIELDRENDER_PHASE);
      
      /* TestCase: PortletRequest_fieldRESOURCE_PHASE */
      /* Details: "Has String field RESOURCE_PHASE with value of \"RESOURCE_PHASE\" " */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(PORTLETREQUEST_FIELDRESOURCE_PHASE);
      
      /* TestCase: PortletRequest_fieldLIFECYCLE_PHASE */
      /* Details: "Has String field LIFECYCLE_PHASE with value of \"javax.portlet.lifecycle_phase\" " */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(PORTLETREQUEST_FIELDLIFECYCLE_PHASE);
      
      /* TestCase: PortletRequest_fieldRENDER_PART */
      /* Details: "Has String field RENDER_PART with value of \"javax.portlet.render_part\" " */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(PORTLETREQUEST_FIELDRENDER_PART);
      
      /* TestCase: PortletRequest_fieldRENDER_HEADERS */
      /* Details: "Has String field RENDER_HEADERS with value of \"RENDER_HEADERS\" " */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(PORTLETREQUEST_FIELDRENDER_HEADERS);
      
      /* TestCase: PortletRequest_fieldRENDER_MARKUP */
      /* Details: "Has String field RENDER_MARKUP with value of \"RENDER_MARKUP\" " */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(PORTLETREQUEST_FIELDRENDER_MARKUP);
      
      /* TestCase: PortletRequest_fieldACTION_SCOPE_ID */
      /* Details: "Has String field ACTION_SCOPE_ID with value of \"javax.portlet.as\" " */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(PORTLETREQUEST_FIELDACTION_SCOPE_ID);
      
      /* TestCase: PortletRequest_hasIsWindowStateAllowed */
      /* Details: "Has a isWindowStateAllowed(WindowState) method" */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(PORTLETREQUEST_HASISWINDOWSTATEALLOWED);
      
      /* TestCase: PortletRequest_isWindowStateAllowed1 */
      /* Details: "Returns true if the specified WindowState is allowed" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(PORTLETREQUEST_ISWINDOWSTATEALLOWED1);
      
      /* TestCase: PortletRequest_isWindowStateAllowed2 */
      /* Details: "Returns false if the specified WindowState is not allowed" */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(PORTLETREQUEST_ISWINDOWSTATEALLOWED2);
      
      /* TestCase: PortletRequest_hasIsPortletModeAllowed */
      /* Details: "Has a isPortletModeAllowed(PortletMode) method" */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(PORTLETREQUEST_HASISPORTLETMODEALLOWED);
      
      /* TestCase: PortletRequest_isPortletModeAllowed1 */
      /* Details: "Returns true if the specified PortletMode is allowed" */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(PORTLETREQUEST_ISPORTLETMODEALLOWED1);
      
      /* TestCase: PortletRequest_isPortletModeAllowed2 */
      /* Details: "Returns false if the specified PortletMode is not allowed" */
      /* TODO: implement test */
      TestResult tr20 = tcd.getTestResultFailed(PORTLETREQUEST_ISPORTLETMODEALLOWED2);
      
      /* TestCase: PortletRequest_hasGetPortletMode */
      /* Details: "Has a getPortletMode() method" */
      /* TODO: implement test */
      TestResult tr21 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETPORTLETMODE);
      
      /* TestCase: PortletRequest_getPortletMode */
      /* Details: "Returns current PortletMode " */
      /* TODO: implement test */
      TestResult tr22 = tcd.getTestResultFailed(PORTLETREQUEST_GETPORTLETMODE);
      
      /* TestCase: PortletRequest_hasGetWindowState */
      /* Details: "Has a getWindowState() method" */
      /* TODO: implement test */
      TestResult tr23 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETWINDOWSTATE);
      
      /* TestCase: PortletRequest_getWindowState */
      /* Details: "Returns current WindowState" */
      /* TODO: implement test */
      TestResult tr24 = tcd.getTestResultFailed(PORTLETREQUEST_GETWINDOWSTATE);
      
      /* TestCase: PortletRequest_hasGetPreferences */
      /* Details: "Has a getPreferences() method" */
      /* TODO: implement test */
      TestResult tr25 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETPREFERENCES);
      
      /* TestCase: PortletRequest_getPreferences */
      /* Details: "Returns the PortletPreferences object associated with the portlet" */
      /* TODO: implement test */
      TestResult tr26 = tcd.getTestResultFailed(PORTLETREQUEST_GETPREFERENCES);
      
      /* TestCase: PortletRequest_hasGetPortletSessionA */
      /* Details: "Has a getPortletSession() method" */
      /* TODO: implement test */
      TestResult tr27 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETPORTLETSESSIONA);
      
      /* TestCase: PortletRequest_getPortletSessionA1 */
      /* Details: "Returns current PortletSession if one already exists" */
      /* TODO: implement test */
      TestResult tr28 = tcd.getTestResultFailed(PORTLETREQUEST_GETPORTLETSESSIONA1);
      
      /* TestCase: PortletRequest_getPortletSessionA2 */
      /* Details: "Returns new PortletSession if one does not already exist" */
      /* TODO: implement test */
      TestResult tr29 = tcd.getTestResultFailed(PORTLETREQUEST_GETPORTLETSESSIONA2);
      
      /* TestCase: PortletRequest_hasGetPortletSessionB */
      /* Details: "Has a getPortletSession(boolean) method" */
      /* TODO: implement test */
      TestResult tr30 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETPORTLETSESSIONB);
      
      /* TestCase: PortletRequest_getPortletSessionB1 */
      /* Details: "If input flag is true, returns current PortletSession if one already exists" */
      /* TODO: implement test */
      TestResult tr31 = tcd.getTestResultFailed(PORTLETREQUEST_GETPORTLETSESSIONB1);
      
      /* TestCase: PortletRequest_getPortletSessionB2 */
      /* Details: "If input flag is true, returns new PortletSession if one does not already exist" */
      /* TODO: implement test */
      TestResult tr32 = tcd.getTestResultFailed(PORTLETREQUEST_GETPORTLETSESSIONB2);
      
      /* TestCase: PortletRequest_getPortletSessionB3 */
      /* Details: "If input flag is false, returns current PortletSession if one already exists" */
      /* TODO: implement test */
      TestResult tr33 = tcd.getTestResultFailed(PORTLETREQUEST_GETPORTLETSESSIONB3);
      
      /* TestCase: PortletRequest_getPortletSessionB4 */
      /* Details: "If input flag is false, returns null if one does not already exist" */
      /* TODO: implement test */
      TestResult tr34 = tcd.getTestResultFailed(PORTLETREQUEST_GETPORTLETSESSIONB4);
      
      /* TestCase: PortletRequest_hasGetProperty */
      /* Details: "Has a getProperty(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr35 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETPROPERTY);
      
      /* TestCase: PortletRequest_getProperty1 */
      /* Details: "If specified request property exists, returns its value " */
      /* TODO: implement test */
      TestResult tr36 = tcd.getTestResultFailed(PORTLETREQUEST_GETPROPERTY1);
      
      /* TestCase: PortletRequest_getProperty2 */
      /* Details: "If specified request property does not exist, returns null" */
      /* TODO: implement test */
      TestResult tr37 = tcd.getTestResultFailed(PORTLETREQUEST_GETPROPERTY2);
      
      /* TestCase: PortletRequest_getProperty3 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      /* TODO: implement test */
      TestResult tr38 = tcd.getTestResultFailed(PORTLETREQUEST_GETPROPERTY3);
      
      /* TestCase: PortletRequest_hasGetProperties */
      /* Details: "Has a getProperties() method" */
      /* TODO: implement test */
      TestResult tr39 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETPROPERTIES);
      
      /* TestCase: PortletRequest_getProperties1 */
      /* Details: "If specified request property exists, returns its values as an Enumeration " */
      /* TODO: implement test */
      TestResult tr40 = tcd.getTestResultFailed(PORTLETREQUEST_GETPROPERTIES1);
      
      /* TestCase: PortletRequest_getProperties2 */
      /* Details: "If specified request property does not exist, returns an empty Enumeration" */
      /* TODO: implement test */
      TestResult tr41 = tcd.getTestResultFailed(PORTLETREQUEST_GETPROPERTIES2);
      
      /* TestCase: PortletRequest_getProperties3 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      /* TODO: implement test */
      TestResult tr42 = tcd.getTestResultFailed(PORTLETREQUEST_GETPROPERTIES3);
      
      /* TestCase: PortletRequest_hasGetPropertyNames */
      /* Details: "Has a getPropertyNames() method" */
      /* TODO: implement test */
      TestResult tr43 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETPROPERTYNAMES);
      
      /* TestCase: PortletRequest_getPropertyNames1 */
      /* Details: "Returns an Enumeration of all request property names" */
      /* TODO: implement test */
      TestResult tr44 = tcd.getTestResultFailed(PORTLETREQUEST_GETPROPERTYNAMES1);
      
      /* TestCase: PortletRequest_getPropertyNames2 */
      /* Details: "Returns an empty Enumeration if there are no request properties defined" */
      /* TODO: implement test */
      TestResult tr45 = tcd.getTestResultFailed(PORTLETREQUEST_GETPROPERTYNAMES2);
      
      /* TestCase: PortletRequest_hasGetPortalContext */
      /* Details: "Has a getPortalContext() method" */
      /* TODO: implement test */
      TestResult tr46 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETPORTALCONTEXT);
      
      /* TestCase: PortletRequest_getPortalContext */
      /* Details: "Returns the context of the portal" */
      /* TODO: implement test */
      TestResult tr47 = tcd.getTestResultFailed(PORTLETREQUEST_GETPORTALCONTEXT);
      
      /* TestCase: PortletRequest_hasGetAuthType */
      /* Details: "Has a getAuthType() method" */
      /* TODO: implement test */
      TestResult tr48 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETAUTHTYPE);
      
      /* TestCase: PortletRequest_getAuthType1 */
      /* Details: "Returns a String indicating the authentication type if the request was authenticated" */
      /* TODO: implement test */
      TestResult tr49 = tcd.getTestResultFailed(PORTLETREQUEST_GETAUTHTYPE1);
      
      /* TestCase: PortletRequest_getAuthType2 */
      /* Details: "Returns null if the request was not authenticated" */
      /* TODO: implement test */
      TestResult tr50 = tcd.getTestResultFailed(PORTLETREQUEST_GETAUTHTYPE2);
      
      /* TestCase: PortletRequest_hasGetContextPath */
      /* Details: "Has a getContextPath() method" */
      /* TODO: implement test */
      TestResult tr51 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETCONTEXTPATH);
      
      /* TestCase: PortletRequest_getContextPath1 */
      /* Details: "Returns a String representing the context path associated with the portlet" */
      /* TODO: implement test */
      TestResult tr52 = tcd.getTestResultFailed(PORTLETREQUEST_GETCONTEXTPATH1);
      
      /* TestCase: PortletRequest_getContextPath2 */
      /* Details: "Returns an empty String if the portlet is deployed in the default context" */
      /* TODO: implement test */
      TestResult tr53 = tcd.getTestResultFailed(PORTLETREQUEST_GETCONTEXTPATH2);
      
      /* TestCase: PortletRequest_getContextPath3 */
      /* Details: "If the context path is not empty, it must start with \"/\" and may not end with \"/\"" */
      /* TODO: implement test */
      TestResult tr54 = tcd.getTestResultFailed(PORTLETREQUEST_GETCONTEXTPATH3);
      
      /* TestCase: PortletRequest_hasGetRemoteUser */
      /* Details: "Has a getRemoteUser() method" */
      /* TODO: implement test */
      TestResult tr55 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETREMOTEUSER);
      
      /* TestCase: PortletRequest_getRemoteUser1 */
      /* Details: "Returns a String representing the login of the user if the request is authenticated" */
      /* TODO: implement test */
      TestResult tr56 = tcd.getTestResultFailed(PORTLETREQUEST_GETREMOTEUSER1);
      
      /* TestCase: PortletRequest_getRemoteUser2 */
      /* Details: "Returns null if the request has not been authenticated" */
      /* TODO: implement test */
      TestResult tr57 = tcd.getTestResultFailed(PORTLETREQUEST_GETREMOTEUSER2);
      
      /* TestCase: PortletRequest_hasGetUserPrincipal */
      /* Details: "Has a getUserPrincipal() method" */
      /* TODO: implement test */
      TestResult tr58 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETUSERPRINCIPAL);
      
      /* TestCase: PortletRequest_getUserPrincipal1 */
      /* Details: "Returns a java.security.Principal object representing the user if the request has been authenticated" */
      /* TODO: implement test */
      TestResult tr59 = tcd.getTestResultFailed(PORTLETREQUEST_GETUSERPRINCIPAL1);
      
      /* TestCase: PortletRequest_getUserPrincipal2 */
      /* Details: "Returns null if the request has not been authenticated" */
      /* TODO: implement test */
      TestResult tr60 = tcd.getTestResultFailed(PORTLETREQUEST_GETUSERPRINCIPAL2);
      
      /* TestCase: PortletRequest_hasIsUserInRole */
      /* Details: "Has a isUserInRole(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr61 = tcd.getTestResultFailed(PORTLETREQUEST_HASISUSERINROLE);
      
      /* TestCase: PortletRequest_isUserInRole1 */
      /* Details: "Returns true if the authenticated user is in the specified role" */
      /* TODO: implement test */
      TestResult tr62 = tcd.getTestResultFailed(PORTLETREQUEST_ISUSERINROLE1);
      
      /* TestCase: PortletRequest_isUserInRole2 */
      /* Details: "Returns false if the authenticated user is not in the specified role" */
      /* TODO: implement test */
      TestResult tr63 = tcd.getTestResultFailed(PORTLETREQUEST_ISUSERINROLE2);
      
      /* TestCase: PortletRequest_isUserInRole3 */
      /* Details: "Returns true if the user is not authenticated" */
      /* TODO: implement test */
      TestResult tr64 = tcd.getTestResultFailed(PORTLETREQUEST_ISUSERINROLE3);
      
      /* TestCase: PortletRequest_hasGetAttribute */
      /* Details: "Has a getAttribute(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr65 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETATTRIBUTE);
      
      /* TestCase: PortletRequest_getAttribute1 */
      /* Details: "Returns a java.lang.Object for the specified attribute name" */
      /* TODO: implement test */
      TestResult tr66 = tcd.getTestResultFailed(PORTLETREQUEST_GETATTRIBUTE1);
      
      /* TestCase: PortletRequest_getAttribute2 */
      /* Details: "Returns null if no attribute with the specified name exists" */
      /* TODO: implement test */
      TestResult tr67 = tcd.getTestResultFailed(PORTLETREQUEST_GETATTRIBUTE2);
      
      /* TestCase: PortletRequest_getAttribute3 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      /* TODO: implement test */
      TestResult tr68 = tcd.getTestResultFailed(PORTLETREQUEST_GETATTRIBUTE3);
      
      /* TestCase: PortletRequest_hasGetAttributeNames */
      /* Details: "Has a getAttributeNames() method" */
      /* TODO: implement test */
      TestResult tr69 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETATTRIBUTENAMES);
      
      /* TestCase: PortletRequest_getAttributeNames1 */
      /* Details: "Returns a java.util.Enumeration<java.lang.String> of the available attribute names" */
      /* TODO: implement test */
      TestResult tr70 = tcd.getTestResultFailed(PORTLETREQUEST_GETATTRIBUTENAMES1);
      
      /* TestCase: PortletRequest_getAttributeNames2 */
      /* Details: "Returns an empty Enumeration if there are no attributes available" */
      /* TODO: implement test */
      TestResult tr71 = tcd.getTestResultFailed(PORTLETREQUEST_GETATTRIBUTENAMES2);
      
      /* TestCase: PortletRequest_hasGetParameter */
      /* Details: "Has a getParameter(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr72 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETPARAMETER);
      
      /* TestCase: PortletRequest_getParameter1 */
      /* Details: "Returns String value of parameter specified by the name" */
      /* TODO: implement test */
      TestResult tr73 = tcd.getTestResultFailed(PORTLETREQUEST_GETPARAMETER1);
      
      /* TestCase: PortletRequest_getParameter2 */
      /* Details: "Returns String value of a public render parameter specified by the name" */
      /* TODO: implement test */
      TestResult tr74 = tcd.getTestResultFailed(PORTLETREQUEST_GETPARAMETER2);
      
      /* TestCase: PortletRequest_getParameter3 */
      /* Details: "Returns null if no parameter exists for the specified name" */
      /* TODO: implement test */
      TestResult tr75 = tcd.getTestResultFailed(PORTLETREQUEST_GETPARAMETER3);
      
      /* TestCase: PortletRequest_getParameter4 */
      /* Details: "Returns first String value from values array if use with a multivalued parameter" */
      /* TODO: implement test */
      TestResult tr76 = tcd.getTestResultFailed(PORTLETREQUEST_GETPARAMETER4);
      
      /* TestCase: PortletRequest_getParameter5 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      /* TODO: implement test */
      TestResult tr77 = tcd.getTestResultFailed(PORTLETREQUEST_GETPARAMETER5);
      
      /* TestCase: PortletRequest_hasGetParameterNames */
      /* Details: "Has a getParameterNames() method" */
      /* TODO: implement test */
      TestResult tr78 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETPARAMETERNAMES);
      
      /* TestCase: PortletRequest_getParameterNames1 */
      /* Details: "Returns a java.util.Enumeration<java.lang.String> of the available parameter names" */
      /* TODO: implement test */
      TestResult tr79 = tcd.getTestResultFailed(PORTLETREQUEST_GETPARAMETERNAMES1);
      
      /* TestCase: PortletRequest_getParameterNames2 */
      /* Details: "Returns an empty Enumeration if there are no parameters available" */
      /* TODO: implement test */
      TestResult tr80 = tcd.getTestResultFailed(PORTLETREQUEST_GETPARAMETERNAMES2);
      
      /* TestCase: PortletRequest_hasGetParameterValues */
      /* Details: "Has a getParameterValues(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr81 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETPARAMETERVALUES);
      
      /* TestCase: PortletRequest_getParameterValues1 */
      /* Details: "Returns String[] value of parameter specified by the name" */
      /* TODO: implement test */
      TestResult tr82 = tcd.getTestResultFailed(PORTLETREQUEST_GETPARAMETERVALUES1);
      
      /* TestCase: PortletRequest_getParameterValues2 */
      /* Details: "Returns String[] value of a public render parameter specified by the name" */
      /* TODO: implement test */
      TestResult tr83 = tcd.getTestResultFailed(PORTLETREQUEST_GETPARAMETERVALUES2);
      
      /* TestCase: PortletRequest_getParameterValues3 */
      /* Details: "Returns null if no parameter exists for the specified name" */
      /* TODO: implement test */
      TestResult tr84 = tcd.getTestResultFailed(PORTLETREQUEST_GETPARAMETERVALUES3);
      
      /* TestCase: PortletRequest_getParameterValues4 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      /* TODO: implement test */
      TestResult tr85 = tcd.getTestResultFailed(PORTLETREQUEST_GETPARAMETERVALUES4);
      
      /* TestCase: PortletRequest_hasGetParameterMap */
      /* Details: "Has a getParameterMap() method" */
      /* TODO: implement test */
      TestResult tr86 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETPARAMETERMAP);
      
      /* TestCase: PortletRequest_getParameterMap1 */
      /* Details: "Returns an java.util.Map<java.lang.String,java.lang.String[]> object for the parameter names and values if parameters are available" */
      /* TODO: implement test */
      TestResult tr87 = tcd.getTestResultFailed(PORTLETREQUEST_GETPARAMETERMAP1);
      
      /* TestCase: PortletRequest_getParameterMap2 */
      /* Details: "The returned map contains all public and private parameters for the request" */
      /* TODO: implement test */
      TestResult tr88 = tcd.getTestResultFailed(PORTLETREQUEST_GETPARAMETERMAP2);
      
      /* TestCase: PortletRequest_getParameterMap3 */
      /* Details: "Returns an empty map if no parameters exist" */
      /* TODO: implement test */
      TestResult tr89 = tcd.getTestResultFailed(PORTLETREQUEST_GETPARAMETERMAP3);
      
      /* TestCase: PortletRequest_hasIsSecure */
      /* Details: "Has a isSecure() method" */
      /* TODO: implement test */
      TestResult tr90 = tcd.getTestResultFailed(PORTLETREQUEST_HASISSECURE);
      
      /* TestCase: PortletRequest_isSecure1 */
      /* Details: "Returns true if the request was made through a secure channel" */
      /* TODO: implement test */
      TestResult tr91 = tcd.getTestResultFailed(PORTLETREQUEST_ISSECURE1);
      
      /* TestCase: PortletRequest_isSecure2 */
      /* Details: "Returns false if the request was not made through a secure channel" */
      /* TODO: implement test */
      TestResult tr92 = tcd.getTestResultFailed(PORTLETREQUEST_ISSECURE2);
      
      /* TestCase: PortletRequest_hasSetAttribute */
      /* Details: "Has a setAttribute(java.lang.String, java.lang.Object) method" */
      /* TODO: implement test */
      TestResult tr93 = tcd.getTestResultFailed(PORTLETREQUEST_HASSETATTRIBUTE);
      
      /* TestCase: PortletRequest_setAttribute1 */
      /* Details: "Stores an attribute object under the specified name in the request" */
      /* TODO: implement test */
      TestResult tr94 = tcd.getTestResultFailed(PORTLETREQUEST_SETATTRIBUTE1);
      
      /* TestCase: PortletRequest_setAttribute2 */
      /* Details: "Removes the attribute by the specified name if the object is null" */
      /* TODO: implement test */
      TestResult tr95 = tcd.getTestResultFailed(PORTLETREQUEST_SETATTRIBUTE2);
      
      /* TestCase: PortletRequest_setAttribute3 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      /* TODO: implement test */
      TestResult tr96 = tcd.getTestResultFailed(PORTLETREQUEST_SETATTRIBUTE3);
      
      /* TestCase: PortletRequest_hasRemoveAttribute */
      /* Details: "Has a removeAttribute(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr97 = tcd.getTestResultFailed(PORTLETREQUEST_HASREMOVEATTRIBUTE);
      
      /* TestCase: PortletRequest_removeAttribute1 */
      /* Details: "Removes the attribute specified by the name from the request" */
      /* TODO: implement test */
      TestResult tr98 = tcd.getTestResultFailed(PORTLETREQUEST_REMOVEATTRIBUTE1);
      
      /* TestCase: PortletRequest_removeAttribute2 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      /* TODO: implement test */
      TestResult tr99 = tcd.getTestResultFailed(PORTLETREQUEST_REMOVEATTRIBUTE2);
      
      /* TestCase: PortletRequest_hasGetRequestedSessionId */
      /* Details: "Has a getRequestedSessionId() method" */
      /* TODO: implement test */
      TestResult tr100 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETREQUESTEDSESSIONID);
      
      /* TestCase: PortletRequest_getRequestedSessionId1 */
      /* Details: "Returns the session ID indicated in the client request" */
      /* TODO: implement test */
      TestResult tr101 = tcd.getTestResultFailed(PORTLETREQUEST_GETREQUESTEDSESSIONID1);
      
      /* TestCase: PortletRequest_getRequestedSessionId2 */
      /* Details: "Returns null if no session ID was indicated in the client request" */
      /* TODO: implement test */
      TestResult tr102 = tcd.getTestResultFailed(PORTLETREQUEST_GETREQUESTEDSESSIONID2);
      
      /* TestCase: PortletRequest_hasIsRequestedSessionIdValid */
      /* Details: "Has a isRequestedSessionIdValid() method" */
      /* TODO: implement test */
      TestResult tr103 = tcd.getTestResultFailed(PORTLETREQUEST_HASISREQUESTEDSESSIONIDVALID);
      
      /* TestCase: PortletRequest_isRequestedSessionIdValid1 */
      /* Details: "Returns true if the session ID is valid" */
      /* TODO: implement test */
      TestResult tr104 = tcd.getTestResultFailed(PORTLETREQUEST_ISREQUESTEDSESSIONIDVALID1);
      
      /* TestCase: PortletRequest_isRequestedSessionIdValid2 */
      /* Details: "Returns false if the session ID is not valid" */
      /* TODO: implement test */
      TestResult tr105 = tcd.getTestResultFailed(PORTLETREQUEST_ISREQUESTEDSESSIONIDVALID2);
      
      /* TestCase: PortletRequest_hasGetResponseContentType */
      /* Details: "Has a getResponseContentType() method" */
      /* TODO: implement test */
      TestResult tr106 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETRESPONSECONTENTTYPE);
      
      /* TestCase: PortletRequest_getResponseContentType1 */
      /* Details: "Returns a String representing the portal preferred content type for the response if the content type is defined in the portlet descriptor  " */
      /* TODO: implement test */
      TestResult tr107 = tcd.getTestResultFailed(PORTLETREQUEST_GETRESPONSECONTENTTYPE1);
      
      /* TestCase: PortletRequest_getResponseContentType2 */
      /* Details: "Returns ??? if the content type is not defined in the portlet descriptor" */
      /* TODO: implement test */
      TestResult tr108 = tcd.getTestResultFailed(PORTLETREQUEST_GETRESPONSECONTENTTYPE2);
      
      /* TestCase: PortletRequest_hasGetResponseContentTypes */
      /* Details: "Has a getResponseContentTypes() method" */
      /* TODO: implement test */
      TestResult tr109 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETRESPONSECONTENTTYPES);
      
      /* TestCase: PortletRequest_getResponseContentTypes1 */
      /* Details: "Returns an java.util.Enumeration<java.lang.String> object representing the portal preferred content types for the response if the content types are defined in the portlet descriptor" */
      /* TODO: implement test */
      TestResult tr110 = tcd.getTestResultFailed(PORTLETREQUEST_GETRESPONSECONTENTTYPES1);
      
      /* TestCase: PortletRequest_getResponseContentTypes2 */
      /* Details: "Returns ??? if the content types are not defined in the portlet descriptor" */
      /* TODO: implement test */
      TestResult tr111 = tcd.getTestResultFailed(PORTLETREQUEST_GETRESPONSECONTENTTYPES2);
      
      /* TestCase: PortletRequest_hasGetLocale */
      /* Details: "Has a getLocale() method" */
      /* TODO: implement test */
      TestResult tr112 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETLOCALE);
      
      /* TestCase: PortletRequest_getLocale */
      /* Details: "Returns an java.util.Locale object representing the preferred Locale for the response" */
      /* TODO: implement test */
      TestResult tr113 = tcd.getTestResultFailed(PORTLETREQUEST_GETLOCALE);
      
      /* TestCase: PortletRequest_hasGetLocales */
      /* Details: "Has a getLocales() method" */
      /* TODO: implement test */
      TestResult tr114 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETLOCALES);
      
      /* TestCase: PortletRequest_getLocales */
      /* Details: "Returns an java.util.Enumeration<java.util.Locale> of the Locales in which the portal will accept content" */
      /* TODO: implement test */
      TestResult tr115 = tcd.getTestResultFailed(PORTLETREQUEST_GETLOCALES);
      
      /* TestCase: PortletRequest_hasGetScheme */
      /* Details: "Has a getScheme() method" */
      /* TODO: implement test */
      TestResult tr116 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETSCHEME);
      
      /* TestCase: PortletRequest_getScheme */
      /* Details: "Returns a String value representing the scheme name for the request" */
      /* TODO: implement test */
      TestResult tr117 = tcd.getTestResultFailed(PORTLETREQUEST_GETSCHEME);
      
      /* TestCase: PortletRequest_hasGetServerName */
      /* Details: "Has a getServerName() method" */
      /* TODO: implement test */
      TestResult tr118 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETSERVERNAME);
      
      /* TestCase: PortletRequest_getServerName */
      /* Details: "Returns a String value representing the host name for the request" */
      /* TODO: implement test */
      TestResult tr119 = tcd.getTestResultFailed(PORTLETREQUEST_GETSERVERNAME);
      
      /* TestCase: PortletRequest_hasGetServerPort */
      /* Details: "Has a getServerPort() method" */
      /* TODO: implement test */
      TestResult tr120 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETSERVERPORT);
      
      /* TestCase: PortletRequest_getServerPort */
      /* Details: "Returns an int value representing the port number for the request" */
      /* TODO: implement test */
      TestResult tr121 = tcd.getTestResultFailed(PORTLETREQUEST_GETSERVERPORT);
      
      /* TestCase: PortletRequest_hasGetWindowID */
      /* Details: "Has a getWindowID() method" */
      /* TODO: implement test */
      TestResult tr122 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETWINDOWID);
      
      /* TestCase: PortletRequest_getWindowID */
      /* Details: "Returns a String value representing the portlet window ID" */
      /* TODO: implement test */
      TestResult tr123 = tcd.getTestResultFailed(PORTLETREQUEST_GETWINDOWID);
      
      /* TestCase: PortletRequest_hasGetCookies */
      /* Details: "Has a getCookies() method" */
      /* TODO: implement test */
      TestResult tr124 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETCOOKIES);
      
      /* TestCase: PortletRequest_getCookies1 */
      /* Details: "Returns a javax.servlet.http.Cookie[] array containing the cookies for this request" */
      /* TODO: implement test */
      TestResult tr125 = tcd.getTestResultFailed(PORTLETREQUEST_GETCOOKIES1);
      
      /* TestCase: PortletRequest_getCookies2 */
      /* Details: "Returns null if no cookies are present" */
      /* TODO: implement test */
      TestResult tr126 = tcd.getTestResultFailed(PORTLETREQUEST_GETCOOKIES2);
      
      /* TestCase: PortletRequest_hasGetPrivateParameterMap */
      /* Details: "Has a getPrivateParameterMap() method" */
      /* TODO: implement test */
      TestResult tr127 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETPRIVATEPARAMETERMAP);
      
      /* TestCase: PortletRequest_getPrivateParameterMap1 */
      /* Details: "Returns an java.util.Map<java.lang.String,java.lang.String[]> object for the private parameter names and values if available" */
      /* TODO: implement test */
      TestResult tr128 = tcd.getTestResultFailed(PORTLETREQUEST_GETPRIVATEPARAMETERMAP1);
      
      /* TestCase: PortletRequest_getPrivateParameterMap2 */
      /* Details: "The returned map is immutable" */
      /* TODO: implement test */
      TestResult tr129 = tcd.getTestResultFailed(PORTLETREQUEST_GETPRIVATEPARAMETERMAP2);
      
      /* TestCase: PortletRequest_getPrivateParameterMap3 */
      /* Details: "Returns an empty map if no private parameters exist" */
      /* TODO: implement test */
      TestResult tr130 = tcd.getTestResultFailed(PORTLETREQUEST_GETPRIVATEPARAMETERMAP3);
      
      /* TestCase: PortletRequest_hasGetPublicParameterMap */
      /* Details: "Has a getPublicParameterMap() method" */
      /* TODO: implement test */
      TestResult tr131 = tcd.getTestResultFailed(PORTLETREQUEST_HASGETPUBLICPARAMETERMAP);
      
      /* TestCase: PortletRequest_getPublicParameterMap1 */
      /* Details: "Returns an java.util.Map<java.lang.String,java.lang.String[]> object for the public parameter names and values if available" */
      /* TODO: implement test */
      TestResult tr132 = tcd.getTestResultFailed(PORTLETREQUEST_GETPUBLICPARAMETERMAP1);
      
      /* TestCase: PortletRequest_getPublicParameterMap2 */
      /* Details: "The returned map is immutable" */
      /* TODO: implement test */
      TestResult tr133 = tcd.getTestResultFailed(PORTLETREQUEST_GETPUBLICPARAMETERMAP2);
      
      /* TestCase: PortletRequest_getPublicParameterMap3 */
      /* Details: "Returns an empty map if no public parameters exist" */
      /* TODO: implement test */
      TestResult tr134 = tcd.getTestResultFailed(PORTLETREQUEST_GETPUBLICPARAMETERMAP3);
      
      /* TestCase: PortletRequest_P3PUserInfos_exists */
      /* Details: "The P3PUserInfos exist as a public static enum" */
      /* TODO: implement test */
      TestResult tr135 = tcd.getTestResultFailed(PORTLETREQUEST_P3PUSERINFOS_EXISTS);
      


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
      tr70.writeTo(writer);
      tr71.writeTo(writer);
      tr72.writeTo(writer);
      tr73.writeTo(writer);
      tr74.writeTo(writer);
      tr75.writeTo(writer);
      tr76.writeTo(writer);
      tr77.writeTo(writer);
      tr78.writeTo(writer);
      tr79.writeTo(writer);
      tr80.writeTo(writer);
      tr81.writeTo(writer);
      tr82.writeTo(writer);
      tr83.writeTo(writer);
      tr84.writeTo(writer);
      tr85.writeTo(writer);
      tr86.writeTo(writer);
      tr87.writeTo(writer);
      tr88.writeTo(writer);
      tr89.writeTo(writer);
      tr90.writeTo(writer);
      tr91.writeTo(writer);
      tr92.writeTo(writer);
      tr93.writeTo(writer);
      tr94.writeTo(writer);
      tr95.writeTo(writer);
      tr96.writeTo(writer);
      tr97.writeTo(writer);
      tr98.writeTo(writer);
      tr99.writeTo(writer);
      tr100.writeTo(writer);
      tr101.writeTo(writer);
      tr102.writeTo(writer);
      tr103.writeTo(writer);
      tr104.writeTo(writer);
      tr105.writeTo(writer);
      tr106.writeTo(writer);
      tr107.writeTo(writer);
      tr108.writeTo(writer);
      tr109.writeTo(writer);
      tr110.writeTo(writer);
      tr111.writeTo(writer);
      tr112.writeTo(writer);
      tr113.writeTo(writer);
      tr114.writeTo(writer);
      tr115.writeTo(writer);
      tr116.writeTo(writer);
      tr117.writeTo(writer);
      tr118.writeTo(writer);
      tr119.writeTo(writer);
      tr120.writeTo(writer);
      tr121.writeTo(writer);
      tr122.writeTo(writer);
      tr123.writeTo(writer);
      tr124.writeTo(writer);
      tr125.writeTo(writer);
      tr126.writeTo(writer);
      tr127.writeTo(writer);
      tr128.writeTo(writer);
      tr129.writeTo(writer);
      tr130.writeTo(writer);
      tr131.writeTo(writer);
      tr132.writeTo(writer);
      tr133.writeTo(writer);
      tr134.writeTo(writer);
      tr135.writeTo(writer);


   }

}

