/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SupportedSubnetTypeCode.
 */
public final class SupportedSubnetTypeCode extends ExpandableStringEnum<SupportedSubnetTypeCode> {
    /** Static value PUBLIC for SupportedSubnetTypeCode. */
    public static final SupportedSubnetTypeCode PUBLIC = fromString("PUBLIC");

    /** Static value PRIVATE for SupportedSubnetTypeCode. */
    public static final SupportedSubnetTypeCode PRIVATE = fromString("PRIVATE");

    /**
     * Creates or finds a SupportedSubnetTypeCode from its string representation.
     * @param name a name to look for
     * @return the corresponding SupportedSubnetTypeCode
     */
    @JsonCreator
    public static SupportedSubnetTypeCode fromString(String name) {
        return fromString(name, SupportedSubnetTypeCode.class);
    }

    /**
     * @return known SupportedSubnetTypeCode values
     */
    public static Collection<SupportedSubnetTypeCode> values() {
        return values(SupportedSubnetTypeCode.class);
    }
}
