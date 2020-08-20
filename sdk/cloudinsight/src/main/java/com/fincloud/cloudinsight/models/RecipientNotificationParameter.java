/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RecipientNotification.
 * Recipient Notification.
 */
public class RecipientNotificationParameter {
    /**
     * Recipient Notification의 이름.
     */
    @JsonProperty(value = "groupName")
    private String groupName;

    /**
     * Recipient Notification id.
     */
    @JsonProperty(value = "groupNum")
    private Integer groupNum;

    /**
     * Notify Type.
     */
    @JsonProperty(value = "notifyTypes")
    private List<RecipientNotificationNotifyType> notifyTypes;

    /**
     * Get recipient Notification의 이름.
     *
     * @return the groupName value
     */
    public String groupName() {
        return this.groupName;
    }

    /**
     * Set recipient Notification의 이름.
     *
     * @param groupName the groupName value to set
     * @return the RecipientNotificationParameter object itself.
     */
    public RecipientNotificationParameter withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Get recipient Notification id.
     *
     * @return the groupNum value
     */
    public Integer groupNum() {
        return this.groupNum;
    }

    /**
     * Set recipient Notification id.
     *
     * @param groupNum the groupNum value to set
     * @return the RecipientNotificationParameter object itself.
     */
    public RecipientNotificationParameter withGroupNum(Integer groupNum) {
        this.groupNum = groupNum;
        return this;
    }

    /**
     * Get notify Type.
     *
     * @return the notifyTypes value
     */
    public List<RecipientNotificationNotifyType> notifyTypes() {
        return this.notifyTypes;
    }

    /**
     * Set notify Type.
     *
     * @param notifyTypes the notifyTypes value to set
     * @return the RecipientNotificationParameter object itself.
     */
    public RecipientNotificationParameter withNotifyTypes(List<RecipientNotificationNotifyType> notifyTypes) {
        this.notifyTypes = notifyTypes;
        return this;
    }

}
