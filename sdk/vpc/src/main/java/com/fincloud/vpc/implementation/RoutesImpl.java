/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.implementation;

import retrofit2.Retrofit;
import com.fincloud.vpc.Routes;
import com.fincloud.vpc.models.RouteListResponse;
import com.fincloud.vpc.models.RouteResponse;
import com.fincloud.vpc.models.TargetTypeCode;
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
 * in Routes.
 */
public class RoutesImpl implements Routes {
    /** The Retrofit service to perform REST calls. */
    private RoutesService service;
    /** The service client containing this operation class. */
    private VPCManagementClientImpl client;

    /**
     * Initializes an instance of Routes.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RoutesImpl(Retrofit retrofit, VPCManagementClientImpl client) {
        this.service = retrofit.create(RoutesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Routes to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RoutesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.Routes getList" })
        @GET("vpc/v2/getRouteList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("routeTableNo") String routeTableNo, @Query("vpcNo") String vpcNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.Routes add" })
        @POST("vpc/v2/addRoute")
        Observable<Response<ResponseBody>> add(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcNo") String vpcNo, @Query("routeTableNo") String routeTableNo, @Query("routeList.N.destinationCidrBlock") String routeListNdestinationCidrBlock, @Query("routeList.N.targetTypeCode") TargetTypeCode routeListNtargetTypeCode, @Query("routeList.N.targetNo") String routeListNtargetNo, @Query("routeList.N.targetName") String routeListNtargetName);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.Routes remove" })
        @POST("vpc/v2/removeRoute")
        Observable<Response<ResponseBody>> remove(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcNo") String vpcNo, @Query("routeTableNo") String routeTableNo, @Query("routeList.N.destinationCidrBlock") String routeListNdestinationCidrBlock, @Query("routeList.N.targetTypeCode") TargetTypeCode routeListNtargetTypeCode, @Query("routeList.N.targetNo") String routeListNtargetNo, @Query("routeList.N.targetName") String routeListNtargetName);

    }

    /**
     * 라우트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteListResponse object if successful.
     */
    public RouteListResponse getList(String responseFormatType, String routeTableNo, String vpcNo) {
        return getListWithServiceResponseAsync(responseFormatType, routeTableNo, vpcNo).toBlocking().single().body();
    }

