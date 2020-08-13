/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AlimTalkRequestResponseParameterMessagesItem model.
 */
public class AlimTalkRequestResponseParameterMessagesItem {
    /**
     * The requestTime property.
     */
    @JsonProperty(value = "requestTime")
    private String requestTime;

    /**
     * The messageId property.
     */
    @JsonProperty(value = "messageId")
    private UUID messageId;

    /**
     * The countryCode property.
     */
    @JsonProperty(value = "countryCode")
    private UUID countryCode;

    /**
     * The to property.
     */
    @JsonProperty(value = "to")
    private UUID to;

    /**
     * The plusFriendId property.
     */
    @JsonProperty(value = "plusFriendId")
    private UUID plusFriendId;

    /**
     * The templateCode property.
     */
    @JsonProperty(value = "templateCode")
    private UUID templateCode;

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
     * The messageStatusCode property.
     */
    @JsonProperty(value = "messageStatusCode")
    private String messageStatusCode;

    /**
     * The messageStatusName property.
     */
    @JsonProperty(value = "messageStatusName")
    private String messageStatusName;

    /**
     * The messageStatusDesc property.
     */
    @JsonProperty(value = "messageStatusDesc")
    private String messageStatusDesc;

    /**
     * Get the requestTime value.
     *
     * @return the requestTime value
     */
    public String requestTime() {
        return this.requestTime;
    }

    /**
     * Set the requestTime value.
     *
     * @param requestTime the requestTime value to set
     * @return the AlimTalkRequestResponseParameterMessagesItem object itself.
     */
    public AlimTalkRequestResponseParameterMessagesItem withRequestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }

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
     * @return the AlimTalkRequestResponseParameterMessagesItem object itself.
     */
    public AlimTalkRequestResponseParameterMessagesItem withMessageId(UUID messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the countryCode value.
     *
     * @return the countryCode value
     */
    public UUID countryCode() {
        return this.countryCode;
    }

    /**
     * Set the countryCode value.
     *
     * @param countryCode the countryCode value to set
     * @return the AlimTalkRequestResponseParameterMessagesItem object itself.
     */
    public AlimTalkRequestResponseParameterMessagesItem withCountryCode(UUID countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get the to value.
     *
     * @return the to value
     */
    public UUID to() {
        return this.to;
    }

    /**
     * Set the to value.
     *
     * @param to the to value to set
     * @return the AlimTalkRequestResponseParameterMessagesItem object itself.
     */
    public AlimTalkRequestResponseParameterMessagesItem withTo(UUID to) {
        this.to = to;
        return this;
    }

    /**
     * Get the plusFriendId value.
     *
     * @return the plusFriendId value
     */
    public UUID plusFriendId() {
        return this.plusFriendId;
    }

    /**
     * Set the plusFriendId value.
     *
     * @param plusFriendId the plusFriendId value to set
     * @return the AlimTalkRequestResponseParameterMessagesItem object itself.
     */
    public AlimTalkRequestResponseParameterMessagesItem withPlusFriendId(UUID plusFriendId) {
        this.plusFriendId = plusFriendId;
        return this;
    }

    /**
     * Get the templateCode value.
     *
     * @return the templateCode value
     */
    public UUID templateCode() {
        return this.templateCode;
    }

    /**
     * Set the templateCode value.
     *
     * @param templateCode the templateCode value to set
     * @return the AlimTalkRequestResponseParameterMessagesItem object itself.
     */
    public AlimTalkRequestResponseParameterMessagesItem withTemplateCode(UUID templateCode) {
        this.templateCode = templateCode;
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
     * @return the AlimTalkRequestResponseParameterMessagesItem object itself.
     */
    public AlimTalkRequestResponseParameterMessagesItem withRequestStatusCode(String requestStatusCode) {
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
     * @return the AlimTalkRequestResponseParameterMessagesItem object itself.
     */
    public AlimTalkRequestResponseParameterMessagesItem withRequestStatusName(String requestStatusName) {
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
     * @return the AlimTalkRequestResponseParameterMessagesItem object itself.
     */
    public AlimTalkRequestResponseParameterMessagesItem withRequestStatusDesc(String requestStatusDesc) {
        this.requestStatusDesc = requestStatusDesc;
        return this;
    }

    /**
     * Get the messageStatusCode value.
     *
     * @return the messageStatusCode value
     */
    public String messageStatusCode() {
        return this.messageStatusCode;
    }

    /**
     * Set the messageStatusCode value.
     *
     * @param messageStatusCode the messageStatusCode value to set
     * @return the AlimTalkRequestResponseParameterMessagesItem object itself.
     */
    public AlimTalkRequestResponseParameterMessagesItem withMessageStatusCode(String messageStatusCode) {
        this.messageStatusCode = messageStatusCode;
        return this;
    }

    /**
     * Get the messageStatusName value.
     *
     * @return the messageStatusName value
     */
    public String messageStatusName() {
        return this.messageStatusName;
    }

    /**
     * Set the messageStatusName value.
     *
     * @param messageStatusName the messageStatusName value to set
     * @return the AlimTalkRequestResponseParameterMessagesItem object itself.
     */
    public AlimTalkRequestResponseParameterMessagesItem withMessageStatusName(String messageStatusName) {
        this.messageStatusName = messageStatusName;
        return this;
    }

    /**
     * Get the messageStatusDesc value.
     *
     * @return the messageStatusDesc value
     */
    public String messageStatusDesc() {
        return this.messageStatusDesc;
    }

    /**
     * Set the messageStatusDesc value.
     *
     * @param messageStatusDesc the messageStatusDesc value to set
     * @return the AlimTalkRequestResponseParameterMessagesItem object itself.
     */
    public AlimTalkRequestResponseParameterMessagesItem withMessageStatusDesc(String messageStatusDesc) {
        this.messageStatusDesc = messageStatusDesc;
        return this;
    }

}
