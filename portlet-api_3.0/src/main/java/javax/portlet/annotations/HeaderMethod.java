package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * Designates a method corresponding to the doHeaders method of GenericPortlet.
 * The annotated method must have the following signature:
 * <p>
 *    <code>public void &lt;methodName&gt;(RenderRequest, RenderResponse)</code>
 * <p>   
 * where the method name can be freely selected.
 * <p>
 * The method declaration may contain a throws clause. Exceptions declared in the 
 * throws clause should be of type {@link javax.portlet.PortletException} or
 * {@link java.io.IOException}. 
 * Checked exceptions of any other type will be caught, wrapped with a PortletException, 
 * and rethrown.
 * <p>
 * The header method can be used to set properties such as cookies, header values, and 
 * XML elements for the header section of the aggregated portal document. 
 *    
 * @see javax.portlet.PortletResponse the add and set properties methods of PortletResponse
 * @see javax.portlet.MimeResponse#MARKUP_HEAD_ELEMENT MimeResponse#MARKUP_HEAD_ELEMENT
 * @see javax.portlet.GenericPortlet#doHeaders(javax.portlet.RenderRequest, javax.portlet.RenderResponse) doHeaders
 */

@Retention(RUNTIME) @Target({METHOD})
public @interface HeaderMethod {
   
   /**
    * The portlet names for which the header method applies.
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
