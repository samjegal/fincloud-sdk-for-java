/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ChartDataWidgetInfoStatistic.
 */
public final class ChartDataWidgetInfoStatistic extends ExpandableStringEnum<ChartDataWidgetInfoStatistic> {
    /** Static value COUNT for ChartDataWidgetInfoStatistic. */
    public static final ChartDataWidgetInfoStatistic COUNT = fromString("COUNT");

    /** Static value SUM for ChartDataWidgetInfoStatistic. */
    public static final ChartDataWidgetInfoStatistic SUM = fromString("SUM");

    /** Static value MAX for ChartDataWidgetInfoStatistic. */
    public static final ChartDataWidgetInfoStatistic MAX = fromString("MAX");

    /** Static value MIN for ChartDataWidgetInfoStatistic. */
    public static final ChartDataWidgetInfoStatistic MIN = fromString("MIN");

    /** Static value AVG for ChartDataWidgetInfoStatistic. */
    public static final ChartDataWidgetInfoStatistic AVG = fromString("AVG");

    /** Static value COUNTER for ChartDataWidgetInfoStatistic. */
    public static final ChartDataWidgetInfoStatistic COUNTER = fromString("COUNTER");

    /**
     * Creates or finds a ChartDataWidgetInfoStatistic from its string representation.
     * @param name a name to look for
     * @return the corresponding ChartDataWidgetInfoStatistic
     */
    @JsonCreator
    public static ChartDataWidgetInfoStatistic fromString(String name) {
        return fromString(name, ChartDataWidgetInfoStatistic.class);
    }

    /**
     * @return known ChartDataWidgetInfoStatistic values
     */
    public static Collection<ChartDataWidgetInfoStatistic> values() {
        return values(ChartDataWidgetInfoStatistic.class);
    }
}
