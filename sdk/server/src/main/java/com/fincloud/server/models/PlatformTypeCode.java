/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PlatformTypeCode.
 */
public final class PlatformTypeCode extends ExpandableStringEnum<PlatformTypeCode> {
    /** Static value LNX32 for PlatformTypeCode. */
    public static final PlatformTypeCode LNX32 = fromString("LNX32");

    /** Static value LNX64 for PlatformTypeCode. */
    public static final PlatformTypeCode LNX64 = fromString("LNX64");

    /** Static value WND32 for PlatformTypeCode. */
    public static final PlatformTypeCode WND32 = fromString("WND32");

    /** Static value WND64 for PlatformTypeCode. */
    public static final PlatformTypeCode WND64 = fromString("WND64");

    /** Static value UBD64 for PlatformTypeCode. */
    public static final PlatformTypeCode UBD64 = fromString("UBD64");

    /** Static value UBS64 for PlatformTypeCode. */
    public static final PlatformTypeCode UBS64 = fromString("UBS64");

    /**
     * Creates or finds a PlatformTypeCode from its string representation.
     * @param name a name to look for
     * @return the corresponding PlatformTypeCode
     */
    @JsonCreator
    public static PlatformTypeCode fromString(String name) {
        return fromString(name, PlatformTypeCode.class);
    }

    /**
     * @return known PlatformTypeCode values
     */
    public static Collection<PlatformTypeCode> values() {
        return values(PlatformTypeCode.class);
    }
}
