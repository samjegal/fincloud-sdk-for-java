/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RuleGroupProductDataStatus.
 */
public final class RuleGroupProductDataStatus extends ExpandableStringEnum<RuleGroupProductDataStatus> {
    /** Static value CREATED for RuleGroupProductDataStatus. */
    public static final RuleGroupProductDataStatus CREATED = fromString("CREATED");

    /** Static value UPDATED for RuleGroupProductDataStatus. */
    public static final RuleGroupProductDataStatus UPDATED = fromString("UPDATED");

    /** Static value DELETED for RuleGroupProductDataStatus. */
    public static final RuleGroupProductDataStatus DELETED = fromString("DELETED");

    /**
     * Creates or finds a RuleGroupProductDataStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding RuleGroupProductDataStatus
     */
    @JsonCreator
    public static RuleGroupProductDataStatus fromString(String name) {
        return fromString(name, RuleGroupProductDataStatus.class);
    }

    /**
     * @return known RuleGroupProductDataStatus values
     */
    public static Collection<RuleGroupProductDataStatus> values() {
        return values(RuleGroupProductDataStatus.class);
    }
}
