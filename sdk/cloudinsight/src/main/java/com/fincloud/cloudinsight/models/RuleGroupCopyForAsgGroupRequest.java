/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CopyRuleForAsgDto.
 * Copy asg rule information.
 */
public class RuleGroupCopyForAsgGroupRequest {
    /**
     * New asg groupNo.
     */
    @JsonProperty(value = "newAsgGroupNo", required = true)
    private long newAsgGroupNo;

    /**
     * New asg policyNo.
     */
    @JsonProperty(value = "newAsgPolicyNo", required = true)
    private long newAsgPolicyNo;

    /**
     * Proto asg groupNo.
     */
    @JsonProperty(value = "protoAsgGroupNo", required = true)
    private long protoAsgGroupNo;

    /**
     * Proto asg policyNo.
     */
    @JsonProperty(value = "protoAsgPolicyNo", required = true)
    private long protoAsgPolicyNo;

    /**
     * Get new asg groupNo.
     *
     * @return the newAsgGroupNo value
     */
    public long newAsgGroupNo() {
        return this.newAsgGroupNo;
    }

    /**
     * Set new asg groupNo.
     *
     * @param newAsgGroupNo the newAsgGroupNo value to set
     * @return the RuleGroupCopyForAsgGroupRequest object itself.
     */
    public RuleGroupCopyForAsgGroupRequest withNewAsgGroupNo(long newAsgGroupNo) {
        this.newAsgGroupNo = newAsgGroupNo;
        return this;
    }

    /**
     * Get new asg policyNo.
     *
     * @return the newAsgPolicyNo value
     */
    public long newAsgPolicyNo() {
        return this.newAsgPolicyNo;
    }

    /**
     * Set new asg policyNo.
     *
     * @param newAsgPolicyNo the newAsgPolicyNo value to set
     * @return the RuleGroupCopyForAsgGroupRequest object itself.
     */
    public RuleGroupCopyForAsgGroupRequest withNewAsgPolicyNo(long newAsgPolicyNo) {
        this.newAsgPolicyNo = newAsgPolicyNo;
        return this;
    }

    /**
     * Get proto asg groupNo.
     *
     * @return the protoAsgGroupNo value
     */
    public long protoAsgGroupNo() {
        return this.protoAsgGroupNo;
    }

    /**
     * Set proto asg groupNo.
     *
     * @param protoAsgGroupNo the protoAsgGroupNo value to set
     * @return the RuleGroupCopyForAsgGroupRequest object itself.
     */
    public RuleGroupCopyForAsgGroupRequest withProtoAsgGroupNo(long protoAsgGroupNo) {
        this.protoAsgGroupNo = protoAsgGroupNo;
        return this;
    }

    /**
     * Get proto asg policyNo.
     *
     * @return the protoAsgPolicyNo value
     */
    public long protoAsgPolicyNo() {
        return this.protoAsgPolicyNo;
    }

    /**
     * Set proto asg policyNo.
     *
     * @param protoAsgPolicyNo the protoAsgPolicyNo value to set
     * @return the RuleGroupCopyForAsgGroupRequest object itself.
     */
    public RuleGroupCopyForAsgGroupRequest withProtoAsgPolicyNo(long protoAsgPolicyNo) {
        this.protoAsgPolicyNo = protoAsgPolicyNo;
        return this;
    }

}