    /**
     * 라우트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteListResponse> getListAsync(String responseFormatType, String routeTableNo, String vpcNo, final ServiceCallback<RouteListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, routeTableNo, vpcNo), serviceCallback);
    }

    /**
     * 라우트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteListResponse object
     */
    public Observable<RouteListResponse> getListAsync(String responseFormatType, String routeTableNo, String vpcNo) {
        return getListWithServiceResponseAsync(responseFormatType, routeTableNo, vpcNo).map(new Func1<ServiceResponse<RouteListResponse>, RouteListResponse>() {
            @Override
            public RouteListResponse call(ServiceResponse<RouteListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteListResponse object
     */
    public Observable<ServiceResponse<RouteListResponse>> getListWithServiceResponseAsync(String responseFormatType, String routeTableNo, String vpcNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (routeTableNo == null) {
            throw new IllegalArgumentException("Parameter routeTableNo is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.getList(responseFormatType, regionCode, routeTableNo, vpcNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteListResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 라우트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteListResponse object if successful.
     */
    public RouteListResponse getList(String responseFormatType, String routeTableNo, String vpcNo, String regionCode) {
        return getListWithServiceResponseAsync(responseFormatType, routeTableNo, vpcNo, regionCode).toBlocking().single().body();
    }

    /**
     * 라우트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteListResponse> getListAsync(String responseFormatType, String routeTableNo, String vpcNo, String regionCode, final ServiceCallback<RouteListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, routeTableNo, vpcNo, regionCode), serviceCallback);
    }

    /**
     * 라우트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteListResponse object
     */
    public Observable<RouteListResponse> getListAsync(String responseFormatType, String routeTableNo, String vpcNo, String regionCode) {
        return getListWithServiceResponseAsync(responseFormatType, routeTableNo, vpcNo, regionCode).map(new Func1<ServiceResponse<RouteListResponse>, RouteListResponse>() {
            @Override
            public RouteListResponse call(ServiceResponse<RouteListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteListResponse object
     */
    public Observable<ServiceResponse<RouteListResponse>> getListWithServiceResponseAsync(String responseFormatType, String routeTableNo, String vpcNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (routeTableNo == null) {
            throw new IllegalArgumentException("Parameter routeTableNo is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, routeTableNo, vpcNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteListResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RouteListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RouteListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RouteListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 라우트를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteResponse object if successful.
     */
    public RouteResponse add(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName) {
        return addWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, routeListNdestinationCidrBlock, routeListNtargetTypeCode, routeListNtargetNo, routeListNtargetName).toBlocking().single().body();
    }

    /**
     * 라우트를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteResponse> addAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, final ServiceCallback<RouteResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, routeListNdestinationCidrBlock, routeListNtargetTypeCode, routeListNtargetNo, routeListNtargetName), serviceCallback);
    }

    /**
     * 라우트를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteResponse object
     */
    public Observable<RouteResponse> addAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName) {
        return addWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, routeListNdestinationCidrBlock, routeListNtargetTypeCode, routeListNtargetNo, routeListNtargetName).map(new Func1<ServiceResponse<RouteResponse>, RouteResponse>() {
            @Override
            public RouteResponse call(ServiceResponse<RouteResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteResponse object
     */
    public Observable<ServiceResponse<RouteResponse>> addWithServiceResponseAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (routeTableNo == null) {
            throw new IllegalArgumentException("Parameter routeTableNo is required and cannot be null.");
        }
        if (routeListNdestinationCidrBlock == null) {
            throw new IllegalArgumentException("Parameter routeListNdestinationCidrBlock is required and cannot be null.");
        }
        if (routeListNtargetTypeCode == null) {
            throw new IllegalArgumentException("Parameter routeListNtargetTypeCode is required and cannot be null.");
        }
        if (routeListNtargetNo == null) {
            throw new IllegalArgumentException("Parameter routeListNtargetNo is required and cannot be null.");
        }
        if (routeListNtargetName == null) {
            throw new IllegalArgumentException("Parameter routeListNtargetName is required and cannot be null.");
        }
        final String regionCode = null;
        return service.add(responseFormatType, regionCode, vpcNo, routeTableNo, routeListNdestinationCidrBlock, routeListNtargetTypeCode, routeListNtargetNo, routeListNtargetName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteResponse> clientResponse = addDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 라우트를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteResponse object if successful.
     */
    public RouteResponse add(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, String regionCode) {
        return addWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, routeListNdestinationCidrBlock, routeListNtargetTypeCode, routeListNtargetNo, routeListNtargetName, regionCode).toBlocking().single().body();
    }

    /**
     * 라우트를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteResponse> addAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, String regionCode, final ServiceCallback<RouteResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, routeListNdestinationCidrBlock, routeListNtargetTypeCode, routeListNtargetNo, routeListNtargetName, regionCode), serviceCallback);
    }

    /**
     * 라우트를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteResponse object
     */
    public Observable<RouteResponse> addAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, String regionCode) {
        return addWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, routeListNdestinationCidrBlock, routeListNtargetTypeCode, routeListNtargetNo, routeListNtargetName, regionCode).map(new Func1<ServiceResponse<RouteResponse>, RouteResponse>() {
            @Override
            public RouteResponse call(ServiceResponse<RouteResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteResponse object
     */
    public Observable<ServiceResponse<RouteResponse>> addWithServiceResponseAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (routeTableNo == null) {
            throw new IllegalArgumentException("Parameter routeTableNo is required and cannot be null.");
        }
        if (routeListNdestinationCidrBlock == null) {
            throw new IllegalArgumentException("Parameter routeListNdestinationCidrBlock is required and cannot be null.");
        }
        if (routeListNtargetTypeCode == null) {
            throw new IllegalArgumentException("Parameter routeListNtargetTypeCode is required and cannot be null.");
        }
        if (routeListNtargetNo == null) {
            throw new IllegalArgumentException("Parameter routeListNtargetNo is required and cannot be null.");
        }
        if (routeListNtargetName == null) {
            throw new IllegalArgumentException("Parameter routeListNtargetName is required and cannot be null.");
        }
        return service.add(responseFormatType, regionCode, vpcNo, routeTableNo, routeListNdestinationCidrBlock, routeListNtargetTypeCode, routeListNtargetNo, routeListNtargetName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteResponse> clientResponse = addDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RouteResponse> addDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RouteResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RouteResponse>() { }.getType())
                .build(response);
    }

    /**
     * 라우트를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteResponse object if successful.
     */
    public RouteResponse remove(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName) {
        return removeWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, routeListNdestinationCidrBlock, routeListNtargetTypeCode, routeListNtargetNo, routeListNtargetName).toBlocking().single().body();
    }

    /**
     * 라우트를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteResponse> removeAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, final ServiceCallback<RouteResponse> serviceCallback) {
        return ServiceFuture.fromResponse(removeWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, routeListNdestinationCidrBlock, routeListNtargetTypeCode, routeListNtargetNo, routeListNtargetName), serviceCallback);
    }

    /**
     * 라우트를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteResponse object
     */
    public Observable<RouteResponse> removeAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName) {
        return removeWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, routeListNdestinationCidrBlock, routeListNtargetTypeCode, routeListNtargetNo, routeListNtargetName).map(new Func1<ServiceResponse<RouteResponse>, RouteResponse>() {
            @Override
            public RouteResponse call(ServiceResponse<RouteResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteResponse object
     */
    public Observable<ServiceResponse<RouteResponse>> removeWithServiceResponseAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (routeTableNo == null) {
            throw new IllegalArgumentException("Parameter routeTableNo is required and cannot be null.");
        }
        if (routeListNdestinationCidrBlock == null) {
            throw new IllegalArgumentException("Parameter routeListNdestinationCidrBlock is required and cannot be null.");
        }
        if (routeListNtargetTypeCode == null) {
            throw new IllegalArgumentException("Parameter routeListNtargetTypeCode is required and cannot be null.");
        }
        if (routeListNtargetNo == null) {
            throw new IllegalArgumentException("Parameter routeListNtargetNo is required and cannot be null.");
        }
        if (routeListNtargetName == null) {
            throw new IllegalArgumentException("Parameter routeListNtargetName is required and cannot be null.");
        }
        final String regionCode = null;
        return service.remove(responseFormatType, regionCode, vpcNo, routeTableNo, routeListNdestinationCidrBlock, routeListNtargetTypeCode, routeListNtargetNo, routeListNtargetName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteResponse> clientResponse = removeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 라우트를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteResponse object if successful.
     */
    public RouteResponse remove(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, String regionCode) {
        return removeWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, routeListNdestinationCidrBlock, routeListNtargetTypeCode, routeListNtargetNo, routeListNtargetName, regionCode).toBlocking().single().body();
    }

    /**
     * 라우트를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteResponse> removeAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, String regionCode, final ServiceCallback<RouteResponse> serviceCallback) {
        return ServiceFuture.fromResponse(removeWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, routeListNdestinationCidrBlock, routeListNtargetTypeCode, routeListNtargetNo, routeListNtargetName, regionCode), serviceCallback);
    }

    /**
     * 라우트를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteResponse object
     */
    public Observable<RouteResponse> removeAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, String regionCode) {
        return removeWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, routeListNdestinationCidrBlock, routeListNtargetTypeCode, routeListNtargetNo, routeListNtargetName, regionCode).map(new Func1<ServiceResponse<RouteResponse>, RouteResponse>() {
            @Override
            public RouteResponse call(ServiceResponse<RouteResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteResponse object
     */
    public Observable<ServiceResponse<RouteResponse>> removeWithServiceResponseAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (routeTableNo == null) {
            throw new IllegalArgumentException("Parameter routeTableNo is required and cannot be null.");
        }
        if (routeListNdestinationCidrBlock == null) {
            throw new IllegalArgumentException("Parameter routeListNdestinationCidrBlock is required and cannot be null.");
        }
        if (routeListNtargetTypeCode == null) {
            throw new IllegalArgumentException("Parameter routeListNtargetTypeCode is required and cannot be null.");
        }
        if (routeListNtargetNo == null) {
            throw new IllegalArgumentException("Parameter routeListNtargetNo is required and cannot be null.");
        }
        if (routeListNtargetName == null) {
            throw new IllegalArgumentException("Parameter routeListNtargetName is required and cannot be null.");
        }
        return service.remove(responseFormatType, regionCode, vpcNo, routeTableNo, routeListNdestinationCidrBlock, routeListNtargetTypeCode, routeListNtargetNo, routeListNtargetName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteResponse> clientResponse = removeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RouteResponse> removeDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RouteResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RouteResponse>() { }.getType())
                .build(response);
    }

}
