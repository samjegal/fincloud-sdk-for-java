/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.implementation;

import retrofit2.Retrofit;
import com.fincloud.server.InitScripts;
import com.fincloud.server.models.InitScriptDetailResponse;
import com.fincloud.server.models.InitScriptListResponse;
import com.fincloud.server.models.InitScriptResponse;
import com.fincloud.server.models.OsTypeCode;
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
 * in InitScripts.
 */
public class InitScriptsImpl implements InitScripts {
    /** The Retrofit service to perform REST calls. */
    private InitScriptsService service;
    /** The service client containing this operation class. */
    private ServerManagementClientImpl client;

    /**
     * Initializes an instance of InitScripts.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public InitScriptsImpl(Retrofit retrofit, ServerManagementClientImpl client) {
        this.service = retrofit.create(InitScriptsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for InitScripts to be
     * used by Retrofit to perform actually REST calls.
     */
    interface InitScriptsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.InitScripts getList" })
        @GET("vserver/v2/getInitScriptList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("osTypeCode") OsTypeCode osTypeCode1, @Query("pageNo") String pageNo, @Query("pageSize") String pageSize, @Query("sortedBy") String sortedBy, @Query("sortingOrder") SortingOrder sortingOrder1, @Query("initScriptName") String initScriptName, @Query("initScriptNoList.N") String initScriptNoListN);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.InitScripts getDetail" })
        @GET("vserver/v2/getInitScriptDetail")
        Observable<Response<ResponseBody>> getDetail(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("initScriptNo") String initScriptNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.InitScripts create" })
        @POST("vserver/v2/createInitScript")
        Observable<Response<ResponseBody>> create(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("osTypeCode") OsTypeCode osTypeCode1, @Query("initScriptName") String initScriptName, @Query("initScriptContent") String initScriptContent, @Query("initScriptDescription") String initScriptDescription);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.InitScripts delete" })
        @POST("vserver/v2/deleteInitScripts")
        Observable<Response<ResponseBody>> delete(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("initScriptNoList.N") String initScriptNoListN);

    }

    /**
     * 초기화 스크립트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InitScriptListResponse object if successful.
     */
    public InitScriptListResponse getList(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 초기화 스크립트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InitScriptListResponse> getListAsync(String responseFormatType, final ServiceCallback<InitScriptListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 초기화 스크립트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptListResponse object
     */
    public Observable<InitScriptListResponse> getListAsync(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<InitScriptListResponse>, InitScriptListResponse>() {
            @Override
            public InitScriptListResponse call(ServiceResponse<InitScriptListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 초기화 스크립트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptListResponse object
     */
    public Observable<ServiceResponse<InitScriptListResponse>> getListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final OsTypeCode osTypeCode = null;
        final String pageNo = null;
        final String pageSize = null;
        final String sortedBy = null;
        final SortingOrder sortingOrder = null;
        final String initScriptName = null;
        final String initScriptNoListN = null;
        return service.getList(responseFormatType, regionCode, osTypeCode, pageNo, pageSize, sortedBy, sortingOrder, initScriptName, initScriptNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InitScriptListResponse>>>() {
                @Override
                public Observable<ServiceResponse<InitScriptListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InitScriptListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 초기화 스크립트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param osTypeCode OS 유형 코드. Possible values include: 'LNX', 'WND'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param initScriptName 초기화 스크립트 이름
     * @param initScriptNoListN 초기화 스크립트 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InitScriptListResponse object if successful.
     */
    public InitScriptListResponse getList(String responseFormatType, String regionCode, OsTypeCode osTypeCode, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, String initScriptName, String initScriptNoListN) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, osTypeCode, pageNo, pageSize, sortedBy, sortingOrder, initScriptName, initScriptNoListN).toBlocking().single().body();
    }

    /**
     * 초기화 스크립트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param osTypeCode OS 유형 코드. Possible values include: 'LNX', 'WND'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param initScriptName 초기화 스크립트 이름
     * @param initScriptNoListN 초기화 스크립트 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InitScriptListResponse> getListAsync(String responseFormatType, String regionCode, OsTypeCode osTypeCode, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, String initScriptName, String initScriptNoListN, final ServiceCallback<InitScriptListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, regionCode, osTypeCode, pageNo, pageSize, sortedBy, sortingOrder, initScriptName, initScriptNoListN), serviceCallback);
    }

    /**
     * 초기화 스크립트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param osTypeCode OS 유형 코드. Possible values include: 'LNX', 'WND'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param initScriptName 초기화 스크립트 이름
     * @param initScriptNoListN 초기화 스크립트 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptListResponse object
     */
    public Observable<InitScriptListResponse> getListAsync(String responseFormatType, String regionCode, OsTypeCode osTypeCode, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, String initScriptName, String initScriptNoListN) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, osTypeCode, pageNo, pageSize, sortedBy, sortingOrder, initScriptName, initScriptNoListN).map(new Func1<ServiceResponse<InitScriptListResponse>, InitScriptListResponse>() {
            @Override
            public InitScriptListResponse call(ServiceResponse<InitScriptListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 초기화 스크립트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param osTypeCode OS 유형 코드. Possible values include: 'LNX', 'WND'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param initScriptName 초기화 스크립트 이름
     * @param initScriptNoListN 초기화 스크립트 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptListResponse object
     */
    public Observable<ServiceResponse<InitScriptListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, OsTypeCode osTypeCode, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, String initScriptName, String initScriptNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, osTypeCode, pageNo, pageSize, sortedBy, sortingOrder, initScriptName, initScriptNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InitScriptListResponse>>>() {
                @Override
                public Observable<ServiceResponse<InitScriptListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InitScriptListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<InitScriptListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<InitScriptListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<InitScriptListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 초기화 스크립트 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InitScriptDetailResponse object if successful.
     */
    public InitScriptDetailResponse getDetail(String responseFormatType) {
        return getDetailWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 초기화 스크립트 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InitScriptDetailResponse> getDetailAsync(String responseFormatType, final ServiceCallback<InitScriptDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 초기화 스크립트 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptDetailResponse object
     */
    public Observable<InitScriptDetailResponse> getDetailAsync(String responseFormatType) {
        return getDetailWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<InitScriptDetailResponse>, InitScriptDetailResponse>() {
            @Override
            public InitScriptDetailResponse call(ServiceResponse<InitScriptDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 초기화 스크립트 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptDetailResponse object
     */
    public Observable<ServiceResponse<InitScriptDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String initScriptNo = null;
        return service.getDetail(responseFormatType, regionCode, initScriptNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InitScriptDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<InitScriptDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InitScriptDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 초기화 스크립트 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param initScriptNo 초기화 스크립트 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InitScriptDetailResponse object if successful.
     */
    public InitScriptDetailResponse getDetail(String responseFormatType, String regionCode, String initScriptNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, regionCode, initScriptNo).toBlocking().single().body();
    }

    /**
     * 초기화 스크립트 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param initScriptNo 초기화 스크립트 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InitScriptDetailResponse> getDetailAsync(String responseFormatType, String regionCode, String initScriptNo, final ServiceCallback<InitScriptDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, regionCode, initScriptNo), serviceCallback);
    }

    /**
     * 초기화 스크립트 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param initScriptNo 초기화 스크립트 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptDetailResponse object
     */
    public Observable<InitScriptDetailResponse> getDetailAsync(String responseFormatType, String regionCode, String initScriptNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, regionCode, initScriptNo).map(new Func1<ServiceResponse<InitScriptDetailResponse>, InitScriptDetailResponse>() {
            @Override
            public InitScriptDetailResponse call(ServiceResponse<InitScriptDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 초기화 스크립트 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param initScriptNo 초기화 스크립트 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptDetailResponse object
     */
    public Observable<ServiceResponse<InitScriptDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String regionCode, String initScriptNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getDetail(responseFormatType, regionCode, initScriptNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InitScriptDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<InitScriptDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InitScriptDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<InitScriptDetailResponse> getDetailDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<InitScriptDetailResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<InitScriptDetailResponse>() { }.getType())
                .build(response);
    }

    /**
     * 초기화 스크립트를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param initScriptContent 초기화 스크립트 내용
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InitScriptResponse object if successful.
     */
    public InitScriptResponse create(String responseFormatType, String initScriptContent) {
        return createWithServiceResponseAsync(responseFormatType, initScriptContent).toBlocking().single().body();
    }

    /**
     * 초기화 스크립트를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param initScriptContent 초기화 스크립트 내용
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InitScriptResponse> createAsync(String responseFormatType, String initScriptContent, final ServiceCallback<InitScriptResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, initScriptContent), serviceCallback);
    }

    /**
     * 초기화 스크립트를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param initScriptContent 초기화 스크립트 내용
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptResponse object
     */
    public Observable<InitScriptResponse> createAsync(String responseFormatType, String initScriptContent) {
        return createWithServiceResponseAsync(responseFormatType, initScriptContent).map(new Func1<ServiceResponse<InitScriptResponse>, InitScriptResponse>() {
            @Override
            public InitScriptResponse call(ServiceResponse<InitScriptResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 초기화 스크립트를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param initScriptContent 초기화 스크립트 내용
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptResponse object
     */
    public Observable<ServiceResponse<InitScriptResponse>> createWithServiceResponseAsync(String responseFormatType, String initScriptContent) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (initScriptContent == null) {
            throw new IllegalArgumentException("Parameter initScriptContent is required and cannot be null.");
        }
        final String regionCode = null;
        final OsTypeCode osTypeCode = null;
        final String initScriptName = null;
        final String initScriptDescription = null;
        return service.create(responseFormatType, regionCode, osTypeCode, initScriptName, initScriptContent, initScriptDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InitScriptResponse>>>() {
                @Override
                public Observable<ServiceResponse<InitScriptResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InitScriptResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 초기화 스크립트를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param initScriptContent 초기화 스크립트 내용
     * @param regionCode REGION 코드
     * @param osTypeCode OS 유형 코드. Possible values include: 'LNX', 'WND'
     * @param initScriptName 초기화 스크립트 이름
     * @param initScriptDescription 초기화 스크립트 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InitScriptResponse object if successful.
     */
    public InitScriptResponse create(String responseFormatType, String initScriptContent, String regionCode, OsTypeCode osTypeCode, String initScriptName, String initScriptDescription) {
        return createWithServiceResponseAsync(responseFormatType, initScriptContent, regionCode, osTypeCode, initScriptName, initScriptDescription).toBlocking().single().body();
    }

    /**
     * 초기화 스크립트를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param initScriptContent 초기화 스크립트 내용
     * @param regionCode REGION 코드
     * @param osTypeCode OS 유형 코드. Possible values include: 'LNX', 'WND'
     * @param initScriptName 초기화 스크립트 이름
     * @param initScriptDescription 초기화 스크립트 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InitScriptResponse> createAsync(String responseFormatType, String initScriptContent, String regionCode, OsTypeCode osTypeCode, String initScriptName, String initScriptDescription, final ServiceCallback<InitScriptResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, initScriptContent, regionCode, osTypeCode, initScriptName, initScriptDescription), serviceCallback);
    }

    /**
     * 초기화 스크립트를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param initScriptContent 초기화 스크립트 내용
     * @param regionCode REGION 코드
     * @param osTypeCode OS 유형 코드. Possible values include: 'LNX', 'WND'
     * @param initScriptName 초기화 스크립트 이름
     * @param initScriptDescription 초기화 스크립트 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptResponse object
     */
    public Observable<InitScriptResponse> createAsync(String responseFormatType, String initScriptContent, String regionCode, OsTypeCode osTypeCode, String initScriptName, String initScriptDescription) {
        return createWithServiceResponseAsync(responseFormatType, initScriptContent, regionCode, osTypeCode, initScriptName, initScriptDescription).map(new Func1<ServiceResponse<InitScriptResponse>, InitScriptResponse>() {
            @Override
            public InitScriptResponse call(ServiceResponse<InitScriptResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 초기화 스크립트를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param initScriptContent 초기화 스크립트 내용
     * @param regionCode REGION 코드
     * @param osTypeCode OS 유형 코드. Possible values include: 'LNX', 'WND'
     * @param initScriptName 초기화 스크립트 이름
     * @param initScriptDescription 초기화 스크립트 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptResponse object
     */
    public Observable<ServiceResponse<InitScriptResponse>> createWithServiceResponseAsync(String responseFormatType, String initScriptContent, String regionCode, OsTypeCode osTypeCode, String initScriptName, String initScriptDescription) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (initScriptContent == null) {
            throw new IllegalArgumentException("Parameter initScriptContent is required and cannot be null.");
        }
        return service.create(responseFormatType, regionCode, osTypeCode, initScriptName, initScriptContent, initScriptDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InitScriptResponse>>>() {
                @Override
                public Observable<ServiceResponse<InitScriptResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InitScriptResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<InitScriptResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<InitScriptResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<InitScriptResponse>() { }.getType())
                .build(response);
    }

    /**
     * 초기화 스크립트를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InitScriptResponse object if successful.
     */
    public InitScriptResponse delete(String responseFormatType) {
        return deleteWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 초기화 스크립트를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InitScriptResponse> deleteAsync(String responseFormatType, final ServiceCallback<InitScriptResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 초기화 스크립트를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptResponse object
     */
    public Observable<InitScriptResponse> deleteAsync(String responseFormatType) {
        return deleteWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<InitScriptResponse>, InitScriptResponse>() {
            @Override
            public InitScriptResponse call(ServiceResponse<InitScriptResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 초기화 스크립트를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptResponse object
     */
    public Observable<ServiceResponse<InitScriptResponse>> deleteWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String initScriptNoListN = null;
        return service.delete(responseFormatType, regionCode, initScriptNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InitScriptResponse>>>() {
                @Override
                public Observable<ServiceResponse<InitScriptResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InitScriptResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 초기화 스크립트를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param initScriptNoListN 초기화 스크립트 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InitScriptResponse object if successful.
     */
    public InitScriptResponse delete(String responseFormatType, String regionCode, String initScriptNoListN) {
        return deleteWithServiceResponseAsync(responseFormatType, regionCode, initScriptNoListN).toBlocking().single().body();
    }

    /**
     * 초기화 스크립트를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param initScriptNoListN 초기화 스크립트 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InitScriptResponse> deleteAsync(String responseFormatType, String regionCode, String initScriptNoListN, final ServiceCallback<InitScriptResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, regionCode, initScriptNoListN), serviceCallback);
    }

    /**
     * 초기화 스크립트를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param initScriptNoListN 초기화 스크립트 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptResponse object
     */
    public Observable<InitScriptResponse> deleteAsync(String responseFormatType, String regionCode, String initScriptNoListN) {
        return deleteWithServiceResponseAsync(responseFormatType, regionCode, initScriptNoListN).map(new Func1<ServiceResponse<InitScriptResponse>, InitScriptResponse>() {
            @Override
            public InitScriptResponse call(ServiceResponse<InitScriptResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 초기화 스크립트를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param initScriptNoListN 초기화 스크립트 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptResponse object
     */
    public Observable<ServiceResponse<InitScriptResponse>> deleteWithServiceResponseAsync(String responseFormatType, String regionCode, String initScriptNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.delete(responseFormatType, regionCode, initScriptNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InitScriptResponse>>>() {
                @Override
                public Observable<ServiceResponse<InitScriptResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InitScriptResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<InitScriptResponse> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<InitScriptResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<InitScriptResponse>() { }.getType())
                .build(response);
    }

}
