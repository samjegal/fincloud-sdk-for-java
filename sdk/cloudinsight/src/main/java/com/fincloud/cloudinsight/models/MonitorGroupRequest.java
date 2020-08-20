/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MonitorGrpDto.
 * 감시 대상 그룹 생성/수정 시 필요.
 */
public class MonitorGroupRequest {
    /**
     * 감시 대상 그룹 설명.
     */
    @JsonProperty(value = "groupDesc")
    private String groupDesc;

    /**
     * 감시 대상 그룹 이름.
     */
    @JsonProperty(value = "groupName")
    private String groupName;

    /**
     * 감시 대상 그룹 Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * 감시 대상 지정.
     */
    @JsonProperty(value = "monitorGroupItemList", required = true)
    private List<MonitorGroupItemParameter> monitorGroupItemList;

    /**
     * 상품의 cw_key.
     */
    @JsonProperty(value = "prodKey", required = true)
    private String prodKey;

    /**
     * 감시 대상 그룹 생성 여부, false일 경우 감시 대상 그룹 생성 없이 Event Rule을 생성.
     */
    @JsonProperty(value = "isTemporaryGroup")
    private Boolean isTemporaryGroup;

    /**
     * Get 감시 대상 그룹 설명.
     *
     * @return the groupDesc value
     */
    public String groupDesc() {
        return this.groupDesc;
    }

    /**
     * Set 감시 대상 그룹 설명.
     *
     * @param groupDesc the groupDesc value to set
     * @return the MonitorGroupRequest object itself.
     */
    public MonitorGroupRequest withGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }

    /**
     * Get 감시 대상 그룹 이름.
     *
     * @return the groupName value
     */
    public String groupName() {
        return this.groupName;
    }

    /**
     * Set 감시 대상 그룹 이름.
     *
     * @param groupName the groupName value to set
     * @return the MonitorGroupRequest object itself.
     */
    public MonitorGroupRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Get 감시 대상 그룹 Id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set 감시 대상 그룹 Id.
     *
     * @param id the id value to set
     * @return the MonitorGroupRequest object itself.
     */
    public MonitorGroupRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get 감시 대상 지정.
     *
     * @return the monitorGroupItemList value
     */
    public List<MonitorGroupItemParameter> monitorGroupItemList() {
        return this.monitorGroupItemList;
    }

    /**
     * Set 감시 대상 지정.
     *
     * @param monitorGroupItemList the monitorGroupItemList value to set
     * @return the MonitorGroupRequest object itself.
     */
    public MonitorGroupRequest withMonitorGroupItemList(List<MonitorGroupItemParameter> monitorGroupItemList) {
        this.monitorGroupItemList = monitorGroupItemList;
        return this;
    }

    /**
     * Get 상품의 cw_key.
     *
     * @return the prodKey value
     */
    public String prodKey() {
        return this.prodKey;
    }

    /**
     * Set 상품의 cw_key.
     *
     * @param prodKey the prodKey value to set
     * @return the MonitorGroupRequest object itself.
     */
    public MonitorGroupRequest withProdKey(String prodKey) {
        this.prodKey = prodKey;
        return this;
    }

    /**
     * Get 감시 대상 그룹 생성 여부, false일 경우 감시 대상 그룹 생성 없이 Event Rule을 생성.
     *
     * @return the isTemporaryGroup value
     */
    public Boolean isTemporaryGroup() {
        return this.isTemporaryGroup;
    }

    /**
     * Set 감시 대상 그룹 생성 여부, false일 경우 감시 대상 그룹 생성 없이 Event Rule을 생성.
     *
     * @param isTemporaryGroup the isTemporaryGroup value to set
     * @return the MonitorGroupRequest object itself.
     */
    public MonitorGroupRequest withIsTemporaryGroup(Boolean isTemporaryGroup) {
        this.isTemporaryGroup = isTemporaryGroup;
        return this;
    }

}
