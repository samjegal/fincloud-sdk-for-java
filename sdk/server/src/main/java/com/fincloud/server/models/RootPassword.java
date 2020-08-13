/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RootPassword model.
 */
public class RootPassword {
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
     * 관리자 비밀번호.
     */
    @JsonProperty(value = "rootPassword")
    private String rootPassword;

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
     * @return the RootPassword object itself.
     */
    public RootPassword withReturnCode(String returnCode) {
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
     * @return the RootPassword object itself.
     */
    public RootPassword withReturnMessage(String returnMessage) {
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
     * @return the RootPassword object itself.
     */
    public RootPassword withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get 관리자 비밀번호.
     *
     * @return the rootPassword value
     */
    public String rootPassword() {
        return this.rootPassword;
    }

    /**
     * Set 관리자 비밀번호.
     *
     * @param rootPassword the rootPassword value to set
     * @return the RootPassword object itself.
     */
    public RootPassword withRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
        return this;
    }

}
