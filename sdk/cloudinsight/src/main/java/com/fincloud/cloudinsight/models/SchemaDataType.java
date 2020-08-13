/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SchemaDataType.
 */
public final class SchemaDataType extends ExpandableStringEnum<SchemaDataType> {
    /** Static value STRING for SchemaDataType. */
    public static final SchemaDataType STRING = fromString("STRING");

    /** Static value INTEGER for SchemaDataType. */
    public static final SchemaDataType INTEGER = fromString("INTEGER");

    /** Static value LONG for SchemaDataType. */
    public static final SchemaDataType LONG = fromString("LONG");

    /** Static value FLOAT for SchemaDataType. */
    public static final SchemaDataType FLOAT = fromString("FLOAT");

    /**
     * Creates or finds a SchemaDataType from its string representation.
     * @param name a name to look for
     * @return the corresponding SchemaDataType
     */
    @JsonCreator
    public static SchemaDataType fromString(String name) {
        return fromString(name, SchemaDataType.class);
    }

    /**
     * @return known SchemaDataType values
     */
    public static Collection<SchemaDataType> values() {
        return values(SchemaDataType.class);
    }
}
