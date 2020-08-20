/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MetricsGroupDto.
 * response for metrics group.
 */
public class MetricsGroupParameter {
    /**
     * The createTime property.
     */
    @JsonProperty(value = "createTime")
    private Long createTime;

    /**
     * The domainCode property.
     */
    @JsonProperty(value = "domainCode")
    private String domainCode;

    /**
     * The groupDesc property.
     */
    @JsonProperty(value = "groupDesc")
    private String groupDesc;

    /**
     * The groupName property.
     */
    @JsonProperty(value = "groupName")
    private String groupName;

    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The mbrNo property.
     */
    @JsonProperty(value = "mbrNo")
    private String mbrNo;

    /**
     * The metrics property.
     */
    @JsonProperty(value = "metrics")
    private List<MetricsGroupItemParameter> metrics;

    /**
     * The prodKey property.
     */
    @JsonProperty(value = "prodKey")
    private String prodKey;

    /**
     * The regionCode property.
     */
    @JsonProperty(value = "regionCode")
    private String regionCode;

    /**
     * The temporaryGroup property.
     */
    @JsonProperty(value = "temporaryGroup")
    private Boolean temporaryGroup;

    /**
     * The updateTime property.
     */
    @JsonProperty(value = "updateTime")
    private Long updateTime;

    /**
     * Get the createTime value.
     *
     * @return the createTime value
     */
    public Long createTime() {
        return this.createTime;
    }

    /**
     * Set the createTime value.
     *
     * @param createTime the createTime value to set
     * @return the MetricsGroupParameter object itself.
     */
    public MetricsGroupParameter withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get the domainCode value.
     *
     * @return the domainCode value
     */
    public String domainCode() {
        return this.domainCode;
    }

    /**
     * Set the domainCode value.
     *
     * @param domainCode the domainCode value to set
     * @return the MetricsGroupParameter object itself.
     */
    public MetricsGroupParameter withDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }

    /**
     * Get the groupDesc value.
     *
     * @return the groupDesc value
     */
    public String groupDesc() {
        return this.groupDesc;
    }

    /**
     * Set the groupDesc value.
     *
     * @param groupDesc the groupDesc value to set
     * @return the MetricsGroupParameter object itself.
     */
    public MetricsGroupParameter withGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }

    /**
     * Get the groupName value.
     *
     * @return the groupName value
     */
    public String groupName() {
        return this.groupName;
    }

    /**
     * Set the groupName value.
     *
     * @param groupName the groupName value to set
     * @return the MetricsGroupParameter object itself.
     */
    public MetricsGroupParameter withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the MetricsGroupParameter object itself.
     */
    public MetricsGroupParameter withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the mbrNo value.
     *
     * @return the mbrNo value
     */
    public String mbrNo() {
        return this.mbrNo;
    }

    /**
     * Set the mbrNo value.
     *
     * @param mbrNo the mbrNo value to set
     * @return the MetricsGroupParameter object itself.
     */
    public MetricsGroupParameter withMbrNo(String mbrNo) {
        this.mbrNo = mbrNo;
        return this;
    }

    /**
     * Get the metrics value.
     *
     * @return the metrics value
     */
    public List<MetricsGroupItemParameter> metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics value.
     *
     * @param metrics the metrics value to set
     * @return the MetricsGroupParameter object itself.
     */
    public MetricsGroupParameter withMetrics(List<MetricsGroupItemParameter> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get the prodKey value.
     *
     * @return the prodKey value
     */
    public String prodKey() {
        return this.prodKey;
    }

    /**
     * Set the prodKey value.
     *
     * @param prodKey the prodKey value to set
     * @return the MetricsGroupParameter object itself.
     */
    public MetricsGroupParameter withProdKey(String prodKey) {
        this.prodKey = prodKey;
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
     * @return the MetricsGroupParameter object itself.
     */
    public MetricsGroupParameter withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * Get the temporaryGroup value.
     *
     * @return the temporaryGroup value
     */
    public Boolean temporaryGroup() {
        return this.temporaryGroup;
    }

    /**
     * Set the temporaryGroup value.
     *
     * @param temporaryGroup the temporaryGroup value to set
     * @return the MetricsGroupParameter object itself.
     */
    public MetricsGroupParameter withTemporaryGroup(Boolean temporaryGroup) {
        this.temporaryGroup = temporaryGroup;
        return this;
    }

    /**
     * Get the updateTime value.
     *
     * @return the updateTime value
     */
    public Long updateTime() {
        return this.updateTime;
    }

    /**
     * Set the updateTime value.
     *
     * @param updateTime the updateTime value to set
     * @return the MetricsGroupParameter object itself.
     */
    public MetricsGroupParameter withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

}
