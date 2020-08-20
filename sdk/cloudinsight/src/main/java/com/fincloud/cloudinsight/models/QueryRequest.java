/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The QueryRequest model.
 */
public class QueryRequest {
    /**
     * 마지막 조회 시간.
     */
    @JsonProperty(value = "timeEnd")
    private Double timeEnd;

    /**
     * 최초 조회 시간.
     */
    @JsonProperty(value = "timeStart")
    private Double timeStart;

    /**
     * Metric 이름.
     */
    @JsonProperty(value = "metric")
    private String metric;

    /**
     * 조회 시간 간격. Possible values include: 'MIN1', 'MIN5', 'MIN30', 'HOUR2',
     * 'DAY1'.
     */
    @JsonProperty(value = "interval")
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
     * Schema 생성시 발급받은 키.
     */
    @JsonProperty(value = "cw_key")
    private String cwKey;

    /**
     * Product 이름.
     */
    @JsonProperty(value = "productName")
    private String productName;

    /**
     * Query Dimension 데이터.
     */
    @JsonProperty(value = "dimensions")
    private DimensionParameter dimensions;

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
     * @return the QueryRequest object itself.
     */
    public QueryRequest withTimeEnd(Double timeEnd) {
        this.timeEnd = timeEnd;
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
     * @return the QueryRequest object itself.
     */
    public QueryRequest withTimeStart(Double timeStart) {
        this.timeStart = timeStart;
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
     * @return the QueryRequest object itself.
     */
    public QueryRequest withMetric(String metric) {
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
     * @return the QueryRequest object itself.
     */
    public QueryRequest withInterval(QueryIntervalTime interval) {
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
     * @return the QueryRequest object itself.
     */
    public QueryRequest withAggregation(AggregationType aggregation) {
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
     * @return the QueryRequest object itself.
     */
    public QueryRequest withQueryAggregation(QueryAggregationType queryAggregation) {
        this.queryAggregation = queryAggregation;
        return this;
    }

    /**
     * Get schema 생성시 발급받은 키.
     *
     * @return the cwKey value
     */
    public String cwKey() {
        return this.cwKey;
    }

    /**
     * Set schema 생성시 발급받은 키.
     *
     * @param cwKey the cwKey value to set
     * @return the QueryRequest object itself.
     */
    public QueryRequest withCwKey(String cwKey) {
        this.cwKey = cwKey;
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
     * @return the QueryRequest object itself.
     */
    public QueryRequest withProductName(String productName) {
        this.productName = productName;
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
     * @return the QueryRequest object itself.
     */
    public QueryRequest withDimensions(DimensionParameter dimensions) {
        this.dimensions = dimensions;
        return this;
    }

}
