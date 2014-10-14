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

/*
 * This source code implements specifications defined by the Java
 * Community Process. In order to remain compliant with the specification
 * DO NOT add / change / or delete method signatures!
 */

/**
 * @fileOverview
 * This module provides mock data & functions for the mock portlet hub.
 * <p>
 * The functions encapsulate all mockup-specific implementation details.
 * The intention is that support for a different portal can added by 
 * reimplementing these functions.
 * <p>
 * To implement the portlet hub for your portal, implement the methods 
 * described under "portlet.impl".
 * In order to make the Jasmine tests work with your implementation, the
 * test functions will need to be modified appropiately as well.
 * <p>
 * Sets up data that is used by the Jasmine unit tests as well as by the 
 * portlet hub implementation. In particular, the Jasmine tests need initialization
 * data for the portlets on the page. The portlet hub requires this
 * data as well, so it is being provided through the global name space to be used both
 * by the hub and by the test code.
 * <p> 
 * Later, it should hopefully be possible to use the Jasmine tests with a "live" 
 * portlet hub implementation by making the portlet info on the page 
 * available to Jasmine through this mechanism.
 * <p>
 * A "real" portlet hub implementation would likely obtain this information in a 
 * different manner.
 * 
 * @author Scott Nicklous
 * @copyright IBM Corp., 2014
 */
var portlet = portlet || {};

// ~~~~~~~~~~~~~~~~~~~~~~~~~~ Test Data ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~   
   
/**
 * Mock data for portlets
 * @namespace
 * @private        
 */
