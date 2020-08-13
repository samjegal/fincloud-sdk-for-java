/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AlimTalkMessageResponseParameterMessagesItem model.
 */
public class AlimTalkMessageResponseParameterMessagesItem {
    /**
     * The messageId property.
     */
    @JsonProperty(value = "messageId")
    private UUID messageId;

    /**
     * The requestStatusCode property.
     */
    @JsonProperty(value = "requestStatusCode")
    private String requestStatusCode;

    /**
     * The requestStatusName property.
     */
    @JsonProperty(value = "requestStatusName")
    private String requestStatusName;

    /**
     * The requestStatusDesc property.
     */
    @JsonProperty(value = "requestStatusDesc")
    private String requestStatusDesc;

    /**
     * Get the messageId value.
     *
     * @return the messageId value
     */
    public UUID messageId() {
        return this.messageId;
    }

    /**
     * Set the messageId value.
     *
     * @param messageId the messageId value to set
     * @return the AlimTalkMessageResponseParameterMessagesItem object itself.
     */
    public AlimTalkMessageResponseParameterMessagesItem withMessageId(UUID messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the requestStatusCode value.
     *
     * @return the requestStatusCode value
     */
    public String requestStatusCode() {
        return this.requestStatusCode;
    }

    /**
     * Set the requestStatusCode value.
     *
     * @param requestStatusCode the requestStatusCode value to set
     * @return the AlimTalkMessageResponseParameterMessagesItem object itself.
     */
    public AlimTalkMessageResponseParameterMessagesItem withRequestStatusCode(String requestStatusCode) {
        this.requestStatusCode = requestStatusCode;
        return this;
    }

    /**
     * Get the requestStatusName value.
     *
     * @return the requestStatusName value
     */
    public String requestStatusName() {
        return this.requestStatusName;
    }

    /**
     * Set the requestStatusName value.
     *
     * @param requestStatusName the requestStatusName value to set
     * @return the AlimTalkMessageResponseParameterMessagesItem object itself.
     */
    public AlimTalkMessageResponseParameterMessagesItem withRequestStatusName(String requestStatusName) {
        this.requestStatusName = requestStatusName;
        return this;
    }

    /**
     * Get the requestStatusDesc value.
     *
     * @return the requestStatusDesc value
     */
    public String requestStatusDesc() {
        return this.requestStatusDesc;
    }

    /**
     * Set the requestStatusDesc value.
     *
     * @param requestStatusDesc the requestStatusDesc value to set
     * @return the AlimTalkMessageResponseParameterMessagesItem object itself.
     */
    public AlimTalkMessageResponseParameterMessagesItem withRequestStatusDesc(String requestStatusDesc) {
        this.requestStatusDesc = requestStatusDesc;
        return this;
    }

}
