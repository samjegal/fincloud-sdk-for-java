/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.nas.implementation;

import retrofit2.Retrofit;
import com.fincloud.nas.NAS;
import com.fincloud.nas.models.EncryptedVolume;
import com.fincloud.nas.models.EventConfiguration;
import com.fincloud.nas.models.NasVolumeAccessControlResponse;
import com.fincloud.nas.models.NasVolumeInstanceDetailResponse;
import com.fincloud.nas.models.NasVolumeInstanceListResponse;
import com.fincloud.nas.models.NasVolumeInstancesResponse;
import com.fincloud.nas.models.NasVolumeSizeResponse;
import com.fincloud.nas.models.SnapshotConfiguration;
import com.fincloud.nas.models.SortedBy;
import com.fincloud.nas.models.SortingOrder;
import com.fincloud.nas.models.VolumeAllotmentProtocolTypeCode;
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
 * in NAS.
 */
public class NASImpl implements NAS {
    /** The Retrofit service to perform REST calls. */
    private NASService service;
    /** The service client containing this operation class. */
    private NASManagementClientImpl client;

    /**
     * Initializes an instance of NAS.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public NASImpl(Retrofit retrofit, NASManagementClientImpl client) {
        this.service = retrofit.create(NASService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for NAS to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NASService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.nas.NAS getList" })
        @GET("vnas/v2/getNasVolumeInstanceList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("volumeAllotmentProtocolTypeCode") VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode1, @Query("isEventConfiguration") EventConfiguration isEventConfiguration, @Query("isSnapshotConfiguration") SnapshotConfiguration isSnapshotConfiguration, @Query("nasVolumeInstanceNoList.N") String nasVolumeInstanceNoListN, @Query("zoneCode") String zoneCode, @Query("pageNo") String pageNo, @Query("pageSize") String pageSize, @Query("volumeName") String volumeName, @Query("sortedBy") SortedBy sortedBy1, @Query("sortingOrder") SortingOrder sortingOrder1);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.nas.NAS getDetail" })
        @GET("vnas/v2/getNasVolumeInstanceDetail")
        Observable<Response<ResponseBody>> getDetail(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("nasVolumeInstanceNo") String nasVolumeInstanceNo);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.nas.NAS create" })
        @POST("vnas/v2/createNasVolumeInstance")
        Observable<Response<ResponseBody>> create(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("zoneCode") String zoneCode, @Query("volumeName") String volumeName, @Query("volumeAllotmentProtocolTypeCode") VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode1, @Query("volumeSize") String volumeSize, @Query("serverInstanceNoList.N") String serverInstanceNoListN, @Query("cifsUserName") String cifsUserName, @Query("cifsUserPassword") String cifsUserPassword, @Query("isEncryptedVolume") EncryptedVolume isEncryptedVolume, @Query("nasVolumeDescription") String nasVolumeDescription);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.nas.NAS delete" })
        @POST("vnas/v2/deleteNasVolumeInstances")
        Observable<Response<ResponseBody>> delete(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("nasVolumeInstanceNoList.N") String nasVolumeInstanceNoListN);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.nas.NAS changeSize" })
        @POST("vnas/v2/changeNasVolumeSize")
        Observable<Response<ResponseBody>> changeSize(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("nasVolumeInstanceNo") String nasVolumeInstanceNo, @Query("volumeSize") String volumeSize);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.nas.NAS addAccessControl" })
        @POST("vnas/v2/addNasVolumeAccessControl")
        Observable<Response<ResponseBody>> addAccessControl(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("nasVolumeInstanceNo") String nasVolumeInstanceNo, @Query("serverInstanceNoList.N") String serverInstanceNoListN);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.nas.NAS removeAccessControl" })
        @POST("vnas/v2/removeNasVolumeAccessControl")
        Observable<Response<ResponseBody>> removeAccessControl(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("nasVolumeInstanceNo") String nasVolumeInstanceNo, @Query("serverInstanceNoList.N") String serverInstanceNoListN);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.nas.NAS setAccessControl" })
        @POST("vnas/v2/setNasVolumeAccessControl")
        Observable<Response<ResponseBody>> setAccessControl(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("nasVolumeInstanceNo") String nasVolumeInstanceNo, @Query("serverInstanceNoList.N") String serverInstanceNoListN);

    }

    /**
     * NAS 볼륨 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NasVolumeInstanceListResponse object if successful.
     */
    public NasVolumeInstanceListResponse getList(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * NAS 볼륨 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NasVolumeInstanceListResponse> getListAsync(String responseFormatType, final ServiceCallback<NasVolumeInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * NAS 볼륨 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstanceListResponse object
     */
    public Observable<NasVolumeInstanceListResponse> getListAsync(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<NasVolumeInstanceListResponse>, NasVolumeInstanceListResponse>() {
            @Override
            public NasVolumeInstanceListResponse call(ServiceResponse<NasVolumeInstanceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NAS 볼륨 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstanceListResponse object
     */
    public Observable<ServiceResponse<NasVolumeInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String regionCode = null;
        final VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode = null;
        final EventConfiguration isEventConfiguration = null;
        final SnapshotConfiguration isSnapshotConfiguration = null;
        final String nasVolumeInstanceNoListN = null;
        final String zoneCode = null;
        final String pageNo = null;
        final String pageSize = null;
        final String volumeName = null;
        final SortedBy sortedBy = null;
        final SortingOrder sortingOrder = null;
        return service.getList(responseFormatType, regionCode, volumeAllotmentProtocolTypeCode, isEventConfiguration, isSnapshotConfiguration, nasVolumeInstanceNoListN, zoneCode, pageNo, pageSize, volumeName, sortedBy, sortingOrder)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NasVolumeInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<NasVolumeInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NasVolumeInstanceListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * NAS 볼륨 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param volumeAllotmentProtocolTypeCode 볼륨 할당 프로토콜 유형 코드. Possible values include: 'NFS', 'CIFS'
     * @param isEventConfiguration 이벤트 설정 여부. Possible values include: 'true', 'false'
     * @param isSnapshotConfiguration 스냅샷 설정 여부. Possible values include: 'true', 'false'
     * @param nasVolumeInstanceNoListN NAS 볼륨 인스턴스 번호 리스트
     * @param zoneCode ZONE 코드
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param volumeName 볼륨 이름
     * @param sortedBy 정렬 대상. Possible values include: 'nasVolumeInstanceNo', 'volumeName', 'volumeTotalSize'
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NasVolumeInstanceListResponse object if successful.
     */
    public NasVolumeInstanceListResponse getList(String responseFormatType, String regionCode, VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode, EventConfiguration isEventConfiguration, SnapshotConfiguration isSnapshotConfiguration, String nasVolumeInstanceNoListN, String zoneCode, String pageNo, String pageSize, String volumeName, SortedBy sortedBy, SortingOrder sortingOrder) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, volumeAllotmentProtocolTypeCode, isEventConfiguration, isSnapshotConfiguration, nasVolumeInstanceNoListN, zoneCode, pageNo, pageSize, volumeName, sortedBy, sortingOrder).toBlocking().single().body();
    }

    /**
     * NAS 볼륨 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param volumeAllotmentProtocolTypeCode 볼륨 할당 프로토콜 유형 코드. Possible values include: 'NFS', 'CIFS'
     * @param isEventConfiguration 이벤트 설정 여부. Possible values include: 'true', 'false'
     * @param isSnapshotConfiguration 스냅샷 설정 여부. Possible values include: 'true', 'false'
     * @param nasVolumeInstanceNoListN NAS 볼륨 인스턴스 번호 리스트
     * @param zoneCode ZONE 코드
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param volumeName 볼륨 이름
     * @param sortedBy 정렬 대상. Possible values include: 'nasVolumeInstanceNo', 'volumeName', 'volumeTotalSize'
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NasVolumeInstanceListResponse> getListAsync(String responseFormatType, String regionCode, VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode, EventConfiguration isEventConfiguration, SnapshotConfiguration isSnapshotConfiguration, String nasVolumeInstanceNoListN, String zoneCode, String pageNo, String pageSize, String volumeName, SortedBy sortedBy, SortingOrder sortingOrder, final ServiceCallback<NasVolumeInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, regionCode, volumeAllotmentProtocolTypeCode, isEventConfiguration, isSnapshotConfiguration, nasVolumeInstanceNoListN, zoneCode, pageNo, pageSize, volumeName, sortedBy, sortingOrder), serviceCallback);
    }

    /**
     * NAS 볼륨 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param volumeAllotmentProtocolTypeCode 볼륨 할당 프로토콜 유형 코드. Possible values include: 'NFS', 'CIFS'
     * @param isEventConfiguration 이벤트 설정 여부. Possible values include: 'true', 'false'
     * @param isSnapshotConfiguration 스냅샷 설정 여부. Possible values include: 'true', 'false'
     * @param nasVolumeInstanceNoListN NAS 볼륨 인스턴스 번호 리스트
     * @param zoneCode ZONE 코드
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param volumeName 볼륨 이름
     * @param sortedBy 정렬 대상. Possible values include: 'nasVolumeInstanceNo', 'volumeName', 'volumeTotalSize'
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstanceListResponse object
     */
    public Observable<NasVolumeInstanceListResponse> getListAsync(String responseFormatType, String regionCode, VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode, EventConfiguration isEventConfiguration, SnapshotConfiguration isSnapshotConfiguration, String nasVolumeInstanceNoListN, String zoneCode, String pageNo, String pageSize, String volumeName, SortedBy sortedBy, SortingOrder sortingOrder) {
        return getListWithServiceResponseAsync(responseFormatType, regionCode, volumeAllotmentProtocolTypeCode, isEventConfiguration, isSnapshotConfiguration, nasVolumeInstanceNoListN, zoneCode, pageNo, pageSize, volumeName, sortedBy, sortingOrder).map(new Func1<ServiceResponse<NasVolumeInstanceListResponse>, NasVolumeInstanceListResponse>() {
            @Override
            public NasVolumeInstanceListResponse call(ServiceResponse<NasVolumeInstanceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NAS 볼륨 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param volumeAllotmentProtocolTypeCode 볼륨 할당 프로토콜 유형 코드. Possible values include: 'NFS', 'CIFS'
     * @param isEventConfiguration 이벤트 설정 여부. Possible values include: 'true', 'false'
     * @param isSnapshotConfiguration 스냅샷 설정 여부. Possible values include: 'true', 'false'
     * @param nasVolumeInstanceNoListN NAS 볼륨 인스턴스 번호 리스트
     * @param zoneCode ZONE 코드
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param volumeName 볼륨 이름
     * @param sortedBy 정렬 대상. Possible values include: 'nasVolumeInstanceNo', 'volumeName', 'volumeTotalSize'
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstanceListResponse object
     */
    public Observable<ServiceResponse<NasVolumeInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode, EventConfiguration isEventConfiguration, SnapshotConfiguration isSnapshotConfiguration, String nasVolumeInstanceNoListN, String zoneCode, String pageNo, String pageSize, String volumeName, SortedBy sortedBy, SortingOrder sortingOrder) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, volumeAllotmentProtocolTypeCode, isEventConfiguration, isSnapshotConfiguration, nasVolumeInstanceNoListN, zoneCode, pageNo, pageSize, volumeName, sortedBy, sortingOrder)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NasVolumeInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<NasVolumeInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NasVolumeInstanceListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NasVolumeInstanceListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NasVolumeInstanceListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NasVolumeInstanceListResponse>() { }.getType())
                .build(response);
    }

    /**
     * NAS 볼륜 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NasVolumeInstanceDetailResponse object if successful.
     */
    public NasVolumeInstanceDetailResponse getDetail(String responseFormatType, String nasVolumeInstanceNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo).toBlocking().single().body();
    }

    /**
     * NAS 볼륜 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NasVolumeInstanceDetailResponse> getDetailAsync(String responseFormatType, String nasVolumeInstanceNo, final ServiceCallback<NasVolumeInstanceDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo), serviceCallback);
    }

    /**
     * NAS 볼륜 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstanceDetailResponse object
     */
    public Observable<NasVolumeInstanceDetailResponse> getDetailAsync(String responseFormatType, String nasVolumeInstanceNo) {
        return getDetailWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo).map(new Func1<ServiceResponse<NasVolumeInstanceDetailResponse>, NasVolumeInstanceDetailResponse>() {
            @Override
            public NasVolumeInstanceDetailResponse call(ServiceResponse<NasVolumeInstanceDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NAS 볼륜 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstanceDetailResponse object
     */
    public Observable<ServiceResponse<NasVolumeInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (nasVolumeInstanceNo == null) {
            throw new IllegalArgumentException("Parameter nasVolumeInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        return service.getDetail(responseFormatType, regionCode, nasVolumeInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NasVolumeInstanceDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<NasVolumeInstanceDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NasVolumeInstanceDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * NAS 볼륜 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NasVolumeInstanceDetailResponse object if successful.
     */
    public NasVolumeInstanceDetailResponse getDetail(String responseFormatType, String nasVolumeInstanceNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, regionCode).toBlocking().single().body();
    }

    /**
     * NAS 볼륜 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NasVolumeInstanceDetailResponse> getDetailAsync(String responseFormatType, String nasVolumeInstanceNo, String regionCode, final ServiceCallback<NasVolumeInstanceDetailResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, regionCode), serviceCallback);
    }

    /**
     * NAS 볼륜 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstanceDetailResponse object
     */
    public Observable<NasVolumeInstanceDetailResponse> getDetailAsync(String responseFormatType, String nasVolumeInstanceNo, String regionCode) {
        return getDetailWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, regionCode).map(new Func1<ServiceResponse<NasVolumeInstanceDetailResponse>, NasVolumeInstanceDetailResponse>() {
            @Override
            public NasVolumeInstanceDetailResponse call(ServiceResponse<NasVolumeInstanceDetailResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NAS 볼륜 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstanceDetailResponse object
     */
    public Observable<ServiceResponse<NasVolumeInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (nasVolumeInstanceNo == null) {
            throw new IllegalArgumentException("Parameter nasVolumeInstanceNo is required and cannot be null.");
        }
        return service.getDetail(responseFormatType, regionCode, nasVolumeInstanceNo)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NasVolumeInstanceDetailResponse>>>() {
                @Override
                public Observable<ServiceResponse<NasVolumeInstanceDetailResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NasVolumeInstanceDetailResponse> clientResponse = getDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NasVolumeInstanceDetailResponse> getDetailDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NasVolumeInstanceDetailResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NasVolumeInstanceDetailResponse>() { }.getType())
                .build(response);
    }

    /**
     * NAS 볼륨 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param volumeSize 볼륨 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NasVolumeInstancesResponse object if successful.
     */
    public NasVolumeInstancesResponse create(String responseFormatType, String volumeSize) {
        return createWithServiceResponseAsync(responseFormatType, volumeSize).toBlocking().single().body();
    }

    /**
     * NAS 볼륨 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param volumeSize 볼륨 사이즈
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NasVolumeInstancesResponse> createAsync(String responseFormatType, String volumeSize, final ServiceCallback<NasVolumeInstancesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, volumeSize), serviceCallback);
    }

    /**
     * NAS 볼륨 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param volumeSize 볼륨 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstancesResponse object
     */
    public Observable<NasVolumeInstancesResponse> createAsync(String responseFormatType, String volumeSize) {
        return createWithServiceResponseAsync(responseFormatType, volumeSize).map(new Func1<ServiceResponse<NasVolumeInstancesResponse>, NasVolumeInstancesResponse>() {
            @Override
            public NasVolumeInstancesResponse call(ServiceResponse<NasVolumeInstancesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NAS 볼륨 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param volumeSize 볼륨 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstancesResponse object
     */
    public Observable<ServiceResponse<NasVolumeInstancesResponse>> createWithServiceResponseAsync(String responseFormatType, String volumeSize) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (volumeSize == null) {
            throw new IllegalArgumentException("Parameter volumeSize is required and cannot be null.");
        }
        final String regionCode = null;
        final String zoneCode = null;
        final String volumeName = null;
        final VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode = null;
        final String serverInstanceNoListN = null;
        final String cifsUserName = null;
        final String cifsUserPassword = null;
        final EncryptedVolume isEncryptedVolume = null;
        final String nasVolumeDescription = null;
        return service.create(responseFormatType, regionCode, zoneCode, volumeName, volumeAllotmentProtocolTypeCode, volumeSize, serverInstanceNoListN, cifsUserName, cifsUserPassword, isEncryptedVolume, nasVolumeDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NasVolumeInstancesResponse>>>() {
                @Override
                public Observable<ServiceResponse<NasVolumeInstancesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NasVolumeInstancesResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * NAS 볼륨 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param volumeSize 볼륨 사이즈
     * @param regionCode REGION 코드
     * @param zoneCode ZONE 코드
     * @param volumeName 볼륨 이름
     * @param volumeAllotmentProtocolTypeCode 볼륨 할당 프로토콜 유형 코드. Possible values include: 'NFS', 'CIFS'
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param cifsUserName CIFS 유저 이름
     * @param cifsUserPassword CIFS 유저 비밀번호
     * @param isEncryptedVolume 볼륨 암호화 여부. Possible values include: 'true', 'false'
     * @param nasVolumeDescription NAS 볼륨 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NasVolumeInstancesResponse object if successful.
     */
    public NasVolumeInstancesResponse create(String responseFormatType, String volumeSize, String regionCode, String zoneCode, String volumeName, VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode, String serverInstanceNoListN, String cifsUserName, String cifsUserPassword, EncryptedVolume isEncryptedVolume, String nasVolumeDescription) {
        return createWithServiceResponseAsync(responseFormatType, volumeSize, regionCode, zoneCode, volumeName, volumeAllotmentProtocolTypeCode, serverInstanceNoListN, cifsUserName, cifsUserPassword, isEncryptedVolume, nasVolumeDescription).toBlocking().single().body();
    }

    /**
     * NAS 볼륨 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param volumeSize 볼륨 사이즈
     * @param regionCode REGION 코드
     * @param zoneCode ZONE 코드
     * @param volumeName 볼륨 이름
     * @param volumeAllotmentProtocolTypeCode 볼륨 할당 프로토콜 유형 코드. Possible values include: 'NFS', 'CIFS'
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param cifsUserName CIFS 유저 이름
     * @param cifsUserPassword CIFS 유저 비밀번호
     * @param isEncryptedVolume 볼륨 암호화 여부. Possible values include: 'true', 'false'
     * @param nasVolumeDescription NAS 볼륨 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NasVolumeInstancesResponse> createAsync(String responseFormatType, String volumeSize, String regionCode, String zoneCode, String volumeName, VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode, String serverInstanceNoListN, String cifsUserName, String cifsUserPassword, EncryptedVolume isEncryptedVolume, String nasVolumeDescription, final ServiceCallback<NasVolumeInstancesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, volumeSize, regionCode, zoneCode, volumeName, volumeAllotmentProtocolTypeCode, serverInstanceNoListN, cifsUserName, cifsUserPassword, isEncryptedVolume, nasVolumeDescription), serviceCallback);
    }

    /**
     * NAS 볼륨 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param volumeSize 볼륨 사이즈
     * @param regionCode REGION 코드
     * @param zoneCode ZONE 코드
     * @param volumeName 볼륨 이름
     * @param volumeAllotmentProtocolTypeCode 볼륨 할당 프로토콜 유형 코드. Possible values include: 'NFS', 'CIFS'
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param cifsUserName CIFS 유저 이름
     * @param cifsUserPassword CIFS 유저 비밀번호
     * @param isEncryptedVolume 볼륨 암호화 여부. Possible values include: 'true', 'false'
     * @param nasVolumeDescription NAS 볼륨 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstancesResponse object
     */
    public Observable<NasVolumeInstancesResponse> createAsync(String responseFormatType, String volumeSize, String regionCode, String zoneCode, String volumeName, VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode, String serverInstanceNoListN, String cifsUserName, String cifsUserPassword, EncryptedVolume isEncryptedVolume, String nasVolumeDescription) {
        return createWithServiceResponseAsync(responseFormatType, volumeSize, regionCode, zoneCode, volumeName, volumeAllotmentProtocolTypeCode, serverInstanceNoListN, cifsUserName, cifsUserPassword, isEncryptedVolume, nasVolumeDescription).map(new Func1<ServiceResponse<NasVolumeInstancesResponse>, NasVolumeInstancesResponse>() {
            @Override
            public NasVolumeInstancesResponse call(ServiceResponse<NasVolumeInstancesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NAS 볼륨 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param volumeSize 볼륨 사이즈
     * @param regionCode REGION 코드
     * @param zoneCode ZONE 코드
     * @param volumeName 볼륨 이름
     * @param volumeAllotmentProtocolTypeCode 볼륨 할당 프로토콜 유형 코드. Possible values include: 'NFS', 'CIFS'
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param cifsUserName CIFS 유저 이름
     * @param cifsUserPassword CIFS 유저 비밀번호
     * @param isEncryptedVolume 볼륨 암호화 여부. Possible values include: 'true', 'false'
     * @param nasVolumeDescription NAS 볼륨 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstancesResponse object
     */
    public Observable<ServiceResponse<NasVolumeInstancesResponse>> createWithServiceResponseAsync(String responseFormatType, String volumeSize, String regionCode, String zoneCode, String volumeName, VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode, String serverInstanceNoListN, String cifsUserName, String cifsUserPassword, EncryptedVolume isEncryptedVolume, String nasVolumeDescription) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (volumeSize == null) {
            throw new IllegalArgumentException("Parameter volumeSize is required and cannot be null.");
        }
        return service.create(responseFormatType, regionCode, zoneCode, volumeName, volumeAllotmentProtocolTypeCode, volumeSize, serverInstanceNoListN, cifsUserName, cifsUserPassword, isEncryptedVolume, nasVolumeDescription)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NasVolumeInstancesResponse>>>() {
                @Override
                public Observable<ServiceResponse<NasVolumeInstancesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NasVolumeInstancesResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NasVolumeInstancesResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NasVolumeInstancesResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NasVolumeInstancesResponse>() { }.getType())
                .build(response);
    }

    /**
     * NAS 볼륨 인스턴스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNoListN NAS 볼륨 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NasVolumeInstancesResponse object if successful.
     */
    public NasVolumeInstancesResponse delete(String responseFormatType, String nasVolumeInstanceNoListN) {
        return deleteWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNoListN).toBlocking().single().body();
    }

    /**
     * NAS 볼륨 인스턴스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNoListN NAS 볼륨 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NasVolumeInstancesResponse> deleteAsync(String responseFormatType, String nasVolumeInstanceNoListN, final ServiceCallback<NasVolumeInstancesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNoListN), serviceCallback);
    }

    /**
     * NAS 볼륨 인스턴스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNoListN NAS 볼륨 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstancesResponse object
     */
    public Observable<NasVolumeInstancesResponse> deleteAsync(String responseFormatType, String nasVolumeInstanceNoListN) {
        return deleteWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNoListN).map(new Func1<ServiceResponse<NasVolumeInstancesResponse>, NasVolumeInstancesResponse>() {
            @Override
            public NasVolumeInstancesResponse call(ServiceResponse<NasVolumeInstancesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NAS 볼륨 인스턴스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNoListN NAS 볼륨 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstancesResponse object
     */
    public Observable<ServiceResponse<NasVolumeInstancesResponse>> deleteWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (nasVolumeInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter nasVolumeInstanceNoListN is required and cannot be null.");
        }
        final String regionCode = null;
        return service.delete(responseFormatType, regionCode, nasVolumeInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NasVolumeInstancesResponse>>>() {
                @Override
                public Observable<ServiceResponse<NasVolumeInstancesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NasVolumeInstancesResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * NAS 볼륨 인스턴스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNoListN NAS 볼륨 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NasVolumeInstancesResponse object if successful.
     */
    public NasVolumeInstancesResponse delete(String responseFormatType, String nasVolumeInstanceNoListN, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNoListN, regionCode).toBlocking().single().body();
    }

    /**
     * NAS 볼륨 인스턴스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNoListN NAS 볼륨 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NasVolumeInstancesResponse> deleteAsync(String responseFormatType, String nasVolumeInstanceNoListN, String regionCode, final ServiceCallback<NasVolumeInstancesResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNoListN, regionCode), serviceCallback);
    }

    /**
     * NAS 볼륨 인스턴스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNoListN NAS 볼륨 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstancesResponse object
     */
    public Observable<NasVolumeInstancesResponse> deleteAsync(String responseFormatType, String nasVolumeInstanceNoListN, String regionCode) {
        return deleteWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNoListN, regionCode).map(new Func1<ServiceResponse<NasVolumeInstancesResponse>, NasVolumeInstancesResponse>() {
            @Override
            public NasVolumeInstancesResponse call(ServiceResponse<NasVolumeInstancesResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NAS 볼륨 인스턴스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNoListN NAS 볼륨 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstancesResponse object
     */
    public Observable<ServiceResponse<NasVolumeInstancesResponse>> deleteWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNoListN, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (nasVolumeInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter nasVolumeInstanceNoListN is required and cannot be null.");
        }
        return service.delete(responseFormatType, regionCode, nasVolumeInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NasVolumeInstancesResponse>>>() {
                @Override
                public Observable<ServiceResponse<NasVolumeInstancesResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NasVolumeInstancesResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NasVolumeInstancesResponse> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NasVolumeInstancesResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NasVolumeInstancesResponse>() { }.getType())
                .build(response);
    }

    /**
     * NAS 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param volumeSize 볼륨 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NasVolumeSizeResponse object if successful.
     */
    public NasVolumeSizeResponse changeSize(String responseFormatType, String nasVolumeInstanceNo, String volumeSize) {
        return changeSizeWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, volumeSize).toBlocking().single().body();
    }

    /**
     * NAS 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param volumeSize 볼륨 사이즈
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NasVolumeSizeResponse> changeSizeAsync(String responseFormatType, String nasVolumeInstanceNo, String volumeSize, final ServiceCallback<NasVolumeSizeResponse> serviceCallback) {
        return ServiceFuture.fromResponse(changeSizeWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, volumeSize), serviceCallback);
    }

    /**
     * NAS 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param volumeSize 볼륨 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeSizeResponse object
     */
    public Observable<NasVolumeSizeResponse> changeSizeAsync(String responseFormatType, String nasVolumeInstanceNo, String volumeSize) {
        return changeSizeWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, volumeSize).map(new Func1<ServiceResponse<NasVolumeSizeResponse>, NasVolumeSizeResponse>() {
            @Override
            public NasVolumeSizeResponse call(ServiceResponse<NasVolumeSizeResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NAS 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param volumeSize 볼륨 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeSizeResponse object
     */
    public Observable<ServiceResponse<NasVolumeSizeResponse>> changeSizeWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo, String volumeSize) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (nasVolumeInstanceNo == null) {
            throw new IllegalArgumentException("Parameter nasVolumeInstanceNo is required and cannot be null.");
        }
        if (volumeSize == null) {
            throw new IllegalArgumentException("Parameter volumeSize is required and cannot be null.");
        }
        final String regionCode = null;
        return service.changeSize(responseFormatType, regionCode, nasVolumeInstanceNo, volumeSize)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NasVolumeSizeResponse>>>() {
                @Override
                public Observable<ServiceResponse<NasVolumeSizeResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NasVolumeSizeResponse> clientResponse = changeSizeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * NAS 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param volumeSize 볼륨 사이즈
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NasVolumeSizeResponse object if successful.
     */
    public NasVolumeSizeResponse changeSize(String responseFormatType, String nasVolumeInstanceNo, String volumeSize, String regionCode) {
        return changeSizeWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, volumeSize, regionCode).toBlocking().single().body();
    }

    /**
     * NAS 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param volumeSize 볼륨 사이즈
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NasVolumeSizeResponse> changeSizeAsync(String responseFormatType, String nasVolumeInstanceNo, String volumeSize, String regionCode, final ServiceCallback<NasVolumeSizeResponse> serviceCallback) {
        return ServiceFuture.fromResponse(changeSizeWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, volumeSize, regionCode), serviceCallback);
    }

    /**
     * NAS 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param volumeSize 볼륨 사이즈
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeSizeResponse object
     */
    public Observable<NasVolumeSizeResponse> changeSizeAsync(String responseFormatType, String nasVolumeInstanceNo, String volumeSize, String regionCode) {
        return changeSizeWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, volumeSize, regionCode).map(new Func1<ServiceResponse<NasVolumeSizeResponse>, NasVolumeSizeResponse>() {
            @Override
            public NasVolumeSizeResponse call(ServiceResponse<NasVolumeSizeResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NAS 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param volumeSize 볼륨 사이즈
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeSizeResponse object
     */
    public Observable<ServiceResponse<NasVolumeSizeResponse>> changeSizeWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo, String volumeSize, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (nasVolumeInstanceNo == null) {
            throw new IllegalArgumentException("Parameter nasVolumeInstanceNo is required and cannot be null.");
        }
        if (volumeSize == null) {
            throw new IllegalArgumentException("Parameter volumeSize is required and cannot be null.");
        }
        return service.changeSize(responseFormatType, regionCode, nasVolumeInstanceNo, volumeSize)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NasVolumeSizeResponse>>>() {
                @Override
                public Observable<ServiceResponse<NasVolumeSizeResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NasVolumeSizeResponse> clientResponse = changeSizeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NasVolumeSizeResponse> changeSizeDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NasVolumeSizeResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NasVolumeSizeResponse>() { }.getType())
                .build(response);
    }

    /**
     * NAS 볼륨 접근제어를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NasVolumeAccessControlResponse object if successful.
     */
    public NasVolumeAccessControlResponse addAccessControl(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN) {
        return addAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, serverInstanceNoListN).toBlocking().single().body();
    }

    /**
     * NAS 볼륨 접근제어를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NasVolumeAccessControlResponse> addAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, final ServiceCallback<NasVolumeAccessControlResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, serverInstanceNoListN), serviceCallback);
    }

    /**
     * NAS 볼륨 접근제어를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    public Observable<NasVolumeAccessControlResponse> addAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN) {
        return addAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, serverInstanceNoListN).map(new Func1<ServiceResponse<NasVolumeAccessControlResponse>, NasVolumeAccessControlResponse>() {
            @Override
            public NasVolumeAccessControlResponse call(ServiceResponse<NasVolumeAccessControlResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NAS 볼륨 접근제어를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    public Observable<ServiceResponse<NasVolumeAccessControlResponse>> addAccessControlWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (nasVolumeInstanceNo == null) {
            throw new IllegalArgumentException("Parameter nasVolumeInstanceNo is required and cannot be null.");
        }
        if (serverInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNoListN is required and cannot be null.");
        }
        final String regionCode = null;
        return service.addAccessControl(responseFormatType, regionCode, nasVolumeInstanceNo, serverInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NasVolumeAccessControlResponse>>>() {
                @Override
                public Observable<ServiceResponse<NasVolumeAccessControlResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NasVolumeAccessControlResponse> clientResponse = addAccessControlDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * NAS 볼륨 접근제어를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NasVolumeAccessControlResponse object if successful.
     */
    public NasVolumeAccessControlResponse addAccessControl(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, String regionCode) {
        return addAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, serverInstanceNoListN, regionCode).toBlocking().single().body();
    }

    /**
     * NAS 볼륨 접근제어를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NasVolumeAccessControlResponse> addAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, String regionCode, final ServiceCallback<NasVolumeAccessControlResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, serverInstanceNoListN, regionCode), serviceCallback);
    }

    /**
     * NAS 볼륨 접근제어를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    public Observable<NasVolumeAccessControlResponse> addAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, String regionCode) {
        return addAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, serverInstanceNoListN, regionCode).map(new Func1<ServiceResponse<NasVolumeAccessControlResponse>, NasVolumeAccessControlResponse>() {
            @Override
            public NasVolumeAccessControlResponse call(ServiceResponse<NasVolumeAccessControlResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NAS 볼륨 접근제어를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    public Observable<ServiceResponse<NasVolumeAccessControlResponse>> addAccessControlWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (nasVolumeInstanceNo == null) {
            throw new IllegalArgumentException("Parameter nasVolumeInstanceNo is required and cannot be null.");
        }
        if (serverInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNoListN is required and cannot be null.");
        }
        return service.addAccessControl(responseFormatType, regionCode, nasVolumeInstanceNo, serverInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NasVolumeAccessControlResponse>>>() {
                @Override
                public Observable<ServiceResponse<NasVolumeAccessControlResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NasVolumeAccessControlResponse> clientResponse = addAccessControlDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NasVolumeAccessControlResponse> addAccessControlDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NasVolumeAccessControlResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NasVolumeAccessControlResponse>() { }.getType())
                .build(response);
    }

    /**
     * NAS 볼륨 접근제어를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NasVolumeAccessControlResponse object if successful.
     */
    public NasVolumeAccessControlResponse removeAccessControl(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN) {
        return removeAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, serverInstanceNoListN).toBlocking().single().body();
    }

    /**
     * NAS 볼륨 접근제어를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NasVolumeAccessControlResponse> removeAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, final ServiceCallback<NasVolumeAccessControlResponse> serviceCallback) {
        return ServiceFuture.fromResponse(removeAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, serverInstanceNoListN), serviceCallback);
    }

    /**
     * NAS 볼륨 접근제어를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    public Observable<NasVolumeAccessControlResponse> removeAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN) {
        return removeAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, serverInstanceNoListN).map(new Func1<ServiceResponse<NasVolumeAccessControlResponse>, NasVolumeAccessControlResponse>() {
            @Override
            public NasVolumeAccessControlResponse call(ServiceResponse<NasVolumeAccessControlResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NAS 볼륨 접근제어를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    public Observable<ServiceResponse<NasVolumeAccessControlResponse>> removeAccessControlWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (nasVolumeInstanceNo == null) {
            throw new IllegalArgumentException("Parameter nasVolumeInstanceNo is required and cannot be null.");
        }
        if (serverInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNoListN is required and cannot be null.");
        }
        final String regionCode = null;
        return service.removeAccessControl(responseFormatType, regionCode, nasVolumeInstanceNo, serverInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NasVolumeAccessControlResponse>>>() {
                @Override
                public Observable<ServiceResponse<NasVolumeAccessControlResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NasVolumeAccessControlResponse> clientResponse = removeAccessControlDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * NAS 볼륨 접근제어를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NasVolumeAccessControlResponse object if successful.
     */
    public NasVolumeAccessControlResponse removeAccessControl(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, String regionCode) {
        return removeAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, serverInstanceNoListN, regionCode).toBlocking().single().body();
    }

    /**
     * NAS 볼륨 접근제어를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NasVolumeAccessControlResponse> removeAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, String regionCode, final ServiceCallback<NasVolumeAccessControlResponse> serviceCallback) {
        return ServiceFuture.fromResponse(removeAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, serverInstanceNoListN, regionCode), serviceCallback);
    }

    /**
     * NAS 볼륨 접근제어를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    public Observable<NasVolumeAccessControlResponse> removeAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, String regionCode) {
        return removeAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, serverInstanceNoListN, regionCode).map(new Func1<ServiceResponse<NasVolumeAccessControlResponse>, NasVolumeAccessControlResponse>() {
            @Override
            public NasVolumeAccessControlResponse call(ServiceResponse<NasVolumeAccessControlResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NAS 볼륨 접근제어를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    public Observable<ServiceResponse<NasVolumeAccessControlResponse>> removeAccessControlWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, String regionCode) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (nasVolumeInstanceNo == null) {
            throw new IllegalArgumentException("Parameter nasVolumeInstanceNo is required and cannot be null.");
        }
        if (serverInstanceNoListN == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNoListN is required and cannot be null.");
        }
        return service.removeAccessControl(responseFormatType, regionCode, nasVolumeInstanceNo, serverInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NasVolumeAccessControlResponse>>>() {
                @Override
                public Observable<ServiceResponse<NasVolumeAccessControlResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NasVolumeAccessControlResponse> clientResponse = removeAccessControlDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NasVolumeAccessControlResponse> removeAccessControlDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NasVolumeAccessControlResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NasVolumeAccessControlResponse>() { }.getType())
                .build(response);
    }

    /**
     * NAS 볼륨 접근제어를 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NasVolumeAccessControlResponse object if successful.
     */
    public NasVolumeAccessControlResponse setAccessControl(String responseFormatType, String nasVolumeInstanceNo) {
        return setAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo).toBlocking().single().body();
    }

    /**
     * NAS 볼륨 접근제어를 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NasVolumeAccessControlResponse> setAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, final ServiceCallback<NasVolumeAccessControlResponse> serviceCallback) {
        return ServiceFuture.fromResponse(setAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo), serviceCallback);
    }

    /**
     * NAS 볼륨 접근제어를 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    public Observable<NasVolumeAccessControlResponse> setAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo) {
        return setAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo).map(new Func1<ServiceResponse<NasVolumeAccessControlResponse>, NasVolumeAccessControlResponse>() {
            @Override
            public NasVolumeAccessControlResponse call(ServiceResponse<NasVolumeAccessControlResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NAS 볼륨 접근제어를 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    public Observable<ServiceResponse<NasVolumeAccessControlResponse>> setAccessControlWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (nasVolumeInstanceNo == null) {
            throw new IllegalArgumentException("Parameter nasVolumeInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        final String serverInstanceNoListN = null;
        return service.setAccessControl(responseFormatType, regionCode, nasVolumeInstanceNo, serverInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NasVolumeAccessControlResponse>>>() {
                @Override
                public Observable<ServiceResponse<NasVolumeAccessControlResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NasVolumeAccessControlResponse> clientResponse = setAccessControlDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * NAS 볼륨 접근제어를 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NasVolumeAccessControlResponse object if successful.
     */
    public NasVolumeAccessControlResponse setAccessControl(String responseFormatType, String nasVolumeInstanceNo, String regionCode, String serverInstanceNoListN) {
        return setAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, regionCode, serverInstanceNoListN).toBlocking().single().body();
    }

    /**
     * NAS 볼륨 접근제어를 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NasVolumeAccessControlResponse> setAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String regionCode, String serverInstanceNoListN, final ServiceCallback<NasVolumeAccessControlResponse> serviceCallback) {
        return ServiceFuture.fromResponse(setAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, regionCode, serverInstanceNoListN), serviceCallback);
    }

    /**
     * NAS 볼륨 접근제어를 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    public Observable<NasVolumeAccessControlResponse> setAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String regionCode, String serverInstanceNoListN) {
        return setAccessControlWithServiceResponseAsync(responseFormatType, nasVolumeInstanceNo, regionCode, serverInstanceNoListN).map(new Func1<ServiceResponse<NasVolumeAccessControlResponse>, NasVolumeAccessControlResponse>() {
            @Override
            public NasVolumeAccessControlResponse call(ServiceResponse<NasVolumeAccessControlResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * NAS 볼륨 접근제어를 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    public Observable<ServiceResponse<NasVolumeAccessControlResponse>> setAccessControlWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo, String regionCode, String serverInstanceNoListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (nasVolumeInstanceNo == null) {
            throw new IllegalArgumentException("Parameter nasVolumeInstanceNo is required and cannot be null.");
        }
        return service.setAccessControl(responseFormatType, regionCode, nasVolumeInstanceNo, serverInstanceNoListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NasVolumeAccessControlResponse>>>() {
                @Override
                public Observable<ServiceResponse<NasVolumeAccessControlResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NasVolumeAccessControlResponse> clientResponse = setAccessControlDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NasVolumeAccessControlResponse> setAccessControlDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NasVolumeAccessControlResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NasVolumeAccessControlResponse>() { }.getType())
                .build(response);
    }

}
