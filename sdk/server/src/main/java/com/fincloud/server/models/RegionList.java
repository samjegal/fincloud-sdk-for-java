/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RegionList model.
 */
public class RegionList {
    /**
     * 리전 코드.
     */
    @JsonProperty(value = "regionCode")
    private String regionCode;

    /**
     * 리전 이름.
     */
    @JsonProperty(value = "regionName")
    private String regionName;

    /**
     * Get 리전 코드.
     *
     * @return the regionCode value
     */
    public String regionCode() {
        return this.regionCode;
    }

    /**
     * Set 리전 코드.
     *
     * @param regionCode the regionCode value to set
     * @return the RegionList object itself.
     */
    public RegionList withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * Get 리전 이름.
     *
     * @return the regionName value
     */
    public String regionName() {
        return this.regionName;
    }

    /**
     * Set 리전 이름.
     *
     * @param regionName the regionName value to set
     * @return the RegionList object itself.
     */
    public RegionList withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

}
