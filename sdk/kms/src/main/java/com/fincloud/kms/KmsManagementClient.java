/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kms;

import com.microsoft.rest.RestClient;

/**
 * The interface for KmsManagementClient class.
 */
public interface KmsManagementClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "https://kms.apigw.ntruss.com/key/v1";

    /**
     * Gets the KMS object to access its operations.
     * @return the KMS object.
     */
    KMS kMS();

}
