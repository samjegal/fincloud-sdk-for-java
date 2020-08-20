/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteRuleGroupItemDto.
 * 삭제할 Event Rule을 지정.
 */
public class RuleGroupDeleteItemParameter {
    /**
     * 상품의 cw_key.
     */
    @JsonProperty(value = "prodKey", required = true)
    private String prodKey;

    /**
     * Event Rule id.
     */
    @JsonProperty(value = "ruleGroupId", required = true)
    private String ruleGroupId;

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
     * @return the RuleGroupDeleteItemParameter object itself.
     */
    public RuleGroupDeleteItemParameter withProdKey(String prodKey) {
        this.prodKey = prodKey;
        return this;
    }

    /**
     * Get event Rule id.
     *
     * @return the ruleGroupId value
     */
    public String ruleGroupId() {
        return this.ruleGroupId;
    }

    /**
     * Set event Rule id.
     *
     * @param ruleGroupId the ruleGroupId value to set
     * @return the RuleGroupDeleteItemParameter object itself.
     */
    public RuleGroupDeleteItemParameter withRuleGroupId(String ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
        return this;
    }

}
