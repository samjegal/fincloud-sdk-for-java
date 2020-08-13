/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushMessageResultResponseParameterTarget model.
 */
public class PushMessageResultResponseParameterTarget {
    /**
     * (APNS|GCM).
     */
    @JsonProperty(value = "deviceType")
    private String deviceType;

    /**
     * The to property.
     */
    @JsonProperty(value = "to")
    private List<String> to;

    /**
     * (all|channel|user).
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * 국가코드 (ISO 3166-1 alpha-2, 대문자).
     */
    @JsonProperty(value = "country")
    private List<String> country;

    /**
     * Number of seconds away from UTC.
     */
    @JsonProperty(value = "timezone")
    private List<Integer> timezone;

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
     * @return the PushMessageResultResponseParameterTarget object itself.
     */
    public PushMessageResultResponseParameterTarget withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * Get the to value.
     *
     * @return the to value
     */
    public List<String> to() {
        return this.to;
    }

    /**
     * Set the to value.
     *
     * @param to the to value to set
     * @return the PushMessageResultResponseParameterTarget object itself.
     */
    public PushMessageResultResponseParameterTarget withTo(List<String> to) {
        this.to = to;
        return this;
    }

    /**
     * Get (all|channel|user).
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set (all|channel|user).
     *
     * @param type the type value to set
     * @return the PushMessageResultResponseParameterTarget object itself.
     */
    public PushMessageResultResponseParameterTarget withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get 국가코드 (ISO 3166-1 alpha-2, 대문자).
     *
     * @return the country value
     */
    public List<String> country() {
        return this.country;
    }

    /**
     * Set 국가코드 (ISO 3166-1 alpha-2, 대문자).
     *
     * @param country the country value to set
     * @return the PushMessageResultResponseParameterTarget object itself.
     */
    public PushMessageResultResponseParameterTarget withCountry(List<String> country) {
        this.country = country;
        return this;
    }

    /**
     * Get number of seconds away from UTC.
     *
     * @return the timezone value
     */
    public List<Integer> timezone() {
        return this.timezone;
    }

    /**
     * Set number of seconds away from UTC.
     *
     * @param timezone the timezone value to set
     * @return the PushMessageResultResponseParameterTarget object itself.
     */
    public PushMessageResultResponseParameterTarget withTimezone(List<Integer> timezone) {
        this.timezone = timezone;
        return this;
    }

}
