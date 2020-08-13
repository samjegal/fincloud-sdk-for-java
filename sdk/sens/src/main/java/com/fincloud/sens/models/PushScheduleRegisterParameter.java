/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushScheduleRegisterParameter model.
 */
public class PushScheduleRegisterParameter {
    /**
     * 스케줄 코드. (알파벳/숫자/-/_).
     */
    @JsonProperty(value = "scheduleCode", required = true)
    private String scheduleCode;

    /**
     * 스케줄 설명.
     */
    @JsonProperty(value = "scheduleDesc")
    private String scheduleDesc;

    /**
     * 스케줄 타임존. (Area/Name. IANA time zone database) *default: Asia/Seoul,
     * 현지시간기준: LOCALTIME.
     */
    @JsonProperty(value = "scheduleTimeZone")
    private String scheduleTimeZone;

    /**
     * 스케줄 시/분 (HH:mm:ss) *초단위는 무시.
     */
    @JsonProperty(value = "scheduleTime", required = true)
    private String scheduleTime;

    /**
     * 시작일 (yyyy-MM-dd) *default: 오늘.
     */
    @JsonProperty(value = "startDate")
    private String startDate;

    /**
     * 종료일 (yyyy-MM-dd) *오늘부터 최대6개월.
     */
    @JsonProperty(value = "endDate", required = true)
    private String endDate;

    /**
     * ALL(매일), MON, TUE, WED, ..., SUN.
     */
    @JsonProperty(value = "dayOfWeeks", required = true)
    private List<String> dayOfWeeks;

    /**
     * Get 스케줄 코드. (알파벳/숫자/-/_).
     *
     * @return the scheduleCode value
     */
    public String scheduleCode() {
        return this.scheduleCode;
    }

    /**
     * Set 스케줄 코드. (알파벳/숫자/-/_).
     *
     * @param scheduleCode the scheduleCode value to set
     * @return the PushScheduleRegisterParameter object itself.
     */
    public PushScheduleRegisterParameter withScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
        return this;
    }

    /**
     * Get 스케줄 설명.
     *
     * @return the scheduleDesc value
     */
    public String scheduleDesc() {
        return this.scheduleDesc;
    }

    /**
     * Set 스케줄 설명.
     *
     * @param scheduleDesc the scheduleDesc value to set
     * @return the PushScheduleRegisterParameter object itself.
     */
    public PushScheduleRegisterParameter withScheduleDesc(String scheduleDesc) {
        this.scheduleDesc = scheduleDesc;
        return this;
    }

    /**
     * Get 스케줄 타임존. (Area/Name. IANA time zone database) *default: Asia/Seoul, 현지시간기준: LOCALTIME.
     *
     * @return the scheduleTimeZone value
     */
    public String scheduleTimeZone() {
        return this.scheduleTimeZone;
    }

    /**
     * Set 스케줄 타임존. (Area/Name. IANA time zone database) *default: Asia/Seoul, 현지시간기준: LOCALTIME.
     *
     * @param scheduleTimeZone the scheduleTimeZone value to set
     * @return the PushScheduleRegisterParameter object itself.
     */
    public PushScheduleRegisterParameter withScheduleTimeZone(String scheduleTimeZone) {
        this.scheduleTimeZone = scheduleTimeZone;
        return this;
    }

    /**
     * Get 스케줄 시/분 (HH:mm:ss) *초단위는 무시.
     *
     * @return the scheduleTime value
     */
    public String scheduleTime() {
        return this.scheduleTime;
    }

    /**
     * Set 스케줄 시/분 (HH:mm:ss) *초단위는 무시.
     *
     * @param scheduleTime the scheduleTime value to set
     * @return the PushScheduleRegisterParameter object itself.
     */
    public PushScheduleRegisterParameter withScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }

    /**
     * Get 시작일 (yyyy-MM-dd) *default: 오늘.
     *
     * @return the startDate value
     */
    public String startDate() {
        return this.startDate;
    }

    /**
     * Set 시작일 (yyyy-MM-dd) *default: 오늘.
     *
     * @param startDate the startDate value to set
     * @return the PushScheduleRegisterParameter object itself.
     */
    public PushScheduleRegisterParameter withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get 종료일 (yyyy-MM-dd) *오늘부터 최대6개월.
     *
     * @return the endDate value
     */
    public String endDate() {
        return this.endDate;
    }

    /**
     * Set 종료일 (yyyy-MM-dd) *오늘부터 최대6개월.
     *
     * @param endDate the endDate value to set
     * @return the PushScheduleRegisterParameter object itself.
     */
    public PushScheduleRegisterParameter withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get aLL(매일), MON, TUE, WED, ..., SUN.
     *
     * @return the dayOfWeeks value
     */
    public List<String> dayOfWeeks() {
        return this.dayOfWeeks;
    }

    /**
     * Set aLL(매일), MON, TUE, WED, ..., SUN.
     *
     * @param dayOfWeeks the dayOfWeeks value to set
     * @return the PushScheduleRegisterParameter object itself.
     */
    public PushScheduleRegisterParameter withDayOfWeeks(List<String> dayOfWeeks) {
        this.dayOfWeeks = dayOfWeeks;
        return this;
    }

}
