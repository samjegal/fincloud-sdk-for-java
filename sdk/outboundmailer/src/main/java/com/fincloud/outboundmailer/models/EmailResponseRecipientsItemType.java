/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 수신자 유형 (R: 수신자, C: 참조인, B: 숨은참조).
 */
public class EmailResponseRecipientsItemType {
    /**
     * 수신자 유형명 (수신자, 참조인, 숨은참조).
     */
    @JsonProperty(value = "label")
    private String label;

    /**
     * 수신자 유형 코드 (R, C, B).
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Get 수신자 유형명 (수신자, 참조인, 숨은참조).
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set 수신자 유형명 (수신자, 참조인, 숨은참조).
     *
     * @param label the label value to set
     * @return the EmailResponseRecipientsItemType object itself.
     */
    public EmailResponseRecipientsItemType withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get 수신자 유형 코드 (R, C, B).
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set 수신자 유형 코드 (R, C, B).
     *
     * @param code the code value to set
     * @return the EmailResponseRecipientsItemType object itself.
     */
    public EmailResponseRecipientsItemType withCode(String code) {
        this.code = code;
        return this;
    }

}
