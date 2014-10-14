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

/**
 * This is Jasmine test code for the Portlet Hub.
 * <p>
 * Since the portlet hub does not get reinitialized, its state is
 * maintained throughout the testing. The tests are constructed so that
 * by the end of module execution, any listeners that are added in the 
 * earlier portions of the test are removed.
 */


describe('The portlet hub allows the portlet client to create a resource URL.',function(){
   'use strict'
   
   // get the portlet IDs provided by the system under test. The function must
   // return a string array of portlet IDs that are known to the portlet hub being 
   // tested. Portlets:
   //                private parms        public parms             Render data
   //                =============        ============             ===========
   //    portletA      parm1, parm2             -                     -   
   //    portletB      parm1, parm2       pubparm1                    -   
   //    portletC      parm1, parm2       pubparm1, pubparm2          -
   //    portletD      parm2, pubparm1    pubparm2                    -
   //    portletE      parm1, parm2       pubparm1, pubparm2          -
   //    portletF           -                   -                     -   
   var portletIds = portlet.test.getIds(),                      
       portletA = portletIds[0],                                
       portletB = portletIds[1],                                 
       portletC = portletIds[2],                                 
       portletD = portletIds[3],                                 

       // Test data provided by the portlet hub
       pageState = portlet.test.getInitData(),                  


       // Tests in thismodule need following portlets. register them.
       // These variables provide linkage between the "describe" sections
       hubA,
       hubB,
       hubC,
       hubD;
   
       
   describe('The portlet hub is initialized for the tests: ',function(){
   
       it('initializes a portlet hub instance for portlet A',function(){
          var testFunc = function () {
             return portlet.register(portletA);
          }
          var ph = new portlet.jasmine.PromiseHandler(testFunc);
          runs(ph.getRun());
          waitsFor(ph.getIsComplete(), "The PortletInit object should be returned", 1000);
          runs(ph.getChecker()); 
          runs(function() {
             expect(ph.result).toBeDefined();
          }); 
          runs(function() {
             hubA = ph.result;
          }); 
       });
       
       it('initializes a portlet hub instance for portlet B',function(){
          var testFunc = function () {
             return portlet.register(portletB);
          }
          var ph = new portlet.jasmine.PromiseHandler(testFunc);
          runs(ph.getRun());
          waitsFor(ph.getIsComplete(), "The PortletInit object should be returned", 1000);
          runs(ph.getChecker()); 
          runs(function() {
             expect(ph.result).toBeDefined();
          }); 
          runs(function() {
             hubB = ph.result;
          }); 
       });
   
       it('initializes a portlet hub instance for portlet C',function(){
          var testFunc = function () {
             return portlet.register(portletC);
          }
          var ph = new portlet.jasmine.PromiseHandler(testFunc);
          runs(ph.getRun());
          waitsFor(ph.getIsComplete(), "The PortletInit object should be returned", 1000);
          runs(ph.getChecker()); 
          runs(function() {
             expect(ph.result).toBeDefined();
          }); 
          runs(function() {
             hubC = ph.result;
          }); 
       });
       
       it('initializes a portlet hub instance for portlet D',function(){
          var testFunc = function () {
             return portlet.register(portletD);
          }
          var ph = new portlet.jasmine.PromiseHandler(testFunc);
          runs(ph.getRun());
          waitsFor(ph.getIsComplete(), "The PortletInit object should be returned", 1000);
          runs(ph.getChecker()); 
          runs(function() {
             expect(ph.result).toBeDefined();
          }); 
          runs(function() {
             hubD = ph.result;
          }); 
       });
     
   });

   describe('The portlet hub createResourceUrl function: ',function () {
       
      // The tests in this section use just a single portlet - portletA
      var cbA = new portlet.jasmine.JasminePortletUtils(portletA, pageState);

      it('is present in the register return object and is a function',function(){
         expect(typeof hubA.createResourceUrl).toEqual('function');
      });

      it('throws an IllegalArgumentException if too many (>2) arguments are provided',function(){
         var testFunc = function () {
            hubA.createResourceUrl("parm1", "parm2", "parm3");
         }
         expect(testFunc).toThrowCustomException("IllegalArgumentException");
      });

      it('throws an IllegalArgumentException if a single argument is null',function(){
         var testFunc = function () {
            hubA.createResourceUrl(null);
         }
         expect(testFunc).toThrowCustomException("IllegalArgumentException");
      });

      it('throws an IllegalArgumentException if the cacheability argument is null',function(){
         var parms  = {rp1 : ["resVal"]};
         var testFunc = function () {
            hubA.createResourceUrl(parms, null);
         }
         expect(testFunc).toThrowCustomException("IllegalArgumentException");
      });

      it('throws an IllegalArgumentException if resource parameters  is null',function(){
         var testFunc = function () {
            hubA.createResourceUrl(null, "FULL");
         }
         expect(testFunc).toThrowCustomException("IllegalArgumentException");
      });

      it('throws an IllegalArgumentException if resource parameters is undefined',function(){
         var testFunc = function () {
            hubA.createResourceUrl(undefined, "FULL");
         }
         expect(testFunc).toThrowCustomException("IllegalArgumentException");
      });

      it('throws an IllegalArgumentException if resource parameters is invalid',function(){
         var parms  = {rp1 : "resVal"};
         var testFunc = function () {
            hubA.createResourceUrl(parms, "PORTLET");
         }
         expect(testFunc).toThrowCustomException("IllegalArgumentException");
      });

      it('throws an IllegalArgumentException if the cacheability argument is invalid',function(){
         var parms  = {rp1 : ["resVal"]};
         var testFunc = function () {
            hubA.createResourceUrl(parms, "Invalid");
         }
         expect(testFunc).toThrowCustomException("IllegalArgumentException");
      });

      it('throws an IllegalArgumentException if there are 2 cacheability arguments',function(){
         var parms  = {rp1 : ["resVal"]};
         var testFunc = function () {
            hubA.createResourceUrl("PAGE", "FULL");
         }
         expect(testFunc).toThrowCustomException("IllegalArgumentException");
      });

      it('throws an IllegalArgumentException if there are 2 res params arguments',function(){
         var parms  = {rp1 : ["resVal"]};
         var testFunc = function () {
            hubA.createResourceUrl(parms, parms);
         }
         expect(testFunc).toThrowCustomException("IllegalArgumentException");
      });

      it('does not throw if both arguments are valid',function(){
         var parms  = {rp1 : ["resVal"]};
         var testFunc = function () {
            hubA.createResourceUrl(parms, "PAGE");
         }
         expect(testFunc).not.toThrow();
      });

      it('returns a string if both arguments are valid',function(){
         var parms  = {rp1 : ["resVal"]}, retval;
         retval = hubA.createResourceUrl(parms, "FULL");
         expect(typeof retval).toEqual('string');
      });

      it('returns a string if cacheability is specified first',function(){
         var parms  = {rp1 : ["resVal"]}, retval;
         retval = hubA.createResourceUrl("PAGE", parms);
         expect(typeof retval).toEqual('string');
      });

      it('returns a string if only cacheability present',function(){
         var parms  = {rp1 : ["resVal"]}, retval;
         retval = hubA.createResourceUrl("PORTLET");
         expect(typeof retval).toEqual('string');
      });

      it('returns a string if only resource parameters present',function(){
         var parms  = {rp1 : ["resVal"], rp2 : ["resVal2"]}, retval;
         retval = hubA.createResourceUrl(parms);
         expect(typeof retval).toEqual('string');
      });

      it('returns a string if no parameters present',function(){
         var parms  = {rp1 : ["resVal"], rp2 : ["resVal2"]}, retval;
         retval = hubA.createResourceUrl();
         expect(typeof retval).toEqual('string');
      });

      it('returns a URL indicating the initiating portlet A',function(){
         var parms  = {rp1 : ["resVal"], rp2 : ["resVal2"]}, url, id;
         url = hubA.createResourceUrl(parms, "PAGE");
         id = portlet.test.resource.getInitiatingPortletId(url);
         expect(id).toEqual(portletA);
      });

      it('returns a URL indicating a different initiating portlet B',function(){
         var parms  = {rp1 : ["resVal"], rp2 : ["resVal2"]}, url, id;
         url = hubB.createResourceUrl(parms, "PAGE");
         id = portlet.test.resource.getInitiatingPortletId(url);
         expect(id).toEqual(portletB);
      });

      it('returns a resource URL',function(){
         var parms  = {rp1 : ["resVal"], rp2 : ["resVal2"]}, cache="PAGE", url;
         url = hubB.createResourceUrl(parms, cache);
         expect(portlet.test.resource.isResourceUrl(url)).toBeTruthy();
      });

      it('returns a URL indicating with cacheability set to "PAGE"',function(){
         var parms  = {rp1 : ["resVal"], rp2 : ["resVal2"]}, cache="PAGE", url, str;
         url = hubB.createResourceUrl(parms, cache);
         str = portlet.test.resource.getCacheability(url);
         expect(str).toEqual(cache);
      });

      it('returns a URL indicating with cacheability set to "FULL"',function(){
         var parms  = {rp1 : ["resVal"], rp2 : ["resVal2"]}, cache="FULL", url, str;
         url = hubB.createResourceUrl(parms, cache);
         str = portlet.test.resource.getCacheability(url);
         expect(str).toEqual(cache);
      });

      it('returns a URL with the resource parameters set as expected',function(){
         var parms  = {rp1 : ["resVal"], rp2 : ["resVal2"]}, cache="PAGE", url, str;
         url = hubB.createResourceUrl(parms, cache);
         str = portlet.test.resource.getResourceParms(url);
         expect(str).toEqual(parms);
      });

      it('returns a URL with multivalued resource parameters set as expected',function(){
         var parms  = {rp1 : ["resVal", "resVal1"], rp2 : ["resVal2"]}, cache="PAGE", url, str;
         url = hubB.createResourceUrl(parms, cache);
         str = portlet.test.resource.getResourceParms(url);
         expect(str).toEqual(parms);
      });

      it('returns a URL with multivalued resource parameters ciontaining null set as expected',function(){
         var parms  = {rp1 : ["resVal", null, "resVal1"], rp2 : ["resVal2"]}, cache="PAGE", url, str;
         url = hubB.createResourceUrl(parms, cache);
         str = portlet.test.resource.getResourceParms(url);
         expect(str).toEqual(parms);
      });

      it('returns a URL with null resource parameter set as expected',function(){
         var parms  = {rp1 : ["resVal"], rp2 : [null]}, cache="PAGE", url, str;
         url = hubB.createResourceUrl(parms, cache);
         str = portlet.test.resource.getResourceParms(url);
         expect(str).toEqual(parms);
      });

      it('returns a URL without resource parameters when none are added',function(){
         var parms  = {}, cache="PAGE", url, str;
         url = hubB.createResourceUrl(cache);
         str = portlet.test.resource.getResourceParms(url);
         expect(str).toEqual(parms);
      });
     
   });
   
   
   describe('The portlet hub createResourecUrl function takes state into acount: ',function(){

      // Make sure it works for more than one portlet 
      
      var cbB = new portlet.jasmine.JasminePortletUtils(portletB, pageState);
      var cbC = new portlet.jasmine.JasminePortletUtils(portletC, pageState);
      var cbD = new portlet.jasmine.JasminePortletUtils(portletD, pageState);
      
      // add an osc handler for the test
      beforeEach(function () {
         cbB.complete = false;
         cbC.complete = false;
         cbD.complete = false;
         runs(function() {
            cbB.oscHandle = hubB.addEventListener("portlet.onStateChange", cbB.getListener());
            cbC.oscHandle = hubC.addEventListener("portlet.onStateChange", cbC.getListener());
            cbD.oscHandle = hubD.addEventListener("portlet.onStateChange", cbD.getListener());
         }); 
         waitsFor(cbB.getIsComplete(), "The onStateChange callback should be called", 100);
         waitsFor(cbC.getIsComplete(), "The onStateChange callback should be called", 100);
         waitsFor(cbD.getIsComplete(), "The onStateChange callback should be called", 100);
         runs(function() {
            cbB.complete = false;    // in prep for the actual test
            cbC.complete = false;    // in prep for the actual test
            cbD.complete = false;    // in prep for the actual test
         }); 
      });
      
      // remove the osc handler added during the test
      afterEach(function () {
         if (cbB.oscHandle !== null) {
            hubB.removeEventListener(cbB.oscHandle);
            cbB.oscHandle = null;
         }
         if (cbC.oscHandle !== null) {
            hubC.removeEventListener(cbC.oscHandle);
            cbC.oscHandle = null;
         }
         if (cbD.oscHandle !== null) {
            hubD.removeEventListener(cbD.oscHandle);
            cbD.oscHandle = null;
         }
      });
      
      it('returns a URL with the portlet state set when cacheability = PAGE',function(){
         var parms  = {rp1 : ["resVal"], rp2 : ["resVal2"]}, cache="PAGE", url, str;
         url = hubB.createResourceUrl(parms, cache);
         str = portlet.test.resource.getState(url, portletB);
         expect(str).toEqual(cbB.getState());
      });
      
      it('returns a URL with the portlet state set when cacheability = PORTLET',function(){
         var parms  = {rp1 : ["resVal"], rp2 : ["resVal2"]}, cache="PORTLET", url, str;
         url = hubB.createResourceUrl(parms, cache);
         str = portlet.test.resource.getState(url, portletB);
         expect(str).toEqual(cbB.getState());
      });
      
      it('returns a URL with no portlet state set when cacheability = FULL',function(){
         var parms  = {rp1 : ["resVal"], rp2 : ["resVal2"]}, cache="FULL", url, str, state;
         url = hubB.createResourceUrl(parms, cache);
         str = portlet.test.resource.getState(url, portletB);
         expect(str).toEqual({});
      });
      
      it('returns a URL containing state of different portlet when cacheability = PAGE',function(){
         var parms  = {rp1 : ["resVal"], rp2 : ["resVal2"]}, cache="PAGE", url, str;
         url = hubB.createResourceUrl(parms, cache);
         str = portlet.test.resource.getState(url, portletC);
         expect(str).toEqual(cbC.getState());
      });
      
      it('returns a URL not containing state of different portlet when cacheability = PORTLET',function(){
         var parms  = {rp1 : ["resVal"], rp2 : ["resVal2"]}, cache="PORTLET", url, str, state;
         url = hubB.createResourceUrl(parms, cache);
         str = portlet.test.resource.getState(url, portletC);
         expect(str).toEqual({});
      });
      
   });

});