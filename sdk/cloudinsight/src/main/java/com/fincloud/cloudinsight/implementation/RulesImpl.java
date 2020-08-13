/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.Rules;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Rules.
 */
public class RulesImpl implements Rules {
    /** The Retrofit service to perform REST calls. */
    private RulesService service;
    /** The service client containing this operation class. */
    private CloudInsightManagementClientImpl client;

    /**
     * Initializes an instance of Rules.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RulesImpl(Retrofit retrofit, CloudInsightManagementClientImpl client) {
        this.service = retrofit.create(RulesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Rules to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RulesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Rules create" })
        @POST("cw_fea/real/cw/api/rule")
        Observable<Response<ResponseBody>> create();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Rules getList" })
        @POST("cw_fea/real/cw/api/rule/search/{pageNum}/{pageSize}")
        Observable<Response<ResponseBody>> getList(@Path("pageNum") String pageNum, @Path("pageSize") String pageSize);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Rules get" })
        @GET("cw_fea/real/cw/api/rule/{ruleId}")
        Observable<Response<ResponseBody>> get(@Path("ruleId") String ruleId);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Rules update" })
        @PUT("cw_fea/real/cw/api/rule/{ruleId}")
        Observable<Response<ResponseBody>> update(@Path("ruleId") String ruleId);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Rules delete" })
        @HTTP(path = "cw_fea/real/cw/api/rule/{ruleId}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("ruleId") String ruleId);

    }

    /**
     * Create a new event rule.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void create() {
        createWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Create a new event rule.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> createAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Create a new event rule.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> createAsync() {
        return createWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new event rule.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> createWithServiceResponseAsync() {
        return service.create()
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

    private ServiceResponse<Void> createDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Get rule list.
     *
     * @param pageNum 페이지 번호
     * @param pageSize 페이지 크기
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getList(String pageNum, String pageSize) {
        getListWithServiceResponseAsync(pageNum, pageSize).toBlocking().single().body();
    }

    /**
     * Get rule list.
     *
     * @param pageNum 페이지 번호
     * @param pageSize 페이지 크기
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getListAsync(String pageNum, String pageSize, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(pageNum, pageSize), serviceCallback);
    }

    /**
     * Get rule list.
     *
     * @param pageNum 페이지 번호
     * @param pageSize 페이지 크기
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getListAsync(String pageNum, String pageSize) {
        return getListWithServiceResponseAsync(pageNum, pageSize).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Get rule list.
     *
     * @param pageNum 페이지 번호
     * @param pageSize 페이지 크기
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getListWithServiceResponseAsync(String pageNum, String pageSize) {
        if (pageNum == null) {
            throw new IllegalArgumentException("Parameter pageNum is required and cannot be null.");
        }
        if (pageSize == null) {
            throw new IllegalArgumentException("Parameter pageSize is required and cannot be null.");
        }
        return service.getList(pageNum, pageSize)
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

    private ServiceResponse<Void> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Get event rule by ID.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void get(String ruleId) {
        getWithServiceResponseAsync(ruleId).toBlocking().single().body();
    }

    /**
     * Get event rule by ID.
     *
     * @param ruleId Rule 고유 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getAsync(String ruleId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(ruleId), serviceCallback);
    }

    /**
     * Get event rule by ID.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getAsync(String ruleId) {
        return getWithServiceResponseAsync(ruleId).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Get event rule by ID.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getWithServiceResponseAsync(String ruleId) {
        if (ruleId == null) {
            throw new IllegalArgumentException("Parameter ruleId is required and cannot be null.");
        }
        return service.get(ruleId)
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

    private ServiceResponse<Void> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Update an existing event rule.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void update(String ruleId) {
        updateWithServiceResponseAsync(ruleId).toBlocking().single().body();
    }

    /**
     * Update an existing event rule.
     *
     * @param ruleId Rule 고유 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> updateAsync(String ruleId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(ruleId), serviceCallback);
    }

    /**
     * Update an existing event rule.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> updateAsync(String ruleId) {
        return updateWithServiceResponseAsync(ruleId).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Update an existing event rule.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(String ruleId) {
        if (ruleId == null) {
            throw new IllegalArgumentException("Parameter ruleId is required and cannot be null.");
        }
        return service.update(ruleId)
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
                .build(response);
    }

    /**
     * Delete selected event rule.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String ruleId) {
        deleteWithServiceResponseAsync(ruleId).toBlocking().single().body();
    }

    /**
     * Delete selected event rule.
     *
     * @param ruleId Rule 고유 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String ruleId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(ruleId), serviceCallback);
    }

    /**
     * Delete selected event rule.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String ruleId) {
        return deleteWithServiceResponseAsync(ruleId).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete selected event rule.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String ruleId) {
        if (ruleId == null) {
            throw new IllegalArgumentException("Parameter ruleId is required and cannot be null.");
        }
        return service.delete(ruleId)
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
                .build(response);
    }

}
