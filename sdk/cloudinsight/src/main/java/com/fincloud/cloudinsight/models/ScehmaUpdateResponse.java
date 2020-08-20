/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ScehmaUpdateResponse model.
 */
public class ScehmaUpdateResponse {
    /**
     * 응답 메시지.
     */
    @JsonProperty(value = "msg")
    private String msg;

    /**
     * Get 응답 메시지.
     *
     * @return the msg value
     */
    public String msg() {
        return this.msg;
    }

    /**
     * Set 응답 메시지.
     *
     * @param msg the msg value to set
     * @return the ScehmaUpdateResponse object itself.
     */
    public ScehmaUpdateResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }

}
