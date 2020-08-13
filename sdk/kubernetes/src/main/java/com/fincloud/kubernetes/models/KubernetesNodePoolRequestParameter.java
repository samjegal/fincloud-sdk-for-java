/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KubernetesNodePoolRequestParameter model.
 */
public class KubernetesNodePoolRequestParameter {
    /**
     * 노드풀 이름.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * 등록 될 노드 개수.
     */
    @JsonProperty(value = "nodeCount", required = true)
    private double nodeCount;

    /**
     * 상품 코드.
     */
    @JsonProperty(value = "productCode", required = true)
    private String productCode;

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
     * @return the KubernetesNodePoolRequestParameter object itself.
     */
    public KubernetesNodePoolRequestParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get 등록 될 노드 개수.
     *
     * @return the nodeCount value
     */
    public double nodeCount() {
        return this.nodeCount;
    }

    /**
     * Set 등록 될 노드 개수.
     *
     * @param nodeCount the nodeCount value to set
     * @return the KubernetesNodePoolRequestParameter object itself.
     */
    public KubernetesNodePoolRequestParameter withNodeCount(double nodeCount) {
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
     * @return the KubernetesNodePoolRequestParameter object itself.
     */
    public KubernetesNodePoolRequestParameter withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

}
