/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EmailListResponse model.
 */
public class EmailListResponse {
    /**
     * 총 레코드 개수.
     */
    @JsonProperty(value = "totalElements")
    private Integer totalElements;

    /**
     * 총 페이지 개수.
     */
    @JsonProperty(value = "totalPages")
    private Integer totalPages;

    /**
     * 현재 페이지의 레코드 개수.
     */
    @JsonProperty(value = "numberOfElements")
    private Integer numberOfElements;

    /**
     * 첫번째 페이지 여부.
     */
    @JsonProperty(value = "first")
    private Boolean first;

    /**
     * 마지막 페이지 여부.
     */
    @JsonProperty(value = "last")
    private Boolean last;

    /**
     * 현재 페이지 index (0부터 시작).
     */
    @JsonProperty(value = "number")
    private Integer number;

    /**
     * 한페이지에 당 레코드 개수.
     */
    @JsonProperty(value = "size")
    private Integer size;

    /**
     * The sort property.
     */
    @JsonProperty(value = "sort")
    private List<EmailListResponseSortItem> sort;

    /**
     * The content property.
     */
    @JsonProperty(value = "content")
    private List<EmailListResponseContentItem> content;

    /**
     * Get 총 레코드 개수.
     *
     * @return the totalElements value
     */
    public Integer totalElements() {
        return this.totalElements;
    }

    /**
     * Set 총 레코드 개수.
     *
     * @param totalElements the totalElements value to set
     * @return the EmailListResponse object itself.
     */
    public EmailListResponse withTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    /**
     * Get 총 페이지 개수.
     *
     * @return the totalPages value
     */
    public Integer totalPages() {
        return this.totalPages;
    }

    /**
     * Set 총 페이지 개수.
     *
     * @param totalPages the totalPages value to set
     * @return the EmailListResponse object itself.
     */
    public EmailListResponse withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * Get 현재 페이지의 레코드 개수.
     *
     * @return the numberOfElements value
     */
    public Integer numberOfElements() {
        return this.numberOfElements;
    }

    /**
     * Set 현재 페이지의 레코드 개수.
     *
     * @param numberOfElements the numberOfElements value to set
     * @return the EmailListResponse object itself.
     */
    public EmailListResponse withNumberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }

    /**
     * Get 첫번째 페이지 여부.
     *
     * @return the first value
     */
    public Boolean first() {
        return this.first;
    }

    /**
     * Set 첫번째 페이지 여부.
     *
     * @param first the first value to set
     * @return the EmailListResponse object itself.
     */
    public EmailListResponse withFirst(Boolean first) {
        this.first = first;
        return this;
    }

    /**
     * Get 마지막 페이지 여부.
     *
     * @return the last value
     */
    public Boolean last() {
        return this.last;
    }

    /**
     * Set 마지막 페이지 여부.
     *
     * @param last the last value to set
     * @return the EmailListResponse object itself.
     */
    public EmailListResponse withLast(Boolean last) {
        this.last = last;
        return this;
    }

    /**
     * Get 현재 페이지 index (0부터 시작).
     *
     * @return the number value
     */
    public Integer number() {
        return this.number;
    }

    /**
     * Set 현재 페이지 index (0부터 시작).
     *
     * @param number the number value to set
     * @return the EmailListResponse object itself.
     */
    public EmailListResponse withNumber(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * Get 한페이지에 당 레코드 개수.
     *
     * @return the size value
     */
    public Integer size() {
        return this.size;
    }

    /**
     * Set 한페이지에 당 레코드 개수.
     *
     * @param size the size value to set
     * @return the EmailListResponse object itself.
     */
    public EmailListResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Get the sort value.
     *
     * @return the sort value
     */
    public List<EmailListResponseSortItem> sort() {
        return this.sort;
    }

    /**
     * Set the sort value.
     *
     * @param sort the sort value to set
     * @return the EmailListResponse object itself.
     */
    public EmailListResponse withSort(List<EmailListResponseSortItem> sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Get the content value.
     *
     * @return the content value
     */
    public List<EmailListResponseContentItem> content() {
        return this.content;
    }

    /**
     * Set the content value.
     *
     * @param content the content value to set
     * @return the EmailListResponse object itself.
     */
    public EmailListResponse withContent(List<EmailListResponseContentItem> content) {
        this.content = content;
        return this;
    }

}
