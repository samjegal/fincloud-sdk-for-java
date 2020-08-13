/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RuleActionCode.
 */
public final class RuleActionCode extends ExpandableStringEnum<RuleActionCode> {
    /** Static value ALLOW for RuleActionCode. */
    public static final RuleActionCode ALLOW = fromString("ALLOW");

    /** Static value DROP for RuleActionCode. */
    public static final RuleActionCode DROP = fromString("DROP");

    /**
     * Creates or finds a RuleActionCode from its string representation.
     * @param name a name to look for
     * @return the corresponding RuleActionCode
     */
    @JsonCreator
    public static RuleActionCode fromString(String name) {
        return fromString(name, RuleActionCode.class);
    }

    /**
     * @return known RuleActionCode values
     */
    public static Collection<RuleActionCode> values() {
        return values(RuleActionCode.class);
    }
}