portlet.test = portlet.test || {};
portlet.test.data  = {
   
   // get initial data for the portlets
   initialPageState : {
      'PortletA' : {
         'state' : {
            'parameters' : {
               'parm1' : ['val1'], 
               'parm2' : ['val2', 'val3']
            }, 
            'portletMode' : 'VIEW', 
            'windowState' : 'NORMAL'
         },
         'pubParms' : [],
         'allowedPM' : ['VIEW', 'EDIT', 'HELP'],
         'allowedWS' : ['NORMAL', 'MINIMIZED', 'MAXIMIZED'],
         'renderData' : {
            'renderData' : null,
            'mimeType' : "text/plain"
         }
      },
      'PortletB' : {
         'state' : {
            'parameters' : {
               'parm1' : ['val1'], 
               'pubparm1' : ['pubval1'], 
               'parm2' : ['val2', 'val3']
            }, 
            'portletMode' : 'VIEW', 
            'windowState' : 'NORMAL'
         },
         'pubParms' : ['pubparm1'],
         'allowedPM' : ['VIEW', 'EDIT', 'HELP'],
         'allowedWS' : ['NORMAL', 'MINIMIZED', 'MAXIMIZED'],
         'renderData' : null
      },
      'PortletC' : {
         'state' : {
            'parameters' : {
               'parm1' : ['val1'], 
               'pubparm1' : ['pubval1'], 
               'pubparm2' : ['pubval2'], 
               'parm2' : ['val2', 'val3']
            }, 
            'portletMode' : 'VIEW', 
            'windowState' : 'NORMAL'
         },
         'pubParms' : ['pubparm1', 'pubparm2'],
         'allowedPM' : ['VIEW', 'EDIT', 'HELP'],
         'allowedWS' : ['NORMAL', 'MINIMIZED', 'MAXIMIZED']
      },
      'PortletD' : {
         'state' : {
            'parameters' : {
               'pubparm1' : ['private_val1'], 
               'pubparm2' : ['pubval2'], 
               'parm2' : ['val2', 'val3']
            }, 
            'portletMode' : 'VIEW', 
            'windowState' : 'NORMAL'
         },
         'pubParms' : ['pubparm2'],
         'allowedPM' : ['VIEW', 'EDIT', 'HELP'],
         'allowedWS' : ['NORMAL', 'MINIMIZED', 'MAXIMIZED'],
         'renderData' : {
            'renderData' : "Some render data.",
            'mimeType' : "text/plain"
         }
      },
      'PortletE' : {
         'state' : {
            'parameters' : {
               'parm1' : ['val1'], 
               'pubparm1' : ['pubval1'], 
               'pubparm2' : ['pubval2'], 
               'parm2' : ['val2', 'val3']
            }, 
            'portletMode' : 'VIEW', 
            'windowState' : 'NORMAL'
         },
         'pubParms' : ['pubparm1', 'pubparm2'],
         'allowedPM' : ['VIEW', 'EDIT', 'HELP'],
         'allowedWS' : ['NORMAL', 'MINIMIZED', 'MAXIMIZED'],
         'renderData' : {
            'renderData' : "Some render data.",
            'mimeType' : "text/plain"
         }
      },
      'PortletF' : {
         'state' : {
            'parameters' : {
            }, 
            'portletMode' : 'VIEW', 
            'windowState' : 'NORMAL'
         },
         'pubParms' : [],
         'allowedPM' : ['VIEW', 'EDIT', 'HELP'],
         'allowedWS' : ['NORMAL', 'MINIMIZED', 'MAXIMIZED'],
         'renderData' : {
            'renderData' : "Some render data.",
            'mimeType' : "text/plain"
         }
      },
      'SimulateLongWait' : {
         'state' : {
            'parameters' : {
               'parm1' : ['val1'], 
            }, 
            'portletMode' : 'VIEW', 
            'windowState' : 'NORMAL'
         },
         'pubParms' : ['pubparm1', 'pubparm2'],
         'allowedPM' : ['VIEW', 'EDIT', 'HELP'],
         'allowedWS' : ['NORMAL', 'MINIMIZED', 'MAXIMIZED']
      },
      'SimulateError' : {
         'state' : {
            'parameters' : {
               'parm1' : ['val1'], 
            }, 
            'portletMode' : 'VIEW', 
            'windowState' : 'NORMAL'
         },
         'pubParms' : ['pubparm1', 'pubparm2'],
         'allowedPM' : ['VIEW', 'EDIT', 'HELP'],
         'allowedWS' : ['NORMAL', 'MINIMIZED', 'MAXIMIZED']
      }
   },
   
   // For each portlet, there is a mock update string that         
   // causes a state update for one or more parameters.        
   // The string is decoded and turned into an object by the   
   // decodeUpdateString function. These strings are used
   // by both the action() and the setPageState() code.
   updateStrings : {
      // just updates PortletA
      "PortletA" : "&~~~&PortletA&mode=VIEW&ws=NORMAL&parm1=Fred&parm2=Barney" +
      "&~~~",
      
      // updates portlets B & C
      "PortletB" : "&~~~&PortletB&mode=VIEW&ws=NORMAL&parm1=val1&pubparm1=pubval1&parm2=val2&parm2=val3" +
      "&~~~&PortletC&mode=VIEW&ws=NORMAL&parm1=val1&pubparm1=pubval1&pubparm2=pubval2&parm2=val2&parm2=val3" +
      "&~~~",
      
      // Updates A, B, C, & D
      "PortletC" : "&~~~&PortletA&mode=VIEW&ws=NORMAL&parm1=Fred&parm2=Barney" +
      "&~~~&PortletB&mode=VIEW&ws=NORMAL&parm1=val1&pubparm1=pubval1&parm2=val2&parm2=val3" +
      "&~~~&PortletC&mode=VIEW&ws=NORMAL&parm1=val1&pubparm1=pubval1&pubparm2=pubval2&parm2=val2&parm2=val3" +
      "&~~~&PortletD&mode=VIEW&ws=NORMAL&pubparm1=private_val1&pubparm2=pubval2&parm2=val2&parm2=val3" +
      "&~~~",
      
      "PortletD" : "",
      "PortletE" : "",
      "PortletF" : ""
   }
};

// get initial data for the portlets. Clone it so that the test
// code has a separate copy than the mockup hub.
portlet.test.getInitData = function () {
   'use strict';
   return JSON.parse(JSON.stringify(portlet.test.data.initialPageState));
};

/**
 * get the available portlet IDs in an array 
 */
