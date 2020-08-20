/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SchemaFieldParameter.
 * 사용자 정의 스키마 필드 파라미터.
 */
public class SchemaFieldParameter {
    /**
     * Aggregations to be performed on this metric, default to ALL aggregations
     * if null. The values will be ignored for dimensions.
     */
    @JsonProperty(value = "aggregations")
    private Map<String, List<SchemaFieldaAggregation>> aggregations;

    /**
     * Describe whether the field is of COUNTER type, default to false if
     * missing.
     */
    @JsonProperty(value = "counter")
    private Boolean counter;

    /**
     * Data type of the field, only STRING, LONG and FLOAT are available.
     * Possible values include: 'STRING', 'INTEGER', 'FLOAT', 'LONG',
     * 'TIMESTAMP', 'ARRAY'.
     */
    @JsonProperty(value = "dataType", required = true)
    private SchemaFieldDataType dataType;

    /**
     * Describe whether the metric is default ,only use if metric = true, to
     * show in dashboard summary api, default to false if missing.
     */
    @JsonProperty(value = "defaultMetric")
    private Boolean defaultMetric;

    /**
     * Description of this field.
     */
    @JsonProperty(value = "desc")
    private String desc;

    /**
     * Describe whether the field is part of dimensions, default to false if
     * missing.
     */
    @JsonProperty(value = "dimension")
    private Boolean dimension;

    /**
     * Dimension type of this field. Possible values include: 'DEFAULT',
     * 'CUSTOM'.
     */
    @JsonProperty(value = "dimensionType")
    private SchemaFieldDimensionType dimensionType;

    /**
     * The idDimension property.
     */
    @JsonProperty(value = "idDimension")
    private Boolean idDimension;

    /**
     * Describe whether the field is part of metrics, default to false if
     * missing.
     */
    @JsonProperty(value = "metric")
    private Boolean metric;

    /**
     * Metric type of this field. Possible values include: 'BASIC', 'EXTENDED',
     * 'CUSTOM'.
     */
    @JsonProperty(value = "metricType")
    private SchemaFieldMetricType metricType;

    /**
     * Name of the field.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get aggregations to be performed on this metric, default to ALL aggregations if null. The values will be ignored for dimensions.
     *
     * @return the aggregations value
     */
    public Map<String, List<SchemaFieldaAggregation>> aggregations() {
        return this.aggregations;
    }

    /**
     * Set aggregations to be performed on this metric, default to ALL aggregations if null. The values will be ignored for dimensions.
     *
     * @param aggregations the aggregations value to set
     * @return the SchemaFieldParameter object itself.
     */
    public SchemaFieldParameter withAggregations(Map<String, List<SchemaFieldaAggregation>> aggregations) {
        this.aggregations = aggregations;
        return this;
    }

    /**
     * Get describe whether the field is of COUNTER type, default to false if missing.
     *
     * @return the counter value
     */
    public Boolean counter() {
        return this.counter;
    }

    /**
     * Set describe whether the field is of COUNTER type, default to false if missing.
     *
     * @param counter the counter value to set
     * @return the SchemaFieldParameter object itself.
     */
    public SchemaFieldParameter withCounter(Boolean counter) {
        this.counter = counter;
        return this;
    }

    /**
     * Get data type of the field, only STRING, LONG and FLOAT are available. Possible values include: 'STRING', 'INTEGER', 'FLOAT', 'LONG', 'TIMESTAMP', 'ARRAY'.
     *
     * @return the dataType value
     */
    public SchemaFieldDataType dataType() {
        return this.dataType;
    }

    /**
     * Set data type of the field, only STRING, LONG and FLOAT are available. Possible values include: 'STRING', 'INTEGER', 'FLOAT', 'LONG', 'TIMESTAMP', 'ARRAY'.
     *
     * @param dataType the dataType value to set
     * @return the SchemaFieldParameter object itself.
     */
    public SchemaFieldParameter withDataType(SchemaFieldDataType dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get describe whether the metric is default ,only use if metric = true, to show in dashboard summary api, default to false if missing.
     *
     * @return the defaultMetric value
     */
    public Boolean defaultMetric() {
        return this.defaultMetric;
    }

    /**
     * Set describe whether the metric is default ,only use if metric = true, to show in dashboard summary api, default to false if missing.
     *
     * @param defaultMetric the defaultMetric value to set
     * @return the SchemaFieldParameter object itself.
     */
    public SchemaFieldParameter withDefaultMetric(Boolean defaultMetric) {
        this.defaultMetric = defaultMetric;
        return this;
    }

    /**
     * Get description of this field.
     *
     * @return the desc value
     */
    public String desc() {
        return this.desc;
    }

    /**
     * Set description of this field.
     *
     * @param desc the desc value to set
     * @return the SchemaFieldParameter object itself.
     */
    public SchemaFieldParameter withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Get describe whether the field is part of dimensions, default to false if missing.
     *
     * @return the dimension value
     */
    public Boolean dimension() {
        return this.dimension;
    }

    /**
     * Set describe whether the field is part of dimensions, default to false if missing.
     *
     * @param dimension the dimension value to set
     * @return the SchemaFieldParameter object itself.
     */
    public SchemaFieldParameter withDimension(Boolean dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * Get dimension type of this field. Possible values include: 'DEFAULT', 'CUSTOM'.
     *
     * @return the dimensionType value
     */
    public SchemaFieldDimensionType dimensionType() {
        return this.dimensionType;
    }

    /**
     * Set dimension type of this field. Possible values include: 'DEFAULT', 'CUSTOM'.
     *
     * @param dimensionType the dimensionType value to set
     * @return the SchemaFieldParameter object itself.
     */
    public SchemaFieldParameter withDimensionType(SchemaFieldDimensionType dimensionType) {
        this.dimensionType = dimensionType;
        return this;
    }

    /**
     * Get the idDimension value.
     *
     * @return the idDimension value
     */
    public Boolean idDimension() {
        return this.idDimension;
    }

    /**
     * Set the idDimension value.
     *
     * @param idDimension the idDimension value to set
     * @return the SchemaFieldParameter object itself.
     */
    public SchemaFieldParameter withIdDimension(Boolean idDimension) {
        this.idDimension = idDimension;
        return this;
    }

    /**
     * Get describe whether the field is part of metrics, default to false if missing.
     *
     * @return the metric value
     */
    public Boolean metric() {
        return this.metric;
    }

    /**
     * Set describe whether the field is part of metrics, default to false if missing.
     *
     * @param metric the metric value to set
     * @return the SchemaFieldParameter object itself.
     */
    public SchemaFieldParameter withMetric(Boolean metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Get metric type of this field. Possible values include: 'BASIC', 'EXTENDED', 'CUSTOM'.
     *
     * @return the metricType value
     */
    public SchemaFieldMetricType metricType() {
        return this.metricType;
    }

    /**
     * Set metric type of this field. Possible values include: 'BASIC', 'EXTENDED', 'CUSTOM'.
     *
     * @param metricType the metricType value to set
     * @return the SchemaFieldParameter object itself.
     */
    public SchemaFieldParameter withMetricType(SchemaFieldMetricType metricType) {
        this.metricType = metricType;
        return this;
    }

    /**
     * Get name of the field.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the field.
     *
     * @param name the name value to set
     * @return the SchemaFieldParameter object itself.
     */
    public SchemaFieldParameter withName(String name) {
        this.name = name;
        return this;
    }

}
