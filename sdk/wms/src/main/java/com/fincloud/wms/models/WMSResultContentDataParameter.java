/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The WMSResultContentDataParameter model.
 */
public class WMSResultContentDataParameter {
    /**
     * 스텝 번호.
     */
    @JsonProperty(value = "stepNo")
    private Integer stepNo;

    /**
     * 스텝 결과. Possible values include: 'SUCCESS', 'FAIL'.
     */
    @JsonProperty(value = "stepResult")
    private WMSStepResult stepResult;

    /**
     * 스텝 이름.
     */
    @JsonProperty(value = "stepName")
    private String stepName;

    /**
     * 이벤트 유형. Possible values include: 'click', 'text', 'find_text',
     * 'find_object'.
     */
    @JsonProperty(value = "stepEvent")
    private WMSStepEvent stepEvent;

    /**
     * 이벤트 대상.
     */
    @JsonProperty(value = "stepTarget")
    private String stepTarget;

    /**
     * 입력 텍스트.
     */
    @JsonProperty(value = "stepText")
    private String stepText;

    /**
     * The logs property.
     */
    @JsonProperty(value = "logs")
    private List<String> logs;

    /**
     * Get 스텝 번호.
     *
     * @return the stepNo value
     */
    public Integer stepNo() {
        return this.stepNo;
    }

    /**
     * Set 스텝 번호.
     *
     * @param stepNo the stepNo value to set
     * @return the WMSResultContentDataParameter object itself.
     */
    public WMSResultContentDataParameter withStepNo(Integer stepNo) {
        this.stepNo = stepNo;
        return this;
    }

    /**
     * Get 스텝 결과. Possible values include: 'SUCCESS', 'FAIL'.
     *
     * @return the stepResult value
     */
    public WMSStepResult stepResult() {
        return this.stepResult;
    }

    /**
     * Set 스텝 결과. Possible values include: 'SUCCESS', 'FAIL'.
     *
     * @param stepResult the stepResult value to set
     * @return the WMSResultContentDataParameter object itself.
     */
    public WMSResultContentDataParameter withStepResult(WMSStepResult stepResult) {
        this.stepResult = stepResult;
        return this;
    }

    /**
     * Get 스텝 이름.
     *
     * @return the stepName value
     */
    public String stepName() {
        return this.stepName;
    }

    /**
     * Set 스텝 이름.
     *
     * @param stepName the stepName value to set
     * @return the WMSResultContentDataParameter object itself.
     */
    public WMSResultContentDataParameter withStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }

    /**
     * Get 이벤트 유형. Possible values include: 'click', 'text', 'find_text', 'find_object'.
     *
     * @return the stepEvent value
     */
    public WMSStepEvent stepEvent() {
        return this.stepEvent;
    }

    /**
     * Set 이벤트 유형. Possible values include: 'click', 'text', 'find_text', 'find_object'.
     *
     * @param stepEvent the stepEvent value to set
     * @return the WMSResultContentDataParameter object itself.
     */
    public WMSResultContentDataParameter withStepEvent(WMSStepEvent stepEvent) {
        this.stepEvent = stepEvent;
        return this;
    }

    /**
     * Get 이벤트 대상.
     *
     * @return the stepTarget value
     */
    public String stepTarget() {
        return this.stepTarget;
    }

    /**
     * Set 이벤트 대상.
     *
     * @param stepTarget the stepTarget value to set
     * @return the WMSResultContentDataParameter object itself.
     */
    public WMSResultContentDataParameter withStepTarget(String stepTarget) {
        this.stepTarget = stepTarget;
        return this;
    }

    /**
     * Get 입력 텍스트.
     *
     * @return the stepText value
     */
    public String stepText() {
        return this.stepText;
    }

    /**
     * Set 입력 텍스트.
     *
     * @param stepText the stepText value to set
     * @return the WMSResultContentDataParameter object itself.
     */
    public WMSResultContentDataParameter withStepText(String stepText) {
        this.stepText = stepText;
        return this;
    }

    /**
     * Get the logs value.
     *
     * @return the logs value
     */
    public List<String> logs() {
        return this.logs;
    }

    /**
     * Set the logs value.
     *
     * @param logs the logs value to set
     * @return the WMSResultContentDataParameter object itself.
     */
    public WMSResultContentDataParameter withLogs(List<String> logs) {
        this.logs = logs;
        return this;
    }

}
