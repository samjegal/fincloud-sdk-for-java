/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The NetworkAclRuleType model.
 */
public class NetworkAclRuleType {
    /**
     * 상태 코드.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * 상태 코드 이름.
     */
    @JsonProperty(value = "codeName")
    private String codeName;

    /**
     * Get 상태 코드.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set 상태 코드.
     *
     * @param code the code value to set
     * @return the NetworkAclRuleType object itself.
     */
    public NetworkAclRuleType withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get 상태 코드 이름.
     *
     * @return the codeName value
     */
    public String codeName() {
        return this.codeName;
    }

    /**
     * Set 상태 코드 이름.
     *
     * @param codeName the codeName value to set
     * @return the NetworkAclRuleType object itself.
     */
    public NetworkAclRuleType withCodeName(String codeName) {
        this.codeName = codeName;
        return this;
    }

}
