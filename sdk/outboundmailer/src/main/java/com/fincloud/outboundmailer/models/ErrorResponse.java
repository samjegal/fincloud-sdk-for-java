/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ErrorResponse model.
 */
public class ErrorResponse {
    /**
     * The error property.
     */
    @JsonProperty(value = "error")
    private ErrorResponseError error;

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public ErrorResponseError error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withError(ErrorResponseError error) {
        this.error = error;
        return this;
    }

}
