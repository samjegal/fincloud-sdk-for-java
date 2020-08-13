/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for NetworkAclStatusCode.
 */
public final class NetworkAclStatusCode extends ExpandableStringEnum<NetworkAclStatusCode> {
    /** Static value INIT for NetworkAclStatusCode. */
    public static final NetworkAclStatusCode INIT = fromString("INIT");

    /** Static value SET for NetworkAclStatusCode. */
    public static final NetworkAclStatusCode SET = fromString("SET");

    /** Static value RUN for NetworkAclStatusCode. */
    public static final NetworkAclStatusCode RUN = fromString("RUN");

    /** Static value TERMTING for NetworkAclStatusCode. */
    public static final NetworkAclStatusCode TERMTING = fromString("TERMTING");

    /**
     * Creates or finds a NetworkAclStatusCode from its string representation.
     * @param name a name to look for
     * @return the corresponding NetworkAclStatusCode
     */
    @JsonCreator
    public static NetworkAclStatusCode fromString(String name) {
        return fromString(name, NetworkAclStatusCode.class);
    }

    /**
     * @return known NetworkAclStatusCode values
     */
    public static Collection<NetworkAclStatusCode> values() {
        return values(NetworkAclStatusCode.class);
    }
}
