/*  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

/*
 * This source code implements specifications defined by the Java
 * Community Process. In order to remain compliant with the specification
 * DO NOT add / change / or delete method signatures!
 */

package javax.portlet;

/**
 * <span class="changed_modified_3_0">The</span>  
 * <CODE>ResourceResponse</CODE> defines an object to assist a portlet 
 * for rendering a resource.
 * <p>
 * The difference between the <CODE>RenderResponse</CODE> is that for the 
 * <CODE>ResourceResponse</CODE> the output of this response is delivered
 * directly to the client without any additional markup added by the portal.
 * It is therefore allowed for the portlet to return binary content in this
 * response.
 * <p>
 * A portlet can set HTTP headers for the response via the setProperty or 
 * addProperty call in the <CODE>ResourceResponse</CODE>. 
 * To be successfully transmitted back to the client, headers must be set 
 * before the response is committed. Headers set after the response is 
 * committed will be ignored by the portlet container.
 * <p>
 * The portlet container creates a <CODE>ResourceResponse</CODE> object and 
 * passes it as argument to the portlet's <CODE>serveResource</CODE> method.
 * 
 * @see ResourceServingPortlet
 * @see MimeResponse
 * @since 2.0
 */
public interface ResourceResponse extends MimeResponse {
    
	/**
	 * <span class="changed_modified_3_0">Constant</span> 
	 * for setting the HTTP status code via the 
	 * <code>setProperty</code> method.
	 * <span class="changed_added_3_0">
	 * Changing the HTTP status code after 
    * after the response has been committed has no effect.
    * </span>
	 */
	public static final String HTTP_STATUS_CODE = "portlet.http-status-code";

    /**
     * <span class="changed_modified_3_0">Sets</span> 
     * the locale of the response, setting the headers 
     * (including the Content-Type's charset) as appropriate. 
     * <span class="changed_deleted_3_0">This method should be called before a call to getWriter().</span> 
     * By default, the response locale is the default locale provided
     * by the portlet container.
     * <p>
     * <span class="changed_added_3_0">
     * This method has no effect if it is called after 
     * after the response has been committed.
     * </span>
     * 
     * @param loc  the new locale of the response
     */
    public void setLocale(java.util.Locale loc);
    
    
    /**
     * Sets the character encoding (MIME charset) of the response being 
     * sent to the client, for example, to UTF-8. If the character encoding 
     * has already been set by either the portlet container,
     * <code>setContentType(java.lang.String)</code> or 
     * <code>setLocale(java.util.Locale)</code>, this method overrides it. Calling 
     * <code>setContentType(java.lang.String)</code> with the String  of 
     * <code>text/html</code> and calling this method with the String of 
     * <code>UTF-8</code> is equivalent with calling <code>setContentType</code> 
     * with the String of <code>text/html; charset=UTF-8</code>.
     * <p>
     * This method can be called repeatedly to change the character encoding. 
     * This method has no effect if it is called after getWriter has been called 
     * or after the response has been committed.
     * 
     * @param charset a String specifying only the character set defined by 
     *                IANA Character Sets (http://www.iana.org/assignments/character-sets)
     */
    public void setCharacterEncoding(java.lang.String charset);
    
    
    /**
     * <span class="changed_modified_3_0">Sets</span> 
     * the length of the content body in the response.
     * <p>
     * <span class="changed_added_3_0">
     * This method has no effect if it is called after 
     * after the response has been committed.
     * </span>
     * 
     * @param len an integer specifying the length of the content being returned
     */
    public void setContentLength(int len);
    
    
    /**
     * <div class="changed_added_3_0">
     * Sets the HTTP status code for this request.
     * <p>
     * The status code should be a valid value as defined in 
     * IETF <a href="http://tools.ietf.org/html/rfc2616">
     * rfc2616 "Hypertext Transfer Protocol -- HTTP/1.1"
     * </a>. The status code constants "SC_*" defined in 
     * {@link javax.servlet.http.HttpServletResponse} may be used.
     * <p>
     * This method has no effect if it is called after 
     * after the response has been committed.
     * </div>
     * 
     * @see javax.servlet.http.HttpServletResponse
     * @see javax.servlet.http.HttpServletResponse#setStatus
     * 
     * @since 3.0
     * 
     * @param sc an integer specifying the status code for this request
     */
    public void setStatus(int sc);
    
    
	/**
     * @throws java.lang.IllegalStateException
     *             if the cacheability level of the resource URL
     *             triggering this <code>serveResource</code> call
     *             is not <code>PAGE</code> and thus does not allow
     *             for creating render URLs.
     */
	public PortletURL createRenderURL();
   
   
  /**
    * @throws java.lang.IllegalStateException
    *             if the cacheability level of the resource URL
    *             triggering this <code>serveResource</code> call
    *             is not <code>PAGE</code> and thus does not allow
    *             for creating render URLs.
    */
  public PortletURL createRenderURL(ParameterCopyOption option);

	/**
     * @throws java.lang.IllegalStateException
     *             if the cacheability level of the resource URL
     *             triggering this <code>serveResource</code> call
     *             is not <code>PAGE</code> and thus does not allow
     *             for creating action URLs.
     */
	public PortletURL createActionURL();

   /**
     * @throws java.lang.IllegalStateException
     *             if the cacheability level of the resource URL
     *             triggering this <code>serveResource</code> call
     *             is not <code>PAGE</code> and thus does not allow
     *             for creating action URLs.
     */
   public PortletURL createActionURL(ParameterCopyOption option);

	/**
     * @throws java.lang.IllegalStateException
     *             if the cacheability level of the resource URL
     *             triggering this <code>serveResource</code> call,
     *             or one of the parent calls, have defined a stricter
     *             cachability level.
     */
	public ResourceURL createResourceURL();


}
