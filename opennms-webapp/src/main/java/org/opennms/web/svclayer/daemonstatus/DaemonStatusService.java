/*
 * This file is part of the OpenNMS(R) Application.
 *
 * OpenNMS(R) is Copyright (C) 2006-2008 The OpenNMS Group, Inc.  All rights reserved.
 * OpenNMS(R) is a derivative work, containing both original code, included code and modified
 * code that was published under the GNU General Public License. Copyrights for modified
 * and included code are below.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * Modifications:
 * 
 * Created: July 26, 2006
 *
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
package org.opennms.web.svclayer.daemonstatus;

import java.util.Collection;
import java.util.Map;

import org.opennms.netmgt.dao.ServiceInfo;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>DaemonStatusService interface.</p>
 *
 * @author <a href="mailto:skareti@users.sourceforge.net">skareti</a>
 * @version $Id: $
 * @since 1.8.1
 */
@Transactional(readOnly = false)
public interface DaemonStatusService {

	/**
	 * <p>getCurrentDaemonStatus</p>
	 *
	 * @return a {@link java.util.Map} object.
	 */
	@Transactional(readOnly = true)
	Map<String, ServiceInfo> getCurrentDaemonStatus();
	/**
	 * <p>getCurrentDaemonStatusColl</p>
	 *
	 * @return a {@link java.util.Collection} object.
	 */
	Collection<ServiceInfo> getCurrentDaemonStatusColl();

	/**
	 * <p>startDaemon</p>
	 *
	 * @param service a {@link java.lang.String} object.
	 * @return a {@link java.util.Map} object.
	 */
	Map<String, ServiceInfo> startDaemon(String service);

	/**
	 * <p>stopDaemon</p>
	 *
	 * @param service a {@link java.lang.String} object.
	 * @return a {@link java.util.Map} object.
	 */
	Map<String, ServiceInfo> stopDaemon(String service);

	/**
	 * <p>restartDaemon</p>
	 *
	 * @param service a {@link java.lang.String} object.
	 * @return a {@link java.util.Map} object.
	 */
	Map<String, ServiceInfo> restartDaemon(String service);

	/**
	 * <p>performOperationOnDaemons</p>
	 *
	 * @param operation a {@link java.lang.String} object.
	 * @param deamons an array of {@link java.lang.String} objects.
	 * @return a {@link java.util.Map} object.
	 */
	Map<String, ServiceInfo> performOperationOnDaemons(String operation,
			String[] deamons);
}
