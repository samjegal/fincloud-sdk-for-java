/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RuleGroupItemDto.
 * Rule group item list.
 */
public class RuleGroupItemParameter {
    /**
     * The asgPolicys property.
     */
    @JsonProperty(value = "asgPolicys")
    private List<AsgPolicyParameter> asgPolicys;

    /**
     * 추후 제공될 예정입니다. 현재는 미사용 상태.
     */
    @JsonProperty(value = "cfTriggers")
    private List<String> cfTriggers;

    /**
     * 생성 시간.
     */
    @JsonProperty(value = "createTime")
    private Double createTime;

    /**
     * The domainCode property.
     */
    @JsonProperty(value = "domainCode")
    private String domainCode;

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
     * Event Rule id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The metricsGroups property.
     */
    @JsonProperty(value = "metricsGroups")
    private List<MetricsGroupParameter> metricsGroups;

    /**
     * The monitorGroups property.
     */
    @JsonProperty(value = "monitorGroups")
    private List<MonitorGroupParameter> monitorGroups;

    /**
     * 상품의 cw_key.
     */
    @JsonProperty(value = "prodKey")
    private String prodKey;

    /**
     * 통보 대상 그룹, 여러개 입력 가능.
     */
    @JsonProperty(value = "recipientNotifications")
    private List<RecipientNotificationParameter> recipientNotifications;

    /**
     * The regionCode property.
     */
    @JsonProperty(value = "regionCode")
    private String regionCode;

    /**
     * The ruleVersion property.
     */
    @JsonProperty(value = "ruleVersion")
    private String ruleVersion;

    /**
     * Event Rule 중 비활성화 시킬 목록 설정.
     */
    @JsonProperty(value = "suspendRuleItems")
    private List<SuspendRuleItemParameter> suspendRuleItems;

    /**
     * 갱신 시간.
     */
    @JsonProperty(value = "updateTime")
    private Double updateTime;

    /**
     * Get the asgPolicys value.
     *
     * @return the asgPolicys value
     */
    public List<AsgPolicyParameter> asgPolicys() {
        return this.asgPolicys;
    }

    /**
     * Set the asgPolicys value.
     *
     * @param asgPolicys the asgPolicys value to set
     * @return the RuleGroupItemParameter object itself.
     */
    public RuleGroupItemParameter withAsgPolicys(List<AsgPolicyParameter> asgPolicys) {
        this.asgPolicys = asgPolicys;
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
     * @return the RuleGroupItemParameter object itself.
     */
    public RuleGroupItemParameter withCfTriggers(List<String> cfTriggers) {
        this.cfTriggers = cfTriggers;
        return this;
    }

    /**
     * Get 생성 시간.
     *
     * @return the createTime value
     */
    public Double createTime() {
        return this.createTime;
    }

    /**
     * Set 생성 시간.
     *
     * @param createTime the createTime value to set
     * @return the RuleGroupItemParameter object itself.
     */
    public RuleGroupItemParameter withCreateTime(Double createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get the domainCode value.
     *
     * @return the domainCode value
     */
    public String domainCode() {
        return this.domainCode;
    }

    /**
     * Set the domainCode value.
     *
     * @param domainCode the domainCode value to set
     * @return the RuleGroupItemParameter object itself.
     */
    public RuleGroupItemParameter withDomainCode(String domainCode) {
        this.domainCode = domainCode;
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
     * @return the RuleGroupItemParameter object itself.
     */
    public RuleGroupItemParameter withGroupDesc(String groupDesc) {
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
     * @return the RuleGroupItemParameter object itself.
     */
    public RuleGroupItemParameter withGroupName(String groupName) {
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
     * @return the RuleGroupItemParameter object itself.
     */
    public RuleGroupItemParameter withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the metricsGroups value.
     *
     * @return the metricsGroups value
     */
    public List<MetricsGroupParameter> metricsGroups() {
        return this.metricsGroups;
    }

    /**
     * Set the metricsGroups value.
     *
     * @param metricsGroups the metricsGroups value to set
     * @return the RuleGroupItemParameter object itself.
     */
    public RuleGroupItemParameter withMetricsGroups(List<MetricsGroupParameter> metricsGroups) {
        this.metricsGroups = metricsGroups;
        return this;
    }

    /**
     * Get the monitorGroups value.
     *
     * @return the monitorGroups value
     */
    public List<MonitorGroupParameter> monitorGroups() {
        return this.monitorGroups;
    }

    /**
     * Set the monitorGroups value.
     *
     * @param monitorGroups the monitorGroups value to set
     * @return the RuleGroupItemParameter object itself.
     */
    public RuleGroupItemParameter withMonitorGroups(List<MonitorGroupParameter> monitorGroups) {
        this.monitorGroups = monitorGroups;
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
     * @return the RuleGroupItemParameter object itself.
     */
    public RuleGroupItemParameter withProdKey(String prodKey) {
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
     * @return the RuleGroupItemParameter object itself.
     */
    public RuleGroupItemParameter withRecipientNotifications(List<RecipientNotificationParameter> recipientNotifications) {
        this.recipientNotifications = recipientNotifications;
        return this;
    }

    /**
     * Get the regionCode value.
     *
     * @return the regionCode value
     */
    public String regionCode() {
        return this.regionCode;
    }

    /**
     * Set the regionCode value.
     *
     * @param regionCode the regionCode value to set
     * @return the RuleGroupItemParameter object itself.
     */
    public RuleGroupItemParameter withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * Get the ruleVersion value.
     *
     * @return the ruleVersion value
     */
    public String ruleVersion() {
        return this.ruleVersion;
    }

    /**
     * Set the ruleVersion value.
     *
     * @param ruleVersion the ruleVersion value to set
     * @return the RuleGroupItemParameter object itself.
     */
    public RuleGroupItemParameter withRuleVersion(String ruleVersion) {
        this.ruleVersion = ruleVersion;
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
     * @return the RuleGroupItemParameter object itself.
     */
    public RuleGroupItemParameter withSuspendRuleItems(List<SuspendRuleItemParameter> suspendRuleItems) {
        this.suspendRuleItems = suspendRuleItems;
        return this;
    }

    /**
     * Get 갱신 시간.
     *
     * @return the updateTime value
     */
    public Double updateTime() {
        return this.updateTime;
    }

    /**
     * Set 갱신 시간.
     *
     * @param updateTime the updateTime value to set
     * @return the RuleGroupItemParameter object itself.
     */
    public RuleGroupItemParameter withUpdateTime(Double updateTime) {
        this.updateTime = updateTime;
        return this;
    }

}
