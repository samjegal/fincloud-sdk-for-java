/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MetricsGroupItemCondition.
 */
public final class MetricsGroupItemCondition extends ExpandableStringEnum<MetricsGroupItemCondition> {
    /** Static value LT for MetricsGroupItemCondition. */
    public static final MetricsGroupItemCondition LT = fromString("LT");

    /** Static value LE for MetricsGroupItemCondition. */
    public static final MetricsGroupItemCondition LE = fromString("LE");

    /** Static value EQ for MetricsGroupItemCondition. */
    public static final MetricsGroupItemCondition EQ = fromString("EQ");

    /** Static value GE for MetricsGroupItemCondition. */
    public static final MetricsGroupItemCondition GE = fromString("GE");

    /** Static value GT for MetricsGroupItemCondition. */
    public static final MetricsGroupItemCondition GT = fromString("GT");

    /** Static value NE for MetricsGroupItemCondition. */
    public static final MetricsGroupItemCondition NE = fromString("NE");

    /** Static value EXP for MetricsGroupItemCondition. */
    public static final MetricsGroupItemCondition EXP = fromString("EXP");

    /**
     * Creates or finds a MetricsGroupItemCondition from its string representation.
     * @param name a name to look for
     * @return the corresponding MetricsGroupItemCondition
     */
    @JsonCreator
    public static MetricsGroupItemCondition fromString(String name) {
        return fromString(name, MetricsGroupItemCondition.class);
    }

    /**
     * @return known MetricsGroupItemCondition values
     */
    public static Collection<MetricsGroupItemCondition> values() {
        return values(MetricsGroupItemCondition.class);
    }
}
