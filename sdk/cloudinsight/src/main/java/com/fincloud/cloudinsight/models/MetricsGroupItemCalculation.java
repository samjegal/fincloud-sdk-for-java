/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MetricsGroupItemCalculation.
 */
public final class MetricsGroupItemCalculation extends ExpandableStringEnum<MetricsGroupItemCalculation> {
    /** Static value COUNT for MetricsGroupItemCalculation. */
    public static final MetricsGroupItemCalculation COUNT = fromString("COUNT");

    /** Static value SUM for MetricsGroupItemCalculation. */
    public static final MetricsGroupItemCalculation SUM = fromString("SUM");

    /** Static value MAX for MetricsGroupItemCalculation. */
    public static final MetricsGroupItemCalculation MAX = fromString("MAX");

    /** Static value MIN for MetricsGroupItemCalculation. */
    public static final MetricsGroupItemCalculation MIN = fromString("MIN");

    /** Static value AVG for MetricsGroupItemCalculation. */
    public static final MetricsGroupItemCalculation AVG = fromString("AVG");

    /** Static value COUNTER for MetricsGroupItemCalculation. */
    public static final MetricsGroupItemCalculation COUNTER = fromString("COUNTER");

    /**
     * Creates or finds a MetricsGroupItemCalculation from its string representation.
     * @param name a name to look for
     * @return the corresponding MetricsGroupItemCalculation
     */
    @JsonCreator
    public static MetricsGroupItemCalculation fromString(String name) {
        return fromString(name, MetricsGroupItemCalculation.class);
    }

    /**
     * @return known MetricsGroupItemCalculation values
     */
    public static Collection<MetricsGroupItemCalculation> values() {
        return values(MetricsGroupItemCalculation.class);
    }
}
