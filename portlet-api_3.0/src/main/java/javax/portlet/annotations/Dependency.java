package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * <div class='container-change'>
 * This annotation is used within composite portlet configuration annotations to
 * represent dependencies the portlet may have on external resources.
 * The resources can represent client-side prerequisites such as JavaScript libraries
 * or stylesheet resources that are shared among portlets.
 * <p> 
 * This annotation cannot be used as a stand-alone portlet annotation.
 * </div>
 */
@Retention(RUNTIME) @Target({ANNOTATION_TYPE})
public @interface Dependency {
   
   /**
    * <div class='container-change'>
    * The dependency name.
    * </div>
    * 
    * @return     The dependency name
    */
   String   name();
   
   /**
    * <div class='container-change'>
    * The minimum acceptable module version.
    * </div>
    * 
    * @return     The minimum acceptable module version
    */
   String   minVersion();
}
