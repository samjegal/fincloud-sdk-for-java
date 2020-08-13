/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes;

import com.fincloud.kubernetes.models.KubernetesNodePoolRequestParameter;
import com.fincloud.kubernetes.models.KubernetesNodePoolResponseParameter;
import com.fincloud.kubernetes.models.KubernetesNodePoolUpdateParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in KubernetesNodePools.
 */
public interface KubernetesNodePools {
    /**
     * 노드풀 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the KubernetesNodePoolResponseParameter object if successful.
     */
    KubernetesNodePoolResponseParameter get(String uuid);

    /**
     * 노드풀 조회.
     *
     * @param uuid 클러스터 UUID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<KubernetesNodePoolResponseParameter> getAsync(String uuid, final ServiceCallback<KubernetesNodePoolResponseParameter> serviceCallback);

    /**
     * 노드풀 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesNodePoolResponseParameter object
     */
    Observable<KubernetesNodePoolResponseParameter> getAsync(String uuid);

    /**
     * 노드풀 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesNodePoolResponseParameter object
     */
    Observable<ServiceResponse<KubernetesNodePoolResponseParameter>> getWithServiceResponseAsync(String uuid);

    /**
     * 노드풀 생성.
     *
     * @param uuid 클러스터 UUID
     * @param parameters 노드풀 생성 파라미터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create(String uuid, KubernetesNodePoolRequestParameter parameters);

    /**
     * 노드풀 생성.
     *
     * @param uuid 클러스터 UUID
     * @param parameters 노드풀 생성 파라미터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(String uuid, KubernetesNodePoolRequestParameter parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * 노드풀 생성.
     *
     * @param uuid 클러스터 UUID
     * @param parameters 노드풀 생성 파라미터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync(String uuid, KubernetesNodePoolRequestParameter parameters);

    /**
     * 노드풀 생성.
     *
     * @param uuid 클러스터 UUID
     * @param parameters 노드풀 생성 파라미터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync(String uuid, KubernetesNodePoolRequestParameter parameters);

    /**
     * 노드풀 수정.
     *
     * @param uuid 클러스터 UUID
     * @param instanceNo 인스턴스 번호
     * @param parameters 노드풀 생성 파라미터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void update(String uuid, String instanceNo, KubernetesNodePoolUpdateParameter parameters);

    /**
     * 노드풀 수정.
     *
     * @param uuid 클러스터 UUID
     * @param instanceNo 인스턴스 번호
     * @param parameters 노드풀 생성 파라미터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> updateAsync(String uuid, String instanceNo, KubernetesNodePoolUpdateParameter parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * 노드풀 수정.
     *
     * @param uuid 클러스터 UUID
     * @param instanceNo 인스턴스 번호
     * @param parameters 노드풀 생성 파라미터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> updateAsync(String uuid, String instanceNo, KubernetesNodePoolUpdateParameter parameters);

    /**
     * 노드풀 수정.
     *
     * @param uuid 클러스터 UUID
     * @param instanceNo 인스턴스 번호
     * @param parameters 노드풀 생성 파라미터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(String uuid, String instanceNo, KubernetesNodePoolUpdateParameter parameters);

    /**
     * 노드푹 삭제.
     *
     * @param uuid 클러스터 UUID
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String uuid, String instanceNo);

    /**
     * 노드푹 삭제.
     *
     * @param uuid 클러스터 UUID
     * @param instanceNo 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String uuid, String instanceNo, final ServiceCallback<Void> serviceCallback);

    /**
     * 노드푹 삭제.
     *
     * @param uuid 클러스터 UUID
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String uuid, String instanceNo);

    /**
     * 노드푹 삭제.
     *
     * @param uuid 클러스터 UUID
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String uuid, String instanceNo);

}
