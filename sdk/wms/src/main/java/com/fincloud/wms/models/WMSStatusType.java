/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WMSStatusType.
 */
public final class WMSStatusType extends ExpandableStringEnum<WMSStatusType> {
    /** Static value ON for WMSStatusType. */
    public static final WMSStatusType ON = fromString("ON");

    /** Static value OFF for WMSStatusType. */
    public static final WMSStatusType OFF = fromString("OFF");

    /**
     * Creates or finds a WMSStatusType from its string representation.
     * @param name a name to look for
     * @return the corresponding WMSStatusType
     */
    @JsonCreator
    public static WMSStatusType fromString(String name) {
        return fromString(name, WMSStatusType.class);
    }

    /**
     * @return known WMSStatusType values
     */
    public static Collection<WMSStatusType> values() {
        return values(WMSStatusType.class);
    }
}
