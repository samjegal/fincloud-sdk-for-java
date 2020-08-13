/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KubernetesNodePoolResponseParameter model.
 */
public class KubernetesNodePoolResponseParameter {
    /**
     * 인스턴스 번호.
     */
    @JsonProperty(value = "instanceNo", required = true)
    private double instanceNo;

    /**
     * 기본 POOL 여부.
     */
    @JsonProperty(value = "isDefault", required = true)
    private boolean isDefault;

    /**
     * 노드풀 이름.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * 노드 개수.
     */
    @JsonProperty(value = "nodeCount", required = true)
    private double nodeCount;

    /**
     * 상품 코드.
     */
    @JsonProperty(value = "productCode", required = true)
    private String productCode;

    /**
     * 노드풀 상태.
     */
    @JsonProperty(value = "status", required = true)
    private String status;

    /**
     * 자동 확장설정.
     */
    @JsonProperty(value = "autoscale")
    private KubernetesAutoscaleOptionParameter autoscale;

    /**
     * Get 인스턴스 번호.
     *
     * @return the instanceNo value
     */
    public double instanceNo() {
        return this.instanceNo;
    }

    /**
     * Set 인스턴스 번호.
     *
     * @param instanceNo the instanceNo value to set
     * @return the KubernetesNodePoolResponseParameter object itself.
     */
    public KubernetesNodePoolResponseParameter withInstanceNo(double instanceNo) {
        this.instanceNo = instanceNo;
        return this;
    }

    /**
     * Get 기본 POOL 여부.
     *
     * @return the isDefault value
     */
    public boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set 기본 POOL 여부.
     *
     * @param isDefault the isDefault value to set
     * @return the KubernetesNodePoolResponseParameter object itself.
     */
    public KubernetesNodePoolResponseParameter withIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get 노드풀 이름.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set 노드풀 이름.
     *
     * @param name the name value to set
     * @return the KubernetesNodePoolResponseParameter object itself.
     */
    public KubernetesNodePoolResponseParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get 노드 개수.
     *
     * @return the nodeCount value
     */
    public double nodeCount() {
        return this.nodeCount;
    }

    /**
     * Set 노드 개수.
     *
     * @param nodeCount the nodeCount value to set
     * @return the KubernetesNodePoolResponseParameter object itself.
     */
    public KubernetesNodePoolResponseParameter withNodeCount(double nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * Get 상품 코드.
     *
     * @return the productCode value
     */
    public String productCode() {
        return this.productCode;
    }

    /**
     * Set 상품 코드.
     *
     * @param productCode the productCode value to set
     * @return the KubernetesNodePoolResponseParameter object itself.
     */
    public KubernetesNodePoolResponseParameter withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    /**
     * Get 노드풀 상태.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set 노드풀 상태.
     *
     * @param status the status value to set
     * @return the KubernetesNodePoolResponseParameter object itself.
     */
    public KubernetesNodePoolResponseParameter withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get 자동 확장설정.
     *
     * @return the autoscale value
     */
    public KubernetesAutoscaleOptionParameter autoscale() {
        return this.autoscale;
    }

    /**
     * Set 자동 확장설정.
     *
     * @param autoscale the autoscale value to set
     * @return the KubernetesNodePoolResponseParameter object itself.
     */
    public KubernetesNodePoolResponseParameter withAutoscale(KubernetesAutoscaleOptionParameter autoscale) {
        this.autoscale = autoscale;
        return this;
    }

}
