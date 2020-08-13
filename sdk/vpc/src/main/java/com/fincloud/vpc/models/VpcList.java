/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The VpcList model.
 */
public class VpcList {
    /**
     * VPC 번호.
     */
    @JsonProperty(value = "vpcNo")
    private String vpcNo;

    /**
     * VPC 이름.
     */
    @JsonProperty(value = "vpcName")
    private String vpcName;

    /**
     * IP 주소 CIDR.
     */
    @JsonProperty(value = "ipv4CidrBlock")
    private String ipv4CidrBlock;

    /**
     * VPC 상태.
     */
    @JsonProperty(value = "vpcStatus")
    private VpcStatus vpcStatus;

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
     * Get vPC 번호.
     *
     * @return the vpcNo value
     */
    public String vpcNo() {
        return this.vpcNo;
    }

    /**
     * Set vPC 번호.
     *
     * @param vpcNo the vpcNo value to set
     * @return the VpcList object itself.
     */
    public VpcList withVpcNo(String vpcNo) {
        this.vpcNo = vpcNo;
        return this;
    }

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
     * @return the VpcList object itself.
     */
    public VpcList withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * Get iP 주소 CIDR.
     *
     * @return the ipv4CidrBlock value
     */
    public String ipv4CidrBlock() {
        return this.ipv4CidrBlock;
    }

    /**
     * Set iP 주소 CIDR.
     *
     * @param ipv4CidrBlock the ipv4CidrBlock value to set
     * @return the VpcList object itself.
     */
    public VpcList withIpv4CidrBlock(String ipv4CidrBlock) {
        this.ipv4CidrBlock = ipv4CidrBlock;
        return this;
    }

    /**
     * Get vPC 상태.
     *
     * @return the vpcStatus value
     */
    public VpcStatus vpcStatus() {
        return this.vpcStatus;
    }

    /**
     * Set vPC 상태.
     *
     * @param vpcStatus the vpcStatus value to set
     * @return the VpcList object itself.
     */
    public VpcList withVpcStatus(VpcStatus vpcStatus) {
        this.vpcStatus = vpcStatus;
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
     * @return the VpcList object itself.
     */
    public VpcList withRegionCode(String regionCode) {
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
     * @return the VpcList object itself.
     */
    public VpcList withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

}
