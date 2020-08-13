/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AddressBookInitResponse model.
 */
public class AddressBookInitResponse {
    /**
     * 총 삭제 이메일 주소 개수.
     */
    @JsonProperty(value = "deletedAddressCount")
    private Integer deletedAddressCount;

    /**
     * Get 총 삭제 이메일 주소 개수.
     *
     * @return the deletedAddressCount value
     */
    public Integer deletedAddressCount() {
        return this.deletedAddressCount;
    }

    /**
     * Set 총 삭제 이메일 주소 개수.
     *
     * @param deletedAddressCount the deletedAddressCount value to set
     * @return the AddressBookInitResponse object itself.
     */
    public AddressBookInitResponse withDeletedAddressCount(Integer deletedAddressCount) {
        this.deletedAddressCount = deletedAddressCount;
        return this;
    }

}
