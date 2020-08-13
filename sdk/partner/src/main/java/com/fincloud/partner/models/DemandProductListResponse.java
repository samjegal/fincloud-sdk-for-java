/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.partner.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DemandProductListResponse model.
 */
public class DemandProductListResponse {
    /**
     * 요청 ID.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /**
     * 반환 코드.
     */
    @JsonProperty(value = "returnCode")
    private String returnCode;

    /**
     * 반환 메시지.
     */
    @JsonProperty(value = "returnMessage")
    private String returnMessage;

    /**
     * 총 행 개수.
     */
    @JsonProperty(value = "totalRows")
    private Integer totalRows;

    /**
     * The demandProductList property.
     */
    @JsonProperty(value = "demandProductList")
    private List<DemandProductList> demandProductList;

    /**
     * Get 요청 ID.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set 요청 ID.
     *
     * @param requestId the requestId value to set
     * @return the DemandProductListResponse object itself.
     */
    public DemandProductListResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get 반환 코드.
     *
     * @return the returnCode value
     */
    public String returnCode() {
        return this.returnCode;
    }

    /**
     * Set 반환 코드.
     *
     * @param returnCode the returnCode value to set
     * @return the DemandProductListResponse object itself.
     */
    public DemandProductListResponse withReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }

    /**
     * Get 반환 메시지.
     *
     * @return the returnMessage value
     */
    public String returnMessage() {
        return this.returnMessage;
    }

    /**
     * Set 반환 메시지.
     *
     * @param returnMessage the returnMessage value to set
     * @return the DemandProductListResponse object itself.
     */
    public DemandProductListResponse withReturnMessage(String returnMessage) {
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
     * @return the DemandProductListResponse object itself.
     */
    public DemandProductListResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get the demandProductList value.
     *
     * @return the demandProductList value
     */
    public List<DemandProductList> demandProductList() {
        return this.demandProductList;
    }

    /**
     * Set the demandProductList value.
     *
     * @param demandProductList the demandProductList value to set
     * @return the DemandProductListResponse object itself.
     */
    public DemandProductListResponse withDemandProductList(List<DemandProductList> demandProductList) {
        this.demandProductList = demandProductList;
        return this;
    }

}
