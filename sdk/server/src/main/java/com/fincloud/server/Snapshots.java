/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server;

import com.fincloud.server.models.BlockStorageSnapshotInstanceDetailResponse;
import com.fincloud.server.models.BlockStorageSnapshotInstanceListResponse;
import com.fincloud.server.models.BlockStorageSnapshotInstanceResponse;
import com.fincloud.server.models.BlockStorageSnapshotInstanceStatusCode;
import com.fincloud.server.models.SortingOrder;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Snapshots.
 */
public interface Snapshots {
    /**
     * 블록스토리지 스냅샷 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageSnapshotInstanceListResponse object if successful.
     */
    BlockStorageSnapshotInstanceListResponse getList(String responseFormatType);

    /**
     * 블록스토리지 스냅샷 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<BlockStorageSnapshotInstanceListResponse> getListAsync(String responseFormatType, final ServiceCallback<BlockStorageSnapshotInstanceListResponse> serviceCallback);

    /**
     * 블록스토리지 스냅샷 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceListResponse object
     */
    Observable<BlockStorageSnapshotInstanceListResponse> getListAsync(String responseFormatType);

    /**
     * 블록스토리지 스냅샷 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceListResponse object
     */
    Observable<ServiceResponse<BlockStorageSnapshotInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType);
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
    BlockStorageSnapshotInstanceListResponse getList(String responseFormatType, String regionCode, String blockStorageSnapshotInstanceNoListN, String originalBlockStorageInstanceNoListN, BlockStorageSnapshotInstanceStatusCode blockStorageSnapshotInstanceStatusCode, String pageNo, String pageSize, String blockStorageSnapshotVolumeSize, Boolean isEncryptedOriginalBlockStorageVolume, String blockStorageSnapshotName, String sortedBy, SortingOrder sortingOrder);

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
    ServiceFuture<BlockStorageSnapshotInstanceListResponse> getListAsync(String responseFormatType, String regionCode, String blockStorageSnapshotInstanceNoListN, String originalBlockStorageInstanceNoListN, BlockStorageSnapshotInstanceStatusCode blockStorageSnapshotInstanceStatusCode, String pageNo, String pageSize, String blockStorageSnapshotVolumeSize, Boolean isEncryptedOriginalBlockStorageVolume, String blockStorageSnapshotName, String sortedBy, SortingOrder sortingOrder, final ServiceCallback<BlockStorageSnapshotInstanceListResponse> serviceCallback);

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
    Observable<BlockStorageSnapshotInstanceListResponse> getListAsync(String responseFormatType, String regionCode, String blockStorageSnapshotInstanceNoListN, String originalBlockStorageInstanceNoListN, BlockStorageSnapshotInstanceStatusCode blockStorageSnapshotInstanceStatusCode, String pageNo, String pageSize, String blockStorageSnapshotVolumeSize, Boolean isEncryptedOriginalBlockStorageVolume, String blockStorageSnapshotName, String sortedBy, SortingOrder sortingOrder);

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
    Observable<ServiceResponse<BlockStorageSnapshotInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String blockStorageSnapshotInstanceNoListN, String originalBlockStorageInstanceNoListN, BlockStorageSnapshotInstanceStatusCode blockStorageSnapshotInstanceStatusCode, String pageNo, String pageSize, String blockStorageSnapshotVolumeSize, Boolean isEncryptedOriginalBlockStorageVolume, String blockStorageSnapshotName, String sortedBy, SortingOrder sortingOrder);

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
    BlockStorageSnapshotInstanceDetailResponse getDetail(String responseFormatType, String blockStorageSnapshotInstanceNo);

    /**
     * 블록스토리지 스냅샷 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNo 블록스토리지 스냅샷 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<BlockStorageSnapshotInstanceDetailResponse> getDetailAsync(String responseFormatType, String blockStorageSnapshotInstanceNo, final ServiceCallback<BlockStorageSnapshotInstanceDetailResponse> serviceCallback);

    /**
     * 블록스토리지 스냅샷 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNo 블록스토리지 스냅샷 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceDetailResponse object
     */
    Observable<BlockStorageSnapshotInstanceDetailResponse> getDetailAsync(String responseFormatType, String blockStorageSnapshotInstanceNo);

    /**
     * 블록스토리지 스냅샷 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNo 블록스토리지 스냅샷 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceDetailResponse object
     */
    Observable<ServiceResponse<BlockStorageSnapshotInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String blockStorageSnapshotInstanceNo);
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
    BlockStorageSnapshotInstanceDetailResponse getDetail(String responseFormatType, String blockStorageSnapshotInstanceNo, String regionCode);

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
    ServiceFuture<BlockStorageSnapshotInstanceDetailResponse> getDetailAsync(String responseFormatType, String blockStorageSnapshotInstanceNo, String regionCode, final ServiceCallback<BlockStorageSnapshotInstanceDetailResponse> serviceCallback);

    /**
     * 블록스토리지 스냅샷 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNo 블록스토리지 스냅샷 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceDetailResponse object
     */
    Observable<BlockStorageSnapshotInstanceDetailResponse> getDetailAsync(String responseFormatType, String blockStorageSnapshotInstanceNo, String regionCode);

    /**
     * 블록스토리지 스냅샷 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNo 블록스토리지 스냅샷 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceDetailResponse object
     */
    Observable<ServiceResponse<BlockStorageSnapshotInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String blockStorageSnapshotInstanceNo, String regionCode);

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
    BlockStorageSnapshotInstanceResponse create(String responseFormatType, String originalBlockStorageInstanceNo);

    /**
     * 블록스토리지 스냅샷 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param originalBlockStorageInstanceNo 원본 블록스토리지 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<BlockStorageSnapshotInstanceResponse> createAsync(String responseFormatType, String originalBlockStorageInstanceNo, final ServiceCallback<BlockStorageSnapshotInstanceResponse> serviceCallback);

    /**
     * 블록스토리지 스냅샷 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param originalBlockStorageInstanceNo 원본 블록스토리지 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceResponse object
     */
    Observable<BlockStorageSnapshotInstanceResponse> createAsync(String responseFormatType, String originalBlockStorageInstanceNo);

    /**
     * 블록스토리지 스냅샷 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param originalBlockStorageInstanceNo 원본 블록스토리지 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceResponse object
     */
    Observable<ServiceResponse<BlockStorageSnapshotInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String originalBlockStorageInstanceNo);
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
    BlockStorageSnapshotInstanceResponse create(String responseFormatType, String originalBlockStorageInstanceNo, String regionCode, String blockStorageSnapshotName, String blockStorageSnapshotDescription);

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
    ServiceFuture<BlockStorageSnapshotInstanceResponse> createAsync(String responseFormatType, String originalBlockStorageInstanceNo, String regionCode, String blockStorageSnapshotName, String blockStorageSnapshotDescription, final ServiceCallback<BlockStorageSnapshotInstanceResponse> serviceCallback);

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
    Observable<BlockStorageSnapshotInstanceResponse> createAsync(String responseFormatType, String originalBlockStorageInstanceNo, String regionCode, String blockStorageSnapshotName, String blockStorageSnapshotDescription);

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
    Observable<ServiceResponse<BlockStorageSnapshotInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String originalBlockStorageInstanceNo, String regionCode, String blockStorageSnapshotName, String blockStorageSnapshotDescription);

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
    BlockStorageSnapshotInstanceResponse delete(String responseFormatType, String blockStorageSnapshotInstanceNoListN);

    /**
     * 블록스토리지 스냅샷 인스턴스 번호 리스트.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNoListN 블록스토리지 스냅샷 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<BlockStorageSnapshotInstanceResponse> deleteAsync(String responseFormatType, String blockStorageSnapshotInstanceNoListN, final ServiceCallback<BlockStorageSnapshotInstanceResponse> serviceCallback);

    /**
     * 블록스토리지 스냅샷 인스턴스 번호 리스트.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNoListN 블록스토리지 스냅샷 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceResponse object
     */
    Observable<BlockStorageSnapshotInstanceResponse> deleteAsync(String responseFormatType, String blockStorageSnapshotInstanceNoListN);

    /**
     * 블록스토리지 스냅샷 인스턴스 번호 리스트.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNoListN 블록스토리지 스냅샷 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceResponse object
     */
    Observable<ServiceResponse<BlockStorageSnapshotInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String blockStorageSnapshotInstanceNoListN);
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
    BlockStorageSnapshotInstanceResponse delete(String responseFormatType, String blockStorageSnapshotInstanceNoListN, String regionCode);

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
    ServiceFuture<BlockStorageSnapshotInstanceResponse> deleteAsync(String responseFormatType, String blockStorageSnapshotInstanceNoListN, String regionCode, final ServiceCallback<BlockStorageSnapshotInstanceResponse> serviceCallback);

    /**
     * 블록스토리지 스냅샷 인스턴스 번호 리스트.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNoListN 블록스토리지 스냅샷 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceResponse object
     */
    Observable<BlockStorageSnapshotInstanceResponse> deleteAsync(String responseFormatType, String blockStorageSnapshotInstanceNoListN, String regionCode);

    /**
     * 블록스토리지 스냅샷 인스턴스 번호 리스트.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageSnapshotInstanceNoListN 블록스토리지 스냅샷 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageSnapshotInstanceResponse object
     */
    Observable<ServiceResponse<BlockStorageSnapshotInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String blockStorageSnapshotInstanceNoListN, String regionCode);

}
