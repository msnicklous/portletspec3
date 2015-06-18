package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * This annotation is used within composite portlet configuration annotations to
 * represent a single event.
 * It cannot be used as a stand-alone portlet annotation.
 */
@Retention(RUNTIME) @Target({ANNOTATION_TYPE})
public @interface PortletEvent {
   
   /**
    * The event Qname.
    * <p>
    * The local part of the QName should be a non-empty String.
    * The local part is used as the event name in the portlet API 
    * event handling methods.
    * <p>
    * The event qname must be unique within the portlet application. 
    * 
    * @see     javax.portlet.Event
    * @see     javax.portlet.StateAwareResponse#setEvent(javax.xml.namespace.QName, java.io.Serializable)
    * @see     javax.portlet.StateAwareResponse#setEvent(String, java.io.Serializable)
    * @see     javax.portlet.PortletConfig#getProcessingEventQNames() PortletConfig#getProcessingEventQNames
    * @see     javax.portlet.PortletConfig#getPublishingEventQNames() PortletConfig#getPublishingEventQNames
    * 
    * @return  The event qname
    */
   PortletQName   qname();

   /**
    * The event payload type associated with the specified QName.
    * Each QName may have only a single event payload type associated with it.
    * <p>
    * The payload type must be serializable and must have a valid JAXB binding. 
    * 
    * @see     javax.portlet.Event
    * @see     javax.portlet.StateAwareResponse#setEvent(javax.xml.namespace.QName, java.io.Serializable)
    * @see     javax.portlet.StateAwareResponse#setEvent(String, java.io.Serializable)
    * 
    * @return     A class representing the payload type
    */
   Class<?>    payloadType();
}
