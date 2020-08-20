/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.Schemas;
import com.fincloud.cloudinsight.models.ScehmaUpdateResponse;
import com.fincloud.cloudinsight.models.SchemaRegisterResponse;
import com.fincloud.cloudinsight.models.SchemaRequest;
import com.fincloud.cloudinsight.models.SchemaResponse;
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
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Schemas.
 */
public class SchemasImpl implements Schemas {
    /** The Retrofit service to perform REST calls. */
    private SchemasService service;
    /** The service client containing this operation class. */
    private CloudInsightManagementClientImpl client;

    /**
     * Initializes an instance of Schemas.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SchemasImpl(Retrofit retrofit, CloudInsightManagementClientImpl client) {
        this.service = retrofit.create(SchemasService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Schemas to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SchemasService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Schemas get" })
        @GET("cw_fea/real/cw/api/schema")
        Observable<Response<ResponseBody>> get(@Query("cw_key") String cwKey, @Query("prodName") String prodName);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Schemas register" })
        @POST("cw_fea/real/cw/api/schema")
        Observable<Response<ResponseBody>> register(@Body SchemaRequest parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Schemas update" })
        @PUT("cw_fea/real/cw/api/schema")
        Observable<Response<ResponseBody>> update(@Body SchemaRequest parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Schemas delete" })
        @HTTP(path = "cw_fea/real/cw/api/schema", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Query("cw_key") String cwKey, @Query("prodName") String prodName);

    }

    /**
     * 사용자가 정의한 스키마를 조회합니다.
     *
     * @param prodName 상품의 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SchemaResponse object if successful.
     */
    public SchemaResponse get(String prodName) {
        return getWithServiceResponseAsync(prodName).toBlocking().single().body();
    }

