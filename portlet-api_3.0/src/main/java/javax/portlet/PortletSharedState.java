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
 * Public Render Parameters represent state that is managed by the 
 * portlet container and that can potentially be shared with other portlets. 
 * The <CODE>PortletSharedState</CODE> interface provides methods that allow  
 * changing the public render parameters.
 *
 * @since 3.0
 */
public interface PortletSharedState {

   /**
    * Removes the specified public render parameter.
    * The name must reference a public render parameter defined
    * in the portlet deployment descriptor under the
    * <code>public-render-parameter</code> element with the
    * <code>identifier</code> mapping to the parameter name.
    * 
    * @param name       a <code>String</code> specifying 
    *             the name of the public render parameter to be removed
    *
    * @exception  java.lang.IllegalArgumentException 
    *                            if name is <code>null</code>.
    * @since 2.0
    */
   public void removePublicRenderParameter(String name);
}
