/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.Schemas;
import com.fincloud.cloudinsight.models.CloudInsightSchemaParameter;
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
        Observable<Response<ResponseBody>> get(@Query("prodName") String prodName);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Schemas create" })
        @POST("cw_fea/real/cw/api/schema")
        Observable<Response<ResponseBody>> create(@Query("prodName") String prodName, @Body CloudInsightSchemaParameter parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Schemas update" })
        @PUT("cw_fea/real/cw/api/schema")
        Observable<Response<ResponseBody>> update(@Query("prodName") String prodName);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Schemas delete" })
        @HTTP(path = "cw_fea/real/cw/api/schema", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Query("prodName") String prodName);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Schemas disable" })
        @PUT("cw_fea/real/cw/api/schema/extended/disable")
        Observable<Response<ResponseBody>> disable(@Query("cw_key") String cwKey, @Query("instanceIds") String instanceIds);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Schemas enable" })
        @PUT("cw_fea/real/cw/api/schema/extended/enable")
        Observable<Response<ResponseBody>> enable(@Query("cw_key") String cwKey, @Query("instanceIds") String instanceIds);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Schemas queryStatus" })
        @GET("cw_fea/real/cw/api/schema/extended/status")
        Observable<Response<ResponseBody>> queryStatus(@Query("cw_key") String cwKey, @Query("instanceIds") String instanceIds);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Schemas getList" })
        @GET("cw_fea/real/cw/api/schema/list")
        Observable<Response<ResponseBody>> getList();

    }

    /**
     * Get schema information of the specific product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void get() {
        getWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get schema information of the specific product.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get schema information of the specific product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getAsync() {
        return getWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Get schema information of the specific product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getWithServiceResponseAsync() {
        final String prodName = null;
        return service.get(prodName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get schema information of the specific product.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void get(String prodName) {
        getWithServiceResponseAsync(prodName).toBlocking().single().body();
    }

    /**
     * Get schema information of the specific product.
     *
     * @param prodName Product 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getAsync(String prodName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(prodName), serviceCallback);
    }

    /**
     * Get schema information of the specific product.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getAsync(String prodName) {
        return getWithServiceResponseAsync(prodName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Get schema information of the specific product.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getWithServiceResponseAsync(String prodName) {
        return service.get(prodName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> getDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Create schema for user application. If product does not exist, it will registered automatically.
     *
     * @param parameters Cloud Insight Custom 메트릭 생성 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void create(CloudInsightSchemaParameter parameters) {
        createWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Create schema for user application. If product does not exist, it will registered automatically.
     *
     * @param parameters Cloud Insight Custom 메트릭 생성 데이터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> createAsync(CloudInsightSchemaParameter parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Create schema for user application. If product does not exist, it will registered automatically.
     *
     * @param parameters Cloud Insight Custom 메트릭 생성 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> createAsync(CloudInsightSchemaParameter parameters) {
        return createWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Create schema for user application. If product does not exist, it will registered automatically.
     *
     * @param parameters Cloud Insight Custom 메트릭 생성 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> createWithServiceResponseAsync(CloudInsightSchemaParameter parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String prodName = null;
        return service.create(prodName, parameters)
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

    /**
     * Create schema for user application. If product does not exist, it will registered automatically.
     *
     * @param parameters Cloud Insight Custom 메트릭 생성 데이터
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void create(CloudInsightSchemaParameter parameters, String prodName) {
        createWithServiceResponseAsync(parameters, prodName).toBlocking().single().body();
    }

    /**
     * Create schema for user application. If product does not exist, it will registered automatically.
     *
     * @param parameters Cloud Insight Custom 메트릭 생성 데이터
     * @param prodName Product 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> createAsync(CloudInsightSchemaParameter parameters, String prodName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(parameters, prodName), serviceCallback);
    }

    /**
     * Create schema for user application. If product does not exist, it will registered automatically.
     *
     * @param parameters Cloud Insight Custom 메트릭 생성 데이터
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> createAsync(CloudInsightSchemaParameter parameters, String prodName) {
        return createWithServiceResponseAsync(parameters, prodName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Create schema for user application. If product does not exist, it will registered automatically.
     *
     * @param parameters Cloud Insight Custom 메트릭 생성 데이터
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> createWithServiceResponseAsync(CloudInsightSchemaParameter parameters, String prodName) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.create(prodName, parameters)
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
     * Update schema for an existing product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void update() {
        updateWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Update schema for an existing product.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> updateAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Update schema for an existing product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> updateAsync() {
        return updateWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Update schema for an existing product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> updateWithServiceResponseAsync() {
        final String prodName = null;
        return service.update(prodName)
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

    /**
     * Update schema for an existing product.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void update(String prodName) {
        updateWithServiceResponseAsync(prodName).toBlocking().single().body();
    }

    /**
     * Update schema for an existing product.
     *
     * @param prodName Product 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> updateAsync(String prodName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(prodName), serviceCallback);
    }

    /**
     * Update schema for an existing product.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> updateAsync(String prodName) {
        return updateWithServiceResponseAsync(prodName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Update schema for an existing product.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(String prodName) {
        return service.update(prodName)
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

    private ServiceResponse<Void> updateDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Delete schema for an application.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete() {
        deleteWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Delete schema for an application.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Delete schema for an application.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync() {
        return deleteWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete schema for an application.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync() {
        final String prodName = null;
        return service.delete(prodName)
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

    /**
     * Delete schema for an application.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String prodName) {
        deleteWithServiceResponseAsync(prodName).toBlocking().single().body();
    }

    /**
     * Delete schema for an application.
     *
     * @param prodName Product 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String prodName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(prodName), serviceCallback);
    }

    /**
     * Delete schema for an application.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String prodName) {
        return deleteWithServiceResponseAsync(prodName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete schema for an application.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String prodName) {
        return service.delete(prodName)
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

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Disable the extended metrics for a product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void disable() {
        disableWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Disable the extended metrics for a product.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> disableAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(disableWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Disable the extended metrics for a product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> disableAsync() {
        return disableWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Disable the extended metrics for a product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> disableWithServiceResponseAsync() {
        final String cwKey = null;
        final String instanceIds = null;
        return service.disable(cwKey, instanceIds)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = disableDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Disable the extended metrics for a product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void disable(String cwKey, String instanceIds) {
        disableWithServiceResponseAsync(cwKey, instanceIds).toBlocking().single().body();
    }

    /**
     * Disable the extended metrics for a product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> disableAsync(String cwKey, String instanceIds, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(disableWithServiceResponseAsync(cwKey, instanceIds), serviceCallback);
    }

    /**
     * Disable the extended metrics for a product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> disableAsync(String cwKey, String instanceIds) {
        return disableWithServiceResponseAsync(cwKey, instanceIds).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Disable the extended metrics for a product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> disableWithServiceResponseAsync(String cwKey, String instanceIds) {
        return service.disable(cwKey, instanceIds)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = disableDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> disableDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Enable the extended metrics for a product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void enable() {
        enableWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Enable the extended metrics for a product.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> enableAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(enableWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Enable the extended metrics for a product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> enableAsync() {
        return enableWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Enable the extended metrics for a product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> enableWithServiceResponseAsync() {
        final String cwKey = null;
        final String instanceIds = null;
        return service.enable(cwKey, instanceIds)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = enableDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Enable the extended metrics for a product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void enable(String cwKey, String instanceIds) {
        enableWithServiceResponseAsync(cwKey, instanceIds).toBlocking().single().body();
    }

    /**
     * Enable the extended metrics for a product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> enableAsync(String cwKey, String instanceIds, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(enableWithServiceResponseAsync(cwKey, instanceIds), serviceCallback);
    }

    /**
     * Enable the extended metrics for a product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> enableAsync(String cwKey, String instanceIds) {
        return enableWithServiceResponseAsync(cwKey, instanceIds).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Enable the extended metrics for a product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> enableWithServiceResponseAsync(String cwKey, String instanceIds) {
        return service.enable(cwKey, instanceIds)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = enableDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> enableDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Query the status of extended metrics of those product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void queryStatus() {
        queryStatusWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Query the status of extended metrics of those product.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> queryStatusAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(queryStatusWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Query the status of extended metrics of those product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> queryStatusAsync() {
        return queryStatusWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Query the status of extended metrics of those product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> queryStatusWithServiceResponseAsync() {
        final String cwKey = null;
        final String instanceIds = null;
        return service.queryStatus(cwKey, instanceIds)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = queryStatusDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Query the status of extended metrics of those product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void queryStatus(String cwKey, String instanceIds) {
        queryStatusWithServiceResponseAsync(cwKey, instanceIds).toBlocking().single().body();
    }

    /**
     * Query the status of extended metrics of those product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> queryStatusAsync(String cwKey, String instanceIds, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(queryStatusWithServiceResponseAsync(cwKey, instanceIds), serviceCallback);
    }

    /**
     * Query the status of extended metrics of those product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> queryStatusAsync(String cwKey, String instanceIds) {
        return queryStatusWithServiceResponseAsync(cwKey, instanceIds).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Query the status of extended metrics of those product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> queryStatusWithServiceResponseAsync(String cwKey, String instanceIds) {
        return service.queryStatus(cwKey, instanceIds)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = queryStatusDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> queryStatusDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Get schema list.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getList() {
        getListWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get schema list.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getListAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get schema list.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getListAsync() {
        return getListWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Get schema list.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getListWithServiceResponseAsync() {
        return service.getList()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> getListDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
