/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SubnetTypeCode.
 */
public final class SubnetTypeCode extends ExpandableStringEnum<SubnetTypeCode> {
    /** Static value PUBLIC for SubnetTypeCode. */
    public static final SubnetTypeCode PUBLIC = fromString("PUBLIC");

    /** Static value PRIVATE for SubnetTypeCode. */
    public static final SubnetTypeCode PRIVATE = fromString("PRIVATE");

    /**
     * Creates or finds a SubnetTypeCode from its string representation.
     * @param name a name to look for
     * @return the corresponding SubnetTypeCode
     */
    @JsonCreator
    public static SubnetTypeCode fromString(String name) {
        return fromString(name, SubnetTypeCode.class);
    }

    /**
     * @return known SubnetTypeCode values
     */
    public static Collection<SubnetTypeCode> values() {
        return values(SubnetTypeCode.class);
    }
}
