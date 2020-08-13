/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.PortPlugins;
import com.fincloud.cloudinsight.models.PortPluginParameter;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PortPlugins.
 */
public class PortPluginsImpl implements PortPlugins {
    /** The Retrofit service to perform REST calls. */
    private PortPluginsService service;
    /** The service client containing this operation class. */
    private CloudInsightManagementClientImpl client;

    /**
     * Initializes an instance of PortPlugins.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PortPluginsImpl(Retrofit retrofit, CloudInsightManagementClientImpl client) {
        this.service = retrofit.create(PortPluginsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PortPlugins to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PortPluginsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.PortPlugins create" })
        @POST("cw_server/real/api/plugin/port")
        Observable<Response<ResponseBody>> create(@Body PortPluginParameter parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.PortPlugins list" })
        @GET("cw_server/real/api/plugin/port")
        Observable<Response<ResponseBody>> list();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.PortPlugins get" })
        @GET("cw_server/real/api/plugin/port/instanceNo/{instanceNo}")
        Observable<Response<ResponseBody>> get(@Path("instanceNo") String instanceNo);

    }

    /**
     * Port Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Port 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void create(PortPluginParameter parameters) {
        createWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Port Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Port 정보
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> createAsync(PortPluginParameter parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Port Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Port 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> createAsync(PortPluginParameter parameters) {
        return createWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Port Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Port 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> createWithServiceResponseAsync(PortPluginParameter parameters) {
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
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 사용자의 Port Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PortPluginParameter&gt; object if successful.
     */
    public List<PortPluginParameter> list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * 사용자의 Port Plugin 설정을 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PortPluginParameter>> listAsync(final ServiceCallback<List<PortPluginParameter>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * 사용자의 Port Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PortPluginParameter&gt; object
     */
    public Observable<List<PortPluginParameter>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<PortPluginParameter>>, List<PortPluginParameter>>() {
            @Override
            public List<PortPluginParameter> call(ServiceResponse<List<PortPluginParameter>> response) {
                return response.body();
            }
        });
    }

    /**
     * 사용자의 Port Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PortPluginParameter&gt; object
     */
    public Observable<ServiceResponse<List<PortPluginParameter>>> listWithServiceResponseAsync() {
        return service.list()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<PortPluginParameter>>>>() {
                @Override
                public Observable<ServiceResponse<List<PortPluginParameter>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<PortPluginParameter>> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<PortPluginParameter>> listDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<List<PortPluginParameter>, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<PortPluginParameter>>() { }.getType())
                .build(response);
    }

    /**
     * 서버 인스턴스에 적용된 Port Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortPluginParameter object if successful.
     */
    public PortPluginParameter get(String instanceNo) {
        return getWithServiceResponseAsync(instanceNo).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스에 적용된 Port Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PortPluginParameter> getAsync(String instanceNo, final ServiceCallback<PortPluginParameter> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(instanceNo), serviceCallback);
    }

    /**
     * 서버 인스턴스에 적용된 Port Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortPluginParameter object
     */
    public Observable<PortPluginParameter> getAsync(String instanceNo) {
        return getWithServiceResponseAsync(instanceNo).map(new Func1<ServiceResponse<PortPluginParameter>, PortPluginParameter>() {
            @Override
            public PortPluginParameter call(ServiceResponse<PortPluginParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스에 적용된 Port Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortPluginParameter object
     */
    public Observable<ServiceResponse<PortPluginParameter>> getWithServiceResponseAsync(String instanceNo) {
        if (instanceNo == null) {
            throw new IllegalArgumentException("Parameter instanceNo is required and cannot be null.");
        }
        return service.get(instanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PortPluginParameter>>>() {
                @Override
                public Observable<ServiceResponse<PortPluginParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PortPluginParameter> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PortPluginParameter> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PortPluginParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PortPluginParameter>() { }.getType())
                .build(response);
    }

}
