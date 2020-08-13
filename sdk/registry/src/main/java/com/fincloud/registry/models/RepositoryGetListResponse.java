/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.registry.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RepositoryGetListResponse model.
 */
public class RepositoryGetListResponse {
    /**
     * The count property.
     */
    @JsonProperty(value = "count")
    private Double count;

    /**
     * The next property.
     */
    @JsonProperty(value = "next")
    private Double next;

    /**
     * The previous property.
     */
    @JsonProperty(value = "previous")
    private Double previous;

    /**
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<RepositoryResultItem> results;

    /**
     * Get the count value.
     *
     * @return the count value
     */
    public Double count() {
        return this.count;
    }

    /**
     * Set the count value.
     *
     * @param count the count value to set
     * @return the RepositoryGetListResponse object itself.
     */
    public RepositoryGetListResponse withCount(Double count) {
        this.count = count;
        return this;
    }

    /**
     * Get the next value.
     *
     * @return the next value
     */
    public Double next() {
        return this.next;
    }

    /**
     * Set the next value.
     *
     * @param next the next value to set
     * @return the RepositoryGetListResponse object itself.
     */
    public RepositoryGetListResponse withNext(Double next) {
        this.next = next;
        return this;
    }

    /**
     * Get the previous value.
     *
     * @return the previous value
     */
    public Double previous() {
        return this.previous;
    }

    /**
     * Set the previous value.
     *
     * @param previous the previous value to set
     * @return the RepositoryGetListResponse object itself.
     */
    public RepositoryGetListResponse withPrevious(Double previous) {
        this.previous = previous;
        return this;
    }

    /**
     * Get the results value.
     *
     * @return the results value
     */
    public List<RepositoryResultItem> results() {
        return this.results;
    }

    /**
     * Set the results value.
     *
     * @param results the results value to set
     * @return the RepositoryGetListResponse object itself.
     */
    public RepositoryGetListResponse withResults(List<RepositoryResultItem> results) {
        this.results = results;
        return this;
    }

}
