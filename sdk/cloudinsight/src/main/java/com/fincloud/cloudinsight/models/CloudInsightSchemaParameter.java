/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CloudInsightSchemaParameter model.
 */
public class CloudInsightSchemaParameter {
    /**
     * Metric Product 이름.
     */
    @JsonProperty(value = "prodName")
    private String prodName;

    /**
     * Metric 필드 정의.
     */
    @JsonProperty(value = "fields")
    private List<CloudInsightSchemaFieldsParameter> fields;

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
     * @return the CloudInsightSchemaParameter object itself.
     */
    public CloudInsightSchemaParameter withProdName(String prodName) {
        this.prodName = prodName;
        return this;
    }

    /**
     * Get metric 필드 정의.
     *
     * @return the fields value
     */
    public List<CloudInsightSchemaFieldsParameter> fields() {
        return this.fields;
    }

    /**
     * Set metric 필드 정의.
     *
     * @param fields the fields value to set
     * @return the CloudInsightSchemaParameter object itself.
     */
    public CloudInsightSchemaParameter withFields(List<CloudInsightSchemaFieldsParameter> fields) {
        this.fields = fields;
        return this;
    }

}
