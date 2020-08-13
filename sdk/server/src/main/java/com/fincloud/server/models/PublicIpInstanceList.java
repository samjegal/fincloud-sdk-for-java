/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PublicIpInstanceList model.
 */
public class PublicIpInstanceList {
    /**
     * 공인 IP 인스턴스 번호.
     */
    @JsonProperty(value = "publicIpInstanceNo")
    private String publicIpInstanceNo;

    /**
     * 공인 IP.
     */
    @JsonProperty(value = "publicIp")
    private String publicIp;

    /**
     * 공인 IP 설명.
     */
    @JsonProperty(value = "publicIpDescription")
    private String publicIpDescription;

    /**
     * 생성 일자.
     */
    @JsonProperty(value = "createDate")
    private String createDate;

    /**
     * 공인 IP 인스턴스 상태 이름.
     */
    @JsonProperty(value = "publicIpInstanceStatusName")
    private String publicIpInstanceStatusName;

    /**
     * 공인 IP 인스턴스 상태.
     */
    @JsonProperty(value = "publicIpInstanceStatus")
    private PublicIpInstanceStatus publicIpInstanceStatus;

    /**
     * 서버 인스턴스 번호.
     */
    @JsonProperty(value = "serverInstanceNo")
    private String serverInstanceNo;

    /**
     * 서버 이름.
     */
    @JsonProperty(value = "serverName")
    private String serverName;

    /**
     * 사설 IP.
     */
    @JsonProperty(value = "privateIp")
    private String privateIp;

    /**
     * 공인 IP 인스턴스 운영.
     */
    @JsonProperty(value = "publicIpInstanceOperation")
    private PublicIpInstanceOperation publicIpInstanceOperation;

    /**
     * Get 공인 IP 인스턴스 번호.
     *
     * @return the publicIpInstanceNo value
     */
    public String publicIpInstanceNo() {
        return this.publicIpInstanceNo;
    }

    /**
     * Set 공인 IP 인스턴스 번호.
     *
     * @param publicIpInstanceNo the publicIpInstanceNo value to set
     * @return the PublicIpInstanceList object itself.
     */
    public PublicIpInstanceList withPublicIpInstanceNo(String publicIpInstanceNo) {
        this.publicIpInstanceNo = publicIpInstanceNo;
        return this;
    }

    /**
     * Get 공인 IP.
     *
     * @return the publicIp value
     */
    public String publicIp() {
        return this.publicIp;
    }

    /**
     * Set 공인 IP.
     *
     * @param publicIp the publicIp value to set
     * @return the PublicIpInstanceList object itself.
     */
    public PublicIpInstanceList withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * Get 공인 IP 설명.
     *
     * @return the publicIpDescription value
     */
    public String publicIpDescription() {
        return this.publicIpDescription;
    }

    /**
     * Set 공인 IP 설명.
     *
     * @param publicIpDescription the publicIpDescription value to set
     * @return the PublicIpInstanceList object itself.
     */
    public PublicIpInstanceList withPublicIpDescription(String publicIpDescription) {
        this.publicIpDescription = publicIpDescription;
        return this;
    }

    /**
     * Get 생성 일자.
     *
     * @return the createDate value
     */
    public String createDate() {
        return this.createDate;
    }

    /**
     * Set 생성 일자.
     *
     * @param createDate the createDate value to set
     * @return the PublicIpInstanceList object itself.
     */
    public PublicIpInstanceList withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Get 공인 IP 인스턴스 상태 이름.
     *
     * @return the publicIpInstanceStatusName value
     */
    public String publicIpInstanceStatusName() {
        return this.publicIpInstanceStatusName;
    }

    /**
     * Set 공인 IP 인스턴스 상태 이름.
     *
     * @param publicIpInstanceStatusName the publicIpInstanceStatusName value to set
     * @return the PublicIpInstanceList object itself.
     */
    public PublicIpInstanceList withPublicIpInstanceStatusName(String publicIpInstanceStatusName) {
        this.publicIpInstanceStatusName = publicIpInstanceStatusName;
        return this;
    }

    /**
     * Get 공인 IP 인스턴스 상태.
     *
     * @return the publicIpInstanceStatus value
     */
    public PublicIpInstanceStatus publicIpInstanceStatus() {
        return this.publicIpInstanceStatus;
    }

    /**
     * Set 공인 IP 인스턴스 상태.
     *
     * @param publicIpInstanceStatus the publicIpInstanceStatus value to set
     * @return the PublicIpInstanceList object itself.
     */
    public PublicIpInstanceList withPublicIpInstanceStatus(PublicIpInstanceStatus publicIpInstanceStatus) {
        this.publicIpInstanceStatus = publicIpInstanceStatus;
        return this;
    }

    /**
     * Get 서버 인스턴스 번호.
     *
     * @return the serverInstanceNo value
     */
    public String serverInstanceNo() {
        return this.serverInstanceNo;
    }

    /**
     * Set 서버 인스턴스 번호.
     *
     * @param serverInstanceNo the serverInstanceNo value to set
     * @return the PublicIpInstanceList object itself.
     */
    public PublicIpInstanceList withServerInstanceNo(String serverInstanceNo) {
        this.serverInstanceNo = serverInstanceNo;
        return this;
    }

    /**
     * Get 서버 이름.
     *
     * @return the serverName value
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Set 서버 이름.
     *
     * @param serverName the serverName value to set
     * @return the PublicIpInstanceList object itself.
     */
    public PublicIpInstanceList withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get 사설 IP.
     *
     * @return the privateIp value
     */
    public String privateIp() {
        return this.privateIp;
    }

    /**
     * Set 사설 IP.
     *
     * @param privateIp the privateIp value to set
     * @return the PublicIpInstanceList object itself.
     */
    public PublicIpInstanceList withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * Get 공인 IP 인스턴스 운영.
     *
     * @return the publicIpInstanceOperation value
     */
    public PublicIpInstanceOperation publicIpInstanceOperation() {
        return this.publicIpInstanceOperation;
    }

    /**
     * Set 공인 IP 인스턴스 운영.
     *
     * @param publicIpInstanceOperation the publicIpInstanceOperation value to set
     * @return the PublicIpInstanceList object itself.
     */
    public PublicIpInstanceList withPublicIpInstanceOperation(PublicIpInstanceOperation publicIpInstanceOperation) {
        this.publicIpInstanceOperation = publicIpInstanceOperation;
        return this;
    }

}
