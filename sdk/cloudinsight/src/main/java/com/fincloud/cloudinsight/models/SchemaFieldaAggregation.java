/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SchemaFieldaAggregation.
 */
public final class SchemaFieldaAggregation extends ExpandableStringEnum<SchemaFieldaAggregation> {
    /** Static value COUNT for SchemaFieldaAggregation. */
    public static final SchemaFieldaAggregation COUNT = fromString("COUNT");

    /** Static value SUM for SchemaFieldaAggregation. */
    public static final SchemaFieldaAggregation SUM = fromString("SUM");

    /** Static value MAX for SchemaFieldaAggregation. */
    public static final SchemaFieldaAggregation MAX = fromString("MAX");

    /** Static value MIN for SchemaFieldaAggregation. */
    public static final SchemaFieldaAggregation MIN = fromString("MIN");

    /** Static value AVG for SchemaFieldaAggregation. */
    public static final SchemaFieldaAggregation AVG = fromString("AVG");

    /** Static value COUNTER for SchemaFieldaAggregation. */
    public static final SchemaFieldaAggregation COUNTER = fromString("COUNTER");

    /**
     * Creates or finds a SchemaFieldaAggregation from its string representation.
     * @param name a name to look for
     * @return the corresponding SchemaFieldaAggregation
     */
    @JsonCreator
    public static SchemaFieldaAggregation fromString(String name) {
        return fromString(name, SchemaFieldaAggregation.class);
    }

    /**
     * @return known SchemaFieldaAggregation values
     */
    public static Collection<SchemaFieldaAggregation> values() {
        return values(SchemaFieldaAggregation.class);
    }
}
