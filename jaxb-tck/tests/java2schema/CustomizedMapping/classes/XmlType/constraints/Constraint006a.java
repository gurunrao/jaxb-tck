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

package CustomizedMapping.classes.XmlType.constraint;

import jakarta.xml.bind.annotation.*;

/**
 * Jakarta XML Binding specification assertion: JAXB:SPEC:J2S:0063
 * @XmlType is used to map a Java class to a schema type.
 * The schema type is computed from its annotation element values.
 * If a class annotated  with the @XmlType annotation, then the following mapping 
 * constraints must be enforced:
 * If factoryClass() is other than DEFAULT.class, then factoryMethod() must be specified 
 * (i.e. the default value empty string cannot be used.)
 * 
 * Positive test. 
 **/
@XmlRootElement(name="root")
@XmlType(name="entryType", 
         propOrder={"key", "value"}, 
         factoryClass=Constraint006b.class,
         factoryMethod="getConstraint006a"
         )
public class Constraint006a {

    public String value;

    public int key;     

    public Constraint006a(String value, int key) {
    	this.value = value;
    	this.key = key;
    }
}
