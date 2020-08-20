/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MonitorGroupItem.
 * 감시 대상.
 */
public class MonitorGroupItemParameter {
    /**
     * NRN이란 네이버 클라우드 플랫폼의 모든 리소스를 일정한 규칙으로 표현하기 위한 정보이며 상품별로 구성요소가 다를 수 있습니다.
     */
    @JsonProperty(value = "nrn")
    private String nrn;

    /**
     * 감시 대상 Id.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Get nRN이란 네이버 클라우드 플랫폼의 모든 리소스를 일정한 규칙으로 표현하기 위한 정보이며 상품별로 구성요소가 다를 수 있습니다.
     *
     * @return the nrn value
     */
    public String nrn() {
        return this.nrn;
    }

    /**
     * Set nRN이란 네이버 클라우드 플랫폼의 모든 리소스를 일정한 규칙으로 표현하기 위한 정보이며 상품별로 구성요소가 다를 수 있습니다.
     *
     * @param nrn the nrn value to set
     * @return the MonitorGroupItemParameter object itself.
     */
    public MonitorGroupItemParameter withNrn(String nrn) {
        this.nrn = nrn;
        return this;
    }

    /**
     * Get 감시 대상 Id.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set 감시 대상 Id.
     *
     * @param resourceId the resourceId value to set
     * @return the MonitorGroupItemParameter object itself.
     */
    public MonitorGroupItemParameter withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

}
