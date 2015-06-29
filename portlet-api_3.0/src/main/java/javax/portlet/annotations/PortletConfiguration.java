package javax.portlet.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


/**
 * <div class='changed_added_3_0'>
 * Annotation for the portlet configuration. 
 * Many of these configuration parameters also appear in
 * the portlet deployment descriptor.
 * <p>
 * The portlet deployment descriptor can continue to be used. 
 * Values of configuration parameters appearing in the deployment descriptor have 
 * precedence over the corresponding values defined in the annotation.   
 * </div>
 */
@Retention(RUNTIME) @Target({TYPE})
public @interface PortletConfiguration {
   
   /**
    * The portlet name for the annotated type.
    * 
    * @return  The portlet name
    */
   String   portletName();
   
   /**
    * The portlet initialization parameters.
    * 
    * @return     An array of initialization parameters
    */
   InitParameter[] initParams() default {};
   
   /**
    * <div class='container-change'>
    * The locales supported by the portlet.
    * An array of String values, each of which represents a single locale.
    * <p>
    * The locale is specified as a language tag as defined in 
    * IETF BCP 47, "Tags for Identifying Languages".
    * </div>
    * 
    * @see     java.util.Locale
    * @see     java.util.Locale#forLanguageTag forLanguageTag
    * @see     <a href="https://tools.ietf.org/html/bcp47">IETF BCP 47</a>
    * 
    * @return  An array of language tag strings
    */
   String[]   supportedLocales() default {"en"};
   
   /**
    * <div class='container-change'>
    * The locale for the locale-specific configuration parameters such as
    * title and short title within this annotation.
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
    * Locale specific static title for this portlet.
    * </div>
    * 
    * @return The portlet title
    */
   String   title() default "";
   
   /**
    * <div class='container-change'>
    * Locale specific short version of the static title.
    * </div>
    * 
    * @return The short title
    */
   String   shortTitle() default "";
   
   /**
    * <div class='container-change'>
    * The display-name type contains a short name that is intended to be displayed by tools. 
    * It is used by display-name elements. 
    * The display name need not be unique.
    * </div>
    * 
    * @return  The display name
    */
   String   displayName() default "";
   
   /**
    * <div class='container-change'>
    * The portlet description.
    * It provides text describing the portlet for use by the portal application or by tools.
    * </div>
    * 
    * @return  The portlet description
    */
   String   description() default "";
   
   /**
    * <div class='container-change'>
    * Locale specific keywords associated with this portlet. 
    * The keywords are separated by commas.
    * </div>
    *
    * @return  The keywords
    */
   String   keywords() default "";
   
   /**
    * <div class='container-change'>
    * The portlet preferences.
    * </div>
    * 
    * @return     The portlet preferences
    */
   Preference[]  portletPreferences() default {};
   
   /**
    * <div class='container-change'>
    * The public render parameters used by the portlet.
    * </div>
    * 
    * @return     The array of public render parameters.
    */
   PublicRenderParameter[]  publicRenderParameter() default {};
   
   /**
    * <div class='container-change'>
    * The events defined for the portlet.
    * This includes the processing events as well as the publishing events.
    * <p>
    * The publishing event QNames are specified in the
    * <code>ActionMethod</code> and <code>EventMethod</code> annotations.
    * The processing event QNames are specified in the
    * <code>ActionMethod</code> and <code>EventMethod</code> annotations.
    * </div>
    * 
    * @see        PortletQName
    * @see        ActionMethod
    * @see        EventMethod
    * 
    * @return     The event definitions
    */
   PortletEvent[] events() default {};

   /**
    * <div class='container-change'>
    * Defines the content types supported by the portlet along with
    * the associated portlet modes and window states.
    * </div>
    * 
    * @return     An array of content type support items
    */
   ContentTypeSupport[] contentTypes() default {@ContentTypeSupport};
   
   /**
    * <div class='container-change'>
    * The resource bundle name for this portlet.
    * Name of the resource bundle containing the language specific 
    * portlet information in different languages.
    * <p>
    * the file name is specified without 
    * the language specific part (e.g. _en) or the file extension.
    * </div>
    * 
    * @return     The resource bundle name
    */
   String   resourceBundle()  default "";
   
   /**
    * <div class='container-change'>
    * The default QName namespace URI.
    * <p>
    * The default namespace URI is used when no namespace URI is specified 
    * when declaring a QName for a public render parameter or portlet event. 
    * </div>
    * 
    * @return  The default namespace URI.
    */
   String      defaultNamespaceURI() default "";
   
   /**
    * <div class='not-supported'>
    * The cache scope, which defines whether generated portlet content is private
    * for the user or can be shared across different users.
    * <p>
    * If this field is set to <code>TRUE</code>, cached information can be shared 
    * between users. 
    * Otherwise cached information will be considered private
    * to the user.
    * <p>
    * This value is set before the annotated method is called.
    * </div>
    *  
    * @return     The cache scope
    */
   boolean   cacheScopePublic() default false;
   
   /**
    * <div class='not-supported'>
    * Expiration-time defines the time in seconds after which the portlet output expires.
    * A value of -1 indicates that the output never expires.
    * <p>
    * This value is set before the annotated method is called.
    * </div>
    *  
    * @return     The expiration time
    */
   int   cacheExpirationTime() default 0;
}
