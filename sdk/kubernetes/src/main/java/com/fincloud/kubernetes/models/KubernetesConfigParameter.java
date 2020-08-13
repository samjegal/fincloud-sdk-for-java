/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KubernetesConfigParameter model.
 */
public class KubernetesConfigParameter {
    /**
     * 쿠버네티스 설정 정보.
     */
    @JsonProperty(value = "kubeconfig")
    private String kubeconfig;

    /**
     * Get 쿠버네티스 설정 정보.
     *
     * @return the kubeconfig value
     */
    public String kubeconfig() {
        return this.kubeconfig;
    }

    /**
     * Set 쿠버네티스 설정 정보.
     *
     * @param kubeconfig the kubeconfig value to set
     * @return the KubernetesConfigParameter object itself.
     */
    public KubernetesConfigParameter withKubeconfig(String kubeconfig) {
        this.kubeconfig = kubeconfig;
        return this;
    }

}
