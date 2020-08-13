/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.nas.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The NasVolumeInstanceList model.
 */
public class NasVolumeInstanceList {
    /**
     * The nasVolumeInstanceNo property.
     */
    @JsonProperty(value = "nasVolumeInstanceNo")
    private String nasVolumeInstanceNo;

    /**
     * The nasVolumeInstanceStatus property.
     */
    @JsonProperty(value = "nasVolumeInstanceStatus")
    private NasVolumeInstanceStatus nasVolumeInstanceStatus;

    /**
     * The nasVolumeInstanceOperation property.
     */
    @JsonProperty(value = "nasVolumeInstanceOperation")
    private NasVolumeInstanceOperation nasVolumeInstanceOperation;

    /**
     * The nasVolumeInstanceStatusName property.
     */
    @JsonProperty(value = "nasVolumeInstanceStatusName")
    private String nasVolumeInstanceStatusName;

    /**
     * The createDate property.
     */
    @JsonProperty(value = "createDate")
    private String createDate;

    /**
     * The nasVolumeDescription property.
     */
    @JsonProperty(value = "nasVolumeDescription")
    private String nasVolumeDescription;

    /**
     * The mountInformation property.
     */
    @JsonProperty(value = "mountInformation")
    private String mountInformation;

    /**
     * The volumeAllotmentProtocolType property.
     */
    @JsonProperty(value = "volumeAllotmentProtocolType")
    private VolumeAllotmentProtocolType volumeAllotmentProtocolType;

    /**
     * The volumeName property.
     */
    @JsonProperty(value = "volumeName")
    private String volumeName;

    /**
     * The volumeTotalSize property.
     */
    @JsonProperty(value = "volumeTotalSize")
    private Double volumeTotalSize;

    /**
     * The volumeSize property.
     */
    @JsonProperty(value = "volumeSize")
    private Double volumeSize;

    /**
     * The volumeUseSize property.
     */
    @JsonProperty(value = "volumeUseSize")
    private Double volumeUseSize;

    /**
     * The volumeUseRatio property.
     */
    @JsonProperty(value = "volumeUseRatio")
    private Double volumeUseRatio;

    /**
     * The snapshotVolumeConfigurationRatio property.
     */
    @JsonProperty(value = "snapshotVolumeConfigurationRatio")
    private Double snapshotVolumeConfigurationRatio;

    /**
     * The snapshotVolumeSize property.
     */
    @JsonProperty(value = "snapshotVolumeSize")
    private Double snapshotVolumeSize;

    /**
     * The snapshotVolumeUseSize property.
     */
    @JsonProperty(value = "snapshotVolumeUseSize")
    private Double snapshotVolumeUseSize;

    /**
     * The snapshotVolumeUseRatio property.
     */
    @JsonProperty(value = "snapshotVolumeUseRatio")
    private Double snapshotVolumeUseRatio;

    /**
     * The isSnapshotConfiguration property.
     */
    @JsonProperty(value = "isSnapshotConfiguration")
    private Boolean isSnapshotConfiguration;

    /**
     * The isEventConfiguration property.
     */
    @JsonProperty(value = "isEventConfiguration")
    private Boolean isEventConfiguration;

    /**
     * The regionCode property.
     */
    @JsonProperty(value = "regionCode")
    private String regionCode;

    /**
     * The zoneCode property.
     */
    @JsonProperty(value = "zoneCode")
    private String zoneCode;

    /**
     * The nasVolumeServerInstanceNoList property.
     */
    @JsonProperty(value = "nasVolumeServerInstanceNoList")
    private NasVolumeServerInstanceNoList nasVolumeServerInstanceNoList;

    /**
     * The isEncryptedVolume property.
     */
    @JsonProperty(value = "isEncryptedVolume")
    private Boolean isEncryptedVolume;

    /**
     * Get the nasVolumeInstanceNo value.
     *
     * @return the nasVolumeInstanceNo value
     */
    public String nasVolumeInstanceNo() {
        return this.nasVolumeInstanceNo;
    }

    /**
     * Set the nasVolumeInstanceNo value.
     *
     * @param nasVolumeInstanceNo the nasVolumeInstanceNo value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withNasVolumeInstanceNo(String nasVolumeInstanceNo) {
        this.nasVolumeInstanceNo = nasVolumeInstanceNo;
        return this;
    }

    /**
     * Get the nasVolumeInstanceStatus value.
     *
     * @return the nasVolumeInstanceStatus value
     */
    public NasVolumeInstanceStatus nasVolumeInstanceStatus() {
        return this.nasVolumeInstanceStatus;
    }

