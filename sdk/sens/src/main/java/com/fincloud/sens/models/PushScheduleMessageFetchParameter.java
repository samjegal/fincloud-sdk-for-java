/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushScheduleMessageFetchParameter model.
 */
public class PushScheduleMessageFetchParameter {
    /**
     * 메시지 아이디.
     */
    @JsonProperty(value = "messageId")
    private String messageId;

    /**
     * 스케줄 아이디.
     */
    @JsonProperty(value = "scheduleId")
    private String scheduleId;

    /**
     * 서비스 아이디.
     */
    @JsonProperty(value = "serviceId")
    private String serviceId;

    /**
     * 메시지 요청 JSON string.
     */
    @JsonProperty(value = "message")
    private String message;

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
     * @return the PushScheduleMessageFetchParameter object itself.
     */
    public PushScheduleMessageFetchParameter withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get 스케줄 아이디.
     *
     * @return the scheduleId value
     */
    public String scheduleId() {
        return this.scheduleId;
    }

    /**
     * Set 스케줄 아이디.
     *
     * @param scheduleId the scheduleId value to set
     * @return the PushScheduleMessageFetchParameter object itself.
     */
    public PushScheduleMessageFetchParameter withScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }

    /**
     * Get 서비스 아이디.
     *
     * @return the serviceId value
     */
    public String serviceId() {
        return this.serviceId;
    }

    /**
     * Set 서비스 아이디.
     *
     * @param serviceId the serviceId value to set
     * @return the PushScheduleMessageFetchParameter object itself.
     */
    public PushScheduleMessageFetchParameter withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Get 메시지 요청 JSON string.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set 메시지 요청 JSON string.
     *
     * @param message the message value to set
     * @return the PushScheduleMessageFetchParameter object itself.
     */
    public PushScheduleMessageFetchParameter withMessage(String message) {
        this.message = message;
        return this;
    }

}
