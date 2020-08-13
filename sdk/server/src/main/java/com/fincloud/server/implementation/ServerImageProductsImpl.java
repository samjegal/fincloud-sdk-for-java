/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.implementation;

import retrofit2.Retrofit;
import com.fincloud.server.ServerImageProducts;
import com.fincloud.server.models.PlatformTypeCode;
import com.fincloud.server.models.ServerImageProductListResponse;
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
 * in ServerImageProducts.
 */
public class ServerImageProductsImpl implements ServerImageProducts {
    /** The Retrofit service to perform REST calls. */
    private ServerImageProductsService service;
    /** The service client containing this operation class. */
    private ServerManagementClientImpl client;

    /**
     * Initializes an instance of ServerImageProducts.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ServerImageProductsImpl(Retrofit retrofit, ServerManagementClientImpl client) {
        this.service = retrofit.create(ServerImageProductsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ServerImageProducts to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ServerImageProductsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.ServerImageProducts getList" })
        @GET("vserver/v2/getServerImageProductList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("blockStorageSize") String blockStorageSize, @Query("exclusionProductCode") String exclusionProductCode, @Query("productCode") String productCode, @Query("platformTypeCodeList.N") PlatformTypeCode platformTypeCodeListN);

    }

    /**
     * 서버 이미지 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerImageProductListResponse object if successful.
     */
    public ServerImageProductListResponse getList(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 서버 이미지 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerImageProductListResponse> getListAsync(String responseFormatType, final ServiceCallback<ServerImageProductListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 서버 이미지 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerImageProductListResponse object
     */
    public Observable<ServerImageProductListResponse> getListAsync(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<ServerImageProductListResponse>, ServerImageProductListResponse>() {
            @Override
            public ServerImageProductListResponse call(ServiceResponse<ServerImageProductListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 이미지 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerImageProductListResponse object
     */
    public Observable<ServiceResponse<ServerImageProductListResponse>> getListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String blockStorageSize = null;
        final String exclusionProductCode = null;
        final String productCode = null;
        final PlatformTypeCode platformTypeCodeListN = null;
        return service.getList(responseFormatType, regionCode, blockStorageSize, exclusionProductCode, productCode, platformTypeCodeListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerImageProductListResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerImageProductListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerImageProductListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 서버 이미지 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param blockStorageSize 블록스토리지 사이즈
     * @param exclusionProductCode 제외할 상품 코드
     * @param productCode 조회할 상품 코드
     * @param platformTypeCodeListN 플랫폼 유형 코드 리스트. Possible values include: 'LNX32', 'LNX64', 'WND32', 'WND64', 'UBD64', 'UBS64'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerImageProductListResponse object if successful.
     */
    public ServerImageProductListResponse getList(String responseFormatType, String regionCode, String blockStorageSize, String exclusionProductCode, String productCode, PlatformTypeCode platformTypeCodeListN) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, blockStorageSize, exclusionProductCode, productCode, platformTypeCodeListN).toBlocking().single().body();
    }

    /**
     * 서버 이미지 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param blockStorageSize 블록스토리지 사이즈
     * @param exclusionProductCode 제외할 상품 코드
     * @param productCode 조회할 상품 코드
     * @param platformTypeCodeListN 플랫폼 유형 코드 리스트. Possible values include: 'LNX32', 'LNX64', 'WND32', 'WND64', 'UBD64', 'UBS64'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerImageProductListResponse> getListAsync(String responseFormatType, String regionCode, String blockStorageSize, String exclusionProductCode, String productCode, PlatformTypeCode platformTypeCodeListN, final ServiceCallback<ServerImageProductListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, regionCode, blockStorageSize, exclusionProductCode, productCode, platformTypeCodeListN), serviceCallback);
    }

    /**
     * 서버 이미지 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param blockStorageSize 블록스토리지 사이즈
     * @param exclusionProductCode 제외할 상품 코드
     * @param productCode 조회할 상품 코드
     * @param platformTypeCodeListN 플랫폼 유형 코드 리스트. Possible values include: 'LNX32', 'LNX64', 'WND32', 'WND64', 'UBD64', 'UBS64'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerImageProductListResponse object
     */
    public Observable<ServerImageProductListResponse> getListAsync(String responseFormatType, String regionCode, String blockStorageSize, String exclusionProductCode, String productCode, PlatformTypeCode platformTypeCodeListN) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, blockStorageSize, exclusionProductCode, productCode, platformTypeCodeListN).map(new Func1<ServiceResponse<ServerImageProductListResponse>, ServerImageProductListResponse>() {
            @Override
            public ServerImageProductListResponse call(ServiceResponse<ServerImageProductListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 이미지 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param blockStorageSize 블록스토리지 사이즈
     * @param exclusionProductCode 제외할 상품 코드
     * @param productCode 조회할 상품 코드
     * @param platformTypeCodeListN 플랫폼 유형 코드 리스트. Possible values include: 'LNX32', 'LNX64', 'WND32', 'WND64', 'UBD64', 'UBS64'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerImageProductListResponse object
     */
    public Observable<ServiceResponse<ServerImageProductListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String blockStorageSize, String exclusionProductCode, String productCode, PlatformTypeCode platformTypeCodeListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, blockStorageSize, exclusionProductCode, productCode, platformTypeCodeListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerImageProductListResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerImageProductListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerImageProductListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerImageProductListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerImageProductListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerImageProductListResponse>() { }.getType())
                .build(response);
    }

}
