/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DimensionDto.
 * Dimension object.
 */
public class DimensionItemParameter {
    /**
     * Dimension name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Dimension value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get dimension name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set dimension name.
     *
     * @param name the name value to set
     * @return the DimensionItemParameter object itself.
     */
    public DimensionItemParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get dimension value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set dimension value.
     *
     * @param value the value value to set
     * @return the DimensionItemParameter object itself.
     */
    public DimensionItemParameter withValue(String value) {
        this.value = value;
        return this;
    }

}
