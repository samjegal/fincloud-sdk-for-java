/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.implementation;

import retrofit2.Retrofit;
import com.fincloud.server.Servers;
import com.fincloud.server.models.FeeSystemTypeCode;
import com.fincloud.server.models.ServerInstanceDetailResponse;
import com.fincloud.server.models.ServerInstanceListResponse;
import com.fincloud.server.models.ServerInstanceSpecResponse;
import com.fincloud.server.models.ServerInstancesResponse;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
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
    private ServerManagementClientImpl client;

    /**
     * Initializes an instance of Servers.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ServersImpl(Retrofit retrofit, ServerManagementClientImpl client) {
        this.service = retrofit.create(ServersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Servers to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ServersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.Servers getInstanceList" })
        @GET("vserver/v2/getServerInstanceList")
        Observable<Response<ResponseBody>> getInstanceList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("serverInstanceNoList.N") String serverInstanceNoListN, @Query("vpcNo") String vpcNo, @Query("pageNo") String pageNo, @Query("serverInstanceStatusCode") String serverInstanceStatusCode, @Query("baseBlockStorageDiskTypeCode") String baseBlockStorageDiskTypeCode, @Query("baseBlockStorageDiskDetailTypeCode") String baseBlockStorageDiskDetailTypeCode, @Query("serverName") String serverName, @Query("ip") String ip, @Query("sortedBy") String sortedBy, @Query("sortingOrder") String sortingOrder1, @Query("placementGroupNoList.N") String placementGroupNoListN);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.Servers getDetail" })
        @GET("vserver/v2/getServerInstanceDetail")
        Observable<Response<ResponseBody>> getDetail(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("serverInstanceNo") String serverInstanceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.Servers create" })
        @POST("vserver/v2/createServerInstances")
        Observable<Response<ResponseBody>> create(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("memberServerImageInstanceNo") String memberServerImageInstanceNo, @Query("serverImageProductCode") String serverImageProductCode, @Query("vpcNo") String vpcNo, @Query("subnetNo") String subnetNo, @Query("serverProductCode") String serverProductCode, @Query("isEncryptedBaseBlockStorageVolume") Boolean isEncryptedBaseBlockStorageVolume, @Query("feeSystemTypeCode") FeeSystemTypeCode feeSystemTypeCode1, @Query("serverCreateCount") String serverCreateCount, @Query("serverCreateStartNo") String serverCreateStartNo, @Query("serverName") String serverName, @Query("networkInterfaceList.N.networkInterfaceOrder") String networkInterfaceListNnetworkInterfaceOrder, @Query("networkInterfaceList.N.networkInterfaceNo") String networkInterfaceListNnetworkInterfaceNo, @Query("networkInterfaceList.N.subnetNo") String networkInterfaceListNsubnetNo, @Query("networkInterfaceList.N.ip") String networkInterfaceListNip, @Query("networkInterfaceList.N.accessControlGroupNoList.N") String networkInterfaceListNaccessControlGroupNoListN, @Query("placementGroupNo") String placementGroupNo, @Query("isProtectServerTermination") Boolean isProtectServerTermination, @Query("serverDescription") String serverDescription, @Query("initScriptNo") String initScriptNo, @Query("loginKeyName") String loginKeyName);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.Servers start" })
        @POST("vserver/v2/startServerInstances")
        Observable<Response<ResponseBody>> start(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("serverInstanceNoList.N") String serverInstanceNoListN);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.Servers stop" })
        @POST("vserver/v2/stopServerInstances")
        Observable<Response<ResponseBody>> stop(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("serverInstanceNoList.N") String serverInstanceNoListN);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.Servers reboot" })
        @POST("vserver/v2/rebootServerInstances")
        Observable<Response<ResponseBody>> reboot(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("serverInstanceNoList.N") String serverInstanceNoListN);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.Servers terminate" })
        @POST("vserver/v2/terminateServerInstances")
        Observable<Response<ResponseBody>> terminate(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("serverInstanceNoList.N") String serverInstanceNoListN);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.Servers changeSpec" })
        @POST("vserver/v2/changeServerInstanceSpec")
        Observable<Response<ResponseBody>> changeSpec(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("serverInstanceNo") String serverInstanceNo, @Query("serverProductCode") String serverProductCode);

    }

    /**
     * 서버 인스턴스 리스트를 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstanceListResponse object if successful.
     */
    public ServerInstanceListResponse getInstanceList() {
        return getInstanceListWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * 서버 인스턴스 리스트를 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerInstanceListResponse> getInstanceListAsync(final ServiceCallback<ServerInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getInstanceListWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * 서버 인스턴스 리스트를 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceListResponse object
     */
    public Observable<ServerInstanceListResponse> getInstanceListAsync() {
        return getInstanceListWithServiceResponseAsync().map(new Func1<ServiceResponse<ServerInstanceListResponse>, ServerInstanceListResponse>() {
            @Override
            public ServerInstanceListResponse call(ServiceResponse<ServerInstanceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스 리스트를 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceListResponse object
     */
    public Observable<ServiceResponse<ServerInstanceListResponse>> getInstanceListWithServiceResponseAsync() {
        final String responseFormatType = null;
        final String regionCode = null;
        final String serverInstanceNoListN = null;
        final String vpcNo = null;
        final String pageNo = null;
        final String serverInstanceStatusCode = null;
        final String baseBlockStorageDiskTypeCode = null;
        final String baseBlockStorageDiskDetailTypeCode = null;
        final String serverName = null;
        final String ip = null;
        final String sortedBy = null;
        final String sortingOrder = null;
        final String placementGroupNoListN = null;
        return service.getInstanceList(responseFormatType, regionCode, serverInstanceNoListN, vpcNo, pageNo, serverInstanceStatusCode, baseBlockStorageDiskTypeCode, baseBlockStorageDiskDetailTypeCode, serverName, ip, sortedBy, sortingOrder, placementGroupNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerInstanceListResponse> clientResponse = getInstanceListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param vpcNo VPC 번호
     * @param pageNo 페이지 번호
     * @param serverInstanceStatusCode 서버 인스턴스 상태 코드
     * @param baseBlockStorageDiskTypeCode 기본 블록스토리지 디스크 유형 코드
     * @param baseBlockStorageDiskDetailTypeCode 기본 블록스토리지 디스크 상세 유형 코드
     * @param serverName 서버 이름
     * @param ip IP 주소
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서
     * @param placementGroupNoListN 물리 배치 그룹 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstanceListResponse object if successful.
     */
    public ServerInstanceListResponse getInstanceList(String responseFormatType, String regionCode, String serverInstanceNoListN, String vpcNo, String pageNo, String serverInstanceStatusCode, String baseBlockStorageDiskTypeCode, String baseBlockStorageDiskDetailTypeCode, String serverName, String ip, String sortedBy, String sortingOrder, String placementGroupNoListN) {
        return getInstanceListWithServiceResponseAsync(responseFormatType, regionCode, serverInstanceNoListN, vpcNo, pageNo, serverInstanceStatusCode, baseBlockStorageDiskTypeCode, baseBlockStorageDiskDetailTypeCode, serverName, ip, sortedBy, sortingOrder, placementGroupNoListN).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param vpcNo VPC 번호
     * @param pageNo 페이지 번호
     * @param serverInstanceStatusCode 서버 인스턴스 상태 코드
     * @param baseBlockStorageDiskTypeCode 기본 블록스토리지 디스크 유형 코드
     * @param baseBlockStorageDiskDetailTypeCode 기본 블록스토리지 디스크 상세 유형 코드
     * @param serverName 서버 이름
     * @param ip IP 주소
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서
     * @param placementGroupNoListN 물리 배치 그룹 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerInstanceListResponse> getInstanceListAsync(String responseFormatType, String regionCode, String serverInstanceNoListN, String vpcNo, String pageNo, String serverInstanceStatusCode, String baseBlockStorageDiskTypeCode, String baseBlockStorageDiskDetailTypeCode, String serverName, String ip, String sortedBy, String sortingOrder, String placementGroupNoListN, final ServiceCallback<ServerInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getInstanceListWithServiceResponseAsync(responseFormatType, regionCode, serverInstanceNoListN, vpcNo, pageNo, serverInstanceStatusCode, baseBlockStorageDiskTypeCode, baseBlockStorageDiskDetailTypeCode, serverName, ip, sortedBy, sortingOrder, placementGroupNoListN), serviceCallback);
    }

    /**
     * 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param vpcNo VPC 번호
     * @param pageNo 페이지 번호
     * @param serverInstanceStatusCode 서버 인스턴스 상태 코드
     * @param baseBlockStorageDiskTypeCode 기본 블록스토리지 디스크 유형 코드
     * @param baseBlockStorageDiskDetailTypeCode 기본 블록스토리지 디스크 상세 유형 코드
     * @param serverName 서버 이름
     * @param ip IP 주소
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서
     * @param placementGroupNoListN 물리 배치 그룹 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceListResponse object
     */
    public Observable<ServerInstanceListResponse> getInstanceListAsync(String responseFormatType, String regionCode, String serverInstanceNoListN, String vpcNo, String pageNo, String serverInstanceStatusCode, String baseBlockStorageDiskTypeCode, String baseBlockStorageDiskDetailTypeCode, String serverName, String ip, String sortedBy, String sortingOrder, String placementGroupNoListN) {
        return getInstanceListWithServiceResponseAsync(responseFormatType, regionCode, serverInstanceNoListN, vpcNo, pageNo, serverInstanceStatusCode, baseBlockStorageDiskTypeCode, baseBlockStorageDiskDetailTypeCode, serverName, ip, sortedBy, sortingOrder, placementGroupNoListN).map(new Func1<ServiceResponse<ServerInstanceListResponse>, ServerInstanceListResponse>() {
            @Override
            public ServerInstanceListResponse call(ServiceResponse<ServerInstanceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param vpcNo VPC 번호
     * @param pageNo 페이지 번호
     * @param serverInstanceStatusCode 서버 인스턴스 상태 코드
     * @param baseBlockStorageDiskTypeCode 기본 블록스토리지 디스크 유형 코드
     * @param baseBlockStorageDiskDetailTypeCode 기본 블록스토리지 디스크 상세 유형 코드
     * @param serverName 서버 이름
     * @param ip IP 주소
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서
     * @param placementGroupNoListN 물리 배치 그룹 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceListResponse object
     */
    public Observable<ServiceResponse<ServerInstanceListResponse>> getInstanceListWithServiceResponseAsync(String responseFormatType, String regionCode, String serverInstanceNoListN, String vpcNo, String pageNo, String serverInstanceStatusCode, String baseBlockStorageDiskTypeCode, String baseBlockStorageDiskDetailTypeCode, String serverName, String ip, String sortedBy, String sortingOrder, String placementGroupNoListN) {
        return service.getInstanceList(responseFormatType, regionCode, serverInstanceNoListN, vpcNo, pageNo, serverInstanceStatusCode, baseBlockStorageDiskTypeCode, baseBlockStorageDiskDetailTypeCode, serverName, ip, sortedBy, sortingOrder, placementGroupNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerInstanceListResponse> clientResponse = getInstanceListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerInstanceListResponse> getInstanceListDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<ServerInstanceListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerInstanceListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 서버 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstanceDetailResponse object if successful.
     */
    public ServerInstanceDetailResponse getDetail(String responseFormatType, String serverInstanceNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, serverInstanceNo).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerInstanceDetailResponse> getDetailAsync(String responseFormatType, String serverInstanceNo, final ServiceCallback<ServerInstanceDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, serverInstanceNo), serviceCallback);
    }

    /**
     * 서버 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceDetailResponse object
     */
    public Observable<ServerInstanceDetailResponse> getDetailAsync(String responseFormatType, String serverInstanceNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, serverInstanceNo).map(new Func1<ServiceResponse<ServerInstanceDetailResponse>, ServerInstanceDetailResponse>() {
            @Override
            public ServerInstanceDetailResponse call(ServiceResponse<ServerInstanceDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceDetailResponse object
     */
    public Observable<ServiceResponse<ServerInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String serverInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.getDetail(responseFormatType, regionCode, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerInstanceDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerInstanceDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerInstanceDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 서버 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstanceDetailResponse object if successful.
     */
    public ServerInstanceDetailResponse getDetail(String responseFormatType, String serverInstanceNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, serverInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerInstanceDetailResponse> getDetailAsync(String responseFormatType, String serverInstanceNo, String regionCode, final ServiceCallback<ServerInstanceDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, serverInstanceNo, regionCode), serviceCallback);
    }

    /**
     * 서버 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceDetailResponse object
     */
    public Observable<ServerInstanceDetailResponse> getDetailAsync(String responseFormatType, String serverInstanceNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, serverInstanceNo, regionCode).map(new Func1<ServiceResponse<ServerInstanceDetailResponse>, ServerInstanceDetailResponse>() {
            @Override
            public ServerInstanceDetailResponse call(ServiceResponse<ServerInstanceDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceDetailResponse object
     */
    public Observable<ServiceResponse<ServerInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String serverInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        return service.getDetail(responseFormatType, regionCode, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerInstanceDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerInstanceDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerInstanceDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerInstanceDetailResponse> getDetailDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerInstanceDetailResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerInstanceDetailResponse>() { }.getType())
                .build(response);
    }

    /**
     * 서버 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceListNnetworkInterfaceOrder 네트워크 인터페이스 순서
     * @param networkInterfaceListNaccessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    public ServerInstancesResponse create(String responseFormatType, String vpcNo, String subnetNo, String networkInterfaceListNnetworkInterfaceOrder, String networkInterfaceListNaccessControlGroupNoListN) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo, subnetNo, networkInterfaceListNnetworkInterfaceOrder, networkInterfaceListNaccessControlGroupNoListN).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceListNnetworkInterfaceOrder 네트워크 인터페이스 순서
     * @param networkInterfaceListNaccessControlGroupNoListN ACG 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerInstancesResponse> createAsync(String responseFormatType, String vpcNo, String subnetNo, String networkInterfaceListNnetworkInterfaceOrder, String networkInterfaceListNaccessControlGroupNoListN, final ServiceCallback<ServerInstancesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, vpcNo, subnetNo, networkInterfaceListNnetworkInterfaceOrder, networkInterfaceListNaccessControlGroupNoListN), serviceCallback);
    }

    /**
     * 서버 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceListNnetworkInterfaceOrder 네트워크 인터페이스 순서
     * @param networkInterfaceListNaccessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServerInstancesResponse> createAsync(String responseFormatType, String vpcNo, String subnetNo, String networkInterfaceListNnetworkInterfaceOrder, String networkInterfaceListNaccessControlGroupNoListN) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo, subnetNo, networkInterfaceListNnetworkInterfaceOrder, networkInterfaceListNaccessControlGroupNoListN).map(new Func1<ServiceResponse<ServerInstancesResponse>, ServerInstancesResponse>() {
            @Override
            public ServerInstancesResponse call(ServiceResponse<ServerInstancesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceListNnetworkInterfaceOrder 네트워크 인터페이스 순서
     * @param networkInterfaceListNaccessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServiceResponse<ServerInstancesResponse>> createWithServiceResponseAsync(String responseFormatType, String vpcNo, String subnetNo, String networkInterfaceListNnetworkInterfaceOrder, String networkInterfaceListNaccessControlGroupNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (subnetNo == null) {
            throw new IllegalArgumentException("Parameter subnetNo is required and cannot be null.");
        }
        if (networkInterfaceListNnetworkInterfaceOrder == null) {
            throw new IllegalArgumentException("Parameter networkInterfaceListNnetworkInterfaceOrder is required and cannot be null.");
        }
        if (networkInterfaceListNaccessControlGroupNoListN == null) {
            throw new IllegalArgumentException("Parameter networkInterfaceListNaccessControlGroupNoListN is required and cannot be null.");
        }
        final String regionCode = null;
        final String memberServerImageInstanceNo = null;
        final String serverImageProductCode = null;
        final String serverProductCode = null;
        final Boolean isEncryptedBaseBlockStorageVolume = null;
        final FeeSystemTypeCode feeSystemTypeCode = null;
        final String serverCreateCount = null;
        final String serverCreateStartNo = null;
        final String serverName = null;
        final String networkInterfaceListNnetworkInterfaceNo = null;
        final String networkInterfaceListNsubnetNo = null;
        final String networkInterfaceListNip = null;
        final String placementGroupNo = null;
        final Boolean isProtectServerTermination = null;
        final String serverDescription = null;
        final String initScriptNo = null;
        final String loginKeyName = null;
        return service.create(responseFormatType, regionCode, memberServerImageInstanceNo, serverImageProductCode, vpcNo, subnetNo, serverProductCode, isEncryptedBaseBlockStorageVolume, feeSystemTypeCode, serverCreateCount, serverCreateStartNo, serverName, networkInterfaceListNnetworkInterfaceOrder, networkInterfaceListNnetworkInterfaceNo, networkInterfaceListNsubnetNo, networkInterfaceListNip, networkInterfaceListNaccessControlGroupNoListN, placementGroupNo, isProtectServerTermination, serverDescription, initScriptNo, loginKeyName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerInstancesResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerInstancesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerInstancesResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 서버 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceListNnetworkInterfaceOrder 네트워크 인터페이스 순서
     * @param networkInterfaceListNaccessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param serverProductCode 서버 상품 코드
     * @param isEncryptedBaseBlockStorageVolume 기본 블록스토리지 볼륨 암호화 여부
     * @param feeSystemTypeCode 요금제 유형 코드. Possible values include: 'MTRAT', 'FXSUM'
     * @param serverCreateCount 서버 생성 개수
     * @param serverCreateStartNo 서버 생성 시작 번호
     * @param serverName 서버 이름
     * @param networkInterfaceListNnetworkInterfaceNo 네트워크 인터페이스 번호
     * @param networkInterfaceListNsubnetNo 서브넷 번호
     * @param networkInterfaceListNip IP 주소
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param isProtectServerTermination 반납 보호 여부
     * @param serverDescription 서버 설명
     * @param initScriptNo 초기화 스크립트 번호
     * @param loginKeyName 로그인 키 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    public ServerInstancesResponse create(String responseFormatType, String vpcNo, String subnetNo, String networkInterfaceListNnetworkInterfaceOrder, String networkInterfaceListNaccessControlGroupNoListN, String regionCode, String memberServerImageInstanceNo, String serverImageProductCode, String serverProductCode, Boolean isEncryptedBaseBlockStorageVolume, FeeSystemTypeCode feeSystemTypeCode, String serverCreateCount, String serverCreateStartNo, String serverName, String networkInterfaceListNnetworkInterfaceNo, String networkInterfaceListNsubnetNo, String networkInterfaceListNip, String placementGroupNo, Boolean isProtectServerTermination, String serverDescription, String initScriptNo, String loginKeyName) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo, subnetNo, networkInterfaceListNnetworkInterfaceOrder, networkInterfaceListNaccessControlGroupNoListN, regionCode, memberServerImageInstanceNo, serverImageProductCode, serverProductCode, isEncryptedBaseBlockStorageVolume, feeSystemTypeCode, serverCreateCount, serverCreateStartNo, serverName, networkInterfaceListNnetworkInterfaceNo, networkInterfaceListNsubnetNo, networkInterfaceListNip, placementGroupNo, isProtectServerTermination, serverDescription, initScriptNo, loginKeyName).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceListNnetworkInterfaceOrder 네트워크 인터페이스 순서
     * @param networkInterfaceListNaccessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param serverProductCode 서버 상품 코드
     * @param isEncryptedBaseBlockStorageVolume 기본 블록스토리지 볼륨 암호화 여부
     * @param feeSystemTypeCode 요금제 유형 코드. Possible values include: 'MTRAT', 'FXSUM'
     * @param serverCreateCount 서버 생성 개수
     * @param serverCreateStartNo 서버 생성 시작 번호
     * @param serverName 서버 이름
     * @param networkInterfaceListNnetworkInterfaceNo 네트워크 인터페이스 번호
     * @param networkInterfaceListNsubnetNo 서브넷 번호
     * @param networkInterfaceListNip IP 주소
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param isProtectServerTermination 반납 보호 여부
     * @param serverDescription 서버 설명
     * @param initScriptNo 초기화 스크립트 번호
     * @param loginKeyName 로그인 키 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerInstancesResponse> createAsync(String responseFormatType, String vpcNo, String subnetNo, String networkInterfaceListNnetworkInterfaceOrder, String networkInterfaceListNaccessControlGroupNoListN, String regionCode, String memberServerImageInstanceNo, String serverImageProductCode, String serverProductCode, Boolean isEncryptedBaseBlockStorageVolume, FeeSystemTypeCode feeSystemTypeCode, String serverCreateCount, String serverCreateStartNo, String serverName, String networkInterfaceListNnetworkInterfaceNo, String networkInterfaceListNsubnetNo, String networkInterfaceListNip, String placementGroupNo, Boolean isProtectServerTermination, String serverDescription, String initScriptNo, String loginKeyName, final ServiceCallback<ServerInstancesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, vpcNo, subnetNo, networkInterfaceListNnetworkInterfaceOrder, networkInterfaceListNaccessControlGroupNoListN, regionCode, memberServerImageInstanceNo, serverImageProductCode, serverProductCode, isEncryptedBaseBlockStorageVolume, feeSystemTypeCode, serverCreateCount, serverCreateStartNo, serverName, networkInterfaceListNnetworkInterfaceNo, networkInterfaceListNsubnetNo, networkInterfaceListNip, placementGroupNo, isProtectServerTermination, serverDescription, initScriptNo, loginKeyName), serviceCallback);
    }

    /**
     * 서버 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceListNnetworkInterfaceOrder 네트워크 인터페이스 순서
     * @param networkInterfaceListNaccessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param serverProductCode 서버 상품 코드
     * @param isEncryptedBaseBlockStorageVolume 기본 블록스토리지 볼륨 암호화 여부
     * @param feeSystemTypeCode 요금제 유형 코드. Possible values include: 'MTRAT', 'FXSUM'
     * @param serverCreateCount 서버 생성 개수
     * @param serverCreateStartNo 서버 생성 시작 번호
     * @param serverName 서버 이름
     * @param networkInterfaceListNnetworkInterfaceNo 네트워크 인터페이스 번호
     * @param networkInterfaceListNsubnetNo 서브넷 번호
     * @param networkInterfaceListNip IP 주소
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param isProtectServerTermination 반납 보호 여부
     * @param serverDescription 서버 설명
     * @param initScriptNo 초기화 스크립트 번호
     * @param loginKeyName 로그인 키 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServerInstancesResponse> createAsync(String responseFormatType, String vpcNo, String subnetNo, String networkInterfaceListNnetworkInterfaceOrder, String networkInterfaceListNaccessControlGroupNoListN, String regionCode, String memberServerImageInstanceNo, String serverImageProductCode, String serverProductCode, Boolean isEncryptedBaseBlockStorageVolume, FeeSystemTypeCode feeSystemTypeCode, String serverCreateCount, String serverCreateStartNo, String serverName, String networkInterfaceListNnetworkInterfaceNo, String networkInterfaceListNsubnetNo, String networkInterfaceListNip, String placementGroupNo, Boolean isProtectServerTermination, String serverDescription, String initScriptNo, String loginKeyName) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo, subnetNo, networkInterfaceListNnetworkInterfaceOrder, networkInterfaceListNaccessControlGroupNoListN, regionCode, memberServerImageInstanceNo, serverImageProductCode, serverProductCode, isEncryptedBaseBlockStorageVolume, feeSystemTypeCode, serverCreateCount, serverCreateStartNo, serverName, networkInterfaceListNnetworkInterfaceNo, networkInterfaceListNsubnetNo, networkInterfaceListNip, placementGroupNo, isProtectServerTermination, serverDescription, initScriptNo, loginKeyName).map(new Func1<ServiceResponse<ServerInstancesResponse>, ServerInstancesResponse>() {
            @Override
            public ServerInstancesResponse call(ServiceResponse<ServerInstancesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceListNnetworkInterfaceOrder 네트워크 인터페이스 순서
     * @param networkInterfaceListNaccessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param serverProductCode 서버 상품 코드
     * @param isEncryptedBaseBlockStorageVolume 기본 블록스토리지 볼륨 암호화 여부
     * @param feeSystemTypeCode 요금제 유형 코드. Possible values include: 'MTRAT', 'FXSUM'
     * @param serverCreateCount 서버 생성 개수
     * @param serverCreateStartNo 서버 생성 시작 번호
     * @param serverName 서버 이름
     * @param networkInterfaceListNnetworkInterfaceNo 네트워크 인터페이스 번호
     * @param networkInterfaceListNsubnetNo 서브넷 번호
     * @param networkInterfaceListNip IP 주소
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param isProtectServerTermination 반납 보호 여부
     * @param serverDescription 서버 설명
     * @param initScriptNo 초기화 스크립트 번호
     * @param loginKeyName 로그인 키 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServiceResponse<ServerInstancesResponse>> createWithServiceResponseAsync(String responseFormatType, String vpcNo, String subnetNo, String networkInterfaceListNnetworkInterfaceOrder, String networkInterfaceListNaccessControlGroupNoListN, String regionCode, String memberServerImageInstanceNo, String serverImageProductCode, String serverProductCode, Boolean isEncryptedBaseBlockStorageVolume, FeeSystemTypeCode feeSystemTypeCode, String serverCreateCount, String serverCreateStartNo, String serverName, String networkInterfaceListNnetworkInterfaceNo, String networkInterfaceListNsubnetNo, String networkInterfaceListNip, String placementGroupNo, Boolean isProtectServerTermination, String serverDescription, String initScriptNo, String loginKeyName) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (subnetNo == null) {
            throw new IllegalArgumentException("Parameter subnetNo is required and cannot be null.");
        }
        if (networkInterfaceListNnetworkInterfaceOrder == null) {
            throw new IllegalArgumentException("Parameter networkInterfaceListNnetworkInterfaceOrder is required and cannot be null.");
        }
        if (networkInterfaceListNaccessControlGroupNoListN == null) {
            throw new IllegalArgumentException("Parameter networkInterfaceListNaccessControlGroupNoListN is required and cannot be null.");
        }
        return service.create(responseFormatType, regionCode, memberServerImageInstanceNo, serverImageProductCode, vpcNo, subnetNo, serverProductCode, isEncryptedBaseBlockStorageVolume, feeSystemTypeCode, serverCreateCount, serverCreateStartNo, serverName, networkInterfaceListNnetworkInterfaceOrder, networkInterfaceListNnetworkInterfaceNo, networkInterfaceListNsubnetNo, networkInterfaceListNip, networkInterfaceListNaccessControlGroupNoListN, placementGroupNo, isProtectServerTermination, serverDescription, initScriptNo, loginKeyName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerInstancesResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerInstancesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerInstancesResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerInstancesResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerInstancesResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerInstancesResponse>() { }.getType())
                .build(response);
    }

    /**
     * 서버 인스턴스를 시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    public ServerInstancesResponse start(String responseFormatType, String serverInstanceNoListN) {
        return startWithServiceResponseAsync(responseFormatType, serverInstanceNoListN).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스를 시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerInstancesResponse> startAsync(String responseFormatType, String serverInstanceNoListN, final ServiceCallback<ServerInstancesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(startWithServiceResponseAsync(responseFormatType, serverInstanceNoListN), serviceCallback);
    }

    /**
     * 서버 인스턴스를 시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServerInstancesResponse> startAsync(String responseFormatType, String serverInstanceNoListN) {
        return startWithServiceResponseAsync(responseFormatType, serverInstanceNoListN).map(new Func1<ServiceResponse<ServerInstancesResponse>, ServerInstancesResponse>() {
            @Override
            public ServerInstancesResponse call(ServiceResponse<ServerInstancesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스를 시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServiceResponse<ServerInstancesResponse>> startWithServiceResponseAsync(String responseFormatType, String serverInstanceNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNoListN is required and cannot be null.");
        }
        final String regionCode = null;
        return service.start(responseFormatType, regionCode, serverInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerInstancesResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerInstancesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerInstancesResponse> clientResponse = startDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 서버 인스턴스를 시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    public ServerInstancesResponse start(String responseFormatType, String serverInstanceNoListN, String regionCode) {
        return startWithServiceResponseAsync(responseFormatType, serverInstanceNoListN, regionCode).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스를 시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerInstancesResponse> startAsync(String responseFormatType, String serverInstanceNoListN, String regionCode, final ServiceCallback<ServerInstancesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(startWithServiceResponseAsync(responseFormatType, serverInstanceNoListN, regionCode), serviceCallback);
    }

    /**
     * 서버 인스턴스를 시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServerInstancesResponse> startAsync(String responseFormatType, String serverInstanceNoListN, String regionCode) {
        return startWithServiceResponseAsync(responseFormatType, serverInstanceNoListN, regionCode).map(new Func1<ServiceResponse<ServerInstancesResponse>, ServerInstancesResponse>() {
            @Override
            public ServerInstancesResponse call(ServiceResponse<ServerInstancesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스를 시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServiceResponse<ServerInstancesResponse>> startWithServiceResponseAsync(String responseFormatType, String serverInstanceNoListN, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNoListN is required and cannot be null.");
        }
        return service.start(responseFormatType, regionCode, serverInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerInstancesResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerInstancesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerInstancesResponse> clientResponse = startDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerInstancesResponse> startDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerInstancesResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerInstancesResponse>() { }.getType())
                .build(response);
    }

    /**
     * 서버 인스턴스를 종료.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    public ServerInstancesResponse stop(String responseFormatType, String serverInstanceNoListN) {
        return stopWithServiceResponseAsync(responseFormatType, serverInstanceNoListN).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스를 종료.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerInstancesResponse> stopAsync(String responseFormatType, String serverInstanceNoListN, final ServiceCallback<ServerInstancesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(stopWithServiceResponseAsync(responseFormatType, serverInstanceNoListN), serviceCallback);
    }

    /**
     * 서버 인스턴스를 종료.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServerInstancesResponse> stopAsync(String responseFormatType, String serverInstanceNoListN) {
        return stopWithServiceResponseAsync(responseFormatType, serverInstanceNoListN).map(new Func1<ServiceResponse<ServerInstancesResponse>, ServerInstancesResponse>() {
            @Override
            public ServerInstancesResponse call(ServiceResponse<ServerInstancesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스를 종료.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServiceResponse<ServerInstancesResponse>> stopWithServiceResponseAsync(String responseFormatType, String serverInstanceNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNoListN is required and cannot be null.");
        }
        final String regionCode = null;
        return service.stop(responseFormatType, regionCode, serverInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerInstancesResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerInstancesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerInstancesResponse> clientResponse = stopDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 서버 인스턴스를 종료.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    public ServerInstancesResponse stop(String responseFormatType, String serverInstanceNoListN, String regionCode) {
        return stopWithServiceResponseAsync(responseFormatType, serverInstanceNoListN, regionCode).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스를 종료.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerInstancesResponse> stopAsync(String responseFormatType, String serverInstanceNoListN, String regionCode, final ServiceCallback<ServerInstancesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(stopWithServiceResponseAsync(responseFormatType, serverInstanceNoListN, regionCode), serviceCallback);
    }

    /**
     * 서버 인스턴스를 종료.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServerInstancesResponse> stopAsync(String responseFormatType, String serverInstanceNoListN, String regionCode) {
        return stopWithServiceResponseAsync(responseFormatType, serverInstanceNoListN, regionCode).map(new Func1<ServiceResponse<ServerInstancesResponse>, ServerInstancesResponse>() {
            @Override
            public ServerInstancesResponse call(ServiceResponse<ServerInstancesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스를 종료.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServiceResponse<ServerInstancesResponse>> stopWithServiceResponseAsync(String responseFormatType, String serverInstanceNoListN, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNoListN is required and cannot be null.");
        }
        return service.stop(responseFormatType, regionCode, serverInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerInstancesResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerInstancesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerInstancesResponse> clientResponse = stopDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerInstancesResponse> stopDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerInstancesResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerInstancesResponse>() { }.getType())
                .build(response);
    }

    /**
     * 서버 인스턴스를 재시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    public ServerInstancesResponse reboot(String responseFormatType, String serverInstanceNoListN) {
        return rebootWithServiceResponseAsync(responseFormatType, serverInstanceNoListN).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스를 재시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerInstancesResponse> rebootAsync(String responseFormatType, String serverInstanceNoListN, final ServiceCallback<ServerInstancesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(rebootWithServiceResponseAsync(responseFormatType, serverInstanceNoListN), serviceCallback);
    }

    /**
     * 서버 인스턴스를 재시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServerInstancesResponse> rebootAsync(String responseFormatType, String serverInstanceNoListN) {
        return rebootWithServiceResponseAsync(responseFormatType, serverInstanceNoListN).map(new Func1<ServiceResponse<ServerInstancesResponse>, ServerInstancesResponse>() {
            @Override
            public ServerInstancesResponse call(ServiceResponse<ServerInstancesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스를 재시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServiceResponse<ServerInstancesResponse>> rebootWithServiceResponseAsync(String responseFormatType, String serverInstanceNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNoListN is required and cannot be null.");
        }
        final String regionCode = null;
        return service.reboot(responseFormatType, regionCode, serverInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerInstancesResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerInstancesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerInstancesResponse> clientResponse = rebootDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 서버 인스턴스를 재시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    public ServerInstancesResponse reboot(String responseFormatType, String serverInstanceNoListN, String regionCode) {
        return rebootWithServiceResponseAsync(responseFormatType, serverInstanceNoListN, regionCode).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스를 재시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerInstancesResponse> rebootAsync(String responseFormatType, String serverInstanceNoListN, String regionCode, final ServiceCallback<ServerInstancesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(rebootWithServiceResponseAsync(responseFormatType, serverInstanceNoListN, regionCode), serviceCallback);
    }

    /**
     * 서버 인스턴스를 재시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServerInstancesResponse> rebootAsync(String responseFormatType, String serverInstanceNoListN, String regionCode) {
        return rebootWithServiceResponseAsync(responseFormatType, serverInstanceNoListN, regionCode).map(new Func1<ServiceResponse<ServerInstancesResponse>, ServerInstancesResponse>() {
            @Override
            public ServerInstancesResponse call(ServiceResponse<ServerInstancesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스를 재시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServiceResponse<ServerInstancesResponse>> rebootWithServiceResponseAsync(String responseFormatType, String serverInstanceNoListN, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNoListN is required and cannot be null.");
        }
        return service.reboot(responseFormatType, regionCode, serverInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerInstancesResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerInstancesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerInstancesResponse> clientResponse = rebootDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerInstancesResponse> rebootDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerInstancesResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerInstancesResponse>() { }.getType())
                .build(response);
    }

    /**
     * 서버 인스턴스를 반납.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    public ServerInstancesResponse terminate(String responseFormatType, String serverInstanceNoListN) {
        return terminateWithServiceResponseAsync(responseFormatType, serverInstanceNoListN).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스를 반납.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerInstancesResponse> terminateAsync(String responseFormatType, String serverInstanceNoListN, final ServiceCallback<ServerInstancesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(terminateWithServiceResponseAsync(responseFormatType, serverInstanceNoListN), serviceCallback);
    }

    /**
     * 서버 인스턴스를 반납.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServerInstancesResponse> terminateAsync(String responseFormatType, String serverInstanceNoListN) {
        return terminateWithServiceResponseAsync(responseFormatType, serverInstanceNoListN).map(new Func1<ServiceResponse<ServerInstancesResponse>, ServerInstancesResponse>() {
            @Override
            public ServerInstancesResponse call(ServiceResponse<ServerInstancesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스를 반납.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServiceResponse<ServerInstancesResponse>> terminateWithServiceResponseAsync(String responseFormatType, String serverInstanceNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNoListN is required and cannot be null.");
        }
        final String regionCode = null;
        return service.terminate(responseFormatType, regionCode, serverInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerInstancesResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerInstancesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerInstancesResponse> clientResponse = terminateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 서버 인스턴스를 반납.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    public ServerInstancesResponse terminate(String responseFormatType, String serverInstanceNoListN, String regionCode) {
        return terminateWithServiceResponseAsync(responseFormatType, serverInstanceNoListN, regionCode).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스를 반납.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerInstancesResponse> terminateAsync(String responseFormatType, String serverInstanceNoListN, String regionCode, final ServiceCallback<ServerInstancesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(terminateWithServiceResponseAsync(responseFormatType, serverInstanceNoListN, regionCode), serviceCallback);
    }

    /**
     * 서버 인스턴스를 반납.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServerInstancesResponse> terminateAsync(String responseFormatType, String serverInstanceNoListN, String regionCode) {
        return terminateWithServiceResponseAsync(responseFormatType, serverInstanceNoListN, regionCode).map(new Func1<ServiceResponse<ServerInstancesResponse>, ServerInstancesResponse>() {
            @Override
            public ServerInstancesResponse call(ServiceResponse<ServerInstancesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스를 반납.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    public Observable<ServiceResponse<ServerInstancesResponse>> terminateWithServiceResponseAsync(String responseFormatType, String serverInstanceNoListN, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNoListN is required and cannot be null.");
        }
        return service.terminate(responseFormatType, regionCode, serverInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerInstancesResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerInstancesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerInstancesResponse> clientResponse = terminateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerInstancesResponse> terminateDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerInstancesResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerInstancesResponse>() { }.getType())
                .build(response);
    }

    /**
     * 서버 인스턴스 스펙을 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serverProductCode 서버 상품 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstanceSpecResponse object if successful.
     */
    public ServerInstanceSpecResponse changeSpec(String responseFormatType, String serverInstanceNo, String serverProductCode) {
        return changeSpecWithServiceResponseAsync(responseFormatType, serverInstanceNo, serverProductCode).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스 스펙을 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serverProductCode 서버 상품 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerInstanceSpecResponse> changeSpecAsync(String responseFormatType, String serverInstanceNo, String serverProductCode, final ServiceCallback<ServerInstanceSpecResponse> serviceCallback) {
        return ServiceFuture.fromResponse(changeSpecWithServiceResponseAsync(responseFormatType, serverInstanceNo, serverProductCode), serviceCallback);
    }

    /**
     * 서버 인스턴스 스펙을 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serverProductCode 서버 상품 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceSpecResponse object
     */
    public Observable<ServerInstanceSpecResponse> changeSpecAsync(String responseFormatType, String serverInstanceNo, String serverProductCode) {
        return changeSpecWithServiceResponseAsync(responseFormatType, serverInstanceNo, serverProductCode).map(new Func1<ServiceResponse<ServerInstanceSpecResponse>, ServerInstanceSpecResponse>() {
            @Override
            public ServerInstanceSpecResponse call(ServiceResponse<ServerInstanceSpecResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스 스펙을 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serverProductCode 서버 상품 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceSpecResponse object
     */
    public Observable<ServiceResponse<ServerInstanceSpecResponse>> changeSpecWithServiceResponseAsync(String responseFormatType, String serverInstanceNo, String serverProductCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        if (serverProductCode == null) {
            throw new IllegalArgumentException("Parameter serverProductCode is required and cannot be null.");
        }
        final String regionCode = null;
        return service.changeSpec(responseFormatType, regionCode, serverInstanceNo, serverProductCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerInstanceSpecResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerInstanceSpecResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerInstanceSpecResponse> clientResponse = changeSpecDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 서버 인스턴스 스펙을 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serverProductCode 서버 상품 코드
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstanceSpecResponse object if successful.
     */
    public ServerInstanceSpecResponse changeSpec(String responseFormatType, String serverInstanceNo, String serverProductCode, String regionCode) {
        return changeSpecWithServiceResponseAsync(responseFormatType, serverInstanceNo, serverProductCode, regionCode).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스 스펙을 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serverProductCode 서버 상품 코드
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerInstanceSpecResponse> changeSpecAsync(String responseFormatType, String serverInstanceNo, String serverProductCode, String regionCode, final ServiceCallback<ServerInstanceSpecResponse> serviceCallback) {
        return ServiceFuture.fromResponse(changeSpecWithServiceResponseAsync(responseFormatType, serverInstanceNo, serverProductCode, regionCode), serviceCallback);
    }

    /**
     * 서버 인스턴스 스펙을 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serverProductCode 서버 상품 코드
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceSpecResponse object
     */
    public Observable<ServerInstanceSpecResponse> changeSpecAsync(String responseFormatType, String serverInstanceNo, String serverProductCode, String regionCode) {
        return changeSpecWithServiceResponseAsync(responseFormatType, serverInstanceNo, serverProductCode, regionCode).map(new Func1<ServiceResponse<ServerInstanceSpecResponse>, ServerInstanceSpecResponse>() {
            @Override
            public ServerInstanceSpecResponse call(ServiceResponse<ServerInstanceSpecResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스 스펙을 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serverProductCode 서버 상품 코드
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceSpecResponse object
     */
    public Observable<ServiceResponse<ServerInstanceSpecResponse>> changeSpecWithServiceResponseAsync(String responseFormatType, String serverInstanceNo, String serverProductCode, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        if (serverProductCode == null) {
            throw new IllegalArgumentException("Parameter serverProductCode is required and cannot be null.");
        }
        return service.changeSpec(responseFormatType, regionCode, serverInstanceNo, serverProductCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerInstanceSpecResponse>>>() {
                @Override
                public Observable<ServiceResponse<ServerInstanceSpecResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerInstanceSpecResponse> clientResponse = changeSpecDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerInstanceSpecResponse> changeSpecDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerInstanceSpecResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerInstanceSpecResponse>() { }.getType())
                .build(response);
    }

}
