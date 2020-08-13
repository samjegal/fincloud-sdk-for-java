/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.implementation;

import retrofit2.Retrofit;
import com.fincloud.vpc.VPCs;
import com.fincloud.vpc.models.VpcDetailResponse;
import com.fincloud.vpc.models.VpcListResponse;
import com.fincloud.vpc.models.VpcResponse;
import com.fincloud.vpc.models.VpcStatusCode;
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
 * in VPCs.
 */
public class VPCsImpl implements VPCs {
    /** The Retrofit service to perform REST calls. */
    private VPCsService service;
    /** The service client containing this operation class. */
    private VPCManagementClientImpl client;

    /**
     * Initializes an instance of VPCs.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VPCsImpl(Retrofit retrofit, VPCManagementClientImpl client) {
        this.service = retrofit.create(VPCsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VPCs to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VPCsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.VPCs getList" })
        @GET("vpc/v2/getVpcList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcStatusCode") VpcStatusCode vpcStatusCode1, @Query("vpcName") String vpcName, @Query("vpcNoList.N") String vpcNoListN);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.VPCs getDetail" })
        @GET("vpc/v2/getVpcDetail")
        Observable<Response<ResponseBody>> getDetail(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcNo") String vpcNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.VPCs create" })
        @POST("vpc/v2/createVpc")
        Observable<Response<ResponseBody>> create(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcName") String vpcName, @Query("ipv4CidrBlock") String ipv4CidrBlock);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.VPCs delete" })
        @POST("vpc/v2/deleteVpc")
        Observable<Response<ResponseBody>> delete(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcNo") String vpcNo);

    }

    /**
     * VPC 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcListResponse object if successful.
     */
    public VpcListResponse getList(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * VPC 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpcListResponse> getListAsync(String responseFormatType, final ServiceCallback<VpcListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * VPC 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcListResponse object
     */
    public Observable<VpcListResponse> getListAsync(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<VpcListResponse>, VpcListResponse>() {
            @Override
            public VpcListResponse call(ServiceResponse<VpcListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcListResponse object
     */
    public Observable<ServiceResponse<VpcListResponse>> getListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final VpcStatusCode vpcStatusCode = null;
        final String vpcName = null;
        final String vpcNoListN = null;
        return service.getList(responseFormatType, regionCode, vpcStatusCode, vpcName, vpcNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VpcListResponse>>>() {
                @Override
                public Observable<ServiceResponse<VpcListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VpcListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * VPC 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcStatusCode VPC 상태 코드. Possible values include: 'INIT', 'CREATING', 'RUN', 'TERMTING'
     * @param vpcName VPC 이름
     * @param vpcNoListN VPC 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcListResponse object if successful.
     */
    public VpcListResponse getList(String responseFormatType, String regionCode, VpcStatusCode vpcStatusCode, String vpcName, String vpcNoListN) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, vpcStatusCode, vpcName, vpcNoListN).toBlocking().single().body();
    }

    /**
     * VPC 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcStatusCode VPC 상태 코드. Possible values include: 'INIT', 'CREATING', 'RUN', 'TERMTING'
     * @param vpcName VPC 이름
     * @param vpcNoListN VPC 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpcListResponse> getListAsync(String responseFormatType, String regionCode, VpcStatusCode vpcStatusCode, String vpcName, String vpcNoListN, final ServiceCallback<VpcListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, regionCode, vpcStatusCode, vpcName, vpcNoListN), serviceCallback);
    }

    /**
     * VPC 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcStatusCode VPC 상태 코드. Possible values include: 'INIT', 'CREATING', 'RUN', 'TERMTING'
     * @param vpcName VPC 이름
     * @param vpcNoListN VPC 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcListResponse object
     */
    public Observable<VpcListResponse> getListAsync(String responseFormatType, String regionCode, VpcStatusCode vpcStatusCode, String vpcName, String vpcNoListN) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, vpcStatusCode, vpcName, vpcNoListN).map(new Func1<ServiceResponse<VpcListResponse>, VpcListResponse>() {
            @Override
            public VpcListResponse call(ServiceResponse<VpcListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcStatusCode VPC 상태 코드. Possible values include: 'INIT', 'CREATING', 'RUN', 'TERMTING'
     * @param vpcName VPC 이름
     * @param vpcNoListN VPC 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcListResponse object
     */
    public Observable<ServiceResponse<VpcListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, VpcStatusCode vpcStatusCode, String vpcName, String vpcNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, vpcStatusCode, vpcName, vpcNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VpcListResponse>>>() {
                @Override
                public Observable<ServiceResponse<VpcListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VpcListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VpcListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VpcListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VpcListResponse>() { }.getType())
                .build(response);
    }

    /**
     * VPC 상세정보를 조회.
     *
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcDetailResponse object if successful.
     */
    public VpcDetailResponse getDetail(String vpcNo) {
        return getDetailWithServiceResponseAsync(vpcNo).toBlocking().single().body();
    }

    /**
     * VPC 상세정보를 조회.
     *
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpcDetailResponse> getDetailAsync(String vpcNo, final ServiceCallback<VpcDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(vpcNo), serviceCallback);
    }

    /**
     * VPC 상세정보를 조회.
     *
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcDetailResponse object
     */
    public Observable<VpcDetailResponse> getDetailAsync(String vpcNo) {
        return getDetailWithServiceResponseAsync(vpcNo).map(new Func1<ServiceResponse<VpcDetailResponse>, VpcDetailResponse>() {
            @Override
            public VpcDetailResponse call(ServiceResponse<VpcDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC 상세정보를 조회.
     *
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcDetailResponse object
     */
    public Observable<ServiceResponse<VpcDetailResponse>> getDetailWithServiceResponseAsync(String vpcNo) {
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        final String responseFormatType = null;
        final String regionCode = null;
        return service.getDetail(responseFormatType, regionCode, vpcNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VpcDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<VpcDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VpcDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * VPC 상세정보를 조회.
     *
     * @param vpcNo VPC 번호
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcDetailResponse object if successful.
     */
    public VpcDetailResponse getDetail(String vpcNo, String responseFormatType, String regionCode) {
        return getDetailWithServiceResponseAsync(vpcNo, responseFormatType, regionCode).toBlocking().single().body();
    }

    /**
     * VPC 상세정보를 조회.
     *
     * @param vpcNo VPC 번호
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpcDetailResponse> getDetailAsync(String vpcNo, String responseFormatType, String regionCode, final ServiceCallback<VpcDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(vpcNo, responseFormatType, regionCode), serviceCallback);
    }

    /**
     * VPC 상세정보를 조회.
     *
     * @param vpcNo VPC 번호
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcDetailResponse object
     */
    public Observable<VpcDetailResponse> getDetailAsync(String vpcNo, String responseFormatType, String regionCode) {
        return getDetailWithServiceResponseAsync(vpcNo, responseFormatType, regionCode).map(new Func1<ServiceResponse<VpcDetailResponse>, VpcDetailResponse>() {
            @Override
            public VpcDetailResponse call(ServiceResponse<VpcDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC 상세정보를 조회.
     *
     * @param vpcNo VPC 번호
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcDetailResponse object
     */
    public Observable<ServiceResponse<VpcDetailResponse>> getDetailWithServiceResponseAsync(String vpcNo, String responseFormatType, String regionCode) {
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        return service.getDetail(responseFormatType, regionCode, vpcNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VpcDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<VpcDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VpcDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VpcDetailResponse> getDetailDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VpcDetailResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VpcDetailResponse>() { }.getType())
                .build(response);
    }

    /**
     * VPC를 생성.
     *
     * @param ipv4CidrBlock IP 주소 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcResponse object if successful.
     */
    public VpcResponse create(String ipv4CidrBlock) {
        return createWithServiceResponseAsync(ipv4CidrBlock).toBlocking().single().body();
    }

    /**
     * VPC를 생성.
     *
     * @param ipv4CidrBlock IP 주소 범위
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpcResponse> createAsync(String ipv4CidrBlock, final ServiceCallback<VpcResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(ipv4CidrBlock), serviceCallback);
    }

    /**
     * VPC를 생성.
     *
     * @param ipv4CidrBlock IP 주소 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcResponse object
     */
    public Observable<VpcResponse> createAsync(String ipv4CidrBlock) {
        return createWithServiceResponseAsync(ipv4CidrBlock).map(new Func1<ServiceResponse<VpcResponse>, VpcResponse>() {
            @Override
            public VpcResponse call(ServiceResponse<VpcResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC를 생성.
     *
     * @param ipv4CidrBlock IP 주소 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcResponse object
     */
    public Observable<ServiceResponse<VpcResponse>> createWithServiceResponseAsync(String ipv4CidrBlock) {
        if (ipv4CidrBlock == null) {
            throw new IllegalArgumentException("Parameter ipv4CidrBlock is required and cannot be null.");
        }
        final String responseFormatType = null;
        final String regionCode = null;
        final String vpcName = null;
        return service.create(responseFormatType, regionCode, vpcName, ipv4CidrBlock)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VpcResponse>>>() {
                @Override
                public Observable<ServiceResponse<VpcResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VpcResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * VPC를 생성.
     *
     * @param ipv4CidrBlock IP 주소 범위
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcName VPC 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcResponse object if successful.
     */
    public VpcResponse create(String ipv4CidrBlock, String responseFormatType, String regionCode, String vpcName) {
        return createWithServiceResponseAsync(ipv4CidrBlock, responseFormatType, regionCode, vpcName).toBlocking().single().body();
    }

    /**
     * VPC를 생성.
     *
     * @param ipv4CidrBlock IP 주소 범위
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcName VPC 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpcResponse> createAsync(String ipv4CidrBlock, String responseFormatType, String regionCode, String vpcName, final ServiceCallback<VpcResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(ipv4CidrBlock, responseFormatType, regionCode, vpcName), serviceCallback);
    }

    /**
     * VPC를 생성.
     *
     * @param ipv4CidrBlock IP 주소 범위
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcName VPC 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcResponse object
     */
    public Observable<VpcResponse> createAsync(String ipv4CidrBlock, String responseFormatType, String regionCode, String vpcName) {
        return createWithServiceResponseAsync(ipv4CidrBlock, responseFormatType, regionCode, vpcName).map(new Func1<ServiceResponse<VpcResponse>, VpcResponse>() {
            @Override
            public VpcResponse call(ServiceResponse<VpcResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC를 생성.
     *
     * @param ipv4CidrBlock IP 주소 범위
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcName VPC 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcResponse object
     */
    public Observable<ServiceResponse<VpcResponse>> createWithServiceResponseAsync(String ipv4CidrBlock, String responseFormatType, String regionCode, String vpcName) {
        if (ipv4CidrBlock == null) {
            throw new IllegalArgumentException("Parameter ipv4CidrBlock is required and cannot be null.");
        }
        return service.create(responseFormatType, regionCode, vpcName, ipv4CidrBlock)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VpcResponse>>>() {
                @Override
                public Observable<ServiceResponse<VpcResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VpcResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VpcResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VpcResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VpcResponse>() { }.getType())
                .build(response);
    }

    /**
     * VPC를 삭제.
     *
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcResponse object if successful.
     */
    public VpcResponse delete(String vpcNo) {
        return deleteWithServiceResponseAsync(vpcNo).toBlocking().single().body();
    }

    /**
     * VPC를 삭제.
     *
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpcResponse> deleteAsync(String vpcNo, final ServiceCallback<VpcResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(vpcNo), serviceCallback);
    }

    /**
     * VPC를 삭제.
     *
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcResponse object
     */
    public Observable<VpcResponse> deleteAsync(String vpcNo) {
        return deleteWithServiceResponseAsync(vpcNo).map(new Func1<ServiceResponse<VpcResponse>, VpcResponse>() {
            @Override
            public VpcResponse call(ServiceResponse<VpcResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC를 삭제.
     *
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcResponse object
     */
    public Observable<ServiceResponse<VpcResponse>> deleteWithServiceResponseAsync(String vpcNo) {
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        final String responseFormatType = null;
        final String regionCode = null;
        return service.delete(responseFormatType, regionCode, vpcNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VpcResponse>>>() {
                @Override
                public Observable<ServiceResponse<VpcResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VpcResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * VPC를 삭제.
     *
     * @param vpcNo VPC 번호
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcResponse object if successful.
     */
    public VpcResponse delete(String vpcNo, String responseFormatType, String regionCode) {
        return deleteWithServiceResponseAsync(vpcNo, responseFormatType, regionCode).toBlocking().single().body();
    }

    /**
     * VPC를 삭제.
     *
     * @param vpcNo VPC 번호
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<VpcResponse> deleteAsync(String vpcNo, String responseFormatType, String regionCode, final ServiceCallback<VpcResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(vpcNo, responseFormatType, regionCode), serviceCallback);
    }

    /**
     * VPC를 삭제.
     *
     * @param vpcNo VPC 번호
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcResponse object
     */
    public Observable<VpcResponse> deleteAsync(String vpcNo, String responseFormatType, String regionCode) {
        return deleteWithServiceResponseAsync(vpcNo, responseFormatType, regionCode).map(new Func1<ServiceResponse<VpcResponse>, VpcResponse>() {
            @Override
            public VpcResponse call(ServiceResponse<VpcResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * VPC를 삭제.
     *
     * @param vpcNo VPC 번호
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcResponse object
     */
    public Observable<ServiceResponse<VpcResponse>> deleteWithServiceResponseAsync(String vpcNo, String responseFormatType, String regionCode) {
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        return service.delete(responseFormatType, regionCode, vpcNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<VpcResponse>>>() {
                @Override
                public Observable<ServiceResponse<VpcResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<VpcResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<VpcResponse> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<VpcResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<VpcResponse>() { }.getType())
                .build(response);
    }

}
