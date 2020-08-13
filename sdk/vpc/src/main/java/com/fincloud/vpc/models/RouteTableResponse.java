/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RouteTableResponse model.
 */
public class RouteTableResponse {
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
     * 라우트 테이블 리스트.
     */
    @JsonProperty(value = "routeTableList")
    private List<RouteTableList> routeTableList;

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
     * @return the RouteTableResponse object itself.
     */
    public RouteTableResponse withReturnCode(String returnCode) {
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
     * @return the RouteTableResponse object itself.
     */
    public RouteTableResponse withReturnMessage(String returnMessage) {
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
     * @return the RouteTableResponse object itself.
     */
    public RouteTableResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get 라우트 테이블 리스트.
     *
     * @return the routeTableList value
     */
    public List<RouteTableList> routeTableList() {
        return this.routeTableList;
    }

    /**
     * Set 라우트 테이블 리스트.
     *
     * @param routeTableList the routeTableList value to set
     * @return the RouteTableResponse object itself.
     */
    public RouteTableResponse withRouteTableList(List<RouteTableList> routeTableList) {
        this.routeTableList = routeTableList;
        return this;
    }

}
