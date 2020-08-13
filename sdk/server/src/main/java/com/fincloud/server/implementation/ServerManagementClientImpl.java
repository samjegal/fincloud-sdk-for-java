/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.implementation;

import com.fincloud.server.ServerManagementClient;
import com.fincloud.server.ACGs;
import com.fincloud.server.ACGInbounds;
import com.fincloud.server.ACGOutbounds;
import com.fincloud.server.Regions;
import com.fincloud.server.Zones;
import com.fincloud.server.ServerImageProducts;
import com.fincloud.server.ServerProducts;
import com.fincloud.server.InitScripts;
import com.fincloud.server.LoginKeys;
import com.fincloud.server.NetworkInterfaces;
import com.fincloud.server.PlacementGroups;
import com.fincloud.server.PublicIps;
import com.fincloud.server.Servers;
import com.fincloud.server.RootPasswords;
import com.fincloud.server.ServerImages;
import com.fincloud.server.Snapshots;
import com.fincloud.server.BlockStorages;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the ServerManagementClient class.
 */
public class ServerManagementClientImpl extends ServiceClient implements ServerManagementClient {

    /**
     * The ACGs object to access its operations.
     */
    private ACGs aCGs;

    /**
     * Gets the ACGs object to access its operations.
     * @return the ACGs object.
     */
    public ACGs aCGs() {
        return this.aCGs;
    }

    /**
     * The ACGInbounds object to access its operations.
     */
    private ACGInbounds aCGInbounds;

    /**
     * Gets the ACGInbounds object to access its operations.
     * @return the ACGInbounds object.
     */
    public ACGInbounds aCGInbounds() {
        return this.aCGInbounds;
    }

    /**
     * The ACGOutbounds object to access its operations.
     */
    private ACGOutbounds aCGOutbounds;

    /**
     * Gets the ACGOutbounds object to access its operations.
     * @return the ACGOutbounds object.
     */
    public ACGOutbounds aCGOutbounds() {
        return this.aCGOutbounds;
    }

    /**
     * The Regions object to access its operations.
     */
    private Regions regions;

    /**
     * Gets the Regions object to access its operations.
     * @return the Regions object.
     */
    public Regions regions() {
        return this.regions;
    }

    /**
     * The Zones object to access its operations.
     */
    private Zones zones;

    /**
     * Gets the Zones object to access its operations.
     * @return the Zones object.
     */
    public Zones zones() {
        return this.zones;
    }

    /**
     * The ServerImageProducts object to access its operations.
     */
    private ServerImageProducts serverImageProducts;

    /**
     * Gets the ServerImageProducts object to access its operations.
     * @return the ServerImageProducts object.
     */
    public ServerImageProducts serverImageProducts() {
        return this.serverImageProducts;
    }

    /**
     * The ServerProducts object to access its operations.
     */
    private ServerProducts serverProducts;

    /**
     * Gets the ServerProducts object to access its operations.
     * @return the ServerProducts object.
     */
    public ServerProducts serverProducts() {
        return this.serverProducts;
    }

    /**
     * The InitScripts object to access its operations.
     */
    private InitScripts initScripts;

    /**
     * Gets the InitScripts object to access its operations.
     * @return the InitScripts object.
     */
    public InitScripts initScripts() {
        return this.initScripts;
    }

    /**
     * The LoginKeys object to access its operations.
     */
    private LoginKeys loginKeys;

    /**
     * Gets the LoginKeys object to access its operations.
     * @return the LoginKeys object.
     */
    public LoginKeys loginKeys() {
        return this.loginKeys;
    }

    /**
     * The NetworkInterfaces object to access its operations.
     */
    private NetworkInterfaces networkInterfaces;

    /**
     * Gets the NetworkInterfaces object to access its operations.
     * @return the NetworkInterfaces object.
     */
    public NetworkInterfaces networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * The PlacementGroups object to access its operations.
     */
    private PlacementGroups placementGroups;

    /**
     * Gets the PlacementGroups object to access its operations.
     * @return the PlacementGroups object.
     */
    public PlacementGroups placementGroups() {
        return this.placementGroups;
    }

    /**
     * The PublicIps object to access its operations.
     */
    private PublicIps publicIps;

    /**
     * Gets the PublicIps object to access its operations.
     * @return the PublicIps object.
     */
    public PublicIps publicIps() {
        return this.publicIps;
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
     * The RootPasswords object to access its operations.
     */
    private RootPasswords rootPasswords;

    /**
     * Gets the RootPasswords object to access its operations.
     * @return the RootPasswords object.
     */
    public RootPasswords rootPasswords() {
        return this.rootPasswords;
    }

    /**
     * The ServerImages object to access its operations.
     */
    private ServerImages serverImages;

    /**
     * Gets the ServerImages object to access its operations.
     * @return the ServerImages object.
     */
    public ServerImages serverImages() {
        return this.serverImages;
    }

    /**
     * The Snapshots object to access its operations.
     */
    private Snapshots snapshots;

    /**
     * Gets the Snapshots object to access its operations.
     * @return the Snapshots object.
     */
    public Snapshots snapshots() {
        return this.snapshots;
    }

    /**
     * The BlockStorages object to access its operations.
     */
    private BlockStorages blockStorages;

    /**
     * Gets the BlockStorages object to access its operations.
     * @return the BlockStorages object.
     */
    public BlockStorages blockStorages() {
        return this.blockStorages;
    }

    /**
     * Initializes an instance of ServerManagementClient client.
     */
    public ServerManagementClientImpl() {
        this("https://fin-ncloud.apigw.fin-ntruss.com");
    }

    /**
     * Initializes an instance of ServerManagementClient client.
     *
     * @param baseUrl the base URL of the host
     */
    public ServerManagementClientImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of ServerManagementClient client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public ServerManagementClientImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://fin-ncloud.apigw.fin-ntruss.com", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of ServerManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public ServerManagementClientImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of ServerManagementClient client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public ServerManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.aCGs = new ACGsImpl(retrofit(), this);
        this.aCGInbounds = new ACGInboundsImpl(retrofit(), this);
        this.aCGOutbounds = new ACGOutboundsImpl(retrofit(), this);
        this.regions = new RegionsImpl(retrofit(), this);
        this.zones = new ZonesImpl(retrofit(), this);
        this.serverImageProducts = new ServerImageProductsImpl(retrofit(), this);
        this.serverProducts = new ServerProductsImpl(retrofit(), this);
        this.initScripts = new InitScriptsImpl(retrofit(), this);
        this.loginKeys = new LoginKeysImpl(retrofit(), this);
        this.networkInterfaces = new NetworkInterfacesImpl(retrofit(), this);
        this.placementGroups = new PlacementGroupsImpl(retrofit(), this);
        this.publicIps = new PublicIpsImpl(retrofit(), this);
        this.servers = new ServersImpl(retrofit(), this);
        this.rootPasswords = new RootPasswordsImpl(retrofit(), this);
        this.serverImages = new ServerImagesImpl(retrofit(), this);
        this.snapshots = new SnapshotsImpl(retrofit(), this);
        this.blockStorages = new BlockStoragesImpl(retrofit(), this);
    }
}
