/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AlimTalkResultResponseParameter model.
 */
public class AlimTalkResultResponseParameter {
    /**
     * The messageId property.
     */
    @JsonProperty(value = "messageId")
    private UUID messageId;

    /**
     * The requestId property.
     */
    @JsonProperty(value = "requestId")
    private UUID requestId;

    /**
     * The requestTime property.
     */
    @JsonProperty(value = "requestTime")
    private String requestTime;

    /**
     * The completeTime property.
     */
    @JsonProperty(value = "completeTime")
    private String completeTime;

    /**
     * The plusFriendId property.
     */
    @JsonProperty(value = "plusFriendId")
    private String plusFriendId;

    /**
     * The templateCode property.
     */
    @JsonProperty(value = "templateCode")
    private String templateCode;

    /**
     * The countryCode property.
     */
    @JsonProperty(value = "countryCode")
    private String countryCode;

    /**
     * The to property.
     */
    @JsonProperty(value = "to")
    private String to;

    /**
     * The content property.
     */
    @JsonProperty(value = "content")
    private String content;

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
     * @return the AlimTalkResultResponseParameter object itself.
     */
    public AlimTalkResultResponseParameter withMessageId(UUID messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the requestId value.
     *
     * @return the requestId value
     */
    public UUID requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set
     * @return the AlimTalkResultResponseParameter object itself.
     */
    public AlimTalkResultResponseParameter withRequestId(UUID requestId) {
        this.requestId = requestId;
        return this;
    }

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
     * @return the AlimTalkResultResponseParameter object itself.
     */
    public AlimTalkResultResponseParameter withRequestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }

    /**
     * Get the completeTime value.
     *
     * @return the completeTime value
     */
    public String completeTime() {
        return this.completeTime;
    }

    /**
     * Set the completeTime value.
     *
     * @param completeTime the completeTime value to set
     * @return the AlimTalkResultResponseParameter object itself.
     */
    public AlimTalkResultResponseParameter withCompleteTime(String completeTime) {
        this.completeTime = completeTime;
        return this;
    }

    /**
     * Get the plusFriendId value.
     *
     * @return the plusFriendId value
     */
    public String plusFriendId() {
        return this.plusFriendId;
    }

    /**
     * Set the plusFriendId value.
     *
     * @param plusFriendId the plusFriendId value to set
     * @return the AlimTalkResultResponseParameter object itself.
     */
    public AlimTalkResultResponseParameter withPlusFriendId(String plusFriendId) {
        this.plusFriendId = plusFriendId;
        return this;
    }

    /**
     * Get the templateCode value.
     *
     * @return the templateCode value
     */
    public String templateCode() {
        return this.templateCode;
    }

    /**
     * Set the templateCode value.
     *
     * @param templateCode the templateCode value to set
     * @return the AlimTalkResultResponseParameter object itself.
     */
    public AlimTalkResultResponseParameter withTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }

    /**
     * Get the countryCode value.
     *
     * @return the countryCode value
     */
    public String countryCode() {
        return this.countryCode;
    }

    /**
     * Set the countryCode value.
     *
     * @param countryCode the countryCode value to set
     * @return the AlimTalkResultResponseParameter object itself.
     */
    public AlimTalkResultResponseParameter withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get the to value.
     *
     * @return the to value
     */
    public String to() {
        return this.to;
    }

    /**
     * Set the to value.
     *
     * @param to the to value to set
     * @return the AlimTalkResultResponseParameter object itself.
     */
    public AlimTalkResultResponseParameter withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Get the content value.
     *
     * @return the content value
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content value.
     *
     * @param content the content value to set
     * @return the AlimTalkResultResponseParameter object itself.
     */
    public AlimTalkResultResponseParameter withContent(String content) {
        this.content = content;
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
     * @return the AlimTalkResultResponseParameter object itself.
     */
    public AlimTalkResultResponseParameter withRequestStatusCode(String requestStatusCode) {
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
     * @return the AlimTalkResultResponseParameter object itself.
     */
    public AlimTalkResultResponseParameter withRequestStatusName(String requestStatusName) {
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
     * @return the AlimTalkResultResponseParameter object itself.
     */
    public AlimTalkResultResponseParameter withRequestStatusDesc(String requestStatusDesc) {
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
     * @return the AlimTalkResultResponseParameter object itself.
     */
    public AlimTalkResultResponseParameter withMessageStatusCode(String messageStatusCode) {
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
     * @return the AlimTalkResultResponseParameter object itself.
     */
    public AlimTalkResultResponseParameter withMessageStatusName(String messageStatusName) {
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
     * @return the AlimTalkResultResponseParameter object itself.
     */
    public AlimTalkResultResponseParameter withMessageStatusDesc(String messageStatusDesc) {
        this.messageStatusDesc = messageStatusDesc;
        return this;
    }

}
