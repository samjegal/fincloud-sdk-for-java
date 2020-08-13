/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.partner;

import com.microsoft.rest.RestClient;

/**
 * The interface for PartnerManagementClient class.
 */
public interface PartnerManagementClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "https://fin-ncloud.apigw.fin-ntruss.com/billing/v2";

    /**
     * Gets the Partners object to access its operations.
     * @return the Partners object.
     */
    Partners partners();

}
