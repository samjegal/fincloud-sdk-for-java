/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.implementation;

import com.fincloud.wms.WebserviceMonitoringServiceManagementClient;
import com.fincloud.wms.WMS;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the WebserviceMonitoringServiceManagementClient class.
 */
public class WebserviceMonitoringServiceManagementClientImpl extends ServiceClient implements WebserviceMonitoringServiceManagementClient {

    /**
     * The WMS object to access its operations.
     */
    private WMS wMS;

    /**
     * Gets the WMS object to access its operations.
     * @return the WMS object.
     */
    public WMS wMS() {
        return this.wMS;
    }

    /**
     * Initializes an instance of WebserviceMonitoringServiceManagementClient client.
     */
    public WebserviceMonitoringServiceManagementClientImpl() {
        this("https://wms.apigw.ntruss.com");
    }

    /**
     * Initializes an instance of WebserviceMonitoringServiceManagementClient client.
     *
     * @param baseUrl the base URL of the host
     */
    public WebserviceMonitoringServiceManagementClientImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of WebserviceMonitoringServiceManagementClient client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public WebserviceMonitoringServiceManagementClientImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://wms.apigw.ntruss.com", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of WebserviceMonitoringServiceManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public WebserviceMonitoringServiceManagementClientImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of WebserviceMonitoringServiceManagementClient client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public WebserviceMonitoringServiceManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.wMS = new WMSImpl(retrofit(), this);
    }
}
