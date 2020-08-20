/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SuspendRuleItem.
 */
public class SuspendRuleItemParameter {
    /**
     * 감시 항목 id.
     */
    @JsonProperty(value = "metricGroupItemId", required = true)
    private String metricGroupItemId;

    /**
     * 감시 대상 id.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /**
     * Get 감시 항목 id.
     *
     * @return the metricGroupItemId value
     */
    public String metricGroupItemId() {
        return this.metricGroupItemId;
    }

    /**
     * Set 감시 항목 id.
     *
     * @param metricGroupItemId the metricGroupItemId value to set
     * @return the SuspendRuleItemParameter object itself.
     */
    public SuspendRuleItemParameter withMetricGroupItemId(String metricGroupItemId) {
        this.metricGroupItemId = metricGroupItemId;
        return this;
    }

    /**
     * Get 감시 대상 id.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set 감시 대상 id.
     *
     * @param resourceId the resourceId value to set
     * @return the SuspendRuleItemParameter object itself.
     */
    public SuspendRuleItemParameter withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

}
