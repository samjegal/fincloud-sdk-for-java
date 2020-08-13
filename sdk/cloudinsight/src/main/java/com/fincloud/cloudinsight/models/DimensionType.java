/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DimensionType.
 */
public final class DimensionType extends ExpandableStringEnum<DimensionType> {
    /** Static value cpu for DimensionType. */
    public static final DimensionType CPU = fromString("cpu");

    /** Static value disk for DimensionType. */
    public static final DimensionType DISK = fromString("disk");

    /** Static value fs for DimensionType. */
    public static final DimensionType FS = fromString("fs");

    /** Static value memory for DimensionType. */
    public static final DimensionType MEMORY = fromString("memory");

    /** Static value ntwk for DimensionType. */
    public static final DimensionType NTWK = fromString("ntwk");

    /** Static value process for DimensionType. */
    public static final DimensionType PROCESS = fromString("process");

    /** Static value svr for DimensionType. */
    public static final DimensionType SVR = fromString("svr");

    /** Static value plugin_process for DimensionType. */
    public static final DimensionType PLUGIN_PROCESS = fromString("plugin_process");

    /** Static value plugin_file for DimensionType. */
    public static final DimensionType PLUGIN_FILE = fromString("plugin_file");

    /** Static value plugin_port for DimensionType. */
    public static final DimensionType PLUGIN_PORT = fromString("plugin_port");

    /** Static value agent for DimensionType. */
    public static final DimensionType AGENT = fromString("agent");

    /**
     * Creates or finds a DimensionType from its string representation.
     * @param name a name to look for
     * @return the corresponding DimensionType
     */
    @JsonCreator
    public static DimensionType fromString(String name) {
        return fromString(name, DimensionType.class);
    }

    /**
     * @return known DimensionType values
     */
    public static Collection<DimensionType> values() {
        return values(DimensionType.class);
    }
}
