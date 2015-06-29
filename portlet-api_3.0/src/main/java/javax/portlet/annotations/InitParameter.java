package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * <div class='changed_added_3_0'>
 * This annotation is used within composite portlet configuration annotations to
 * represent name-value pairs.
 * It cannot be used as a stand-alone portlet annotation.
 * </div>
 */
@Retention(RUNTIME) @Target({ANNOTATION_TYPE})
public @interface InitParameter {
   
   /**
    * The parameter name.
    * 
    * @return     The parameter name
    */
   String   name();
   
   /**
    * The parameter value
    * 
    * @return     The parameter value
    */
   String   value();
}
