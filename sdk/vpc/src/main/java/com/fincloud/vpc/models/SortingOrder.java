/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SortingOrder.
 */
public final class SortingOrder extends ExpandableStringEnum<SortingOrder> {
    /** Static value ASC for SortingOrder. */
    public static final SortingOrder ASC = fromString("ASC");

    /** Static value DESC for SortingOrder. */
    public static final SortingOrder DESC = fromString("DESC");

    /**
     * Creates or finds a SortingOrder from its string representation.
     * @param name a name to look for
     * @return the corresponding SortingOrder
     */
    @JsonCreator
    public static SortingOrder fromString(String name) {
        return fromString(name, SortingOrder.class);
    }

    /**
     * @return known SortingOrder values
     */
    public static Collection<SortingOrder> values() {
        return values(SortingOrder.class);
    }
}
