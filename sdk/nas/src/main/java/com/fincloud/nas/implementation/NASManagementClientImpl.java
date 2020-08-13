/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.nas.implementation;

import com.fincloud.nas.NASManagementClient;
import com.fincloud.nas.NAS;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the NASManagementClient class.
 */
public class NASManagementClientImpl extends ServiceClient implements NASManagementClient {

    /**
     * The NAS object to access its operations.
     */
    private NAS nAS;

    /**
     * Gets the NAS object to access its operations.
     * @return the NAS object.
     */
    public NAS nAS() {
        return this.nAS;
    }

    /**
     * Initializes an instance of NASManagementClient client.
     */
    public NASManagementClientImpl() {
        this("https://fin-ncloud.apigw.fin-ntruss.com");
    }

    /**
     * Initializes an instance of NASManagementClient client.
     *
     * @param baseUrl the base URL of the host
     */
    public NASManagementClientImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of NASManagementClient client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public NASManagementClientImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://fin-ncloud.apigw.fin-ntruss.com", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of NASManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public NASManagementClientImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of NASManagementClient client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public NASManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.nAS = new NASImpl(retrofit(), this);
    }
}
