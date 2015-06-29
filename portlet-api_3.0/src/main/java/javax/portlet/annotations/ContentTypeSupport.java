package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * <div class='changed_added_3_0'>
 * This annotation is used within composite portlet configuration annotations to
 * represent the portlet modes and window states supported for a given content type.
 * <p>
 * It cannot be used as a stand-alone portlet annotation.
 * </div>
 */
@Retention(RUNTIME) @Target({ANNOTATION_TYPE})
public @interface ContentTypeSupport {
   
   /**
    * <div class='container-change'>
    * The MIME type for which support is being defined.
    * MIME type name, e.g. "text/html".
    * The MIME type may also contain the wildcard
    * character '*' as in 'text&#x2F;*' or '*&#x2F;*'.
    * </div>
    * 
    * @return     The MIME type
    */
   String   mimeType() default "text/html";
   
   /**
    * <div class='container-change'>
    * Defines the portlet modes supported by this portlet.
    * <p>
    * The following names represent the standard portlet modes: 
    * "edit", "help", "view".
    * Custom portlet modes may also be defined.
    * <p>
    * Portlet mode names are not case sensitive.
    * </div>
    * 
    * @return     The portlet modes
    */
   String[] supportedPortletModes() default {"view"};
   
   /**
    * <div class='container-change'>
    * Defines the window states supported by this portlet.
    * <p>
    * The following names represent the standard window states: 
    * "normal", "minimized", "maximized".
    * Custom window states may also be defined.
    * <p>
    * Window state names are not case sensitive.
    * </div>
    * 
    * @return     The window states
    */
   String[] supportedWindowStates() default {"normal", "minimized", "maximized"};
}
