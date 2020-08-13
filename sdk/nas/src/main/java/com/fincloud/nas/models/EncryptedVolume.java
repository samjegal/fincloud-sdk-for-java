/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.nas.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for EncryptedVolume.
 */
public final class EncryptedVolume extends ExpandableStringEnum<EncryptedVolume> {
    /** Static value true for EncryptedVolume. */
    public static final EncryptedVolume TRUE = fromString("true");

    /** Static value false for EncryptedVolume. */
    public static final EncryptedVolume FALSE = fromString("false");

    /**
     * Creates or finds a EncryptedVolume from its string representation.
     * @param name a name to look for
     * @return the corresponding EncryptedVolume
     */
    @JsonCreator
    public static EncryptedVolume fromString(String name) {
        return fromString(name, EncryptedVolume.class);
    }

    /**
     * @return known EncryptedVolume values
     */
    public static Collection<EncryptedVolume> values() {
        return values(EncryptedVolume.class);
    }
}
