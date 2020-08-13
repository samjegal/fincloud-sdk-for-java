/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for BlockStorageInstanceStatusCode.
 */
public final class BlockStorageInstanceStatusCode extends ExpandableStringEnum<BlockStorageInstanceStatusCode> {
    /** Static value INIT for BlockStorageInstanceStatusCode. */
    public static final BlockStorageInstanceStatusCode INIT = fromString("INIT");

    /** Static value CREATE for BlockStorageInstanceStatusCode. */
    public static final BlockStorageInstanceStatusCode CREATE = fromString("CREATE");

    /** Static value ATTAC for BlockStorageInstanceStatusCode. */
    public static final BlockStorageInstanceStatusCode ATTAC = fromString("ATTAC");

    /**
     * Creates or finds a BlockStorageInstanceStatusCode from its string representation.
     * @param name a name to look for
     * @return the corresponding BlockStorageInstanceStatusCode
     */
    @JsonCreator
    public static BlockStorageInstanceStatusCode fromString(String name) {
        return fromString(name, BlockStorageInstanceStatusCode.class);
    }

    /**
     * @return known BlockStorageInstanceStatusCode values
     */
    public static Collection<BlockStorageInstanceStatusCode> values() {
        return values(BlockStorageInstanceStatusCode.class);
    }
}
