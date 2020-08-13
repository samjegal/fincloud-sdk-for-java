/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CloudInsightDimensionResultParameter model.
 */
public class CloudInsightDimensionResultParameter {
    /**
     * Dimension 타입. Possible values include: 'cpu', 'disk', 'fs', 'memory',
     * 'ntwk', 'process', 'svr', 'plugin_process', 'plugin_file',
     * 'plugin_port', 'agent'.
     */
    @JsonProperty(value = "type")
    private DimensionType type;

    /**
     * 서버 인스턴스.
     */
    @JsonProperty(value = "instanceNo")
    private String instanceNo;

    /**
     * CPU 인덱스.
     */
    @JsonProperty(value = "cpu_idx")
    private String cpuIdx;

    /**
     * 디스크 인덱스.
     */
    @JsonProperty(value = "disk_idx")
    private String diskIdx;

    /**
     * 파일시스템 마운트 정보.
     */
    @JsonProperty(value = "mnt_nm")
    private String mntNm;

    /**
     * 네트워크 인터페이스 정보.
     */
    @JsonProperty(value = "nic_desc")
    private String nicDesc;

    /**
     * 프로세스 이름.
     */
    @JsonProperty(value = "proc_name")
    private String procName;

    /**
     * 프로세스 경로.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * 포트 번호.
     */
    @JsonProperty(value = "port")
    private String port;

    /**
     * 로드밸런서 주소.
     */
    @JsonProperty(value = "loadBalancerAddress")
    private String loadBalancerAddress;

    /**
     * 로드밸런서 포트.
     */
    @JsonProperty(value = "loadBalancerPort")
    private String loadBalancerPort;

    /**
     * 인스턴스 번호.
     */
    @JsonProperty(value = "instanceId")
    private String instanceId;

    /**
     * 로드밸런서 이름.
     */
    @JsonProperty(value = "loadBalancerName")
    private String loadBalancerName;

    /**
     * 네트워크 타입.
     */
    @JsonProperty(value = "networkType")
    private String networkType;

    /**
     * 로드밸런서 레이어 타입.
     */
    @JsonProperty(value = "layerType")
    private String layerType;

    /**
     * 오토 스케일링 그룹 번호.
     */
    @JsonProperty(value = "autoScalingGroupNo")
    private String autoScalingGroupNo;

    /**
     * Get dimension 타입. Possible values include: 'cpu', 'disk', 'fs', 'memory', 'ntwk', 'process', 'svr', 'plugin_process', 'plugin_file', 'plugin_port', 'agent'.
     *
     * @return the type value
     */
    public DimensionType type() {
        return this.type;
    }

    /**
     * Set dimension 타입. Possible values include: 'cpu', 'disk', 'fs', 'memory', 'ntwk', 'process', 'svr', 'plugin_process', 'plugin_file', 'plugin_port', 'agent'.
     *
     * @param type the type value to set
     * @return the CloudInsightDimensionResultParameter object itself.
     */
    public CloudInsightDimensionResultParameter withType(DimensionType type) {
        this.type = type;
        return this;
    }

    /**
     * Get 서버 인스턴스.
     *
     * @return the instanceNo value
     */
    public String instanceNo() {
        return this.instanceNo;
    }

    /**
     * Set 서버 인스턴스.
     *
     * @param instanceNo the instanceNo value to set
     * @return the CloudInsightDimensionResultParameter object itself.
     */
    public CloudInsightDimensionResultParameter withInstanceNo(String instanceNo) {
        this.instanceNo = instanceNo;
        return this;
    }

    /**
     * Get cPU 인덱스.
     *
     * @return the cpuIdx value
     */
    public String cpuIdx() {
        return this.cpuIdx;
    }

    /**
     * Set cPU 인덱스.
     *
     * @param cpuIdx the cpuIdx value to set
     * @return the CloudInsightDimensionResultParameter object itself.
     */
    public CloudInsightDimensionResultParameter withCpuIdx(String cpuIdx) {
        this.cpuIdx = cpuIdx;
        return this;
    }

    /**
     * Get 디스크 인덱스.
     *
     * @return the diskIdx value
     */
    public String diskIdx() {
        return this.diskIdx;
    }

    /**
     * Set 디스크 인덱스.
     *
     * @param diskIdx the diskIdx value to set
     * @return the CloudInsightDimensionResultParameter object itself.
     */
    public CloudInsightDimensionResultParameter withDiskIdx(String diskIdx) {
        this.diskIdx = diskIdx;
        return this;
    }

    /**
     * Get 파일시스템 마운트 정보.
     *
     * @return the mntNm value
     */
    public String mntNm() {
        return this.mntNm;
    }

