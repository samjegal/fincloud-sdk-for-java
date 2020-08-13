/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SMSMessageParameter model.
 */
public class SMSMessageParameter {
    /**
     * 요청 아이디.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /**
     * 요청 시간.
     */
    @JsonProperty(value = "requestTime")
    private String requestTime;

    /**
     * 발송 요청 상태 코드.
     */
    @JsonProperty(value = "statusCode")
    private String statusCode;

    /**
     * 발송 요청 상태명.
     */
    @JsonProperty(value = "statusName")
    private String statusName;

    /**
     * 발송 요청 상태 메시지.
     */
    @JsonProperty(value = "statusMessage")
    private String statusMessage;

    /**
     * The messages property.
     */
    @JsonProperty(value = "messages")
    private List<SMSMessage> messages;

    /**
     * Get 요청 아이디.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set 요청 아이디.
     *
     * @param requestId the requestId value to set
     * @return the SMSMessageParameter object itself.
     */
    public SMSMessageParameter withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get 요청 시간.
     *
     * @return the requestTime value
     */
    public String requestTime() {
        return this.requestTime;
    }

    /**
     * Set 요청 시간.
     *
     * @param requestTime the requestTime value to set
     * @return the SMSMessageParameter object itself.
     */
    public SMSMessageParameter withRequestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }

    /**
     * Get 발송 요청 상태 코드.
     *
     * @return the statusCode value
     */
    public String statusCode() {
        return this.statusCode;
    }

    /**
     * Set 발송 요청 상태 코드.
     *
     * @param statusCode the statusCode value to set
     * @return the SMSMessageParameter object itself.
     */
    public SMSMessageParameter withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get 발송 요청 상태명.
     *
     * @return the statusName value
     */
    public String statusName() {
        return this.statusName;
    }

    /**
     * Set 발송 요청 상태명.
     *
     * @param statusName the statusName value to set
     * @return the SMSMessageParameter object itself.
     */
    public SMSMessageParameter withStatusName(String statusName) {
        this.statusName = statusName;
        return this;
    }

    /**
     * Get 발송 요청 상태 메시지.
     *
     * @return the statusMessage value
     */
    public String statusMessage() {
        return this.statusMessage;
    }

    /**
     * Set 발송 요청 상태 메시지.
     *
     * @param statusMessage the statusMessage value to set
     * @return the SMSMessageParameter object itself.
     */
    public SMSMessageParameter withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * Get the messages value.
     *
     * @return the messages value
     */
    public List<SMSMessage> messages() {
        return this.messages;
    }

    /**
     * Set the messages value.
     *
     * @param messages the messages value to set
     * @return the SMSMessageParameter object itself.
     */
    public SMSMessageParameter withMessages(List<SMSMessage> messages) {
        this.messages = messages;
        return this;
    }

}
