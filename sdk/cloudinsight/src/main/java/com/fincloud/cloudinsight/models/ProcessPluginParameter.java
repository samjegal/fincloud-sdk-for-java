/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ProcessPluginParameter model.
 */
public class ProcessPluginParameter {
    /**
     * 프로세스 이름.
     */
    @JsonProperty(value = "configList")
    private List<String> configList;

    /**
     * 서버 인스턴스 번호.
     */
    @JsonProperty(value = "instanceNo")
    private String instanceNo;

    /**
     * Get 프로세스 이름.
     *
     * @return the configList value
     */
    public List<String> configList() {
        return this.configList;
    }

    /**
     * Set 프로세스 이름.
     *
     * @param configList the configList value to set
     * @return the ProcessPluginParameter object itself.
     */
    public ProcessPluginParameter withConfigList(List<String> configList) {
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
     * @return the ProcessPluginParameter object itself.
     */
    public ProcessPluginParameter withInstanceNo(String instanceNo) {
        this.instanceNo = instanceNo;
        return this;
    }

}
