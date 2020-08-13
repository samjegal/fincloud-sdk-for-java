/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushMessageRequestParameter model.
 */
public class PushMessageRequestParameter {
    /**
     * The message property.
     */
    @JsonProperty(value = "message", required = true)
    private PushMessageRequestParameterMessage message;

    /**
     * (NOTIF|AD).
     */
    @JsonProperty(value = "messageType")
    private String messageType;

    /**
     * The target property.
     */
    @JsonProperty(value = "target", required = true)
    private PushMessageRequestParameterTarget target;

    /**
     * 등록하려는 스케줄 코드.
     */
    @JsonProperty(value = "scheduleCode")
    private String scheduleCode;

    /**
     * 예약시간 (yyyy-MM-dd HH:mm).
     */
    @JsonProperty(value = "reserveTime")
    private String reserveTime;

    /**
     * 예약시간 타임존 (Area/Name. IANA time zone database) *default: Asia/Seoul.
     */
    @JsonProperty(value = "reserveTimeZone")
    private String reserveTimeZone;

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public PushMessageRequestParameterMessage message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the PushMessageRequestParameter object itself.
     */
    public PushMessageRequestParameter withMessage(PushMessageRequestParameterMessage message) {
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
     * @return the PushMessageRequestParameter object itself.
     */
    public PushMessageRequestParameter withMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * Get the target value.
     *
     * @return the target value
     */
    public PushMessageRequestParameterTarget target() {
        return this.target;
    }

    /**
     * Set the target value.
     *
     * @param target the target value to set
     * @return the PushMessageRequestParameter object itself.
     */
    public PushMessageRequestParameter withTarget(PushMessageRequestParameterTarget target) {
        this.target = target;
        return this;
    }

    /**
     * Get 등록하려는 스케줄 코드.
     *
     * @return the scheduleCode value
     */
    public String scheduleCode() {
        return this.scheduleCode;
    }

    /**
     * Set 등록하려는 스케줄 코드.
     *
     * @param scheduleCode the scheduleCode value to set
     * @return the PushMessageRequestParameter object itself.
     */
    public PushMessageRequestParameter withScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
        return this;
    }

    /**
     * Get 예약시간 (yyyy-MM-dd HH:mm).
     *
     * @return the reserveTime value
     */
    public String reserveTime() {
        return this.reserveTime;
    }

    /**
     * Set 예약시간 (yyyy-MM-dd HH:mm).
     *
     * @param reserveTime the reserveTime value to set
     * @return the PushMessageRequestParameter object itself.
     */
    public PushMessageRequestParameter withReserveTime(String reserveTime) {
        this.reserveTime = reserveTime;
        return this;
    }

    /**
     * Get 예약시간 타임존 (Area/Name. IANA time zone database) *default: Asia/Seoul.
     *
     * @return the reserveTimeZone value
     */
    public String reserveTimeZone() {
        return this.reserveTimeZone;
    }

    /**
     * Set 예약시간 타임존 (Area/Name. IANA time zone database) *default: Asia/Seoul.
     *
     * @param reserveTimeZone the reserveTimeZone value to set
     * @return the PushMessageRequestParameter object itself.
     */
    public PushMessageRequestParameter withReserveTimeZone(String reserveTimeZone) {
        this.reserveTimeZone = reserveTimeZone;
        return this;
    }

}
