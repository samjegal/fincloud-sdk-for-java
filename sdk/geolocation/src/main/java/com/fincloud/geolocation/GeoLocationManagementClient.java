/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.geolocation;

import com.microsoft.rest.RestClient;

/**
 * The interface for GeoLocationManagementClient class.
 */
public interface GeoLocationManagementClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "https://geolocation.apigw.fin-ntruss.com";

    /**
     * Gets the GeoLocations object to access its operations.
     * @return the GeoLocations object.
     */
    GeoLocations geoLocations();

    /**
     * Gets the GeoLocationQuotas object to access its operations.
     * @return the GeoLocationQuotas object.
     */
    GeoLocationQuotas geoLocationQuotas();

}
