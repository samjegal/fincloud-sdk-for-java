/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kubernetes.implementation;

import retrofit2.Retrofit;
import com.fincloud.kubernetes.KubernetesConfigs;
import com.fincloud.kubernetes.models.KubernetesConfigParameter;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in KubernetesConfigs.
 */
public class KubernetesConfigsImpl implements KubernetesConfigs {
    /** The Retrofit service to perform REST calls. */
    private KubernetesConfigsService service;
    /** The service client containing this operation class. */
    private KubernetesManagementClientImpl client;

    /**
     * Initializes an instance of KubernetesConfigs.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public KubernetesConfigsImpl(Retrofit retrofit, KubernetesManagementClientImpl client) {
        this.service = retrofit.create(KubernetesConfigsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for KubernetesConfigs to be
     * used by Retrofit to perform actually REST calls.
     */
    interface KubernetesConfigsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.kubernetes.KubernetesConfigs get" })
        @GET("clusters/{uuid}/kubeconfig")
        Observable<Response<ResponseBody>> get(@Path("uuid") String uuid);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.kubernetes.KubernetesConfigs reset" })
        @PATCH("clusters/{uuid}/kubeconfig/reset")
        Observable<Response<ResponseBody>> reset(@Path("uuid") String uuid);

    }

    /**
     * KubeConfig 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the KubernetesConfigParameter object if successful.
     */
    public KubernetesConfigParameter get(String uuid) {
        return getWithServiceResponseAsync(uuid).toBlocking().single().body();
    }

    /**
     * KubeConfig 조회.
     *
     * @param uuid 클러스터 UUID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<KubernetesConfigParameter> getAsync(String uuid, final ServiceCallback<KubernetesConfigParameter> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(uuid), serviceCallback);
    }

    /**
     * KubeConfig 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesConfigParameter object
     */
    public Observable<KubernetesConfigParameter> getAsync(String uuid) {
        return getWithServiceResponseAsync(uuid).map(new Func1<ServiceResponse<KubernetesConfigParameter>, KubernetesConfigParameter>() {
            @Override
            public KubernetesConfigParameter call(ServiceResponse<KubernetesConfigParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * KubeConfig 조회.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the KubernetesConfigParameter object
     */
    public Observable<ServiceResponse<KubernetesConfigParameter>> getWithServiceResponseAsync(String uuid) {
        if (uuid == null) {
            throw new IllegalArgumentException("Parameter uuid is required and cannot be null.");
        }
        return service.get(uuid)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<KubernetesConfigParameter>>>() {
                @Override
                public Observable<ServiceResponse<KubernetesConfigParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<KubernetesConfigParameter> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<KubernetesConfigParameter> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<KubernetesConfigParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<KubernetesConfigParameter>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * KubeConfig 재설정.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void reset(String uuid) {
        resetWithServiceResponseAsync(uuid).toBlocking().single().body();
    }

    /**
     * KubeConfig 재설정.
     *
     * @param uuid 클러스터 UUID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> resetAsync(String uuid, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(resetWithServiceResponseAsync(uuid), serviceCallback);
    }

    /**
     * KubeConfig 재설정.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> resetAsync(String uuid) {
        return resetWithServiceResponseAsync(uuid).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * KubeConfig 재설정.
     *
     * @param uuid 클러스터 UUID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> resetWithServiceResponseAsync(String uuid) {
        if (uuid == null) {
            throw new IllegalArgumentException("Parameter uuid is required and cannot be null.");
        }
        return service.reset(uuid)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = resetDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> resetDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
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
