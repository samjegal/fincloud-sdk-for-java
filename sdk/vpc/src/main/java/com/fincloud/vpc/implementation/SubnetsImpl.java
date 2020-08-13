/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.implementation;

import retrofit2.Retrofit;
import com.fincloud.vpc.Subnets;
import com.fincloud.vpc.models.SubnetDetailResponse;
import com.fincloud.vpc.models.SubnetListResponse;
import com.fincloud.vpc.models.SubnetResponse;
import com.fincloud.vpc.models.SubnetStatusCode;
import com.fincloud.vpc.models.SubnetTypeCode;
import com.fincloud.vpc.models.UsageTypeCode;
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
 * in Subnets.
 */
public class SubnetsImpl implements Subnets {
    /** The Retrofit service to perform REST calls. */
    private SubnetsService service;
    /** The service client containing this operation class. */
    private VPCManagementClientImpl client;

    /**
     * Initializes an instance of Subnets.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SubnetsImpl(Retrofit retrofit, VPCManagementClientImpl client) {
        this.service = retrofit.create(SubnetsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Subnets to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SubnetsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.Subnets getList" })
        @GET("vpc/v2/getSubnetList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("subnetNoList.N") String subnetNoListN, @Query("subnetName") String subnetName, @Query("subnet") String subnet, @Query("subnetTypeCode") SubnetTypeCode subnetTypeCode1, @Query("usageTypeCode") UsageTypeCode usageTypeCode1, @Query("networkAclNo") String networkAclNo, @Query("pageNo") String pageNo, @Query("pageSize") String pageSize, @Query("subnetStatusCode") SubnetStatusCode subnetStatusCode1, @Query("vpcNo") String vpcNo, @Query("zoneCode") String zoneCode);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.Subnets getDetail" })
        @GET("vpc/v2/getSubnetDetail")
        Observable<Response<ResponseBody>> getDetail(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("subnetNo") String subnetNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.Subnets create" })
        @POST("vpc/v2/createSubnet")
        Observable<Response<ResponseBody>> create(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("zoneCode") String zoneCode, @Query("vpcNo") String vpcNo, @Query("subnetName") String subnetName, @Query("subnet") String subnet, @Query("networkAclNo") String networkAclNo, @Query("subnetTypeCode") SubnetTypeCode subnetTypeCode1, @Query("usageTypeCode") UsageTypeCode usageTypeCode1);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.Subnets delete" })
        @POST("vpc/v2/deleteSubnet")
        Observable<Response<ResponseBody>> delete(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("subnetNo") String subnetNo);

    }

    /**
     * Subnet 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetListResponse object if successful.
     */
    public SubnetListResponse getList(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * Subnet 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SubnetListResponse> getListAsync(String responseFormatType, final ServiceCallback<SubnetListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * Subnet 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetListResponse object
     */
    public Observable<SubnetListResponse> getListAsync(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<SubnetListResponse>, SubnetListResponse>() {
            @Override
            public SubnetListResponse call(ServiceResponse<SubnetListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Subnet 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetListResponse object
     */
    public Observable<ServiceResponse<SubnetListResponse>> getListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String subnetNoListN = null;
        final String subnetName = null;
        final String subnet = null;
        final SubnetTypeCode subnetTypeCode = null;
        final UsageTypeCode usageTypeCode = null;
        final String networkAclNo = null;
        final String pageNo = null;
        final String pageSize = null;
        final SubnetStatusCode subnetStatusCode = null;
        final String vpcNo = null;
        final String zoneCode = null;
        return service.getList(responseFormatType, regionCode, subnetNoListN, subnetName, subnet, subnetTypeCode, usageTypeCode, networkAclNo, pageNo, pageSize, subnetStatusCode, vpcNo, zoneCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SubnetListResponse>>>() {
                @Override
                public Observable<ServiceResponse<SubnetListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SubnetListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Subnet 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param subnetNoListN 서브넷 번호 리스트
     * @param subnetName 서브넷 이름
     * @param subnet 서브넷
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param usageTypeCode 용도 유형 코드. Possible values include: 'GEN', 'LOADB', 'BM'
     * @param networkAclNo 네트워크 ACL 번호
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param subnetStatusCode 서브넷 상태 코드. Possible values include: 'INIT', 'CREATING', 'RUN', 'TERMTING'
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetListResponse object if successful.
     */
    public SubnetListResponse getList(String responseFormatType, String regionCode, String subnetNoListN, String subnetName, String subnet, SubnetTypeCode subnetTypeCode, UsageTypeCode usageTypeCode, String networkAclNo, String pageNo, String pageSize, SubnetStatusCode subnetStatusCode, String vpcNo, String zoneCode) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, subnetNoListN, subnetName, subnet, subnetTypeCode, usageTypeCode, networkAclNo, pageNo, pageSize, subnetStatusCode, vpcNo, zoneCode).toBlocking().single().body();
    }

    /**
     * Subnet 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param subnetNoListN 서브넷 번호 리스트
     * @param subnetName 서브넷 이름
     * @param subnet 서브넷
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param usageTypeCode 용도 유형 코드. Possible values include: 'GEN', 'LOADB', 'BM'
     * @param networkAclNo 네트워크 ACL 번호
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param subnetStatusCode 서브넷 상태 코드. Possible values include: 'INIT', 'CREATING', 'RUN', 'TERMTING'
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SubnetListResponse> getListAsync(String responseFormatType, String regionCode, String subnetNoListN, String subnetName, String subnet, SubnetTypeCode subnetTypeCode, UsageTypeCode usageTypeCode, String networkAclNo, String pageNo, String pageSize, SubnetStatusCode subnetStatusCode, String vpcNo, String zoneCode, final ServiceCallback<SubnetListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, regionCode, subnetNoListN, subnetName, subnet, subnetTypeCode, usageTypeCode, networkAclNo, pageNo, pageSize, subnetStatusCode, vpcNo, zoneCode), serviceCallback);
    }

    /**
     * Subnet 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param subnetNoListN 서브넷 번호 리스트
     * @param subnetName 서브넷 이름
     * @param subnet 서브넷
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param usageTypeCode 용도 유형 코드. Possible values include: 'GEN', 'LOADB', 'BM'
     * @param networkAclNo 네트워크 ACL 번호
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param subnetStatusCode 서브넷 상태 코드. Possible values include: 'INIT', 'CREATING', 'RUN', 'TERMTING'
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetListResponse object
     */
    public Observable<SubnetListResponse> getListAsync(String responseFormatType, String regionCode, String subnetNoListN, String subnetName, String subnet, SubnetTypeCode subnetTypeCode, UsageTypeCode usageTypeCode, String networkAclNo, String pageNo, String pageSize, SubnetStatusCode subnetStatusCode, String vpcNo, String zoneCode) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, subnetNoListN, subnetName, subnet, subnetTypeCode, usageTypeCode, networkAclNo, pageNo, pageSize, subnetStatusCode, vpcNo, zoneCode).map(new Func1<ServiceResponse<SubnetListResponse>, SubnetListResponse>() {
            @Override
            public SubnetListResponse call(ServiceResponse<SubnetListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Subnet 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param subnetNoListN 서브넷 번호 리스트
     * @param subnetName 서브넷 이름
     * @param subnet 서브넷
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param usageTypeCode 용도 유형 코드. Possible values include: 'GEN', 'LOADB', 'BM'
     * @param networkAclNo 네트워크 ACL 번호
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param subnetStatusCode 서브넷 상태 코드. Possible values include: 'INIT', 'CREATING', 'RUN', 'TERMTING'
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetListResponse object
     */
    public Observable<ServiceResponse<SubnetListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String subnetNoListN, String subnetName, String subnet, SubnetTypeCode subnetTypeCode, UsageTypeCode usageTypeCode, String networkAclNo, String pageNo, String pageSize, SubnetStatusCode subnetStatusCode, String vpcNo, String zoneCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, subnetNoListN, subnetName, subnet, subnetTypeCode, usageTypeCode, networkAclNo, pageNo, pageSize, subnetStatusCode, vpcNo, zoneCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SubnetListResponse>>>() {
                @Override
                public Observable<ServiceResponse<SubnetListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SubnetListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SubnetListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SubnetListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SubnetListResponse>() { }.getType())
                .build(response);
    }

    /**
     * Subnet 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetDetailResponse object if successful.
     */
    public SubnetDetailResponse getDetail(String responseFormatType, String subnetNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, subnetNo).toBlocking().single().body();
    }

    /**
     * Subnet 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SubnetDetailResponse> getDetailAsync(String responseFormatType, String subnetNo, final ServiceCallback<SubnetDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, subnetNo), serviceCallback);
    }

    /**
     * Subnet 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetDetailResponse object
     */
    public Observable<SubnetDetailResponse> getDetailAsync(String responseFormatType, String subnetNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, subnetNo).map(new Func1<ServiceResponse<SubnetDetailResponse>, SubnetDetailResponse>() {
            @Override
            public SubnetDetailResponse call(ServiceResponse<SubnetDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Subnet 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetDetailResponse object
     */
    public Observable<ServiceResponse<SubnetDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String subnetNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (subnetNo == null) {
            throw new IllegalArgumentException("Parameter subnetNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.getDetail(responseFormatType, regionCode, subnetNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SubnetDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<SubnetDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SubnetDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Subnet 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetDetailResponse object if successful.
     */
    public SubnetDetailResponse getDetail(String responseFormatType, String subnetNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, subnetNo, regionCode).toBlocking().single().body();
    }

    /**
     * Subnet 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SubnetDetailResponse> getDetailAsync(String responseFormatType, String subnetNo, String regionCode, final ServiceCallback<SubnetDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, subnetNo, regionCode), serviceCallback);
    }

    /**
     * Subnet 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetDetailResponse object
     */
    public Observable<SubnetDetailResponse> getDetailAsync(String responseFormatType, String subnetNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, subnetNo, regionCode).map(new Func1<ServiceResponse<SubnetDetailResponse>, SubnetDetailResponse>() {
            @Override
            public SubnetDetailResponse call(ServiceResponse<SubnetDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Subnet 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetDetailResponse object
     */
    public Observable<ServiceResponse<SubnetDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String subnetNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (subnetNo == null) {
            throw new IllegalArgumentException("Parameter subnetNo is required and cannot be null.");
        }
        return service.getDetail(responseFormatType, regionCode, subnetNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SubnetDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<SubnetDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SubnetDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SubnetDetailResponse> getDetailDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SubnetDetailResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SubnetDetailResponse>() { }.getType())
                .build(response);
    }

    /**
     * Subnet을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param zoneCode ZONE 코드
     * @param vpcNo VPC 번호
     * @param subnet 서브넷
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetResponse object if successful.
     */
    public SubnetResponse create(String responseFormatType, String zoneCode, String vpcNo, String subnet, String networkAclNo, SubnetTypeCode subnetTypeCode) {
        return createWithServiceResponseAsync(responseFormatType, zoneCode, vpcNo, subnet, networkAclNo, subnetTypeCode).toBlocking().single().body();
    }

    /**
     * Subnet을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param zoneCode ZONE 코드
     * @param vpcNo VPC 번호
     * @param subnet 서브넷
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SubnetResponse> createAsync(String responseFormatType, String zoneCode, String vpcNo, String subnet, String networkAclNo, SubnetTypeCode subnetTypeCode, final ServiceCallback<SubnetResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, zoneCode, vpcNo, subnet, networkAclNo, subnetTypeCode), serviceCallback);
    }

    /**
     * Subnet을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param zoneCode ZONE 코드
     * @param vpcNo VPC 번호
     * @param subnet 서브넷
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetResponse object
     */
    public Observable<SubnetResponse> createAsync(String responseFormatType, String zoneCode, String vpcNo, String subnet, String networkAclNo, SubnetTypeCode subnetTypeCode) {
        return createWithServiceResponseAsync(responseFormatType, zoneCode, vpcNo, subnet, networkAclNo, subnetTypeCode).map(new Func1<ServiceResponse<SubnetResponse>, SubnetResponse>() {
            @Override
            public SubnetResponse call(ServiceResponse<SubnetResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Subnet을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param zoneCode ZONE 코드
     * @param vpcNo VPC 번호
     * @param subnet 서브넷
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetResponse object
     */
    public Observable<ServiceResponse<SubnetResponse>> createWithServiceResponseAsync(String responseFormatType, String zoneCode, String vpcNo, String subnet, String networkAclNo, SubnetTypeCode subnetTypeCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (zoneCode == null) {
            throw new IllegalArgumentException("Parameter zoneCode is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (subnet == null) {
            throw new IllegalArgumentException("Parameter subnet is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        if (subnetTypeCode == null) {
            throw new IllegalArgumentException("Parameter subnetTypeCode is required and cannot be null.");
        }
        final String regionCode = null;
        final String subnetName = null;
        final UsageTypeCode usageTypeCode = null;
        return service.create(responseFormatType, regionCode, zoneCode, vpcNo, subnetName, subnet, networkAclNo, subnetTypeCode, usageTypeCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SubnetResponse>>>() {
                @Override
                public Observable<ServiceResponse<SubnetResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SubnetResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Subnet을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param zoneCode ZONE 코드
     * @param vpcNo VPC 번호
     * @param subnet 서브넷
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param regionCode REGION 코드
     * @param subnetName 서브넷 이름
     * @param usageTypeCode 용도 유형 코드. Possible values include: 'GEN', 'LOADB', 'BM'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetResponse object if successful.
     */
    public SubnetResponse create(String responseFormatType, String zoneCode, String vpcNo, String subnet, String networkAclNo, SubnetTypeCode subnetTypeCode, String regionCode, String subnetName, UsageTypeCode usageTypeCode) {
        return createWithServiceResponseAsync(responseFormatType, zoneCode, vpcNo, subnet, networkAclNo, subnetTypeCode, regionCode, subnetName, usageTypeCode).toBlocking().single().body();
    }

    /**
     * Subnet을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param zoneCode ZONE 코드
     * @param vpcNo VPC 번호
     * @param subnet 서브넷
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param regionCode REGION 코드
     * @param subnetName 서브넷 이름
     * @param usageTypeCode 용도 유형 코드. Possible values include: 'GEN', 'LOADB', 'BM'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SubnetResponse> createAsync(String responseFormatType, String zoneCode, String vpcNo, String subnet, String networkAclNo, SubnetTypeCode subnetTypeCode, String regionCode, String subnetName, UsageTypeCode usageTypeCode, final ServiceCallback<SubnetResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, zoneCode, vpcNo, subnet, networkAclNo, subnetTypeCode, regionCode, subnetName, usageTypeCode), serviceCallback);
    }

    /**
     * Subnet을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param zoneCode ZONE 코드
     * @param vpcNo VPC 번호
     * @param subnet 서브넷
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param regionCode REGION 코드
     * @param subnetName 서브넷 이름
     * @param usageTypeCode 용도 유형 코드. Possible values include: 'GEN', 'LOADB', 'BM'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetResponse object
     */
    public Observable<SubnetResponse> createAsync(String responseFormatType, String zoneCode, String vpcNo, String subnet, String networkAclNo, SubnetTypeCode subnetTypeCode, String regionCode, String subnetName, UsageTypeCode usageTypeCode) {
        return createWithServiceResponseAsync(responseFormatType, zoneCode, vpcNo, subnet, networkAclNo, subnetTypeCode, regionCode, subnetName, usageTypeCode).map(new Func1<ServiceResponse<SubnetResponse>, SubnetResponse>() {
            @Override
            public SubnetResponse call(ServiceResponse<SubnetResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Subnet을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param zoneCode ZONE 코드
     * @param vpcNo VPC 번호
     * @param subnet 서브넷
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param regionCode REGION 코드
     * @param subnetName 서브넷 이름
     * @param usageTypeCode 용도 유형 코드. Possible values include: 'GEN', 'LOADB', 'BM'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetResponse object
     */
    public Observable<ServiceResponse<SubnetResponse>> createWithServiceResponseAsync(String responseFormatType, String zoneCode, String vpcNo, String subnet, String networkAclNo, SubnetTypeCode subnetTypeCode, String regionCode, String subnetName, UsageTypeCode usageTypeCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (zoneCode == null) {
            throw new IllegalArgumentException("Parameter zoneCode is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (subnet == null) {
            throw new IllegalArgumentException("Parameter subnet is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        if (subnetTypeCode == null) {
            throw new IllegalArgumentException("Parameter subnetTypeCode is required and cannot be null.");
        }
        return service.create(responseFormatType, regionCode, zoneCode, vpcNo, subnetName, subnet, networkAclNo, subnetTypeCode, usageTypeCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SubnetResponse>>>() {
                @Override
                public Observable<ServiceResponse<SubnetResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SubnetResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SubnetResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SubnetResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SubnetResponse>() { }.getType())
                .build(response);
    }

    /**
     * Subnet을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetResponse object if successful.
     */
    public SubnetResponse delete(String responseFormatType, String subnetNo) {
        return deleteWithServiceResponseAsync(responseFormatType, subnetNo).toBlocking().single().body();
    }

    /**
     * Subnet을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SubnetResponse> deleteAsync(String responseFormatType, String subnetNo, final ServiceCallback<SubnetResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, subnetNo), serviceCallback);
    }

    /**
     * Subnet을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetResponse object
     */
    public Observable<SubnetResponse> deleteAsync(String responseFormatType, String subnetNo) {
        return deleteWithServiceResponseAsync(responseFormatType, subnetNo).map(new Func1<ServiceResponse<SubnetResponse>, SubnetResponse>() {
            @Override
            public SubnetResponse call(ServiceResponse<SubnetResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Subnet을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetResponse object
     */
    public Observable<ServiceResponse<SubnetResponse>> deleteWithServiceResponseAsync(String responseFormatType, String subnetNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (subnetNo == null) {
            throw new IllegalArgumentException("Parameter subnetNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.delete(responseFormatType, regionCode, subnetNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SubnetResponse>>>() {
                @Override
                public Observable<ServiceResponse<SubnetResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SubnetResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Subnet을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetResponse object if successful.
     */
    public SubnetResponse delete(String responseFormatType, String subnetNo, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, subnetNo, regionCode).toBlocking().single().body();
    }

    /**
     * Subnet을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SubnetResponse> deleteAsync(String responseFormatType, String subnetNo, String regionCode, final ServiceCallback<SubnetResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, subnetNo, regionCode), serviceCallback);
    }

    /**
     * Subnet을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetResponse object
     */
    public Observable<SubnetResponse> deleteAsync(String responseFormatType, String subnetNo, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, subnetNo, regionCode).map(new Func1<ServiceResponse<SubnetResponse>, SubnetResponse>() {
            @Override
            public SubnetResponse call(ServiceResponse<SubnetResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Subnet을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetResponse object
     */
    public Observable<ServiceResponse<SubnetResponse>> deleteWithServiceResponseAsync(String responseFormatType, String subnetNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (subnetNo == null) {
            throw new IllegalArgumentException("Parameter subnetNo is required and cannot be null.");
        }
        return service.delete(responseFormatType, regionCode, subnetNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SubnetResponse>>>() {
                @Override
                public Observable<ServiceResponse<SubnetResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SubnetResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SubnetResponse> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SubnetResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SubnetResponse>() { }.getType())
                .build(response);
    }

}
