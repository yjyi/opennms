//
// This file is part of the OpenNMS(R) Application.
//
// OpenNMS(R) is Copyright (C) 2006 The OpenNMS Group, Inc.  All rights reserved.
// OpenNMS(R) is a derivative work, containing both original code, included code and modified
// code that was published under the GNU General Public License. Copyrights for modified 
// and included code are below.
//
// OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
//
// Original code base Copyright (C) 1999-2001 Oculan Corp.  All rights reserved.
//
// This program is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
//
// For more information contact:
// OpenNMS Licensing       <license@opennms.org>
//     http://www.opennms.org/
//     http://www.opennms.com/
//

package org.opennms.netmgt.collectd;

/**
 * <p>CollectionSetVisitor interface.</p>
 *
 * @author ranger
 * @version $Id: $
 */
public interface CollectionSetVisitor {

    /**
     * <p>visitCollectionSet</p>
     *
     * @param set a {@link org.opennms.netmgt.collectd.CollectionSet} object.
     */
    void visitCollectionSet(CollectionSet set);

    /**
     * <p>visitResource</p>
     *
     * @param resource a {@link org.opennms.netmgt.collectd.CollectionResource} object.
     */
    void visitResource(CollectionResource resource);

    /**
     * <p>visitGroup</p>
     *
     * @param group a {@link org.opennms.netmgt.collectd.AttributeGroup} object.
     */
    void visitGroup(AttributeGroup group);

    /**
     * <p>visitAttribute</p>
     *
     * @param attribute a {@link org.opennms.netmgt.collectd.CollectionAttribute} object.
     */
    void visitAttribute(CollectionAttribute attribute);

    /**
     * <p>completeAttribute</p>
     *
     * @param attribute a {@link org.opennms.netmgt.collectd.CollectionAttribute} object.
     */
    void completeAttribute(CollectionAttribute attribute);

    /**
     * <p>completeGroup</p>
     *
     * @param group a {@link org.opennms.netmgt.collectd.AttributeGroup} object.
     */
    void completeGroup(AttributeGroup group);

    /**
     * <p>completeResource</p>
     *
     * @param resource a {@link org.opennms.netmgt.collectd.CollectionResource} object.
     */
    void completeResource(CollectionResource resource);

    /**
     * <p>completeCollectionSet</p>
     *
     * @param set a {@link org.opennms.netmgt.collectd.CollectionSet} object.
     */
    void completeCollectionSet(CollectionSet set);

}
