/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KubernetesClustersListParameter model.
 */
public class KubernetesClustersListParameter {
    /**
     * 클러스터 목록.
     */
    @JsonProperty(value = "clusters", required = true)
    private List<KubernetesClusterParamter> clusters;

    /**
     * Get 클러스터 목록.
     *
     * @return the clusters value
     */
    public List<KubernetesClusterParamter> clusters() {
        return this.clusters;
    }

    /**
     * Set 클러스터 목록.
     *
     * @param clusters the clusters value to set
     * @return the KubernetesClustersListParameter object itself.
     */
    public KubernetesClustersListParameter withClusters(List<KubernetesClusterParamter> clusters) {
        this.clusters = clusters;
        return this;
    }

}
