/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MonitorGrpDto.
 * MonitorGrpDto.
 */
public class MonitorGroupParameter {
    /**
     * desc of the monitor group.
     */
    @JsonProperty(value = "groupDesc")
    private String groupDesc;

    /**
     * name of the monitor group.
     */
    @JsonProperty(value = "groupName")
    private String groupName;

    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * monitor group servers.
     */
    @JsonProperty(value = "monitorGroupItemList", required = true)
    private List<MonitorGroupItemParameter> monitorGroupItemList;

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
     * Get desc of the monitor group.
     *
     * @return the groupDesc value
     */
    public String groupDesc() {
        return this.groupDesc;
    }

    /**
     * Set desc of the monitor group.
     *
     * @param groupDesc the groupDesc value to set
     * @return the MonitorGroupParameter object itself.
     */
    public MonitorGroupParameter withGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }

    /**
     * Get name of the monitor group.
     *
     * @return the groupName value
     */
    public String groupName() {
        return this.groupName;
    }

    /**
     * Set name of the monitor group.
     *
     * @param groupName the groupName value to set
     * @return the MonitorGroupParameter object itself.
     */
    public MonitorGroupParameter withGroupName(String groupName) {
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
     * @return the MonitorGroupParameter object itself.
     */
    public MonitorGroupParameter withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get monitor group servers.
     *
     * @return the monitorGroupItemList value
     */
    public List<MonitorGroupItemParameter> monitorGroupItemList() {
        return this.monitorGroupItemList;
    }

    /**
     * Set monitor group servers.
     *
     * @param monitorGroupItemList the monitorGroupItemList value to set
     * @return the MonitorGroupParameter object itself.
     */
    public MonitorGroupParameter withMonitorGroupItemList(List<MonitorGroupItemParameter> monitorGroupItemList) {
        this.monitorGroupItemList = monitorGroupItemList;
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
     * @return the MonitorGroupParameter object itself.
     */
    public MonitorGroupParameter withProdKey(String prodKey) {
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
     * @return the MonitorGroupParameter object itself.
     */
    public MonitorGroupParameter withTemporaryGroup(Boolean temporaryGroup) {
        this.temporaryGroup = temporaryGroup;
        return this;
    }

}
