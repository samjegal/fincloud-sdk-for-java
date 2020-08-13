/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kms.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EncryptRequestKey model.
 */
public class EncryptRequestKey {
    /**
     * 암호화할 데이터 (최대 32KB) (Base64 Encoding이 필요합니다).
     */
    @JsonProperty(value = "plaintext", required = true)
    private String plaintext;

    /**
     * Get 암호화할 데이터 (최대 32KB) (Base64 Encoding이 필요합니다).
     *
     * @return the plaintext value
     */
    public String plaintext() {
        return this.plaintext;
    }

    /**
     * Set 암호화할 데이터 (최대 32KB) (Base64 Encoding이 필요합니다).
     *
     * @param plaintext the plaintext value to set
     * @return the EncryptRequestKey object itself.
     */
    public EncryptRequestKey withPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }

}
