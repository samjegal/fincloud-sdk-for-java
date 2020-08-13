/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.registry.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MessageResponse model.
 */
public class MessageResponse {
    /**
     * 반환 코드.
     */
    @JsonProperty(value = "returnCode")
    private Double returnCode;

    /**
     * 반환 메시지.
     */
    @JsonProperty(value = "returnMessage")
    private String returnMessage;

    /**
     * Get 반환 코드.
     *
     * @return the returnCode value
     */
    public Double returnCode() {
        return this.returnCode;
    }

    /**
     * Set 반환 코드.
     *
     * @param returnCode the returnCode value to set
     * @return the MessageResponse object itself.
     */
    public MessageResponse withReturnCode(Double returnCode) {
        this.returnCode = returnCode;
        return this;
    }

    /**
     * Get 반환 메시지.
     *
     * @return the returnMessage value
     */
    public String returnMessage() {
        return this.returnMessage;
    }

    /**
     * Set 반환 메시지.
     *
     * @param returnMessage the returnMessage value to set
     * @return the MessageResponse object itself.
     */
    public MessageResponse withReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
        return this;
    }

}
