/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.implementation;

import retrofit2.Retrofit;
import com.fincloud.vpc.RouteTableSubnets;
import com.fincloud.vpc.models.RouteTableSubnetListResponse;
import com.fincloud.vpc.models.RouteTableSubnetResponse;
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
 * in RouteTableSubnets.
 */
public class RouteTableSubnetsImpl implements RouteTableSubnets {
    /** The Retrofit service to perform REST calls. */
    private RouteTableSubnetsService service;
    /** The service client containing this operation class. */
    private VPCManagementClientImpl client;

    /**
     * Initializes an instance of RouteTableSubnets.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RouteTableSubnetsImpl(Retrofit retrofit, VPCManagementClientImpl client) {
        this.service = retrofit.create(RouteTableSubnetsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for RouteTableSubnets to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RouteTableSubnetsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.RouteTableSubnets getList" })
        @GET("vpc/v2/getRouteTableSubnetList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("routeTableNo") String routeTableNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.RouteTableSubnets add" })
        @POST("vpc/v2/addRouteTableSubnet")
        Observable<Response<ResponseBody>> add(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcNo") String vpcNo, @Query("routeTableNo") String routeTableNo, @Query("subnetNoList.N") String subnetNoListN);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.RouteTableSubnets remove" })
        @POST("vpc/v2/removeRouteTableSubnet")
        Observable<Response<ResponseBody>> remove(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcNo") String vpcNo, @Query("routeTableNo") String routeTableNo, @Query("subnetNoList.N") String subnetNoListN);

    }

    /**
     * 라우트 테이블에 연관된 서브넷 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableSubnetListResponse object if successful.
     */
    public RouteTableSubnetListResponse getList(String responseFormatType, String routeTableNo) {
        return getListWithServiceResponseAsync(responseFormatType, routeTableNo).toBlocking().single().body();
    }

