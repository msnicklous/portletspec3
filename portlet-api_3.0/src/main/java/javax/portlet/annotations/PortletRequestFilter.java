package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * <div class='changed_added_3_0'>
 * Designates a portlet request filter class.
 * The request filter performs filtering tasks on either the request to a portlet, 
 * on the response from a portlet, or on both.
 * <p>
 * Request filters perform filtering in the doFilter method. 
 * Every Filter has access to a FilterConfig object from which it can obtain its 
 * initialization parameters and a reference to the PortletContext object.
 * It can to load resources needed for filtering tasks through the PortletContext object.
 * <p>
 * Request filters can be applied to the Action phase, the Event phase, the Render phase 
 * or the Resource phase depending on which of the filter interfaces the request filter class
 * implements.  
 * <p>
 * The annotated type must implement one or more of the following interfaces:
 * <ul>
 * <li>javax.portlet.filter.PortletFilter</li>
 * <li>javax.portlet.filter.ActionFilter</li>
 * <li>javax.portlet.filter.EventFilter</li>
 * <li>javax.portlet.filter.RenderFilter</li>
 * <li>javax.portlet.filter.ResourceFilter</li>
 * </ul>
 * </div>
 *    
 * @see javax.portlet.filter.PortletFilter
 * @see javax.portlet.filter.ActionFilter
 * @see javax.portlet.filter.EventFilter
 * @see javax.portlet.filter.RenderFilter
 * @see javax.portlet.filter.ResourceFilter
 *
 */

@Retention(RUNTIME) @Target({TYPE})
public @interface PortletRequestFilter {
   
   /**
    * <div class='not-supported'>
    * The portlet names for which the request filter applies.
    * <p>
    * The annotated request filter can apply to multiple portlets within the portlet
    * application. The names of the portlets to which the request filter applies must be 
    * specified in this field.
    * <p>
    * A wildcard character '*' can be specified in the first portletName array element 
    * to indicate that the request filter is to apply to all portlets in the portlet application.
    * If specified, the wildcard character must appear alone in the first array element.
    * </div>
    * 
    * @return     The portlet names
    */
   String[]   portletNames();
   
   /**
    * <div class='not-supported'>
    * The filter initialization parameters.
    * </div>
    * 
    * @return     An array of initialization parameters
    */
   InitParameter[] initParams() default {};
   
   
   /**
    * <div class='not-supported'>
    * The locale for the locale-specific configuration parameters display name
    * and description within this annotation.
    * <p>
    * The locale is specified as a language tag as defined in 
    * IETF BCP 47, "Tags for Identifying Languages".
    * </div>
    * 
    * @see     java.util.Locale
    * @see     java.util.Locale#forLanguageTag forLanguageTag
    * @see     <a href="https://tools.ietf.org/html/bcp47">IETF BCP 47</a>
    * 
    * @return  The locale
    */
   String   locale() default "en";
   
   /**
    * <div class='not-supported'>
    * The display-name type contains a short name that is intended to be displayed by tools. 
    * It is used by display-name elements. 
    * The display name need not be unique.
    * </div>
    * 
    * @return  The display name
    */
   String   displayName() default "";
   
   /**
    * <div class='not-supported'>
    * The portlet filter description.
    * It provides text describing the portlet filter for use by the portal application or by tools.
    * </div>
    * 
    * @return  The portlet description
    */
   String   description() default "";
   
   /**
    * <div class='not-supported'>
    * The ordinal number for this annotated method.
    * <p>
    * The ordinal number determines the order of execution if multiple methods
    * are annotated for a given request type.
    * Annotated methods with a lower ordinal number are executed before methods with
    * a higher ordinal number.
    * </div>
    * 
    * @return     The ordinal number
    */
   int        ordinal() default 0;
}
