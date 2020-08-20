/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.FilePlugins;
import com.fincloud.cloudinsight.models.FilePluginDetailResponse;
import com.fincloud.cloudinsight.models.FilePluginParameter;
import com.fincloud.cloudinsight.models.FilePluginRequest;
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
 * in FilePlugins.
 */
public class FilePluginsImpl implements FilePlugins {
    /** The Retrofit service to perform REST calls. */
    private FilePluginsService service;
    /** The service client containing this operation class. */
    private CloudInsightManagementClientImpl client;

    /**
     * Initializes an instance of FilePlugins.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public FilePluginsImpl(Retrofit retrofit, CloudInsightManagementClientImpl client) {
        this.service = retrofit.create(FilePluginsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for FilePlugins to be
     * used by Retrofit to perform actually REST calls.
     */
    interface FilePluginsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.FilePlugins create" })
        @POST("cw_server/real/api/plugin/file")
        Observable<Response<ResponseBody>> create(@Body FilePluginRequest parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.FilePlugins list" })
        @GET("cw_server/real/api/plugin/file")
        Observable<Response<ResponseBody>> list();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.FilePlugins get" })
        @GET("cw_server/real/api/plugin/file/instanceNo/{instanceNo}")
        Observable<Response<ResponseBody>> get(@Path("instanceNo") String instanceNo);

    }

    /**
     * Plugin에 설정할 File 정보.
     *
     * @param parameters Plugin에 설정할 File 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void create(FilePluginRequest parameters) {
        createWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Plugin에 설정할 File 정보.
     *
     * @param parameters Plugin에 설정할 File 정보
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> createAsync(FilePluginRequest parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Plugin에 설정할 File 정보.
     *
     * @param parameters Plugin에 설정할 File 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> createAsync(FilePluginRequest parameters) {
        return createWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Plugin에 설정할 File 정보.
     *
     * @param parameters Plugin에 설정할 File 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> createWithServiceResponseAsync(FilePluginRequest parameters) {
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
     * 사용자의 File Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;FilePluginParameter&gt; object if successful.
     */
    public List<FilePluginParameter> list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * 사용자의 File Plugin 설정을 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<FilePluginParameter>> listAsync(final ServiceCallback<List<FilePluginParameter>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * 사용자의 File Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;FilePluginParameter&gt; object
     */
    public Observable<List<FilePluginParameter>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<FilePluginParameter>>, List<FilePluginParameter>>() {
            @Override
            public List<FilePluginParameter> call(ServiceResponse<List<FilePluginParameter>> response) {
                return response.body();
            }
        });
    }

    /**
     * 사용자의 File Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;FilePluginParameter&gt; object
     */
    public Observable<ServiceResponse<List<FilePluginParameter>>> listWithServiceResponseAsync() {
        return service.list()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<FilePluginParameter>>>>() {
                @Override
                public Observable<ServiceResponse<List<FilePluginParameter>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<FilePluginParameter>> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<FilePluginParameter>> listDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<List<FilePluginParameter>, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<FilePluginParameter>>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 서버 인스턴스에 적용된 File Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FilePluginDetailResponse object if successful.
     */
    public FilePluginDetailResponse get(String instanceNo) {
        return getWithServiceResponseAsync(instanceNo).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스에 적용된 File Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<FilePluginDetailResponse> getAsync(String instanceNo, final ServiceCallback<FilePluginDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(instanceNo), serviceCallback);
    }

    /**
     * 서버 인스턴스에 적용된 File Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FilePluginDetailResponse object
     */
    public Observable<FilePluginDetailResponse> getAsync(String instanceNo) {
        return getWithServiceResponseAsync(instanceNo).map(new Func1<ServiceResponse<FilePluginDetailResponse>, FilePluginDetailResponse>() {
            @Override
            public FilePluginDetailResponse call(ServiceResponse<FilePluginDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스에 적용된 File Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FilePluginDetailResponse object
     */
    public Observable<ServiceResponse<FilePluginDetailResponse>> getWithServiceResponseAsync(String instanceNo) {
        if (instanceNo == null) {
            throw new IllegalArgumentException("Parameter instanceNo is required and cannot be null.");
        }
        return service.get(instanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<FilePluginDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<FilePluginDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<FilePluginDetailResponse> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<FilePluginDetailResponse> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<FilePluginDetailResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<FilePluginDetailResponse>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
