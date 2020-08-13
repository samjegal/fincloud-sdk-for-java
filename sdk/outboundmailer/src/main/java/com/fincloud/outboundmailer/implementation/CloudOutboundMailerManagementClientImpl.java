/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.implementation;

import com.fincloud.outboundmailer.CloudOutboundMailerManagementClient;
import com.fincloud.outboundmailer.Mails;
import com.fincloud.outboundmailer.Files;
import com.fincloud.outboundmailer.AddressBooks;
import com.fincloud.outboundmailer.Unsubscribers;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the CloudOutboundMailerManagementClient class.
 */
public class CloudOutboundMailerManagementClientImpl extends ServiceClient implements CloudOutboundMailerManagementClient {

    /**
     * The Mails object to access its operations.
     */
    private Mails mails;

    /**
     * Gets the Mails object to access its operations.
     * @return the Mails object.
     */
    public Mails mails() {
        return this.mails;
    }

    /**
     * The Files object to access its operations.
     */
    private Files files;

    /**
     * Gets the Files object to access its operations.
     * @return the Files object.
     */
    public Files files() {
        return this.files;
    }

    /**
     * The AddressBooks object to access its operations.
     */
    private AddressBooks addressBooks;

    /**
     * Gets the AddressBooks object to access its operations.
     * @return the AddressBooks object.
     */
    public AddressBooks addressBooks() {
        return this.addressBooks;
    }

    /**
     * The Unsubscribers object to access its operations.
     */
    private Unsubscribers unsubscribers;

    /**
     * Gets the Unsubscribers object to access its operations.
     * @return the Unsubscribers object.
     */
    public Unsubscribers unsubscribers() {
        return this.unsubscribers;
    }

    /**
     * Initializes an instance of CloudOutboundMailerManagementClient client.
     */
    public CloudOutboundMailerManagementClientImpl() {
        this("https://mail.apigw.fin-ntruss.com/api/v1");
    }

    /**
     * Initializes an instance of CloudOutboundMailerManagementClient client.
     *
     * @param baseUrl the base URL of the host
     */
    public CloudOutboundMailerManagementClientImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of CloudOutboundMailerManagementClient client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public CloudOutboundMailerManagementClientImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://mail.apigw.fin-ntruss.com/api/v1", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of CloudOutboundMailerManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public CloudOutboundMailerManagementClientImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of CloudOutboundMailerManagementClient client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public CloudOutboundMailerManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.mails = new MailsImpl(retrofit(), this);
        this.files = new FilesImpl(retrofit(), this);
        this.addressBooks = new AddressBooksImpl(retrofit(), this);
        this.unsubscribers = new UnsubscribersImpl(retrofit(), this);
    }
}
