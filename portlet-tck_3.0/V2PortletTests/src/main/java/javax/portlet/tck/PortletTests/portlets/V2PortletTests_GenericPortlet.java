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

package javax.portlet.tck.PortletTests.portlets;

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
public class V2PortletTests_GenericPortlet implements Portlet {
   private static final String LOG_CLASS = 
         V2PortletTests_GenericPortlet.class.getName();
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
      ClassChecker cc = new ClassChecker(GenericPortlet.class);

      // Create result objects for the tests

      /* TestCase: GenericPortlet_implementsPortlet1 */
      /* Details: "Implements Portlet" */
      TestResult tr0 = tcd.getTestResultFailed(GENERICPORTLET_IMPLEMENTSPORTLET1);
      {
         tr0.setTcSuccess(cc.implementsInterface(Portlet.class));
      }

      /* TestCase: GenericPortlet_implementsPortlet2 */
      /* Details: "All tests described for the Portlet execute correctly with the GenericPortlet" */
      TestResult tr1 = tcd.getTestResultFailed(GENERICPORTLET_IMPLEMENTSPORTLET2);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_implementsEventPortlet1 */
      /* Details: "Implements EventPortlet" */
      TestResult tr2 = tcd.getTestResultFailed(GENERICPORTLET_IMPLEMENTSEVENTPORTLET1);
      {
         tr2.setTcSuccess(cc.implementsInterface(EventPortlet.class));
      }

      /* TestCase: GenericPortlet_implementsEventPortlet2 */
      /* Details: "All tests described for the EventPortlet execute correctly with the GenericPortlet" */
      TestResult tr3 = tcd.getTestResultFailed(GENERICPORTLET_IMPLEMENTSEVENTPORTLET2);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_implementsResourceServingPortlet1 */
      /* Details: "Implements ResourceServingPortlet" */
      TestResult tr4 = tcd.getTestResultFailed(GENERICPORTLET_IMPLEMENTSRESOURCESERVINGPORTLET1);
      {
         tr4.setTcSuccess(cc.implementsInterface(ResourceServingPortlet.class));
      }

      /* TestCase: GenericPortlet_implementsResourceServingPortlet2 */
      /* Details: "All tests described for the ResourceServingPortlet execute correctly with the GenericPortlet" */
      TestResult tr5 = tcd.getTestResultFailed(GENERICPORTLET_IMPLEMENTSRESOURCESERVINGPORTLET2);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_implementsPortletConfig1 */
      /* Details: "Implements PortletConfig" */
      TestResult tr6 = tcd.getTestResultFailed(GENERICPORTLET_IMPLEMENTSPORTLETCONFIG1);
      {
         tr6.setTcSuccess(cc.implementsInterface(PortletConfig.class));
      }

