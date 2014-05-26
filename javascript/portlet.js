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
 * This module provides JavaScript functions for portlets.
 * 
 * @author Scott Nicklous
 * @copyright IBM Corp., 2014
 */

/**
 * Represents a portlet parameter. 
 * <p>
 * Each object property represents a parameter name.
 * The object may also contain no property names, 
 * which represents the case of the portlet having no parameters.
 * <p>
 * If properties are present,  
 * each property must refer to a array of string values.
 * The array length must be at least 1, because each parameter must have 
 * a value. 
 * However, a value of 'null' may appear in any array entry. 
 * <p>
 * To represent the parameter having a <code>null</code> value, the 
 * property value must equal [null].
 * <p> 
 * @typedef    PortletParameter 
 * @property   {string[]}  {string}   The parameters object may have 
 *                                    multiple properties.
 */

/**
 * Represents the portlet state.
 * @typedef    PortletState 
 * @property   {PortletParameter}   parameters     The portlet parameters
 * @property   {string}             portletMode    The portlet mode  
 * @property   {string}             windowState    The window state
 */

/**
 * Optional render data that may be provided by the portlet hub when 
 * a portlet state change occurs. 
 * 
 * @typedef    RenderData 
 * @property   {string}             renderData     The render data
 * @property   {string}             mimeType       The mime type
 */

/**
 * The onStateChange callback function that each portlet client
 * participating in the portlet hub Ajax support must implement.
 * <p>
 * The portlet client registers an onStateChange callback by adding a 
 * listener for the portlet.onStateChange
 * event type through the {@link addEventListener} function.
 * <p>
 * When the portlet hub calls the onStateChange callback, it will pass
 * a copy of the current portlet state as a parameter.
 * The portlet client can make changes to the PortletState object
 * without affecting the actual portlet state, which is maintained by the 
 * portlet hub.
 * The portlet client uses the {@link setPortletState} method to 
 * make changes to the local copy of the PortletState object active.
 * <p>
 * Optionally, the portlet hub will make a RenderData object available
 * to the portlet client. 
 * When the RenderData object is available, it contains the same data
 * as would be available through a portlet resource request using the
 * current portlet state with no additional resource parameters and with 
 * the resource URL cacheability option set to "PAGE". 
 * <p>
 * The portlet client may not call portlet hub functions that can
 * cause state to be updated ({@link action}, {@link updatePortletState},
 * {@link startPartialAction})   
 * during onStateChange execution.
 *  
 * @name       onStateChange
 * @callback   onStateChange
 * @param      {string}       type           The event type "portlet.onStateChange".
 * @param      {PortletState} portletState   The portlet state
 * @param      {RenderData}   renderData     The render data. 
 *                                           Optionally provided by the portlet hub.
 */

/**
 * This data is returned to the portlet client by the {@link startPartialAction}
 * function.
 * <p>
 * The portlet client can use the partial action URL to initiate processing.
 * During processing, the portal will perform action and event processing.
 * It will generate a string representing the new page state and pass it to the
 * portlet's serveResource method. 
 * <p>
 * The portlet is responsible for transmitting the page state string to the 
 * client and for calling the {@link setPageState} callback function. 
 * <p>
 * The portlet hub will be blocked until the portlet calls the setPageState
 * function and the portlet hub has successfully performed the state change.  
 * 
 * @typedef    PartialActionInit 
 * @property   {string}             url               The partial action URL
 * @property   {function}           setPageState      Callback function
 */

/**
 * Provides the name of an error that occurred along with an optional
 * message that provide more detail.
 * @typedef    ErrorData 
 * @property   {string}    name     The error name
 * @property   {string}    message  An optional message that provides more detail about the error
 */

/**
 * The onError callback function that a portlet client
 * participating in the portlet hub Ajax support may implement.
 * Typically the callback will be used to provide the portlet client with 
 * information about asynchronous errors that occurred during processing.
 * <p>
 * The portlet client registers an onError callback by adding a listener for the portlet.onError
 * event type through the {@link addEventListener} function. 
 * @name       onError
 * @callback   onError
 * @param      {string}       type           The event type "portlet.onError".
 * @param      {ErrorData}    errorData      Provides information about the error.
 */


