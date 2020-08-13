/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AlimTalkMessageRequestParameter model.
 */
public class AlimTalkMessageRequestParameter {
    /**
     * The templateCode property.
     */
    @JsonProperty(value = "templateCode", required = true)
    private String templateCode;

    /**
     * The plusFriendId property.
     */
    @JsonProperty(value = "plusFriendId", required = true)
    private String plusFriendId;

    /**
     * The messages property.
     */
    @JsonProperty(value = "messages", required = true)
    private List<AlimTalkMessageRequestParameterMessagesItem> messages;

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
     * Get the templateCode value.
     *
     * @return the templateCode value
     */
    public String templateCode() {
        return this.templateCode;
    }

    /**
     * Set the templateCode value.
     *
     * @param templateCode the templateCode value to set
     * @return the AlimTalkMessageRequestParameter object itself.
     */
    public AlimTalkMessageRequestParameter withTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }

    /**
     * Get the plusFriendId value.
     *
     * @return the plusFriendId value
     */
    public String plusFriendId() {
        return this.plusFriendId;
    }

    /**
     * Set the plusFriendId value.
     *
     * @param plusFriendId the plusFriendId value to set
     * @return the AlimTalkMessageRequestParameter object itself.
     */
    public AlimTalkMessageRequestParameter withPlusFriendId(String plusFriendId) {
        this.plusFriendId = plusFriendId;
        return this;
    }

    /**
     * Get the messages value.
     *
     * @return the messages value
     */
    public List<AlimTalkMessageRequestParameterMessagesItem> messages() {
        return this.messages;
    }

    /**
     * Set the messages value.
     *
     * @param messages the messages value to set
     * @return the AlimTalkMessageRequestParameter object itself.
     */
    public AlimTalkMessageRequestParameter withMessages(List<AlimTalkMessageRequestParameterMessagesItem> messages) {
        this.messages = messages;
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
     * @return the AlimTalkMessageRequestParameter object itself.
     */
    public AlimTalkMessageRequestParameter withScheduleCode(String scheduleCode) {
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
     * @return the AlimTalkMessageRequestParameter object itself.
     */
    public AlimTalkMessageRequestParameter withReserveTime(String reserveTime) {
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
     * @return the AlimTalkMessageRequestParameter object itself.
     */
    public AlimTalkMessageRequestParameter withReserveTimeZone(String reserveTimeZone) {
        this.reserveTimeZone = reserveTimeZone;
        return this;
    }

}
