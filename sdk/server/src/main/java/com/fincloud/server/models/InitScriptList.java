/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The InitScriptList model.
 */
public class InitScriptList {
    /**
     * 초기화 스크립트 번호.
     */
    @JsonProperty(value = "initScriptNo")
    private String initScriptNo;

    /**
     * 초기화 스크립트 이름.
     */
    @JsonProperty(value = "initScriptName")
    private String initScriptName;

    /**
     * 생성 일자.
     */
    @JsonProperty(value = "createDate")
    private String createDate;

    /**
     * 초기화 스크립트 설명.
     */
    @JsonProperty(value = "initScriptDescription")
    private String initScriptDescription;

    /**
     * 초기화 스크립트 컨텐츠.
     */
    @JsonProperty(value = "initScriptContent")
    private String initScriptContent;

    /**
     * 운영체제 타입.
     */
    @JsonProperty(value = "osType")
    private OsType osType;

    /**
     * Get 초기화 스크립트 번호.
     *
     * @return the initScriptNo value
     */
    public String initScriptNo() {
        return this.initScriptNo;
    }

    /**
     * Set 초기화 스크립트 번호.
     *
     * @param initScriptNo the initScriptNo value to set
     * @return the InitScriptList object itself.
     */
    public InitScriptList withInitScriptNo(String initScriptNo) {
        this.initScriptNo = initScriptNo;
        return this;
    }

    /**
     * Get 초기화 스크립트 이름.
     *
     * @return the initScriptName value
     */
    public String initScriptName() {
        return this.initScriptName;
    }

    /**
     * Set 초기화 스크립트 이름.
     *
     * @param initScriptName the initScriptName value to set
     * @return the InitScriptList object itself.
     */
    public InitScriptList withInitScriptName(String initScriptName) {
        this.initScriptName = initScriptName;
        return this;
    }

    /**
     * Get 생성 일자.
     *
     * @return the createDate value
     */
    public String createDate() {
        return this.createDate;
    }

    /**
     * Set 생성 일자.
     *
     * @param createDate the createDate value to set
     * @return the InitScriptList object itself.
     */
    public InitScriptList withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Get 초기화 스크립트 설명.
     *
     * @return the initScriptDescription value
     */
    public String initScriptDescription() {
        return this.initScriptDescription;
    }

    /**
     * Set 초기화 스크립트 설명.
     *
     * @param initScriptDescription the initScriptDescription value to set
     * @return the InitScriptList object itself.
     */
    public InitScriptList withInitScriptDescription(String initScriptDescription) {
        this.initScriptDescription = initScriptDescription;
        return this;
    }

    /**
     * Get 초기화 스크립트 컨텐츠.
     *
     * @return the initScriptContent value
     */
    public String initScriptContent() {
        return this.initScriptContent;
    }

    /**
     * Set 초기화 스크립트 컨텐츠.
     *
     * @param initScriptContent the initScriptContent value to set
     * @return the InitScriptList object itself.
     */
    public InitScriptList withInitScriptContent(String initScriptContent) {
        this.initScriptContent = initScriptContent;
        return this;
    }

    /**
     * Get 운영체제 타입.
     *
     * @return the osType value
     */
    public OsType osType() {
        return this.osType;
    }

    /**
     * Set 운영체제 타입.
     *
     * @param osType the osType value to set
     * @return the InitScriptList object itself.
     */
    public InitScriptList withOsType(OsType osType) {
        this.osType = osType;
        return this;
    }

}
