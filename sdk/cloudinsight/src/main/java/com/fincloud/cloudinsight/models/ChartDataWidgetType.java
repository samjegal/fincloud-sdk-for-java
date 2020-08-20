/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ChartDataWidgetType.
 */
public final class ChartDataWidgetType extends ExpandableStringEnum<ChartDataWidgetType> {
    /** Static value line for ChartDataWidgetType. */
    public static final ChartDataWidgetType LINE = fromString("line");

    /** Static value area for ChartDataWidgetType. */
    public static final ChartDataWidgetType AREA = fromString("area");

    /** Static value index for ChartDataWidgetType. */
    public static final ChartDataWidgetType INDEX = fromString("index");

    /** Static value text for ChartDataWidgetType. */
    public static final ChartDataWidgetType TEXT = fromString("text");

    /** Static value table for ChartDataWidgetType. */
    public static final ChartDataWidgetType TABLE = fromString("table");

    /**
     * Creates or finds a ChartDataWidgetType from its string representation.
     * @param name a name to look for
     * @return the corresponding ChartDataWidgetType
     */
    @JsonCreator
    public static ChartDataWidgetType fromString(String name) {
        return fromString(name, ChartDataWidgetType.class);
    }

    /**
     * @return known ChartDataWidgetType values
     */
    public static Collection<ChartDataWidgetType> values() {
        return values(ChartDataWidgetType.class);
    }
}
