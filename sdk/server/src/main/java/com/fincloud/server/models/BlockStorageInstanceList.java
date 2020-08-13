/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The BlockStorageInstanceList model.
 */
public class BlockStorageInstanceList {
    /**
     * 블럭 스토리지 인스턴스 번호.
     */
    @JsonProperty(value = "blockStorageInstanceNo")
    private String blockStorageInstanceNo;

    /**
     * 서버 인스턴스 번호.
     */
    @JsonProperty(value = "serverInstanceNo")
    private String serverInstanceNo;

    /**
     * 블럭 스토리지 이름.
     */
    @JsonProperty(value = "blockStorageName")
    private String blockStorageName;

    /**
     * 블럭 스토리지 타입.
     */
    @JsonProperty(value = "blockStorageType")
    private BlockStorageType blockStorageType;

    /**
     * 블럭 스토리지 크기.
     */
    @JsonProperty(value = "blockStorageSize")
    private Double blockStorageSize;

    /**
     * 장치 이름.
     */
    @JsonProperty(value = "deviceName")
    private String deviceName;

    /**
     * 블럭 스토리지 제품 코드.
     */
    @JsonProperty(value = "blockStorageProductCode")
    private String blockStorageProductCode;

    /**
     * 블럭 스토리지 인스턴스 상태.
     */
    @JsonProperty(value = "blockStorageInstanceStatus")
    private BlockStorageInstanceStatus blockStorageInstanceStatus;

    /**
     * 블럭 스토리지 인스턴스 운영.
     */
    @JsonProperty(value = "blockStorageInstanceOperation")
    private BlockStorageInstanceOperation blockStorageInstanceOperation;

    /**
     * 블럭 스토리지 인스턴스 상태 이름.
     */
    @JsonProperty(value = "blockStorageInstanceStatusName")
    private String blockStorageInstanceStatusName;

    /**
     * 생성 일자.
     */
    @JsonProperty(value = "createDate")
    private String createDate;

    /**
     * 블럭 스토리지 설명.
     */
    @JsonProperty(value = "blockStorageDescription")
    private String blockStorageDescription;

    /**
     * 블럭 스토리지 디스크 타입.
     */
    @JsonProperty(value = "blockStorageDiskType")
    private BlockStorageDiskType blockStorageDiskType;

    /**
     * 블럭 스토리지 디스크 상세 타입.
     */
    @JsonProperty(value = "blockStorageDiskDetailType")
    private BlockStorageDiskDetailType blockStorageDiskDetailType;

    /**
     * 최대 IOPS 성녕.
     */
    @JsonProperty(value = "maxIopsThroughput")
    private Double maxIopsThroughput;

    /**
     * 볼륨 암호화 여부.
     */
    @JsonProperty(value = "isEncryptedVolume")
    private Boolean isEncryptedVolume;

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
     * Get 블럭 스토리지 인스턴스 번호.
     *
     * @return the blockStorageInstanceNo value
     */
    public String blockStorageInstanceNo() {
        return this.blockStorageInstanceNo;
    }

    /**
     * Set 블럭 스토리지 인스턴스 번호.
     *
     * @param blockStorageInstanceNo the blockStorageInstanceNo value to set
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withBlockStorageInstanceNo(String blockStorageInstanceNo) {
        this.blockStorageInstanceNo = blockStorageInstanceNo;
        return this;
    }

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
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withServerInstanceNo(String serverInstanceNo) {
        this.serverInstanceNo = serverInstanceNo;
        return this;
    }

    /**
     * Get 블럭 스토리지 이름.
     *
     * @return the blockStorageName value
     */
    public String blockStorageName() {
        return this.blockStorageName;
    }

    /**
     * Set 블럭 스토리지 이름.
     *
     * @param blockStorageName the blockStorageName value to set
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withBlockStorageName(String blockStorageName) {
        this.blockStorageName = blockStorageName;
        return this;
    }

    /**
     * Get 블럭 스토리지 타입.
     *
     * @return the blockStorageType value
     */
    public BlockStorageType blockStorageType() {
        return this.blockStorageType;
    }

    /**
     * Set 블럭 스토리지 타입.
     *
     * @param blockStorageType the blockStorageType value to set
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withBlockStorageType(BlockStorageType blockStorageType) {
        this.blockStorageType = blockStorageType;
        return this;
    }

    /**
     * Get 블럭 스토리지 크기.
     *
     * @return the blockStorageSize value
     */
    public Double blockStorageSize() {
        return this.blockStorageSize;
    }

    /**
     * Set 블럭 스토리지 크기.
     *
     * @param blockStorageSize the blockStorageSize value to set
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withBlockStorageSize(Double blockStorageSize) {
        this.blockStorageSize = blockStorageSize;
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
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * Get 블럭 스토리지 제품 코드.
     *
     * @return the blockStorageProductCode value
     */
    public String blockStorageProductCode() {
        return this.blockStorageProductCode;
    }

