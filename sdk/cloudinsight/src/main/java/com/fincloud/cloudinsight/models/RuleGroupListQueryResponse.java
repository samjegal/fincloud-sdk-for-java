/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RuleGroupListDto.
 * Rule group list.
 */
public class RuleGroupListQueryResponse {
    /**
     * Current page number.
     */
    @JsonProperty(value = "pageNum")
    private Integer pageNum;

    /**
     * Current page size.
     */
    @JsonProperty(value = "pageSize")
    private Integer pageSize;

    /**
     * rule group list of specified criteria.
     */
    @JsonProperty(value = "ruleGroups")
    private List<RuleGroupItemParameter> ruleGroups;

    /**
     * Total pages of the list.
     */
    @JsonProperty(value = "totalPages")
    private Long totalPages;

    /**
     * Total number of records.
     */
    @JsonProperty(value = "totalRecords")
    private Long totalRecords;

    /**
     * Get current page number.
     *
     * @return the pageNum value
     */
    public Integer pageNum() {
        return this.pageNum;
    }

    /**
     * Set current page number.
     *
     * @param pageNum the pageNum value to set
     * @return the RuleGroupListQueryResponse object itself.
     */
    public RuleGroupListQueryResponse withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * Get current page size.
     *
     * @return the pageSize value
     */
    public Integer pageSize() {
        return this.pageSize;
    }

    /**
     * Set current page size.
     *
     * @param pageSize the pageSize value to set
     * @return the RuleGroupListQueryResponse object itself.
     */
    public RuleGroupListQueryResponse withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Get rule group list of specified criteria.
     *
     * @return the ruleGroups value
     */
    public List<RuleGroupItemParameter> ruleGroups() {
        return this.ruleGroups;
    }

    /**
     * Set rule group list of specified criteria.
     *
     * @param ruleGroups the ruleGroups value to set
     * @return the RuleGroupListQueryResponse object itself.
     */
    public RuleGroupListQueryResponse withRuleGroups(List<RuleGroupItemParameter> ruleGroups) {
        this.ruleGroups = ruleGroups;
        return this;
    }

    /**
     * Get total pages of the list.
     *
     * @return the totalPages value
     */
    public Long totalPages() {
        return this.totalPages;
    }

    /**
     * Set total pages of the list.
     *
     * @param totalPages the totalPages value to set
     * @return the RuleGroupListQueryResponse object itself.
     */
    public RuleGroupListQueryResponse withTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * Get total number of records.
     *
     * @return the totalRecords value
     */
    public Long totalRecords() {
        return this.totalRecords;
    }

    /**
     * Set total number of records.
     *
     * @param totalRecords the totalRecords value to set
     * @return the RuleGroupListQueryResponse object itself.
     */
    public RuleGroupListQueryResponse withTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

}
