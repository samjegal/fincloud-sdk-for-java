/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.Datas;
import com.fincloud.cloudinsight.models.MultipleDataParameter;
import com.fincloud.cloudinsight.models.QueryMultipleRequest;
import com.fincloud.cloudinsight.models.QueryRequest;
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
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Datas.
 */
public class DatasImpl implements Datas {
    /** The Retrofit service to perform REST calls. */
    private DatasService service;
    /** The service client containing this operation class. */
    private CloudInsightManagementClientImpl client;

    /**
     * Initializes an instance of Datas.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DatasImpl(Retrofit retrofit, CloudInsightManagementClientImpl client) {
        this.service = retrofit.create(DatasService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Datas to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DatasService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Datas query" })
        @POST("cw_fea/real/cw/api/data/query")
        Observable<Response<ResponseBody>> query(@Body QueryRequest parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Datas queryMultiple" })
        @POST("cw_fea/real/cw/api/data/query/multiple")
        Observable<Response<ResponseBody>> queryMultiple(@Body QueryMultipleRequest parameters);

    }

    /**
     * Cloud Insight에서 수집한 time-series 데이터를 쿼리합니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;List&lt;Double&gt;&gt; object if successful.
     */
    public List<List<Double>> query(QueryRequest parameters) {
        return queryWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Cloud Insight에서 수집한 time-series 데이터를 쿼리합니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<List<Double>>> queryAsync(QueryRequest parameters, final ServiceCallback<List<List<Double>>> serviceCallback) {
        return ServiceFuture.fromResponse(queryWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Cloud Insight에서 수집한 time-series 데이터를 쿼리합니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;List&lt;Double&gt;&gt; object
     */
    public Observable<List<List<Double>>> queryAsync(QueryRequest parameters) {
        return queryWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<List<List<Double>>>, List<List<Double>>>() {
            @Override
            public List<List<Double>> call(ServiceResponse<List<List<Double>>> response) {
                return response.body();
            }
        });
    }

    /**
     * Cloud Insight에서 수집한 time-series 데이터를 쿼리합니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;List&lt;Double&gt;&gt; object
     */
    public Observable<ServiceResponse<List<List<Double>>>> queryWithServiceResponseAsync(QueryRequest parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.query(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<List<Double>>>>>() {
                @Override
                public Observable<ServiceResponse<List<List<Double>>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<List<Double>>> clientResponse = queryDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<List<Double>>> queryDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<List<Double>>, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<List<Double>>>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Cloud Insight에서 수집한 여러개의 time-series 데이터를 쿼리합니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;MultipleDataParameter&gt; object if successful.
     */
    public List<MultipleDataParameter> queryMultiple(QueryMultipleRequest parameters) {
        return queryMultipleWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Cloud Insight에서 수집한 여러개의 time-series 데이터를 쿼리합니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<MultipleDataParameter>> queryMultipleAsync(QueryMultipleRequest parameters, final ServiceCallback<List<MultipleDataParameter>> serviceCallback) {
        return ServiceFuture.fromResponse(queryMultipleWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Cloud Insight에서 수집한 여러개의 time-series 데이터를 쿼리합니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MultipleDataParameter&gt; object
     */
    public Observable<List<MultipleDataParameter>> queryMultipleAsync(QueryMultipleRequest parameters) {
        return queryMultipleWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<List<MultipleDataParameter>>, List<MultipleDataParameter>>() {
            @Override
            public List<MultipleDataParameter> call(ServiceResponse<List<MultipleDataParameter>> response) {
                return response.body();
            }
        });
    }

    /**
     * Cloud Insight에서 수집한 여러개의 time-series 데이터를 쿼리합니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MultipleDataParameter&gt; object
     */
    public Observable<ServiceResponse<List<MultipleDataParameter>>> queryMultipleWithServiceResponseAsync(QueryMultipleRequest parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.queryMultiple(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<MultipleDataParameter>>>>() {
                @Override
                public Observable<ServiceResponse<List<MultipleDataParameter>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<MultipleDataParameter>> clientResponse = queryMultipleDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<MultipleDataParameter>> queryMultipleDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<MultipleDataParameter>, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<MultipleDataParameter>>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
