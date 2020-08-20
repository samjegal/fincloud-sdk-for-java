/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SchemaFieldDimensionType.
 */
public final class SchemaFieldDimensionType extends ExpandableStringEnum<SchemaFieldDimensionType> {
    /** Static value DEFAULT for SchemaFieldDimensionType. */
    public static final SchemaFieldDimensionType DEFAULT = fromString("DEFAULT");

    /** Static value CUSTOM for SchemaFieldDimensionType. */
    public static final SchemaFieldDimensionType CUSTOM = fromString("CUSTOM");

    /**
     * Creates or finds a SchemaFieldDimensionType from its string representation.
     * @param name a name to look for
     * @return the corresponding SchemaFieldDimensionType
     */
    @JsonCreator
    public static SchemaFieldDimensionType fromString(String name) {
        return fromString(name, SchemaFieldDimensionType.class);
    }

    /**
     * @return known SchemaFieldDimensionType values
     */
    public static Collection<SchemaFieldDimensionType> values() {
        return values(SchemaFieldDimensionType.class);
    }
}
