/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WMSErrorType.
 */
public final class WMSErrorType extends ExpandableStringEnum<WMSErrorType> {
    /** Static value URL for WMSErrorType. */
    public static final WMSErrorType URL = fromString("URL");

    /** Static value JAVASCRIPT for WMSErrorType. */
    public static final WMSErrorType JAVASCRIPT = fromString("JAVASCRIPT");

    /**
     * Creates or finds a WMSErrorType from its string representation.
     * @param name a name to look for
     * @return the corresponding WMSErrorType
     */
    @JsonCreator
    public static WMSErrorType fromString(String name) {
        return fromString(name, WMSErrorType.class);
    }

    /**
     * @return known WMSErrorType values
     */
    public static Collection<WMSErrorType> values() {
        return values(WMSErrorType.class);
    }
}
