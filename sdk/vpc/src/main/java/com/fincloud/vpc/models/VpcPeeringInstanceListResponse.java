/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The VpcPeeringInstanceListResponse model.
 */
public class VpcPeeringInstanceListResponse {
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
     * VPC 피어링 인스턴스 리스트.
     */
    @JsonProperty(value = "VpcPeeringInstanceList")
    private List<VpcPeeringInstanceList> vpcPeeringInstanceList;

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
     * @return the VpcPeeringInstanceListResponse object itself.
     */
    public VpcPeeringInstanceListResponse withReturnCode(String returnCode) {
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
     * @return the VpcPeeringInstanceListResponse object itself.
     */
    public VpcPeeringInstanceListResponse withReturnMessage(String returnMessage) {
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
     * @return the VpcPeeringInstanceListResponse object itself.
     */
    public VpcPeeringInstanceListResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get vPC 피어링 인스턴스 리스트.
     *
     * @return the vpcPeeringInstanceList value
     */
    public List<VpcPeeringInstanceList> vpcPeeringInstanceList() {
        return this.vpcPeeringInstanceList;
    }

    /**
     * Set vPC 피어링 인스턴스 리스트.
     *
     * @param vpcPeeringInstanceList the vpcPeeringInstanceList value to set
     * @return the VpcPeeringInstanceListResponse object itself.
     */
    public VpcPeeringInstanceListResponse withVpcPeeringInstanceList(List<VpcPeeringInstanceList> vpcPeeringInstanceList) {
        this.vpcPeeringInstanceList = vpcPeeringInstanceList;
        return this;
    }

}
