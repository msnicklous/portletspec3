package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * Designates a method corresponding to the portlet API processAction method.
 * The annotated method must have the following signature:
 * <p>
 *    <code>public void &lt;methodName&gt;(ActionRequest, ActionResponse)</code>
 * <p>   
 * where the method name can be freely selected.
 * <p>
 * The method declaration may contain a throws clause. Exceptions declared in the 
 * throws clause should be of type {@link javax.portlet.PortletException} or
 * {@link java.io.IOException}. 
 * Checked exceptions of any other type will be caught, wrapped with a PortletException, 
 * and rethrown.
 *    
 * @see javax.portlet.Portlet#processAction(javax.portlet.ActionRequest, javax.portlet.ActionResponse) processAction
 *
 */

@Retention(RUNTIME) @Target({METHOD})
public @interface ActionMethod {
   
   /**
    * The portlet name for the annotated method.
    * 
    * @return  The portlet name
    */
   String   portletName();
   
   /**
    * The action name. 
    * <p> 
    * If an action name is specified, the bean enabler will dispatch Action requests with 
    * matching values of the reserved "javax.portlet.action" parameter to this method. 
    * <p>
    * An ActionMethod with an empty action name will receive all  
    * Action requests not dispatched to other named ActionMethods.
    * 
    * @return  The action name
    */
   String   actionName() default "";
   
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
