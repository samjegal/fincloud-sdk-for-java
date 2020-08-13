/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens;

import com.microsoft.rest.RestClient;

/**
 * The interface for SENSManagementClient class.
 */
public interface SENSManagementClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "https://sens.apigw.fin-ntruss.com";

    /**
     * Gets the SMS object to access its operations.
     * @return the SMS object.
     */
    SMS sMS();

    /**
     * Gets the Channels object to access its operations.
     * @return the Channels object.
     */
    Channels channels();

    /**
     * Gets the Messages object to access its operations.
     * @return the Messages object.
     */
    Messages messages();

    /**
     * Gets the Schedules object to access its operations.
     * @return the Schedules object.
     */
    Schedules schedules();

    /**
     * Gets the ScheduleMessages object to access its operations.
     * @return the ScheduleMessages object.
     */
    ScheduleMessages scheduleMessages();

    /**
     * Gets the Devices object to access its operations.
     * @return the Devices object.
     */
    Devices devices();

    /**
     * Gets the Alimtalks object to access its operations.
     * @return the Alimtalks object.
     */
    Alimtalks alimtalks();

}
