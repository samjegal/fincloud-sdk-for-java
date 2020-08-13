/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CloudInsightDataInfoParameter model.
 */
public class CloudInsightDataInfoParameter {
    /**
     * 일괄 처리. Possible values include: 'MIN', 'MAX', 'SUM', 'COUNT', 'AVG'.
     */
    @JsonProperty(value = "aggregation")
    private AggregationType aggregation;

    /**
     * Query Dimension 데이터.
     */
    @JsonProperty(value = "dimensions")
    private CloudInsightDimensionResultParameter dimensions;

    /**
     * The dps property.
     */
    @JsonProperty(value = "dps")
    private List<List<Double>> dps;

    /**
     * 조회 시간 간격. Possible values include: 'MIN1', 'MIN5', 'MIN30', 'HOUR2',
     * 'DAY1'.
     */
    @JsonProperty(value = "interval")
    private QueryIntervalTime interval;

    /**
     * Metric 이름.
     */
    @JsonProperty(value = "metric")
    private String metric;

    /**
     * Product 이름.
     */
    @JsonProperty(value = "productName")
    private String productName;

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
     * @return the CloudInsightDataInfoParameter object itself.
     */
    public CloudInsightDataInfoParameter withAggregation(AggregationType aggregation) {
        this.aggregation = aggregation;
        return this;
    }

    /**
     * Get query Dimension 데이터.
     *
     * @return the dimensions value
     */
    public CloudInsightDimensionResultParameter dimensions() {
        return this.dimensions;
    }

    /**
     * Set query Dimension 데이터.
     *
     * @param dimensions the dimensions value to set
     * @return the CloudInsightDataInfoParameter object itself.
     */
    public CloudInsightDataInfoParameter withDimensions(CloudInsightDimensionResultParameter dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the dps value.
     *
     * @return the dps value
     */
    public List<List<Double>> dps() {
        return this.dps;
    }

    /**
     * Set the dps value.
     *
     * @param dps the dps value to set
     * @return the CloudInsightDataInfoParameter object itself.
     */
    public CloudInsightDataInfoParameter withDps(List<List<Double>> dps) {
        this.dps = dps;
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
     * @return the CloudInsightDataInfoParameter object itself.
     */
    public CloudInsightDataInfoParameter withInterval(QueryIntervalTime interval) {
        this.interval = interval;
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
     * @return the CloudInsightDataInfoParameter object itself.
     */
    public CloudInsightDataInfoParameter withMetric(String metric) {
        this.metric = metric;
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
     * @return the CloudInsightDataInfoParameter object itself.
     */
    public CloudInsightDataInfoParameter withProductName(String productName) {
        this.productName = productName;
        return this;
    }

}
