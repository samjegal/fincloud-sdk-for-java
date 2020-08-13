/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ServerInstanceList model.
 */
public class ServerInstanceList {
    /**
     * 서버 인스턴스 번호.
     */
    @JsonProperty(value = "serverInstanceNo")
    private String serverInstanceNo;

    /**
     * 서버 이름.
     */
    @JsonProperty(value = "serverName")
    private String serverName;

    /**
     * 서버 설명.
     */
    @JsonProperty(value = "serverDescription")
    private String serverDescription;

    /**
     * CPU 코어 개수.
     */
    @JsonProperty(value = "cpuCount")
    private Integer cpuCount;

    /**
     * 메모리 크기.
     */
    @JsonProperty(value = "memorySize")
    private Double memorySize;

    /**
     * 플랫폼 타입.
     */
    @JsonProperty(value = "platformType")
    private PlatformType platformType;

    /**
     * 로그인 키 이름.
     */
    @JsonProperty(value = "loginKeyName")
    private String loginKeyName;

    /**
     * 공인 IP 인스턴스 번호.
     */
    @JsonProperty(value = "publicIpInstanceNo")
    private String publicIpInstanceNo;

    /**
     * 공인 IP 주소.
     */
    @JsonProperty(value = "publicIp")
    private String publicIp;

    /**
     * 서버 인스턴스 상태.
     */
    @JsonProperty(value = "serverInstanceStatus")
    private ServerInstanceStatus serverInstanceStatus;

    /**
     * 서버 인스턴스 운영.
     */
    @JsonProperty(value = "serverInstanceOperation")
    private ServerInstanceOperation serverInstanceOperation;

    /**
     * 서버 인스턴스 상태 이름.
     */
    @JsonProperty(value = "serverInstanceStatusName")
    private String serverInstanceStatusName;

    /**
     * 생성 일자.
     */
    @JsonProperty(value = "createDate")
    private String createDate;

    /**
     * 운영 시간.
     */
    @JsonProperty(value = "uptime")
    private String uptime;

    /**
     * 서버 이미지 제품 코드.
     */
    @JsonProperty(value = "serverImageProductCode")
    private String serverImageProductCode;

    /**
     * 서버 제품 코드.
     */
    @JsonProperty(value = "serverProductCode")
    private String serverProductCode;

    /**
     * 서버 반납 방지 여부.
     */
    @JsonProperty(value = "isProtectServerTermination")
    private Boolean isProtectServerTermination;

    /**
     * ZONE 코드.
     */
    @JsonProperty(value = "zoneCode")
    private String zoneCode;

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
     * 서브넷 번호.
     */
    @JsonProperty(value = "subnetNo")
    private String subnetNo;

    /**
     * 네트워크 인터페이스 번호 리스트.
     */
    @JsonProperty(value = "networkInterfaceNoList")
    private NetworkInterfaceNoList networkInterfaceNoList;

    /**
     * 초기화 스크립트 번호.
     */
    @JsonProperty(value = "initScriptNo")
    private String initScriptNo;

    /**
     * 서버 인스턴스 타입.
     */
    @JsonProperty(value = "serverInstanceType")
    private ServerInstanceType serverInstanceType;

    /**
     * 기본 블럭 스토리지 디스크 타입.
     */
    @JsonProperty(value = "baseBlockStorageDiskType")
    private BaseBlockStorageDiskType baseBlockStorageDiskType;

    /**
     * 기본 블럭 스토리지 디스크 상세 타입.
     */
    @JsonProperty(value = "baseBlockStorageDiskDetailType")
    private BaseBlockStorageDiskDetailType baseBlockStorageDiskDetailType;

    /**
     * 물리 배치 그룹 번호.
     */
    @JsonProperty(value = "placementGroupNo")
    private String placementGroupNo;

    /**
     * 물리 배치 그룹 이름.
     */
    @JsonProperty(value = "placementGroupName")
    private String placementGroupName;

    /**
     * Get 서버 인스턴스 번호.
     *
     * @return the serverInstanceNo value
     */
    public String serverInstanceNo() {
        return this.serverInstanceNo;
    }

    /**
     * Set 서버 인스턴스 번호.
     *
     * @param serverInstanceNo the serverInstanceNo value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withServerInstanceNo(String serverInstanceNo) {
        this.serverInstanceNo = serverInstanceNo;
        return this;
    }

    /**
     * Get 서버 이름.
     *
     * @return the serverName value
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Set 서버 이름.
     *
     * @param serverName the serverName value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get 서버 설명.
     *
     * @return the serverDescription value
     */
    public String serverDescription() {
        return this.serverDescription;
    }

