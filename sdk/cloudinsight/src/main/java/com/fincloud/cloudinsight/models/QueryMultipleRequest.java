/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QueryDataMultiple.
 * Cloud Insight에서 수집한 여러개의 time-series 데이터를 쿼리합니다.
 */
public class QueryMultipleRequest {
    /**
     * 요청할 Metric 정보.
     */
    @JsonProperty(value = "metricInfoList", required = true)
    private List<MetricInfoParameter> metricInfoList;

    /**
     * 최초 조회 시간.
     */
    @JsonProperty(value = "timeStart", required = true)
    private double timeStart;

    /**
     * 마지막 조회 시간.
     */
    @JsonProperty(value = "timeEnd", required = true)
    private double timeEnd;

    /**
     * Get 요청할 Metric 정보.
     *
     * @return the metricInfoList value
     */
    public List<MetricInfoParameter> metricInfoList() {
        return this.metricInfoList;
    }

    /**
     * Set 요청할 Metric 정보.
     *
     * @param metricInfoList the metricInfoList value to set
     * @return the QueryMultipleRequest object itself.
     */
    public QueryMultipleRequest withMetricInfoList(List<MetricInfoParameter> metricInfoList) {
        this.metricInfoList = metricInfoList;
        return this;
    }

    /**
     * Get 최초 조회 시간.
     *
     * @return the timeStart value
     */
    public double timeStart() {
        return this.timeStart;
    }

    /**
     * Set 최초 조회 시간.
     *
     * @param timeStart the timeStart value to set
     * @return the QueryMultipleRequest object itself.
     */
    public QueryMultipleRequest withTimeStart(double timeStart) {
        this.timeStart = timeStart;
        return this;
    }

    /**
     * Get 마지막 조회 시간.
     *
     * @return the timeEnd value
     */
    public double timeEnd() {
        return this.timeEnd;
    }

    /**
     * Set 마지막 조회 시간.
     *
     * @param timeEnd the timeEnd value to set
     * @return the QueryMultipleRequest object itself.
     */
    public QueryMultipleRequest withTimeEnd(double timeEnd) {
        this.timeEnd = timeEnd;
        return this;
    }

}
