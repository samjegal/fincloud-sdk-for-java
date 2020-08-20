/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SchemaExtendedEnableResponse model.
 */
public class SchemaExtendedEnableResponse {
    /**
     * 응답 상태.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Get 응답 상태.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set 응답 상태.
     *
     * @param status the status value to set
     * @return the SchemaExtendedEnableResponse object itself.
     */
    public SchemaExtendedEnableResponse withStatus(String status) {
        this.status = status;
        return this;
    }

}
