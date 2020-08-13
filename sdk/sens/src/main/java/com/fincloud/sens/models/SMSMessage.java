/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SMSMessage model.
 */
public class SMSMessage {
    /**
     * 메시지 아이디.
     */
    @JsonProperty(value = "messageId")
    private String messageId;

    /**
     * 발신번호.
     */
    @JsonProperty(value = "from")
    private String from;

    /**
     * 수신번호.
     */
    @JsonProperty(value = "to")
    private String to;

    /**
     * 메시지 컨텐츠 구분(COMM: 일반미시지, AD: 광고메시지).
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /**
     * 국가번호.
     */
    @JsonProperty(value = "countryCode")
    private String countryCode;

    /**
     * 요청 아이디.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /**
     * 단말 수신 상태 결과 코드.
     */
    @JsonProperty(value = "statusCode")
    private String statusCode;

    /**
     * 단말 수신 상태 결과명.
     */
    @JsonProperty(value = "statusName")
    private String statusName;

    /**
     * 단말 수신 상태 결과 메시지.
     */
    @JsonProperty(value = "statusMessage")
    private String statusMessage;

    /**
     * 발송 처리 상태(READY: 대기, PROCESSING: 처리중, COMPLETED: 처리완료).
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * 발송 완료 시간.
     */
    @JsonProperty(value = "completeTime")
    private String completeTime;

    /**
     * 메시지 컨텐츠 내용.
     */
    @JsonProperty(value = "content")
    private String content;

    /**
     * 통신사코드.
     */
    @JsonProperty(value = "telcoCode")
    private String telcoCode;

    /**
     * Get 메시지 아이디.
     *
     * @return the messageId value
     */
    public String messageId() {
        return this.messageId;
    }

    /**
     * Set 메시지 아이디.
     *
     * @param messageId the messageId value to set
     * @return the SMSMessage object itself.
     */
    public SMSMessage withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get 발신번호.
     *
     * @return the from value
     */
    public String from() {
        return this.from;
    }

    /**
     * Set 발신번호.
     *
     * @param from the from value to set
     * @return the SMSMessage object itself.
     */
    public SMSMessage withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Get 수신번호.
     *
     * @return the to value
     */
    public String to() {
        return this.to;
    }

    /**
     * Set 수신번호.
     *
     * @param to the to value to set
     * @return the SMSMessage object itself.
     */
    public SMSMessage withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Get 메시지 컨텐츠 구분(COMM: 일반미시지, AD: 광고메시지).
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set 메시지 컨텐츠 구분(COMM: 일반미시지, AD: 광고메시지).
     *
     * @param contentType the contentType value to set
     * @return the SMSMessage object itself.
     */
    public SMSMessage withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get 국가번호.
     *
     * @return the countryCode value
     */
    public String countryCode() {
        return this.countryCode;
    }

    /**
     * Set 국가번호.
     *
     * @param countryCode the countryCode value to set
     * @return the SMSMessage object itself.
     */
    public SMSMessage withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

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
     * @return the SMSMessage object itself.
     */
    public SMSMessage withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get 단말 수신 상태 결과 코드.
     *
     * @return the statusCode value
     */
    public String statusCode() {
        return this.statusCode;
    }

    /**
     * Set 단말 수신 상태 결과 코드.
     *
     * @param statusCode the statusCode value to set
     * @return the SMSMessage object itself.
     */
    public SMSMessage withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get 단말 수신 상태 결과명.
     *
     * @return the statusName value
     */
    public String statusName() {
        return this.statusName;
    }

    /**
     * Set 단말 수신 상태 결과명.
     *
     * @param statusName the statusName value to set
     * @return the SMSMessage object itself.
     */
    public SMSMessage withStatusName(String statusName) {
        this.statusName = statusName;
        return this;
    }

    /**
     * Get 단말 수신 상태 결과 메시지.
     *
     * @return the statusMessage value
     */
    public String statusMessage() {
        return this.statusMessage;
    }

    /**
     * Set 단말 수신 상태 결과 메시지.
     *
     * @param statusMessage the statusMessage value to set
     * @return the SMSMessage object itself.
     */
    public SMSMessage withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * Get 발송 처리 상태(READY: 대기, PROCESSING: 처리중, COMPLETED: 처리완료).
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set 발송 처리 상태(READY: 대기, PROCESSING: 처리중, COMPLETED: 처리완료).
     *
     * @param status the status value to set
     * @return the SMSMessage object itself.
     */
    public SMSMessage withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get 발송 완료 시간.
     *
     * @return the completeTime value
     */
    public String completeTime() {
        return this.completeTime;
    }

    /**
     * Set 발송 완료 시간.
     *
     * @param completeTime the completeTime value to set
     * @return the SMSMessage object itself.
     */
    public SMSMessage withCompleteTime(String completeTime) {
        this.completeTime = completeTime;
        return this;
    }

    /**
     * Get 메시지 컨텐츠 내용.
     *
     * @return the content value
     */
    public String content() {
        return this.content;
    }

    /**
     * Set 메시지 컨텐츠 내용.
     *
     * @param content the content value to set
     * @return the SMSMessage object itself.
     */
    public SMSMessage withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get 통신사코드.
     *
     * @return the telcoCode value
     */
    public String telcoCode() {
        return this.telcoCode;
    }

    /**
     * Set 통신사코드.
     *
     * @param telcoCode the telcoCode value to set
     * @return the SMSMessage object itself.
     */
    public SMSMessage withTelcoCode(String telcoCode) {
        this.telcoCode = telcoCode;
        return this;
    }

}
