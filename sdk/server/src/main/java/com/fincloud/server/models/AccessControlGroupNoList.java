/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AccessControlGroupNoList model.
 */
public class AccessControlGroupNoList {
    /**
     * ACG 번호.
     */
    @JsonProperty(value = "accessControlGroupNo")
    private String accessControlGroupNo;

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
     * @return the AccessControlGroupNoList object itself.
     */
    public AccessControlGroupNoList withAccessControlGroupNo(String accessControlGroupNo) {
        this.accessControlGroupNo = accessControlGroupNo;
        return this;
    }

}
