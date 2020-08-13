/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MemberServerImageInstanceListResponse model.
 */
public class MemberServerImageInstanceListResponse {
    /**
     * 리턴 코드.
     */
    @JsonProperty(value = "returnCode")
    private String returnCode;

    /**
     * 리턴 메시지.
     */
    @JsonProperty(value = "returnMessage")
    private String returnMessage;

    /**
     * 총 행 개수.
     */
    @JsonProperty(value = "totalRows")
    private Integer totalRows;

    /**
     * 서버 이미지 인스턴스 리스트.
     */
    @JsonProperty(value = "memberServerImageInstanceList")
    private List<MemberServerImageInstanceList> memberServerImageInstanceList;

    /**
     * Get 리턴 코드.
     *
     * @return the returnCode value
     */
    public String returnCode() {
        return this.returnCode;
    }

    /**
     * Set 리턴 코드.
     *
     * @param returnCode the returnCode value to set
     * @return the MemberServerImageInstanceListResponse object itself.
     */
    public MemberServerImageInstanceListResponse withReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }

    /**
     * Get 리턴 메시지.
     *
     * @return the returnMessage value
     */
    public String returnMessage() {
        return this.returnMessage;
    }

    /**
     * Set 리턴 메시지.
     *
     * @param returnMessage the returnMessage value to set
     * @return the MemberServerImageInstanceListResponse object itself.
     */
    public MemberServerImageInstanceListResponse withReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
        return this;
    }

    /**
     * Get 총 행 개수.
     *
     * @return the totalRows value
     */
    public Integer totalRows() {
        return this.totalRows;
    }

    /**
     * Set 총 행 개수.
     *
     * @param totalRows the totalRows value to set
     * @return the MemberServerImageInstanceListResponse object itself.
     */
    public MemberServerImageInstanceListResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get 서버 이미지 인스턴스 리스트.
     *
     * @return the memberServerImageInstanceList value
     */
    public List<MemberServerImageInstanceList> memberServerImageInstanceList() {
        return this.memberServerImageInstanceList;
    }

    /**
     * Set 서버 이미지 인스턴스 리스트.
     *
     * @param memberServerImageInstanceList the memberServerImageInstanceList value to set
     * @return the MemberServerImageInstanceListResponse object itself.
     */
    public MemberServerImageInstanceListResponse withMemberServerImageInstanceList(List<MemberServerImageInstanceList> memberServerImageInstanceList) {
        this.memberServerImageInstanceList = memberServerImageInstanceList;
        return this;
    }

}
