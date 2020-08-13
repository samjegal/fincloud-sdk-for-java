/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RootPasswordServerInstanceListResponse model.
 */
public class RootPasswordServerInstanceListResponse {
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
     * 관리자 비밀번호 리스트.
     */
    @JsonProperty(value = "rootPasswordServerInstanceList")
    private List<RootPasswordServerInstanceList> rootPasswordServerInstanceList;

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
     * @return the RootPasswordServerInstanceListResponse object itself.
     */
    public RootPasswordServerInstanceListResponse withReturnCode(String returnCode) {
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
     * @return the RootPasswordServerInstanceListResponse object itself.
     */
    public RootPasswordServerInstanceListResponse withReturnMessage(String returnMessage) {
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
     * @return the RootPasswordServerInstanceListResponse object itself.
     */
    public RootPasswordServerInstanceListResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get 관리자 비밀번호 리스트.
     *
     * @return the rootPasswordServerInstanceList value
     */
    public List<RootPasswordServerInstanceList> rootPasswordServerInstanceList() {
        return this.rootPasswordServerInstanceList;
    }

    /**
     * Set 관리자 비밀번호 리스트.
     *
     * @param rootPasswordServerInstanceList the rootPasswordServerInstanceList value to set
     * @return the RootPasswordServerInstanceListResponse object itself.
     */
    public RootPasswordServerInstanceListResponse withRootPasswordServerInstanceList(List<RootPasswordServerInstanceList> rootPasswordServerInstanceList) {
        this.rootPasswordServerInstanceList = rootPasswordServerInstanceList;
        return this;
    }

}
