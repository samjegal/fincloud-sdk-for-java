/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.implementation;

import retrofit2.Retrofit;
import com.fincloud.server.ACGInbounds;
import com.fincloud.server.models.AccessControlGroupInboundRuleResponse;
import com.fincloud.server.models.ProtocolTypeCode;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ACGInbounds.
 */
public class ACGInboundsImpl implements ACGInbounds {
    /** The Retrofit service to perform REST calls. */
    private ACGInboundsService service;
    /** The service client containing this operation class. */
    private ServerManagementClientImpl client;

    /**
     * Initializes an instance of ACGInbounds.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ACGInboundsImpl(Retrofit retrofit, ServerManagementClientImpl client) {
        this.service = retrofit.create(ACGInboundsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ACGInbounds to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ACGInboundsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.ACGInbounds addRule" })
        @POST("vserver/v2/addAccessControlGroupInboundRule")
        Observable<Response<ResponseBody>> addRule(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcNo") String vpcNo, @Query("accessControlGroupNo") String accessControlGroupNo, @Query("accessControlGroupRuleList.N.protocolTypeCode") ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, @Query("accessControlGroupRuleList.N.ipBlock") String accessControlGroupRuleListNipBlock, @Query("accessControlGroupRuleList.N.accessControlGroupSequence") String accessControlGroupRuleListNaccessControlGroupSequence, @Query("accessControlGroupRuleList.N.portRange") String accessControlGroupRuleListNportRange, @Query("accessControlGroupRuleList.N.accessControlGroupRuleDescription") String accessControlGroupRuleListNaccessControlGroupRuleDescription);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.ACGInbounds removeRule" })
        @POST("vserver/v2/removeAccessControlGroupInboundRule")
        Observable<Response<ResponseBody>> removeRule(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcNo") String vpcNo, @Query("accessControlGroupNo") String accessControlGroupNo, @Query("accessControlGroupRuleList.N.protocolTypeCode") ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, @Query("accessControlGroupRuleList.N.ipBlock") String accessControlGroupRuleListNipBlock, @Query("accessControlGroupRuleList.N.accessControlGroupSequence") String accessControlGroupRuleListNaccessControlGroupSequence, @Query("accessControlGroupRuleList.N.portRange") String accessControlGroupRuleListNportRange);

    }

    /**
     * ACG Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupInboundRuleResponse object if successful.
     */
    public AccessControlGroupInboundRuleResponse addRule(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode) {
        return addRuleWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo, accessControlGroupRuleListNprotocolTypeCode).toBlocking().single().body();
    }

    /**
     * ACG Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessControlGroupInboundRuleResponse> addRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, final ServiceCallback<AccessControlGroupInboundRuleResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addRuleWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo, accessControlGroupRuleListNprotocolTypeCode), serviceCallback);
    }

    /**
     * ACG Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupInboundRuleResponse object
     */
    public Observable<AccessControlGroupInboundRuleResponse> addRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode) {
        return addRuleWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo, accessControlGroupRuleListNprotocolTypeCode).map(new Func1<ServiceResponse<AccessControlGroupInboundRuleResponse>, AccessControlGroupInboundRuleResponse>() {
            @Override
            public AccessControlGroupInboundRuleResponse call(ServiceResponse<AccessControlGroupInboundRuleResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * ACG Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupInboundRuleResponse object
     */
    public Observable<ServiceResponse<AccessControlGroupInboundRuleResponse>> addRuleWithServiceResponseAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (accessControlGroupNo == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupNo is required and cannot be null.");
        }
        if (accessControlGroupRuleListNprotocolTypeCode == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupRuleListNprotocolTypeCode is required and cannot be null.");
        }
        final String regionCode = null;
        final String accessControlGroupRuleListNipBlock = null;
        final String accessControlGroupRuleListNaccessControlGroupSequence = null;
        final String accessControlGroupRuleListNportRange = null;
        final String accessControlGroupRuleListNaccessControlGroupRuleDescription = null;
        return service.addRule(responseFormatType, regionCode, vpcNo, accessControlGroupNo, accessControlGroupRuleListNprotocolTypeCode, accessControlGroupRuleListNipBlock, accessControlGroupRuleListNaccessControlGroupSequence, accessControlGroupRuleListNportRange, accessControlGroupRuleListNaccessControlGroupRuleDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessControlGroupInboundRuleResponse>>>() {
                @Override
                public Observable<ServiceResponse<AccessControlGroupInboundRuleResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessControlGroupInboundRuleResponse> clientResponse = addRuleDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * ACG Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleListNipBlock IP 블록
     * @param accessControlGroupRuleListNaccessControlGroupSequence 접근 소스 ACG
     * @param accessControlGroupRuleListNportRange 포트 범위
     * @param accessControlGroupRuleListNaccessControlGroupRuleDescription ACG Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupInboundRuleResponse object if successful.
     */
    public AccessControlGroupInboundRuleResponse addRule(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange, String accessControlGroupRuleListNaccessControlGroupRuleDescription) {
        return addRuleWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo, accessControlGroupRuleListNprotocolTypeCode, regionCode, accessControlGroupRuleListNipBlock, accessControlGroupRuleListNaccessControlGroupSequence, accessControlGroupRuleListNportRange, accessControlGroupRuleListNaccessControlGroupRuleDescription).toBlocking().single().body();
    }

    /**
     * ACG Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleListNipBlock IP 블록
     * @param accessControlGroupRuleListNaccessControlGroupSequence 접근 소스 ACG
     * @param accessControlGroupRuleListNportRange 포트 범위
     * @param accessControlGroupRuleListNaccessControlGroupRuleDescription ACG Rule 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessControlGroupInboundRuleResponse> addRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange, String accessControlGroupRuleListNaccessControlGroupRuleDescription, final ServiceCallback<AccessControlGroupInboundRuleResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addRuleWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo, accessControlGroupRuleListNprotocolTypeCode, regionCode, accessControlGroupRuleListNipBlock, accessControlGroupRuleListNaccessControlGroupSequence, accessControlGroupRuleListNportRange, accessControlGroupRuleListNaccessControlGroupRuleDescription), serviceCallback);
    }

    /**
     * ACG Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleListNipBlock IP 블록
     * @param accessControlGroupRuleListNaccessControlGroupSequence 접근 소스 ACG
     * @param accessControlGroupRuleListNportRange 포트 범위
     * @param accessControlGroupRuleListNaccessControlGroupRuleDescription ACG Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupInboundRuleResponse object
     */
    public Observable<AccessControlGroupInboundRuleResponse> addRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange, String accessControlGroupRuleListNaccessControlGroupRuleDescription) {
        return addRuleWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo, accessControlGroupRuleListNprotocolTypeCode, regionCode, accessControlGroupRuleListNipBlock, accessControlGroupRuleListNaccessControlGroupSequence, accessControlGroupRuleListNportRange, accessControlGroupRuleListNaccessControlGroupRuleDescription).map(new Func1<ServiceResponse<AccessControlGroupInboundRuleResponse>, AccessControlGroupInboundRuleResponse>() {
            @Override
            public AccessControlGroupInboundRuleResponse call(ServiceResponse<AccessControlGroupInboundRuleResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * ACG Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleListNipBlock IP 블록
     * @param accessControlGroupRuleListNaccessControlGroupSequence 접근 소스 ACG
     * @param accessControlGroupRuleListNportRange 포트 범위
     * @param accessControlGroupRuleListNaccessControlGroupRuleDescription ACG Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupInboundRuleResponse object
     */
    public Observable<ServiceResponse<AccessControlGroupInboundRuleResponse>> addRuleWithServiceResponseAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange, String accessControlGroupRuleListNaccessControlGroupRuleDescription) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (accessControlGroupNo == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupNo is required and cannot be null.");
        }
        if (accessControlGroupRuleListNprotocolTypeCode == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupRuleListNprotocolTypeCode is required and cannot be null.");
        }
        return service.addRule(responseFormatType, regionCode, vpcNo, accessControlGroupNo, accessControlGroupRuleListNprotocolTypeCode, accessControlGroupRuleListNipBlock, accessControlGroupRuleListNaccessControlGroupSequence, accessControlGroupRuleListNportRange, accessControlGroupRuleListNaccessControlGroupRuleDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessControlGroupInboundRuleResponse>>>() {
                @Override
                public Observable<ServiceResponse<AccessControlGroupInboundRuleResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessControlGroupInboundRuleResponse> clientResponse = addRuleDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AccessControlGroupInboundRuleResponse> addRuleDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AccessControlGroupInboundRuleResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AccessControlGroupInboundRuleResponse>() { }.getType())
                .build(response);
    }

    /**
     * ACG Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupInboundRuleResponse object if successful.
     */
    public AccessControlGroupInboundRuleResponse removeRule(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode) {
        return removeRuleWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo, accessControlGroupRuleListNprotocolTypeCode).toBlocking().single().body();
    }

    /**
     * ACG Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessControlGroupInboundRuleResponse> removeRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, final ServiceCallback<AccessControlGroupInboundRuleResponse> serviceCallback) {
        return ServiceFuture.fromResponse(removeRuleWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo, accessControlGroupRuleListNprotocolTypeCode), serviceCallback);
    }

    /**
     * ACG Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupInboundRuleResponse object
     */
    public Observable<AccessControlGroupInboundRuleResponse> removeRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode) {
        return removeRuleWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo, accessControlGroupRuleListNprotocolTypeCode).map(new Func1<ServiceResponse<AccessControlGroupInboundRuleResponse>, AccessControlGroupInboundRuleResponse>() {
            @Override
            public AccessControlGroupInboundRuleResponse call(ServiceResponse<AccessControlGroupInboundRuleResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * ACG Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupInboundRuleResponse object
     */
    public Observable<ServiceResponse<AccessControlGroupInboundRuleResponse>> removeRuleWithServiceResponseAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (accessControlGroupNo == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupNo is required and cannot be null.");
        }
        if (accessControlGroupRuleListNprotocolTypeCode == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupRuleListNprotocolTypeCode is required and cannot be null.");
        }
        final String regionCode = null;
        final String accessControlGroupRuleListNipBlock = null;
        final String accessControlGroupRuleListNaccessControlGroupSequence = null;
        final String accessControlGroupRuleListNportRange = null;
        return service.removeRule(responseFormatType, regionCode, vpcNo, accessControlGroupNo, accessControlGroupRuleListNprotocolTypeCode, accessControlGroupRuleListNipBlock, accessControlGroupRuleListNaccessControlGroupSequence, accessControlGroupRuleListNportRange)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessControlGroupInboundRuleResponse>>>() {
                @Override
                public Observable<ServiceResponse<AccessControlGroupInboundRuleResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessControlGroupInboundRuleResponse> clientResponse = removeRuleDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * ACG Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleListNipBlock IP 블록
     * @param accessControlGroupRuleListNaccessControlGroupSequence 접근 소스 ACG
     * @param accessControlGroupRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupInboundRuleResponse object if successful.
     */
    public AccessControlGroupInboundRuleResponse removeRule(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange) {
        return removeRuleWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo, accessControlGroupRuleListNprotocolTypeCode, regionCode, accessControlGroupRuleListNipBlock, accessControlGroupRuleListNaccessControlGroupSequence, accessControlGroupRuleListNportRange).toBlocking().single().body();
    }

    /**
     * ACG Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleListNipBlock IP 블록
     * @param accessControlGroupRuleListNaccessControlGroupSequence 접근 소스 ACG
     * @param accessControlGroupRuleListNportRange 포트 범위
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessControlGroupInboundRuleResponse> removeRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange, final ServiceCallback<AccessControlGroupInboundRuleResponse> serviceCallback) {
        return ServiceFuture.fromResponse(removeRuleWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo, accessControlGroupRuleListNprotocolTypeCode, regionCode, accessControlGroupRuleListNipBlock, accessControlGroupRuleListNaccessControlGroupSequence, accessControlGroupRuleListNportRange), serviceCallback);
    }

    /**
     * ACG Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleListNipBlock IP 블록
     * @param accessControlGroupRuleListNaccessControlGroupSequence 접근 소스 ACG
     * @param accessControlGroupRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupInboundRuleResponse object
     */
    public Observable<AccessControlGroupInboundRuleResponse> removeRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange) {
        return removeRuleWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo, accessControlGroupRuleListNprotocolTypeCode, regionCode, accessControlGroupRuleListNipBlock, accessControlGroupRuleListNaccessControlGroupSequence, accessControlGroupRuleListNportRange).map(new Func1<ServiceResponse<AccessControlGroupInboundRuleResponse>, AccessControlGroupInboundRuleResponse>() {
            @Override
            public AccessControlGroupInboundRuleResponse call(ServiceResponse<AccessControlGroupInboundRuleResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * ACG Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleListNipBlock IP 블록
     * @param accessControlGroupRuleListNaccessControlGroupSequence 접근 소스 ACG
     * @param accessControlGroupRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupInboundRuleResponse object
     */
    public Observable<ServiceResponse<AccessControlGroupInboundRuleResponse>> removeRuleWithServiceResponseAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (accessControlGroupNo == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupNo is required and cannot be null.");
        }
        if (accessControlGroupRuleListNprotocolTypeCode == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupRuleListNprotocolTypeCode is required and cannot be null.");
        }
        return service.removeRule(responseFormatType, regionCode, vpcNo, accessControlGroupNo, accessControlGroupRuleListNprotocolTypeCode, accessControlGroupRuleListNipBlock, accessControlGroupRuleListNaccessControlGroupSequence, accessControlGroupRuleListNportRange)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessControlGroupInboundRuleResponse>>>() {
                @Override
                public Observable<ServiceResponse<AccessControlGroupInboundRuleResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessControlGroupInboundRuleResponse> clientResponse = removeRuleDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AccessControlGroupInboundRuleResponse> removeRuleDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AccessControlGroupInboundRuleResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AccessControlGroupInboundRuleResponse>() { }.getType())
                .build(response);
    }

}
