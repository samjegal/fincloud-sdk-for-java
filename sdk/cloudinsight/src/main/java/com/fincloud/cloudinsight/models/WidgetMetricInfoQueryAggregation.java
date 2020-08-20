/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WidgetMetricInfoQueryAggregation.
 */
public final class WidgetMetricInfoQueryAggregation extends ExpandableStringEnum<WidgetMetricInfoQueryAggregation> {
    /** Static value AVG for WidgetMetricInfoQueryAggregation. */
    public static final WidgetMetricInfoQueryAggregation AVG = fromString("AVG");

    /** Static value COUNT for WidgetMetricInfoQueryAggregation. */
    public static final WidgetMetricInfoQueryAggregation COUNT = fromString("COUNT");

    /** Static value FIRST for WidgetMetricInfoQueryAggregation. */
    public static final WidgetMetricInfoQueryAggregation FIRST = fromString("FIRST");

    /** Static value LAST for WidgetMetricInfoQueryAggregation. */
    public static final WidgetMetricInfoQueryAggregation LAST = fromString("LAST");

    /** Static value MAX for WidgetMetricInfoQueryAggregation. */
    public static final WidgetMetricInfoQueryAggregation MAX = fromString("MAX");

    /** Static value MIMMAX for WidgetMetricInfoQueryAggregation. */
    public static final WidgetMetricInfoQueryAggregation MIMMAX = fromString("MIMMAX");

    /** Static value MIMMIN for WidgetMetricInfoQueryAggregation. */
    public static final WidgetMetricInfoQueryAggregation MIMMIN = fromString("MIMMIN");

    /** Static value MIN for WidgetMetricInfoQueryAggregation. */
    public static final WidgetMetricInfoQueryAggregation MIN = fromString("MIN");

    /** Static value MULT for WidgetMetricInfoQueryAggregation. */
    public static final WidgetMetricInfoQueryAggregation MULT = fromString("MULT");

    /** Static value NONE for WidgetMetricInfoQueryAggregation. */
    public static final WidgetMetricInfoQueryAggregation NONE = fromString("NONE");

    /** Static value SUM for WidgetMetricInfoQueryAggregation. */
    public static final WidgetMetricInfoQueryAggregation SUM = fromString("SUM");

    /** Static value ZIMSUM for WidgetMetricInfoQueryAggregation. */
    public static final WidgetMetricInfoQueryAggregation ZIMSUM = fromString("ZIMSUM");

    /**
     * Creates or finds a WidgetMetricInfoQueryAggregation from its string representation.
     * @param name a name to look for
     * @return the corresponding WidgetMetricInfoQueryAggregation
     */
    @JsonCreator
    public static WidgetMetricInfoQueryAggregation fromString(String name) {
        return fromString(name, WidgetMetricInfoQueryAggregation.class);
    }

    /**
     * @return known WidgetMetricInfoQueryAggregation values
     */
    public static Collection<WidgetMetricInfoQueryAggregation> values() {
        return values(WidgetMetricInfoQueryAggregation.class);
    }
}
