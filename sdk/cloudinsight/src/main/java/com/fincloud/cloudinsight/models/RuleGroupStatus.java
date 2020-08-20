/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RuleGroupStatus.
 */
public final class RuleGroupStatus extends ExpandableStringEnum<RuleGroupStatus> {
    /** Static value OK for RuleGroupStatus. */
    public static final RuleGroupStatus OK = fromString("OK");

    /** Static value VIOLATED for RuleGroupStatus. */
    public static final RuleGroupStatus VIOLATED = fromString("VIOLATED");

    /** Static value INSUFFICIENT for RuleGroupStatus. */
    public static final RuleGroupStatus INSUFFICIENT = fromString("INSUFFICIENT");

    /**
     * Creates or finds a RuleGroupStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding RuleGroupStatus
     */
    @JsonCreator
    public static RuleGroupStatus fromString(String name) {
        return fromString(name, RuleGroupStatus.class);
    }

    /**
     * @return known RuleGroupStatus values
     */
    public static Collection<RuleGroupStatus> values() {
        return values(RuleGroupStatus.class);
    }
}
