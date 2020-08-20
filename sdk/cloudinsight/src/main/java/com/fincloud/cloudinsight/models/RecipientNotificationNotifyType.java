/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RecipientNotificationNotifyType.
 */
public final class RecipientNotificationNotifyType extends ExpandableStringEnum<RecipientNotificationNotifyType> {
    /** Static value SMS for RecipientNotificationNotifyType. */
    public static final RecipientNotificationNotifyType SMS = fromString("SMS");

    /** Static value EMAIL for RecipientNotificationNotifyType. */
    public static final RecipientNotificationNotifyType EMAIL = fromString("EMAIL");

    /**
     * Creates or finds a RecipientNotificationNotifyType from its string representation.
     * @param name a name to look for
     * @return the corresponding RecipientNotificationNotifyType
     */
    @JsonCreator
    public static RecipientNotificationNotifyType fromString(String name) {
        return fromString(name, RecipientNotificationNotifyType.class);
    }

    /**
     * @return known RecipientNotificationNotifyType values
     */
    public static Collection<RecipientNotificationNotifyType> values() {
        return values(RecipientNotificationNotifyType.class);
    }
}
