/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WMSStepResult.
 */
public final class WMSStepResult extends ExpandableStringEnum<WMSStepResult> {
    /** Static value SUCCESS for WMSStepResult. */
    public static final WMSStepResult SUCCESS = fromString("SUCCESS");

    /** Static value FAIL for WMSStepResult. */
    public static final WMSStepResult FAIL = fromString("FAIL");

    /**
     * Creates or finds a WMSStepResult from its string representation.
     * @param name a name to look for
     * @return the corresponding WMSStepResult
     */
    @JsonCreator
    public static WMSStepResult fromString(String name) {
        return fromString(name, WMSStepResult.class);
    }

    /**
     * @return known WMSStepResult values
     */
    public static Collection<WMSStepResult> values() {
        return values(WMSStepResult.class);
    }
}
