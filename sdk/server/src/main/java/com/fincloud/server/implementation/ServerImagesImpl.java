/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.implementation;

import retrofit2.Retrofit;
import com.fincloud.server.ServerImages;
import com.fincloud.server.models.MemberServerImageInstanceListResponse;
import com.fincloud.server.models.MemberServerImageInstanceResponse;
import com.fincloud.server.models.MemberServerImageInstanceStatusCode;
import com.fincloud.server.models.PlatformTypeCode;
import com.fincloud.server.models.SortingOrder;
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
 * in ServerImages.
 */
public class ServerImagesImpl implements ServerImages {
    /** The Retrofit service to perform REST calls. */
    private ServerImagesService service;
    /** The service client containing this operation class. */
    private ServerManagementClientImpl client;

    /**
     * Initializes an instance of ServerImages.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ServerImagesImpl(Retrofit retrofit, ServerManagementClientImpl client) {
        this.service = retrofit.create(ServerImagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ServerImages to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ServerImagesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.ServerImages getList" })
        @GET("vserver/v2/getMemberServerImageInstanceList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("memberServerImageName") String memberServerImageName, @Query("memberServerImageInstanceStatusCode") MemberServerImageInstanceStatusCode memberServerImageInstanceStatusCode1, @Query("memberServerImageInstanceNoList.N") String memberServerImageInstanceNoListN, @Query("platformTypeCodeList.N") PlatformTypeCode platformTypeCodeListN, @Query("pageNo") String pageNo, @Query("pageSize") String pageSize, @Query("sortedBy") String sortedBy, @Query("sortingOrder") SortingOrder sortingOrder1);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.ServerImages getDetail" })
        @GET("vserver/v2/getMemberServerImageInstanceDetail")
        Observable<Response<ResponseBody>> getDetail(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("memberServerImageInstanceNo") String memberServerImageInstanceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.ServerImages create" })
        @POST("vserver/v2/createMemberServerImageInstance")
        Observable<Response<ResponseBody>> create(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("serverInstanceNo") String serverInstanceNo, @Query("memberServerImageName") String memberServerImageName, @Query("memberServerImageDescription") String memberServerImageDescription);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.ServerImages delete" })
        @POST("vserver/v2/deleteMemberServerImageInstances")
        Observable<Response<ResponseBody>> delete(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("memberServerImageInstanceNoList.N") String memberServerImageInstanceNoListN);

    }

    /**
     * 회원 서버 이미지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MemberServerImageInstanceListResponse object if successful.
     */
    public MemberServerImageInstanceListResponse getList(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 회원 서버 이미지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MemberServerImageInstanceListResponse> getListAsync(String responseFormatType, final ServiceCallback<MemberServerImageInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 회원 서버 이미지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceListResponse object
     */
    public Observable<MemberServerImageInstanceListResponse> getListAsync(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<MemberServerImageInstanceListResponse>, MemberServerImageInstanceListResponse>() {
            @Override
            public MemberServerImageInstanceListResponse call(ServiceResponse<MemberServerImageInstanceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 회원 서버 이미지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceListResponse object
     */
    public Observable<ServiceResponse<MemberServerImageInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String memberServerImageName = null;
        final MemberServerImageInstanceStatusCode memberServerImageInstanceStatusCode = null;
        final String memberServerImageInstanceNoListN = null;
        final PlatformTypeCode platformTypeCodeListN = null;
        final String pageNo = null;
        final String pageSize = null;
        final String sortedBy = null;
        final SortingOrder sortingOrder = null;
        return service.getList(responseFormatType, regionCode, memberServerImageName, memberServerImageInstanceStatusCode, memberServerImageInstanceNoListN, platformTypeCodeListN, pageNo, pageSize, sortedBy, sortingOrder)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MemberServerImageInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<MemberServerImageInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MemberServerImageInstanceListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 회원 서버 이미지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param memberServerImageName 회원 서버 이미지 이름
     * @param memberServerImageInstanceStatusCode 회원 서버 이미지 인스턴스 상태 코드. Possible values include: 'INIT', 'CREATE'
     * @param memberServerImageInstanceNoListN 회원 서버 이미지 인스턴스 번호 리스트
     * @param platformTypeCodeListN 플랫폼 유형 코드 리스트. Possible values include: 'LNX32', 'LNX64', 'WND32', 'WND64', 'UBD64', 'UBS64'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MemberServerImageInstanceListResponse object if successful.
     */
    public MemberServerImageInstanceListResponse getList(String responseFormatType, String regionCode, String memberServerImageName, MemberServerImageInstanceStatusCode memberServerImageInstanceStatusCode, String memberServerImageInstanceNoListN, PlatformTypeCode platformTypeCodeListN, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, memberServerImageName, memberServerImageInstanceStatusCode, memberServerImageInstanceNoListN, platformTypeCodeListN, pageNo, pageSize, sortedBy, sortingOrder).toBlocking().single().body();
    }

    /**
     * 회원 서버 이미지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param memberServerImageName 회원 서버 이미지 이름
     * @param memberServerImageInstanceStatusCode 회원 서버 이미지 인스턴스 상태 코드. Possible values include: 'INIT', 'CREATE'
     * @param memberServerImageInstanceNoListN 회원 서버 이미지 인스턴스 번호 리스트
     * @param platformTypeCodeListN 플랫폼 유형 코드 리스트. Possible values include: 'LNX32', 'LNX64', 'WND32', 'WND64', 'UBD64', 'UBS64'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MemberServerImageInstanceListResponse> getListAsync(String responseFormatType, String regionCode, String memberServerImageName, MemberServerImageInstanceStatusCode memberServerImageInstanceStatusCode, String memberServerImageInstanceNoListN, PlatformTypeCode platformTypeCodeListN, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, final ServiceCallback<MemberServerImageInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, regionCode, memberServerImageName, memberServerImageInstanceStatusCode, memberServerImageInstanceNoListN, platformTypeCodeListN, pageNo, pageSize, sortedBy, sortingOrder), serviceCallback);
    }

    /**
     * 회원 서버 이미지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param memberServerImageName 회원 서버 이미지 이름
     * @param memberServerImageInstanceStatusCode 회원 서버 이미지 인스턴스 상태 코드. Possible values include: 'INIT', 'CREATE'
     * @param memberServerImageInstanceNoListN 회원 서버 이미지 인스턴스 번호 리스트
     * @param platformTypeCodeListN 플랫폼 유형 코드 리스트. Possible values include: 'LNX32', 'LNX64', 'WND32', 'WND64', 'UBD64', 'UBS64'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceListResponse object
     */
    public Observable<MemberServerImageInstanceListResponse> getListAsync(String responseFormatType, String regionCode, String memberServerImageName, MemberServerImageInstanceStatusCode memberServerImageInstanceStatusCode, String memberServerImageInstanceNoListN, PlatformTypeCode platformTypeCodeListN, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, memberServerImageName, memberServerImageInstanceStatusCode, memberServerImageInstanceNoListN, platformTypeCodeListN, pageNo, pageSize, sortedBy, sortingOrder).map(new Func1<ServiceResponse<MemberServerImageInstanceListResponse>, MemberServerImageInstanceListResponse>() {
            @Override
            public MemberServerImageInstanceListResponse call(ServiceResponse<MemberServerImageInstanceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 회원 서버 이미지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param memberServerImageName 회원 서버 이미지 이름
     * @param memberServerImageInstanceStatusCode 회원 서버 이미지 인스턴스 상태 코드. Possible values include: 'INIT', 'CREATE'
     * @param memberServerImageInstanceNoListN 회원 서버 이미지 인스턴스 번호 리스트
     * @param platformTypeCodeListN 플랫폼 유형 코드 리스트. Possible values include: 'LNX32', 'LNX64', 'WND32', 'WND64', 'UBD64', 'UBS64'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceListResponse object
     */
    public Observable<ServiceResponse<MemberServerImageInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String memberServerImageName, MemberServerImageInstanceStatusCode memberServerImageInstanceStatusCode, String memberServerImageInstanceNoListN, PlatformTypeCode platformTypeCodeListN, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, memberServerImageName, memberServerImageInstanceStatusCode, memberServerImageInstanceNoListN, platformTypeCodeListN, pageNo, pageSize, sortedBy, sortingOrder)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MemberServerImageInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<MemberServerImageInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MemberServerImageInstanceListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MemberServerImageInstanceListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MemberServerImageInstanceListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MemberServerImageInstanceListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 회원 서버 이미지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MemberServerImageInstanceListResponse object if successful.
     */
    public MemberServerImageInstanceListResponse getDetail(String responseFormatType, String memberServerImageInstanceNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, memberServerImageInstanceNo).toBlocking().single().body();
    }

    /**
     * 회원 서버 이미지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MemberServerImageInstanceListResponse> getDetailAsync(String responseFormatType, String memberServerImageInstanceNo, final ServiceCallback<MemberServerImageInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, memberServerImageInstanceNo), serviceCallback);
    }

    /**
     * 회원 서버 이미지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceListResponse object
     */
    public Observable<MemberServerImageInstanceListResponse> getDetailAsync(String responseFormatType, String memberServerImageInstanceNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, memberServerImageInstanceNo).map(new Func1<ServiceResponse<MemberServerImageInstanceListResponse>, MemberServerImageInstanceListResponse>() {
            @Override
            public MemberServerImageInstanceListResponse call(ServiceResponse<MemberServerImageInstanceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 회원 서버 이미지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceListResponse object
     */
    public Observable<ServiceResponse<MemberServerImageInstanceListResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String memberServerImageInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (memberServerImageInstanceNo == null) {
            throw new IllegalArgumentException("Parameter memberServerImageInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.getDetail(responseFormatType, regionCode, memberServerImageInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MemberServerImageInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<MemberServerImageInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MemberServerImageInstanceListResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 회원 서버 이미지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MemberServerImageInstanceListResponse object if successful.
     */
    public MemberServerImageInstanceListResponse getDetail(String responseFormatType, String memberServerImageInstanceNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, memberServerImageInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * 회원 서버 이미지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MemberServerImageInstanceListResponse> getDetailAsync(String responseFormatType, String memberServerImageInstanceNo, String regionCode, final ServiceCallback<MemberServerImageInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, memberServerImageInstanceNo, regionCode), serviceCallback);
    }

    /**
     * 회원 서버 이미지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceListResponse object
     */
    public Observable<MemberServerImageInstanceListResponse> getDetailAsync(String responseFormatType, String memberServerImageInstanceNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, memberServerImageInstanceNo, regionCode).map(new Func1<ServiceResponse<MemberServerImageInstanceListResponse>, MemberServerImageInstanceListResponse>() {
            @Override
            public MemberServerImageInstanceListResponse call(ServiceResponse<MemberServerImageInstanceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 회원 서버 이미지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceListResponse object
     */
    public Observable<ServiceResponse<MemberServerImageInstanceListResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String memberServerImageInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (memberServerImageInstanceNo == null) {
            throw new IllegalArgumentException("Parameter memberServerImageInstanceNo is required and cannot be null.");
        }
        return service.getDetail(responseFormatType, regionCode, memberServerImageInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MemberServerImageInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<MemberServerImageInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MemberServerImageInstanceListResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MemberServerImageInstanceListResponse> getDetailDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MemberServerImageInstanceListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MemberServerImageInstanceListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 회원 서버 이미지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MemberServerImageInstanceResponse object if successful.
     */
    public MemberServerImageInstanceResponse create(String responseFormatType, String serverInstanceNo) {
        return createWithServiceResponseAsync(responseFormatType, serverInstanceNo).toBlocking().single().body();
    }

    /**
     * 회원 서버 이미지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MemberServerImageInstanceResponse> createAsync(String responseFormatType, String serverInstanceNo, final ServiceCallback<MemberServerImageInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, serverInstanceNo), serviceCallback);
    }

    /**
     * 회원 서버 이미지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceResponse object
     */
    public Observable<MemberServerImageInstanceResponse> createAsync(String responseFormatType, String serverInstanceNo) {
        return createWithServiceResponseAsync(responseFormatType, serverInstanceNo).map(new Func1<ServiceResponse<MemberServerImageInstanceResponse>, MemberServerImageInstanceResponse>() {
            @Override
            public MemberServerImageInstanceResponse call(ServiceResponse<MemberServerImageInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 회원 서버 이미지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceResponse object
     */
    public Observable<ServiceResponse<MemberServerImageInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String serverInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        final String memberServerImageName = null;
        final String memberServerImageDescription = null;
        return service.create(responseFormatType, regionCode, serverInstanceNo, memberServerImageName, memberServerImageDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MemberServerImageInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<MemberServerImageInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MemberServerImageInstanceResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 회원 서버 이미지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param memberServerImageName 회원 서버 이미지 이름
     * @param memberServerImageDescription 회원 서버 이미지 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MemberServerImageInstanceResponse object if successful.
     */
    public MemberServerImageInstanceResponse create(String responseFormatType, String serverInstanceNo, String regionCode, String memberServerImageName, String memberServerImageDescription) {
        return createWithServiceResponseAsync(responseFormatType, serverInstanceNo, regionCode, memberServerImageName, memberServerImageDescription).toBlocking().single().body();
    }

    /**
     * 회원 서버 이미지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param memberServerImageName 회원 서버 이미지 이름
     * @param memberServerImageDescription 회원 서버 이미지 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MemberServerImageInstanceResponse> createAsync(String responseFormatType, String serverInstanceNo, String regionCode, String memberServerImageName, String memberServerImageDescription, final ServiceCallback<MemberServerImageInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, serverInstanceNo, regionCode, memberServerImageName, memberServerImageDescription), serviceCallback);
    }

    /**
     * 회원 서버 이미지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param memberServerImageName 회원 서버 이미지 이름
     * @param memberServerImageDescription 회원 서버 이미지 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceResponse object
     */
    public Observable<MemberServerImageInstanceResponse> createAsync(String responseFormatType, String serverInstanceNo, String regionCode, String memberServerImageName, String memberServerImageDescription) {
        return createWithServiceResponseAsync(responseFormatType, serverInstanceNo, regionCode, memberServerImageName, memberServerImageDescription).map(new Func1<ServiceResponse<MemberServerImageInstanceResponse>, MemberServerImageInstanceResponse>() {
            @Override
            public MemberServerImageInstanceResponse call(ServiceResponse<MemberServerImageInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 회원 서버 이미지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param memberServerImageName 회원 서버 이미지 이름
     * @param memberServerImageDescription 회원 서버 이미지 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceResponse object
     */
    public Observable<ServiceResponse<MemberServerImageInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String serverInstanceNo, String regionCode, String memberServerImageName, String memberServerImageDescription) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        return service.create(responseFormatType, regionCode, serverInstanceNo, memberServerImageName, memberServerImageDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MemberServerImageInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<MemberServerImageInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MemberServerImageInstanceResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MemberServerImageInstanceResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MemberServerImageInstanceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MemberServerImageInstanceResponse>() { }.getType())
                .build(response);
    }

    /**
     * 회원 서버 이미지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MemberServerImageInstanceResponse object if successful.
     */
    public MemberServerImageInstanceResponse delete(String responseFormatType) {
        return deleteWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 회원 서버 이미지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MemberServerImageInstanceResponse> deleteAsync(String responseFormatType, final ServiceCallback<MemberServerImageInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 회원 서버 이미지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceResponse object
     */
    public Observable<MemberServerImageInstanceResponse> deleteAsync(String responseFormatType) {
        return deleteWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<MemberServerImageInstanceResponse>, MemberServerImageInstanceResponse>() {
            @Override
            public MemberServerImageInstanceResponse call(ServiceResponse<MemberServerImageInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 회원 서버 이미지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceResponse object
     */
    public Observable<ServiceResponse<MemberServerImageInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String memberServerImageInstanceNoListN = null;
        return service.delete(responseFormatType, regionCode, memberServerImageInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MemberServerImageInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<MemberServerImageInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MemberServerImageInstanceResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 회원 서버 이미지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param memberServerImageInstanceNoListN 회원 서버 이미지 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MemberServerImageInstanceResponse object if successful.
     */
    public MemberServerImageInstanceResponse delete(String responseFormatType, String regionCode, String memberServerImageInstanceNoListN) {
        return deleteWithServiceResponseAsync(responseFormatType, regionCode, memberServerImageInstanceNoListN).toBlocking().single().body();
    }

    /**
     * 회원 서버 이미지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param memberServerImageInstanceNoListN 회원 서버 이미지 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MemberServerImageInstanceResponse> deleteAsync(String responseFormatType, String regionCode, String memberServerImageInstanceNoListN, final ServiceCallback<MemberServerImageInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, regionCode, memberServerImageInstanceNoListN), serviceCallback);
    }

    /**
     * 회원 서버 이미지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param memberServerImageInstanceNoListN 회원 서버 이미지 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceResponse object
     */
    public Observable<MemberServerImageInstanceResponse> deleteAsync(String responseFormatType, String regionCode, String memberServerImageInstanceNoListN) {
        return deleteWithServiceResponseAsync(responseFormatType, regionCode, memberServerImageInstanceNoListN).map(new Func1<ServiceResponse<MemberServerImageInstanceResponse>, MemberServerImageInstanceResponse>() {
            @Override
            public MemberServerImageInstanceResponse call(ServiceResponse<MemberServerImageInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 회원 서버 이미지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param memberServerImageInstanceNoListN 회원 서버 이미지 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceResponse object
     */
    public Observable<ServiceResponse<MemberServerImageInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String regionCode, String memberServerImageInstanceNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.delete(responseFormatType, regionCode, memberServerImageInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MemberServerImageInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<MemberServerImageInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MemberServerImageInstanceResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MemberServerImageInstanceResponse> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MemberServerImageInstanceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MemberServerImageInstanceResponse>() { }.getType())
                .build(response);
    }

}
