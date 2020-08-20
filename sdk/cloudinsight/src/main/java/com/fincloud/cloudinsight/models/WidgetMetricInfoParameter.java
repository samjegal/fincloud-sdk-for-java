/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WidgetMetricInfoParameter.
 * Widget 내 Metric 정보.
 */
public class WidgetMetricInfoParameter {
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
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * 조회하려는 Metric 이름.
     */
    @JsonProperty(value = "metric")
    private String metric;

    /**
     * The options property.
     */
    @JsonProperty(value = "options")
    private Map<String, List<ChartDataWidgetInfoOption>> options;

    /**
     * 조회하려는 집계 주기. Possible values include: 'Min1', 'Min5', 'Min30', 'Hour2',
     * 'Day1'.
     */
    @JsonProperty(value = "period")
    private ChartDataWidgetInfoPeriod periodProperty;

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
     * 조회하려는 집계 함수. Possible values include: 'COUNT', 'SUM', 'MAX', 'MIN',
     * 'AVG', 'COUNTER'.
     */
    @JsonProperty(value = "statistic")
    private ChartDataWidgetInfoStatistic statistic;

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
     * @return the WidgetMetricInfoParameter object itself.
     */
    public WidgetMetricInfoParameter withColor(String color) {
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
     * @return the WidgetMetricInfoParameter object itself.
     */
    public WidgetMetricInfoParameter withData(List<Object> data) {
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
     * @return the WidgetMetricInfoParameter object itself.
     */
    public WidgetMetricInfoParameter withDimensions(Map<String, String> dimensions) {
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
     * @return the WidgetMetricInfoParameter object itself.
     */
    public WidgetMetricInfoParameter withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the WidgetMetricInfoParameter object itself.
     */
    public WidgetMetricInfoParameter withId(String id) {
        this.id = id;
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
     * @return the WidgetMetricInfoParameter object itself.
     */
    public WidgetMetricInfoParameter withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Get the options value.
     *
     * @return the options value
     */
    public Map<String, List<ChartDataWidgetInfoOption>> options() {
        return this.options;
    }

    /**
     * Set the options value.
     *
     * @param options the options value to set
     * @return the WidgetMetricInfoParameter object itself.
     */
    public WidgetMetricInfoParameter withOptions(Map<String, List<ChartDataWidgetInfoOption>> options) {
        this.options = options;
        return this;
    }

    /**
     * Get 조회하려는 집계 주기. Possible values include: 'Min1', 'Min5', 'Min30', 'Hour2', 'Day1'.
     *
     * @return the periodProperty value
     */
    public ChartDataWidgetInfoPeriod periodProperty() {
        return this.periodProperty;
    }

    /**
     * Set 조회하려는 집계 주기. Possible values include: 'Min1', 'Min5', 'Min30', 'Hour2', 'Day1'.
     *
     * @param periodProperty the periodProperty value to set
     * @return the WidgetMetricInfoParameter object itself.
     */
    public WidgetMetricInfoParameter withPeriodProperty(ChartDataWidgetInfoPeriod periodProperty) {
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
     * @return the WidgetMetricInfoParameter object itself.
     */
    public WidgetMetricInfoParameter withProdKey(String prodKey) {
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
     * @return the WidgetMetricInfoParameter object itself.
     */
    public WidgetMetricInfoParameter withProdName(String prodName) {
        this.prodName = prodName;
        return this;
    }

    /**
     * Get 조회하려는 집계 함수. Possible values include: 'COUNT', 'SUM', 'MAX', 'MIN', 'AVG', 'COUNTER'.
     *
     * @return the statistic value
     */
    public ChartDataWidgetInfoStatistic statistic() {
        return this.statistic;
    }

    /**
     * Set 조회하려는 집계 함수. Possible values include: 'COUNT', 'SUM', 'MAX', 'MIN', 'AVG', 'COUNTER'.
     *
     * @param statistic the statistic value to set
     * @return the WidgetMetricInfoParameter object itself.
     */
    public WidgetMetricInfoParameter withStatistic(ChartDataWidgetInfoStatistic statistic) {
        this.statistic = statistic;
        return this;
    }

}
