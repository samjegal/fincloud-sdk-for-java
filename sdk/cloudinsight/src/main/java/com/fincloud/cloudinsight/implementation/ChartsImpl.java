/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.Charts;
import com.fincloud.cloudinsight.models.ChartDataWidgetRequest;
import com.fincloud.cloudinsight.models.WidgetMetricInfoResponse;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Charts.
 */
public class ChartsImpl implements Charts {
    /** The Retrofit service to perform REST calls. */
    private ChartsService service;
    /** The service client containing this operation class. */
    private CloudInsightManagementClientImpl client;

    /**
     * Initializes an instance of Charts.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ChartsImpl(Retrofit retrofit, CloudInsightManagementClientImpl client) {
        this.service = retrofit.create(ChartsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Charts to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ChartsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Charts preview" })
        @POST("cw_fea/real/cw/api/data/chart/preview")
        Observable<Response<ResponseBody>> preview(@Body ChartDataWidgetRequest parameters);

    }

    /**
     * 간단하게 Metric 데이터와 함께 Preview Chart를 조회합니다.
     *
     * @param parameters Metric information for the data to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WidgetMetricInfoResponse object if successful.
     */
    public WidgetMetricInfoResponse preview(ChartDataWidgetRequest parameters) {
        return previewWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * 간단하게 Metric 데이터와 함께 Preview Chart를 조회합니다.
     *
     * @param parameters Metric information for the data to be retrieved
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WidgetMetricInfoResponse> previewAsync(ChartDataWidgetRequest parameters, final ServiceCallback<WidgetMetricInfoResponse> serviceCallback) {
        return ServiceFuture.fromResponse(previewWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * 간단하게 Metric 데이터와 함께 Preview Chart를 조회합니다.
     *
     * @param parameters Metric information for the data to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WidgetMetricInfoResponse object
     */
    public Observable<WidgetMetricInfoResponse> previewAsync(ChartDataWidgetRequest parameters) {
        return previewWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<WidgetMetricInfoResponse>, WidgetMetricInfoResponse>() {
            @Override
            public WidgetMetricInfoResponse call(ServiceResponse<WidgetMetricInfoResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 간단하게 Metric 데이터와 함께 Preview Chart를 조회합니다.
     *
     * @param parameters Metric information for the data to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WidgetMetricInfoResponse object
     */
    public Observable<ServiceResponse<WidgetMetricInfoResponse>> previewWithServiceResponseAsync(ChartDataWidgetRequest parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.preview(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WidgetMetricInfoResponse>>>() {
                @Override
                public Observable<ServiceResponse<WidgetMetricInfoResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WidgetMetricInfoResponse> clientResponse = previewDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<WidgetMetricInfoResponse> previewDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<WidgetMetricInfoResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WidgetMetricInfoResponse>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
