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
     * Gets the Charts object to access its operations.
     * @return the Charts object.
     */
    Charts charts();

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
     * Gets the Notifications object to access its operations.
     * @return the Notifications object.
     */
    Notifications notifications();

    /**
     * Gets the Metrics object to access its operations.
     * @return the Metrics object.
     */
    Metrics metrics();

    /**
     * Gets the RuleGroups object to access its operations.
     * @return the RuleGroups object.
     */
    RuleGroups ruleGroups();

    /**
     * Gets the MonitorGroups object to access its operations.
     * @return the MonitorGroups object.
     */
    MonitorGroups monitorGroups();

    /**
     * Gets the MetricGroups object to access its operations.
     * @return the MetricGroups object.
     */
    MetricGroups metricGroups();

    /**
     * Gets the Monitors object to access its operations.
     * @return the Monitors object.
     */
    Monitors monitors();

    /**
     * Gets the Schemas object to access its operations.
     * @return the Schemas object.
     */
    Schemas schemas();

    /**
     * Gets the Extendeds object to access its operations.
     * @return the Extendeds object.
     */
    Extendeds extendeds();

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
     * Gets the ProcessPlugins object to access its operations.
     * @return the ProcessPlugins object.
     */
    ProcessPlugins processPlugins();

    /**
     * Gets the PortPlugins object to access its operations.
     * @return the PortPlugins object.
     */
    PortPlugins portPlugins();

    /**
     * Gets the FilePlugins object to access its operations.
     * @return the FilePlugins object.
     */
    FilePlugins filePlugins();

}
