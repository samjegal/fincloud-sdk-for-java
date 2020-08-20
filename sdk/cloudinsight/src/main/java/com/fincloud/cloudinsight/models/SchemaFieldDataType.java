/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SchemaFieldDataType.
 */
public final class SchemaFieldDataType extends ExpandableStringEnum<SchemaFieldDataType> {
    /** Static value STRING for SchemaFieldDataType. */
    public static final SchemaFieldDataType STRING = fromString("STRING");

    /** Static value INTEGER for SchemaFieldDataType. */
    public static final SchemaFieldDataType INTEGER = fromString("INTEGER");

    /** Static value FLOAT for SchemaFieldDataType. */
    public static final SchemaFieldDataType FLOAT = fromString("FLOAT");

    /** Static value LONG for SchemaFieldDataType. */
    public static final SchemaFieldDataType LONG = fromString("LONG");

    /** Static value TIMESTAMP for SchemaFieldDataType. */
    public static final SchemaFieldDataType TIMESTAMP = fromString("TIMESTAMP");

    /** Static value ARRAY for SchemaFieldDataType. */
    public static final SchemaFieldDataType ARRAY = fromString("ARRAY");

    /**
     * Creates or finds a SchemaFieldDataType from its string representation.
     * @param name a name to look for
     * @return the corresponding SchemaFieldDataType
     */
    @JsonCreator
    public static SchemaFieldDataType fromString(String name) {
        return fromString(name, SchemaFieldDataType.class);
    }

    /**
     * @return known SchemaFieldDataType values
     */
    public static Collection<SchemaFieldDataType> values() {
        return values(SchemaFieldDataType.class);
    }
}
