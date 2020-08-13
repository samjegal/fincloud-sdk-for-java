/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer;

import com.microsoft.rest.RestClient;

/**
 * The interface for CloudOutboundMailerManagementClient class.
 */
public interface CloudOutboundMailerManagementClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "https://mail.apigw.fin-ntruss.com/api/v1";

    /**
     * Gets the Mails object to access its operations.
     * @return the Mails object.
     */
    Mails mails();

    /**
     * Gets the Files object to access its operations.
     * @return the Files object.
     */
    Files files();

    /**
     * Gets the AddressBooks object to access its operations.
     * @return the AddressBooks object.
     */
    AddressBooks addressBooks();

    /**
     * Gets the Unsubscribers object to access its operations.
     * @return the Unsubscribers object.
     */
    Unsubscribers unsubscribers();

}
