/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ServerInstancesResponse model.
 */
public class ServerInstancesResponse {
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
     * 서버 인스턴스 리스트.
     */
    @JsonProperty(value = "serverInstanceList")
    private List<ServerInstanceList> serverInstanceList;

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
     * @return the ServerInstancesResponse object itself.
     */
    public ServerInstancesResponse withReturnCode(String returnCode) {
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
     * @return the ServerInstancesResponse object itself.
     */
    public ServerInstancesResponse withReturnMessage(String returnMessage) {
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
     * @return the ServerInstancesResponse object itself.
     */
    public ServerInstancesResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get 서버 인스턴스 리스트.
     *
     * @return the serverInstanceList value
     */
    public List<ServerInstanceList> serverInstanceList() {
        return this.serverInstanceList;
    }

    /**
     * Set 서버 인스턴스 리스트.
     *
     * @param serverInstanceList the serverInstanceList value to set
     * @return the ServerInstancesResponse object itself.
     */
    public ServerInstancesResponse withServerInstanceList(List<ServerInstanceList> serverInstanceList) {
        this.serverInstanceList = serverInstanceList;
        return this;
    }

}