/**
 * The "portlet" namespace is reserved for use by portal 
 * JavaScript support implementations. 
 * <p>
 * Portlet Specification 2.0 (JSR 286) provided Ajax support for portlets by
 * adding a resource URL, resource request, and serveResource() method to allow
 * portlet JavaScript code to retrieve data directly from the portlet.
 * Portlet Specification 3.0 (JSR 362) expands on that by providing capability 
 * allowing a portlet to change its state through JavaScript functions.
 * <p>
 * To do so, Portlet Specification 3.0 introduced a JavaScript component called the 
 * Portlet Hub that manages the state of all portlets on a portal page.
 * <p>
 * Some terminology:
 * <dl>
 * <dt>
 * Portlet Hub
 * </dt>
 * <dd>JavaScript component that manages the state of all portlets on a portal
 * page.
 * It is considered to be part of the portal implementation.
 * This document describes its JavaScript interfaces and behavior.
 * <p> 
 * Portlet JavaScript code can use the Portlet Hub programming interface to modify 
 * its state by setting private and public render parameters to submit forms while 
 * remaining in the Ajax application paradigm. 
 * <p>
 * Many portlets can be present on the page and the portlets are in general independent
 * of one another and they are not aware of the state of other portlets, 
 * so they are unable to generate URLs properly representing
 * the complete page state.
 * The Portlet Hub provides methods that allow portlets to obtain URLs 
 * representing the current portal page state.
 * <p>
 * The programming interface and behavior of this component is standardized by JSR 362. 
 * </dd>
 * <dt>
 * Portlet Client
 * </dt>
 * <dd>
 * JavaScript code written by the portlet developer that uses the portlet hub 
 * to manage its state and to obtain URLs for retrieving data. 
 * </dd>
 * </dl>
 * <h5>
 * Changing the Portlet State
 * </h5>
 * <p>
 * The portlet client can use portlet hub functions to initiate state changes. 
 * <p>
 * The portlet client can set public
 * and private render parameters as well as the portlet mode and window state.
 * <p>
 * In addition, the portlet client can submit a
 * portlet action request that uses HTTP POST semantics. 
 * The portal will execute the portlet Action Phase and Event Phase processing on
 * the server and return the updated page state to the portlet hub.
 * <p>
 * After the requested state change has been performed, the portlet hub will usually
 * provide each affected portlet client with its updated state information.
 * <p>
 * However, regardless of whether the state change was initiated by setting
 * parameters or through a portlet action, the portal may respond by completely
 * refreshing the page. 
 * The portal may do so in order to support portlets that are affected by the state
 * change but do not participate in the portlet client-side support, or for
 * implementation-specific reasons.
 * <p>
 * If the portal responds to a state change request by refreshing the page, the
 * portlets will not be updated with new page state information before the
 * page refresh is carried out.
 * <h5>
 * Receiving Portlet State Updates
 * </h5>
 * <p>
 * When a state change occurs that affects a portlet, the portlet hub informs the 
 * affected portlet client of its new state through use of a
 * callback function.
 * The change causing the update does not necessarily need to be initiated by the 
 * portlet client itself.
 * <p>
 * For example, when portlet A changes a 
 * public render parameter used by portlet B, the portlet 
 * hub will inform both the portlet A and the portlet B clients of that change.
 * <h5>
 * Portlet Client Events
 * </h5>
 * <p>
 * Portlet client events consist of an event type and an event payload. Both are defined by
 * by the portlet clients themselves.
 * <p>
 * Portlet client events have no connection to the server-side portlet event mechanism.  
 * <p>
 * The portlet hub provides utility functions that enable the portlet client 
 * to dispatch and listen for portlet client events. 
 * <h5>
 * Error Handling
 * </h5>
 * <p>
 * When the portlet hub can recognize an error during function execution, the error will
 * be reported to the portlet client through an exception.
 * <p>
 * However, some methods initiate work that is performed asynchronously. 
 * Errors that occur during asynchronous processing will be reported to the portelt
 * client through the {@link onError} callback function.
 * <h5>
 * Important Considerations
 * </h5>
 * <p>
 * The portlet hub calls the portlet client callback functions in several situations as described
 * above. 
 * When the portlet hub calls the portlet client, the portlet client may navigate 
 * to a different page or may initiate another change to the portlet state
 * that could potentially cause a page refresh. 
 * <p>
 * Due to this behavior, the delivery of neither portlet state updates nor 
 * portlet client events can be guaranteed.
 * <p>
 * The portlet hub provides for orderly state transitions by allowing only a
 * single blocking operation ({@link action}, {@link setPortletState},
 * {@link startPartialAction}) to be active at any one time.
 * <p>
 * The state transition is considered to be active from the initial portlet 
 * client call to one of the blocking operations until the portlet 
 * hub has performed the requested state change and has informed all of 
 * the affected portlet clients by firing the corresponding onStateChange
 * events.
 * <p>
 * This has the following implications:
 * <ol>
 * <li>
 * It is not possible to initiate a sequence of blocking operations.
 * <p>
 * For example, once a portlet client calls the {@link setPortletState} method,
 * it cannot call any additional blocking method until after its 
 * onStateChange listener function has been called.
 * </li>
 * <li>
 * It is not possible to initiate a blocking operation during
 * execution of the onStateChange listener function, since execution of
 * that function belongs to the preceeding state change operation. 
 * </li>
 * </ol>     
 * <hr>
 * @namespace 
 */
var portlet = portlet || {};


