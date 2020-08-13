/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WMSResult.
 */
public final class WMSResult extends ExpandableStringEnum<WMSResult> {
    /** Static value SUCCESS for WMSResult. */
    public static final WMSResult SUCCESS = fromString("SUCCESS");

    /** Static value FAIL for WMSResult. */
    public static final WMSResult FAIL = fromString("FAIL");

    /**
     * Creates or finds a WMSResult from its string representation.
     * @param name a name to look for
     * @return the corresponding WMSResult
     */
    @JsonCreator
    public static WMSResult fromString(String name) {
        return fromString(name, WMSResult.class);
    }

    /**
     * @return known WMSResult values
     */
    public static Collection<WMSResult> values() {
        return values(WMSResult.class);
    }
}
