/*
 * Copyright (c) 2002, 2018 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.tgxml.tjtf.api.tests;

/**
 * ItemVariant - 
 *
 * <b>ItemVariant</b> is the interface that describes that this object is a 
 * TestItem and TestVariant(TestCase or Library).
 * 
 * <p>
 *
 * @version 	1.0, 11/30/2003
 * @author  Dmitry Fazunenko
 */


/*
 * ============================================================================================
 *    ItemVariant  (umbrella interface for TestItem and TestVariant)
 * ============================================================================================
 */


public  interface VariableTestItem extends TestItem, TestVariant {

}

