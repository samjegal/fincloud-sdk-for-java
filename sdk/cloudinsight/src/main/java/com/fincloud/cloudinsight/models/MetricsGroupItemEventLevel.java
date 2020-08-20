/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MetricsGroupItemEventLevel.
 */
public final class MetricsGroupItemEventLevel extends ExpandableStringEnum<MetricsGroupItemEventLevel> {
    /** Static value INFO for MetricsGroupItemEventLevel. */
    public static final MetricsGroupItemEventLevel INFO = fromString("INFO");

    /** Static value WARNING for MetricsGroupItemEventLevel. */
    public static final MetricsGroupItemEventLevel WARNING = fromString("WARNING");

    /** Static value CRITICAL for MetricsGroupItemEventLevel. */
    public static final MetricsGroupItemEventLevel CRITICAL = fromString("CRITICAL");

    /**
     * Creates or finds a MetricsGroupItemEventLevel from its string representation.
     * @param name a name to look for
     * @return the corresponding MetricsGroupItemEventLevel
     */
    @JsonCreator
    public static MetricsGroupItemEventLevel fromString(String name) {
        return fromString(name, MetricsGroupItemEventLevel.class);
    }

    /**
     * @return known MetricsGroupItemEventLevel values
     */
    public static Collection<MetricsGroupItemEventLevel> values() {
        return values(MetricsGroupItemEventLevel.class);
    }
}
