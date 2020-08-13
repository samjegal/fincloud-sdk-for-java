/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The VpcPeeringInstanceList model.
 */
public class VpcPeeringInstanceList {
    /**
     * VPC 피어링 인스턴스 번호.
     */
    @JsonProperty(value = "vpcPeeringInstanceNo")
    private String vpcPeeringInstanceNo;

    /**
     * VPC 피어링 이름.
     */
    @JsonProperty(value = "vpcPeeringName")
    private String vpcPeeringName;

    /**
     * 리전 코드.
     */
    @JsonProperty(value = "regionCode")
    private String regionCode;

    /**
     * 생성 일자.
     */
    @JsonProperty(value = "createDate")
    private String createDate;

    /**
     * VPC 피어링 인스턴스 상태.
     */
    @JsonProperty(value = "vpcPeeringInstanceStatus")
    private VpcPeeringInstanceStatus vpcPeeringInstanceStatus;

    /**
     * VPC 피어링 인스턴스 상태 이름.
     */
    @JsonProperty(value = "vpcPeeringInstanceStatusName")
    private String vpcPeeringInstanceStatusName;

    /**
     * The vpcPeeringInstanceOperation property.
     */
    @JsonProperty(value = "vpcPeeringInstanceOperation")
    private Object vpcPeeringInstanceOperation;

    /**
     * 소스 VPC 번호.
     */
    @JsonProperty(value = "sourceVpcNo")
    private String sourceVpcNo;

    /**
     * 소스 VPC 이름.
     */
    @JsonProperty(value = "sourceVpcName")
    private String sourceVpcName;

    /**
     * 소스 VPC IP 주소 CIDR.
     */
    @JsonProperty(value = "sourceVpcIpv4CidrBlock")
    private String sourceVpcIpv4CidrBlock;

    /**
     * 소스 VPC 로그인 아이디.
     */
    @JsonProperty(value = "sourceVpcLoginId")
    private String sourceVpcLoginId;

    /**
     * 타겟 VPC 번호.
     */
    @JsonProperty(value = "targetVpcNo")
    private String targetVpcNo;

    /**
     * 타겟 VPC 이름.
     */
    @JsonProperty(value = "targetVpcName")
    private String targetVpcName;

    /**
     * 타겟 VPC IP 주소 CIDR.
     */
    @JsonProperty(value = "targetVpcIpv4CidrBlock")
    private String targetVpcIpv4CidrBlock;

    /**
     * 타겟 VPC 로그인 ID.
     */
    @JsonProperty(value = "targetVpcLoginId")
    private String targetVpcLoginId;

    /**
     * VPC 피어링 설명.
     */
    @JsonProperty(value = "vpcPeeringDescription")
    private String vpcPeeringDescription;

    /**
     * 리버스 VPC 피어링 여부.
     */
    @JsonProperty(value = "hasReverseVpcPeering")
    private Boolean hasReverseVpcPeering;

    /**
     * 계정간 피어링 여부.
     */
    @JsonProperty(value = "isBetweenAccounts")
    private Boolean isBetweenAccounts;

    /**
     * 리버스 VPC 피어링 인스턴스 번호.
     */
    @JsonProperty(value = "reverseVpcPeeringInstanceNo")
    private String reverseVpcPeeringInstanceNo;

    /**
     * Get vPC 피어링 인스턴스 번호.
     *
     * @return the vpcPeeringInstanceNo value
     */
    public String vpcPeeringInstanceNo() {
        return this.vpcPeeringInstanceNo;
    }

    /**
     * Set vPC 피어링 인스턴스 번호.
     *
     * @param vpcPeeringInstanceNo the vpcPeeringInstanceNo value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withVpcPeeringInstanceNo(String vpcPeeringInstanceNo) {
        this.vpcPeeringInstanceNo = vpcPeeringInstanceNo;
        return this;
    }

    /**
     * Get vPC 피어링 이름.
     *
     * @return the vpcPeeringName value
     */
    public String vpcPeeringName() {
        return this.vpcPeeringName;
    }

