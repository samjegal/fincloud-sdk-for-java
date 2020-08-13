/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.implementation;

import retrofit2.Retrofit;
import com.fincloud.server.ACGs;
import com.fincloud.server.models.AccessControlGroupDetailResponse;
import com.fincloud.server.models.AccessControlGroupListResponse;
import com.fincloud.server.models.AccessControlGroupResponse;
import com.fincloud.server.models.AccessControlGroupRuleListResponse;
import com.fincloud.server.models.AccessControlGroupRuleTypeCode;
import com.fincloud.server.models.AccessControlGroupStatusCode;
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
 * in ACGs.
 */
public class ACGsImpl implements ACGs {
    /** The Retrofit service to perform REST calls. */
    private ACGsService service;
    /** The service client containing this operation class. */
    private ServerManagementClientImpl client;

    /**
     * Initializes an instance of ACGs.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ACGsImpl(Retrofit retrofit, ServerManagementClientImpl client) {
        this.service = retrofit.create(ACGsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ACGs to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ACGsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.ACGs getList" })
        @GET("vserver/v2/getAccessControlGroupList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("accessControlGroupNoList.N") String accessControlGroupNoListN, @Query("accessControlGroupName") String accessControlGroupName, @Query("accessControlGroupStatusCode") AccessControlGroupStatusCode accessControlGroupStatusCode1, @Query("pageNo") String pageNo, @Query("pageSize") String pageSize, @Query("vpcNo") String vpcNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.ACGs getDetail" })
        @GET("vserver/v2/getAccessControlGroupDetail")
        Observable<Response<ResponseBody>> getDetail(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("accessControlGroupNo") String accessControlGroupNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.ACGs create" })
        @POST("vserver/v2/createAccessControlGroup")
        Observable<Response<ResponseBody>> create(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcNo") String vpcNo, @Query("accessControlGroupName") String accessControlGroupName, @Query("accessControlGroupDescription") String accessControlGroupDescription);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.ACGs delete" })
        @POST("vserver/v2/deleteAccessControlGroup")
        Observable<Response<ResponseBody>> delete(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcNo") String vpcNo, @Query("accessControlGroupNo") String accessControlGroupNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.ACGs getRuleList" })
        @POST("vserver/v2/getAccessControlGroupRuleList")
        Observable<Response<ResponseBody>> getRuleList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("accessControlGroupNo") String accessControlGroupNo, @Query("accessControlGroupRuleTypeCode") AccessControlGroupRuleTypeCode accessControlGroupRuleTypeCode1);

    }

    /**
     * ACG 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupListResponse object if successful.
     */
    public AccessControlGroupListResponse getList(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * ACG 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessControlGroupListResponse> getListAsync(String responseFormatType, final ServiceCallback<AccessControlGroupListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * ACG 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupListResponse object
     */
    public Observable<AccessControlGroupListResponse> getListAsync(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<AccessControlGroupListResponse>, AccessControlGroupListResponse>() {
            @Override
            public AccessControlGroupListResponse call(ServiceResponse<AccessControlGroupListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * ACG 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupListResponse object
     */
    public Observable<ServiceResponse<AccessControlGroupListResponse>> getListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String accessControlGroupNoListN = null;
        final String accessControlGroupName = null;
        final AccessControlGroupStatusCode accessControlGroupStatusCode = null;
        final String pageNo = null;
        final String pageSize = null;
        final String vpcNo = null;
        return service.getList(responseFormatType, regionCode, accessControlGroupNoListN, accessControlGroupName, accessControlGroupStatusCode, pageNo, pageSize, vpcNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessControlGroupListResponse>>>() {
                @Override
                public Observable<ServiceResponse<AccessControlGroupListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessControlGroupListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * ACG 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param accessControlGroupName ACG 이름
     * @param accessControlGroupStatusCode ACG 상태 코드. Possible values include: 'INIT', 'SET', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupListResponse object if successful.
     */
    public AccessControlGroupListResponse getList(String responseFormatType, String regionCode, String accessControlGroupNoListN, String accessControlGroupName, AccessControlGroupStatusCode accessControlGroupStatusCode, String pageNo, String pageSize, String vpcNo) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, accessControlGroupNoListN, accessControlGroupName, accessControlGroupStatusCode, pageNo, pageSize, vpcNo).toBlocking().single().body();
    }

    /**
     * ACG 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param accessControlGroupName ACG 이름
     * @param accessControlGroupStatusCode ACG 상태 코드. Possible values include: 'INIT', 'SET', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessControlGroupListResponse> getListAsync(String responseFormatType, String regionCode, String accessControlGroupNoListN, String accessControlGroupName, AccessControlGroupStatusCode accessControlGroupStatusCode, String pageNo, String pageSize, String vpcNo, final ServiceCallback<AccessControlGroupListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, regionCode, accessControlGroupNoListN, accessControlGroupName, accessControlGroupStatusCode, pageNo, pageSize, vpcNo), serviceCallback);
    }

    /**
     * ACG 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param accessControlGroupName ACG 이름
     * @param accessControlGroupStatusCode ACG 상태 코드. Possible values include: 'INIT', 'SET', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupListResponse object
     */
    public Observable<AccessControlGroupListResponse> getListAsync(String responseFormatType, String regionCode, String accessControlGroupNoListN, String accessControlGroupName, AccessControlGroupStatusCode accessControlGroupStatusCode, String pageNo, String pageSize, String vpcNo) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, accessControlGroupNoListN, accessControlGroupName, accessControlGroupStatusCode, pageNo, pageSize, vpcNo).map(new Func1<ServiceResponse<AccessControlGroupListResponse>, AccessControlGroupListResponse>() {
            @Override
            public AccessControlGroupListResponse call(ServiceResponse<AccessControlGroupListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * ACG 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param accessControlGroupName ACG 이름
     * @param accessControlGroupStatusCode ACG 상태 코드. Possible values include: 'INIT', 'SET', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupListResponse object
     */
    public Observable<ServiceResponse<AccessControlGroupListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String accessControlGroupNoListN, String accessControlGroupName, AccessControlGroupStatusCode accessControlGroupStatusCode, String pageNo, String pageSize, String vpcNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, accessControlGroupNoListN, accessControlGroupName, accessControlGroupStatusCode, pageNo, pageSize, vpcNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessControlGroupListResponse>>>() {
                @Override
                public Observable<ServiceResponse<AccessControlGroupListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessControlGroupListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AccessControlGroupListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AccessControlGroupListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AccessControlGroupListResponse>() { }.getType())
                .build(response);
    }

    /**
     * ACG 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupDetailResponse object if successful.
     */
    public AccessControlGroupDetailResponse getDetail(String responseFormatType, String accessControlGroupNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, accessControlGroupNo).toBlocking().single().body();
    }

    /**
     * ACG 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessControlGroupDetailResponse> getDetailAsync(String responseFormatType, String accessControlGroupNo, final ServiceCallback<AccessControlGroupDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, accessControlGroupNo), serviceCallback);
    }

    /**
     * ACG 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupDetailResponse object
     */
    public Observable<AccessControlGroupDetailResponse> getDetailAsync(String responseFormatType, String accessControlGroupNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, accessControlGroupNo).map(new Func1<ServiceResponse<AccessControlGroupDetailResponse>, AccessControlGroupDetailResponse>() {
            @Override
            public AccessControlGroupDetailResponse call(ServiceResponse<AccessControlGroupDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * ACG 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupDetailResponse object
     */
    public Observable<ServiceResponse<AccessControlGroupDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String accessControlGroupNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (accessControlGroupNo == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.getDetail(responseFormatType, regionCode, accessControlGroupNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessControlGroupDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<AccessControlGroupDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessControlGroupDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * ACG 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupDetailResponse object if successful.
     */
    public AccessControlGroupDetailResponse getDetail(String responseFormatType, String accessControlGroupNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, accessControlGroupNo, regionCode).toBlocking().single().body();
    }

    /**
     * ACG 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessControlGroupDetailResponse> getDetailAsync(String responseFormatType, String accessControlGroupNo, String regionCode, final ServiceCallback<AccessControlGroupDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, accessControlGroupNo, regionCode), serviceCallback);
    }

    /**
     * ACG 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupDetailResponse object
     */
    public Observable<AccessControlGroupDetailResponse> getDetailAsync(String responseFormatType, String accessControlGroupNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, accessControlGroupNo, regionCode).map(new Func1<ServiceResponse<AccessControlGroupDetailResponse>, AccessControlGroupDetailResponse>() {
            @Override
            public AccessControlGroupDetailResponse call(ServiceResponse<AccessControlGroupDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * ACG 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupDetailResponse object
     */
    public Observable<ServiceResponse<AccessControlGroupDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String accessControlGroupNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (accessControlGroupNo == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupNo is required and cannot be null.");
        }
        return service.getDetail(responseFormatType, regionCode, accessControlGroupNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessControlGroupDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<AccessControlGroupDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessControlGroupDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AccessControlGroupDetailResponse> getDetailDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AccessControlGroupDetailResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AccessControlGroupDetailResponse>() { }.getType())
                .build(response);
    }

    /**
     * ACG를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupResponse object if successful.
     */
    public AccessControlGroupResponse create(String responseFormatType, String vpcNo) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo).toBlocking().single().body();
    }

    /**
     * ACG를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessControlGroupResponse> createAsync(String responseFormatType, String vpcNo, final ServiceCallback<AccessControlGroupResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, vpcNo), serviceCallback);
    }

    /**
     * ACG를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupResponse object
     */
    public Observable<AccessControlGroupResponse> createAsync(String responseFormatType, String vpcNo) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo).map(new Func1<ServiceResponse<AccessControlGroupResponse>, AccessControlGroupResponse>() {
            @Override
            public AccessControlGroupResponse call(ServiceResponse<AccessControlGroupResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * ACG를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupResponse object
     */
    public Observable<ServiceResponse<AccessControlGroupResponse>> createWithServiceResponseAsync(String responseFormatType, String vpcNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        final String regionCode = null;
        final String accessControlGroupName = null;
        final String accessControlGroupDescription = null;
        return service.create(responseFormatType, regionCode, vpcNo, accessControlGroupName, accessControlGroupDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessControlGroupResponse>>>() {
                @Override
                public Observable<ServiceResponse<AccessControlGroupResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessControlGroupResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * ACG를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param accessControlGroupName ACG 이름
     * @param accessControlGroupDescription ACG 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupResponse object if successful.
     */
    public AccessControlGroupResponse create(String responseFormatType, String vpcNo, String regionCode, String accessControlGroupName, String accessControlGroupDescription) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo, regionCode, accessControlGroupName, accessControlGroupDescription).toBlocking().single().body();
    }

    /**
     * ACG를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param accessControlGroupName ACG 이름
     * @param accessControlGroupDescription ACG 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessControlGroupResponse> createAsync(String responseFormatType, String vpcNo, String regionCode, String accessControlGroupName, String accessControlGroupDescription, final ServiceCallback<AccessControlGroupResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, vpcNo, regionCode, accessControlGroupName, accessControlGroupDescription), serviceCallback);
    }

    /**
     * ACG를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param accessControlGroupName ACG 이름
     * @param accessControlGroupDescription ACG 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupResponse object
     */
    public Observable<AccessControlGroupResponse> createAsync(String responseFormatType, String vpcNo, String regionCode, String accessControlGroupName, String accessControlGroupDescription) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo, regionCode, accessControlGroupName, accessControlGroupDescription).map(new Func1<ServiceResponse<AccessControlGroupResponse>, AccessControlGroupResponse>() {
            @Override
            public AccessControlGroupResponse call(ServiceResponse<AccessControlGroupResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * ACG를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param accessControlGroupName ACG 이름
     * @param accessControlGroupDescription ACG 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupResponse object
     */
    public Observable<ServiceResponse<AccessControlGroupResponse>> createWithServiceResponseAsync(String responseFormatType, String vpcNo, String regionCode, String accessControlGroupName, String accessControlGroupDescription) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        return service.create(responseFormatType, regionCode, vpcNo, accessControlGroupName, accessControlGroupDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessControlGroupResponse>>>() {
                @Override
                public Observable<ServiceResponse<AccessControlGroupResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessControlGroupResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AccessControlGroupResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AccessControlGroupResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AccessControlGroupResponse>() { }.getType())
                .build(response);
    }

    /**
     * ACG를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupResponse object if successful.
     */
    public AccessControlGroupResponse delete(String responseFormatType, String vpcNo, String accessControlGroupNo) {
        return deleteWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo).toBlocking().single().body();
    }

    /**
     * ACG를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessControlGroupResponse> deleteAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, final ServiceCallback<AccessControlGroupResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo), serviceCallback);
    }

    /**
     * ACG를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupResponse object
     */
    public Observable<AccessControlGroupResponse> deleteAsync(String responseFormatType, String vpcNo, String accessControlGroupNo) {
        return deleteWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo).map(new Func1<ServiceResponse<AccessControlGroupResponse>, AccessControlGroupResponse>() {
            @Override
            public AccessControlGroupResponse call(ServiceResponse<AccessControlGroupResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * ACG를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupResponse object
     */
    public Observable<ServiceResponse<AccessControlGroupResponse>> deleteWithServiceResponseAsync(String responseFormatType, String vpcNo, String accessControlGroupNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (accessControlGroupNo == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.delete(responseFormatType, regionCode, vpcNo, accessControlGroupNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessControlGroupResponse>>>() {
                @Override
                public Observable<ServiceResponse<AccessControlGroupResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessControlGroupResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * ACG를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupResponse object if successful.
     */
    public AccessControlGroupResponse delete(String responseFormatType, String vpcNo, String accessControlGroupNo, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo, regionCode).toBlocking().single().body();
    }

    /**
     * ACG를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessControlGroupResponse> deleteAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, String regionCode, final ServiceCallback<AccessControlGroupResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo, regionCode), serviceCallback);
    }

    /**
     * ACG를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupResponse object
     */
    public Observable<AccessControlGroupResponse> deleteAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, vpcNo, accessControlGroupNo, regionCode).map(new Func1<ServiceResponse<AccessControlGroupResponse>, AccessControlGroupResponse>() {
            @Override
            public AccessControlGroupResponse call(ServiceResponse<AccessControlGroupResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * ACG를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupResponse object
     */
    public Observable<ServiceResponse<AccessControlGroupResponse>> deleteWithServiceResponseAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (accessControlGroupNo == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupNo is required and cannot be null.");
        }
        return service.delete(responseFormatType, regionCode, vpcNo, accessControlGroupNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessControlGroupResponse>>>() {
                @Override
                public Observable<ServiceResponse<AccessControlGroupResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessControlGroupResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AccessControlGroupResponse> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AccessControlGroupResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AccessControlGroupResponse>() { }.getType())
                .build(response);
    }

    /**
     * ACG Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupRuleListResponse object if successful.
     */
    public AccessControlGroupRuleListResponse getRuleList(String responseFormatType, String accessControlGroupNo) {
        return getRuleListWithServiceResponseAsync(responseFormatType, accessControlGroupNo).toBlocking().single().body();
    }

    /**
     * ACG Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessControlGroupRuleListResponse> getRuleListAsync(String responseFormatType, String accessControlGroupNo, final ServiceCallback<AccessControlGroupRuleListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getRuleListWithServiceResponseAsync(responseFormatType, accessControlGroupNo), serviceCallback);
    }

    /**
     * ACG Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupRuleListResponse object
     */
    public Observable<AccessControlGroupRuleListResponse> getRuleListAsync(String responseFormatType, String accessControlGroupNo) {
        return getRuleListWithServiceResponseAsync(responseFormatType, accessControlGroupNo).map(new Func1<ServiceResponse<AccessControlGroupRuleListResponse>, AccessControlGroupRuleListResponse>() {
            @Override
            public AccessControlGroupRuleListResponse call(ServiceResponse<AccessControlGroupRuleListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * ACG Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupRuleListResponse object
     */
    public Observable<ServiceResponse<AccessControlGroupRuleListResponse>> getRuleListWithServiceResponseAsync(String responseFormatType, String accessControlGroupNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (accessControlGroupNo == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupNo is required and cannot be null.");
        }
        final String regionCode = null;
        final AccessControlGroupRuleTypeCode accessControlGroupRuleTypeCode = null;
        return service.getRuleList(responseFormatType, regionCode, accessControlGroupNo, accessControlGroupRuleTypeCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessControlGroupRuleListResponse>>>() {
                @Override
                public Observable<ServiceResponse<AccessControlGroupRuleListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessControlGroupRuleListResponse> clientResponse = getRuleListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * ACG Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleTypeCode ACG Rule 유형 코드. Possible values include: 'INBND', 'OTBND'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupRuleListResponse object if successful.
     */
    public AccessControlGroupRuleListResponse getRuleList(String responseFormatType, String accessControlGroupNo, String regionCode, AccessControlGroupRuleTypeCode accessControlGroupRuleTypeCode) {
        return getRuleListWithServiceResponseAsync(responseFormatType, accessControlGroupNo, regionCode, accessControlGroupRuleTypeCode).toBlocking().single().body();
    }

    /**
     * ACG Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleTypeCode ACG Rule 유형 코드. Possible values include: 'INBND', 'OTBND'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessControlGroupRuleListResponse> getRuleListAsync(String responseFormatType, String accessControlGroupNo, String regionCode, AccessControlGroupRuleTypeCode accessControlGroupRuleTypeCode, final ServiceCallback<AccessControlGroupRuleListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getRuleListWithServiceResponseAsync(responseFormatType, accessControlGroupNo, regionCode, accessControlGroupRuleTypeCode), serviceCallback);
    }

    /**
     * ACG Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleTypeCode ACG Rule 유형 코드. Possible values include: 'INBND', 'OTBND'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupRuleListResponse object
     */
    public Observable<AccessControlGroupRuleListResponse> getRuleListAsync(String responseFormatType, String accessControlGroupNo, String regionCode, AccessControlGroupRuleTypeCode accessControlGroupRuleTypeCode) {
        return getRuleListWithServiceResponseAsync(responseFormatType, accessControlGroupNo, regionCode, accessControlGroupRuleTypeCode).map(new Func1<ServiceResponse<AccessControlGroupRuleListResponse>, AccessControlGroupRuleListResponse>() {
            @Override
            public AccessControlGroupRuleListResponse call(ServiceResponse<AccessControlGroupRuleListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * ACG Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleTypeCode ACG Rule 유형 코드. Possible values include: 'INBND', 'OTBND'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupRuleListResponse object
     */
    public Observable<ServiceResponse<AccessControlGroupRuleListResponse>> getRuleListWithServiceResponseAsync(String responseFormatType, String accessControlGroupNo, String regionCode, AccessControlGroupRuleTypeCode accessControlGroupRuleTypeCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (accessControlGroupNo == null) {
            throw new IllegalArgumentException("Parameter accessControlGroupNo is required and cannot be null.");
        }
        return service.getRuleList(responseFormatType, regionCode, accessControlGroupNo, accessControlGroupRuleTypeCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AccessControlGroupRuleListResponse>>>() {
                @Override
                public Observable<ServiceResponse<AccessControlGroupRuleListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AccessControlGroupRuleListResponse> clientResponse = getRuleListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AccessControlGroupRuleListResponse> getRuleListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AccessControlGroupRuleListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AccessControlGroupRuleListResponse>() { }.getType())
                .build(response);
    }

}
