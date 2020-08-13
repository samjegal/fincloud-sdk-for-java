/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WMSFilterType.
 */
public final class WMSFilterType extends ExpandableStringEnum<WMSFilterType> {
    /** Static value url for WMSFilterType. */
    public static final WMSFilterType URL = fromString("url");

    /** Static value urlprefix for WMSFilterType. */
    public static final WMSFilterType URLPREFIX = fromString("urlprefix");

    /** Static value js for WMSFilterType. */
    public static final WMSFilterType JS = fromString("js");

    /** Static value jsprefix for WMSFilterType. */
    public static final WMSFilterType JSPREFIX = fromString("jsprefix");

    /**
     * Creates or finds a WMSFilterType from its string representation.
     * @param name a name to look for
     * @return the corresponding WMSFilterType
     */
    @JsonCreator
    public static WMSFilterType fromString(String name) {
        return fromString(name, WMSFilterType.class);
    }

    /**
     * @return known WMSFilterType values
     */
    public static Collection<WMSFilterType> values() {
        return values(WMSFilterType.class);
    }
}
