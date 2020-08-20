/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CollectorResponse model.
 */
public class CollectorResponse {
    /**
     * 결과 정보.
     */
    @JsonProperty(value = "result")
    private String result;

    /**
     * 데이터 아이디.
     */
    @JsonProperty(value = "dataId")
    private Double dataId;

    /**
     * 결과 메시지.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get 결과 정보.
     *
     * @return the result value
     */
    public String result() {
        return this.result;
    }

    /**
     * Set 결과 정보.
     *
     * @param result the result value to set
     * @return the CollectorResponse object itself.
     */
    public CollectorResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * Get 데이터 아이디.
     *
     * @return the dataId value
     */
    public Double dataId() {
        return this.dataId;
    }

    /**
     * Set 데이터 아이디.
     *
     * @param dataId the dataId value to set
     * @return the CollectorResponse object itself.
     */
    public CollectorResponse withDataId(Double dataId) {
        this.dataId = dataId;
        return this;
    }

    /**
     * Get 결과 메시지.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set 결과 메시지.
     *
     * @param message the message value to set
     * @return the CollectorResponse object itself.
     */
    public CollectorResponse withMessage(String message) {
        this.message = message;
        return this;
    }

}
