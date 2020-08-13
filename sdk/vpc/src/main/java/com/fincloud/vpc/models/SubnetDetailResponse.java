/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SubnetDetailResponse model.
 */
public class SubnetDetailResponse {
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
     * 서브넷 리스트.
     */
    @JsonProperty(value = "subnetList")
    private List<SubnetList> subnetList;

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
     * @return the SubnetDetailResponse object itself.
     */
    public SubnetDetailResponse withReturnCode(String returnCode) {
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
     * @return the SubnetDetailResponse object itself.
     */
    public SubnetDetailResponse withReturnMessage(String returnMessage) {
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
     * @return the SubnetDetailResponse object itself.
     */
    public SubnetDetailResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get 서브넷 리스트.
     *
     * @return the subnetList value
     */
    public List<SubnetList> subnetList() {
        return this.subnetList;
    }

    /**
     * Set 서브넷 리스트.
     *
     * @param subnetList the subnetList value to set
     * @return the SubnetDetailResponse object itself.
     */
    public SubnetDetailResponse withSubnetList(List<SubnetList> subnetList) {
        this.subnetList = subnetList;
        return this;
    }

}
