/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KubernetesClusterParamter model.
 */
public class KubernetesClusterParamter {
    /**
     * 클러스터 UUID.
     */
    @JsonProperty(value = "uuid", required = true)
    private String uuid;

    /**
     * 클러스터 ACG 이름.
     */
    @JsonProperty(value = "acgName", required = true)
    private String acgName;

    /**
     * 클러스터 이름.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * 클러스터 용량.
     */
    @JsonProperty(value = "capacity", required = true)
    private String capacity;

    /**
     * 클러스터 타입.
     */
    @JsonProperty(value = "clusterType", required = true)
    private String clusterType;

    /**
     * 등록된 노드 총 개수.
     */
    @JsonProperty(value = "nodeCount", required = true)
    private double nodeCount;

    /**
     * 사용할 수 있는 노드의 최대 개수.
     */
    @JsonProperty(value = "nodeMaxCount", required = true)
    private double nodeMaxCount;

    /**
     * cpu 개수.
     */
    @JsonProperty(value = "cpuCount", required = true)
    private double cpuCount;

    /**
     * 메모리 용량.
     */
    @JsonProperty(value = "memorySize", required = true)
    private double memorySize;

    /**
     * 생성 일자.
     */
    @JsonProperty(value = "createdAt", required = true)
    private String createdAt;

    /**
     * Control Plane API 주소.
     */
    @JsonProperty(value = "endpoint", required = true)
    private String endpoint;

    /**
     * 쿠버네티스 버전.
     */
    @JsonProperty(value = "k8sVersion", required = true)
    private String k8sVersion;

    /**
     * 리전 코드.
     */
    @JsonProperty(value = "regionCode", required = true)
    private String regionCode;

    /**
     * 클러스터의 상태.
     */
    @JsonProperty(value = "status", required = true)
    private String status;

    /**
     * 로드밸런서 전용 서브넷 이름.
     */
    @JsonProperty(value = "subnetLbName", required = true)
    private String subnetLbName;

    /**
     * 로드밸런서 전용 서브넷 번호.
     */
    @JsonProperty(value = "subnetLbNo", required = true)
    private double subnetLbNo;

    /**
     * 서브넷 이름.
     */
    @JsonProperty(value = "subnetName", required = true)
    private String subnetName;

    /**
     * 서브넷 번호 목록.
     */
    @JsonProperty(value = "subnetNoList", required = true)
    private List<String> subnetNoList;

    /**
     * 최근 업데이트 일자.
     */
    @JsonProperty(value = "updatedAt", required = true)
    private String updatedAt;

    /**
     * VCP 이름.
     */
    @JsonProperty(value = "vpcName", required = true)
    private String vpcName;

    /**
     * VPC 번호.
     */
    @JsonProperty(value = "vpcNo", required = true)
    private double vpcNo;

    /**
     * 금융존 코드.
     */
    @JsonProperty(value = "zoneCode", required = true)
    private String zoneCode;

    /**
     * 로그인 키 이름.
     */
    @JsonProperty(value = "loginKeyName", required = true)
    private String loginKeyName;

    /**
     * 노드풀.
     */
    @JsonProperty(value = "nodePool", required = true)
    private List<KubernetesNodePoolResponseParameter> nodePool;

    /**
     * Get 클러스터 UUID.
     *
     * @return the uuid value
     */
    public String uuid() {
        return this.uuid;
    }

    /**
     * Set 클러스터 UUID.
     *
     * @param uuid the uuid value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Get 클러스터 ACG 이름.
     *
     * @return the acgName value
     */
    public String acgName() {
        return this.acgName;
    }

    /**
     * Set 클러스터 ACG 이름.
     *
     * @param acgName the acgName value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withAcgName(String acgName) {
        this.acgName = acgName;
        return this;
    }

    /**
     * Get 클러스터 이름.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set 클러스터 이름.
     *
     * @param name the name value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get 클러스터 용량.
     *
     * @return the capacity value
     */
    public String capacity() {
        return this.capacity;
    }

    /**
     * Set 클러스터 용량.
     *
     * @param capacity the capacity value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get 클러스터 타입.
     *
     * @return the clusterType value
     */
    public String clusterType() {
        return this.clusterType;
    }

    /**
     * Set 클러스터 타입.
     *
     * @param clusterType the clusterType value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * Get 등록된 노드 총 개수.
     *
     * @return the nodeCount value
     */
    public double nodeCount() {
        return this.nodeCount;
    }

    /**
     * Set 등록된 노드 총 개수.
     *
     * @param nodeCount the nodeCount value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withNodeCount(double nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * Get 사용할 수 있는 노드의 최대 개수.
     *
     * @return the nodeMaxCount value
     */
    public double nodeMaxCount() {
        return this.nodeMaxCount;
    }

