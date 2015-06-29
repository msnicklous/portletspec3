package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * <div class='changed_added_3_0'>
 * Qualifier that specifies the context root for injection.
 * <p>
 * The injection target type must be <code>String</code>.
 * <p>
 * This annotation may only be used in <code>{@literal @}RequestScoped</code> or
 * <code>{@literal @}PortletStateScoped</code> beans.
 * <p>
 * Example:
 * <div class='codebox'>      
 * {@literal @}Inject {@literal @}ContextPath<br/>   
 * private String namespace;
 * </div>                    
 * </div>
 * 
 * @see javax.portlet.PortletRequest#getContextPath() getContextPath
 */

@Qualifier @Retention(RUNTIME) @Target({METHOD, FIELD, PARAMETER})
public @interface ContextPath {
}
