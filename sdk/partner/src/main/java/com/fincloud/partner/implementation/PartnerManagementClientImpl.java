/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.partner.implementation;

import com.fincloud.partner.PartnerManagementClient;
import com.fincloud.partner.Partners;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the PartnerManagementClient class.
 */
public class PartnerManagementClientImpl extends ServiceClient implements PartnerManagementClient {

    /**
     * The Partners object to access its operations.
     */
    private Partners partners;

    /**
     * Gets the Partners object to access its operations.
     * @return the Partners object.
     */
    public Partners partners() {
        return this.partners;
    }

    /**
     * Initializes an instance of PartnerManagementClient client.
     */
    public PartnerManagementClientImpl() {
        this("https://fin-ncloud.apigw.fin-ntruss.com/billing/v2");
    }

    /**
     * Initializes an instance of PartnerManagementClient client.
     *
     * @param baseUrl the base URL of the host
     */
    public PartnerManagementClientImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of PartnerManagementClient client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public PartnerManagementClientImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://fin-ncloud.apigw.fin-ntruss.com/billing/v2", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of PartnerManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public PartnerManagementClientImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of PartnerManagementClient client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public PartnerManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.partners = new PartnersImpl(retrofit(), this);
    }
}
