/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The WMSListParameter model.
 */
public class WMSListParameter {
    /**
     * 스크립트 ID.
     */
    @JsonProperty(value = "scriptId")
    private String scriptId;

    /**
     * 모니터링 주기.
     */
    @JsonProperty(value = "interval")
    private Integer interval;

    /**
     * 요청 제한 시간 (millisecond).
     */
    @JsonProperty(value = "requestTimeout")
    private Integer requestTimeout;

    /**
     * 실행 제한 시간 (millisecond).
     */
    @JsonProperty(value = "runTimeout")
    private Integer runTimeout;

    /**
     * 서비스 유형. Possible values include: 'PC', 'MOBILE'.
     */
    @JsonProperty(value = "serviceType")
    private WMSServiceType serviceType;

    /**
     * 모니터링 상태. Possible values include: 'ON', 'OFF'.
     */
    @JsonProperty(value = "statusType")
    private WMSStatusType statusType;

    /**
     * 모니터링 유형. Possible values include: 'URL', 'SCENARIO'.
     */
    @JsonProperty(value = "monitoringType")
    private WMSMonitoringType monitoringType;

    /**
     * 알람 상태. Possible values include: 'ON', 'OFF'.
     */
    @JsonProperty(value = "alarmStatus")
    private WMSAlarmStatus alarmStatus;

    /**
     * 알람 발송 조건.
     */
    @JsonProperty(value = "alarmTrigger")
    private Integer alarmTrigger;

    /**
     * 알람 발송 간격 (단위:시).
     */
    @JsonProperty(value = "alarmInterval")
    private Integer alarmInterval;

    /**
     * URL.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * 최근 모니터링 시간.
     */
    @JsonProperty(value = "recentMonitoringTime")
    private Double recentMonitoringTime;

    /**
     * 국가 정보.
     */
    @JsonProperty(value = "locations")
    private List<WMSLocationInfoParameter> locations;

    /**
     * Get 스크립트 ID.
     *
     * @return the scriptId value
     */
    public String scriptId() {
        return this.scriptId;
    }

    /**
     * Set 스크립트 ID.
     *
     * @param scriptId the scriptId value to set
     * @return the WMSListParameter object itself.
     */
    public WMSListParameter withScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    /**
     * Get 모니터링 주기.
     *
     * @return the interval value
     */
    public Integer interval() {
        return this.interval;
    }

    /**
     * Set 모니터링 주기.
     *
     * @param interval the interval value to set
     * @return the WMSListParameter object itself.
     */
    public WMSListParameter withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get 요청 제한 시간 (millisecond).
     *
     * @return the requestTimeout value
     */
    public Integer requestTimeout() {
        return this.requestTimeout;
    }

    /**
     * Set 요청 제한 시간 (millisecond).
     *
     * @param requestTimeout the requestTimeout value to set
     * @return the WMSListParameter object itself.
     */
    public WMSListParameter withRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }

    /**
     * Get 실행 제한 시간 (millisecond).
     *
     * @return the runTimeout value
     */
    public Integer runTimeout() {
        return this.runTimeout;
    }

    /**
     * Set 실행 제한 시간 (millisecond).
     *
     * @param runTimeout the runTimeout value to set
     * @return the WMSListParameter object itself.
     */
    public WMSListParameter withRunTimeout(Integer runTimeout) {
        this.runTimeout = runTimeout;
        return this;
    }

    /**
     * Get 서비스 유형. Possible values include: 'PC', 'MOBILE'.
     *
     * @return the serviceType value
     */
    public WMSServiceType serviceType() {
        return this.serviceType;
    }

    /**
     * Set 서비스 유형. Possible values include: 'PC', 'MOBILE'.
     *
     * @param serviceType the serviceType value to set
     * @return the WMSListParameter object itself.
     */
    public WMSListParameter withServiceType(WMSServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * Get 모니터링 상태. Possible values include: 'ON', 'OFF'.
     *
     * @return the statusType value
     */
    public WMSStatusType statusType() {
        return this.statusType;
    }

    /**
     * Set 모니터링 상태. Possible values include: 'ON', 'OFF'.
     *
     * @param statusType the statusType value to set
     * @return the WMSListParameter object itself.
     */
    public WMSListParameter withStatusType(WMSStatusType statusType) {
        this.statusType = statusType;
        return this;
    }

    /**
     * Get 모니터링 유형. Possible values include: 'URL', 'SCENARIO'.
     *
     * @return the monitoringType value
     */
    public WMSMonitoringType monitoringType() {
        return this.monitoringType;
    }

    /**
     * Set 모니터링 유형. Possible values include: 'URL', 'SCENARIO'.
     *
     * @param monitoringType the monitoringType value to set
     * @return the WMSListParameter object itself.
     */
    public WMSListParameter withMonitoringType(WMSMonitoringType monitoringType) {
        this.monitoringType = monitoringType;
        return this;
    }

    /**
     * Get 알람 상태. Possible values include: 'ON', 'OFF'.
     *
     * @return the alarmStatus value
     */
    public WMSAlarmStatus alarmStatus() {
        return this.alarmStatus;
    }

    /**
     * Set 알람 상태. Possible values include: 'ON', 'OFF'.
     *
     * @param alarmStatus the alarmStatus value to set
     * @return the WMSListParameter object itself.
     */
    public WMSListParameter withAlarmStatus(WMSAlarmStatus alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }

    /**
     * Get 알람 발송 조건.
     *
     * @return the alarmTrigger value
     */
    public Integer alarmTrigger() {
        return this.alarmTrigger;
    }

    /**
     * Set 알람 발송 조건.
     *
     * @param alarmTrigger the alarmTrigger value to set
     * @return the WMSListParameter object itself.
     */
    public WMSListParameter withAlarmTrigger(Integer alarmTrigger) {
        this.alarmTrigger = alarmTrigger;
        return this;
    }

    /**
     * Get 알람 발송 간격 (단위:시).
     *
     * @return the alarmInterval value
     */
    public Integer alarmInterval() {
        return this.alarmInterval;
    }

    /**
     * Set 알람 발송 간격 (단위:시).
     *
     * @param alarmInterval the alarmInterval value to set
     * @return the WMSListParameter object itself.
     */
    public WMSListParameter withAlarmInterval(Integer alarmInterval) {
        this.alarmInterval = alarmInterval;
        return this;
    }

    /**
     * Get uRL.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set uRL.
     *
     * @param url the url value to set
     * @return the WMSListParameter object itself.
     */
    public WMSListParameter withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get 최근 모니터링 시간.
     *
     * @return the recentMonitoringTime value
     */
    public Double recentMonitoringTime() {
        return this.recentMonitoringTime;
    }

    /**
     * Set 최근 모니터링 시간.
     *
     * @param recentMonitoringTime the recentMonitoringTime value to set
     * @return the WMSListParameter object itself.
     */
    public WMSListParameter withRecentMonitoringTime(Double recentMonitoringTime) {
        this.recentMonitoringTime = recentMonitoringTime;
        return this;
    }

    /**
     * Get 국가 정보.
     *
     * @return the locations value
     */
    public List<WMSLocationInfoParameter> locations() {
        return this.locations;
    }

    /**
     * Set 국가 정보.
     *
     * @param locations the locations value to set
     * @return the WMSListParameter object itself.
     */
    public WMSListParameter withLocations(List<WMSLocationInfoParameter> locations) {
        this.locations = locations;
        return this;
    }

}
