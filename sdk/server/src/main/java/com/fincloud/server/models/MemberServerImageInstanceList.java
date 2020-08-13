/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MemberServerImageInstanceList model.
 */
public class MemberServerImageInstanceList {
    /**
     * 서버 이미지 인스턴스 번호.
     */
    @JsonProperty(value = "memberServerImageInstanceNo")
    private String memberServerImageInstanceNo;

    /**
     * 서버 이미지 이름.
     */
    @JsonProperty(value = "memberServerImageName")
    private String memberServerImageName;

    /**
     * 서버 이미지 설명.
     */
    @JsonProperty(value = "memberServerImageDescription")
    private String memberServerImageDescription;

    /**
     * 서버 이미지 번호.
     */
    @JsonProperty(value = "originalServerInstanceNo")
    private String originalServerInstanceNo;

    /**
     * 서버 이미지 제품 코드.
     */
    @JsonProperty(value = "originalServerImageProductCode")
    private String originalServerImageProductCode;

    /**
     * 서버 이미지 인스턴스 상태.
     */
    @JsonProperty(value = "memberServerImageInstanceStatus")
    private MemberServerImageInstanceStatus memberServerImageInstanceStatus;

    /**
     * 서버 이미지 인스턴스 운영.
     */
    @JsonProperty(value = "memberServerImageInstanceOperation")
    private MemberServerImageInstanceOperation memberServerImageInstanceOperation;

    /**
     * 서버 이미지 인스턴스 상태 이름.
     */
    @JsonProperty(value = "memberServerImageInstanceStatusName")
    private String memberServerImageInstanceStatusName;

    /**
     * 생성 일자.
     */
    @JsonProperty(value = "createDate")
    private String createDate;

    /**
     * Get 서버 이미지 인스턴스 번호.
     *
     * @return the memberServerImageInstanceNo value
     */
    public String memberServerImageInstanceNo() {
        return this.memberServerImageInstanceNo;
    }

    /**
     * Set 서버 이미지 인스턴스 번호.
     *
     * @param memberServerImageInstanceNo the memberServerImageInstanceNo value to set
     * @return the MemberServerImageInstanceList object itself.
     */
    public MemberServerImageInstanceList withMemberServerImageInstanceNo(String memberServerImageInstanceNo) {
        this.memberServerImageInstanceNo = memberServerImageInstanceNo;
        return this;
    }

    /**
     * Get 서버 이미지 이름.
     *
     * @return the memberServerImageName value
     */
    public String memberServerImageName() {
        return this.memberServerImageName;
    }

    /**
     * Set 서버 이미지 이름.
     *
     * @param memberServerImageName the memberServerImageName value to set
     * @return the MemberServerImageInstanceList object itself.
     */
    public MemberServerImageInstanceList withMemberServerImageName(String memberServerImageName) {
        this.memberServerImageName = memberServerImageName;
        return this;
    }

    /**
     * Get 서버 이미지 설명.
     *
     * @return the memberServerImageDescription value
     */
    public String memberServerImageDescription() {
        return this.memberServerImageDescription;
    }

    /**
     * Set 서버 이미지 설명.
     *
     * @param memberServerImageDescription the memberServerImageDescription value to set
     * @return the MemberServerImageInstanceList object itself.
     */
    public MemberServerImageInstanceList withMemberServerImageDescription(String memberServerImageDescription) {
        this.memberServerImageDescription = memberServerImageDescription;
        return this;
    }

    /**
     * Get 서버 이미지 번호.
     *
     * @return the originalServerInstanceNo value
     */
    public String originalServerInstanceNo() {
        return this.originalServerInstanceNo;
    }

    /**
     * Set 서버 이미지 번호.
     *
     * @param originalServerInstanceNo the originalServerInstanceNo value to set
     * @return the MemberServerImageInstanceList object itself.
     */
    public MemberServerImageInstanceList withOriginalServerInstanceNo(String originalServerInstanceNo) {
        this.originalServerInstanceNo = originalServerInstanceNo;
        return this;
    }

    /**
     * Get 서버 이미지 제품 코드.
     *
     * @return the originalServerImageProductCode value
     */
    public String originalServerImageProductCode() {
        return this.originalServerImageProductCode;
    }

    /**
     * Set 서버 이미지 제품 코드.
     *
     * @param originalServerImageProductCode the originalServerImageProductCode value to set
     * @return the MemberServerImageInstanceList object itself.
     */
    public MemberServerImageInstanceList withOriginalServerImageProductCode(String originalServerImageProductCode) {
        this.originalServerImageProductCode = originalServerImageProductCode;
        return this;
    }

    /**
     * Get 서버 이미지 인스턴스 상태.
     *
     * @return the memberServerImageInstanceStatus value
     */
    public MemberServerImageInstanceStatus memberServerImageInstanceStatus() {
        return this.memberServerImageInstanceStatus;
    }

    /**
     * Set 서버 이미지 인스턴스 상태.
     *
     * @param memberServerImageInstanceStatus the memberServerImageInstanceStatus value to set
     * @return the MemberServerImageInstanceList object itself.
     */
    public MemberServerImageInstanceList withMemberServerImageInstanceStatus(MemberServerImageInstanceStatus memberServerImageInstanceStatus) {
        this.memberServerImageInstanceStatus = memberServerImageInstanceStatus;
        return this;
    }

    /**
     * Get 서버 이미지 인스턴스 운영.
     *
     * @return the memberServerImageInstanceOperation value
     */
    public MemberServerImageInstanceOperation memberServerImageInstanceOperation() {
        return this.memberServerImageInstanceOperation;
    }

    /**
     * Set 서버 이미지 인스턴스 운영.
     *
     * @param memberServerImageInstanceOperation the memberServerImageInstanceOperation value to set
     * @return the MemberServerImageInstanceList object itself.
     */
    public MemberServerImageInstanceList withMemberServerImageInstanceOperation(MemberServerImageInstanceOperation memberServerImageInstanceOperation) {
        this.memberServerImageInstanceOperation = memberServerImageInstanceOperation;
        return this;
    }

    /**
     * Get 서버 이미지 인스턴스 상태 이름.
     *
     * @return the memberServerImageInstanceStatusName value
     */
    public String memberServerImageInstanceStatusName() {
        return this.memberServerImageInstanceStatusName;
    }

    /**
     * Set 서버 이미지 인스턴스 상태 이름.
     *
     * @param memberServerImageInstanceStatusName the memberServerImageInstanceStatusName value to set
     * @return the MemberServerImageInstanceList object itself.
     */
    public MemberServerImageInstanceList withMemberServerImageInstanceStatusName(String memberServerImageInstanceStatusName) {
        this.memberServerImageInstanceStatusName = memberServerImageInstanceStatusName;
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
     * @return the MemberServerImageInstanceList object itself.
     */
    public MemberServerImageInstanceList withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

}
