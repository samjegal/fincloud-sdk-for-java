/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import java.util.UUID;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AlimTalkRequestResponseParameter model.
 */
public class AlimTalkRequestResponseParameter {
    /**
     * The requestId property.
     */
    @JsonProperty(value = "requestId")
    private UUID requestId;

    /**
     * The statusCode property.
     */
    @JsonProperty(value = "statusCode")
    private String statusCode;

    /**
     * The statusName property.
     */
    @JsonProperty(value = "statusName")
    private String statusName;

    /**
     * The messages property.
     */
    @JsonProperty(value = "messages")
    private List<AlimTalkRequestResponseParameterMessagesItem> messages;

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
     * @return the AlimTalkRequestResponseParameter object itself.
     */
    public AlimTalkRequestResponseParameter withRequestId(UUID requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the statusCode value.
     *
     * @return the statusCode value
     */
    public String statusCode() {
        return this.statusCode;
    }

    /**
     * Set the statusCode value.
     *
     * @param statusCode the statusCode value to set
     * @return the AlimTalkRequestResponseParameter object itself.
     */
    public AlimTalkRequestResponseParameter withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get the statusName value.
     *
     * @return the statusName value
     */
    public String statusName() {
        return this.statusName;
    }

    /**
     * Set the statusName value.
     *
     * @param statusName the statusName value to set
     * @return the AlimTalkRequestResponseParameter object itself.
     */
    public AlimTalkRequestResponseParameter withStatusName(String statusName) {
        this.statusName = statusName;
        return this;
    }

    /**
     * Get the messages value.
     *
     * @return the messages value
     */
    public List<AlimTalkRequestResponseParameterMessagesItem> messages() {
        return this.messages;
    }

    /**
     * Set the messages value.
     *
     * @param messages the messages value to set
     * @return the AlimTalkRequestResponseParameter object itself.
     */
    public AlimTalkRequestResponseParameter withMessages(List<AlimTalkRequestResponseParameterMessagesItem> messages) {
        this.messages = messages;
        return this;
    }

}
