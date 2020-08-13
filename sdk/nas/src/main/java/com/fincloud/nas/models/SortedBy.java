/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.nas.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SortedBy.
 */
public final class SortedBy extends ExpandableStringEnum<SortedBy> {
    /** Static value nasVolumeInstanceNo for SortedBy. */
    public static final SortedBy NAS_VOLUME_INSTANCE_NO = fromString("nasVolumeInstanceNo");

    /** Static value volumeName for SortedBy. */
    public static final SortedBy VOLUME_NAME = fromString("volumeName");

    /** Static value volumeTotalSize for SortedBy. */
    public static final SortedBy VOLUME_TOTAL_SIZE = fromString("volumeTotalSize");

    /**
     * Creates or finds a SortedBy from its string representation.
     * @param name a name to look for
     * @return the corresponding SortedBy
     */
    @JsonCreator
    public static SortedBy fromString(String name) {
        return fromString(name, SortedBy.class);
    }

    /**
     * @return known SortedBy values
     */
    public static Collection<SortedBy> values() {
        return values(SortedBy.class);
    }
}
