/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventSearchRequest.
 * Event 검색 시 요청.
 */
public class EventSearchRequest {
    /**
     * 조회하려는 Event Rule id.
     */
    @JsonProperty(value = "ruleId", required = true)
    private double ruleId;

    /**
     * 조회하려는 EVent id.
     */
    @JsonProperty(value = "eventId", required = true)
    private String eventId;

    /**
     * 이벤트 쿼리.
     */
    @JsonProperty(value = "query")
    private String query;

    /**
     * 조회 시작 시간.
     */
    @JsonProperty(value = "startTime", required = true)
    private double startTime;

    /**
     * 조회 종료 시간.
     */
    @JsonProperty(value = "endTime", required = true)
    private double endTime;

    /**
     * 페이지 크기.
     */
    @JsonProperty(value = "pageSize")
    private Integer pageSize;

    /**
     * 페이지 번호.
     */
    @JsonProperty(value = "pageNum")
    private Integer pageNum;

    /**
     * The onlyFetchUnCloseEvent property.
     */
    @JsonProperty(value = "onlyFetchUnCloseEvent")
    private Boolean onlyFetchUnCloseEvent;

    /**
     * Get 조회하려는 Event Rule id.
     *
     * @return the ruleId value
     */
    public double ruleId() {
        return this.ruleId;
    }

    /**
     * Set 조회하려는 Event Rule id.
     *
     * @param ruleId the ruleId value to set
     * @return the EventSearchRequest object itself.
     */
    public EventSearchRequest withRuleId(double ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * Get 조회하려는 EVent id.
     *
     * @return the eventId value
     */
    public String eventId() {
        return this.eventId;
    }

    /**
     * Set 조회하려는 EVent id.
     *
     * @param eventId the eventId value to set
     * @return the EventSearchRequest object itself.
     */
    public EventSearchRequest withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * Get 이벤트 쿼리.
     *
     * @return the query value
     */
    public String query() {
        return this.query;
    }

    /**
     * Set 이벤트 쿼리.
     *
     * @param query the query value to set
     * @return the EventSearchRequest object itself.
     */
    public EventSearchRequest withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get 조회 시작 시간.
     *
     * @return the startTime value
     */
    public double startTime() {
        return this.startTime;
    }

    /**
     * Set 조회 시작 시간.
     *
     * @param startTime the startTime value to set
     * @return the EventSearchRequest object itself.
     */
    public EventSearchRequest withStartTime(double startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get 조회 종료 시간.
     *
     * @return the endTime value
     */
    public double endTime() {
        return this.endTime;
    }

    /**
     * Set 조회 종료 시간.
     *
     * @param endTime the endTime value to set
     * @return the EventSearchRequest object itself.
     */
    public EventSearchRequest withEndTime(double endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get 페이지 크기.
     *
     * @return the pageSize value
     */
    public Integer pageSize() {
        return this.pageSize;
    }

    /**
     * Set 페이지 크기.
     *
     * @param pageSize the pageSize value to set
     * @return the EventSearchRequest object itself.
     */
    public EventSearchRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Get 페이지 번호.
     *
     * @return the pageNum value
     */
    public Integer pageNum() {
        return this.pageNum;
    }

    /**
     * Set 페이지 번호.
     *
     * @param pageNum the pageNum value to set
     * @return the EventSearchRequest object itself.
     */
    public EventSearchRequest withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * Get the onlyFetchUnCloseEvent value.
     *
     * @return the onlyFetchUnCloseEvent value
     */
    public Boolean onlyFetchUnCloseEvent() {
        return this.onlyFetchUnCloseEvent;
    }

    /**
     * Set the onlyFetchUnCloseEvent value.
     *
     * @param onlyFetchUnCloseEvent the onlyFetchUnCloseEvent value to set
     * @return the EventSearchRequest object itself.
     */
    public EventSearchRequest withOnlyFetchUnCloseEvent(Boolean onlyFetchUnCloseEvent) {
        this.onlyFetchUnCloseEvent = onlyFetchUnCloseEvent;
        return this;
    }

}
