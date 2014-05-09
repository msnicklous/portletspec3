package javax.portlet;

/**
 * <div class="changed_added_3_0">
 * The current view state of the portlet is represented portlet mode and  
 * window state that are set for this request. The <CODE>ViewState</CODE> 
 * interface defines the API for accessing these settings.
 * </div> 
 * @since      3.0
 */
public interface ViewState {

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