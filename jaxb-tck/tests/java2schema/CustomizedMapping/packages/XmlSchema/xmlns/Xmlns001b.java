/*
 * Copyright (c) 2006, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package CustomizedMapping.packages.XmlSchema.xmlns;

import jakarta.xml.bind.annotation.*;

/**
 *
 * Jakarta XML Binding specification assertion: JAXB:SPEC:J2S:00043
 * Mapping: Package to XML target namespace
 * Namespace prefixes ::= if @XmlSchema.xmlns() is {} then implementation defined;
 * otherwise @XmlSchema.xmlns() 
 */ 
public class Xmlns001b {
	  @XmlElement(name="Price", required=true)
      public java.math.BigDecimal price;
}
