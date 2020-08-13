/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AccessControlGroupList model.
 */
public class AccessControlGroupList {
    /**
     * ACG 번호.
     */
    @JsonProperty(value = "accessControlGroupNo")
    private String accessControlGroupNo;

    /**
     * ACG 이름.
     */
    @JsonProperty(value = "accessControlGroupName")
    private String accessControlGroupName;

    /**
     * 기본 여부.
     */
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;

    /**
     * VPC 번호.
     */
    @JsonProperty(value = "vpcNo")
    private String vpcNo;

    /**
     * ACG 상태.
     */
    @JsonProperty(value = "accessControlGroupStatus")
    private AccessControlGroupStatus accessControlGroupStatus;

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
     * @return the AccessControlGroupList object itself.
     */
    public AccessControlGroupList withAccessControlGroupNo(String accessControlGroupNo) {
        this.accessControlGroupNo = accessControlGroupNo;
        return this;
    }

    /**
     * Get aCG 이름.
     *
     * @return the accessControlGroupName value
     */
    public String accessControlGroupName() {
        return this.accessControlGroupName;
    }

    /**
     * Set aCG 이름.
     *
     * @param accessControlGroupName the accessControlGroupName value to set
     * @return the AccessControlGroupList object itself.
     */
    public AccessControlGroupList withAccessControlGroupName(String accessControlGroupName) {
        this.accessControlGroupName = accessControlGroupName;
        return this;
    }

    /**
     * Get 기본 여부.
     *
     * @return the isDefault value
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set 기본 여부.
     *
     * @param isDefault the isDefault value to set
     * @return the AccessControlGroupList object itself.
     */
    public AccessControlGroupList withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
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
     * @return the AccessControlGroupList object itself.
     */
    public AccessControlGroupList withVpcNo(String vpcNo) {
        this.vpcNo = vpcNo;
        return this;
    }

    /**
     * Get aCG 상태.
     *
     * @return the accessControlGroupStatus value
     */
    public AccessControlGroupStatus accessControlGroupStatus() {
        return this.accessControlGroupStatus;
    }

    /**
     * Set aCG 상태.
     *
     * @param accessControlGroupStatus the accessControlGroupStatus value to set
     * @return the AccessControlGroupList object itself.
     */
    public AccessControlGroupList withAccessControlGroupStatus(AccessControlGroupStatus accessControlGroupStatus) {
        this.accessControlGroupStatus = accessControlGroupStatus;
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
     * @return the AccessControlGroupList object itself.
     */
    public AccessControlGroupList withAccessControlGroupDescription(String accessControlGroupDescription) {
        this.accessControlGroupDescription = accessControlGroupDescription;
        return this;
    }

}
