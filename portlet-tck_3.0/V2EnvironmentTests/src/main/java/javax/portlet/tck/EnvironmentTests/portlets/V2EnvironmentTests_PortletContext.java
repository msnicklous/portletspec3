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
public class V2EnvironmentTests_PortletContext implements Portlet {
   private static final String LOG_CLASS = 
         V2EnvironmentTests_PortletContext.class.getName();
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
      // TODO: access the class under test and uncomment this code.
      // ClassChecker cc = new ClassChecker(PortletContext);

      // Create result objects for the tests

      /* TestCase: PortletContext_hasGetServerInfo */
      /* Details: "Has a getServerInfo() method" */
      TestResult tr0 = tcd.getTestResultFailed(PORTLETCONTEXT_HASGETSERVERINFO);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getServerInfo";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr0.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_getServerInfo */
      /* Details: "" */
      TestResult tr1 = tcd.getTestResultFailed(PORTLETCONTEXT_GETSERVERINFO);
      /* TODO: implement test */

      /* TestCase: PortletContext_getServerInfo1 */
      /* Details: "Returns a String containing information about the portlet container" */
      TestResult tr2 = tcd.getTestResultFailed(PORTLETCONTEXT_GETSERVERINFO1);
      /* TODO: implement test */

      /* TestCase: PortletContext_getServerInfo2 */
      /* Details: "The returned string is of the form \"([^ ]+)/([^ ]+) *(.*)\", where $1 is the portal name, $2 is the version, and $3 is optional additional information" */
      TestResult tr3 = tcd.getTestResultFailed(PORTLETCONTEXT_GETSERVERINFO2);
      /* TODO: implement test */

      /* TestCase: PortletContext_getServerInfo3 */
      /* Details: "The returned string contains the container name" */
      TestResult tr4 = tcd.getTestResultFailed(PORTLETCONTEXT_GETSERVERINFO3);
      /* TODO: implement test */

      /* TestCase: PortletContext_getServerInfo4 */
      /* Details: "The returned string contains the container version" */
      TestResult tr5 = tcd.getTestResultFailed(PORTLETCONTEXT_GETSERVERINFO4);
      /* TODO: implement test */

      /* TestCase: PortletContext_getServerInfo5 */
      /* Details: "The returned string may not be null" */
      TestResult tr6 = tcd.getTestResultFailed(PORTLETCONTEXT_GETSERVERINFO5);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasGetRequestDispatcher */
      /* Details: "Has a getRequestDispatcher(java.lang.String) method" */
      TestResult tr7 = tcd.getTestResultFailed(PORTLETCONTEXT_HASGETREQUESTDISPATCHER);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getRequestDispatcher";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = {java.lang.String.class};
      //    tr7.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_getRequestDispatcher1 */
      /* Details: "Returns a PortletRequestDispatcher for the specified path" */
      TestResult tr8 = tcd.getTestResultFailed(PORTLETCONTEXT_GETREQUESTDISPATCHER1);
      /* TODO: implement test */

      /* TestCase: PortletContext_getRequestDispatcher2 */
      /* Details: "Returns null if the specified path does not begin with \"/\"" */
      TestResult tr9 = tcd.getTestResultFailed(PORTLETCONTEXT_GETREQUESTDISPATCHER2);
      /* TODO: implement test */

      /* TestCase: PortletContext_getRequestDispatcher3 */
      /* Details: "Returns null if any other error occurs" */
      TestResult tr10 = tcd.getTestResultFailed(PORTLETCONTEXT_GETREQUESTDISPATCHER3);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasGetNamedDispatcher */
      /* Details: "Has a getNamedDispatcher(java.lang.String) method" */
      TestResult tr11 = tcd.getTestResultFailed(PORTLETCONTEXT_HASGETNAMEDDISPATCHER);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getNamedDispatcher";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = {java.lang.String.class};
      //    tr11.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_getNamedDispatcher1 */
      /* Details: "Returns a PortletRequestDispatcher for the specified servlet name" */
      TestResult tr12 = tcd.getTestResultFailed(PORTLETCONTEXT_GETNAMEDDISPATCHER1);
      /* TODO: implement test */