    /**
     * Set the nasVolumeInstanceStatus value.
     *
     * @param nasVolumeInstanceStatus the nasVolumeInstanceStatus value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withNasVolumeInstanceStatus(NasVolumeInstanceStatus nasVolumeInstanceStatus) {
        this.nasVolumeInstanceStatus = nasVolumeInstanceStatus;
        return this;
    }

    /**
     * Get the nasVolumeInstanceOperation value.
     *
     * @return the nasVolumeInstanceOperation value
     */
    public NasVolumeInstanceOperation nasVolumeInstanceOperation() {
        return this.nasVolumeInstanceOperation;
    }

    /**
     * Set the nasVolumeInstanceOperation value.
     *
     * @param nasVolumeInstanceOperation the nasVolumeInstanceOperation value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withNasVolumeInstanceOperation(NasVolumeInstanceOperation nasVolumeInstanceOperation) {
        this.nasVolumeInstanceOperation = nasVolumeInstanceOperation;
        return this;
    }

    /**
     * Get the nasVolumeInstanceStatusName value.
     *
     * @return the nasVolumeInstanceStatusName value
     */
    public String nasVolumeInstanceStatusName() {
        return this.nasVolumeInstanceStatusName;
    }

    /**
     * Set the nasVolumeInstanceStatusName value.
     *
     * @param nasVolumeInstanceStatusName the nasVolumeInstanceStatusName value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withNasVolumeInstanceStatusName(String nasVolumeInstanceStatusName) {
        this.nasVolumeInstanceStatusName = nasVolumeInstanceStatusName;
        return this;
    }

    /**
     * Get the createDate value.
     *
     * @return the createDate value
     */
    public String createDate() {
        return this.createDate;
    }

    /**
     * Set the createDate value.
     *
     * @param createDate the createDate value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Get the nasVolumeDescription value.
     *
     * @return the nasVolumeDescription value
     */
    public String nasVolumeDescription() {
        return this.nasVolumeDescription;
    }

    /**
     * Set the nasVolumeDescription value.
     *
     * @param nasVolumeDescription the nasVolumeDescription value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withNasVolumeDescription(String nasVolumeDescription) {
        this.nasVolumeDescription = nasVolumeDescription;
        return this;
    }

    /**
     * Get the mountInformation value.
     *
     * @return the mountInformation value
     */
    public String mountInformation() {
        return this.mountInformation;
    }

    /**
     * Set the mountInformation value.
     *
     * @param mountInformation the mountInformation value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withMountInformation(String mountInformation) {
        this.mountInformation = mountInformation;
        return this;
    }

    /**
     * Get the volumeAllotmentProtocolType value.
     *
     * @return the volumeAllotmentProtocolType value
     */
    public VolumeAllotmentProtocolType volumeAllotmentProtocolType() {
        return this.volumeAllotmentProtocolType;
    }

    /**
     * Set the volumeAllotmentProtocolType value.
     *
     * @param volumeAllotmentProtocolType the volumeAllotmentProtocolType value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withVolumeAllotmentProtocolType(VolumeAllotmentProtocolType volumeAllotmentProtocolType) {
        this.volumeAllotmentProtocolType = volumeAllotmentProtocolType;
        return this;
    }

    /**
     * Get the volumeName value.
     *
     * @return the volumeName value
     */
    public String volumeName() {
        return this.volumeName;
    }

    /**
     * Set the volumeName value.
     *
     * @param volumeName the volumeName value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

    /**
     * Get the volumeTotalSize value.
     *
     * @return the volumeTotalSize value
     */
    public Double volumeTotalSize() {
        return this.volumeTotalSize;
    }

    /**
     * Set the volumeTotalSize value.
     *
     * @param volumeTotalSize the volumeTotalSize value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withVolumeTotalSize(Double volumeTotalSize) {
        this.volumeTotalSize = volumeTotalSize;
        return this;
    }

    /**
     * Get the volumeSize value.
     *
     * @return the volumeSize value
     */
    public Double volumeSize() {
        return this.volumeSize;
    }

    /**
     * Set the volumeSize value.
     *
     * @param volumeSize the volumeSize value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withVolumeSize(Double volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * Get the volumeUseSize value.
     *
     * @return the volumeUseSize value
     */
    public Double volumeUseSize() {
        return this.volumeUseSize;
    }

    /**
     * Set the volumeUseSize value.
     *
     * @param volumeUseSize the volumeUseSize value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withVolumeUseSize(Double volumeUseSize) {
        this.volumeUseSize = volumeUseSize;
        return this;
    }

    /**
     * Get the volumeUseRatio value.
     *
     * @return the volumeUseRatio value
     */
    public Double volumeUseRatio() {
        return this.volumeUseRatio;
    }

    /**
     * Set the volumeUseRatio value.
     *
     * @param volumeUseRatio the volumeUseRatio value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withVolumeUseRatio(Double volumeUseRatio) {
        this.volumeUseRatio = volumeUseRatio;
        return this;
    }

    /**
     * Get the snapshotVolumeConfigurationRatio value.
     *
     * @return the snapshotVolumeConfigurationRatio value
     */
    public Double snapshotVolumeConfigurationRatio() {
        return this.snapshotVolumeConfigurationRatio;
    }

