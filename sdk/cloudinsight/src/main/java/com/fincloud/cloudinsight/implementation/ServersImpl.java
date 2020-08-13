/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.Servers;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Servers.
 */
public class ServersImpl implements Servers {
    /** The Retrofit service to perform REST calls. */
    private ServersService service;
    /** The service client containing this operation class. */
    private CloudInsightManagementClientImpl client;

    /**
     * Initializes an instance of Servers.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ServersImpl(Retrofit retrofit, CloudInsightManagementClientImpl client) {
        this.service = retrofit.create(ServersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Servers to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ServersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Servers creatTop" })
        @POST("cw_fea/real/cw/api/servers/top")
        Observable<Response<ResponseBody>> creatTop(@Query("query") String query);

    }

    /**
     * Target metric (mem_usert/avg_cpu_user_rto/fs_usert).
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void creatTop() {
        creatTopWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Target metric (mem_usert/avg_cpu_user_rto/fs_usert).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> creatTopAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(creatTopWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Target metric (mem_usert/avg_cpu_user_rto/fs_usert).
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> creatTopAsync() {
        return creatTopWithServiceResponseAsync().map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Target metric (mem_usert/avg_cpu_user_rto/fs_usert).
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> creatTopWithServiceResponseAsync() {
        final String query = null;
        return service.creatTop(query)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = creatTopDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Target metric (mem_usert/avg_cpu_user_rto/fs_usert).
     *
     * @param query Target metric (mem_usert/avg_cpu_user_rto/fs_usert)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void creatTop(String query) {
        creatTopWithServiceResponseAsync(query).toBlocking().single().body();
    }

    /**
     * Target metric (mem_usert/avg_cpu_user_rto/fs_usert).
     *
     * @param query Target metric (mem_usert/avg_cpu_user_rto/fs_usert)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> creatTopAsync(String query, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(creatTopWithServiceResponseAsync(query), serviceCallback);
    }

    /**
     * Target metric (mem_usert/avg_cpu_user_rto/fs_usert).
     *
     * @param query Target metric (mem_usert/avg_cpu_user_rto/fs_usert)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> creatTopAsync(String query) {
        return creatTopWithServiceResponseAsync(query).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Target metric (mem_usert/avg_cpu_user_rto/fs_usert).
     *
     * @param query Target metric (mem_usert/avg_cpu_user_rto/fs_usert)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> creatTopWithServiceResponseAsync(String query) {
        return service.creatTop(query)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = creatTopDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> creatTopDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
