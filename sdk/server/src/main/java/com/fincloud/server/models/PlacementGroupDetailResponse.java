/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PlacementGroupDetailResponse model.
 */
public class PlacementGroupDetailResponse {
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
     * 물리 배치 그룹 리스트.
     */
    @JsonProperty(value = "placementGroupList")
    private List<PlacementGroupList> placementGroupList;

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
     * @return the PlacementGroupDetailResponse object itself.
     */
    public PlacementGroupDetailResponse withReturnCode(String returnCode) {
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
     * @return the PlacementGroupDetailResponse object itself.
     */
    public PlacementGroupDetailResponse withReturnMessage(String returnMessage) {
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
     * @return the PlacementGroupDetailResponse object itself.
     */
    public PlacementGroupDetailResponse withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * Get 물리 배치 그룹 리스트.
     *
     * @return the placementGroupList value
     */
    public List<PlacementGroupList> placementGroupList() {
        return this.placementGroupList;
    }

    /**
     * Set 물리 배치 그룹 리스트.
     *
     * @param placementGroupList the placementGroupList value to set
     * @return the PlacementGroupDetailResponse object itself.
     */
    public PlacementGroupDetailResponse withPlacementGroupList(List<PlacementGroupList> placementGroupList) {
        this.placementGroupList = placementGroupList;
        return this;
    }

}
