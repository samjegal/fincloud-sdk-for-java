/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.implementation;

import com.fincloud.vpc.VPCManagementClient;
import com.fincloud.vpc.NatGateways;
import com.fincloud.vpc.NetworkACLs;
import com.fincloud.vpc.RouteTables;
import com.fincloud.vpc.Routes;
import com.fincloud.vpc.RouteTableSubnets;
import com.fincloud.vpc.Subnets;
import com.fincloud.vpc.VPCs;
import com.fincloud.vpc.VpcPeerings;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the VPCManagementClient class.
 */
public class VPCManagementClientImpl extends ServiceClient implements VPCManagementClient {

    /**
     * The NatGateways object to access its operations.
     */
    private NatGateways natGateways;

    /**
     * Gets the NatGateways object to access its operations.
     * @return the NatGateways object.
     */
    public NatGateways natGateways() {
        return this.natGateways;
    }

    /**
     * The NetworkACLs object to access its operations.
     */
    private NetworkACLs networkACLs;

    /**
     * Gets the NetworkACLs object to access its operations.
     * @return the NetworkACLs object.
     */
    public NetworkACLs networkACLs() {
        return this.networkACLs;
    }

    /**
     * The RouteTables object to access its operations.
     */
    private RouteTables routeTables;

    /**
     * Gets the RouteTables object to access its operations.
     * @return the RouteTables object.
     */
    public RouteTables routeTables() {
        return this.routeTables;
    }

    /**
     * The Routes object to access its operations.
     */
    private Routes routes;

    /**
     * Gets the Routes object to access its operations.
     * @return the Routes object.
     */
    public Routes routes() {
        return this.routes;
    }

    /**
     * The RouteTableSubnets object to access its operations.
     */
    private RouteTableSubnets routeTableSubnets;

    /**
     * Gets the RouteTableSubnets object to access its operations.
     * @return the RouteTableSubnets object.
     */
    public RouteTableSubnets routeTableSubnets() {
        return this.routeTableSubnets;
    }

    /**
     * The Subnets object to access its operations.
     */
    private Subnets subnets;

    /**
     * Gets the Subnets object to access its operations.
     * @return the Subnets object.
     */
    public Subnets subnets() {
        return this.subnets;
    }

    /**
     * The VPCs object to access its operations.
     */
    private VPCs vPCs;

    /**
     * Gets the VPCs object to access its operations.
     * @return the VPCs object.
     */
    public VPCs vPCs() {
        return this.vPCs;
    }

    /**
     * The VpcPeerings object to access its operations.
     */
    private VpcPeerings vpcPeerings;

    /**
     * Gets the VpcPeerings object to access its operations.
     * @return the VpcPeerings object.
     */
    public VpcPeerings vpcPeerings() {
        return this.vpcPeerings;
    }

    /**
     * Initializes an instance of VPCManagementClient client.
     */
    public VPCManagementClientImpl() {
        this("https://fin-ncloud.apigw.fin-ntruss.com");
    }

    /**
     * Initializes an instance of VPCManagementClient client.
     *
     * @param baseUrl the base URL of the host
     */
    public VPCManagementClientImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of VPCManagementClient client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public VPCManagementClientImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://fin-ncloud.apigw.fin-ntruss.com", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of VPCManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public VPCManagementClientImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of VPCManagementClient client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public VPCManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.natGateways = new NatGatewaysImpl(retrofit(), this);
        this.networkACLs = new NetworkACLsImpl(retrofit(), this);
        this.routeTables = new RouteTablesImpl(retrofit(), this);
        this.routes = new RoutesImpl(retrofit(), this);
        this.routeTableSubnets = new RouteTableSubnetsImpl(retrofit(), this);
        this.subnets = new SubnetsImpl(retrofit(), this);
        this.vPCs = new VPCsImpl(retrofit(), this);
        this.vpcPeerings = new VpcPeeringsImpl(retrofit(), this);
    }
}
