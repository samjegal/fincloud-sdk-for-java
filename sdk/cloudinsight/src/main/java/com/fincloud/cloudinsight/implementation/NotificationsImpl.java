/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.Notifications;
import com.fincloud.cloudinsight.models.EventRuleResponse;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Notifications.
 */
public class NotificationsImpl implements Notifications {
    /** The Retrofit service to perform REST calls. */
    private NotificationsService service;
    /** The service client containing this operation class. */
    private CloudInsightManagementClientImpl client;

    /**
     * Initializes an instance of Notifications.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public NotificationsImpl(Retrofit retrofit, CloudInsightManagementClientImpl client) {
        this.service = retrofit.create(NotificationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Notifications to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NotificationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Notifications get" })
        @GET("cw_fea/real/cw/api/notification")
        Observable<Response<ResponseBody>> get(@Query("grpId") String grpId);

    }

    /**
     * Get notification rule with a given group Id.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EventRuleResponse object if successful.
     */
    public EventRuleResponse get() {
        return getWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get notification rule with a given group Id.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EventRuleResponse> getAsync(final ServiceCallback<EventRuleResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get notification rule with a given group Id.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventRuleResponse object
     */
    public Observable<EventRuleResponse> getAsync() {
        return getWithServiceResponseAsync().map(new Func1<ServiceResponse<EventRuleResponse>, EventRuleResponse>() {
            @Override
            public EventRuleResponse call(ServiceResponse<EventRuleResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Get notification rule with a given group Id.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventRuleResponse object
     */
    public Observable<ServiceResponse<EventRuleResponse>> getWithServiceResponseAsync() {
        final String grpId = null;
        return service.get(grpId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EventRuleResponse>>>() {
                @Override
                public Observable<ServiceResponse<EventRuleResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EventRuleResponse> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get notification rule with a given group Id.
     *
     * @param grpId Notification GroupId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EventRuleResponse object if successful.
     */
    public EventRuleResponse get(String grpId) {
        return getWithServiceResponseAsync(grpId).toBlocking().single().body();
    }

    /**
     * Get notification rule with a given group Id.
     *
     * @param grpId Notification GroupId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EventRuleResponse> getAsync(String grpId, final ServiceCallback<EventRuleResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(grpId), serviceCallback);
    }

    /**
     * Get notification rule with a given group Id.
     *
     * @param grpId Notification GroupId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventRuleResponse object
     */
    public Observable<EventRuleResponse> getAsync(String grpId) {
        return getWithServiceResponseAsync(grpId).map(new Func1<ServiceResponse<EventRuleResponse>, EventRuleResponse>() {
            @Override
            public EventRuleResponse call(ServiceResponse<EventRuleResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Get notification rule with a given group Id.
     *
     * @param grpId Notification GroupId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventRuleResponse object
     */
    public Observable<ServiceResponse<EventRuleResponse>> getWithServiceResponseAsync(String grpId) {
        return service.get(grpId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EventRuleResponse>>>() {
                @Override
                public Observable<ServiceResponse<EventRuleResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EventRuleResponse> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<EventRuleResponse> getDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<EventRuleResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EventRuleResponse>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
