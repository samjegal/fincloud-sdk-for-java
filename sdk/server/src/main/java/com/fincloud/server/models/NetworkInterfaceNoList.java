/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The NetworkInterfaceNoList model.
 */
public class NetworkInterfaceNoList {
    /**
     * 네트워크 인터페이스 번호.
     */
    @JsonProperty(value = "networkInterfaceNo")
    private String networkInterfaceNo;

    /**
     * Get 네트워크 인터페이스 번호.
     *
     * @return the networkInterfaceNo value
     */
    public String networkInterfaceNo() {
        return this.networkInterfaceNo;
    }

    /**
     * Set 네트워크 인터페이스 번호.
     *
     * @param networkInterfaceNo the networkInterfaceNo value to set
     * @return the NetworkInterfaceNoList object itself.
     */
    public NetworkInterfaceNoList withNetworkInterfaceNo(String networkInterfaceNo) {
        this.networkInterfaceNo = networkInterfaceNo;
        return this;
    }

}
