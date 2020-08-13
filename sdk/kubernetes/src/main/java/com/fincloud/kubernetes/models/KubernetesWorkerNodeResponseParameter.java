/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KubernetesWorkerNodeResponseParameter model.
 */
public class KubernetesWorkerNodeResponseParameter {
    /**
     * 워커노드 목록.
     */
    @JsonProperty(value = "nodes", required = true)
    private List<KubernetesWorkerNodeParameter> nodes;

    /**
     * Get 워커노드 목록.
     *
     * @return the nodes value
     */
    public List<KubernetesWorkerNodeParameter> nodes() {
        return this.nodes;
    }

    /**
     * Set 워커노드 목록.
     *
     * @param nodes the nodes value to set
     * @return the KubernetesWorkerNodeResponseParameter object itself.
     */
    public KubernetesWorkerNodeResponseParameter withNodes(List<KubernetesWorkerNodeParameter> nodes) {
        this.nodes = nodes;
        return this;
    }

}
