/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateOrUpdateMetricsGrpDto.
 * 감시 항목 그룹 생성/수정 시 필요.
 */
public class MetricsGroupRequest {
    /**
     * 감시 항목 그룹 설명.
     */
    @JsonProperty(value = "groupDesc", required = true)
    private String groupDesc;

    /**
     * 감시 항목 그룹 이름.
     */
    @JsonProperty(value = "groupName", required = true)
    private String groupName;

    /**
     * 감시 항목 그룹 id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * 감시 항목 지정.
     */
    @JsonProperty(value = "metricsGroupItems", required = true)
    private List<MetricsGroupItemParameter> metricsGroupItems;

    /**
     * 상품의 cw_key.
     */
    @JsonProperty(value = "prodKey", required = true)
    private String prodKey;

    /**
     * 감시 항목 그룹 생성 여부, false일 경우 감시 항목 그룹 생성 없이 Event Rule을 생성.
     */
    @JsonProperty(value = "temporaryGroup")
    private Boolean temporaryGroup;

    /**
     * Get 감시 항목 그룹 설명.
     *
     * @return the groupDesc value
     */
    public String groupDesc() {
        return this.groupDesc;
    }

    /**
     * Set 감시 항목 그룹 설명.
     *
     * @param groupDesc the groupDesc value to set
     * @return the MetricsGroupRequest object itself.
     */
    public MetricsGroupRequest withGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }

    /**
     * Get 감시 항목 그룹 이름.
     *
     * @return the groupName value
     */
    public String groupName() {
        return this.groupName;
    }

    /**
     * Set 감시 항목 그룹 이름.
     *
     * @param groupName the groupName value to set
     * @return the MetricsGroupRequest object itself.
     */
    public MetricsGroupRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Get 감시 항목 그룹 id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set 감시 항목 그룹 id.
     *
     * @param id the id value to set
     * @return the MetricsGroupRequest object itself.
     */
    public MetricsGroupRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get 감시 항목 지정.
     *
     * @return the metricsGroupItems value
     */
    public List<MetricsGroupItemParameter> metricsGroupItems() {
        return this.metricsGroupItems;
    }

    /**
     * Set 감시 항목 지정.
     *
     * @param metricsGroupItems the metricsGroupItems value to set
     * @return the MetricsGroupRequest object itself.
     */
    public MetricsGroupRequest withMetricsGroupItems(List<MetricsGroupItemParameter> metricsGroupItems) {
        this.metricsGroupItems = metricsGroupItems;
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
     * @return the MetricsGroupRequest object itself.
     */
    public MetricsGroupRequest withProdKey(String prodKey) {
        this.prodKey = prodKey;
        return this;
    }

    /**
     * Get 감시 항목 그룹 생성 여부, false일 경우 감시 항목 그룹 생성 없이 Event Rule을 생성.
     *
     * @return the temporaryGroup value
     */
    public Boolean temporaryGroup() {
        return this.temporaryGroup;
    }

    /**
     * Set 감시 항목 그룹 생성 여부, false일 경우 감시 항목 그룹 생성 없이 Event Rule을 생성.
     *
     * @param temporaryGroup the temporaryGroup value to set
     * @return the MetricsGroupRequest object itself.
     */
    public MetricsGroupRequest withTemporaryGroup(Boolean temporaryGroup) {
        this.temporaryGroup = temporaryGroup;
        return this;
    }

}
