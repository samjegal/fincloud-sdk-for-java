/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PortPluginDetailResponse model.
 */
public class PortPluginDetailResponse {
    /**
     * 포트 번호 리스트.
     */
    @JsonProperty(value = "configList")
    private List<Integer> configList;

    /**
     * 서버 인스턴스 번호.
     */
    @JsonProperty(value = "instanceNo")
    private String instanceNo;

    /**
     * Get 포트 번호 리스트.
     *
     * @return the configList value
     */
    public List<Integer> configList() {
        return this.configList;
    }

    /**
     * Set 포트 번호 리스트.
     *
     * @param configList the configList value to set
     * @return the PortPluginDetailResponse object itself.
     */
    public PortPluginDetailResponse withConfigList(List<Integer> configList) {
        this.configList = configList;
        return this;
    }

    /**
     * Get 서버 인스턴스 번호.
     *
     * @return the instanceNo value
     */
    public String instanceNo() {
        return this.instanceNo;
    }

    /**
     * Set 서버 인스턴스 번호.
     *
     * @param instanceNo the instanceNo value to set
     * @return the PortPluginDetailResponse object itself.
     */
    public PortPluginDetailResponse withInstanceNo(String instanceNo) {
        this.instanceNo = instanceNo;
        return this;
    }

}
