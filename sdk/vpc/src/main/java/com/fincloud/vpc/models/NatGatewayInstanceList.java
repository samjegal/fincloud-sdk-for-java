/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The NatGatewayInstanceList model.
 */
public class NatGatewayInstanceList {
    /**
     * VPC 이름.
     */
    @JsonProperty(value = "vpcName")
    private String vpcName;

    /**
     * NAT 게이트웨이 인스턴스 번호.
     */
    @JsonProperty(value = "natGatewayInstanceNo")
    private String natGatewayInstanceNo;

    /**
     * NAT 게이트웨이 이름.
     */
    @JsonProperty(value = "natGatewayName")
    private String natGatewayName;

    /**
     * 공인 IP 주소.
     */
    @JsonProperty(value = "publicIp")
    private String publicIp;

    /**
     * NAT 게이트웨이 인스턴스 상태.
     */
    @JsonProperty(value = "natGatewayInstanceStatus")
    private NatGatewayInstanceStatus natGatewayInstanceStatus;

    /**
     * NAT 게이트웨이 인스턴스 상태 이름.
     */
    @JsonProperty(value = "natGatewayInstanceStatusName")
    private String natGatewayInstanceStatusName;

    /**
     * The natGatewayInstanceOperation property.
     */
    @JsonProperty(value = "natGatewayInstanceOperation")
    private Object natGatewayInstanceOperation;

    /**
     * 생성 일자.
     */
    @JsonProperty(value = "createDate")
    private String createDate;

    /**
     * NAT 게이트웨이 설명.
     */
    @JsonProperty(value = "natGatewayDescription")
    private String natGatewayDescription;

    /**
     * Get vPC 이름.
     *
     * @return the vpcName value
     */
    public String vpcName() {
        return this.vpcName;
    }

    /**
     * Set vPC 이름.
     *
     * @param vpcName the vpcName value to set
     * @return the NatGatewayInstanceList object itself.
     */
    public NatGatewayInstanceList withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * Get nAT 게이트웨이 인스턴스 번호.
     *
     * @return the natGatewayInstanceNo value
     */
    public String natGatewayInstanceNo() {
        return this.natGatewayInstanceNo;
    }

    /**
     * Set nAT 게이트웨이 인스턴스 번호.
     *
     * @param natGatewayInstanceNo the natGatewayInstanceNo value to set
     * @return the NatGatewayInstanceList object itself.
     */
    public NatGatewayInstanceList withNatGatewayInstanceNo(String natGatewayInstanceNo) {
        this.natGatewayInstanceNo = natGatewayInstanceNo;
        return this;
    }

    /**
     * Get nAT 게이트웨이 이름.
     *
     * @return the natGatewayName value
     */
    public String natGatewayName() {
        return this.natGatewayName;
    }

    /**
     * Set nAT 게이트웨이 이름.
     *
     * @param natGatewayName the natGatewayName value to set
     * @return the NatGatewayInstanceList object itself.
     */
    public NatGatewayInstanceList withNatGatewayName(String natGatewayName) {
        this.natGatewayName = natGatewayName;
        return this;
    }

    /**
     * Get 공인 IP 주소.
     *
     * @return the publicIp value
     */
    public String publicIp() {
        return this.publicIp;
    }

    /**
     * Set 공인 IP 주소.
     *
     * @param publicIp the publicIp value to set
     * @return the NatGatewayInstanceList object itself.
     */
    public NatGatewayInstanceList withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * Get nAT 게이트웨이 인스턴스 상태.
     *
     * @return the natGatewayInstanceStatus value
     */
    public NatGatewayInstanceStatus natGatewayInstanceStatus() {
        return this.natGatewayInstanceStatus;
    }

    /**
     * Set nAT 게이트웨이 인스턴스 상태.
     *
     * @param natGatewayInstanceStatus the natGatewayInstanceStatus value to set
     * @return the NatGatewayInstanceList object itself.
     */
    public NatGatewayInstanceList withNatGatewayInstanceStatus(NatGatewayInstanceStatus natGatewayInstanceStatus) {
        this.natGatewayInstanceStatus = natGatewayInstanceStatus;
        return this;
    }

    /**
     * Get nAT 게이트웨이 인스턴스 상태 이름.
     *
     * @return the natGatewayInstanceStatusName value
     */
    public String natGatewayInstanceStatusName() {
        return this.natGatewayInstanceStatusName;
    }

    /**
     * Set nAT 게이트웨이 인스턴스 상태 이름.
     *
     * @param natGatewayInstanceStatusName the natGatewayInstanceStatusName value to set
     * @return the NatGatewayInstanceList object itself.
     */
    public NatGatewayInstanceList withNatGatewayInstanceStatusName(String natGatewayInstanceStatusName) {
        this.natGatewayInstanceStatusName = natGatewayInstanceStatusName;
        return this;
    }

    /**
     * Get the natGatewayInstanceOperation value.
     *
     * @return the natGatewayInstanceOperation value
     */
    public Object natGatewayInstanceOperation() {
        return this.natGatewayInstanceOperation;
    }

    /**
     * Set the natGatewayInstanceOperation value.
     *
     * @param natGatewayInstanceOperation the natGatewayInstanceOperation value to set
     * @return the NatGatewayInstanceList object itself.
     */
    public NatGatewayInstanceList withNatGatewayInstanceOperation(Object natGatewayInstanceOperation) {
        this.natGatewayInstanceOperation = natGatewayInstanceOperation;
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
     * @return the NatGatewayInstanceList object itself.
     */
    public NatGatewayInstanceList withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Get nAT 게이트웨이 설명.
     *
     * @return the natGatewayDescription value
     */
    public String natGatewayDescription() {
        return this.natGatewayDescription;
    }

    /**
     * Set nAT 게이트웨이 설명.
     *
     * @param natGatewayDescription the natGatewayDescription value to set
     * @return the NatGatewayInstanceList object itself.
     */
    public NatGatewayInstanceList withNatGatewayDescription(String natGatewayDescription) {
        this.natGatewayDescription = natGatewayDescription;
        return this;
    }

}
