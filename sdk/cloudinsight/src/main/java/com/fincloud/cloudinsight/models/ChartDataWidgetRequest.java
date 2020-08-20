/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChartDataWidgetRequest.
 * Metric 정보로 Preview Chart 조회.
 */
public class ChartDataWidgetRequest {
    /**
     * 데이터 조회를 위한 Metric 정보.
     */
    @JsonProperty(value = "metricsInfo", required = true)
    private List<WidgetMetricInfoParameter> metricsInfo;

    /**
     * 조회 종료 시간, default: 현재시간.
     */
    @JsonProperty(value = "periodEnd")
    private Long periodEnd;

    /**
     * 조회 시작 시간, default: 현재시간으로부터 1시간 이전.
     */
    @JsonProperty(value = "periodStart")
    private Long periodStart;

    /**
     * 위젯 타입. Possible values include: 'line', 'area', 'index', 'text',
     * 'table'.
     */
    @JsonProperty(value = "type", required = true)
    private ChartDataWidgetType type;

    /**
     * Get 데이터 조회를 위한 Metric 정보.
     *
     * @return the metricsInfo value
     */
    public List<WidgetMetricInfoParameter> metricsInfo() {
        return this.metricsInfo;
    }

    /**
     * Set 데이터 조회를 위한 Metric 정보.
     *
     * @param metricsInfo the metricsInfo value to set
     * @return the ChartDataWidgetRequest object itself.
     */
    public ChartDataWidgetRequest withMetricsInfo(List<WidgetMetricInfoParameter> metricsInfo) {
        this.metricsInfo = metricsInfo;
        return this;
    }

    /**
     * Get 조회 종료 시간, default: 현재시간.
     *
     * @return the periodEnd value
     */
    public Long periodEnd() {
        return this.periodEnd;
    }

    /**
     * Set 조회 종료 시간, default: 현재시간.
     *
     * @param periodEnd the periodEnd value to set
     * @return the ChartDataWidgetRequest object itself.
     */
    public ChartDataWidgetRequest withPeriodEnd(Long periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }

    /**
     * Get 조회 시작 시간, default: 현재시간으로부터 1시간 이전.
     *
     * @return the periodStart value
     */
    public Long periodStart() {
        return this.periodStart;
    }

    /**
     * Set 조회 시작 시간, default: 현재시간으로부터 1시간 이전.
     *
     * @param periodStart the periodStart value to set
     * @return the ChartDataWidgetRequest object itself.
     */
    public ChartDataWidgetRequest withPeriodStart(Long periodStart) {
        this.periodStart = periodStart;
        return this;
    }

    /**
     * Get 위젯 타입. Possible values include: 'line', 'area', 'index', 'text', 'table'.
     *
     * @return the type value
     */
    public ChartDataWidgetType type() {
        return this.type;
    }

    /**
     * Set 위젯 타입. Possible values include: 'line', 'area', 'index', 'text', 'table'.
     *
     * @param type the type value to set
     * @return the ChartDataWidgetRequest object itself.
     */
    public ChartDataWidgetRequest withType(ChartDataWidgetType type) {
        this.type = type;
        return this;
    }

}
