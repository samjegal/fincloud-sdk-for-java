/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The NetworkAclOutboundRuleResponse model.
 */
public class NetworkAclOutboundRuleResponse {
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
     * 네트워크 ACL 룰 리스트.
     */
    @JsonProperty(value = "networkAclRuleList")
    private List<NetworkAclRuleList> networkAclRuleList;

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
     * @return the NetworkAclOutboundRuleResponse object itself.
     */
    public NetworkAclOutboundRuleResponse withReturnCode(String returnCode) {
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
     * @return the NetworkAclOutboundRuleResponse object itself.
     */
    public NetworkAclOutboundRuleResponse withReturnMessage(String returnMessage) {
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
     * @return the NetworkAclOutboundRuleResponse object itself.
     */
    public NetworkAclOutboundRuleResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get 네트워크 ACL 룰 리스트.
     *
     * @return the networkAclRuleList value
     */
    public List<NetworkAclRuleList> networkAclRuleList() {
        return this.networkAclRuleList;
    }

    /**
     * Set 네트워크 ACL 룰 리스트.
     *
     * @param networkAclRuleList the networkAclRuleList value to set
     * @return the NetworkAclOutboundRuleResponse object itself.
     */
    public NetworkAclOutboundRuleResponse withNetworkAclRuleList(List<NetworkAclRuleList> networkAclRuleList) {
        this.networkAclRuleList = networkAclRuleList;
        return this;
    }

}
