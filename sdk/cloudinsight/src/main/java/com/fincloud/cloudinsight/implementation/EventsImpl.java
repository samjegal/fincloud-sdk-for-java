/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.Events;
import com.fincloud.cloudinsight.models.EventSearchRequest;
import com.fincloud.cloudinsight.models.EventSearchResultParameter;
import com.fincloud.cloudinsight.models.SearchEventCountConsoleRequest;
import com.fincloud.cloudinsight.models.SearchEventCountConsoleResponse;
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
 * in Events.
 */
public class EventsImpl implements Events {
    /** The Retrofit service to perform REST calls. */
    private EventsService service;
    /** The service client containing this operation class. */
    private CloudInsightManagementClientImpl client;

    /**
     * Initializes an instance of Events.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public EventsImpl(Retrofit retrofit, CloudInsightManagementClientImpl client) {
        this.service = retrofit.create(EventsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Events to be
     * used by Retrofit to perform actually REST calls.
     */
    interface EventsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Events searchById" })
        @POST("cw/api/event/searchById")
        Observable<Response<ResponseBody>> searchById(@Body EventSearchRequest parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Events searchEventCount" })
        @POST("cw_fea/real/cw/api/event/searchEventCountConsole")
        Observable<Response<ResponseBody>> searchEventCount(@Body SearchEventCountConsoleRequest parameters);

    }

    /**
     * Event id와 Rule id로 Event를 상세 조회합니다.
     *
     * @param parameters Event search criteria
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;EventSearchResultParameter&gt; object if successful.
     */
    public List<EventSearchResultParameter> searchById(EventSearchRequest parameters) {
        return searchByIdWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Event id와 Rule id로 Event를 상세 조회합니다.
     *
     * @param parameters Event search criteria
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<EventSearchResultParameter>> searchByIdAsync(EventSearchRequest parameters, final ServiceCallback<List<EventSearchResultParameter>> serviceCallback) {
        return ServiceFuture.fromResponse(searchByIdWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Event id와 Rule id로 Event를 상세 조회합니다.
     *
     * @param parameters Event search criteria
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;EventSearchResultParameter&gt; object
     */
    public Observable<List<EventSearchResultParameter>> searchByIdAsync(EventSearchRequest parameters) {
        return searchByIdWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<List<EventSearchResultParameter>>, List<EventSearchResultParameter>>() {
            @Override
            public List<EventSearchResultParameter> call(ServiceResponse<List<EventSearchResultParameter>> response) {
                return response.body();
            }
        });
    }

    /**
     * Event id와 Rule id로 Event를 상세 조회합니다.
     *
     * @param parameters Event search criteria
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;EventSearchResultParameter&gt; object
     */
    public Observable<ServiceResponse<List<EventSearchResultParameter>>> searchByIdWithServiceResponseAsync(EventSearchRequest parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.searchById(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<EventSearchResultParameter>>>>() {
                @Override
                public Observable<ServiceResponse<List<EventSearchResultParameter>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<EventSearchResultParameter>> clientResponse = searchByIdDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<EventSearchResultParameter>> searchByIdDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<EventSearchResultParameter>, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<EventSearchResultParameter>>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Search event count console.
     *
     * @param parameters the SearchEventCountConsoleRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SearchEventCountConsoleResponse object if successful.
     */
    public SearchEventCountConsoleResponse searchEventCount(SearchEventCountConsoleRequest parameters) {
        return searchEventCountWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Search event count console.
     *
     * @param parameters the SearchEventCountConsoleRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SearchEventCountConsoleResponse> searchEventCountAsync(SearchEventCountConsoleRequest parameters, final ServiceCallback<SearchEventCountConsoleResponse> serviceCallback) {
        return ServiceFuture.fromResponse(searchEventCountWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Search event count console.
     *
     * @param parameters the SearchEventCountConsoleRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SearchEventCountConsoleResponse object
     */
    public Observable<SearchEventCountConsoleResponse> searchEventCountAsync(SearchEventCountConsoleRequest parameters) {
        return searchEventCountWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<SearchEventCountConsoleResponse>, SearchEventCountConsoleResponse>() {
            @Override
            public SearchEventCountConsoleResponse call(ServiceResponse<SearchEventCountConsoleResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Search event count console.
     *
     * @param parameters the SearchEventCountConsoleRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SearchEventCountConsoleResponse object
     */
    public Observable<ServiceResponse<SearchEventCountConsoleResponse>> searchEventCountWithServiceResponseAsync(SearchEventCountConsoleRequest parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.searchEventCount(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchEventCountConsoleResponse>>>() {
                @Override
                public Observable<ServiceResponse<SearchEventCountConsoleResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SearchEventCountConsoleResponse> clientResponse = searchEventCountDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SearchEventCountConsoleResponse> searchEventCountDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SearchEventCountConsoleResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SearchEventCountConsoleResponse>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
