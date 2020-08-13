/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for FeeSystemTypeCode.
 */
public final class FeeSystemTypeCode extends ExpandableStringEnum<FeeSystemTypeCode> {
    /** Static value MTRAT for FeeSystemTypeCode. */
    public static final FeeSystemTypeCode MTRAT = fromString("MTRAT");

    /** Static value FXSUM for FeeSystemTypeCode. */
    public static final FeeSystemTypeCode FXSUM = fromString("FXSUM");

    /**
     * Creates or finds a FeeSystemTypeCode from its string representation.
     * @param name a name to look for
     * @return the corresponding FeeSystemTypeCode
     */
    @JsonCreator
    public static FeeSystemTypeCode fromString(String name) {
        return fromString(name, FeeSystemTypeCode.class);
    }

    /**
     * @return known FeeSystemTypeCode values
     */
    public static Collection<FeeSystemTypeCode> values() {
        return values(FeeSystemTypeCode.class);
    }
}
