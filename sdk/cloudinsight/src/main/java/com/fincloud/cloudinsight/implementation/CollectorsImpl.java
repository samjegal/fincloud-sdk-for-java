/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.Collectors;
import com.fincloud.cloudinsight.models.CloudInsightCollectorParameter;
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
 * in Collectors.
 */
public class CollectorsImpl implements Collectors {
    /** The Retrofit service to perform REST calls. */
    private CollectorsService service;
    /** The service client containing this operation class. */
    private CloudInsightManagementClientImpl client;

    /**
     * Initializes an instance of Collectors.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public CollectorsImpl(Retrofit retrofit, CloudInsightManagementClientImpl client) {
        this.service = retrofit.create(CollectorsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Collectors to be
     * used by Retrofit to perform actually REST calls.
     */
    interface CollectorsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Collectors push" })
        @POST("cw_collector/real")
        Observable<Response<ResponseBody>> push(@Body CloudInsightCollectorParameter parameters);

    }

    /**
     * Collector API.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void push(CloudInsightCollectorParameter parameters) {
        pushWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Collector API.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> pushAsync(CloudInsightCollectorParameter parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(pushWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Collector API.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> pushAsync(CloudInsightCollectorParameter parameters) {
        return pushWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Collector API.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> pushWithServiceResponseAsync(CloudInsightCollectorParameter parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.push(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = pushDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> pushDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
