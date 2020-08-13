/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc.implementation;

import retrofit2.Retrofit;
import com.fincloud.vpc.NatGateways;
import com.fincloud.vpc.models.NatGatewayInstanceStatusCode;
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
 * in NatGateways.
 */
public class NatGatewaysImpl implements NatGateways {
    /** The Retrofit service to perform REST calls. */
    private NatGatewaysService service;
    /** The service client containing this operation class. */
    private VPCManagementClientImpl client;

    /**
     * Initializes an instance of NatGateways.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public NatGatewaysImpl(Retrofit retrofit, VPCManagementClientImpl client) {
        this.service = retrofit.create(NatGatewaysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for NatGateways to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NatGatewaysService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.NatGateways getList" })
        @GET("vpc/v2/getNatGatewayInstanceList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("natGatewayInstanceNoList.N") String natGatewayInstanceNoListN, @Query("publicIp") String publicIp, @Query("vpcName") String vpcName, @Query("natGatewayName") String natGatewayName, @Query("natGatewayInstanceStatusCode") NatGatewayInstanceStatusCode natGatewayInstanceStatusCode1, @Query("pageNo") String pageNo, @Query("pageSize") String pageSize);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.NatGateways getDetail" })
        @GET("vpc/v2/getNatGatewayInstanceDetail")
        Observable<Response<ResponseBody>> getDetail(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("natGatewayInstanceNo") String natGatewayInstanceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.NatGateways create" })
        @POST("vpc/v2/createNatGatewayInstance")
        Observable<Response<ResponseBody>> create(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("vpcNo") String vpcNo, @Query("zoneCode") String zoneCode, @Query("natGatewayName") String natGatewayName, @Query("natGatewayDescription") String natGatewayDescription);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.vpc.NatGateways delete" })
        @POST("vpc/v2/deleteNatGatewayInstance")
        Observable<Response<ResponseBody>> delete(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("natGatewayInstanceNo") String natGatewayInstanceNo);

    }

    /**
     * NAT Gateway 인스턴스 리스트를 조회.
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
     * NAT Gateway 인스턴스 리스트를 조회.
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
     * NAT Gateway 인스턴스 리스트를 조회.
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
     * NAT Gateway 인스턴스 리스트를 조회.
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
        final String natGatewayInstanceNoListN = null;
        final String publicIp = null;
        final String vpcName = null;
        final String natGatewayName = null;
        final NatGatewayInstanceStatusCode natGatewayInstanceStatusCode = null;
        final String pageNo = null;
        final String pageSize = null;
        return service.getList(responseFormatType, regionCode, natGatewayInstanceNoListN, publicIp, vpcName, natGatewayName, natGatewayInstanceStatusCode, pageNo, pageSize)
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
     * NAT Gateway 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param natGatewayInstanceNoListN NAT Gateway 인스턴스 번호 리스트
     * @param publicIp 공인 IP 주소
     * @param vpcName VPC 이름
     * @param natGatewayName NAT Gateway 이름
     * @param natGatewayInstanceStatusCode NAT Gateway 인스턴스 상태 코드. Possible values include: 'INIT', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getList(String responseFormatType, String regionCode, String natGatewayInstanceNoListN, String publicIp, String vpcName, String natGatewayName, NatGatewayInstanceStatusCode natGatewayInstanceStatusCode, String pageNo, String pageSize) {
        getListWithServiceResponseAsync(responseFormatType, regionCode, natGatewayInstanceNoListN, publicIp, vpcName, natGatewayName, natGatewayInstanceStatusCode, pageNo, pageSize).toBlocking().single().body();
    }

    /**
     * NAT Gateway 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param natGatewayInstanceNoListN NAT Gateway 인스턴스 번호 리스트
     * @param publicIp 공인 IP 주소
     * @param vpcName VPC 이름
     * @param natGatewayName NAT Gateway 이름
     * @param natGatewayInstanceStatusCode NAT Gateway 인스턴스 상태 코드. Possible values include: 'INIT', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getListAsync(String responseFormatType, String regionCode, String natGatewayInstanceNoListN, String publicIp, String vpcName, String natGatewayName, NatGatewayInstanceStatusCode natGatewayInstanceStatusCode, String pageNo, String pageSize, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, regionCode, natGatewayInstanceNoListN, publicIp, vpcName, natGatewayName, natGatewayInstanceStatusCode, pageNo, pageSize), serviceCallback);
    }

    /**
     * NAT Gateway 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param natGatewayInstanceNoListN NAT Gateway 인스턴스 번호 리스트
     * @param publicIp 공인 IP 주소
     * @param vpcName VPC 이름
     * @param natGatewayName NAT Gateway 이름
     * @param natGatewayInstanceStatusCode NAT Gateway 인스턴스 상태 코드. Possible values include: 'INIT', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getListAsync(String responseFormatType, String regionCode, String natGatewayInstanceNoListN, String publicIp, String vpcName, String natGatewayName, NatGatewayInstanceStatusCode natGatewayInstanceStatusCode, String pageNo, String pageSize) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, natGatewayInstanceNoListN, publicIp, vpcName, natGatewayName, natGatewayInstanceStatusCode, pageNo, pageSize).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * NAT Gateway 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param natGatewayInstanceNoListN NAT Gateway 인스턴스 번호 리스트
     * @param publicIp 공인 IP 주소
     * @param vpcName VPC 이름
     * @param natGatewayName NAT Gateway 이름
     * @param natGatewayInstanceStatusCode NAT Gateway 인스턴스 상태 코드. Possible values include: 'INIT', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String natGatewayInstanceNoListN, String publicIp, String vpcName, String natGatewayName, NatGatewayInstanceStatusCode natGatewayInstanceStatusCode, String pageNo, String pageSize) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, natGatewayInstanceNoListN, publicIp, vpcName, natGatewayName, natGatewayInstanceStatusCode, pageNo, pageSize)
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
     * NAT Gateway 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getDetail(String responseFormatType, String natGatewayInstanceNo) {
        getDetailWithServiceResponseAsync(responseFormatType, natGatewayInstanceNo).toBlocking().single().body();
    }

    /**
     * NAT Gateway 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getDetailAsync(String responseFormatType, String natGatewayInstanceNo, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, natGatewayInstanceNo), serviceCallback);
    }

    /**
     * NAT Gateway 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getDetailAsync(String responseFormatType, String natGatewayInstanceNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, natGatewayInstanceNo).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * NAT Gateway 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getDetailWithServiceResponseAsync(String responseFormatType, String natGatewayInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (natGatewayInstanceNo == null) {
            throw new IllegalArgumentException("Parameter natGatewayInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.getDetail(responseFormatType, regionCode, natGatewayInstanceNo)
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
     * NAT Gateway 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getDetail(String responseFormatType, String natGatewayInstanceNo, String regionCode) {
        getDetailWithServiceResponseAsync(responseFormatType, natGatewayInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * NAT Gateway 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getDetailAsync(String responseFormatType, String natGatewayInstanceNo, String regionCode, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, natGatewayInstanceNo, regionCode), serviceCallback);
    }

    /**
     * NAT Gateway 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> getDetailAsync(String responseFormatType, String natGatewayInstanceNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, natGatewayInstanceNo, regionCode).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * NAT Gateway 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getDetailWithServiceResponseAsync(String responseFormatType, String natGatewayInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (natGatewayInstanceNo == null) {
            throw new IllegalArgumentException("Parameter natGatewayInstanceNo is required and cannot be null.");
        }
        return service.getDetail(responseFormatType, regionCode, natGatewayInstanceNo)
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
     * NAT Gateway 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void create(String responseFormatType, String vpcNo, String zoneCode) {
        createWithServiceResponseAsync(responseFormatType, vpcNo, zoneCode).toBlocking().single().body();
    }

    /**
     * NAT Gateway 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> createAsync(String responseFormatType, String vpcNo, String zoneCode, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, vpcNo, zoneCode), serviceCallback);
    }

    /**
     * NAT Gateway 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> createAsync(String responseFormatType, String vpcNo, String zoneCode) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo, zoneCode).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * NAT Gateway 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> createWithServiceResponseAsync(String responseFormatType, String vpcNo, String zoneCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (zoneCode == null) {
            throw new IllegalArgumentException("Parameter zoneCode is required and cannot be null.");
        }
        final String regionCode = null;
        final String natGatewayName = null;
        final String natGatewayDescription = null;
        return service.create(responseFormatType, regionCode, vpcNo, zoneCode, natGatewayName, natGatewayDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * NAT Gateway 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @param regionCode REGION 코드
     * @param natGatewayName NAT Gateway 이름
     * @param natGatewayDescription NAT Gateway 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void create(String responseFormatType, String vpcNo, String zoneCode, String regionCode, String natGatewayName, String natGatewayDescription) {
        createWithServiceResponseAsync(responseFormatType, vpcNo, zoneCode, regionCode, natGatewayName, natGatewayDescription).toBlocking().single().body();
    }

    /**
     * NAT Gateway 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @param regionCode REGION 코드
     * @param natGatewayName NAT Gateway 이름
     * @param natGatewayDescription NAT Gateway 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> createAsync(String responseFormatType, String vpcNo, String zoneCode, String regionCode, String natGatewayName, String natGatewayDescription, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, vpcNo, zoneCode, regionCode, natGatewayName, natGatewayDescription), serviceCallback);
    }

    /**
     * NAT Gateway 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @param regionCode REGION 코드
     * @param natGatewayName NAT Gateway 이름
     * @param natGatewayDescription NAT Gateway 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> createAsync(String responseFormatType, String vpcNo, String zoneCode, String regionCode, String natGatewayName, String natGatewayDescription) {
        return createWithServiceResponseAsync(responseFormatType, vpcNo, zoneCode, regionCode, natGatewayName, natGatewayDescription).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * NAT Gateway 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @param regionCode REGION 코드
     * @param natGatewayName NAT Gateway 이름
     * @param natGatewayDescription NAT Gateway 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> createWithServiceResponseAsync(String responseFormatType, String vpcNo, String zoneCode, String regionCode, String natGatewayName, String natGatewayDescription) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (vpcNo == null) {
            throw new IllegalArgumentException("Parameter vpcNo is required and cannot be null.");
        }
        if (zoneCode == null) {
            throw new IllegalArgumentException("Parameter zoneCode is required and cannot be null.");
        }
        return service.create(responseFormatType, regionCode, vpcNo, zoneCode, natGatewayName, natGatewayDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * NAT Gateway 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String responseFormatType, String natGatewayInstanceNo) {
        deleteWithServiceResponseAsync(responseFormatType, natGatewayInstanceNo).toBlocking().single().body();
    }

    /**
     * NAT Gateway 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String responseFormatType, String natGatewayInstanceNo, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, natGatewayInstanceNo), serviceCallback);
    }

    /**
     * NAT Gateway 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String responseFormatType, String natGatewayInstanceNo) {
        return deleteWithServiceResponseAsync(responseFormatType, natGatewayInstanceNo).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * NAT Gateway 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String responseFormatType, String natGatewayInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (natGatewayInstanceNo == null) {
            throw new IllegalArgumentException("Parameter natGatewayInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.delete(responseFormatType, regionCode, natGatewayInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * NAT Gateway 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String responseFormatType, String natGatewayInstanceNo, String regionCode) {
        deleteWithServiceResponseAsync(responseFormatType, natGatewayInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * NAT Gateway 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String responseFormatType, String natGatewayInstanceNo, String regionCode, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, natGatewayInstanceNo, regionCode), serviceCallback);
    }

    /**
     * NAT Gateway 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String responseFormatType, String natGatewayInstanceNo, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, natGatewayInstanceNo, regionCode).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * NAT Gateway 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String responseFormatType, String natGatewayInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (natGatewayInstanceNo == null) {
            throw new IllegalArgumentException("Parameter natGatewayInstanceNo is required and cannot be null.");
        }
        return service.delete(responseFormatType, regionCode, natGatewayInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
