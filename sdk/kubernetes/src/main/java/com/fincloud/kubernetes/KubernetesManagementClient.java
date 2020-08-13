/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes;

import com.microsoft.rest.RestClient;

/**
 * The interface for KubernetesManagementClient class.
 */
public interface KubernetesManagementClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "https://nks.apigw.fin-ntruss.com";

    /**
     * Gets the KubernetesClusters object to access its operations.
     * @return the KubernetesClusters object.
     */
    KubernetesClusters kubernetesClusters();

    /**
     * Gets the KubernetesWorkerNodes object to access its operations.
     * @return the KubernetesWorkerNodes object.
     */
    KubernetesWorkerNodes kubernetesWorkerNodes();

    /**
     * Gets the KubernetesNodePools object to access its operations.
     * @return the KubernetesNodePools object.
     */
    KubernetesNodePools kubernetesNodePools();

    /**
     * Gets the KubernetesConfigs object to access its operations.
     * @return the KubernetesConfigs object.
     */
    KubernetesConfigs kubernetesConfigs();

}