portlet.test.getIds = function () {
   'use strict';
   var id, ids = [], pageState = portlet.test.data.initialPageState;
   for (id in pageState) {
      if (pageState.hasOwnProperty(id)) {
         ids.push(id);
      }
   }
   return ids;
};

// ~~~~~~~~~~~~~~~~~~~~~~ End Test Data ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~   

(function () {
   'use strict';

   var isInitialized = false,

   /**
    * The object holding the portlet data for each portlet on the page.
    * This an object indexed by portlet ID.
    * @property   {PortletData} {string}  
    *    The object holds one portlet data object for each portlet. The string
    *    property name is the portlet ID.
    * @private
    */
   pageState,
   testdata = portlet.test.data.initialPageState,

   /**
    * Sets up the portlet hub implementation for use. 
    * For the mockup, the initialization routine loads the portlet hub 
    * with the state of the mocked portlets.
    * @private
    */
   initialize = function (pid) {
      var p = new Promise(
         function(resolve, reject) {
            if (!isInitialized) {
               pageState = portlet.impl.getInitData();
               isInitialized = true;
            }
            switch(pid) {
            case 'SimulateLongWait':
               window.setTimeout(function () {resolve();}, 500);
               break;
            case 'SimulateError':
               window.setTimeout(function () {reject();}, 100);
               break;
            default:
               window.setTimeout(function () {resolve();}, 10);
            }
         }
      );
      return p;
   };

   portlet.impl = {

      /**
       * Register a portlet. The impl is passed the portlet ID for the portlet.
       * The impl must retrieve the information for the portlet in an appropriate
       * manner. It must return a Promise that is fulfilled when data for the 
       * portlet becomes available and is rejected if an error occurs or if the
       * portlet ID is invalid.
       * 
       * @param   {string}    pid      Portlet ID
       * @param   {function}  callback Function called when registration is complete
       * 
       * @returns {Promise}            fulfilled when data is available
       * 
       * @function
       * @private
       */
      register : function (pid, callback) {
         return initialize(pid);
      },

      // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      // ~~~~~~~~~~~~~~~~~~~~~~ Page State Accessors ~~~~~~~~~~~~~~~~~~~~
      // The page state is an object containing one member of the following
      // structure for each portlet:
      //
      // 'PortletA' : {
      //    'state' : {
      //       'parameters' : {
      //          'parm1' : ['val1'],
      //          'parm2' : ['val2', 'val3']
      //       },
      //       'portletMode' : 'VIEW',
      //       'windowState' : 'NORMAL',
      //    },
      //    'pubParms' : [],
      //    'allowedPM' : ['VIEW', 'EDIT', 'HELP'],
      //    'allowedWS' : ['NORMAL', 'MINIMIZED', 'MAXIMIZED'],
      // }
      //

      // ~~~~~~~~~~~~~~~~~~~~~~ End Page State Accessors ~~~~~~~~~~~~~~~~
      // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

      /**
       * Determines if the specified portlet ID is present.
       * @param   {string}    pid      The portlet ID
       * @returns {boolean}            true if the portlet ID can be found
       * @function
       * @private
       */
      isValidId : function (pid) {
         var id;
         for (id in pageState) {
            if (!pageState.hasOwnProperty(id)) {
               continue;
            }
            if (pid === id) {
               return true;
            }
         }
         return false;
      },

      /**
       * Get allowed window states for portlet
       */
      getAllowedWS : function (pid) {
         return pageState[pid].allowedWS.slice(0);
      },

      /**
       * Tests whether the given window state is allowed
       */
      isAllowedWS : function (pid, ws) {
         return (pageState[pid].allowedWS.indexOf(ws) >= 0);
      },

      /**
       * Get allowed portlet modes for portlet
       */
      getAllowedPM : function (pid) {
         return pageState[pid].allowedPM.slice(0);
      },

      /**
       * Tests whether the given portlet mode is allowed
       */
      isAllowedPM : function (pid, pm) {
         return (pageState[pid].allowedPM.indexOf(pm) >= 0);
      },
      
      /**
       * gets render data for the portlet
       */
      getRenderData : function (pid) {
         return pageState[pid].renderData;
      },
      
      /**
       * gets defeined PRPs for the portlet
       */
      getPRPNames : function (pid) {
         return pageState[pid].pubParms;
      },
      
      /**
       * gets parameter value
       */
      getParmVal : function (pid, name) {
         return pageState[pid].state.parameters[name];
      },
      
      /**
       * gets parameter value
       */
      setParmVal : function (pid, name, val) {
         if (val === undefined) {
            delete pageState[pid].state.parameters[name];
         } else {
            pageState[pid].state.parameters[name] = val.slice(0);
         }
      },
      
      /**
       * gets state for the portlet
       */
      getState : function (pid) {
         return pageState[pid].state;
      },
      
      /**
       * sets state for the portlet
       */
      setState : function (pid, state) {
         pageState[pid].state = state;
      },

      // get initial data for the portlets. Clone it so that the test
      // code has a separate copy than the mockup hub.
      getInitData : function () {
         return JSON.parse(JSON.stringify(portlet.test.data.initialPageState));
      },

      /**
       * get the available portlet IDs in an array 
       */
      getIds : function () {
         var id, ids = [];
         for (id in pageState) {
            if (!pageState.hasOwnProperty(id)) {
               continue;
            }
            ids.push(id);
         }
         return ids;
      },

      
      /**
       * performs the actual action.
       * 
       * @param   {string}    type     The URL type
       * @param   {string}    pid      The portlet ID
       * @param   {PortletParameters}    parms      
       *                Additional parameters. May be <code>null</code>
       * @param   {HTMLFormElement}    Form to be submitted
       *                               May be <code>null</code> 
       * @param   {function}  callback Function to be called with
       *                               list of portlet states when action is finished
       * @param   {function}  onError  Function to be called if error occurs
       * 
       * @throws  {AccessDeniedException}
       *                   Thrown if a blocking operation is
       *                   already in progress. 
       * @throws  {NotInitializedException} 
       *                   Thrown if a portlet ID is provided, but no onStateChange
       *                   listener has been registered.
       * @private 
       */
      executeAction : function (pid, parms, element, callback, onError) {
         var states, ustr, tpid, state;

         // pretend to create a url, etc. ... for the mockup
         // we don't need the parms or element

         // get the mockup data update string and make it into an object.
         // update each affected portlet client. Makes use of a 
         // test function for decoding. 
         
         ustr = portlet.test.data.updateStrings[pid];
         states = portlet.impl.decodeUpdateString(ustr, pid);
         callback(states);

      },

      
      /**
       * Updates the specified public render parameters.
       * The input object contains the public render parameters to be
       * updated as properties and the new values as the property values.
       * 
       * @param      {string}       pid      The portlet ID
       * @param      {PortletState} state    The new portlet state
       * @param      {object}    prps        The public render parameters
       *                                     and values
       * @param   {function}  callback Function to be called with
       *                               list of portlet states when action is finished
       * @param   {function}  onError  Function to be called if error occurs
       * 
       * @private
       */
      updateParameters : function (pid, state, prps, callback, onError) {
         var prp, prpNames, oldVal, newVal, tpid, ii, pids, aState, states = {};
         
         // For each updated PRP for the
         // initiating portlet, update that PRP in the other portlets.
         for (prp in prps) {
            if (!prps.hasOwnProperty(prp)) {
               continue;
            }

            newVal = prps[prp];

            // process each portlet ID
            pids = portlet.impl.getIds();
            ii = pids.length;
            while ((ii = ii - 1) >= 0) {
               tpid = pids[ii];
               // don't update for initiating portlet. that's done after the loop
               if (tpid === pid) {
                  continue;
               }

               oldVal = portlet.impl.getParmVal(tpid, prp);
               prpNames = portlet.impl.getPRPNames(tpid);
               
               // check for public parameter and if the value has changed
               if ((prpNames.indexOf(prp) >= 0) && 
                   (portlet.impl.isParmEqual(oldVal, newVal) === false)) {
               
                  aState = portlet.impl.cloneState(portlet.impl.getState(tpid));
                  if (newVal === undefined) {
                     delete aState.parameters[prp];
                  } else {
                     aState.parameters[prp] = newVal.slice(0);
                  }
                  states[tpid] = aState;
                  
               }
     
            }
         }
         
         // update state for the initiating portlet
         aState = portlet.impl.cloneState(state);
         states[pid] = aState;
         callback(states);

      },

      
      /**
       * Returns a URL of the specified type.
       * 
       * @param   {string}    type     The URL type
       * @param   {string}    pid      The portlet ID
       * @param   {PortletParameters}    parms      
       *                Additional parameters. May be <code>null</code>
       * @param   {string}    cache    Cacheability. Must be present if 
       *                type = "RESOURCE". May be <code>null</code> 
       * @private 
       */
      getUrl : function (type, pid, parms, cache) {

         var url = "http://www.dummyportal.com/some/context/";
             var qparms = [], rparms, qp, state, tpid, val, pids, ii, jj;
             
         // for a mockup, should be good enough ...
         // optimized for easy parsing by the test code. 
         // see "portlet.test" below.
         
         // This is how it should look:
         //  http://www.dummyportal.com/some/context/PortletA/ACTION/PAGE/?&rp1=resVal&RENDERPARMS
         //  &~~~&PortletA&mode=VIEW&ws=NORMAL&parm1=Fred&parm2=Wilma&parm2=Pebbles&parm3=Barney&parm3=Betty&parm3=Bam%20Bam
         //  &~~~&PortletB&mode=VIEW&ws=NORMAL&parm1=val1&pubparm1=pubval1&parm2=val2&parm2=val3
         //  &~~~&PortletC&mode=VIEW&ws=NORMAL&parm1=val1&pubparm1=pubval1&pubparm2=pubval2&parm2=val2&parm2=val3
         //  &~~~&PortletD&mode=VIEW&ws=NORMAL&pubparm1=private_val1&pubparm2=pubval2&parm2=val2&parm2=val3
         //  &~~~&PortletE&mode=VIEW&ws=NORMAL&parm1=val1&parm2=val2&parm2=val3&pubparm1=pubval1&pubparm2=pubval2
         //  &~~~&PortletF&mode=VIEW&ws=NORMAL&~~~
         
         url += pid + "/" + type + "/"; 
         url += (((cache===undefined)||(cache===null))?"PAGE":cache) + "/?";
             
         // put the additional parameters on the URL
         if (parms !== null) {
            for (qp in parms) {
               for (var ii=0; ii<parms[qp].length; ii++) {
                  val = (parms[qp][ii] === null) ? "" : "=" + encodeURIComponent(parms[qp][ii]);
                  qparms.push(encodeURIComponent(qp) + val);
               }
            }
         }

         qparms.push("RENDERPARMS")
         qparms.push("~~~")

         // Don't put any render parameters on it cache=FULL
         if ((type !== "RESOURCE") || 
             ((type === "RESOURCE") && (cache !== "FULL"))) {
            
            pids = portlet.impl.getIds();
            jj = pids.length;
            while ((jj = jj - 1) >= 0) {
               tpid = pids[jj];
               
               // If cache=PORTLET, only put on the parms for that portlet
               if ((type === "RESOURCE") && (cache === "PORTLET") && (pid !== tpid)) {
                  continue;
               }
               
               // put the portlet state parameters on the URL
               state = portlet.impl.getState(tpid);
               
               qparms.push(encodeURIComponent(tpid));
               qparms.push("mode=" + state.portletMode);
               qparms.push("ws=" + state.windowState);
            
               rparms = state.parameters;
               for (qp in rparms) {
                  for (ii=0; ii<rparms[qp].length; ii++) {
                     val = (rparms[qp][ii] === null) ? "" : "=" + encodeURIComponent(rparms[qp][ii]);
                     qparms.push(encodeURIComponent(qp) + val);
                  }
               }
               qparms.push("~~~");
               
            }
         }
         
         // put on the query parms
         while (qparms.length > 0) {
            url += "&" + qparms.shift();
         }

         return url;
      },


      
      /**
       * Returns a deep-copy clone of the input portlet state object.
       * Used to provide the portlet client with a copy of the current 
       * state data rather than a reference to the live state itself.
       * 
       * @param      {PortletState} state    The portlet state object to check
       * @returns    {PortletState}          Clone of the input portlet state
       * @private
       */
      cloneState : function (aState) {
         var newParams = {},
         newState = {
               portletMode : aState.portletMode,
               windowState : aState.windowState,
               parameters : newParams
         }, key, oldParams = aState.parameters;

         for (key in oldParams) {
            newParams[key] = oldParams[key].slice(0); 
         }

         return newState;
      },

      
      /**
       * Compares the values of two parameters and returns true if they are equal
       * 
       * @param      {string[]}     parm1    First parameter
       * @param      {string[]}     parm2    2nd parameter
       * @returns    {boolean}               true if the new parm value is equal
       *                                     to the current value
       * @private
       */
      isParmEqual : function (parm1, parm2) {
         var ii;
         
         // The values are either string arrays or undefined.
         
         if ((parm1 === undefined) && (parm2 === undefined)) {
            return true;
         } else if ((parm1 === undefined) || (parm2 === undefined)) {
            return false;
         } else if (parm1.length != parm2.length){
            return false;
         } else {
            ii = parm1.length;
            while ((ii = ii - 1) >= 0) {
               if (parm1[ii] !== parm2[ii]) {
                  return false;
               }
            }
         }
         
         return true;
      },

      
      // decodes the update strings
      decodeUpdateString : function (ustr) {
         var states = {}, state, pid, ii, ind,
             pids = ustr.match(/~~&.*?&/g); // reluctant match
         
         // If there is no match, bad input data
         if (pids === null) {
            throwIllegalArgumentException("Invalid update string.");
         }
         
         // For each portlet being updated, get the new data
         ii = pids.length;
         while ((ii = ii -1) >= 0) {
            if (pids[ii].length < 5) {
               // the portlet ID must be at least 1 character long
               throwIllegalArgumentException("Invalid portlet ID in update string.");
            }
            
            // trim extra stuff off of the portlet id
            ind = pids[ii].length - 1;
            pid = pids[ii].substring(3, ind);
         
            state = portlet.test.action.getState(ustr, pid);
            states[pid] = state;
            
         }
         
         return states;
      },


   };

   /**
    * Some test functions that are implementation dependent
    * @namespace
    * @private
    */
   // portlet.test = {

         // test needs the data & IDs & decoder too
         // portlet.test.getInitData = portlet.impl.getInitData;
         // portlet.test.getIds = portlet.impl.getIds;
         portlet.test.decodeUpdateString = portlet.impl.decodeUpdateString;

   // };

   /**
    * Exception thrown when a portlet hub method is provided with an invalid argument.
    * @typedef    IllegalArgumentException 
    * @property   {string}    name     The exception name, equal to "IllegalArgumentException"
    * @property   {string}    message  An optional message that provides more detail about the exception
    */
   var throwIllegalArgumentException = function (msg) {
      throw {
         name : "IllegalArgumentException",
         message : msg
      };
   };

   /**
    * Utility function to convert a query string encoded according to 
    * mockup rules into a portlet parameters object.
    * <p>
    * Note that this function performs no special handling for
    * for any wondow state or portlet mode parameters that may be present.
    * 
    * @param qps   {string}             query string
    * 
    * @returns     {PortletParameters}  portlet parameters object
    * 
    * @private    
    */
   function qps2parms (qps) {
      var parms = {}, tparms, nameval, ii, pname, pval; 
      
      if (qps !== null && qps !== "") {
         tparms = qps.split("&");
         ii = tparms.length;
        
         // first element is always "", since query string begins with &
         while ((ii=ii-1) > 0) {
            
            nameval = tparms[ii].split("=");
            pname = decodeURIComponent(nameval[0]);
            pval = (nameval.length < 2) ? null : decodeURIComponent(nameval[1]);
            
            if (parms.hasOwnProperty(pname) === true) {
               parms[pname].unshift(pval);      // the order of values in the array matters.
            } else {
               parms[pname] = [];
               parms[pname].unshift(pval);
            }
         }
      }
      return parms;
   } 

   
   // Since the URL is encoded in a proprietary manner, the implementation
   // needs to provide functions that the test setup can use to decode them.
   // The following decode the action URL generated by the mock implementation.
   // also provided are the update strings for action and partial action testing.
   portlet.test.action  = {
         
         // gets the portlet ID from the URL
         getInitiatingPortletId : function (url) {
            var str = url.match(/context.*\?/);
            if (str !== null) {
               str = str[0].split("/")[1]; 
            }
            return str;
         },
         
         // tests if action URL
         isActionUrl : function (url) {
            var flag = false, str = url.match(/context.*\?/);
            if (str !== null) {
               str = str[0].split("/")[2];
               if (str === "ACTION") {
                  flag = true;
               }
            }
            return flag;
         },
         
         // tests if action URL
         isPartialActionUrl : function (url) {
            var flag = false, str = url.match(/context.*\?/);
            if (str !== null) {
               str = str[0].split("/")[2];
               if (str === "PARTIALACTION") {
                  flag = true;
               }
            }
            return flag;
         },
         
         // gets the action parameters from the URL
         getActionParms : function (url) {
            var str = url.replace(/^.*\?(.*)&RENDER.*$/, "$1");
            return qps2parms(str);
         },
         
         // gets the portlet state for given portlet id
         getState : function (url, pid) {
            var parms, state = {}, 
            // URI encode because the pid in the URL was URI encoded. afterwards escape for regex.
            encpid = encodeURIComponent(pid).replace(/[-\/\\^$*+?.()|[\]{}]/g, '\\$&'),
            reg = "^.*&" + encpid + "(.*?)(?=&~~~).*$",  
            regexp = new RegExp(reg), str;

            if (url.match(regexp) !== null) {

               str = url.replace(regexp, "$1");
               parms = qps2parms(str);

               // test for parms being available -
               if (parms.ws !== undefined) {

                  // don't worry about deep copy.
                  state.windowState = parms.ws[0]; 
                  delete parms.ws;
                  state.portletMode = parms.mode[0];
                  delete parms.mode;
                  state.parameters = parms;

               }
            }
             
            return state;
         },
         
   };
   
   // Since the URL is encoded in a proprietary manner, the implementation
   // needs to provide functions that the test setup can use to decode them.
   // The following decode the resource URL generated by the mock implementation.
   portlet.test.resource = {
         
         // gets the portlet ID from the URL
         getInitiatingPortletId : function (url) {
            var str = url.match(/context.*\?/);
            if (str !== null) {
               str = str[0].split("/")[1]; 
            }
            return str;
         },
         
         // tests if resource URL
         isResourceUrl : function (url) {
            var flag = false, str = url.match(/context.*\?/);
            if (str !== null) {
               str = str[0].split("/")[2];
               if (str === "RESOURCE") {
                  flag = true;
               }
            }
            return flag;
         },
         
         // gets the cacheability from the URL
         getCacheability : function (url) {
            var str = url.match(/context.*\?/);
            if (str !== null) {
               str = str[0].split("/")[3]; 
            }
            return str;
         },
         
         // gets the resource parameters from the URL
         getResourceParms : function (url) {
            var str = url.replace(/^.*\?(.*)&RENDER.*$/, "$1");
            return qps2parms(str);
         },
         
         // gets the portlet state for given portlet id
         getState : function (url, pid) {
            var parms, state = {}, encpid = encodeURIComponent(pid),
            reg = "^.*&" + encpid + "(.*?)(?=&~~~).*$",  
            regexp = new RegExp(reg), str;

            if (url.match(regexp) !== null) {

               str = url.replace(regexp, "$1");
               parms = qps2parms(str);

               // test for parms being available -
               if (parms.ws !== undefined) {

                  // don't worry about deep copy.
                  state.windowState = parms.ws[0]; 
                  delete parms.ws;
                  state.portletMode = parms.mode[0];
                  delete parms.mode;
                  state.parameters = parms;

               }
            }
             
            return state;
         },
         
   };
   
})();
