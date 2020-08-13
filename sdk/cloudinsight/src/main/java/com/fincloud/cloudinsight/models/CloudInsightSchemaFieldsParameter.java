/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CloudInsightSchemaFieldsParameter model.
 */
public class CloudInsightSchemaFieldsParameter {
    /**
     * Metric 유무.
     */
    @JsonProperty(value = "metric")
    private Boolean metric;

    /**
     * Metric 데이터 타입. Possible values include: 'STRING', 'INTEGER', 'LONG',
     * 'FLOAT'.
     */
    @JsonProperty(value = "dataType")
    private SchemaDataType dataType;

    /**
     * Metric 이름.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Metric 기본 유무.
     */
    @JsonProperty(value = "defaultMetric")
    private Boolean defaultMetric;

    /**
     * Dimension 설정.
     */
    @JsonProperty(value = "dimension")
    private Boolean dimension;

    /**
     * Dimension 설명.
     */
    @JsonProperty(value = "desc")
    private String desc;

    /**
     * Get metric 유무.
     *
     * @return the metric value
     */
    public Boolean metric() {
        return this.metric;
    }

    /**
     * Set metric 유무.
     *
     * @param metric the metric value to set
     * @return the CloudInsightSchemaFieldsParameter object itself.
     */
    public CloudInsightSchemaFieldsParameter withMetric(Boolean metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Get metric 데이터 타입. Possible values include: 'STRING', 'INTEGER', 'LONG', 'FLOAT'.
     *
     * @return the dataType value
     */
    public SchemaDataType dataType() {
        return this.dataType;
    }

    /**
     * Set metric 데이터 타입. Possible values include: 'STRING', 'INTEGER', 'LONG', 'FLOAT'.
     *
     * @param dataType the dataType value to set
     * @return the CloudInsightSchemaFieldsParameter object itself.
     */
    public CloudInsightSchemaFieldsParameter withDataType(SchemaDataType dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get metric 이름.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set metric 이름.
     *
     * @param name the name value to set
     * @return the CloudInsightSchemaFieldsParameter object itself.
     */
    public CloudInsightSchemaFieldsParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get metric 기본 유무.
     *
     * @return the defaultMetric value
     */
    public Boolean defaultMetric() {
        return this.defaultMetric;
    }

    /**
     * Set metric 기본 유무.
     *
     * @param defaultMetric the defaultMetric value to set
     * @return the CloudInsightSchemaFieldsParameter object itself.
     */
    public CloudInsightSchemaFieldsParameter withDefaultMetric(Boolean defaultMetric) {
        this.defaultMetric = defaultMetric;
        return this;
    }

    /**
     * Get dimension 설정.
     *
     * @return the dimension value
     */
    public Boolean dimension() {
        return this.dimension;
    }

    /**
     * Set dimension 설정.
     *
     * @param dimension the dimension value to set
     * @return the CloudInsightSchemaFieldsParameter object itself.
     */
    public CloudInsightSchemaFieldsParameter withDimension(Boolean dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * Get dimension 설명.
     *
     * @return the desc value
     */
    public String desc() {
        return this.desc;
    }

    /**
     * Set dimension 설명.
     *
     * @param desc the desc value to set
     * @return the CloudInsightSchemaFieldsParameter object itself.
     */
    public CloudInsightSchemaFieldsParameter withDesc(String desc) {
        this.desc = desc;
        return this;
    }

}