    /**
     * Set 사용할 수 있는 노드의 최대 개수.
     *
     * @param nodeMaxCount the nodeMaxCount value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withNodeMaxCount(double nodeMaxCount) {
        this.nodeMaxCount = nodeMaxCount;
        return this;
    }

    /**
     * Get cpu 개수.
     *
     * @return the cpuCount value
     */
    public double cpuCount() {
        return this.cpuCount;
    }

    /**
     * Set cpu 개수.
     *
     * @param cpuCount the cpuCount value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withCpuCount(double cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    /**
     * Get 메모리 용량.
     *
     * @return the memorySize value
     */
    public double memorySize() {
        return this.memorySize;
    }

    /**
     * Set 메모리 용량.
     *
     * @param memorySize the memorySize value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withMemorySize(double memorySize) {
        this.memorySize = memorySize;
        return this;
    }

    /**
     * Get 생성 일자.
     *
     * @return the createdAt value
     */
    public String createdAt() {
        return this.createdAt;
    }

    /**
     * Set 생성 일자.
     *
     * @param createdAt the createdAt value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get control Plane API 주소.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set control Plane API 주소.
     *
     * @param endpoint the endpoint value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get 쿠버네티스 버전.
     *
     * @return the k8sVersion value
     */
    public String k8sVersion() {
        return this.k8sVersion;
    }

    /**
     * Set 쿠버네티스 버전.
     *
     * @param k8sVersion the k8sVersion value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withK8sVersion(String k8sVersion) {
        this.k8sVersion = k8sVersion;
        return this;
    }

    /**
     * Get 리전 코드.
     *
     * @return the regionCode value
     */
    public String regionCode() {
        return this.regionCode;
    }

    /**
     * Set 리전 코드.
     *
     * @param regionCode the regionCode value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * Get 클러스터의 상태.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set 클러스터의 상태.
     *
     * @param status the status value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get 로드밸런서 전용 서브넷 이름.
     *
     * @return the subnetLbName value
     */
    public String subnetLbName() {
        return this.subnetLbName;
    }

    /**
     * Set 로드밸런서 전용 서브넷 이름.
     *
     * @param subnetLbName the subnetLbName value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withSubnetLbName(String subnetLbName) {
        this.subnetLbName = subnetLbName;
        return this;
    }

    /**
     * Get 로드밸런서 전용 서브넷 번호.
     *
     * @return the subnetLbNo value
     */
    public double subnetLbNo() {
        return this.subnetLbNo;
    }

    /**
     * Set 로드밸런서 전용 서브넷 번호.
     *
     * @param subnetLbNo the subnetLbNo value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withSubnetLbNo(double subnetLbNo) {
        this.subnetLbNo = subnetLbNo;
        return this;
    }

    /**
     * Get 서브넷 이름.
     *
     * @return the subnetName value
     */
    public String subnetName() {
        return this.subnetName;
    }

    /**
     * Set 서브넷 이름.
     *
     * @param subnetName the subnetName value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /**
     * Get 서브넷 번호 목록.
     *
     * @return the subnetNoList value
     */
    public List<String> subnetNoList() {
        return this.subnetNoList;
    }

    /**
     * Set 서브넷 번호 목록.
     *
     * @param subnetNoList the subnetNoList value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withSubnetNoList(List<String> subnetNoList) {
        this.subnetNoList = subnetNoList;
        return this;
    }

    /**
     * Get 최근 업데이트 일자.
     *
     * @return the updatedAt value
     */
    public String updatedAt() {
        return this.updatedAt;
    }

    /**
     * Set 최근 업데이트 일자.
     *
     * @param updatedAt the updatedAt value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get vCP 이름.
     *
     * @return the vpcName value
     */
    public String vpcName() {
        return this.vpcName;
    }

    /**
     * Set vCP 이름.
     *
     * @param vpcName the vpcName value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * Get vPC 번호.
     *
     * @return the vpcNo value
     */
    public double vpcNo() {
        return this.vpcNo;
    }

    /**
     * Set vPC 번호.
     *
     * @param vpcNo the vpcNo value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withVpcNo(double vpcNo) {
        this.vpcNo = vpcNo;
        return this;
    }

    /**
     * Get 금융존 코드.
     *
     * @return the zoneCode value
     */
    public String zoneCode() {
        return this.zoneCode;
    }

    /**
     * Set 금융존 코드.
     *
     * @param zoneCode the zoneCode value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
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
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withLoginKeyName(String loginKeyName) {
        this.loginKeyName = loginKeyName;
        return this;
    }

    /**
     * Get 노드풀.
     *
     * @return the nodePool value
     */
    public List<KubernetesNodePoolResponseParameter> nodePool() {
        return this.nodePool;
    }

    /**
     * Set 노드풀.
     *
     * @param nodePool the nodePool value to set
     * @return the KubernetesClusterParamter object itself.
     */
    public KubernetesClusterParamter withNodePool(List<KubernetesNodePoolResponseParameter> nodePool) {
        this.nodePool = nodePool;
        return this;
    }

}
