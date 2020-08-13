/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The WMSFilterParameter model.
 */
public class WMSFilterParameter {
    /**
     * 등록된 필터 타입. Possible values include: 'url', 'urlprefix', 'js',
     * 'jsprefix'.
     */
    @JsonProperty(value = "type")
    private WMSFilterType type;

    /**
     * 등록된 필터 값.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * Get 등록된 필터 타입. Possible values include: 'url', 'urlprefix', 'js', 'jsprefix'.
     *
     * @return the type value
     */
    public WMSFilterType type() {
        return this.type;
    }

    /**
     * Set 등록된 필터 타입. Possible values include: 'url', 'urlprefix', 'js', 'jsprefix'.
     *
     * @param type the type value to set
     * @return the WMSFilterParameter object itself.
     */
    public WMSFilterParameter withType(WMSFilterType type) {
        this.type = type;
        return this;
    }

    /**
     * Get 등록된 필터 값.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set 등록된 필터 값.
     *
     * @param text the text value to set
     * @return the WMSFilterParameter object itself.
     */
    public WMSFilterParameter withText(String text) {
        this.text = text;
        return this;
    }

}
