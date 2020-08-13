/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server;

import com.fincloud.server.models.BlockStorageDiskDetailTypeCode;
import com.fincloud.server.models.BlockStorageDiskTypeCode;
import com.fincloud.server.models.BlockStorageInstanceDetailResponse;
import com.fincloud.server.models.BlockStorageInstanceListResponse;
import com.fincloud.server.models.BlockStorageInstanceResponse;
import com.fincloud.server.models.BlockStorageInstanceStatusCode;
import com.fincloud.server.models.BlockStorageTypeCode;
import com.fincloud.server.models.BlockStorageVolumeSizeResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BlockStorages.
 */
public interface BlockStorages {
    /**
     * 블록스토리지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlockStorageInstanceListResponse object if successful.
     */
    BlockStorageInstanceListResponse getList(String responseFormatType);

    /**
     * 블록스토리지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<BlockStorageInstanceListResponse> getListAsync(String responseFormatType, final ServiceCallback<BlockStorageInstanceListResponse> serviceCallback);

    /**
     * 블록스토리지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceListResponse object
     */
    Observable<BlockStorageInstanceListResponse> getListAsync(String responseFormatType);

    /**
     * 블록스토리지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceListResponse object
     */
    Observable<ServiceResponse<BlockStorageInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType);
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
    BlockStorageInstanceListResponse getList(String responseFormatType, String regionCode, String serverInstanceNo, BlockStorageTypeCode blockStorageTypeCodeListN, BlockStorageInstanceStatusCode blockStorageInstanceStatusCode, String pageNo, String pageSize, String blockStorageSize, String blockStorageInstanceNoListN, String blockStorageName, String serverName, String connectionInfo, BlockStorageDiskTypeCode blockStorageDiskTypeCode, BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode, String zoneCode);

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
    ServiceFuture<BlockStorageInstanceListResponse> getListAsync(String responseFormatType, String regionCode, String serverInstanceNo, BlockStorageTypeCode blockStorageTypeCodeListN, BlockStorageInstanceStatusCode blockStorageInstanceStatusCode, String pageNo, String pageSize, String blockStorageSize, String blockStorageInstanceNoListN, String blockStorageName, String serverName, String connectionInfo, BlockStorageDiskTypeCode blockStorageDiskTypeCode, BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode, String zoneCode, final ServiceCallback<BlockStorageInstanceListResponse> serviceCallback);

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
    Observable<BlockStorageInstanceListResponse> getListAsync(String responseFormatType, String regionCode, String serverInstanceNo, BlockStorageTypeCode blockStorageTypeCodeListN, BlockStorageInstanceStatusCode blockStorageInstanceStatusCode, String pageNo, String pageSize, String blockStorageSize, String blockStorageInstanceNoListN, String blockStorageName, String serverName, String connectionInfo, BlockStorageDiskTypeCode blockStorageDiskTypeCode, BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode, String zoneCode);

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
    Observable<ServiceResponse<BlockStorageInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String serverInstanceNo, BlockStorageTypeCode blockStorageTypeCodeListN, BlockStorageInstanceStatusCode blockStorageInstanceStatusCode, String pageNo, String pageSize, String blockStorageSize, String blockStorageInstanceNoListN, String blockStorageName, String serverName, String connectionInfo, BlockStorageDiskTypeCode blockStorageDiskTypeCode, BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode, String zoneCode);

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
    BlockStorageInstanceDetailResponse getDetail(String responseFormatType, String blockStorageInstanceNo);

    /**
     * 블록스토리지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<BlockStorageInstanceDetailResponse> getDetailAsync(String responseFormatType, String blockStorageInstanceNo, final ServiceCallback<BlockStorageInstanceDetailResponse> serviceCallback);

    /**
     * 블록스토리지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceDetailResponse object
     */
    Observable<BlockStorageInstanceDetailResponse> getDetailAsync(String responseFormatType, String blockStorageInstanceNo);

    /**
     * 블록스토리지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceDetailResponse object
     */
    Observable<ServiceResponse<BlockStorageInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNo);
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
    BlockStorageInstanceDetailResponse getDetail(String responseFormatType, String blockStorageInstanceNo, String regionCode);

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
    ServiceFuture<BlockStorageInstanceDetailResponse> getDetailAsync(String responseFormatType, String blockStorageInstanceNo, String regionCode, final ServiceCallback<BlockStorageInstanceDetailResponse> serviceCallback);

    /**
     * 블록스토리지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceDetailResponse object
     */
    Observable<BlockStorageInstanceDetailResponse> getDetailAsync(String responseFormatType, String blockStorageInstanceNo, String regionCode);

    /**
     * 블록스토리지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceDetailResponse object
     */
    Observable<ServiceResponse<BlockStorageInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNo, String regionCode);

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
    BlockStorageInstanceResponse create(String responseFormatType, String serverInstanceNo);

    /**
     * 블록스토리지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<BlockStorageInstanceResponse> createAsync(String responseFormatType, String serverInstanceNo, final ServiceCallback<BlockStorageInstanceResponse> serviceCallback);

    /**
     * 블록스토리지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    Observable<BlockStorageInstanceResponse> createAsync(String responseFormatType, String serverInstanceNo);

    /**
     * 블록스토리지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    Observable<ServiceResponse<BlockStorageInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String serverInstanceNo);
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
    BlockStorageInstanceResponse create(String responseFormatType, String serverInstanceNo, String regionCode, String zoneCode, String blockStorageName, BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode, String blockStorageSnapshotInstanceNo, String blockStorageSize, String blockStorageDescription);

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
    ServiceFuture<BlockStorageInstanceResponse> createAsync(String responseFormatType, String serverInstanceNo, String regionCode, String zoneCode, String blockStorageName, BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode, String blockStorageSnapshotInstanceNo, String blockStorageSize, String blockStorageDescription, final ServiceCallback<BlockStorageInstanceResponse> serviceCallback);

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
    Observable<BlockStorageInstanceResponse> createAsync(String responseFormatType, String serverInstanceNo, String regionCode, String zoneCode, String blockStorageName, BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode, String blockStorageSnapshotInstanceNo, String blockStorageSize, String blockStorageDescription);

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
    Observable<ServiceResponse<BlockStorageInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String serverInstanceNo, String regionCode, String zoneCode, String blockStorageName, BlockStorageDiskDetailTypeCode blockStorageDiskDetailTypeCode, String blockStorageSnapshotInstanceNo, String blockStorageSize, String blockStorageDescription);

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
    BlockStorageInstanceResponse delete(String responseFormatType, String blockStorageInstanceNoListN);

    /**
     * 블록스토리지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<BlockStorageInstanceResponse> deleteAsync(String responseFormatType, String blockStorageInstanceNoListN, final ServiceCallback<BlockStorageInstanceResponse> serviceCallback);

    /**
     * 블록스토리지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    Observable<BlockStorageInstanceResponse> deleteAsync(String responseFormatType, String blockStorageInstanceNoListN);

    /**
     * 블록스토리지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    Observable<ServiceResponse<BlockStorageInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNoListN);
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
    BlockStorageInstanceResponse delete(String responseFormatType, String blockStorageInstanceNoListN, String regionCode);

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
    ServiceFuture<BlockStorageInstanceResponse> deleteAsync(String responseFormatType, String blockStorageInstanceNoListN, String regionCode, final ServiceCallback<BlockStorageInstanceResponse> serviceCallback);

    /**
     * 블록스토리지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    Observable<BlockStorageInstanceResponse> deleteAsync(String responseFormatType, String blockStorageInstanceNoListN, String regionCode);

    /**
     * 블록스토리지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    Observable<ServiceResponse<BlockStorageInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNoListN, String regionCode);

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
    BlockStorageInstanceResponse attach(String responseFormatType, String blockStorageInstanceNo, String serverInstanceNo);

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
    ServiceFuture<BlockStorageInstanceResponse> attachAsync(String responseFormatType, String blockStorageInstanceNo, String serverInstanceNo, final ServiceCallback<BlockStorageInstanceResponse> serviceCallback);

    /**
     * 블록스토리지 인스턴스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    Observable<BlockStorageInstanceResponse> attachAsync(String responseFormatType, String blockStorageInstanceNo, String serverInstanceNo);

    /**
     * 블록스토리지 인스턴스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    Observable<ServiceResponse<BlockStorageInstanceResponse>> attachWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNo, String serverInstanceNo);
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
    BlockStorageInstanceResponse attach(String responseFormatType, String blockStorageInstanceNo, String serverInstanceNo, String regionCode);

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
    ServiceFuture<BlockStorageInstanceResponse> attachAsync(String responseFormatType, String blockStorageInstanceNo, String serverInstanceNo, String regionCode, final ServiceCallback<BlockStorageInstanceResponse> serviceCallback);

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
    Observable<BlockStorageInstanceResponse> attachAsync(String responseFormatType, String blockStorageInstanceNo, String serverInstanceNo, String regionCode);

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
    Observable<ServiceResponse<BlockStorageInstanceResponse>> attachWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNo, String serverInstanceNo, String regionCode);

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
    BlockStorageInstanceResponse detach(String responseFormatType, String blockStorageInstanceNoListN);

    /**
     * 블록스토리지 인스턴스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<BlockStorageInstanceResponse> detachAsync(String responseFormatType, String blockStorageInstanceNoListN, final ServiceCallback<BlockStorageInstanceResponse> serviceCallback);

    /**
     * 블록스토리지 인스턴스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    Observable<BlockStorageInstanceResponse> detachAsync(String responseFormatType, String blockStorageInstanceNoListN);

    /**
     * 블록스토리지 인스턴스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    Observable<ServiceResponse<BlockStorageInstanceResponse>> detachWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNoListN);
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
    BlockStorageInstanceResponse detach(String responseFormatType, String blockStorageInstanceNoListN, String regionCode);

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
    ServiceFuture<BlockStorageInstanceResponse> detachAsync(String responseFormatType, String blockStorageInstanceNoListN, String regionCode, final ServiceCallback<BlockStorageInstanceResponse> serviceCallback);

    /**
     * 블록스토리지 인스턴스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    Observable<BlockStorageInstanceResponse> detachAsync(String responseFormatType, String blockStorageInstanceNoListN, String regionCode);

    /**
     * 블록스토리지 인스턴스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNoListN 블록스토리지 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageInstanceResponse object
     */
    Observable<ServiceResponse<BlockStorageInstanceResponse>> detachWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNoListN, String regionCode);

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
    BlockStorageVolumeSizeResponse changeVolumeSize(String responseFormatType, String blockStorageInstanceNo, String blockStorageSize);

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
    ServiceFuture<BlockStorageVolumeSizeResponse> changeVolumeSizeAsync(String responseFormatType, String blockStorageInstanceNo, String blockStorageSize, final ServiceCallback<BlockStorageVolumeSizeResponse> serviceCallback);

    /**
     * 블록스토리지 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param blockStorageSize 블록스토리지 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageVolumeSizeResponse object
     */
    Observable<BlockStorageVolumeSizeResponse> changeVolumeSizeAsync(String responseFormatType, String blockStorageInstanceNo, String blockStorageSize);

    /**
     * 블록스토리지 볼륨 사이즈를 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param blockStorageInstanceNo 블록스토리지 인스턴스 번호
     * @param blockStorageSize 블록스토리지 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlockStorageVolumeSizeResponse object
     */
    Observable<ServiceResponse<BlockStorageVolumeSizeResponse>> changeVolumeSizeWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNo, String blockStorageSize);
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
    BlockStorageVolumeSizeResponse changeVolumeSize(String responseFormatType, String blockStorageInstanceNo, String blockStorageSize, String regionCode);

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
    ServiceFuture<BlockStorageVolumeSizeResponse> changeVolumeSizeAsync(String responseFormatType, String blockStorageInstanceNo, String blockStorageSize, String regionCode, final ServiceCallback<BlockStorageVolumeSizeResponse> serviceCallback);

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
    Observable<BlockStorageVolumeSizeResponse> changeVolumeSizeAsync(String responseFormatType, String blockStorageInstanceNo, String blockStorageSize, String regionCode);

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
    Observable<ServiceResponse<BlockStorageVolumeSizeResponse>> changeVolumeSizeWithServiceResponseAsync(String responseFormatType, String blockStorageInstanceNo, String blockStorageSize, String regionCode);

}
