/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RouteList model.
 */
public class RouteList {
    /**
     * 목적이 IP 주소 CIDR.
     */
    @JsonProperty(value = "destinationCidrBlock")
    private String destinationCidrBlock;

    /**
     * 타겟 이름.
     */
    @JsonProperty(value = "targetName")
    private String targetName;

    /**
     * 라우트 테이블 번호.
     */
    @JsonProperty(value = "routeTableNo")
    private String routeTableNo;

    /**
     * 타겟 타입.
     */
    @JsonProperty(value = "targetType")
    private TargetType targetType;

    /**
     * 타겟 번호.
     */
    @JsonProperty(value = "targetNo")
    private String targetNo;

    /**
     * 기본 라우트 여부.
     */
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;

    /**
     * Get 목적이 IP 주소 CIDR.
     *
     * @return the destinationCidrBlock value
     */
    public String destinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * Set 목적이 IP 주소 CIDR.
     *
     * @param destinationCidrBlock the destinationCidrBlock value to set
     * @return the RouteList object itself.
     */
    public RouteList withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * Get 타겟 이름.
     *
     * @return the targetName value
     */
    public String targetName() {
        return this.targetName;
    }

    /**
     * Set 타겟 이름.
     *
     * @param targetName the targetName value to set
     * @return the RouteList object itself.
     */
    public RouteList withTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * Get 라우트 테이블 번호.
     *
     * @return the routeTableNo value
     */
    public String routeTableNo() {
        return this.routeTableNo;
    }

    /**
     * Set 라우트 테이블 번호.
     *
     * @param routeTableNo the routeTableNo value to set
     * @return the RouteList object itself.
     */
    public RouteList withRouteTableNo(String routeTableNo) {
        this.routeTableNo = routeTableNo;
        return this;
    }

    /**
     * Get 타겟 타입.
     *
     * @return the targetType value
     */
    public TargetType targetType() {
        return this.targetType;
    }

    /**
     * Set 타겟 타입.
     *
     * @param targetType the targetType value to set
     * @return the RouteList object itself.
     */
    public RouteList withTargetType(TargetType targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * Get 타겟 번호.
     *
     * @return the targetNo value
     */
    public String targetNo() {
        return this.targetNo;
    }

    /**
     * Set 타겟 번호.
     *
     * @param targetNo the targetNo value to set
     * @return the RouteList object itself.
     */
    public RouteList withTargetNo(String targetNo) {
        this.targetNo = targetNo;
        return this;
    }

    /**
     * Get 기본 라우트 여부.
     *
     * @return the isDefault value
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set 기본 라우트 여부.
     *
     * @param isDefault the isDefault value to set
     * @return the RouteList object itself.
     */
    public RouteList withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

}
