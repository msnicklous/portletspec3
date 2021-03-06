/**
 * This module adds some custom Jasmine matchers that can be used by 
 * any other test module. 
 */

   beforeEach(function () {

      /**
       * Add some custom matchers for checking array output
       */
      this.addMatchers({

         
         /**
          * This matcher tests if the function under test throws an exception
          */
         toThrowCustomException: function (type) {
            var func = this.actual,      // grab the function under test
                msg = "", invmsg = "An exception of type " + type + " was thrown.",
                retCode = true;
            
            try {
               func();
               retCode = false;
               msg = "No exception was thrown.";
            } catch (e) {
               if (e.name != type) {
                  retCode = false;
                  msg = "Function did not throw exception of type: " + type + 
                  ". Instead it threw: " + e.name + " with message: " + e.message; 
               } else {
                  invmsg = "An exception was thrown. Type: " + e.name + ", Message: " + e.message;
               }
            }

            this.message = function() {
               return [ msg, invmsg ];
            };

            return retCode;
         },

         
         /**
          * This matcher just tests how matchers work.
          */
         toBeADummyMatcher: function () {
            var str = this.actual;      // grab string value from result(...)

            this.message = function() {
               return [ ("Bad message. str=" + str), 
                        ("Inverted bad message. Think 'not'. str=" + str) ];
            };

            // set up so that any test using the dummy is able to provoke
            // a failue in order to see which messages get generated.
            if (str == "not"){
               return true;
            }
            return false;

         },

         /**
          * This matcher makes sure that the input value is an array
          * containing only numeric values.
          */
         toBeANumericArray: function () {
            var anArray = this.actual;      // grab value from result(...)
            var retval = true; 
            var msg = "Bad message.";
            var invMsg = "The input array exists, is an array, and contains only numeric values.";

            if ((anArray === undefined) || (Array.isArray(anArray) === false)){
               msg = "input value is undefined or is not an array.";
               retval = false;
            } else {
               for (var ii=0; ii < anArray.length; ii++) {
                  if (typeof anArray[ii] !== 'number') {
                     msg = "Array element >" + num + "< at index " + ii + " has invalid type: " + (typeof num);
                     retval = false;
                     break;
                  }
               }
            }

            this.message = function() {
               return [ msg, invMsg ];
            };
            return retval;
         }

      });
   });
