/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kms.implementation;

import com.fincloud.kms.KmsManagementClient;
import com.fincloud.kms.KMS;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the KmsManagementClient class.
 */
public class KmsManagementClientImpl extends ServiceClient implements KmsManagementClient {

    /**
     * The KMS object to access its operations.
     */
    private KMS kMS;

    /**
     * Gets the KMS object to access its operations.
     * @return the KMS object.
     */
    public KMS kMS() {
        return this.kMS;
    }

    /**
     * Initializes an instance of KmsManagementClient client.
     */
    public KmsManagementClientImpl() {
        this("https://kms.apigw.ntruss.com");
    }

    /**
     * Initializes an instance of KmsManagementClient client.
     *
     * @param baseUrl the base URL of the host
     */
    public KmsManagementClientImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of KmsManagementClient client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public KmsManagementClientImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://kms.apigw.ntruss.com", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of KmsManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public KmsManagementClientImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of KmsManagementClient client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public KmsManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.kMS = new KMSImpl(retrofit(), this);
    }
}
