/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kms.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The VerifyRequest model.
 */
public class VerifyRequest {
    /**
     * 서명값을 생성할 데이터 (최대 8KB) (Base64 Encoding이 필요합니다).
     */
    @JsonProperty(value = "data", required = true)
    private String data;

    /**
     * 서명값 데이터 (kms prefix와 Base64 Encoding된 서명값으로 구성되어 있습니다).
     */
    @JsonProperty(value = "signature", required = true)
    private String signature;

    /**
     * Get 서명값을 생성할 데이터 (최대 8KB) (Base64 Encoding이 필요합니다).
     *
     * @return the data value
     */
    public String data() {
        return this.data;
    }

    /**
     * Set 서명값을 생성할 데이터 (최대 8KB) (Base64 Encoding이 필요합니다).
     *
     * @param data the data value to set
     * @return the VerifyRequest object itself.
     */
    public VerifyRequest withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get 서명값 데이터 (kms prefix와 Base64 Encoding된 서명값으로 구성되어 있습니다).
     *
     * @return the signature value
     */
    public String signature() {
        return this.signature;
    }

    /**
     * Set 서명값 데이터 (kms prefix와 Base64 Encoding된 서명값으로 구성되어 있습니다).
     *
     * @param signature the signature value to set
     * @return the VerifyRequest object itself.
     */
    public VerifyRequest withSignature(String signature) {
        this.signature = signature;
        return this;
    }

}
