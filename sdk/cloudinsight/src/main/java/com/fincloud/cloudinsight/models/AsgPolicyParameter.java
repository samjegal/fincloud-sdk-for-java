/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AsgPolicy.
 * Auto Scaling Group Policy.
 */
public class AsgPolicyParameter {
    /**
     * Auto Scaling Group id.
     */
    @JsonProperty(value = "autoScalingGroupNo")
    private Long autoScalingGroupNo;

    /**
     * Auto Scaling Policy id.
     */
    @JsonProperty(value = "autoScalingPolicyNo")
    private Long autoScalingPolicyNo;

    /**
     * Auto Scaling Policy name.
     */
    @JsonProperty(value = "policyName")
    private String policyName;

    /**
     * Get auto Scaling Group id.
     *
     * @return the autoScalingGroupNo value
     */
    public Long autoScalingGroupNo() {
        return this.autoScalingGroupNo;
    }

    /**
     * Set auto Scaling Group id.
     *
     * @param autoScalingGroupNo the autoScalingGroupNo value to set
     * @return the AsgPolicyParameter object itself.
     */
    public AsgPolicyParameter withAutoScalingGroupNo(Long autoScalingGroupNo) {
        this.autoScalingGroupNo = autoScalingGroupNo;
        return this;
    }

    /**
     * Get auto Scaling Policy id.
     *
     * @return the autoScalingPolicyNo value
     */
    public Long autoScalingPolicyNo() {
        return this.autoScalingPolicyNo;
    }

    /**
     * Set auto Scaling Policy id.
     *
     * @param autoScalingPolicyNo the autoScalingPolicyNo value to set
     * @return the AsgPolicyParameter object itself.
     */
    public AsgPolicyParameter withAutoScalingPolicyNo(Long autoScalingPolicyNo) {
        this.autoScalingPolicyNo = autoScalingPolicyNo;
        return this;
    }

    /**
     * Get auto Scaling Policy name.
     *
     * @return the policyName value
     */
    public String policyName() {
        return this.policyName;
    }

    /**
     * Set auto Scaling Policy name.
     *
     * @param policyName the policyName value to set
     * @return the AsgPolicyParameter object itself.
     */
    public AsgPolicyParameter withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

}
