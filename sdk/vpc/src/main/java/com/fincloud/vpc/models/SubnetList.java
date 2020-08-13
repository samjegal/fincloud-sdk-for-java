/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SubnetList model.
 */
public class SubnetList {
    /**
     * 서브넷 번호.
     */
    @JsonProperty(value = "subnetNo")
    private String subnetNo;

    /**
     * VPC 번호.
     */
    @JsonProperty(value = "vpcNo")
    private String vpcNo;

    /**
     * ZONE 코드.
     */
    @JsonProperty(value = "zoneCode")
    private String zoneCode;

    /**
     * 서브넷 이름.
     */
    @JsonProperty(value = "subnetName")
    private String subnetName;

    /**
     * 서브넷 CIDR.
     */
    @JsonProperty(value = "subnet")
    private String subnet;

    /**
     * 서브넷 상태.
     */
    @JsonProperty(value = "subnetStatus")
    private SubnetStatus subnetStatus;

    /**
     * 서브넷 타입.
     */
    @JsonProperty(value = "subnetType")
    private SubnetType subnetType;

    /**
     * Get 서브넷 번호.
     *
     * @return the subnetNo value
     */
    public String subnetNo() {
        return this.subnetNo;
    }

    /**
     * Set 서브넷 번호.
     *
     * @param subnetNo the subnetNo value to set
     * @return the SubnetList object itself.
     */
    public SubnetList withSubnetNo(String subnetNo) {
        this.subnetNo = subnetNo;
        return this;
    }

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
     * @return the SubnetList object itself.
     */
    public SubnetList withVpcNo(String vpcNo) {
        this.vpcNo = vpcNo;
        return this;
    }

    /**
     * Get zONE 코드.
     *
     * @return the zoneCode value
     */
    public String zoneCode() {
        return this.zoneCode;
    }

    /**
     * Set zONE 코드.
     *
     * @param zoneCode the zoneCode value to set
     * @return the SubnetList object itself.
     */
    public SubnetList withZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
        return this;
    }

    /**
     * Get 서브넷 이름.
     *
     * @return the subnetName value
     */
    public String subnetName() {
        return this.subnetName;
    }

    /**
     * Set 서브넷 이름.
     *
     * @param subnetName the subnetName value to set
     * @return the SubnetList object itself.
     */
    public SubnetList withSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /**
     * Get 서브넷 CIDR.
     *
     * @return the subnet value
     */
    public String subnet() {
        return this.subnet;
    }

    /**
     * Set 서브넷 CIDR.
     *
     * @param subnet the subnet value to set
     * @return the SubnetList object itself.
     */
    public SubnetList withSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get 서브넷 상태.
     *
     * @return the subnetStatus value
     */
    public SubnetStatus subnetStatus() {
        return this.subnetStatus;
    }

    /**
     * Set 서브넷 상태.
     *
     * @param subnetStatus the subnetStatus value to set
     * @return the SubnetList object itself.
     */
    public SubnetList withSubnetStatus(SubnetStatus subnetStatus) {
        this.subnetStatus = subnetStatus;
        return this;
    }

    /**
     * Get 서브넷 타입.
     *
     * @return the subnetType value
     */
    public SubnetType subnetType() {
        return this.subnetType;
    }

    /**
     * Set 서브넷 타입.
     *
     * @param subnetType the subnetType value to set
     * @return the SubnetList object itself.
     */
    public SubnetList withSubnetType(SubnetType subnetType) {
        this.subnetType = subnetType;
        return this;
    }

}
