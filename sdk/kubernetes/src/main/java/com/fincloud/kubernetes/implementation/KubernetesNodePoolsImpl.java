/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.implementation;

import retrofit2.Retrofit;
import com.fincloud.kubernetes.KubernetesNodePools;
import com.fincloud.kubernetes.models.KubernetesNodePoolRequestParameter;
import com.fincloud.kubernetes.models.KubernetesNodePoolResponseParameter;
import com.fincloud.kubernetes.models.KubernetesNodePoolUpdateParameter;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in KubernetesNodePools.
 */
public class KubernetesNodePoolsImpl implements KubernetesNodePools {
    /** The Retrofit service to perform REST calls. */
    private KubernetesNodePoolsService service;
    /** The service client containing this operation class. */
    private KubernetesManagementClientImpl client;

    /**
     * Initializes an instance of KubernetesNodePools.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public KubernetesNodePoolsImpl(Retrofit retrofit, KubernetesManagementClientImpl client) {
        this.service = retrofit.create(KubernetesNodePoolsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for KubernetesNodePools to be
     * used by Retrofit to perform actually REST calls.
     */
    interface KubernetesNodePoolsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.kubernetes.KubernetesNodePools get" })
        @GET("nks/v2/clusters/{uuid}/node-pool")
        Observable<Response<ResponseBody>> get(@Path("uuid") String uuid);

        @Headers({ "Content-Type: application/json;charset=UTF-8", "x-ms-logging-context: com.fincloud.kubernetes.KubernetesNodePools create" })
        @POST("nks/v2/clusters/{uuid}/node-pool")
        Observable<Response<ResponseBody>> create(@Path("uuid") String uuid, @Body KubernetesNodePoolRequestParameter parameters);

        @Headers({ "Content-Type: application/json;charset=UTF-8", "x-ms-logging-context: com.fincloud.kubernetes.KubernetesNodePools update" })
        @PATCH("nks/v2/clusters/{uuid}/node-pool/{instanceNo}")
        Observable<Response<ResponseBody>> update(@Path("uuid") String uuid, @Path("instanceNo") String instanceNo, @Body KubernetesNodePoolUpdateParameter parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.kubernetes.KubernetesNodePools delete" })
        @HTTP(path = "nks/v2/clusters/{uuid}/node-pool/{instanceNo}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("uuid") String uuid, @Path("instanceNo") String instanceNo);

    }

    /**
     * 노드풀 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the KubernetesNodePoolResponseParameter object if successful.
     */
    public KubernetesNodePoolResponseParameter get(String uuid) {
        return getWithServiceResponseAsync(uuid).toBlocking().single().body();
    }

    /**
     * 노드풀 조회.
     *
     * @param uuid 클러스터 UUID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<KubernetesNodePoolResponseParameter> getAsync(String uuid, final ServiceCallback<KubernetesNodePoolResponseParameter> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(uuid), serviceCallback);
    }

    /**
     * 노드풀 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesNodePoolResponseParameter object
     */
    public Observable<KubernetesNodePoolResponseParameter> getAsync(String uuid) {
        return getWithServiceResponseAsync(uuid).map(new Func1<ServiceResponse<KubernetesNodePoolResponseParameter>, KubernetesNodePoolResponseParameter>() {
            @Override
            public KubernetesNodePoolResponseParameter call(ServiceResponse<KubernetesNodePoolResponseParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 노드풀 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesNodePoolResponseParameter object
     */
    public Observable<ServiceResponse<KubernetesNodePoolResponseParameter>> getWithServiceResponseAsync(String uuid) {
        if (uuid == null) {
            throw new IllegalArgumentException("Parameter uuid is required and cannot be null.");
        }
        return service.get(uuid)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<KubernetesNodePoolResponseParameter>>>() {
                @Override
                public Observable<ServiceResponse<KubernetesNodePoolResponseParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<KubernetesNodePoolResponseParameter> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<KubernetesNodePoolResponseParameter> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<KubernetesNodePoolResponseParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<KubernetesNodePoolResponseParameter>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 노드풀 생성.
     *
     * @param uuid 클러스터 UUID
     * @param parameters 노드풀 생성 파라미터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void create(String uuid, KubernetesNodePoolRequestParameter parameters) {
        createWithServiceResponseAsync(uuid, parameters).toBlocking().single().body();
    }

    /**
     * 노드풀 생성.
     *
     * @param uuid 클러스터 UUID
     * @param parameters 노드풀 생성 파라미터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> createAsync(String uuid, KubernetesNodePoolRequestParameter parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(uuid, parameters), serviceCallback);
    }

    /**
     * 노드풀 생성.
     *
     * @param uuid 클러스터 UUID
     * @param parameters 노드풀 생성 파라미터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> createAsync(String uuid, KubernetesNodePoolRequestParameter parameters) {
        return createWithServiceResponseAsync(uuid, parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 노드풀 생성.
     *
     * @param uuid 클러스터 UUID
     * @param parameters 노드풀 생성 파라미터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> createWithServiceResponseAsync(String uuid, KubernetesNodePoolRequestParameter parameters) {
        if (uuid == null) {
            throw new IllegalArgumentException("Parameter uuid is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.create(uuid, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

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
    public void update(String uuid, String instanceNo, KubernetesNodePoolUpdateParameter parameters) {
        updateWithServiceResponseAsync(uuid, instanceNo, parameters).toBlocking().single().body();
    }

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
    public ServiceFuture<Void> updateAsync(String uuid, String instanceNo, KubernetesNodePoolUpdateParameter parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(uuid, instanceNo, parameters), serviceCallback);
    }

    /**
     * 노드풀 수정.
     *
     * @param uuid 클러스터 UUID
     * @param instanceNo 인스턴스 번호
     * @param parameters 노드풀 생성 파라미터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> updateAsync(String uuid, String instanceNo, KubernetesNodePoolUpdateParameter parameters) {
        return updateWithServiceResponseAsync(uuid, instanceNo, parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 노드풀 수정.
     *
     * @param uuid 클러스터 UUID
     * @param instanceNo 인스턴스 번호
     * @param parameters 노드풀 생성 파라미터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(String uuid, String instanceNo, KubernetesNodePoolUpdateParameter parameters) {
        if (uuid == null) {
            throw new IllegalArgumentException("Parameter uuid is required and cannot be null.");
        }
        if (instanceNo == null) {
            throw new IllegalArgumentException("Parameter instanceNo is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.update(uuid, instanceNo, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> updateDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 노드푹 삭제.
     *
     * @param uuid 클러스터 UUID
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String uuid, String instanceNo) {
        deleteWithServiceResponseAsync(uuid, instanceNo).toBlocking().single().body();
    }

    /**
     * 노드푹 삭제.
     *
     * @param uuid 클러스터 UUID
     * @param instanceNo 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String uuid, String instanceNo, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(uuid, instanceNo), serviceCallback);
    }

    /**
     * 노드푹 삭제.
     *
     * @param uuid 클러스터 UUID
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String uuid, String instanceNo) {
        return deleteWithServiceResponseAsync(uuid, instanceNo).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 노드푹 삭제.
     *
     * @param uuid 클러스터 UUID
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String uuid, String instanceNo) {
        if (uuid == null) {
            throw new IllegalArgumentException("Parameter uuid is required and cannot be null.");
        }
        if (instanceNo == null) {
            throw new IllegalArgumentException("Parameter instanceNo is required and cannot be null.");
        }
        return service.delete(uuid, instanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
