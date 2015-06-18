package javax.portlet.annotations;


import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.context.NormalScope;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * Provides a CDI custom scope that is scoped to the portlet state. 
 * The purpose of this scope is to allow portlet render parameters to be handled like
 * beans.
 * <p>
 * If an <code>{@literal @}PortletStateScoped</code> bean is injected into a class containing 
 * an <code>{@literal @}EventMethod</code> or an <code>{@literal @}ActionMethod</code>,
 * the bean is associated with the corresponding portlet.
 * The bean state is stored as a render parameter of the that portlet.
 * <p>
 * A bean annotated with this scope must implement the {@link PortletSerializable} 
 * interface,
 * which provides methods used by the portlet bean container to synchronize the bean
 * according to the portlet state.
 * <p>
 * An <code>{@literal @}PortletStateScoped</code> bean is similar to an 
 * <code>{@literal @}RequestScoped</code> bean in that a new instance is created at the
 * beginning of each request.
 * However, for <code>{@literal @}PortletStateScopedScoped</code> beans, the portlet bean 
 * container calls the 
 * {@link PortletSerializable#deserialize(String[]) PortletSerializable#deserialize}
 * method at the beginning of each request to initialize the bean and the  
 * {@link PortletSerializable#serialize() PortletSerializable#serialize} method
 * at the end of an action request or event request to obtain the serialized bean data.
 * <p>
 * A <code>{@literal @}PortletStateScoped</code> bean must be a valid bean and
 * must provide a default constructor.
 * <p>
 * Note that only changes made to the bean state during <code>ActionMethod</code>
 * or <code>EventMethod</code> execution are stored in the portlet state.
 * Changes made during <code>RenderMethod</code>, <code>ServeResourceMethod</code>,
 * or <code>HeaderMethod</code> execution will not be available during subsequent requests.
 *
 * @see PortletSerializable
 */

@Retention(RUNTIME) 
@Target({TYPE})
@NormalScope()
@Inherited
public @interface PortletStateScoped {
   
   /**
    * The name of the render parameter under which the bean state is to be stored.
    * <p>
    * If the name is not specified through the annotation, the bean portlet container
    * will assign a render parameter name.
    * <p>
    * Note for version 2.0 portlets: If the annotated class represents a public render parameter, 
    * this element must be set to a name that matches a public render parameter identifier 
    * defined in the deployment descriptor. 
    *  
    * @return  The parameter name
    */
   String   paramName() default "";
   
   /**
    * <div class='container-change'>
    * The public render parameter Qname.
    * <p>
    * If a QName value is specified, the render parameter represented by the 
    * annotated class will be treated as a public render parameter.
    * </div>
    * 
    * @see     javax.xml.namespace.QName
    * @see     <a href="http://www.w3.org/TR/2001/REC-xmlschema-2-20010502/#QName">Qname definition</a>
    * 
    * @return  The qname
    */
   PortletQName   qname() default @PortletQName(localPart="", namespaceURI="");
}
