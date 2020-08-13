/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kms.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SignRequest model.
 */
public class SignRequest {
    /**
     * 서명값을 생성할 데이터 (최대 8KB) (Base64 Encoding이 필요합니다).
     */
    @JsonProperty(value = "data", required = true)
    private String data;

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
     * @return the SignRequest object itself.
     */
    public SignRequest withData(String data) {
        this.data = data;
        return this;
    }

}
