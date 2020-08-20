/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventsCountResponse.
 * Console useage, Event search response.
 */
public class SearchEventCountConsoleResponse {
    /**
     * Page size of the request.
     */
    @JsonProperty(value = "closedRecords")
    private Integer closedRecords;

    /**
     * Page size of the request.
     */
    @JsonProperty(value = "openRecords")
    private Integer openRecords;

    /**
     * OpenEvent Count.
     */
    @JsonProperty(value = "totalRecords")
    private Integer totalRecords;

    /**
     * Get page size of the request.
     *
     * @return the closedRecords value
     */
    public Integer closedRecords() {
        return this.closedRecords;
    }

    /**
     * Set page size of the request.
     *
     * @param closedRecords the closedRecords value to set
     * @return the SearchEventCountConsoleResponse object itself.
     */
    public SearchEventCountConsoleResponse withClosedRecords(Integer closedRecords) {
        this.closedRecords = closedRecords;
        return this;
    }

    /**
     * Get page size of the request.
     *
     * @return the openRecords value
     */
    public Integer openRecords() {
        return this.openRecords;
    }

    /**
     * Set page size of the request.
     *
     * @param openRecords the openRecords value to set
     * @return the SearchEventCountConsoleResponse object itself.
     */
    public SearchEventCountConsoleResponse withOpenRecords(Integer openRecords) {
        this.openRecords = openRecords;
        return this;
    }

    /**
     * Get openEvent Count.
     *
     * @return the totalRecords value
     */
    public Integer totalRecords() {
        return this.totalRecords;
    }

    /**
     * Set openEvent Count.
     *
     * @param totalRecords the totalRecords value to set
     * @return the SearchEventCountConsoleResponse object itself.
     */
    public SearchEventCountConsoleResponse withTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

}
