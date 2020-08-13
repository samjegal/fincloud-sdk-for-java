/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms.implementation;

import retrofit2.Retrofit;
import com.fincloud.wms.WMS;
import com.fincloud.wms.models.WMSDetailParameter;
import com.fincloud.wms.models.WMSListParameter;
import com.fincloud.wms.models.WMSResultContentlParameter;
import com.fincloud.wms.models.WMSReturnParameter;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in WMS.
 */
public class WMSImpl implements WMS {
    /** The Retrofit service to perform REST calls. */
    private WMSService service;
    /** The service client containing this operation class. */
    private WebserviceMonitoringServiceManagementClientImpl client;

    /**
     * Initializes an instance of WMS.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public WMSImpl(Retrofit retrofit, WebserviceMonitoringServiceManagementClientImpl client) {
        this.service = retrofit.create(WMSService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for WMS to be
     * used by Retrofit to perform actually REST calls.
     */
    interface WMSService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.wms.WMS list" })
        @GET("sms/v1/scripts")
        Observable<Response<ResponseBody>> list();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.wms.WMS detail" })
        @GET("sms/v1/scripts/{scriptId}")
        Observable<Response<ResponseBody>> detail(@Path("scriptId") String scriptId);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.wms.WMS result" })
        @GET("sms/v1/scripts/{scriptId}/result")
        Observable<Response<ResponseBody>> result(@Path("scriptId") String scriptId, @Query("timestamp") String timestamp);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.wms.WMS start" })
        @POST("sms/v1/scripts/{scriptId}/setting/status/start")
        Observable<Response<ResponseBody>> start(@Path("scriptId") String scriptId);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.wms.WMS stop" })
        @POST("sms/v1/scripts/{scriptId}/setting/status/stop")
        Observable<Response<ResponseBody>> stop(@Path("scriptId") String scriptId);

    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO 전체 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO 전체 목록을 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> listAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO 전체 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO 전체 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> listWithServiceResponseAsync() {
        return service.list()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> listDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WMSListParameter>() { }.getType())
                .register(401, new TypeToken<WMSReturnParameter>() { }.getType())
                .register(404, new TypeToken<WMSReturnParameter>() { }.getType())
                .build(response);
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 세부 정보를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object detail(String scriptId) {
        return detailWithServiceResponseAsync(scriptId).toBlocking().single().body();
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 세부 정보를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> detailAsync(String scriptId, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(detailWithServiceResponseAsync(scriptId), serviceCallback);
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 세부 정보를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> detailAsync(String scriptId) {
        return detailWithServiceResponseAsync(scriptId).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 세부 정보를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> detailWithServiceResponseAsync(String scriptId) {
        if (scriptId == null) {
            throw new IllegalArgumentException("Parameter scriptId is required and cannot be null.");
        }
        return service.detail(scriptId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = detailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> detailDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WMSDetailParameter>() { }.getType())
                .register(401, new TypeToken<WMSReturnParameter>() { }.getType())
                .register(404, new TypeToken<WMSReturnParameter>() { }.getType())
                .build(response);
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 모니터링 결과를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object result(String scriptId) {
        return resultWithServiceResponseAsync(scriptId).toBlocking().single().body();
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 모니터링 결과를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> resultAsync(String scriptId, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(resultWithServiceResponseAsync(scriptId), serviceCallback);
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 모니터링 결과를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> resultAsync(String scriptId) {
        return resultWithServiceResponseAsync(scriptId).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 모니터링 결과를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> resultWithServiceResponseAsync(String scriptId) {
        if (scriptId == null) {
            throw new IllegalArgumentException("Parameter scriptId is required and cannot be null.");
        }
        final String timestamp = null;
        return service.result(scriptId, timestamp)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = resultDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 모니터링 결과를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @param timestamp 조회 시간 기준
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object result(String scriptId, String timestamp) {
        return resultWithServiceResponseAsync(scriptId, timestamp).toBlocking().single().body();
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 모니터링 결과를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @param timestamp 조회 시간 기준
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> resultAsync(String scriptId, String timestamp, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(resultWithServiceResponseAsync(scriptId, timestamp), serviceCallback);
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 모니터링 결과를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @param timestamp 조회 시간 기준
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> resultAsync(String scriptId, String timestamp) {
        return resultWithServiceResponseAsync(scriptId, timestamp).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 모니터링 결과를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @param timestamp 조회 시간 기준
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> resultWithServiceResponseAsync(String scriptId, String timestamp) {
        if (scriptId == null) {
            throw new IllegalArgumentException("Parameter scriptId is required and cannot be null.");
        }
        return service.result(scriptId, timestamp)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = resultDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> resultDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<WMSResultContentlParameter>>() { }.getType())
                .register(401, new TypeToken<WMSReturnParameter>() { }.getType())
                .register(404, new TypeToken<WMSReturnParameter>() { }.getType())
                .build(response);
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 상태를 “시작”으로 변경.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WMSReturnParameter object if successful.
     */
    public WMSReturnParameter start(String scriptId) {
        return startWithServiceResponseAsync(scriptId).toBlocking().single().body();
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 상태를 “시작”으로 변경.
     *
     * @param scriptId 스크립트 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WMSReturnParameter> startAsync(String scriptId, final ServiceCallback<WMSReturnParameter> serviceCallback) {
        return ServiceFuture.fromResponse(startWithServiceResponseAsync(scriptId), serviceCallback);
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 상태를 “시작”으로 변경.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WMSReturnParameter object
     */
    public Observable<WMSReturnParameter> startAsync(String scriptId) {
        return startWithServiceResponseAsync(scriptId).map(new Func1<ServiceResponse<WMSReturnParameter>, WMSReturnParameter>() {
            @Override
            public WMSReturnParameter call(ServiceResponse<WMSReturnParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 상태를 “시작”으로 변경.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WMSReturnParameter object
     */
    public Observable<ServiceResponse<WMSReturnParameter>> startWithServiceResponseAsync(String scriptId) {
        if (scriptId == null) {
            throw new IllegalArgumentException("Parameter scriptId is required and cannot be null.");
        }
        return service.start(scriptId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WMSReturnParameter>>>() {
                @Override
                public Observable<ServiceResponse<WMSReturnParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WMSReturnParameter> clientResponse = startDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<WMSReturnParameter> startDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<WMSReturnParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WMSReturnParameter>() { }.getType())
                .register(401, new TypeToken<WMSReturnParameter>() { }.getType())
                .register(404, new TypeToken<WMSReturnParameter>() { }.getType())
                .build(response);
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 상태를 “정지”로 변경.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WMSReturnParameter object if successful.
     */
    public WMSReturnParameter stop(String scriptId) {
        return stopWithServiceResponseAsync(scriptId).toBlocking().single().body();
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 상태를 “정지”로 변경.
     *
     * @param scriptId 스크립트 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WMSReturnParameter> stopAsync(String scriptId, final ServiceCallback<WMSReturnParameter> serviceCallback) {
        return ServiceFuture.fromResponse(stopWithServiceResponseAsync(scriptId), serviceCallback);
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 상태를 “정지”로 변경.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WMSReturnParameter object
     */
    public Observable<WMSReturnParameter> stopAsync(String scriptId) {
        return stopWithServiceResponseAsync(scriptId).map(new Func1<ServiceResponse<WMSReturnParameter>, WMSReturnParameter>() {
            @Override
            public WMSReturnParameter call(ServiceResponse<WMSReturnParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 상태를 “정지”로 변경.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WMSReturnParameter object
     */
    public Observable<ServiceResponse<WMSReturnParameter>> stopWithServiceResponseAsync(String scriptId) {
        if (scriptId == null) {
            throw new IllegalArgumentException("Parameter scriptId is required and cannot be null.");
        }
        return service.stop(scriptId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WMSReturnParameter>>>() {
                @Override
                public Observable<ServiceResponse<WMSReturnParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WMSReturnParameter> clientResponse = stopDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<WMSReturnParameter> stopDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<WMSReturnParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WMSReturnParameter>() { }.getType())
                .register(401, new TypeToken<WMSReturnParameter>() { }.getType())
                .register(404, new TypeToken<WMSReturnParameter>() { }.getType())
                .build(response);
    }

}
