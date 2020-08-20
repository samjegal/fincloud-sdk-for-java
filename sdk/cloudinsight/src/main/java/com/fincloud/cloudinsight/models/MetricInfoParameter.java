/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataQueryRequestMetricInfo.
 * 데이터 조회 요청.
 */
public class MetricInfoParameter {
    /**
     * Schema 생성시 발급받은 키.
     */
    @JsonProperty(value = "prodkey")
    private String prodkey;

    /**
     * Product 이름.
     */
    @JsonProperty(value = "productName", required = true)
    private String productName;

    /**
     * Metric 이름.
     */
    @JsonProperty(value = "metric", required = true)
    private String metric;

    /**
     * 조회 시간 간격. Possible values include: 'MIN1', 'MIN5', 'MIN30', 'HOUR2',
     * 'DAY1'.
     */
    @JsonProperty(value = "interval", required = true)
    private QueryIntervalTime interval;

    /**
     * 일괄 처리. Possible values include: 'MIN', 'MAX', 'SUM', 'COUNT', 'AVG'.
     */
    @JsonProperty(value = "aggregation")
    private AggregationType aggregation;

    /**
     * Query 일괄 처리. Possible values include: 'AVG', 'COUNT', 'MIN', 'MAX',
     * 'NONE', 'SUM', 'FIRST', 'LAST', 'MULT'.
     */
    @JsonProperty(value = "queryAggregation")
    private QueryAggregationType queryAggregation;

    /**
     * Query Dimension 데이터.
     */
    @JsonProperty(value = "dimensions", required = true)
    private DimensionParameter dimensions;

    /**
     * Get schema 생성시 발급받은 키.
     *
     * @return the prodkey value
     */
    public String prodkey() {
        return this.prodkey;
    }

    /**
     * Set schema 생성시 발급받은 키.
     *
     * @param prodkey the prodkey value to set
     * @return the MetricInfoParameter object itself.
     */
    public MetricInfoParameter withProdkey(String prodkey) {
        this.prodkey = prodkey;
        return this;
    }

    /**
     * Get product 이름.
     *
     * @return the productName value
     */
    public String productName() {
        return this.productName;
    }

    /**
     * Set product 이름.
     *
     * @param productName the productName value to set
     * @return the MetricInfoParameter object itself.
     */
    public MetricInfoParameter withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * Get metric 이름.
     *
     * @return the metric value
     */
    public String metric() {
        return this.metric;
    }

    /**
     * Set metric 이름.
     *
     * @param metric the metric value to set
     * @return the MetricInfoParameter object itself.
     */
    public MetricInfoParameter withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Get 조회 시간 간격. Possible values include: 'MIN1', 'MIN5', 'MIN30', 'HOUR2', 'DAY1'.
     *
     * @return the interval value
     */
    public QueryIntervalTime interval() {
        return this.interval;
    }

    /**
     * Set 조회 시간 간격. Possible values include: 'MIN1', 'MIN5', 'MIN30', 'HOUR2', 'DAY1'.
     *
     * @param interval the interval value to set
     * @return the MetricInfoParameter object itself.
     */
    public MetricInfoParameter withInterval(QueryIntervalTime interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get 일괄 처리. Possible values include: 'MIN', 'MAX', 'SUM', 'COUNT', 'AVG'.
     *
     * @return the aggregation value
     */
    public AggregationType aggregation() {
        return this.aggregation;
    }

    /**
     * Set 일괄 처리. Possible values include: 'MIN', 'MAX', 'SUM', 'COUNT', 'AVG'.
     *
     * @param aggregation the aggregation value to set
     * @return the MetricInfoParameter object itself.
     */
    public MetricInfoParameter withAggregation(AggregationType aggregation) {
        this.aggregation = aggregation;
        return this;
    }

    /**
     * Get query 일괄 처리. Possible values include: 'AVG', 'COUNT', 'MIN', 'MAX', 'NONE', 'SUM', 'FIRST', 'LAST', 'MULT'.
     *
     * @return the queryAggregation value
     */
    public QueryAggregationType queryAggregation() {
        return this.queryAggregation;
    }

    /**
     * Set query 일괄 처리. Possible values include: 'AVG', 'COUNT', 'MIN', 'MAX', 'NONE', 'SUM', 'FIRST', 'LAST', 'MULT'.
     *
     * @param queryAggregation the queryAggregation value to set
     * @return the MetricInfoParameter object itself.
     */
    public MetricInfoParameter withQueryAggregation(QueryAggregationType queryAggregation) {
        this.queryAggregation = queryAggregation;
        return this;
    }

    /**
     * Get query Dimension 데이터.
     *
     * @return the dimensions value
     */
    public DimensionParameter dimensions() {
        return this.dimensions;
    }

    /**
     * Set query Dimension 데이터.
     *
     * @param dimensions the dimensions value to set
     * @return the MetricInfoParameter object itself.
     */
    public MetricInfoParameter withDimensions(DimensionParameter dimensions) {
        this.dimensions = dimensions;
        return this;
    }

}
