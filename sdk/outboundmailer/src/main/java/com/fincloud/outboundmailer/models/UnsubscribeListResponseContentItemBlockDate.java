/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 수신거부 등록일.
 */
public class UnsubscribeListResponseContentItemBlockDate {
    /**
     * 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수.
     */
    @JsonProperty(value = "utc")
    private Long utc;

    /**
     * 'yyyy-MM-dd' UTC+09:00 형태의 날짜.
     */
    @JsonProperty(value = "formattedDate")
    private String formattedDate;

    /**
     * 'yyyy-MM-dd HH:mm:ss SSS' UTC+09:00 형태의 시간.
     */
    @JsonProperty(value = "formattedDateTime")
    private String formattedDateTime;

    /**
     * Get 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수.
     *
     * @return the utc value
     */
    public Long utc() {
        return this.utc;
    }

    /**
     * Set 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수.
     *
     * @param utc the utc value to set
     * @return the UnsubscribeListResponseContentItemBlockDate object itself.
     */
    public UnsubscribeListResponseContentItemBlockDate withUtc(Long utc) {
        this.utc = utc;
        return this;
    }

    /**
     * Get 'yyyy-MM-dd' UTC+09:00 형태의 날짜.
     *
     * @return the formattedDate value
     */
    public String formattedDate() {
        return this.formattedDate;
    }

    /**
     * Set 'yyyy-MM-dd' UTC+09:00 형태의 날짜.
     *
     * @param formattedDate the formattedDate value to set
     * @return the UnsubscribeListResponseContentItemBlockDate object itself.
     */
    public UnsubscribeListResponseContentItemBlockDate withFormattedDate(String formattedDate) {
        this.formattedDate = formattedDate;
        return this;
    }

    /**
     * Get 'yyyy-MM-dd HH:mm:ss SSS' UTC+09:00 형태의 시간.
     *
     * @return the formattedDateTime value
     */
    public String formattedDateTime() {
        return this.formattedDateTime;
    }

    /**
     * Set 'yyyy-MM-dd HH:mm:ss SSS' UTC+09:00 형태의 시간.
     *
     * @param formattedDateTime the formattedDateTime value to set
     * @return the UnsubscribeListResponseContentItemBlockDate object itself.
     */
    public UnsubscribeListResponseContentItemBlockDate withFormattedDateTime(String formattedDateTime) {
        this.formattedDateTime = formattedDateTime;
        return this;
    }

}
