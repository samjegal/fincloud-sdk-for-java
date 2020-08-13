/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RootPasswordServerInstanceList model.
 */
public class RootPasswordServerInstanceList {
    /**
     * 서버 인스턴스 번호.
     */
    @JsonProperty(value = "serverInstanceNo")
    private String serverInstanceNo;

    /**
     * 관리자 비밀번호.
     */
    @JsonProperty(value = "rootPassword")
    private String rootPassword;

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
     * @return the RootPasswordServerInstanceList object itself.
     */
    public RootPasswordServerInstanceList withServerInstanceNo(String serverInstanceNo) {
        this.serverInstanceNo = serverInstanceNo;
        return this;
    }

    /**
     * Get 관리자 비밀번호.
     *
     * @return the rootPassword value
     */
    public String rootPassword() {
        return this.rootPassword;
    }

    /**
     * Set 관리자 비밀번호.
     *
     * @param rootPassword the rootPassword value to set
     * @return the RootPasswordServerInstanceList object itself.
     */
    public RootPasswordServerInstanceList withRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
        return this;
    }

}