    /**
     * 라우트 테이블에 연관된 서브넷 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteTableSubnetListResponse> getListAsync(String responseFormatType, String routeTableNo, final ServiceCallback<RouteTableSubnetListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, routeTableNo), serviceCallback);
    }

    /**
     * 라우트 테이블에 연관된 서브넷 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetListResponse object
     */
    public Observable<RouteTableSubnetListResponse> getListAsync(String responseFormatType, String routeTableNo) {
        return getListWithServiceResponseAsync(responseFormatType, routeTableNo).map(new Func1<ServiceResponse<RouteTableSubnetListResponse>, RouteTableSubnetListResponse>() {
            @Override
            public RouteTableSubnetListResponse call(ServiceResponse<RouteTableSubnetListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트 테이블에 연관된 서브넷 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetListResponse object
     */
    public Observable<ServiceResponse<RouteTableSubnetListResponse>> getListWithServiceResponseAsync(String responseFormatType, String routeTableNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (routeTableNo == null) {
            throw new IllegalArgumentException("Parameter routeTableNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.getList(responseFormatType, regionCode, routeTableNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteTableSubnetListResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteTableSubnetListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteTableSubnetListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 라우트 테이블에 연관된 서브넷 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableSubnetListResponse object if successful.
     */
    public RouteTableSubnetListResponse getList(String responseFormatType, String routeTableNo, String regionCode) {
        return getListWithServiceResponseAsync(responseFormatType, routeTableNo, regionCode).toBlocking().single().body();
    }

    /**
     * 라우트 테이블에 연관된 서브넷 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteTableSubnetListResponse> getListAsync(String responseFormatType, String routeTableNo, String regionCode, final ServiceCallback<RouteTableSubnetListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, routeTableNo, regionCode), serviceCallback);
    }

    /**
     * 라우트 테이블에 연관된 서브넷 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetListResponse object
     */
    public Observable<RouteTableSubnetListResponse> getListAsync(String responseFormatType, String routeTableNo, String regionCode) {
        return getListWithServiceResponseAsync(responseFormatType, routeTableNo, regionCode).map(new Func1<ServiceResponse<RouteTableSubnetListResponse>, RouteTableSubnetListResponse>() {
            @Override
            public RouteTableSubnetListResponse call(ServiceResponse<RouteTableSubnetListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트 테이블에 연관된 서브넷 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetListResponse object
     */
    public Observable<ServiceResponse<RouteTableSubnetListResponse>> getListWithServiceResponseAsync(String responseFormatType, String routeTableNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (routeTableNo == null) {
            throw new IllegalArgumentException("Parameter routeTableNo is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, routeTableNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteTableSubnetListResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteTableSubnetListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteTableSubnetListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RouteTableSubnetListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RouteTableSubnetListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RouteTableSubnetListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 라우트 테이블의 연관 서브넷을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableSubnetResponse object if successful.
     */
    public RouteTableSubnetResponse add(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN) {
        return addWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, subnetNoListN).toBlocking().single().body();
    }

    /**
     * 라우트 테이블의 연관 서브넷을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteTableSubnetResponse> addAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, final ServiceCallback<RouteTableSubnetResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, subnetNoListN), serviceCallback);
    }

    /**
     * 라우트 테이블의 연관 서브넷을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetResponse object
     */
    public Observable<RouteTableSubnetResponse> addAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN) {
        return addWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, subnetNoListN).map(new Func1<ServiceResponse<RouteTableSubnetResponse>, RouteTableSubnetResponse>() {
            @Override
            public RouteTableSubnetResponse call(ServiceResponse<RouteTableSubnetResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트 테이블의 연관 서브넷을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetResponse object
     */
    public Observable<ServiceResponse<RouteTableSubnetResponse>> addWithServiceResponseAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (routeTableNo == null) {
            throw new IllegalArgumentException("Parameter routeTableNo is required and cannot be null.");
        }
        if (subnetNoListN == null) {
            throw new IllegalArgumentException("Parameter subnetNoListN is required and cannot be null.");
        }
        final String regionCode = null;
        return service.add(responseFormatType, regionCode, vpcNo, routeTableNo, subnetNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteTableSubnetResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteTableSubnetResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteTableSubnetResponse> clientResponse = addDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 라우트 테이블의 연관 서브넷을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableSubnetResponse object if successful.
     */
    public RouteTableSubnetResponse add(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, String regionCode) {
        return addWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, subnetNoListN, regionCode).toBlocking().single().body();
    }

    /**
     * 라우트 테이블의 연관 서브넷을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteTableSubnetResponse> addAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, String regionCode, final ServiceCallback<RouteTableSubnetResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, subnetNoListN, regionCode), serviceCallback);
    }

    /**
     * 라우트 테이블의 연관 서브넷을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetResponse object
     */
    public Observable<RouteTableSubnetResponse> addAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, String regionCode) {
        return addWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, subnetNoListN, regionCode).map(new Func1<ServiceResponse<RouteTableSubnetResponse>, RouteTableSubnetResponse>() {
            @Override
            public RouteTableSubnetResponse call(ServiceResponse<RouteTableSubnetResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트 테이블의 연관 서브넷을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetResponse object
     */
    public Observable<ServiceResponse<RouteTableSubnetResponse>> addWithServiceResponseAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (routeTableNo == null) {
            throw new IllegalArgumentException("Parameter routeTableNo is required and cannot be null.");
        }
        if (subnetNoListN == null) {
            throw new IllegalArgumentException("Parameter subnetNoListN is required and cannot be null.");
        }
        return service.add(responseFormatType, regionCode, vpcNo, routeTableNo, subnetNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteTableSubnetResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteTableSubnetResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteTableSubnetResponse> clientResponse = addDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RouteTableSubnetResponse> addDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RouteTableSubnetResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RouteTableSubnetResponse>() { }.getType())
                .build(response);
    }

    /**
     * 라우트 테이블의 연관 서브넷을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableSubnetResponse object if successful.
     */
    public RouteTableSubnetResponse remove(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN) {
        return removeWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, subnetNoListN).toBlocking().single().body();
    }

    /**
     * 라우트 테이블의 연관 서브넷을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteTableSubnetResponse> removeAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, final ServiceCallback<RouteTableSubnetResponse> serviceCallback) {
        return ServiceFuture.fromResponse(removeWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, subnetNoListN), serviceCallback);
    }

    /**
     * 라우트 테이블의 연관 서브넷을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetResponse object
     */
    public Observable<RouteTableSubnetResponse> removeAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN) {
        return removeWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, subnetNoListN).map(new Func1<ServiceResponse<RouteTableSubnetResponse>, RouteTableSubnetResponse>() {
            @Override
            public RouteTableSubnetResponse call(ServiceResponse<RouteTableSubnetResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트 테이블의 연관 서브넷을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetResponse object
     */
    public Observable<ServiceResponse<RouteTableSubnetResponse>> removeWithServiceResponseAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (routeTableNo == null) {
            throw new IllegalArgumentException("Parameter routeTableNo is required and cannot be null.");
        }
        if (subnetNoListN == null) {
            throw new IllegalArgumentException("Parameter subnetNoListN is required and cannot be null.");
        }
        final String regionCode = null;
        return service.remove(responseFormatType, regionCode, vpcNo, routeTableNo, subnetNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteTableSubnetResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteTableSubnetResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteTableSubnetResponse> clientResponse = removeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 라우트 테이블의 연관 서브넷을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableSubnetResponse object if successful.
     */
    public RouteTableSubnetResponse remove(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, String regionCode) {
        return removeWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, subnetNoListN, regionCode).toBlocking().single().body();
    }

    /**
     * 라우트 테이블의 연관 서브넷을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RouteTableSubnetResponse> removeAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, String regionCode, final ServiceCallback<RouteTableSubnetResponse> serviceCallback) {
        return ServiceFuture.fromResponse(removeWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, subnetNoListN, regionCode), serviceCallback);
    }

    /**
     * 라우트 테이블의 연관 서브넷을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetResponse object
     */
    public Observable<RouteTableSubnetResponse> removeAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, String regionCode) {
        return removeWithServiceResponseAsync(responseFormatType, vpcNo, routeTableNo, subnetNoListN, regionCode).map(new Func1<ServiceResponse<RouteTableSubnetResponse>, RouteTableSubnetResponse>() {
            @Override
            public RouteTableSubnetResponse call(ServiceResponse<RouteTableSubnetResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 라우트 테이블의 연관 서브넷을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetResponse object
     */
    public Observable<ServiceResponse<RouteTableSubnetResponse>> removeWithServiceResponseAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (routeTableNo == null) {
            throw new IllegalArgumentException("Parameter routeTableNo is required and cannot be null.");
        }
        if (subnetNoListN == null) {
            throw new IllegalArgumentException("Parameter subnetNoListN is required and cannot be null.");
        }
        return service.remove(responseFormatType, regionCode, vpcNo, routeTableNo, subnetNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RouteTableSubnetResponse>>>() {
                @Override
                public Observable<ServiceResponse<RouteTableSubnetResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RouteTableSubnetResponse> clientResponse = removeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RouteTableSubnetResponse> removeDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RouteTableSubnetResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RouteTableSubnetResponse>() { }.getType())
                .build(response);
    }

}
