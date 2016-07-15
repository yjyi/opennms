/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2007-2015 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2015 The OpenNMS Group, Inc.
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

package org.opennms.netmgt.provision.detector;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.UnknownHostException;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.opennms.core.test.MockLogAppender;
import org.opennms.core.utils.InetAddressUtils;
import org.opennms.netmgt.provision.detector.simple.NrpeDetector;
import org.opennms.netmgt.provision.detector.simple.NrpeDetectorFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author Donald Desloge
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/META-INF/opennms/detectors.xml"})
@Ignore
public class NrpeDetectorTest implements InitializingBean {

    @Autowired
    private NrpeDetectorFactory m_detectorFactory;
    
    private NrpeDetector m_detector;

    @Before
    public void setUp() {
        MockLogAppender.setupLogging();
        m_detector = m_detectorFactory.createDetector();
        m_detector.setPort(5666);
        m_detector.init();
    }

    //Tested against a local windows box with NSClient++
    @Test(timeout=20000)
    public void testDetectorSuccess() throws UnknownHostException {
        assertTrue(m_detector.isServiceDetected(InetAddressUtils.addr("192.168.1.103")));
    }

    @Test(timeout=20000)
    public void testDetectorFailWrongPort() throws UnknownHostException {
        m_detector.setPort(12489);
        assertFalse(m_detector.isServiceDetected(InetAddressUtils.addr("192.168.1.103")));
    }

    @Test(timeout=20000)
    public void testDetectorFailNotUsingSSL() throws UnknownHostException {
        m_detector.setUseSsl(false);
        assertFalse(m_detector.isServiceDetected(InetAddressUtils.addr("192.168.1.103")));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated method stub
        
    }

}
