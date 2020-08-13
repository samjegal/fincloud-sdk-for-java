/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AddressBookResponse model.
 */
public class AddressBookResponse {
    /**
     * 총 수신자 이메일 주소 수.
     */
    @JsonProperty(value = "totalAddressCount")
    private Integer totalAddressCount;

    /**
     * 수신자 그룹 목록.
     */
    @JsonProperty(value = "groups")
    private List<AddressBookResponseGroupsItem> groups;

    /**
     * Get 총 수신자 이메일 주소 수.
     *
     * @return the totalAddressCount value
     */
    public Integer totalAddressCount() {
        return this.totalAddressCount;
    }

    /**
     * Set 총 수신자 이메일 주소 수.
     *
     * @param totalAddressCount the totalAddressCount value to set
     * @return the AddressBookResponse object itself.
     */
    public AddressBookResponse withTotalAddressCount(Integer totalAddressCount) {
        this.totalAddressCount = totalAddressCount;
        return this;
    }

    /**
     * Get 수신자 그룹 목록.
     *
     * @return the groups value
     */
    public List<AddressBookResponseGroupsItem> groups() {
        return this.groups;
    }

    /**
     * Set 수신자 그룹 목록.
     *
     * @param groups the groups value to set
     * @return the AddressBookResponse object itself.
     */
    public AddressBookResponse withGroups(List<AddressBookResponseGroupsItem> groups) {
        this.groups = groups;
        return this;
    }

}
