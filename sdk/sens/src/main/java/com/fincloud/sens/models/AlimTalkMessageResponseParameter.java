/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import java.util.UUID;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AlimTalkMessageResponseParameter model.
 */
public class AlimTalkMessageResponseParameter {
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
     * The messages property.
     */
    @JsonProperty(value = "messages")
    private List<AlimTalkMessageResponseParameterMessagesItem> messages;

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
     * @return the AlimTalkMessageResponseParameter object itself.
     */
    public AlimTalkMessageResponseParameter withRequestId(UUID requestId) {
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
     * @return the AlimTalkMessageResponseParameter object itself.
     */
    public AlimTalkMessageResponseParameter withRequestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }

    /**
     * Get the messages value.
     *
     * @return the messages value
     */
    public List<AlimTalkMessageResponseParameterMessagesItem> messages() {
        return this.messages;
    }

    /**
     * Set the messages value.
     *
     * @param messages the messages value to set
     * @return the AlimTalkMessageResponseParameter object itself.
     */
    public AlimTalkMessageResponseParameter withMessages(List<AlimTalkMessageResponseParameterMessagesItem> messages) {
        this.messages = messages;
        return this;
    }

}
