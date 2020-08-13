/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server;

import com.microsoft.rest.RestClient;

/**
 * The interface for ServerManagementClient class.
 */
public interface ServerManagementClient {
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
     * Gets the ACGs object to access its operations.
     * @return the ACGs object.
     */
    ACGs aCGs();

    /**
     * Gets the ACGInbounds object to access its operations.
     * @return the ACGInbounds object.
     */
    ACGInbounds aCGInbounds();

    /**
     * Gets the ACGOutbounds object to access its operations.
     * @return the ACGOutbounds object.
     */
    ACGOutbounds aCGOutbounds();

    /**
     * Gets the Regions object to access its operations.
     * @return the Regions object.
     */
    Regions regions();

    /**
     * Gets the Zones object to access its operations.
     * @return the Zones object.
     */
    Zones zones();

    /**
     * Gets the ServerImageProducts object to access its operations.
     * @return the ServerImageProducts object.
     */
    ServerImageProducts serverImageProducts();

    /**
     * Gets the ServerProducts object to access its operations.
     * @return the ServerProducts object.
     */
    ServerProducts serverProducts();

    /**
     * Gets the InitScripts object to access its operations.
     * @return the InitScripts object.
     */
    InitScripts initScripts();

    /**
     * Gets the LoginKeys object to access its operations.
     * @return the LoginKeys object.
     */
    LoginKeys loginKeys();

    /**
     * Gets the NetworkInterfaces object to access its operations.
     * @return the NetworkInterfaces object.
     */
    NetworkInterfaces networkInterfaces();

    /**
     * Gets the PlacementGroups object to access its operations.
     * @return the PlacementGroups object.
     */
    PlacementGroups placementGroups();

    /**
     * Gets the PublicIps object to access its operations.
     * @return the PublicIps object.
     */
    PublicIps publicIps();

    /**
     * Gets the Servers object to access its operations.
     * @return the Servers object.
     */
    Servers servers();

    /**
     * Gets the RootPasswords object to access its operations.
     * @return the RootPasswords object.
     */
    RootPasswords rootPasswords();

    /**
     * Gets the ServerImages object to access its operations.
     * @return the ServerImages object.
     */
    ServerImages serverImages();

    /**
     * Gets the Snapshots object to access its operations.
     * @return the Snapshots object.
     */
    Snapshots snapshots();

    /**
     * Gets the BlockStorages object to access its operations.
     * @return the BlockStorages object.
     */
    BlockStorages blockStorages();

}
