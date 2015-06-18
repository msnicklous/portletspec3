package javax.portlet.annotations;


import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.context.NormalScope;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * Provides a CDI custom scope that is scoped to the portlet session rather than to the
 * servlet session.
 * <p>
 * Note that a portlet session scoped bean must implement 
 * <code>java.io.Serializable</code>, since it will be stored in the portlet session.
 *
 */

@Retention(RUNTIME) 
@Target({TYPE})
@NormalScope(passivating=true)
@Inherited
@Documented
public @interface PortletSessionScoped {
}
