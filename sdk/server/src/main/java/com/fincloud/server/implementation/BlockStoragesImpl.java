/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.implementation;

import retrofit2.Retrofit;
import com.fincloud.server.BlockStorages;
import com.fincloud.server.models.BlockStorageDiskDetailTypeCode;
import com.fincloud.server.models.BlockStorageDiskTypeCode;
import com.fincloud.server.models.BlockStorageInstanceDetailResponse;
import com.fincloud.server.models.BlockStorageInstanceListResponse;
import com.fincloud.server.models.BlockStorageInstanceResponse;
import com.fincloud.server.models.BlockStorageInstanceStatusCode;
import com.fincloud.server.models.BlockStorageTypeCode;
import com.fincloud.server.models.BlockStorageVolumeSizeResponse;
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
 * in BlockStorages.
 */
public class BlockStoragesImpl implements BlockStorages {
    /** The Retrofit service to perform REST calls. */
    private BlockStoragesService service;
    /** The service client containing this operation class. */
    private ServerManagementClientImpl client;

    /**
     * Initializes an instance of BlockStorages.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BlockStoragesImpl(Retrofit retrofit, ServerManagementClientImpl client) {
        this.service = retrofit.create(BlockStoragesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BlockStorages to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BlockStoragesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.BlockStorages getList" })
        @GET("vserver/v2/getBlockStorageInstanceList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("serverInstanceNo") String serverInstanceNo, @Query("blockStorageTypeCodeList.N") BlockStorageTypeCode blockStorageTypeCodeListN, @Query("blockStorageInstanceStatusCode") BlockStorageInstanceStatusCode blockStorageInstanceStatusCode1, @Query("pageNo") String pageNo, @Query("pageSize") String pageSize, @Query("blockStorageSize") String blockStorageSize, @Query("blockStorageInstanceNoList.N") String blockStorageInstanceNoListN, @Query("blockStorageName") String blockStorageName, @Query("serverName") String serverName, @Query("connectionInfo") String connectionInfo, @Query("blockStorageDiskTypeCode") BlockStorageDiskTypeCode blockStorageDiskTypeCode1, @Query("blockStorageDiskDetailTypeCode") BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode1, @Query("zoneCode") String zoneCode);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.BlockStorages getDetail" })
        @GET("vserver/v2/getBlockStorageInstanceDetail")
        Observable<Response<ResponseBody>> getDetail(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("blockStorageInstanceNo") String blockStorageInstanceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.BlockStorages create" })
        @POST("vserver/v2/createBlockStorageInstance")
        Observable<Response<ResponseBody>> create(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("zoneCode") String zoneCode, @Query("blockStorageName") String blockStorageName, @Query("blockStorageDiskDetailTypeCode") BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode1, @Query("serverInstanceNo") String serverInstanceNo, @Query("blockStorageSnapshotInstanceNo") String blockStorageSnapshotInstanceNo, @Query("blockStorageSize") String blockStorageSize, @Query("blockStorageDescription") String blockStorageDescription);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.BlockStorages delete" })
        @POST("vserver/v2/deleteBlockStorageInstances")
        Observable<Response<ResponseBody>> delete(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("blockStorageInstanceNoList.N") String blockStorageInstanceNoListN);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.BlockStorages attach" })
        @POST("vserver/v2/attachBlockStorageInstance")
        Observable<Response<ResponseBody>> attach(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("blockStorageInstanceNo") String blockStorageInstanceNo, @Query("serverInstanceNo") String serverInstanceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.BlockStorages detach" })
        @POST("vserver/v2/detachBlockStorageInstances")
        Observable<Response<ResponseBody>> detach(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("blockStorageInstanceNoList.N") String blockStorageInstanceNoListN);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.BlockStorages changeVolumeSize" })
        @POST("vserver/v2/changeBlockStorageVolumeSize")
        Observable<Response<ResponseBody>> changeVolumeSize(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("blockStorageInstanceNo") String blockStorageInstanceNo, @Query("blockStorageSize") String blockStorageSize);

    }

    /**
     * 블록스토리지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageInstanceListResponse object if successful.
     */
    public BlockStorageInstanceListResponse getList(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 블록스토리지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageInstanceListResponse> getListAsync(String responseFormatType, final ServiceCallback<BlockStorageInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 블록스토리지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceListResponse object
     */
    public Observable<BlockStorageInstanceListResponse> getListAsync(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<BlockStorageInstanceListResponse>, BlockStorageInstanceListResponse>() {
            @Override
            public BlockStorageInstanceListResponse call(ServiceResponse<BlockStorageInstanceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceListResponse object
     */
    public Observable<ServiceResponse<BlockStorageInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final String serverInstanceNo = null;
        final BlockStorageTypeCode blockStorageTypeCodeListN = null;
        final BlockStorageInstanceStatusCode blockStorageInstanceStatusCode = null;
        final String pageNo = null;
        final String pageSize = null;
        final String blockStorageSize = null;
        final String blockStorageInstanceNoListN = null;
        final String blockStorageName = null;
        final String serverName = null;
        final String connectionInfo = null;
        final BlockStorageDiskTypeCode blockStorageDiskTypeCode = null;
        final BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode = null;
        final String zoneCode = null;
        return service.getList(responseFormatType, regionCode, serverInstanceNo, blockStorageTypeCodeListN, blockStorageInstanceStatusCode, pageNo, pageSize, blockStorageSize, blockStorageInstanceNoListN, blockStorageName, serverName, connectionInfo, blockStorageDiskTypeCode, blockStorageDiskDetailTypeCode, zoneCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageInstanceListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 블록스토리지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param blockStorageTypeCodeListN 블록스토리지 유형 코드 리스트. Possible values include: 'BASIC', 'SVRBS', 'SNAP', 'NSI'
     * @param blockStorageInstanceStatusCode 블록스토리지 인스턴스 상태 코드. Possible values include: 'INIT', 'CREATE', 'ATTAC'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param blockStorageSize 블록스토리지 사이즈
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param blockStorageName 블록스토리지 이름
     * @param serverName 서버 이름
     * @param connectionInfo 연결 정보
     * @param blockStorageDiskTypeCode 블록스토리지 디스크 유형 코드. Possible values include: 'NET'
     * @param blockStorageDiskDetailTypeCode 블록스토리지 디스크 상세 유형 코드. Possible values include: 'HDD', 'SDD'
     * @param zoneCode ZONE 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageInstanceListResponse object if successful.
     */
    public BlockStorageInstanceListResponse getList(String responseFormatType, String regionCode, String serverInstanceNo, BlockStorageTypeCode blockStorageTypeCodeListN, BlockStorageInstanceStatusCode blockStorageInstanceStatusCode, String pageNo, String pageSize, String blockStorageSize, String blockStorageInstanceNoListN, String blockStorageName, String serverName, String connectionInfo, BlockStorageDiskTypeCode blockStorageDiskTypeCode, BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode, String zoneCode) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, serverInstanceNo, blockStorageTypeCodeListN, blockStorageInstanceStatusCode, pageNo, pageSize, blockStorageSize, blockStorageInstanceNoListN, blockStorageName, serverName, connectionInfo, blockStorageDiskTypeCode, blockStorageDiskDetailTypeCode, zoneCode).toBlocking().single().body();
    }

    /**
     * 블록스토리지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param blockStorageTypeCodeListN 블록스토리지 유형 코드 리스트. Possible values include: 'BASIC', 'SVRBS', 'SNAP', 'NSI'
     * @param blockStorageInstanceStatusCode 블록스토리지 인스턴스 상태 코드. Possible values include: 'INIT', 'CREATE', 'ATTAC'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param blockStorageSize 블록스토리지 사이즈
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param blockStorageName 블록스토리지 이름
     * @param serverName 서버 이름
     * @param connectionInfo 연결 정보
     * @param blockStorageDiskTypeCode 블록스토리지 디스크 유형 코드. Possible values include: 'NET'
     * @param blockStorageDiskDetailTypeCode 블록스토리지 디스크 상세 유형 코드. Possible values include: 'HDD', 'SDD'
     * @param zoneCode ZONE 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageInstanceListResponse> getListAsync(String responseFormatType, String regionCode, String serverInstanceNo, BlockStorageTypeCode blockStorageTypeCodeListN, BlockStorageInstanceStatusCode blockStorageInstanceStatusCode, String pageNo, String pageSize, String blockStorageSize, String blockStorageInstanceNoListN, String blockStorageName, String serverName, String connectionInfo, BlockStorageDiskTypeCode blockStorageDiskTypeCode, BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode, String zoneCode, final ServiceCallback<BlockStorageInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, regionCode, serverInstanceNo, blockStorageTypeCodeListN, blockStorageInstanceStatusCode, pageNo, pageSize, blockStorageSize, blockStorageInstanceNoListN, blockStorageName, serverName, connectionInfo, blockStorageDiskTypeCode, blockStorageDiskDetailTypeCode, zoneCode), serviceCallback);
    }

    /**
     * 블록스토리지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param blockStorageTypeCodeListN 블록스토리지 유형 코드 리스트. Possible values include: 'BASIC', 'SVRBS', 'SNAP', 'NSI'
     * @param blockStorageInstanceStatusCode 블록스토리지 인스턴스 상태 코드. Possible values include: 'INIT', 'CREATE', 'ATTAC'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param blockStorageSize 블록스토리지 사이즈
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param blockStorageName 블록스토리지 이름
     * @param serverName 서버 이름
     * @param connectionInfo 연결 정보
     * @param blockStorageDiskTypeCode 블록스토리지 디스크 유형 코드. Possible values include: 'NET'
     * @param blockStorageDiskDetailTypeCode 블록스토리지 디스크 상세 유형 코드. Possible values include: 'HDD', 'SDD'
     * @param zoneCode ZONE 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceListResponse object
     */
    public Observable<BlockStorageInstanceListResponse> getListAsync(String responseFormatType, String regionCode, String serverInstanceNo, BlockStorageTypeCode blockStorageTypeCodeListN, BlockStorageInstanceStatusCode blockStorageInstanceStatusCode, String pageNo, String pageSize, String blockStorageSize, String blockStorageInstanceNoListN, String blockStorageName, String serverName, String connectionInfo, BlockStorageDiskTypeCode blockStorageDiskTypeCode, BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode, String zoneCode) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, serverInstanceNo, blockStorageTypeCodeListN, blockStorageInstanceStatusCode, pageNo, pageSize, blockStorageSize, blockStorageInstanceNoListN, blockStorageName, serverName, connectionInfo, blockStorageDiskTypeCode, blockStorageDiskDetailTypeCode, zoneCode).map(new Func1<ServiceResponse<BlockStorageInstanceListResponse>, BlockStorageInstanceListResponse>() {
            @Override
            public BlockStorageInstanceListResponse call(ServiceResponse<BlockStorageInstanceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param blockStorageTypeCodeListN 블록스토리지 유형 코드 리스트. Possible values include: 'BASIC', 'SVRBS', 'SNAP', 'NSI'
     * @param blockStorageInstanceStatusCode 블록스토리지 인스턴스 상태 코드. Possible values include: 'INIT', 'CREATE', 'ATTAC'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param blockStorageSize 블록스토리지 사이즈
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param blockStorageName 블록스토리지 이름
     * @param serverName 서버 이름
     * @param connectionInfo 연결 정보
     * @param blockStorageDiskTypeCode 블록스토리지 디스크 유형 코드. Possible values include: 'NET'
     * @param blockStorageDiskDetailTypeCode 블록스토리지 디스크 상세 유형 코드. Possible values include: 'HDD', 'SDD'
     * @param zoneCode ZONE 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceListResponse object
     */
    public Observable<ServiceResponse<BlockStorageInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String serverInstanceNo, BlockStorageTypeCode blockStorageTypeCodeListN, BlockStorageInstanceStatusCode blockStorageInstanceStatusCode, String pageNo, String pageSize, String blockStorageSize, String blockStorageInstanceNoListN, String blockStorageName, String serverName, String connectionInfo, BlockStorageDiskTypeCode blockStorageDiskTypeCode, BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode, String zoneCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, serverInstanceNo, blockStorageTypeCodeListN, blockStorageInstanceStatusCode, pageNo, pageSize, blockStorageSize, blockStorageInstanceNoListN, blockStorageName, serverName, connectionInfo, blockStorageDiskTypeCode, blockStorageDiskDetailTypeCode, zoneCode)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageInstanceListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BlockStorageInstanceListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BlockStorageInstanceListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BlockStorageInstanceListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 블록스토리지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageInstanceDetailResponse object if successful.
     */
    public BlockStorageInstanceDetailResponse getDetail(String responseFormatType, String blockStorageInstanceNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo).toBlocking().single().body();
    }

    /**
     * 블록스토리지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageInstanceDetailResponse> getDetailAsync(String responseFormatType, String blockStorageInstanceNo, final ServiceCallback<BlockStorageInstanceDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo), serviceCallback);
    }

    /**
     * 블록스토리지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceDetailResponse object
     */
    public Observable<BlockStorageInstanceDetailResponse> getDetailAsync(String responseFormatType, String blockStorageInstanceNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo).map(new Func1<ServiceResponse<BlockStorageInstanceDetailResponse>, BlockStorageInstanceDetailResponse>() {
            @Override
            public BlockStorageInstanceDetailResponse call(ServiceResponse<BlockStorageInstanceDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceDetailResponse object
     */
    public Observable<ServiceResponse<BlockStorageInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (blockStorageInstanceNo == null) {
            throw new IllegalArgumentException("Parameter blockStorageInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.getDetail(responseFormatType, regionCode, blockStorageInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageInstanceDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageInstanceDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageInstanceDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 블록스토리지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageInstanceDetailResponse object if successful.
     */
    public BlockStorageInstanceDetailResponse getDetail(String responseFormatType, String blockStorageInstanceNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * 블록스토리지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageInstanceDetailResponse> getDetailAsync(String responseFormatType, String blockStorageInstanceNo, String regionCode, final ServiceCallback<BlockStorageInstanceDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo, regionCode), serviceCallback);
    }

    /**
     * 블록스토리지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceDetailResponse object
     */
    public Observable<BlockStorageInstanceDetailResponse> getDetailAsync(String responseFormatType, String blockStorageInstanceNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo, regionCode).map(new Func1<ServiceResponse<BlockStorageInstanceDetailResponse>, BlockStorageInstanceDetailResponse>() {
            @Override
            public BlockStorageInstanceDetailResponse call(ServiceResponse<BlockStorageInstanceDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceDetailResponse object
     */
    public Observable<ServiceResponse<BlockStorageInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (blockStorageInstanceNo == null) {
            throw new IllegalArgumentException("Parameter blockStorageInstanceNo is required and cannot be null.");
        }
        return service.getDetail(responseFormatType, regionCode, blockStorageInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageInstanceDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageInstanceDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageInstanceDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BlockStorageInstanceDetailResponse> getDetailDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BlockStorageInstanceDetailResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BlockStorageInstanceDetailResponse>() { }.getType())
                .build(response);
    }

    /**
     * 블록스토리지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageInstanceResponse object if successful.
     */
    public BlockStorageInstanceResponse create(String responseFormatType, String serverInstanceNo) {
        return createWithServiceResponseAsync(responseFormatType, serverInstanceNo).toBlocking().single().body();
    }

    /**
     * 블록스토리지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageInstanceResponse> createAsync(String responseFormatType, String serverInstanceNo, final ServiceCallback<BlockStorageInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, serverInstanceNo), serviceCallback);
    }

    /**
     * 블록스토리지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    public Observable<BlockStorageInstanceResponse> createAsync(String responseFormatType, String serverInstanceNo) {
        return createWithServiceResponseAsync(responseFormatType, serverInstanceNo).map(new Func1<ServiceResponse<BlockStorageInstanceResponse>, BlockStorageInstanceResponse>() {
            @Override
            public BlockStorageInstanceResponse call(ServiceResponse<BlockStorageInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    public Observable<ServiceResponse<BlockStorageInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String serverInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        final String zoneCode = null;
        final String blockStorageName = null;
        final BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode = null;
        final String blockStorageSnapshotInstanceNo = null;
        final String blockStorageSize = null;
        final String blockStorageDescription = null;
        return service.create(responseFormatType, regionCode, zoneCode, blockStorageName, blockStorageDiskDetailTypeCode, serverInstanceNo, blockStorageSnapshotInstanceNo, blockStorageSize, blockStorageDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageInstanceResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 블록스토리지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param zoneCode ZONE 코드
     * @param blockStorageName 블록스토리지 이름
     * @param blockStorageDiskDetailTypeCode 블록스토리지 디스크 상세 유형 코드. Possible values include: 'HDD', 'SDD'
     * @param blockStorageSnapshotInstanceNo 블록스토리지 스냅샷 인스턴스 번호
     * @param blockStorageSize 블록스토리지 사이즈
     * @param blockStorageDescription 블록스토리지 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageInstanceResponse object if successful.
     */
    public BlockStorageInstanceResponse create(String responseFormatType, String serverInstanceNo, String regionCode, String zoneCode, String blockStorageName, BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode, String blockStorageSnapshotInstanceNo, String blockStorageSize, String blockStorageDescription) {
        return createWithServiceResponseAsync(responseFormatType, serverInstanceNo, regionCode, zoneCode, blockStorageName, blockStorageDiskDetailTypeCode, blockStorageSnapshotInstanceNo, blockStorageSize, blockStorageDescription).toBlocking().single().body();
    }

    /**
     * 블록스토리지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param zoneCode ZONE 코드
     * @param blockStorageName 블록스토리지 이름
     * @param blockStorageDiskDetailTypeCode 블록스토리지 디스크 상세 유형 코드. Possible values include: 'HDD', 'SDD'
     * @param blockStorageSnapshotInstanceNo 블록스토리지 스냅샷 인스턴스 번호
     * @param blockStorageSize 블록스토리지 사이즈
     * @param blockStorageDescription 블록스토리지 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageInstanceResponse> createAsync(String responseFormatType, String serverInstanceNo, String regionCode, String zoneCode, String blockStorageName, BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode, String blockStorageSnapshotInstanceNo, String blockStorageSize, String blockStorageDescription, final ServiceCallback<BlockStorageInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, serverInstanceNo, regionCode, zoneCode, blockStorageName, blockStorageDiskDetailTypeCode, blockStorageSnapshotInstanceNo, blockStorageSize, blockStorageDescription), serviceCallback);
    }

    /**
     * 블록스토리지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param zoneCode ZONE 코드
     * @param blockStorageName 블록스토리지 이름
     * @param blockStorageDiskDetailTypeCode 블록스토리지 디스크 상세 유형 코드. Possible values include: 'HDD', 'SDD'
     * @param blockStorageSnapshotInstanceNo 블록스토리지 스냅샷 인스턴스 번호
     * @param blockStorageSize 블록스토리지 사이즈
     * @param blockStorageDescription 블록스토리지 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    public Observable<BlockStorageInstanceResponse> createAsync(String responseFormatType, String serverInstanceNo, String regionCode, String zoneCode, String blockStorageName, BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode, String blockStorageSnapshotInstanceNo, String blockStorageSize, String blockStorageDescription) {
        return createWithServiceResponseAsync(responseFormatType, serverInstanceNo, regionCode, zoneCode, blockStorageName, blockStorageDiskDetailTypeCode, blockStorageSnapshotInstanceNo, blockStorageSize, blockStorageDescription).map(new Func1<ServiceResponse<BlockStorageInstanceResponse>, BlockStorageInstanceResponse>() {
            @Override
            public BlockStorageInstanceResponse call(ServiceResponse<BlockStorageInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param zoneCode ZONE 코드
     * @param blockStorageName 블록스토리지 이름
     * @param blockStorageDiskDetailTypeCode 블록스토리지 디스크 상세 유형 코드. Possible values include: 'HDD', 'SDD'
     * @param blockStorageSnapshotInstanceNo 블록스토리지 스냅샷 인스턴스 번호
     * @param blockStorageSize 블록스토리지 사이즈
     * @param blockStorageDescription 블록스토리지 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    public Observable<ServiceResponse<BlockStorageInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String serverInstanceNo, String regionCode, String zoneCode, String blockStorageName, BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode, String blockStorageSnapshotInstanceNo, String blockStorageSize, String blockStorageDescription) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        return service.create(responseFormatType, regionCode, zoneCode, blockStorageName, blockStorageDiskDetailTypeCode, serverInstanceNo, blockStorageSnapshotInstanceNo, blockStorageSize, blockStorageDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageInstanceResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BlockStorageInstanceResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BlockStorageInstanceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BlockStorageInstanceResponse>() { }.getType())
                .build(response);
    }

    /**
     * 블록스토리지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageInstanceResponse object if successful.
     */
    public BlockStorageInstanceResponse delete(String responseFormatType, String blockStorageInstanceNoListN) {
        return deleteWithServiceResponseAsync(responseFormatType, blockStorageInstanceNoListN).toBlocking().single().body();
    }

    /**
     * 블록스토리지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageInstanceResponse> deleteAsync(String responseFormatType, String blockStorageInstanceNoListN, final ServiceCallback<BlockStorageInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, blockStorageInstanceNoListN), serviceCallback);
    }

    /**
     * 블록스토리지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    public Observable<BlockStorageInstanceResponse> deleteAsync(String responseFormatType, String blockStorageInstanceNoListN) {
        return deleteWithServiceResponseAsync(responseFormatType, blockStorageInstanceNoListN).map(new Func1<ServiceResponse<BlockStorageInstanceResponse>, BlockStorageInstanceResponse>() {
            @Override
            public BlockStorageInstanceResponse call(ServiceResponse<BlockStorageInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    public Observable<ServiceResponse<BlockStorageInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (blockStorageInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter blockStorageInstanceNoListN is required and cannot be null.");
        }
        final String regionCode = null;
        return service.delete(responseFormatType, regionCode, blockStorageInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageInstanceResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 블록스토리지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageInstanceResponse object if successful.
     */
    public BlockStorageInstanceResponse delete(String responseFormatType, String blockStorageInstanceNoListN, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, blockStorageInstanceNoListN, regionCode).toBlocking().single().body();
    }

    /**
     * 블록스토리지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageInstanceResponse> deleteAsync(String responseFormatType, String blockStorageInstanceNoListN, String regionCode, final ServiceCallback<BlockStorageInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, blockStorageInstanceNoListN, regionCode), serviceCallback);
    }

    /**
     * 블록스토리지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    public Observable<BlockStorageInstanceResponse> deleteAsync(String responseFormatType, String blockStorageInstanceNoListN, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, blockStorageInstanceNoListN, regionCode).map(new Func1<ServiceResponse<BlockStorageInstanceResponse>, BlockStorageInstanceResponse>() {
            @Override
            public BlockStorageInstanceResponse call(ServiceResponse<BlockStorageInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    public Observable<ServiceResponse<BlockStorageInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNoListN, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (blockStorageInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter blockStorageInstanceNoListN is required and cannot be null.");
        }
        return service.delete(responseFormatType, regionCode, blockStorageInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageInstanceResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BlockStorageInstanceResponse> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BlockStorageInstanceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BlockStorageInstanceResponse>() { }.getType())
                .build(response);
    }

    /**
     * 블록스토리지 인스턴스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageInstanceResponse object if successful.
     */
    public BlockStorageInstanceResponse attach(String responseFormatType, String blockStorageInstanceNo, String serverInstanceNo) {
        return attachWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo, serverInstanceNo).toBlocking().single().body();
    }

    /**
     * 블록스토리지 인스턴스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageInstanceResponse> attachAsync(String responseFormatType, String blockStorageInstanceNo, String serverInstanceNo, final ServiceCallback<BlockStorageInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(attachWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo, serverInstanceNo), serviceCallback);
    }

    /**
     * 블록스토리지 인스턴스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    public Observable<BlockStorageInstanceResponse> attachAsync(String responseFormatType, String blockStorageInstanceNo, String serverInstanceNo) {
        return attachWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo, serverInstanceNo).map(new Func1<ServiceResponse<BlockStorageInstanceResponse>, BlockStorageInstanceResponse>() {
            @Override
            public BlockStorageInstanceResponse call(ServiceResponse<BlockStorageInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 인스턴스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    public Observable<ServiceResponse<BlockStorageInstanceResponse>> attachWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNo, String serverInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (blockStorageInstanceNo == null) {
            throw new IllegalArgumentException("Parameter blockStorageInstanceNo is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.attach(responseFormatType, regionCode, blockStorageInstanceNo, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageInstanceResponse> clientResponse = attachDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 블록스토리지 인스턴스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageInstanceResponse object if successful.
     */
    public BlockStorageInstanceResponse attach(String responseFormatType, String blockStorageInstanceNo, String serverInstanceNo, String regionCode) {
        return attachWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo, serverInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * 블록스토리지 인스턴스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageInstanceResponse> attachAsync(String responseFormatType, String blockStorageInstanceNo, String serverInstanceNo, String regionCode, final ServiceCallback<BlockStorageInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(attachWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo, serverInstanceNo, regionCode), serviceCallback);
    }

    /**
     * 블록스토리지 인스턴스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    public Observable<BlockStorageInstanceResponse> attachAsync(String responseFormatType, String blockStorageInstanceNo, String serverInstanceNo, String regionCode) {
        return attachWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo, serverInstanceNo, regionCode).map(new Func1<ServiceResponse<BlockStorageInstanceResponse>, BlockStorageInstanceResponse>() {
            @Override
            public BlockStorageInstanceResponse call(ServiceResponse<BlockStorageInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 인스턴스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    public Observable<ServiceResponse<BlockStorageInstanceResponse>> attachWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNo, String serverInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (blockStorageInstanceNo == null) {
            throw new IllegalArgumentException("Parameter blockStorageInstanceNo is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        return service.attach(responseFormatType, regionCode, blockStorageInstanceNo, serverInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageInstanceResponse> clientResponse = attachDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BlockStorageInstanceResponse> attachDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BlockStorageInstanceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BlockStorageInstanceResponse>() { }.getType())
                .build(response);
    }

    /**
     * 블록스토리지 인스턴스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageInstanceResponse object if successful.
     */
    public BlockStorageInstanceResponse detach(String responseFormatType, String blockStorageInstanceNoListN) {
        return detachWithServiceResponseAsync(responseFormatType, blockStorageInstanceNoListN).toBlocking().single().body();
    }

    /**
     * 블록스토리지 인스턴스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageInstanceResponse> detachAsync(String responseFormatType, String blockStorageInstanceNoListN, final ServiceCallback<BlockStorageInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(detachWithServiceResponseAsync(responseFormatType, blockStorageInstanceNoListN), serviceCallback);
    }

    /**
     * 블록스토리지 인스턴스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    public Observable<BlockStorageInstanceResponse> detachAsync(String responseFormatType, String blockStorageInstanceNoListN) {
        return detachWithServiceResponseAsync(responseFormatType, blockStorageInstanceNoListN).map(new Func1<ServiceResponse<BlockStorageInstanceResponse>, BlockStorageInstanceResponse>() {
            @Override
            public BlockStorageInstanceResponse call(ServiceResponse<BlockStorageInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 인스턴스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    public Observable<ServiceResponse<BlockStorageInstanceResponse>> detachWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (blockStorageInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter blockStorageInstanceNoListN is required and cannot be null.");
        }
        final String regionCode = null;
        return service.detach(responseFormatType, regionCode, blockStorageInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageInstanceResponse> clientResponse = detachDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 블록스토리지 인스턴스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageInstanceResponse object if successful.
     */
    public BlockStorageInstanceResponse detach(String responseFormatType, String blockStorageInstanceNoListN, String regionCode) {
        return detachWithServiceResponseAsync(responseFormatType, blockStorageInstanceNoListN, regionCode).toBlocking().single().body();
    }

    /**
     * 블록스토리지 인스턴스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageInstanceResponse> detachAsync(String responseFormatType, String blockStorageInstanceNoListN, String regionCode, final ServiceCallback<BlockStorageInstanceResponse> serviceCallback) {
        return ServiceFuture.fromResponse(detachWithServiceResponseAsync(responseFormatType, blockStorageInstanceNoListN, regionCode), serviceCallback);
    }

    /**
     * 블록스토리지 인스턴스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    public Observable<BlockStorageInstanceResponse> detachAsync(String responseFormatType, String blockStorageInstanceNoListN, String regionCode) {
        return detachWithServiceResponseAsync(responseFormatType, blockStorageInstanceNoListN, regionCode).map(new Func1<ServiceResponse<BlockStorageInstanceResponse>, BlockStorageInstanceResponse>() {
            @Override
            public BlockStorageInstanceResponse call(ServiceResponse<BlockStorageInstanceResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 인스턴스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    public Observable<ServiceResponse<BlockStorageInstanceResponse>> detachWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNoListN, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (blockStorageInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter blockStorageInstanceNoListN is required and cannot be null.");
        }
        return service.detach(responseFormatType, regionCode, blockStorageInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageInstanceResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageInstanceResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageInstanceResponse> clientResponse = detachDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BlockStorageInstanceResponse> detachDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BlockStorageInstanceResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BlockStorageInstanceResponse>() { }.getType())
                .build(response);
    }

    /**
     * 블록스토리지 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param blockStorageSize 블록스토리지 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageVolumeSizeResponse object if successful.
     */
    public BlockStorageVolumeSizeResponse changeVolumeSize(String responseFormatType, String blockStorageInstanceNo, String blockStorageSize) {
        return changeVolumeSizeWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo, blockStorageSize).toBlocking().single().body();
    }

    /**
     * 블록스토리지 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param blockStorageSize 블록스토리지 사이즈
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageVolumeSizeResponse> changeVolumeSizeAsync(String responseFormatType, String blockStorageInstanceNo, String blockStorageSize, final ServiceCallback<BlockStorageVolumeSizeResponse> serviceCallback) {
        return ServiceFuture.fromResponse(changeVolumeSizeWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo, blockStorageSize), serviceCallback);
    }

    /**
     * 블록스토리지 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param blockStorageSize 블록스토리지 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageVolumeSizeResponse object
     */
    public Observable<BlockStorageVolumeSizeResponse> changeVolumeSizeAsync(String responseFormatType, String blockStorageInstanceNo, String blockStorageSize) {
        return changeVolumeSizeWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo, blockStorageSize).map(new Func1<ServiceResponse<BlockStorageVolumeSizeResponse>, BlockStorageVolumeSizeResponse>() {
            @Override
            public BlockStorageVolumeSizeResponse call(ServiceResponse<BlockStorageVolumeSizeResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param blockStorageSize 블록스토리지 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageVolumeSizeResponse object
     */
    public Observable<ServiceResponse<BlockStorageVolumeSizeResponse>> changeVolumeSizeWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNo, String blockStorageSize) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (blockStorageInstanceNo == null) {
            throw new IllegalArgumentException("Parameter blockStorageInstanceNo is required and cannot be null.");
        }
        if (blockStorageSize == null) {
            throw new IllegalArgumentException("Parameter blockStorageSize is required and cannot be null.");
        }
        final String regionCode = null;
        return service.changeVolumeSize(responseFormatType, regionCode, blockStorageInstanceNo, blockStorageSize)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageVolumeSizeResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageVolumeSizeResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageVolumeSizeResponse> clientResponse = changeVolumeSizeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 블록스토리지 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param blockStorageSize 블록스토리지 사이즈
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageVolumeSizeResponse object if successful.
     */
    public BlockStorageVolumeSizeResponse changeVolumeSize(String responseFormatType, String blockStorageInstanceNo, String blockStorageSize, String regionCode) {
        return changeVolumeSizeWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo, blockStorageSize, regionCode).toBlocking().single().body();
    }

    /**
     * 블록스토리지 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param blockStorageSize 블록스토리지 사이즈
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlockStorageVolumeSizeResponse> changeVolumeSizeAsync(String responseFormatType, String blockStorageInstanceNo, String blockStorageSize, String regionCode, final ServiceCallback<BlockStorageVolumeSizeResponse> serviceCallback) {
        return ServiceFuture.fromResponse(changeVolumeSizeWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo, blockStorageSize, regionCode), serviceCallback);
    }

    /**
     * 블록스토리지 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param blockStorageSize 블록스토리지 사이즈
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageVolumeSizeResponse object
     */
    public Observable<BlockStorageVolumeSizeResponse> changeVolumeSizeAsync(String responseFormatType, String blockStorageInstanceNo, String blockStorageSize, String regionCode) {
        return changeVolumeSizeWithServiceResponseAsync(responseFormatType, blockStorageInstanceNo, blockStorageSize, regionCode).map(new Func1<ServiceResponse<BlockStorageVolumeSizeResponse>, BlockStorageVolumeSizeResponse>() {
            @Override
            public BlockStorageVolumeSizeResponse call(ServiceResponse<BlockStorageVolumeSizeResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 블록스토리지 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param blockStorageSize 블록스토리지 사이즈
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageVolumeSizeResponse object
     */
    public Observable<ServiceResponse<BlockStorageVolumeSizeResponse>> changeVolumeSizeWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNo, String blockStorageSize, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (blockStorageInstanceNo == null) {
            throw new IllegalArgumentException("Parameter blockStorageInstanceNo is required and cannot be null.");
        }
        if (blockStorageSize == null) {
            throw new IllegalArgumentException("Parameter blockStorageSize is required and cannot be null.");
        }
        return service.changeVolumeSize(responseFormatType, regionCode, blockStorageInstanceNo, blockStorageSize)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlockStorageVolumeSizeResponse>>>() {
                @Override
                public Observable<ServiceResponse<BlockStorageVolumeSizeResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlockStorageVolumeSizeResponse> clientResponse = changeVolumeSizeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BlockStorageVolumeSizeResponse> changeVolumeSizeDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BlockStorageVolumeSizeResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BlockStorageVolumeSizeResponse>() { }.getType())
                .build(response);
    }

}
