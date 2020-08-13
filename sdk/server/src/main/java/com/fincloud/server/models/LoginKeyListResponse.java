/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LoginKeyListResponse model.
 */
public class LoginKeyListResponse {
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
     * 로그인 키 리스트.
     */
    @JsonProperty(value = "loginKeyList")
    private List<LoginKeyList> loginKeyList;

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
     * @return the LoginKeyListResponse object itself.
     */
    public LoginKeyListResponse withReturnCode(String returnCode) {
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
     * @return the LoginKeyListResponse object itself.
     */
    public LoginKeyListResponse withReturnMessage(String returnMessage) {
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
     * @return the LoginKeyListResponse object itself.
     */
    public LoginKeyListResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get 로그인 키 리스트.
     *
     * @return the loginKeyList value
     */
    public List<LoginKeyList> loginKeyList() {
        return this.loginKeyList;
    }

    /**
     * Set 로그인 키 리스트.
     *
     * @param loginKeyList the loginKeyList value to set
     * @return the LoginKeyListResponse object itself.
     */
    public LoginKeyListResponse withLoginKeyList(List<LoginKeyList> loginKeyList) {
        this.loginKeyList = loginKeyList;
        return this;
    }

}
