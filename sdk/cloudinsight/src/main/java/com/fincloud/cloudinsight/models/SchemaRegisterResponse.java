/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SchemaRegisterResponse model.
 */
public class SchemaRegisterResponse {
    /**
     * Generated key for this product, not required when registering product.
     */
    @JsonProperty(value = "cw_key")
    private String cwKey;

    /**
     * Get generated key for this product, not required when registering product.
     *
     * @return the cwKey value
     */
    public String cwKey() {
        return this.cwKey;
    }

    /**
     * Set generated key for this product, not required when registering product.
     *
     * @param cwKey the cwKey value to set
     * @return the SchemaRegisterResponse object itself.
     */
    public SchemaRegisterResponse withCwKey(String cwKey) {
        this.cwKey = cwKey;
        return this;
    }

}
