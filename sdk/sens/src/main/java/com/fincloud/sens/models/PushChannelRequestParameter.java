/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushChannelRequestParameter model.
 */
public class PushChannelRequestParameter {
    /**
     * The channelName property.
     */
    @JsonProperty(value = "channelName", required = true)
    private String channelName;

    /**
     * The channelDesc property.
     */
    @JsonProperty(value = "channelDesc")
    private String channelDesc;

    /**
     * Get the channelName value.
     *
     * @return the channelName value
     */
    public String channelName() {
        return this.channelName;
    }

    /**
     * Set the channelName value.
     *
     * @param channelName the channelName value to set
     * @return the PushChannelRequestParameter object itself.
     */
    public PushChannelRequestParameter withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * Get the channelDesc value.
     *
     * @return the channelDesc value
     */
    public String channelDesc() {
        return this.channelDesc;
    }

    /**
     * Set the channelDesc value.
     *
     * @param channelDesc the channelDesc value to set
     * @return the PushChannelRequestParameter object itself.
     */
    public PushChannelRequestParameter withChannelDesc(String channelDesc) {
        this.channelDesc = channelDesc;
        return this;
    }

}
