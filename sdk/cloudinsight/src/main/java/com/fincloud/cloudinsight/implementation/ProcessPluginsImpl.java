/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.ProcessPlugins;
import com.fincloud.cloudinsight.models.ProcessPluginDetailResponse;
import com.fincloud.cloudinsight.models.ProcessPluginParameter;
import com.fincloud.cloudinsight.models.ProcessPluginRequest;
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
 * in ProcessPlugins.
 */
public class ProcessPluginsImpl implements ProcessPlugins {
    /** The Retrofit service to perform REST calls. */
    private ProcessPluginsService service;
    /** The service client containing this operation class. */
    private CloudInsightManagementClientImpl client;

    /**
     * Initializes an instance of ProcessPlugins.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ProcessPluginsImpl(Retrofit retrofit, CloudInsightManagementClientImpl client) {
        this.service = retrofit.create(ProcessPluginsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ProcessPlugins to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ProcessPluginsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.ProcessPlugins create" })
        @POST("cw_server/real/api/plugin/process")
        Observable<Response<ResponseBody>> create(@Body ProcessPluginRequest parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.ProcessPlugins list" })
        @GET("cw_server/real/api/plugin/process")
        Observable<Response<ResponseBody>> list();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.ProcessPlugins get" })
        @GET("cw_server/real/api/plugin/process/instanceNo/{instanceNo}")
        Observable<Response<ResponseBody>> get(@Path("instanceNo") String instanceNo);

    }

    /**
     * Process Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Process 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void create(ProcessPluginRequest parameters) {
        createWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Process Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Process 정보
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> createAsync(ProcessPluginRequest parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Process Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Process 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> createAsync(ProcessPluginRequest parameters) {
        return createWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Process Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Process 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> createWithServiceResponseAsync(ProcessPluginRequest parameters) {
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
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 사용자의 Process Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ProcessPluginParameter&gt; object if successful.
     */
    public List<ProcessPluginParameter> list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * 사용자의 Process Plugin 설정을 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ProcessPluginParameter>> listAsync(final ServiceCallback<List<ProcessPluginParameter>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * 사용자의 Process Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ProcessPluginParameter&gt; object
     */
    public Observable<List<ProcessPluginParameter>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<ProcessPluginParameter>>, List<ProcessPluginParameter>>() {
            @Override
            public List<ProcessPluginParameter> call(ServiceResponse<List<ProcessPluginParameter>> response) {
                return response.body();
            }
        });
    }

    /**
     * 사용자의 Process Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ProcessPluginParameter&gt; object
     */
    public Observable<ServiceResponse<List<ProcessPluginParameter>>> listWithServiceResponseAsync() {
        return service.list()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ProcessPluginParameter>>>>() {
                @Override
                public Observable<ServiceResponse<List<ProcessPluginParameter>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<ProcessPluginParameter>> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<ProcessPluginParameter>> listDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<List<ProcessPluginParameter>, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<ProcessPluginParameter>>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 서버 인스턴스에 적용된 Process Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ProcessPluginDetailResponse object if successful.
     */
    public ProcessPluginDetailResponse get(String instanceNo) {
        return getWithServiceResponseAsync(instanceNo).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스에 적용된 Process Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ProcessPluginDetailResponse> getAsync(String instanceNo, final ServiceCallback<ProcessPluginDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(instanceNo), serviceCallback);
    }

    /**
     * 서버 인스턴스에 적용된 Process Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProcessPluginDetailResponse object
     */
    public Observable<ProcessPluginDetailResponse> getAsync(String instanceNo) {
        return getWithServiceResponseAsync(instanceNo).map(new Func1<ServiceResponse<ProcessPluginDetailResponse>, ProcessPluginDetailResponse>() {
            @Override
            public ProcessPluginDetailResponse call(ServiceResponse<ProcessPluginDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스에 적용된 Process Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProcessPluginDetailResponse object
     */
    public Observable<ServiceResponse<ProcessPluginDetailResponse>> getWithServiceResponseAsync(String instanceNo) {
        if (instanceNo == null) {
            throw new IllegalArgumentException("Parameter instanceNo is required and cannot be null.");
        }
        return service.get(instanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ProcessPluginDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<ProcessPluginDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ProcessPluginDetailResponse> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ProcessPluginDetailResponse> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ProcessPluginDetailResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ProcessPluginDetailResponse>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
