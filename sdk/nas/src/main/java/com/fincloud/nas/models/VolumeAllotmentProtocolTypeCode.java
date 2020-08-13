/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.nas.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for VolumeAllotmentProtocolTypeCode.
 */
public final class VolumeAllotmentProtocolTypeCode extends ExpandableStringEnum<VolumeAllotmentProtocolTypeCode> {
    /** Static value NFS for VolumeAllotmentProtocolTypeCode. */
    public static final VolumeAllotmentProtocolTypeCode NFS = fromString("NFS");

    /** Static value CIFS for VolumeAllotmentProtocolTypeCode. */
    public static final VolumeAllotmentProtocolTypeCode CIFS = fromString("CIFS");

    /**
     * Creates or finds a VolumeAllotmentProtocolTypeCode from its string representation.
     * @param name a name to look for
     * @return the corresponding VolumeAllotmentProtocolTypeCode
     */
    @JsonCreator
    public static VolumeAllotmentProtocolTypeCode fromString(String name) {
        return fromString(name, VolumeAllotmentProtocolTypeCode.class);
    }

    /**
     * @return known VolumeAllotmentProtocolTypeCode values
     */
    public static Collection<VolumeAllotmentProtocolTypeCode> values() {
        return values(VolumeAllotmentProtocolTypeCode.class);
    }
}
