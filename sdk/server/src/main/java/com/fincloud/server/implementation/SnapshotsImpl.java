/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.implementation;

import retrofit2.Retrofit;
import com.fincloud.server.Snapshots;
import com.fincloud.server.models.BlockStorageSnapshotInstanceDetailResponse;
import com.fincloud.server.models.BlockStorageSnapshotInstanceListResponse;
import com.fincloud.server.models.BlockStorageSnapshotInstanceResponse;
import com.fincloud.server.models.BlockStorageSnapshotInstanceStatusCode;
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
 * in Snapshots.
 */
public class SnapshotsImpl implements Snapshots {
    /** The Retrofit service to perform REST calls. */
    private SnapshotsService service;
    /** The service client containing this operation class. */
    private ServerManagementClientImpl client;

    /**
     * Initializes an instance of Snapshots.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SnapshotsImpl(Retrofit retrofit, ServerManagementClientImpl client) {
        this.service = retrofit.create(SnapshotsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Snapshots to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SnapshotsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.Snapshots getList" })
        @GET("vserver/v2/getBlockStorageSnapshotInstanceList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("blockStorageSnapshotInstanceNoList.N") String blockStorageSnapshotInstanceNoListN, @Query("originalBlockStorageInstanceNoList.N") String originalBlockStorageInstanceNoListN, @Query("blockStorageSnapshotInstanceStatusCode") BlockStorageSnapshotInstanceStatusCode blockStorageSnapshotInstanceStatusCode1, @Query("pageNo") String pageNo, @Query("pageSize") String pageSize, @Query("blockStorageSnapshotVolumeSize") String blockStorageSnapshotVolumeSize, @Query("isEncryptedOriginalBlockStorageVolume") Boolean isEncryptedOriginalBlockStorageVolume, @Query("blockStorageSnapshotName") String blockStorageSnapshotName, @Query("sortedBy") String sortedBy, @Query("sortingOrder") SortingOrder sortingOrder1);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.Snapshots getDetail" })
        @GET("vserver/v2/getBlockStorageSnapshotInstanceDetail")
        Observable<Response<ResponseBody>> getDetail(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("blockStorageSnapshotInstanceNo") String blockStorageSnapshotInstanceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.Snapshots create" })
        @POST("vserver/v2/createBlockStorageSnapshotInstance")
        Observable<Response<ResponseBody>> create(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("originalBlockStorageInstanceNo") String originalBlockStorageInstanceNo, @Query("blockStorageSnapshotName") String blockStorageSnapshotName, @Query("blockStorageSnapshotDescription") String blockStorageSnapshotDescription);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.Snapshots delete" })
        @POST("vserver/v2/deleteBlockStorageSnapshotInstances")
        Observable<Response<ResponseBody>> delete(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("blockStorageSnapshotInstanceNoList.N") String blockStorageSnapshotInstanceNoListN);

    }

    /**
     * 블록스토리지 스냅샷 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageSnapshotInstanceListResponse object if successful.
     */
    public BlockStorageSnapshotInstanceListResponse getList(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageSnapshotInstanceListResponse> getListAsync(String responseFormatType, final ServiceCallback<BlockStorageSnapshotInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceListResponse object
     */
    public Observable<BlockStorageSnapshotInstanceListResponse> getListAsync(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<BlockStorageSnapshotInstanceListResponse>, BlockStorageSnapshotInstanceListResponse>() {
            @Override
            public BlockStorageSnapshotInstanceListResponse call(ServiceResponse<BlockStorageSnapshotInstanceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceListResponse object
     */
    public Observable<ServiceResponse<BlockStorageSnapshotInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String blockStorageSnapshotInstanceNoListN = null;
        final String originalBlockStorageInstanceNoListN = null;
        final BlockStorageSnapshotInstanceStatusCode blockStorageSnapshotInstanceStatusCode = null;
        final String pageNo = null;
        final String pageSize = null;
        final String blockStorageSnapshotVolumeSize = null;
        final Boolean isEncryptedOriginalBlockStorageVolume = null;
        final String blockStorageSnapshotName = null;
        final String sortedBy = null;
        final SortingOrder sortingOrder = null;
        return service.getList(responseFormatType, regionCode, blockStorageSnapshotInstanceNoListN, originalBlockStorageInstanceNoListN, blockStorageSnapshotInstanceStatusCode, pageNo, pageSize, blockStorageSnapshotVolumeSize, isEncryptedOriginalBlockStorageVolume, blockStorageSnapshotName, sortedBy, sortingOrder)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageSnapshotInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageSnapshotInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageSnapshotInstanceListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param blockStorageSnapshotInstanceNoListN 블록스토리지 스냅샷 인스턴스 번호 리스트
     * @param originalBlockStorageInstanceNoListN 원본 블록스토리지 인스턴스 번호 리스트
     * @param blockStorageSnapshotInstanceStatusCode 블록스토리지 스냅샷 인스턴스 상태 코드. Possible values include: 'INIT', 'CREAT', 'ATTAC'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param blockStorageSnapshotVolumeSize 블록스토리지 스냅샷 블록 사이즈
     * @param isEncryptedOriginalBlockStorageVolume 원본 블록스토리지 볼륨 암호화 여부
     * @param blockStorageSnapshotName 블록스토리지 스냅샷 이름
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageSnapshotInstanceListResponse object if successful.
     */
    public BlockStorageSnapshotInstanceListResponse getList(String responseFormatType, String regionCode, String blockStorageSnapshotInstanceNoListN, String originalBlockStorageInstanceNoListN, BlockStorageSnapshotInstanceStatusCode blockStorageSnapshotInstanceStatusCode, String pageNo, String pageSize, String blockStorageSnapshotVolumeSize, Boolean isEncryptedOriginalBlockStorageVolume, String blockStorageSnapshotName, String sortedBy, SortingOrder sortingOrder) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, blockStorageSnapshotInstanceNoListN, originalBlockStorageInstanceNoListN, blockStorageSnapshotInstanceStatusCode, pageNo, pageSize, blockStorageSnapshotVolumeSize, isEncryptedOriginalBlockStorageVolume, blockStorageSnapshotName, sortedBy, sortingOrder).toBlocking().single().body();
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param blockStorageSnapshotInstanceNoListN 블록스토리지 스냅샷 인스턴스 번호 리스트
     * @param originalBlockStorageInstanceNoListN 원본 블록스토리지 인스턴스 번호 리스트
     * @param blockStorageSnapshotInstanceStatusCode 블록스토리지 스냅샷 인스턴스 상태 코드. Possible values include: 'INIT', 'CREAT', 'ATTAC'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param blockStorageSnapshotVolumeSize 블록스토리지 스냅샷 블록 사이즈
     * @param isEncryptedOriginalBlockStorageVolume 원본 블록스토리지 볼륨 암호화 여부
     * @param blockStorageSnapshotName 블록스토리지 스냅샷 이름
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageSnapshotInstanceListResponse> getListAsync(String responseFormatType, String regionCode, String blockStorageSnapshotInstanceNoListN, String originalBlockStorageInstanceNoListN, BlockStorageSnapshotInstanceStatusCode blockStorageSnapshotInstanceStatusCode, String pageNo, String pageSize, String blockStorageSnapshotVolumeSize, Boolean isEncryptedOriginalBlockStorageVolume, String blockStorageSnapshotName, String sortedBy, SortingOrder sortingOrder, final ServiceCallback<BlockStorageSnapshotInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, regionCode, blockStorageSnapshotInstanceNoListN, originalBlockStorageInstanceNoListN, blockStorageSnapshotInstanceStatusCode, pageNo, pageSize, blockStorageSnapshotVolumeSize, isEncryptedOriginalBlockStorageVolume, blockStorageSnapshotName, sortedBy, sortingOrder), serviceCallback);
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param blockStorageSnapshotInstanceNoListN 블록스토리지 스냅샷 인스턴스 번호 리스트
     * @param originalBlockStorageInstanceNoListN 원본 블록스토리지 인스턴스 번호 리스트
     * @param blockStorageSnapshotInstanceStatusCode 블록스토리지 스냅샷 인스턴스 상태 코드. Possible values include: 'INIT', 'CREAT', 'ATTAC'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param blockStorageSnapshotVolumeSize 블록스토리지 스냅샷 블록 사이즈
     * @param isEncryptedOriginalBlockStorageVolume 원본 블록스토리지 볼륨 암호화 여부
     * @param blockStorageSnapshotName 블록스토리지 스냅샷 이름
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceListResponse object
     */
    public Observable<BlockStorageSnapshotInstanceListResponse> getListAsync(String responseFormatType, String regionCode, String blockStorageSnapshotInstanceNoListN, String originalBlockStorageInstanceNoListN, BlockStorageSnapshotInstanceStatusCode blockStorageSnapshotInstanceStatusCode, String pageNo, String pageSize, String blockStorageSnapshotVolumeSize, Boolean isEncryptedOriginalBlockStorageVolume, String blockStorageSnapshotName, String sortedBy, SortingOrder sortingOrder) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, blockStorageSnapshotInstanceNoListN, originalBlockStorageInstanceNoListN, blockStorageSnapshotInstanceStatusCode, pageNo, pageSize, blockStorageSnapshotVolumeSize, isEncryptedOriginalBlockStorageVolume, blockStorageSnapshotName, sortedBy, sortingOrder).map(new Func1<ServiceResponse<BlockStorageSnapshotInstanceListResponse>, BlockStorageSnapshotInstanceListResponse>() {
            @Override
            public BlockStorageSnapshotInstanceListResponse call(ServiceResponse<BlockStorageSnapshotInstanceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param blockStorageSnapshotInstanceNoListN 블록스토리지 스냅샷 인스턴스 번호 리스트
     * @param originalBlockStorageInstanceNoListN 원본 블록스토리지 인스턴스 번호 리스트
     * @param blockStorageSnapshotInstanceStatusCode 블록스토리지 스냅샷 인스턴스 상태 코드. Possible values include: 'INIT', 'CREAT', 'ATTAC'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param blockStorageSnapshotVolumeSize 블록스토리지 스냅샷 블록 사이즈
     * @param isEncryptedOriginalBlockStorageVolume 원본 블록스토리지 볼륨 암호화 여부
     * @param blockStorageSnapshotName 블록스토리지 스냅샷 이름
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceListResponse object
     */
    public Observable<ServiceResponse<BlockStorageSnapshotInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String blockStorageSnapshotInstanceNoListN, String originalBlockStorageInstanceNoListN, BlockStorageSnapshotInstanceStatusCode blockStorageSnapshotInstanceStatusCode, String pageNo, String pageSize, String blockStorageSnapshotVolumeSize, Boolean isEncryptedOriginalBlockStorageVolume, String blockStorageSnapshotName, String sortedBy, SortingOrder sortingOrder) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, blockStorageSnapshotInstanceNoListN, originalBlockStorageInstanceNoListN, blockStorageSnapshotInstanceStatusCode, pageNo, pageSize, blockStorageSnapshotVolumeSize, isEncryptedOriginalBlockStorageVolume, blockStorageSnapshotName, sortedBy, sortingOrder)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageSnapshotInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageSnapshotInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageSnapshotInstanceListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BlockStorageSnapshotInstanceListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BlockStorageSnapshotInstanceListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BlockStorageSnapshotInstanceListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNo 블록스토리지 스냅샷 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageSnapshotInstanceDetailResponse object if successful.
     */
    public BlockStorageSnapshotInstanceDetailResponse getDetail(String responseFormatType, String blockStorageSnapshotInstanceNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, blockStorageSnapshotInstanceNo).toBlocking().single().body();
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNo 블록스토리지 스냅샷 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageSnapshotInstanceDetailResponse> getDetailAsync(String responseFormatType, String blockStorageSnapshotInstanceNo, final ServiceCallback<BlockStorageSnapshotInstanceDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, blockStorageSnapshotInstanceNo), serviceCallback);
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNo 블록스토리지 스냅샷 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceDetailResponse object
     */
    public Observable<BlockStorageSnapshotInstanceDetailResponse> getDetailAsync(String responseFormatType, String blockStorageSnapshotInstanceNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, blockStorageSnapshotInstanceNo).map(new Func1<ServiceResponse<BlockStorageSnapshotInstanceDetailResponse>, BlockStorageSnapshotInstanceDetailResponse>() {
            @Override
            public BlockStorageSnapshotInstanceDetailResponse call(ServiceResponse<BlockStorageSnapshotInstanceDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNo 블록스토리지 스냅샷 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceDetailResponse object
     */
    public Observable<ServiceResponse<BlockStorageSnapshotInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String blockStorageSnapshotInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (blockStorageSnapshotInstanceNo == null) {
            throw new IllegalArgumentException("Parameter blockStorageSnapshotInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.getDetail(responseFormatType, regionCode, blockStorageSnapshotInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageSnapshotInstanceDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageSnapshotInstanceDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageSnapshotInstanceDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNo 블록스토리지 스냅샷 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageSnapshotInstanceDetailResponse object if successful.
     */
    public BlockStorageSnapshotInstanceDetailResponse getDetail(String responseFormatType, String blockStorageSnapshotInstanceNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, blockStorageSnapshotInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNo 블록스토리지 스냅샷 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageSnapshotInstanceDetailResponse> getDetailAsync(String responseFormatType, String blockStorageSnapshotInstanceNo, String regionCode, final ServiceCallback<BlockStorageSnapshotInstanceDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, blockStorageSnapshotInstanceNo, regionCode), serviceCallback);
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNo 블록스토리지 스냅샷 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceDetailResponse object
     */
    public Observable<BlockStorageSnapshotInstanceDetailResponse> getDetailAsync(String responseFormatType, String blockStorageSnapshotInstanceNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, blockStorageSnapshotInstanceNo, regionCode).map(new Func1<ServiceResponse<BlockStorageSnapshotInstanceDetailResponse>, BlockStorageSnapshotInstanceDetailResponse>() {
            @Override
            public BlockStorageSnapshotInstanceDetailResponse call(ServiceResponse<BlockStorageSnapshotInstanceDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNo 블록스토리지 스냅샷 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceDetailResponse object
     */
    public Observable<ServiceResponse<BlockStorageSnapshotInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String blockStorageSnapshotInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (blockStorageSnapshotInstanceNo == null) {
            throw new IllegalArgumentException("Parameter blockStorageSnapshotInstanceNo is required and cannot be null.");
        }
        return service.getDetail(responseFormatType, regionCode, blockStorageSnapshotInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageSnapshotInstanceDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageSnapshotInstanceDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageSnapshotInstanceDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BlockStorageSnapshotInstanceDetailResponse> getDetailDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BlockStorageSnapshotInstanceDetailResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BlockStorageSnapshotInstanceDetailResponse>() { }.getType())
                .build(response);
    }

    /**
     * 블록스토리지 스냅샷 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param originalBlockStorageInstanceNo 원본 블록스토리지 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageSnapshotInstanceResponse object if successful.
     */
    public BlockStorageSnapshotInstanceResponse create(String responseFormatType, String originalBlockStorageInstanceNo) {
        return createWithServiceResponseAsync(responseFormatType, originalBlockStorageInstanceNo).toBlocking().single().body();
    }

    /**
     * 블록스토리지 스냅샷 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param originalBlockStorageInstanceNo 원본 블록스토리지 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageSnapshotInstanceResponse> createAsync(String responseFormatType, String originalBlockStorageInstanceNo, final ServiceCallback<BlockStorageSnapshotInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, originalBlockStorageInstanceNo), serviceCallback);
    }

    /**
     * 블록스토리지 스냅샷 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param originalBlockStorageInstanceNo 원본 블록스토리지 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceResponse object
     */
    public Observable<BlockStorageSnapshotInstanceResponse> createAsync(String responseFormatType, String originalBlockStorageInstanceNo) {
        return createWithServiceResponseAsync(responseFormatType, originalBlockStorageInstanceNo).map(new Func1<ServiceResponse<BlockStorageSnapshotInstanceResponse>, BlockStorageSnapshotInstanceResponse>() {
            @Override
            public BlockStorageSnapshotInstanceResponse call(ServiceResponse<BlockStorageSnapshotInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 스냅샷 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param originalBlockStorageInstanceNo 원본 블록스토리지 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceResponse object
     */
    public Observable<ServiceResponse<BlockStorageSnapshotInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String originalBlockStorageInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (originalBlockStorageInstanceNo == null) {
            throw new IllegalArgumentException("Parameter originalBlockStorageInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        final String blockStorageSnapshotName = null;
        final String blockStorageSnapshotDescription = null;
        return service.create(responseFormatType, regionCode, originalBlockStorageInstanceNo, blockStorageSnapshotName, blockStorageSnapshotDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageSnapshotInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageSnapshotInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageSnapshotInstanceResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 블록스토리지 스냅샷 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param originalBlockStorageInstanceNo 원본 블록스토리지 인스턴스 번호
     * @param regionCode REGION 코드
     * @param blockStorageSnapshotName 블록스토리지 스냅샷 이름
     * @param blockStorageSnapshotDescription 블록스토리지 스냅샷 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageSnapshotInstanceResponse object if successful.
     */
    public BlockStorageSnapshotInstanceResponse create(String responseFormatType, String originalBlockStorageInstanceNo, String regionCode, String blockStorageSnapshotName, String blockStorageSnapshotDescription) {
        return createWithServiceResponseAsync(responseFormatType, originalBlockStorageInstanceNo, regionCode, blockStorageSnapshotName, blockStorageSnapshotDescription).toBlocking().single().body();
    }

    /**
     * 블록스토리지 스냅샷 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param originalBlockStorageInstanceNo 원본 블록스토리지 인스턴스 번호
     * @param regionCode REGION 코드
     * @param blockStorageSnapshotName 블록스토리지 스냅샷 이름
     * @param blockStorageSnapshotDescription 블록스토리지 스냅샷 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageSnapshotInstanceResponse> createAsync(String responseFormatType, String originalBlockStorageInstanceNo, String regionCode, String blockStorageSnapshotName, String blockStorageSnapshotDescription, final ServiceCallback<BlockStorageSnapshotInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, originalBlockStorageInstanceNo, regionCode, blockStorageSnapshotName, blockStorageSnapshotDescription), serviceCallback);
    }

    /**
     * 블록스토리지 스냅샷 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param originalBlockStorageInstanceNo 원본 블록스토리지 인스턴스 번호
     * @param regionCode REGION 코드
     * @param blockStorageSnapshotName 블록스토리지 스냅샷 이름
     * @param blockStorageSnapshotDescription 블록스토리지 스냅샷 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceResponse object
     */
    public Observable<BlockStorageSnapshotInstanceResponse> createAsync(String responseFormatType, String originalBlockStorageInstanceNo, String regionCode, String blockStorageSnapshotName, String blockStorageSnapshotDescription) {
        return createWithServiceResponseAsync(responseFormatType, originalBlockStorageInstanceNo, regionCode, blockStorageSnapshotName, blockStorageSnapshotDescription).map(new Func1<ServiceResponse<BlockStorageSnapshotInstanceResponse>, BlockStorageSnapshotInstanceResponse>() {
            @Override
            public BlockStorageSnapshotInstanceResponse call(ServiceResponse<BlockStorageSnapshotInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 스냅샷 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param originalBlockStorageInstanceNo 원본 블록스토리지 인스턴스 번호
     * @param regionCode REGION 코드
     * @param blockStorageSnapshotName 블록스토리지 스냅샷 이름
     * @param blockStorageSnapshotDescription 블록스토리지 스냅샷 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceResponse object
     */
    public Observable<ServiceResponse<BlockStorageSnapshotInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String originalBlockStorageInstanceNo, String regionCode, String blockStorageSnapshotName, String blockStorageSnapshotDescription) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (originalBlockStorageInstanceNo == null) {
            throw new IllegalArgumentException("Parameter originalBlockStorageInstanceNo is required and cannot be null.");
        }
        return service.create(responseFormatType, regionCode, originalBlockStorageInstanceNo, blockStorageSnapshotName, blockStorageSnapshotDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageSnapshotInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageSnapshotInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageSnapshotInstanceResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BlockStorageSnapshotInstanceResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BlockStorageSnapshotInstanceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BlockStorageSnapshotInstanceResponse>() { }.getType())
                .build(response);
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 번호 리스트.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNoListN 블록스토리지 스냅샷 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageSnapshotInstanceResponse object if successful.
     */
    public BlockStorageSnapshotInstanceResponse delete(String responseFormatType, String blockStorageSnapshotInstanceNoListN) {
        return deleteWithServiceResponseAsync(responseFormatType, blockStorageSnapshotInstanceNoListN).toBlocking().single().body();
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 번호 리스트.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNoListN 블록스토리지 스냅샷 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageSnapshotInstanceResponse> deleteAsync(String responseFormatType, String blockStorageSnapshotInstanceNoListN, final ServiceCallback<BlockStorageSnapshotInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, blockStorageSnapshotInstanceNoListN), serviceCallback);
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 번호 리스트.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNoListN 블록스토리지 스냅샷 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceResponse object
     */
    public Observable<BlockStorageSnapshotInstanceResponse> deleteAsync(String responseFormatType, String blockStorageSnapshotInstanceNoListN) {
        return deleteWithServiceResponseAsync(responseFormatType, blockStorageSnapshotInstanceNoListN).map(new Func1<ServiceResponse<BlockStorageSnapshotInstanceResponse>, BlockStorageSnapshotInstanceResponse>() {
            @Override
            public BlockStorageSnapshotInstanceResponse call(ServiceResponse<BlockStorageSnapshotInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 번호 리스트.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNoListN 블록스토리지 스냅샷 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceResponse object
     */
    public Observable<ServiceResponse<BlockStorageSnapshotInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String blockStorageSnapshotInstanceNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (blockStorageSnapshotInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter blockStorageSnapshotInstanceNoListN is required and cannot be null.");
        }
        final String regionCode = null;
        return service.delete(responseFormatType, regionCode, blockStorageSnapshotInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageSnapshotInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageSnapshotInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageSnapshotInstanceResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 번호 리스트.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNoListN 블록스토리지 스냅샷 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageSnapshotInstanceResponse object if successful.
     */
    public BlockStorageSnapshotInstanceResponse delete(String responseFormatType, String blockStorageSnapshotInstanceNoListN, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, blockStorageSnapshotInstanceNoListN, regionCode).toBlocking().single().body();
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 번호 리스트.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNoListN 블록스토리지 스냅샷 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageSnapshotInstanceResponse> deleteAsync(String responseFormatType, String blockStorageSnapshotInstanceNoListN, String regionCode, final ServiceCallback<BlockStorageSnapshotInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, blockStorageSnapshotInstanceNoListN, regionCode), serviceCallback);
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 번호 리스트.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNoListN 블록스토리지 스냅샷 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceResponse object
     */
    public Observable<BlockStorageSnapshotInstanceResponse> deleteAsync(String responseFormatType, String blockStorageSnapshotInstanceNoListN, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, blockStorageSnapshotInstanceNoListN, regionCode).map(new Func1<ServiceResponse<BlockStorageSnapshotInstanceResponse>, BlockStorageSnapshotInstanceResponse>() {
            @Override
            public BlockStorageSnapshotInstanceResponse call(ServiceResponse<BlockStorageSnapshotInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 스냅샷 인스턴스 번호 리스트.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNoListN 블록스토리지 스냅샷 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceResponse object
     */
    public Observable<ServiceResponse<BlockStorageSnapshotInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String blockStorageSnapshotInstanceNoListN, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (blockStorageSnapshotInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter blockStorageSnapshotInstanceNoListN is required and cannot be null.");
        }
        return service.delete(responseFormatType, regionCode, blockStorageSnapshotInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageSnapshotInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageSnapshotInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageSnapshotInstanceResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BlockStorageSnapshotInstanceResponse> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BlockStorageSnapshotInstanceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BlockStorageSnapshotInstanceResponse>() { }.getType())
                .build(response);
    }

}
