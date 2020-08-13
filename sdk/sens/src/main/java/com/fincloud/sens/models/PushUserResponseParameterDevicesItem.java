/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushUserResponseParameterDevicesItem model.
 */
public class PushUserResponseParameterDevicesItem {
    /**
     * (APNS|GCM).
     */
    @JsonProperty(value = "deviceType")
    private String deviceType;

    /**
     * The deviceToken property.
     */
    @JsonProperty(value = "deviceToken")
    private String deviceToken;

    /**
     * Get (APNS|GCM).
     *
     * @return the deviceType value
     */
    public String deviceType() {
        return this.deviceType;
    }

    /**
     * Set (APNS|GCM).
     *
     * @param deviceType the deviceType value to set
     * @return the PushUserResponseParameterDevicesItem object itself.
     */
    public PushUserResponseParameterDevicesItem withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * Get the deviceToken value.
     *
     * @return the deviceToken value
     */
    public String deviceToken() {
        return this.deviceToken;
    }

    /**
     * Set the deviceToken value.
     *
     * @param deviceToken the deviceToken value to set
     * @return the PushUserResponseParameterDevicesItem object itself.
     */
    public PushUserResponseParameterDevicesItem withDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
        return this;
    }

}
