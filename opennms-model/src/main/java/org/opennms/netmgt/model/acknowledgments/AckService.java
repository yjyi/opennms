/*
 * This file is part of the OpenNMS(R) Application.
 *
 * OpenNMS(R) is Copyright (C) 2009 The OpenNMS Group, Inc.  All rights reserved.
 * OpenNMS(R) is a derivative work, containing both original code, included code and modified
 * code that was published under the GNU General Public License. Copyrights for modified
 * and included code are below.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * Modifications:
 * 
 * Created: January 7, 2009
 *
 * Copyright (C) 2009 The OpenNMS Group, Inc.  All rights reserved.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 *
 * For more information contact:
 *      OpenNMS Licensing       <license@opennms.org>
 *      http://www.opennms.org/
 *      http://www.opennms.com/
 */
package org.opennms.netmgt.model.acknowledgments;

import java.util.Collection;

import org.opennms.netmgt.model.OnmsAcknowledgment;
import org.springframework.transaction.annotation.Transactional;

/**
 * Transactional boundary for processing acknowledgments
 *
 * @author <a href="mailto:david@opennms.org">David Hustace</a>
 * @author <a href="makilto:jeffg@opennms.org">Jeff Gehlbach</a>
 *
 * Acknowledgment
 * @author <a href="mailto:david@opennms.org">David Hustace</a>
 * @author <a href="makilto:jeffg@opennms.org">Jeff Gehlbach</a>
 *
 * Acknowledgment
 * @version $Id: $
 */
public interface AckService {

    /**
     * <p>processAck</p>
     *
     * @param ack a {@link org.opennms.netmgt.model.OnmsAcknowledgment} object.
     */
    @Transactional(readOnly=false)
    void processAck(OnmsAcknowledgment ack);
    
    /**
     * <p>processAcks</p>
     *
     * @param acks a {@link java.util.Collection} object.
     */
    @Transactional(readOnly=false)
    void processAcks(Collection<OnmsAcknowledgment> acks);

}
