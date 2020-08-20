/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WidgetMetricInfoPeriod.
 */
public final class WidgetMetricInfoPeriod extends ExpandableStringEnum<WidgetMetricInfoPeriod> {
    /** Static value Min1 for WidgetMetricInfoPeriod. */
    public static final WidgetMetricInfoPeriod MIN1 = fromString("Min1");

    /** Static value Min5 for WidgetMetricInfoPeriod. */
    public static final WidgetMetricInfoPeriod MIN5 = fromString("Min5");

    /** Static value Min30 for WidgetMetricInfoPeriod. */
    public static final WidgetMetricInfoPeriod MIN30 = fromString("Min30");

    /** Static value Hour2 for WidgetMetricInfoPeriod. */
    public static final WidgetMetricInfoPeriod HOUR2 = fromString("Hour2");

    /** Static value Day1 for WidgetMetricInfoPeriod. */
    public static final WidgetMetricInfoPeriod DAY1 = fromString("Day1");

    /**
     * Creates or finds a WidgetMetricInfoPeriod from its string representation.
     * @param name a name to look for
     * @return the corresponding WidgetMetricInfoPeriod
     */
    @JsonCreator
    public static WidgetMetricInfoPeriod fromString(String name) {
        return fromString(name, WidgetMetricInfoPeriod.class);
    }

    /**
     * @return known WidgetMetricInfoPeriod values
     */
    public static Collection<WidgetMetricInfoPeriod> values() {
        return values(WidgetMetricInfoPeriod.class);
    }
}
