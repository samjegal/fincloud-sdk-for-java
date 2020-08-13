/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import java.util.UUID;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushMessageResponseParameter model.
 */
public class PushMessageResponseParameter {
    /**
     * The requestId property.
     */
    @JsonProperty(value = "requestId")
    private UUID requestId;

    /**
     * The requestTime property.
     */
    @JsonProperty(value = "requestTime")
    private DateTime requestTime;

    /**
     * 202 - 요청성공&lt;br&gt;400 - bad request&lt;br&gt;401 -
     * unauthorized&lt;br&gt;404 - not found&lt;br&gt;500 - internal server
     * error.
     */
    @JsonProperty(value = "statusCode")
    private String statusCode;

    /**
     * (success|fail).
     */
    @JsonProperty(value = "statusName")
    private String statusName;

    /**
     * The statusMessage property.
     */
    @JsonProperty(value = "statusMessage")
    private String statusMessage;

    /**
     * The errorMessage property.
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

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
     * @return the PushMessageResponseParameter object itself.
     */
    public PushMessageResponseParameter withRequestId(UUID requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the requestTime value.
     *
     * @return the requestTime value
     */
    public DateTime requestTime() {
        return this.requestTime;
    }

    /**
     * Set the requestTime value.
     *
     * @param requestTime the requestTime value to set
     * @return the PushMessageResponseParameter object itself.
     */
    public PushMessageResponseParameter withRequestTime(DateTime requestTime) {
        this.requestTime = requestTime;
        return this;
    }

    /**
     * Get 202 - 요청성공&lt;br&gt;400 - bad request&lt;br&gt;401 - unauthorized&lt;br&gt;404 - not found&lt;br&gt;500 - internal server error.
     *
     * @return the statusCode value
     */
    public String statusCode() {
        return this.statusCode;
    }

    /**
     * Set 202 - 요청성공&lt;br&gt;400 - bad request&lt;br&gt;401 - unauthorized&lt;br&gt;404 - not found&lt;br&gt;500 - internal server error.
     *
     * @param statusCode the statusCode value to set
     * @return the PushMessageResponseParameter object itself.
     */
    public PushMessageResponseParameter withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get (success|fail).
     *
     * @return the statusName value
     */
    public String statusName() {
        return this.statusName;
    }

    /**
     * Set (success|fail).
     *
     * @param statusName the statusName value to set
     * @return the PushMessageResponseParameter object itself.
     */
    public PushMessageResponseParameter withStatusName(String statusName) {
        this.statusName = statusName;
        return this;
    }

    /**
     * Get the statusMessage value.
     *
     * @return the statusMessage value
     */
    public String statusMessage() {
        return this.statusMessage;
    }

    /**
     * Set the statusMessage value.
     *
     * @param statusMessage the statusMessage value to set
     * @return the PushMessageResponseParameter object itself.
     */
    public PushMessageResponseParameter withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * Get the errorMessage value.
     *
     * @return the errorMessage value
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage value.
     *
     * @param errorMessage the errorMessage value to set
     * @return the PushMessageResponseParameter object itself.
     */
    public PushMessageResponseParameter withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

}
