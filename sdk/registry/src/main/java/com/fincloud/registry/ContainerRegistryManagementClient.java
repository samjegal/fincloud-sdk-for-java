/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.registry;

import com.microsoft.rest.RestClient;

/**
 * The interface for ContainerRegistryManagementClient class.
 */
public interface ContainerRegistryManagementClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "https://ncr.apigw.fin-ntruss.com";

    /**
     * Gets the ContainerRegistrys object to access its operations.
     * @return the ContainerRegistrys object.
     */
    ContainerRegistrys containerRegistrys();

    /**
     * Gets the ContainerRegistryImages object to access its operations.
     * @return the ContainerRegistryImages object.
     */
    ContainerRegistryImages containerRegistryImages();

}
