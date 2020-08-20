/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.MonitorGroups;
import com.fincloud.cloudinsight.models.MonitorGroupParameter;
import com.fincloud.cloudinsight.models.RemoveResourceFromRulesParameter;
import com.fincloud.cloudinsight.models.TypeGroupRelatedRuleParameter;
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
 * in MonitorGroups.
 */
public class MonitorGroupsImpl implements MonitorGroups {
    /** The Retrofit service to perform REST calls. */
    private MonitorGroupsService service;
    /** The service client containing this operation class. */
    private CloudInsightManagementClientImpl client;

    /**
     * Initializes an instance of MonitorGroups.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MonitorGroupsImpl(Retrofit retrofit, CloudInsightManagementClientImpl client) {
        this.service = retrofit.create(MonitorGroupsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorGroups to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MonitorGroupsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.MonitorGroups deleteForce" })
        @HTTP(path = "cw_fea/real/cw/api/rule/group/metric/groups", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteForce(@Query("prodKey") String prodKey, @Body List<TypeGroupRelatedRuleParameter> parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.MonitorGroups getByMonitorGroupIds" })
        @POST("cw_fea/real/cw/api/rule/group/monitor/group/related")
        Observable<Response<ResponseBody>> getByMonitorGroupIds(@Query("prodKey") String prodKey, @Body List<String> parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.MonitorGroups deleteForce1" })
        @HTTP(path = "cw_fea/real/cw/api/rule/group/monitor/groups", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteForce1(@Query("prodKey") String prodKey, @Body List<TypeGroupRelatedRuleParameter> parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.MonitorGroups removeResourceFromRules" })
        @POST("cw_fea/real/cw/api/rule/group/monitor/removeResourceFromRules")
        Observable<Response<ResponseBody>> removeResourceFromRules(@Body RemoveResourceFromRulesParameter parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.MonitorGroups list" })
        @GET("cw_fea/real/cw/api/rule/group/monitor/{prodKey}")
        Observable<Response<ResponseBody>> list(@Path("prodKey") String prodKey);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.MonitorGroups get" })
        @GET("cw_fea/real/cw/api/rule/group/monitor/{prodKey}/{id}")
        Observable<Response<ResponseBody>> get(@Path("prodKey") String prodKey, @Path("id") String id);

    }

    /**
     * 감시 대상 그룹과 관련된 모든 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void deleteForce(String prodKey, List<TypeGroupRelatedRuleParameter> parameters) {
        deleteForceWithServiceResponseAsync(prodKey, parameters).toBlocking().single().body();
    }

    /**
     * 감시 대상 그룹과 관련된 모든 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters Rule group for deletion
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteForceAsync(String prodKey, List<TypeGroupRelatedRuleParameter> parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteForceWithServiceResponseAsync(prodKey, parameters), serviceCallback);
    }

    /**
     * 감시 대상 그룹과 관련된 모든 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteForceAsync(String prodKey, List<TypeGroupRelatedRuleParameter> parameters) {
        return deleteForceWithServiceResponseAsync(prodKey, parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 감시 대상 그룹과 관련된 모든 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteForceWithServiceResponseAsync(String prodKey, List<TypeGroupRelatedRuleParameter> parameters) {
        if (prodKey == null) {
            throw new IllegalArgumentException("Parameter prodKey is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.deleteForce(prodKey, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteForceDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteForceDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 감시 대상 그룹과 관련된 Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 조회하려는 감시 대상 그룹의 Id이며, 여러개의 감시 대상 그룹을 한번에 조회할 수 있습니다.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String getByMonitorGroupIds(String prodKey, List<String> parameters) {
        return getByMonitorGroupIdsWithServiceResponseAsync(prodKey, parameters).toBlocking().single().body();
    }

    /**
     * 감시 대상 그룹과 관련된 Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 조회하려는 감시 대상 그룹의 Id이며, 여러개의 감시 대상 그룹을 한번에 조회할 수 있습니다.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> getByMonitorGroupIdsAsync(String prodKey, List<String> parameters, final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(getByMonitorGroupIdsWithServiceResponseAsync(prodKey, parameters), serviceCallback);
    }

    /**
     * 감시 대상 그룹과 관련된 Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 조회하려는 감시 대상 그룹의 Id이며, 여러개의 감시 대상 그룹을 한번에 조회할 수 있습니다.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> getByMonitorGroupIdsAsync(String prodKey, List<String> parameters) {
        return getByMonitorGroupIdsWithServiceResponseAsync(prodKey, parameters).map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * 감시 대상 그룹과 관련된 Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 조회하려는 감시 대상 그룹의 Id이며, 여러개의 감시 대상 그룹을 한번에 조회할 수 있습니다.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> getByMonitorGroupIdsWithServiceResponseAsync(String prodKey, List<String> parameters) {
        if (prodKey == null) {
            throw new IllegalArgumentException("Parameter prodKey is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.getByMonitorGroupIds(prodKey, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = getByMonitorGroupIdsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<String> getByMonitorGroupIdsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<String, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 감시 대상 그룹과 관련된 모든 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 감시 대상 그룹 혹은 감시 항목 그룹과 관련된 모든 Event Rule 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String deleteForce1(String prodKey, List<TypeGroupRelatedRuleParameter> parameters) {
        return deleteForce1WithServiceResponseAsync(prodKey, parameters).toBlocking().single().body();
    }

    /**
     * 감시 대상 그룹과 관련된 모든 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 감시 대상 그룹 혹은 감시 항목 그룹과 관련된 모든 Event Rule 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> deleteForce1Async(String prodKey, List<TypeGroupRelatedRuleParameter> parameters, final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(deleteForce1WithServiceResponseAsync(prodKey, parameters), serviceCallback);
    }

    /**
     * 감시 대상 그룹과 관련된 모든 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 감시 대상 그룹 혹은 감시 항목 그룹과 관련된 모든 Event Rule 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> deleteForce1Async(String prodKey, List<TypeGroupRelatedRuleParameter> parameters) {
        return deleteForce1WithServiceResponseAsync(prodKey, parameters).map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * 감시 대상 그룹과 관련된 모든 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 감시 대상 그룹 혹은 감시 항목 그룹과 관련된 모든 Event Rule 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> deleteForce1WithServiceResponseAsync(String prodKey, List<TypeGroupRelatedRuleParameter> parameters) {
        if (prodKey == null) {
            throw new IllegalArgumentException("Parameter prodKey is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.deleteForce1(prodKey, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = deleteForce1Delegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<String> deleteForce1Delegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<String, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Event Rule의 감시 대상 그룹에서 특정 감시 대상을 삭제합니다.
     *
     * @param parameters Remove info
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void removeResourceFromRules(RemoveResourceFromRulesParameter parameters) {
        removeResourceFromRulesWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Event Rule의 감시 대상 그룹에서 특정 감시 대상을 삭제합니다.
     *
     * @param parameters Remove info
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> removeResourceFromRulesAsync(RemoveResourceFromRulesParameter parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(removeResourceFromRulesWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Event Rule의 감시 대상 그룹에서 특정 감시 대상을 삭제합니다.
     *
     * @param parameters Remove info
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> removeResourceFromRulesAsync(RemoveResourceFromRulesParameter parameters) {
        return removeResourceFromRulesWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Event Rule의 감시 대상 그룹에서 특정 감시 대상을 삭제합니다.
     *
     * @param parameters Remove info
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> removeResourceFromRulesWithServiceResponseAsync(RemoveResourceFromRulesParameter parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.removeResourceFromRules(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = removeResourceFromRulesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> removeResourceFromRulesDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
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
     * @return the List&lt;MonitorGroupParameter&gt; object if successful.
     */
    public List<MonitorGroupParameter> list(String prodKey) {
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
    public ServiceFuture<List<MonitorGroupParameter>> listAsync(String prodKey, final ServiceCallback<List<MonitorGroupParameter>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(prodKey), serviceCallback);
    }

