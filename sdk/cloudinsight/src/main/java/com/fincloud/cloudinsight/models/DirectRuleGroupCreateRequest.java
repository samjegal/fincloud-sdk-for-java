/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DirectRuleGroupCreateDto.
 * 감시 대상 그룹, 감시 항목 그룹 생성 없이 Event Rule 생성.
 */
public class DirectRuleGroupCreateRequest {
    /**
     * Auto Scaling Group Policy, 여러개 입력 가능.
     */
    @JsonProperty(value = "asgPolicys")
    private List<AsgPolicyParameter> asgPolicys;

    /**
     * The cfTriggers property.
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
    @JsonProperty(value = "groupName")
    private String groupName;

    /**
     * 감시 항목 설정.
     */
    @JsonProperty(value = "metricsGroup")
    private MetricsGroupCreateorUpdateParameter metricsGroup;

    /**
     * 감시 대상 설정.
     */
    @JsonProperty(value = "monitorGroup")
    private MonitorGroupParameter monitorGroup;

    /**
     * 상품의 cw_key.
     */
    @JsonProperty(value = "prodKey")
    private String prodKey;

    /**
     * 통보대상그룹, 여러개 입력 가능.
     */
    @JsonProperty(value = "recipientNotifications")
    private List<RecipientNotificationParameter> recipientNotifications;

    /**
     * Get auto Scaling Group Policy, 여러개 입력 가능.
     *
     * @return the asgPolicys value
     */
    public List<AsgPolicyParameter> asgPolicys() {
        return this.asgPolicys;
    }

    /**
     * Set auto Scaling Group Policy, 여러개 입력 가능.
     *
     * @param asgPolicys the asgPolicys value to set
     * @return the DirectRuleGroupCreateRequest object itself.
     */
    public DirectRuleGroupCreateRequest withAsgPolicys(List<AsgPolicyParameter> asgPolicys) {
        this.asgPolicys = asgPolicys;
        return this;
    }

    /**
     * Get the cfTriggers value.
     *
     * @return the cfTriggers value
     */
    public List<String> cfTriggers() {
        return this.cfTriggers;
    }

    /**
     * Set the cfTriggers value.
     *
     * @param cfTriggers the cfTriggers value to set
     * @return the DirectRuleGroupCreateRequest object itself.
     */
    public DirectRuleGroupCreateRequest withCfTriggers(List<String> cfTriggers) {
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
     * @return the DirectRuleGroupCreateRequest object itself.
     */
    public DirectRuleGroupCreateRequest withGroupDesc(String groupDesc) {
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
     * @return the DirectRuleGroupCreateRequest object itself.
     */
    public DirectRuleGroupCreateRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Get 감시 항목 설정.
     *
     * @return the metricsGroup value
     */
    public MetricsGroupCreateorUpdateParameter metricsGroup() {
        return this.metricsGroup;
    }

    /**
     * Set 감시 항목 설정.
     *
     * @param metricsGroup the metricsGroup value to set
     * @return the DirectRuleGroupCreateRequest object itself.
     */
    public DirectRuleGroupCreateRequest withMetricsGroup(MetricsGroupCreateorUpdateParameter metricsGroup) {
        this.metricsGroup = metricsGroup;
        return this;
    }

    /**
     * Get 감시 대상 설정.
     *
     * @return the monitorGroup value
     */
    public MonitorGroupParameter monitorGroup() {
        return this.monitorGroup;
    }

    /**
     * Set 감시 대상 설정.
     *
     * @param monitorGroup the monitorGroup value to set
     * @return the DirectRuleGroupCreateRequest object itself.
     */
    public DirectRuleGroupCreateRequest withMonitorGroup(MonitorGroupParameter monitorGroup) {
        this.monitorGroup = monitorGroup;
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
     * @return the DirectRuleGroupCreateRequest object itself.
     */
    public DirectRuleGroupCreateRequest withProdKey(String prodKey) {
        this.prodKey = prodKey;
        return this;
    }

    /**
     * Get 통보대상그룹, 여러개 입력 가능.
     *
     * @return the recipientNotifications value
     */
    public List<RecipientNotificationParameter> recipientNotifications() {
        return this.recipientNotifications;
    }

    /**
     * Set 통보대상그룹, 여러개 입력 가능.
     *
     * @param recipientNotifications the recipientNotifications value to set
     * @return the DirectRuleGroupCreateRequest object itself.
     */
    public DirectRuleGroupCreateRequest withRecipientNotifications(List<RecipientNotificationParameter> recipientNotifications) {
        this.recipientNotifications = recipientNotifications;
        return this;
    }

}
