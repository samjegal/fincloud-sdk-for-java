/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for QueryAggregationType.
 */
public final class QueryAggregationType extends ExpandableStringEnum<QueryAggregationType> {
    /** Static value AVG for QueryAggregationType. */
    public static final QueryAggregationType AVG = fromString("AVG");

    /** Static value COUNT for QueryAggregationType. */
    public static final QueryAggregationType COUNT = fromString("COUNT");

    /** Static value MIN for QueryAggregationType. */
    public static final QueryAggregationType MIN = fromString("MIN");

    /** Static value MAX for QueryAggregationType. */
    public static final QueryAggregationType MAX = fromString("MAX");

    /** Static value NONE for QueryAggregationType. */
    public static final QueryAggregationType NONE = fromString("NONE");

    /** Static value SUM for QueryAggregationType. */
    public static final QueryAggregationType SUM = fromString("SUM");

    /** Static value FIRST for QueryAggregationType. */
    public static final QueryAggregationType FIRST = fromString("FIRST");

    /** Static value LAST for QueryAggregationType. */
    public static final QueryAggregationType LAST = fromString("LAST");

    /** Static value MULT for QueryAggregationType. */
    public static final QueryAggregationType MULT = fromString("MULT");

    /**
     * Creates or finds a QueryAggregationType from its string representation.
     * @param name a name to look for
     * @return the corresponding QueryAggregationType
     */
    @JsonCreator
    public static QueryAggregationType fromString(String name) {
        return fromString(name, QueryAggregationType.class);
    }

    /**
     * @return known QueryAggregationType values
     */
    public static Collection<QueryAggregationType> values() {
        return values(QueryAggregationType.class);
    }
}
