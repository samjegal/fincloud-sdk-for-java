/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.implementation;

import retrofit2.Retrofit;
import com.fincloud.server.PlacementGroups;
import com.fincloud.server.models.PlacementGroupDetailResponse;
import com.fincloud.server.models.PlacementGroupListResponse;
import com.fincloud.server.models.PlacementGroupResponse;
import com.fincloud.server.models.PlacementGroupServerInstanceResponse;
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
 * in PlacementGroups.
 */
public class PlacementGroupsImpl implements PlacementGroups {
    /** The Retrofit service to perform REST calls. */
    private PlacementGroupsService service;
    /** The service client containing this operation class. */
    private ServerManagementClientImpl client;

    /**
     * Initializes an instance of PlacementGroups.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PlacementGroupsImpl(Retrofit retrofit, ServerManagementClientImpl client) {
        this.service = retrofit.create(PlacementGroupsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PlacementGroups to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PlacementGroupsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.PlacementGroups getList" })
        @GET("vserver/v2/getPlacementGroupList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("placementGroupName") String placementGroupName, @Query("placementGroupNoList.N") String placementGroupNoListN);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.PlacementGroups getDetail" })
        @GET("vserver/v2/getPlacementGroupDetail")
        Observable<Response<ResponseBody>> getDetail(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("placementGroupNo") String placementGroupNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.PlacementGroups create" })
        @POST("vserver/v2/createPlacementGroup")
        Observable<Response<ResponseBody>> create(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("placementGroupName") String placementGroupName, @Query("placementGroupTypeCode") String placementGroupTypeCode);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.PlacementGroups delete" })
        @POST("vserver/v2/deletePlacementGroup")
        Observable<Response<ResponseBody>> delete(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("placementGroupNo") String placementGroupNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.PlacementGroups add" })
        @POST("vserver/v2/addPlacementGroupServerInstance")
        Observable<Response<ResponseBody>> add(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("placementGroupNo") String placementGroupNo, @Query("serverInstanceNo") String serverInstanceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.PlacementGroups remove" })
        @POST("vserver/v2/removePlacementGroupServerInstance")
        Observable<Response<ResponseBody>> remove(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("placementGroupNo") String placementGroupNo, @Query("serverInstanceNo") String serverInstanceNo);

    }

    /**
     * 치 그룹 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupListResponse object if successful.
     */
    public PlacementGroupListResponse getList(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 치 그룹 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PlacementGroupListResponse> getListAsync(String responseFormatType, final ServiceCallback<PlacementGroupListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 치 그룹 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupListResponse object
     */
    public Observable<PlacementGroupListResponse> getListAsync(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<PlacementGroupListResponse>, PlacementGroupListResponse>() {
            @Override
            public PlacementGroupListResponse call(ServiceResponse<PlacementGroupListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 치 그룹 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupListResponse object
     */
    public Observable<ServiceResponse<PlacementGroupListResponse>> getListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String placementGroupName = null;
        final String placementGroupNoListN = null;
        return service.getList(responseFormatType, regionCode, placementGroupName, placementGroupNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PlacementGroupListResponse>>>() {
                @Override
                public Observable<ServiceResponse<PlacementGroupListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PlacementGroupListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 치 그룹 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupName 물리 배치 그룹 이름
     * @param placementGroupNoListN 물리 배치 그룹 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupListResponse object if successful.
     */
    public PlacementGroupListResponse getList(String responseFormatType, String regionCode, String placementGroupName, String placementGroupNoListN) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, placementGroupName, placementGroupNoListN).toBlocking().single().body();
    }

    /**
     * 치 그룹 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupName 물리 배치 그룹 이름
     * @param placementGroupNoListN 물리 배치 그룹 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PlacementGroupListResponse> getListAsync(String responseFormatType, String regionCode, String placementGroupName, String placementGroupNoListN, final ServiceCallback<PlacementGroupListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, regionCode, placementGroupName, placementGroupNoListN), serviceCallback);
    }

    /**
     * 치 그룹 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupName 물리 배치 그룹 이름
     * @param placementGroupNoListN 물리 배치 그룹 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupListResponse object
     */
    public Observable<PlacementGroupListResponse> getListAsync(String responseFormatType, String regionCode, String placementGroupName, String placementGroupNoListN) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, placementGroupName, placementGroupNoListN).map(new Func1<ServiceResponse<PlacementGroupListResponse>, PlacementGroupListResponse>() {
            @Override
            public PlacementGroupListResponse call(ServiceResponse<PlacementGroupListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 치 그룹 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupName 물리 배치 그룹 이름
     * @param placementGroupNoListN 물리 배치 그룹 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupListResponse object
     */
    public Observable<ServiceResponse<PlacementGroupListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String placementGroupName, String placementGroupNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, placementGroupName, placementGroupNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PlacementGroupListResponse>>>() {
                @Override
                public Observable<ServiceResponse<PlacementGroupListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PlacementGroupListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PlacementGroupListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PlacementGroupListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PlacementGroupListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 물리 배치 그룹 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupDetailResponse object if successful.
     */
    public PlacementGroupDetailResponse getDetail(String responseFormatType) {
        return getDetailWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 물리 배치 그룹 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PlacementGroupDetailResponse> getDetailAsync(String responseFormatType, final ServiceCallback<PlacementGroupDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 물리 배치 그룹 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupDetailResponse object
     */
    public Observable<PlacementGroupDetailResponse> getDetailAsync(String responseFormatType) {
        return getDetailWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<PlacementGroupDetailResponse>, PlacementGroupDetailResponse>() {
            @Override
            public PlacementGroupDetailResponse call(ServiceResponse<PlacementGroupDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 물리 배치 그룹 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupDetailResponse object
     */
    public Observable<ServiceResponse<PlacementGroupDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String placementGroupNo = null;
        return service.getDetail(responseFormatType, regionCode, placementGroupNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PlacementGroupDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<PlacementGroupDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PlacementGroupDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 물리 배치 그룹 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupNo 물리 배치 그룹 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupDetailResponse object if successful.
     */
    public PlacementGroupDetailResponse getDetail(String responseFormatType, String regionCode, String placementGroupNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, regionCode, placementGroupNo).toBlocking().single().body();
    }

    /**
     * 물리 배치 그룹 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PlacementGroupDetailResponse> getDetailAsync(String responseFormatType, String regionCode, String placementGroupNo, final ServiceCallback<PlacementGroupDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, regionCode, placementGroupNo), serviceCallback);
    }

    /**
     * 물리 배치 그룹 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupNo 물리 배치 그룹 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupDetailResponse object
     */
    public Observable<PlacementGroupDetailResponse> getDetailAsync(String responseFormatType, String regionCode, String placementGroupNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, regionCode, placementGroupNo).map(new Func1<ServiceResponse<PlacementGroupDetailResponse>, PlacementGroupDetailResponse>() {
            @Override
            public PlacementGroupDetailResponse call(ServiceResponse<PlacementGroupDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 물리 배치 그룹 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupNo 물리 배치 그룹 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupDetailResponse object
     */
    public Observable<ServiceResponse<PlacementGroupDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String regionCode, String placementGroupNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getDetail(responseFormatType, regionCode, placementGroupNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PlacementGroupDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<PlacementGroupDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PlacementGroupDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PlacementGroupDetailResponse> getDetailDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PlacementGroupDetailResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PlacementGroupDetailResponse>() { }.getType())
                .build(response);
    }

    /**
     * 물리 배치 그룹을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupResponse object if successful.
     */
    public PlacementGroupResponse create(String responseFormatType) {
        return createWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 물리 배치 그룹을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PlacementGroupResponse> createAsync(String responseFormatType, final ServiceCallback<PlacementGroupResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 물리 배치 그룹을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupResponse object
     */
    public Observable<PlacementGroupResponse> createAsync(String responseFormatType) {
        return createWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<PlacementGroupResponse>, PlacementGroupResponse>() {
            @Override
            public PlacementGroupResponse call(ServiceResponse<PlacementGroupResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 물리 배치 그룹을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupResponse object
     */
    public Observable<ServiceResponse<PlacementGroupResponse>> createWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String placementGroupName = null;
        final String placementGroupTypeCode = null;
        return service.create(responseFormatType, regionCode, placementGroupName, placementGroupTypeCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PlacementGroupResponse>>>() {
                @Override
                public Observable<ServiceResponse<PlacementGroupResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PlacementGroupResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 물리 배치 그룹을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupName 물리 배치 그룹 이름
     * @param placementGroupTypeCode 물리 배치 그룹 유형 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupResponse object if successful.
     */
    public PlacementGroupResponse create(String responseFormatType, String regionCode, String placementGroupName, String placementGroupTypeCode) {
        return createWithServiceResponseAsync(responseFormatType, regionCode, placementGroupName, placementGroupTypeCode).toBlocking().single().body();
    }

    /**
     * 물리 배치 그룹을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupName 물리 배치 그룹 이름
     * @param placementGroupTypeCode 물리 배치 그룹 유형 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PlacementGroupResponse> createAsync(String responseFormatType, String regionCode, String placementGroupName, String placementGroupTypeCode, final ServiceCallback<PlacementGroupResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, regionCode, placementGroupName, placementGroupTypeCode), serviceCallback);
    }

    /**
     * 물리 배치 그룹을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupName 물리 배치 그룹 이름
     * @param placementGroupTypeCode 물리 배치 그룹 유형 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupResponse object
     */
    public Observable<PlacementGroupResponse> createAsync(String responseFormatType, String regionCode, String placementGroupName, String placementGroupTypeCode) {
        return createWithServiceResponseAsync(responseFormatType, regionCode, placementGroupName, placementGroupTypeCode).map(new Func1<ServiceResponse<PlacementGroupResponse>, PlacementGroupResponse>() {
            @Override
            public PlacementGroupResponse call(ServiceResponse<PlacementGroupResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 물리 배치 그룹을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupName 물리 배치 그룹 이름
     * @param placementGroupTypeCode 물리 배치 그룹 유형 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupResponse object
     */
    public Observable<ServiceResponse<PlacementGroupResponse>> createWithServiceResponseAsync(String responseFormatType, String regionCode, String placementGroupName, String placementGroupTypeCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.create(responseFormatType, regionCode, placementGroupName, placementGroupTypeCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PlacementGroupResponse>>>() {
                @Override
                public Observable<ServiceResponse<PlacementGroupResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PlacementGroupResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PlacementGroupResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PlacementGroupResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PlacementGroupResponse>() { }.getType())
                .build(response);
    }

    /**
     * 물리 배치 그룹을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupResponse object if successful.
     */
    public PlacementGroupResponse delete(String responseFormatType, String placementGroupNo) {
        return deleteWithServiceResponseAsync(responseFormatType, placementGroupNo).toBlocking().single().body();
    }

    /**
     * 물리 배치 그룹을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PlacementGroupResponse> deleteAsync(String responseFormatType, String placementGroupNo, final ServiceCallback<PlacementGroupResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, placementGroupNo), serviceCallback);
    }

    /**
     * 물리 배치 그룹을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupResponse object
     */
    public Observable<PlacementGroupResponse> deleteAsync(String responseFormatType, String placementGroupNo) {
        return deleteWithServiceResponseAsync(responseFormatType, placementGroupNo).map(new Func1<ServiceResponse<PlacementGroupResponse>, PlacementGroupResponse>() {
            @Override
            public PlacementGroupResponse call(ServiceResponse<PlacementGroupResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 물리 배치 그룹을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupResponse object
     */
    public Observable<ServiceResponse<PlacementGroupResponse>> deleteWithServiceResponseAsync(String responseFormatType, String placementGroupNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (placementGroupNo == null) {
            throw new IllegalArgumentException("Parameter placementGroupNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.delete(responseFormatType, regionCode, placementGroupNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PlacementGroupResponse>>>() {
                @Override
                public Observable<ServiceResponse<PlacementGroupResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PlacementGroupResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 물리 배치 그룹을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupResponse object if successful.
     */
    public PlacementGroupResponse delete(String responseFormatType, String placementGroupNo, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, placementGroupNo, regionCode).toBlocking().single().body();
    }

    /**
     * 물리 배치 그룹을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PlacementGroupResponse> deleteAsync(String responseFormatType, String placementGroupNo, String regionCode, final ServiceCallback<PlacementGroupResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, placementGroupNo, regionCode), serviceCallback);
    }

    /**
     * 물리 배치 그룹을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupResponse object
     */
    public Observable<PlacementGroupResponse> deleteAsync(String responseFormatType, String placementGroupNo, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, placementGroupNo, regionCode).map(new Func1<ServiceResponse<PlacementGroupResponse>, PlacementGroupResponse>() {
            @Override
            public PlacementGroupResponse call(ServiceResponse<PlacementGroupResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 물리 배치 그룹을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupResponse object
     */
    public Observable<ServiceResponse<PlacementGroupResponse>> deleteWithServiceResponseAsync(String responseFormatType, String placementGroupNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (placementGroupNo == null) {
            throw new IllegalArgumentException("Parameter placementGroupNo is required and cannot be null.");
        }
        return service.delete(responseFormatType, regionCode, placementGroupNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PlacementGroupResponse>>>() {
                @Override
                public Observable<ServiceResponse<PlacementGroupResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PlacementGroupResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PlacementGroupResponse> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PlacementGroupResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PlacementGroupResponse>() { }.getType())
                .build(response);
    }

    /**
     * 물리 배치 그룹에 서버 인스턴스를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupServerInstanceResponse object if successful.
     */
    public PlacementGroupServerInstanceResponse add(String responseFormatType, String placementGroupNo, String serverInstanceNo) {
        return addWithServiceResponseAsync(responseFormatType, placementGroupNo, serverInstanceNo).toBlocking().single().body();
    }

    /**
     * 물리 배치 그룹에 서버 인스턴스를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PlacementGroupServerInstanceResponse> addAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo, final ServiceCallback<PlacementGroupServerInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addWithServiceResponseAsync(responseFormatType, placementGroupNo, serverInstanceNo), serviceCallback);
    }

    /**
     * 물리 배치 그룹에 서버 인스턴스를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupServerInstanceResponse object
     */
    public Observable<PlacementGroupServerInstanceResponse> addAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo) {
        return addWithServiceResponseAsync(responseFormatType, placementGroupNo, serverInstanceNo).map(new Func1<ServiceResponse<PlacementGroupServerInstanceResponse>, PlacementGroupServerInstanceResponse>() {
            @Override
            public PlacementGroupServerInstanceResponse call(ServiceResponse<PlacementGroupServerInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 물리 배치 그룹에 서버 인스턴스를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupServerInstanceResponse object
     */
    public Observable<ServiceResponse<PlacementGroupServerInstanceResponse>> addWithServiceResponseAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (placementGroupNo == null) {
            throw new IllegalArgumentException("Parameter placementGroupNo is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.add(responseFormatType, regionCode, placementGroupNo, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PlacementGroupServerInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<PlacementGroupServerInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PlacementGroupServerInstanceResponse> clientResponse = addDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 물리 배치 그룹에 서버 인스턴스를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupServerInstanceResponse object if successful.
     */
    public PlacementGroupServerInstanceResponse add(String responseFormatType, String placementGroupNo, String serverInstanceNo, String regionCode) {
        return addWithServiceResponseAsync(responseFormatType, placementGroupNo, serverInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * 물리 배치 그룹에 서버 인스턴스를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PlacementGroupServerInstanceResponse> addAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo, String regionCode, final ServiceCallback<PlacementGroupServerInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addWithServiceResponseAsync(responseFormatType, placementGroupNo, serverInstanceNo, regionCode), serviceCallback);
    }

    /**
     * 물리 배치 그룹에 서버 인스턴스를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupServerInstanceResponse object
     */
    public Observable<PlacementGroupServerInstanceResponse> addAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo, String regionCode) {
        return addWithServiceResponseAsync(responseFormatType, placementGroupNo, serverInstanceNo, regionCode).map(new Func1<ServiceResponse<PlacementGroupServerInstanceResponse>, PlacementGroupServerInstanceResponse>() {
            @Override
            public PlacementGroupServerInstanceResponse call(ServiceResponse<PlacementGroupServerInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 물리 배치 그룹에 서버 인스턴스를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupServerInstanceResponse object
     */
    public Observable<ServiceResponse<PlacementGroupServerInstanceResponse>> addWithServiceResponseAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (placementGroupNo == null) {
            throw new IllegalArgumentException("Parameter placementGroupNo is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        return service.add(responseFormatType, regionCode, placementGroupNo, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PlacementGroupServerInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<PlacementGroupServerInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PlacementGroupServerInstanceResponse> clientResponse = addDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PlacementGroupServerInstanceResponse> addDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PlacementGroupServerInstanceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PlacementGroupServerInstanceResponse>() { }.getType())
                .build(response);
    }

    /**
     * 물리 배치 그룹에서 서버 인스턴스를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupServerInstanceResponse object if successful.
     */
    public PlacementGroupServerInstanceResponse remove(String responseFormatType, String placementGroupNo, String serverInstanceNo) {
        return removeWithServiceResponseAsync(responseFormatType, placementGroupNo, serverInstanceNo).toBlocking().single().body();
    }

    /**
     * 물리 배치 그룹에서 서버 인스턴스를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PlacementGroupServerInstanceResponse> removeAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo, final ServiceCallback<PlacementGroupServerInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(removeWithServiceResponseAsync(responseFormatType, placementGroupNo, serverInstanceNo), serviceCallback);
    }

    /**
     * 물리 배치 그룹에서 서버 인스턴스를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupServerInstanceResponse object
     */
    public Observable<PlacementGroupServerInstanceResponse> removeAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo) {
        return removeWithServiceResponseAsync(responseFormatType, placementGroupNo, serverInstanceNo).map(new Func1<ServiceResponse<PlacementGroupServerInstanceResponse>, PlacementGroupServerInstanceResponse>() {
            @Override
            public PlacementGroupServerInstanceResponse call(ServiceResponse<PlacementGroupServerInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 물리 배치 그룹에서 서버 인스턴스를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupServerInstanceResponse object
     */
    public Observable<ServiceResponse<PlacementGroupServerInstanceResponse>> removeWithServiceResponseAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (placementGroupNo == null) {
            throw new IllegalArgumentException("Parameter placementGroupNo is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.remove(responseFormatType, regionCode, placementGroupNo, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PlacementGroupServerInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<PlacementGroupServerInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PlacementGroupServerInstanceResponse> clientResponse = removeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 물리 배치 그룹에서 서버 인스턴스를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupServerInstanceResponse object if successful.
     */
    public PlacementGroupServerInstanceResponse remove(String responseFormatType, String placementGroupNo, String serverInstanceNo, String regionCode) {
        return removeWithServiceResponseAsync(responseFormatType, placementGroupNo, serverInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * 물리 배치 그룹에서 서버 인스턴스를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PlacementGroupServerInstanceResponse> removeAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo, String regionCode, final ServiceCallback<PlacementGroupServerInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(removeWithServiceResponseAsync(responseFormatType, placementGroupNo, serverInstanceNo, regionCode), serviceCallback);
    }

    /**
     * 물리 배치 그룹에서 서버 인스턴스를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupServerInstanceResponse object
     */
    public Observable<PlacementGroupServerInstanceResponse> removeAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo, String regionCode) {
        return removeWithServiceResponseAsync(responseFormatType, placementGroupNo, serverInstanceNo, regionCode).map(new Func1<ServiceResponse<PlacementGroupServerInstanceResponse>, PlacementGroupServerInstanceResponse>() {
            @Override
            public PlacementGroupServerInstanceResponse call(ServiceResponse<PlacementGroupServerInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 물리 배치 그룹에서 서버 인스턴스를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupServerInstanceResponse object
     */
    public Observable<ServiceResponse<PlacementGroupServerInstanceResponse>> removeWithServiceResponseAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (placementGroupNo == null) {
            throw new IllegalArgumentException("Parameter placementGroupNo is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        return service.remove(responseFormatType, regionCode, placementGroupNo, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PlacementGroupServerInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<PlacementGroupServerInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PlacementGroupServerInstanceResponse> clientResponse = removeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PlacementGroupServerInstanceResponse> removeDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PlacementGroupServerInstanceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PlacementGroupServerInstanceResponse>() { }.getType())
                .build(response);
    }

}
