/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RouteTableList model.
 */
public class RouteTableList {
    /**
     * 라우트 테이블 번호.
     */
    @JsonProperty(value = "routeTableNo")
    private String routeTableNo;

    /**
     * 라우트 테이블 이름.
     */
    @JsonProperty(value = "routeTableName")
    private String routeTableName;

    /**
     * 리전 코드.
     */
    @JsonProperty(value = "regionCode")
    private String regionCode;

    /**
     * VPC 번호.
     */
    @JsonProperty(value = "vpcNo")
    private String vpcNo;

    /**
     * 지원 서브넷 타입.
     */
    @JsonProperty(value = "supportedSubnetType")
    private SupportedSubnetType supportedSubnetType;

    /**
     * 기본 라우트 여부.
     */
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;

    /**
     * 라우트 테이블 상태.
     */
    @JsonProperty(value = "routeTableStatus")
    private RouteTableStatus routeTableStatus;

    /**
     * 라우트 테이블 설명.
     */
    @JsonProperty(value = "routeTableDescription")
    private String routeTableDescription;

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
     * @return the RouteTableList object itself.
     */
    public RouteTableList withRouteTableNo(String routeTableNo) {
        this.routeTableNo = routeTableNo;
        return this;
    }

    /**
     * Get 라우트 테이블 이름.
     *
     * @return the routeTableName value
     */
    public String routeTableName() {
        return this.routeTableName;
    }

    /**
     * Set 라우트 테이블 이름.
     *
     * @param routeTableName the routeTableName value to set
     * @return the RouteTableList object itself.
     */
    public RouteTableList withRouteTableName(String routeTableName) {
        this.routeTableName = routeTableName;
        return this;
    }

    /**
     * Get 리전 코드.
     *
     * @return the regionCode value
     */
    public String regionCode() {
        return this.regionCode;
    }

    /**
     * Set 리전 코드.
     *
     * @param regionCode the regionCode value to set
     * @return the RouteTableList object itself.
     */
    public RouteTableList withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * Get vPC 번호.
     *
     * @return the vpcNo value
     */
    public String vpcNo() {
        return this.vpcNo;
    }

    /**
     * Set vPC 번호.
     *
     * @param vpcNo the vpcNo value to set
     * @return the RouteTableList object itself.
     */
    public RouteTableList withVpcNo(String vpcNo) {
        this.vpcNo = vpcNo;
        return this;
    }

    /**
     * Get 지원 서브넷 타입.
     *
     * @return the supportedSubnetType value
     */
    public SupportedSubnetType supportedSubnetType() {
        return this.supportedSubnetType;
    }

    /**
     * Set 지원 서브넷 타입.
     *
     * @param supportedSubnetType the supportedSubnetType value to set
     * @return the RouteTableList object itself.
     */
    public RouteTableList withSupportedSubnetType(SupportedSubnetType supportedSubnetType) {
        this.supportedSubnetType = supportedSubnetType;
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
     * @return the RouteTableList object itself.
     */
    public RouteTableList withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get 라우트 테이블 상태.
     *
     * @return the routeTableStatus value
     */
    public RouteTableStatus routeTableStatus() {
        return this.routeTableStatus;
    }

    /**
     * Set 라우트 테이블 상태.
     *
     * @param routeTableStatus the routeTableStatus value to set
     * @return the RouteTableList object itself.
     */
    public RouteTableList withRouteTableStatus(RouteTableStatus routeTableStatus) {
        this.routeTableStatus = routeTableStatus;
        return this;
    }

    /**
     * Get 라우트 테이블 설명.
     *
     * @return the routeTableDescription value
     */
    public String routeTableDescription() {
        return this.routeTableDescription;
    }

    /**
     * Set 라우트 테이블 설명.
     *
     * @param routeTableDescription the routeTableDescription value to set
     * @return the RouteTableList object itself.
     */
    public RouteTableList withRouteTableDescription(String routeTableDescription) {
        this.routeTableDescription = routeTableDescription;
        return this;
    }

}
