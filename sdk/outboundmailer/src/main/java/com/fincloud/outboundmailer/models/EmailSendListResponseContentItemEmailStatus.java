/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EmailSendListResponseContentItemEmailStatus model.
 */
public class EmailSendListResponseContentItemEmailStatus {
    /**
     * 상태 명.
     */
    @JsonProperty(value = "label")
    private String label;

    /**
     * 상태 코드 (P: 발송준비중, R: 발송준비, I: 발송중, S: 발송성공, F: 발송실패, U: 수신거부, C:발송취소, PF:
     * 일부실패).
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Get 상태 명.
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set 상태 명.
     *
     * @param label the label value to set
     * @return the EmailSendListResponseContentItemEmailStatus object itself.
     */
    public EmailSendListResponseContentItemEmailStatus withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get 상태 코드 (P: 발송준비중, R: 발송준비, I: 발송중, S: 발송성공, F: 발송실패, U: 수신거부, C:발송취소, PF: 일부실패).
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set 상태 코드 (P: 발송준비중, R: 발송준비, I: 발송중, S: 발송성공, F: 발송실패, U: 수신거부, C:발송취소, PF: 일부실패).
     *
     * @param code the code value to set
     * @return the EmailSendListResponseContentItemEmailStatus object itself.
     */
    public EmailSendListResponseContentItemEmailStatus withCode(String code) {
        this.code = code;
        return this;
    }

}
