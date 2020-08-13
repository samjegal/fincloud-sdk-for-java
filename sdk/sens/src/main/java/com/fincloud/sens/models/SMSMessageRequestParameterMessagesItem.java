/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SMSMessageRequestParameterMessagesItem model.
 */
public class SMSMessageRequestParameterMessagesItem {
    /**
     * 메시지 제목(정의하지 않으면 기본 메시지 제목을 사용).
     */
    @JsonProperty(value = "subject")
    private String subject;

    /**
     * 메시지 컨텐츠 내용(정의하지 않으면 기본 메시지 컨텐츠 내용을 사용).
     */
    @JsonProperty(value = "content")
    private String content;

    /**
     * 수신번호.
     */
    @JsonProperty(value = "to", required = true)
    private String to;

    /**
     * Get 메시지 제목(정의하지 않으면 기본 메시지 제목을 사용).
     *
     * @return the subject value
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Set 메시지 제목(정의하지 않으면 기본 메시지 제목을 사용).
     *
     * @param subject the subject value to set
     * @return the SMSMessageRequestParameterMessagesItem object itself.
     */
    public SMSMessageRequestParameterMessagesItem withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get 메시지 컨텐츠 내용(정의하지 않으면 기본 메시지 컨텐츠 내용을 사용).
     *
     * @return the content value
     */
    public String content() {
        return this.content;
    }

    /**
     * Set 메시지 컨텐츠 내용(정의하지 않으면 기본 메시지 컨텐츠 내용을 사용).
     *
     * @param content the content value to set
     * @return the SMSMessageRequestParameterMessagesItem object itself.
     */
    public SMSMessageRequestParameterMessagesItem withContent(String content) {
        this.content = content;
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
     * @return the SMSMessageRequestParameterMessagesItem object itself.
     */
    public SMSMessageRequestParameterMessagesItem withTo(String to) {
        this.to = to;
        return this;
    }

}
