/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WidgetMetricInfo.
 */
public class WidgetMetricInfoResponse {
    /**
     * Widget에서 보여지는 Chart의 color.
     */
    @JsonProperty(value = "color")
    private String color;

    /**
     * 조회된 결과.
     */
    @JsonProperty(value = "data")
    private List<Object> data;

    /**
     * 조회하려는 데이터의 Dimension 이름.
     */
    @JsonProperty(value = "dimensions")
    private Map<String, String> dimensions;

    /**
     * Widget에서 보여지는 Metric의 이름.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * 조회하려는 Metric 이름.
     */
    @JsonProperty(value = "metric")
    private String metric;

    /**
     * 조회하려는 집계 주기. Possible values include: 'Min1', 'Min5', 'Min30', 'Hour2',
     * 'Day1'.
     */
    @JsonProperty(value = "period")
    private WidgetMetricInfoPeriod periodProperty;

    /**
     * 상품의 cw_key.
     */
    @JsonProperty(value = "prodKey")
    private String prodKey;

    /**
     * 상품의 이름.
     */
    @JsonProperty(value = "prodName")
    private String prodName;

    /**
     * 메트릭 쿼리 집계. Possible values include: 'AVG', 'COUNT', 'FIRST', 'LAST',
     * 'MAX', 'MIMMAX', 'MIMMIN', 'MIN', 'MULT', 'NONE', 'SUM', 'ZIMSUM'.
     */
    @JsonProperty(value = "queryAggregation")
    private WidgetMetricInfoQueryAggregation queryAggregation;

    /**
     * 메트릭 통계. Possible values include: 'COUNT', 'SUM', 'MAX', 'MIN', 'AVG',
     * 'COUNTER'.
     */
    @JsonProperty(value = "statistic")
    private WidgetMetricInfoStatistic statistic;

    /**
     * Get widget에서 보여지는 Chart의 color.
     *
     * @return the color value
     */
    public String color() {
        return this.color;
    }

    /**
     * Set widget에서 보여지는 Chart의 color.
     *
     * @param color the color value to set
     * @return the WidgetMetricInfoResponse object itself.
     */
    public WidgetMetricInfoResponse withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * Get 조회된 결과.
     *
     * @return the data value
     */
    public List<Object> data() {
        return this.data;
    }

    /**
     * Set 조회된 결과.
     *
     * @param data the data value to set
     * @return the WidgetMetricInfoResponse object itself.
     */
    public WidgetMetricInfoResponse withData(List<Object> data) {
        this.data = data;
        return this;
    }

    /**
     * Get 조회하려는 데이터의 Dimension 이름.
     *
     * @return the dimensions value
     */
    public Map<String, String> dimensions() {
        return this.dimensions;
    }

    /**
     * Set 조회하려는 데이터의 Dimension 이름.
     *
     * @param dimensions the dimensions value to set
     * @return the WidgetMetricInfoResponse object itself.
     */
    public WidgetMetricInfoResponse withDimensions(Map<String, String> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get widget에서 보여지는 Metric의 이름.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set widget에서 보여지는 Metric의 이름.
     *
     * @param displayName the displayName value to set
     * @return the WidgetMetricInfoResponse object itself.
     */
    public WidgetMetricInfoResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get 조회하려는 Metric 이름.
     *
     * @return the metric value
     */
    public String metric() {
        return this.metric;
    }

    /**
     * Set 조회하려는 Metric 이름.
     *
     * @param metric the metric value to set
     * @return the WidgetMetricInfoResponse object itself.
     */
    public WidgetMetricInfoResponse withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Get 조회하려는 집계 주기. Possible values include: 'Min1', 'Min5', 'Min30', 'Hour2', 'Day1'.
     *
     * @return the periodProperty value
     */
    public WidgetMetricInfoPeriod periodProperty() {
        return this.periodProperty;
    }

    /**
     * Set 조회하려는 집계 주기. Possible values include: 'Min1', 'Min5', 'Min30', 'Hour2', 'Day1'.
     *
     * @param periodProperty the periodProperty value to set
     * @return the WidgetMetricInfoResponse object itself.
     */
    public WidgetMetricInfoResponse withPeriodProperty(WidgetMetricInfoPeriod periodProperty) {
        this.periodProperty = periodProperty;
        return this;
    }

    /**
     * Get 상품의 cw_key.
     *
     * @return the prodKey value
     */
    public String prodKey() {
        return this.prodKey;
    }

    /**
     * Set 상품의 cw_key.
     *
     * @param prodKey the prodKey value to set
     * @return the WidgetMetricInfoResponse object itself.
     */
    public WidgetMetricInfoResponse withProdKey(String prodKey) {
        this.prodKey = prodKey;
        return this;
    }

    /**
     * Get 상품의 이름.
     *
     * @return the prodName value
     */
    public String prodName() {
        return this.prodName;
    }

    /**
     * Set 상품의 이름.
     *
     * @param prodName the prodName value to set
     * @return the WidgetMetricInfoResponse object itself.
     */
    public WidgetMetricInfoResponse withProdName(String prodName) {
        this.prodName = prodName;
        return this;
    }

    /**
     * Get 메트릭 쿼리 집계. Possible values include: 'AVG', 'COUNT', 'FIRST', 'LAST', 'MAX', 'MIMMAX', 'MIMMIN', 'MIN', 'MULT', 'NONE', 'SUM', 'ZIMSUM'.
     *
     * @return the queryAggregation value
     */
    public WidgetMetricInfoQueryAggregation queryAggregation() {
        return this.queryAggregation;
    }

    /**
     * Set 메트릭 쿼리 집계. Possible values include: 'AVG', 'COUNT', 'FIRST', 'LAST', 'MAX', 'MIMMAX', 'MIMMIN', 'MIN', 'MULT', 'NONE', 'SUM', 'ZIMSUM'.
     *
     * @param queryAggregation the queryAggregation value to set
     * @return the WidgetMetricInfoResponse object itself.
     */
    public WidgetMetricInfoResponse withQueryAggregation(WidgetMetricInfoQueryAggregation queryAggregation) {
        this.queryAggregation = queryAggregation;
        return this;
    }

    /**
     * Get 메트릭 통계. Possible values include: 'COUNT', 'SUM', 'MAX', 'MIN', 'AVG', 'COUNTER'.
     *
     * @return the statistic value
     */
    public WidgetMetricInfoStatistic statistic() {
        return this.statistic;
    }

    /**
     * Set 메트릭 통계. Possible values include: 'COUNT', 'SUM', 'MAX', 'MIN', 'AVG', 'COUNTER'.
     *
     * @param statistic the statistic value to set
     * @return the WidgetMetricInfoResponse object itself.
     */
    public WidgetMetricInfoResponse withStatistic(WidgetMetricInfoStatistic statistic) {
        this.statistic = statistic;
        return this;
    }

}
