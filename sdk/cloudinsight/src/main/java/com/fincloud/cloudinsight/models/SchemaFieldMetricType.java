/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SchemaFieldMetricType.
 */
public final class SchemaFieldMetricType extends ExpandableStringEnum<SchemaFieldMetricType> {
    /** Static value BASIC for SchemaFieldMetricType. */
    public static final SchemaFieldMetricType BASIC = fromString("BASIC");

    /** Static value EXTENDED for SchemaFieldMetricType. */
    public static final SchemaFieldMetricType EXTENDED = fromString("EXTENDED");

    /** Static value CUSTOM for SchemaFieldMetricType. */
    public static final SchemaFieldMetricType CUSTOM = fromString("CUSTOM");

    /**
     * Creates or finds a SchemaFieldMetricType from its string representation.
     * @param name a name to look for
     * @return the corresponding SchemaFieldMetricType
     */
    @JsonCreator
    public static SchemaFieldMetricType fromString(String name) {
        return fromString(name, SchemaFieldMetricType.class);
    }

    /**
     * @return known SchemaFieldMetricType values
     */
    public static Collection<SchemaFieldMetricType> values() {
        return values(SchemaFieldMetricType.class);
    }
}
