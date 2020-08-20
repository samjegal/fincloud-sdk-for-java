/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RuleGroupListQueryDto.
 * Rule group list.
 */
public class RuleGroupListQueryRequest {
    /**
     * for products like cdb-mysql use this, like
     * '"dimensions":{"instanceNo":"1178714"}', also support other dimensions.
     */
    @JsonProperty(value = "dimensions")
    private Map<String, String> dimensions;

    /**
     * page Number.
     */
    @JsonProperty(value = "pageNum")
    private Integer pageNum;

    /**
     * page size.
     */
    @JsonProperty(value = "pageSize")
    private Integer pageSize;

    /**
     * prodkey.
     */
    @JsonProperty(value = "prodKey")
    private String prodKey;

    /**
     * keyword.
     */
    @JsonProperty(value = "search")
    private String search;

    /**
     * Get for products like cdb-mysql use this, like '"dimensions":{"instanceNo":"1178714"}', also support other dimensions.
     *
     * @return the dimensions value
     */
    public Map<String, String> dimensions() {
        return this.dimensions;
    }

    /**
     * Set for products like cdb-mysql use this, like '"dimensions":{"instanceNo":"1178714"}', also support other dimensions.
     *
     * @param dimensions the dimensions value to set
     * @return the RuleGroupListQueryRequest object itself.
     */
    public RuleGroupListQueryRequest withDimensions(Map<String, String> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get page Number.
     *
     * @return the pageNum value
     */
    public Integer pageNum() {
        return this.pageNum;
    }

    /**
     * Set page Number.
     *
     * @param pageNum the pageNum value to set
     * @return the RuleGroupListQueryRequest object itself.
     */
    public RuleGroupListQueryRequest withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * Get page size.
     *
     * @return the pageSize value
     */
    public Integer pageSize() {
        return this.pageSize;
    }

    /**
     * Set page size.
     *
     * @param pageSize the pageSize value to set
     * @return the RuleGroupListQueryRequest object itself.
     */
    public RuleGroupListQueryRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Get prodkey.
     *
     * @return the prodKey value
     */
    public String prodKey() {
        return this.prodKey;
    }

    /**
     * Set prodkey.
     *
     * @param prodKey the prodKey value to set
     * @return the RuleGroupListQueryRequest object itself.
     */
    public RuleGroupListQueryRequest withProdKey(String prodKey) {
        this.prodKey = prodKey;
        return this;
    }

    /**
     * Get keyword.
     *
     * @return the search value
     */
    public String search() {
        return this.search;
    }

    /**
     * Set keyword.
     *
     * @param search the search value to set
     * @return the RuleGroupListQueryRequest object itself.
     */
    public RuleGroupListQueryRequest withSearch(String search) {
        this.search = search;
        return this;
    }

}