    /**
     * Set vPC 피어링 이름.
     *
     * @param vpcPeeringName the vpcPeeringName value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withVpcPeeringName(String vpcPeeringName) {
        this.vpcPeeringName = vpcPeeringName;
        return this;
    }

    /**
     * Get 리전 코드.
     *
     * @return the regionCode value
     */
    public String regionCode() {
        return this.regionCode;
    }

    /**
     * Set 리전 코드.
     *
     * @param regionCode the regionCode value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withRegionCode(String regionCode) {
        this.regionCode = regionCode;
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
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Get vPC 피어링 인스턴스 상태.
     *
     * @return the vpcPeeringInstanceStatus value
     */
    public VpcPeeringInstanceStatus vpcPeeringInstanceStatus() {
        return this.vpcPeeringInstanceStatus;
    }

    /**
     * Set vPC 피어링 인스턴스 상태.
     *
     * @param vpcPeeringInstanceStatus the vpcPeeringInstanceStatus value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withVpcPeeringInstanceStatus(VpcPeeringInstanceStatus vpcPeeringInstanceStatus) {
        this.vpcPeeringInstanceStatus = vpcPeeringInstanceStatus;
        return this;
    }

    /**
     * Get vPC 피어링 인스턴스 상태 이름.
     *
     * @return the vpcPeeringInstanceStatusName value
     */
    public String vpcPeeringInstanceStatusName() {
        return this.vpcPeeringInstanceStatusName;
    }

    /**
     * Set vPC 피어링 인스턴스 상태 이름.
     *
     * @param vpcPeeringInstanceStatusName the vpcPeeringInstanceStatusName value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withVpcPeeringInstanceStatusName(String vpcPeeringInstanceStatusName) {
        this.vpcPeeringInstanceStatusName = vpcPeeringInstanceStatusName;
        return this;
    }

    /**
     * Get the vpcPeeringInstanceOperation value.
     *
     * @return the vpcPeeringInstanceOperation value
     */
    public Object vpcPeeringInstanceOperation() {
        return this.vpcPeeringInstanceOperation;
    }

    /**
     * Set the vpcPeeringInstanceOperation value.
     *
     * @param vpcPeeringInstanceOperation the vpcPeeringInstanceOperation value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withVpcPeeringInstanceOperation(Object vpcPeeringInstanceOperation) {
        this.vpcPeeringInstanceOperation = vpcPeeringInstanceOperation;
        return this;
    }

    /**
     * Get 소스 VPC 번호.
     *
     * @return the sourceVpcNo value
     */
    public String sourceVpcNo() {
        return this.sourceVpcNo;
    }

    /**
     * Set 소스 VPC 번호.
     *
     * @param sourceVpcNo the sourceVpcNo value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withSourceVpcNo(String sourceVpcNo) {
        this.sourceVpcNo = sourceVpcNo;
        return this;
    }

    /**
     * Get 소스 VPC 이름.
     *
     * @return the sourceVpcName value
     */
    public String sourceVpcName() {
        return this.sourceVpcName;
    }

    /**
     * Set 소스 VPC 이름.
     *
     * @param sourceVpcName the sourceVpcName value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withSourceVpcName(String sourceVpcName) {
        this.sourceVpcName = sourceVpcName;
        return this;
    }

    /**
     * Get 소스 VPC IP 주소 CIDR.
     *
     * @return the sourceVpcIpv4CidrBlock value
     */
    public String sourceVpcIpv4CidrBlock() {
        return this.sourceVpcIpv4CidrBlock;
    }

    /**
     * Set 소스 VPC IP 주소 CIDR.
     *
     * @param sourceVpcIpv4CidrBlock the sourceVpcIpv4CidrBlock value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withSourceVpcIpv4CidrBlock(String sourceVpcIpv4CidrBlock) {
        this.sourceVpcIpv4CidrBlock = sourceVpcIpv4CidrBlock;
        return this;
    }

    /**
     * Get 소스 VPC 로그인 아이디.
     *
     * @return the sourceVpcLoginId value
     */
    public String sourceVpcLoginId() {
        return this.sourceVpcLoginId;
    }

    /**
     * Set 소스 VPC 로그인 아이디.
     *
     * @param sourceVpcLoginId the sourceVpcLoginId value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withSourceVpcLoginId(String sourceVpcLoginId) {
        this.sourceVpcLoginId = sourceVpcLoginId;
        return this;
    }

    /**
     * Get 타겟 VPC 번호.
     *
     * @return the targetVpcNo value
     */
    public String targetVpcNo() {
        return this.targetVpcNo;
    }