      /* TestCase: PortletContext_getNamedDispatcher2 */
      /* Details: "Returns null if an error occurs" */
      TestResult tr13 = tcd.getTestResultFailed(PORTLETCONTEXT_GETNAMEDDISPATCHER2);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasGetResourceAsStream */
      /* Details: "Has a getResourceAsStream(java.lang.String) method" */
      TestResult tr14 = tcd.getTestResultFailed(PORTLETCONTEXT_HASGETRESOURCEASSTREAM);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getResourceAsStream";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = {java.lang.String.class};
      //    tr14.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_getResourceAsStream1 */
      /* Details: "Returns a java.io.InputStream for the resource at the specified path" */
      TestResult tr15 = tcd.getTestResultFailed(PORTLETCONTEXT_GETRESOURCEASSTREAM1);
      /* TODO: implement test */

      /* TestCase: PortletContext_getResourceAsStream2 */
      /* Details: "Protected resources can be accessed by prefixing the path with \"/WEB-INF/\"" */
      TestResult tr16 = tcd.getTestResultFailed(PORTLETCONTEXT_GETRESOURCEASSTREAM2);
      /* TODO: implement test */

      /* TestCase: PortletContext_getResourceAsStream3 */
      /* Details: "Returns null if no resource exists at the specified path" */
      TestResult tr17 = tcd.getTestResultFailed(PORTLETCONTEXT_GETRESOURCEASSTREAM3);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasGetMajorVersion */
      /* Details: "Has a getMajorVersion() method" */
      TestResult tr18 = tcd.getTestResultFailed(PORTLETCONTEXT_HASGETMAJORVERSION);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getMajorVersion";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr18.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_getMajorVersion */
      /* Details: "Returns the major version of the portlet API supported by the container " */
      TestResult tr19 = tcd.getTestResultFailed(PORTLETCONTEXT_GETMAJORVERSION);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasGetMinorVersion */
      /* Details: "Has a getMinorVersion() method" */
      TestResult tr20 = tcd.getTestResultFailed(PORTLETCONTEXT_HASGETMINORVERSION);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getMinorVersion";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr20.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_getMinorVersion */
      /* Details: "Returns the minor version of the portlet API supported by the container" */
      TestResult tr21 = tcd.getTestResultFailed(PORTLETCONTEXT_GETMINORVERSION);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasGetMimeType */
      /* Details: "Has a getMimeType(java.lang.String) method" */
      TestResult tr22 = tcd.getTestResultFailed(PORTLETCONTEXT_HASGETMIMETYPE);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getMimeType";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = {java.lang.String.class};
      //    tr22.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_getMimeType1 */
      /* Details: "Returns a String containing the MIME type of the specified file name" */
      TestResult tr23 = tcd.getTestResultFailed(PORTLETCONTEXT_GETMIMETYPE1);
      /* TODO: implement test */

      /* TestCase: PortletContext_getMimeType2 */
      /* Details: "Returns \"text/html\" for an HTML file with the approriate <mime-mapping> element in web.xml " */
      TestResult tr24 = tcd.getTestResultFailed(PORTLETCONTEXT_GETMIMETYPE2);
      /* TODO: implement test */

      /* TestCase: PortletContext_getMimeType3 */
      /* Details: "Returns \"image/gif\" for an image file with the approriate <mime-mapping> element in web.xml" */
      TestResult tr25 = tcd.getTestResultFailed(PORTLETCONTEXT_GETMIMETYPE3);
      /* TODO: implement test */

      /* TestCase: PortletContext_getMimeType4 */
      /* Details: "Returns null if the MIME type cannot be determined" */
      TestResult tr26 = tcd.getTestResultFailed(PORTLETCONTEXT_GETMIMETYPE4);
      /* TODO: implement test */

      /* TestCase: PortletContext_getMimeType5 */
      /* Details: "Returns null if the file does not exist" */
      TestResult tr27 = tcd.getTestResultFailed(PORTLETCONTEXT_GETMIMETYPE5);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasGetRealPath */
      /* Details: "Has a getRealPath(java.lang.String) method" */
      TestResult tr28 = tcd.getTestResultFailed(PORTLETCONTEXT_HASGETREALPATH);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getRealPath";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = {java.lang.String.class};
      //    tr28.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_getRealPath1 */
      /* Details: "Returns a String containing the OS-specific real path for the given virtual path" */
      TestResult tr29 = tcd.getTestResultFailed(PORTLETCONTEXT_GETREALPATH1);
      /* TODO: implement test */