    /**
     * Set 서버 설명.
     *
     * @param serverDescription the serverDescription value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withServerDescription(String serverDescription) {
        this.serverDescription = serverDescription;
        return this;
    }

    /**
     * Get cPU 코어 개수.
     *
     * @return the cpuCount value
     */
    public Integer cpuCount() {
        return this.cpuCount;
    }

    /**
     * Set cPU 코어 개수.
     *
     * @param cpuCount the cpuCount value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    /**
     * Get 메모리 크기.
     *
     * @return the memorySize value
     */
    public Double memorySize() {
        return this.memorySize;
    }

    /**
     * Set 메모리 크기.
     *
     * @param memorySize the memorySize value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withMemorySize(Double memorySize) {
        this.memorySize = memorySize;
        return this;
    }

    /**
     * Get 플랫폼 타입.
     *
     * @return the platformType value
     */
    public PlatformType platformType() {
        return this.platformType;
    }

    /**
     * Set 플랫폼 타입.
     *
     * @param platformType the platformType value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withPlatformType(PlatformType platformType) {
        this.platformType = platformType;
        return this;
    }

    /**
     * Get 로그인 키 이름.
     *
     * @return the loginKeyName value
     */
    public String loginKeyName() {
        return this.loginKeyName;
    }

    /**
     * Set 로그인 키 이름.
     *
     * @param loginKeyName the loginKeyName value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withLoginKeyName(String loginKeyName) {
        this.loginKeyName = loginKeyName;
        return this;
    }

    /**
     * Get 공인 IP 인스턴스 번호.
     *
     * @return the publicIpInstanceNo value
     */
    public String publicIpInstanceNo() {
        return this.publicIpInstanceNo;
    }

    /**
     * Set 공인 IP 인스턴스 번호.
     *
     * @param publicIpInstanceNo the publicIpInstanceNo value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withPublicIpInstanceNo(String publicIpInstanceNo) {
        this.publicIpInstanceNo = publicIpInstanceNo;
        return this;
    }

    /**
     * Get 공인 IP 주소.
     *
     * @return the publicIp value
     */
    public String publicIp() {
        return this.publicIp;
    }

    /**
     * Set 공인 IP 주소.
     *
     * @param publicIp the publicIp value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * Get 서버 인스턴스 상태.
     *
     * @return the serverInstanceStatus value
     */
    public ServerInstanceStatus serverInstanceStatus() {
        return this.serverInstanceStatus;
    }

    /**
     * Set 서버 인스턴스 상태.
     *
     * @param serverInstanceStatus the serverInstanceStatus value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withServerInstanceStatus(ServerInstanceStatus serverInstanceStatus) {
        this.serverInstanceStatus = serverInstanceStatus;
        return this;
    }

    /**
     * Get 서버 인스턴스 운영.
     *
     * @return the serverInstanceOperation value
     */
    public ServerInstanceOperation serverInstanceOperation() {
        return this.serverInstanceOperation;
    }

    /**
     * Set 서버 인스턴스 운영.
     *
     * @param serverInstanceOperation the serverInstanceOperation value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withServerInstanceOperation(ServerInstanceOperation serverInstanceOperation) {
        this.serverInstanceOperation = serverInstanceOperation;
        return this;
    }

    /**
     * Get 서버 인스턴스 상태 이름.
     *
     * @return the serverInstanceStatusName value
     */
    public String serverInstanceStatusName() {
        return this.serverInstanceStatusName;
    }

    /**
     * Set 서버 인스턴스 상태 이름.
     *
     * @param serverInstanceStatusName the serverInstanceStatusName value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withServerInstanceStatusName(String serverInstanceStatusName) {
        this.serverInstanceStatusName = serverInstanceStatusName;
        return this;
    }

    /**
     * Get 생성 일자.
     *
     * @return the createDate value
     */
    public String createDate() {
        return this.createDate;
    }

    /**
     * Set 생성 일자.
     *
     * @param createDate the createDate value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Get 운영 시간.
     *
     * @return the uptime value
     */
    public String uptime() {
        return this.uptime;
    }

    /**
     * Set 운영 시간.
     *
     * @param uptime the uptime value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withUptime(String uptime) {
        this.uptime = uptime;
        return this;
    }

    /**
     * Get 서버 이미지 제품 코드.
     *
     * @return the serverImageProductCode value
     */
    public String serverImageProductCode() {
        return this.serverImageProductCode;
    }

    /**
     * Set 서버 이미지 제품 코드.
     *
     * @param serverImageProductCode the serverImageProductCode value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withServerImageProductCode(String serverImageProductCode) {
        this.serverImageProductCode = serverImageProductCode;
        return this;
    }

    /**
     * Get 서버 제품 코드.
     *
     * @return the serverProductCode value
     */
    public String serverProductCode() {
        return this.serverProductCode;
    }

