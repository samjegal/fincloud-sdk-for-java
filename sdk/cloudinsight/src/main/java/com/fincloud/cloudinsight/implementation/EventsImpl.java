/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.Events;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
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
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Events searchEventCount" })
        @POST("cw_fea/real/cw/api/event/searchEventCountConsole")
        Observable<Response<ResponseBody>> searchEventCount();

    }

    /**
     * Search event count console.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void searchEventCount() {
        searchEventCountWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Search event count console.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> searchEventCountAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(searchEventCountWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Search event count console.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> searchEventCountAsync() {
        return searchEventCountWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Search event count console.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> searchEventCountWithServiceResponseAsync() {
        return service.searchEventCount()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = searchEventCountDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> searchEventCountDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
