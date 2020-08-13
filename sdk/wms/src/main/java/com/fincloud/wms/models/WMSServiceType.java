/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WMSServiceType.
 */
public final class WMSServiceType extends ExpandableStringEnum<WMSServiceType> {
    /** Static value PC for WMSServiceType. */
    public static final WMSServiceType PC = fromString("PC");

    /** Static value MOBILE for WMSServiceType. */
    public static final WMSServiceType MOBILE = fromString("MOBILE");

    /**
     * Creates or finds a WMSServiceType from its string representation.
     * @param name a name to look for
     * @return the corresponding WMSServiceType
     */
    @JsonCreator
    public static WMSServiceType fromString(String name) {
        return fromString(name, WMSServiceType.class);
    }

    /**
     * @return known WMSServiceType values
     */
    public static Collection<WMSServiceType> values() {
        return values(WMSServiceType.class);
    }
}
