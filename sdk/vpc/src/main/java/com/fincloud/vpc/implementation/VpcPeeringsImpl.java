/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.implementation;

import retrofit2.Retrofit;
import com.fincloud.vpc.VpcPeerings;
import com.fincloud.vpc.models.SortedBy;
import com.fincloud.vpc.models.SortingOrder;
import com.fincloud.vpc.models.VpcPeeringInstanceResponse;
import com.fincloud.vpc.models.VpcPeeringInstanceStatusCode;
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
 * in VpcPeerings.
 */
public class VpcPeeringsImpl implements VpcPeerings {
    /** The Retrofit service to perform REST calls. */
    private VpcPeeringsService service;
    /** The service client containing this operation class. */
    private VPCManagementClientImpl client;

    /**
     * Initializes an instance of VpcPeerings.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VpcPeeringsImpl(Retrofit retrofit, VPCManagementClientImpl client) {
        this.service = retrofit.create(VpcPeeringsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VpcPeerings to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VpcPeeringsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.VpcPeerings getList" })
        @GET("vpc/v2/getVpcPeeringInstanceList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcPeeringInstanceNoList.N") String vpcPeeringInstanceNoListN, @Query("sourceVpcName") String sourceVpcName, @Query("vpcPeeringName") String vpcPeeringName, @Query("targetVpcName") String targetVpcName, @Query("vpcPeeringInstanceStatusCode") VpcPeeringInstanceStatusCode vpcPeeringInstanceStatusCode1, @Query("pageNo") String pageNo, @Query("pageSize") String pageSize, @Query("sortedBy") SortedBy sortedBy1, @Query("sortingOrder") SortingOrder sortingOrder1);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.VpcPeerings getDetail" })
        @GET("vpc/v2/getVpcPeeringInstanceDetail")
        Observable<Response<ResponseBody>> getDetail(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcPeeringInstanceNo") String vpcPeeringInstanceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.VpcPeerings create" })
        @POST("vpc/v2/createVpcPeeringInstance")
        Observable<Response<ResponseBody>> create(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcPeeringName") String vpcPeeringName, @Query("sourceVpcNo") String sourceVpcNo, @Query("targetVpcNo") String targetVpcNo, @Query("targetVpcName") String targetVpcName, @Query("targetVpcLoginId") String targetVpcLoginId, @Query("vpcPeeringDescription") String vpcPeeringDescription);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.VpcPeerings delete" })
        @POST("vpc/v2/deleteVpcPeeringInstance")
        Observable<Response<ResponseBody>> delete(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcPeeringInstanceNo") String vpcPeeringInstanceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.VpcPeerings acceptOrReject" })
        @POST("vpc/v2/acceptOrRejectVpcPeering")
        Observable<Response<ResponseBody>> acceptOrReject(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcPeeringInstanceNo") String vpcPeeringInstanceNo, @Query("isAccept") String isAccept);

    }

    /**
     * VPC Peering 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getList(String responseFormatType) {
        getListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * VPC Peering 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getListAsync(String responseFormatType, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * VPC Peering 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getListAsync(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC Peering 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String vpcPeeringInstanceNoListN = null;
        final String sourceVpcName = null;
        final String vpcPeeringName = null;
        final String targetVpcName = null;
        final VpcPeeringInstanceStatusCode vpcPeeringInstanceStatusCode = null;
        final String pageNo = null;
        final String pageSize = null;
        final SortedBy sortedBy = null;
        final SortingOrder sortingOrder = null;
        return service.getList(responseFormatType, regionCode, vpcPeeringInstanceNoListN, sourceVpcName, vpcPeeringName, targetVpcName, vpcPeeringInstanceStatusCode, pageNo, pageSize, sortedBy, sortingOrder)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * VPC Peering 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcPeeringInstanceNoListN VPC Peering 인스턴스 번호 리스트
     * @param sourceVpcName 요청 VPC 이름
     * @param vpcPeeringName VPC Peering 이름
     * @param targetVpcName 수락 VPC 이름
     * @param vpcPeeringInstanceStatusCode VPC Peering 인스턴스 상태 코드. Possible values include: 'INIT', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상. Possible values include: 'vpcPeeringName', 'sourceVpcName', 'targetVpcName'
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getList(String responseFormatType, String regionCode, String vpcPeeringInstanceNoListN, String sourceVpcName, String vpcPeeringName, String targetVpcName, VpcPeeringInstanceStatusCode vpcPeeringInstanceStatusCode, String pageNo, String pageSize, SortedBy sortedBy, SortingOrder sortingOrder) {
        getListWithServiceResponseAsync(responseFormatType, regionCode, vpcPeeringInstanceNoListN, sourceVpcName, vpcPeeringName, targetVpcName, vpcPeeringInstanceStatusCode, pageNo, pageSize, sortedBy, sortingOrder).toBlocking().single().body();
    }

    /**
     * VPC Peering 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcPeeringInstanceNoListN VPC Peering 인스턴스 번호 리스트
     * @param sourceVpcName 요청 VPC 이름
     * @param vpcPeeringName VPC Peering 이름
     * @param targetVpcName 수락 VPC 이름
     * @param vpcPeeringInstanceStatusCode VPC Peering 인스턴스 상태 코드. Possible values include: 'INIT', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상. Possible values include: 'vpcPeeringName', 'sourceVpcName', 'targetVpcName'
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getListAsync(String responseFormatType, String regionCode, String vpcPeeringInstanceNoListN, String sourceVpcName, String vpcPeeringName, String targetVpcName, VpcPeeringInstanceStatusCode vpcPeeringInstanceStatusCode, String pageNo, String pageSize, SortedBy sortedBy, SortingOrder sortingOrder, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, regionCode, vpcPeeringInstanceNoListN, sourceVpcName, vpcPeeringName, targetVpcName, vpcPeeringInstanceStatusCode, pageNo, pageSize, sortedBy, sortingOrder), serviceCallback);
    }

    /**
     * VPC Peering 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcPeeringInstanceNoListN VPC Peering 인스턴스 번호 리스트
     * @param sourceVpcName 요청 VPC 이름
     * @param vpcPeeringName VPC Peering 이름
     * @param targetVpcName 수락 VPC 이름
     * @param vpcPeeringInstanceStatusCode VPC Peering 인스턴스 상태 코드. Possible values include: 'INIT', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상. Possible values include: 'vpcPeeringName', 'sourceVpcName', 'targetVpcName'
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getListAsync(String responseFormatType, String regionCode, String vpcPeeringInstanceNoListN, String sourceVpcName, String vpcPeeringName, String targetVpcName, VpcPeeringInstanceStatusCode vpcPeeringInstanceStatusCode, String pageNo, String pageSize, SortedBy sortedBy, SortingOrder sortingOrder) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, vpcPeeringInstanceNoListN, sourceVpcName, vpcPeeringName, targetVpcName, vpcPeeringInstanceStatusCode, pageNo, pageSize, sortedBy, sortingOrder).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC Peering 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcPeeringInstanceNoListN VPC Peering 인스턴스 번호 리스트
     * @param sourceVpcName 요청 VPC 이름
     * @param vpcPeeringName VPC Peering 이름
     * @param targetVpcName 수락 VPC 이름
     * @param vpcPeeringInstanceStatusCode VPC Peering 인스턴스 상태 코드. Possible values include: 'INIT', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상. Possible values include: 'vpcPeeringName', 'sourceVpcName', 'targetVpcName'
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String vpcPeeringInstanceNoListN, String sourceVpcName, String vpcPeeringName, String targetVpcName, VpcPeeringInstanceStatusCode vpcPeeringInstanceStatusCode, String pageNo, String pageSize, SortedBy sortedBy, SortingOrder sortingOrder) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, vpcPeeringInstanceNoListN, sourceVpcName, vpcPeeringName, targetVpcName, vpcPeeringInstanceStatusCode, pageNo, pageSize, sortedBy, sortingOrder)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * VPC Peering 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getDetail(String responseFormatType, String vpcPeeringInstanceNo) {
        getDetailWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo).toBlocking().single().body();
    }

    /**
     * VPC Peering 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getDetailAsync(String responseFormatType, String vpcPeeringInstanceNo, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo), serviceCallback);
    }

    /**
     * VPC Peering 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getDetailAsync(String responseFormatType, String vpcPeeringInstanceNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC Peering 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getDetailWithServiceResponseAsync(String responseFormatType, String vpcPeeringInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcPeeringInstanceNo == null) {
            throw new IllegalArgumentException("Parameter vpcPeeringInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.getDetail(responseFormatType, regionCode, vpcPeeringInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * VPC Peering 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getDetail(String responseFormatType, String vpcPeeringInstanceNo, String regionCode) {
        getDetailWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * VPC Peering 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getDetailAsync(String responseFormatType, String vpcPeeringInstanceNo, String regionCode, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo, regionCode), serviceCallback);
    }

    /**
     * VPC Peering 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getDetailAsync(String responseFormatType, String vpcPeeringInstanceNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo, regionCode).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC Peering 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getDetailWithServiceResponseAsync(String responseFormatType, String vpcPeeringInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcPeeringInstanceNo == null) {
            throw new IllegalArgumentException("Parameter vpcPeeringInstanceNo is required and cannot be null.");
        }
        return service.getDetail(responseFormatType, regionCode, vpcPeeringInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> getDetailDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * VPC Peering 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param sourceVpcNo 요청 VPC 번호
     * @param targetVpcNo 수락 VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcPeeringInstanceResponse object if successful.
     */
    public VpcPeeringInstanceResponse create(String responseFormatType, String sourceVpcNo, String targetVpcNo) {
        return createWithServiceResponseAsync(responseFormatType, sourceVpcNo, targetVpcNo).toBlocking().single().body();
    }

