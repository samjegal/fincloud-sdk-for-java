/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The WMSReturnParameter model.
 */
public class WMSReturnParameter {
    /**
     * 오류 코드.
     */
    @JsonProperty(value = "status")
    private Integer status;

    /**
     * 오류 메시지.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get 오류 코드.
     *
     * @return the status value
     */
    public Integer status() {
        return this.status;
    }

    /**
     * Set 오류 코드.
     *
     * @param status the status value to set
     * @return the WMSReturnParameter object itself.
     */
    public WMSReturnParameter withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Get 오류 메시지.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set 오류 메시지.
     *
     * @param message the message value to set
     * @return the WMSReturnParameter object itself.
     */
    public WMSReturnParameter withMessage(String message) {
        this.message = message;
        return this;
    }

}