    /**
     * 사용자가 정의한 스키마를 조회합니다.
     *
     * @param prodName 상품의 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SchemaResponse> getAsync(String prodName, final ServiceCallback<SchemaResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(prodName), serviceCallback);
    }

    /**
     * 사용자가 정의한 스키마를 조회합니다.
     *
     * @param prodName 상품의 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaResponse object
     */
    public Observable<SchemaResponse> getAsync(String prodName) {
        return getWithServiceResponseAsync(prodName).map(new Func1<ServiceResponse<SchemaResponse>, SchemaResponse>() {
            @Override
            public SchemaResponse call(ServiceResponse<SchemaResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 사용자가 정의한 스키마를 조회합니다.
     *
     * @param prodName 상품의 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaResponse object
     */
    public Observable<ServiceResponse<SchemaResponse>> getWithServiceResponseAsync(String prodName) {
        if (prodName == null) {
            throw new IllegalArgumentException("Parameter prodName is required and cannot be null.");
        }
        final String cwKey = null;
        return service.get(cwKey, prodName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SchemaResponse>>>() {
                @Override
                public Observable<ServiceResponse<SchemaResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SchemaResponse> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 사용자가 정의한 스키마를 조회합니다.
     *
     * @param prodName 상품의 이름
     * @param cwKey 상품의 cw_key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SchemaResponse object if successful.
     */
    public SchemaResponse get(String prodName, String cwKey) {
        return getWithServiceResponseAsync(prodName, cwKey).toBlocking().single().body();
    }

    /**
     * 사용자가 정의한 스키마를 조회합니다.
     *
     * @param prodName 상품의 이름
     * @param cwKey 상품의 cw_key
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SchemaResponse> getAsync(String prodName, String cwKey, final ServiceCallback<SchemaResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(prodName, cwKey), serviceCallback);
    }

    /**
     * 사용자가 정의한 스키마를 조회합니다.
     *
     * @param prodName 상품의 이름
     * @param cwKey 상품의 cw_key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaResponse object
     */
    public Observable<SchemaResponse> getAsync(String prodName, String cwKey) {
        return getWithServiceResponseAsync(prodName, cwKey).map(new Func1<ServiceResponse<SchemaResponse>, SchemaResponse>() {
            @Override
            public SchemaResponse call(ServiceResponse<SchemaResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 사용자가 정의한 스키마를 조회합니다.
     *
     * @param prodName 상품의 이름
     * @param cwKey 상품의 cw_key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaResponse object
     */
    public Observable<ServiceResponse<SchemaResponse>> getWithServiceResponseAsync(String prodName, String cwKey) {
        if (prodName == null) {
            throw new IllegalArgumentException("Parameter prodName is required and cannot be null.");
        }
        return service.get(cwKey, prodName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SchemaResponse>>>() {
                @Override
                public Observable<ServiceResponse<SchemaResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SchemaResponse> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SchemaResponse> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SchemaResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SchemaResponse>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Cloud Insight에서 사용자 정의 스키마를 등록합니다.
     *
     * @param parameters 상품의 스키마 정의
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SchemaRegisterResponse object if successful.
     */
    public SchemaRegisterResponse register(SchemaRequest parameters) {
        return registerWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Cloud Insight에서 사용자 정의 스키마를 등록합니다.
     *
     * @param parameters 상품의 스키마 정의
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SchemaRegisterResponse> registerAsync(SchemaRequest parameters, final ServiceCallback<SchemaRegisterResponse> serviceCallback) {
        return ServiceFuture.fromResponse(registerWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Cloud Insight에서 사용자 정의 스키마를 등록합니다.
     *
     * @param parameters 상품의 스키마 정의
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaRegisterResponse object
     */
    public Observable<SchemaRegisterResponse> registerAsync(SchemaRequest parameters) {
        return registerWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<SchemaRegisterResponse>, SchemaRegisterResponse>() {
            @Override
            public SchemaRegisterResponse call(ServiceResponse<SchemaRegisterResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Cloud Insight에서 사용자 정의 스키마를 등록합니다.
     *
     * @param parameters 상품의 스키마 정의
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaRegisterResponse object
     */
    public Observable<ServiceResponse<SchemaRegisterResponse>> registerWithServiceResponseAsync(SchemaRequest parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.register(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SchemaRegisterResponse>>>() {
                @Override
                public Observable<ServiceResponse<SchemaRegisterResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SchemaRegisterResponse> clientResponse = registerDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SchemaRegisterResponse> registerDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SchemaRegisterResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SchemaRegisterResponse>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Update schema for an existing product.
     *
     * @param parameters 상품의 스키마 정의
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ScehmaUpdateResponse object if successful.
     */
    public ScehmaUpdateResponse update(SchemaRequest parameters) {
        return updateWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Update schema for an existing product.
     *
     * @param parameters 상품의 스키마 정의
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ScehmaUpdateResponse> updateAsync(SchemaRequest parameters, final ServiceCallback<ScehmaUpdateResponse> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Update schema for an existing product.
     *
     * @param parameters 상품의 스키마 정의
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ScehmaUpdateResponse object
     */
    public Observable<ScehmaUpdateResponse> updateAsync(SchemaRequest parameters) {
        return updateWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<ScehmaUpdateResponse>, ScehmaUpdateResponse>() {
            @Override
            public ScehmaUpdateResponse call(ServiceResponse<ScehmaUpdateResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Update schema for an existing product.
     *
     * @param parameters 상품의 스키마 정의
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ScehmaUpdateResponse object
     */
    public Observable<ServiceResponse<ScehmaUpdateResponse>> updateWithServiceResponseAsync(SchemaRequest parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.update(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ScehmaUpdateResponse>>>() {
                @Override
                public Observable<ServiceResponse<ScehmaUpdateResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ScehmaUpdateResponse> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ScehmaUpdateResponse> updateDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ScehmaUpdateResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ScehmaUpdateResponse>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Delete schema for an application.
     *
     * @param cwKey 상품의 cw_key
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String cwKey, String prodName) {
        deleteWithServiceResponseAsync(cwKey, prodName).toBlocking().single().body();
    }

    /**
     * Delete schema for an application.
     *
     * @param cwKey 상품의 cw_key
     * @param prodName Product 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String cwKey, String prodName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(cwKey, prodName), serviceCallback);
    }

    /**
     * Delete schema for an application.
     *
     * @param cwKey 상품의 cw_key
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String cwKey, String prodName) {
        return deleteWithServiceResponseAsync(cwKey, prodName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete schema for an application.
     *
     * @param cwKey 상품의 cw_key
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String cwKey, String prodName) {
        if (cwKey == null) {
            throw new IllegalArgumentException("Parameter cwKey is required and cannot be null.");
        }
        if (prodName == null) {
            throw new IllegalArgumentException("Parameter prodName is required and cannot be null.");
        }
        return service.delete(cwKey, prodName)
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
                .register(200, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
