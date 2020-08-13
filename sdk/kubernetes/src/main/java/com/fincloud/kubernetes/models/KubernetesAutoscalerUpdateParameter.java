/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KubernetesAutoscalerUpdateParameter model.
 */
public class KubernetesAutoscalerUpdateParameter {
    /**
     * 오토스케일 가능여부.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * 오토스케일 가능 최대 노드 수.
     */
    @JsonProperty(value = "max")
    private Double max;

    /**
     * 오토스케일 가능 최소 노드 수.
     */
    @JsonProperty(value = "min")
    private Double min;

    /**
     * Get 오토스케일 가능여부.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set 오토스케일 가능여부.
     *
     * @param enabled the enabled value to set
     * @return the KubernetesAutoscalerUpdateParameter object itself.
     */
    public KubernetesAutoscalerUpdateParameter withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get 오토스케일 가능 최대 노드 수.
     *
     * @return the max value
     */
    public Double max() {
        return this.max;
    }

    /**
     * Set 오토스케일 가능 최대 노드 수.
     *
     * @param max the max value to set
     * @return the KubernetesAutoscalerUpdateParameter object itself.
     */
    public KubernetesAutoscalerUpdateParameter withMax(Double max) {
        this.max = max;
        return this;
    }

    /**
     * Get 오토스케일 가능 최소 노드 수.
     *
     * @return the min value
     */
    public Double min() {
        return this.min;
    }

    /**
     * Set 오토스케일 가능 최소 노드 수.
     *
     * @param min the min value to set
     * @return the KubernetesAutoscalerUpdateParameter object itself.
     */
    public KubernetesAutoscalerUpdateParameter withMin(Double min) {
        this.min = min;
        return this;
    }

}
