/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.nas.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for EventConfiguration.
 */
public final class EventConfiguration extends ExpandableStringEnum<EventConfiguration> {
    /** Static value true for EventConfiguration. */
    public static final EventConfiguration TRUE = fromString("true");

    /** Static value false for EventConfiguration. */
    public static final EventConfiguration FALSE = fromString("false");

    /**
     * Creates or finds a EventConfiguration from its string representation.
     * @param name a name to look for
     * @return the corresponding EventConfiguration
     */
    @JsonCreator
    public static EventConfiguration fromString(String name) {
        return fromString(name, EventConfiguration.class);
    }

    /**
     * @return known EventConfiguration values
     */
    public static Collection<EventConfiguration> values() {
        return values(EventConfiguration.class);
    }
}
