/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TargetTypeCode.
 */
public final class TargetTypeCode extends ExpandableStringEnum<TargetTypeCode> {
    /** Static value NATGW for TargetTypeCode. */
    public static final TargetTypeCode NATGW = fromString("NATGW");

    /** Static value VPCPEERING for TargetTypeCode. */
    public static final TargetTypeCode VPCPEERING = fromString("VPCPEERING");

    /** Static value VGW for TargetTypeCode. */
    public static final TargetTypeCode VGW = fromString("VGW");

    /**
     * Creates or finds a TargetTypeCode from its string representation.
     * @param name a name to look for
     * @return the corresponding TargetTypeCode
     */
    @JsonCreator
    public static TargetTypeCode fromString(String name) {
        return fromString(name, TargetTypeCode.class);
    }

    /**
     * @return known TargetTypeCode values
     */
    public static Collection<TargetTypeCode> values() {
        return values(TargetTypeCode.class);
    }
}
