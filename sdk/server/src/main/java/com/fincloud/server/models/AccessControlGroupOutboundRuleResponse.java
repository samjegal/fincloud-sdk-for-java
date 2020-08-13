/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AccessControlGroupOutboundRuleResponse model.
 */
public class AccessControlGroupOutboundRuleResponse {
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
     * ACG 룰 리스트.
     */
    @JsonProperty(value = "accessControlGroupRuleList")
    private List<AccessControlGroupRuleList> accessControlGroupRuleList;

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
     * @return the AccessControlGroupOutboundRuleResponse object itself.
     */
    public AccessControlGroupOutboundRuleResponse withReturnCode(String returnCode) {
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
     * @return the AccessControlGroupOutboundRuleResponse object itself.
     */
    public AccessControlGroupOutboundRuleResponse withReturnMessage(String returnMessage) {
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
     * @return the AccessControlGroupOutboundRuleResponse object itself.
     */
    public AccessControlGroupOutboundRuleResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get aCG 룰 리스트.
     *
     * @return the accessControlGroupRuleList value
     */
    public List<AccessControlGroupRuleList> accessControlGroupRuleList() {
        return this.accessControlGroupRuleList;
    }

    /**
     * Set aCG 룰 리스트.
     *
     * @param accessControlGroupRuleList the accessControlGroupRuleList value to set
     * @return the AccessControlGroupOutboundRuleResponse object itself.
     */
    public AccessControlGroupOutboundRuleResponse withAccessControlGroupRuleList(List<AccessControlGroupRuleList> accessControlGroupRuleList) {
        this.accessControlGroupRuleList = accessControlGroupRuleList;
        return this;
    }

}
