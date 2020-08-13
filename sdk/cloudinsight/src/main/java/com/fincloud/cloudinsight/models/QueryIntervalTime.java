/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for QueryIntervalTime.
 */
public final class QueryIntervalTime extends ExpandableStringEnum<QueryIntervalTime> {
    /** Static value MIN1 for QueryIntervalTime. */
    public static final QueryIntervalTime MIN1 = fromString("MIN1");

    /** Static value MIN5 for QueryIntervalTime. */
    public static final QueryIntervalTime MIN5 = fromString("MIN5");

    /** Static value MIN30 for QueryIntervalTime. */
    public static final QueryIntervalTime MIN30 = fromString("MIN30");

    /** Static value HOUR2 for QueryIntervalTime. */
    public static final QueryIntervalTime HOUR2 = fromString("HOUR2");

    /** Static value DAY1 for QueryIntervalTime. */
    public static final QueryIntervalTime DAY1 = fromString("DAY1");

    /**
     * Creates or finds a QueryIntervalTime from its string representation.
     * @param name a name to look for
     * @return the corresponding QueryIntervalTime
     */
    @JsonCreator
    public static QueryIntervalTime fromString(String name) {
        return fromString(name, QueryIntervalTime.class);
    }

    /**
     * @return known QueryIntervalTime values
     */
    public static Collection<QueryIntervalTime> values() {
        return values(QueryIntervalTime.class);
    }
}
