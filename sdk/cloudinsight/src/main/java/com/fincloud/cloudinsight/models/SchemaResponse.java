/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SchemaResponse.
 * 사용자 정의 스키마.
 */
public class SchemaResponse {
    /**
     * Name of the product. Must NOT be null or empty.
     */
    @JsonProperty(value = "prodName", required = true)
    private String prodName;

    /**
     * Generated key for this product, not required when registering product.
     */
    @JsonProperty(value = "cw_key")
    private String cwKey;

    /**
     * Field list of the schema. Must NOT be null or empty.
     */
    @JsonProperty(value = "fields", required = true)
    private List<SchemaFieldParameter> fields;

    /**
     * Secret of the product, for response display ONLY, not required in
     * request.
     */
    @JsonProperty(value = "secret")
    private String secret;

    /**
     * Get name of the product. Must NOT be null or empty.
     *
     * @return the prodName value
     */
    public String prodName() {
        return this.prodName;
    }

    /**
     * Set name of the product. Must NOT be null or empty.
     *
     * @param prodName the prodName value to set
     * @return the SchemaResponse object itself.
     */
    public SchemaResponse withProdName(String prodName) {
        this.prodName = prodName;
        return this;
    }

    /**
     * Get generated key for this product, not required when registering product.
     *
     * @return the cwKey value
     */
    public String cwKey() {
        return this.cwKey;
    }

    /**
     * Set generated key for this product, not required when registering product.
     *
     * @param cwKey the cwKey value to set
     * @return the SchemaResponse object itself.
     */
    public SchemaResponse withCwKey(String cwKey) {
        this.cwKey = cwKey;
        return this;
    }

    /**
     * Get field list of the schema. Must NOT be null or empty.
     *
     * @return the fields value
     */
    public List<SchemaFieldParameter> fields() {
        return this.fields;
    }

    /**
     * Set field list of the schema. Must NOT be null or empty.
     *
     * @param fields the fields value to set
     * @return the SchemaResponse object itself.
     */
    public SchemaResponse withFields(List<SchemaFieldParameter> fields) {
        this.fields = fields;
        return this;
    }

    /**
     * Get secret of the product, for response display ONLY, not required in request.
     *
     * @return the secret value
     */
    public String secret() {
        return this.secret;
    }

    /**
     * Set secret of the product, for response display ONLY, not required in request.
     *
     * @param secret the secret value to set
     * @return the SchemaResponse object itself.
     */
    public SchemaResponse withSecret(String secret) {
        this.secret = secret;
        return this;
    }

}
