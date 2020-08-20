/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateOrUpdateRuleGroupDto.
 * Event Rule 생성/수정 시 필요.
 */
public class RuleGroupRequest {
    /**
     * only.
     */
    @JsonProperty(value = "asgPolicyList")
    private List<AsgPolicyParameter> asgPolicyList;

    /**
     * 추후 제공될 예정입니다. 현재는 미사용 상태.
     */
    @JsonProperty(value = "cfTriggers")
    private List<String> cfTriggers;

    /**
     * Event Rule 설명.
     */
    @JsonProperty(value = "groupDesc")
    private String groupDesc;

    /**
     * Event Rule 이름.
     */
    @JsonProperty(value = "groupName", required = true)
    private String groupName;

    /**
     * Event Rule id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * 감시 항목 그룹 id, 여러개 입력 가능.
     */
    @JsonProperty(value = "metricsGroupKey", required = true)
    private List<String> metricsGroupKey;

    /**
     * 감시 대상 그룹 id, 여러개 입력 가능.
     */
    @JsonProperty(value = "monitorGroupKey", required = true)
    private List<String> monitorGroupKey;

    /**
     * 상품의 cw_key.
     */
    @JsonProperty(value = "prodKey", required = true)
    private String prodKey;

    /**
     * 통보 대상 그룹, 여러개 입력 가능.
     */
    @JsonProperty(value = "recipientNotifications")
    private List<RecipientNotificationParameter> recipientNotifications;

    /**
     * Event Rule 중 비활성화 시킬 목록 설정.
     */
    @JsonProperty(value = "suspendRuleItems")
    private List<SuspendRuleItemParameter> suspendRuleItems;

    /**
     * Get only.
     *
     * @return the asgPolicyList value
     */
    public List<AsgPolicyParameter> asgPolicyList() {
        return this.asgPolicyList;
    }

    /**
     * Set only.
     *
     * @param asgPolicyList the asgPolicyList value to set
     * @return the RuleGroupRequest object itself.
     */
    public RuleGroupRequest withAsgPolicyList(List<AsgPolicyParameter> asgPolicyList) {
        this.asgPolicyList = asgPolicyList;
        return this;
    }

    /**
     * Get 추후 제공될 예정입니다. 현재는 미사용 상태.
     *
     * @return the cfTriggers value
     */
    public List<String> cfTriggers() {
        return this.cfTriggers;
    }

    /**
     * Set 추후 제공될 예정입니다. 현재는 미사용 상태.
     *
     * @param cfTriggers the cfTriggers value to set
     * @return the RuleGroupRequest object itself.
     */
    public RuleGroupRequest withCfTriggers(List<String> cfTriggers) {
        this.cfTriggers = cfTriggers;
        return this;
    }

    /**
     * Get event Rule 설명.
     *
     * @return the groupDesc value
     */
    public String groupDesc() {
        return this.groupDesc;
    }

    /**
     * Set event Rule 설명.
     *
     * @param groupDesc the groupDesc value to set
     * @return the RuleGroupRequest object itself.
     */
    public RuleGroupRequest withGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }

    /**
     * Get event Rule 이름.
     *
     * @return the groupName value
     */
    public String groupName() {
        return this.groupName;
    }

    /**
     * Set event Rule 이름.
     *
     * @param groupName the groupName value to set
     * @return the RuleGroupRequest object itself.
     */
    public RuleGroupRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Get event Rule id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set event Rule id.
     *
     * @param id the id value to set
     * @return the RuleGroupRequest object itself.
     */
    public RuleGroupRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get 감시 항목 그룹 id, 여러개 입력 가능.
     *
     * @return the metricsGroupKey value
     */
    public List<String> metricsGroupKey() {
        return this.metricsGroupKey;
    }

    /**
     * Set 감시 항목 그룹 id, 여러개 입력 가능.
     *
     * @param metricsGroupKey the metricsGroupKey value to set
     * @return the RuleGroupRequest object itself.
     */
    public RuleGroupRequest withMetricsGroupKey(List<String> metricsGroupKey) {
        this.metricsGroupKey = metricsGroupKey;
        return this;
    }

    /**
     * Get 감시 대상 그룹 id, 여러개 입력 가능.
     *
     * @return the monitorGroupKey value
     */
    public List<String> monitorGroupKey() {
        return this.monitorGroupKey;
    }

    /**
     * Set 감시 대상 그룹 id, 여러개 입력 가능.
     *
     * @param monitorGroupKey the monitorGroupKey value to set
     * @return the RuleGroupRequest object itself.
     */
    public RuleGroupRequest withMonitorGroupKey(List<String> monitorGroupKey) {
        this.monitorGroupKey = monitorGroupKey;
        return this;
    }

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
     * @return the RuleGroupRequest object itself.
     */
    public RuleGroupRequest withProdKey(String prodKey) {
        this.prodKey = prodKey;
        return this;
    }

    /**
     * Get 통보 대상 그룹, 여러개 입력 가능.
     *
     * @return the recipientNotifications value
     */
    public List<RecipientNotificationParameter> recipientNotifications() {
        return this.recipientNotifications;
    }

    /**
     * Set 통보 대상 그룹, 여러개 입력 가능.
     *
     * @param recipientNotifications the recipientNotifications value to set
     * @return the RuleGroupRequest object itself.
     */
    public RuleGroupRequest withRecipientNotifications(List<RecipientNotificationParameter> recipientNotifications) {
        this.recipientNotifications = recipientNotifications;
        return this;
    }

    /**
     * Get event Rule 중 비활성화 시킬 목록 설정.
     *
     * @return the suspendRuleItems value
     */
    public List<SuspendRuleItemParameter> suspendRuleItems() {
        return this.suspendRuleItems;
    }

    /**
     * Set event Rule 중 비활성화 시킬 목록 설정.
     *
     * @param suspendRuleItems the suspendRuleItems value to set
     * @return the RuleGroupRequest object itself.
     */
    public RuleGroupRequest withSuspendRuleItems(List<SuspendRuleItemParameter> suspendRuleItems) {
        this.suspendRuleItems = suspendRuleItems;
        return this;
    }

}
