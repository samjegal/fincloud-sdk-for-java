/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KubernetesNodePoolUpdateParameter model.
 */
public class KubernetesNodePoolUpdateParameter {
    /**
     * 노드 개수.
     */
    @JsonProperty(value = "nodeCount", required = true)
    private double nodeCount;

    /**
     * 오토스케일.
     */
    @JsonProperty(value = "autoscale")
    private KubernetesAutoscalerUpdateParameter autoscale;

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
     * @return the KubernetesNodePoolUpdateParameter object itself.
     */
    public KubernetesNodePoolUpdateParameter withNodeCount(double nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * Get 오토스케일.
     *
     * @return the autoscale value
     */
    public KubernetesAutoscalerUpdateParameter autoscale() {
        return this.autoscale;
    }

    /**
     * Set 오토스케일.
     *
     * @param autoscale the autoscale value to set
     * @return the KubernetesNodePoolUpdateParameter object itself.
     */
    public KubernetesNodePoolUpdateParameter withAutoscale(KubernetesAutoscalerUpdateParameter autoscale) {
        this.autoscale = autoscale;
        return this;
    }

}
