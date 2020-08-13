/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PlacementGroupList model.
 */
public class PlacementGroupList {
    /**
     * 믈리 배치 그룹 번호.
     */
    @JsonProperty(value = "placementGroupNo")
    private String placementGroupNo;

    /**
     * 물리 배치 이름.
     */
    @JsonProperty(value = "placementGroupName")
    private String placementGroupName;

    /**
     * 물리 배치 그룹 타입.
     */
    @JsonProperty(value = "placementGroupType")
    private PlacementGroupType placementGroupType;

    /**
     * Get 믈리 배치 그룹 번호.
     *
     * @return the placementGroupNo value
     */
    public String placementGroupNo() {
        return this.placementGroupNo;
    }

    /**
     * Set 믈리 배치 그룹 번호.
     *
     * @param placementGroupNo the placementGroupNo value to set
     * @return the PlacementGroupList object itself.
     */
    public PlacementGroupList withPlacementGroupNo(String placementGroupNo) {
        this.placementGroupNo = placementGroupNo;
        return this;
    }

    /**
     * Get 물리 배치 이름.
     *
     * @return the placementGroupName value
     */
    public String placementGroupName() {
        return this.placementGroupName;
    }

    /**
     * Set 물리 배치 이름.
     *
     * @param placementGroupName the placementGroupName value to set
     * @return the PlacementGroupList object itself.
     */
    public PlacementGroupList withPlacementGroupName(String placementGroupName) {
        this.placementGroupName = placementGroupName;
        return this;
    }

    /**
     * Get 물리 배치 그룹 타입.
     *
     * @return the placementGroupType value
     */
    public PlacementGroupType placementGroupType() {
        return this.placementGroupType;
    }

    /**
     * Set 물리 배치 그룹 타입.
     *
     * @param placementGroupType the placementGroupType value to set
     * @return the PlacementGroupList object itself.
     */
    public PlacementGroupList withPlacementGroupType(PlacementGroupType placementGroupType) {
        this.placementGroupType = placementGroupType;
        return this;
    }

}
