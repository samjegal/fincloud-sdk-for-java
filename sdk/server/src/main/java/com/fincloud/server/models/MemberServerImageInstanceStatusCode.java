/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MemberServerImageInstanceStatusCode.
 */
public final class MemberServerImageInstanceStatusCode extends ExpandableStringEnum<MemberServerImageInstanceStatusCode> {
    /** Static value INIT for MemberServerImageInstanceStatusCode. */
    public static final MemberServerImageInstanceStatusCode INIT = fromString("INIT");

    /** Static value CREATE for MemberServerImageInstanceStatusCode. */
    public static final MemberServerImageInstanceStatusCode CREATE = fromString("CREATE");

    /**
     * Creates or finds a MemberServerImageInstanceStatusCode from its string representation.
     * @param name a name to look for
     * @return the corresponding MemberServerImageInstanceStatusCode
     */
    @JsonCreator
    public static MemberServerImageInstanceStatusCode fromString(String name) {
        return fromString(name, MemberServerImageInstanceStatusCode.class);
    }

    /**
     * @return known MemberServerImageInstanceStatusCode values
     */
    public static Collection<MemberServerImageInstanceStatusCode> values() {
        return values(MemberServerImageInstanceStatusCode.class);
    }
}
