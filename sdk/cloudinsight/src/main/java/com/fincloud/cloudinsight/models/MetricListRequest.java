/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MetricListRequest.
 * Metric 리스트 조회.
 */
public class MetricListRequest {
    /**
     * 조회하려는 Dimension 정보.
     */
    @JsonProperty(value = "dimValues")
    private List<DimensionItemParameter> dimValues;

    /**
     * dimension names.
     */
    @JsonProperty(value = "dimensionNames")
    private List<String> dimensionNames;

    /**
     * for query metric group.
     */
    @JsonProperty(value = "dimensionSelected")
    private String dimensionSelected;

    /**
     * 조회 종료 시간.
     */
    @JsonProperty(value = "endTime")
    private Long endTime;

    /**
     * The number of page to get, default to 0 if missing will cause no
     * pagination.
     */
    @JsonProperty(value = "pageNum")
    private Integer pageNum;

    /**
     * Page size of the request, default to 0 if missing will cause no
     * pagination.
     */
    @JsonProperty(value = "pageSize")
    private Integer pageSize;

    /**
     * 상품의 cw_key.
     */
    @JsonProperty(value = "prodKey")
    private String prodKey;

    /**
     * 상품의 이름.
     */
    @JsonProperty(value = "productName")
    private String productName;

    /**
     * Query keyword string.
     */
    @JsonProperty(value = "query")
    private String query;

    /**
     * 조회 시작 시간.
     */
    @JsonProperty(value = "startTime")
    private Long startTime;

    /**
     * Get 조회하려는 Dimension 정보.
     *
     * @return the dimValues value
     */
    public List<DimensionItemParameter> dimValues() {
        return this.dimValues;
    }

    /**
     * Set 조회하려는 Dimension 정보.
     *
     * @param dimValues the dimValues value to set
     * @return the MetricListRequest object itself.
     */
    public MetricListRequest withDimValues(List<DimensionItemParameter> dimValues) {
        this.dimValues = dimValues;
        return this;
    }

    /**
     * Get dimension names.
     *
     * @return the dimensionNames value
     */
    public List<String> dimensionNames() {
        return this.dimensionNames;
    }

    /**
     * Set dimension names.
     *
     * @param dimensionNames the dimensionNames value to set
     * @return the MetricListRequest object itself.
     */
    public MetricListRequest withDimensionNames(List<String> dimensionNames) {
        this.dimensionNames = dimensionNames;
        return this;
    }

    /**
     * Get for query metric group.
     *
     * @return the dimensionSelected value
     */
    public String dimensionSelected() {
        return this.dimensionSelected;
    }

    /**
     * Set for query metric group.
     *
     * @param dimensionSelected the dimensionSelected value to set
     * @return the MetricListRequest object itself.
     */
    public MetricListRequest withDimensionSelected(String dimensionSelected) {
        this.dimensionSelected = dimensionSelected;
        return this;
    }

    /**
     * Get 조회 종료 시간.
     *
     * @return the endTime value
     */
    public Long endTime() {
        return this.endTime;
    }

    /**
     * Set 조회 종료 시간.
     *
     * @param endTime the endTime value to set
     * @return the MetricListRequest object itself.
     */
    public MetricListRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the number of page to get, default to 0 if missing will cause no pagination.
     *
     * @return the pageNum value
     */
    public Integer pageNum() {
        return this.pageNum;
    }

    /**
     * Set the number of page to get, default to 0 if missing will cause no pagination.
     *
     * @param pageNum the pageNum value to set
     * @return the MetricListRequest object itself.
     */
    public MetricListRequest withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * Get page size of the request, default to 0 if missing will cause no pagination.
     *
     * @return the pageSize value
     */
    public Integer pageSize() {
        return this.pageSize;
    }

    /**
     * Set page size of the request, default to 0 if missing will cause no pagination.
     *
     * @param pageSize the pageSize value to set
     * @return the MetricListRequest object itself.
     */
    public MetricListRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
     * @return the MetricListRequest object itself.
     */
    public MetricListRequest withProdKey(String prodKey) {
        this.prodKey = prodKey;
        return this;
    }

    /**
     * Get 상품의 이름.
     *
     * @return the productName value
     */
    public String productName() {
        return this.productName;
    }

    /**
     * Set 상품의 이름.
     *
     * @param productName the productName value to set
     * @return the MetricListRequest object itself.
     */
    public MetricListRequest withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * Get query keyword string.
     *
     * @return the query value
     */
    public String query() {
        return this.query;
    }

    /**
     * Set query keyword string.
     *
     * @param query the query value to set
     * @return the MetricListRequest object itself.
     */
    public MetricListRequest withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get 조회 시작 시간.
     *
     * @return the startTime value
     */
    public Long startTime() {
        return this.startTime;
    }

    /**
     * Set 조회 시작 시간.
     *
     * @param startTime the startTime value to set
     * @return the MetricListRequest object itself.
     */
    public MetricListRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

}
