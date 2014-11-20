/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2006-2014 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2014 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.netmgt.collection.support;

import org.opennms.netmgt.collection.api.AttributeGroup;
import org.opennms.netmgt.collection.api.CollectionAttribute;
import org.opennms.netmgt.collection.api.CollectionResource;
import org.opennms.netmgt.collection.api.CollectionSet;
import org.opennms.netmgt.collection.api.CollectionSetVisitor;



/**
 * <p>This AbstractCollectionSetVisitor class provides no-op implementations of
 * all of the {@link CollectionSetVisitor} methods so that you can override 
 * specific methods as needed to implement your visitor.</p>
 */
public class AbstractCollectionSetVisitor implements CollectionSetVisitor {

    /** {@inheritDoc} */
    @Override
    public void visitAttribute(CollectionAttribute attribute) {
    }

    /** {@inheritDoc} */
    @Override
    public void visitCollectionSet(CollectionSet set) {
    }

    /** {@inheritDoc} */
    @Override
    public void visitGroup(AttributeGroup group) {
    }

    /** {@inheritDoc} */
    @Override
    public void visitResource(CollectionResource resource) {
    }

    /** {@inheritDoc} */
    @Override
    public void completeAttribute(CollectionAttribute attribute) {
    }

    /** {@inheritDoc} */
    @Override
    public void completeCollectionSet(CollectionSet set) {
    }

    /** {@inheritDoc} */
    @Override
    public void completeGroup(AttributeGroup group) {
    }

    /** {@inheritDoc} */
    @Override
    public void completeResource(CollectionResource resource) {
    }

}
