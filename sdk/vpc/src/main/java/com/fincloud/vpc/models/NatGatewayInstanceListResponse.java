/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The NatGatewayInstanceListResponse model.
 */
public class NatGatewayInstanceListResponse {
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
     * NAT 게이트웨이 인스턴스 리스트.
     */
    @JsonProperty(value = "natGatewayInstanceList")
    private List<NatGatewayInstanceList> natGatewayInstanceList;

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
     * @return the NatGatewayInstanceListResponse object itself.
     */
    public NatGatewayInstanceListResponse withReturnCode(String returnCode) {
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
     * @return the NatGatewayInstanceListResponse object itself.
     */
    public NatGatewayInstanceListResponse withReturnMessage(String returnMessage) {
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
     * @return the NatGatewayInstanceListResponse object itself.
     */
    public NatGatewayInstanceListResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get nAT 게이트웨이 인스턴스 리스트.
     *
     * @return the natGatewayInstanceList value
     */
    public List<NatGatewayInstanceList> natGatewayInstanceList() {
        return this.natGatewayInstanceList;
    }

    /**
     * Set nAT 게이트웨이 인스턴스 리스트.
     *
     * @param natGatewayInstanceList the natGatewayInstanceList value to set
     * @return the NatGatewayInstanceListResponse object itself.
     */
    public NatGatewayInstanceListResponse withNatGatewayInstanceList(List<NatGatewayInstanceList> natGatewayInstanceList) {
        this.natGatewayInstanceList = natGatewayInstanceList;
        return this;
    }

}
