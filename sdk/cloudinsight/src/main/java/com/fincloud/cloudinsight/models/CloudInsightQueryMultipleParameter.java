/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CloudInsightQueryMultipleParameter model.
 */
public class CloudInsightQueryMultipleParameter {
    /**
     * 요청할 Metric 정보.
     */
    @JsonProperty(value = "metricInfoList")
    private List<CloudInsightMetricInfoParameter> metricInfoList;

    /**
     * 최초 조회 시간.
     */
    @JsonProperty(value = "timeStart")
    private Double timeStart;

    /**
     * 마지막 조회 시간.
     */
    @JsonProperty(value = "timeEnd")
    private Double timeEnd;

    /**
     * Get 요청할 Metric 정보.
     *
     * @return the metricInfoList value
     */
    public List<CloudInsightMetricInfoParameter> metricInfoList() {
        return this.metricInfoList;
    }

    /**
     * Set 요청할 Metric 정보.
     *
     * @param metricInfoList the metricInfoList value to set
     * @return the CloudInsightQueryMultipleParameter object itself.
     */
    public CloudInsightQueryMultipleParameter withMetricInfoList(List<CloudInsightMetricInfoParameter> metricInfoList) {
        this.metricInfoList = metricInfoList;
        return this;
    }

    /**
     * Get 최초 조회 시간.
     *
     * @return the timeStart value
     */
    public Double timeStart() {
        return this.timeStart;
    }

    /**
     * Set 최초 조회 시간.
     *
     * @param timeStart the timeStart value to set
     * @return the CloudInsightQueryMultipleParameter object itself.
     */
    public CloudInsightQueryMultipleParameter withTimeStart(Double timeStart) {
        this.timeStart = timeStart;
        return this;
    }

    /**
     * Get 마지막 조회 시간.
     *
     * @return the timeEnd value
     */
    public Double timeEnd() {
        return this.timeEnd;
    }

    /**
     * Set 마지막 조회 시간.
     *
     * @param timeEnd the timeEnd value to set
     * @return the CloudInsightQueryMultipleParameter object itself.
     */
    public CloudInsightQueryMultipleParameter withTimeEnd(Double timeEnd) {
        this.timeEnd = timeEnd;
        return this;
    }

}
