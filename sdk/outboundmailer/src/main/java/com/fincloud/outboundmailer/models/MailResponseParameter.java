/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MailResponseParameter model.
 */
public class MailResponseParameter {
    /**
     * 메일 발송 요청 ID.
     */
    @JsonProperty(value = "requestId", required = true)
    private String requestId;

    /**
     * 메일 요청 건수.
     */
    @JsonProperty(value = "count", required = true)
    private int count;

    /**
     * Get 메일 발송 요청 ID.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set 메일 발송 요청 ID.
     *
     * @param requestId the requestId value to set
     * @return the MailResponseParameter object itself.
     */
    public MailResponseParameter withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get 메일 요청 건수.
     *
     * @return the count value
     */
    public int count() {
        return this.count;
    }

    /**
     * Set 메일 요청 건수.
     *
     * @param count the count value to set
     * @return the MailResponseParameter object itself.
     */
    public MailResponseParameter withCount(int count) {
        this.count = count;
        return this;
    }

}
