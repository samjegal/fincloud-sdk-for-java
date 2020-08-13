/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CloudInsightCollectorParameter model.
 */
public class CloudInsightCollectorParameter {
    /**
     * 검색할 subnet 페이지 번호.
     */
    @JsonProperty(value = "data")
    private Object data;

    /**
     * Schema 생성시 발급받은 키.
     */
    @JsonProperty(value = "cw_key")
    private String cwKey;

    /**
     * Get 검색할 subnet 페이지 번호.
     *
     * @return the data value
     */
    public Object data() {
        return this.data;
    }

    /**
     * Set 검색할 subnet 페이지 번호.
     *
     * @param data the data value to set
     * @return the CloudInsightCollectorParameter object itself.
     */
    public CloudInsightCollectorParameter withData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * Get schema 생성시 발급받은 키.
     *
     * @return the cwKey value
     */
    public String cwKey() {
        return this.cwKey;
    }

    /**
     * Set schema 생성시 발급받은 키.
     *
     * @param cwKey the cwKey value to set
     * @return the CloudInsightCollectorParameter object itself.
     */
    public CloudInsightCollectorParameter withCwKey(String cwKey) {
        this.cwKey = cwKey;
        return this;
    }

}
