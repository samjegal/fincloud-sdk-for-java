/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RuleGroup.
 */
public class RuleGroup {
    /**
     * The actionSubAccountId property.
     */
    @JsonProperty(value = "actionSubAccountId")
    private Integer actionSubAccountId;

    /**
     * The actionUserType property.
     */
    @JsonProperty(value = "actionUserType")
    private String actionUserType;

    /**
     * The asgPolicyMap property.
     */
    @JsonProperty(value = "asgPolicyMap")
    private Map<String, List<AsgPolicyParameter>> asgPolicyMap;

    /**
     * The cfTriggers property.
     */
    @JsonProperty(value = "cfTriggers")
    private List<String> cfTriggers;

    /**
     * The createTime property.
     */
    @JsonProperty(value = "createTime")
    private Long createTime;

    /**
     * The domainCode property.
     */
    @JsonProperty(value = "domainCode")
    private String domainCode;

    /**
     * The eventTime property.
     */
    @JsonProperty(value = "eventTime")
    private Long eventTime;

    /**
     * The groupDesc property.
     */
    @JsonProperty(value = "groupDesc")
    private String groupDesc;

    /**
     * The groupName property.
     */
    @JsonProperty(value = "groupName")
    private String groupName;

    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private Long id;

    /**
     * The mbrNo property.
     */
    @JsonProperty(value = "mbrNo")
    private String mbrNo;

    /**
     * The prodKey property.
     */
    @JsonProperty(value = "prodKey")
    private String prodKey;

    /**
     * Possible values include: 'CREATED', 'UPDATED', 'DELETED'.
     */
    @JsonProperty(value = "productDataStatus")
    private RuleGroupProductDataStatus productDataStatus;

    /**
     * The recipientNotifications property.
     */
    @JsonProperty(value = "recipientNotifications")
    private List<RecipientNotificationParameter> recipientNotifications;

    /**
     * The regionCode property.
     */
    @JsonProperty(value = "regionCode")
    private String regionCode;

    /**
     * The relatedNrn property.
     */
    @JsonProperty(value = "relatedNrn")
    private List<String> relatedNrn;

    /**
     * Possible values include: 'V1', 'V2'.
     */
    @JsonProperty(value = "ruleVersion")
    private RuleGroupVersion ruleVersion;

    /**
     * The sourceIp property.
     */
    @JsonProperty(value = "sourceIp")
    private String sourceIp;

    /**
     * The sourceType property.
     */
    @JsonProperty(value = "sourceType")
    private String sourceType;

    /**
     * Possible values include: 'OK', 'VIOLATED', 'INSUFFICIENT'.
     */
    @JsonProperty(value = "status")
    private RuleGroupStatus status;

    /**
     * The suspendRuleItems property.
     */
    @JsonProperty(value = "suspendRuleItems")
    private List<SuspendRuleItemParameter> suspendRuleItems;

    /**
     * The updateTime property.
     */
    @JsonProperty(value = "updateTime")
    private Long updateTime;

    /**
     * Get the actionSubAccountId value.
     *
     * @return the actionSubAccountId value
     */
    public Integer actionSubAccountId() {
        return this.actionSubAccountId;
    }

    /**
     * Set the actionSubAccountId value.
     *
     * @param actionSubAccountId the actionSubAccountId value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withActionSubAccountId(Integer actionSubAccountId) {
        this.actionSubAccountId = actionSubAccountId;
        return this;
    }

    /**
     * Get the actionUserType value.
     *
     * @return the actionUserType value
     */
    public String actionUserType() {
        return this.actionUserType;
    }

    /**
     * Set the actionUserType value.
     *
     * @param actionUserType the actionUserType value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withActionUserType(String actionUserType) {
        this.actionUserType = actionUserType;
        return this;
    }

    /**
     * Get the asgPolicyMap value.
     *
     * @return the asgPolicyMap value
     */
    public Map<String, List<AsgPolicyParameter>> asgPolicyMap() {
        return this.asgPolicyMap;
    }

    /**
     * Set the asgPolicyMap value.
     *
     * @param asgPolicyMap the asgPolicyMap value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withAsgPolicyMap(Map<String, List<AsgPolicyParameter>> asgPolicyMap) {
        this.asgPolicyMap = asgPolicyMap;
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
     * @return the RuleGroup object itself.
     */
    public RuleGroup withCfTriggers(List<String> cfTriggers) {
        this.cfTriggers = cfTriggers;
        return this;
    }

    /**
     * Get the createTime value.
     *
     * @return the createTime value
     */
    public Long createTime() {
        return this.createTime;
    }

