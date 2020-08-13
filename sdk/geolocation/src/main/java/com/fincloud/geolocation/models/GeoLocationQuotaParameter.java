/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.geolocation.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The GeoLocationQuotaParameter model.
 */
public class GeoLocationQuotaParameter {
    /**
     * 사용량 리소스 정보.
     */
    @JsonProperty(value = "resource")
    private Object resource;

    /**
     * Get 사용량 리소스 정보.
     *
     * @return the resource value
     */
    public Object resource() {
        return this.resource;
    }

    /**
     * Set 사용량 리소스 정보.
     *
     * @param resource the resource value to set
     * @return the GeoLocationQuotaParameter object itself.
     */
    public GeoLocationQuotaParameter withResource(Object resource) {
        this.resource = resource;
        return this;
    }

}
