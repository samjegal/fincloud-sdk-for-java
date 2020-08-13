/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.implementation;

import retrofit2.Retrofit;
import com.fincloud.server.PublicIps;
import com.fincloud.server.models.PublicIpFromServerInstanceResponse;
import com.fincloud.server.models.PublicIpInstanceDetailResponse;
import com.fincloud.server.models.PublicIpInstanceListResponse;
import com.fincloud.server.models.PublicIpInstanceResponse;
import com.fincloud.server.models.PublicIpTargetServerInstanceListResponse;
import com.fincloud.server.models.PublicIpWithServerInstanceResponse;
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
 * in PublicIps.
 */
public class PublicIpsImpl implements PublicIps {
    /** The Retrofit service to perform REST calls. */
    private PublicIpsService service;
    /** The service client containing this operation class. */
    private ServerManagementClientImpl client;

    /**
     * Initializes an instance of PublicIps.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PublicIpsImpl(Retrofit retrofit, ServerManagementClientImpl client) {
        this.service = retrofit.create(PublicIpsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PublicIps to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PublicIpsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.PublicIps getList" })
        @GET("vserver/v2/getPublicIpInstanceList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("publicIpInstanceNoList.N") String publicIpInstanceNoListN, @Query("publicIp") String publicIp, @Query("privateIp") String privateIp, @Query("isAssociated") Boolean isAssociated);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.PublicIps getDetail" })
        @GET("vserver/v2/getPublicIpInstanceDetail")
        Observable<Response<ResponseBody>> getDetail(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("publicIpInstanceNo") String publicIpInstanceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.PublicIps create" })
        @POST("vserver/v2/createPublicIpInstance")
        Observable<Response<ResponseBody>> create(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("serverInstanceNo") String serverInstanceNo, @Query("publicIpDescription") String publicIpDescription);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.PublicIps delete" })
        @POST("vserver/v2/deletePublicIpInstance")
        Observable<Response<ResponseBody>> delete(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("publicIpInstanceNo") String publicIpInstanceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.PublicIps getTargetList" })
        @POST("vserver/v2/getPublicIpTargetServerInstanceList")
        Observable<Response<ResponseBody>> getTargetList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("publicIpInstanceNo") String publicIpInstanceNo, @Query("serverInstanceNo") String serverInstanceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.PublicIps associate" })
        @POST("vserver/v2/associatePublicIpWithServerInstance")
        Observable<Response<ResponseBody>> associate(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("publicIpInstanceNo") String publicIpInstanceNo, @Query("serverInstanceNo") String serverInstanceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.PublicIps disassociate" })
        @POST("vserver/v2/disassociatePublicIpFromServerInstance")
        Observable<Response<ResponseBody>> disassociate(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("publicIpInstanceNo") String publicIpInstanceNo, @Query("serverInstanceNo") String serverInstanceNo);

    }

    /**
     * 공인 IP 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpInstanceListResponse object if successful.
     */
    public PublicIpInstanceListResponse getList(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 공인 IP 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PublicIpInstanceListResponse> getListAsync(String responseFormatType, final ServiceCallback<PublicIpInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 공인 IP 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceListResponse object
     */
    public Observable<PublicIpInstanceListResponse> getListAsync(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<PublicIpInstanceListResponse>, PublicIpInstanceListResponse>() {
            @Override
            public PublicIpInstanceListResponse call(ServiceResponse<PublicIpInstanceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 공인 IP 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceListResponse object
     */
    public Observable<ServiceResponse<PublicIpInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String publicIpInstanceNoListN = null;
        final String publicIp = null;
        final String privateIp = null;
        final Boolean isAssociated = null;
        return service.getList(responseFormatType, regionCode, publicIpInstanceNoListN, publicIp, privateIp, isAssociated)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PublicIpInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<PublicIpInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PublicIpInstanceListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 공인 IP 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param publicIpInstanceNoListN 공인 IP 인스턴스 번호 리스트
     * @param publicIp 공인 IP 주소
     * @param privateIp 비공인 IP 주소
     * @param isAssociated 할당 여부
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpInstanceListResponse object if successful.
     */
    public PublicIpInstanceListResponse getList(String responseFormatType, String regionCode, String publicIpInstanceNoListN, String publicIp, String privateIp, Boolean isAssociated) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, publicIpInstanceNoListN, publicIp, privateIp, isAssociated).toBlocking().single().body();
    }

    /**
     * 공인 IP 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param publicIpInstanceNoListN 공인 IP 인스턴스 번호 리스트
     * @param publicIp 공인 IP 주소
     * @param privateIp 비공인 IP 주소
     * @param isAssociated 할당 여부
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PublicIpInstanceListResponse> getListAsync(String responseFormatType, String regionCode, String publicIpInstanceNoListN, String publicIp, String privateIp, Boolean isAssociated, final ServiceCallback<PublicIpInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, regionCode, publicIpInstanceNoListN, publicIp, privateIp, isAssociated), serviceCallback);
    }

    /**
     * 공인 IP 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param publicIpInstanceNoListN 공인 IP 인스턴스 번호 리스트
     * @param publicIp 공인 IP 주소
     * @param privateIp 비공인 IP 주소
     * @param isAssociated 할당 여부
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceListResponse object
     */
    public Observable<PublicIpInstanceListResponse> getListAsync(String responseFormatType, String regionCode, String publicIpInstanceNoListN, String publicIp, String privateIp, Boolean isAssociated) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, publicIpInstanceNoListN, publicIp, privateIp, isAssociated).map(new Func1<ServiceResponse<PublicIpInstanceListResponse>, PublicIpInstanceListResponse>() {
            @Override
            public PublicIpInstanceListResponse call(ServiceResponse<PublicIpInstanceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 공인 IP 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param publicIpInstanceNoListN 공인 IP 인스턴스 번호 리스트
     * @param publicIp 공인 IP 주소
     * @param privateIp 비공인 IP 주소
     * @param isAssociated 할당 여부
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceListResponse object
     */
    public Observable<ServiceResponse<PublicIpInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String publicIpInstanceNoListN, String publicIp, String privateIp, Boolean isAssociated) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, publicIpInstanceNoListN, publicIp, privateIp, isAssociated)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PublicIpInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<PublicIpInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PublicIpInstanceListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PublicIpInstanceListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PublicIpInstanceListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PublicIpInstanceListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 공인 IP 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpInstanceDetailResponse object if successful.
     */
    public PublicIpInstanceDetailResponse getDetail(String responseFormatType, String publicIpInstanceNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, publicIpInstanceNo).toBlocking().single().body();
    }

    /**
     * 공인 IP 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PublicIpInstanceDetailResponse> getDetailAsync(String responseFormatType, String publicIpInstanceNo, final ServiceCallback<PublicIpInstanceDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, publicIpInstanceNo), serviceCallback);
    }

    /**
     * 공인 IP 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceDetailResponse object
     */
    public Observable<PublicIpInstanceDetailResponse> getDetailAsync(String responseFormatType, String publicIpInstanceNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, publicIpInstanceNo).map(new Func1<ServiceResponse<PublicIpInstanceDetailResponse>, PublicIpInstanceDetailResponse>() {
            @Override
            public PublicIpInstanceDetailResponse call(ServiceResponse<PublicIpInstanceDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 공인 IP 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceDetailResponse object
     */
    public Observable<ServiceResponse<PublicIpInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String publicIpInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (publicIpInstanceNo == null) {
            throw new IllegalArgumentException("Parameter publicIpInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.getDetail(responseFormatType, regionCode, publicIpInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PublicIpInstanceDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<PublicIpInstanceDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PublicIpInstanceDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 공인 IP 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpInstanceDetailResponse object if successful.
     */
    public PublicIpInstanceDetailResponse getDetail(String responseFormatType, String publicIpInstanceNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * 공인 IP 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PublicIpInstanceDetailResponse> getDetailAsync(String responseFormatType, String publicIpInstanceNo, String regionCode, final ServiceCallback<PublicIpInstanceDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, regionCode), serviceCallback);
    }

    /**
     * 공인 IP 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceDetailResponse object
     */
    public Observable<PublicIpInstanceDetailResponse> getDetailAsync(String responseFormatType, String publicIpInstanceNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, regionCode).map(new Func1<ServiceResponse<PublicIpInstanceDetailResponse>, PublicIpInstanceDetailResponse>() {
            @Override
            public PublicIpInstanceDetailResponse call(ServiceResponse<PublicIpInstanceDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 공인 IP 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceDetailResponse object
     */
    public Observable<ServiceResponse<PublicIpInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String publicIpInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (publicIpInstanceNo == null) {
            throw new IllegalArgumentException("Parameter publicIpInstanceNo is required and cannot be null.");
        }
        return service.getDetail(responseFormatType, regionCode, publicIpInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PublicIpInstanceDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<PublicIpInstanceDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PublicIpInstanceDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PublicIpInstanceDetailResponse> getDetailDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PublicIpInstanceDetailResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PublicIpInstanceDetailResponse>() { }.getType())
                .build(response);
    }

    /**
     * 공인 IP 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpInstanceResponse object if successful.
     */
    public PublicIpInstanceResponse create(String responseFormatType) {
        return createWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 공인 IP 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PublicIpInstanceResponse> createAsync(String responseFormatType, final ServiceCallback<PublicIpInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 공인 IP 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceResponse object
     */
    public Observable<PublicIpInstanceResponse> createAsync(String responseFormatType) {
        return createWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<PublicIpInstanceResponse>, PublicIpInstanceResponse>() {
            @Override
            public PublicIpInstanceResponse call(ServiceResponse<PublicIpInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 공인 IP 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceResponse object
     */
    public Observable<ServiceResponse<PublicIpInstanceResponse>> createWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String serverInstanceNo = null;
        final String publicIpDescription = null;
        return service.create(responseFormatType, regionCode, serverInstanceNo, publicIpDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PublicIpInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<PublicIpInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PublicIpInstanceResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 공인 IP 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param publicIpDescription 공인 IP 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpInstanceResponse object if successful.
     */
    public PublicIpInstanceResponse create(String responseFormatType, String regionCode, String serverInstanceNo, String publicIpDescription) {
        return createWithServiceResponseAsync(responseFormatType, regionCode, serverInstanceNo, publicIpDescription).toBlocking().single().body();
    }

    /**
     * 공인 IP 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param publicIpDescription 공인 IP 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PublicIpInstanceResponse> createAsync(String responseFormatType, String regionCode, String serverInstanceNo, String publicIpDescription, final ServiceCallback<PublicIpInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, regionCode, serverInstanceNo, publicIpDescription), serviceCallback);
    }

    /**
     * 공인 IP 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param publicIpDescription 공인 IP 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceResponse object
     */
    public Observable<PublicIpInstanceResponse> createAsync(String responseFormatType, String regionCode, String serverInstanceNo, String publicIpDescription) {
        return createWithServiceResponseAsync(responseFormatType, regionCode, serverInstanceNo, publicIpDescription).map(new Func1<ServiceResponse<PublicIpInstanceResponse>, PublicIpInstanceResponse>() {
            @Override
            public PublicIpInstanceResponse call(ServiceResponse<PublicIpInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 공인 IP 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param publicIpDescription 공인 IP 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceResponse object
     */
    public Observable<ServiceResponse<PublicIpInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String regionCode, String serverInstanceNo, String publicIpDescription) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.create(responseFormatType, regionCode, serverInstanceNo, publicIpDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PublicIpInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<PublicIpInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PublicIpInstanceResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PublicIpInstanceResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PublicIpInstanceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PublicIpInstanceResponse>() { }.getType())
                .build(response);
    }

    /**
     * 공인 IP 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpInstanceResponse object if successful.
     */
    public PublicIpInstanceResponse delete(String responseFormatType, String publicIpInstanceNo) {
        return deleteWithServiceResponseAsync(responseFormatType, publicIpInstanceNo).toBlocking().single().body();
    }

    /**
     * 공인 IP 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PublicIpInstanceResponse> deleteAsync(String responseFormatType, String publicIpInstanceNo, final ServiceCallback<PublicIpInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, publicIpInstanceNo), serviceCallback);
    }

    /**
     * 공인 IP 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceResponse object
     */
    public Observable<PublicIpInstanceResponse> deleteAsync(String responseFormatType, String publicIpInstanceNo) {
        return deleteWithServiceResponseAsync(responseFormatType, publicIpInstanceNo).map(new Func1<ServiceResponse<PublicIpInstanceResponse>, PublicIpInstanceResponse>() {
            @Override
            public PublicIpInstanceResponse call(ServiceResponse<PublicIpInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 공인 IP 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceResponse object
     */
    public Observable<ServiceResponse<PublicIpInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String publicIpInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (publicIpInstanceNo == null) {
            throw new IllegalArgumentException("Parameter publicIpInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.delete(responseFormatType, regionCode, publicIpInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PublicIpInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<PublicIpInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PublicIpInstanceResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 공인 IP 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpInstanceResponse object if successful.
     */
    public PublicIpInstanceResponse delete(String responseFormatType, String publicIpInstanceNo, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * 공인 IP 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PublicIpInstanceResponse> deleteAsync(String responseFormatType, String publicIpInstanceNo, String regionCode, final ServiceCallback<PublicIpInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, regionCode), serviceCallback);
    }

    /**
     * 공인 IP 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceResponse object
     */
    public Observable<PublicIpInstanceResponse> deleteAsync(String responseFormatType, String publicIpInstanceNo, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, regionCode).map(new Func1<ServiceResponse<PublicIpInstanceResponse>, PublicIpInstanceResponse>() {
            @Override
            public PublicIpInstanceResponse call(ServiceResponse<PublicIpInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 공인 IP 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceResponse object
     */
    public Observable<ServiceResponse<PublicIpInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String publicIpInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (publicIpInstanceNo == null) {
            throw new IllegalArgumentException("Parameter publicIpInstanceNo is required and cannot be null.");
        }
        return service.delete(responseFormatType, regionCode, publicIpInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PublicIpInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<PublicIpInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PublicIpInstanceResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PublicIpInstanceResponse> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PublicIpInstanceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PublicIpInstanceResponse>() { }.getType())
                .build(response);
    }

    /**
     * 공인 IP 할당 가능한 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpTargetServerInstanceListResponse object if successful.
     */
    public PublicIpTargetServerInstanceListResponse getTargetList(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo) {
        return getTargetListWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, serverInstanceNo).toBlocking().single().body();
    }

    /**
     * 공인 IP 할당 가능한 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PublicIpTargetServerInstanceListResponse> getTargetListAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, final ServiceCallback<PublicIpTargetServerInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getTargetListWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, serverInstanceNo), serviceCallback);
    }

    /**
     * 공인 IP 할당 가능한 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpTargetServerInstanceListResponse object
     */
    public Observable<PublicIpTargetServerInstanceListResponse> getTargetListAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo) {
        return getTargetListWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, serverInstanceNo).map(new Func1<ServiceResponse<PublicIpTargetServerInstanceListResponse>, PublicIpTargetServerInstanceListResponse>() {
            @Override
            public PublicIpTargetServerInstanceListResponse call(ServiceResponse<PublicIpTargetServerInstanceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 공인 IP 할당 가능한 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpTargetServerInstanceListResponse object
     */
    public Observable<ServiceResponse<PublicIpTargetServerInstanceListResponse>> getTargetListWithServiceResponseAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (publicIpInstanceNo == null) {
            throw new IllegalArgumentException("Parameter publicIpInstanceNo is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.getTargetList(responseFormatType, regionCode, publicIpInstanceNo, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PublicIpTargetServerInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<PublicIpTargetServerInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PublicIpTargetServerInstanceListResponse> clientResponse = getTargetListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 공인 IP 할당 가능한 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpTargetServerInstanceListResponse object if successful.
     */
    public PublicIpTargetServerInstanceListResponse getTargetList(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, String regionCode) {
        return getTargetListWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, serverInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * 공인 IP 할당 가능한 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PublicIpTargetServerInstanceListResponse> getTargetListAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, String regionCode, final ServiceCallback<PublicIpTargetServerInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getTargetListWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, serverInstanceNo, regionCode), serviceCallback);
    }

    /**
     * 공인 IP 할당 가능한 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpTargetServerInstanceListResponse object
     */
    public Observable<PublicIpTargetServerInstanceListResponse> getTargetListAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, String regionCode) {
        return getTargetListWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, serverInstanceNo, regionCode).map(new Func1<ServiceResponse<PublicIpTargetServerInstanceListResponse>, PublicIpTargetServerInstanceListResponse>() {
            @Override
            public PublicIpTargetServerInstanceListResponse call(ServiceResponse<PublicIpTargetServerInstanceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 공인 IP 할당 가능한 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpTargetServerInstanceListResponse object
     */
    public Observable<ServiceResponse<PublicIpTargetServerInstanceListResponse>> getTargetListWithServiceResponseAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (publicIpInstanceNo == null) {
            throw new IllegalArgumentException("Parameter publicIpInstanceNo is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        return service.getTargetList(responseFormatType, regionCode, publicIpInstanceNo, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PublicIpTargetServerInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<PublicIpTargetServerInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PublicIpTargetServerInstanceListResponse> clientResponse = getTargetListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PublicIpTargetServerInstanceListResponse> getTargetListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PublicIpTargetServerInstanceListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PublicIpTargetServerInstanceListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 공인 IP를 서버 인스턴스에 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpWithServerInstanceResponse object if successful.
     */
    public PublicIpWithServerInstanceResponse associate(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo) {
        return associateWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, serverInstanceNo).toBlocking().single().body();
    }

    /**
     * 공인 IP를 서버 인스턴스에 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PublicIpWithServerInstanceResponse> associateAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, final ServiceCallback<PublicIpWithServerInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(associateWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, serverInstanceNo), serviceCallback);
    }

    /**
     * 공인 IP를 서버 인스턴스에 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpWithServerInstanceResponse object
     */
    public Observable<PublicIpWithServerInstanceResponse> associateAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo) {
        return associateWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, serverInstanceNo).map(new Func1<ServiceResponse<PublicIpWithServerInstanceResponse>, PublicIpWithServerInstanceResponse>() {
            @Override
            public PublicIpWithServerInstanceResponse call(ServiceResponse<PublicIpWithServerInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 공인 IP를 서버 인스턴스에 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpWithServerInstanceResponse object
     */
    public Observable<ServiceResponse<PublicIpWithServerInstanceResponse>> associateWithServiceResponseAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (publicIpInstanceNo == null) {
            throw new IllegalArgumentException("Parameter publicIpInstanceNo is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.associate(responseFormatType, regionCode, publicIpInstanceNo, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PublicIpWithServerInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<PublicIpWithServerInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PublicIpWithServerInstanceResponse> clientResponse = associateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 공인 IP를 서버 인스턴스에 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpWithServerInstanceResponse object if successful.
     */
    public PublicIpWithServerInstanceResponse associate(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, String regionCode) {
        return associateWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, serverInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * 공인 IP를 서버 인스턴스에 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PublicIpWithServerInstanceResponse> associateAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, String regionCode, final ServiceCallback<PublicIpWithServerInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(associateWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, serverInstanceNo, regionCode), serviceCallback);
    }

    /**
     * 공인 IP를 서버 인스턴스에 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpWithServerInstanceResponse object
     */
    public Observable<PublicIpWithServerInstanceResponse> associateAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, String regionCode) {
        return associateWithServiceResponseAsync(responseFormatType, publicIpInstanceNo, serverInstanceNo, regionCode).map(new Func1<ServiceResponse<PublicIpWithServerInstanceResponse>, PublicIpWithServerInstanceResponse>() {
            @Override
            public PublicIpWithServerInstanceResponse call(ServiceResponse<PublicIpWithServerInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 공인 IP를 서버 인스턴스에 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpWithServerInstanceResponse object
     */
    public Observable<ServiceResponse<PublicIpWithServerInstanceResponse>> associateWithServiceResponseAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (publicIpInstanceNo == null) {
            throw new IllegalArgumentException("Parameter publicIpInstanceNo is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        return service.associate(responseFormatType, regionCode, publicIpInstanceNo, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PublicIpWithServerInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<PublicIpWithServerInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PublicIpWithServerInstanceResponse> clientResponse = associateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PublicIpWithServerInstanceResponse> associateDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PublicIpWithServerInstanceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PublicIpWithServerInstanceResponse>() { }.getType())
                .build(response);
    }

    /**
     * 공인 IP를 서버 인스턴스에서 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpFromServerInstanceResponse object if successful.
     */
    public PublicIpFromServerInstanceResponse disassociate(String responseFormatType) {
        return disassociateWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 공인 IP를 서버 인스턴스에서 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PublicIpFromServerInstanceResponse> disassociateAsync(String responseFormatType, final ServiceCallback<PublicIpFromServerInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(disassociateWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 공인 IP를 서버 인스턴스에서 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpFromServerInstanceResponse object
     */
    public Observable<PublicIpFromServerInstanceResponse> disassociateAsync(String responseFormatType) {
        return disassociateWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<PublicIpFromServerInstanceResponse>, PublicIpFromServerInstanceResponse>() {
            @Override
            public PublicIpFromServerInstanceResponse call(ServiceResponse<PublicIpFromServerInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 공인 IP를 서버 인스턴스에서 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpFromServerInstanceResponse object
     */
    public Observable<ServiceResponse<PublicIpFromServerInstanceResponse>> disassociateWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String publicIpInstanceNo = null;
        final String serverInstanceNo = null;
        return service.disassociate(responseFormatType, regionCode, publicIpInstanceNo, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PublicIpFromServerInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<PublicIpFromServerInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PublicIpFromServerInstanceResponse> clientResponse = disassociateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 공인 IP를 서버 인스턴스에서 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpFromServerInstanceResponse object if successful.
     */
    public PublicIpFromServerInstanceResponse disassociate(String responseFormatType, String regionCode, String publicIpInstanceNo, String serverInstanceNo) {
        return disassociateWithServiceResponseAsync(responseFormatType, regionCode, publicIpInstanceNo, serverInstanceNo).toBlocking().single().body();
    }

    /**
     * 공인 IP를 서버 인스턴스에서 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PublicIpFromServerInstanceResponse> disassociateAsync(String responseFormatType, String regionCode, String publicIpInstanceNo, String serverInstanceNo, final ServiceCallback<PublicIpFromServerInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(disassociateWithServiceResponseAsync(responseFormatType, regionCode, publicIpInstanceNo, serverInstanceNo), serviceCallback);
    }

    /**
     * 공인 IP를 서버 인스턴스에서 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpFromServerInstanceResponse object
     */
    public Observable<PublicIpFromServerInstanceResponse> disassociateAsync(String responseFormatType, String regionCode, String publicIpInstanceNo, String serverInstanceNo) {
        return disassociateWithServiceResponseAsync(responseFormatType, regionCode, publicIpInstanceNo, serverInstanceNo).map(new Func1<ServiceResponse<PublicIpFromServerInstanceResponse>, PublicIpFromServerInstanceResponse>() {
            @Override
            public PublicIpFromServerInstanceResponse call(ServiceResponse<PublicIpFromServerInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 공인 IP를 서버 인스턴스에서 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpFromServerInstanceResponse object
     */
    public Observable<ServiceResponse<PublicIpFromServerInstanceResponse>> disassociateWithServiceResponseAsync(String responseFormatType, String regionCode, String publicIpInstanceNo, String serverInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.disassociate(responseFormatType, regionCode, publicIpInstanceNo, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PublicIpFromServerInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<PublicIpFromServerInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PublicIpFromServerInstanceResponse> clientResponse = disassociateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PublicIpFromServerInstanceResponse> disassociateDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PublicIpFromServerInstanceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PublicIpFromServerInstanceResponse>() { }.getType())
                .build(response);
    }

}
