package javax.portlet;

/**
 * <div class="changed_added_3_0">
 * Provides read-only access to the portlet state.
 * The portlet state is represented by the render parameters,
 * portlet mode and window state.
 * <p>
 * During render or resource request processing, the portlet state is constant and 
 * can be accessed through methods provided by this interface.
 * <p>
 * During portlet action or event request ptocessing, the portlet state can be modified for 
 * subsequent render phase processing.
 * During the portlet render or resource phases, URLs containing modified portlet state 
 * can be created.
 * When a portlet URL containing modified portlet state is triggered, the corresponding portlet
 * phase is executed with the modified portlet state.
 * <p>
 * The portlet state is modified through {@link MutablePortletState}.
 * </div> 
 * @since      3.0
 * @see        MutablePortletState
 * @see        PortletParameters
 */
public interface PortletState {
   
   
   /**
    * <div class="changed_added_3_0">
    * Gets the render parameters.
    * </div>
    * 
    * @return   an immutable <code>RenderParameters</code> object representing
    *           the private and public render parameters
    * @since    3.0
    * @see      PortletParameters 
    * @see      RenderParameters 
    */
   
   public RenderParameters getRenderParameters();

   
   /**
    * <div class="changed_added_3_0">
    * Returns the current portlet mode of the portlet.
    * </div>
    *
    * @return     the portlet mode. If the portlet mode is not available, 
    *             {@link PortletMode#UNDEFINED} is returned.
    * @see        PortletMode
    * @since      3.0
    */

   public PortletMode getPortletMode();

   
   /**
    * <div class="changed_added_3_0">
    * Returns the current window state of the portlet.
    * </div>
    *
    * @return     the window state. If the window state is not available, 
    *             {@link WindowState#UNDEFINED} is returned.
    * @see        WindowState
    * @since      3.0
    */

   public WindowState getWindowState();

}