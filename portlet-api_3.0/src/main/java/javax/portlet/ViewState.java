package javax.portlet;

/**
 * The current view state of the portlet is represented portlet mode and  
 * window state that are set for this request. The <CODE>ViewState</CODE> 
 * interface defines the API for accessing these parameters. 
 */
public interface ViewState {

   /**
    * Returns the current portlet mode of the portlet.
    *
    * @return   the portlet mode
    */

   public abstract PortletMode getPortletMode();

   /**
    * Returns the current window state of the portlet.
    *
    * @return   the window state
    */

   public abstract WindowState getWindowState();

}