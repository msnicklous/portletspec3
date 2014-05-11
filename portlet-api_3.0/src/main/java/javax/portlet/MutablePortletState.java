package javax.portlet;



/**
 * <div class="changed_added_3_0">
 * Provides read/write access to the portlet state to record a potential 
 * future portlet view state.
 * <p>
 * The current state of the portlet is represented by the render parameters,
 * portlet mode and window state.  
 * <p>
 * For example, the methods defined here can be used to set the portlet state on 
 * a {@link PortletURL} object. The portlet state is applied when 
 * the portlet URL containing this portlet state is activated.
 * </div>
 *
 * @since 3.0
 * @see      PortletParameters 
 * @see      RenderParameters 
 * @see      MutablePortletParameters 
 * @see      MutableRenderParameters 
 */
public interface MutablePortletState extends PortletState, Mutable {


   /**
    * <div class="changed_added_3_0">
    * Gets the mutable render parameters.
    * </div>
    * 
    * @return   a <code>MutableRenderParameters</code> object representing
    *           the private and public render parameters
    * @since    3.0
    * @see      PortletParameters 
    * @see      RenderParameters 
    * @see      MutablePortletParameters 
    * @see      MutableRenderParameters 
    */

   public MutableRenderParameters getRenderParameters();


   /**
    * <div class="changed_added_3_0">
    * Sets the window state of a portlet to the given window state.
    * <p>
    * Possible values are the standard window states and any custom window
    * states supported by the portal and the portlet. Standard window states
    * are:
    * <ul>
    * <li>MINIMIZED
    * <li>NORMAL
    * <li>MAXIMIZED
    * </ul>
    * <p>
    * Not more than one window state can be set.
    * If more than one window state is set, only the last one set
    * is valid.
    * </div>
    * 
    * @param windowState
    *            the new portlet window state
    * 
    * @exception WindowStateException
    *                   if the portlet cannot switch to this state,
    *                   because the portal does not support this state, the portlet has not 
    *                   declared in its deployment descriptor that it supports this state, or the current
    *                   user is not allowed to switch to this state.
    *                   The <code>PortletRequest.isWindowStateAllowed()</code> method can be used
    *                   to check if the portlet can set a given window state.
    * @exception java.lang.IllegalStateException
    *                if the method is invoked after <code>sendRedirect</code>
    *                has been called.
    * @exception java.lang.IllegalArgumentException
    *                if the input parameter is <code>null</code>.
    * 
    * @since 3.0
    * 
    */

   public void setWindowState(WindowState windowState)
         throws WindowStateException;

   /**
    * <div class="changed_added_3_0">
    * Sets the portlet mode of a portlet to the given portlet mode.
    * <p>
    * Possible values are the standard portlet modes and any custom portlet
    * modes supported by the portal and the portlet. Portlets must declare in
    * the deployment descriptor the portlet modes they support for each markup
    * type. Standard portlet modes are:
    * <ul>
    * <li>EDIT
    * <li>HELP
    * <li>VIEW
    * </ul>
    * <p>
    * Not more than one portlet mode can be set.
    * If more than one portlet mode is set, only the last one set
    * is valid.
    * <p>
    * Note: The portlet may still be called in a different portlet mode in the
    * next render call, depending on the portlet container / portal.
    * </div>
    * 
    * @param portletMode
    *            the new portlet mode
    * 
    * @exception PortletModeException
    *                   if the portlet cannot switch to this mode,
    *                   because the portal does not support this mode, the portlet has not
    *                   declared in its deployment descriptor that it supports this mode for the current markup,
    *                   or the current user is not allowed to switch to this mode.
    *                   The <code>PortletRequest.isPortletModeAllowed()</code> method can be used
    *                   to check if the portlet can set a given portlet mode.
    * @exception java.lang.IllegalStateException
    *                if the method is invoked after <code>sendRedirect</code>
    *                has been called.
    * @exception java.lang.IllegalArgumentException
    *                if the input parameter is <code>null</code>.
    *                
    * @since 3.0
    */

   public void setPortletMode(PortletMode portletMode)
         throws PortletModeException;

}