/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.implementation;

import retrofit2.Retrofit;
import com.fincloud.server.ServerProducts;
import com.fincloud.server.models.ServerProductListResponse;
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
 * in ServerProducts.
 */
public class ServerProductsImpl implements ServerProducts {
    /** The Retrofit service to perform REST calls. */
    private ServerProductsService service;
    /** The service client containing this operation class. */
    private ServerManagementClientImpl client;

    /**
     * Initializes an instance of ServerProducts.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ServerProductsImpl(Retrofit retrofit, ServerManagementClientImpl client) {
        this.service = retrofit.create(ServerProductsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ServerProducts to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ServerProductsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.ServerProducts getList" })
        @GET("vserver/v2/getServerProductList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("zoneCode") String zoneCode, @Query("serverImageProductCode") String serverImageProductCode, @Query("exclusionProductCode") String exclusionProductCode, @Query("productCode") String productCode, @Query("generationCode") String generationCode);

    }

    /**
     * 서버 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerProductListResponse object if successful.
     */
    public ServerProductListResponse getList(String responseFormatType, String serverImageProductCode) {
        return getListWithServiceResponseAsync(responseFormatType, serverImageProductCode).toBlocking().single().body();
    }

    /**
     * 서버 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerProductListResponse> getListAsync(String responseFormatType, String serverImageProductCode, final ServiceCallback<ServerProductListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, serverImageProductCode), serviceCallback);
    }

    /**
     * 서버 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerProductListResponse object
     */
    public Observable<ServerProductListResponse> getListAsync(String responseFormatType, String serverImageProductCode) {
        return getListWithServiceResponseAsync(responseFormatType, serverImageProductCode).map(new Func1<ServiceResponse<ServerProductListResponse>, ServerProductListResponse>() {
            @Override
            public ServerProductListResponse call(ServiceResponse<ServerProductListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerProductListResponse object
     */
    public Observable<ServiceResponse<ServerProductListResponse>> getListWithServiceResponseAsync(String responseFormatType, String serverImageProductCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverImageProductCode == null) {
            throw new IllegalArgumentException("Parameter serverImageProductCode is required and cannot be null.");
        }
        final String regionCode = null;
        final String zoneCode = null;
        final String exclusionProductCode = null;
        final String productCode = null;
        final String generationCode = null;
        return service.getList(responseFormatType, regionCode, zoneCode, serverImageProductCode, exclusionProductCode, productCode, generationCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerProductListResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerProductListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerProductListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 서버 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param regionCode REGION 코드
     * @param zoneCode ZONE 코드
     * @param exclusionProductCode 제외할 상품 코드
     * @param productCode 조회할 상품 코드
     * @param generationCode 세대 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerProductListResponse object if successful.
     */
    public ServerProductListResponse getList(String responseFormatType, String serverImageProductCode, String regionCode, String zoneCode, String exclusionProductCode, String productCode, String generationCode) {
        return getListWithServiceResponseAsync(responseFormatType, serverImageProductCode, regionCode, zoneCode, exclusionProductCode, productCode, generationCode).toBlocking().single().body();
    }

    /**
     * 서버 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param regionCode REGION 코드
     * @param zoneCode ZONE 코드
     * @param exclusionProductCode 제외할 상품 코드
     * @param productCode 조회할 상품 코드
     * @param generationCode 세대 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerProductListResponse> getListAsync(String responseFormatType, String serverImageProductCode, String regionCode, String zoneCode, String exclusionProductCode, String productCode, String generationCode, final ServiceCallback<ServerProductListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, serverImageProductCode, regionCode, zoneCode, exclusionProductCode, productCode, generationCode), serviceCallback);
    }

    /**
     * 서버 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param regionCode REGION 코드
     * @param zoneCode ZONE 코드
     * @param exclusionProductCode 제외할 상품 코드
     * @param productCode 조회할 상품 코드
     * @param generationCode 세대 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerProductListResponse object
     */
    public Observable<ServerProductListResponse> getListAsync(String responseFormatType, String serverImageProductCode, String regionCode, String zoneCode, String exclusionProductCode, String productCode, String generationCode) {
        return getListWithServiceResponseAsync(responseFormatType, serverImageProductCode, regionCode, zoneCode, exclusionProductCode, productCode, generationCode).map(new Func1<ServiceResponse<ServerProductListResponse>, ServerProductListResponse>() {
            @Override
            public ServerProductListResponse call(ServiceResponse<ServerProductListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param regionCode REGION 코드
     * @param zoneCode ZONE 코드
     * @param exclusionProductCode 제외할 상품 코드
     * @param productCode 조회할 상품 코드
     * @param generationCode 세대 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerProductListResponse object
     */
    public Observable<ServiceResponse<ServerProductListResponse>> getListWithServiceResponseAsync(String responseFormatType, String serverImageProductCode, String regionCode, String zoneCode, String exclusionProductCode, String productCode, String generationCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverImageProductCode == null) {
            throw new IllegalArgumentException("Parameter serverImageProductCode is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, zoneCode, serverImageProductCode, exclusionProductCode, productCode, generationCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerProductListResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerProductListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerProductListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerProductListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerProductListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerProductListResponse>() { }.getType())
                .build(response);
    }

}
