/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 치환 파라미터 (수신자별로 적용), '치환 ID' 를 key로, '치환 ID에 맵핑되는 값' 을 value로 가지는 Map 형태의
 * Object.
 */
public class RecipientForRequestParameters {
    /**
     * 고객 이름.
     */
    @JsonProperty(value = "customer_name")
    private String customerName;

    /**
     * 등급 (BRONZE, SILVER, GOLD).
     */
    @JsonProperty(value = "BEFORE_GRADE")
    private String bEFOREGRADE;

    /**
     * 등급 (BRONZE, SILVER, GOLD).
     */
    @JsonProperty(value = "AFTER_GRADE")
    private String aFTERGRADE;

    /**
     * Get 고객 이름.
     *
     * @return the customerName value
     */
    public String customerName() {
        return this.customerName;
    }

    /**
     * Set 고객 이름.
     *
     * @param customerName the customerName value to set
     * @return the RecipientForRequestParameters object itself.
     */
    public RecipientForRequestParameters withCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    /**
     * Get 등급 (BRONZE, SILVER, GOLD).
     *
     * @return the bEFOREGRADE value
     */
    public String bEFOREGRADE() {
        return this.bEFOREGRADE;
    }

    /**
     * Set 등급 (BRONZE, SILVER, GOLD).
     *
     * @param bEFOREGRADE the bEFOREGRADE value to set
     * @return the RecipientForRequestParameters object itself.
     */
    public RecipientForRequestParameters withBEFOREGRADE(String bEFOREGRADE) {
        this.bEFOREGRADE = bEFOREGRADE;
        return this;
    }

    /**
     * Get 등급 (BRONZE, SILVER, GOLD).
     *
     * @return the aFTERGRADE value
     */
    public String aFTERGRADE() {
        return this.aFTERGRADE;
    }

    /**
     * Set 등급 (BRONZE, SILVER, GOLD).
     *
     * @param aFTERGRADE the aFTERGRADE value to set
     * @return the RecipientForRequestParameters object itself.
     */
    public RecipientForRequestParameters withAFTERGRADE(String aFTERGRADE) {
        this.aFTERGRADE = aFTERGRADE;
        return this;
    }

}
