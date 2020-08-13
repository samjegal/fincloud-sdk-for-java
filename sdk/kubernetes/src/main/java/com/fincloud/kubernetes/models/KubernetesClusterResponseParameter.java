/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KubernetesClusterResponseParameter model.
 */
public class KubernetesClusterResponseParameter {
    /**
     * 클러스터.
     */
    @JsonProperty(value = "cluster", required = true)
    private KubernetesClusterParamter cluster;

    /**
     * Get 클러스터.
     *
     * @return the cluster value
     */
    public KubernetesClusterParamter cluster() {
        return this.cluster;
    }

    /**
     * Set 클러스터.
     *
     * @param cluster the cluster value to set
     * @return the KubernetesClusterResponseParameter object itself.
     */
    public KubernetesClusterResponseParameter withCluster(KubernetesClusterParamter cluster) {
        this.cluster = cluster;
        return this;
    }

}
