/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CopySettingsDto.
 * CopySettingsDto.
 */
public class RuleGroupCopySettingRequest {
    /**
     * 상품의 cw_key.
     */
    @JsonProperty(value = "prodKey", required = true)
    private String prodKey;

    /**
     * 삭제할 감시 대상 id.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /**
     * Event Rule id.
     */
    @JsonProperty(value = "ruleGroupIds", required = true)
    private List<String> ruleGroupIds;

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
     * @return the RuleGroupCopySettingRequest object itself.
     */
    public RuleGroupCopySettingRequest withProdKey(String prodKey) {
        this.prodKey = prodKey;
        return this;
    }

    /**
     * Get 삭제할 감시 대상 id.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set 삭제할 감시 대상 id.
     *
     * @param resourceId the resourceId value to set
     * @return the RuleGroupCopySettingRequest object itself.
     */
    public RuleGroupCopySettingRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get event Rule id.
     *
     * @return the ruleGroupIds value
     */
    public List<String> ruleGroupIds() {
        return this.ruleGroupIds;
    }

    /**
     * Set event Rule id.
     *
     * @param ruleGroupIds the ruleGroupIds value to set
     * @return the RuleGroupCopySettingRequest object itself.
     */
    public RuleGroupCopySettingRequest withRuleGroupIds(List<String> ruleGroupIds) {
        this.ruleGroupIds = ruleGroupIds;
        return this;
    }

}
