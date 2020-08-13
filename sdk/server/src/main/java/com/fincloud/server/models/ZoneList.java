/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ZoneList model.
 */
public class ZoneList {
    /**
     * ZONE 이름.
     */
    @JsonProperty(value = "zoneName")
    private String zoneName;

    /**
     * ZONE 코드.
     */
    @JsonProperty(value = "zoneCode")
    private String zoneCode;

    /**
     * 리전 코드.
     */
    @JsonProperty(value = "regionCode")
    private String regionCode;

    /**
     * Get zONE 이름.
     *
     * @return the zoneName value
     */
    public String zoneName() {
        return this.zoneName;
    }

    /**
     * Set zONE 이름.
     *
     * @param zoneName the zoneName value to set
     * @return the ZoneList object itself.
     */
    public ZoneList withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /**
     * Get zONE 코드.
     *
     * @return the zoneCode value
     */
    public String zoneCode() {
        return this.zoneCode;
    }

    /**
     * Set zONE 코드.
     *
     * @param zoneCode the zoneCode value to set
     * @return the ZoneList object itself.
     */
    public ZoneList withZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
        return this;
    }

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
     * @return the ZoneList object itself.
     */
    public ZoneList withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

}
