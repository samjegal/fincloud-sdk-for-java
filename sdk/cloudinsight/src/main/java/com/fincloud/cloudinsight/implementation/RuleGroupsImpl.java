/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.RuleGroups;
import com.fincloud.cloudinsight.models.DirectRuleGroupCreateRequest;
import com.fincloud.cloudinsight.models.RuleGroupCopyForAsgGroupRequest;
import com.fincloud.cloudinsight.models.RuleGroupCopySettingRequest;
import com.fincloud.cloudinsight.models.RuleGroupDeleteItemParameter;
import com.fincloud.cloudinsight.models.RuleGroupDeleteRequest;
import com.fincloud.cloudinsight.models.RuleGroupItemListParameter;
import com.fincloud.cloudinsight.models.RuleGroupListQueryRequest;
import com.fincloud.cloudinsight.models.RuleGroupListQueryResponse;
import com.fincloud.cloudinsight.models.RuleGroupParameter;
import com.fincloud.cloudinsight.models.RuleGroupRequest;
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
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in RuleGroups.
 */
public class RuleGroupsImpl implements RuleGroups {
    /** The Retrofit service to perform REST calls. */
    private RuleGroupsService service;
    /** The service client containing this operation class. */
    private CloudInsightManagementClientImpl client;

    /**
     * Initializes an instance of RuleGroups.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RuleGroupsImpl(Retrofit retrofit, CloudInsightManagementClientImpl client) {
        this.service = retrofit.create(RuleGroupsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for RuleGroups to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RuleGroupsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.RuleGroups getByMonitorGroupIds" })
        @POST("cw_fea/real/cw/api/rule/group/metric/group/related")
        Observable<Response<ResponseBody>> getByMonitorGroupIds(@Query("prodKey") String prodKey, @Body List<String> parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.RuleGroups create" })
        @POST("cw_fea/real/cw/api/rule/group/ruleGrp")
        Observable<Response<ResponseBody>> create(@Body RuleGroupRequest parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.RuleGroups copyAsgGroup" })
        @POST("cw_fea/real/cw/api/rule/group/ruleGrp/asgCopy")
        Observable<Response<ResponseBody>> copyAsgGroup(@Body RuleGroupCopyForAsgGroupRequest parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.RuleGroups copy" })
        @PUT("cw_fea/real/cw/api/rule/group/ruleGrp/copy/{id}")
        Observable<Response<ResponseBody>> copy(@Path("id") String id);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.RuleGroups copySettings" })
        @POST("cw_fea/real/cw/api/rule/group/ruleGrp/copySettings")
        Observable<Response<ResponseBody>> copySettings(@Body RuleGroupCopySettingRequest parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.RuleGroups createDirectly" })
        @POST("cw_fea/real/cw/api/rule/group/ruleGrp/createDirectly")
        Observable<Response<ResponseBody>> createDirectly(@Body DirectRuleGroupCreateRequest parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.RuleGroups delete" })
        @POST("cw_fea/real/cw/api/rule/group/ruleGrp/del")
        Observable<Response<ResponseBody>> delete(@Body RuleGroupDeleteRequest parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.RuleGroups deleteByProdKeyAndId" })
        @HTTP(path = "cw_fea/real/cw/api/rule/group/ruleGrp/del/{prodKey}/{id}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteByProdKeyAndId(@Path("prodKey") String prodKey, @Path("id") String id);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.RuleGroups query" })
        @POST("cw_fea/real/cw/api/rule/group/ruleGrp/query")
        Observable<Response<ResponseBody>> query(@Body RuleGroupListQueryRequest parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.RuleGroups queryByProdKeyAndId" })
        @GET("cw_fea/real/cw/api/rule/group/ruleGrp/query/{prodKey}/{id}")
        Observable<Response<ResponseBody>> queryByProdKeyAndId(@Path("prodKey") String prodKey, @Path("id") String id);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.RuleGroups update" })
        @POST("cw_fea/real/cw/api/rule/group/ruleGrp/update")
        Observable<Response<ResponseBody>> update(@Body RuleGroupRequest parameters);

    }

    /**
     * 감시 대상 그룹과 관련된 Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 조회하려는 감시 대상 그룹의 Id이며, 여러개의 감시 대상 그룹을 한번에 조회할 수 있습니다.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;RuleGroupItemListParameter&gt; object if successful.
     */
    public List<RuleGroupItemListParameter> getByMonitorGroupIds(String prodKey, List<String> parameters) {
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
    public ServiceFuture<List<RuleGroupItemListParameter>> getByMonitorGroupIdsAsync(String prodKey, List<String> parameters, final ServiceCallback<List<RuleGroupItemListParameter>> serviceCallback) {
        return ServiceFuture.fromResponse(getByMonitorGroupIdsWithServiceResponseAsync(prodKey, parameters), serviceCallback);
    }

    /**
     * 감시 대상 그룹과 관련된 Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 조회하려는 감시 대상 그룹의 Id이며, 여러개의 감시 대상 그룹을 한번에 조회할 수 있습니다.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;RuleGroupItemListParameter&gt; object
     */
    public Observable<List<RuleGroupItemListParameter>> getByMonitorGroupIdsAsync(String prodKey, List<String> parameters) {
        return getByMonitorGroupIdsWithServiceResponseAsync(prodKey, parameters).map(new Func1<ServiceResponse<List<RuleGroupItemListParameter>>, List<RuleGroupItemListParameter>>() {
            @Override
            public List<RuleGroupItemListParameter> call(ServiceResponse<List<RuleGroupItemListParameter>> response) {
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
     * @return the observable to the List&lt;RuleGroupItemListParameter&gt; object
     */
    public Observable<ServiceResponse<List<RuleGroupItemListParameter>>> getByMonitorGroupIdsWithServiceResponseAsync(String prodKey, List<String> parameters) {
        if (prodKey == null) {
            throw new IllegalArgumentException("Parameter prodKey is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.getByMonitorGroupIds(prodKey, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<RuleGroupItemListParameter>>>>() {
                @Override
                public Observable<ServiceResponse<List<RuleGroupItemListParameter>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<RuleGroupItemListParameter>> clientResponse = getByMonitorGroupIdsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<RuleGroupItemListParameter>> getByMonitorGroupIdsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<RuleGroupItemListParameter>, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<RuleGroupItemListParameter>>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Event Rule을 생성합니다.
     *
     * @param parameters 이벤트 룰 그룹 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the long object if successful.
     */
    public long create(RuleGroupRequest parameters) {
        return createWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Event Rule을 생성합니다.
     *
     * @param parameters 이벤트 룰 그룹 요청
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Long> createAsync(RuleGroupRequest parameters, final ServiceCallback<Long> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Event Rule을 생성합니다.
     *
     * @param parameters 이벤트 룰 그룹 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Long object
     */
    public Observable<Long> createAsync(RuleGroupRequest parameters) {
        return createWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<Long>, Long>() {
            @Override
            public Long call(ServiceResponse<Long> response) {
                return response.body();
            }
        });
    }

    /**
     * Event Rule을 생성합니다.
     *
     * @param parameters 이벤트 룰 그룹 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Long object
     */
    public Observable<ServiceResponse<Long>> createWithServiceResponseAsync(RuleGroupRequest parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.create(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Long>>>() {
                @Override
                public Observable<ServiceResponse<Long>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Long> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Long> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Long, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Long>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Copy new rules according to proto asgGroupNo.
     *
     * @param parameters Copy rule for asgGroup
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;Object&gt; object if successful.
     */
    public List<Object> copyAsgGroup(RuleGroupCopyForAsgGroupRequest parameters) {
        return copyAsgGroupWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Copy new rules according to proto asgGroupNo.
     *
     * @param parameters Copy rule for asgGroup
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<Object>> copyAsgGroupAsync(RuleGroupCopyForAsgGroupRequest parameters, final ServiceCallback<List<Object>> serviceCallback) {
        return ServiceFuture.fromResponse(copyAsgGroupWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Copy new rules according to proto asgGroupNo.
     *
     * @param parameters Copy rule for asgGroup
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Object&gt; object
     */
    public Observable<List<Object>> copyAsgGroupAsync(RuleGroupCopyForAsgGroupRequest parameters) {
        return copyAsgGroupWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<List<Object>>, List<Object>>() {
            @Override
            public List<Object> call(ServiceResponse<List<Object>> response) {
                return response.body();
            }
        });
    }

    /**
     * Copy new rules according to proto asgGroupNo.
     *
     * @param parameters Copy rule for asgGroup
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Object&gt; object
     */
    public Observable<ServiceResponse<List<Object>>> copyAsgGroupWithServiceResponseAsync(RuleGroupCopyForAsgGroupRequest parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.copyAsgGroup(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<Object>>>>() {
                @Override
                public Observable<ServiceResponse<List<Object>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<Object>> clientResponse = copyAsgGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<Object>> copyAsgGroupDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<Object>, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<Object>>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Event Rule을 복제합니다.
     *
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String copy(String id) {
        return copyWithServiceResponseAsync(id).toBlocking().single().body();
    }

    /**
     * Event Rule을 복제합니다.
     *
     * @param id 감시 항목 그룹(템플릿)의 id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> copyAsync(String id, final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(copyWithServiceResponseAsync(id), serviceCallback);
    }

    /**
     * Event Rule을 복제합니다.
     *
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> copyAsync(String id) {
        return copyWithServiceResponseAsync(id).map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * Event Rule을 복제합니다.
     *
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> copyWithServiceResponseAsync(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        return service.copy(id)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = copyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<String> copyDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<String, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Event Rule의 설정을 복사하여 지정한 resource에 대한 새로운 Event Rule을 생성합니다.
     *
     * @param parameters copy given rule's settings into the resourceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;Long&gt; object if successful.
     */
    public List<Long> copySettings(RuleGroupCopySettingRequest parameters) {
        return copySettingsWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Event Rule의 설정을 복사하여 지정한 resource에 대한 새로운 Event Rule을 생성합니다.
     *
     * @param parameters copy given rule's settings into the resourceId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<Long>> copySettingsAsync(RuleGroupCopySettingRequest parameters, final ServiceCallback<List<Long>> serviceCallback) {
        return ServiceFuture.fromResponse(copySettingsWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Event Rule의 설정을 복사하여 지정한 resource에 대한 새로운 Event Rule을 생성합니다.
     *
     * @param parameters copy given rule's settings into the resourceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Long&gt; object
     */
    public Observable<List<Long>> copySettingsAsync(RuleGroupCopySettingRequest parameters) {
        return copySettingsWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<List<Long>>, List<Long>>() {
            @Override
            public List<Long> call(ServiceResponse<List<Long>> response) {
                return response.body();
            }
        });
    }

    /**
     * Event Rule의 설정을 복사하여 지정한 resource에 대한 새로운 Event Rule을 생성합니다.
     *
     * @param parameters copy given rule's settings into the resourceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Long&gt; object
     */
    public Observable<ServiceResponse<List<Long>>> copySettingsWithServiceResponseAsync(RuleGroupCopySettingRequest parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.copySettings(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<Long>>>>() {
                @Override
                public Observable<ServiceResponse<List<Long>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<Long>> clientResponse = copySettingsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<Long>> copySettingsDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<Long>, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<Long>>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 감시 대상 그룹과 감시 항목 그룹 생성 없이 감시 대상과 감시 항목을 지정하여 바로 Event Rule을 생성합니다.
     *
     * @param parameters 감시 대상 그룹, 감시 항목 그룹 생성 없이 Event Rule 생성
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String createDirectly(DirectRuleGroupCreateRequest parameters) {
        return createDirectlyWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * 감시 대상 그룹과 감시 항목 그룹 생성 없이 감시 대상과 감시 항목을 지정하여 바로 Event Rule을 생성합니다.
     *
     * @param parameters 감시 대상 그룹, 감시 항목 그룹 생성 없이 Event Rule 생성
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> createDirectlyAsync(DirectRuleGroupCreateRequest parameters, final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(createDirectlyWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * 감시 대상 그룹과 감시 항목 그룹 생성 없이 감시 대상과 감시 항목을 지정하여 바로 Event Rule을 생성합니다.
     *
     * @param parameters 감시 대상 그룹, 감시 항목 그룹 생성 없이 Event Rule 생성
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> createDirectlyAsync(DirectRuleGroupCreateRequest parameters) {
        return createDirectlyWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * 감시 대상 그룹과 감시 항목 그룹 생성 없이 감시 대상과 감시 항목을 지정하여 바로 Event Rule을 생성합니다.
     *
     * @param parameters 감시 대상 그룹, 감시 항목 그룹 생성 없이 Event Rule 생성
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> createDirectlyWithServiceResponseAsync(DirectRuleGroupCreateRequest parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.createDirectly(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = createDirectlyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<String> createDirectlyDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<String, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Event Rule을 삭제합니다.
     *
     * @param items rule group List
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(List<RuleGroupDeleteItemParameter> items) {
        deleteWithServiceResponseAsync(items).toBlocking().single().body();
    }

    /**
     * Event Rule을 삭제합니다.
     *
     * @param items rule group List
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(List<RuleGroupDeleteItemParameter> items, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(items), serviceCallback);
    }

    /**
     * Event Rule을 삭제합니다.
     *
     * @param items rule group List
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(List<RuleGroupDeleteItemParameter> items) {
        return deleteWithServiceResponseAsync(items).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Event Rule을 삭제합니다.
     *
     * @param items rule group List
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(List<RuleGroupDeleteItemParameter> items) {
        if (items == null) {
            throw new IllegalArgumentException("Parameter items is required and cannot be null.");
        }
        Validator.validate(items);
        RuleGroupDeleteRequest parameters = new RuleGroupDeleteRequest();
        parameters.withItems(items);
        return service.delete(parameters)
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
     * Event Rule id로 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void deleteByProdKeyAndId(String prodKey, String id) {
        deleteByProdKeyAndIdWithServiceResponseAsync(prodKey, id).toBlocking().single().body();
    }

    /**
     * Event Rule id로 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteByProdKeyAndIdAsync(String prodKey, String id, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteByProdKeyAndIdWithServiceResponseAsync(prodKey, id), serviceCallback);
    }

    /**
     * Event Rule id로 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
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
     * Event Rule id로 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
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
     * Event Rule을 조회합니다.
     *
     * @param parameters Rule group list query item
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RuleGroupListQueryResponse object if successful.
     */
    public RuleGroupListQueryResponse query(RuleGroupListQueryRequest parameters) {
        return queryWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Event Rule을 조회합니다.
     *
     * @param parameters Rule group list query item
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RuleGroupListQueryResponse> queryAsync(RuleGroupListQueryRequest parameters, final ServiceCallback<RuleGroupListQueryResponse> serviceCallback) {
        return ServiceFuture.fromResponse(queryWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Event Rule을 조회합니다.
     *
     * @param parameters Rule group list query item
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RuleGroupListQueryResponse object
     */
    public Observable<RuleGroupListQueryResponse> queryAsync(RuleGroupListQueryRequest parameters) {
        return queryWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<RuleGroupListQueryResponse>, RuleGroupListQueryResponse>() {
            @Override
            public RuleGroupListQueryResponse call(ServiceResponse<RuleGroupListQueryResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Event Rule을 조회합니다.
     *
     * @param parameters Rule group list query item
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RuleGroupListQueryResponse object
     */
    public Observable<ServiceResponse<RuleGroupListQueryResponse>> queryWithServiceResponseAsync(RuleGroupListQueryRequest parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.query(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RuleGroupListQueryResponse>>>() {
                @Override
                public Observable<ServiceResponse<RuleGroupListQueryResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RuleGroupListQueryResponse> clientResponse = queryDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RuleGroupListQueryResponse> queryDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RuleGroupListQueryResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RuleGroupListQueryResponse>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RuleGroupParameter object if successful.
     */
    public RuleGroupParameter queryByProdKeyAndId(String prodKey, String id) {
        return queryByProdKeyAndIdWithServiceResponseAsync(prodKey, id).toBlocking().single().body();
    }

    /**
     * Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RuleGroupParameter> queryByProdKeyAndIdAsync(String prodKey, String id, final ServiceCallback<RuleGroupParameter> serviceCallback) {
        return ServiceFuture.fromResponse(queryByProdKeyAndIdWithServiceResponseAsync(prodKey, id), serviceCallback);
    }

    /**
     * Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RuleGroupParameter object
     */
    public Observable<RuleGroupParameter> queryByProdKeyAndIdAsync(String prodKey, String id) {
        return queryByProdKeyAndIdWithServiceResponseAsync(prodKey, id).map(new Func1<ServiceResponse<RuleGroupParameter>, RuleGroupParameter>() {
            @Override
            public RuleGroupParameter call(ServiceResponse<RuleGroupParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RuleGroupParameter object
     */
    public Observable<ServiceResponse<RuleGroupParameter>> queryByProdKeyAndIdWithServiceResponseAsync(String prodKey, String id) {
        if (prodKey == null) {
            throw new IllegalArgumentException("Parameter prodKey is required and cannot be null.");
        }
        if (id == null) {
            throw new IllegalArgumentException("Parameter id is required and cannot be null.");
        }
        return service.queryByProdKeyAndId(prodKey, id)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RuleGroupParameter>>>() {
                @Override
                public Observable<ServiceResponse<RuleGroupParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RuleGroupParameter> clientResponse = queryByProdKeyAndIdDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RuleGroupParameter> queryByProdKeyAndIdDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RuleGroupParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RuleGroupParameter>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Event Rule을 수정합니다.
     *
     * @param parameters Event Rule 생성/수정 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void update(RuleGroupRequest parameters) {
        updateWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Event Rule을 수정합니다.
     *
     * @param parameters Event Rule 생성/수정 요청
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> updateAsync(RuleGroupRequest parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Event Rule을 수정합니다.
     *
     * @param parameters Event Rule 생성/수정 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> updateAsync(RuleGroupRequest parameters) {
        return updateWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Event Rule을 수정합니다.
     *
     * @param parameters Event Rule 생성/수정 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(RuleGroupRequest parameters) {
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
