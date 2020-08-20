/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RuleGroupVersion.
 */
public final class RuleGroupVersion extends ExpandableStringEnum<RuleGroupVersion> {
    /** Static value V1 for RuleGroupVersion. */
    public static final RuleGroupVersion V1 = fromString("V1");

    /** Static value V2 for RuleGroupVersion. */
    public static final RuleGroupVersion V2 = fromString("V2");

    /**
     * Creates or finds a RuleGroupVersion from its string representation.
     * @param name a name to look for
     * @return the corresponding RuleGroupVersion
     */
    @JsonCreator
    public static RuleGroupVersion fromString(String name) {
        return fromString(name, RuleGroupVersion.class);
    }

    /**
     * @return known RuleGroupVersion values
     */
    public static Collection<RuleGroupVersion> values() {
        return values(RuleGroupVersion.class);
    }
}
