package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * Designates a method corresponding to the portlet API render method.
 * The annotated method must have one of the following signatures:
 * <p>
 * The annotated method must have one of the following signatures:
 * <ul>
 * <li>
 * <code>public void &lt;methodName&gt;(RenderRequest, RenderResponse)</code>
 * <p>
 * This corresponds to the <code>render</code> method.
 * </li>   
 * <li>
 * <code>public String &lt;methodName&gt;()</code>
 * <p>
 * The String returned by the method will be written to the response unchanged. 
 * </li>   
 * <li>
 * <code>public void &lt;methodName&gt;()</code>
 * <p>
 * Intended for use when only a resource include is needed. 
 * </li>   
 * </ul> 
 * where the method name can be freely selected.
 * <p>
 * The method declaration may contain a throws clause. Exceptions declared in the 
 * throws clause should be of type {@link javax.portlet.PortletException} or
 * {@link java.io.IOException}. 
 * Checked exceptions of any other type will be caught, wrapped with a PortletException, 
 * and rethrown.
 * 
 * @see     javax.portlet.Portlet#render(javax.portlet.RenderRequest, javax.portlet.RenderResponse) Portlet#render
 *
 */

@Retention(RUNTIME) @Target({METHOD})
public @interface RenderMethod {
   
   /**
    * The portlet names for which the render method applies.
    * <p>
    * The annotated method can apply to multiple portlets within the portlet
    * application. The names of the portlets to which the resources apply must be 
    * specified in this field.
    * <p>
    * A wildcard character '*' can be specified in the first portletName array element 
    * to indicate that the resource declarations are to apply to all portlets in 
    * the portlet application.
    * If specified, the wildcard character must appear alone in the first array element.
    * 
    * @return     The portlet names
    */
   String[]   portletNames();
   
   /**
    * The portlet mode rendered by the annotated method.
    * <p>
    * If an portlet mode is specified, the bean enabler will dispatch Render requests with 
    * matching portlet mode values to this method. 
    * <p>
    * If this field is empty, the method will be executed for all
    * Render requests not dispatched by portlet mode to other RenderMethods.
    * 
    * @return     The portlet mode
    */
   String   portletMode() default "view";
   
   /**
    * Sets the content type, or the MIME type, of content generated by the method.
    * The content type will be set before the annotated method body is executed.
    * <p>
    * If this field is empty, no content type will be set.
    * The portlet can then set the content type using the portlet API
    * <code>RenderResponse#setContentType</code> method.
    * 
    * @see        javax.portlet.RenderResponse#setContentType(String) RenderResponse#setContentType
    * 
    * @return     The content type
    */
   String   contentType() default "text/html";
   
   /**
    * Specifies a resource, such as a JSP, an HTML file, or a servlet to be included.
    * <p>
    * The resource will be included using the 
    * <code>PortletRequestDispatcher#include</code> method after the method body 
    * has been executed.
    * <p>
    * If this field is empty, no resource will be included.
    * 
    * @see        javax.portlet.PortletRequestDispatcher
    * @see        javax.portlet.PortletRequestDispatcher#include(javax.portlet.PortletRequest, javax.portlet.PortletResponse) PortletRequestDispatcher#include
    * 
    * @return     The resource to be included
    */
   String   include() default "";
   
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
