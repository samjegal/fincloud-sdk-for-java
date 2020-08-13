/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc;

import com.microsoft.rest.RestClient;

/**
 * The interface for VPCManagementClient class.
 */
public interface VPCManagementClient {
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
     * Gets the NatGateways object to access its operations.
     * @return the NatGateways object.
     */
    NatGateways natGateways();

    /**
     * Gets the NetworkACLs object to access its operations.
     * @return the NetworkACLs object.
     */
    NetworkACLs networkACLs();

    /**
     * Gets the RouteTables object to access its operations.
     * @return the RouteTables object.
     */
    RouteTables routeTables();

    /**
     * Gets the Routes object to access its operations.
     * @return the Routes object.
     */
    Routes routes();

    /**
     * Gets the RouteTableSubnets object to access its operations.
     * @return the RouteTableSubnets object.
     */
    RouteTableSubnets routeTableSubnets();

    /**
     * Gets the Subnets object to access its operations.
     * @return the Subnets object.
     */
    Subnets subnets();

    /**
     * Gets the VPCs object to access its operations.
     * @return the VPCs object.
     */
    VPCs vPCs();

    /**
     * Gets the VpcPeerings object to access its operations.
     * @return the VpcPeerings object.
     */
    VpcPeerings vpcPeerings();

}