(function() {
   'use strict'

   // If module has already been loaded, don't load again 
   if (typeof portlet.register === 'function') {
      return;
   } 

   // variable declarations
   var pi = portlet.impl,    
       isInitialized = false,           // marker to allow lazy initialization
   
   /**
    * Portlet Hub Mockup internal structure defining the data held 
    * for each portlet
    * 
    * @typedef    PortletData
    * @property   {PortletState} state       The current PortletState object
    * @property   {string[]}     pubParms    String array declaring the public 
    *                                        parameters for the portlet
    * @property   {RenderData}   renderData  Render data for the portlet
    * @private
    */
                                          

   // Helper functions
   
   wnd = window,
   delay = function(aCallback, aTimeout) {
      wnd.setTimeout(aCallback, aTimeout);
   },


   /**
    * Sets  up the portlet hub for use. 
    * To implement the mockup, data and functions are retrieved from 
    * the global namespace. It was done in this manner to improve testability.
    * A "real" portlet hub implementation would likely keep everything within the 
    * closure.
    * @private
    */
   initialize = function () {
      if (isInitialized) {
         return;
      }

      isInitialized = true;
   },


   // ~~~~~~~~~~~~~~~~~~~~~~ Exceptions ~~~~~~~~~~~~~~~~~~~~~~~~~~

   /**
    * Exception thrown when a portlet hub method is provided with an invalid argument.
    * @typedef    IllegalArgumentException 
    * @property   {string}    name     The exception name, equal to "IllegalArgumentException"
    * @property   {string}    message  An optional message that provides more detail about the exception
    */
   throwIllegalArgumentException = function (msg) {
      throw {
         name : "IllegalArgumentException",
         message : msg
      };
   },

   /**
    * Exception thrown when a portlet client is not allowed to access a data element
    * @typedef    AccessDeniedException 
    * @property   {string}    name     The exception name, equal to "AccessDeniedException"
    * @property   {string}    message  An optional message that provides more detail about the exception
    */
   throwAccessDeniedException = function (msg) {
      throw {
         name : "AccessDeniedException",
         message : msg
      };
   },

   /**
    * Thrown when a portlet hub encounters an internal error.
    * @typedef    ImplementationException 
    * @property   {string}    name     The exception name, equal to "ImplementationException"
    * @property   {string}    message  An optional message that provides more detail about the exception
    */
   throwImplementationException = function (msg) {
      throw {
         name : "ImplementationException",
         message : msg
      };
   },

   /**
    * Thrown when a portlet attempts to use the API without comleting the intialization
    * process.
    * In general, this means that the onStateChange listener has not been added.
    * 
    * @typedef    NotInitializedException 
    * @property   {string}    name     The exception name, equal to "NotInitializedException"
    * @property   {string}    message  An optional message that provides more detail about the exception
    */
   throwNotInitializedException = function (msg) {
      throw {
         name : "NotInitializedException",
         message : msg
      };
   },

   // ~~~~~~~~~~~~~~~~~~~~~~ Event Handling ~~~~~~~~~~~~~~~~~~~~~~~~~~
   // for event handling
   handleCtr = 0,                         // used to generate handles returned by addEventListener
   
   // System listeners (onStateChange and onError). Associative arrays indexed by portletID
   oscListeners = {},
   oeListeners = {},                      // onError listeners

   // Portlet Client Event listeners. Associative array indexed by handle
   pcListeners = {},                      // portlet client event listeners

   
   /**
    * Add an event listener of the given type to the specified
    * portlet client listener storage object.
    * <p>
    * The portlet client event listeners are stored in associative arrays (objects) 
    * indexed by the event listener handle.
    * 
    * @param      {object}    list        The object where the listener will be stored
    * @param      {string}    pid         The portletID
    * @param      {string}    etype       The event type
    * @param      {function}  func        The the listener function to be called
    * @private
    */
   addPCListener = function (list, pid, etype, func) {
      var hand = "handle-" + (++handleCtr);
      list[hand] = {
                     handle   : hand,
                     id       : pid,
                     type     : etype,
                     callback : func
                   };
      return hand;
   },
   
   
   /**
    * Removes an event listener identified by the portletId and handle from the
    * portlet client listener storage object
    * @param      {object}    list     The object where the listener will be stored
    * @param      {string}    pid      The portletID
    * @param      {object}    handle   The event listener handle
    * @returns    {boolean}            <code>true</code> if the listener was removed
    * @throws     {AccessDeniedException} 
    *                   Thrown if the event listener associated with this handle 
    *                   was registered by a different portlet
    * @private
    */
   removePCListener = function (list, pid, handle) {
      if (typeof list[handle] === 'object') {
         
         // the listener was found, so if the portlet ID matches, remove it. 
         if (list[handle].id === pid) {
            delete list[handle];
         } else {
            throwAccessDeniedException("Invalid handle for portlet ID=" + pid);
         } 
         return true;
      } else {
         return false;
      }
   },

   
   /**
    * Add an event listener of the given type to the specified system event listener
    * storage object.
    * <p>
    * The system event listeners are stored in associative arrays (objects) indexed
    * by portlet ID.
    * 
    * @param      {object}    list        The object where the listener will be stored
    * @param      {string}    pid         The portletID
    * @param      {string}    etype       The event type
    * @param      {function}  func        The the listener function to be called
    * @private
    */
   addSystemListener = function (list, pid, etype, func) {
      
      // A system listener can only be added once
      if (list[pid] !== undefined) {
         throwIllegalArgumentException("Duplicate system event listener. Type: " + etype);
      }
      
      // add the listener
      var hand = "handle-" + (++handleCtr); 
      list[pid] = {
                     handle   : hand,
                     id       : pid,
                     type     : etype,
                     callback : func
                   };
      return hand;
   },
   
   
   /**
    * Removes an event listener identified by the portletId and handle from the
    * system listener storage object
    * @param      {object}    list     The object where the listener will be stored
    * @param      {string}    pid      The portletID
    * @param      {object}    handle   The event listener handle
    * @returns    {boolean}            <code>true</code> if the listener was removed
    * @private
    */
   removeSystemListener = function (list, pid, handle) {
      var ii;
      if (typeof list[pid] === 'object') {
         
         // the listener was found, so if the portlet ID matches, remove it. 
         if (list[pid].handle === handle) {
            delete list[pid];
            
            // purge any pending notifications -
            ii = updateQueue.length;
            while ((ii = ii - 1) >= 0) {
               if (updateQueue[ii] == pid) {
                  updateQueue.splice(ii, 1);
               }
            }
            
            return true;
         } 
      }
      return false;
   },
   
   
   // ~~~~~~~~~~~~~~~~~~~~~~ State handling ~~~~~~~~~~~~~~~~~~~~~~~~~~
   // 
   
   // the portlet hub can only execute a single blocking operation
   // at a time. At the beginning of the operation, this flag is set to
   // true to prevent other blocking operations from beginning.
   // It is reset after the last onStateChange event resulting from the
   // state change has been fired.
   // (or also if a communication error occurs.)
   busy = false,
   
   // queue for the portlet ID's that need updating
   updateQueue = [],
   
   /**
    * Calls the portlet onStateChange method in an asynchronous manner
    * in order to decouple the public API.
    * This method is intended for use after a portlet client registers an
    * onStateChange listener.
    * <p> 
    * In a real implementation, the 
    * portlet hub might need to communicate with the portal server to obtain
    * data. 
    * @param      {string}    pid      The portlet ID
    * @private
    */
   updateStateForPortlet = function (pid) {
      
      // only enqueue each portlet once, and only for portlets with a callback
      if ((updateQueue.indexOf(pid) >= 0) || (oscListeners[pid] === undefined)) {
         return;
      }
      
      updateQueue.push(pid);

      if (updateQueue.length == 1) {
         delay (function () {
            var p, state, data, callback;
           
            // The busy flag is usually set by the caller. 
            // but ... need more thought here. When the onStateChange
            // listener is added, the busy flag isn't set in order to avoid
            // blocking the state changes, since adding a listener doesn't
            // change the state. So it's set here, before onStateChange is
            // called so that the state change functions are blocked.
            busy = true;
            
            while (updateQueue.length > 0) {
               
               // get the next portlet ID and call its
               // onStateChange function
               p = updateQueue.shift();
               state = pi.cloneState(pi.getState(p));
               data = pi.getRenderData(p);
               callback = oscListeners[p].callback;
            
               if ((data.renderData !== undefined) && (data.renderData !== null)) {
                  callback ("portlet.onStateChange", state, data);
               } else {
                  callback ("portlet.onStateChange", state);
               }
            }
            busy = false;
         }, 0);
      }
   },
   
   // queue for client events
   ceQueue = [],
   
   /**
    * dispatches the client events.
    * 
    * @param      {string}    type      The portlet ID
    * @param      {function}  callback  Callback function          
    * @param      {any}       payload   Event payload
    * @private
    */
   dispatchCE = function (type, callback, payload) {
      var evt = [];
      
      evt.push(callback);
      evt.push(type);
      evt.push(payload);
      
      ceQueue.push(evt);

      if (ceQueue.length == 1) {
         delay (function () {
            var event, aType, aCallback, aPayload;
           
            while (ceQueue.length > 0) {

               // dispatch next event
               event = ceQueue.shift();
               
               aCallback = event[0];
               aType = event[1];
               aPayload = event[2];
            
               aCallback(aType, aPayload);
            }
         }, 0);
      }
   },
   
   /**
    * Compares the values of the named parameter in the new portlet state
    * with the values of that parameter in the current state.  
    * 
    * @param      {string}       pid      The portlet ID
    * @param      {PortletState} state    The new portlet state
    * @param      {string}       name     The parameter name to check
    * @returns    {boolean}               true if the new parm value is different
    *                                     from the current value
    * @private
    */
   isParmInStateEqual = function (pid, state, name) {
      var newVal = state.parameters[name],
          oldVal = pi.getParmVal(pid, name); 
      
      return pi.isParmEqual(newVal, oldVal);
   },
   
   /**
    * Gets the updated public parameters for the given portlet
    * ID and new portlet state. 
    * Returns an object whose properties are the names of the 
    * updated public parameters. The values are the new public 
    * parameter values.
    * 
    * @param      {string}       pid      The portlet ID
    * @param      {PortletState} state    The new portlet state
    * @returns    {object}                object containing the updated PRPs
    * @private
    */
   getUpdatedPRPs = function (pid, state) {
      var prps = {}, 
          ii = 0, 
          prpNames = pi.getPRPNames(pid),
          name;
      
      for (; ii < prpNames.length; ii++) {
         name = prpNames[ii];
         if (isParmInStateEqual(pid, state, name) === false) {
            prps[name] = state.parameters[name];
         }
      }
      
      return prps;
   },
   
   /**
    * Updates the portlet state, taking the public render 
    * parameters into account.
    * The portlet client requesting the change, represented
    * by the supplied portelt ID, is updated, along with each portlet
    * that has a public render parameter update.
    * 
    * @param      {string}       pid      The portlet ID
    * @param      {PortletState} state    The new portlet state
    * @throws  {AccessDeniedException}
    *                   Thrown if a blocking operation is
    *                   already in progress. 
    * @throws  {NotInitializedException} 
    *                   Thrown if a portlet ID is provided, but no onStateChange
    *                   listener has been registered.
    * @private
    */
   updateState = function (pid, state) {
      var prps, prp, prpNames, oldVal, newVal, tpid, ii, pids;

      // do necessary checks
      
      if (busy === true) {
         throwAccessDeniedException("Operation in progress");
      } else if (typeof oscListeners[pid] === 'undefined') {
         throwNotInitializedException("No onStateChange listener registered for portlet: " + pid);
      }

      busy = true;
      
      // handle the public render parameters. For each updated PRP for the
      // initiating portlet, update that PRP in the other portlets.
      prps = getUpdatedPRPs(pid, state);
      pi.updateParameters(pid, state, prps, updatePageState);

   },
   
   /**
    * Accepts an object containing changed portlet states. Updates
    * the state for each portlet present. 
    * 
    * @param   {PortletStates} states  Object containing portlet states to update
    * @private 
    */
   updatePageState = function (states) {
      var tpid, state;

      for (tpid in states) {
         if (!states.hasOwnProperty(tpid)) {
            continue;
         }
         
         // update state for the portlet
         state = states[tpid];
         pi.setState(tpid, state);
         updateStateForPortlet(tpid);

      }

   },

   
   // ~~~~~~~~~~~~~~~~~~~~~~ Other functions ~~~~~~~~~~~~~~~~~~~~~~~~~~

   /**
    * Verifies that the input parameters are in valid format.
    * <p>
    * Parameters must be an object containing parameter names.
    * It may also contain no property names which represents the case of having
    * no parameters.
    * <p>
    * If properties are present,  
    * each property must refer to a array of string values.
    * The array length must be at least 1, because each parameter must have 
    * a value. 
    * However, a value of 'null' may appear in any array entry. 
    * <p>
    * To represent a <code>null</code> value, the property value must equal
    * [null]. 
    * 
    * @param      {PortletParameter} parms    The parameters to check
    * @private
    * @throws  {IllegalArgumentException} 
    *             Thrown if the parameters are incorrect
    */
   validateParms = function (parms) {
      
      // check for null or undefined argument
      if ((parms === null) || (parms === undefined)) {
         throwIllegalArgumentException("The parameters object is " + (typeof parms));
      } 

      for (var parm in parms) {
         if (Object.prototype.toString.call(parms[parm]) !== '[object Array]') {
            throwIllegalArgumentException("Invalid parameters. The value of " + 
                  parm + " is " + Object.prototype.toString.call(parm) + 
                  " rather than '[object Array]'");
         } else if (parms[parm].length == 0) {
            throwIllegalArgumentException("Invalid parameters. The value of " + 
                  parm + " is " + "an array with length 0.");
         } 
      }
   },

   /**
    * Verifies that the input parameters are in valid format,
    * that the portlet mode and window state values are allowed 
    * for the portlet.
    * 
    * @param      {string}       pid      The portlet ID
    * @param      {PortletState} state    The portlet state object to check
    * @private
    * @throws  {IllegalArgumentException} 
    *             Thrown if any component of the state is incorrect
    */
   validateState = function (pid, state) {
      validateParms(state.parameters);

     // see if the portlet mode is a string and is a value allowed for the
     // portlet
     if ((state.portletMode === undefined) || (typeof state.portletMode !== 'string')) {
        throwIllegalArgumentException("Invalid parameters. portletMode is " + 
              (typeof state.portletMode));
     } else if (!pi.isAllowedPM(pid, state.portletMode)) {
        throwIllegalArgumentException("Invalid portletMode=" + state.portletMode
           + " is not in " + pi.getAllowedPM(pid));
     }

     // see if the windowState is a string and is a value allowed for the
     // portlet
     if ((state.windowState === undefined) || (typeof state.windowState !== 'string')) {
        throwIllegalArgumentException("Invalid parameters. windowState is " + 
              (typeof state.windowState));
     } else if (!pi.isAllowedWS(pid, state.windowState)) {
        throwIllegalArgumentException("Invalid windowState=" + state.windowState
           + " is not in " + pi.getAllowedWS(pid));
     }
      
   },

   
   /**
    * sets up for the action.
    * 
    * @param   {string}    type     The URL type
    * @param   {string}    pid      The portlet ID
    * @param   {PortletParameters}    parms      
    *                Additional parameters. May be <code>null</code>
    * @param   {HTMLFormElement}    Form to be submitted
    *                               May be <code>null</code> 
    * @throws  {AccessDeniedException}
    *                   Thrown if a blocking operation is
    *                   already in progress. 
    * @throws  {NotInitializedException} 
    *                   Thrown if a portlet ID is provided, but no onStateChange
    *                   listener has been registered.
    * @private 
    */
   setupAction = function (pid, parms, element) {
      var states, ustr, tpid, state;
 
      // do necessary checks

      if (busy === true) {
         throwAccessDeniedException("Operation in progress");
      } else if (typeof oscListeners[pid] === 'undefined') {
         throwNotInitializedException("No onStateChange listener registered for portlet: " + pid);
      }

      busy = true;
      
      pi.executeAction(pid, parms, element, updatePageState);

   },
   
   /**
    * Callback function that must be called after a 
    * partial action has been started.
    * <p>
    * The page state is generated by the portal and transmitted to the 
    * client by the portlet.
    * The portlet client that initiated the partial action must 
    * pass the page state string to this function.
    * <p>
    * The callback should only be called once to conclude a partial
    * action sequence. 
    * 
    * @param   {string}    ustr     The new page state in string form
    * @throws  {IllegalArgumentException} 
    *                      Thrown if the parameter is not a string
    * @name       setPageState
    * @callback   setPageState
    */
   setPageState = function (ustr) {
      var states;
 
      // check for exactly 1 argument of type 'string'
      checkArguments(arguments, 1, 1, ['string']);

      // convert page state into an object.
      // update each affected portlet client. Makes use of a 
      // mockup-specific function for decoding. 
      
      states = portlet.impl.decodeUpdateString(ustr);
      updatePageState(states);

   },


   /**
    * Used by the portlet hub methods to check the number and types of 
    * the arguments.
    * 
    * @private
    * @param   {string[]}  parms    The argument list to be checked
    * @param   {number}    minParms The minimum number of arguments
    * @param   {number}    maxParms The maximum number of arguments.
    *                               If this value is undefined, the function can take any 
    *                               number of arguments greater than numArgs
    * @param   {string[]}  types    An array containing the expected parameter types
    *                               in the order of occurrance in the argument array
    * @throws  {IllegalArgumentException} 
    *                               Thrown if the parameters are in some manner incorrect
    */
   checkArguments = function (parms, minParms, maxParms, types) {

      // Check for the minimum number of arguments
      if (parms.length < minParms) {
         throwIllegalArgumentException("Too few arguments provided. Number of arguments: " 
               + parms.length);

         // check for maximum number of arguments
      } else if ((typeof maxParms === 'number') && (parms.length > maxParms)) {
         throwIllegalArgumentException("Too many arguments provided: " + 
               [].join.call(parms, ', '));

         // check if the argument types are as expected if provided with types
      } else if (typeof types !== 'undefined'){
         
         var ii = Math.min(parms.length, types.length) - 1;
         for (; ii >= 0; ii = ii - 1) {
            if (typeof parms[ii] !== types[ii]) {
               throwIllegalArgumentException("Parameter " + ii + " is of type " + (typeof parms[ii]) 
                     + " rather than the expected type " + types[ii]);
            }
            
            // If checking for types, also make sure the arguments are neither
            // null nor undefined.
            if ((parms[ii] === null) || (parms[ii] === undefined)) {
               throwIllegalArgumentException("Argument is " + (typeof parms[ii]));
            } 
         }
      }
   };

   /**
    * Registers a portlet client with the portlet hub. 
    * <p>
    * The portlet client calling this method must provide a valid portlet ID.
    * The portlet ID is identical to the unique namespace provided by the 
    * portal server for the portlet.
    * 
    * @param {string}   portletId   The unique portlet identifier
    * @returns          A {@link PortletInit} object containing functions 
    *                   for use by the portlet client
    * @throws  {IllegalArgumentException} 
    *                   Throws an error if the input parameter is missing or 
    *                   is not a valid portlet ID.
    * @throws  {NotInitializedException}
    *                   Thrown if a problem occurred during portlet hub 
    *                   initialization. 
    */
   portlet.register = function (portletId) {
      var pi = portlet.impl, isRegistered = false;
      
      // Since this is the first function to be called, support lazy initialization
      initialize();
      
      function registrationComplete () {
         isRegistered = true;
      }
      
      // give the implementation a chance to register
      portlet.impl.register(portletId, registrationComplete);
      function waitForReg() {
         var ctr = 50;
         if (isRegistered !== true && ((ctr = ctr - 1) >= 0)) {
            delay(waitForReg, 20);
         }
         if (isRegistered !== true) {
            throwNotInitializedException("Error initializing implementation");
         }
      }
      waitForReg();

      // check for exactly 1 argument of type 'string'
      checkArguments(arguments, 1, 1, ['string']);

      if (pi.isValidId(portletId) !== true) {
         throwIllegalArgumentException("Invalid portlet ID: " + portletId);
      }

      /**
       * Returned by the {@link portlet.register} method to 
       * provide functions for use by the portlet client.
       * @namespace PortletInit
       */
      var portletInit = {


         /**
          * A string array containing the portlet modes that are defined for the 
          * portlet.
          * <p>
          * Note that even if a portlet mode is defined, it may not be allowed,
          * depending on access rights or other conditions.
          * 
          * @property   {string[]}  portletModes   The defined portlet mode values
          * @memberOf         PortletInit
          */
         portletModes : pi.getAllowedPM(portletId), 


         /**
          * A string array containing the window states that are defined for the 
          * portlet.
          * <p>
          * Note that even if a window state is defined, it may not be allowed,
          * depending on access rights or other conditions.
          * 
          * @property   {string[]}  windowStates   The defined window state values
          * @memberOf         PortletInit
          */
         windowStates : pi.getAllowedWS(portletId), 

         /**
          * Adds a listener function for specified event type.
          * <p>
          * The portlet hub defines two classes of events - System Events and Portlet Client events:
          * <dl>
          * <dt>System Events</dt>
          * <dd>
          * Events that are generated by the portlet hub. 
          * They are used to pass portlet-specific information to the registered portlet client.
          * The parameters passed to the system event callback functions are defined by the 
          * portlet hub.
          * <p>
          * Event types prefixed with "portlet." are reserved for system events.
          * System event types may not be specified with a regular expression or wildcard.
          * However, the same event listener may be added for both types of system events.
          * <p>
          * Only one listener for each type of system event may be added. 
          * <p>
          * The following system event types are defined:
          * <dl>
          * <dt>portlet.onStateChange</dt>
          * <dd>
          * Fired when the portlet state changes.
          * In order to participate in the portlet Ajax support, a portlet client must register 
          * an {@link onStateChange} event listener for this event type.
          * <p>
          * After the portlet client adds an event listener for the onStateChange 
          * event, the portlet hub will call the onStateChange callback function
          * to provide the portlet client with its initial state information.
          * However, this will not occur before the call to addEventListener returns.
          * </dd>
          * <dt>portlet.onError</dt>
          * <dd>
          * Fired when an error occurs that cannot be communicated through an exception.
          * In general, this will be some type of asynchronous communication error.
          * In order to receive notification about errors, a portlet must register 
          * an {@link onError} event listener for this event type.
          * </dd>
          * </dl>
          * </dd> 
          * <dt>Portlet Client Events</dt>
          * <dd>
          * Events initiated by the portlet client through the dispatch method.
          * <p>
          * When adding a listener for a portlet client event, the event type may be specified 
          * by a regular expression string. 
          * The listener will be called for every event type that the regular expression 
          * string matches.
          * <p>
          * Example:
          * <br>
          * myHub.addEventListener("^myCompany\..*", myListener);    // registers myListener for all event types beginning with "myCompany."
          * </dd>
          * </dl>
          * <p>
          * An event listener can be added for multiple event types. 
          * This function returns a handle to identify the unique listener
          * for the event type and for the portlet client associated with the function.
          * 
          * @param   {string}    type     The type of listener
          * @param   {function}  func     Function called when event occurs
          * 
          * @returns {object}             A handle that can be used to remove the event listener
          * 
          * @throws  {IllegalArgumentException} 
          *                   Thrown if the input parameters are invalid 
          * 
          * @memberOf            PortletInit
          */
         addEventListener: function (type, func) {

            // check for exactly 2 arguments of type 'string' and 'function'
            checkArguments(arguments, 2, 2, ['string', 'function']);
            
            var handle, listeners; 
            
            if (type.match("^portlet\..*")) {
               
               // Handle adding system event listener.
               // if it is neither a portlet.onStateChange nor a portlet.onError event, throw
               if ((type !== "portlet.onStateChange") && (type !== "portlet.onError")) {
                  throwIllegalArgumentException("The system event type is invalid: " + type);
               }
               
               if (type === "portlet.onStateChange") {
                  listeners = oscListeners;    // add the onStateChange listener
               } else {
                  listeners = oeListeners;     // add the onError listener
               }

               // will throw an exception if the listener has already been added
               handle = addSystemListener(listeners, portletId, type, func);

               // If just added an onStateChange listener, update the state
               if (type === "portlet.onStateChange") {
                  updateStateForPortlet(portletId);
               }

            } else {
               
               // Portlet client event listener
               handle = addPCListener(pcListeners, portletId, type, func);
            }               
            
            return handle;
         },

         /**
          * Removes a previously added listener function designated by the handle.
          * The handle must be the same object previously returned by the addEventListener
          * function.
          * 
          * @param   {object}    handle   The handle of the listener to be removed
          * 
          * @throws  {IllegalArgumentException} 
          *                   Thrown if the input parameters are invalid 
          * @throws  {AccessDeniedException} 
          *                   Thrown if the event listener associated with this handle 
          *                   was registered by a different portlet
          * 
          * @memberOf            PortletInit
          */
         removeEventListener: function (handle) {

            // check for exactly 1 argument. Don't check the argument type.
            checkArguments(arguments, 1, 1, []);
            
            // check for null or undefined argument
            if ((handle === null) || (handle === undefined)) {
               throwIllegalArgumentException("The argument provided is " + (typeof handle));
            }
            
            // Try to remove the listener from each of the listener arrays
            // one after the other. If not successful, the handle was invalid
            // (or an exception will be thrown by removePCListener), so throw.
            
            if ((removePCListener(pcListeners, portletId, handle) === false) &&
                (removeSystemListener(oscListeners, portletId, handle) === false) &&
                (removeSystemListener(oeListeners, portletId, handle) === false) 
               ) {

               throwIllegalArgumentException("The event listener handle doesn't match any listeners.");
            }
         },
         
         /**
          * Sets the portlet state, which consists of the public and private
          * render parameters, the portlet mode, and the window state.
          * <p>
          * When the portlet state has been successfully set, a copy of the portlet state 
          * will be provided to the portlet client
          * through the {@link onStateChange} listener function.
          * A portlet client can modify this state object and pass it to the
          * setPortletState function to update the portlet state.
          * <p>
          * However, it is also possible for the portal to completely refresh the 
          * page as a response to setting the portlet state. 
          * This may occur in order to support portlets on the page that do not participate
          * in the Portlet 3.0 Ajax support or due to configuration settings, for example.
          * <p>
          * If the page is completely refreshed, it will be rendered according to 
          * render parameters set on the server.
          * <p>
          * Setting the portlet state is a blocking operation.
          * To allow for orderly state transitions, the portlet hub does not allow
          * this function to be used while a blocking operation is in progress.
          * A blocking operation is considered to be in progress
          * from the initial call until the final onStateChange event for that 
          * operation has been fired. See {@link portlet} for further information.
          * 
          * @param   {PortletState}    state    The new state to be set
          * 
          * @throws  {IllegalArgumentException} 
          *                   Thrown if the input parameters are invalid 
          * @throws  {AccessDeniedException}
          *                   Thrown if a blocking operation is
          *                   already in progress. 
          * @throws  {NotInitializedException} 
          *                   Thrown if a portlet ID is provided, but no onStateChange
          *                   listener has been registered.
          * 
          * @memberOf   PortletInit
          */
         setPortletState : function (state) {

            // check for exactly 1 argument of type 'object'
            // make sure an onStateChange listener is registered by providing portlet ID
            checkArguments(arguments, 1, 1, ['object']);
            
            // validate portlet state & throw exception if incorrect
            validateState(portletId, state);
            
            // Ok so far, so do the update. Throws if busy or no callback registered
            updateState(portletId, state);

         },
         
         /**
          * Returns a resource URL with parameters set appropriately
          * for the page state according to the  resource parameters
          * and cacehability option provided.
          * <p>
          * The portlet client may use the resource URL with any appropriate
          * javascript framework to retrieve content from the portlet through
          * the server-side serveResource method.
          * <p>
          * Resource parameters are optional parameters attached to a resource 
          * URL in addition to any portlet state values that may be present.
          * Resource parameters do not influence the portlet state.
          * <p>
          * The resource parameters must be an object containing properties
          * representing parameter names whose values must be an array of string 
          * values, as described under {@link PortletParameter}. 
          * All of the resource parameters will be attached to the URL.
          * Use of resource parameters is optional.
          * <p>
          * The cacheability option designates the degree to which the content to be 
          * served can be cached and influences the type of content that can be served.
          * There are three possible values:
          * <dl>
          * <dd>"FULL"</dd>
          * <dt>
          * Most cacheable, because the URL contains no portlet-specific or 
          * page-specific information.
          * </dt>
          * <dd>"PORTLET"</dd>
          * <dt>
          * More cacheable, because the URL contains only portlet-specific but no 
          * page-specific information.
          * </dt>
          * <dd>"PAGE"</dd>
          * <dt>
          * Least cacheable because the URL contains portlet-specific and 
          * page-specific information.
          * <p>
          * However, cacheability must be set to "PAGE" if the content to be served contains
          * portal URLs.
          * </dt>
          * </dl>
          * <p>
          * Specification of cacheability is optional.
          * If the cacheability is not specified, cacheability for the URL
          * will be set to "PAGE".
          * <p>
          * The parameters may be specified in either order, individually,
          * or not at all. Examples of valid calls:
          * <code>
          * <br>createResourceUrl();
          * <br>createResourceUrl(resParams, cache);
          * <br>createResourceUrl(resParams);
          * <br>createResourceUrl(cache);
          * </code>
          * 
          * @param   {PortletParameters}  resParams   Resource parameters to be 
          *                                           added to the URL
          * @param   {string}             cache       Cacheability option
          * 
          * @returns {string}             The resource URL
          * 
          * @throws  {IllegalArgumentException} 
          *                   Thrown if the input parameters are invalid 
          * 
          * @memberOf   PortletInit
          */
         createResourceUrl : function (resParams, cache) {
            var ii, arg, parms=null, cache=null;

            // check arguments. make sure there is a maximum of two
            // args and determine the types. Check values as possible.
            if (arguments.length > 2) {
               throwIllegalArgumentException(
                     "Too many arguments. 2 arguments are allowed.");
            }
            
            ii = arguments.length;
            while ((ii = ii -1) >=0) {
               arg = arguments[ii];
               if (typeof arg === 'string') {
                  switch (arg) {
                  case "PAGE":
                  case "PORTLET":
                  case "FULL":
                     if (cache === null) {
                        cache = arg;
                     } else {
                        throwIllegalArgumentException(
                              "too many string arguments: " + arg + ", " + cache);
                     }
                     break;
                  default:
                     throwIllegalArgumentException(
                           "Invalid cacheability argument: " + arg);
                  }
                } else if (typeof arg === 'object') {
                   validateParms(arg);     // throws if parms are invalid
                   if (parms !== null) {
                      throwIllegalArgumentException(
                            "too many parameters arguments.");
                   }
                   parms = arg;
                } else {
                   throwIllegalArgumentException(
                         "Invalid argument type. argument " + ii + " is of type" 
                         + (typeof arg));
               }
            }

            // everything ok, so get URL
            return pi.getUrl("RESOURCE", portletId, parms, cache);
         },
         
         /**
          * Initiates a portlet action using the specified action parameters and element
          * arguments.
          * <p>
          * When the action has successfully completed, a copy of the portlet state 
          * will be provided to the portlet client
          * through the {@link onStateChange} listener function.
          * A portlet client can modify this state object and pass it to the
          * setPortletState function to update the portlet state.
          * <p>
          * However, it is also possible for the portal to completely refresh the 
          * page as a response to the action. 
          * This may occur in order to support portlets on the page that do not participate
          * in the Portlet 3.0 Ajax support or due to configuration settings, for example.
          * <p>
          * If the page is completely refreshed, it will be rendered according to 
          * render parameters set on the server.
          * <p>
          * Action parameters are optional parameters attached to a action 
          * URL in addition to any portlet state values that may be present.
          * Action parameters do not influence the portlet state.
          * <p>
          * The action parameters must be an object containing properties
          * representing parameter names whose values must be an array of string 
          * values, as described under {@link PortletParameter}. 
          * All of the action parameters will be attached to the URL.
          * Use of action parameters is optional.
          * <p>
          * If the <code>element</code> argument is present, it must refer to 
          * an HTML form to be submitted. 
          * The portlet hub will use this form to execute the action.
          * <p>
          * Specification of <code>element</code> is optional.
          * If the <code>element</code> is not specified, the portlet hub will
          * submit the action to the server in an appropriate manner. 
          * <p>
          * A portlet action is a blocking operation.
          * To allow for orderly state transitions, the portlet hub does not allow
          * this function to be used while a blocking operation is in progress.
          * A blocking operation is considered to be in progress
          * from the initial call until the final onStateChange event for that 
          * operation has been fired. See {@link portlet} for further information.
          * <p>
          * The parameters may be specified in either order, individually,
          * or not at all. Examples of valid calls:
          * <code>
          * <br>action();
          * <br>action(actParams, element);
          * <br>action(actParams);
          * <br>action(element);
          * </code>
          * 
          * @param   {PortletParameters}  actParams   Action parameters to be 
          *                                           added to the URL
          *                                           (optional)
          * @param   {HTMLFormElement}    element     DOM element of form to be submitted
          *                                           (optional)
          * 
          * @throws  {IllegalArgumentException} 
          *                   Thrown if the input parameters are invalid 
          * @throws  {AccessDeniedException}
          *                   Thrown if a blocking operation is
          *                   already in progress. 
          * @throws  {NotInitializedException} 
          *                   Thrown if a portlet ID is provided, but no onStateChange
          *                   listener has been registered.
          * 
          * @memberOf   PortletInit
          */
         action : function (actParams, element) {
            var ii, arg, type, parms=null, el=null;

            // check arguments. make sure there is a maximum of two
            // args and determine the types. Check values as possible.
            if (arguments.length > 2) {
               throwIllegalArgumentException(
                     "Too many arguments. 2 arguments are allowed.");
            }
            
            ii = arguments.length;
            while ((ii = ii -1) >=0) {
               arg = arguments[ii];
               type = Object.prototype.toString.call(arg);
               if (type === '[object HTMLFormElement]') {
                  if (el === null) {
                     el = arg;
                  } else {
                     throwIllegalArgumentException(
                           "too many [object HTMLFormElement] arguments: " + arg + ", " + el);
                  }
               } else if (type === '[object Object]') {
                  validateParms(arg);     // throws if parms are invalid
                  if (parms !== null) {
                     throwIllegalArgumentException(
                           "too many parameters arguments.");
                  }
                  parms = arg;
               } else {
                  throwIllegalArgumentException(
                        "Invalid argument type. Argument " + (ii+1) + " is of type " 
                        + type);
               }
            }

            // everything ok, so do the action
            
            setupAction(portletId, parms, el);
         },
         
         /**
          * Starts partial action processing and returns a {@link PartialActionInit}
          * object to the caller. 
          * The <code>PartialActionInit</code> object contains a partial action
          * URL and an {@setPageState}.
          * The partial action URL can be used to initiate an action request. 
          * The {@setPageState} callback function allows the
          * portlet client to complete the partial action operation by updating the
          * state of all portlet clients on the page that are affected by
          * action and event processing on the server resulting from the partial action. 
          * <p>
          * After the <code>setPageState</code> function has been called, 
          * a copy of the portlet state will be provided to each affected portlet client
          * through the {@link onStateChange} listener function.
          * <p>
          * However, it is also possible for the portal to completely refresh the 
          * page as a response to the action. 
          * This may occur in order to support portlets on the page that do not participate
          * in the Portlet 3.0 Ajax support or due to configuration settings, for example.
          * <p>
          * If the page is completely refreshed, it will be rendered according to 
          * render parameters set on the server.
          * <p>
          * Action parameters are optional parameters attached to a action 
          * URL in addition to any portlet state values that may be present.
          * Action parameters do not influence the portlet state.
          * <p>
          * The action parameters must be an object containing properties
          * representing parameter names whose values must be an array of string 
          * values, as described under {@link PortletParameter}. 
          * All of the action parameters will be attached to the URL.
          * Use of action parameters is optional.
          * <p>
          * A partial action is a blocking operation.
          * To allow for orderly state transitions, the portlet hub does not allow
          * this function to be used while a blocking operation is in progress.
          * A blocking operation is considered to be in progress
          * from the initial call until the final onStateChange event for that 
          * operation has been fired. See {@link portlet} for further information.
          * 
          * @param   {PortletParameters}  actParams   Action parameters to be 
          *                                           added to the URL
          *                                           (optional)
          * 
          * @returns {PortletActionInit}  Contains the partial action URL
          *                               and the setPageState callback function
          *                                           
          * @throws  {IllegalArgumentException} 
          *                   Thrown if the input parameters are invalid 
          * @throws  {AccessDeniedException}
          *                   Thrown if a blocking operation is
          *                   already in progress. 
          * @throws  {NotInitializedException} 
          *                   Thrown if a portlet ID is provided, but no onStateChange
          *                   listener has been registered.
          *                   
          * @memberOf   PortletInit
          */
         startPartialAction : function (actParams) {
            var  parms=null, paObj = {};

            // check arguments. make sure there is a maximum of two
            // args and determine the types. Check values as possible.
            if (arguments.length > 1) {
               throwIllegalArgumentException(
                     "Too many arguments. 1 arguments are allowed.");
            } else if (actParams !== undefined) {
               if (typeof actParams === 'object') {
                  validateParms(actParams);     // throws if parms are invalid
                  parms = actParams;
               } else {
                  throwIllegalArgumentException(
                        "Invalid argument type. Argument is of type " + (typeof actParams));
               }
            }
            
            // make sure operation is allowed
            if (busy === true) {
               throwAccessDeniedException("Operation in progress");
            } else if (typeof oscListeners[portletId] === 'undefined') {
               throwNotInitializedException(
                     "No onStateChange listener registered for portlet: " + portletId);
            }

            busy = true;

            // Create the PartialActionInit object and return it
            paObj.url = pi.getUrl("PARTIALACTION", portletId, parms);
            paObj.setPageState = setPageState;
            
            return paObj;
         },
         
         /**
          * Tests whether a blocking operation is in progress.
          * <p>
          * The portlet client can use this function to test whether a
          * state change is in progress before initiating a blocking operation.
          * <p>
          * Note that if the portlet client uses this function to implement
          * a waiting function, the portlet state may be changed during the 
          * time that the portlet client waits.
          * Also note that the portal may choose to refresh the page as a response
          * to a blocking operation, in which case the waiting function would not
          * complete.
          * <p>
          * The portlet hub provides for orderly state transitions by allowing only a
          * single blocking operation ({@link action}, {@link setPortletState},
          * {@link startPartialAction}) to be active at any one time.
          * <p>
          * The state transition is considered to be active from the initial portlet 
          * client call to one of the blocking operations until the portlet 
          * hub has performed the requested state change and has informed all of 
          * the affected portlet clients by firing the corresponding onStateChange
          * events.
          * <p>
          * See {@link portlet} for further information.
          *  
          * @returns    {boolean}   <code>true</code> if a blocking operation
          *                         is in progress
          *                   
          * @memberOf   PortletInit
          */
         isInProgress : function () {
            return busy;
         },
         
         /**
          * Dispatches a client event.
          * <p>
          * Client events of the specified type are queued for delivery
          * to registered event listeners of that type.
          * <p>
          * The event type is matched against the type strings associated with
          * registered event listeners.
          * An event will be dispatched for each matching listener.
          * The number of matching listeners will be returned.
          * <p>
          * The event payload is defined by the dispatcher of the event.
          * It must be present, but may be of any type or value.
          * <p>
          * The portlet Client may not dispatch event types beginning
          * with the reserved string "portlet.".
          * <p>
          * The client is responsible for preventing race conditions.
          * For example, a race condition can occur if portlet A dispatches
          * an event to portlet B, causing an event to portlet A, which
          * dispatches again to portlet B, etc.
          * <p>
          * Event delivery cannot be guaranteed, and may vary according to 
          * the situation.
          * <p> 
          * Take for example a scenario where a portlet issues an event to
          * several other portlets, perhaps including itself.
          * Due to the event, each portlet updates parameters
          * through use of the {@link setPortletState} function.
          * <p>
          * The <code>setPortletState</code> function can cause a page refresh
          * depending on the situation.
          * If all portlets on the page participate in the JSR 362 Ajax support,
          * the portlet hub might not cause a page refresh.
          * However, if there are legacy portlets to be supported, the portal
          * or portlet hub might choose to refresh the page.
          * <p>
          * In the latter case, this means that the first portlet receiving the 
          * event will be able to successfully update its parameters, but the
          * remaining portlets will not.
          * This can have unintentional consequences.
          * 
          * @param   {string}    type     The type of listener
          * @param   {any}       payload  The payload to be delivered
          * 
          * @returns {number}             The number of events queued for delivery
          *                   
          * @memberOf   PortletInit
          */
         dispatchClientEvent : function (type, payload) {
            var cnt=0, li, cb;

            // check for 2  arguments, the first of which must be a string
            checkArguments(arguments, 2, 2, ['string']);

            // disallow use of reserved name for system event types
            if (type.match("^portlet\..*")) {
               throwIllegalArgumentException("The event type is invalid: " + type);
            }
            
            for (li in pcListeners) {
               if (!pcListeners.hasOwnProperty(li)) {
                  continue;
               }
               
               if (type.match(pcListeners[li].type) !== null) {
                  dispatchCE(type, pcListeners[li].callback, payload);
                  cnt++;
               }
               
            }
            
            return cnt;
         },

      };

      return portletInit;
   }; 

})();