    /**
     * Set 파일시스템 마운트 정보.
     *
     * @param mntNm the mntNm value to set
     * @return the CloudInsightDimensionResultParameter object itself.
     */
    public CloudInsightDimensionResultParameter withMntNm(String mntNm) {
        this.mntNm = mntNm;
        return this;
    }

    /**
     * Get 네트워크 인터페이스 정보.
     *
     * @return the nicDesc value
     */
    public String nicDesc() {
        return this.nicDesc;
    }

    /**
     * Set 네트워크 인터페이스 정보.
     *
     * @param nicDesc the nicDesc value to set
     * @return the CloudInsightDimensionResultParameter object itself.
     */
    public CloudInsightDimensionResultParameter withNicDesc(String nicDesc) {
        this.nicDesc = nicDesc;
        return this;
    }

    /**
     * Get 프로세스 이름.
     *
     * @return the procName value
     */
    public String procName() {
        return this.procName;
    }

    /**
     * Set 프로세스 이름.
     *
     * @param procName the procName value to set
     * @return the CloudInsightDimensionResultParameter object itself.
     */
    public CloudInsightDimensionResultParameter withProcName(String procName) {
        this.procName = procName;
        return this;
    }

    /**
     * Get 프로세스 경로.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set 프로세스 경로.
     *
     * @param path the path value to set
     * @return the CloudInsightDimensionResultParameter object itself.
     */
    public CloudInsightDimensionResultParameter withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get 포트 번호.
     *
     * @return the port value
     */
    public String port() {
        return this.port;
    }

    /**
     * Set 포트 번호.
     *
     * @param port the port value to set
     * @return the CloudInsightDimensionResultParameter object itself.
     */
    public CloudInsightDimensionResultParameter withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * Get 로드밸런서 주소.
     *
     * @return the loadBalancerAddress value
     */
    public String loadBalancerAddress() {
        return this.loadBalancerAddress;
    }

    /**
     * Set 로드밸런서 주소.
     *
     * @param loadBalancerAddress the loadBalancerAddress value to set
     * @return the CloudInsightDimensionResultParameter object itself.
     */
    public CloudInsightDimensionResultParameter withLoadBalancerAddress(String loadBalancerAddress) {
        this.loadBalancerAddress = loadBalancerAddress;
        return this;
    }

    /**
     * Get 로드밸런서 포트.
     *
     * @return the loadBalancerPort value
     */
    public String loadBalancerPort() {
        return this.loadBalancerPort;
    }

    /**
     * Set 로드밸런서 포트.
     *
     * @param loadBalancerPort the loadBalancerPort value to set
     * @return the CloudInsightDimensionResultParameter object itself.
     */
    public CloudInsightDimensionResultParameter withLoadBalancerPort(String loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
        return this;
    }

    /**
     * Get 인스턴스 번호.
     *
     * @return the instanceId value
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Set 인스턴스 번호.
     *
     * @param instanceId the instanceId value to set
     * @return the CloudInsightDimensionResultParameter object itself.
     */
    public CloudInsightDimensionResultParameter withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Get 로드밸런서 이름.
     *
     * @return the loadBalancerName value
     */
    public String loadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * Set 로드밸런서 이름.
     *
     * @param loadBalancerName the loadBalancerName value to set
     * @return the CloudInsightDimensionResultParameter object itself.
     */
    public CloudInsightDimensionResultParameter withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * Get 네트워크 타입.
     *
     * @return the networkType value
     */
    public String networkType() {
        return this.networkType;
    }

    /**
     * Set 네트워크 타입.
     *
     * @param networkType the networkType value to set
     * @return the CloudInsightDimensionResultParameter object itself.
     */
    public CloudInsightDimensionResultParameter withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * Get 로드밸런서 레이어 타입.
     *
     * @return the layerType value
     */
    public String layerType() {
        return this.layerType;
    }

    /**
     * Set 로드밸런서 레이어 타입.
     *
     * @param layerType the layerType value to set
     * @return the CloudInsightDimensionResultParameter object itself.
     */
    public CloudInsightDimensionResultParameter withLayerType(String layerType) {
        this.layerType = layerType;
        return this;
    }

    /**
     * Get 오토 스케일링 그룹 번호.
     *
     * @return the autoScalingGroupNo value
     */
    public String autoScalingGroupNo() {
        return this.autoScalingGroupNo;
    }

    /**
     * Set 오토 스케일링 그룹 번호.
     *
     * @param autoScalingGroupNo the autoScalingGroupNo value to set
     * @return the CloudInsightDimensionResultParameter object itself.
     */
    public CloudInsightDimensionResultParameter withAutoScalingGroupNo(String autoScalingGroupNo) {
        this.autoScalingGroupNo = autoScalingGroupNo;
        return this;
    }

}
