/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AggregationType.
 */
public final class AggregationType extends ExpandableStringEnum<AggregationType> {
    /** Static value MIN for AggregationType. */
    public static final AggregationType MIN = fromString("MIN");

    /** Static value MAX for AggregationType. */
    public static final AggregationType MAX = fromString("MAX");

    /** Static value SUM for AggregationType. */
    public static final AggregationType SUM = fromString("SUM");

    /** Static value COUNT for AggregationType. */
    public static final AggregationType COUNT = fromString("COUNT");

    /** Static value AVG for AggregationType. */
    public static final AggregationType AVG = fromString("AVG");

    /**
     * Creates or finds a AggregationType from its string representation.
     * @param name a name to look for
     * @return the corresponding AggregationType
     */
    @JsonCreator
    public static AggregationType fromString(String name) {
        return fromString(name, AggregationType.class);
    }

    /**
     * @return known AggregationType values
     */
    public static Collection<AggregationType> values() {
        return values(AggregationType.class);
    }
}