      /* TestCase: PortletContext_getRealPath2 */
      /* Details: "Returns null if the file does not exist" */
      TestResult tr30 = tcd.getTestResultFailed(PORTLETCONTEXT_GETREALPATH2);
      /* TODO: implement test */

      /* TestCase: PortletContext_getRealPath3 */
      /* Details: "Returns null if the transformation cannot be performed" */
      TestResult tr31 = tcd.getTestResultFailed(PORTLETCONTEXT_GETREALPATH3);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasGetResourcePaths */
      /* Details: "Has a getResourcePaths(java.lang.String) method" */
      TestResult tr32 = tcd.getTestResultFailed(PORTLETCONTEXT_HASGETRESOURCEPATHS);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getResourcePaths";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = {java.lang.String.class};
      //    tr32.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_getResourcePaths1 */
      /* Details: "Returns a java.util.Set<java.lang.String> containing all the paths to resources within the web application longest sub-path of which matches the supplied path argument  " */
      TestResult tr33 = tcd.getTestResultFailed(PORTLETCONTEXT_GETRESOURCEPATHS1);
      /* TODO: implement test */

      /* TestCase: PortletContext_getResourcePaths2 */
      /* Details: "A path indicating a file does not end with a slash (/)" */
      TestResult tr34 = tcd.getTestResultFailed(PORTLETCONTEXT_GETRESOURCEPATHS2);
      /* TODO: implement test */

      /* TestCase: PortletContext_getResourcePaths3 */
      /* Details: "A path indicating a subdirectory ends with a slash (/)" */
      TestResult tr35 = tcd.getTestResultFailed(PORTLETCONTEXT_GETRESOURCEPATHS3);
      /* TODO: implement test */

      /* TestCase: PortletContext_getResourcePaths4 */
      /* Details: "Returns null if there are no resources in the web application of which the path begins with the supplied path" */
      TestResult tr36 = tcd.getTestResultFailed(PORTLETCONTEXT_GETRESOURCEPATHS4);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasGetResource */
      /* Details: "Has a getResource(java.lang.String) throws java.net.MalformedURLException method" */
      TestResult tr37 = tcd.getTestResultFailed(PORTLETCONTEXT_HASGETRESOURCE);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getResource";
      //    Class<?>[] exceptions = {java.net.MalformedURLException.class};
      //    Class<?>[] parms = {java.lang.String.class};
      //    tr37.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_getResource1 */
      /* Details: "Returns a java.net.URL object that maps to the specified path" */
      TestResult tr38 = tcd.getTestResultFailed(PORTLETCONTEXT_GETRESOURCE1);
      /* TODO: implement test */

      /* TestCase: PortletContext_getResource2 */
      /* Details: "Returns null if no resource is mapped to the path" */
      TestResult tr39 = tcd.getTestResultFailed(PORTLETCONTEXT_GETRESOURCE2);
      /* TODO: implement test */

      /* TestCase: PortletContext_getResource3 */
      /* Details: "Throws java.net.MalformedURLException if the path does not begin with a slash (/)" */
      TestResult tr40 = tcd.getTestResultFailed(PORTLETCONTEXT_GETRESOURCE3);
      /* TODO: implement test */

      /* TestCase: PortletContext_getResource4 */
      /* Details: "Throws java.net.MalformedURLException if the path is malformed" */
      TestResult tr41 = tcd.getTestResultFailed(PORTLETCONTEXT_GETRESOURCE4);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasGetAttribute */
      /* Details: "Has a getAttribute(java.lang.String) method" */
      TestResult tr42 = tcd.getTestResultFailed(PORTLETCONTEXT_HASGETATTRIBUTE);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getAttribute";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = {java.lang.String.class};
      //    tr42.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_getAttribute1 */
      /* Details: "Returns a java.lang.Object attribute value for the specified name" */
      TestResult tr43 = tcd.getTestResultFailed(PORTLETCONTEXT_GETATTRIBUTE1);
      /* TODO: implement test */

