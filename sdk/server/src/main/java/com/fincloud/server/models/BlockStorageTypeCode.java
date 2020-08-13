/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for BlockStorageTypeCode.
 */
public final class BlockStorageTypeCode extends ExpandableStringEnum<BlockStorageTypeCode> {
    /** Static value BASIC for BlockStorageTypeCode. */
    public static final BlockStorageTypeCode BASIC = fromString("BASIC");

    /** Static value SVRBS for BlockStorageTypeCode. */
    public static final BlockStorageTypeCode SVRBS = fromString("SVRBS");

    /** Static value SNAP for BlockStorageTypeCode. */
    public static final BlockStorageTypeCode SNAP = fromString("SNAP");

    /** Static value NSI for BlockStorageTypeCode. */
    public static final BlockStorageTypeCode NSI = fromString("NSI");

    /**
     * Creates or finds a BlockStorageTypeCode from its string representation.
     * @param name a name to look for
     * @return the corresponding BlockStorageTypeCode
     */
    @JsonCreator
    public static BlockStorageTypeCode fromString(String name) {
        return fromString(name, BlockStorageTypeCode.class);
    }

    /**
     * @return known BlockStorageTypeCode values
     */
    public static Collection<BlockStorageTypeCode> values() {
        return values(BlockStorageTypeCode.class);
    }
}
