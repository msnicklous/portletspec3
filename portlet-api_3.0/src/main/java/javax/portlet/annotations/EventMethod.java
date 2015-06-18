package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * Designates a method corresponding to the portlet API processEvent method.
 * The annotated method must have the following signature:
 * <p>
 *    <code>public void &lt;methodName&gt;(EventRequest, EventResponse)</code>
 * <p>   
 * where the method name can be freely selected.
 * <p>
 * The method declaration may contain a throws clause. Exceptions declared in the 
 * throws clause should be of type {@link javax.portlet.PortletException} or
 * {@link java.io.IOException}. 
 * Checked exceptions of any other type will be caught, wrapped with a PortletException, 
 * and rethrown.
 *    
 * @see javax.portlet.EventPortlet#processEvent(javax.portlet.EventRequest, javax.portlet.EventResponse) processEvent
 *
 */

@Retention(RUNTIME) @Target({METHOD})
public @interface EventMethod {
   
   /**
    * The portlet name for the annotated method.
    * 
    * @return     The portlet name
    */
   String   portletName();
   
   /**
    * If set to <code>true</code>, render parameters will be automatically copied
    * from the <code>EventRequest</code> to the <code>EventResponse</code>.
    * <p>
    * The copy will take place before the code body of the annotated method
    * is executed.
    * 
    * @return     <code>true</code> if parameters are to be copied.
    */
   boolean  copyParameters() default true; 
   
   /**
    * The event name.
    * <p>
    * TODO: rework / remove this.
    * <p>
    * If an event name is specified, the bean enabler will dispatch portlet events with 
    * matching event names to this method. 
    * <p>
    * An EventMethod with an empty event 
    * name will receive all event requests not dispatched to other named EventMethods.
    * 
    * 
    * @return  The event name
    */
   String   eventName() default "";
   
   /**
    * <div class='container-change'>
    * The processing event QName definitions supported by this method.
    * <p>
    * At least one processing event QName must be specified.
    * <p>
    * TODO: remove the default clause after rework above.
    * </div>
    * 
    * @see     PortletEvent
    * @see     PortletQName
    * 
    * @return  The processing event QNames
    */
   PortletQName[]   processingEventQNames() default {};
   
   /**
    * <div class='container-change'>
    * The QName definitions of the events published by this method.
    * </div>
    * 
    * @see     PortletEvent
    * @see     PortletQName
    * 
    * @return  The processing event QNames
    */
   PortletQName[]   publishingEventQNames() default {};
}
