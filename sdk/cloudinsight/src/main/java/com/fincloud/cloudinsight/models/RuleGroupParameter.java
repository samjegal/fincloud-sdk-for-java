/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RuleGroupDto.
 * response of rule group model.
 */
public class RuleGroupParameter {
    /**
     * The ruleGroup property.
     */
    @JsonProperty(value = "ruleGroup")
    private RuleGroupItemParameter ruleGroup;

    /**
     * Get the ruleGroup value.
     *
     * @return the ruleGroup value
     */
    public RuleGroupItemParameter ruleGroup() {
        return this.ruleGroup;
    }

    /**
     * Set the ruleGroup value.
     *
     * @param ruleGroup the ruleGroup value to set
     * @return the RuleGroupParameter object itself.
     */
    public RuleGroupParameter withRuleGroup(RuleGroupItemParameter ruleGroup) {
        this.ruleGroup = ruleGroup;
        return this;
    }

}
