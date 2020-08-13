/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.geolocation.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The GeoLocationQuotaResourceParameter model.
 */
public class GeoLocationQuotaResourceParameter {
    /**
     * 제한 또는 무제한 사용 상태 반환 (Unlimited 또는 Limited).
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * 설정된 Quota 값 (무제한 사용일 경우, -1로 응답).
     */
    @JsonProperty(value = "quota")
    private Integer quota;

    /**
     * Get 제한 또는 무제한 사용 상태 반환 (Unlimited 또는 Limited).
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set 제한 또는 무제한 사용 상태 반환 (Unlimited 또는 Limited).
     *
     * @param type the type value to set
     * @return the GeoLocationQuotaResourceParameter object itself.
     */
    public GeoLocationQuotaResourceParameter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get 설정된 Quota 값 (무제한 사용일 경우, -1로 응답).
     *
     * @return the quota value
     */
    public Integer quota() {
        return this.quota;
    }

    /**
     * Set 설정된 Quota 값 (무제한 사용일 경우, -1로 응답).
     *
     * @param quota the quota value to set
     * @return the GeoLocationQuotaResourceParameter object itself.
     */
    public GeoLocationQuotaResourceParameter withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

}
