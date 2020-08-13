/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ProtocolTypeCode.
 */
public final class ProtocolTypeCode extends ExpandableStringEnum<ProtocolTypeCode> {
    /** Static value TCP for ProtocolTypeCode. */
    public static final ProtocolTypeCode TCP = fromString("TCP");

    /** Static value UDP for ProtocolTypeCode. */
    public static final ProtocolTypeCode UDP = fromString("UDP");

    /** Static value ICMP for ProtocolTypeCode. */
    public static final ProtocolTypeCode ICMP = fromString("ICMP");

    /**
     * Creates or finds a ProtocolTypeCode from its string representation.
     * @param name a name to look for
     * @return the corresponding ProtocolTypeCode
     */
    @JsonCreator
    public static ProtocolTypeCode fromString(String name) {
        return fromString(name, ProtocolTypeCode.class);
    }

    /**
     * @return known ProtocolTypeCode values
     */
    public static Collection<ProtocolTypeCode> values() {
        return values(ProtocolTypeCode.class);
    }
}
