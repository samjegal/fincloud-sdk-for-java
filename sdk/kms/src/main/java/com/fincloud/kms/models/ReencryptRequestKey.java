/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kms.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ReencryptRequestKey model.
 */
public class ReencryptRequestKey {
    /**
     * 재암호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다).
     */
    @JsonProperty(value = "ciphertext", required = true)
    private String ciphertext;

    /**
     * Get 재암호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다).
     *
     * @return the ciphertext value
     */
    public String ciphertext() {
        return this.ciphertext;
    }

    /**
     * Set 재암호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다).
     *
     * @param ciphertext the ciphertext value to set
     * @return the ReencryptRequestKey object itself.
     */
    public ReencryptRequestKey withCiphertext(String ciphertext) {
        this.ciphertext = ciphertext;
        return this;
    }

}
