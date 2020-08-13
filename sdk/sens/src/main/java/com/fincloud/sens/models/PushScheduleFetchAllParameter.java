/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PushScheduleFetchAllParameter model.
 */
public class PushScheduleFetchAllParameter {
    /**
     * The content property.
     */
    @JsonProperty(value = "content")
    private List<PushScheduleMessageFetchParameter> content;

    /**
     * The totalElements property.
     */
    @JsonProperty(value = "totalElements")
    private Integer totalElements;

    /**
     * The totalPages property.
     */
    @JsonProperty(value = "totalPages")
    private Integer totalPages;

    /**
     * The first property.
     */
    @JsonProperty(value = "first")
    private Boolean first;

    /**
     * The last property.
     */
    @JsonProperty(value = "last")
    private Boolean last;

    /**
     * The numberOfElements property.
     */
    @JsonProperty(value = "numberOfElements")
    private Integer numberOfElements;

    /**
     * The size property.
     */
    @JsonProperty(value = "size")
    private Integer size;

    /**
     * The number property.
     */
    @JsonProperty(value = "number")
    private Integer number;

    /**
     * Get the content value.
     *
     * @return the content value
     */
    public List<PushScheduleMessageFetchParameter> content() {
        return this.content;
    }

    /**
     * Set the content value.
     *
     * @param content the content value to set
     * @return the PushScheduleFetchAllParameter object itself.
     */
    public PushScheduleFetchAllParameter withContent(List<PushScheduleMessageFetchParameter> content) {
        this.content = content;
        return this;
    }

    /**
     * Get the totalElements value.
     *
     * @return the totalElements value
     */
    public Integer totalElements() {
        return this.totalElements;
    }

    /**
     * Set the totalElements value.
     *
     * @param totalElements the totalElements value to set
     * @return the PushScheduleFetchAllParameter object itself.
     */
    public PushScheduleFetchAllParameter withTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    /**
     * Get the totalPages value.
     *
     * @return the totalPages value
     */
    public Integer totalPages() {
        return this.totalPages;
    }

    /**
     * Set the totalPages value.
     *
     * @param totalPages the totalPages value to set
     * @return the PushScheduleFetchAllParameter object itself.
     */
    public PushScheduleFetchAllParameter withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * Get the first value.
     *
     * @return the first value
     */
    public Boolean first() {
        return this.first;
    }

    /**
     * Set the first value.
     *
     * @param first the first value to set
     * @return the PushScheduleFetchAllParameter object itself.
     */
    public PushScheduleFetchAllParameter withFirst(Boolean first) {
        this.first = first;
        return this;
    }

    /**
     * Get the last value.
     *
     * @return the last value
     */
    public Boolean last() {
        return this.last;
    }

    /**
     * Set the last value.
     *
     * @param last the last value to set
     * @return the PushScheduleFetchAllParameter object itself.
     */
    public PushScheduleFetchAllParameter withLast(Boolean last) {
        this.last = last;
        return this;
    }

    /**
     * Get the numberOfElements value.
     *
     * @return the numberOfElements value
     */
    public Integer numberOfElements() {
        return this.numberOfElements;
    }

    /**
     * Set the numberOfElements value.
     *
     * @param numberOfElements the numberOfElements value to set
     * @return the PushScheduleFetchAllParameter object itself.
     */
    public PushScheduleFetchAllParameter withNumberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }

    /**
     * Get the size value.
     *
     * @return the size value
     */
    public Integer size() {
        return this.size;
    }

    /**
     * Set the size value.
     *
     * @param size the size value to set
     * @return the PushScheduleFetchAllParameter object itself.
     */
    public PushScheduleFetchAllParameter withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Get the number value.
     *
     * @return the number value
     */
    public Integer number() {
        return this.number;
    }

    /**
     * Set the number value.
     *
     * @param number the number value to set
     * @return the PushScheduleFetchAllParameter object itself.
     */
    public PushScheduleFetchAllParameter withNumber(Integer number) {
        this.number = number;
        return this;
    }

}
