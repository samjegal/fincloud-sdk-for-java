/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RemoveResourceFromRulesDto.
 * Model for delete resourceId from given rules.
 */
public class RemoveResourceFromRulesParameter {
    /**
     * The prodKey property.
     */
    @JsonProperty(value = "prodKey")
    private String prodKey;

    /**
     * The resourceId property.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * The ruleGroupIds property.
     */
    @JsonProperty(value = "ruleGroupIds")
    private List<String> ruleGroupIds;

    /**
     * Get the prodKey value.
     *
     * @return the prodKey value
     */
    public String prodKey() {
        return this.prodKey;
    }

    /**
     * Set the prodKey value.
     *
     * @param prodKey the prodKey value to set
     * @return the RemoveResourceFromRulesParameter object itself.
     */
    public RemoveResourceFromRulesParameter withProdKey(String prodKey) {
        this.prodKey = prodKey;
        return this;
    }

    /**
     * Get the resourceId value.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId value.
     *
     * @param resourceId the resourceId value to set
     * @return the RemoveResourceFromRulesParameter object itself.
     */
    public RemoveResourceFromRulesParameter withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the ruleGroupIds value.
     *
     * @return the ruleGroupIds value
     */
    public List<String> ruleGroupIds() {
        return this.ruleGroupIds;
    }

    /**
     * Set the ruleGroupIds value.
     *
     * @param ruleGroupIds the ruleGroupIds value to set
     * @return the RemoveResourceFromRulesParameter object itself.
     */
    public RemoveResourceFromRulesParameter withRuleGroupIds(List<String> ruleGroupIds) {
        this.ruleGroupIds = ruleGroupIds;
        return this;
    }

}
