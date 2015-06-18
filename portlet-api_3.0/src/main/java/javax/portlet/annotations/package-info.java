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

/**
 * <span class="changed_added_3_0">
 * This describes a proposed extension for the JSR 362 Portlet Specification 3.0
 * public API to exploit CDI capabilities in portlets. 
 * </span>
 * <h4>Overview</h4>
 * <p>
 * The annotation-oriented API provides new capabilities in several areas.
 * </p>
 * <ul class='nospace'>
 * <li>
 * It allows portlet configuration declarations to be performed through use of
 * annotations.
 * The goal is to reduce or remove the need to write a portlet deployment descriptor 
 * in most instances.
 * <p>
 * The developer can choose between providing configuration data through annotations or 
 * through the portlet deployment descriptor.
 * If the same type of information is provided through both annotations and the deployment
 * descriptor, the information from the deployment descriptor has precedence. 
 * </li>
 * <li>
 * It allows portlets to be written as CDI beans.
 * Such portlets can make use of standard CDI features such as interceptors, 
 * decorators, and dependency injection.
 * <p>
 * Bean portlet methods must carry with one of the following annotations:
 * {@link javax.portlet.annotations.ActionMethod}, 
 * {@link javax.portlet.annotations.EventMethod}, 
 * {@link javax.portlet.annotations.HeaderMethod}, 
 * {@link javax.portlet.annotations.RenderMethod}, 
 * {@link javax.portlet.annotations.ServeResourceMethod}, or 
 * {@link javax.portlet.annotations.PortletResources}.
 * <p>
 * Bean portlet methods can be contained in any valid bean class. 
 * The class needs not implement any portlet-specific interface or extend a portlet class. 
 * However, each bean portlet method has method signature requirements that 
 * must be fulfilled.
 * Please see the annotation descriptions.
 * </li>
 * <li>
 * It provides new custom scopes for portlet artifacts.
 * <ul class='nospace'>
 * <li>
 * Using the scope annotation
 * {@link javax.portlet.annotations.PortletSessionScoped} 
 * associates the bean lifecycle with the portlet session.
 * </li>
 * <li>
 * Using the scope annotation
 * {@link javax.portlet.annotations.PortletStateScoped} 
 * associates the bean lifecycle with the portlet state, which conceptually is stored 
 * on the URL.
 * If you use PortletStateScoped beans, your bean state will be automatically stored as
 * render parameters for the portlet setting the state.      
 * </li>
 * </ul>
 * </li>
 * <li>
 * It allows portlet artifacts such as portlet request filters, URL generation listeners,
 * and preference validators to be implemented as CDI beans.
 * <p>
 * Please see the following annotation descriptions:
 * {@link javax.portlet.annotations.PortletRequestFilter},
 * {@link javax.portlet.annotations.PortletURLGenerationListener}, and
 * {@link javax.portlet.annotations.PreferencesValidator}.
 * </ul>
 */
package javax.portlet.annotations;