/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The BlockStorageSnapshotInstanceList model.
 */
public class BlockStorageSnapshotInstanceList {
    /**
     * 블럭 스토리지 스냅샷 인스턴스 번호.
     */
    @JsonProperty(value = "blockStorageSnapshotInstanceNo")
    private String blockStorageSnapshotInstanceNo;

    /**
     * 블럭 스토리지 스냅샷 이름.
     */
    @JsonProperty(value = "blockStorageSnapshotName")
    private String blockStorageSnapshotName;

    /**
     * 블럭 스토리지 스냅샷 볼륨 크기.
     */
    @JsonProperty(value = "blockStorageSnapshotVolumeSize")
    private Double blockStorageSnapshotVolumeSize;

    /**
     * 원본 블럭 스토리지 인스턴스 번호.
     */
    @JsonProperty(value = "originalBlockStorageInstanceNo")
    private String originalBlockStorageInstanceNo;

    /**
     * 블럭 스토리지 스냅샷 인스턴스 상태.
     */
    @JsonProperty(value = "blockStorageSnapshotInstanceStatus")
    private BlockStorageSnapshotInstanceStatus blockStorageSnapshotInstanceStatus;

    /**
     * 블럭 스토리지 스냅샷 인스턴스 운영.
     */
    @JsonProperty(value = "blockStorageSnapshotInstanceOperation")
    private BlockStorageSnapshotInstanceOperation blockStorageSnapshotInstanceOperation;

    /**
     * 블럭 스토리지 스냅샷 인스턴스 상태 이름.
     */
    @JsonProperty(value = "blockStorageSnapshotInstanceStatusName")
    private String blockStorageSnapshotInstanceStatusName;

    /**
     * 생성 일자.
     */
    @JsonProperty(value = "createDate")
    private String createDate;

    /**
     * 원본 블럭 스토리지 볼륨 암호화 여부.
     */
    @JsonProperty(value = "isEncryptedOriginalBlockStorageVolume")
    private Boolean isEncryptedOriginalBlockStorageVolume;

    /**
     * 블럭 스토리지 스냅샷 설명.
     */
    @JsonProperty(value = "blockStorageSnapshotDescription")
    private String blockStorageSnapshotDescription;

    /**
     * Get 블럭 스토리지 스냅샷 인스턴스 번호.
     *
     * @return the blockStorageSnapshotInstanceNo value
     */
    public String blockStorageSnapshotInstanceNo() {
        return this.blockStorageSnapshotInstanceNo;
    }

    /**
     * Set 블럭 스토리지 스냅샷 인스턴스 번호.
     *
     * @param blockStorageSnapshotInstanceNo the blockStorageSnapshotInstanceNo value to set
     * @return the BlockStorageSnapshotInstanceList object itself.
     */
    public BlockStorageSnapshotInstanceList withBlockStorageSnapshotInstanceNo(String blockStorageSnapshotInstanceNo) {
        this.blockStorageSnapshotInstanceNo = blockStorageSnapshotInstanceNo;
        return this;
    }

    /**
     * Get 블럭 스토리지 스냅샷 이름.
     *
     * @return the blockStorageSnapshotName value
     */
    public String blockStorageSnapshotName() {
        return this.blockStorageSnapshotName;
    }

    /**
     * Set 블럭 스토리지 스냅샷 이름.
     *
     * @param blockStorageSnapshotName the blockStorageSnapshotName value to set
     * @return the BlockStorageSnapshotInstanceList object itself.
     */
    public BlockStorageSnapshotInstanceList withBlockStorageSnapshotName(String blockStorageSnapshotName) {
        this.blockStorageSnapshotName = blockStorageSnapshotName;
        return this;
    }

    /**
     * Get 블럭 스토리지 스냅샷 볼륨 크기.
     *
     * @return the blockStorageSnapshotVolumeSize value
     */
    public Double blockStorageSnapshotVolumeSize() {
        return this.blockStorageSnapshotVolumeSize;
    }

    /**
     * Set 블럭 스토리지 스냅샷 볼륨 크기.
     *
     * @param blockStorageSnapshotVolumeSize the blockStorageSnapshotVolumeSize value to set
     * @return the BlockStorageSnapshotInstanceList object itself.
     */
    public BlockStorageSnapshotInstanceList withBlockStorageSnapshotVolumeSize(Double blockStorageSnapshotVolumeSize) {
        this.blockStorageSnapshotVolumeSize = blockStorageSnapshotVolumeSize;
        return this;
    }

    /**
     * Get 원본 블럭 스토리지 인스턴스 번호.
     *
     * @return the originalBlockStorageInstanceNo value
     */
    public String originalBlockStorageInstanceNo() {
        return this.originalBlockStorageInstanceNo;
    }

