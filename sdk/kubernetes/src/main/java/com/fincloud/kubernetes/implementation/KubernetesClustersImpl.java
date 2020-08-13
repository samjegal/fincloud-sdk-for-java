/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.implementation;

import retrofit2.Retrofit;
import com.fincloud.kubernetes.KubernetesClusters;
import com.fincloud.kubernetes.models.KubernetesClusterRequestParameter;
import com.fincloud.kubernetes.models.KubernetesClusterResponseParameter;
import com.fincloud.kubernetes.models.KubernetesClustersListParameter;
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
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in KubernetesClusters.
 */
public class KubernetesClustersImpl implements KubernetesClusters {
    /** The Retrofit service to perform REST calls. */
    private KubernetesClustersService service;
    /** The service client containing this operation class. */
    private KubernetesManagementClientImpl client;

    /**
     * Initializes an instance of KubernetesClusters.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public KubernetesClustersImpl(Retrofit retrofit, KubernetesManagementClientImpl client) {
        this.service = retrofit.create(KubernetesClustersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for KubernetesClusters to be
     * used by Retrofit to perform actually REST calls.
     */
    interface KubernetesClustersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.kubernetes.KubernetesClusters list" })
        @GET("nks/v2/clusters")
        Observable<Response<ResponseBody>> list();

        @Headers({ "Content-Type: application/json;charset=UTF-8", "x-ms-logging-context: com.fincloud.kubernetes.KubernetesClusters create" })
        @POST("nks/v2/clusters")
        Observable<Response<ResponseBody>> create(@Body KubernetesClusterRequestParameter parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.kubernetes.KubernetesClusters get" })
        @GET("nks/v2/clusters/{uuid}")
        Observable<Response<ResponseBody>> get(@Path("uuid") String uuid);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.kubernetes.KubernetesClusters delete" })
        @HTTP(path = "nks/v2/clusters/{uuid}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("uuid") String uuid);

    }

    /**
     * 클러스터 목록 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the KubernetesClustersListParameter object if successful.
     */
    public KubernetesClustersListParameter list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * 클러스터 목록 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<KubernetesClustersListParameter> listAsync(final ServiceCallback<KubernetesClustersListParameter> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * 클러스터 목록 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesClustersListParameter object
     */
    public Observable<KubernetesClustersListParameter> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<KubernetesClustersListParameter>, KubernetesClustersListParameter>() {
            @Override
            public KubernetesClustersListParameter call(ServiceResponse<KubernetesClustersListParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 클러스터 목록 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesClustersListParameter object
     */
    public Observable<ServiceResponse<KubernetesClustersListParameter>> listWithServiceResponseAsync() {
        return service.list()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<KubernetesClustersListParameter>>>() {
                @Override
                public Observable<ServiceResponse<KubernetesClustersListParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<KubernetesClustersListParameter> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<KubernetesClustersListParameter> listDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<KubernetesClustersListParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<KubernetesClustersListParameter>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 클러스터 생성.
     *
     * @param parameters 클러스터 생성 파라미터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void create(KubernetesClusterRequestParameter parameters) {
        createWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * 클러스터 생성.
     *
     * @param parameters 클러스터 생성 파라미터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> createAsync(KubernetesClusterRequestParameter parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * 클러스터 생성.
     *
     * @param parameters 클러스터 생성 파라미터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> createAsync(KubernetesClusterRequestParameter parameters) {
        return createWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 클러스터 생성.
     *
     * @param parameters 클러스터 생성 파라미터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> createWithServiceResponseAsync(KubernetesClusterRequestParameter parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.create(parameters)
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
                .register(204, new TypeToken<Void>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(409, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 클러스터 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the KubernetesClusterResponseParameter object if successful.
     */
    public KubernetesClusterResponseParameter get(String uuid) {
        return getWithServiceResponseAsync(uuid).toBlocking().single().body();
    }

    /**
     * 클러스터 조회.
     *
     * @param uuid 클러스터 UUID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<KubernetesClusterResponseParameter> getAsync(String uuid, final ServiceCallback<KubernetesClusterResponseParameter> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(uuid), serviceCallback);
    }

    /**
     * 클러스터 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesClusterResponseParameter object
     */
    public Observable<KubernetesClusterResponseParameter> getAsync(String uuid) {
        return getWithServiceResponseAsync(uuid).map(new Func1<ServiceResponse<KubernetesClusterResponseParameter>, KubernetesClusterResponseParameter>() {
            @Override
            public KubernetesClusterResponseParameter call(ServiceResponse<KubernetesClusterResponseParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 클러스터 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesClusterResponseParameter object
     */
    public Observable<ServiceResponse<KubernetesClusterResponseParameter>> getWithServiceResponseAsync(String uuid) {
        if (uuid == null) {
            throw new IllegalArgumentException("Parameter uuid is required and cannot be null.");
        }
        return service.get(uuid)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<KubernetesClusterResponseParameter>>>() {
                @Override
                public Observable<ServiceResponse<KubernetesClusterResponseParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<KubernetesClusterResponseParameter> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<KubernetesClusterResponseParameter> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<KubernetesClusterResponseParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<KubernetesClusterResponseParameter>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 클러스터 삭제.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String uuid) {
        deleteWithServiceResponseAsync(uuid).toBlocking().single().body();
    }

    /**
     * 클러스터 삭제.
     *
     * @param uuid 클러스터 UUID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String uuid, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(uuid), serviceCallback);
    }

    /**
     * 클러스터 삭제.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String uuid) {
        return deleteWithServiceResponseAsync(uuid).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 클러스터 삭제.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String uuid) {
        if (uuid == null) {
            throw new IllegalArgumentException("Parameter uuid is required and cannot be null.");
        }
        return service.delete(uuid)
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
