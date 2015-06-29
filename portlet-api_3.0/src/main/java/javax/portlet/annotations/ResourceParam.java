package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * <div class='changed_added_3_0'>
 * Qualifier that specifies an resource parameter for injection.
 * The parameter will be <code>null</code> if accessed outside of a serve resource method.
 * <p>
 * Note that this method will only return resource parameters, not render parameters.
 * To access render parameters within a serve resource method, use the
 * {@link RenderParam} annotation.
 * However, if the specified name addresses both a resource parameter and a private render
 * parameter, the injected bean will contain both sets of values, with the 
 * render parameter entries following the resource parameter entries in the values array.
 * <p>
 * The type of the injection target must be <code>String</code> or <code>String[]</code>.
 * <p>
 * This annotation may only be used in <code>{@literal @}RequestScoped</code> or
 * <code>{@literal @}PortletStateScoped</code> beans.
 * <p>
 * Example:
 * <div class='codebox'>      
 * {@literal @}Inject {@literal @}ResourceParam("paramName")<br/>   
 * private String[] paramValues;
 * </div>                    
 * </div>
 * 
 * @see javax.portlet.PortletRequest#getParameter(String) getParameter
 * @see javax.portlet.PortletRequest#getParameterValues(String) getParameterValues
 * @see javax.portlet.ResourceRequest#getPrivateRenderParameterMap() getPrivateRenderParameterMap
 * 
 * @see RenderParam
 */

@Qualifier @Retention(RUNTIME) @Target({METHOD, FIELD, PARAMETER})
public @interface ResourceParam {
   
   /**
    * The parameter name.
    * 
    * @return     The parameter name.
    */
   @Nonbinding String   value();
}
