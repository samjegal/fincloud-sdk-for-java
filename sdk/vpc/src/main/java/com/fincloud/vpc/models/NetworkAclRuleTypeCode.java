/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for NetworkAclRuleTypeCode.
 */
public final class NetworkAclRuleTypeCode extends ExpandableStringEnum<NetworkAclRuleTypeCode> {
    /** Static value INBND for NetworkAclRuleTypeCode. */
    public static final NetworkAclRuleTypeCode INBND = fromString("INBND");

    /** Static value OTBND for NetworkAclRuleTypeCode. */
    public static final NetworkAclRuleTypeCode OTBND = fromString("OTBND");

    /**
     * Creates or finds a NetworkAclRuleTypeCode from its string representation.
     * @param name a name to look for
     * @return the corresponding NetworkAclRuleTypeCode
     */
    @JsonCreator
    public static NetworkAclRuleTypeCode fromString(String name) {
        return fromString(name, NetworkAclRuleTypeCode.class);
    }

    /**
     * @return known NetworkAclRuleTypeCode values
     */
    public static Collection<NetworkAclRuleTypeCode> values() {
        return values(NetworkAclRuleTypeCode.class);
    }
}
