/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ChartDataWidgetInfoPeriod.
 */
public final class ChartDataWidgetInfoPeriod extends ExpandableStringEnum<ChartDataWidgetInfoPeriod> {
    /** Static value Min1 for ChartDataWidgetInfoPeriod. */
    public static final ChartDataWidgetInfoPeriod MIN1 = fromString("Min1");

    /** Static value Min5 for ChartDataWidgetInfoPeriod. */
    public static final ChartDataWidgetInfoPeriod MIN5 = fromString("Min5");

    /** Static value Min30 for ChartDataWidgetInfoPeriod. */
    public static final ChartDataWidgetInfoPeriod MIN30 = fromString("Min30");

    /** Static value Hour2 for ChartDataWidgetInfoPeriod. */
    public static final ChartDataWidgetInfoPeriod HOUR2 = fromString("Hour2");

    /** Static value Day1 for ChartDataWidgetInfoPeriod. */
    public static final ChartDataWidgetInfoPeriod DAY1 = fromString("Day1");

    /**
     * Creates or finds a ChartDataWidgetInfoPeriod from its string representation.
     * @param name a name to look for
     * @return the corresponding ChartDataWidgetInfoPeriod
     */
    @JsonCreator
    public static ChartDataWidgetInfoPeriod fromString(String name) {
        return fromString(name, ChartDataWidgetInfoPeriod.class);
    }

    /**
     * @return known ChartDataWidgetInfoPeriod values
     */
    public static Collection<ChartDataWidgetInfoPeriod> values() {
        return values(ChartDataWidgetInfoPeriod.class);
    }
}
