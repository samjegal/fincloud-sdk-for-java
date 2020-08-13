/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WMSStepEvent.
 */
public final class WMSStepEvent extends ExpandableStringEnum<WMSStepEvent> {
    /** Static value click for WMSStepEvent. */
    public static final WMSStepEvent CLICK = fromString("click");

    /** Static value text for WMSStepEvent. */
    public static final WMSStepEvent TEXT = fromString("text");

    /** Static value find_text for WMSStepEvent. */
    public static final WMSStepEvent FIND_TEXT = fromString("find_text");

    /** Static value find_object for WMSStepEvent. */
    public static final WMSStepEvent FIND_OBJECT = fromString("find_object");

    /**
     * Creates or finds a WMSStepEvent from its string representation.
     * @param name a name to look for
     * @return the corresponding WMSStepEvent
     */
    @JsonCreator
    public static WMSStepEvent fromString(String name) {
        return fromString(name, WMSStepEvent.class);
    }

    /**
     * @return known WMSStepEvent values
     */
    public static Collection<WMSStepEvent> values() {
        return values(WMSStepEvent.class);
    }
}
