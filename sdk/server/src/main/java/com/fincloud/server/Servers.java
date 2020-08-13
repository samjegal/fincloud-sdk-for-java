/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server;

import com.fincloud.server.models.FeeSystemTypeCode;
import com.fincloud.server.models.ServerInstanceDetailResponse;
import com.fincloud.server.models.ServerInstanceListResponse;
import com.fincloud.server.models.ServerInstanceSpecResponse;
import com.fincloud.server.models.ServerInstancesResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Servers.
 */
public interface Servers {
    /**
     * 서버 인스턴스 리스트를 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstanceListResponse object if successful.
     */
    ServerInstanceListResponse getInstanceList();

    /**
     * 서버 인스턴스 리스트를 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerInstanceListResponse> getInstanceListAsync(final ServiceCallback<ServerInstanceListResponse> serviceCallback);

    /**
     * 서버 인스턴스 리스트를 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceListResponse object
     */
    Observable<ServerInstanceListResponse> getInstanceListAsync();

    /**
     * 서버 인스턴스 리스트를 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceListResponse object
     */
    Observable<ServiceResponse<ServerInstanceListResponse>> getInstanceListWithServiceResponseAsync();
    /**
     * 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param vpcNo VPC 번호
     * @param pageNo 페이지 번호
     * @param serverInstanceStatusCode 서버 인스턴스 상태 코드
     * @param baseBlockStorageDiskTypeCode 기본 블록스토리지 디스크 유형 코드
     * @param baseBlockStorageDiskDetailTypeCode 기본 블록스토리지 디스크 상세 유형 코드
     * @param serverName 서버 이름
     * @param ip IP 주소
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서
     * @param placementGroupNoListN 물리 배치 그룹 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstanceListResponse object if successful.
     */
    ServerInstanceListResponse getInstanceList(String responseFormatType, String regionCode, String serverInstanceNoListN, String vpcNo, String pageNo, String serverInstanceStatusCode, String baseBlockStorageDiskTypeCode, String baseBlockStorageDiskDetailTypeCode, String serverName, String ip, String sortedBy, String sortingOrder, String placementGroupNoListN);

    /**
     * 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param vpcNo VPC 번호
     * @param pageNo 페이지 번호
     * @param serverInstanceStatusCode 서버 인스턴스 상태 코드
     * @param baseBlockStorageDiskTypeCode 기본 블록스토리지 디스크 유형 코드
     * @param baseBlockStorageDiskDetailTypeCode 기본 블록스토리지 디스크 상세 유형 코드
     * @param serverName 서버 이름
     * @param ip IP 주소
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서
     * @param placementGroupNoListN 물리 배치 그룹 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerInstanceListResponse> getInstanceListAsync(String responseFormatType, String regionCode, String serverInstanceNoListN, String vpcNo, String pageNo, String serverInstanceStatusCode, String baseBlockStorageDiskTypeCode, String baseBlockStorageDiskDetailTypeCode, String serverName, String ip, String sortedBy, String sortingOrder, String placementGroupNoListN, final ServiceCallback<ServerInstanceListResponse> serviceCallback);

    /**
     * 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param vpcNo VPC 번호
     * @param pageNo 페이지 번호
     * @param serverInstanceStatusCode 서버 인스턴스 상태 코드
     * @param baseBlockStorageDiskTypeCode 기본 블록스토리지 디스크 유형 코드
     * @param baseBlockStorageDiskDetailTypeCode 기본 블록스토리지 디스크 상세 유형 코드
     * @param serverName 서버 이름
     * @param ip IP 주소
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서
     * @param placementGroupNoListN 물리 배치 그룹 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceListResponse object
     */
    Observable<ServerInstanceListResponse> getInstanceListAsync(String responseFormatType, String regionCode, String serverInstanceNoListN, String vpcNo, String pageNo, String serverInstanceStatusCode, String baseBlockStorageDiskTypeCode, String baseBlockStorageDiskDetailTypeCode, String serverName, String ip, String sortedBy, String sortingOrder, String placementGroupNoListN);

    /**
     * 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param vpcNo VPC 번호
     * @param pageNo 페이지 번호
     * @param serverInstanceStatusCode 서버 인스턴스 상태 코드
     * @param baseBlockStorageDiskTypeCode 기본 블록스토리지 디스크 유형 코드
     * @param baseBlockStorageDiskDetailTypeCode 기본 블록스토리지 디스크 상세 유형 코드
     * @param serverName 서버 이름
     * @param ip IP 주소
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서
     * @param placementGroupNoListN 물리 배치 그룹 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceListResponse object
     */
    Observable<ServiceResponse<ServerInstanceListResponse>> getInstanceListWithServiceResponseAsync(String responseFormatType, String regionCode, String serverInstanceNoListN, String vpcNo, String pageNo, String serverInstanceStatusCode, String baseBlockStorageDiskTypeCode, String baseBlockStorageDiskDetailTypeCode, String serverName, String ip, String sortedBy, String sortingOrder, String placementGroupNoListN);

