/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AccessControlGroupRuleTypeCode.
 */
public final class AccessControlGroupRuleTypeCode extends ExpandableStringEnum<AccessControlGroupRuleTypeCode> {
    /** Static value INBND for AccessControlGroupRuleTypeCode. */
    public static final AccessControlGroupRuleTypeCode INBND = fromString("INBND");

    /** Static value OTBND for AccessControlGroupRuleTypeCode. */
    public static final AccessControlGroupRuleTypeCode OTBND = fromString("OTBND");

    /**
     * Creates or finds a AccessControlGroupRuleTypeCode from its string representation.
     * @param name a name to look for
     * @return the corresponding AccessControlGroupRuleTypeCode
     */
    @JsonCreator
    public static AccessControlGroupRuleTypeCode fromString(String name) {
        return fromString(name, AccessControlGroupRuleTypeCode.class);
    }

    /**
     * @return known AccessControlGroupRuleTypeCode values
     */
    public static Collection<AccessControlGroupRuleTypeCode> values() {
        return values(AccessControlGroupRuleTypeCode.class);
    }
}
