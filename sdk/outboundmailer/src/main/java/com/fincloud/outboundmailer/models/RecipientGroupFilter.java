/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 수신자 그룹 조합 필터.
 */
public class RecipientGroupFilter {
    /**
     * AND 조합 여부 (true : AND 조합, false : OR 조합).
     */
    @JsonProperty(value = "andFilter", required = true)
    private boolean andFilter;

    /**
     * 수신자 그룹명 목록.
     */
    @JsonProperty(value = "groups", required = true)
    private List<String> groups;

    /**
     * Get aND 조합 여부 (true : AND 조합, false : OR 조합).
     *
     * @return the andFilter value
     */
    public boolean andFilter() {
        return this.andFilter;
    }

    /**
     * Set aND 조합 여부 (true : AND 조합, false : OR 조합).
     *
     * @param andFilter the andFilter value to set
     * @return the RecipientGroupFilter object itself.
     */
    public RecipientGroupFilter withAndFilter(boolean andFilter) {
        this.andFilter = andFilter;
        return this;
    }

    /**
     * Get 수신자 그룹명 목록.
     *
     * @return the groups value
     */
    public List<String> groups() {
        return this.groups;
    }

    /**
     * Set 수신자 그룹명 목록.
     *
     * @param groups the groups value to set
     * @return the RecipientGroupFilter object itself.
     */
    public RecipientGroupFilter withGroups(List<String> groups) {
        this.groups = groups;
        return this;
    }

}