    /**
     * Set 블럭 스토리지 제품 코드.
     *
     * @param blockStorageProductCode the blockStorageProductCode value to set
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withBlockStorageProductCode(String blockStorageProductCode) {
        this.blockStorageProductCode = blockStorageProductCode;
        return this;
    }

    /**
     * Get 블럭 스토리지 인스턴스 상태.
     *
     * @return the blockStorageInstanceStatus value
     */
    public BlockStorageInstanceStatus blockStorageInstanceStatus() {
        return this.blockStorageInstanceStatus;
    }

    /**
     * Set 블럭 스토리지 인스턴스 상태.
     *
     * @param blockStorageInstanceStatus the blockStorageInstanceStatus value to set
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withBlockStorageInstanceStatus(BlockStorageInstanceStatus blockStorageInstanceStatus) {
        this.blockStorageInstanceStatus = blockStorageInstanceStatus;
        return this;
    }

    /**
     * Get 블럭 스토리지 인스턴스 운영.
     *
     * @return the blockStorageInstanceOperation value
     */
    public BlockStorageInstanceOperation blockStorageInstanceOperation() {
        return this.blockStorageInstanceOperation;
    }

    /**
     * Set 블럭 스토리지 인스턴스 운영.
     *
     * @param blockStorageInstanceOperation the blockStorageInstanceOperation value to set
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withBlockStorageInstanceOperation(BlockStorageInstanceOperation blockStorageInstanceOperation) {
        this.blockStorageInstanceOperation = blockStorageInstanceOperation;
        return this;
    }

    /**
     * Get 블럭 스토리지 인스턴스 상태 이름.
     *
     * @return the blockStorageInstanceStatusName value
     */
    public String blockStorageInstanceStatusName() {
        return this.blockStorageInstanceStatusName;
    }

    /**
     * Set 블럭 스토리지 인스턴스 상태 이름.
     *
     * @param blockStorageInstanceStatusName the blockStorageInstanceStatusName value to set
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withBlockStorageInstanceStatusName(String blockStorageInstanceStatusName) {
        this.blockStorageInstanceStatusName = blockStorageInstanceStatusName;
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
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Get 블럭 스토리지 설명.
     *
     * @return the blockStorageDescription value
     */
    public String blockStorageDescription() {
        return this.blockStorageDescription;
    }

    /**
     * Set 블럭 스토리지 설명.
     *
     * @param blockStorageDescription the blockStorageDescription value to set
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withBlockStorageDescription(String blockStorageDescription) {
        this.blockStorageDescription = blockStorageDescription;
        return this;
    }

    /**
     * Get 블럭 스토리지 디스크 타입.
     *
     * @return the blockStorageDiskType value
     */
    public BlockStorageDiskType blockStorageDiskType() {
        return this.blockStorageDiskType;
    }

    /**
     * Set 블럭 스토리지 디스크 타입.
     *
     * @param blockStorageDiskType the blockStorageDiskType value to set
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withBlockStorageDiskType(BlockStorageDiskType blockStorageDiskType) {
        this.blockStorageDiskType = blockStorageDiskType;
        return this;
    }

    /**
     * Get 블럭 스토리지 디스크 상세 타입.
     *
     * @return the blockStorageDiskDetailType value
     */
    public BlockStorageDiskDetailType blockStorageDiskDetailType() {
        return this.blockStorageDiskDetailType;
    }

    /**
     * Set 블럭 스토리지 디스크 상세 타입.
     *
     * @param blockStorageDiskDetailType the blockStorageDiskDetailType value to set
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withBlockStorageDiskDetailType(BlockStorageDiskDetailType blockStorageDiskDetailType) {
        this.blockStorageDiskDetailType = blockStorageDiskDetailType;
        return this;
    }

    /**
     * Get 최대 IOPS 성녕.
     *
     * @return the maxIopsThroughput value
     */
    public Double maxIopsThroughput() {
        return this.maxIopsThroughput;
    }

    /**
     * Set 최대 IOPS 성녕.
     *
     * @param maxIopsThroughput the maxIopsThroughput value to set
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withMaxIopsThroughput(Double maxIopsThroughput) {
        this.maxIopsThroughput = maxIopsThroughput;
        return this;
    }

    /**
     * Get 볼륨 암호화 여부.
     *
     * @return the isEncryptedVolume value
     */
    public Boolean isEncryptedVolume() {
        return this.isEncryptedVolume;
    }

    /**
     * Set 볼륨 암호화 여부.
     *
     * @param isEncryptedVolume the isEncryptedVolume value to set
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withIsEncryptedVolume(Boolean isEncryptedVolume) {
        this.isEncryptedVolume = isEncryptedVolume;
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
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withZoneCode(String zoneCode) {
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
     * @return the BlockStorageInstanceList object itself.
     */
    public BlockStorageInstanceList withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

}
