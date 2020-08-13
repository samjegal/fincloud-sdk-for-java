/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import com.fincloud.cloudinsight.CloudInsightManagementClient;
import com.fincloud.cloudinsight.Datas;
import com.fincloud.cloudinsight.Events;
import com.fincloud.cloudinsight.Rules;
import com.fincloud.cloudinsight.Schemas;
import com.fincloud.cloudinsight.Servers;
import com.fincloud.cloudinsight.Collectors;
import com.fincloud.cloudinsight.PluginProcess;
import com.fincloud.cloudinsight.PortPlugins;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the CloudInsightManagementClient class.
 */
public class CloudInsightManagementClientImpl extends ServiceClient implements CloudInsightManagementClient {

    /**
     * The Datas object to access its operations.
     */
    private Datas datas;

    /**
     * Gets the Datas object to access its operations.
     * @return the Datas object.
     */
    public Datas datas() {
        return this.datas;
    }

    /**
     * The Events object to access its operations.
     */
    private Events events;

    /**
     * Gets the Events object to access its operations.
     * @return the Events object.
     */
    public Events events() {
        return this.events;
    }

    /**
     * The Rules object to access its operations.
     */
    private Rules rules;

    /**
     * Gets the Rules object to access its operations.
     * @return the Rules object.
     */
    public Rules rules() {
        return this.rules;
    }

    /**
     * The Schemas object to access its operations.
     */
    private Schemas schemas;

    /**
     * Gets the Schemas object to access its operations.
     * @return the Schemas object.
     */
    public Schemas schemas() {
        return this.schemas;
    }

    /**
     * The Servers object to access its operations.
     */
    private Servers servers;

    /**
     * Gets the Servers object to access its operations.
     * @return the Servers object.
     */
    public Servers servers() {
        return this.servers;
    }

    /**
     * The Collectors object to access its operations.
     */
    private Collectors collectors;

    /**
     * Gets the Collectors object to access its operations.
     * @return the Collectors object.
     */
    public Collectors collectors() {
        return this.collectors;
    }

    /**
     * The PluginProcess object to access its operations.
     */
    private PluginProcess pluginProcess;

    /**
     * Gets the PluginProcess object to access its operations.
     * @return the PluginProcess object.
     */
    public PluginProcess pluginProcess() {
        return this.pluginProcess;
    }

    /**
     * The PortPlugins object to access its operations.
     */
    private PortPlugins portPlugins;

    /**
     * Gets the PortPlugins object to access its operations.
     * @return the PortPlugins object.
     */
    public PortPlugins portPlugins() {
        return this.portPlugins;
    }

    /**
     * Initializes an instance of CloudInsightManagementClient client.
     */
    public CloudInsightManagementClientImpl() {
        this("https://cw.apigw.fin-ntruss.com");
    }

    /**
     * Initializes an instance of CloudInsightManagementClient client.
     *
     * @param baseUrl the base URL of the host
     */
    public CloudInsightManagementClientImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of CloudInsightManagementClient client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public CloudInsightManagementClientImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://cw.apigw.fin-ntruss.com", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of CloudInsightManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public CloudInsightManagementClientImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of CloudInsightManagementClient client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public CloudInsightManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.datas = new DatasImpl(retrofit(), this);
        this.events = new EventsImpl(retrofit(), this);
        this.rules = new RulesImpl(retrofit(), this);
        this.schemas = new SchemasImpl(retrofit(), this);
        this.servers = new ServersImpl(retrofit(), this);
        this.collectors = new CollectorsImpl(retrofit(), this);
        this.pluginProcess = new PluginProcessImpl(retrofit(), this);
        this.portPlugins = new PortPluginsImpl(retrofit(), this);
    }
}
