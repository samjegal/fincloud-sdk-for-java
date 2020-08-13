/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The WMSResultContentLogParameter model.
 */
public class WMSResultContentLogParameter {
    /**
     * 오류 유형. Possible values include: 'URL', 'JAVASCRIPT'.
     */
    @JsonProperty(value = "errorType")
    private WMSErrorType errorType;

    /**
     * 오류 코드.
     */
    @JsonProperty(value = "errorCode")
    private Integer errorCode;

    /**
     * 오류 메시지.
     */
    @JsonProperty(value = "errorDesc")
    private String errorDesc;

    /**
     * 오류 URL.
     */
    @JsonProperty(value = "errorUrl")
    private String errorUrl;

    /**
     * HTTP 상태 코드.
     */
    @JsonProperty(value = "httpStatusCode")
    private String httpStatusCode;

    /**
     * HTTP 상태 메세지.
     */
    @JsonProperty(value = "httpStatusText")
    private String httpStatusText;

    /**
     * Get 오류 유형. Possible values include: 'URL', 'JAVASCRIPT'.
     *
     * @return the errorType value
     */
    public WMSErrorType errorType() {
        return this.errorType;
    }

    /**
     * Set 오류 유형. Possible values include: 'URL', 'JAVASCRIPT'.
     *
     * @param errorType the errorType value to set
     * @return the WMSResultContentLogParameter object itself.
     */
    public WMSResultContentLogParameter withErrorType(WMSErrorType errorType) {
        this.errorType = errorType;
        return this;
    }

    /**
     * Get 오류 코드.
     *
     * @return the errorCode value
     */
    public Integer errorCode() {
        return this.errorCode;
    }

    /**
     * Set 오류 코드.
     *
     * @param errorCode the errorCode value to set
     * @return the WMSResultContentLogParameter object itself.
     */
    public WMSResultContentLogParameter withErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get 오류 메시지.
     *
     * @return the errorDesc value
     */
    public String errorDesc() {
        return this.errorDesc;
    }

    /**
     * Set 오류 메시지.
     *
     * @param errorDesc the errorDesc value to set
     * @return the WMSResultContentLogParameter object itself.
     */
    public WMSResultContentLogParameter withErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }

    /**
     * Get 오류 URL.
     *
     * @return the errorUrl value
     */
    public String errorUrl() {
        return this.errorUrl;
    }

    /**
     * Set 오류 URL.
     *
     * @param errorUrl the errorUrl value to set
     * @return the WMSResultContentLogParameter object itself.
     */
    public WMSResultContentLogParameter withErrorUrl(String errorUrl) {
        this.errorUrl = errorUrl;
        return this;
    }

    /**
     * Get hTTP 상태 코드.
     *
     * @return the httpStatusCode value
     */
    public String httpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * Set hTTP 상태 코드.
     *
     * @param httpStatusCode the httpStatusCode value to set
     * @return the WMSResultContentLogParameter object itself.
     */
    public WMSResultContentLogParameter withHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }

    /**
     * Get hTTP 상태 메세지.
     *
     * @return the httpStatusText value
     */
    public String httpStatusText() {
        return this.httpStatusText;
    }

    /**
     * Set hTTP 상태 메세지.
     *
     * @param httpStatusText the httpStatusText value to set
     * @return the WMSResultContentLogParameter object itself.
     */
    public WMSResultContentLogParameter withHttpStatusText(String httpStatusText) {
        this.httpStatusText = httpStatusText;
        return this;
    }

}
