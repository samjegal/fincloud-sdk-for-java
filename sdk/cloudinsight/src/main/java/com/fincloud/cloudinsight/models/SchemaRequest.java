/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SchemaRequest model.
 */
public class SchemaRequest {
    /**
     * Generated key for this product, not required when registering product.
     */
    @JsonProperty(value = "cw_key")
    private String cwKey;

    /**
     * Secret of the product, for response display ONLY, not required in
     * request.
     */
    @JsonProperty(value = "secret")
    private String secret;

    /**
     * Metric Product 이름.
     */
    @JsonProperty(value = "prodName")
    private String prodName;

    /**
     * Metric 필드 정의.
     */
    @JsonProperty(value = "fields")
    private List<SchemaFieldRequestParameter> fields;

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
     * @return the SchemaRequest object itself.
     */
    public SchemaRequest withCwKey(String cwKey) {
        this.cwKey = cwKey;
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
     * @return the SchemaRequest object itself.
     */
    public SchemaRequest withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * Get metric Product 이름.
     *
     * @return the prodName value
     */
    public String prodName() {
        return this.prodName;
    }

    /**
     * Set metric Product 이름.
     *
     * @param prodName the prodName value to set
     * @return the SchemaRequest object itself.
     */
    public SchemaRequest withProdName(String prodName) {
        this.prodName = prodName;
        return this;
    }

    /**
     * Get metric 필드 정의.
     *
     * @return the fields value
     */
    public List<SchemaFieldRequestParameter> fields() {
        return this.fields;
    }

    /**
     * Set metric 필드 정의.
     *
     * @param fields the fields value to set
     * @return the SchemaRequest object itself.
     */
    public SchemaRequest withFields(List<SchemaFieldRequestParameter> fields) {
        this.fields = fields;
        return this;
    }

}
