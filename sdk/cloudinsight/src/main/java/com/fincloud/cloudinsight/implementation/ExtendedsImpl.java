/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.Extendeds;
import com.fincloud.cloudinsight.models.SchemaExtendedDisableResponse;
import com.fincloud.cloudinsight.models.SchemaExtendedEnableResponse;
import com.fincloud.cloudinsight.models.SchemaExtendedStatusParameter;
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
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Extendeds.
 */
public class ExtendedsImpl implements Extendeds {
    /** The Retrofit service to perform REST calls. */
    private ExtendedsService service;
    /** The service client containing this operation class. */
    private CloudInsightManagementClientImpl client;

    /**
     * Initializes an instance of Extendeds.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ExtendedsImpl(Retrofit retrofit, CloudInsightManagementClientImpl client) {
        this.service = retrofit.create(ExtendedsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Extendeds to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ExtendedsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Extendeds disable" })
        @PUT("cw_fea/real/cw/api/schema/extended/disable")
        Observable<Response<ResponseBody>> disable(@Query("cw_key") String cwKey, @Query("instanceIds") String instanceIds);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Extendeds enable" })
        @PUT("cw_fea/real/cw/api/schema/extended/enable")
        Observable<Response<ResponseBody>> enable(@Query("cw_key") String cwKey, @Query("instanceIds") String instanceIds);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Extendeds status" })
        @GET("cw_fea/real/cw/api/schema/extended/status")
        Observable<Response<ResponseBody>> status(@Query("cw_key") String cwKey, @Query("instanceIds") String instanceIds);

    }

    /**
     * NCP 상품의 extended 설정을 해제합니다.
     *
     * @param cwKey Extended 설정을 해지하려는 상품의 cw_key
     * @param instanceIds Extended 설정을 해지하려는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SchemaExtendedDisableResponse object if successful.
     */
    public SchemaExtendedDisableResponse disable(String cwKey, String instanceIds) {
        return disableWithServiceResponseAsync(cwKey, instanceIds).toBlocking().single().body();
    }

