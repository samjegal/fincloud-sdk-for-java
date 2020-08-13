/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AddressBookGenerateRequest model.
 */
public class AddressBookGenerateRequest {
    /**
     * 수신자 이메일 주소를 포함한 수신자 그룹목록.
     */
    @JsonProperty(value = "groups", required = true)
    private List<AddressBookGenerateRequestGroupsItem> groups;

    /**
     * Get 수신자 이메일 주소를 포함한 수신자 그룹목록.
     *
     * @return the groups value
     */
    public List<AddressBookGenerateRequestGroupsItem> groups() {
        return this.groups;
    }

    /**
     * Set 수신자 이메일 주소를 포함한 수신자 그룹목록.
     *
     * @param groups the groups value to set
     * @return the AddressBookGenerateRequest object itself.
     */
    public AddressBookGenerateRequest withGroups(List<AddressBookGenerateRequestGroupsItem> groups) {
        this.groups = groups;
        return this;
    }

}
