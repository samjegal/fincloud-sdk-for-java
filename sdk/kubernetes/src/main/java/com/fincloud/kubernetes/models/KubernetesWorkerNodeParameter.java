/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KubernetesWorkerNodeParameter model.
 */
public class KubernetesWorkerNodeParameter {
    /**
     * 워커노드 ID.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * 워커노드 이름.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * 워커노드 서버이름.
     */
    @JsonProperty(value = "serverName", required = true)
    private String serverName;

    /**
     * 워커노드 서버 스펙.
     */
    @JsonProperty(value = "serverSpec", required = true)
    private String serverSpec;

    /**
     * 비공인 IP.
     */
    @JsonProperty(value = "privateIp", required = true)
    private String privateIp;

    /**
     * 공인 IP.
     */
    @JsonProperty(value = "publicIp", required = true)
    private String publicIp;

    /**
     * 반납 보호 설정.
     */
    @JsonProperty(value = "returnProtectionYn", required = true)
    private String returnProtectionYn;

    /**
     * 워커노드 현재 상태.
     */
    @JsonProperty(value = "status", required = true)
    private String status;

    /**
     * 상태 코드.
     */
    @JsonProperty(value = "statusCode", required = true)
    private String statusCode;

    /**
     * 상태 아이콘.
     */
    @JsonProperty(value = "statusIcon", required = true)
    private String statusIcon;

    /**
     * 상태 색깔.
     */
    @JsonProperty(value = "statusColor", required = true)
    private String statusColor;

    /**
     * 상태 이름.
     */
    @JsonProperty(value = "statusName", required = true)
    private String statusName;

    /**
     * 서버 이미지 이름.
     */
    @JsonProperty(value = "serverImageName", required = true)
    private String serverImageName;

    /**
     * CPU 개수.
     */
    @JsonProperty(value = "cpuCount", required = true)
    private double cpuCount;

    /**
     * 총 메모리 용량.
     */
    @JsonProperty(value = "memorySize", required = true)
    private double memorySize;

    /**
     * 스펙 코드.
     */
    @JsonProperty(value = "specCode", required = true)
    private String specCode;

    /**
     * 로그인 키 이름.
     */
    @JsonProperty(value = "loginKeyName", required = true)
    private String loginKeyName;

    /**
     * 쿠버네티스 상태.
     */
    @JsonProperty(value = "k8sStatus", required = true)
    private String k8sStatus;

    /**
     * 도커 버전.
     */
    @JsonProperty(value = "dockerVersion", required = true)
    private String dockerVersion;

    /**
     * 커널 버전.
     */
    @JsonProperty(value = "kernelVersion", required = true)
    private String kernelVersion;

    /**
     * 노드풀 이름.
     */
    @JsonProperty(value = "nodePoolName", required = true)
    private String nodePoolName;

    /**
     * Get 워커노드 ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set 워커노드 ID.
     *
     * @param id the id value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get 워커노드 이름.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set 워커노드 이름.
     *
     * @param name the name value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get 워커노드 서버이름.
     *
     * @return the serverName value
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Set 워커노드 서버이름.
     *
     * @param serverName the serverName value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get 워커노드 서버 스펙.
     *
     * @return the serverSpec value
     */
    public String serverSpec() {
        return this.serverSpec;
    }

    /**
     * Set 워커노드 서버 스펙.
     *
     * @param serverSpec the serverSpec value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withServerSpec(String serverSpec) {
        this.serverSpec = serverSpec;
        return this;
    }

    /**
     * Get 비공인 IP.
     *
     * @return the privateIp value
     */
    public String privateIp() {
        return this.privateIp;
    }

    /**
     * Set 비공인 IP.
     *
     * @param privateIp the privateIp value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * Get 공인 IP.
     *
     * @return the publicIp value
     */
    public String publicIp() {
        return this.publicIp;
    }

    /**
     * Set 공인 IP.
     *
     * @param publicIp the publicIp value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * Get 반납 보호 설정.
     *
     * @return the returnProtectionYn value
     */
    public String returnProtectionYn() {
        return this.returnProtectionYn;
    }

    /**
     * Set 반납 보호 설정.
     *
     * @param returnProtectionYn the returnProtectionYn value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withReturnProtectionYn(String returnProtectionYn) {
        this.returnProtectionYn = returnProtectionYn;
        return this;
    }

    /**
     * Get 워커노드 현재 상태.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set 워커노드 현재 상태.
     *
     * @param status the status value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get 상태 코드.
     *
     * @return the statusCode value
     */
    public String statusCode() {
        return this.statusCode;
    }