    /**
     * Set 원본 블럭 스토리지 인스턴스 번호.
     *
     * @param originalBlockStorageInstanceNo the originalBlockStorageInstanceNo value to set
     * @return the BlockStorageSnapshotInstanceList object itself.
     */
    public BlockStorageSnapshotInstanceList withOriginalBlockStorageInstanceNo(String originalBlockStorageInstanceNo) {
        this.originalBlockStorageInstanceNo = originalBlockStorageInstanceNo;
        return this;
    }

    /**
     * Get 블럭 스토리지 스냅샷 인스턴스 상태.
     *
     * @return the blockStorageSnapshotInstanceStatus value
     */
    public BlockStorageSnapshotInstanceStatus blockStorageSnapshotInstanceStatus() {
        return this.blockStorageSnapshotInstanceStatus;
    }

    /**
     * Set 블럭 스토리지 스냅샷 인스턴스 상태.
     *
     * @param blockStorageSnapshotInstanceStatus the blockStorageSnapshotInstanceStatus value to set
     * @return the BlockStorageSnapshotInstanceList object itself.
     */
    public BlockStorageSnapshotInstanceList withBlockStorageSnapshotInstanceStatus(BlockStorageSnapshotInstanceStatus blockStorageSnapshotInstanceStatus) {
        this.blockStorageSnapshotInstanceStatus = blockStorageSnapshotInstanceStatus;
        return this;
    }

    /**
     * Get 블럭 스토리지 스냅샷 인스턴스 운영.
     *
     * @return the blockStorageSnapshotInstanceOperation value
     */
    public BlockStorageSnapshotInstanceOperation blockStorageSnapshotInstanceOperation() {
        return this.blockStorageSnapshotInstanceOperation;
    }

    /**
     * Set 블럭 스토리지 스냅샷 인스턴스 운영.
     *
     * @param blockStorageSnapshotInstanceOperation the blockStorageSnapshotInstanceOperation value to set
     * @return the BlockStorageSnapshotInstanceList object itself.
     */
    public BlockStorageSnapshotInstanceList withBlockStorageSnapshotInstanceOperation(BlockStorageSnapshotInstanceOperation blockStorageSnapshotInstanceOperation) {
        this.blockStorageSnapshotInstanceOperation = blockStorageSnapshotInstanceOperation;
        return this;
    }

    /**
     * Get 블럭 스토리지 스냅샷 인스턴스 상태 이름.
     *
     * @return the blockStorageSnapshotInstanceStatusName value
     */
    public String blockStorageSnapshotInstanceStatusName() {
        return this.blockStorageSnapshotInstanceStatusName;
    }

    /**
     * Set 블럭 스토리지 스냅샷 인스턴스 상태 이름.
     *
     * @param blockStorageSnapshotInstanceStatusName the blockStorageSnapshotInstanceStatusName value to set
     * @return the BlockStorageSnapshotInstanceList object itself.
     */
    public BlockStorageSnapshotInstanceList withBlockStorageSnapshotInstanceStatusName(String blockStorageSnapshotInstanceStatusName) {
        this.blockStorageSnapshotInstanceStatusName = blockStorageSnapshotInstanceStatusName;
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
     * @return the BlockStorageSnapshotInstanceList object itself.
     */
    public BlockStorageSnapshotInstanceList withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Get 원본 블럭 스토리지 볼륨 암호화 여부.
     *
     * @return the isEncryptedOriginalBlockStorageVolume value
     */
    public Boolean isEncryptedOriginalBlockStorageVolume() {
        return this.isEncryptedOriginalBlockStorageVolume;
    }

    /**
     * Set 원본 블럭 스토리지 볼륨 암호화 여부.
     *
     * @param isEncryptedOriginalBlockStorageVolume the isEncryptedOriginalBlockStorageVolume value to set
     * @return the BlockStorageSnapshotInstanceList object itself.
     */
    public BlockStorageSnapshotInstanceList withIsEncryptedOriginalBlockStorageVolume(Boolean isEncryptedOriginalBlockStorageVolume) {
        this.isEncryptedOriginalBlockStorageVolume = isEncryptedOriginalBlockStorageVolume;
        return this;
    }

    /**
     * Get 블럭 스토리지 스냅샷 설명.
     *
     * @return the blockStorageSnapshotDescription value
     */
    public String blockStorageSnapshotDescription() {
        return this.blockStorageSnapshotDescription;
    }

    /**
     * Set 블럭 스토리지 스냅샷 설명.
     *
     * @param blockStorageSnapshotDescription the blockStorageSnapshotDescription value to set
     * @return the BlockStorageSnapshotInstanceList object itself.
     */
    public BlockStorageSnapshotInstanceList withBlockStorageSnapshotDescription(String blockStorageSnapshotDescription) {
        this.blockStorageSnapshotDescription = blockStorageSnapshotDescription;
        return this;
    }

}
