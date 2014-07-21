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
import javax.portlet.tck.beans.TestResult;

/**
 * This portlet implements several test cases for the JSR 362 TCK. The test case names
 * are defined in the /src/main/resources/xml-resources/additionalTCs.xml
 * file. The build process will integrate the test case names defined in the 
 * additionalTCs.xml file into the complete list of test case names for execution by the driver.
 */
public class V2CompatApiWrapperTests5 implements Portlet {
   private static final String LOG_CLASS = 
         V2CompatApiWrapperTests5.class.getName();
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

      /* TestCase: PortletRequestWrapper_implementsPortletRequest */
      /* Details: "Implements PortletRequest" */
      /* TODO: implement test */
      TestResult tr0 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_IMPLEMENTSPORTLETREQUEST);
      
      /* TestCase: PortletRequestWrapper_constructor */
      /* Details: "Constructs PortletRequestWrapper with specified wrapped PortletRequest object" */
      /* TODO: implement test */
      TestResult tr1 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_CONSTRUCTOR);
      
      /* TestCase: PortletRequestWrapper_hasGetAttribute */
      /* Details: "Has a getAttribute(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr2 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETATTRIBUTE);
      
      /* TestCase: PortletRequestWrapper_getAttribute */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr3 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETATTRIBUTE);
      
      /* TestCase: PortletRequestWrapper_hasGetAttributeNames */
      /* Details: "Has a getAttributeNames() method" */
      /* TODO: implement test */
      TestResult tr4 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETATTRIBUTENAMES);
      
      /* TestCase: PortletRequestWrapper_getAttributeNames */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr5 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETATTRIBUTENAMES);
      
      /* TestCase: PortletRequestWrapper_hasGetAuthType */
      /* Details: "Has a getAuthType() method" */
      /* TODO: implement test */
      TestResult tr6 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETAUTHTYPE);
      
      /* TestCase: PortletRequestWrapper_getAuthType */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr7 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETAUTHTYPE);
      
      /* TestCase: PortletRequestWrapper_hasGetContextPath */
      /* Details: "Has a getContextPath() method" */
      /* TODO: implement test */
      TestResult tr8 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETCONTEXTPATH);
      
      /* TestCase: PortletRequestWrapper_getContextPath */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr9 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETCONTEXTPATH);
      
      /* TestCase: PortletRequestWrapper_hasGetCookies */
      /* Details: "Has a getCookies() method" */
      /* TODO: implement test */
      TestResult tr10 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETCOOKIES);
      
      /* TestCase: PortletRequestWrapper_getCookies */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr11 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETCOOKIES);
      
      /* TestCase: PortletRequestWrapper_hasGetLocale */
      /* Details: "Has a getLocale() method" */
      /* TODO: implement test */
      TestResult tr12 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETLOCALE);
      
      /* TestCase: PortletRequestWrapper_getLocale */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr13 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETLOCALE);
      
      /* TestCase: PortletRequestWrapper_hasGetLocales */
      /* Details: "Has a getLocales() method" */
      /* TODO: implement test */
      TestResult tr14 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETLOCALES);
      
      /* TestCase: PortletRequestWrapper_getLocales */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr15 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETLOCALES);
      
      /* TestCase: PortletRequestWrapper_hasGetParameter */
      /* Details: "Has a getParameter(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr16 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPARAMETER);
      
      /* TestCase: PortletRequestWrapper_getParameter */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr17 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPARAMETER);
      
      /* TestCase: PortletRequestWrapper_hasGetParameterMap */
      /* Details: "Has a getParameterMap() method" */
      /* TODO: implement test */
      TestResult tr18 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPARAMETERMAP);
      
      /* TestCase: PortletRequestWrapper_getParameterMap */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr19 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPARAMETERMAP);
      
      /* TestCase: PortletRequestWrapper_hasGetParameterNames */
      /* Details: "Has a getParameterNames() method" */
      /* TODO: implement test */
      TestResult tr20 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPARAMETERNAMES);
      
      /* TestCase: PortletRequestWrapper_getParameterNames */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr21 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPARAMETERNAMES);
      
      /* TestCase: PortletRequestWrapper_hasGetParameterValues */
      /* Details: "Has a getParameterValues(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr22 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPARAMETERVALUES);
      
      /* TestCase: PortletRequestWrapper_getParameterValues */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr23 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPARAMETERVALUES);
      
      /* TestCase: PortletRequestWrapper_hasGetPortalContext */
      /* Details: "Has a getPortalContext() method" */
      /* TODO: implement test */
      TestResult tr24 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPORTALCONTEXT);
      
      /* TestCase: PortletRequestWrapper_getPortalContext */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr25 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPORTALCONTEXT);
      
      /* TestCase: PortletRequestWrapper_hasGetPortletMode */
      /* Details: "Has a getPortletMode() method" */
      /* TODO: implement test */
      TestResult tr26 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPORTLETMODE);
      
      /* TestCase: PortletRequestWrapper_getPortletMode */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr27 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPORTLETMODE);
      
      /* TestCase: PortletRequestWrapper_hasGetPortletSessionA */
      /* Details: "Has a getPortletSession() method" */
      /* TODO: implement test */
      TestResult tr28 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPORTLETSESSIONA);
      
      /* TestCase: PortletRequestWrapper_getPortletSessionA */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr29 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPORTLETSESSIONA);
      
      /* TestCase: PortletRequestWrapper_hasGetPortletSessionB */
      /* Details: "Has a getPortletSession(boolean) method" */
      /* TODO: implement test */
      TestResult tr30 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPORTLETSESSIONB);
      
      /* TestCase: PortletRequestWrapper_getPortletSessionB */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr31 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPORTLETSESSIONB);
      
      /* TestCase: PortletRequestWrapper_hasGetPreferences */
      /* Details: "Has a getPreferences() method" */
      /* TODO: implement test */
      TestResult tr32 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPREFERENCES);
      
      /* TestCase: PortletRequestWrapper_getPreferences */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr33 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPREFERENCES);
      
      /* TestCase: PortletRequestWrapper_hasGetProperties */
      /* Details: "Has a getProperties(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr34 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPROPERTIES);
      
      /* TestCase: PortletRequestWrapper_getProperties */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr35 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPROPERTIES);
      
      /* TestCase: PortletRequestWrapper_hasGetProperty */
      /* Details: "Has a getProperty(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr36 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPROPERTY);
      
      /* TestCase: PortletRequestWrapper_getProperty */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr37 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPROPERTY);
      
      /* TestCase: PortletRequestWrapper_hasGetPropertyNames */
      /* Details: "Has a getPropertyNames() method" */
      /* TODO: implement test */
      TestResult tr38 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPROPERTYNAMES);
      
      /* TestCase: PortletRequestWrapper_getPropertyNames */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr39 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPROPERTYNAMES);
      
      /* TestCase: PortletRequestWrapper_hasGetRemoteUser */
      /* Details: "Has a getRemoteUser() method" */
      /* TODO: implement test */
      TestResult tr40 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETREMOTEUSER);
      
      /* TestCase: PortletRequestWrapper_getRemoteUser */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr41 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETREMOTEUSER);
      
      /* TestCase: PortletRequestWrapper_hasGetRequestedSessionId */
      /* Details: "Has a getRequestedSessionId() method" */
      /* TODO: implement test */
      TestResult tr42 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETREQUESTEDSESSIONID);
      
      /* TestCase: PortletRequestWrapper_getRequestedSessionId */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr43 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETREQUESTEDSESSIONID);
      
      /* TestCase: PortletRequestWrapper_hasGetResponseContentType */
      /* Details: "Has a getResponseContentType() method" */
      /* TODO: implement test */
      TestResult tr44 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETRESPONSECONTENTTYPE);
      
      /* TestCase: PortletRequestWrapper_getResponseContentType */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr45 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETRESPONSECONTENTTYPE);
      
      /* TestCase: PortletRequestWrapper_hasGetResponseContentTypes */
      /* Details: "Has a getResponseContentTypes() method" */
      /* TODO: implement test */
      TestResult tr46 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETRESPONSECONTENTTYPES);
      
      /* TestCase: PortletRequestWrapper_getResponseContentTypes */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr47 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETRESPONSECONTENTTYPES);
      
      /* TestCase: PortletRequestWrapper_hasGetScheme */
      /* Details: "Has a getScheme() method" */
      /* TODO: implement test */
      TestResult tr48 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETSCHEME);
      
      /* TestCase: PortletRequestWrapper_getScheme */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr49 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETSCHEME);
      
      /* TestCase: PortletRequestWrapper_hasGetServerName */
      /* Details: "Has a getServerName() method" */
      /* TODO: implement test */
      TestResult tr50 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETSERVERNAME);
      
      /* TestCase: PortletRequestWrapper_getServerName */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr51 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETSERVERNAME);
      
      /* TestCase: PortletRequestWrapper_hasGetServerPort */
      /* Details: "Has a getServerPort() method" */
      /* TODO: implement test */
      TestResult tr52 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETSERVERPORT);
      
      /* TestCase: PortletRequestWrapper_getServerPort */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr53 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETSERVERPORT);
      
      /* TestCase: PortletRequestWrapper_hasGetUserPrincipal */
      /* Details: "Has a getUserPrincipal() method" */
      /* TODO: implement test */
      TestResult tr54 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETUSERPRINCIPAL);
      
      /* TestCase: PortletRequestWrapper_getUserPrincipal */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr55 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETUSERPRINCIPAL);
      
      /* TestCase: PortletRequestWrapper_hasGetWindowID */
      /* Details: "Has a getWindowID() method" */
      /* TODO: implement test */
      TestResult tr56 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETWINDOWID);
      
      /* TestCase: PortletRequestWrapper_getWindowID */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr57 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETWINDOWID);
      
      /* TestCase: PortletRequestWrapper_hasGetWindowState */
      /* Details: "Has a getWindowState() method" */
      /* TODO: implement test */
      TestResult tr58 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETWINDOWSTATE);
      
      /* TestCase: PortletRequestWrapper_getWindowState */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr59 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETWINDOWSTATE);
      
      /* TestCase: PortletRequestWrapper_hasIsPortletModeAllowed */
      /* Details: "Has a isPortletModeAllowed(PortletMode) method" */
      /* TODO: implement test */
      TestResult tr60 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASISPORTLETMODEALLOWED);
      
      /* TestCase: PortletRequestWrapper_isPortletModeAllowed */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr61 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_ISPORTLETMODEALLOWED);
      
      /* TestCase: PortletRequestWrapper_hasIsRequestedSessionIdValid */
      /* Details: "Has a isRequestedSessionIdValid() method" */
      /* TODO: implement test */
      TestResult tr62 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASISREQUESTEDSESSIONIDVALID);
      
      /* TestCase: PortletRequestWrapper_isRequestedSessionIdValid */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr63 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_ISREQUESTEDSESSIONIDVALID);
      
      /* TestCase: PortletRequestWrapper_hasIsSecure */
      /* Details: "Has a isSecure() method" */
      /* TODO: implement test */
      TestResult tr64 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASISSECURE);
      
      /* TestCase: PortletRequestWrapper_isSecure */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr65 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_ISSECURE);
      
      /* TestCase: PortletRequestWrapper_hasIsUserInRole */
      /* Details: "Has a isUserInRole(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr66 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASISUSERINROLE);
      
      /* TestCase: PortletRequestWrapper_isUserInRole */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr67 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_ISUSERINROLE);
      
      /* TestCase: PortletRequestWrapper_hasIsWindowStateAllowed */
      /* Details: "Has a isWindowStateAllowed(WindowState) method" */
      /* TODO: implement test */
      TestResult tr68 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASISWINDOWSTATEALLOWED);
      
      /* TestCase: PortletRequestWrapper_isWindowStateAllowed */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr69 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_ISWINDOWSTATEALLOWED);
      
      /* TestCase: PortletRequestWrapper_hasRemoveAttribute */
      /* Details: "Has a removeAttribute(java.lang.String) method" */
      /* TODO: implement test */
      TestResult tr70 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASREMOVEATTRIBUTE);
      
      /* TestCase: PortletRequestWrapper_removeAttribute */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr71 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_REMOVEATTRIBUTE);
      
      /* TestCase: PortletRequestWrapper_hasSetAttribute */
      /* Details: "Has a setAttribute(java.lang.String, java.lang.Object) method" */
      /* TODO: implement test */
      TestResult tr72 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASSETATTRIBUTE);
      
      /* TestCase: PortletRequestWrapper_setAttribute */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr73 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_SETATTRIBUTE);
      
      /* TestCase: PortletRequestWrapper_hasGetRequest */
      /* Details: "Has a getRequest() method" */
      /* TODO: implement test */
      TestResult tr74 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETREQUEST);
      
      /* TestCase: PortletRequestWrapper_getRequest */
      /* Details: "Returns wrapped PortletRequest object" */
      /* TODO: implement test */
      TestResult tr75 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETREQUEST);
      
      /* TestCase: PortletRequestWrapper_hasSetRequest */
      /* Details: "Has a setRequest(PortletRequest) method" */
      /* TODO: implement test */
      TestResult tr76 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASSETREQUEST);
      
      /* TestCase: PortletRequestWrapper_setRequest */
      /* Details: "Allows wrapped PortletRequest object to be set" */
      /* TODO: implement test */
      TestResult tr77 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_SETREQUEST);
      
      /* TestCase: PortletRequestWrapper_hasGetPrivateParameterMap */
      /* Details: "Has a getPrivateParameterMap() method" */
      /* TODO: implement test */
      TestResult tr78 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPRIVATEPARAMETERMAP);
      
      /* TestCase: PortletRequestWrapper_getPrivateParameterMap */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr79 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPRIVATEPARAMETERMAP);
      
      /* TestCase: PortletRequestWrapper_hasGetPublicParameterMap */
      /* Details: "Has a getPublicParameterMap() method" */
      /* TODO: implement test */
      TestResult tr80 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_HASGETPUBLICPARAMETERMAP);
      
      /* TestCase: PortletRequestWrapper_getPublicParameterMap */
      /* Details: "Calls wrapped method" */
      /* TODO: implement test */
      TestResult tr81 = tcd.getTestResultFailed(PORTLETREQUESTWRAPPER_GETPUBLICPARAMETERMAP);
      


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

