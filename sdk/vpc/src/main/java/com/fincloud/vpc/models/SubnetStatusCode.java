/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SubnetStatusCode.
 */
public final class SubnetStatusCode extends ExpandableStringEnum<SubnetStatusCode> {
    /** Static value INIT for SubnetStatusCode. */
    public static final SubnetStatusCode INIT = fromString("INIT");

    /** Static value CREATING for SubnetStatusCode. */
    public static final SubnetStatusCode CREATING = fromString("CREATING");

    /** Static value RUN for SubnetStatusCode. */
    public static final SubnetStatusCode RUN = fromString("RUN");

    /** Static value TERMTING for SubnetStatusCode. */
    public static final SubnetStatusCode TERMTING = fromString("TERMTING");

    /**
     * Creates or finds a SubnetStatusCode from its string representation.
     * @param name a name to look for
     * @return the corresponding SubnetStatusCode
     */
    @JsonCreator
    public static SubnetStatusCode fromString(String name) {
        return fromString(name, SubnetStatusCode.class);
    }

    /**
     * @return known SubnetStatusCode values
     */
    public static Collection<SubnetStatusCode> values() {
        return values(SubnetStatusCode.class);
    }
}
