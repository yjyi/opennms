package org.opennms.web.alarm;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;

/**
 * Convenience class to determine what sort of alarms to include in a query.
 *
 * @author ranger
 * @version $Id: $
 * @since 1.8.1
 */
public enum AcknowledgeType {
    ACKNOWLEDGED("ack"), UNACKNOWLEDGED("unack"), BOTH("both");

    /** Constant <code>s_ackTypesString</code> */
    private static final Map<String, AcknowledgeType> s_ackTypesString;
    
    private String m_shortName;

    static {
        s_ackTypesString = new HashMap<String, AcknowledgeType>();

        for (AcknowledgeType ackType : AcknowledgeType.values()) {
            s_ackTypesString.put(ackType.getShortName(), ackType);
        }
    }

    private AcknowledgeType(String shortName) {
        m_shortName = shortName;
    }

    /**
     * <p>toString</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String toString() {
        return "AcknowledgeType." + getName();
    }

    /**
     * <p>getName</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getName() {
        return name();
    }

    /**
     * <p>getShortName</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getShortName() {
        return m_shortName;
    }
    
    /**
     * Convenience method for getting the SQL <em>ORDER BY</em> clause related
     * this sort style.
     *
     * @return a {@link java.lang.String} object.
     */
    protected String getAcknowledgeTypeClause() {
        switch (this) {
        case ACKNOWLEDGED:
            return " ALARMACKUSER IS NOT NULL";
    
        case UNACKNOWLEDGED:
            return " ALARMACKUSER IS NULL";
    
        case BOTH:
            return " (ALARMACKUSER IS NULL OR ALARMACKUSER IS NOT NULL)";
            
        default:
            throw new IllegalArgumentException("Cannot get clause for AcknowledgeType " + this);
        }
    }

    /**
     * <p>getAcknowledgeType</p>
     *
     * @param ackTypeString a {@link java.lang.String} object.
     * @return a {@link org.opennms.web.alarm.AcknowledgeType} object.
     */
    public static AcknowledgeType getAcknowledgeType(String ackTypeString) {
        Assert.notNull(ackTypeString, "Cannot take null parameters.");

        return s_ackTypesString.get(ackTypeString.toLowerCase());
    }
}
