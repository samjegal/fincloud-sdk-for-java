/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 예약발송 여부.
 */
public class EmailListResponseContentItemReservationStatus {
    /**
     * 예약 발송 여부 (예약발송 , 즉시발송).
     */
    @JsonProperty(value = "label")
    private String label;

    /**
     * 상태 코드 (Y: 예약발송, N: 즉시발송).
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Get 예약 발송 여부 (예약발송 , 즉시발송).
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set 예약 발송 여부 (예약발송 , 즉시발송).
     *
     * @param label the label value to set
     * @return the EmailListResponseContentItemReservationStatus object itself.
     */
    public EmailListResponseContentItemReservationStatus withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get 상태 코드 (Y: 예약발송, N: 즉시발송).
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set 상태 코드 (Y: 예약발송, N: 즉시발송).
     *
     * @param code the code value to set
     * @return the EmailListResponseContentItemReservationStatus object itself.
     */
    public EmailListResponseContentItemReservationStatus withCode(String code) {
        this.code = code;
        return this;
    }

}
