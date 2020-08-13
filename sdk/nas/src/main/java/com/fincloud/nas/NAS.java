/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.nas;

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
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in NAS.
 */
public interface NAS {
    /**
     * NAS 볼륨 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NasVolumeInstanceListResponse object if successful.
     */
    NasVolumeInstanceListResponse getList(String responseFormatType);

    /**
     * NAS 볼륨 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NasVolumeInstanceListResponse> getListAsync(String responseFormatType, final ServiceCallback<NasVolumeInstanceListResponse> serviceCallback);

    /**
     * NAS 볼륨 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstanceListResponse object
     */
    Observable<NasVolumeInstanceListResponse> getListAsync(String responseFormatType);

    /**
     * NAS 볼륨 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstanceListResponse object
     */
    Observable<ServiceResponse<NasVolumeInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType);
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
    NasVolumeInstanceListResponse getList(String responseFormatType, String regionCode, VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode, EventConfiguration isEventConfiguration, SnapshotConfiguration isSnapshotConfiguration, String nasVolumeInstanceNoListN, String zoneCode, String pageNo, String pageSize, String volumeName, SortedBy sortedBy, SortingOrder sortingOrder);

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
    ServiceFuture<NasVolumeInstanceListResponse> getListAsync(String responseFormatType, String regionCode, VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode, EventConfiguration isEventConfiguration, SnapshotConfiguration isSnapshotConfiguration, String nasVolumeInstanceNoListN, String zoneCode, String pageNo, String pageSize, String volumeName, SortedBy sortedBy, SortingOrder sortingOrder, final ServiceCallback<NasVolumeInstanceListResponse> serviceCallback);

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
    Observable<NasVolumeInstanceListResponse> getListAsync(String responseFormatType, String regionCode, VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode, EventConfiguration isEventConfiguration, SnapshotConfiguration isSnapshotConfiguration, String nasVolumeInstanceNoListN, String zoneCode, String pageNo, String pageSize, String volumeName, SortedBy sortedBy, SortingOrder sortingOrder);

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
    Observable<ServiceResponse<NasVolumeInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode, EventConfiguration isEventConfiguration, SnapshotConfiguration isSnapshotConfiguration, String nasVolumeInstanceNoListN, String zoneCode, String pageNo, String pageSize, String volumeName, SortedBy sortedBy, SortingOrder sortingOrder);

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
    NasVolumeInstanceDetailResponse getDetail(String responseFormatType, String nasVolumeInstanceNo);

    /**
     * NAS 볼륜 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NasVolumeInstanceDetailResponse> getDetailAsync(String responseFormatType, String nasVolumeInstanceNo, final ServiceCallback<NasVolumeInstanceDetailResponse> serviceCallback);

    /**
     * NAS 볼륜 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstanceDetailResponse object
     */
    Observable<NasVolumeInstanceDetailResponse> getDetailAsync(String responseFormatType, String nasVolumeInstanceNo);

    /**
     * NAS 볼륜 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstanceDetailResponse object
     */
    Observable<ServiceResponse<NasVolumeInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo);
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
    NasVolumeInstanceDetailResponse getDetail(String responseFormatType, String nasVolumeInstanceNo, String regionCode);

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
    ServiceFuture<NasVolumeInstanceDetailResponse> getDetailAsync(String responseFormatType, String nasVolumeInstanceNo, String regionCode, final ServiceCallback<NasVolumeInstanceDetailResponse> serviceCallback);

    /**
     * NAS 볼륜 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstanceDetailResponse object
     */
    Observable<NasVolumeInstanceDetailResponse> getDetailAsync(String responseFormatType, String nasVolumeInstanceNo, String regionCode);

    /**
     * NAS 볼륜 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstanceDetailResponse object
     */
    Observable<ServiceResponse<NasVolumeInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo, String regionCode);

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
    NasVolumeInstancesResponse create(String responseFormatType, String volumeSize);

    /**
     * NAS 볼륨 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param volumeSize 볼륨 사이즈
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NasVolumeInstancesResponse> createAsync(String responseFormatType, String volumeSize, final ServiceCallback<NasVolumeInstancesResponse> serviceCallback);

    /**
     * NAS 볼륨 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param volumeSize 볼륨 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstancesResponse object
     */
    Observable<NasVolumeInstancesResponse> createAsync(String responseFormatType, String volumeSize);

    /**
     * NAS 볼륨 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param volumeSize 볼륨 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstancesResponse object
     */
    Observable<ServiceResponse<NasVolumeInstancesResponse>> createWithServiceResponseAsync(String responseFormatType, String volumeSize);
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
    NasVolumeInstancesResponse create(String responseFormatType, String volumeSize, String regionCode, String zoneCode, String volumeName, VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode, String serverInstanceNoListN, String cifsUserName, String cifsUserPassword, EncryptedVolume isEncryptedVolume, String nasVolumeDescription);

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
    ServiceFuture<NasVolumeInstancesResponse> createAsync(String responseFormatType, String volumeSize, String regionCode, String zoneCode, String volumeName, VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode, String serverInstanceNoListN, String cifsUserName, String cifsUserPassword, EncryptedVolume isEncryptedVolume, String nasVolumeDescription, final ServiceCallback<NasVolumeInstancesResponse> serviceCallback);

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
    Observable<NasVolumeInstancesResponse> createAsync(String responseFormatType, String volumeSize, String regionCode, String zoneCode, String volumeName, VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode, String serverInstanceNoListN, String cifsUserName, String cifsUserPassword, EncryptedVolume isEncryptedVolume, String nasVolumeDescription);

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
    Observable<ServiceResponse<NasVolumeInstancesResponse>> createWithServiceResponseAsync(String responseFormatType, String volumeSize, String regionCode, String zoneCode, String volumeName, VolumeAllotmentProtocolTypeCode volumeAllotmentProtocolTypeCode, String serverInstanceNoListN, String cifsUserName, String cifsUserPassword, EncryptedVolume isEncryptedVolume, String nasVolumeDescription);

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
    NasVolumeInstancesResponse delete(String responseFormatType, String nasVolumeInstanceNoListN);

    /**
     * NAS 볼륨 인스턴스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNoListN NAS 볼륨 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NasVolumeInstancesResponse> deleteAsync(String responseFormatType, String nasVolumeInstanceNoListN, final ServiceCallback<NasVolumeInstancesResponse> serviceCallback);

    /**
     * NAS 볼륨 인스턴스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNoListN NAS 볼륨 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstancesResponse object
     */
    Observable<NasVolumeInstancesResponse> deleteAsync(String responseFormatType, String nasVolumeInstanceNoListN);

    /**
     * NAS 볼륨 인스턴스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNoListN NAS 볼륨 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstancesResponse object
     */
    Observable<ServiceResponse<NasVolumeInstancesResponse>> deleteWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNoListN);
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
    NasVolumeInstancesResponse delete(String responseFormatType, String nasVolumeInstanceNoListN, String regionCode);

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
    ServiceFuture<NasVolumeInstancesResponse> deleteAsync(String responseFormatType, String nasVolumeInstanceNoListN, String regionCode, final ServiceCallback<NasVolumeInstancesResponse> serviceCallback);

    /**
     * NAS 볼륨 인스턴스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNoListN NAS 볼륨 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstancesResponse object
     */
    Observable<NasVolumeInstancesResponse> deleteAsync(String responseFormatType, String nasVolumeInstanceNoListN, String regionCode);

    /**
     * NAS 볼륨 인스턴스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNoListN NAS 볼륨 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeInstancesResponse object
     */
    Observable<ServiceResponse<NasVolumeInstancesResponse>> deleteWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNoListN, String regionCode);

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
    NasVolumeSizeResponse changeSize(String responseFormatType, String nasVolumeInstanceNo, String volumeSize);

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
    ServiceFuture<NasVolumeSizeResponse> changeSizeAsync(String responseFormatType, String nasVolumeInstanceNo, String volumeSize, final ServiceCallback<NasVolumeSizeResponse> serviceCallback);

    /**
     * NAS 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param volumeSize 볼륨 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeSizeResponse object
     */
    Observable<NasVolumeSizeResponse> changeSizeAsync(String responseFormatType, String nasVolumeInstanceNo, String volumeSize);

    /**
     * NAS 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param volumeSize 볼륨 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeSizeResponse object
     */
    Observable<ServiceResponse<NasVolumeSizeResponse>> changeSizeWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo, String volumeSize);
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
    NasVolumeSizeResponse changeSize(String responseFormatType, String nasVolumeInstanceNo, String volumeSize, String regionCode);

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
    ServiceFuture<NasVolumeSizeResponse> changeSizeAsync(String responseFormatType, String nasVolumeInstanceNo, String volumeSize, String regionCode, final ServiceCallback<NasVolumeSizeResponse> serviceCallback);

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
    Observable<NasVolumeSizeResponse> changeSizeAsync(String responseFormatType, String nasVolumeInstanceNo, String volumeSize, String regionCode);

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
    Observable<ServiceResponse<NasVolumeSizeResponse>> changeSizeWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo, String volumeSize, String regionCode);

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
    NasVolumeAccessControlResponse addAccessControl(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN);

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
    ServiceFuture<NasVolumeAccessControlResponse> addAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, final ServiceCallback<NasVolumeAccessControlResponse> serviceCallback);

    /**
     * NAS 볼륨 접근제어를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    Observable<NasVolumeAccessControlResponse> addAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN);

    /**
     * NAS 볼륨 접근제어를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    Observable<ServiceResponse<NasVolumeAccessControlResponse>> addAccessControlWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN);
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
    NasVolumeAccessControlResponse addAccessControl(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, String regionCode);

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
    ServiceFuture<NasVolumeAccessControlResponse> addAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, String regionCode, final ServiceCallback<NasVolumeAccessControlResponse> serviceCallback);

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
    Observable<NasVolumeAccessControlResponse> addAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, String regionCode);

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
    Observable<ServiceResponse<NasVolumeAccessControlResponse>> addAccessControlWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, String regionCode);

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
    NasVolumeAccessControlResponse removeAccessControl(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN);

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
    ServiceFuture<NasVolumeAccessControlResponse> removeAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, final ServiceCallback<NasVolumeAccessControlResponse> serviceCallback);

    /**
     * NAS 볼륨 접근제어를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    Observable<NasVolumeAccessControlResponse> removeAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN);

    /**
     * NAS 볼륨 접근제어를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    Observable<ServiceResponse<NasVolumeAccessControlResponse>> removeAccessControlWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN);
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
    NasVolumeAccessControlResponse removeAccessControl(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, String regionCode);

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
    ServiceFuture<NasVolumeAccessControlResponse> removeAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, String regionCode, final ServiceCallback<NasVolumeAccessControlResponse> serviceCallback);

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
    Observable<NasVolumeAccessControlResponse> removeAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, String regionCode);

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
    Observable<ServiceResponse<NasVolumeAccessControlResponse>> removeAccessControlWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo, String serverInstanceNoListN, String regionCode);

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
    NasVolumeAccessControlResponse setAccessControl(String responseFormatType, String nasVolumeInstanceNo);

    /**
     * NAS 볼륨 접근제어를 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NasVolumeAccessControlResponse> setAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, final ServiceCallback<NasVolumeAccessControlResponse> serviceCallback);

    /**
     * NAS 볼륨 접근제어를 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    Observable<NasVolumeAccessControlResponse> setAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo);

    /**
     * NAS 볼륨 접근제어를 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param nasVolumeInstanceNo NAS 볼륜 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NasVolumeAccessControlResponse object
     */
    Observable<ServiceResponse<NasVolumeAccessControlResponse>> setAccessControlWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo);
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
    NasVolumeAccessControlResponse setAccessControl(String responseFormatType, String nasVolumeInstanceNo, String regionCode, String serverInstanceNoListN);

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
    ServiceFuture<NasVolumeAccessControlResponse> setAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String regionCode, String serverInstanceNoListN, final ServiceCallback<NasVolumeAccessControlResponse> serviceCallback);

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
    Observable<NasVolumeAccessControlResponse> setAccessControlAsync(String responseFormatType, String nasVolumeInstanceNo, String regionCode, String serverInstanceNoListN);

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
    Observable<ServiceResponse<NasVolumeAccessControlResponse>> setAccessControlWithServiceResponseAsync(String responseFormatType, String nasVolumeInstanceNo, String regionCode, String serverInstanceNoListN);

}
