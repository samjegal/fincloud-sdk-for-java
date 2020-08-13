/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WMSAlarmStatus.
 */
public final class WMSAlarmStatus extends ExpandableStringEnum<WMSAlarmStatus> {
    /** Static value ON for WMSAlarmStatus. */
    public static final WMSAlarmStatus ON = fromString("ON");

    /** Static value OFF for WMSAlarmStatus. */
    public static final WMSAlarmStatus OFF = fromString("OFF");

    /**
     * Creates or finds a WMSAlarmStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding WMSAlarmStatus
     */
    @JsonCreator
    public static WMSAlarmStatus fromString(String name) {
        return fromString(name, WMSAlarmStatus.class);
    }

    /**
     * @return known WMSAlarmStatus values
     */
    public static Collection<WMSAlarmStatus> values() {
        return values(WMSAlarmStatus.class);
    }
}
