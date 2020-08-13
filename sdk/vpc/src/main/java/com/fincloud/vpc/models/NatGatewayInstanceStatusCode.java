/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for NatGatewayInstanceStatusCode.
 */
public final class NatGatewayInstanceStatusCode extends ExpandableStringEnum<NatGatewayInstanceStatusCode> {
    /** Static value INIT for NatGatewayInstanceStatusCode. */
    public static final NatGatewayInstanceStatusCode INIT = fromString("INIT");

    /** Static value RUN for NatGatewayInstanceStatusCode. */
    public static final NatGatewayInstanceStatusCode RUN = fromString("RUN");

    /** Static value TERMTING for NatGatewayInstanceStatusCode. */
    public static final NatGatewayInstanceStatusCode TERMTING = fromString("TERMTING");

    /**
     * Creates or finds a NatGatewayInstanceStatusCode from its string representation.
     * @param name a name to look for
     * @return the corresponding NatGatewayInstanceStatusCode
     */
    @JsonCreator
    public static NatGatewayInstanceStatusCode fromString(String name) {
        return fromString(name, NatGatewayInstanceStatusCode.class);
    }

    /**
     * @return known NatGatewayInstanceStatusCode values
     */
    public static Collection<NatGatewayInstanceStatusCode> values() {
        return values(NatGatewayInstanceStatusCode.class);
    }
}
