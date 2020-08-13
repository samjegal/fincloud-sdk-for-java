/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.geolocation.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The GeoLocationResultParameter model.
 */
public class GeoLocationResultParameter {
    /**
     * 리턴 코드.
     */
    @JsonProperty(value = "returnCode")
    private Integer returnCode;

    /**
     * GeoLocation 요청 UUID.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /**
     * GeoLocation 정보.
     */
    @JsonProperty(value = "geoLocation")
    private Object geoLocation;

    /**
     * Get 리턴 코드.
     *
     * @return the returnCode value
     */
    public Integer returnCode() {
        return this.returnCode;
    }

    /**
     * Set 리턴 코드.
     *
     * @param returnCode the returnCode value to set
     * @return the GeoLocationResultParameter object itself.
     */
    public GeoLocationResultParameter withReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
        return this;
    }

    /**
     * Get geoLocation 요청 UUID.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set geoLocation 요청 UUID.
     *
     * @param requestId the requestId value to set
     * @return the GeoLocationResultParameter object itself.
     */
    public GeoLocationResultParameter withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get geoLocation 정보.
     *
     * @return the geoLocation value
     */
    public Object geoLocation() {
        return this.geoLocation;
    }

    /**
     * Set geoLocation 정보.
     *
     * @param geoLocation the geoLocation value to set
     * @return the GeoLocationResultParameter object itself.
     */
    public GeoLocationResultParameter withGeoLocation(Object geoLocation) {
        this.geoLocation = geoLocation;
        return this;
    }

}
