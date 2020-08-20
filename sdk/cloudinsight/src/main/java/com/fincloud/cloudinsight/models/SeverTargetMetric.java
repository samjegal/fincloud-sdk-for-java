/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SeverTargetMetric.
 */
public final class SeverTargetMetric extends ExpandableStringEnum<SeverTargetMetric> {
    /** Static value avg_cpu_used_rto for SeverTargetMetric. */
    public static final SeverTargetMetric AVG_CPU_USED_RTO = fromString("avg_cpu_used_rto");

    /** Static value mem_usert for SeverTargetMetric. */
    public static final SeverTargetMetric MEM_USERT = fromString("mem_usert");

    /** Static value avg_fs_usert for SeverTargetMetric. */
    public static final SeverTargetMetric AVG_FS_USERT = fromString("avg_fs_usert");

    /**
     * Creates or finds a SeverTargetMetric from its string representation.
     * @param name a name to look for
     * @return the corresponding SeverTargetMetric
     */
    @JsonCreator
    public static SeverTargetMetric fromString(String name) {
        return fromString(name, SeverTargetMetric.class);
    }

    /**
     * @return known SeverTargetMetric values
     */
    public static Collection<SeverTargetMetric> values() {
        return values(SeverTargetMetric.class);
    }
}
