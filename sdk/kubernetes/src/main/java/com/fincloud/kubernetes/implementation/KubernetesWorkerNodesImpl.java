/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.implementation;

import retrofit2.Retrofit;
import com.fincloud.kubernetes.KubernetesWorkerNodes;
import com.fincloud.kubernetes.models.KubernetesWorkerNodeResponseParameter;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in KubernetesWorkerNodes.
 */
public class KubernetesWorkerNodesImpl implements KubernetesWorkerNodes {
    /** The Retrofit service to perform REST calls. */
    private KubernetesWorkerNodesService service;
    /** The service client containing this operation class. */
    private KubernetesManagementClientImpl client;

    /**
     * Initializes an instance of KubernetesWorkerNodes.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public KubernetesWorkerNodesImpl(Retrofit retrofit, KubernetesManagementClientImpl client) {
        this.service = retrofit.create(KubernetesWorkerNodesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for KubernetesWorkerNodes to be
     * used by Retrofit to perform actually REST calls.
     */
    interface KubernetesWorkerNodesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.kubernetes.KubernetesWorkerNodes get" })
        @GET("clusters/{uuid}/nodes")
        Observable<Response<ResponseBody>> get(@Path("uuid") String uuid);

    }

    /**
     * 워커노드 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the KubernetesWorkerNodeResponseParameter object if successful.
     */
    public KubernetesWorkerNodeResponseParameter get(String uuid) {
        return getWithServiceResponseAsync(uuid).toBlocking().single().body();
    }

    /**
     * 워커노드 조회.
     *
     * @param uuid 클러스터 UUID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<KubernetesWorkerNodeResponseParameter> getAsync(String uuid, final ServiceCallback<KubernetesWorkerNodeResponseParameter> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(uuid), serviceCallback);
    }

    /**
     * 워커노드 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesWorkerNodeResponseParameter object
     */
    public Observable<KubernetesWorkerNodeResponseParameter> getAsync(String uuid) {
        return getWithServiceResponseAsync(uuid).map(new Func1<ServiceResponse<KubernetesWorkerNodeResponseParameter>, KubernetesWorkerNodeResponseParameter>() {
            @Override
            public KubernetesWorkerNodeResponseParameter call(ServiceResponse<KubernetesWorkerNodeResponseParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 워커노드 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesWorkerNodeResponseParameter object
     */
    public Observable<ServiceResponse<KubernetesWorkerNodeResponseParameter>> getWithServiceResponseAsync(String uuid) {
        if (uuid == null) {
            throw new IllegalArgumentException("Parameter uuid is required and cannot be null.");
        }
        return service.get(uuid)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<KubernetesWorkerNodeResponseParameter>>>() {
                @Override
                public Observable<ServiceResponse<KubernetesWorkerNodeResponseParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<KubernetesWorkerNodeResponseParameter> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<KubernetesWorkerNodeResponseParameter> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<KubernetesWorkerNodeResponseParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<KubernetesWorkerNodeResponseParameter>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
