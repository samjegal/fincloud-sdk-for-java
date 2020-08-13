/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WMSLocationName.
 */
public final class WMSLocationName extends ExpandableStringEnum<WMSLocationName> {
    /** Static value KR for WMSLocationName. */
    public static final WMSLocationName KR = fromString("KR");

    /** Static value US for WMSLocationName. */
    public static final WMSLocationName US = fromString("US");

    /** Static value JP for WMSLocationName. */
    public static final WMSLocationName JP = fromString("JP");

    /** Static value HK for WMSLocationName. */
    public static final WMSLocationName HK = fromString("HK");

    /** Static value SG for WMSLocationName. */
    public static final WMSLocationName SG = fromString("SG");

    /**
     * Creates or finds a WMSLocationName from its string representation.
     * @param name a name to look for
     * @return the corresponding WMSLocationName
     */
    @JsonCreator
    public static WMSLocationName fromString(String name) {
        return fromString(name, WMSLocationName.class);
    }

    /**
     * @return known WMSLocationName values
     */
    public static Collection<WMSLocationName> values() {
        return values(WMSLocationName.class);
    }
}
