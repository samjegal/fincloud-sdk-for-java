/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KubernetesClusterRequestParameter model.
 */
public class KubernetesClusterRequestParameter {
    /**
     * 클러스터 이름.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * 클러스터 타입.
     */
    @JsonProperty(value = "clusterType", required = true)
    private String clusterType;

    /**
     * 로그인 키 이름.
     */
    @JsonProperty(value = "loginKeyName", required = true)
    private String loginKeyName;

    /**
     * 쿠버네티스 버전.
     */
    @JsonProperty(value = "k8sVersion")
    private String k8sVersion;

    /**
     * region의 코드.
     */
    @JsonProperty(value = "regionCode", required = true)
    private String regionCode;

    /**
     * VPC 번호.
     */
    @JsonProperty(value = "vpcNo", required = true)
    private double vpcNo;

    /**
     * 서브넷 번호 목록.
     */
    @JsonProperty(value = "subnetNoList", required = true)
    private List<Double> subnetNoList;

    /**
     * 로드밸런서 전용 서브넷 번호.
     */
    @JsonProperty(value = "subnetLbNo", required = true)
    private double subnetLbNo;

    /**
     * 기본 노드풀.
     */
    @JsonProperty(value = "defaultNodePool", required = true)
    private KubernetesDefaultNodePoolParameter defaultNodePool;

    /**
     * 추가 노드풀.
     */
    @JsonProperty(value = "nodePool")
    private List<KubernetesNodePoolParametera> nodePool;

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
     * @return the KubernetesClusterRequestParameter object itself.
     */
    public KubernetesClusterRequestParameter withName(String name) {
        this.name = name;
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
     * @return the KubernetesClusterRequestParameter object itself.
     */
    public KubernetesClusterRequestParameter withClusterType(String clusterType) {
        this.clusterType = clusterType;
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
     * @return the KubernetesClusterRequestParameter object itself.
     */
    public KubernetesClusterRequestParameter withLoginKeyName(String loginKeyName) {
        this.loginKeyName = loginKeyName;
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
     * @return the KubernetesClusterRequestParameter object itself.
     */
    public KubernetesClusterRequestParameter withK8sVersion(String k8sVersion) {
        this.k8sVersion = k8sVersion;
        return this;
    }

    /**
     * Get region의 코드.
     *
     * @return the regionCode value
     */
    public String regionCode() {
        return this.regionCode;
    }

    /**
     * Set region의 코드.
     *
     * @param regionCode the regionCode value to set
     * @return the KubernetesClusterRequestParameter object itself.
     */
    public KubernetesClusterRequestParameter withRegionCode(String regionCode) {
        this.regionCode = regionCode;
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
     * @return the KubernetesClusterRequestParameter object itself.
     */
    public KubernetesClusterRequestParameter withVpcNo(double vpcNo) {
        this.vpcNo = vpcNo;
        return this;
    }

    /**
     * Get 서브넷 번호 목록.
     *
     * @return the subnetNoList value
     */
    public List<Double> subnetNoList() {
        return this.subnetNoList;
    }

    /**
     * Set 서브넷 번호 목록.
     *
     * @param subnetNoList the subnetNoList value to set
     * @return the KubernetesClusterRequestParameter object itself.
     */
    public KubernetesClusterRequestParameter withSubnetNoList(List<Double> subnetNoList) {
        this.subnetNoList = subnetNoList;
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
     * @return the KubernetesClusterRequestParameter object itself.
     */
    public KubernetesClusterRequestParameter withSubnetLbNo(double subnetLbNo) {
        this.subnetLbNo = subnetLbNo;
        return this;
    }

    /**
     * Get 기본 노드풀.
     *
     * @return the defaultNodePool value
     */
    public KubernetesDefaultNodePoolParameter defaultNodePool() {
        return this.defaultNodePool;
    }

    /**
     * Set 기본 노드풀.
     *
     * @param defaultNodePool the defaultNodePool value to set
     * @return the KubernetesClusterRequestParameter object itself.
     */
    public KubernetesClusterRequestParameter withDefaultNodePool(KubernetesDefaultNodePoolParameter defaultNodePool) {
        this.defaultNodePool = defaultNodePool;
        return this;
    }

    /**
     * Get 추가 노드풀.
     *
     * @return the nodePool value
     */
    public List<KubernetesNodePoolParametera> nodePool() {
        return this.nodePool;
    }

    /**
     * Set 추가 노드풀.
     *
     * @param nodePool the nodePool value to set
     * @return the KubernetesClusterRequestParameter object itself.
     */
    public KubernetesClusterRequestParameter withNodePool(List<KubernetesNodePoolParametera> nodePool) {
        this.nodePool = nodePool;
        return this;
    }

}
