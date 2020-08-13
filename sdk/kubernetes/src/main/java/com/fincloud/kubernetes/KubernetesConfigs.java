/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes;

import com.fincloud.kubernetes.models.KubernetesConfigParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in KubernetesConfigs.
 */
public interface KubernetesConfigs {
    /**
     * KubeConfig 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the KubernetesConfigParameter object if successful.
     */
    KubernetesConfigParameter get(String uuid);

    /**
     * KubeConfig 조회.
     *
     * @param uuid 클러스터 UUID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<KubernetesConfigParameter> getAsync(String uuid, final ServiceCallback<KubernetesConfigParameter> serviceCallback);

    /**
     * KubeConfig 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesConfigParameter object
     */
    Observable<KubernetesConfigParameter> getAsync(String uuid);

    /**
     * KubeConfig 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesConfigParameter object
     */
    Observable<ServiceResponse<KubernetesConfigParameter>> getWithServiceResponseAsync(String uuid);

    /**
     * KubeConfig 재설정.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void reset(String uuid);

    /**
     * KubeConfig 재설정.
     *
     * @param uuid 클러스터 UUID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> resetAsync(String uuid, final ServiceCallback<Void> serviceCallback);

    /**
     * KubeConfig 재설정.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> resetAsync(String uuid);

    /**
     * KubeConfig 재설정.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> resetWithServiceResponseAsync(String uuid);

}
