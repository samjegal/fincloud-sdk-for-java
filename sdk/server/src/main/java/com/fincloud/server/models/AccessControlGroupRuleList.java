/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AccessControlGroupRuleList model.
 */
public class AccessControlGroupRuleList {
    /**
     * ACG 번호.
     */
    @JsonProperty(value = "accessControlGroupNo")
    private String accessControlGroupNo;

    /**
     * 프로토콜 타입.
     */
    @JsonProperty(value = "protocolType")
    private ProtocolType protocolType;

    /**
     * 차단 여부.
     */
    @JsonProperty(value = "ipBlock")
    private String ipBlock;

    /**
     * ACG 시퀀스.
     */
    @JsonProperty(value = "accessControlGroupSequence")
    private String accessControlGroupSequence;

    /**
     * 포트 범위.
     */
    @JsonProperty(value = "portRange")
    private String portRange;

    /**
     * ACG 룰 타입.
     */
    @JsonProperty(value = "accessControlGroupRuleType")
    private AccessControlGroupRuleType accessControlGroupRuleType;

    /**
     * ACG 설명.
     */
    @JsonProperty(value = "accessControlGroupDescription")
    private String accessControlGroupDescription;

    /**
     * Get aCG 번호.
     *
     * @return the accessControlGroupNo value
     */
    public String accessControlGroupNo() {
        return this.accessControlGroupNo;
    }

    /**
     * Set aCG 번호.
     *
     * @param accessControlGroupNo the accessControlGroupNo value to set
     * @return the AccessControlGroupRuleList object itself.
     */
    public AccessControlGroupRuleList withAccessControlGroupNo(String accessControlGroupNo) {
        this.accessControlGroupNo = accessControlGroupNo;
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
     * @return the AccessControlGroupRuleList object itself.
     */
    public AccessControlGroupRuleList withProtocolType(ProtocolType protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * Get 차단 여부.
     *
     * @return the ipBlock value
     */
    public String ipBlock() {
        return this.ipBlock;
    }

    /**
     * Set 차단 여부.
     *
     * @param ipBlock the ipBlock value to set
     * @return the AccessControlGroupRuleList object itself.
     */
    public AccessControlGroupRuleList withIpBlock(String ipBlock) {
        this.ipBlock = ipBlock;
        return this;
    }

    /**
     * Get aCG 시퀀스.
     *
     * @return the accessControlGroupSequence value
     */
    public String accessControlGroupSequence() {
        return this.accessControlGroupSequence;
    }

    /**
     * Set aCG 시퀀스.
     *
     * @param accessControlGroupSequence the accessControlGroupSequence value to set
     * @return the AccessControlGroupRuleList object itself.
     */
    public AccessControlGroupRuleList withAccessControlGroupSequence(String accessControlGroupSequence) {
        this.accessControlGroupSequence = accessControlGroupSequence;
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
     * @return the AccessControlGroupRuleList object itself.
     */
    public AccessControlGroupRuleList withPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }

    /**
     * Get aCG 룰 타입.
     *
     * @return the accessControlGroupRuleType value
     */
    public AccessControlGroupRuleType accessControlGroupRuleType() {
        return this.accessControlGroupRuleType;
    }

    /**
     * Set aCG 룰 타입.
     *
     * @param accessControlGroupRuleType the accessControlGroupRuleType value to set
     * @return the AccessControlGroupRuleList object itself.
     */
    public AccessControlGroupRuleList withAccessControlGroupRuleType(AccessControlGroupRuleType accessControlGroupRuleType) {
        this.accessControlGroupRuleType = accessControlGroupRuleType;
        return this;
    }

    /**
     * Get aCG 설명.
     *
     * @return the accessControlGroupDescription value
     */
    public String accessControlGroupDescription() {
        return this.accessControlGroupDescription;
    }

    /**
     * Set aCG 설명.
     *
     * @param accessControlGroupDescription the accessControlGroupDescription value to set
     * @return the AccessControlGroupRuleList object itself.
     */
    public AccessControlGroupRuleList withAccessControlGroupDescription(String accessControlGroupDescription) {
        this.accessControlGroupDescription = accessControlGroupDescription;
        return this;
    }

}
