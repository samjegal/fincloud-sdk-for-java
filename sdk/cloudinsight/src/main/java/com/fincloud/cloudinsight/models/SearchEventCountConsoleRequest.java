/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConsoleEventSearchDto.
 * Event rule information.
 */
public class SearchEventCountConsoleRequest {
    /**
     * 조회 시작 시간.
     */
    @JsonProperty(value = "startTime", required = true)
    private long startTime;

    /**
     * 조회 종료 시간.
     */
    @JsonProperty(value = "endTime", required = true)
    private long endTime;

    /**
     * Get 조회 시작 시간.
     *
     * @return the startTime value
     */
    public long startTime() {
        return this.startTime;
    }

    /**
     * Set 조회 시작 시간.
     *
     * @param startTime the startTime value to set
     * @return the SearchEventCountConsoleRequest object itself.
     */
    public SearchEventCountConsoleRequest withStartTime(long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get 조회 종료 시간.
     *
     * @return the endTime value
     */
    public long endTime() {
        return this.endTime;
    }

    /**
     * Set 조회 종료 시간.
     *
     * @param endTime the endTime value to set
     * @return the SearchEventCountConsoleRequest object itself.
     */
    public SearchEventCountConsoleRequest withEndTime(long endTime) {
        this.endTime = endTime;
        return this;
    }

}
