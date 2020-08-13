/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.implementation;

import com.fincloud.kubernetes.KubernetesManagementClient;
import com.fincloud.kubernetes.KubernetesClusters;
import com.fincloud.kubernetes.KubernetesWorkerNodes;
import com.fincloud.kubernetes.KubernetesNodePools;
import com.fincloud.kubernetes.KubernetesConfigs;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the KubernetesManagementClient class.
 */
public class KubernetesManagementClientImpl extends ServiceClient implements KubernetesManagementClient {

    /**
     * The KubernetesClusters object to access its operations.
     */
    private KubernetesClusters kubernetesClusters;

    /**
     * Gets the KubernetesClusters object to access its operations.
     * @return the KubernetesClusters object.
     */
    public KubernetesClusters kubernetesClusters() {
        return this.kubernetesClusters;
    }

    /**
     * The KubernetesWorkerNodes object to access its operations.
     */
    private KubernetesWorkerNodes kubernetesWorkerNodes;

    /**
     * Gets the KubernetesWorkerNodes object to access its operations.
     * @return the KubernetesWorkerNodes object.
     */
    public KubernetesWorkerNodes kubernetesWorkerNodes() {
        return this.kubernetesWorkerNodes;
    }

    /**
     * The KubernetesNodePools object to access its operations.
     */
    private KubernetesNodePools kubernetesNodePools;

    /**
     * Gets the KubernetesNodePools object to access its operations.
     * @return the KubernetesNodePools object.
     */
    public KubernetesNodePools kubernetesNodePools() {
        return this.kubernetesNodePools;
    }

    /**
     * The KubernetesConfigs object to access its operations.
     */
    private KubernetesConfigs kubernetesConfigs;

    /**
     * Gets the KubernetesConfigs object to access its operations.
     * @return the KubernetesConfigs object.
     */
    public KubernetesConfigs kubernetesConfigs() {
        return this.kubernetesConfigs;
    }

    /**
     * Initializes an instance of KubernetesManagementClient client.
     */
    public KubernetesManagementClientImpl() {
        this("https://nks.apigw.fin-ntruss.com/nks/v2");
    }

    /**
     * Initializes an instance of KubernetesManagementClient client.
     *
     * @param baseUrl the base URL of the host
     */
    public KubernetesManagementClientImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of KubernetesManagementClient client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public KubernetesManagementClientImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://nks.apigw.fin-ntruss.com/nks/v2", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of KubernetesManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public KubernetesManagementClientImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of KubernetesManagementClient client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public KubernetesManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.kubernetesClusters = new KubernetesClustersImpl(retrofit(), this);
        this.kubernetesWorkerNodes = new KubernetesWorkerNodesImpl(retrofit(), this);
        this.kubernetesNodePools = new KubernetesNodePoolsImpl(retrofit(), this);
        this.kubernetesConfigs = new KubernetesConfigsImpl(retrofit(), this);
    }
}
