/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The NetworkAclDetailResponse model.
 */
public class NetworkAclDetailResponse {
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
     * 네트워크 ACL 리스트.
     */
    @JsonProperty(value = "networkAclList")
    private List<NetworkAclList> networkAclList;

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
     * @return the NetworkAclDetailResponse object itself.
     */
    public NetworkAclDetailResponse withReturnCode(String returnCode) {
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
     * @return the NetworkAclDetailResponse object itself.
     */
    public NetworkAclDetailResponse withReturnMessage(String returnMessage) {
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
     * @return the NetworkAclDetailResponse object itself.
     */
    public NetworkAclDetailResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get 네트워크 ACL 리스트.
     *
     * @return the networkAclList value
     */
    public List<NetworkAclList> networkAclList() {
        return this.networkAclList;
    }

    /**
     * Set 네트워크 ACL 리스트.
     *
     * @param networkAclList the networkAclList value to set
     * @return the NetworkAclDetailResponse object itself.
     */
    public NetworkAclDetailResponse withNetworkAclList(List<NetworkAclList> networkAclList) {
        this.networkAclList = networkAclList;
        return this;
    }

}