    /**
     * Set 서버 제품 코드.
     *
     * @param serverProductCode the serverProductCode value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withServerProductCode(String serverProductCode) {
        this.serverProductCode = serverProductCode;
        return this;
    }

    /**
     * Get 서버 반납 방지 여부.
     *
     * @return the isProtectServerTermination value
     */
    public Boolean isProtectServerTermination() {
        return this.isProtectServerTermination;
    }

    /**
     * Set 서버 반납 방지 여부.
     *
     * @param isProtectServerTermination the isProtectServerTermination value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withIsProtectServerTermination(Boolean isProtectServerTermination) {
        this.isProtectServerTermination = isProtectServerTermination;
        return this;
    }

    /**
     * Get zONE 코드.
     *
     * @return the zoneCode value
     */
    public String zoneCode() {
        return this.zoneCode;
    }

    /**
     * Set zONE 코드.
     *
     * @param zoneCode the zoneCode value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
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
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withRegionCode(String regionCode) {
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
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withVpcNo(String vpcNo) {
        this.vpcNo = vpcNo;
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
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withSubnetNo(String subnetNo) {
        this.subnetNo = subnetNo;
        return this;
    }

    /**
     * Get 네트워크 인터페이스 번호 리스트.
     *
     * @return the networkInterfaceNoList value
     */
    public NetworkInterfaceNoList networkInterfaceNoList() {
        return this.networkInterfaceNoList;
    }

    /**
     * Set 네트워크 인터페이스 번호 리스트.
     *
     * @param networkInterfaceNoList the networkInterfaceNoList value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withNetworkInterfaceNoList(NetworkInterfaceNoList networkInterfaceNoList) {
        this.networkInterfaceNoList = networkInterfaceNoList;
        return this;
    }

    /**
     * Get 초기화 스크립트 번호.
     *
     * @return the initScriptNo value
     */
    public String initScriptNo() {
        return this.initScriptNo;
    }

    /**
     * Set 초기화 스크립트 번호.
     *
     * @param initScriptNo the initScriptNo value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withInitScriptNo(String initScriptNo) {
        this.initScriptNo = initScriptNo;
        return this;
    }

    /**
     * Get 서버 인스턴스 타입.
     *
     * @return the serverInstanceType value
     */
    public ServerInstanceType serverInstanceType() {
        return this.serverInstanceType;
    }

    /**
     * Set 서버 인스턴스 타입.
     *
     * @param serverInstanceType the serverInstanceType value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withServerInstanceType(ServerInstanceType serverInstanceType) {
        this.serverInstanceType = serverInstanceType;
        return this;
    }

    /**
     * Get 기본 블럭 스토리지 디스크 타입.
     *
     * @return the baseBlockStorageDiskType value
     */
    public BaseBlockStorageDiskType baseBlockStorageDiskType() {
        return this.baseBlockStorageDiskType;
    }

    /**
     * Set 기본 블럭 스토리지 디스크 타입.
     *
     * @param baseBlockStorageDiskType the baseBlockStorageDiskType value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withBaseBlockStorageDiskType(BaseBlockStorageDiskType baseBlockStorageDiskType) {
        this.baseBlockStorageDiskType = baseBlockStorageDiskType;
        return this;
    }

    /**
     * Get 기본 블럭 스토리지 디스크 상세 타입.
     *
     * @return the baseBlockStorageDiskDetailType value
     */
    public BaseBlockStorageDiskDetailType baseBlockStorageDiskDetailType() {
        return this.baseBlockStorageDiskDetailType;
    }

    /**
     * Set 기본 블럭 스토리지 디스크 상세 타입.
     *
     * @param baseBlockStorageDiskDetailType the baseBlockStorageDiskDetailType value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withBaseBlockStorageDiskDetailType(BaseBlockStorageDiskDetailType baseBlockStorageDiskDetailType) {
        this.baseBlockStorageDiskDetailType = baseBlockStorageDiskDetailType;
        return this;
    }

    /**
     * Get 물리 배치 그룹 번호.
     *
     * @return the placementGroupNo value
     */
    public String placementGroupNo() {
        return this.placementGroupNo;
    }

    /**
     * Set 물리 배치 그룹 번호.
     *
     * @param placementGroupNo the placementGroupNo value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withPlacementGroupNo(String placementGroupNo) {
        this.placementGroupNo = placementGroupNo;
        return this;
    }

    /**
     * Get 물리 배치 그룹 이름.
     *
     * @return the placementGroupName value
     */
    public String placementGroupName() {
        return this.placementGroupName;
    }

    /**
     * Set 물리 배치 그룹 이름.
     *
     * @param placementGroupName the placementGroupName value to set
     * @return the ServerInstanceList object itself.
     */
    public ServerInstanceList withPlacementGroupName(String placementGroupName) {
        this.placementGroupName = placementGroupName;
        return this;
    }

}
