/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.implementation;

import com.fincloud.sens.SENSManagementClient;
import com.fincloud.sens.SMS;
import com.fincloud.sens.Channels;
import com.fincloud.sens.Messages;
import com.fincloud.sens.Schedules;
import com.fincloud.sens.ScheduleMessages;
import com.fincloud.sens.Devices;
import com.fincloud.sens.Alimtalks;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the SENSManagementClient class.
 */
public class SENSManagementClientImpl extends ServiceClient implements SENSManagementClient {

    /**
     * The SMS object to access its operations.
     */
    private SMS sMS;

    /**
     * Gets the SMS object to access its operations.
     * @return the SMS object.
     */
    public SMS sMS() {
        return this.sMS;
    }

    /**
     * The Channels object to access its operations.
     */
    private Channels channels;

    /**
     * Gets the Channels object to access its operations.
     * @return the Channels object.
     */
    public Channels channels() {
        return this.channels;
    }

    /**
     * The Messages object to access its operations.
     */
    private Messages messages;

    /**
     * Gets the Messages object to access its operations.
     * @return the Messages object.
     */
    public Messages messages() {
        return this.messages;
    }

    /**
     * The Schedules object to access its operations.
     */
    private Schedules schedules;

    /**
     * Gets the Schedules object to access its operations.
     * @return the Schedules object.
     */
    public Schedules schedules() {
        return this.schedules;
    }

    /**
     * The ScheduleMessages object to access its operations.
     */
    private ScheduleMessages scheduleMessages;

    /**
     * Gets the ScheduleMessages object to access its operations.
     * @return the ScheduleMessages object.
     */
    public ScheduleMessages scheduleMessages() {
        return this.scheduleMessages;
    }

    /**
     * The Devices object to access its operations.
     */
    private Devices devices;

    /**
     * Gets the Devices object to access its operations.
     * @return the Devices object.
     */
    public Devices devices() {
        return this.devices;
    }

    /**
     * The Alimtalks object to access its operations.
     */
    private Alimtalks alimtalks;

    /**
     * Gets the Alimtalks object to access its operations.
     * @return the Alimtalks object.
     */
    public Alimtalks alimtalks() {
        return this.alimtalks;
    }

    /**
     * Initializes an instance of SENSManagementClient client.
     */
    public SENSManagementClientImpl() {
        this("https://sens.apigw.fin-ntruss.com");
    }

    /**
     * Initializes an instance of SENSManagementClient client.
     *
     * @param baseUrl the base URL of the host
     */
    public SENSManagementClientImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of SENSManagementClient client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public SENSManagementClientImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://sens.apigw.fin-ntruss.com", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of SENSManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public SENSManagementClientImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of SENSManagementClient client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public SENSManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.sMS = new SMSImpl(retrofit(), this);
        this.channels = new ChannelsImpl(retrofit(), this);
        this.messages = new MessagesImpl(retrofit(), this);
        this.schedules = new SchedulesImpl(retrofit(), this);
        this.scheduleMessages = new ScheduleMessagesImpl(retrofit(), this);
        this.devices = new DevicesImpl(retrofit(), this);
        this.alimtalks = new AlimtalksImpl(retrofit(), this);
    }
}
