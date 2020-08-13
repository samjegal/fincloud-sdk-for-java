/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EmailListResponseSortItem model.
 */
public class EmailListResponseSortItem {
    /**
     * 정렬 방향 (ASC|DESC).
     */
    @JsonProperty(value = "direction")
    private String direction;

    /**
     * 정렬 기준 필드명.
     */
    @JsonProperty(value = "property")
    private String property;

    /**
     * 대소문자 구분하여 정렬할지 여부.
     */
    @JsonProperty(value = "ignoreCase")
    private Boolean ignoreCase;

    /**
     * null 처리 방식 (NATIVE: data 처리로직에 맡김 , NULLS_FIRST : null 값이 앞으로,
     * NULLS_LAST: null 값이 뒤로).
     */
    @JsonProperty(value = "nullHandling")
    private String nullHandling;

    /**
     * 정렬 방향 Ascending(ASC) 인지 여부.
     */
    @JsonProperty(value = "ascending")
    private Boolean ascending;

    /**
     * 정렬 방향 Descending(DESC) 인지 여부.
     */
    @JsonProperty(value = "descending")
    private Boolean descending;

    /**
     * Get 정렬 방향 (ASC|DESC).
     *
     * @return the direction value
     */
    public String direction() {
        return this.direction;
    }

    /**
     * Set 정렬 방향 (ASC|DESC).
     *
     * @param direction the direction value to set
     * @return the EmailListResponseSortItem object itself.
     */
    public EmailListResponseSortItem withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get 정렬 기준 필드명.
     *
     * @return the property value
     */
    public String property() {
        return this.property;
    }

    /**
     * Set 정렬 기준 필드명.
     *
     * @param property the property value to set
     * @return the EmailListResponseSortItem object itself.
     */
    public EmailListResponseSortItem withProperty(String property) {
        this.property = property;
        return this;
    }

    /**
     * Get 대소문자 구분하여 정렬할지 여부.
     *
     * @return the ignoreCase value
     */
    public Boolean ignoreCase() {
        return this.ignoreCase;
    }

    /**
     * Set 대소문자 구분하여 정렬할지 여부.
     *
     * @param ignoreCase the ignoreCase value to set
     * @return the EmailListResponseSortItem object itself.
     */
    public EmailListResponseSortItem withIgnoreCase(Boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
        return this;
    }

    /**
     * Get null 처리 방식 (NATIVE: data 처리로직에 맡김 , NULLS_FIRST : null 값이 앞으로, NULLS_LAST: null 값이 뒤로).
     *
     * @return the nullHandling value
     */
    public String nullHandling() {
        return this.nullHandling;
    }

    /**
     * Set null 처리 방식 (NATIVE: data 처리로직에 맡김 , NULLS_FIRST : null 값이 앞으로, NULLS_LAST: null 값이 뒤로).
     *
     * @param nullHandling the nullHandling value to set
     * @return the EmailListResponseSortItem object itself.
     */
    public EmailListResponseSortItem withNullHandling(String nullHandling) {
        this.nullHandling = nullHandling;
        return this;
    }

    /**
     * Get 정렬 방향 Ascending(ASC) 인지 여부.
     *
     * @return the ascending value
     */
    public Boolean ascending() {
        return this.ascending;
    }

    /**
     * Set 정렬 방향 Ascending(ASC) 인지 여부.
     *
     * @param ascending the ascending value to set
     * @return the EmailListResponseSortItem object itself.
     */
    public EmailListResponseSortItem withAscending(Boolean ascending) {
        this.ascending = ascending;
        return this;
    }

    /**
     * Get 정렬 방향 Descending(DESC) 인지 여부.
     *
     * @return the descending value
     */
    public Boolean descending() {
        return this.descending;
    }

    /**
     * Set 정렬 방향 Descending(DESC) 인지 여부.
     *
     * @param descending the descending value to set
     * @return the EmailListResponseSortItem object itself.
     */
    public EmailListResponseSortItem withDescending(Boolean descending) {
        this.descending = descending;
        return this;
    }

}
