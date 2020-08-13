/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kms.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CreateCustomKeyRequest model.
 */
public class CreateCustomKeyRequest {
    /**
     * 생성된 키를 평문 형태로 반환받을지 선택하는 플래그.
     */
    @JsonProperty(value = "requestPlainKey", required = true)
    private boolean requestPlainKey;

    /**
     * 생성될 키의 비트 (128, 256, 512) (기본 256).
     */
    @JsonProperty(value = "bits")
    private Integer bits;

    /**
     * Get 생성된 키를 평문 형태로 반환받을지 선택하는 플래그.
     *
     * @return the requestPlainKey value
     */
    public boolean requestPlainKey() {
        return this.requestPlainKey;
    }

    /**
     * Set 생성된 키를 평문 형태로 반환받을지 선택하는 플래그.
     *
     * @param requestPlainKey the requestPlainKey value to set
     * @return the CreateCustomKeyRequest object itself.
     */
    public CreateCustomKeyRequest withRequestPlainKey(boolean requestPlainKey) {
        this.requestPlainKey = requestPlainKey;
        return this;
    }

    /**
     * Get 생성될 키의 비트 (128, 256, 512) (기본 256).
     *
     * @return the bits value
     */
    public Integer bits() {
        return this.bits;
    }

    /**
     * Set 생성될 키의 비트 (128, 256, 512) (기본 256).
     *
     * @param bits the bits value to set
     * @return the CreateCustomKeyRequest object itself.
     */
    public CreateCustomKeyRequest withBits(Integer bits) {
        this.bits = bits;
        return this;
    }

}