      /* TestCase: GenericPortlet_implementsPortletConfig2 */
      /* Details: "All tests described for the PortletConfig execute correctly with the GenericPortlet" */
      TestResult tr7 = tcd.getTestResultFailed(GENERICPORTLET_IMPLEMENTSPORTLETCONFIG2);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_constructor */
      /* Details: "Has a GenericPortlet() constructor" */
      TestResult tr8 = tcd.getTestResultFailed(GENERICPORTLET_CONSTRUCTOR);
      {
         String name = "GenericPortlet";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr8.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_hasInitA */
      /* Details: "Has a init() throws javax.portlet.PortletException method" */
      TestResult tr9 = tcd.getTestResultFailed(GENERICPORTLET_HASINITA);
      {
         String name = "init";
         Class<?>[] exceptions = {javax.portlet.PortletException.class};
         Class<?>[] parms = null;
         tr9.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_initA */
      /* Details: "Called when the portlet is initialized" */
      TestResult tr10 = tcd.getTestResultFailed(GENERICPORTLET_INITA);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasInitB */
      /* Details: "Has a init(PortletConfig) throws javax.portlet.PortletException method" */
      TestResult tr11 = tcd.getTestResultFailed(GENERICPORTLET_HASINITB);
      {
         String name = "init";
         Class<?>[] exceptions = {javax.portlet.PortletException.class};
         Class<?>[] parms = {PortletConfig.class};
         tr11.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_initB */
      /* Details: "Called when the portlet is initialized" */
      TestResult tr12 = tcd.getTestResultFailed(GENERICPORTLET_INITB);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasProcessAction */
      /* Details: "Has a processAction(ActionRequest, ActionResponse) throws javax.portlet.PortletException, java.io.IOException method" */
      TestResult tr13 = tcd.getTestResultFailed(GENERICPORTLET_HASPROCESSACTION);
      {
         String name = "processAction";
         Class<?>[] exceptions = {javax.portlet.PortletException.class, java.io.IOException.class};
         Class<?>[] parms = {ActionRequest.class, ActionResponse.class};
         tr13.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_processAction1 */
      /* Details: "If overridden, the Portlet.processAction tests execute correctly" */
      TestResult tr14 = tcd.getTestResultFailed(GENERICPORTLET_PROCESSACTION1);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_processAction2 */
      /* Details: "Dispatches to @ProcessAction annotated method matching the ActionRequest.ACTION_NAME parameter" */
      TestResult tr15 = tcd.getTestResultFailed(GENERICPORTLET_PROCESSACTION2);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_processAction3 */
      /* Details: "Throws PortletException if no matching @ProcessAction annotated method found" */
      TestResult tr16 = tcd.getTestResultFailed(GENERICPORTLET_PROCESSACTION3);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasRender */
      /* Details: "Has a render(RenderRequest, RenderResponse) throws javax.portlet.PortletException, java.io.IOException method" */
      TestResult tr17 = tcd.getTestResultFailed(GENERICPORTLET_HASRENDER);
      {
         String name = "render";
         Class<?>[] exceptions = {javax.portlet.PortletException.class, java.io.IOException.class};
         Class<?>[] parms = {RenderRequest.class, RenderResponse.class};
         tr17.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_render1 */
      /* Details: "If overridden, Portlet.render tests execute correctly" */
      TestResult tr18 = tcd.getTestResultFailed(GENERICPORTLET_RENDER1);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_render2 */
      /* Details: "If RENDER_PART=null, Calls the doHeaders(RenderRequest, RenderResponse) method" */
      TestResult tr19 = tcd.getTestResultFailed(GENERICPORTLET_RENDER2);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_render3 */
      /* Details: "If RENDER_PART=null, Sets the title on RenderResponse with the value returned by the getTitle(RenderRequest) method" */
      TestResult tr20 = tcd.getTestResultFailed(GENERICPORTLET_RENDER3);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_render4 */
      /* Details: "If RENDER_PART=null, Retrieves the next possible portlet modes from the PortletConfig and sets them on the RenderResponse" */
      TestResult tr21 = tcd.getTestResultFailed(GENERICPORTLET_RENDER4);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_render5 */
      /* Details: "If RENDER_PART=null, Calls the DoDispatch(RenderRequest, RenderResponse) method " */
      TestResult tr22 = tcd.getTestResultFailed(GENERICPORTLET_RENDER5);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_render6 */
      /* Details: "If RENDER_PART=RENDER_HEADERS, Calls the doHeaders(RenderRequest, RenderResponse) method" */
      TestResult tr23 = tcd.getTestResultFailed(GENERICPORTLET_RENDER6);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_render7 */
      /* Details: "If RENDER_PART=RENDER_HEADERS, Sets the title on RenderResponse with the value returned by the getTitle(RenderRequest) method" */
      TestResult tr24 = tcd.getTestResultFailed(GENERICPORTLET_RENDER7);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_render8 */
      /* Details: "If RENDER_PART=RENDER_HEADERS, Retrieves the next possible portlet modes from the PortletConfig and sets them on the RenderResponse" */
      TestResult tr25 = tcd.getTestResultFailed(GENERICPORTLET_RENDER8);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_render9 */
      /* Details: "If RENDER_PART=RENDER_MARKUP, Calls the DoDispatch(RenderRequest, RenderResponse) method " */
      TestResult tr26 = tcd.getTestResultFailed(GENERICPORTLET_RENDER9);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_render10 */
      /* Details: "If RENDER_PART=<any other value>, throws PortletException " */
      TestResult tr27 = tcd.getTestResultFailed(GENERICPORTLET_RENDER10);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasGetTitle */
      /* Details: "Has a getTitle() method" */
      TestResult tr28 = tcd.getTestResultFailed(GENERICPORTLET_HASGETTITLE);
      {
         String name = "getTitle";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr28.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_getTitle1 */
      /* Details: "If overridden, the String returned by this method is used as the portlet title" */
      TestResult tr29 = tcd.getTestResultFailed(GENERICPORTLET_GETTITLE1);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_getTitle2 */
      /* Details: "Returns a String containing the title from the portlet resource bundle under the key \"javax.portlet.title\"" */
      TestResult tr30 = tcd.getTestResultFailed(GENERICPORTLET_GETTITLE2);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_getTitle3 */
      /* Details: "Returns null if no title is available from the portlet resource bundle" */
      TestResult tr31 = tcd.getTestResultFailed(GENERICPORTLET_GETTITLE3);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasDoDispatch */
      /* Details: "Has a doDispatch(RenderRequest, RenderResponse) throws javax.portlet.PortletException, java.io.IOException method" */
      TestResult tr32 = tcd.getTestResultFailed(GENERICPORTLET_HASDODISPATCH);
      {
         String name = "doDispatch";
         Class<?>[] exceptions = {javax.portlet.PortletException.class, java.io.IOException.class};
         Class<?>[] parms = {RenderRequest.class, RenderResponse.class};
         tr32.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_doDispatch1 */
      /* Details: "If overridden, is called when markup is to be generated" */
      TestResult tr33 = tcd.getTestResultFailed(GENERICPORTLET_DODISPATCH1);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_doDispatch2 */
      /* Details: "Else, If the WindowState is minimized, no markup method is called and no markup is generated" */
      TestResult tr34 = tcd.getTestResultFailed(GENERICPORTLET_DODISPATCH2);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_doDispatch3 */
      /* Details: "Else, the @RenderMode annotated method matching the current PortletMode is called " */
      TestResult tr35 = tcd.getTestResultFailed(GENERICPORTLET_DODISPATCH3);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_doDispatch4 */
      /* Details: "Else, If the current render mode is \"view\", the doView(RenderRequest, RenderResponse) method is called  " */
      TestResult tr36 = tcd.getTestResultFailed(GENERICPORTLET_DODISPATCH4);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_doDispatch5 */
      /* Details: "Else, If the current render mode is \"edit\", the doEdit(RenderRequest, RenderResponse) method is called  " */
      TestResult tr37 = tcd.getTestResultFailed(GENERICPORTLET_DODISPATCH5);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_doDispatch6 */
      /* Details: "Else, If the current render mode is \"help\", the doHelp(RenderRequest, RenderResponse) method is called  " */
      TestResult tr38 = tcd.getTestResultFailed(GENERICPORTLET_DODISPATCH6);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_doDispatch7 */
      /* Details: "Else, Throws a PortletException" */
      TestResult tr39 = tcd.getTestResultFailed(GENERICPORTLET_DODISPATCH7);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasDoView */
      /* Details: "Has a doView(RenderRequest, RenderResponse) throws javax.portlet.PortletException, java.io.IOException method" */
      TestResult tr40 = tcd.getTestResultFailed(GENERICPORTLET_HASDOVIEW);
      {
         String name = "doView";
         Class<?>[] exceptions = {javax.portlet.PortletException.class, java.io.IOException.class};
         Class<?>[] parms = {RenderRequest.class, RenderResponse.class};
         tr40.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_doView1 */
      /* Details: "If overridden, is called when a render request in view mode occurs" */
      TestResult tr41 = tcd.getTestResultFailed(GENERICPORTLET_DOVIEW1);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_doView2 */
      /* Details: "If not overridden, throws a PortletException" */
      TestResult tr42 = tcd.getTestResultFailed(GENERICPORTLET_DOVIEW2);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasDoEdit */
      /* Details: "Has a doEdit(RenderRequest, RenderResponse) throws javax.portlet.PortletException, java.io.IOException method" */
      TestResult tr43 = tcd.getTestResultFailed(GENERICPORTLET_HASDOEDIT);
      {
         String name = "doEdit";
         Class<?>[] exceptions = {javax.portlet.PortletException.class, java.io.IOException.class};
         Class<?>[] parms = {RenderRequest.class, RenderResponse.class};
         tr43.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_doEdit1 */
      /* Details: "If overridden, is called when a render request in edit mode occurs" */
      TestResult tr44 = tcd.getTestResultFailed(GENERICPORTLET_DOEDIT1);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_doEdit2 */
      /* Details: "If not overridden, throws a PortletException" */
      TestResult tr45 = tcd.getTestResultFailed(GENERICPORTLET_DOEDIT2);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasDoHelp */
      /* Details: "Has a doHelp(RenderRequest, RenderResponse) throws javax.portlet.PortletException, java.io.IOException method" */
      TestResult tr46 = tcd.getTestResultFailed(GENERICPORTLET_HASDOHELP);
      {
         String name = "doHelp";
         Class<?>[] exceptions = {javax.portlet.PortletException.class, java.io.IOException.class};
         Class<?>[] parms = {RenderRequest.class, RenderResponse.class};
         tr46.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_doHelp1 */
      /* Details: "If overridden, is called when a render request in help mode occurs" */
      TestResult tr47 = tcd.getTestResultFailed(GENERICPORTLET_DOHELP1);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_doHelp2 */
      /* Details: "If not overridden, throws a PortletException" */
      TestResult tr48 = tcd.getTestResultFailed(GENERICPORTLET_DOHELP2);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasGetPortletConfig */
      /* Details: "Has a getPortletConfig() method" */
      TestResult tr49 = tcd.getTestResultFailed(GENERICPORTLET_HASGETPORTLETCONFIG);
      {
         String name = "getPortletConfig";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr49.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_getPortletConfig */
      /* Details: "Returns the PortletConfig object for the portlet" */
      TestResult tr50 = tcd.getTestResultFailed(GENERICPORTLET_GETPORTLETCONFIG);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasDestroy */
      /* Details: "Has a destroy() method" */
      TestResult tr51 = tcd.getTestResultFailed(GENERICPORTLET_HASDESTROY);
      {
         String name = "destroy";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr51.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_destroy */
      /* Details: "Called by the portlet container to indicate to a portlet that the portlet is being taken out of service. " */
      TestResult tr52 = tcd.getTestResultFailed(GENERICPORTLET_DESTROY);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasGetPortletName */
      /* Details: "Has a getPortletName() method" */
      TestResult tr53 = tcd.getTestResultFailed(GENERICPORTLET_HASGETPORTLETNAME);
      {
         String name = "getPortletName";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr53.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_getPortletName */
      /* Details: "The tests described for the corresponding PortletConfig method execute correctly" */
      TestResult tr54 = tcd.getTestResultFailed(GENERICPORTLET_GETPORTLETNAME);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasGetPortletContext */
      /* Details: "Has a getPortletContext() method" */
      TestResult tr55 = tcd.getTestResultFailed(GENERICPORTLET_HASGETPORTLETCONTEXT);
      {
         String name = "getPortletContext";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr55.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_getPortletContext */
      /* Details: "The tests described for the corresponding PortletConfig method execute correctly" */
      TestResult tr56 = tcd.getTestResultFailed(GENERICPORTLET_GETPORTLETCONTEXT);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasGetResourceBundle */
      /* Details: "Has a getResourceBundle(java.util.Locale) method" */
      TestResult tr57 = tcd.getTestResultFailed(GENERICPORTLET_HASGETRESOURCEBUNDLE);
      {
         String name = "getResourceBundle";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.util.Locale.class};
         tr57.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_getResourceBundle */
      /* Details: "The tests described for the corresponding PortletConfig method execute correctly" */
      TestResult tr58 = tcd.getTestResultFailed(GENERICPORTLET_GETRESOURCEBUNDLE);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasGetInitParameter */
      /* Details: "Has a getInitParameter(java.lang.String) method" */
      TestResult tr59 = tcd.getTestResultFailed(GENERICPORTLET_HASGETINITPARAMETER);
      {
         String name = "getInitParameter";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {java.lang.String.class};
         tr59.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_getInitParameter */
      /* Details: "The tests described for the corresponding PortletConfig method execute correctly" */
      TestResult tr60 = tcd.getTestResultFailed(GENERICPORTLET_GETINITPARAMETER);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasGetInitParameterNames */
      /* Details: "Has a getInitParameterNames() method" */
      TestResult tr61 = tcd.getTestResultFailed(GENERICPORTLET_HASGETINITPARAMETERNAMES);
      {
         String name = "getInitParameterNames";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr61.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_getInitParameterNames */
      /* Details: "The tests described for the corresponding PortletConfig method execute correctly" */
      TestResult tr62 = tcd.getTestResultFailed(GENERICPORTLET_GETINITPARAMETERNAMES);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasGetProcessingEventQNames */
      /* Details: "Has a getProcessingEventQNames() method" */
      TestResult tr63 = tcd.getTestResultFailed(GENERICPORTLET_HASGETPROCESSINGEVENTQNAMES);
      {
         String name = "getProcessingEventQNames";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr63.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_getProcessingEventQNames */
      /* Details: "The tests described for the corresponding PortletConfig method execute correctly" */
      TestResult tr64 = tcd.getTestResultFailed(GENERICPORTLET_GETPROCESSINGEVENTQNAMES);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasGetPublishingEventQNames */
      /* Details: "Has a getPublishingEventQNames() method" */
      TestResult tr65 = tcd.getTestResultFailed(GENERICPORTLET_HASGETPUBLISHINGEVENTQNAMES);
      {
         String name = "getPublishingEventQNames";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr65.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_getPublishingEventQNames */
      /* Details: "The tests described for the corresponding PortletConfig method execute correctly" */
      TestResult tr66 = tcd.getTestResultFailed(GENERICPORTLET_GETPUBLISHINGEVENTQNAMES);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasGetSupportedLocales */
      /* Details: "Has a getSupportedLocales() method" */
      TestResult tr67 = tcd.getTestResultFailed(GENERICPORTLET_HASGETSUPPORTEDLOCALES);
      {
         String name = "getSupportedLocales";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr67.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_getSupportedLocales */
      /* Details: "The tests described for the corresponding PortletConfig method execute correctly" */
      TestResult tr68 = tcd.getTestResultFailed(GENERICPORTLET_GETSUPPORTEDLOCALES);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasGetContainerRuntimeOptions */
      /* Details: "Has a getContainerRuntimeOptions() method" */
      TestResult tr69 = tcd.getTestResultFailed(GENERICPORTLET_HASGETCONTAINERRUNTIMEOPTIONS);
      {
         String name = "getContainerRuntimeOptions";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr69.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_getContainerRuntimeOptions */
      /* Details: "The tests described for the corresponding PortletConfig method execute correctly" */
      TestResult tr70 = tcd.getTestResultFailed(GENERICPORTLET_GETCONTAINERRUNTIMEOPTIONS);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasServeResource */
      /* Details: "Has a serveResource(ResourceRequest, ResourceResponse) throws javax.portlet.PortletException, java.io.IOException method" */
      TestResult tr71 = tcd.getTestResultFailed(GENERICPORTLET_HASSERVERESOURCE);
      {
         String name = "serveResource";
         Class<?>[] exceptions = {javax.portlet.PortletException.class, java.io.IOException.class};
         Class<?>[] parms = {ResourceRequest.class, ResourceResponse.class};
         tr71.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_serveResource1 */
      /* Details: "Is called when a ResourceURL targeting the portlet is triggered" */
      TestResult tr72 = tcd.getTestResultFailed(GENERICPORTLET_SERVERESOURCE1);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_serveResource2 */
      /* Details: "Forwards the request to the ResourceID value if the method is not overridden and if the resource ID is not null" */
      TestResult tr73 = tcd.getTestResultFailed(GENERICPORTLET_SERVERESOURCE2);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_serveResource3 */
      /* Details: "Does nothing if the method is not overridden and if the resource ID is null" */
      TestResult tr74 = tcd.getTestResultFailed(GENERICPORTLET_SERVERESOURCE3);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasProcessEvent */
      /* Details: "Has a processEvent(EventRequest, EventResponse) throws javax.portlet.PortletException, java.io.IOException method" */
      TestResult tr75 = tcd.getTestResultFailed(GENERICPORTLET_HASPROCESSEVENT);
      {
         String name = "processEvent";
         Class<?>[] exceptions = {javax.portlet.PortletException.class, java.io.IOException.class};
         Class<?>[] parms = {EventRequest.class, EventResponse.class};
         tr75.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_processEvent1 */
      /* Details: "Is called when an Event targeting the portlet occurs" */
      TestResult tr76 = tcd.getTestResultFailed(GENERICPORTLET_PROCESSEVENT1);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_processEvent2 */
      /* Details: "The @ProcessEvent annotated method matching the current Event is called " */
      TestResult tr77 = tcd.getTestResultFailed(GENERICPORTLET_PROCESSEVENT2);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_processEvent3 */
      /* Details: "If there is no matching annotated method, sets the render parameters on the EventResponse to equal the EventRequest parameters" */
      TestResult tr78 = tcd.getTestResultFailed(GENERICPORTLET_PROCESSEVENT3);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasDoHeaders */
      /* Details: "Has a doHeaders(RenderRequest, RenderResponse) method" */
      TestResult tr79 = tcd.getTestResultFailed(GENERICPORTLET_HASDOHEADERS);
      {
         String name = "doHeaders";
         Class<?>[] exceptions = null;
         Class<?>[] parms = {RenderRequest.class, RenderResponse.class};
         tr79.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_doHeaders1 */
      /* Details: "Is called during generic portlet render request processing  " */
      TestResult tr80 = tcd.getTestResultFailed(GENERICPORTLET_DOHEADERS1);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_doHeaders2 */
      /* Details: "The default implementation does nothing" */
      TestResult tr81 = tcd.getTestResultFailed(GENERICPORTLET_DOHEADERS2);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasGetNextPossiblePortletModes */
      /* Details: "Has a getNextPossiblePortletModes() method" */
      TestResult tr82 = tcd.getTestResultFailed(GENERICPORTLET_HASGETNEXTPOSSIBLEPORTLETMODES);
      {
         String name = "getNextPossiblePortletModes";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr82.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_getNextPossiblePortletModes1 */
      /* Details: "Is called during generic portlet render request processing" */
      TestResult tr83 = tcd.getTestResultFailed(GENERICPORTLET_GETNEXTPOSSIBLEPORTLETMODES1);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_getNextPossiblePortletModes2 */
      /* Details: "The default implementation returns null" */
      TestResult tr84 = tcd.getTestResultFailed(GENERICPORTLET_GETNEXTPOSSIBLEPORTLETMODES2);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasGetPublicRenderParameterNames */
      /* Details: "Has a getPublicRenderParameterNames() method" */
      TestResult tr85 = tcd.getTestResultFailed(GENERICPORTLET_HASGETPUBLICRENDERPARAMETERNAMES);
      {
         String name = "getPublicRenderParameterNames";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr85.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_getPublicRenderParameterNames */
      /* Details: "The tests described for the corresponding PortletConfig method execute correctly" */
      TestResult tr86 = tcd.getTestResultFailed(GENERICPORTLET_GETPUBLICRENDERPARAMETERNAMES);
      /* TODO: implement test */

      /* TestCase: GenericPortlet_hasGetDefaultNamespace */
      /* Details: "Has a getDefaultNamespace() method" */
      TestResult tr87 = tcd.getTestResultFailed(GENERICPORTLET_HASGETDEFAULTNAMESPACE);
      {
         String name = "getDefaultNamespace";
         Class<?>[] exceptions = null;
         Class<?>[] parms = null;
         tr87.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      }

      /* TestCase: GenericPortlet_getDefaultNamespace */
      /* Details: "The tests described for the corresponding PortletConfig method execute correctly" */
      TestResult tr88 = tcd.getTestResultFailed(GENERICPORTLET_GETDEFAULTNAMESPACE);
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
      tr82.writeTo(writer);
      tr83.writeTo(writer);
      tr84.writeTo(writer);
      tr85.writeTo(writer);
      tr86.writeTo(writer);
      tr87.writeTo(writer);
      tr88.writeTo(writer);


   }

}