    /**
     * NCP 상품의 extended 설정을 해제합니다.
     *
     * @param cwKey Extended 설정을 해지하려는 상품의 cw_key
     * @param instanceIds Extended 설정을 해지하려는 instanceId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SchemaExtendedDisableResponse> disableAsync(String cwKey, String instanceIds, final ServiceCallback<SchemaExtendedDisableResponse> serviceCallback) {
        return ServiceFuture.fromResponse(disableWithServiceResponseAsync(cwKey, instanceIds), serviceCallback);
    }

    /**
     * NCP 상품의 extended 설정을 해제합니다.
     *
     * @param cwKey Extended 설정을 해지하려는 상품의 cw_key
     * @param instanceIds Extended 설정을 해지하려는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaExtendedDisableResponse object
     */
    public Observable<SchemaExtendedDisableResponse> disableAsync(String cwKey, String instanceIds) {
        return disableWithServiceResponseAsync(cwKey, instanceIds).map(new Func1<ServiceResponse<SchemaExtendedDisableResponse>, SchemaExtendedDisableResponse>() {
            @Override
            public SchemaExtendedDisableResponse call(ServiceResponse<SchemaExtendedDisableResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NCP 상품의 extended 설정을 해제합니다.
     *
     * @param cwKey Extended 설정을 해지하려는 상품의 cw_key
     * @param instanceIds Extended 설정을 해지하려는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaExtendedDisableResponse object
     */
    public Observable<ServiceResponse<SchemaExtendedDisableResponse>> disableWithServiceResponseAsync(String cwKey, String instanceIds) {
        if (cwKey == null) {
            throw new IllegalArgumentException("Parameter cwKey is required and cannot be null.");
        }
        if (instanceIds == null) {
            throw new IllegalArgumentException("Parameter instanceIds is required and cannot be null.");
        }
        return service.disable(cwKey, instanceIds)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SchemaExtendedDisableResponse>>>() {
                @Override
                public Observable<ServiceResponse<SchemaExtendedDisableResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SchemaExtendedDisableResponse> clientResponse = disableDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SchemaExtendedDisableResponse> disableDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SchemaExtendedDisableResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SchemaExtendedDisableResponse>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * NCP 상품의 extended 설정을 합니다.
     *
     * @param cwKey Extended 설정을 하려는 상품의 cw_key
     * @param instanceIds Extended 설정을 하려는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SchemaExtendedEnableResponse object if successful.
     */
    public SchemaExtendedEnableResponse enable(String cwKey, String instanceIds) {
        return enableWithServiceResponseAsync(cwKey, instanceIds).toBlocking().single().body();
    }

    /**
     * NCP 상품의 extended 설정을 합니다.
     *
     * @param cwKey Extended 설정을 하려는 상품의 cw_key
     * @param instanceIds Extended 설정을 하려는 instanceId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SchemaExtendedEnableResponse> enableAsync(String cwKey, String instanceIds, final ServiceCallback<SchemaExtendedEnableResponse> serviceCallback) {
        return ServiceFuture.fromResponse(enableWithServiceResponseAsync(cwKey, instanceIds), serviceCallback);
    }

    /**
     * NCP 상품의 extended 설정을 합니다.
     *
     * @param cwKey Extended 설정을 하려는 상품의 cw_key
     * @param instanceIds Extended 설정을 하려는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaExtendedEnableResponse object
     */
    public Observable<SchemaExtendedEnableResponse> enableAsync(String cwKey, String instanceIds) {
        return enableWithServiceResponseAsync(cwKey, instanceIds).map(new Func1<ServiceResponse<SchemaExtendedEnableResponse>, SchemaExtendedEnableResponse>() {
            @Override
            public SchemaExtendedEnableResponse call(ServiceResponse<SchemaExtendedEnableResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NCP 상품의 extended 설정을 합니다.
     *
     * @param cwKey Extended 설정을 하려는 상품의 cw_key
     * @param instanceIds Extended 설정을 하려는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaExtendedEnableResponse object
     */
    public Observable<ServiceResponse<SchemaExtendedEnableResponse>> enableWithServiceResponseAsync(String cwKey, String instanceIds) {
        if (cwKey == null) {
            throw new IllegalArgumentException("Parameter cwKey is required and cannot be null.");
        }
        if (instanceIds == null) {
            throw new IllegalArgumentException("Parameter instanceIds is required and cannot be null.");
        }
        return service.enable(cwKey, instanceIds)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SchemaExtendedEnableResponse>>>() {
                @Override
                public Observable<ServiceResponse<SchemaExtendedEnableResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SchemaExtendedEnableResponse> clientResponse = enableDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SchemaExtendedEnableResponse> enableDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SchemaExtendedEnableResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SchemaExtendedEnableResponse>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Instance의 Extended 설정 여부를 조회합니다.
     *
     * @param cwKey 상품의 cw_key
     * @param instanceIds Extended 설정 여부를 조회하고자하는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;SchemaExtendedStatusParameter&gt; object if successful.
     */
    public List<SchemaExtendedStatusParameter> status(String cwKey, String instanceIds) {
        return statusWithServiceResponseAsync(cwKey, instanceIds).toBlocking().single().body();
    }

    /**
     * Instance의 Extended 설정 여부를 조회합니다.
     *
     * @param cwKey 상품의 cw_key
     * @param instanceIds Extended 설정 여부를 조회하고자하는 instanceId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SchemaExtendedStatusParameter>> statusAsync(String cwKey, String instanceIds, final ServiceCallback<List<SchemaExtendedStatusParameter>> serviceCallback) {
        return ServiceFuture.fromResponse(statusWithServiceResponseAsync(cwKey, instanceIds), serviceCallback);
    }

    /**
     * Instance의 Extended 설정 여부를 조회합니다.
     *
     * @param cwKey 상품의 cw_key
     * @param instanceIds Extended 설정 여부를 조회하고자하는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;SchemaExtendedStatusParameter&gt; object
     */
    public Observable<List<SchemaExtendedStatusParameter>> statusAsync(String cwKey, String instanceIds) {
        return statusWithServiceResponseAsync(cwKey, instanceIds).map(new Func1<ServiceResponse<List<SchemaExtendedStatusParameter>>, List<SchemaExtendedStatusParameter>>() {
            @Override
            public List<SchemaExtendedStatusParameter> call(ServiceResponse<List<SchemaExtendedStatusParameter>> response) {
                return response.body();
            }
        });
    }

    /**
     * Instance의 Extended 설정 여부를 조회합니다.
     *
     * @param cwKey 상품의 cw_key
     * @param instanceIds Extended 설정 여부를 조회하고자하는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;SchemaExtendedStatusParameter&gt; object
     */
    public Observable<ServiceResponse<List<SchemaExtendedStatusParameter>>> statusWithServiceResponseAsync(String cwKey, String instanceIds) {
        if (cwKey == null) {
            throw new IllegalArgumentException("Parameter cwKey is required and cannot be null.");
        }
        if (instanceIds == null) {
            throw new IllegalArgumentException("Parameter instanceIds is required and cannot be null.");
        }
        return service.status(cwKey, instanceIds)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<SchemaExtendedStatusParameter>>>>() {
                @Override
                public Observable<ServiceResponse<List<SchemaExtendedStatusParameter>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<SchemaExtendedStatusParameter>> clientResponse = statusDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<SchemaExtendedStatusParameter>> statusDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<SchemaExtendedStatusParameter>, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<SchemaExtendedStatusParameter>>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
