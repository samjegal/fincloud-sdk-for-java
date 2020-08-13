/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.implementation;

import retrofit2.Retrofit;
import com.fincloud.vpc.RouteTables;
import com.fincloud.vpc.models.RouteTableDetailResponse;
import com.fincloud.vpc.models.RouteTableListResponse;
import com.fincloud.vpc.models.RouteTableResponse;
import com.fincloud.vpc.models.SortingOrder;
import com.fincloud.vpc.models.SupportedSubnetTypeCode;
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
 * in RouteTables.
 */
public class RouteTablesImpl implements RouteTables {
    /** The Retrofit service to perform REST calls. */
    private RouteTablesService service;
    /** The service client containing this operation class. */
    private VPCManagementClientImpl client;

    /**
     * Initializes an instance of RouteTables.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RouteTablesImpl(Retrofit retrofit, VPCManagementClientImpl client) {
        this.service = retrofit.create(RouteTablesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for RouteTables to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RouteTablesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.RouteTables getList" })
        @GET("vpc/v2/getRouteTableList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("routeTableNoList.N") String routeTableNoListN, @Query("routeTableName") String routeTableName, @Query("supportedSubnetTypeCode") SupportedSubnetTypeCode supportedSubnetTypeCode1, @Query("pageNo") String pageNo, @Query("pageSize") String pageSize, @Query("sortedBy") String sortedBy1, @Query("sortingOrder") SortingOrder sortingOrder1, @Query("vpcNo") String vpcNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.RouteTables getDetail" })
        @GET("vpc/v2/getRouteTableDetail")
        Observable<Response<ResponseBody>> getDetail(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("routeTableNo") String routeTableNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.RouteTables create" })
        @POST("vpc/v2/createRouteTable")
        Observable<Response<ResponseBody>> create(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcNo") String vpcNo, @Query("routeTableName") String routeTableName, @Query("supportedSubnetTypeCode") SupportedSubnetTypeCode supportedSubnetTypeCode1, @Query("routeTableDescription") String routeTableDescription);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.RouteTables delete" })
        @POST("vpc/v2/deleteRouteTable")
        Observable<Response<ResponseBody>> delete(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("routeTableNo") String routeTableNo);

    }

    /**
     * 라우트 테이블 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableListResponse object if successful.
     */
    public RouteTableListResponse getList(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 라우트 테이블 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteTableListResponse> getListAsync(String responseFormatType, final ServiceCallback<RouteTableListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 라우트 테이블 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableListResponse object
     */
    public Observable<RouteTableListResponse> getListAsync(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<RouteTableListResponse>, RouteTableListResponse>() {
            @Override
            public RouteTableListResponse call(ServiceResponse<RouteTableListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트 테이블 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableListResponse object
     */
    public Observable<ServiceResponse<RouteTableListResponse>> getListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String routeTableNoListN = null;
        final String routeTableName = null;
        final SupportedSubnetTypeCode supportedSubnetTypeCode = null;
        final String pageNo = null;
        final String pageSize = null;
        final String sortedBy = null;
        final SortingOrder sortingOrder = null;
        final String vpcNo = null;
        return service.getList(responseFormatType, regionCode, routeTableNoListN, routeTableName, supportedSubnetTypeCode, pageNo, pageSize, sortedBy, sortingOrder, vpcNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteTableListResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteTableListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteTableListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 라우트 테이블 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param routeTableNoListN 라우트 테이블 번호 리스트
     * @param routeTableName 라우트 테이블 이름
     * @param supportedSubnetTypeCode 지원하는 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableListResponse object if successful.
     */
    public RouteTableListResponse getList(String responseFormatType, String regionCode, String routeTableNoListN, String routeTableName, SupportedSubnetTypeCode supportedSubnetTypeCode, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, String vpcNo) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, routeTableNoListN, routeTableName, supportedSubnetTypeCode, pageNo, pageSize, sortedBy, sortingOrder, vpcNo).toBlocking().single().body();
    }

    /**
     * 라우트 테이블 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param routeTableNoListN 라우트 테이블 번호 리스트
     * @param routeTableName 라우트 테이블 이름
     * @param supportedSubnetTypeCode 지원하는 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteTableListResponse> getListAsync(String responseFormatType, String regionCode, String routeTableNoListN, String routeTableName, SupportedSubnetTypeCode supportedSubnetTypeCode, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, String vpcNo, final ServiceCallback<RouteTableListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, regionCode, routeTableNoListN, routeTableName, supportedSubnetTypeCode, pageNo, pageSize, sortedBy, sortingOrder, vpcNo), serviceCallback);
    }

    /**
     * 라우트 테이블 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param routeTableNoListN 라우트 테이블 번호 리스트
     * @param routeTableName 라우트 테이블 이름
     * @param supportedSubnetTypeCode 지원하는 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableListResponse object
     */
    public Observable<RouteTableListResponse> getListAsync(String responseFormatType, String regionCode, String routeTableNoListN, String routeTableName, SupportedSubnetTypeCode supportedSubnetTypeCode, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, String vpcNo) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, routeTableNoListN, routeTableName, supportedSubnetTypeCode, pageNo, pageSize, sortedBy, sortingOrder, vpcNo).map(new Func1<ServiceResponse<RouteTableListResponse>, RouteTableListResponse>() {
            @Override
            public RouteTableListResponse call(ServiceResponse<RouteTableListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트 테이블 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param routeTableNoListN 라우트 테이블 번호 리스트
     * @param routeTableName 라우트 테이블 이름
     * @param supportedSubnetTypeCode 지원하는 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableListResponse object
     */
    public Observable<ServiceResponse<RouteTableListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String routeTableNoListN, String routeTableName, SupportedSubnetTypeCode supportedSubnetTypeCode, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, String vpcNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, routeTableNoListN, routeTableName, supportedSubnetTypeCode, pageNo, pageSize, sortedBy, sortingOrder, vpcNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteTableListResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteTableListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteTableListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RouteTableListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RouteTableListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RouteTableListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 라우트 테이블 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableDetailResponse object if successful.
     */
    public RouteTableDetailResponse getDetail(String responseFormatType, String routeTableNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, routeTableNo).toBlocking().single().body();
    }

    /**
     * 라우트 테이블 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteTableDetailResponse> getDetailAsync(String responseFormatType, String routeTableNo, final ServiceCallback<RouteTableDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, routeTableNo), serviceCallback);
    }

    /**
     * 라우트 테이블 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableDetailResponse object
     */
    public Observable<RouteTableDetailResponse> getDetailAsync(String responseFormatType, String routeTableNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, routeTableNo).map(new Func1<ServiceResponse<RouteTableDetailResponse>, RouteTableDetailResponse>() {
            @Override
            public RouteTableDetailResponse call(ServiceResponse<RouteTableDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트 테이블 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableDetailResponse object
     */
    public Observable<ServiceResponse<RouteTableDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String routeTableNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (routeTableNo == null) {
            throw new IllegalArgumentException("Parameter routeTableNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.getDetail(responseFormatType, regionCode, routeTableNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteTableDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteTableDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteTableDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 라우트 테이블 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableDetailResponse object if successful.
     */
    public RouteTableDetailResponse getDetail(String responseFormatType, String routeTableNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, routeTableNo, regionCode).toBlocking().single().body();
    }

    /**
     * 라우트 테이블 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteTableDetailResponse> getDetailAsync(String responseFormatType, String routeTableNo, String regionCode, final ServiceCallback<RouteTableDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, routeTableNo, regionCode), serviceCallback);
    }

    /**
     * 라우트 테이블 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableDetailResponse object
     */
    public Observable<RouteTableDetailResponse> getDetailAsync(String responseFormatType, String routeTableNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, routeTableNo, regionCode).map(new Func1<ServiceResponse<RouteTableDetailResponse>, RouteTableDetailResponse>() {
            @Override
            public RouteTableDetailResponse call(ServiceResponse<RouteTableDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트 테이블 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableDetailResponse object
     */
    public Observable<ServiceResponse<RouteTableDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String routeTableNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (routeTableNo == null) {
            throw new IllegalArgumentException("Parameter routeTableNo is required and cannot be null.");
        }
        return service.getDetail(responseFormatType, regionCode, routeTableNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteTableDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteTableDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteTableDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RouteTableDetailResponse> getDetailDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RouteTableDetailResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RouteTableDetailResponse>() { }.getType())
                .build(response);
    }

    /**
     * 라우트 테이블을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableResponse object if successful.
     */
    public RouteTableResponse create(String responseFormatType, String vpcNo) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo).toBlocking().single().body();
    }

    /**
     * 라우트 테이블을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteTableResponse> createAsync(String responseFormatType, String vpcNo, final ServiceCallback<RouteTableResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, vpcNo), serviceCallback);
    }

    /**
     * 라우트 테이블을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableResponse object
     */
    public Observable<RouteTableResponse> createAsync(String responseFormatType, String vpcNo) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo).map(new Func1<ServiceResponse<RouteTableResponse>, RouteTableResponse>() {
            @Override
            public RouteTableResponse call(ServiceResponse<RouteTableResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트 테이블을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableResponse object
     */
    public Observable<ServiceResponse<RouteTableResponse>> createWithServiceResponseAsync(String responseFormatType, String vpcNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        final String regionCode = null;
        final String routeTableName = null;
        final SupportedSubnetTypeCode supportedSubnetTypeCode = null;
        final String routeTableDescription = null;
        return service.create(responseFormatType, regionCode, vpcNo, routeTableName, supportedSubnetTypeCode, routeTableDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteTableResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteTableResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteTableResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 라우트 테이블을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param routeTableName 라우트 테이블 이름
     * @param supportedSubnetTypeCode 지원하는 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param routeTableDescription 라우트 테이블 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableResponse object if successful.
     */
    public RouteTableResponse create(String responseFormatType, String vpcNo, String regionCode, String routeTableName, SupportedSubnetTypeCode supportedSubnetTypeCode, String routeTableDescription) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo, regionCode, routeTableName, supportedSubnetTypeCode, routeTableDescription).toBlocking().single().body();
    }

    /**
     * 라우트 테이블을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param routeTableName 라우트 테이블 이름
     * @param supportedSubnetTypeCode 지원하는 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param routeTableDescription 라우트 테이블 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteTableResponse> createAsync(String responseFormatType, String vpcNo, String regionCode, String routeTableName, SupportedSubnetTypeCode supportedSubnetTypeCode, String routeTableDescription, final ServiceCallback<RouteTableResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, vpcNo, regionCode, routeTableName, supportedSubnetTypeCode, routeTableDescription), serviceCallback);
    }

    /**
     * 라우트 테이블을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param routeTableName 라우트 테이블 이름
     * @param supportedSubnetTypeCode 지원하는 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param routeTableDescription 라우트 테이블 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableResponse object
     */
    public Observable<RouteTableResponse> createAsync(String responseFormatType, String vpcNo, String regionCode, String routeTableName, SupportedSubnetTypeCode supportedSubnetTypeCode, String routeTableDescription) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo, regionCode, routeTableName, supportedSubnetTypeCode, routeTableDescription).map(new Func1<ServiceResponse<RouteTableResponse>, RouteTableResponse>() {
            @Override
            public RouteTableResponse call(ServiceResponse<RouteTableResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트 테이블을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param routeTableName 라우트 테이블 이름
     * @param supportedSubnetTypeCode 지원하는 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param routeTableDescription 라우트 테이블 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableResponse object
     */
    public Observable<ServiceResponse<RouteTableResponse>> createWithServiceResponseAsync(String responseFormatType, String vpcNo, String regionCode, String routeTableName, SupportedSubnetTypeCode supportedSubnetTypeCode, String routeTableDescription) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        return service.create(responseFormatType, regionCode, vpcNo, routeTableName, supportedSubnetTypeCode, routeTableDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteTableResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteTableResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteTableResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RouteTableResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RouteTableResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RouteTableResponse>() { }.getType())
                .build(response);
    }

    /**
     * 라우트 테이블을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableResponse object if successful.
     */
    public RouteTableResponse delete(String responseFormatType, String routeTableNo) {
        return deleteWithServiceResponseAsync(responseFormatType, routeTableNo).toBlocking().single().body();
    }

    /**
     * 라우트 테이블을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteTableResponse> deleteAsync(String responseFormatType, String routeTableNo, final ServiceCallback<RouteTableResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, routeTableNo), serviceCallback);
    }

    /**
     * 라우트 테이블을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableResponse object
     */
    public Observable<RouteTableResponse> deleteAsync(String responseFormatType, String routeTableNo) {
        return deleteWithServiceResponseAsync(responseFormatType, routeTableNo).map(new Func1<ServiceResponse<RouteTableResponse>, RouteTableResponse>() {
            @Override
            public RouteTableResponse call(ServiceResponse<RouteTableResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트 테이블을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableResponse object
     */
    public Observable<ServiceResponse<RouteTableResponse>> deleteWithServiceResponseAsync(String responseFormatType, String routeTableNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (routeTableNo == null) {
            throw new IllegalArgumentException("Parameter routeTableNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.delete(responseFormatType, regionCode, routeTableNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteTableResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteTableResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteTableResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 라우트 테이블을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableResponse object if successful.
     */
    public RouteTableResponse delete(String responseFormatType, String routeTableNo, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, routeTableNo, regionCode).toBlocking().single().body();
    }

    /**
     * 라우트 테이블을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteTableResponse> deleteAsync(String responseFormatType, String routeTableNo, String regionCode, final ServiceCallback<RouteTableResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, routeTableNo, regionCode), serviceCallback);
    }

    /**
     * 라우트 테이블을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableResponse object
     */
    public Observable<RouteTableResponse> deleteAsync(String responseFormatType, String routeTableNo, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, routeTableNo, regionCode).map(new Func1<ServiceResponse<RouteTableResponse>, RouteTableResponse>() {
            @Override
            public RouteTableResponse call(ServiceResponse<RouteTableResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트 테이블을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableResponse object
     */
    public Observable<ServiceResponse<RouteTableResponse>> deleteWithServiceResponseAsync(String responseFormatType, String routeTableNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (routeTableNo == null) {
            throw new IllegalArgumentException("Parameter routeTableNo is required and cannot be null.");
        }
        return service.delete(responseFormatType, regionCode, routeTableNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteTableResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteTableResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteTableResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RouteTableResponse> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RouteTableResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RouteTableResponse>() { }.getType())
                .build(response);
    }

}
