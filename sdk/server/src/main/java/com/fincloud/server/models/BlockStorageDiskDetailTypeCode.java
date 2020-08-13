/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for BlockStorageDiskDetailTypeCode.
 */
public final class BlockStorageDiskDetailTypeCode extends ExpandableStringEnum<BlockStorageDiskDetailTypeCode> {
    /** Static value HDD for BlockStorageDiskDetailTypeCode. */
    public static final BlockStorageDiskDetailTypeCode HDD = fromString("HDD");

    /** Static value SDD for BlockStorageDiskDetailTypeCode. */
    public static final BlockStorageDiskDetailTypeCode SDD = fromString("SDD");

    /**
     * Creates or finds a BlockStorageDiskDetailTypeCode from its string representation.
     * @param name a name to look for
     * @return the corresponding BlockStorageDiskDetailTypeCode
     */
    @JsonCreator
    public static BlockStorageDiskDetailTypeCode fromString(String name) {
        return fromString(name, BlockStorageDiskDetailTypeCode.class);
    }

    /**
     * @return known BlockStorageDiskDetailTypeCode values
     */
    public static Collection<BlockStorageDiskDetailTypeCode> values() {
        return values(BlockStorageDiskDetailTypeCode.class);
    }
}
