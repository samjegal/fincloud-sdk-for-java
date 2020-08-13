/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The WMSDetailParameter model.
 */
public class WMSDetailParameter {
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
     * 모니터링 전체 횟수.
     */
    @JsonProperty(value = "totalCount")
    private Integer totalCount;

    /**
     * 모니터링 결과가 정상인 횟수.
     */
    @JsonProperty(value = "successCount")
    private Integer successCount;

    /**
     * 오류가 감지된 횟수.
     */
    @JsonProperty(value = "errorCount")
    private Integer errorCount;

    /**
     * URL 평균 Load time.
     */
    @JsonProperty(value = "avgLoadTime")
    private Integer avgLoadTime;

    /**
     * 최근 모니터링 시간.
     */
    @JsonProperty(value = "recentMonitoringTime")
    private Double recentMonitoringTime;

    /**
     * 생성 시간.
     */
    @JsonProperty(value = "createDate")
    private Double createDate;

    /**
     * 국가 정보.
     */
    @JsonProperty(value = "locations")
    private List<WMSLocationInfoParameter> locations;

    /**
     * 필터 정보.
     */
    @JsonProperty(value = "filters")
    private List<WMSFilterParameter> filters;

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
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withScriptId(String scriptId) {
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
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withInterval(Integer interval) {
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
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withRequestTimeout(Integer requestTimeout) {
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
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withRunTimeout(Integer runTimeout) {
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
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withServiceType(WMSServiceType serviceType) {
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
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withStatusType(WMSStatusType statusType) {
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
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withMonitoringType(WMSMonitoringType monitoringType) {
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
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withAlarmStatus(WMSAlarmStatus alarmStatus) {
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
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withAlarmTrigger(Integer alarmTrigger) {
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
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withAlarmInterval(Integer alarmInterval) {
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
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get 모니터링 전체 횟수.
     *
     * @return the totalCount value
     */
    public Integer totalCount() {
        return this.totalCount;
    }

    /**
     * Set 모니터링 전체 횟수.
     *
     * @param totalCount the totalCount value to set
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get 모니터링 결과가 정상인 횟수.
     *
     * @return the successCount value
     */
    public Integer successCount() {
        return this.successCount;
    }

    /**
     * Set 모니터링 결과가 정상인 횟수.
     *
     * @param successCount the successCount value to set
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * Get 오류가 감지된 횟수.
     *
     * @return the errorCount value
     */
    public Integer errorCount() {
        return this.errorCount;
    }

    /**
     * Set 오류가 감지된 횟수.
     *
     * @param errorCount the errorCount value to set
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    /**
     * Get uRL 평균 Load time.
     *
     * @return the avgLoadTime value
     */
    public Integer avgLoadTime() {
        return this.avgLoadTime;
    }

    /**
     * Set uRL 평균 Load time.
     *
     * @param avgLoadTime the avgLoadTime value to set
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withAvgLoadTime(Integer avgLoadTime) {
        this.avgLoadTime = avgLoadTime;
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
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withRecentMonitoringTime(Double recentMonitoringTime) {
        this.recentMonitoringTime = recentMonitoringTime;
        return this;
    }

    /**
     * Get 생성 시간.
     *
     * @return the createDate value
     */
    public Double createDate() {
        return this.createDate;
    }

    /**
     * Set 생성 시간.
     *
     * @param createDate the createDate value to set
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withCreateDate(Double createDate) {
        this.createDate = createDate;
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
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withLocations(List<WMSLocationInfoParameter> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get 필터 정보.
     *
     * @return the filters value
     */
    public List<WMSFilterParameter> filters() {
        return this.filters;
    }

    /**
     * Set 필터 정보.
     *
     * @param filters the filters value to set
     * @return the WMSDetailParameter object itself.
     */
    public WMSDetailParameter withFilters(List<WMSFilterParameter> filters) {
        this.filters = filters;
        return this;
    }

}
