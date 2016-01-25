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
 * A portlet should throw a <CODE>PortletSecurityException</CODE>
 * when a call fails because of security reasons.<br>
 * Additionally it can be thrown by the portal/portlet-container.
 */

public class PortletSecurityException extends PortletException
{

  private static final long serialVersionUID = 1L;

  /**
   * Constructs a new security exception with the given text. The
   * portlet container may use the text write it to a log.
   *
   * @param   text
   *          the exception text
   */

  public PortletSecurityException (String text)
  {
    super (text);
  }

  /**
   * Constructs a new portlet security exception when the portlet needs to do
   * the following:
   * <ul>
   * <il>throw an exception 
   * <li>include a message about the "root cause" that interfered
   *     with its normal operation
   * <li>include a description message
   * </ul>
   *
   * @param   text
   *          the exception text
   * @param   cause
   *          the root cause
   */
  
  public PortletSecurityException (String text, Throwable cause)
  {
    super(text, cause);
  }

  /**
   * Constructs a new portlet security exception when the portlet needs to throw an
   * exception. The exception message is based on the localized message
   * of the underlying exception.
   *
   * @param   cause
   *          the root cause
   */

  public PortletSecurityException (Throwable cause)
  {
    super(cause);
  }


}
