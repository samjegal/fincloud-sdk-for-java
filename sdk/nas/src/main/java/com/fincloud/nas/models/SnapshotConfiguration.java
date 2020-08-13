/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.nas.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SnapshotConfiguration.
 */
public final class SnapshotConfiguration extends ExpandableStringEnum<SnapshotConfiguration> {
    /** Static value true for SnapshotConfiguration. */
    public static final SnapshotConfiguration TRUE = fromString("true");

    /** Static value false for SnapshotConfiguration. */
    public static final SnapshotConfiguration FALSE = fromString("false");

    /**
     * Creates or finds a SnapshotConfiguration from its string representation.
     * @param name a name to look for
     * @return the corresponding SnapshotConfiguration
     */
    @JsonCreator
    public static SnapshotConfiguration fromString(String name) {
        return fromString(name, SnapshotConfiguration.class);
    }

    /**
     * @return known SnapshotConfiguration values
     */
    public static Collection<SnapshotConfiguration> values() {
        return values(SnapshotConfiguration.class);
    }
}
