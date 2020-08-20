/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ChartDataWidgetInfoOption.
 */
public final class ChartDataWidgetInfoOption extends ExpandableStringEnum<ChartDataWidgetInfoOption> {
    /** Static value COUNT for ChartDataWidgetInfoOption. */
    public static final ChartDataWidgetInfoOption COUNT = fromString("COUNT");

    /** Static value SUM for ChartDataWidgetInfoOption. */
    public static final ChartDataWidgetInfoOption SUM = fromString("SUM");

    /** Static value MAX for ChartDataWidgetInfoOption. */
    public static final ChartDataWidgetInfoOption MAX = fromString("MAX");

    /** Static value MIN for ChartDataWidgetInfoOption. */
    public static final ChartDataWidgetInfoOption MIN = fromString("MIN");

    /** Static value AVG for ChartDataWidgetInfoOption. */
    public static final ChartDataWidgetInfoOption AVG = fromString("AVG");

    /** Static value COUNTER for ChartDataWidgetInfoOption. */
    public static final ChartDataWidgetInfoOption COUNTER = fromString("COUNTER");

    /**
     * Creates or finds a ChartDataWidgetInfoOption from its string representation.
     * @param name a name to look for
     * @return the corresponding ChartDataWidgetInfoOption
     */
    @JsonCreator
    public static ChartDataWidgetInfoOption fromString(String name) {
        return fromString(name, ChartDataWidgetInfoOption.class);
    }

    /**
     * @return known ChartDataWidgetInfoOption values
     */
    public static Collection<ChartDataWidgetInfoOption> values() {
        return values(ChartDataWidgetInfoOption.class);
    }
}
