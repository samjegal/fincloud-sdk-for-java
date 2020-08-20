/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EventSearchDimensionParameter model.
 */
public class EventSearchDimensionParameter {
    /**
     * 인스턴스 번호.
     */
    @JsonProperty(value = "instanceNo")
    private String instanceNo;

    /**
     * 인스턴스 타입.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get 인스턴스 번호.
     *
     * @return the instanceNo value
     */
    public String instanceNo() {
        return this.instanceNo;
    }

    /**
     * Set 인스턴스 번호.
     *
     * @param instanceNo the instanceNo value to set
     * @return the EventSearchDimensionParameter object itself.
     */
    public EventSearchDimensionParameter withInstanceNo(String instanceNo) {
        this.instanceNo = instanceNo;
        return this;
    }

    /**
     * Get 인스턴스 타입.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set 인스턴스 타입.
     *
     * @param type the type value to set
     * @return the EventSearchDimensionParameter object itself.
     */
    public EventSearchDimensionParameter withType(String type) {
        this.type = type;
        return this;
    }

}
