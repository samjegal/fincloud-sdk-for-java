/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for NetworkInterfaceStatusCode.
 */
public final class NetworkInterfaceStatusCode extends ExpandableStringEnum<NetworkInterfaceStatusCode> {
    /** Static value SET for NetworkInterfaceStatusCode. */
    public static final NetworkInterfaceStatusCode SET = fromString("SET");

    /** Static value UNSET for NetworkInterfaceStatusCode. */
    public static final NetworkInterfaceStatusCode UNSET = fromString("UNSET");

    /** Static value USED for NetworkInterfaceStatusCode. */
    public static final NetworkInterfaceStatusCode USED = fromString("USED");

    /** Static value NOTUSED for NetworkInterfaceStatusCode. */
    public static final NetworkInterfaceStatusCode NOTUSED = fromString("NOTUSED");

    /**
     * Creates or finds a NetworkInterfaceStatusCode from its string representation.
     * @param name a name to look for
     * @return the corresponding NetworkInterfaceStatusCode
     */
    @JsonCreator
    public static NetworkInterfaceStatusCode fromString(String name) {
        return fromString(name, NetworkInterfaceStatusCode.class);
    }

    /**
     * @return known NetworkInterfaceStatusCode values
     */
    public static Collection<NetworkInterfaceStatusCode> values() {
        return values(NetworkInterfaceStatusCode.class);
    }
}
