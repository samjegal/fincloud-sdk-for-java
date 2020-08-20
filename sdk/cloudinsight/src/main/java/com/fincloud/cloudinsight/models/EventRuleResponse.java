/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventRuleResponse.
 * Event rule search response, used by NAP to check whether the given
 * Notification GroupNo has been used by rules.
 */
public class EventRuleResponse {
    /**
     * The grpNoHasNotiRule property.
     */
    @JsonProperty(value = "grpNoHasNotiRule")
    private Boolean grpNoHasNotiRule;

    /**
     * Events rule list.
     */
    @JsonProperty(value = "ruleDtos")
    private List<RuleGroup> ruleDtos;

    /**
     * Get the grpNoHasNotiRule value.
     *
     * @return the grpNoHasNotiRule value
     */
    public Boolean grpNoHasNotiRule() {
        return this.grpNoHasNotiRule;
    }

    /**
     * Set the grpNoHasNotiRule value.
     *
     * @param grpNoHasNotiRule the grpNoHasNotiRule value to set
     * @return the EventRuleResponse object itself.
     */
    public EventRuleResponse withGrpNoHasNotiRule(Boolean grpNoHasNotiRule) {
        this.grpNoHasNotiRule = grpNoHasNotiRule;
        return this;
    }

    /**
     * Get events rule list.
     *
     * @return the ruleDtos value
     */
    public List<RuleGroup> ruleDtos() {
        return this.ruleDtos;
    }

    /**
     * Set events rule list.
     *
     * @param ruleDtos the ruleDtos value to set
     * @return the EventRuleResponse object itself.
     */
    public EventRuleResponse withRuleDtos(List<RuleGroup> ruleDtos) {
        this.ruleDtos = ruleDtos;
        return this;
    }

}
