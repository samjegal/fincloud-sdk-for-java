/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KubernetesAutoscaleOptionParameter model.
 */
public class KubernetesAutoscaleOptionParameter {
    /**
     * 오토스케일 가능여부.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /**
     * 오토스케일 가능 최대 노드 수.
     */
    @JsonProperty(value = "max", required = true)
    private double max;

    /**
     * 오토스케일 가능 최소 노드 수.
     */
    @JsonProperty(value = "min", required = true)
    private double min;

    /**
     * Get 오토스케일 가능여부.
     *
     * @return the enabled value
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set 오토스케일 가능여부.
     *
     * @param enabled the enabled value to set
     * @return the KubernetesAutoscaleOptionParameter object itself.
     */
    public KubernetesAutoscaleOptionParameter withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get 오토스케일 가능 최대 노드 수.
     *
     * @return the max value
     */
    public double max() {
        return this.max;
    }

    /**
     * Set 오토스케일 가능 최대 노드 수.
     *
     * @param max the max value to set
     * @return the KubernetesAutoscaleOptionParameter object itself.
     */
    public KubernetesAutoscaleOptionParameter withMax(double max) {
        this.max = max;
        return this;
    }

    /**
     * Get 오토스케일 가능 최소 노드 수.
     *
     * @return the min value
     */
    public double min() {
        return this.min;
    }

    /**
     * Set 오토스케일 가능 최소 노드 수.
     *
     * @param min the min value to set
     * @return the KubernetesAutoscaleOptionParameter object itself.
     */
    public KubernetesAutoscaleOptionParameter withMin(double min) {
        this.min = min;
        return this;
    }

}
