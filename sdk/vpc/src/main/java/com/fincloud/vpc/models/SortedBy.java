/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SortedBy.
 */
public final class SortedBy extends ExpandableStringEnum<SortedBy> {
    /** Static value vpcPeeringName for SortedBy. */
    public static final SortedBy VPC_PEERING_NAME = fromString("vpcPeeringName");

    /** Static value sourceVpcName for SortedBy. */
    public static final SortedBy SOURCE_VPC_NAME = fromString("sourceVpcName");

    /** Static value targetVpcName for SortedBy. */
    public static final SortedBy TARGET_VPC_NAME = fromString("targetVpcName");

    /**
     * Creates or finds a SortedBy from its string representation.
     * @param name a name to look for
     * @return the corresponding SortedBy
     */
    @JsonCreator
    public static SortedBy fromString(String name) {
        return fromString(name, SortedBy.class);
    }

    /**
     * @return known SortedBy values
     */
    public static Collection<SortedBy> values() {
        return values(SortedBy.class);
    }
}