    /**
     * Set the createTime value.
     *
     * @param createTime the createTime value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withCreateTime(Long createTime) {
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
     * @return the RuleGroup object itself.
     */
    public RuleGroup withDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }

    /**
     * Get the eventTime value.
     *
     * @return the eventTime value
     */
    public Long eventTime() {
        return this.eventTime;
    }

    /**
     * Set the eventTime value.
     *
     * @param eventTime the eventTime value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withEventTime(Long eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * Get the groupDesc value.
     *
     * @return the groupDesc value
     */
    public String groupDesc() {
        return this.groupDesc;
    }

    /**
     * Set the groupDesc value.
     *
     * @param groupDesc the groupDesc value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }

    /**
     * Get the groupName value.
     *
     * @return the groupName value
     */
    public String groupName() {
        return this.groupName;
    }

    /**
     * Set the groupName value.
     *
     * @param groupName the groupName value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public Long id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get the mbrNo value.
     *
     * @return the mbrNo value
     */
    public String mbrNo() {
        return this.mbrNo;
    }

    /**
     * Set the mbrNo value.
     *
     * @param mbrNo the mbrNo value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withMbrNo(String mbrNo) {
        this.mbrNo = mbrNo;
        return this;
    }

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
     * @return the RuleGroup object itself.
     */
    public RuleGroup withProdKey(String prodKey) {
        this.prodKey = prodKey;
        return this;
    }

    /**
     * Get possible values include: 'CREATED', 'UPDATED', 'DELETED'.
     *
     * @return the productDataStatus value
     */
    public RuleGroupProductDataStatus productDataStatus() {
        return this.productDataStatus;
    }

    /**
     * Set possible values include: 'CREATED', 'UPDATED', 'DELETED'.
     *
     * @param productDataStatus the productDataStatus value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withProductDataStatus(RuleGroupProductDataStatus productDataStatus) {
        this.productDataStatus = productDataStatus;
        return this;
    }

    /**
     * Get the recipientNotifications value.
     *
     * @return the recipientNotifications value
     */
    public List<RecipientNotificationParameter> recipientNotifications() {
        return this.recipientNotifications;
    }

    /**
     * Set the recipientNotifications value.
     *
     * @param recipientNotifications the recipientNotifications value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withRecipientNotifications(List<RecipientNotificationParameter> recipientNotifications) {
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
     * @return the RuleGroup object itself.
     */
    public RuleGroup withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * Get the relatedNrn value.
     *
     * @return the relatedNrn value
     */
    public List<String> relatedNrn() {
        return this.relatedNrn;
    }

    /**
     * Set the relatedNrn value.
     *
     * @param relatedNrn the relatedNrn value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withRelatedNrn(List<String> relatedNrn) {
        this.relatedNrn = relatedNrn;
        return this;
    }

    /**
     * Get possible values include: 'V1', 'V2'.
     *
     * @return the ruleVersion value
     */
    public RuleGroupVersion ruleVersion() {
        return this.ruleVersion;
    }

    /**
     * Set possible values include: 'V1', 'V2'.
     *
     * @param ruleVersion the ruleVersion value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withRuleVersion(RuleGroupVersion ruleVersion) {
        this.ruleVersion = ruleVersion;
        return this;
    }

    /**
     * Get the sourceIp value.
     *
     * @return the sourceIp value
     */
    public String sourceIp() {
        return this.sourceIp;
    }

    /**
     * Set the sourceIp value.
     *
     * @param sourceIp the sourceIp value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    /**
     * Get the sourceType value.
     *
     * @return the sourceType value
     */
    public String sourceType() {
        return this.sourceType;
    }

    /**
     * Set the sourceType value.
     *
     * @param sourceType the sourceType value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get possible values include: 'OK', 'VIOLATED', 'INSUFFICIENT'.
     *
     * @return the status value
     */
    public RuleGroupStatus status() {
        return this.status;
    }

    /**
     * Set possible values include: 'OK', 'VIOLATED', 'INSUFFICIENT'.
     *
     * @param status the status value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withStatus(RuleGroupStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the suspendRuleItems value.
     *
     * @return the suspendRuleItems value
     */
    public List<SuspendRuleItemParameter> suspendRuleItems() {
        return this.suspendRuleItems;
    }

    /**
     * Set the suspendRuleItems value.
     *
     * @param suspendRuleItems the suspendRuleItems value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withSuspendRuleItems(List<SuspendRuleItemParameter> suspendRuleItems) {
        this.suspendRuleItems = suspendRuleItems;
        return this;
    }

    /**
     * Get the updateTime value.
     *
     * @return the updateTime value
     */
    public Long updateTime() {
        return this.updateTime;
    }

    /**
     * Set the updateTime value.
     *
     * @param updateTime the updateTime value to set
     * @return the RuleGroup object itself.
     */
    public RuleGroup withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

}
