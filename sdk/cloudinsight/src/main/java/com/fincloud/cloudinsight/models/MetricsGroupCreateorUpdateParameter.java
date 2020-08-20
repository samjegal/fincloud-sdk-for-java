/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateOrUpdateMetricsGrpDto.
 * create or update metrics group request.
 */
public class MetricsGroupCreateorUpdateParameter {
    /**
     * desc of the metric group.
     */
    @JsonProperty(value = "groupDesc")
    private String groupDesc;

    /**
     * name of the metric group.
     */
    @JsonProperty(value = "groupName")
    private String groupName;

    /**
     * id of metrics group, empty when create, but not in update.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * metrics group List.
     */
    @JsonProperty(value = "metricsGroupItems", required = true)
    private List<MetricsGroupItemParameter> metricsGroupItems;

    /**
     * product key.
     */
    @JsonProperty(value = "prodKey", required = true)
    private String prodKey;

    /**
     * The temporaryGroup property.
     */
    @JsonProperty(value = "temporaryGroup")
    private Boolean temporaryGroup;

    /**
     * Get desc of the metric group.
     *
     * @return the groupDesc value
     */
    public String groupDesc() {
        return this.groupDesc;
    }

    /**
     * Set desc of the metric group.
     *
     * @param groupDesc the groupDesc value to set
     * @return the MetricsGroupCreateorUpdateParameter object itself.
     */
    public MetricsGroupCreateorUpdateParameter withGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }

    /**
     * Get name of the metric group.
     *
     * @return the groupName value
     */
    public String groupName() {
        return this.groupName;
    }

    /**
     * Set name of the metric group.
     *
     * @param groupName the groupName value to set
     * @return the MetricsGroupCreateorUpdateParameter object itself.
     */
    public MetricsGroupCreateorUpdateParameter withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Get id of metrics group, empty when create, but not in update.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set id of metrics group, empty when create, but not in update.
     *
     * @param id the id value to set
     * @return the MetricsGroupCreateorUpdateParameter object itself.
     */
    public MetricsGroupCreateorUpdateParameter withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get metrics group List.
     *
     * @return the metricsGroupItems value
     */
    public List<MetricsGroupItemParameter> metricsGroupItems() {
        return this.metricsGroupItems;
    }

    /**
     * Set metrics group List.
     *
     * @param metricsGroupItems the metricsGroupItems value to set
     * @return the MetricsGroupCreateorUpdateParameter object itself.
     */
    public MetricsGroupCreateorUpdateParameter withMetricsGroupItems(List<MetricsGroupItemParameter> metricsGroupItems) {
        this.metricsGroupItems = metricsGroupItems;
        return this;
    }

    /**
     * Get product key.
     *
     * @return the prodKey value
     */
    public String prodKey() {
        return this.prodKey;
    }

    /**
     * Set product key.
     *
     * @param prodKey the prodKey value to set
     * @return the MetricsGroupCreateorUpdateParameter object itself.
     */
    public MetricsGroupCreateorUpdateParameter withProdKey(String prodKey) {
        this.prodKey = prodKey;
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
     * @return the MetricsGroupCreateorUpdateParameter object itself.
     */
    public MetricsGroupCreateorUpdateParameter withTemporaryGroup(Boolean temporaryGroup) {
        this.temporaryGroup = temporaryGroup;
        return this;
    }

}
