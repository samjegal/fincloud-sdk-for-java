/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OsTypeCode.
 */
public final class OsTypeCode extends ExpandableStringEnum<OsTypeCode> {
    /** Static value LNX for OsTypeCode. */
    public static final OsTypeCode LNX = fromString("LNX");

    /** Static value WND for OsTypeCode. */
    public static final OsTypeCode WND = fromString("WND");

    /**
     * Creates or finds a OsTypeCode from its string representation.
     * @param name a name to look for
     * @return the corresponding OsTypeCode
     */
    @JsonCreator
    public static OsTypeCode fromString(String name) {
        return fromString(name, OsTypeCode.class);
    }

    /**
     * @return known OsTypeCode values
     */
    public static Collection<OsTypeCode> values() {
        return values(OsTypeCode.class);
    }
}
