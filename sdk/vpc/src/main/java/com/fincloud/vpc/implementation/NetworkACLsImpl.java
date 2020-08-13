/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.implementation;

import retrofit2.Retrofit;
import com.fincloud.vpc.NetworkACLs;
import com.fincloud.vpc.models.NetworkAclDetailResponse;
import com.fincloud.vpc.models.NetworkAclInboundRuleResponse;
import com.fincloud.vpc.models.NetworkAclListResponse;
import com.fincloud.vpc.models.NetworkAclOutboundRuleResponse;
import com.fincloud.vpc.models.NetworkAclResponse;
import com.fincloud.vpc.models.NetworkAclRuleListResponse;
import com.fincloud.vpc.models.NetworkAclRuleTypeCode;
import com.fincloud.vpc.models.NetworkAclStatusCode;
import com.fincloud.vpc.models.ProtocolTypeCode;
import com.fincloud.vpc.models.RuleActionCode;
import com.fincloud.vpc.models.SubnetNetworkAclResponse;
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
 * in NetworkACLs.
 */
public class NetworkACLsImpl implements NetworkACLs {
    /** The Retrofit service to perform REST calls. */
    private NetworkACLsService service;
    /** The service client containing this operation class. */
    private VPCManagementClientImpl client;

    /**
     * Initializes an instance of NetworkACLs.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public NetworkACLsImpl(Retrofit retrofit, VPCManagementClientImpl client) {
        this.service = retrofit.create(NetworkACLsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkACLs to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NetworkACLsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.NetworkACLs getList" })
        @GET("vpc/v2/getNetworkAclList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("networkAclName") String networkAclName, @Query("networkAclStatusCode") NetworkAclStatusCode networkAclStatusCode1, @Query("networkAclNoList.N") String networkAclNoListN, @Query("pageNo") String pageNo, @Query("pageSize") String pageSize, @Query("vpcNo") String vpcNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.NetworkACLs getDetail" })
        @GET("vpc/v2/getNetworkAclDetail")
        Observable<Response<ResponseBody>> getDetail(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("networkAclNo") String networkAclNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.NetworkACLs create" })
        @POST("vpc/v2/createNetworkAcl")
        Observable<Response<ResponseBody>> create(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcNo") String vpcNo, @Query("networkAclName") String networkAclName, @Query("networkAclDescription") String networkAclDescription);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.NetworkACLs delete" })
        @POST("vpc/v2/deleteNetworkAcl")
        Observable<Response<ResponseBody>> delete(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("networkAclNo") String networkAclNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.NetworkACLs setSubnet" })
        @POST("vpc/v2/setSubnetNetworkAcl")
        Observable<Response<ResponseBody>> setSubnet(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("networkAclNo") String networkAclNo, @Query("subnetNo") String subnetNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.NetworkACLs getRuleList" })
        @GET("vpc/v2/getNetworkAclRuleList")
        Observable<Response<ResponseBody>> getRuleList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("networkAclNo") String networkAclNo, @Query("networkAclRuleTypeCode") NetworkAclRuleTypeCode networkAclRuleTypeCode1);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.NetworkACLs addInboundRule" })
        @POST("vpc/v2/addNetworkAclInboundRule")
        Observable<Response<ResponseBody>> addInboundRule(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("networkAclNo") String networkAclNo, @Query("networkAclRuleList.N.priority") String networkAclRuleListNpriority, @Query("networkAclRuleList.N.protocolTypeCode") ProtocolTypeCode networkAclRuleListNprotocolTypeCode, @Query("networkAclRuleList.N.ipBlock") String networkAclRuleListNipBlock, @Query("networkAclRuleList.N.portRange") String networkAclRuleListNportRange, @Query("networkAclRuleList.N.ruleActionCode") RuleActionCode networkAclRuleListNruleActionCode, @Query("networkAclRuleList.N.networkAclRuleDescription") String networkAclRuleListNnetworkAclRuleDescription);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.NetworkACLs addOutboundRule" })
        @POST("vpc/v2/addNetworkAclOutboundRule")
        Observable<Response<ResponseBody>> addOutboundRule(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("networkAclNo") String networkAclNo, @Query("networkAclRuleList.N.priority") String networkAclRuleListNpriority, @Query("networkAclRuleList.N.protocolTypeCode") ProtocolTypeCode networkAclRuleListNprotocolTypeCode, @Query("networkAclRuleList.N.ipBlock") String networkAclRuleListNipBlock, @Query("networkAclRuleList.N.portRange") String networkAclRuleListNportRange, @Query("networkAclRuleList.N.ruleActionCode") RuleActionCode networkAclRuleListNruleActionCode, @Query("networkAclRuleList.N.networkAclRuleDescription") String networkAclRuleListNnetworkAclRuleDescription);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.NetworkACLs removeInboundRule" })
        @POST("vpc/v2/removeNetworkAclInboundRule")
        Observable<Response<ResponseBody>> removeInboundRule(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("networkAclNo") String networkAclNo, @Query("networkAclRuleList.N.priority") String networkAclRuleListNpriority, @Query("networkAclRuleList.N.protocolTypeCode") ProtocolTypeCode networkAclRuleListNprotocolTypeCode, @Query("networkAclRuleList.N.ipBlock") String networkAclRuleListNipBlock, @Query("networkAclRuleList.N.portRange") String networkAclRuleListNportRange, @Query("networkAclRuleList.N.ruleActionCode") RuleActionCode networkAclRuleListNruleActionCode);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.NetworkACLs removeOutboundRule" })
        @POST("vpc/v2/removeNetworkAclOutboundRule")
        Observable<Response<ResponseBody>> removeOutboundRule(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("networkAclNo") String networkAclNo, @Query("networkAclRuleList.N.priority") String networkAclRuleListNpriority, @Query("networkAclRuleList.N.protocolTypeCode") ProtocolTypeCode networkAclRuleListNprotocolTypeCode, @Query("networkAclRuleList.N.ipBlock") String networkAclRuleListNipBlock, @Query("networkAclRuleList.N.portRange") String networkAclRuleListNportRange, @Query("networkAclRuleList.N.ruleActionCode") RuleActionCode networkAclRuleListNruleActionCode);

    }

    /**
     * 네트워크 ACL 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclListResponse object if successful.
     */
    public NetworkAclListResponse getList(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclListResponse> getListAsync(String responseFormatType, final ServiceCallback<NetworkAclListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 네트워크 ACL 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclListResponse object
     */
    public Observable<NetworkAclListResponse> getListAsync(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<NetworkAclListResponse>, NetworkAclListResponse>() {
            @Override
            public NetworkAclListResponse call(ServiceResponse<NetworkAclListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclListResponse object
     */
    public Observable<ServiceResponse<NetworkAclListResponse>> getListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String networkAclName = null;
        final NetworkAclStatusCode networkAclStatusCode = null;
        final String networkAclNoListN = null;
        final String pageNo = null;
        final String pageSize = null;
        final String vpcNo = null;
        return service.getList(responseFormatType, regionCode, networkAclName, networkAclStatusCode, networkAclNoListN, pageNo, pageSize, vpcNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclListResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 네트워크 ACL 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkAclName 네트워크 ACL 이름
     * @param networkAclStatusCode 네트워크 ACL 상태 코드. Possible values include: 'INIT', 'SET', 'RUN', 'TERMTING'
     * @param networkAclNoListN 네트워크 ACL 번호 리스트
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclListResponse object if successful.
     */
    public NetworkAclListResponse getList(String responseFormatType, String regionCode, String networkAclName, NetworkAclStatusCode networkAclStatusCode, String networkAclNoListN, String pageNo, String pageSize, String vpcNo) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, networkAclName, networkAclStatusCode, networkAclNoListN, pageNo, pageSize, vpcNo).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkAclName 네트워크 ACL 이름
     * @param networkAclStatusCode 네트워크 ACL 상태 코드. Possible values include: 'INIT', 'SET', 'RUN', 'TERMTING'
     * @param networkAclNoListN 네트워크 ACL 번호 리스트
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclListResponse> getListAsync(String responseFormatType, String regionCode, String networkAclName, NetworkAclStatusCode networkAclStatusCode, String networkAclNoListN, String pageNo, String pageSize, String vpcNo, final ServiceCallback<NetworkAclListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, regionCode, networkAclName, networkAclStatusCode, networkAclNoListN, pageNo, pageSize, vpcNo), serviceCallback);
    }

    /**
     * 네트워크 ACL 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkAclName 네트워크 ACL 이름
     * @param networkAclStatusCode 네트워크 ACL 상태 코드. Possible values include: 'INIT', 'SET', 'RUN', 'TERMTING'
     * @param networkAclNoListN 네트워크 ACL 번호 리스트
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclListResponse object
     */
    public Observable<NetworkAclListResponse> getListAsync(String responseFormatType, String regionCode, String networkAclName, NetworkAclStatusCode networkAclStatusCode, String networkAclNoListN, String pageNo, String pageSize, String vpcNo) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, networkAclName, networkAclStatusCode, networkAclNoListN, pageNo, pageSize, vpcNo).map(new Func1<ServiceResponse<NetworkAclListResponse>, NetworkAclListResponse>() {
            @Override
            public NetworkAclListResponse call(ServiceResponse<NetworkAclListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkAclName 네트워크 ACL 이름
     * @param networkAclStatusCode 네트워크 ACL 상태 코드. Possible values include: 'INIT', 'SET', 'RUN', 'TERMTING'
     * @param networkAclNoListN 네트워크 ACL 번호 리스트
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclListResponse object
     */
    public Observable<ServiceResponse<NetworkAclListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String networkAclName, NetworkAclStatusCode networkAclStatusCode, String networkAclNoListN, String pageNo, String pageSize, String vpcNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, networkAclName, networkAclStatusCode, networkAclNoListN, pageNo, pageSize, vpcNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclListResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkAclListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkAclListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkAclListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 네트워크 ACL 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclDetailResponse object if successful.
     */
    public NetworkAclDetailResponse getDetail(String responseFormatType, String networkAclNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, networkAclNo).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclDetailResponse> getDetailAsync(String responseFormatType, String networkAclNo, final ServiceCallback<NetworkAclDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, networkAclNo), serviceCallback);
    }

    /**
     * 네트워크 ACL 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclDetailResponse object
     */
    public Observable<NetworkAclDetailResponse> getDetailAsync(String responseFormatType, String networkAclNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, networkAclNo).map(new Func1<ServiceResponse<NetworkAclDetailResponse>, NetworkAclDetailResponse>() {
            @Override
            public NetworkAclDetailResponse call(ServiceResponse<NetworkAclDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclDetailResponse object
     */
    public Observable<ServiceResponse<NetworkAclDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String networkAclNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.getDetail(responseFormatType, regionCode, networkAclNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 네트워크 ACL 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclDetailResponse object if successful.
     */
    public NetworkAclDetailResponse getDetail(String responseFormatType, String networkAclNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, networkAclNo, regionCode).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclDetailResponse> getDetailAsync(String responseFormatType, String networkAclNo, String regionCode, final ServiceCallback<NetworkAclDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, networkAclNo, regionCode), serviceCallback);
    }

    /**
     * 네트워크 ACL 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclDetailResponse object
     */
    public Observable<NetworkAclDetailResponse> getDetailAsync(String responseFormatType, String networkAclNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, networkAclNo, regionCode).map(new Func1<ServiceResponse<NetworkAclDetailResponse>, NetworkAclDetailResponse>() {
            @Override
            public NetworkAclDetailResponse call(ServiceResponse<NetworkAclDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclDetailResponse object
     */
    public Observable<ServiceResponse<NetworkAclDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String networkAclNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        return service.getDetail(responseFormatType, regionCode, networkAclNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkAclDetailResponse> getDetailDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkAclDetailResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkAclDetailResponse>() { }.getType())
                .build(response);
    }

    /**
     * 네트워크 ACL을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclResponse object if successful.
     */
    public NetworkAclResponse create(String responseFormatType, String vpcNo) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclResponse> createAsync(String responseFormatType, String vpcNo, final ServiceCallback<NetworkAclResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, vpcNo), serviceCallback);
    }

    /**
     * 네트워크 ACL을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclResponse object
     */
    public Observable<NetworkAclResponse> createAsync(String responseFormatType, String vpcNo) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo).map(new Func1<ServiceResponse<NetworkAclResponse>, NetworkAclResponse>() {
            @Override
            public NetworkAclResponse call(ServiceResponse<NetworkAclResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclResponse object
     */
    public Observable<ServiceResponse<NetworkAclResponse>> createWithServiceResponseAsync(String responseFormatType, String vpcNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        final String regionCode = null;
        final String networkAclName = null;
        final String networkAclDescription = null;
        return service.create(responseFormatType, regionCode, vpcNo, networkAclName, networkAclDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 네트워크 ACL을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param networkAclName 네트워크 ACL 이름
     * @param networkAclDescription 네트워크 ACL 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclResponse object if successful.
     */
    public NetworkAclResponse create(String responseFormatType, String vpcNo, String regionCode, String networkAclName, String networkAclDescription) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo, regionCode, networkAclName, networkAclDescription).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param networkAclName 네트워크 ACL 이름
     * @param networkAclDescription 네트워크 ACL 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclResponse> createAsync(String responseFormatType, String vpcNo, String regionCode, String networkAclName, String networkAclDescription, final ServiceCallback<NetworkAclResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, vpcNo, regionCode, networkAclName, networkAclDescription), serviceCallback);
    }

    /**
     * 네트워크 ACL을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param networkAclName 네트워크 ACL 이름
     * @param networkAclDescription 네트워크 ACL 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclResponse object
     */
    public Observable<NetworkAclResponse> createAsync(String responseFormatType, String vpcNo, String regionCode, String networkAclName, String networkAclDescription) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo, regionCode, networkAclName, networkAclDescription).map(new Func1<ServiceResponse<NetworkAclResponse>, NetworkAclResponse>() {
            @Override
            public NetworkAclResponse call(ServiceResponse<NetworkAclResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param networkAclName 네트워크 ACL 이름
     * @param networkAclDescription 네트워크 ACL 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclResponse object
     */
    public Observable<ServiceResponse<NetworkAclResponse>> createWithServiceResponseAsync(String responseFormatType, String vpcNo, String regionCode, String networkAclName, String networkAclDescription) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        return service.create(responseFormatType, regionCode, vpcNo, networkAclName, networkAclDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkAclResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkAclResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkAclResponse>() { }.getType())
                .build(response);
    }

    /**
     * 네트워크 ACL을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclResponse object if successful.
     */
    public NetworkAclResponse delete(String responseFormatType, String networkAclNo) {
        return deleteWithServiceResponseAsync(responseFormatType, networkAclNo).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclResponse> deleteAsync(String responseFormatType, String networkAclNo, final ServiceCallback<NetworkAclResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, networkAclNo), serviceCallback);
    }

    /**
     * 네트워크 ACL을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclResponse object
     */
    public Observable<NetworkAclResponse> deleteAsync(String responseFormatType, String networkAclNo) {
        return deleteWithServiceResponseAsync(responseFormatType, networkAclNo).map(new Func1<ServiceResponse<NetworkAclResponse>, NetworkAclResponse>() {
            @Override
            public NetworkAclResponse call(ServiceResponse<NetworkAclResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclResponse object
     */
    public Observable<ServiceResponse<NetworkAclResponse>> deleteWithServiceResponseAsync(String responseFormatType, String networkAclNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.delete(responseFormatType, regionCode, networkAclNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 네트워크 ACL을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclResponse object if successful.
     */
    public NetworkAclResponse delete(String responseFormatType, String networkAclNo, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, networkAclNo, regionCode).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclResponse> deleteAsync(String responseFormatType, String networkAclNo, String regionCode, final ServiceCallback<NetworkAclResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, networkAclNo, regionCode), serviceCallback);
    }

    /**
     * 네트워크 ACL을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclResponse object
     */
    public Observable<NetworkAclResponse> deleteAsync(String responseFormatType, String networkAclNo, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, networkAclNo, regionCode).map(new Func1<ServiceResponse<NetworkAclResponse>, NetworkAclResponse>() {
            @Override
            public NetworkAclResponse call(ServiceResponse<NetworkAclResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclResponse object
     */
    public Observable<ServiceResponse<NetworkAclResponse>> deleteWithServiceResponseAsync(String responseFormatType, String networkAclNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        return service.delete(responseFormatType, regionCode, networkAclNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkAclResponse> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkAclResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkAclResponse>() { }.getType())
                .build(response);
    }

    /**
     * 서브넷의 네트워크 ACL을 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetNetworkAclResponse object if successful.
     */
    public SubnetNetworkAclResponse setSubnet(String responseFormatType, String networkAclNo, String subnetNo) {
        return setSubnetWithServiceResponseAsync(responseFormatType, networkAclNo, subnetNo).toBlocking().single().body();
    }

    /**
     * 서브넷의 네트워크 ACL을 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetNo 서브넷 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SubnetNetworkAclResponse> setSubnetAsync(String responseFormatType, String networkAclNo, String subnetNo, final ServiceCallback<SubnetNetworkAclResponse> serviceCallback) {
        return ServiceFuture.fromResponse(setSubnetWithServiceResponseAsync(responseFormatType, networkAclNo, subnetNo), serviceCallback);
    }

    /**
     * 서브넷의 네트워크 ACL을 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetNetworkAclResponse object
     */
    public Observable<SubnetNetworkAclResponse> setSubnetAsync(String responseFormatType, String networkAclNo, String subnetNo) {
        return setSubnetWithServiceResponseAsync(responseFormatType, networkAclNo, subnetNo).map(new Func1<ServiceResponse<SubnetNetworkAclResponse>, SubnetNetworkAclResponse>() {
            @Override
            public SubnetNetworkAclResponse call(ServiceResponse<SubnetNetworkAclResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서브넷의 네트워크 ACL을 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetNetworkAclResponse object
     */
    public Observable<ServiceResponse<SubnetNetworkAclResponse>> setSubnetWithServiceResponseAsync(String responseFormatType, String networkAclNo, String subnetNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        if (subnetNo == null) {
            throw new IllegalArgumentException("Parameter subnetNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.setSubnet(responseFormatType, regionCode, networkAclNo, subnetNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SubnetNetworkAclResponse>>>() {
                @Override
                public Observable<ServiceResponse<SubnetNetworkAclResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SubnetNetworkAclResponse> clientResponse = setSubnetDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 서브넷의 네트워크 ACL을 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetNetworkAclResponse object if successful.
     */
    public SubnetNetworkAclResponse setSubnet(String responseFormatType, String networkAclNo, String subnetNo, String regionCode) {
        return setSubnetWithServiceResponseAsync(responseFormatType, networkAclNo, subnetNo, regionCode).toBlocking().single().body();
    }

    /**
     * 서브넷의 네트워크 ACL을 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SubnetNetworkAclResponse> setSubnetAsync(String responseFormatType, String networkAclNo, String subnetNo, String regionCode, final ServiceCallback<SubnetNetworkAclResponse> serviceCallback) {
        return ServiceFuture.fromResponse(setSubnetWithServiceResponseAsync(responseFormatType, networkAclNo, subnetNo, regionCode), serviceCallback);
    }

    /**
     * 서브넷의 네트워크 ACL을 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetNetworkAclResponse object
     */
    public Observable<SubnetNetworkAclResponse> setSubnetAsync(String responseFormatType, String networkAclNo, String subnetNo, String regionCode) {
        return setSubnetWithServiceResponseAsync(responseFormatType, networkAclNo, subnetNo, regionCode).map(new Func1<ServiceResponse<SubnetNetworkAclResponse>, SubnetNetworkAclResponse>() {
            @Override
            public SubnetNetworkAclResponse call(ServiceResponse<SubnetNetworkAclResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서브넷의 네트워크 ACL을 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetNetworkAclResponse object
     */
    public Observable<ServiceResponse<SubnetNetworkAclResponse>> setSubnetWithServiceResponseAsync(String responseFormatType, String networkAclNo, String subnetNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        if (subnetNo == null) {
            throw new IllegalArgumentException("Parameter subnetNo is required and cannot be null.");
        }
        return service.setSubnet(responseFormatType, regionCode, networkAclNo, subnetNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SubnetNetworkAclResponse>>>() {
                @Override
                public Observable<ServiceResponse<SubnetNetworkAclResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SubnetNetworkAclResponse> clientResponse = setSubnetDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SubnetNetworkAclResponse> setSubnetDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SubnetNetworkAclResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SubnetNetworkAclResponse>() { }.getType())
                .build(response);
    }

    /**
     * 네트워크 ACL의 Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclRuleListResponse object if successful.
     */
    public NetworkAclRuleListResponse getRuleList(String responseFormatType, String networkAclNo) {
        return getRuleListWithServiceResponseAsync(responseFormatType, networkAclNo).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL의 Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclRuleListResponse> getRuleListAsync(String responseFormatType, String networkAclNo, final ServiceCallback<NetworkAclRuleListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getRuleListWithServiceResponseAsync(responseFormatType, networkAclNo), serviceCallback);
    }

    /**
     * 네트워크 ACL의 Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclRuleListResponse object
     */
    public Observable<NetworkAclRuleListResponse> getRuleListAsync(String responseFormatType, String networkAclNo) {
        return getRuleListWithServiceResponseAsync(responseFormatType, networkAclNo).map(new Func1<ServiceResponse<NetworkAclRuleListResponse>, NetworkAclRuleListResponse>() {
            @Override
            public NetworkAclRuleListResponse call(ServiceResponse<NetworkAclRuleListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL의 Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclRuleListResponse object
     */
    public Observable<ServiceResponse<NetworkAclRuleListResponse>> getRuleListWithServiceResponseAsync(String responseFormatType, String networkAclNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        final String regionCode = null;
        final NetworkAclRuleTypeCode networkAclRuleTypeCode = null;
        return service.getRuleList(responseFormatType, regionCode, networkAclNo, networkAclRuleTypeCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclRuleListResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclRuleListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclRuleListResponse> clientResponse = getRuleListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 네트워크 ACL의 Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @param networkAclRuleTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'INBND', 'OTBND'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclRuleListResponse object if successful.
     */
    public NetworkAclRuleListResponse getRuleList(String responseFormatType, String networkAclNo, String regionCode, NetworkAclRuleTypeCode networkAclRuleTypeCode) {
        return getRuleListWithServiceResponseAsync(responseFormatType, networkAclNo, regionCode, networkAclRuleTypeCode).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL의 Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @param networkAclRuleTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'INBND', 'OTBND'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclRuleListResponse> getRuleListAsync(String responseFormatType, String networkAclNo, String regionCode, NetworkAclRuleTypeCode networkAclRuleTypeCode, final ServiceCallback<NetworkAclRuleListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getRuleListWithServiceResponseAsync(responseFormatType, networkAclNo, regionCode, networkAclRuleTypeCode), serviceCallback);
    }

    /**
     * 네트워크 ACL의 Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @param networkAclRuleTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'INBND', 'OTBND'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclRuleListResponse object
     */
    public Observable<NetworkAclRuleListResponse> getRuleListAsync(String responseFormatType, String networkAclNo, String regionCode, NetworkAclRuleTypeCode networkAclRuleTypeCode) {
        return getRuleListWithServiceResponseAsync(responseFormatType, networkAclNo, regionCode, networkAclRuleTypeCode).map(new Func1<ServiceResponse<NetworkAclRuleListResponse>, NetworkAclRuleListResponse>() {
            @Override
            public NetworkAclRuleListResponse call(ServiceResponse<NetworkAclRuleListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL의 Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @param networkAclRuleTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'INBND', 'OTBND'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclRuleListResponse object
     */
    public Observable<ServiceResponse<NetworkAclRuleListResponse>> getRuleListWithServiceResponseAsync(String responseFormatType, String networkAclNo, String regionCode, NetworkAclRuleTypeCode networkAclRuleTypeCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        return service.getRuleList(responseFormatType, regionCode, networkAclNo, networkAclRuleTypeCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclRuleListResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclRuleListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclRuleListResponse> clientResponse = getRuleListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkAclRuleListResponse> getRuleListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkAclRuleListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkAclRuleListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 네트워크 ACL의 Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclInboundRuleResponse object if successful.
     */
    public NetworkAclInboundRuleResponse addInboundRule(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode) {
        return addInboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL의 Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclInboundRuleResponse> addInboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, final ServiceCallback<NetworkAclInboundRuleResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addInboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode), serviceCallback);
    }

    /**
     * 네트워크 ACL의 Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclInboundRuleResponse object
     */
    public Observable<NetworkAclInboundRuleResponse> addInboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode) {
        return addInboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode).map(new Func1<ServiceResponse<NetworkAclInboundRuleResponse>, NetworkAclInboundRuleResponse>() {
            @Override
            public NetworkAclInboundRuleResponse call(ServiceResponse<NetworkAclInboundRuleResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL의 Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclInboundRuleResponse object
     */
    public Observable<ServiceResponse<NetworkAclInboundRuleResponse>> addInboundRuleWithServiceResponseAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        if (networkAclRuleListNpriority == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNpriority is required and cannot be null.");
        }
        if (networkAclRuleListNprotocolTypeCode == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNprotocolTypeCode is required and cannot be null.");
        }
        if (networkAclRuleListNipBlock == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNipBlock is required and cannot be null.");
        }
        if (networkAclRuleListNruleActionCode == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNruleActionCode is required and cannot be null.");
        }
        final String regionCode = null;
        final String networkAclRuleListNportRange = null;
        final String networkAclRuleListNnetworkAclRuleDescription = null;
        return service.addInboundRule(responseFormatType, regionCode, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNportRange, networkAclRuleListNruleActionCode, networkAclRuleListNnetworkAclRuleDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclInboundRuleResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclInboundRuleResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclInboundRuleResponse> clientResponse = addInboundRuleDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 네트워크 ACL의 Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param networkAclRuleListNnetworkAclRuleDescription 네트워크 ACL Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclInboundRuleResponse object if successful.
     */
    public NetworkAclInboundRuleResponse addInboundRule(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, String networkAclRuleListNnetworkAclRuleDescription) {
        return addInboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode, regionCode, networkAclRuleListNportRange, networkAclRuleListNnetworkAclRuleDescription).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL의 Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param networkAclRuleListNnetworkAclRuleDescription 네트워크 ACL Rule 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclInboundRuleResponse> addInboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, String networkAclRuleListNnetworkAclRuleDescription, final ServiceCallback<NetworkAclInboundRuleResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addInboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode, regionCode, networkAclRuleListNportRange, networkAclRuleListNnetworkAclRuleDescription), serviceCallback);
    }

    /**
     * 네트워크 ACL의 Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param networkAclRuleListNnetworkAclRuleDescription 네트워크 ACL Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclInboundRuleResponse object
     */
    public Observable<NetworkAclInboundRuleResponse> addInboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, String networkAclRuleListNnetworkAclRuleDescription) {
        return addInboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode, regionCode, networkAclRuleListNportRange, networkAclRuleListNnetworkAclRuleDescription).map(new Func1<ServiceResponse<NetworkAclInboundRuleResponse>, NetworkAclInboundRuleResponse>() {
            @Override
            public NetworkAclInboundRuleResponse call(ServiceResponse<NetworkAclInboundRuleResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL의 Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param networkAclRuleListNnetworkAclRuleDescription 네트워크 ACL Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclInboundRuleResponse object
     */
    public Observable<ServiceResponse<NetworkAclInboundRuleResponse>> addInboundRuleWithServiceResponseAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, String networkAclRuleListNnetworkAclRuleDescription) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        if (networkAclRuleListNpriority == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNpriority is required and cannot be null.");
        }
        if (networkAclRuleListNprotocolTypeCode == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNprotocolTypeCode is required and cannot be null.");
        }
        if (networkAclRuleListNipBlock == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNipBlock is required and cannot be null.");
        }
        if (networkAclRuleListNruleActionCode == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNruleActionCode is required and cannot be null.");
        }
        return service.addInboundRule(responseFormatType, regionCode, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNportRange, networkAclRuleListNruleActionCode, networkAclRuleListNnetworkAclRuleDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclInboundRuleResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclInboundRuleResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclInboundRuleResponse> clientResponse = addInboundRuleDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkAclInboundRuleResponse> addInboundRuleDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkAclInboundRuleResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkAclInboundRuleResponse>() { }.getType())
                .build(response);
    }

    /**
     * 네트워크 ACL의 Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclOutboundRuleResponse object if successful.
     */
    public NetworkAclOutboundRuleResponse addOutboundRule(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode) {
        return addOutboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL의 Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclOutboundRuleResponse> addOutboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, final ServiceCallback<NetworkAclOutboundRuleResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addOutboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode), serviceCallback);
    }

    /**
     * 네트워크 ACL의 Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclOutboundRuleResponse object
     */
    public Observable<NetworkAclOutboundRuleResponse> addOutboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode) {
        return addOutboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode).map(new Func1<ServiceResponse<NetworkAclOutboundRuleResponse>, NetworkAclOutboundRuleResponse>() {
            @Override
            public NetworkAclOutboundRuleResponse call(ServiceResponse<NetworkAclOutboundRuleResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL의 Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclOutboundRuleResponse object
     */
    public Observable<ServiceResponse<NetworkAclOutboundRuleResponse>> addOutboundRuleWithServiceResponseAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        if (networkAclRuleListNpriority == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNpriority is required and cannot be null.");
        }
        if (networkAclRuleListNprotocolTypeCode == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNprotocolTypeCode is required and cannot be null.");
        }
        if (networkAclRuleListNipBlock == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNipBlock is required and cannot be null.");
        }
        if (networkAclRuleListNruleActionCode == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNruleActionCode is required and cannot be null.");
        }
        final String regionCode = null;
        final String networkAclRuleListNportRange = null;
        final String networkAclRuleListNnetworkAclRuleDescription = null;
        return service.addOutboundRule(responseFormatType, regionCode, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNportRange, networkAclRuleListNruleActionCode, networkAclRuleListNnetworkAclRuleDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclOutboundRuleResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclOutboundRuleResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclOutboundRuleResponse> clientResponse = addOutboundRuleDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 네트워크 ACL의 Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param networkAclRuleListNnetworkAclRuleDescription 네트워크 ACL Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclOutboundRuleResponse object if successful.
     */
    public NetworkAclOutboundRuleResponse addOutboundRule(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, String networkAclRuleListNnetworkAclRuleDescription) {
        return addOutboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode, regionCode, networkAclRuleListNportRange, networkAclRuleListNnetworkAclRuleDescription).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL의 Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param networkAclRuleListNnetworkAclRuleDescription 네트워크 ACL Rule 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclOutboundRuleResponse> addOutboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, String networkAclRuleListNnetworkAclRuleDescription, final ServiceCallback<NetworkAclOutboundRuleResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addOutboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode, regionCode, networkAclRuleListNportRange, networkAclRuleListNnetworkAclRuleDescription), serviceCallback);
    }

    /**
     * 네트워크 ACL의 Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param networkAclRuleListNnetworkAclRuleDescription 네트워크 ACL Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclOutboundRuleResponse object
     */
    public Observable<NetworkAclOutboundRuleResponse> addOutboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, String networkAclRuleListNnetworkAclRuleDescription) {
        return addOutboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode, regionCode, networkAclRuleListNportRange, networkAclRuleListNnetworkAclRuleDescription).map(new Func1<ServiceResponse<NetworkAclOutboundRuleResponse>, NetworkAclOutboundRuleResponse>() {
            @Override
            public NetworkAclOutboundRuleResponse call(ServiceResponse<NetworkAclOutboundRuleResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL의 Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param networkAclRuleListNnetworkAclRuleDescription 네트워크 ACL Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclOutboundRuleResponse object
     */
    public Observable<ServiceResponse<NetworkAclOutboundRuleResponse>> addOutboundRuleWithServiceResponseAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, String networkAclRuleListNnetworkAclRuleDescription) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        if (networkAclRuleListNpriority == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNpriority is required and cannot be null.");
        }
        if (networkAclRuleListNprotocolTypeCode == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNprotocolTypeCode is required and cannot be null.");
        }
        if (networkAclRuleListNipBlock == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNipBlock is required and cannot be null.");
        }
        if (networkAclRuleListNruleActionCode == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNruleActionCode is required and cannot be null.");
        }
        return service.addOutboundRule(responseFormatType, regionCode, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNportRange, networkAclRuleListNruleActionCode, networkAclRuleListNnetworkAclRuleDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclOutboundRuleResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclOutboundRuleResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclOutboundRuleResponse> clientResponse = addOutboundRuleDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkAclOutboundRuleResponse> addOutboundRuleDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkAclOutboundRuleResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkAclOutboundRuleResponse>() { }.getType())
                .build(response);
    }

    /**
     * 네트워크 ACL의 Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclInboundRuleResponse object if successful.
     */
    public NetworkAclInboundRuleResponse removeInboundRule(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode) {
        return removeInboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL의 Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclInboundRuleResponse> removeInboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, final ServiceCallback<NetworkAclInboundRuleResponse> serviceCallback) {
        return ServiceFuture.fromResponse(removeInboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode), serviceCallback);
    }

    /**
     * 네트워크 ACL의 Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclInboundRuleResponse object
     */
    public Observable<NetworkAclInboundRuleResponse> removeInboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode) {
        return removeInboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode).map(new Func1<ServiceResponse<NetworkAclInboundRuleResponse>, NetworkAclInboundRuleResponse>() {
            @Override
            public NetworkAclInboundRuleResponse call(ServiceResponse<NetworkAclInboundRuleResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL의 Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclInboundRuleResponse object
     */
    public Observable<ServiceResponse<NetworkAclInboundRuleResponse>> removeInboundRuleWithServiceResponseAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        if (networkAclRuleListNpriority == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNpriority is required and cannot be null.");
        }
        if (networkAclRuleListNprotocolTypeCode == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNprotocolTypeCode is required and cannot be null.");
        }
        if (networkAclRuleListNipBlock == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNipBlock is required and cannot be null.");
        }
        if (networkAclRuleListNruleActionCode == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNruleActionCode is required and cannot be null.");
        }
        final String regionCode = null;
        final String networkAclRuleListNportRange = null;
        return service.removeInboundRule(responseFormatType, regionCode, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNportRange, networkAclRuleListNruleActionCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclInboundRuleResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclInboundRuleResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclInboundRuleResponse> clientResponse = removeInboundRuleDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 네트워크 ACL의 Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclInboundRuleResponse object if successful.
     */
    public NetworkAclInboundRuleResponse removeInboundRule(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange) {
        return removeInboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode, regionCode, networkAclRuleListNportRange).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL의 Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclInboundRuleResponse> removeInboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, final ServiceCallback<NetworkAclInboundRuleResponse> serviceCallback) {
        return ServiceFuture.fromResponse(removeInboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode, regionCode, networkAclRuleListNportRange), serviceCallback);
    }

    /**
     * 네트워크 ACL의 Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclInboundRuleResponse object
     */
    public Observable<NetworkAclInboundRuleResponse> removeInboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange) {
        return removeInboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode, regionCode, networkAclRuleListNportRange).map(new Func1<ServiceResponse<NetworkAclInboundRuleResponse>, NetworkAclInboundRuleResponse>() {
            @Override
            public NetworkAclInboundRuleResponse call(ServiceResponse<NetworkAclInboundRuleResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL의 Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclInboundRuleResponse object
     */
    public Observable<ServiceResponse<NetworkAclInboundRuleResponse>> removeInboundRuleWithServiceResponseAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        if (networkAclRuleListNpriority == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNpriority is required and cannot be null.");
        }
        if (networkAclRuleListNprotocolTypeCode == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNprotocolTypeCode is required and cannot be null.");
        }
        if (networkAclRuleListNipBlock == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNipBlock is required and cannot be null.");
        }
        if (networkAclRuleListNruleActionCode == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNruleActionCode is required and cannot be null.");
        }
        return service.removeInboundRule(responseFormatType, regionCode, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNportRange, networkAclRuleListNruleActionCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclInboundRuleResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclInboundRuleResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclInboundRuleResponse> clientResponse = removeInboundRuleDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkAclInboundRuleResponse> removeInboundRuleDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkAclInboundRuleResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkAclInboundRuleResponse>() { }.getType())
                .build(response);
    }

    /**
     * 네트워크 ACL의 Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclOutboundRuleResponse object if successful.
     */
    public NetworkAclOutboundRuleResponse removeOutboundRule(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode) {
        return removeOutboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL의 Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclOutboundRuleResponse> removeOutboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, final ServiceCallback<NetworkAclOutboundRuleResponse> serviceCallback) {
        return ServiceFuture.fromResponse(removeOutboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode), serviceCallback);
    }

    /**
     * 네트워크 ACL의 Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclOutboundRuleResponse object
     */
    public Observable<NetworkAclOutboundRuleResponse> removeOutboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode) {
        return removeOutboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode).map(new Func1<ServiceResponse<NetworkAclOutboundRuleResponse>, NetworkAclOutboundRuleResponse>() {
            @Override
            public NetworkAclOutboundRuleResponse call(ServiceResponse<NetworkAclOutboundRuleResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL의 Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclOutboundRuleResponse object
     */
    public Observable<ServiceResponse<NetworkAclOutboundRuleResponse>> removeOutboundRuleWithServiceResponseAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        if (networkAclRuleListNpriority == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNpriority is required and cannot be null.");
        }
        if (networkAclRuleListNprotocolTypeCode == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNprotocolTypeCode is required and cannot be null.");
        }
        if (networkAclRuleListNipBlock == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNipBlock is required and cannot be null.");
        }
        if (networkAclRuleListNruleActionCode == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNruleActionCode is required and cannot be null.");
        }
        final String regionCode = null;
        final String networkAclRuleListNportRange = null;
        return service.removeOutboundRule(responseFormatType, regionCode, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNportRange, networkAclRuleListNruleActionCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclOutboundRuleResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclOutboundRuleResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclOutboundRuleResponse> clientResponse = removeOutboundRuleDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 네트워크 ACL의 Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclOutboundRuleResponse object if successful.
     */
    public NetworkAclOutboundRuleResponse removeOutboundRule(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange) {
        return removeOutboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode, regionCode, networkAclRuleListNportRange).toBlocking().single().body();
    }

    /**
     * 네트워크 ACL의 Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkAclOutboundRuleResponse> removeOutboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, final ServiceCallback<NetworkAclOutboundRuleResponse> serviceCallback) {
        return ServiceFuture.fromResponse(removeOutboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode, regionCode, networkAclRuleListNportRange), serviceCallback);
    }

    /**
     * 네트워크 ACL의 Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclOutboundRuleResponse object
     */
    public Observable<NetworkAclOutboundRuleResponse> removeOutboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange) {
        return removeOutboundRuleWithServiceResponseAsync(responseFormatType, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNruleActionCode, regionCode, networkAclRuleListNportRange).map(new Func1<ServiceResponse<NetworkAclOutboundRuleResponse>, NetworkAclOutboundRuleResponse>() {
            @Override
            public NetworkAclOutboundRuleResponse call(ServiceResponse<NetworkAclOutboundRuleResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 네트워크 ACL의 Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclOutboundRuleResponse object
     */
    public Observable<ServiceResponse<NetworkAclOutboundRuleResponse>> removeOutboundRuleWithServiceResponseAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (networkAclNo == null) {
            throw new IllegalArgumentException("Parameter networkAclNo is required and cannot be null.");
        }
        if (networkAclRuleListNpriority == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNpriority is required and cannot be null.");
        }
        if (networkAclRuleListNprotocolTypeCode == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNprotocolTypeCode is required and cannot be null.");
        }
        if (networkAclRuleListNipBlock == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNipBlock is required and cannot be null.");
        }
        if (networkAclRuleListNruleActionCode == null) {
            throw new IllegalArgumentException("Parameter networkAclRuleListNruleActionCode is required and cannot be null.");
        }
        return service.removeOutboundRule(responseFormatType, regionCode, networkAclNo, networkAclRuleListNpriority, networkAclRuleListNprotocolTypeCode, networkAclRuleListNipBlock, networkAclRuleListNportRange, networkAclRuleListNruleActionCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkAclOutboundRuleResponse>>>() {
                @Override
                public Observable<ServiceResponse<NetworkAclOutboundRuleResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkAclOutboundRuleResponse> clientResponse = removeOutboundRuleDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkAclOutboundRuleResponse> removeOutboundRuleDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkAclOutboundRuleResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkAclOutboundRuleResponse>() { }.getType())
                .build(response);
    }

}