      /* TestCase: PortletContext_getAttribute2 */
      /* Details: "Returns null if there is no attribute value for the specified name" */
      TestResult tr44 = tcd.getTestResultFailed(PORTLETCONTEXT_GETATTRIBUTE2);
      /* TODO: implement test */

      /* TestCase: PortletContext_getAttribute3 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      TestResult tr45 = tcd.getTestResultFailed(PORTLETCONTEXT_GETATTRIBUTE3);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasGetAttributeNames */
      /* Details: "Has a getAttributeNames() method" */
      TestResult tr46 = tcd.getTestResultFailed(PORTLETCONTEXT_HASGETATTRIBUTENAMES);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getAttributeNames";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr46.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_getAttributeNames1 */
      /* Details: "Returns an java.util.Enumeration<java.lang.String> containing the attribute names in the PortletContext" */
      TestResult tr47 = tcd.getTestResultFailed(PORTLETCONTEXT_GETATTRIBUTENAMES1);
      /* TODO: implement test */

      /* TestCase: PortletContext_getAttributeNames2 */
      /* Details: "Returns an empty Enumeration if no attributes are available" */
      TestResult tr48 = tcd.getTestResultFailed(PORTLETCONTEXT_GETATTRIBUTENAMES2);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasGetInitParameter */
      /* Details: "Has a getInitParameter(java.lang.String) method" */
      TestResult tr49 = tcd.getTestResultFailed(PORTLETCONTEXT_HASGETINITPARAMETER);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getInitParameter";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = {java.lang.String.class};
      //    tr49.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_getInitParameter1 */
      /* Details: "Returns a java.lang.String PortletContext initialization parameter value for the specified name" */
      TestResult tr50 = tcd.getTestResultFailed(PORTLETCONTEXT_GETINITPARAMETER1);
      /* TODO: implement test */

      /* TestCase: PortletContext_getInitParameter2 */
      /* Details: "Returns null if there is no inittialization parameter for the specified name" */
      TestResult tr51 = tcd.getTestResultFailed(PORTLETCONTEXT_GETINITPARAMETER2);
      /* TODO: implement test */

      /* TestCase: PortletContext_getInitParameter3 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      TestResult tr52 = tcd.getTestResultFailed(PORTLETCONTEXT_GETINITPARAMETER3);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasGetInitParameterNames */
      /* Details: "Has a getInitParameterNames() method" */
      TestResult tr53 = tcd.getTestResultFailed(PORTLETCONTEXT_HASGETINITPARAMETERNAMES);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getInitParameterNames";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr53.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_getInitParameterNames1 */
      /* Details: "Returns an java.util.Enumeration<java.lang.String> containing the InitParameter names in the PortletContext" */
      TestResult tr54 = tcd.getTestResultFailed(PORTLETCONTEXT_GETINITPARAMETERNAMES1);
      /* TODO: implement test */

      /* TestCase: PortletContext_getInitParameterNames2 */
      /* Details: "Returns an empty Enumeration if no InitParameters are available" */
      TestResult tr55 = tcd.getTestResultFailed(PORTLETCONTEXT_GETINITPARAMETERNAMES2);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasLogA */
      /* Details: "Has a log(java.lang.String) method" */
      TestResult tr56 = tcd.getTestResultFailed(PORTLETCONTEXT_HASLOGA);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "log";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = {java.lang.String.class};
      //    tr56.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_logA */
      /* Details: "Writes specified message to a portlet log file" */
      TestResult tr57 = tcd.getTestResultFailed(PORTLETCONTEXT_LOGA);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasLogB */
      /* Details: "Has a log(java.lang.String, java.lang.Throwable) method" */
      TestResult tr58 = tcd.getTestResultFailed(PORTLETCONTEXT_HASLOGB);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "log";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = {java.lang.String.class, java.lang.Throwable.class};
      //    tr58.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_logB */
      /* Details: "Writes specified message and stack trace to a portlet log file" */
      TestResult tr59 = tcd.getTestResultFailed(PORTLETCONTEXT_LOGB);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasRemoveAttribute */
      /* Details: "Has a removeAttribute(java.lang.String) method" */
      TestResult tr60 = tcd.getTestResultFailed(PORTLETCONTEXT_HASREMOVEATTRIBUTE);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "removeAttribute";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = {java.lang.String.class};
      //    tr60.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_removeAttribute1 */
      /* Details: "Removes the attribute with the specified nale" */
      TestResult tr61 = tcd.getTestResultFailed(PORTLETCONTEXT_REMOVEATTRIBUTE1);
      /* TODO: implement test */

