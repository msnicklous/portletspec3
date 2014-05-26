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
 */


describe('The portlet hub provides JavaScript support for portlets.',function(){
   'use strict'
      
   // get the portlet IDs provided by the system under test. The function must
   // return a string array of portlet IDs that are known to the portlet hub being 
   // tested. There must be at least 3 IDs available.
   var portletIds = portlet.test.getIds(),
       pageState = portlet.test.getInitData(),
       portletA = portletIds[0],
       portletB = portletIds[3],
       portletC = portletIds[1];
    
   

   it('provides a global namespace of "portlet"',function(){
      expect(portlet).toBeDefined();
   });

   it('provides a property named "register" in the portlet namespace',function(){
      expect(portlet.register).toBeDefined();
   });

   it('the register property in the portlet namespace is a function',function(){
      expect(typeof portlet.register).toEqual('function');
   });

   
   /**
    * Test the portlet hub register function
    */
   describe('The portlet hub register function: ',function(){

      it('throws an IllegalArgumentException if no portlet ID argument is provided',function(){
         var testFunc = function () {
            portlet.register();
         }
         expect(testFunc).toThrowCustomException("IllegalArgumentException");
      });

      it('throws an IllegalArgumentException if too many (>1) arguments are provided',function(){
         var testFunc = function () {
            portlet.register("InvalidPortletID1", "InvalidPortletID2");
         }
         expect(testFunc).toThrowCustomException("IllegalArgumentException");
      });

      it('throws an IllegalArgumentException if the portlet ID is not a string',function(){
         var testFunc = function () {
            portlet.register(89);
         }
         expect(testFunc).toThrowCustomException("IllegalArgumentException");
      });

      it('throws an IllegalArgumentException if the portlet ID is undefined',function(){
         var testFunc = function () {
            portlet.register(undefined);
         }
         expect(testFunc).toThrowCustomException("IllegalArgumentException");
      });

      it('throws an IllegalArgumentException if the portlet ID is null',function(){
         var testFunc = function () {
            portlet.register(null);
         }
         expect(testFunc).toThrowCustomException("IllegalArgumentException");
      });

      it('throws an IllegalArgumentException if the portlet ID is not defined for the portlet hub',function(){
         var testFunc = function () {
            portlet.register("InvalidPortletId");
         }
         expect(testFunc).toThrowCustomException("IllegalArgumentException");
      });

      it('does not throw an exception if the portlet ID is valid',function(){
         var testFunc = function () {
            portlet.register(portletA);
         }
         expect(testFunc).not.toThrow();
      });

      it('returns an object when provided with a valid portlet ID',function(){
         var result;
         var testFunc = function () {
            result = portlet.register(portletB);
         }
         expect(testFunc).not.toThrow();
         expect(typeof result).toEqual('object');
      });

      it('returns a PortletInit object containing a "portletModes" property',function(){
         var result;
         result = portlet.register(portletB);
         expect(result.portletModes).toBeDefined();
      });

      it('returns PortletInit.portletModes equal to the test data',function(){
         var result;
         result = portlet.register(portletB);
         expect(result.portletModes).toEqual(pageState[portletB].allowedPM);
      });

      it('returns a PortletInit object containing a "windowStates" property',function(){
         var result;
         result = portlet.register(portletB);
         expect(result.windowStates).toBeDefined();
      });

      it('returns PortletInit.windowStates equal to the test data',function(){
         var result;
         result = portlet.register(portletB);
         expect(result.windowStates).toEqual(pageState[portletB].allowedWS);
      });

   });
});