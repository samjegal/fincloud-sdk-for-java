/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for VpcPeeringInstanceStatusCode.
 */
public final class VpcPeeringInstanceStatusCode extends ExpandableStringEnum<VpcPeeringInstanceStatusCode> {
    /** Static value INIT for VpcPeeringInstanceStatusCode. */
    public static final VpcPeeringInstanceStatusCode INIT = fromString("INIT");

    /** Static value RUN for VpcPeeringInstanceStatusCode. */
    public static final VpcPeeringInstanceStatusCode RUN = fromString("RUN");

    /** Static value TERMTING for VpcPeeringInstanceStatusCode. */
    public static final VpcPeeringInstanceStatusCode TERMTING = fromString("TERMTING");

    /**
     * Creates or finds a VpcPeeringInstanceStatusCode from its string representation.
     * @param name a name to look for
     * @return the corresponding VpcPeeringInstanceStatusCode
     */
    @JsonCreator
    public static VpcPeeringInstanceStatusCode fromString(String name) {
        return fromString(name, VpcPeeringInstanceStatusCode.class);
    }

    /**
     * @return known VpcPeeringInstanceStatusCode values
     */
    public static Collection<VpcPeeringInstanceStatusCode> values() {
        return values(VpcPeeringInstanceStatusCode.class);
    }
}