    /**
     * 서버 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstanceDetailResponse object if successful.
     */
    ServerInstanceDetailResponse getDetail(String responseFormatType, String serverInstanceNo);

    /**
     * 서버 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerInstanceDetailResponse> getDetailAsync(String responseFormatType, String serverInstanceNo, final ServiceCallback<ServerInstanceDetailResponse> serviceCallback);

    /**
     * 서버 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceDetailResponse object
     */
    Observable<ServerInstanceDetailResponse> getDetailAsync(String responseFormatType, String serverInstanceNo);

    /**
     * 서버 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceDetailResponse object
     */
    Observable<ServiceResponse<ServerInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String serverInstanceNo);
    /**
     * 서버 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstanceDetailResponse object if successful.
     */
    ServerInstanceDetailResponse getDetail(String responseFormatType, String serverInstanceNo, String regionCode);

    /**
     * 서버 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerInstanceDetailResponse> getDetailAsync(String responseFormatType, String serverInstanceNo, String regionCode, final ServiceCallback<ServerInstanceDetailResponse> serviceCallback);

    /**
     * 서버 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceDetailResponse object
     */
    Observable<ServerInstanceDetailResponse> getDetailAsync(String responseFormatType, String serverInstanceNo, String regionCode);

    /**
     * 서버 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceDetailResponse object
     */
    Observable<ServiceResponse<ServerInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String serverInstanceNo, String regionCode);

    /**
     * 서버 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceListNnetworkInterfaceOrder 네트워크 인터페이스 순서
     * @param networkInterfaceListNaccessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    ServerInstancesResponse create(String responseFormatType, String vpcNo, String subnetNo, String networkInterfaceListNnetworkInterfaceOrder, String networkInterfaceListNaccessControlGroupNoListN);

    /**
     * 서버 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceListNnetworkInterfaceOrder 네트워크 인터페이스 순서
     * @param networkInterfaceListNaccessControlGroupNoListN ACG 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerInstancesResponse> createAsync(String responseFormatType, String vpcNo, String subnetNo, String networkInterfaceListNnetworkInterfaceOrder, String networkInterfaceListNaccessControlGroupNoListN, final ServiceCallback<ServerInstancesResponse> serviceCallback);

    /**
     * 서버 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceListNnetworkInterfaceOrder 네트워크 인터페이스 순서
     * @param networkInterfaceListNaccessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServerInstancesResponse> createAsync(String responseFormatType, String vpcNo, String subnetNo, String networkInterfaceListNnetworkInterfaceOrder, String networkInterfaceListNaccessControlGroupNoListN);

    /**
     * 서버 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceListNnetworkInterfaceOrder 네트워크 인터페이스 순서
     * @param networkInterfaceListNaccessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServiceResponse<ServerInstancesResponse>> createWithServiceResponseAsync(String responseFormatType, String vpcNo, String subnetNo, String networkInterfaceListNnetworkInterfaceOrder, String networkInterfaceListNaccessControlGroupNoListN);
    /**
     * 서버 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceListNnetworkInterfaceOrder 네트워크 인터페이스 순서
     * @param networkInterfaceListNaccessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param serverProductCode 서버 상품 코드
     * @param isEncryptedBaseBlockStorageVolume 기본 블록스토리지 볼륨 암호화 여부
     * @param feeSystemTypeCode 요금제 유형 코드. Possible values include: 'MTRAT', 'FXSUM'
     * @param serverCreateCount 서버 생성 개수
     * @param serverCreateStartNo 서버 생성 시작 번호
     * @param serverName 서버 이름
     * @param networkInterfaceListNnetworkInterfaceNo 네트워크 인터페이스 번호
     * @param networkInterfaceListNsubnetNo 서브넷 번호
     * @param networkInterfaceListNip IP 주소
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param isProtectServerTermination 반납 보호 여부
     * @param serverDescription 서버 설명
     * @param initScriptNo 초기화 스크립트 번호
     * @param loginKeyName 로그인 키 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    ServerInstancesResponse create(String responseFormatType, String vpcNo, String subnetNo, String networkInterfaceListNnetworkInterfaceOrder, String networkInterfaceListNaccessControlGroupNoListN, String regionCode, String memberServerImageInstanceNo, String serverImageProductCode, String serverProductCode, Boolean isEncryptedBaseBlockStorageVolume, FeeSystemTypeCode feeSystemTypeCode, String serverCreateCount, String serverCreateStartNo, String serverName, String networkInterfaceListNnetworkInterfaceNo, String networkInterfaceListNsubnetNo, String networkInterfaceListNip, String placementGroupNo, Boolean isProtectServerTermination, String serverDescription, String initScriptNo, String loginKeyName);

    /**
     * 서버 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceListNnetworkInterfaceOrder 네트워크 인터페이스 순서
     * @param networkInterfaceListNaccessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param serverProductCode 서버 상품 코드
     * @param isEncryptedBaseBlockStorageVolume 기본 블록스토리지 볼륨 암호화 여부
     * @param feeSystemTypeCode 요금제 유형 코드. Possible values include: 'MTRAT', 'FXSUM'
     * @param serverCreateCount 서버 생성 개수
     * @param serverCreateStartNo 서버 생성 시작 번호
     * @param serverName 서버 이름
     * @param networkInterfaceListNnetworkInterfaceNo 네트워크 인터페이스 번호
     * @param networkInterfaceListNsubnetNo 서브넷 번호
     * @param networkInterfaceListNip IP 주소
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param isProtectServerTermination 반납 보호 여부
     * @param serverDescription 서버 설명
     * @param initScriptNo 초기화 스크립트 번호
     * @param loginKeyName 로그인 키 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerInstancesResponse> createAsync(String responseFormatType, String vpcNo, String subnetNo, String networkInterfaceListNnetworkInterfaceOrder, String networkInterfaceListNaccessControlGroupNoListN, String regionCode, String memberServerImageInstanceNo, String serverImageProductCode, String serverProductCode, Boolean isEncryptedBaseBlockStorageVolume, FeeSystemTypeCode feeSystemTypeCode, String serverCreateCount, String serverCreateStartNo, String serverName, String networkInterfaceListNnetworkInterfaceNo, String networkInterfaceListNsubnetNo, String networkInterfaceListNip, String placementGroupNo, Boolean isProtectServerTermination, String serverDescription, String initScriptNo, String loginKeyName, final ServiceCallback<ServerInstancesResponse> serviceCallback);

    /**
     * 서버 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceListNnetworkInterfaceOrder 네트워크 인터페이스 순서
     * @param networkInterfaceListNaccessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param serverProductCode 서버 상품 코드
     * @param isEncryptedBaseBlockStorageVolume 기본 블록스토리지 볼륨 암호화 여부
     * @param feeSystemTypeCode 요금제 유형 코드. Possible values include: 'MTRAT', 'FXSUM'
     * @param serverCreateCount 서버 생성 개수
     * @param serverCreateStartNo 서버 생성 시작 번호
     * @param serverName 서버 이름
     * @param networkInterfaceListNnetworkInterfaceNo 네트워크 인터페이스 번호
     * @param networkInterfaceListNsubnetNo 서브넷 번호
     * @param networkInterfaceListNip IP 주소
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param isProtectServerTermination 반납 보호 여부
     * @param serverDescription 서버 설명
     * @param initScriptNo 초기화 스크립트 번호
     * @param loginKeyName 로그인 키 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServerInstancesResponse> createAsync(String responseFormatType, String vpcNo, String subnetNo, String networkInterfaceListNnetworkInterfaceOrder, String networkInterfaceListNaccessControlGroupNoListN, String regionCode, String memberServerImageInstanceNo, String serverImageProductCode, String serverProductCode, Boolean isEncryptedBaseBlockStorageVolume, FeeSystemTypeCode feeSystemTypeCode, String serverCreateCount, String serverCreateStartNo, String serverName, String networkInterfaceListNnetworkInterfaceNo, String networkInterfaceListNsubnetNo, String networkInterfaceListNip, String placementGroupNo, Boolean isProtectServerTermination, String serverDescription, String initScriptNo, String loginKeyName);

    /**
     * 서버 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceListNnetworkInterfaceOrder 네트워크 인터페이스 순서
     * @param networkInterfaceListNaccessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param serverProductCode 서버 상품 코드
     * @param isEncryptedBaseBlockStorageVolume 기본 블록스토리지 볼륨 암호화 여부
     * @param feeSystemTypeCode 요금제 유형 코드. Possible values include: 'MTRAT', 'FXSUM'
     * @param serverCreateCount 서버 생성 개수
     * @param serverCreateStartNo 서버 생성 시작 번호
     * @param serverName 서버 이름
     * @param networkInterfaceListNnetworkInterfaceNo 네트워크 인터페이스 번호
     * @param networkInterfaceListNsubnetNo 서브넷 번호
     * @param networkInterfaceListNip IP 주소
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param isProtectServerTermination 반납 보호 여부
     * @param serverDescription 서버 설명
     * @param initScriptNo 초기화 스크립트 번호
     * @param loginKeyName 로그인 키 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServiceResponse<ServerInstancesResponse>> createWithServiceResponseAsync(String responseFormatType, String vpcNo, String subnetNo, String networkInterfaceListNnetworkInterfaceOrder, String networkInterfaceListNaccessControlGroupNoListN, String regionCode, String memberServerImageInstanceNo, String serverImageProductCode, String serverProductCode, Boolean isEncryptedBaseBlockStorageVolume, FeeSystemTypeCode feeSystemTypeCode, String serverCreateCount, String serverCreateStartNo, String serverName, String networkInterfaceListNnetworkInterfaceNo, String networkInterfaceListNsubnetNo, String networkInterfaceListNip, String placementGroupNo, Boolean isProtectServerTermination, String serverDescription, String initScriptNo, String loginKeyName);

    /**
     * 서버 인스턴스를 시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    ServerInstancesResponse start(String responseFormatType, String serverInstanceNoListN);

    /**
     * 서버 인스턴스를 시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerInstancesResponse> startAsync(String responseFormatType, String serverInstanceNoListN, final ServiceCallback<ServerInstancesResponse> serviceCallback);

    /**
     * 서버 인스턴스를 시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServerInstancesResponse> startAsync(String responseFormatType, String serverInstanceNoListN);

    /**
     * 서버 인스턴스를 시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServiceResponse<ServerInstancesResponse>> startWithServiceResponseAsync(String responseFormatType, String serverInstanceNoListN);
    /**
     * 서버 인스턴스를 시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    ServerInstancesResponse start(String responseFormatType, String serverInstanceNoListN, String regionCode);

    /**
     * 서버 인스턴스를 시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerInstancesResponse> startAsync(String responseFormatType, String serverInstanceNoListN, String regionCode, final ServiceCallback<ServerInstancesResponse> serviceCallback);

    /**
     * 서버 인스턴스를 시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServerInstancesResponse> startAsync(String responseFormatType, String serverInstanceNoListN, String regionCode);

    /**
     * 서버 인스턴스를 시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServiceResponse<ServerInstancesResponse>> startWithServiceResponseAsync(String responseFormatType, String serverInstanceNoListN, String regionCode);

    /**
     * 서버 인스턴스를 종료.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    ServerInstancesResponse stop(String responseFormatType, String serverInstanceNoListN);

    /**
     * 서버 인스턴스를 종료.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerInstancesResponse> stopAsync(String responseFormatType, String serverInstanceNoListN, final ServiceCallback<ServerInstancesResponse> serviceCallback);

    /**
     * 서버 인스턴스를 종료.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServerInstancesResponse> stopAsync(String responseFormatType, String serverInstanceNoListN);

    /**
     * 서버 인스턴스를 종료.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServiceResponse<ServerInstancesResponse>> stopWithServiceResponseAsync(String responseFormatType, String serverInstanceNoListN);
    /**
     * 서버 인스턴스를 종료.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    ServerInstancesResponse stop(String responseFormatType, String serverInstanceNoListN, String regionCode);

    /**
     * 서버 인스턴스를 종료.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerInstancesResponse> stopAsync(String responseFormatType, String serverInstanceNoListN, String regionCode, final ServiceCallback<ServerInstancesResponse> serviceCallback);

    /**
     * 서버 인스턴스를 종료.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServerInstancesResponse> stopAsync(String responseFormatType, String serverInstanceNoListN, String regionCode);

    /**
     * 서버 인스턴스를 종료.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServiceResponse<ServerInstancesResponse>> stopWithServiceResponseAsync(String responseFormatType, String serverInstanceNoListN, String regionCode);

    /**
     * 서버 인스턴스를 재시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    ServerInstancesResponse reboot(String responseFormatType, String serverInstanceNoListN);

    /**
     * 서버 인스턴스를 재시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerInstancesResponse> rebootAsync(String responseFormatType, String serverInstanceNoListN, final ServiceCallback<ServerInstancesResponse> serviceCallback);

    /**
     * 서버 인스턴스를 재시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServerInstancesResponse> rebootAsync(String responseFormatType, String serverInstanceNoListN);

    /**
     * 서버 인스턴스를 재시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServiceResponse<ServerInstancesResponse>> rebootWithServiceResponseAsync(String responseFormatType, String serverInstanceNoListN);
    /**
     * 서버 인스턴스를 재시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    ServerInstancesResponse reboot(String responseFormatType, String serverInstanceNoListN, String regionCode);

    /**
     * 서버 인스턴스를 재시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerInstancesResponse> rebootAsync(String responseFormatType, String serverInstanceNoListN, String regionCode, final ServiceCallback<ServerInstancesResponse> serviceCallback);

    /**
     * 서버 인스턴스를 재시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServerInstancesResponse> rebootAsync(String responseFormatType, String serverInstanceNoListN, String regionCode);

    /**
     * 서버 인스턴스를 재시작.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServiceResponse<ServerInstancesResponse>> rebootWithServiceResponseAsync(String responseFormatType, String serverInstanceNoListN, String regionCode);

    /**
     * 서버 인스턴스를 반납.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    ServerInstancesResponse terminate(String responseFormatType, String serverInstanceNoListN);

    /**
     * 서버 인스턴스를 반납.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerInstancesResponse> terminateAsync(String responseFormatType, String serverInstanceNoListN, final ServiceCallback<ServerInstancesResponse> serviceCallback);

    /**
     * 서버 인스턴스를 반납.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServerInstancesResponse> terminateAsync(String responseFormatType, String serverInstanceNoListN);

    /**
     * 서버 인스턴스를 반납.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServiceResponse<ServerInstancesResponse>> terminateWithServiceResponseAsync(String responseFormatType, String serverInstanceNoListN);
    /**
     * 서버 인스턴스를 반납.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstancesResponse object if successful.
     */
    ServerInstancesResponse terminate(String responseFormatType, String serverInstanceNoListN, String regionCode);

    /**
     * 서버 인스턴스를 반납.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerInstancesResponse> terminateAsync(String responseFormatType, String serverInstanceNoListN, String regionCode, final ServiceCallback<ServerInstancesResponse> serviceCallback);

    /**
     * 서버 인스턴스를 반납.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServerInstancesResponse> terminateAsync(String responseFormatType, String serverInstanceNoListN, String regionCode);

    /**
     * 서버 인스턴스를 반납.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNoListN 서버 인스턴스 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstancesResponse object
     */
    Observable<ServiceResponse<ServerInstancesResponse>> terminateWithServiceResponseAsync(String responseFormatType, String serverInstanceNoListN, String regionCode);

    /**
     * 서버 인스턴스 스펙을 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serverProductCode 서버 상품 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstanceSpecResponse object if successful.
     */
    ServerInstanceSpecResponse changeSpec(String responseFormatType, String serverInstanceNo, String serverProductCode);

    /**
     * 서버 인스턴스 스펙을 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serverProductCode 서버 상품 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerInstanceSpecResponse> changeSpecAsync(String responseFormatType, String serverInstanceNo, String serverProductCode, final ServiceCallback<ServerInstanceSpecResponse> serviceCallback);

    /**
     * 서버 인스턴스 스펙을 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serverProductCode 서버 상품 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceSpecResponse object
     */
    Observable<ServerInstanceSpecResponse> changeSpecAsync(String responseFormatType, String serverInstanceNo, String serverProductCode);

    /**
     * 서버 인스턴스 스펙을 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serverProductCode 서버 상품 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceSpecResponse object
     */
    Observable<ServiceResponse<ServerInstanceSpecResponse>> changeSpecWithServiceResponseAsync(String responseFormatType, String serverInstanceNo, String serverProductCode);
    /**
     * 서버 인스턴스 스펙을 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serverProductCode 서버 상품 코드
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerInstanceSpecResponse object if successful.
     */
    ServerInstanceSpecResponse changeSpec(String responseFormatType, String serverInstanceNo, String serverProductCode, String regionCode);

    /**
     * 서버 인스턴스 스펙을 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serverProductCode 서버 상품 코드
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerInstanceSpecResponse> changeSpecAsync(String responseFormatType, String serverInstanceNo, String serverProductCode, String regionCode, final ServiceCallback<ServerInstanceSpecResponse> serviceCallback);

    /**
     * 서버 인스턴스 스펙을 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serverProductCode 서버 상품 코드
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceSpecResponse object
     */
    Observable<ServerInstanceSpecResponse> changeSpecAsync(String responseFormatType, String serverInstanceNo, String serverProductCode, String regionCode);

    /**
     * 서버 인스턴스 스펙을 변경.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serverProductCode 서버 상품 코드
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerInstanceSpecResponse object
     */
    Observable<ServiceResponse<ServerInstanceSpecResponse>> changeSpecWithServiceResponseAsync(String responseFormatType, String serverInstanceNo, String serverProductCode, String regionCode);

}