    /**
     * VPC Peering 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param sourceVpcNo 요청 VPC 번호
     * @param targetVpcNo 수락 VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpcPeeringInstanceResponse> createAsync(String responseFormatType, String sourceVpcNo, String targetVpcNo, final ServiceCallback<VpcPeeringInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, sourceVpcNo, targetVpcNo), serviceCallback);
    }

    /**
     * VPC Peering 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param sourceVpcNo 요청 VPC 번호
     * @param targetVpcNo 수락 VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    public Observable<VpcPeeringInstanceResponse> createAsync(String responseFormatType, String sourceVpcNo, String targetVpcNo) {
        return createWithServiceResponseAsync(responseFormatType, sourceVpcNo, targetVpcNo).map(new Func1<ServiceResponse<VpcPeeringInstanceResponse>, VpcPeeringInstanceResponse>() {
            @Override
            public VpcPeeringInstanceResponse call(ServiceResponse<VpcPeeringInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC Peering 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param sourceVpcNo 요청 VPC 번호
     * @param targetVpcNo 수락 VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    public Observable<ServiceResponse<VpcPeeringInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String sourceVpcNo, String targetVpcNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (sourceVpcNo == null) {
            throw new IllegalArgumentException("Parameter sourceVpcNo is required and cannot be null.");
        }
        if (targetVpcNo == null) {
            throw new IllegalArgumentException("Parameter targetVpcNo is required and cannot be null.");
        }
        final String regionCode = null;
        final String vpcPeeringName = null;
        final String targetVpcName = null;
        final String targetVpcLoginId = null;
        final String vpcPeeringDescription = null;
        return service.create(responseFormatType, regionCode, vpcPeeringName, sourceVpcNo, targetVpcNo, targetVpcName, targetVpcLoginId, vpcPeeringDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VpcPeeringInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<VpcPeeringInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VpcPeeringInstanceResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * VPC Peering 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param sourceVpcNo 요청 VPC 번호
     * @param targetVpcNo 수락 VPC 번호
     * @param regionCode REGION 코드
     * @param vpcPeeringName VPC Peering 이름
     * @param targetVpcName 수락 VPC 이름
     * @param targetVpcLoginId 수락 VPC 소유자 ID
     * @param vpcPeeringDescription VPC Peering 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcPeeringInstanceResponse object if successful.
     */
    public VpcPeeringInstanceResponse create(String responseFormatType, String sourceVpcNo, String targetVpcNo, String regionCode, String vpcPeeringName, String targetVpcName, String targetVpcLoginId, String vpcPeeringDescription) {
        return createWithServiceResponseAsync(responseFormatType, sourceVpcNo, targetVpcNo, regionCode, vpcPeeringName, targetVpcName, targetVpcLoginId, vpcPeeringDescription).toBlocking().single().body();
    }

