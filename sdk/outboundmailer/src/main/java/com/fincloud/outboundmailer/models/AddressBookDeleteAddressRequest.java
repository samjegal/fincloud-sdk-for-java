/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AddressBookDeleteAddressRequest model.
 */
public class AddressBookDeleteAddressRequest {
    /**
     * The emailAddresses property.
     */
    @JsonProperty(value = "emailAddresses", required = true)
    private List<String> emailAddresses;

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
     * @return the AddressBookDeleteAddressRequest object itself.
     */
    public AddressBookDeleteAddressRequest withEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

}