      /* TestCase: PortletContext_removeAttribute2 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      TestResult tr62 = tcd.getTestResultFailed(PORTLETCONTEXT_REMOVEATTRIBUTE2);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasSetAttribute */
      /* Details: "Has a setAttribute(java.lang.String, java.lang.Object) method" */
      TestResult tr63 = tcd.getTestResultFailed(PORTLETCONTEXT_HASSETATTRIBUTE);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "setAttribute";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = {java.lang.String.class, java.lang.Object.class};
      //    tr63.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_setAttribute1 */
      /* Details: "Sets an attribute for the specified name in the portlet context" */
      TestResult tr64 = tcd.getTestResultFailed(PORTLETCONTEXT_SETATTRIBUTE1);
      /* TODO: implement test */

      /* TestCase: PortletContext_setAttribute2 */
      /* Details: "Any existing attribute for the specified name is removed" */
      TestResult tr65 = tcd.getTestResultFailed(PORTLETCONTEXT_SETATTRIBUTE2);
      /* TODO: implement test */

      /* TestCase: PortletContext_setAttribute3 */
      /* Details: "If the specified name is null, the attribute is removed" */
      TestResult tr66 = tcd.getTestResultFailed(PORTLETCONTEXT_SETATTRIBUTE3);
      /* TODO: implement test */

      /* TestCase: PortletContext_setAttribute4 */
      /* Details: "Throws IllegalArgumentException if the name is null" */
      TestResult tr67 = tcd.getTestResultFailed(PORTLETCONTEXT_SETATTRIBUTE4);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasGetPortletContextName */
      /* Details: "Has a getPortletContextName() method" */
      TestResult tr68 = tcd.getTestResultFailed(PORTLETCONTEXT_HASGETPORTLETCONTEXTNAME);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getPortletContextName";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr68.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_getPortletContextName1 */
      /* Details: "Returns the portlet application name" */
      TestResult tr69 = tcd.getTestResultFailed(PORTLETCONTEXT_GETPORTLETCONTEXTNAME1);
      /* TODO: implement test */

      /* TestCase: PortletContext_getPortletContextName2 */
      /* Details: "The name is as specified in web.xml the <display-name> element" */
      TestResult tr70 = tcd.getTestResultFailed(PORTLETCONTEXT_GETPORTLETCONTEXTNAME2);
      /* TODO: implement test */

      /* TestCase: PortletContext_getPortletContextName3 */
      /* Details: "Returns null if no web.xml <display-name> element is defined" */
      TestResult tr71 = tcd.getTestResultFailed(PORTLETCONTEXT_GETPORTLETCONTEXTNAME3);
      /* TODO: implement test */

      /* TestCase: PortletContext_hasGetContainerRuntimeOptions */
      /* Details: "Has a getContainerRuntimeOptions() method" */
      TestResult tr72 = tcd.getTestResultFailed(PORTLETCONTEXT_HASGETCONTAINERRUNTIMEOPTIONS);
      // TODO: access the class under test and uncomment this code.
      // {
      //    String name = "getContainerRuntimeOptions";
      //    Class<?>[] exceptions = null;
      //    Class<?>[] parms = null;
      //    tr72.setTcSuccess(cc.hasMethod(name, parms, exceptions));
      // }

      /* TestCase: PortletContext_getContainerRuntimeOptions1 */
      /* Details: "Returns an java.util.Enumeration<java.lang.String> containing the available runtime option names" */
      TestResult tr73 = tcd.getTestResultFailed(PORTLETCONTEXT_GETCONTAINERRUNTIMEOPTIONS1);
      /* TODO: implement test */

      /* TestCase: PortletContext_getContainerRuntimeOptions2 */
      /* Details: "Returns an empty Enumeration if no runtime options are available" */
      TestResult tr74 = tcd.getTestResultFailed(PORTLETCONTEXT_GETCONTAINERRUNTIMEOPTIONS2);
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


   }

}

