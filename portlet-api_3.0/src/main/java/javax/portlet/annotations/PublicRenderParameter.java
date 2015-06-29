package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * <div class='changed_added_3_0'>
 * This annotation is used within composite portlet configuration annotations to
 * represent a single public render parameter.
 * It cannot be used as a stand-alone portlet annotation.
 * </div>
 */
@Retention(RUNTIME) @Target({ANNOTATION_TYPE})
public @interface PublicRenderParameter {
   
   /**
    * <div class='container-change'>
    * The public render parameter identifier.
    * <p>
    * This identifier is used as the public render parameter name in the
    * portlet parameter handling interfaces.
    * <p>
    * The public render parameter identifier must be unique within the portlet application. 
    * </div>
    * 
    * @see     javax.portlet.PortletConfig#getPublicRenderParameterNames() PortletConfig#getPublicRenderParameterNames
    * 
    * @return  The public render parameter identifier
    */
   String      identifier();
   
   /**
    * <div class='container-change'>
    * The public render parameter Qname.
    * <p>
    * The public render parameter qname must be unique within the portlet application. 
    * </div>
    * 
    * @see     javax.xml.namespace.QName
    * @see     <a href="http://www.w3.org/TR/2001/REC-xmlschema-2-20010502/#QName">Qname definition</a>
    * 
    * @return  The qname
    */
   PortletQName   qname();
}
