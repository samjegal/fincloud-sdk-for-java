/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AccessControlGroupListResponse model.
 */
public class AccessControlGroupListResponse {
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
     * ACG 리스트.
     */
    @JsonProperty(value = "accessControlGroupList")
    private List<AccessControlGroupList> accessControlGroupList;

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
     * @return the AccessControlGroupListResponse object itself.
     */
    public AccessControlGroupListResponse withReturnCode(String returnCode) {
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
     * @return the AccessControlGroupListResponse object itself.
     */
    public AccessControlGroupListResponse withReturnMessage(String returnMessage) {
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
     * @return the AccessControlGroupListResponse object itself.
     */
    public AccessControlGroupListResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get aCG 리스트.
     *
     * @return the accessControlGroupList value
     */
    public List<AccessControlGroupList> accessControlGroupList() {
        return this.accessControlGroupList;
    }

    /**
     * Set aCG 리스트.
     *
     * @param accessControlGroupList the accessControlGroupList value to set
     * @return the AccessControlGroupListResponse object itself.
     */
    public AccessControlGroupListResponse withAccessControlGroupList(List<AccessControlGroupList> accessControlGroupList) {
        this.accessControlGroupList = accessControlGroupList;
        return this;
    }

}
