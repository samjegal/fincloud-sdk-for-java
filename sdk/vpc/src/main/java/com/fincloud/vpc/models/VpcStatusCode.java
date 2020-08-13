/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for VpcStatusCode.
 */
public final class VpcStatusCode extends ExpandableStringEnum<VpcStatusCode> {
    /** Static value INIT for VpcStatusCode. */
    public static final VpcStatusCode INIT = fromString("INIT");

    /** Static value CREATING for VpcStatusCode. */
    public static final VpcStatusCode CREATING = fromString("CREATING");

    /** Static value RUN for VpcStatusCode. */
    public static final VpcStatusCode RUN = fromString("RUN");

    /** Static value TERMTING for VpcStatusCode. */
    public static final VpcStatusCode TERMTING = fromString("TERMTING");

    /**
     * Creates or finds a VpcStatusCode from its string representation.
     * @param name a name to look for
     * @return the corresponding VpcStatusCode
     */
    @JsonCreator
    public static VpcStatusCode fromString(String name) {
        return fromString(name, VpcStatusCode.class);
    }

    /**
     * @return known VpcStatusCode values
     */
    public static Collection<VpcStatusCode> values() {
        return values(VpcStatusCode.class);
    }
}
