/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for UsageTypeCode.
 */
public final class UsageTypeCode extends ExpandableStringEnum<UsageTypeCode> {
    /** Static value GEN for UsageTypeCode. */
    public static final UsageTypeCode GEN = fromString("GEN");

    /** Static value LOADB for UsageTypeCode. */
    public static final UsageTypeCode LOADB = fromString("LOADB");

    /** Static value BM for UsageTypeCode. */
    public static final UsageTypeCode BM = fromString("BM");

    /**
     * Creates or finds a UsageTypeCode from its string representation.
     * @param name a name to look for
     * @return the corresponding UsageTypeCode
     */
    @JsonCreator
    public static UsageTypeCode fromString(String name) {
        return fromString(name, UsageTypeCode.class);
    }

    /**
     * @return known UsageTypeCode values
     */
    public static Collection<UsageTypeCode> values() {
        return values(UsageTypeCode.class);
    }
}