    /**
     * Set the snapshotVolumeConfigurationRatio value.
     *
     * @param snapshotVolumeConfigurationRatio the snapshotVolumeConfigurationRatio value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withSnapshotVolumeConfigurationRatio(Double snapshotVolumeConfigurationRatio) {
        this.snapshotVolumeConfigurationRatio = snapshotVolumeConfigurationRatio;
        return this;
    }

    /**
     * Get the snapshotVolumeSize value.
     *
     * @return the snapshotVolumeSize value
     */
    public Double snapshotVolumeSize() {
        return this.snapshotVolumeSize;
    }

    /**
     * Set the snapshotVolumeSize value.
     *
     * @param snapshotVolumeSize the snapshotVolumeSize value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withSnapshotVolumeSize(Double snapshotVolumeSize) {
        this.snapshotVolumeSize = snapshotVolumeSize;
        return this;
    }

    /**
     * Get the snapshotVolumeUseSize value.
     *
     * @return the snapshotVolumeUseSize value
     */
    public Double snapshotVolumeUseSize() {
        return this.snapshotVolumeUseSize;
    }

    /**
     * Set the snapshotVolumeUseSize value.
     *
     * @param snapshotVolumeUseSize the snapshotVolumeUseSize value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withSnapshotVolumeUseSize(Double snapshotVolumeUseSize) {
        this.snapshotVolumeUseSize = snapshotVolumeUseSize;
        return this;
    }

    /**
     * Get the snapshotVolumeUseRatio value.
     *
     * @return the snapshotVolumeUseRatio value
     */
    public Double snapshotVolumeUseRatio() {
        return this.snapshotVolumeUseRatio;
    }

    /**
     * Set the snapshotVolumeUseRatio value.
     *
     * @param snapshotVolumeUseRatio the snapshotVolumeUseRatio value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withSnapshotVolumeUseRatio(Double snapshotVolumeUseRatio) {
        this.snapshotVolumeUseRatio = snapshotVolumeUseRatio;
        return this;
    }

    /**
     * Get the isSnapshotConfiguration value.
     *
     * @return the isSnapshotConfiguration value
     */
    public Boolean isSnapshotConfiguration() {
        return this.isSnapshotConfiguration;
    }

    /**
     * Set the isSnapshotConfiguration value.
     *
     * @param isSnapshotConfiguration the isSnapshotConfiguration value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withIsSnapshotConfiguration(Boolean isSnapshotConfiguration) {
        this.isSnapshotConfiguration = isSnapshotConfiguration;
        return this;
    }

    /**
     * Get the isEventConfiguration value.
     *
     * @return the isEventConfiguration value
     */
    public Boolean isEventConfiguration() {
        return this.isEventConfiguration;
    }

    /**
     * Set the isEventConfiguration value.
     *
     * @param isEventConfiguration the isEventConfiguration value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withIsEventConfiguration(Boolean isEventConfiguration) {
        this.isEventConfiguration = isEventConfiguration;
        return this;
    }

    /**
     * Get the regionCode value.
     *
     * @return the regionCode value
     */
    public String regionCode() {
        return this.regionCode;
    }

    /**
     * Set the regionCode value.
     *
     * @param regionCode the regionCode value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * Get the zoneCode value.
     *
     * @return the zoneCode value
     */
    public String zoneCode() {
        return this.zoneCode;
    }

    /**
     * Set the zoneCode value.
     *
     * @param zoneCode the zoneCode value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
        return this;
    }

    /**
     * Get the nasVolumeServerInstanceNoList value.
     *
     * @return the nasVolumeServerInstanceNoList value
     */
    public NasVolumeServerInstanceNoList nasVolumeServerInstanceNoList() {
        return this.nasVolumeServerInstanceNoList;
    }

    /**
     * Set the nasVolumeServerInstanceNoList value.
     *
     * @param nasVolumeServerInstanceNoList the nasVolumeServerInstanceNoList value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withNasVolumeServerInstanceNoList(NasVolumeServerInstanceNoList nasVolumeServerInstanceNoList) {
        this.nasVolumeServerInstanceNoList = nasVolumeServerInstanceNoList;
        return this;
    }

    /**
     * Get the isEncryptedVolume value.
     *
     * @return the isEncryptedVolume value
     */
    public Boolean isEncryptedVolume() {
        return this.isEncryptedVolume;
    }

    /**
     * Set the isEncryptedVolume value.
     *
     * @param isEncryptedVolume the isEncryptedVolume value to set
     * @return the NasVolumeInstanceList object itself.
     */
    public NasVolumeInstanceList withIsEncryptedVolume(Boolean isEncryptedVolume) {
        this.isEncryptedVolume = isEncryptedVolume;
        return this;
    }

}