    /**
     * 해당 상품에 대한 모든 감시 항목 그룹(템플릿)을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MonitorGroupParameter&gt; object
     */
    public Observable<List<MonitorGroupParameter>> listAsync(String prodKey) {
        return listWithServiceResponseAsync(prodKey).map(new Func1<ServiceResponse<List<MonitorGroupParameter>>, List<MonitorGroupParameter>>() {
            @Override
            public List<MonitorGroupParameter> call(ServiceResponse<List<MonitorGroupParameter>> response) {
                return response.body();
            }
        });
    }

    /**
     * 해당 상품에 대한 모든 감시 항목 그룹(템플릿)을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MonitorGroupParameter&gt; object
     */
    public Observable<ServiceResponse<List<MonitorGroupParameter>>> listWithServiceResponseAsync(String prodKey) {
        if (prodKey == null) {
            throw new IllegalArgumentException("Parameter prodKey is required and cannot be null.");
        }
        return service.list(prodKey)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<MonitorGroupParameter>>>>() {
                @Override
                public Observable<ServiceResponse<List<MonitorGroupParameter>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<MonitorGroupParameter>> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<MonitorGroupParameter>> listDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<MonitorGroupParameter>, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<MonitorGroupParameter>>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹에 대한 상세정보를 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MonitorGroupParameter object if successful.
     */
    public MonitorGroupParameter get(String prodKey, String id) {
        return getWithServiceResponseAsync(prodKey, id).toBlocking().single().body();
    }

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹에 대한 상세정보를 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MonitorGroupParameter> getAsync(String prodKey, String id, final ServiceCallback<MonitorGroupParameter> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(prodKey, id), serviceCallback);
    }

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹에 대한 상세정보를 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MonitorGroupParameter object
     */
    public Observable<MonitorGroupParameter> getAsync(String prodKey, String id) {
        return getWithServiceResponseAsync(prodKey, id).map(new Func1<ServiceResponse<MonitorGroupParameter>, MonitorGroupParameter>() {
            @Override
            public MonitorGroupParameter call(ServiceResponse<MonitorGroupParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹에 대한 상세정보를 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MonitorGroupParameter object
     */
    public Observable<ServiceResponse<MonitorGroupParameter>> getWithServiceResponseAsync(String prodKey, String id) {
        if (prodKey == null) {
            throw new IllegalArgumentException("Parameter prodKey is required and cannot be null.");
        }
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        return service.get(prodKey, id)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MonitorGroupParameter>>>() {
                @Override
                public Observable<ServiceResponse<MonitorGroupParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MonitorGroupParameter> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MonitorGroupParameter> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MonitorGroupParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MonitorGroupParameter>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
