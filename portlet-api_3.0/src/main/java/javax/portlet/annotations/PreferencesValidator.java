package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * Designates a preferences validator method.
 * The PreferencesValidator allows validation of the set of portlet preferences 
 * before they are stored in the persistent store.
 * The validator method is invoked during execution of the 
 * store method of the PortletPreferences. 
 * <p>
 * The annotated method must have the following signature:
 * <p>
 *    <code>public void &lt;methodName&gt;(PortletPreferences preferences) throws ValidatorException</code>
 * <p>   
 * where the method name can be freely selected.
 * <p>
 *    
 * @see javax.portlet.PreferencesValidator#validate(javax.portlet.PortletPreferences) PreferencesValidator#validate
 *
 */

@Retention(RUNTIME) @Target({METHOD})
public @interface PreferencesValidator {
   
   /**
    * The portlet names for which the validator applies.
    * <p>
    * The annotated validator method can apply to multiple portlets within the portlet
    * application. The names of the portlets to which the validator applies must be 
    * specified in this field.
    * <p>
    * A wildcard character '*' can be specified in the first portletName array element 
    * to indicate that the validator is to apply to all portlets in the portlet application.
    * If specified, the wildcard character must appear alone in the first array element.
    * 
    * @return     The portlet names
    */
   String[]   portletNames();
   
   /**
    * The ordinal number for this annotated method.
    * <p>
    * The ordinal number determines the order of execution if multiple methods
    * are annotated.
    * Annotated methods with a lower ordinal number are executed before methods with
    * a higher ordinal number.
    * 
    * @return     The ordinal number
    */
   int        ordinal() default 0;
}
