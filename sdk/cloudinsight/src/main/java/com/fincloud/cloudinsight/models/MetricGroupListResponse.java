/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MetricsGroupListDto.
 * Metrics list.
 */
public class MetricGroupListResponse {
    /**
     * Metrics list of specified criteria.
     */
    @JsonProperty(value = "metricsGroups")
    private List<MetricsGroupParameter> metricsGroups;

    /**
     * Get metrics list of specified criteria.
     *
     * @return the metricsGroups value
     */
    public List<MetricsGroupParameter> metricsGroups() {
        return this.metricsGroups;
    }

    /**
     * Set metrics list of specified criteria.
     *
     * @param metricsGroups the metricsGroups value to set
     * @return the MetricGroupListResponse object itself.
     */
    public MetricGroupListResponse withMetricsGroups(List<MetricsGroupParameter> metricsGroups) {
        this.metricsGroups = metricsGroups;
        return this;
    }

}
