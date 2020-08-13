/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AccessControlGroupStatusCode.
 */
public final class AccessControlGroupStatusCode extends ExpandableStringEnum<AccessControlGroupStatusCode> {
    /** Static value INIT for AccessControlGroupStatusCode. */
    public static final AccessControlGroupStatusCode INIT = fromString("INIT");

    /** Static value SET for AccessControlGroupStatusCode. */
    public static final AccessControlGroupStatusCode SET = fromString("SET");

    /** Static value RUN for AccessControlGroupStatusCode. */
    public static final AccessControlGroupStatusCode RUN = fromString("RUN");

    /** Static value TERMTING for AccessControlGroupStatusCode. */
    public static final AccessControlGroupStatusCode TERMTING = fromString("TERMTING");

    /**
     * Creates or finds a AccessControlGroupStatusCode from its string representation.
     * @param name a name to look for
     * @return the corresponding AccessControlGroupStatusCode
     */
    @JsonCreator
    public static AccessControlGroupStatusCode fromString(String name) {
        return fromString(name, AccessControlGroupStatusCode.class);
    }

    /**
     * @return known AccessControlGroupStatusCode values
     */
    public static Collection<AccessControlGroupStatusCode> values() {
        return values(AccessControlGroupStatusCode.class);
    }
}
