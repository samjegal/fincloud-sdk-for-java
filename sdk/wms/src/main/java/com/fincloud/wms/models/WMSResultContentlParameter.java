/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The WMSResultContentlParameter model.
 */
public class WMSResultContentlParameter {
    /**
     * 모니터링 시작 시간.
     */
    @JsonProperty(value = "monitoringTime")
    private Double monitoringTime;

    /**
     * 모니터링 구동 시간.
     */
    @JsonProperty(value = "runTime")
    private Integer runTime;

    /**
     * URL Load time.
     */
    @JsonProperty(value = "loadTime")
    private Integer loadTime;

    /**
     * 서비스 접속 후 다운로드한 컨텐츠 수.
     */
    @JsonProperty(value = "requestCount")
    private Integer requestCount;

    /**
     * 감지된 오류수.
     */
    @JsonProperty(value = "errorCount")
    private Integer errorCount;

    /**
     * 모니터링 결과. Possible values include: 'SUCCESS', 'FAIL'.
     */
    @JsonProperty(value = "result")
    private WMSResult result;

    /**
     * 국가 코드. Possible values include: 'KR', 'US', 'JP', 'HK', 'SG'.
     */
    @JsonProperty(value = "locationName")
    private WMSLocationName locationName;

    /**
     * 국가명.
     */
    @JsonProperty(value = "locationCode")
    private String locationCode;

    /**
     * 모니터링 유형이 URL인 경우.
     */
    @JsonProperty(value = "logs")
    private WMSResultContentLogParameter logs;

    /**
     * 모니터링 유형이 SCENARIO인 경우.
     */
    @JsonProperty(value = "data")
    private WMSResultContentDataParameter data;

    /**
     * Get 모니터링 시작 시간.
     *
     * @return the monitoringTime value
     */
    public Double monitoringTime() {
        return this.monitoringTime;
    }

    /**
     * Set 모니터링 시작 시간.
     *
     * @param monitoringTime the monitoringTime value to set
     * @return the WMSResultContentlParameter object itself.
     */
    public WMSResultContentlParameter withMonitoringTime(Double monitoringTime) {
        this.monitoringTime = monitoringTime;
        return this;
    }

    /**
     * Get 모니터링 구동 시간.
     *
     * @return the runTime value
     */
    public Integer runTime() {
        return this.runTime;
    }

    /**
     * Set 모니터링 구동 시간.
     *
     * @param runTime the runTime value to set
     * @return the WMSResultContentlParameter object itself.
     */
    public WMSResultContentlParameter withRunTime(Integer runTime) {
        this.runTime = runTime;
        return this;
    }

    /**
     * Get uRL Load time.
     *
     * @return the loadTime value
     */
    public Integer loadTime() {
        return this.loadTime;
    }

    /**
     * Set uRL Load time.
     *
     * @param loadTime the loadTime value to set
     * @return the WMSResultContentlParameter object itself.
     */
    public WMSResultContentlParameter withLoadTime(Integer loadTime) {
        this.loadTime = loadTime;
        return this;
    }

    /**
     * Get 서비스 접속 후 다운로드한 컨텐츠 수.
     *
     * @return the requestCount value
     */
    public Integer requestCount() {
        return this.requestCount;
    }

    /**
     * Set 서비스 접속 후 다운로드한 컨텐츠 수.
     *
     * @param requestCount the requestCount value to set
     * @return the WMSResultContentlParameter object itself.
     */
    public WMSResultContentlParameter withRequestCount(Integer requestCount) {
        this.requestCount = requestCount;
        return this;
    }

    /**
     * Get 감지된 오류수.
     *
     * @return the errorCount value
     */
    public Integer errorCount() {
        return this.errorCount;
    }

    /**
     * Set 감지된 오류수.
     *
     * @param errorCount the errorCount value to set
     * @return the WMSResultContentlParameter object itself.
     */
    public WMSResultContentlParameter withErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    /**
     * Get 모니터링 결과. Possible values include: 'SUCCESS', 'FAIL'.
     *
     * @return the result value
     */
    public WMSResult result() {
        return this.result;
    }

    /**
     * Set 모니터링 결과. Possible values include: 'SUCCESS', 'FAIL'.
     *
     * @param result the result value to set
     * @return the WMSResultContentlParameter object itself.
     */
    public WMSResultContentlParameter withResult(WMSResult result) {
        this.result = result;
        return this;
    }

    /**
     * Get 국가 코드. Possible values include: 'KR', 'US', 'JP', 'HK', 'SG'.
     *
     * @return the locationName value
     */
    public WMSLocationName locationName() {
        return this.locationName;
    }

    /**
     * Set 국가 코드. Possible values include: 'KR', 'US', 'JP', 'HK', 'SG'.
     *
     * @param locationName the locationName value to set
     * @return the WMSResultContentlParameter object itself.
     */
    public WMSResultContentlParameter withLocationName(WMSLocationName locationName) {
        this.locationName = locationName;
        return this;
    }

    /**
     * Get 국가명.
     *
     * @return the locationCode value
     */
    public String locationCode() {
        return this.locationCode;
    }

    /**
     * Set 국가명.
     *
     * @param locationCode the locationCode value to set
     * @return the WMSResultContentlParameter object itself.
     */
    public WMSResultContentlParameter withLocationCode(String locationCode) {
        this.locationCode = locationCode;
        return this;
    }

    /**
     * Get 모니터링 유형이 URL인 경우.
     *
     * @return the logs value
     */
    public WMSResultContentLogParameter logs() {
        return this.logs;
    }

    /**
     * Set 모니터링 유형이 URL인 경우.
     *
     * @param logs the logs value to set
     * @return the WMSResultContentlParameter object itself.
     */
    public WMSResultContentlParameter withLogs(WMSResultContentLogParameter logs) {
        this.logs = logs;
        return this;
    }

    /**
     * Get 모니터링 유형이 SCENARIO인 경우.
     *
     * @return the data value
     */
    public WMSResultContentDataParameter data() {
        return this.data;
    }

    /**
     * Set 모니터링 유형이 SCENARIO인 경우.
     *
     * @param data the data value to set
     * @return the WMSResultContentlParameter object itself.
     */
    public WMSResultContentlParameter withData(WMSResultContentDataParameter data) {
        this.data = data;
        return this;
    }

}
