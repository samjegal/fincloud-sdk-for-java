/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AddressBookDeleteRelationRequest model.
 */
public class AddressBookDeleteRelationRequest {
    /**
     * 수신자 그룹명.
     */
    @JsonProperty(value = "groupName", required = true)
    private String groupName;

    /**
     * The emailAddresses property.
     */
    @JsonProperty(value = "emailAddresses", required = true)
    private List<String> emailAddresses;

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
     * @return the AddressBookDeleteRelationRequest object itself.
     */
    public AddressBookDeleteRelationRequest withGroupName(String groupName) {
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
     * @return the AddressBookDeleteRelationRequest object itself.
     */
    public AddressBookDeleteRelationRequest withEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

}
