/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.registry.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RepositoryStatus.
 */
public final class RepositoryStatus extends ExpandableStringEnum<RepositoryStatus> {
    /** Static value running for RepositoryStatus. */
    public static final RepositoryStatus RUNNING = fromString("running");

    /** Static value disconnected for RepositoryStatus. */
    public static final RepositoryStatus DISCONNECTED = fromString("disconnected");

    /**
     * Creates or finds a RepositoryStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding RepositoryStatus
     */
    @JsonCreator
    public static RepositoryStatus fromString(String name) {
        return fromString(name, RepositoryStatus.class);
    }

    /**
     * @return known RepositoryStatus values
     */
    public static Collection<RepositoryStatus> values() {
        return values(RepositoryStatus.class);
    }
}
