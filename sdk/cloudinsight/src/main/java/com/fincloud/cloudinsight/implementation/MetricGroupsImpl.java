/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.MetricGroups;
import com.fincloud.cloudinsight.models.MetricGroupListResponse;
import com.fincloud.cloudinsight.models.MetricsGroupParameter;
import com.fincloud.cloudinsight.models.MetricsGroupRequest;
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
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in MetricGroups.
 */
public class MetricGroupsImpl implements MetricGroups {
    /** The Retrofit service to perform REST calls. */
    private MetricGroupsService service;
    /** The service client containing this operation class. */
    private CloudInsightManagementClientImpl client;

    /**
     * Initializes an instance of MetricGroups.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MetricGroupsImpl(Retrofit retrofit, CloudInsightManagementClientImpl client) {
        this.service = retrofit.create(MetricGroupsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for MetricGroups to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MetricGroupsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.MetricGroups create" })
        @POST("cw_fea/real/cw/api/rule/group/metrics")
        Observable<Response<ResponseBody>> create(@Body MetricsGroupRequest parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.MetricGroups delete" })
        @HTTP(path = "cw_fea/real/cw/api/rule/group/metrics/del", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Query("prodKey") String prodKey, @Body List<String> parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.MetricGroups deleteByProdKeyAndId" })
        @HTTP(path = "cw_fea/real/cw/api/rule/group/metrics/del/{prodKey}/{id}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteByProdKeyAndId(@Path("prodKey") String prodKey, @Path("id") String id);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.MetricGroups list" })
        @GET("cw_fea/real/cw/api/rule/group/metrics/query/{prodKey}")
        Observable<Response<ResponseBody>> list(@Path("prodKey") String prodKey);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.MetricGroups get" })
        @GET("cw_fea/real/cw/api/rule/group/metrics/query/{prodKey}/{id}")
        Observable<Response<ResponseBody>> get(@Path("prodKey") String prodKey, @Path("id") String id);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.MetricGroups update" })
        @POST("cw_fea/real/cw/api/rule/group/metrics/update")
        Observable<Response<ResponseBody>> update(@Body MetricsGroupRequest parameters);

    }

    /**
     * 감시 항목 그룹(템플릿)을 생성합니다.
     *
     * @param parameters Create or update event rule metrics group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String create(MetricsGroupRequest parameters) {
        return createWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * 감시 항목 그룹(템플릿)을 생성합니다.
     *
     * @param parameters Create or update event rule metrics group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> createAsync(MetricsGroupRequest parameters, final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * 감시 항목 그룹(템플릿)을 생성합니다.
     *
     * @param parameters Create or update event rule metrics group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> createAsync(MetricsGroupRequest parameters) {
        return createWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * 감시 항목 그룹(템플릿)을 생성합니다.
     *
     * @param parameters Create or update event rule metrics group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> createWithServiceResponseAsync(MetricsGroupRequest parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.create(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<String> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<String, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 감시 항목 그룹(템플릿)을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String prodKey, List<String> parameters) {
        deleteWithServiceResponseAsync(prodKey, parameters).toBlocking().single().body();
    }

    /**
     * 감시 항목 그룹(템플릿)을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters Rule group for deletion
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String prodKey, List<String> parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(prodKey, parameters), serviceCallback);
    }

    /**
     * 감시 항목 그룹(템플릿)을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String prodKey, List<String> parameters) {
        return deleteWithServiceResponseAsync(prodKey, parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 감시 항목 그룹(템플릿)을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String prodKey, List<String> parameters) {
        if (prodKey == null) {
            throw new IllegalArgumentException("Parameter prodKey is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.delete(prodKey, parameters)
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
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void deleteByProdKeyAndId(String prodKey, String id) {
        deleteByProdKeyAndIdWithServiceResponseAsync(prodKey, id).toBlocking().single().body();
    }

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteByProdKeyAndIdAsync(String prodKey, String id, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteByProdKeyAndIdWithServiceResponseAsync(prodKey, id), serviceCallback);
    }

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteByProdKeyAndIdAsync(String prodKey, String id) {
        return deleteByProdKeyAndIdWithServiceResponseAsync(prodKey, id).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteByProdKeyAndIdWithServiceResponseAsync(String prodKey, String id) {
        if (prodKey == null) {
            throw new IllegalArgumentException("Parameter prodKey is required and cannot be null.");
        }
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        return service.deleteByProdKeyAndId(prodKey, id)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteByProdKeyAndIdDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteByProdKeyAndIdDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 해당 상품에 대한 모든 감시 항목 그룹(템플릿)을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MetricGroupListResponse object if successful.
     */
    public MetricGroupListResponse list(String prodKey) {
        return listWithServiceResponseAsync(prodKey).toBlocking().single().body();
    }

