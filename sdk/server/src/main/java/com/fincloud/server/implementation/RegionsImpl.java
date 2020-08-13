/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.implementation;

import retrofit2.Retrofit;
import com.fincloud.server.Regions;
import com.fincloud.server.models.RegionListResponse;
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
 * in Regions.
 */
public class RegionsImpl implements Regions {
    /** The Retrofit service to perform REST calls. */
    private RegionsService service;
    /** The service client containing this operation class. */
    private ServerManagementClientImpl client;

    /**
     * Initializes an instance of Regions.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RegionsImpl(Retrofit retrofit, ServerManagementClientImpl client) {
        this.service = retrofit.create(RegionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Regions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RegionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.Regions getList" })
        @GET("vserver/v2/getRegionList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType);

    }

    /**
     * REGION 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RegionListResponse object if successful.
     */
    public RegionListResponse getList(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * REGION 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RegionListResponse> getListAsync(String responseFormatType, final ServiceCallback<RegionListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * REGION 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RegionListResponse object
     */
    public Observable<RegionListResponse> getListAsync(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<RegionListResponse>, RegionListResponse>() {
            @Override
            public RegionListResponse call(ServiceResponse<RegionListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * REGION 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RegionListResponse object
     */
    public Observable<ServiceResponse<RegionListResponse>> getListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RegionListResponse>>>() {
                @Override
                public Observable<ServiceResponse<RegionListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RegionListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RegionListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RegionListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RegionListResponse>() { }.getType())
                .build(response);
    }

}
