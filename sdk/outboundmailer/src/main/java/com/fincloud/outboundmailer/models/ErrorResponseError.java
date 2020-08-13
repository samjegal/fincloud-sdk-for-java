/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ErrorResponseError model.
 */
public class ErrorResponseError {
    /**
     * 에러 코드, ( 77001:METHOD_NOT_ALLOWED, 77002:UNSUPPORTED_MEDIA_TYPE,
     * 77101:로그인 정보 오류, 77102:BAD_REQUEST, 77103:리소스가 존재하지 않습니다., 77201:권한없음,
     * 77202:Email 상품 사용신청 하지 않음, 77301:기본 프로젝트가 존재하지 않음, 77302:외부 시스템 API 연동
     * 오류, 77303:그외 INTERNAL_SERVER_ERROR ).
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * API Gateway Error Code.
     */
    @JsonProperty(value = "errorCode")
    private String errorCode;

    /**
     * 상세 에러 메세지.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get 에러 코드, ( 77001:METHOD_NOT_ALLOWED, 77002:UNSUPPORTED_MEDIA_TYPE, 77101:로그인 정보 오류, 77102:BAD_REQUEST, 77103:리소스가 존재하지 않습니다., 77201:권한없음, 77202:Email 상품 사용신청 하지 않음, 77301:기본 프로젝트가 존재하지 않음, 77302:외부 시스템 API 연동 오류, 77303:그외 INTERNAL_SERVER_ERROR ).
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set 에러 코드, ( 77001:METHOD_NOT_ALLOWED, 77002:UNSUPPORTED_MEDIA_TYPE, 77101:로그인 정보 오류, 77102:BAD_REQUEST, 77103:리소스가 존재하지 않습니다., 77201:권한없음, 77202:Email 상품 사용신청 하지 않음, 77301:기본 프로젝트가 존재하지 않음, 77302:외부 시스템 API 연동 오류, 77303:그외 INTERNAL_SERVER_ERROR ).
     *
     * @param code the code value to set
     * @return the ErrorResponseError object itself.
     */
    public ErrorResponseError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get aPI Gateway Error Code.
     *
     * @return the errorCode value
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set aPI Gateway Error Code.
     *
     * @param errorCode the errorCode value to set
     * @return the ErrorResponseError object itself.
     */
    public ErrorResponseError withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get 상세 에러 메세지.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set 상세 에러 메세지.
     *
     * @param message the message value to set
     * @return the ErrorResponseError object itself.
     */
    public ErrorResponseError withMessage(String message) {
        this.message = message;
        return this;
    }

}
