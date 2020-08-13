/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.geolocation.implementation;

import com.fincloud.geolocation.GeoLocationManagementClient;
import com.fincloud.geolocation.GeoLocations;
import com.fincloud.geolocation.GeoLocationQuotas;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the GeoLocationManagementClient class.
 */
public class GeoLocationManagementClientImpl extends ServiceClient implements GeoLocationManagementClient {

    /**
     * The GeoLocations object to access its operations.
     */
    private GeoLocations geoLocations;

    /**
     * Gets the GeoLocations object to access its operations.
     * @return the GeoLocations object.
     */
    public GeoLocations geoLocations() {
        return this.geoLocations;
    }

    /**
     * The GeoLocationQuotas object to access its operations.
     */
    private GeoLocationQuotas geoLocationQuotas;

    /**
     * Gets the GeoLocationQuotas object to access its operations.
     * @return the GeoLocationQuotas object.
     */
    public GeoLocationQuotas geoLocationQuotas() {
        return this.geoLocationQuotas;
    }

    /**
     * Initializes an instance of GeoLocationManagementClient client.
     */
    public GeoLocationManagementClientImpl() {
        this("https://geolocation.apigw.fin-ntruss.com");
    }

    /**
     * Initializes an instance of GeoLocationManagementClient client.
     *
     * @param baseUrl the base URL of the host
     */
    public GeoLocationManagementClientImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of GeoLocationManagementClient client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public GeoLocationManagementClientImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://geolocation.apigw.fin-ntruss.com", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of GeoLocationManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public GeoLocationManagementClientImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of GeoLocationManagementClient client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public GeoLocationManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.geoLocations = new GeoLocationsImpl(retrofit(), this);
        this.geoLocationQuotas = new GeoLocationQuotasImpl(retrofit(), this);
    }
}
