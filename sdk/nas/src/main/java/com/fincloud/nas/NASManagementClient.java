/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.nas;

import com.microsoft.rest.RestClient;

/**
 * The interface for NASManagementClient class.
 */
public interface NASManagementClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "https://fin-ncloud.apigw.fin-ntruss.com";

    /**
     * Gets the NAS object to access its operations.
     * @return the NAS object.
     */
    NAS nAS();

}
