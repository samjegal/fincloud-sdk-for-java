/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TypeGroupRelatedRuleParameter model.
 */
public class TypeGroupRelatedRuleParameter {
    /**
     * 삭제하려는 감시 대상 그룹 id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * 삭제하려는 Event Rule, 여러개 입력 가능.
     */
    @JsonProperty(value = "ruleGroupItemDtoList")
    private List<RuleGroupItemParameter> ruleGroupItemDtoList;

    /**
     * Get 삭제하려는 감시 대상 그룹 id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set 삭제하려는 감시 대상 그룹 id.
     *
     * @param id the id value to set
     * @return the TypeGroupRelatedRuleParameter object itself.
     */
    public TypeGroupRelatedRuleParameter withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get 삭제하려는 Event Rule, 여러개 입력 가능.
     *
     * @return the ruleGroupItemDtoList value
     */
    public List<RuleGroupItemParameter> ruleGroupItemDtoList() {
        return this.ruleGroupItemDtoList;
    }

    /**
     * Set 삭제하려는 Event Rule, 여러개 입력 가능.
     *
     * @param ruleGroupItemDtoList the ruleGroupItemDtoList value to set
     * @return the TypeGroupRelatedRuleParameter object itself.
     */
    public TypeGroupRelatedRuleParameter withRuleGroupItemDtoList(List<RuleGroupItemParameter> ruleGroupItemDtoList) {
        this.ruleGroupItemDtoList = ruleGroupItemDtoList;
        return this;
    }

}
