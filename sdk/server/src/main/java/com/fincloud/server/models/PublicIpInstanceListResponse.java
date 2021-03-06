/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PublicIpInstanceListResponse model.
 */
public class PublicIpInstanceListResponse {
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
     * 공인 IP 인스턴스 리스트.
     */
    @JsonProperty(value = "publicIpInstanceList")
    private List<PublicIpInstanceList> publicIpInstanceList;

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
     * @return the PublicIpInstanceListResponse object itself.
     */
    public PublicIpInstanceListResponse withReturnCode(String returnCode) {
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
     * @return the PublicIpInstanceListResponse object itself.
     */
    public PublicIpInstanceListResponse withReturnMessage(String returnMessage) {
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
     * @return the PublicIpInstanceListResponse object itself.
     */
    public PublicIpInstanceListResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get 공인 IP 인스턴스 리스트.
     *
     * @return the publicIpInstanceList value
     */
    public List<PublicIpInstanceList> publicIpInstanceList() {
        return this.publicIpInstanceList;
    }

    /**
     * Set 공인 IP 인스턴스 리스트.
     *
     * @param publicIpInstanceList the publicIpInstanceList value to set
     * @return the PublicIpInstanceListResponse object itself.
     */
    public PublicIpInstanceListResponse withPublicIpInstanceList(List<PublicIpInstanceList> publicIpInstanceList) {
        this.publicIpInstanceList = publicIpInstanceList;
        return this;
    }

}
