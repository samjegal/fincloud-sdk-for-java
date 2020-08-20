/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WidgetMetricInfoStatistic.
 */
public final class WidgetMetricInfoStatistic extends ExpandableStringEnum<WidgetMetricInfoStatistic> {
    /** Static value COUNT for WidgetMetricInfoStatistic. */
    public static final WidgetMetricInfoStatistic COUNT = fromString("COUNT");

    /** Static value SUM for WidgetMetricInfoStatistic. */
    public static final WidgetMetricInfoStatistic SUM = fromString("SUM");

    /** Static value MAX for WidgetMetricInfoStatistic. */
    public static final WidgetMetricInfoStatistic MAX = fromString("MAX");

    /** Static value MIN for WidgetMetricInfoStatistic. */
    public static final WidgetMetricInfoStatistic MIN = fromString("MIN");

    /** Static value AVG for WidgetMetricInfoStatistic. */
    public static final WidgetMetricInfoStatistic AVG = fromString("AVG");

    /** Static value COUNTER for WidgetMetricInfoStatistic. */
    public static final WidgetMetricInfoStatistic COUNTER = fromString("COUNTER");

    /**
     * Creates or finds a WidgetMetricInfoStatistic from its string representation.
     * @param name a name to look for
     * @return the corresponding WidgetMetricInfoStatistic
     */
    @JsonCreator
    public static WidgetMetricInfoStatistic fromString(String name) {
        return fromString(name, WidgetMetricInfoStatistic.class);
    }

    /**
     * @return known WidgetMetricInfoStatistic values
     */
    public static Collection<WidgetMetricInfoStatistic> values() {
        return values(WidgetMetricInfoStatistic.class);
    }
}
