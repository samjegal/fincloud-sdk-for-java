/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SMSMessageRequestParameterFilesItem model.
 */
public class SMSMessageRequestParameterFilesItem {
    /**
     * 파일 이름(jpg, jpeg 확장자를 가진 파일 이름).
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * 파일을 Base64로 인코딩한 값.
     */
    @JsonProperty(value = "body", required = true)
    private String body;

    /**
     * Get 파일 이름(jpg, jpeg 확장자를 가진 파일 이름).
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set 파일 이름(jpg, jpeg 확장자를 가진 파일 이름).
     *
     * @param name the name value to set
     * @return the SMSMessageRequestParameterFilesItem object itself.
     */
    public SMSMessageRequestParameterFilesItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get 파일을 Base64로 인코딩한 값.
     *
     * @return the body value
     */
    public String body() {
        return this.body;
    }

    /**
     * Set 파일을 Base64로 인코딩한 값.
     *
     * @param body the body value to set
     * @return the SMSMessageRequestParameterFilesItem object itself.
     */
    public SMSMessageRequestParameterFilesItem withBody(String body) {
        this.body = body;
        return this;
    }

}
