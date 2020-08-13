/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AddressBookResponseGroupsItem model.
 */
public class AddressBookResponseGroupsItem {
    /**
     * 수신자 그룹 ID.
     */
    @JsonProperty(value = "sid")
    private Integer sid;

    /**
     * 수신자 그룹명.
     */
    @JsonProperty(value = "groupName")
    private String groupName;

    /**
     * 수신자 그룹에 포함된 이메일 주소 개수.
     */
    @JsonProperty(value = "addressCount")
    private Integer addressCount;

    /**
     * Get 수신자 그룹 ID.
     *
     * @return the sid value
     */
    public Integer sid() {
        return this.sid;
    }

    /**
     * Set 수신자 그룹 ID.
     *
     * @param sid the sid value to set
     * @return the AddressBookResponseGroupsItem object itself.
     */
    public AddressBookResponseGroupsItem withSid(Integer sid) {
        this.sid = sid;
        return this;
    }

    /**
     * Get 수신자 그룹명.
     *
     * @return the groupName value
     */
    public String groupName() {
        return this.groupName;
    }

    /**
     * Set 수신자 그룹명.
     *
     * @param groupName the groupName value to set
     * @return the AddressBookResponseGroupsItem object itself.
     */
    public AddressBookResponseGroupsItem withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Get 수신자 그룹에 포함된 이메일 주소 개수.
     *
     * @return the addressCount value
     */
    public Integer addressCount() {
        return this.addressCount;
    }

    /**
     * Set 수신자 그룹에 포함된 이메일 주소 개수.
     *
     * @param addressCount the addressCount value to set
     * @return the AddressBookResponseGroupsItem object itself.
     */
    public AddressBookResponseGroupsItem withAddressCount(Integer addressCount) {
        this.addressCount = addressCount;
        return this;
    }

}
