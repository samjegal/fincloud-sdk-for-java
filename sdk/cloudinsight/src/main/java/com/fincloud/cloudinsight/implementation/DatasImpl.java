/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.Datas;
import com.fincloud.cloudinsight.models.CloudInsightDataInfoParameter;
import com.fincloud.cloudinsight.models.CloudInsightQueryMultipleParameter;
import com.fincloud.cloudinsight.models.CloudInsightQueryParameter;
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
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Datas preview" })
        @POST("cw_fea/real/cw/api/data/chart/preview")
        Observable<Response<ResponseBody>> preview();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Datas query" })
        @POST("cw_fea/real/cw/api/data/query")
        Observable<Response<ResponseBody>> query(@Body CloudInsightQueryParameter parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Datas queryMultiple" })
        @POST("cw_fea/real/cw/api/data/query/multiple")
        Observable<Response<ResponseBody>> queryMultiple(@Body CloudInsightQueryMultipleParameter parameters);

    }

    /**
     * Metric information for the data to be retrieved.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void preview() {
        previewWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Metric information for the data to be retrieved.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> previewAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(previewWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Metric information for the data to be retrieved.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> previewAsync() {
        return previewWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Metric information for the data to be retrieved.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> previewWithServiceResponseAsync() {
        return service.preview()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = previewDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> previewDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Get widget data preview for dashboard widget.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;List&lt;Double&gt;&gt; object if successful.
     */
    public List<List<Double>> query(CloudInsightQueryParameter parameters) {
        return queryWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Get widget data preview for dashboard widget.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<List<Double>>> queryAsync(CloudInsightQueryParameter parameters, final ServiceCallback<List<List<Double>>> serviceCallback) {
        return ServiceFuture.fromResponse(queryWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Get widget data preview for dashboard widget.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;List&lt;Double&gt;&gt; object
     */
    public Observable<List<List<Double>>> queryAsync(CloudInsightQueryParameter parameters) {
        return queryWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<List<List<Double>>>, List<List<Double>>>() {
            @Override
            public List<List<Double>> call(ServiceResponse<List<List<Double>>> response) {
                return response.body();
            }
        });
    }

    /**
     * Get widget data preview for dashboard widget.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;List&lt;Double&gt;&gt; object
     */
    public Observable<ServiceResponse<List<List<Double>>>> queryWithServiceResponseAsync(CloudInsightQueryParameter parameters) {
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
                .build(response);
    }

    /**
     * Query multiple metric data for a specific product with specified criteria.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;CloudInsightDataInfoParameter&gt; object if successful.
     */
    public List<CloudInsightDataInfoParameter> queryMultiple(CloudInsightQueryMultipleParameter parameters) {
        return queryMultipleWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Query multiple metric data for a specific product with specified criteria.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<CloudInsightDataInfoParameter>> queryMultipleAsync(CloudInsightQueryMultipleParameter parameters, final ServiceCallback<List<CloudInsightDataInfoParameter>> serviceCallback) {
        return ServiceFuture.fromResponse(queryMultipleWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Query multiple metric data for a specific product with specified criteria.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;CloudInsightDataInfoParameter&gt; object
     */
    public Observable<List<CloudInsightDataInfoParameter>> queryMultipleAsync(CloudInsightQueryMultipleParameter parameters) {
        return queryMultipleWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<List<CloudInsightDataInfoParameter>>, List<CloudInsightDataInfoParameter>>() {
            @Override
            public List<CloudInsightDataInfoParameter> call(ServiceResponse<List<CloudInsightDataInfoParameter>> response) {
                return response.body();
            }
        });
    }

    /**
     * Query multiple metric data for a specific product with specified criteria.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;CloudInsightDataInfoParameter&gt; object
     */
    public Observable<ServiceResponse<List<CloudInsightDataInfoParameter>>> queryMultipleWithServiceResponseAsync(CloudInsightQueryMultipleParameter parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.queryMultiple(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<CloudInsightDataInfoParameter>>>>() {
                @Override
                public Observable<ServiceResponse<List<CloudInsightDataInfoParameter>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<CloudInsightDataInfoParameter>> clientResponse = queryMultipleDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<CloudInsightDataInfoParameter>> queryMultipleDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<CloudInsightDataInfoParameter>, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<CloudInsightDataInfoParameter>>() { }.getType())
                .build(response);
    }

}
