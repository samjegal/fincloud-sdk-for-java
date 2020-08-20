/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RuleGroupItemListParameter model.
 */
public class RuleGroupItemListParameter {
    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The ruleGroupItemDtoList property.
     */
    @JsonProperty(value = "ruleGroupItemDtoList")
    private List<RuleGroupItemParameter> ruleGroupItemDtoList;

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
     * @return the RuleGroupItemListParameter object itself.
     */
    public RuleGroupItemListParameter withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the ruleGroupItemDtoList value.
     *
     * @return the ruleGroupItemDtoList value
     */
    public List<RuleGroupItemParameter> ruleGroupItemDtoList() {
        return this.ruleGroupItemDtoList;
    }

    /**
     * Set the ruleGroupItemDtoList value.
     *
     * @param ruleGroupItemDtoList the ruleGroupItemDtoList value to set
     * @return the RuleGroupItemListParameter object itself.
     */
    public RuleGroupItemListParameter withRuleGroupItemDtoList(List<RuleGroupItemParameter> ruleGroupItemDtoList) {
        this.ruleGroupItemDtoList = ruleGroupItemDtoList;
        return this;
    }

}
