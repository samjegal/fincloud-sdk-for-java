/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The NetworkAclList model.
 */
public class NetworkAclList {
    /**
     * 네트워크 ACL 번호.
     */
    @JsonProperty(value = "networkAclNo")
    private String networkAclNo;

    /**
     * 네트워크 ACL 이름.
     */
    @JsonProperty(value = "networkAclName")
    private String networkAclName;

    /**
     * VPC 번호.
     */
    @JsonProperty(value = "vpcNo")
    private String vpcNo;

    /**
     * 네트워크 ACL 상태.
     */
    @JsonProperty(value = "networkAclStatus")
    private NetworkAclStatus networkAclStatus;

    /**
     * 네트워크 ACL 설명.
     */
    @JsonProperty(value = "networkAclDescription")
    private String networkAclDescription;

    /**
     * 생성 일자.
     */
    @JsonProperty(value = "createDate")
    private String createDate;

    /**
     * 네트워크 ACL 기본 여부.
     */
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;

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
     * @return the NetworkAclList object itself.
     */
    public NetworkAclList withNetworkAclNo(String networkAclNo) {
        this.networkAclNo = networkAclNo;
        return this;
    }

    /**
     * Get 네트워크 ACL 이름.
     *
     * @return the networkAclName value
     */
    public String networkAclName() {
        return this.networkAclName;
    }

    /**
     * Set 네트워크 ACL 이름.
     *
     * @param networkAclName the networkAclName value to set
     * @return the NetworkAclList object itself.
     */
    public NetworkAclList withNetworkAclName(String networkAclName) {
        this.networkAclName = networkAclName;
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
     * @return the NetworkAclList object itself.
     */
    public NetworkAclList withVpcNo(String vpcNo) {
        this.vpcNo = vpcNo;
        return this;
    }

    /**
     * Get 네트워크 ACL 상태.
     *
     * @return the networkAclStatus value
     */
    public NetworkAclStatus networkAclStatus() {
        return this.networkAclStatus;
    }

    /**
     * Set 네트워크 ACL 상태.
     *
     * @param networkAclStatus the networkAclStatus value to set
     * @return the NetworkAclList object itself.
     */
    public NetworkAclList withNetworkAclStatus(NetworkAclStatus networkAclStatus) {
        this.networkAclStatus = networkAclStatus;
        return this;
    }

    /**
     * Get 네트워크 ACL 설명.
     *
     * @return the networkAclDescription value
     */
    public String networkAclDescription() {
        return this.networkAclDescription;
    }

    /**
     * Set 네트워크 ACL 설명.
     *
     * @param networkAclDescription the networkAclDescription value to set
     * @return the NetworkAclList object itself.
     */
    public NetworkAclList withNetworkAclDescription(String networkAclDescription) {
        this.networkAclDescription = networkAclDescription;
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
     * @return the NetworkAclList object itself.
     */
    public NetworkAclList withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Get 네트워크 ACL 기본 여부.
     *
     * @return the isDefault value
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set 네트워크 ACL 기본 여부.
     *
     * @param isDefault the isDefault value to set
     * @return the NetworkAclList object itself.
     */
    public NetworkAclList withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

}
