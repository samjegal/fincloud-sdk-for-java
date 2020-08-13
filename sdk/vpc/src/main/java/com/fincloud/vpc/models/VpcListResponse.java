/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The VpcListResponse model.
 */
public class VpcListResponse {
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
     * VPC 리스트.
     */
    @JsonProperty(value = "vpcList")
    private List<VpcList> vpcList;

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
     * @return the VpcListResponse object itself.
     */
    public VpcListResponse withReturnCode(String returnCode) {
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
     * @return the VpcListResponse object itself.
     */
    public VpcListResponse withReturnMessage(String returnMessage) {
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
     * @return the VpcListResponse object itself.
     */
    public VpcListResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get vPC 리스트.
     *
     * @return the vpcList value
     */
    public List<VpcList> vpcList() {
        return this.vpcList;
    }

    /**
     * Set vPC 리스트.
     *
     * @param vpcList the vpcList value to set
     * @return the VpcListResponse object itself.
     */
    public VpcListResponse withVpcList(List<VpcList> vpcList) {
        this.vpcList = vpcList;
        return this;
    }

}
