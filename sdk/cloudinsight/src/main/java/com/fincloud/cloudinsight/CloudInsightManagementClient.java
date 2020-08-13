/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.microsoft.rest.RestClient;

/**
 * The interface for CloudInsightManagementClient class.
 */
public interface CloudInsightManagementClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "https://cw.apigw.fin-ntruss.com";

    /**
     * Gets the Datas object to access its operations.
     * @return the Datas object.
     */
    Datas datas();

    /**
     * Gets the Events object to access its operations.
     * @return the Events object.
     */
    Events events();

    /**
     * Gets the Rules object to access its operations.
     * @return the Rules object.
     */
    Rules rules();

    /**
     * Gets the Schemas object to access its operations.
     * @return the Schemas object.
     */
    Schemas schemas();

    /**
     * Gets the Servers object to access its operations.
     * @return the Servers object.
     */
    Servers servers();

    /**
     * Gets the Collectors object to access its operations.
     * @return the Collectors object.
     */
    Collectors collectors();

    /**
     * Gets the PluginProcess object to access its operations.
     * @return the PluginProcess object.
     */
    PluginProcess pluginProcess();

    /**
     * Gets the PortPlugins object to access its operations.
     * @return the PortPlugins object.
     */
    PortPlugins portPlugins();

}
