/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for BlockStorageSnapshotInstanceStatusCode.
 */
public final class BlockStorageSnapshotInstanceStatusCode extends ExpandableStringEnum<BlockStorageSnapshotInstanceStatusCode> {
    /** Static value INIT for BlockStorageSnapshotInstanceStatusCode. */
    public static final BlockStorageSnapshotInstanceStatusCode INIT = fromString("INIT");

    /** Static value CREAT for BlockStorageSnapshotInstanceStatusCode. */
    public static final BlockStorageSnapshotInstanceStatusCode CREAT = fromString("CREAT");

    /** Static value ATTAC for BlockStorageSnapshotInstanceStatusCode. */
    public static final BlockStorageSnapshotInstanceStatusCode ATTAC = fromString("ATTAC");

    /**
     * Creates or finds a BlockStorageSnapshotInstanceStatusCode from its string representation.
     * @param name a name to look for
     * @return the corresponding BlockStorageSnapshotInstanceStatusCode
     */
    @JsonCreator
    public static BlockStorageSnapshotInstanceStatusCode fromString(String name) {
        return fromString(name, BlockStorageSnapshotInstanceStatusCode.class);
    }

    /**
     * @return known BlockStorageSnapshotInstanceStatusCode values
     */
    public static Collection<BlockStorageSnapshotInstanceStatusCode> values() {
        return values(BlockStorageSnapshotInstanceStatusCode.class);
    }
}
