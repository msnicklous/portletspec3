package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * <div class='changed_added_3_0'>
 * This annotation is used within composite portlet configuration annotations to
 * represent a single portlet preference.
 * It cannot be used as a stand-alone portlet annotation.
 * </div>
 */
@Retention(RUNTIME) @Target({ANNOTATION_TYPE})
public @interface Preference {
   
   /**
    * The preference name.
    * 
    * @return  The preference name
    */
   String      name();
   
   /**
    * The preference values array.
    * 
    * @return  The preference values.
    */
   String[]    values();
   
   /**
    * Marks the preference as being read-only.
    * 
    * @return  The read-only flag
    */
   boolean     isReadOnly() default false;
}
