/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for BlockStorageDiskTypeCode.
 */
public final class BlockStorageDiskTypeCode extends ExpandableStringEnum<BlockStorageDiskTypeCode> {
    /** Static value NET for BlockStorageDiskTypeCode. */
    public static final BlockStorageDiskTypeCode NET = fromString("NET");

    /**
     * Creates or finds a BlockStorageDiskTypeCode from its string representation.
     * @param name a name to look for
     * @return the corresponding BlockStorageDiskTypeCode
     */
    @JsonCreator
    public static BlockStorageDiskTypeCode fromString(String name) {
        return fromString(name, BlockStorageDiskTypeCode.class);
    }

    /**
     * @return known BlockStorageDiskTypeCode values
     */
    public static Collection<BlockStorageDiskTypeCode> values() {
        return values(BlockStorageDiskTypeCode.class);
    }
}