    /**
     * Set 상태 코드.
     *
     * @param statusCode the statusCode value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get 상태 아이콘.
     *
     * @return the statusIcon value
     */
    public String statusIcon() {
        return this.statusIcon;
    }

    /**
     * Set 상태 아이콘.
     *
     * @param statusIcon the statusIcon value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withStatusIcon(String statusIcon) {
        this.statusIcon = statusIcon;
        return this;
    }

    /**
     * Get 상태 색깔.
     *
     * @return the statusColor value
     */
    public String statusColor() {
        return this.statusColor;
    }

    /**
     * Set 상태 색깔.
     *
     * @param statusColor the statusColor value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withStatusColor(String statusColor) {
        this.statusColor = statusColor;
        return this;
    }

    /**
     * Get 상태 이름.
     *
     * @return the statusName value
     */
    public String statusName() {
        return this.statusName;
    }

    /**
     * Set 상태 이름.
     *
     * @param statusName the statusName value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withStatusName(String statusName) {
        this.statusName = statusName;
        return this;
    }

    /**
     * Get 서버 이미지 이름.
     *
     * @return the serverImageName value
     */
    public String serverImageName() {
        return this.serverImageName;
    }

    /**
     * Set 서버 이미지 이름.
     *
     * @param serverImageName the serverImageName value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withServerImageName(String serverImageName) {
        this.serverImageName = serverImageName;
        return this;
    }

    /**
     * Get cPU 개수.
     *
     * @return the cpuCount value
     */
    public double cpuCount() {
        return this.cpuCount;
    }

    /**
     * Set cPU 개수.
     *
     * @param cpuCount the cpuCount value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withCpuCount(double cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    /**
     * Get 총 메모리 용량.
     *
     * @return the memorySize value
     */
    public double memorySize() {
        return this.memorySize;
    }

    /**
     * Set 총 메모리 용량.
     *
     * @param memorySize the memorySize value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withMemorySize(double memorySize) {
        this.memorySize = memorySize;
        return this;
    }

    /**
     * Get 스펙 코드.
     *
     * @return the specCode value
     */
    public String specCode() {
        return this.specCode;
    }

    /**
     * Set 스펙 코드.
     *
     * @param specCode the specCode value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * Get 로그인 키 이름.
     *
     * @return the loginKeyName value
     */
    public String loginKeyName() {
        return this.loginKeyName;
    }

    /**
     * Set 로그인 키 이름.
     *
     * @param loginKeyName the loginKeyName value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withLoginKeyName(String loginKeyName) {
        this.loginKeyName = loginKeyName;
        return this;
    }

    /**
     * Get 쿠버네티스 상태.
     *
     * @return the k8sStatus value
     */
    public String k8sStatus() {
        return this.k8sStatus;
    }

    /**
     * Set 쿠버네티스 상태.
     *
     * @param k8sStatus the k8sStatus value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withK8sStatus(String k8sStatus) {
        this.k8sStatus = k8sStatus;
        return this;
    }

    /**
     * Get 도커 버전.
     *
     * @return the dockerVersion value
     */
    public String dockerVersion() {
        return this.dockerVersion;
    }

    /**
     * Set 도커 버전.
     *
     * @param dockerVersion the dockerVersion value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withDockerVersion(String dockerVersion) {
        this.dockerVersion = dockerVersion;
        return this;
    }

    /**
     * Get 커널 버전.
     *
     * @return the kernelVersion value
     */
    public String kernelVersion() {
        return this.kernelVersion;
    }

    /**
     * Set 커널 버전.
     *
     * @param kernelVersion the kernelVersion value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }

    /**
     * Get 노드풀 이름.
     *
     * @return the nodePoolName value
     */
    public String nodePoolName() {
        return this.nodePoolName;
    }

    /**
     * Set 노드풀 이름.
     *
     * @param nodePoolName the nodePoolName value to set
     * @return the KubernetesWorkerNodeParameter object itself.
     */
    public KubernetesWorkerNodeParameter withNodePoolName(String nodePoolName) {
        this.nodePoolName = nodePoolName;
        return this;
    }

}
