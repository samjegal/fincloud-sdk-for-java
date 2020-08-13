/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.implementation;

import retrofit2.Retrofit;
import com.fincloud.server.NetworkInterfaces;
import com.fincloud.server.models.NetworkInterfaceAccessControlGroupResponse;
import com.fincloud.server.models.NetworkInterfaceDetailResponse;
import com.fincloud.server.models.NetworkInterfaceListResponse;
import com.fincloud.server.models.NetworkInterfaceResponse;
import com.fincloud.server.models.NetworkInterfaceStatusCode;
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
 * in NetworkInterfaces.
 */
public class NetworkInterfacesImpl implements NetworkInterfaces {
    /** The Retrofit service to perform REST calls. */
    private NetworkInterfacesService service;
    /** The service client containing this operation class. */
    private ServerManagementClientImpl client;

    /**
     * Initializes an instance of NetworkInterfaces.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public NetworkInterfacesImpl(Retrofit retrofit, ServerManagementClientImpl client) {
        this.service = retrofit.create(NetworkInterfacesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkInterfaces to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NetworkInterfacesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.NetworkInterfaces getList" })
        @GET("vserver/v2/getNetworkInterfaceList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("networkInterfaceNoList.N") String networkInterfaceNoListN, @Query("ip") String ip, @Query("networkInterfaceName") String networkInterfaceName, @Query("serverInstanceName") String serverInstanceName, @Query("subnetName") String subnetName, @Query("pageNo") String pageNo, @Query("pageSize") String pageSize, @Query("networkInterfaceStatusCode") NetworkInterfaceStatusCode networkInterfaceStatusCode1);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.NetworkInterfaces getDetail" })
        @GET("vserver/v2/getNetworkInterfaceDetail")
        Observable<Response<ResponseBody>> getDetail(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("networkInterfaceNo") String networkInterfaceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.NetworkInterfaces create" })
        @POST("vserver/v2/createNetworkInterface")
        Observable<Response<ResponseBody>> create(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcNo") String vpcNo, @Query("subnetNo") String subnetNo, @Query("networkInterfaceName") String networkInterfaceName, @Query("accessControlGroupNoList.N") String accessControlGroupNoListN, @Query("serverInstanceNo") String serverInstanceNo, @Query("ip") String ip, @Query("networkInterfaceDescription") String networkInterfaceDescription);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.NetworkInterfaces delete" })
        @POST("vserver/v2/deleteNetworkInterface")
        Observable<Response<ResponseBody>> delete(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("networkInterfaceNo") String networkInterfaceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.NetworkInterfaces attach" })
        @POST("vserver/v2/attachNetworkInterface")
        Observable<Response<ResponseBody>> attach(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("subnetNo") String subnetNo, @Query("networkInterfaceNo") String networkInterfaceNo, @Query("serverInstanceNo") String serverInstanceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.NetworkInterfaces detach" })
        @POST("vserver/v2/detachNetworkInterface")
        Observable<Response<ResponseBody>> detach(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("subnetNo") String subnetNo, @Query("networkInterfaceNo") String networkInterfaceNo, @Query("serverInstanceNo") String serverInstanceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.NetworkInterfaces addACG" })
        @POST("vserver/v2/addNetworkInterfaceAccessControlGroup")
        Observable<Response<ResponseBody>> addACG(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("networkInterfaceNo") String networkInterfaceNo, @Query("accessControlGroupNoList.N") String accessControlGroupNoListN);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.NetworkInterfaces removeACG" })
        @POST("vserver/v2/removeNetworkInterfaceAccessControlGroup")
        Observable<Response<ResponseBody>> removeACG(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("networkInterfaceNo") String networkInterfaceNo, @Query("accessControlGroupNoList.N") String accessControlGroupNoListN);

    }

    /**
     * 네트워크 인터페이스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceListResponse object if successful.
     */
    public NetworkInterfaceListResponse getList(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 네트워크 인터페이스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkInterfaceListResponse> getListAsync(String responseFormatType, final ServiceCallback<NetworkInterfaceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 네트워크 인터페이스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceListResponse object
     */
    public Observable<NetworkInterfaceListResponse> getListAsync(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<NetworkInterfaceListResponse>, NetworkInterfaceListResponse>() {
            @Override
            public NetworkInterfaceListResponse call(ServiceResponse<NetworkInterfaceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 인터페이스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceListResponse object
     */
    public Observable<ServiceResponse<NetworkInterfaceListResponse>> getListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String networkInterfaceNoListN = null;
        final String ip = null;
        final String networkInterfaceName = null;
        final String serverInstanceName = null;
        final String subnetName = null;
        final String pageNo = null;
        final String pageSize = null;
        final NetworkInterfaceStatusCode networkInterfaceStatusCode = null;
        return service.getList(responseFormatType, regionCode, networkInterfaceNoListN, ip, networkInterfaceName, serverInstanceName, subnetName, pageNo, pageSize, networkInterfaceStatusCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkInterfaceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkInterfaceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkInterfaceListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 네트워크 인터페이스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkInterfaceNoListN 네트워크 인터페이스 번호 리스트
     * @param ip IP 주소
     * @param networkInterfaceName 네트워크 인터페이스 이름
     * @param serverInstanceName 서버 인스턴스 이름
     * @param subnetName 서브넷 이름
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param networkInterfaceStatusCode 네트워크 인터페이스 상태 코드. Possible values include: 'SET', 'UNSET', 'USED', 'NOTUSED'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceListResponse object if successful.
     */
    public NetworkInterfaceListResponse getList(String responseFormatType, String regionCode, String networkInterfaceNoListN, String ip, String networkInterfaceName, String serverInstanceName, String subnetName, String pageNo, String pageSize, NetworkInterfaceStatusCode networkInterfaceStatusCode) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, networkInterfaceNoListN, ip, networkInterfaceName, serverInstanceName, subnetName, pageNo, pageSize, networkInterfaceStatusCode).toBlocking().single().body();
    }

    /**
     * 네트워크 인터페이스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkInterfaceNoListN 네트워크 인터페이스 번호 리스트
     * @param ip IP 주소
     * @param networkInterfaceName 네트워크 인터페이스 이름
     * @param serverInstanceName 서버 인스턴스 이름
     * @param subnetName 서브넷 이름
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param networkInterfaceStatusCode 네트워크 인터페이스 상태 코드. Possible values include: 'SET', 'UNSET', 'USED', 'NOTUSED'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkInterfaceListResponse> getListAsync(String responseFormatType, String regionCode, String networkInterfaceNoListN, String ip, String networkInterfaceName, String serverInstanceName, String subnetName, String pageNo, String pageSize, NetworkInterfaceStatusCode networkInterfaceStatusCode, final ServiceCallback<NetworkInterfaceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, regionCode, networkInterfaceNoListN, ip, networkInterfaceName, serverInstanceName, subnetName, pageNo, pageSize, networkInterfaceStatusCode), serviceCallback);
    }

    /**
     * 네트워크 인터페이스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkInterfaceNoListN 네트워크 인터페이스 번호 리스트
     * @param ip IP 주소
     * @param networkInterfaceName 네트워크 인터페이스 이름
     * @param serverInstanceName 서버 인스턴스 이름
     * @param subnetName 서브넷 이름
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param networkInterfaceStatusCode 네트워크 인터페이스 상태 코드. Possible values include: 'SET', 'UNSET', 'USED', 'NOTUSED'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceListResponse object
     */
    public Observable<NetworkInterfaceListResponse> getListAsync(String responseFormatType, String regionCode, String networkInterfaceNoListN, String ip, String networkInterfaceName, String serverInstanceName, String subnetName, String pageNo, String pageSize, NetworkInterfaceStatusCode networkInterfaceStatusCode) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, networkInterfaceNoListN, ip, networkInterfaceName, serverInstanceName, subnetName, pageNo, pageSize, networkInterfaceStatusCode).map(new Func1<ServiceResponse<NetworkInterfaceListResponse>, NetworkInterfaceListResponse>() {
            @Override
            public NetworkInterfaceListResponse call(ServiceResponse<NetworkInterfaceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 인터페이스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkInterfaceNoListN 네트워크 인터페이스 번호 리스트
     * @param ip IP 주소
     * @param networkInterfaceName 네트워크 인터페이스 이름
     * @param serverInstanceName 서버 인스턴스 이름
     * @param subnetName 서브넷 이름
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param networkInterfaceStatusCode 네트워크 인터페이스 상태 코드. Possible values include: 'SET', 'UNSET', 'USED', 'NOTUSED'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceListResponse object
     */
    public Observable<ServiceResponse<NetworkInterfaceListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String networkInterfaceNoListN, String ip, String networkInterfaceName, String serverInstanceName, String subnetName, String pageNo, String pageSize, NetworkInterfaceStatusCode networkInterfaceStatusCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, networkInterfaceNoListN, ip, networkInterfaceName, serverInstanceName, subnetName, pageNo, pageSize, networkInterfaceStatusCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkInterfaceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkInterfaceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkInterfaceListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkInterfaceListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkInterfaceListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkInterfaceListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 네트워크 인터페이스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceDetailResponse object if successful.
     */
    public NetworkInterfaceDetailResponse getDetail(String responseFormatType, String networkInterfaceNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, networkInterfaceNo).toBlocking().single().body();
    }

    /**
     * 네트워크 인터페이스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkInterfaceDetailResponse> getDetailAsync(String responseFormatType, String networkInterfaceNo, final ServiceCallback<NetworkInterfaceDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, networkInterfaceNo), serviceCallback);
    }

    /**
     * 네트워크 인터페이스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceDetailResponse object
     */
    public Observable<NetworkInterfaceDetailResponse> getDetailAsync(String responseFormatType, String networkInterfaceNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, networkInterfaceNo).map(new Func1<ServiceResponse<NetworkInterfaceDetailResponse>, NetworkInterfaceDetailResponse>() {
            @Override
            public NetworkInterfaceDetailResponse call(ServiceResponse<NetworkInterfaceDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 인터페이스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceDetailResponse object
     */
    public Observable<ServiceResponse<NetworkInterfaceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String networkInterfaceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkInterfaceNo == null) {
            throw new IllegalArgumentException("Parameter networkInterfaceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.getDetail(responseFormatType, regionCode, networkInterfaceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkInterfaceDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkInterfaceDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkInterfaceDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 네트워크 인터페이스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceDetailResponse object if successful.
     */
    public NetworkInterfaceDetailResponse getDetail(String responseFormatType, String networkInterfaceNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, networkInterfaceNo, regionCode).toBlocking().single().body();
    }

    /**
     * 네트워크 인터페이스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkInterfaceDetailResponse> getDetailAsync(String responseFormatType, String networkInterfaceNo, String regionCode, final ServiceCallback<NetworkInterfaceDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, networkInterfaceNo, regionCode), serviceCallback);
    }

    /**
     * 네트워크 인터페이스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceDetailResponse object
     */
    public Observable<NetworkInterfaceDetailResponse> getDetailAsync(String responseFormatType, String networkInterfaceNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, networkInterfaceNo, regionCode).map(new Func1<ServiceResponse<NetworkInterfaceDetailResponse>, NetworkInterfaceDetailResponse>() {
            @Override
            public NetworkInterfaceDetailResponse call(ServiceResponse<NetworkInterfaceDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 인터페이스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceDetailResponse object
     */
    public Observable<ServiceResponse<NetworkInterfaceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String networkInterfaceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkInterfaceNo == null) {
            throw new IllegalArgumentException("Parameter networkInterfaceNo is required and cannot be null.");
        }
        return service.getDetail(responseFormatType, regionCode, networkInterfaceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkInterfaceDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkInterfaceDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkInterfaceDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkInterfaceDetailResponse> getDetailDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkInterfaceDetailResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkInterfaceDetailResponse>() { }.getType())
                .build(response);
    }

    /**
     * 네트워크 인터페이스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceResponse object if successful.
     */
    public NetworkInterfaceResponse create(String responseFormatType) {
        return createWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 네트워크 인터페이스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkInterfaceResponse> createAsync(String responseFormatType, final ServiceCallback<NetworkInterfaceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 네트워크 인터페이스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    public Observable<NetworkInterfaceResponse> createAsync(String responseFormatType) {
        return createWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<NetworkInterfaceResponse>, NetworkInterfaceResponse>() {
            @Override
            public NetworkInterfaceResponse call(ServiceResponse<NetworkInterfaceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 인터페이스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    public Observable<ServiceResponse<NetworkInterfaceResponse>> createWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String vpcNo = null;
        final String subnetNo = null;
        final String networkInterfaceName = null;
        final String accessControlGroupNoListN = null;
        final String serverInstanceNo = null;
        final String ip = null;
        final String networkInterfaceDescription = null;
        return service.create(responseFormatType, regionCode, vpcNo, subnetNo, networkInterfaceName, accessControlGroupNoListN, serverInstanceNo, ip, networkInterfaceDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkInterfaceResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkInterfaceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkInterfaceResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 네트워크 인터페이스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceName 네트워크 인터페이스 이름
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param ip IP 주소
     * @param networkInterfaceDescription 네트워크 인터페이스 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceResponse object if successful.
     */
    public NetworkInterfaceResponse create(String responseFormatType, String regionCode, String vpcNo, String subnetNo, String networkInterfaceName, String accessControlGroupNoListN, String serverInstanceNo, String ip, String networkInterfaceDescription) {
        return createWithServiceResponseAsync(responseFormatType, regionCode, vpcNo, subnetNo, networkInterfaceName, accessControlGroupNoListN, serverInstanceNo, ip, networkInterfaceDescription).toBlocking().single().body();
    }

    /**
     * 네트워크 인터페이스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceName 네트워크 인터페이스 이름
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param ip IP 주소
     * @param networkInterfaceDescription 네트워크 인터페이스 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkInterfaceResponse> createAsync(String responseFormatType, String regionCode, String vpcNo, String subnetNo, String networkInterfaceName, String accessControlGroupNoListN, String serverInstanceNo, String ip, String networkInterfaceDescription, final ServiceCallback<NetworkInterfaceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, regionCode, vpcNo, subnetNo, networkInterfaceName, accessControlGroupNoListN, serverInstanceNo, ip, networkInterfaceDescription), serviceCallback);
    }

    /**
     * 네트워크 인터페이스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceName 네트워크 인터페이스 이름
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param ip IP 주소
     * @param networkInterfaceDescription 네트워크 인터페이스 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    public Observable<NetworkInterfaceResponse> createAsync(String responseFormatType, String regionCode, String vpcNo, String subnetNo, String networkInterfaceName, String accessControlGroupNoListN, String serverInstanceNo, String ip, String networkInterfaceDescription) {
        return createWithServiceResponseAsync(responseFormatType, regionCode, vpcNo, subnetNo, networkInterfaceName, accessControlGroupNoListN, serverInstanceNo, ip, networkInterfaceDescription).map(new Func1<ServiceResponse<NetworkInterfaceResponse>, NetworkInterfaceResponse>() {
            @Override
            public NetworkInterfaceResponse call(ServiceResponse<NetworkInterfaceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 인터페이스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceName 네트워크 인터페이스 이름
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param ip IP 주소
     * @param networkInterfaceDescription 네트워크 인터페이스 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    public Observable<ServiceResponse<NetworkInterfaceResponse>> createWithServiceResponseAsync(String responseFormatType, String regionCode, String vpcNo, String subnetNo, String networkInterfaceName, String accessControlGroupNoListN, String serverInstanceNo, String ip, String networkInterfaceDescription) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.create(responseFormatType, regionCode, vpcNo, subnetNo, networkInterfaceName, accessControlGroupNoListN, serverInstanceNo, ip, networkInterfaceDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkInterfaceResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkInterfaceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkInterfaceResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkInterfaceResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkInterfaceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkInterfaceResponse>() { }.getType())
                .build(response);
    }

    /**
     * 네트워크 인터페이스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceResponse object if successful.
     */
    public NetworkInterfaceResponse delete(String responseFormatType) {
        return deleteWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 네트워크 인터페이스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkInterfaceResponse> deleteAsync(String responseFormatType, final ServiceCallback<NetworkInterfaceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 네트워크 인터페이스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    public Observable<NetworkInterfaceResponse> deleteAsync(String responseFormatType) {
        return deleteWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<NetworkInterfaceResponse>, NetworkInterfaceResponse>() {
            @Override
            public NetworkInterfaceResponse call(ServiceResponse<NetworkInterfaceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 인터페이스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    public Observable<ServiceResponse<NetworkInterfaceResponse>> deleteWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String networkInterfaceNo = null;
        return service.delete(responseFormatType, regionCode, networkInterfaceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkInterfaceResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkInterfaceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkInterfaceResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 네트워크 인터페이스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceResponse object if successful.
     */
    public NetworkInterfaceResponse delete(String responseFormatType, String regionCode, String networkInterfaceNo) {
        return deleteWithServiceResponseAsync(responseFormatType, regionCode, networkInterfaceNo).toBlocking().single().body();
    }

    /**
     * 네트워크 인터페이스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkInterfaceResponse> deleteAsync(String responseFormatType, String regionCode, String networkInterfaceNo, final ServiceCallback<NetworkInterfaceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, regionCode, networkInterfaceNo), serviceCallback);
    }

    /**
     * 네트워크 인터페이스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    public Observable<NetworkInterfaceResponse> deleteAsync(String responseFormatType, String regionCode, String networkInterfaceNo) {
        return deleteWithServiceResponseAsync(responseFormatType, regionCode, networkInterfaceNo).map(new Func1<ServiceResponse<NetworkInterfaceResponse>, NetworkInterfaceResponse>() {
            @Override
            public NetworkInterfaceResponse call(ServiceResponse<NetworkInterfaceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 인터페이스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    public Observable<ServiceResponse<NetworkInterfaceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String regionCode, String networkInterfaceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.delete(responseFormatType, regionCode, networkInterfaceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkInterfaceResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkInterfaceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkInterfaceResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkInterfaceResponse> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkInterfaceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkInterfaceResponse>() { }.getType())
                .build(response);
    }

    /**
     * 네트워크 인터페이스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceResponse object if successful.
     */
    public NetworkInterfaceResponse attach(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo) {
        return attachWithServiceResponseAsync(responseFormatType, subnetNo, networkInterfaceNo, serverInstanceNo).toBlocking().single().body();
    }

    /**
     * 네트워크 인터페이스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkInterfaceResponse> attachAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, final ServiceCallback<NetworkInterfaceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(attachWithServiceResponseAsync(responseFormatType, subnetNo, networkInterfaceNo, serverInstanceNo), serviceCallback);
    }

    /**
     * 네트워크 인터페이스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    public Observable<NetworkInterfaceResponse> attachAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo) {
        return attachWithServiceResponseAsync(responseFormatType, subnetNo, networkInterfaceNo, serverInstanceNo).map(new Func1<ServiceResponse<NetworkInterfaceResponse>, NetworkInterfaceResponse>() {
            @Override
            public NetworkInterfaceResponse call(ServiceResponse<NetworkInterfaceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 인터페이스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    public Observable<ServiceResponse<NetworkInterfaceResponse>> attachWithServiceResponseAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (subnetNo == null) {
            throw new IllegalArgumentException("Parameter subnetNo is required and cannot be null.");
        }
        if (networkInterfaceNo == null) {
            throw new IllegalArgumentException("Parameter networkInterfaceNo is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.attach(responseFormatType, regionCode, subnetNo, networkInterfaceNo, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkInterfaceResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkInterfaceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkInterfaceResponse> clientResponse = attachDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 네트워크 인터페이스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceResponse object if successful.
     */
    public NetworkInterfaceResponse attach(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, String regionCode) {
        return attachWithServiceResponseAsync(responseFormatType, subnetNo, networkInterfaceNo, serverInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * 네트워크 인터페이스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkInterfaceResponse> attachAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, String regionCode, final ServiceCallback<NetworkInterfaceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(attachWithServiceResponseAsync(responseFormatType, subnetNo, networkInterfaceNo, serverInstanceNo, regionCode), serviceCallback);
    }

    /**
     * 네트워크 인터페이스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    public Observable<NetworkInterfaceResponse> attachAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, String regionCode) {
        return attachWithServiceResponseAsync(responseFormatType, subnetNo, networkInterfaceNo, serverInstanceNo, regionCode).map(new Func1<ServiceResponse<NetworkInterfaceResponse>, NetworkInterfaceResponse>() {
            @Override
            public NetworkInterfaceResponse call(ServiceResponse<NetworkInterfaceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 인터페이스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    public Observable<ServiceResponse<NetworkInterfaceResponse>> attachWithServiceResponseAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (subnetNo == null) {
            throw new IllegalArgumentException("Parameter subnetNo is required and cannot be null.");
        }
        if (networkInterfaceNo == null) {
            throw new IllegalArgumentException("Parameter networkInterfaceNo is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        return service.attach(responseFormatType, regionCode, subnetNo, networkInterfaceNo, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkInterfaceResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkInterfaceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkInterfaceResponse> clientResponse = attachDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkInterfaceResponse> attachDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkInterfaceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkInterfaceResponse>() { }.getType())
                .build(response);
    }

    /**
     * 네트워크 인터페이스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceResponse object if successful.
     */
    public NetworkInterfaceResponse detach(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo) {
        return detachWithServiceResponseAsync(responseFormatType, subnetNo, networkInterfaceNo, serverInstanceNo).toBlocking().single().body();
    }

    /**
     * 네트워크 인터페이스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkInterfaceResponse> detachAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, final ServiceCallback<NetworkInterfaceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(detachWithServiceResponseAsync(responseFormatType, subnetNo, networkInterfaceNo, serverInstanceNo), serviceCallback);
    }

    /**
     * 네트워크 인터페이스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    public Observable<NetworkInterfaceResponse> detachAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo) {
        return detachWithServiceResponseAsync(responseFormatType, subnetNo, networkInterfaceNo, serverInstanceNo).map(new Func1<ServiceResponse<NetworkInterfaceResponse>, NetworkInterfaceResponse>() {
            @Override
            public NetworkInterfaceResponse call(ServiceResponse<NetworkInterfaceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 인터페이스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    public Observable<ServiceResponse<NetworkInterfaceResponse>> detachWithServiceResponseAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (subnetNo == null) {
            throw new IllegalArgumentException("Parameter subnetNo is required and cannot be null.");
        }
        if (networkInterfaceNo == null) {
            throw new IllegalArgumentException("Parameter networkInterfaceNo is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.detach(responseFormatType, regionCode, subnetNo, networkInterfaceNo, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkInterfaceResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkInterfaceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkInterfaceResponse> clientResponse = detachDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 네트워크 인터페이스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceResponse object if successful.
     */
    public NetworkInterfaceResponse detach(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, String regionCode) {
        return detachWithServiceResponseAsync(responseFormatType, subnetNo, networkInterfaceNo, serverInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * 네트워크 인터페이스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkInterfaceResponse> detachAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, String regionCode, final ServiceCallback<NetworkInterfaceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(detachWithServiceResponseAsync(responseFormatType, subnetNo, networkInterfaceNo, serverInstanceNo, regionCode), serviceCallback);
    }

    /**
     * 네트워크 인터페이스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    public Observable<NetworkInterfaceResponse> detachAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, String regionCode) {
        return detachWithServiceResponseAsync(responseFormatType, subnetNo, networkInterfaceNo, serverInstanceNo, regionCode).map(new Func1<ServiceResponse<NetworkInterfaceResponse>, NetworkInterfaceResponse>() {
            @Override
            public NetworkInterfaceResponse call(ServiceResponse<NetworkInterfaceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 인터페이스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    public Observable<ServiceResponse<NetworkInterfaceResponse>> detachWithServiceResponseAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (subnetNo == null) {
            throw new IllegalArgumentException("Parameter subnetNo is required and cannot be null.");
        }
        if (networkInterfaceNo == null) {
            throw new IllegalArgumentException("Parameter networkInterfaceNo is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        return service.detach(responseFormatType, regionCode, subnetNo, networkInterfaceNo, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkInterfaceResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkInterfaceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkInterfaceResponse> clientResponse = detachDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkInterfaceResponse> detachDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkInterfaceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkInterfaceResponse>() { }.getType())
                .build(response);
    }

    /**
     * 네트워크 인터페이스의 ACG를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceAccessControlGroupResponse object if successful.
     */
    public NetworkInterfaceAccessControlGroupResponse addACG(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN) {
        return addACGWithServiceResponseAsync(responseFormatType, networkInterfaceNo, accessControlGroupNoListN).toBlocking().single().body();
    }

    /**
     * 네트워크 인터페이스의 ACG를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkInterfaceAccessControlGroupResponse> addACGAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, final ServiceCallback<NetworkInterfaceAccessControlGroupResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addACGWithServiceResponseAsync(responseFormatType, networkInterfaceNo, accessControlGroupNoListN), serviceCallback);
    }

    /**
     * 네트워크 인터페이스의 ACG를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceAccessControlGroupResponse object
     */
    public Observable<NetworkInterfaceAccessControlGroupResponse> addACGAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN) {
        return addACGWithServiceResponseAsync(responseFormatType, networkInterfaceNo, accessControlGroupNoListN).map(new Func1<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>, NetworkInterfaceAccessControlGroupResponse>() {
            @Override
            public NetworkInterfaceAccessControlGroupResponse call(ServiceResponse<NetworkInterfaceAccessControlGroupResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 인터페이스의 ACG를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceAccessControlGroupResponse object
     */
    public Observable<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>> addACGWithServiceResponseAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkInterfaceNo == null) {
            throw new IllegalArgumentException("Parameter networkInterfaceNo is required and cannot be null.");
        }
        if (accessControlGroupNoListN == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupNoListN is required and cannot be null.");
        }
        final String regionCode = null;
        return service.addACG(responseFormatType, regionCode, networkInterfaceNo, accessControlGroupNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkInterfaceAccessControlGroupResponse> clientResponse = addACGDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 네트워크 인터페이스의 ACG를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceAccessControlGroupResponse object if successful.
     */
    public NetworkInterfaceAccessControlGroupResponse addACG(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, String regionCode) {
        return addACGWithServiceResponseAsync(responseFormatType, networkInterfaceNo, accessControlGroupNoListN, regionCode).toBlocking().single().body();
    }

    /**
     * 네트워크 인터페이스의 ACG를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkInterfaceAccessControlGroupResponse> addACGAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, String regionCode, final ServiceCallback<NetworkInterfaceAccessControlGroupResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addACGWithServiceResponseAsync(responseFormatType, networkInterfaceNo, accessControlGroupNoListN, regionCode), serviceCallback);
    }

    /**
     * 네트워크 인터페이스의 ACG를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceAccessControlGroupResponse object
     */
    public Observable<NetworkInterfaceAccessControlGroupResponse> addACGAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, String regionCode) {
        return addACGWithServiceResponseAsync(responseFormatType, networkInterfaceNo, accessControlGroupNoListN, regionCode).map(new Func1<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>, NetworkInterfaceAccessControlGroupResponse>() {
            @Override
            public NetworkInterfaceAccessControlGroupResponse call(ServiceResponse<NetworkInterfaceAccessControlGroupResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 인터페이스의 ACG를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceAccessControlGroupResponse object
     */
    public Observable<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>> addACGWithServiceResponseAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkInterfaceNo == null) {
            throw new IllegalArgumentException("Parameter networkInterfaceNo is required and cannot be null.");
        }
        if (accessControlGroupNoListN == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupNoListN is required and cannot be null.");
        }
        return service.addACG(responseFormatType, regionCode, networkInterfaceNo, accessControlGroupNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkInterfaceAccessControlGroupResponse> clientResponse = addACGDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkInterfaceAccessControlGroupResponse> addACGDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkInterfaceAccessControlGroupResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkInterfaceAccessControlGroupResponse>() { }.getType())
                .build(response);
    }

    /**
     * 네트워크 인터페이스의 ACG를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceAccessControlGroupResponse object if successful.
     */
    public NetworkInterfaceAccessControlGroupResponse removeACG(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN) {
        return removeACGWithServiceResponseAsync(responseFormatType, networkInterfaceNo, accessControlGroupNoListN).toBlocking().single().body();
    }

    /**
     * 네트워크 인터페이스의 ACG를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkInterfaceAccessControlGroupResponse> removeACGAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, final ServiceCallback<NetworkInterfaceAccessControlGroupResponse> serviceCallback) {
        return ServiceFuture.fromResponse(removeACGWithServiceResponseAsync(responseFormatType, networkInterfaceNo, accessControlGroupNoListN), serviceCallback);
    }

    /**
     * 네트워크 인터페이스의 ACG를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceAccessControlGroupResponse object
     */
    public Observable<NetworkInterfaceAccessControlGroupResponse> removeACGAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN) {
        return removeACGWithServiceResponseAsync(responseFormatType, networkInterfaceNo, accessControlGroupNoListN).map(new Func1<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>, NetworkInterfaceAccessControlGroupResponse>() {
            @Override
            public NetworkInterfaceAccessControlGroupResponse call(ServiceResponse<NetworkInterfaceAccessControlGroupResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 인터페이스의 ACG를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceAccessControlGroupResponse object
     */
    public Observable<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>> removeACGWithServiceResponseAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkInterfaceNo == null) {
            throw new IllegalArgumentException("Parameter networkInterfaceNo is required and cannot be null.");
        }
        if (accessControlGroupNoListN == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupNoListN is required and cannot be null.");
        }
        final String regionCode = null;
        return service.removeACG(responseFormatType, regionCode, networkInterfaceNo, accessControlGroupNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkInterfaceAccessControlGroupResponse> clientResponse = removeACGDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 네트워크 인터페이스의 ACG를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceAccessControlGroupResponse object if successful.
     */
    public NetworkInterfaceAccessControlGroupResponse removeACG(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, String regionCode) {
        return removeACGWithServiceResponseAsync(responseFormatType, networkInterfaceNo, accessControlGroupNoListN, regionCode).toBlocking().single().body();
    }

    /**
     * 네트워크 인터페이스의 ACG를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkInterfaceAccessControlGroupResponse> removeACGAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, String regionCode, final ServiceCallback<NetworkInterfaceAccessControlGroupResponse> serviceCallback) {
        return ServiceFuture.fromResponse(removeACGWithServiceResponseAsync(responseFormatType, networkInterfaceNo, accessControlGroupNoListN, regionCode), serviceCallback);
    }

    /**
     * 네트워크 인터페이스의 ACG를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceAccessControlGroupResponse object
     */
    public Observable<NetworkInterfaceAccessControlGroupResponse> removeACGAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, String regionCode) {
        return removeACGWithServiceResponseAsync(responseFormatType, networkInterfaceNo, accessControlGroupNoListN, regionCode).map(new Func1<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>, NetworkInterfaceAccessControlGroupResponse>() {
            @Override
            public NetworkInterfaceAccessControlGroupResponse call(ServiceResponse<NetworkInterfaceAccessControlGroupResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 인터페이스의 ACG를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceAccessControlGroupResponse object
     */
    public Observable<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>> removeACGWithServiceResponseAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkInterfaceNo == null) {
            throw new IllegalArgumentException("Parameter networkInterfaceNo is required and cannot be null.");
        }
        if (accessControlGroupNoListN == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupNoListN is required and cannot be null.");
        }
        return service.removeACG(responseFormatType, regionCode, networkInterfaceNo, accessControlGroupNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkInterfaceAccessControlGroupResponse> clientResponse = removeACGDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkInterfaceAccessControlGroupResponse> removeACGDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkInterfaceAccessControlGroupResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkInterfaceAccessControlGroupResponse>() { }.getType())
                .build(response);
    }

}
