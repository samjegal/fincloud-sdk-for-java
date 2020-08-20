/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MetricsGroupItemDto.
 * response for metrics group item.
 */
public class MetricsGroupItemParameter {
    /**
     * Possible values include: 'COUNT', 'SUM', 'MAX', 'MIN', 'AVG', 'COUNTER'.
     */
    @JsonProperty(value = "calculation")
    private MetricsGroupItemCalculation calculation;

    /**
     * Possible values include: 'LT', 'LE', 'EQ', 'GE', 'GT', 'NE', 'EXP'.
     */
    @JsonProperty(value = "condition")
    private MetricsGroupItemCondition condition;

    /**
     * The desc property.
     */
    @JsonProperty(value = "desc")
    private String desc;

    /**
     * The dimensions property.
     */
    @JsonProperty(value = "dimensions")
    private List<DimensionParameter> dimensions;

    /**
     * The duration property.
     */
    @JsonProperty(value = "duration")
    private Long duration;

    /**
     * Possible values include: 'INFO', 'WARNING', 'CRITICAL'.
     */
    @JsonProperty(value = "eventLevel")
    private MetricsGroupItemEventLevel eventLevel;

    /**
     * The metric property.
     */
    @JsonProperty(value = "metric")
    private String metric;

    /**
     * The metricGroupItemId property.
     */
    @JsonProperty(value = "metricGroupItemId")
    private String metricGroupItemId;

    /**
     * The threshold property.
     */
    @JsonProperty(value = "threshold")
    private Double threshold;

    /**
     * Get possible values include: 'COUNT', 'SUM', 'MAX', 'MIN', 'AVG', 'COUNTER'.
     *
     * @return the calculation value
     */
    public MetricsGroupItemCalculation calculation() {
        return this.calculation;
    }

    /**
     * Set possible values include: 'COUNT', 'SUM', 'MAX', 'MIN', 'AVG', 'COUNTER'.
     *
     * @param calculation the calculation value to set
     * @return the MetricsGroupItemParameter object itself.
     */
    public MetricsGroupItemParameter withCalculation(MetricsGroupItemCalculation calculation) {
        this.calculation = calculation;
        return this;
    }

    /**
     * Get possible values include: 'LT', 'LE', 'EQ', 'GE', 'GT', 'NE', 'EXP'.
     *
     * @return the condition value
     */
    public MetricsGroupItemCondition condition() {
        return this.condition;
    }

    /**
     * Set possible values include: 'LT', 'LE', 'EQ', 'GE', 'GT', 'NE', 'EXP'.
     *
     * @param condition the condition value to set
     * @return the MetricsGroupItemParameter object itself.
     */
    public MetricsGroupItemParameter withCondition(MetricsGroupItemCondition condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the desc value.
     *
     * @return the desc value
     */
    public String desc() {
        return this.desc;
    }

    /**
     * Set the desc value.
     *
     * @param desc the desc value to set
     * @return the MetricsGroupItemParameter object itself.
     */
    public MetricsGroupItemParameter withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Get the dimensions value.
     *
     * @return the dimensions value
     */
    public List<DimensionParameter> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions value.
     *
     * @param dimensions the dimensions value to set
     * @return the MetricsGroupItemParameter object itself.
     */
    public MetricsGroupItemParameter withDimensions(List<DimensionParameter> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the duration value.
     *
     * @return the duration value
     */
    public Long duration() {
        return this.duration;
    }

    /**
     * Set the duration value.
     *
     * @param duration the duration value to set
     * @return the MetricsGroupItemParameter object itself.
     */
    public MetricsGroupItemParameter withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get possible values include: 'INFO', 'WARNING', 'CRITICAL'.
     *
     * @return the eventLevel value
     */
    public MetricsGroupItemEventLevel eventLevel() {
        return this.eventLevel;
    }

    /**
     * Set possible values include: 'INFO', 'WARNING', 'CRITICAL'.
     *
     * @param eventLevel the eventLevel value to set
     * @return the MetricsGroupItemParameter object itself.
     */
    public MetricsGroupItemParameter withEventLevel(MetricsGroupItemEventLevel eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }

    /**
     * Get the metric value.
     *
     * @return the metric value
     */
    public String metric() {
        return this.metric;
    }

    /**
     * Set the metric value.
     *
     * @param metric the metric value to set
     * @return the MetricsGroupItemParameter object itself.
     */
    public MetricsGroupItemParameter withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Get the metricGroupItemId value.
     *
     * @return the metricGroupItemId value
     */
    public String metricGroupItemId() {
        return this.metricGroupItemId;
    }

    /**
     * Set the metricGroupItemId value.
     *
     * @param metricGroupItemId the metricGroupItemId value to set
     * @return the MetricsGroupItemParameter object itself.
     */
    public MetricsGroupItemParameter withMetricGroupItemId(String metricGroupItemId) {
        this.metricGroupItemId = metricGroupItemId;
        return this;
    }

    /**
     * Get the threshold value.
     *
     * @return the threshold value
     */
    public Double threshold() {
        return this.threshold;
    }

    /**
     * Set the threshold value.
     *
     * @param threshold the threshold value to set
     * @return the MetricsGroupItemParameter object itself.
     */
    public MetricsGroupItemParameter withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

}
