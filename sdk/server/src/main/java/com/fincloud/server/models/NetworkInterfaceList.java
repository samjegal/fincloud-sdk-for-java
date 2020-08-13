/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The NetworkInterfaceList model.
 */
public class NetworkInterfaceList {
    /**
     * 네트워크 인터페이스 번호.
     */
    @JsonProperty(value = "networkInterfaceNo")
    private String networkInterfaceNo;

    /**
     * 네트워크 인터페이스 이름.
     */
    @JsonProperty(value = "networkInterfaceName")
    private String networkInterfaceName;

    /**
     * 서브넷 번호.
     */
    @JsonProperty(value = "subnetNo")
    private String subnetNo;

    /**
     * 반납 후 삭제 여부.
     */
    @JsonProperty(value = "deleteOnTermination")
    private Boolean deleteOnTermination;

    /**
     * 기본 여부.
     */
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;

    /**
     * 장치 이름.
     */
    @JsonProperty(value = "deviceName")
    private String deviceName;

    /**
     * 네트워크 인터페이스 상태.
     */
    @JsonProperty(value = "networkInterfaceStatus")
    private NetworkInterfaceStatus networkInterfaceStatus;

    /**
     * 인스턴스 타입.
     */
    @JsonProperty(value = "instanceType")
    private InstanceType instanceType;

    /**
     * 인스턴스 번호.
     */
    @JsonProperty(value = "instanceNo")
    private String instanceNo;

    /**
     * IP 주소.
     */
    @JsonProperty(value = "ip")
    private String ip;

    /**
     * ACG 번호 리스트.
     */
    @JsonProperty(value = "accessControlGroupNoList")
    private AccessControlGroupNoList accessControlGroupNoList;

    /**
     * Get 네트워크 인터페이스 번호.
     *
     * @return the networkInterfaceNo value
     */
    public String networkInterfaceNo() {
        return this.networkInterfaceNo;
    }

    /**
     * Set 네트워크 인터페이스 번호.
     *
     * @param networkInterfaceNo the networkInterfaceNo value to set
     * @return the NetworkInterfaceList object itself.
     */
    public NetworkInterfaceList withNetworkInterfaceNo(String networkInterfaceNo) {
        this.networkInterfaceNo = networkInterfaceNo;
        return this;
    }

    /**
     * Get 네트워크 인터페이스 이름.
     *
     * @return the networkInterfaceName value
     */
    public String networkInterfaceName() {
        return this.networkInterfaceName;
    }

    /**
     * Set 네트워크 인터페이스 이름.
     *
     * @param networkInterfaceName the networkInterfaceName value to set
     * @return the NetworkInterfaceList object itself.
     */
    public NetworkInterfaceList withNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }

    /**
     * Get 서브넷 번호.
     *
     * @return the subnetNo value
     */
    public String subnetNo() {
        return this.subnetNo;
    }

    /**
     * Set 서브넷 번호.
     *
     * @param subnetNo the subnetNo value to set
     * @return the NetworkInterfaceList object itself.
     */
    public NetworkInterfaceList withSubnetNo(String subnetNo) {
        this.subnetNo = subnetNo;
        return this;
    }

    /**
     * Get 반납 후 삭제 여부.
     *
     * @return the deleteOnTermination value
     */
    public Boolean deleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * Set 반납 후 삭제 여부.
     *
     * @param deleteOnTermination the deleteOnTermination value to set
     * @return the NetworkInterfaceList object itself.
     */
    public NetworkInterfaceList withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * Get 기본 여부.
     *
     * @return the isDefault value
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set 기본 여부.
     *
     * @param isDefault the isDefault value to set
     * @return the NetworkInterfaceList object itself.
     */
    public NetworkInterfaceList withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get 장치 이름.
     *
     * @return the deviceName value
     */
    public String deviceName() {
        return this.deviceName;
    }

    /**
     * Set 장치 이름.
     *
     * @param deviceName the deviceName value to set
     * @return the NetworkInterfaceList object itself.
     */
    public NetworkInterfaceList withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * Get 네트워크 인터페이스 상태.
     *
     * @return the networkInterfaceStatus value
     */
    public NetworkInterfaceStatus networkInterfaceStatus() {
        return this.networkInterfaceStatus;
    }

    /**
     * Set 네트워크 인터페이스 상태.
     *
     * @param networkInterfaceStatus the networkInterfaceStatus value to set
     * @return the NetworkInterfaceList object itself.
     */
    public NetworkInterfaceList withNetworkInterfaceStatus(NetworkInterfaceStatus networkInterfaceStatus) {
        this.networkInterfaceStatus = networkInterfaceStatus;
        return this;
    }

    /**
     * Get 인스턴스 타입.
     *
     * @return the instanceType value
     */
    public InstanceType instanceType() {
        return this.instanceType;
    }

    /**
     * Set 인스턴스 타입.
     *
     * @param instanceType the instanceType value to set
     * @return the NetworkInterfaceList object itself.
     */
    public NetworkInterfaceList withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * Get 인스턴스 번호.
     *
     * @return the instanceNo value
     */
    public String instanceNo() {
        return this.instanceNo;
    }

    /**
     * Set 인스턴스 번호.
     *
     * @param instanceNo the instanceNo value to set
     * @return the NetworkInterfaceList object itself.
     */
    public NetworkInterfaceList withInstanceNo(String instanceNo) {
        this.instanceNo = instanceNo;
        return this;
    }

    /**
     * Get iP 주소.
     *
     * @return the ip value
     */
    public String ip() {
        return this.ip;
    }

    /**
     * Set iP 주소.
     *
     * @param ip the ip value to set
     * @return the NetworkInterfaceList object itself.
     */
    public NetworkInterfaceList withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Get aCG 번호 리스트.
     *
     * @return the accessControlGroupNoList value
     */
    public AccessControlGroupNoList accessControlGroupNoList() {
        return this.accessControlGroupNoList;
    }

    /**
     * Set aCG 번호 리스트.
     *
     * @param accessControlGroupNoList the accessControlGroupNoList value to set
     * @return the NetworkInterfaceList object itself.
     */
    public NetworkInterfaceList withAccessControlGroupNoList(AccessControlGroupNoList accessControlGroupNoList) {
        this.accessControlGroupNoList = accessControlGroupNoList;
        return this;
    }

}
