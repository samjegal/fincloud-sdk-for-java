/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes;

import com.fincloud.kubernetes.models.KubernetesWorkerNodeResponseParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in KubernetesWorkerNodes.
 */
public interface KubernetesWorkerNodes {
    /**
     * 워커노드 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the KubernetesWorkerNodeResponseParameter object if successful.
     */
    KubernetesWorkerNodeResponseParameter get(String uuid);

    /**
     * 워커노드 조회.
     *
     * @param uuid 클러스터 UUID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<KubernetesWorkerNodeResponseParameter> getAsync(String uuid, final ServiceCallback<KubernetesWorkerNodeResponseParameter> serviceCallback);

    /**
     * 워커노드 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesWorkerNodeResponseParameter object
     */
    Observable<KubernetesWorkerNodeResponseParameter> getAsync(String uuid);

    /**
     * 워커노드 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesWorkerNodeResponseParameter object
     */
    Observable<ServiceResponse<KubernetesWorkerNodeResponseParameter>> getWithServiceResponseAsync(String uuid);

}
