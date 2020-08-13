/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.registry.implementation;

import com.fincloud.registry.ContainerRegistryManagementClient;
import com.fincloud.registry.ContainerRegistrys;
import com.fincloud.registry.ContainerRegistryImages;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the ContainerRegistryManagementClient class.
 */
public class ContainerRegistryManagementClientImpl extends ServiceClient implements ContainerRegistryManagementClient {

    /**
     * The ContainerRegistrys object to access its operations.
     */
    private ContainerRegistrys containerRegistrys;

    /**
     * Gets the ContainerRegistrys object to access its operations.
     * @return the ContainerRegistrys object.
     */
    public ContainerRegistrys containerRegistrys() {
        return this.containerRegistrys;
    }

    /**
     * The ContainerRegistryImages object to access its operations.
     */
    private ContainerRegistryImages containerRegistryImages;

    /**
     * Gets the ContainerRegistryImages object to access its operations.
     * @return the ContainerRegistryImages object.
     */
    public ContainerRegistryImages containerRegistryImages() {
        return this.containerRegistryImages;
    }

    /**
     * Initializes an instance of ContainerRegistryManagementClient client.
     */
    public ContainerRegistryManagementClientImpl() {
        this("https://ncr.apigw.fin-ntruss.com");
    }

    /**
     * Initializes an instance of ContainerRegistryManagementClient client.
     *
     * @param baseUrl the base URL of the host
     */
    public ContainerRegistryManagementClientImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of ContainerRegistryManagementClient client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public ContainerRegistryManagementClientImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://ncr.apigw.fin-ntruss.com", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of ContainerRegistryManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public ContainerRegistryManagementClientImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of ContainerRegistryManagementClient client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public ContainerRegistryManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.containerRegistrys = new ContainerRegistrysImpl(retrofit(), this);
        this.containerRegistryImages = new ContainerRegistryImagesImpl(retrofit(), this);
    }
}
