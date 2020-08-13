/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CreateLoginKeyResponse model.
 */
public class CreateLoginKeyResponse {
    /**
     * 리턴 코드.
     */
    @JsonProperty(value = "returnCode")
    private String returnCode;

    /**
     * 리턴 메시지.
     */
    @JsonProperty(value = "returnMessage")
    private String returnMessage;

    /**
     * 키 이름.
     */
    @JsonProperty(value = "keyName")
    private String keyName;

    /**
     * 비밀키.
     */
    @JsonProperty(value = "privateKey")
    private String privateKey;

    /**
     * Get 리턴 코드.
     *
     * @return the returnCode value
     */
    public String returnCode() {
        return this.returnCode;
    }

    /**
     * Set 리턴 코드.
     *
     * @param returnCode the returnCode value to set
     * @return the CreateLoginKeyResponse object itself.
     */
    public CreateLoginKeyResponse withReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }

    /**
     * Get 리턴 메시지.
     *
     * @return the returnMessage value
     */
    public String returnMessage() {
        return this.returnMessage;
    }

    /**
     * Set 리턴 메시지.
     *
     * @param returnMessage the returnMessage value to set
     * @return the CreateLoginKeyResponse object itself.
     */
    public CreateLoginKeyResponse withReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
        return this;
    }

    /**
     * Get 키 이름.
     *
     * @return the keyName value
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set 키 이름.
     *
     * @param keyName the keyName value to set
     * @return the CreateLoginKeyResponse object itself.
     */
    public CreateLoginKeyResponse withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get 비밀키.
     *
     * @return the privateKey value
     */
    public String privateKey() {
        return this.privateKey;
    }

    /**
     * Set 비밀키.
     *
     * @param privateKey the privateKey value to set
     * @return the CreateLoginKeyResponse object itself.
     */
    public CreateLoginKeyResponse withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

}
