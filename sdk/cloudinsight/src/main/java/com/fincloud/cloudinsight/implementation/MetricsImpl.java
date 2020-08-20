/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.Metrics;
import com.fincloud.cloudinsight.models.MetricListRequest;
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
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Metrics.
 */
public class MetricsImpl implements Metrics {
    /** The Retrofit service to perform REST calls. */
    private MetricsService service;
    /** The service client containing this operation class. */
    private CloudInsightManagementClientImpl client;

    /**
     * Initializes an instance of Metrics.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MetricsImpl(Retrofit retrofit, CloudInsightManagementClientImpl client) {
        this.service = retrofit.create(MetricsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Metrics to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MetricsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Metrics getGroupItemsId" })
        @GET("cw_fea/real/cw/api/rule/group/getMetricGroupItemsId")
        Observable<Response<ResponseBody>> getGroupItemsId(@Query("count") int count);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Metrics searchList" })
        @POST("cw_fea/real/cw/api/rule/group/metric/search")
        Observable<Response<ResponseBody>> searchList(@Body MetricListRequest parameters);

    }

    /**
     * 감시 항목 id를 할당받습니다.
     *
     * @param count MetricGroupItem id 개수
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;String&gt; object if successful.
     */
    public List<String> getGroupItemsId(int count) {
        return getGroupItemsIdWithServiceResponseAsync(count).toBlocking().single().body();
    }

    /**
     * 감시 항목 id를 할당받습니다.
     *
     * @param count MetricGroupItem id 개수
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<String>> getGroupItemsIdAsync(int count, final ServiceCallback<List<String>> serviceCallback) {
        return ServiceFuture.fromResponse(getGroupItemsIdWithServiceResponseAsync(count), serviceCallback);
    }

    /**
     * 감시 항목 id를 할당받습니다.
     *
     * @param count MetricGroupItem id 개수
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;String&gt; object
     */
    public Observable<List<String>> getGroupItemsIdAsync(int count) {
        return getGroupItemsIdWithServiceResponseAsync(count).map(new Func1<ServiceResponse<List<String>>, List<String>>() {
            @Override
            public List<String> call(ServiceResponse<List<String>> response) {
                return response.body();
            }
        });
    }

    /**
     * 감시 항목 id를 할당받습니다.
     *
     * @param count MetricGroupItem id 개수
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;String&gt; object
     */
    public Observable<ServiceResponse<List<String>>> getGroupItemsIdWithServiceResponseAsync(int count) {
        return service.getGroupItemsId(count)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<String>>>>() {
                @Override
                public Observable<ServiceResponse<List<String>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<String>> clientResponse = getGroupItemsIdDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<String>> getGroupItemsIdDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<List<String>, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<String>>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 감시대상 그룹에서 조회가능한 항목(metric) 리스트를 조회합니다.
     *
     * @param parameters Search metric list
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void searchList(MetricListRequest parameters) {
        searchListWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * 감시대상 그룹에서 조회가능한 항목(metric) 리스트를 조회합니다.
     *
     * @param parameters Search metric list
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> searchListAsync(MetricListRequest parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(searchListWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * 감시대상 그룹에서 조회가능한 항목(metric) 리스트를 조회합니다.
     *
     * @param parameters Search metric list
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> searchListAsync(MetricListRequest parameters) {
        return searchListWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 감시대상 그룹에서 조회가능한 항목(metric) 리스트를 조회합니다.
     *
     * @param parameters Search metric list
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> searchListWithServiceResponseAsync(MetricListRequest parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.searchList(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = searchListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> searchListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
