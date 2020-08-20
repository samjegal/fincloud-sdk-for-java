/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import com.fincloud.cloudinsight.CloudInsightManagementClient;
import com.fincloud.cloudinsight.Charts;
import com.fincloud.cloudinsight.Datas;
import com.fincloud.cloudinsight.Events;
import com.fincloud.cloudinsight.Notifications;
import com.fincloud.cloudinsight.Metrics;
import com.fincloud.cloudinsight.RuleGroups;
import com.fincloud.cloudinsight.MonitorGroups;
import com.fincloud.cloudinsight.MetricGroups;
import com.fincloud.cloudinsight.Monitors;
import com.fincloud.cloudinsight.Schemas;
import com.fincloud.cloudinsight.Extendeds;
import com.fincloud.cloudinsight.Servers;
import com.fincloud.cloudinsight.Collectors;
import com.fincloud.cloudinsight.ProcessPlugins;
import com.fincloud.cloudinsight.PortPlugins;
import com.fincloud.cloudinsight.FilePlugins;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the CloudInsightManagementClient class.
 */
public class CloudInsightManagementClientImpl extends ServiceClient implements CloudInsightManagementClient {

    /**
     * The Charts object to access its operations.
     */
    private Charts charts;

    /**
     * Gets the Charts object to access its operations.
     * @return the Charts object.
     */
    public Charts charts() {
        return this.charts;
    }

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
     * The Notifications object to access its operations.
     */
    private Notifications notifications;

    /**
     * Gets the Notifications object to access its operations.
     * @return the Notifications object.
     */
    public Notifications notifications() {
        return this.notifications;
    }

    /**
     * The Metrics object to access its operations.
     */
    private Metrics metrics;

    /**
     * Gets the Metrics object to access its operations.
     * @return the Metrics object.
     */
    public Metrics metrics() {
        return this.metrics;
    }

    /**
     * The RuleGroups object to access its operations.
     */
    private RuleGroups ruleGroups;

    /**
     * Gets the RuleGroups object to access its operations.
     * @return the RuleGroups object.
     */
    public RuleGroups ruleGroups() {
        return this.ruleGroups;
    }

    /**
     * The MonitorGroups object to access its operations.
     */
    private MonitorGroups monitorGroups;

    /**
     * Gets the MonitorGroups object to access its operations.
     * @return the MonitorGroups object.
     */
    public MonitorGroups monitorGroups() {
        return this.monitorGroups;
    }

    /**
     * The MetricGroups object to access its operations.
     */
    private MetricGroups metricGroups;

    /**
     * Gets the MetricGroups object to access its operations.
     * @return the MetricGroups object.
     */
    public MetricGroups metricGroups() {
        return this.metricGroups;
    }

    /**
     * The Monitors object to access its operations.
     */
    private Monitors monitors;

    /**
     * Gets the Monitors object to access its operations.
     * @return the Monitors object.
     */
    public Monitors monitors() {
        return this.monitors;
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
     * The Extendeds object to access its operations.
     */
    private Extendeds extendeds;

    /**
     * Gets the Extendeds object to access its operations.
     * @return the Extendeds object.
     */
    public Extendeds extendeds() {
        return this.extendeds;
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
     * The ProcessPlugins object to access its operations.
     */
    private ProcessPlugins processPlugins;

    /**
     * Gets the ProcessPlugins object to access its operations.
     * @return the ProcessPlugins object.
     */
    public ProcessPlugins processPlugins() {
        return this.processPlugins;
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
     * The FilePlugins object to access its operations.
     */
    private FilePlugins filePlugins;

    /**
     * Gets the FilePlugins object to access its operations.
     * @return the FilePlugins object.
     */
    public FilePlugins filePlugins() {
        return this.filePlugins;
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
        this.charts = new ChartsImpl(retrofit(), this);
        this.datas = new DatasImpl(retrofit(), this);
        this.events = new EventsImpl(retrofit(), this);
        this.notifications = new NotificationsImpl(retrofit(), this);
        this.metrics = new MetricsImpl(retrofit(), this);
        this.ruleGroups = new RuleGroupsImpl(retrofit(), this);
        this.monitorGroups = new MonitorGroupsImpl(retrofit(), this);
        this.metricGroups = new MetricGroupsImpl(retrofit(), this);
        this.monitors = new MonitorsImpl(retrofit(), this);
        this.schemas = new SchemasImpl(retrofit(), this);
        this.extendeds = new ExtendedsImpl(retrofit(), this);
        this.servers = new ServersImpl(retrofit(), this);
        this.collectors = new CollectorsImpl(retrofit(), this);
        this.processPlugins = new ProcessPluginsImpl(retrofit(), this);
        this.portPlugins = new PortPluginsImpl(retrofit(), this);
        this.filePlugins = new FilePluginsImpl(retrofit(), this);
    }
}
