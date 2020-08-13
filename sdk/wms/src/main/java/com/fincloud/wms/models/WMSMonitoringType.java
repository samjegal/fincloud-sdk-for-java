/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WMSMonitoringType.
 */
public final class WMSMonitoringType extends ExpandableStringEnum<WMSMonitoringType> {
    /** Static value URL for WMSMonitoringType. */
    public static final WMSMonitoringType URL = fromString("URL");

    /** Static value SCENARIO for WMSMonitoringType. */
    public static final WMSMonitoringType SCENARIO = fromString("SCENARIO");

    /**
     * Creates or finds a WMSMonitoringType from its string representation.
     * @param name a name to look for
     * @return the corresponding WMSMonitoringType
     */
    @JsonCreator
    public static WMSMonitoringType fromString(String name) {
        return fromString(name, WMSMonitoringType.class);
    }

    /**
     * @return known WMSMonitoringType values
     */
    public static Collection<WMSMonitoringType> values() {
        return values(WMSMonitoringType.class);
    }
}
