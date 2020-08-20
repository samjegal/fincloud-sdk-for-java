/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EventSearchResultParameter model.
 */
public class EventSearchResultParameter {
    /**
     * 이벤트 아이디.
     */
    @JsonProperty(value = "eventId")
    private String eventId;

    /**
     * 검출값.
     */
    @JsonProperty(value = "detectValue")
    private Integer detectValue;

    /**
     * 상품 키.
     */
    @JsonProperty(value = "prodKey")
    private String prodKey;

    /**
     * 영역.
     */
    @JsonProperty(value = "criteria")
    private Double criteria;

    /**
     * 사이클.
     */
    @JsonProperty(value = "cycles")
    private Integer cycles;

    /**
     * 운영.
     */
    @JsonProperty(value = "operator")
    private String operator;

    /**
     * 알람 그룹.
     */
    @JsonProperty(value = "notificationGroups")
    private String notificationGroups;

    /**
     * 이벤트 레벨.
     */
    @JsonProperty(value = "eventLevel")
    private String eventLevel;

    /**
     * 메트릭 종류.
     */
    @JsonProperty(value = "metric")
    private String metric;

    /**
     * 이벤트 원인.
     */
    @JsonProperty(value = "eventCause")
    private String eventCause;

    /**
     * 룰 이름.
     */
    @JsonProperty(value = "ruleName")
    private String ruleName;

    /**
     * 시작 시간.
     */
    @JsonProperty(value = "startTime")
    private Double startTime;

    /**
     * 인터벌 타임.
     */
    @JsonProperty(value = "interval")
    private String interval;

    /**
     * 설명.
     */
    @JsonProperty(value = "describe")
    private String describe;

    /**
     * 종료 시간.
     */
    @JsonProperty(value = "endTime")
    private Integer endTime;

    /**
     * 계산값.
     */
    @JsonProperty(value = "calc")
    private String calc;

    /**
     * 룰 아이디.
     */
    @JsonProperty(value = "ruleId")
    private Double ruleId;

    /**
     * The dimensions property.
     */
    @JsonProperty(value = "dimensions")
    private EventSearchDimensionParameter dimensions;

    /**
     * Get 이벤트 아이디.
     *
     * @return the eventId value
     */
    public String eventId() {
        return this.eventId;
    }

    /**
     * Set 이벤트 아이디.
     *
     * @param eventId the eventId value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * Get 검출값.
     *
     * @return the detectValue value
     */
    public Integer detectValue() {
        return this.detectValue;
    }

    /**
     * Set 검출값.
     *
     * @param detectValue the detectValue value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withDetectValue(Integer detectValue) {
        this.detectValue = detectValue;
        return this;
    }

    /**
     * Get 상품 키.
     *
     * @return the prodKey value
     */
    public String prodKey() {
        return this.prodKey;
    }

    /**
     * Set 상품 키.
     *
     * @param prodKey the prodKey value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withProdKey(String prodKey) {
        this.prodKey = prodKey;
        return this;
    }

    /**
     * Get 영역.
     *
     * @return the criteria value
     */
    public Double criteria() {
        return this.criteria;
    }

    /**
     * Set 영역.
     *
     * @param criteria the criteria value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withCriteria(Double criteria) {
        this.criteria = criteria;
        return this;
    }

    /**
     * Get 사이클.
     *
     * @return the cycles value
     */
    public Integer cycles() {
        return this.cycles;
    }

    /**
     * Set 사이클.
     *
     * @param cycles the cycles value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withCycles(Integer cycles) {
        this.cycles = cycles;
        return this;
    }

    /**
     * Get 운영.
     *
     * @return the operator value
     */
    public String operator() {
        return this.operator;
    }

    /**
     * Set 운영.
     *
     * @param operator the operator value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get 알람 그룹.
     *
     * @return the notificationGroups value
     */
    public String notificationGroups() {
        return this.notificationGroups;
    }

    /**
     * Set 알람 그룹.
     *
     * @param notificationGroups the notificationGroups value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withNotificationGroups(String notificationGroups) {
        this.notificationGroups = notificationGroups;
        return this;
    }

    /**
     * Get 이벤트 레벨.
     *
     * @return the eventLevel value
     */
    public String eventLevel() {
        return this.eventLevel;
    }

    /**
     * Set 이벤트 레벨.
     *
     * @param eventLevel the eventLevel value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withEventLevel(String eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }

    /**
     * Get 메트릭 종류.
     *
     * @return the metric value
     */
    public String metric() {
        return this.metric;
    }

    /**
     * Set 메트릭 종류.
     *
     * @param metric the metric value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Get 이벤트 원인.
     *
     * @return the eventCause value
     */
    public String eventCause() {
        return this.eventCause;
    }

    /**
     * Set 이벤트 원인.
     *
     * @param eventCause the eventCause value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withEventCause(String eventCause) {
        this.eventCause = eventCause;
        return this;
    }

    /**
     * Get 룰 이름.
     *
     * @return the ruleName value
     */
    public String ruleName() {
        return this.ruleName;
    }

    /**
     * Set 룰 이름.
     *
     * @param ruleName the ruleName value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * Get 시작 시간.
     *
     * @return the startTime value
     */
    public Double startTime() {
        return this.startTime;
    }

    /**
     * Set 시작 시간.
     *
     * @param startTime the startTime value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withStartTime(Double startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get 인터벌 타임.
     *
     * @return the interval value
     */
    public String interval() {
        return this.interval;
    }

    /**
     * Set 인터벌 타임.
     *
     * @param interval the interval value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get 설명.
     *
     * @return the describe value
     */
    public String describe() {
        return this.describe;
    }

    /**
     * Set 설명.
     *
     * @param describe the describe value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withDescribe(String describe) {
        this.describe = describe;
        return this;
    }

    /**
     * Get 종료 시간.
     *
     * @return the endTime value
     */
    public Integer endTime() {
        return this.endTime;
    }

    /**
     * Set 종료 시간.
     *
     * @param endTime the endTime value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get 계산값.
     *
     * @return the calc value
     */
    public String calc() {
        return this.calc;
    }

    /**
     * Set 계산값.
     *
     * @param calc the calc value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withCalc(String calc) {
        this.calc = calc;
        return this;
    }

    /**
     * Get 룰 아이디.
     *
     * @return the ruleId value
     */
    public Double ruleId() {
        return this.ruleId;
    }

    /**
     * Set 룰 아이디.
     *
     * @param ruleId the ruleId value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withRuleId(Double ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * Get the dimensions value.
     *
     * @return the dimensions value
     */
    public EventSearchDimensionParameter dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions value.
     *
     * @param dimensions the dimensions value to set
     * @return the EventSearchResultParameter object itself.
     */
    public EventSearchResultParameter withDimensions(EventSearchDimensionParameter dimensions) {
        this.dimensions = dimensions;
        return this;
    }

}
