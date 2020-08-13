/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes;

import com.fincloud.kubernetes.models.KubernetesClusterRequestParameter;
import com.fincloud.kubernetes.models.KubernetesClusterResponseParameter;
import com.fincloud.kubernetes.models.KubernetesClustersListParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in KubernetesClusters.
 */
public interface KubernetesClusters {
    /**
     * 클러스터 목록 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the KubernetesClustersListParameter object if successful.
     */
    KubernetesClustersListParameter list();

    /**
     * 클러스터 목록 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<KubernetesClustersListParameter> listAsync(final ServiceCallback<KubernetesClustersListParameter> serviceCallback);

    /**
     * 클러스터 목록 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesClustersListParameter object
     */
    Observable<KubernetesClustersListParameter> listAsync();

    /**
     * 클러스터 목록 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesClustersListParameter object
     */
    Observable<ServiceResponse<KubernetesClustersListParameter>> listWithServiceResponseAsync();

    /**
     * 클러스터 생성.
     *
     * @param parameters 클러스터 생성 파라미터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create(KubernetesClusterRequestParameter parameters);

    /**
     * 클러스터 생성.
     *
     * @param parameters 클러스터 생성 파라미터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(KubernetesClusterRequestParameter parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * 클러스터 생성.
     *
     * @param parameters 클러스터 생성 파라미터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync(KubernetesClusterRequestParameter parameters);

    /**
     * 클러스터 생성.
     *
     * @param parameters 클러스터 생성 파라미터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync(KubernetesClusterRequestParameter parameters);

    /**
     * 클러스터 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the KubernetesClusterResponseParameter object if successful.
     */
    KubernetesClusterResponseParameter get(String uuid);

    /**
     * 클러스터 조회.
     *
     * @param uuid 클러스터 UUID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<KubernetesClusterResponseParameter> getAsync(String uuid, final ServiceCallback<KubernetesClusterResponseParameter> serviceCallback);

    /**
     * 클러스터 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesClusterResponseParameter object
     */
    Observable<KubernetesClusterResponseParameter> getAsync(String uuid);

    /**
     * 클러스터 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesClusterResponseParameter object
     */
    Observable<ServiceResponse<KubernetesClusterResponseParameter>> getWithServiceResponseAsync(String uuid);

    /**
     * 클러스터 삭제.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String uuid);

    /**
     * 클러스터 삭제.
     *
     * @param uuid 클러스터 UUID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String uuid, final ServiceCallback<Void> serviceCallback);

    /**
     * 클러스터 삭제.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String uuid);

    /**
     * 클러스터 삭제.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String uuid);

}
