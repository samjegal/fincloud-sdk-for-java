/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AddressBookGenerateRequestGroupsItem model.
 */
public class AddressBookGenerateRequestGroupsItem {
    /**
     * 수신자 그룹명 (값이 전달되지 않으면 이메일 주소만 등록하는 것으로 판단).
     */
    @JsonProperty(value = "groupName")
    private String groupName;

    /**
     * The emailAddresses property.
     */
    @JsonProperty(value = "emailAddresses")
    private List<String> emailAddresses;

    /**
     * Get 수신자 그룹명 (값이 전달되지 않으면 이메일 주소만 등록하는 것으로 판단).
     *
     * @return the groupName value
     */
    public String groupName() {
        return this.groupName;
    }

    /**
     * Set 수신자 그룹명 (값이 전달되지 않으면 이메일 주소만 등록하는 것으로 판단).
     *
     * @param groupName the groupName value to set
     * @return the AddressBookGenerateRequestGroupsItem object itself.
     */
    public AddressBookGenerateRequestGroupsItem withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Get the emailAddresses value.
     *
     * @return the emailAddresses value
     */
    public List<String> emailAddresses() {
        return this.emailAddresses;
    }

    /**
     * Set the emailAddresses value.
     *
     * @param emailAddresses the emailAddresses value to set
     * @return the AddressBookGenerateRequestGroupsItem object itself.
     */
    public AddressBookGenerateRequestGroupsItem withEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

}