    /**
     * Set 타겟 VPC 번호.
     *
     * @param targetVpcNo the targetVpcNo value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withTargetVpcNo(String targetVpcNo) {
        this.targetVpcNo = targetVpcNo;
        return this;
    }

    /**
     * Get 타겟 VPC 이름.
     *
     * @return the targetVpcName value
     */
    public String targetVpcName() {
        return this.targetVpcName;
    }

    /**
     * Set 타겟 VPC 이름.
     *
     * @param targetVpcName the targetVpcName value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withTargetVpcName(String targetVpcName) {
        this.targetVpcName = targetVpcName;
        return this;
    }

    /**
     * Get 타겟 VPC IP 주소 CIDR.
     *
     * @return the targetVpcIpv4CidrBlock value
     */
    public String targetVpcIpv4CidrBlock() {
        return this.targetVpcIpv4CidrBlock;
    }

    /**
     * Set 타겟 VPC IP 주소 CIDR.
     *
     * @param targetVpcIpv4CidrBlock the targetVpcIpv4CidrBlock value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withTargetVpcIpv4CidrBlock(String targetVpcIpv4CidrBlock) {
        this.targetVpcIpv4CidrBlock = targetVpcIpv4CidrBlock;
        return this;
    }

    /**
     * Get 타겟 VPC 로그인 ID.
     *
     * @return the targetVpcLoginId value
     */
    public String targetVpcLoginId() {
        return this.targetVpcLoginId;
    }

    /**
     * Set 타겟 VPC 로그인 ID.
     *
     * @param targetVpcLoginId the targetVpcLoginId value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withTargetVpcLoginId(String targetVpcLoginId) {
        this.targetVpcLoginId = targetVpcLoginId;
        return this;
    }

    /**
     * Get vPC 피어링 설명.
     *
     * @return the vpcPeeringDescription value
     */
    public String vpcPeeringDescription() {
        return this.vpcPeeringDescription;
    }

    /**
     * Set vPC 피어링 설명.
     *
     * @param vpcPeeringDescription the vpcPeeringDescription value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withVpcPeeringDescription(String vpcPeeringDescription) {
        this.vpcPeeringDescription = vpcPeeringDescription;
        return this;
    }

    /**
     * Get 리버스 VPC 피어링 여부.
     *
     * @return the hasReverseVpcPeering value
     */
    public Boolean hasReverseVpcPeering() {
        return this.hasReverseVpcPeering;
    }

    /**
     * Set 리버스 VPC 피어링 여부.
     *
     * @param hasReverseVpcPeering the hasReverseVpcPeering value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withHasReverseVpcPeering(Boolean hasReverseVpcPeering) {
        this.hasReverseVpcPeering = hasReverseVpcPeering;
        return this;
    }

    /**
     * Get 계정간 피어링 여부.
     *
     * @return the isBetweenAccounts value
     */
    public Boolean isBetweenAccounts() {
        return this.isBetweenAccounts;
    }

    /**
     * Set 계정간 피어링 여부.
     *
     * @param isBetweenAccounts the isBetweenAccounts value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withIsBetweenAccounts(Boolean isBetweenAccounts) {
        this.isBetweenAccounts = isBetweenAccounts;
        return this;
    }

    /**
     * Get 리버스 VPC 피어링 인스턴스 번호.
     *
     * @return the reverseVpcPeeringInstanceNo value
     */
    public String reverseVpcPeeringInstanceNo() {
        return this.reverseVpcPeeringInstanceNo;
    }

    /**
     * Set 리버스 VPC 피어링 인스턴스 번호.
     *
     * @param reverseVpcPeeringInstanceNo the reverseVpcPeeringInstanceNo value to set
     * @return the VpcPeeringInstanceList object itself.
     */
    public VpcPeeringInstanceList withReverseVpcPeeringInstanceNo(String reverseVpcPeeringInstanceNo) {
        this.reverseVpcPeeringInstanceNo = reverseVpcPeeringInstanceNo;
        return this;
    }

}
