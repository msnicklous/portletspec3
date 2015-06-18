package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * This annotation is used within composite portlet configuration annotations to
 * represent a QName for use in portlet event and public render parameter definitions.
 * It cannot be used as a stand-alone portlet annotation.
 * <p>
 * The qname is specified as a string of the form 
 * <code>namespace-name:local-part</code>, where
 * <ul>
 * <li>
 * namespace-name is a URI specifying the namespace.
 * </li>
 * <li>
 * local-part is a non-empty String.
 * </li>
 * </ul>
 * 
 * @see     javax.xml.namespace.QName javax.xml.namespace.QName
 * @see     <a href="http://www.w3.org/TR/2001/REC-xmlschema-2-20010502/#QName">W3C Qname definition</a>
 */
@Retention(RUNTIME) @Target({ANNOTATION_TYPE})
public @interface PortletQName {
   
   /**
    * The QName namespace URI.
    * <p>
    * If the QName namespace URI is empty, the default value is used. 
    * The default value is taken from the following locations, specified in order of precedence:
    * <ul>
    * <li>
    * The value defined in the {@literal <}default-namespace{@literal >} element in the portlet
    * deployment descriptor.
    * </li>
    * <li>
    * The value defined in the {@literal <}defaultNamespace{@literal >} element in the
    * {@literal @}PortletConfiguration annotation.
    * </li>
    * <li>
    * The value javax.xml.XMLConstants.NULL_NS_URI
    * </li>
    * </ul>
    * 
    * @return  The QName namespace URI.
    */
   String      namespaceURI();
   
   /**
    * The local part.
    * <p>
    * local-part should be a non-empty String.
    * 
    * @return  The qname local part.
    */
   String      localPart();
}