    /**
     * 해당 상품에 대한 모든 감시 항목 그룹(템플릿)을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MetricGroupListResponse> listAsync(String prodKey, final ServiceCallback<MetricGroupListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(prodKey), serviceCallback);
    }

    /**
     * 해당 상품에 대한 모든 감시 항목 그룹(템플릿)을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricGroupListResponse object
     */
    public Observable<MetricGroupListResponse> listAsync(String prodKey) {
        return listWithServiceResponseAsync(prodKey).map(new Func1<ServiceResponse<MetricGroupListResponse>, MetricGroupListResponse>() {
            @Override
            public MetricGroupListResponse call(ServiceResponse<MetricGroupListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 해당 상품에 대한 모든 감시 항목 그룹(템플릿)을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricGroupListResponse object
     */
    public Observable<ServiceResponse<MetricGroupListResponse>> listWithServiceResponseAsync(String prodKey) {
        if (prodKey == null) {
            throw new IllegalArgumentException("Parameter prodKey is required and cannot be null.");
        }
        return service.list(prodKey)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MetricGroupListResponse>>>() {
                @Override
                public Observable<ServiceResponse<MetricGroupListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MetricGroupListResponse> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MetricGroupListResponse> listDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MetricGroupListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MetricGroupListResponse>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹에 대한 상세정보를 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MetricsGroupParameter object if successful.
     */
    public MetricsGroupParameter get(String prodKey, String id) {
        return getWithServiceResponseAsync(prodKey, id).toBlocking().single().body();
    }

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹에 대한 상세정보를 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MetricsGroupParameter> getAsync(String prodKey, String id, final ServiceCallback<MetricsGroupParameter> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(prodKey, id), serviceCallback);
    }

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹에 대한 상세정보를 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricsGroupParameter object
     */
    public Observable<MetricsGroupParameter> getAsync(String prodKey, String id) {
        return getWithServiceResponseAsync(prodKey, id).map(new Func1<ServiceResponse<MetricsGroupParameter>, MetricsGroupParameter>() {
            @Override
            public MetricsGroupParameter call(ServiceResponse<MetricsGroupParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹에 대한 상세정보를 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricsGroupParameter object
     */
    public Observable<ServiceResponse<MetricsGroupParameter>> getWithServiceResponseAsync(String prodKey, String id) {
        if (prodKey == null) {
            throw new IllegalArgumentException("Parameter prodKey is required and cannot be null.");
        }
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        return service.get(prodKey, id)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MetricsGroupParameter>>>() {
                @Override
                public Observable<ServiceResponse<MetricsGroupParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MetricsGroupParameter> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MetricsGroupParameter> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MetricsGroupParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MetricsGroupParameter>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 감시 항목 그룹(템플릿)을 수정합니다.
     *
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void update(MetricsGroupRequest parameters) {
        updateWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * 감시 항목 그룹(템플릿)을 수정합니다.
     *
     * @param parameters Rule group for deletion
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> updateAsync(MetricsGroupRequest parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * 감시 항목 그룹(템플릿)을 수정합니다.
     *
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> updateAsync(MetricsGroupRequest parameters) {
        return updateWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 감시 항목 그룹(템플릿)을 수정합니다.
     *
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(MetricsGroupRequest parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.update(parameters)
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

    private ServiceResponse<Void> updateDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
