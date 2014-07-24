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
public class V2WrapperTests_PortletRequestWrapper implements Portlet {
   private static final String LOG_CLASS = 
         V2WrapperTests_PortletRequestWrapper.class.getName();
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
      ClassChecker cc = new ClassChecker(PortletRequestWrapper.class);

      // Create result objects for the tests

      /* TestCase: PortletRequestWrapper_implementsPortletRequest */
      /* Details: "Implements PortletRequest" */
      TestResult tr0 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_IMPLEMENTSPORTLETREQUEST);
      {
         tr0.setTcSuccess(cc.implementsInterface(PortletRequest.class));
      }

      /* TestCase: PortletRequestWrapper_constructor */
      /* Details: "Provides constructor PortletRequestWrapper(PortletRequest) with specified wrapped PortletRequest object" */
      TestResult tr1 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_CONSTRUCTOR);
      {
         Class<?>[] parms = {PortletRequest.class};
         tr1.setTcSuccess(cc.hasConstructor(parms));
      }

      /* TestCase: PortletRequestWrapper_hasGetAttribute */
      /* Details: "Has a getAttribute(java.lang.String) method" */
      TestResult tr2 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETATTRIBUTE);
      {
         String name = "getAttribute";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class};
         tr2.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getAttribute */
      /* Details: "Calls wrapped method" */
      TestResult tr3 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETATTRIBUTE);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetAttributeNames */
      /* Details: "Has a getAttributeNames() method" */
      TestResult tr4 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETATTRIBUTENAMES);
      {
         String name = "getAttributeNames";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr4.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getAttributeNames */
      /* Details: "Calls wrapped method" */
      TestResult tr5 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETATTRIBUTENAMES);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetAuthType */
      /* Details: "Has a getAuthType() method" */
      TestResult tr6 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETAUTHTYPE);
      {
         String name = "getAuthType";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr6.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getAuthType */
      /* Details: "Calls wrapped method" */
      TestResult tr7 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETAUTHTYPE);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetContextPath */
      /* Details: "Has a getContextPath() method" */
      TestResult tr8 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETCONTEXTPATH);
      {
         String name = "getContextPath";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr8.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getContextPath */
      /* Details: "Calls wrapped method" */
      TestResult tr9 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETCONTEXTPATH);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetCookies */
      /* Details: "Has a getCookies() method" */
      TestResult tr10 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETCOOKIES);
      {
         String name = "getCookies";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr10.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getCookies */
      /* Details: "Calls wrapped method" */
      TestResult tr11 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETCOOKIES);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetLocale */
      /* Details: "Has a getLocale() method" */
      TestResult tr12 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETLOCALE);
      {
         String name = "getLocale";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr12.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getLocale */
      /* Details: "Calls wrapped method" */
      TestResult tr13 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETLOCALE);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetLocales */
      /* Details: "Has a getLocales() method" */
      TestResult tr14 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETLOCALES);
      {
         String name = "getLocales";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr14.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getLocales */
      /* Details: "Calls wrapped method" */
      TestResult tr15 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETLOCALES);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetParameter */
      /* Details: "Has a getParameter(java.lang.String) method" */
      TestResult tr16 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPARAMETER);
      {
         String name = "getParameter";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class};
         tr16.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getParameter */
      /* Details: "Calls wrapped method" */
      TestResult tr17 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPARAMETER);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetParameterMap */
      /* Details: "Has a getParameterMap() method" */
      TestResult tr18 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPARAMETERMAP);
      {
         String name = "getParameterMap";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr18.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getParameterMap */
      /* Details: "Calls wrapped method" */
      TestResult tr19 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPARAMETERMAP);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetParameterNames */
      /* Details: "Has a getParameterNames() method" */
      TestResult tr20 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPARAMETERNAMES);
      {
         String name = "getParameterNames";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr20.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getParameterNames */
      /* Details: "Calls wrapped method" */
      TestResult tr21 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPARAMETERNAMES);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetParameterValues */
      /* Details: "Has a getParameterValues(java.lang.String) method" */
      TestResult tr22 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPARAMETERVALUES);
      {
         String name = "getParameterValues";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class};
         tr22.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getParameterValues */
      /* Details: "Calls wrapped method" */
      TestResult tr23 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPARAMETERVALUES);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetPortalContext */
      /* Details: "Has a getPortalContext() method" */
      TestResult tr24 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPORTALCONTEXT);
      {
         String name = "getPortalContext";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr24.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getPortalContext */
      /* Details: "Calls wrapped method" */
      TestResult tr25 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPORTALCONTEXT);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetPortletMode */
      /* Details: "Has a getPortletMode() method" */
      TestResult tr26 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPORTLETMODE);
      {
         String name = "getPortletMode";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr26.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getPortletMode */
      /* Details: "Calls wrapped method" */
      TestResult tr27 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPORTLETMODE);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetPortletSessionA */
      /* Details: "Has a getPortletSession() method" */
      TestResult tr28 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPORTLETSESSIONA);
      {
         String name = "getPortletSession";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr28.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getPortletSessionA */
      /* Details: "Calls wrapped method" */
      TestResult tr29 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPORTLETSESSIONA);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetPortletSessionB */
      /* Details: "Has a getPortletSession(boolean) method" */
      TestResult tr30 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPORTLETSESSIONB);
      {
         String name = "getPortletSession";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {boolean.class};
         tr30.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getPortletSessionB */
      /* Details: "Calls wrapped method" */
      TestResult tr31 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPORTLETSESSIONB);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetPreferences */
      /* Details: "Has a getPreferences() method" */
      TestResult tr32 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPREFERENCES);
      {
         String name = "getPreferences";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr32.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getPreferences */
      /* Details: "Calls wrapped method" */
      TestResult tr33 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPREFERENCES);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetProperties */
      /* Details: "Has a getProperties(java.lang.String) method" */
      TestResult tr34 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPROPERTIES);
      {
         String name = "getProperties";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class};
         tr34.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getProperties */
      /* Details: "Calls wrapped method" */
      TestResult tr35 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPROPERTIES);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetProperty */
      /* Details: "Has a getProperty(java.lang.String) method" */
      TestResult tr36 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPROPERTY);
      {
         String name = "getProperty";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class};
         tr36.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getProperty */
      /* Details: "Calls wrapped method" */
      TestResult tr37 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPROPERTY);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetPropertyNames */
      /* Details: "Has a getPropertyNames() method" */
      TestResult tr38 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPROPERTYNAMES);
      {
         String name = "getPropertyNames";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr38.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getPropertyNames */
      /* Details: "Calls wrapped method" */
      TestResult tr39 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPROPERTYNAMES);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetRemoteUser */
      /* Details: "Has a getRemoteUser() method" */
      TestResult tr40 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETREMOTEUSER);
      {
         String name = "getRemoteUser";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr40.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getRemoteUser */
      /* Details: "Calls wrapped method" */
      TestResult tr41 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETREMOTEUSER);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetRequestedSessionId */
      /* Details: "Has a getRequestedSessionId() method" */
      TestResult tr42 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETREQUESTEDSESSIONID);
      {
         String name = "getRequestedSessionId";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr42.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getRequestedSessionId */
      /* Details: "Calls wrapped method" */
      TestResult tr43 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETREQUESTEDSESSIONID);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetResponseContentType */
      /* Details: "Has a getResponseContentType() method" */
      TestResult tr44 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETRESPONSECONTENTTYPE);
      {
         String name = "getResponseContentType";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr44.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getResponseContentType */
      /* Details: "Calls wrapped method" */
      TestResult tr45 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETRESPONSECONTENTTYPE);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetResponseContentTypes */
      /* Details: "Has a getResponseContentTypes() method" */
      TestResult tr46 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETRESPONSECONTENTTYPES);
      {
         String name = "getResponseContentTypes";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr46.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getResponseContentTypes */
      /* Details: "Calls wrapped method" */
      TestResult tr47 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETRESPONSECONTENTTYPES);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetScheme */
      /* Details: "Has a getScheme() method" */
      TestResult tr48 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETSCHEME);
      {
         String name = "getScheme";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr48.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getScheme */
      /* Details: "Calls wrapped method" */
      TestResult tr49 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETSCHEME);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetServerName */
      /* Details: "Has a getServerName() method" */
      TestResult tr50 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETSERVERNAME);
      {
         String name = "getServerName";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr50.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getServerName */
      /* Details: "Calls wrapped method" */
      TestResult tr51 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETSERVERNAME);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetServerPort */
      /* Details: "Has a getServerPort() method" */
      TestResult tr52 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETSERVERPORT);
      {
         String name = "getServerPort";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr52.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getServerPort */
      /* Details: "Calls wrapped method" */
      TestResult tr53 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETSERVERPORT);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetUserPrincipal */
      /* Details: "Has a getUserPrincipal() method" */
      TestResult tr54 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETUSERPRINCIPAL);
      {
         String name = "getUserPrincipal";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr54.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getUserPrincipal */
      /* Details: "Calls wrapped method" */
      TestResult tr55 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETUSERPRINCIPAL);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetWindowID */
      /* Details: "Has a getWindowID() method" */
      TestResult tr56 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETWINDOWID);
      {
         String name = "getWindowID";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr56.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getWindowID */
      /* Details: "Calls wrapped method" */
      TestResult tr57 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETWINDOWID);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetWindowState */
      /* Details: "Has a getWindowState() method" */
      TestResult tr58 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETWINDOWSTATE);
      {
         String name = "getWindowState";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr58.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getWindowState */
      /* Details: "Calls wrapped method" */
      TestResult tr59 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETWINDOWSTATE);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasIsPortletModeAllowed */
      /* Details: "Has a isPortletModeAllowed(PortletMode) method" */
      TestResult tr60 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASISPORTLETMODEALLOWED);
      {
         String name = "isPortletModeAllowed";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {PortletMode.class};
         tr60.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_isPortletModeAllowed */
      /* Details: "Calls wrapped method" */
      TestResult tr61 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_ISPORTLETMODEALLOWED);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasIsRequestedSessionIdValid */
      /* Details: "Has a isRequestedSessionIdValid() method" */
      TestResult tr62 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASISREQUESTEDSESSIONIDVALID);
      {
         String name = "isRequestedSessionIdValid";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr62.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_isRequestedSessionIdValid */
      /* Details: "Calls wrapped method" */
      TestResult tr63 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_ISREQUESTEDSESSIONIDVALID);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasIsSecure */
      /* Details: "Has a isSecure() method" */
      TestResult tr64 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASISSECURE);
      {
         String name = "isSecure";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr64.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_isSecure */
      /* Details: "Calls wrapped method" */
      TestResult tr65 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_ISSECURE);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasIsUserInRole */
      /* Details: "Has a isUserInRole(java.lang.String) method" */
      TestResult tr66 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASISUSERINROLE);
      {
         String name = "isUserInRole";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class};
         tr66.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_isUserInRole */
      /* Details: "Calls wrapped method" */
      TestResult tr67 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_ISUSERINROLE);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasIsWindowStateAllowed */
      /* Details: "Has a isWindowStateAllowed(WindowState) method" */
      TestResult tr68 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASISWINDOWSTATEALLOWED);
      {
         String name = "isWindowStateAllowed";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {WindowState.class};
         tr68.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_isWindowStateAllowed */
      /* Details: "Calls wrapped method" */
      TestResult tr69 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_ISWINDOWSTATEALLOWED);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasRemoveAttribute */
      /* Details: "Has a removeAttribute(java.lang.String) method" */
      TestResult tr70 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASREMOVEATTRIBUTE);
      {
         String name = "removeAttribute";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class};
         tr70.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_removeAttribute */
      /* Details: "Calls wrapped method" */
      TestResult tr71 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_REMOVEATTRIBUTE);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasSetAttribute */
      /* Details: "Has a setAttribute(java.lang.String, java.lang.Object) method" */
      TestResult tr72 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASSETATTRIBUTE);
      {
         String name = "setAttribute";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class, java.lang.Object.class};
         tr72.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_setAttribute */
      /* Details: "Calls wrapped method" */
      TestResult tr73 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_SETATTRIBUTE);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetRequest */
      /* Details: "Has a getRequest() method" */
      TestResult tr74 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETREQUEST);
      {
         String name = "getRequest";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr74.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getRequest */
      /* Details: "Returns wrapped PortletRequest object" */
      TestResult tr75 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETREQUEST);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasSetRequest */
      /* Details: "Has a setRequest(PortletRequest) method" */
      TestResult tr76 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASSETREQUEST);
      {
         String name = "setRequest";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {PortletRequest.class};
         tr76.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_setRequest */
      /* Details: "Allows wrapped PortletRequest object to be set" */
      TestResult tr77 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_SETREQUEST);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetPrivateParameterMap */
      /* Details: "Has a getPrivateParameterMap() method" */
      TestResult tr78 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPRIVATEPARAMETERMAP);
      {
         String name = "getPrivateParameterMap";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr78.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getPrivateParameterMap */
      /* Details: "Calls wrapped method" */
      TestResult tr79 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPRIVATEPARAMETERMAP);
      /* TODO: implement test */

      /* TestCase: PortletRequestWrapper_hasGetPublicParameterMap */
      /* Details: "Has a getPublicParameterMap() method" */
      TestResult tr80 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPUBLICPARAMETERMAP);
      {
         String name = "getPublicParameterMap";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr80.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: PortletRequestWrapper_getPublicParameterMap */
      /* Details: "Calls wrapped method" */
      TestResult tr81 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPUBLICPARAMETERMAP);
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


   }

}

