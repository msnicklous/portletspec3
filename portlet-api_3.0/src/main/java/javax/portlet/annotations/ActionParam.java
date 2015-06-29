package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * <div class='changed_added_3_0'>
 * Qualifier that specifies an action parameter for injection.
 * The parameter will be <code>null</code> if accessed outside of an action method.
 * <p>
 * The type of the injection target must be <code>String</code> or <code>String[]</code>.
 * <p>
 * This annotation may only be used in <code>{@literal @}RequestScoped</code> or
 * <code>{@literal @}PortletStateScoped</code> beans.
 * <p>
 * Example:
 * <div class='codebox'>      
 * {@literal @}Inject {@literal @}ActionParam("paramName")<br/>   
 * private String[] paramValues;
 * </div>                    
 * </div>
 * 
 * @see javax.portlet.PortletRequest#getParameter(String) getParameter
 * @see javax.portlet.PortletRequest#getParameterValues(String) getParameterValues
 */

@Qualifier @Retention(RUNTIME) @Target({METHOD, FIELD, PARAMETER})
public @interface ActionParam {
   
   /**
    * The parameter name.
    * 
    * @return     The parameter name.
    */
   @Nonbinding String   value();
}
