/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.PluginProcess;
import com.fincloud.cloudinsight.models.PluginProcessParameter;
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
 * in PluginProcess.
 */
public class PluginProcessImpl implements PluginProcess {
    /** The Retrofit service to perform REST calls. */
    private PluginProcessService service;
    /** The service client containing this operation class. */
    private CloudInsightManagementClientImpl client;

    /**
     * Initializes an instance of PluginProcess.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PluginProcessImpl(Retrofit retrofit, CloudInsightManagementClientImpl client) {
        this.service = retrofit.create(PluginProcessService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PluginProcess to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PluginProcessService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.PluginProcess create" })
        @POST("cw_server/real/api/plugin/process")
        Observable<Response<ResponseBody>> create(@Body PluginProcessParameter parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.PluginProcess list" })
        @GET("cw_server/real/api/plugin/process")
        Observable<Response<ResponseBody>> list();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.PluginProcess get" })
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
    public void create(PluginProcessParameter parameters) {
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
    public ServiceFuture<Void> createAsync(PluginProcessParameter parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Process Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Process 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> createAsync(PluginProcessParameter parameters) {
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
    public Observable<ServiceResponse<Void>> createWithServiceResponseAsync(PluginProcessParameter parameters) {
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
     * 사용자의 Process Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PluginProcessParameter&gt; object if successful.
     */
    public List<PluginProcessParameter> list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * 사용자의 Process Plugin 설정을 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PluginProcessParameter>> listAsync(final ServiceCallback<List<PluginProcessParameter>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * 사용자의 Process Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PluginProcessParameter&gt; object
     */
    public Observable<List<PluginProcessParameter>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<PluginProcessParameter>>, List<PluginProcessParameter>>() {
            @Override
            public List<PluginProcessParameter> call(ServiceResponse<List<PluginProcessParameter>> response) {
                return response.body();
            }
        });
    }

    /**
     * 사용자의 Process Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PluginProcessParameter&gt; object
     */
    public Observable<ServiceResponse<List<PluginProcessParameter>>> listWithServiceResponseAsync() {
        return service.list()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<PluginProcessParameter>>>>() {
                @Override
                public Observable<ServiceResponse<List<PluginProcessParameter>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<PluginProcessParameter>> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<PluginProcessParameter>> listDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<List<PluginProcessParameter>, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<PluginProcessParameter>>() { }.getType())
                .build(response);
    }

    /**
     * 서버 인스턴스에 적용된 Process Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PluginProcessParameter object if successful.
     */
    public PluginProcessParameter get(String instanceNo) {
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
    public ServiceFuture<PluginProcessParameter> getAsync(String instanceNo, final ServiceCallback<PluginProcessParameter> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(instanceNo), serviceCallback);
    }

    /**
     * 서버 인스턴스에 적용된 Process Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PluginProcessParameter object
     */
    public Observable<PluginProcessParameter> getAsync(String instanceNo) {
        return getWithServiceResponseAsync(instanceNo).map(new Func1<ServiceResponse<PluginProcessParameter>, PluginProcessParameter>() {
            @Override
            public PluginProcessParameter call(ServiceResponse<PluginProcessParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스에 적용된 Process Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PluginProcessParameter object
     */
    public Observable<ServiceResponse<PluginProcessParameter>> getWithServiceResponseAsync(String instanceNo) {
        if (instanceNo == null) {
            throw new IllegalArgumentException("Parameter instanceNo is required and cannot be null.");
        }
        return service.get(instanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PluginProcessParameter>>>() {
                @Override
                public Observable<ServiceResponse<PluginProcessParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PluginProcessParameter> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PluginProcessParameter> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PluginProcessParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PluginProcessParameter>() { }.getType())
                .build(response);
    }

}
