/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ServerTopMetricParameter model.
 */
public class ServerTopMetricParameter {
    /**
     * 호스트 이름.
     */
    @JsonProperty(value = "hostName")
    private String hostName;

    /**
     * 인스턴스 번호.
     */
    @JsonProperty(value = "instanceNo")
    private String instanceNo;

    /**
     * CPU 평균 사용량.
     */
    @JsonProperty(value = "avg_cpu_used_rto")
    private String avgCpuUsedRto;

    /**
     * 파일 시스템 사용량.
     */
    @JsonProperty(value = "avg_fs_usert")
    private String avgFsUsert;

    /**
     * 메모리 사용량.
     */
    @JsonProperty(value = "mem_usert")
    private String memUsert;

    /**
     * Get 호스트 이름.
     *
     * @return the hostName value
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Set 호스트 이름.
     *
     * @param hostName the hostName value to set
     * @return the ServerTopMetricParameter object itself.
     */
    public ServerTopMetricParameter withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * Get 인스턴스 번호.
     *
     * @return the instanceNo value
     */
    public String instanceNo() {
        return this.instanceNo;
    }

    /**
     * Set 인스턴스 번호.
     *
     * @param instanceNo the instanceNo value to set
     * @return the ServerTopMetricParameter object itself.
     */
    public ServerTopMetricParameter withInstanceNo(String instanceNo) {
        this.instanceNo = instanceNo;
        return this;
    }

    /**
     * Get cPU 평균 사용량.
     *
     * @return the avgCpuUsedRto value
     */
    public String avgCpuUsedRto() {
        return this.avgCpuUsedRto;
    }

    /**
     * Set cPU 평균 사용량.
     *
     * @param avgCpuUsedRto the avgCpuUsedRto value to set
     * @return the ServerTopMetricParameter object itself.
     */
    public ServerTopMetricParameter withAvgCpuUsedRto(String avgCpuUsedRto) {
        this.avgCpuUsedRto = avgCpuUsedRto;
        return this;
    }

    /**
     * Get 파일 시스템 사용량.
     *
     * @return the avgFsUsert value
     */
    public String avgFsUsert() {
        return this.avgFsUsert;
    }

    /**
     * Set 파일 시스템 사용량.
     *
     * @param avgFsUsert the avgFsUsert value to set
     * @return the ServerTopMetricParameter object itself.
     */
    public ServerTopMetricParameter withAvgFsUsert(String avgFsUsert) {
        this.avgFsUsert = avgFsUsert;
        return this;
    }

    /**
     * Get 메모리 사용량.
     *
     * @return the memUsert value
     */
    public String memUsert() {
        return this.memUsert;
    }

    /**
     * Set 메모리 사용량.
     *
     * @param memUsert the memUsert value to set
     * @return the ServerTopMetricParameter object itself.
     */
    public ServerTopMetricParameter withMemUsert(String memUsert) {
        this.memUsert = memUsert;
        return this;
    }

}
