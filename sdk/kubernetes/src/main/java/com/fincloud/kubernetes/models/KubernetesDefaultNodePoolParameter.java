/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KubernetesDefaultNodePoolParameter model.
 */
public class KubernetesDefaultNodePoolParameter {
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
     * @return the KubernetesDefaultNodePoolParameter object itself.
     */
    public KubernetesDefaultNodePoolParameter withNodeCount(double nodeCount) {
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
     * @return the KubernetesDefaultNodePoolParameter object itself.
     */
    public KubernetesDefaultNodePoolParameter withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

}