    /**
     * VPC Peering 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param sourceVpcNo 요청 VPC 번호
     * @param targetVpcNo 수락 VPC 번호
     * @param regionCode REGION 코드
     * @param vpcPeeringName VPC Peering 이름
     * @param targetVpcName 수락 VPC 이름
     * @param targetVpcLoginId 수락 VPC 소유자 ID
     * @param vpcPeeringDescription VPC Peering 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpcPeeringInstanceResponse> createAsync(String responseFormatType, String sourceVpcNo, String targetVpcNo, String regionCode, String vpcPeeringName, String targetVpcName, String targetVpcLoginId, String vpcPeeringDescription, final ServiceCallback<VpcPeeringInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, sourceVpcNo, targetVpcNo, regionCode, vpcPeeringName, targetVpcName, targetVpcLoginId, vpcPeeringDescription), serviceCallback);
    }

    /**
     * VPC Peering 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param sourceVpcNo 요청 VPC 번호
     * @param targetVpcNo 수락 VPC 번호
     * @param regionCode REGION 코드
     * @param vpcPeeringName VPC Peering 이름
     * @param targetVpcName 수락 VPC 이름
     * @param targetVpcLoginId 수락 VPC 소유자 ID
     * @param vpcPeeringDescription VPC Peering 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    public Observable<VpcPeeringInstanceResponse> createAsync(String responseFormatType, String sourceVpcNo, String targetVpcNo, String regionCode, String vpcPeeringName, String targetVpcName, String targetVpcLoginId, String vpcPeeringDescription) {
        return createWithServiceResponseAsync(responseFormatType, sourceVpcNo, targetVpcNo, regionCode, vpcPeeringName, targetVpcName, targetVpcLoginId, vpcPeeringDescription).map(new Func1<ServiceResponse<VpcPeeringInstanceResponse>, VpcPeeringInstanceResponse>() {
            @Override
            public VpcPeeringInstanceResponse call(ServiceResponse<VpcPeeringInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC Peering 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param sourceVpcNo 요청 VPC 번호
     * @param targetVpcNo 수락 VPC 번호
     * @param regionCode REGION 코드
     * @param vpcPeeringName VPC Peering 이름
     * @param targetVpcName 수락 VPC 이름
     * @param targetVpcLoginId 수락 VPC 소유자 ID
     * @param vpcPeeringDescription VPC Peering 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    public Observable<ServiceResponse<VpcPeeringInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String sourceVpcNo, String targetVpcNo, String regionCode, String vpcPeeringName, String targetVpcName, String targetVpcLoginId, String vpcPeeringDescription) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (sourceVpcNo == null) {
            throw new IllegalArgumentException("Parameter sourceVpcNo is required and cannot be null.");
        }
        if (targetVpcNo == null) {
            throw new IllegalArgumentException("Parameter targetVpcNo is required and cannot be null.");
        }
        return service.create(responseFormatType, regionCode, vpcPeeringName, sourceVpcNo, targetVpcNo, targetVpcName, targetVpcLoginId, vpcPeeringDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VpcPeeringInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<VpcPeeringInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VpcPeeringInstanceResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VpcPeeringInstanceResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VpcPeeringInstanceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VpcPeeringInstanceResponse>() { }.getType())
                .build(response);
    }

    /**
     * VPC Peering 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcPeeringInstanceResponse object if successful.
     */
    public VpcPeeringInstanceResponse delete(String responseFormatType, String vpcPeeringInstanceNo) {
        return deleteWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo).toBlocking().single().body();
    }

    /**
     * VPC Peering 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpcPeeringInstanceResponse> deleteAsync(String responseFormatType, String vpcPeeringInstanceNo, final ServiceCallback<VpcPeeringInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo), serviceCallback);
    }

    /**
     * VPC Peering 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    public Observable<VpcPeeringInstanceResponse> deleteAsync(String responseFormatType, String vpcPeeringInstanceNo) {
        return deleteWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo).map(new Func1<ServiceResponse<VpcPeeringInstanceResponse>, VpcPeeringInstanceResponse>() {
            @Override
            public VpcPeeringInstanceResponse call(ServiceResponse<VpcPeeringInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC Peering 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    public Observable<ServiceResponse<VpcPeeringInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String vpcPeeringInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcPeeringInstanceNo == null) {
            throw new IllegalArgumentException("Parameter vpcPeeringInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.delete(responseFormatType, regionCode, vpcPeeringInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VpcPeeringInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<VpcPeeringInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VpcPeeringInstanceResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * VPC Peering 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcPeeringInstanceResponse object if successful.
     */
    public VpcPeeringInstanceResponse delete(String responseFormatType, String vpcPeeringInstanceNo, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * VPC Peering 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpcPeeringInstanceResponse> deleteAsync(String responseFormatType, String vpcPeeringInstanceNo, String regionCode, final ServiceCallback<VpcPeeringInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo, regionCode), serviceCallback);
    }

    /**
     * VPC Peering 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    public Observable<VpcPeeringInstanceResponse> deleteAsync(String responseFormatType, String vpcPeeringInstanceNo, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo, regionCode).map(new Func1<ServiceResponse<VpcPeeringInstanceResponse>, VpcPeeringInstanceResponse>() {
            @Override
            public VpcPeeringInstanceResponse call(ServiceResponse<VpcPeeringInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC Peering 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    public Observable<ServiceResponse<VpcPeeringInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String vpcPeeringInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcPeeringInstanceNo == null) {
            throw new IllegalArgumentException("Parameter vpcPeeringInstanceNo is required and cannot be null.");
        }
        return service.delete(responseFormatType, regionCode, vpcPeeringInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VpcPeeringInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<VpcPeeringInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VpcPeeringInstanceResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VpcPeeringInstanceResponse> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VpcPeeringInstanceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VpcPeeringInstanceResponse>() { }.getType())
                .build(response);
    }

    /**
     * VPC Peering 요청을 수락/거절.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param isAccept 수락 여부
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcPeeringInstanceResponse object if successful.
     */
    public VpcPeeringInstanceResponse acceptOrReject(String responseFormatType, String vpcPeeringInstanceNo, String isAccept) {
        return acceptOrRejectWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo, isAccept).toBlocking().single().body();
    }

    /**
     * VPC Peering 요청을 수락/거절.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param isAccept 수락 여부
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpcPeeringInstanceResponse> acceptOrRejectAsync(String responseFormatType, String vpcPeeringInstanceNo, String isAccept, final ServiceCallback<VpcPeeringInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(acceptOrRejectWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo, isAccept), serviceCallback);
    }

    /**
     * VPC Peering 요청을 수락/거절.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param isAccept 수락 여부
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    public Observable<VpcPeeringInstanceResponse> acceptOrRejectAsync(String responseFormatType, String vpcPeeringInstanceNo, String isAccept) {
        return acceptOrRejectWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo, isAccept).map(new Func1<ServiceResponse<VpcPeeringInstanceResponse>, VpcPeeringInstanceResponse>() {
            @Override
            public VpcPeeringInstanceResponse call(ServiceResponse<VpcPeeringInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC Peering 요청을 수락/거절.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param isAccept 수락 여부
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    public Observable<ServiceResponse<VpcPeeringInstanceResponse>> acceptOrRejectWithServiceResponseAsync(String responseFormatType, String vpcPeeringInstanceNo, String isAccept) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcPeeringInstanceNo == null) {
            throw new IllegalArgumentException("Parameter vpcPeeringInstanceNo is required and cannot be null.");
        }
        if (isAccept == null) {
            throw new IllegalArgumentException("Parameter isAccept is required and cannot be null.");
        }
        final String regionCode = null;
        return service.acceptOrReject(responseFormatType, regionCode, vpcPeeringInstanceNo, isAccept)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VpcPeeringInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<VpcPeeringInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VpcPeeringInstanceResponse> clientResponse = acceptOrRejectDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * VPC Peering 요청을 수락/거절.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param isAccept 수락 여부
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcPeeringInstanceResponse object if successful.
     */
    public VpcPeeringInstanceResponse acceptOrReject(String responseFormatType, String vpcPeeringInstanceNo, String isAccept, String regionCode) {
        return acceptOrRejectWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo, isAccept, regionCode).toBlocking().single().body();
    }

    /**
     * VPC Peering 요청을 수락/거절.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param isAccept 수락 여부
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpcPeeringInstanceResponse> acceptOrRejectAsync(String responseFormatType, String vpcPeeringInstanceNo, String isAccept, String regionCode, final ServiceCallback<VpcPeeringInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(acceptOrRejectWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo, isAccept, regionCode), serviceCallback);
    }

    /**
     * VPC Peering 요청을 수락/거절.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param isAccept 수락 여부
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    public Observable<VpcPeeringInstanceResponse> acceptOrRejectAsync(String responseFormatType, String vpcPeeringInstanceNo, String isAccept, String regionCode) {
        return acceptOrRejectWithServiceResponseAsync(responseFormatType, vpcPeeringInstanceNo, isAccept, regionCode).map(new Func1<ServiceResponse<VpcPeeringInstanceResponse>, VpcPeeringInstanceResponse>() {
            @Override
            public VpcPeeringInstanceResponse call(ServiceResponse<VpcPeeringInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC Peering 요청을 수락/거절.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param isAccept 수락 여부
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    public Observable<ServiceResponse<VpcPeeringInstanceResponse>> acceptOrRejectWithServiceResponseAsync(String responseFormatType, String vpcPeeringInstanceNo, String isAccept, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcPeeringInstanceNo == null) {
            throw new IllegalArgumentException("Parameter vpcPeeringInstanceNo is required and cannot be null.");
        }
        if (isAccept == null) {
            throw new IllegalArgumentException("Parameter isAccept is required and cannot be null.");
        }
        return service.acceptOrReject(responseFormatType, regionCode, vpcPeeringInstanceNo, isAccept)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VpcPeeringInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<VpcPeeringInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VpcPeeringInstanceResponse> clientResponse = acceptOrRejectDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VpcPeeringInstanceResponse> acceptOrRejectDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VpcPeeringInstanceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VpcPeeringInstanceResponse>() { }.getType())
                .build(response);
    }

}
