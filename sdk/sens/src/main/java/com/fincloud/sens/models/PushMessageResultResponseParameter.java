/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import java.util.UUID;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushMessageResultResponseParameter model.
 */
public class PushMessageResultResponseParameter {
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
     * 200 - 발송성공&lt;br&gt;400 - bad request&lt;br&gt;404 - no
     * targets&lt;br&gt;500 - internal server error.
     */
    @JsonProperty(value = "messageStatusCode")
    private String messageStatusCode;

    /**
     * (success|processing|fail).
     */
    @JsonProperty(value = "messageStatusName")
    private String messageStatusName;

    /**
     * The messageStatusMessage property.
     */
    @JsonProperty(value = "messageStatusMessage")
    private String messageStatusMessage;

    /**
     * The errorMessage property.
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /**
     * The completeTime property.
     */
    @JsonProperty(value = "completeTime")
    private DateTime completeTime;

    /**
     * The targetCount property.
     */
    @JsonProperty(value = "targetCount")
    private Integer targetCount;

    /**
     * The sentCount property.
     */
    @JsonProperty(value = "sentCount")
    private Integer sentCount;

    /**
     * The message property.
     */
    @JsonProperty(value = "message")
    private PushMessageResultResponseParameterMessage message;

    /**
     * (NOTIF|AD).
     */
    @JsonProperty(value = "messageType")
    private String messageType;

    /**
     * The target property.
     */
    @JsonProperty(value = "target")
    private PushMessageResultResponseParameterTarget target;

    /**
     * 스케줄 코드.
     */
    @JsonProperty(value = "scheduleCode")
    private String scheduleCode;

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
     * @return the PushMessageResultResponseParameter object itself.
     */
    public PushMessageResultResponseParameter withRequestId(UUID requestId) {
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
     * @return the PushMessageResultResponseParameter object itself.
     */
    public PushMessageResultResponseParameter withRequestTime(DateTime requestTime) {
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
     * @return the PushMessageResultResponseParameter object itself.
     */
    public PushMessageResultResponseParameter withStatusCode(String statusCode) {
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
     * @return the PushMessageResultResponseParameter object itself.
     */
    public PushMessageResultResponseParameter withStatusName(String statusName) {
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
     * @return the PushMessageResultResponseParameter object itself.
     */
    public PushMessageResultResponseParameter withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * Get 200 - 발송성공&lt;br&gt;400 - bad request&lt;br&gt;404 - no targets&lt;br&gt;500 - internal server error.
     *
     * @return the messageStatusCode value
     */
    public String messageStatusCode() {
        return this.messageStatusCode;
    }

    /**
     * Set 200 - 발송성공&lt;br&gt;400 - bad request&lt;br&gt;404 - no targets&lt;br&gt;500 - internal server error.
     *
     * @param messageStatusCode the messageStatusCode value to set
     * @return the PushMessageResultResponseParameter object itself.
     */
    public PushMessageResultResponseParameter withMessageStatusCode(String messageStatusCode) {
        this.messageStatusCode = messageStatusCode;
        return this;
    }

    /**
     * Get (success|processing|fail).
     *
     * @return the messageStatusName value
     */
    public String messageStatusName() {
        return this.messageStatusName;
    }

    /**
     * Set (success|processing|fail).
     *
     * @param messageStatusName the messageStatusName value to set
     * @return the PushMessageResultResponseParameter object itself.
     */
    public PushMessageResultResponseParameter withMessageStatusName(String messageStatusName) {
        this.messageStatusName = messageStatusName;
        return this;
    }

    /**
     * Get the messageStatusMessage value.
     *
     * @return the messageStatusMessage value
     */
    public String messageStatusMessage() {
        return this.messageStatusMessage;
    }

    /**
     * Set the messageStatusMessage value.
     *
     * @param messageStatusMessage the messageStatusMessage value to set
     * @return the PushMessageResultResponseParameter object itself.
     */
    public PushMessageResultResponseParameter withMessageStatusMessage(String messageStatusMessage) {
        this.messageStatusMessage = messageStatusMessage;
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
     * @return the PushMessageResultResponseParameter object itself.
     */
    public PushMessageResultResponseParameter withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get the completeTime value.
     *
     * @return the completeTime value
     */
    public DateTime completeTime() {
        return this.completeTime;
    }

    /**
     * Set the completeTime value.
     *
     * @param completeTime the completeTime value to set
     * @return the PushMessageResultResponseParameter object itself.
     */
    public PushMessageResultResponseParameter withCompleteTime(DateTime completeTime) {
        this.completeTime = completeTime;
        return this;
    }

    /**
     * Get the targetCount value.
     *
     * @return the targetCount value
     */
    public Integer targetCount() {
        return this.targetCount;
    }

    /**
     * Set the targetCount value.
     *
     * @param targetCount the targetCount value to set
     * @return the PushMessageResultResponseParameter object itself.
     */
    public PushMessageResultResponseParameter withTargetCount(Integer targetCount) {
        this.targetCount = targetCount;
        return this;
    }

    /**
     * Get the sentCount value.
     *
     * @return the sentCount value
     */
    public Integer sentCount() {
        return this.sentCount;
    }

    /**
     * Set the sentCount value.
     *
     * @param sentCount the sentCount value to set
     * @return the PushMessageResultResponseParameter object itself.
     */
    public PushMessageResultResponseParameter withSentCount(Integer sentCount) {
        this.sentCount = sentCount;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public PushMessageResultResponseParameterMessage message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the PushMessageResultResponseParameter object itself.
     */
    public PushMessageResultResponseParameter withMessage(PushMessageResultResponseParameterMessage message) {
        this.message = message;
        return this;
    }

    /**
     * Get (NOTIF|AD).
     *
     * @return the messageType value
     */
    public String messageType() {
        return this.messageType;
    }

    /**
     * Set (NOTIF|AD).
     *
     * @param messageType the messageType value to set
     * @return the PushMessageResultResponseParameter object itself.
     */
    public PushMessageResultResponseParameter withMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * Get the target value.
     *
     * @return the target value
     */
    public PushMessageResultResponseParameterTarget target() {
        return this.target;
    }

    /**
     * Set the target value.
     *
     * @param target the target value to set
     * @return the PushMessageResultResponseParameter object itself.
     */
    public PushMessageResultResponseParameter withTarget(PushMessageResultResponseParameterTarget target) {
        this.target = target;
        return this;
    }

    /**
     * Get 스케줄 코드.
     *
     * @return the scheduleCode value
     */
    public String scheduleCode() {
        return this.scheduleCode;
    }

    /**
     * Set 스케줄 코드.
     *
     * @param scheduleCode the scheduleCode value to set
     * @return the PushMessageResultResponseParameter object itself.
     */
    public PushMessageResultResponseParameter withScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
        return this;
    }

}
