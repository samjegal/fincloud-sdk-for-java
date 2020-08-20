/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SchemaExtendedStatusParameter model.
 */
public class SchemaExtendedStatusParameter {
    /**
     * Extended 설정 여부.
     */
    @JsonProperty(value = "enabled")
    private String enabled;

    /**
     * 인스턴스 아이디.
     */
    @JsonProperty(value = "instanceId")
    private String instanceId;

    /**
     * Get extended 설정 여부.
     *
     * @return the enabled value
     */
    public String enabled() {
        return this.enabled;
    }

    /**
     * Set extended 설정 여부.
     *
     * @param enabled the enabled value to set
     * @return the SchemaExtendedStatusParameter object itself.
     */
    public SchemaExtendedStatusParameter withEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get 인스턴스 아이디.
     *
     * @return the instanceId value
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Set 인스턴스 아이디.
     *
     * @param instanceId the instanceId value to set
     * @return the SchemaExtendedStatusParameter object itself.
     */
    public SchemaExtendedStatusParameter withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
