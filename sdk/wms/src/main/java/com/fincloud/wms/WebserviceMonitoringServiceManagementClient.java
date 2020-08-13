/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms;

import com.microsoft.rest.RestClient;

/**
 * The interface for WebserviceMonitoringServiceManagementClient class.
 */
public interface WebserviceMonitoringServiceManagementClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "https://wms.apigw.ntruss.com";

    /**
     * Gets the WMS object to access its operations.
     * @return the WMS object.
     */
    WMS wMS();

}
