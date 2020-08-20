/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteRuleGroupDto.
 * Objects in rule group to be deleted.
 */
public class RuleGroupDeleteRequest {
    /**
     * rule group List.
     */
    @JsonProperty(value = "items", required = true)
    private List<RuleGroupDeleteItemParameter> items;

    /**
     * Get rule group List.
     *
     * @return the items value
     */
    public List<RuleGroupDeleteItemParameter> items() {
        return this.items;
    }

    /**
     * Set rule group List.
     *
     * @param items the items value to set
     * @return the RuleGroupDeleteRequest object itself.
     */
    public RuleGroupDeleteRequest withItems(List<RuleGroupDeleteItemParameter> items) {
        this.items = items;
        return this;
    }

}
