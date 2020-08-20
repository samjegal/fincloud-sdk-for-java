/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight.implementation;

import retrofit2.Retrofit;
import com.fincloud.cloudinsight.Servers;
import com.fincloud.cloudinsight.models.ServerTopMetricParameter;
import com.fincloud.cloudinsight.models.SeverTargetMetric;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
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
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.cloudinsight.Servers getTop" })
        @POST("cw_fea/real/cw/api/servers/top")
        Observable<Response<ResponseBody>> getTop(@Query("query") SeverTargetMetric query);

    }

    /**
     * 사용자의 Server 중 CPU, Memory, File system 별 사용량 top5에 해당하는 server를 조회합니다.
     *
     * @param query Target metric (mem_usert/avg_cpu_user_rto/fs_usert). Possible values include: 'avg_cpu_used_rto', 'mem_usert', 'avg_fs_usert'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ServerTopMetricParameter&gt; object if successful.
     */
    public List<ServerTopMetricParameter> getTop(SeverTargetMetric query) {
        return getTopWithServiceResponseAsync(query).toBlocking().single().body();
    }

    /**
     * 사용자의 Server 중 CPU, Memory, File system 별 사용량 top5에 해당하는 server를 조회합니다.
     *
     * @param query Target metric (mem_usert/avg_cpu_user_rto/fs_usert). Possible values include: 'avg_cpu_used_rto', 'mem_usert', 'avg_fs_usert'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ServerTopMetricParameter>> getTopAsync(SeverTargetMetric query, final ServiceCallback<List<ServerTopMetricParameter>> serviceCallback) {
        return ServiceFuture.fromResponse(getTopWithServiceResponseAsync(query), serviceCallback);
    }

    /**
     * 사용자의 Server 중 CPU, Memory, File system 별 사용량 top5에 해당하는 server를 조회합니다.
     *
     * @param query Target metric (mem_usert/avg_cpu_user_rto/fs_usert). Possible values include: 'avg_cpu_used_rto', 'mem_usert', 'avg_fs_usert'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ServerTopMetricParameter&gt; object
     */
    public Observable<List<ServerTopMetricParameter>> getTopAsync(SeverTargetMetric query) {
        return getTopWithServiceResponseAsync(query).map(new Func1<ServiceResponse<List<ServerTopMetricParameter>>, List<ServerTopMetricParameter>>() {
            @Override
            public List<ServerTopMetricParameter> call(ServiceResponse<List<ServerTopMetricParameter>> response) {
                return response.body();
            }
        });
    }

    /**
     * 사용자의 Server 중 CPU, Memory, File system 별 사용량 top5에 해당하는 server를 조회합니다.
     *
     * @param query Target metric (mem_usert/avg_cpu_user_rto/fs_usert). Possible values include: 'avg_cpu_used_rto', 'mem_usert', 'avg_fs_usert'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ServerTopMetricParameter&gt; object
     */
    public Observable<ServiceResponse<List<ServerTopMetricParameter>>> getTopWithServiceResponseAsync(SeverTargetMetric query) {
        if (query == null) {
            throw new IllegalArgumentException("Parameter query is required and cannot be null.");
        }
        return service.getTop(query)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ServerTopMetricParameter>>>>() {
                @Override
                public Observable<ServiceResponse<List<ServerTopMetricParameter>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<ServerTopMetricParameter>> clientResponse = getTopDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<ServerTopMetricParameter>> getTopDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<ServerTopMetricParameter>, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<ServerTopMetricParameter>>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
