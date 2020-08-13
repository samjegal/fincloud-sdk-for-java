/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SMSMessageRequestParameter model.
 */
public class SMSMessageRequestParameter {
    /**
     * 메시지 구분. (SMS, LMS, MMS).
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * 국가번호.
     */
    @JsonProperty(value = "countryCode")
    private String countryCode;

    /**
     * 사전 등록된 발신번호.
     */
    @JsonProperty(value = "from", required = true)
    private String from;

    /**
     * 기본 메시지 제목. (LMS, MMS에서만 사용가능).
     */
    @JsonProperty(value = "subject")
    private String subject;

    /**
     * 메시지 컨텐츠 구분. (COMM: 일반미시지, AD: 광고메시지).
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /**
     * 기본 메시지 컨텐츠 내용.
     */
    @JsonProperty(value = "content", required = true)
    private String content;

    /**
     * 예약 발송 시간.
     */
    @JsonProperty(value = "reserveTime")
    private String reserveTime;

    /**
     * 예약 시간 시간대 (default: Asia/Seoul).
     */
    @JsonProperty(value = "reserveTimeZone")
    private String reserveTimeZone;

    /**
     * 발송할 스케줄 코드.
     */
    @JsonProperty(value = "scheduleCode")
    private String scheduleCode;

    /**
     * The messages property.
     */
    @JsonProperty(value = "messages", required = true)
    private List<SMSMessageRequestParameterMessagesItem> messages;

    /**
     * The files property.
     */
    @JsonProperty(value = "files")
    private List<SMSMessageRequestParameterFilesItem> files;

    /**
     * Get 메시지 구분. (SMS, LMS, MMS).
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set 메시지 구분. (SMS, LMS, MMS).
     *
     * @param type the type value to set
     * @return the SMSMessageRequestParameter object itself.
     */
    public SMSMessageRequestParameter withType(String type) {
        this.type = type;
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
     * @return the SMSMessageRequestParameter object itself.
     */
    public SMSMessageRequestParameter withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get 사전 등록된 발신번호.
     *
     * @return the from value
     */
    public String from() {
        return this.from;
    }

    /**
     * Set 사전 등록된 발신번호.
     *
     * @param from the from value to set
     * @return the SMSMessageRequestParameter object itself.
     */
    public SMSMessageRequestParameter withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Get 기본 메시지 제목. (LMS, MMS에서만 사용가능).
     *
     * @return the subject value
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Set 기본 메시지 제목. (LMS, MMS에서만 사용가능).
     *
     * @param subject the subject value to set
     * @return the SMSMessageRequestParameter object itself.
     */
    public SMSMessageRequestParameter withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get 메시지 컨텐츠 구분. (COMM: 일반미시지, AD: 광고메시지).
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set 메시지 컨텐츠 구분. (COMM: 일반미시지, AD: 광고메시지).
     *
     * @param contentType the contentType value to set
     * @return the SMSMessageRequestParameter object itself.
     */
    public SMSMessageRequestParameter withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get 기본 메시지 컨텐츠 내용.
     *
     * @return the content value
     */
    public String content() {
        return this.content;
    }

    /**
     * Set 기본 메시지 컨텐츠 내용.
     *
     * @param content the content value to set
     * @return the SMSMessageRequestParameter object itself.
     */
    public SMSMessageRequestParameter withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get 예약 발송 시간.
     *
     * @return the reserveTime value
     */
    public String reserveTime() {
        return this.reserveTime;
    }

    /**
     * Set 예약 발송 시간.
     *
     * @param reserveTime the reserveTime value to set
     * @return the SMSMessageRequestParameter object itself.
     */
    public SMSMessageRequestParameter withReserveTime(String reserveTime) {
        this.reserveTime = reserveTime;
        return this;
    }

    /**
     * Get 예약 시간 시간대 (default: Asia/Seoul).
     *
     * @return the reserveTimeZone value
     */
    public String reserveTimeZone() {
        return this.reserveTimeZone;
    }

    /**
     * Set 예약 시간 시간대 (default: Asia/Seoul).
     *
     * @param reserveTimeZone the reserveTimeZone value to set
     * @return the SMSMessageRequestParameter object itself.
     */
    public SMSMessageRequestParameter withReserveTimeZone(String reserveTimeZone) {
        this.reserveTimeZone = reserveTimeZone;
        return this;
    }

    /**
     * Get 발송할 스케줄 코드.
     *
     * @return the scheduleCode value
     */
    public String scheduleCode() {
        return this.scheduleCode;
    }

    /**
     * Set 발송할 스케줄 코드.
     *
     * @param scheduleCode the scheduleCode value to set
     * @return the SMSMessageRequestParameter object itself.
     */
    public SMSMessageRequestParameter withScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
        return this;
    }

    /**
     * Get the messages value.
     *
     * @return the messages value
     */
    public List<SMSMessageRequestParameterMessagesItem> messages() {
        return this.messages;
    }

    /**
     * Set the messages value.
     *
     * @param messages the messages value to set
     * @return the SMSMessageRequestParameter object itself.
     */
    public SMSMessageRequestParameter withMessages(List<SMSMessageRequestParameterMessagesItem> messages) {
        this.messages = messages;
        return this;
    }

    /**
     * Get the files value.
     *
     * @return the files value
     */
    public List<SMSMessageRequestParameterFilesItem> files() {
        return this.files;
    }

    /**
     * Set the files value.
     *
     * @param files the files value to set
     * @return the SMSMessageRequestParameter object itself.
     */
    public SMSMessageRequestParameter withFiles(List<SMSMessageRequestParameterFilesItem> files) {
        this.files = files;
        return this;
    }

}
