/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The WMSLocationInfoParameter model.
 */
public class WMSLocationInfoParameter {
    /**
     * 국가명.
     */
    @JsonProperty(value = "locationCode")
    private String locationCode;

    /**
     * 국가 코드. Possible values include: 'KR', 'US', 'JP', 'HK', 'SG'.
     */
    @JsonProperty(value = "locationName")
    private WMSLocationName locationName;

    /**
     * 추가된 시간.
     */
    @JsonProperty(value = "locationAddTime")
    private Double locationAddTime;

    /**
     * Get 국가명.
     *
     * @return the locationCode value
     */
    public String locationCode() {
        return this.locationCode;
    }

    /**
     * Set 국가명.
     *
     * @param locationCode the locationCode value to set
     * @return the WMSLocationInfoParameter object itself.
     */
    public WMSLocationInfoParameter withLocationCode(String locationCode) {
        this.locationCode = locationCode;
        return this;
    }

    /**
     * Get 국가 코드. Possible values include: 'KR', 'US', 'JP', 'HK', 'SG'.
     *
     * @return the locationName value
     */
    public WMSLocationName locationName() {
        return this.locationName;
    }

    /**
     * Set 국가 코드. Possible values include: 'KR', 'US', 'JP', 'HK', 'SG'.
     *
     * @param locationName the locationName value to set
     * @return the WMSLocationInfoParameter object itself.
     */
    public WMSLocationInfoParameter withLocationName(WMSLocationName locationName) {
        this.locationName = locationName;
        return this;
    }

    /**
     * Get 추가된 시간.
     *
     * @return the locationAddTime value
     */
    public Double locationAddTime() {
        return this.locationAddTime;
    }

    /**
     * Set 추가된 시간.
     *
     * @param locationAddTime the locationAddTime value to set
     * @return the WMSLocationInfoParameter object itself.
     */
    public WMSLocationInfoParameter withLocationAddTime(Double locationAddTime) {
        this.locationAddTime = locationAddTime;
        return this;
    }

}
