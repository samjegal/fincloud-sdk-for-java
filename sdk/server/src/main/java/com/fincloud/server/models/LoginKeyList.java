/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LoginKeyList model.
 */
public class LoginKeyList {
    /**
     * 리턴 코드.
     */
    @JsonProperty(value = "fingerprint")
    private String fingerprint;

    /**
     * 리턴 코드.
     */
    @JsonProperty(value = "keyName")
    private String keyName;

    /**
     * 리턴 코드.
     */
    @JsonProperty(value = "createDate")
    private String createDate;

    /**
     * Get 리턴 코드.
     *
     * @return the fingerprint value
     */
    public String fingerprint() {
        return this.fingerprint;
    }

    /**
     * Set 리턴 코드.
     *
     * @param fingerprint the fingerprint value to set
     * @return the LoginKeyList object itself.
     */
    public LoginKeyList withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * Get 리턴 코드.
     *
     * @return the keyName value
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set 리턴 코드.
     *
     * @param keyName the keyName value to set
     * @return the LoginKeyList object itself.
     */
    public LoginKeyList withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get 리턴 코드.
     *
     * @return the createDate value
     */
    public String createDate() {
        return this.createDate;
    }

    /**
     * Set 리턴 코드.
     *
     * @param createDate the createDate value to set
     * @return the LoginKeyList object itself.
     */
    public LoginKeyList withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

}
