/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The NetworkAclRuleList model.
 */
public class NetworkAclRuleList {
    /**
     * 네트워크 ACL 번호.
     */
    @JsonProperty(value = "networkAclNo")
    private String networkAclNo;

    /**
     * 우선순위.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /**
     * 프로토콜 타입.
     */
    @JsonProperty(value = "protocolType")
    private ProtocolType protocolType;

    /**
     * 포트 범위.
     */
    @JsonProperty(value = "portRange")
    private String portRange;

    /**
     * 룰 액션.
     */
    @JsonProperty(value = "ruleAction")
    private RuleAction ruleAction;

    /**
     * 생성 일자.
     */
    @JsonProperty(value = "createDate")
    private String createDate;

    /**
     * 블럭 여부.
     */
    @JsonProperty(value = "ipBlock")
    private String ipBlock;

    /**
     * 네트워크 ACL 룰 타입.
     */
    @JsonProperty(value = "networkAclRuleType")
    private NetworkAclRuleType networkAclRuleType;

    /**
     * 네트워크 ACL 룰 설명.
     */
    @JsonProperty(value = "networkAclRuleDescription")
    private String networkAclRuleDescription;

    /**
     * Get 네트워크 ACL 번호.
     *
     * @return the networkAclNo value
     */
    public String networkAclNo() {
        return this.networkAclNo;
    }

    /**
     * Set 네트워크 ACL 번호.
     *
     * @param networkAclNo the networkAclNo value to set
     * @return the NetworkAclRuleList object itself.
     */
    public NetworkAclRuleList withNetworkAclNo(String networkAclNo) {
        this.networkAclNo = networkAclNo;
        return this;
    }

    /**
     * Get 우선순위.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set 우선순위.
     *
     * @param priority the priority value to set
     * @return the NetworkAclRuleList object itself.
     */
    public NetworkAclRuleList withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get 프로토콜 타입.
     *
     * @return the protocolType value
     */
    public ProtocolType protocolType() {
        return this.protocolType;
    }

    /**
     * Set 프로토콜 타입.
     *
     * @param protocolType the protocolType value to set
     * @return the NetworkAclRuleList object itself.
     */
    public NetworkAclRuleList withProtocolType(ProtocolType protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * Get 포트 범위.
     *
     * @return the portRange value
     */
    public String portRange() {
        return this.portRange;
    }

    /**
     * Set 포트 범위.
     *
     * @param portRange the portRange value to set
     * @return the NetworkAclRuleList object itself.
     */
    public NetworkAclRuleList withPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }

    /**
     * Get 룰 액션.
     *
     * @return the ruleAction value
     */
    public RuleAction ruleAction() {
        return this.ruleAction;
    }

    /**
     * Set 룰 액션.
     *
     * @param ruleAction the ruleAction value to set
     * @return the NetworkAclRuleList object itself.
     */
    public NetworkAclRuleList withRuleAction(RuleAction ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }

    /**
     * Get 생성 일자.
     *
     * @return the createDate value
     */
    public String createDate() {
        return this.createDate;
    }

    /**
     * Set 생성 일자.
     *
     * @param createDate the createDate value to set
     * @return the NetworkAclRuleList object itself.
     */
    public NetworkAclRuleList withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Get 블럭 여부.
     *
     * @return the ipBlock value
     */
    public String ipBlock() {
        return this.ipBlock;
    }

    /**
     * Set 블럭 여부.
     *
     * @param ipBlock the ipBlock value to set
     * @return the NetworkAclRuleList object itself.
     */
    public NetworkAclRuleList withIpBlock(String ipBlock) {
        this.ipBlock = ipBlock;
        return this;
    }

    /**
     * Get 네트워크 ACL 룰 타입.
     *
     * @return the networkAclRuleType value
     */
    public NetworkAclRuleType networkAclRuleType() {
        return this.networkAclRuleType;
    }

    /**
     * Set 네트워크 ACL 룰 타입.
     *
     * @param networkAclRuleType the networkAclRuleType value to set
     * @return the NetworkAclRuleList object itself.
     */
    public NetworkAclRuleList withNetworkAclRuleType(NetworkAclRuleType networkAclRuleType) {
        this.networkAclRuleType = networkAclRuleType;
        return this;
    }

    /**
     * Get 네트워크 ACL 룰 설명.
     *
     * @return the networkAclRuleDescription value
     */
    public String networkAclRuleDescription() {
        return this.networkAclRuleDescription;
    }

    /**
     * Set 네트워크 ACL 룰 설명.
     *
     * @param networkAclRuleDescription the networkAclRuleDescription value to set
     * @return the NetworkAclRuleList object itself.
     */
    public NetworkAclRuleList withNetworkAclRuleDescription(String networkAclRuleDescription) {
        this.networkAclRuleDescription = networkAclRuleDescription;
        return this;
    }

}
