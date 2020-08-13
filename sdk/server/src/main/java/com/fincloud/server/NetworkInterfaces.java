/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server;

import com.fincloud.server.models.NetworkInterfaceAccessControlGroupResponse;
import com.fincloud.server.models.NetworkInterfaceDetailResponse;
import com.fincloud.server.models.NetworkInterfaceListResponse;
import com.fincloud.server.models.NetworkInterfaceResponse;
import com.fincloud.server.models.NetworkInterfaceStatusCode;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in NetworkInterfaces.
 */
public interface NetworkInterfaces {
    /**
     * 네트워크 인터페이스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceListResponse object if successful.
     */
    NetworkInterfaceListResponse getList(String responseFormatType);

    /**
     * 네트워크 인터페이스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkInterfaceListResponse> getListAsync(String responseFormatType, final ServiceCallback<NetworkInterfaceListResponse> serviceCallback);

    /**
     * 네트워크 인터페이스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceListResponse object
     */
    Observable<NetworkInterfaceListResponse> getListAsync(String responseFormatType);

    /**
     * 네트워크 인터페이스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceListResponse object
     */
    Observable<ServiceResponse<NetworkInterfaceListResponse>> getListWithServiceResponseAsync(String responseFormatType);
    /**
     * 네트워크 인터페이스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkInterfaceNoListN 네트워크 인터페이스 번호 리스트
     * @param ip IP 주소
     * @param networkInterfaceName 네트워크 인터페이스 이름
     * @param serverInstanceName 서버 인스턴스 이름
     * @param subnetName 서브넷 이름
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param networkInterfaceStatusCode 네트워크 인터페이스 상태 코드. Possible values include: 'SET', 'UNSET', 'USED', 'NOTUSED'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceListResponse object if successful.
     */
    NetworkInterfaceListResponse getList(String responseFormatType, String regionCode, String networkInterfaceNoListN, String ip, String networkInterfaceName, String serverInstanceName, String subnetName, String pageNo, String pageSize, NetworkInterfaceStatusCode networkInterfaceStatusCode);

    /**
     * 네트워크 인터페이스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkInterfaceNoListN 네트워크 인터페이스 번호 리스트
     * @param ip IP 주소
     * @param networkInterfaceName 네트워크 인터페이스 이름
     * @param serverInstanceName 서버 인스턴스 이름
     * @param subnetName 서브넷 이름
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param networkInterfaceStatusCode 네트워크 인터페이스 상태 코드. Possible values include: 'SET', 'UNSET', 'USED', 'NOTUSED'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkInterfaceListResponse> getListAsync(String responseFormatType, String regionCode, String networkInterfaceNoListN, String ip, String networkInterfaceName, String serverInstanceName, String subnetName, String pageNo, String pageSize, NetworkInterfaceStatusCode networkInterfaceStatusCode, final ServiceCallback<NetworkInterfaceListResponse> serviceCallback);

    /**
     * 네트워크 인터페이스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkInterfaceNoListN 네트워크 인터페이스 번호 리스트
     * @param ip IP 주소
     * @param networkInterfaceName 네트워크 인터페이스 이름
     * @param serverInstanceName 서버 인스턴스 이름
     * @param subnetName 서브넷 이름
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param networkInterfaceStatusCode 네트워크 인터페이스 상태 코드. Possible values include: 'SET', 'UNSET', 'USED', 'NOTUSED'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceListResponse object
     */
    Observable<NetworkInterfaceListResponse> getListAsync(String responseFormatType, String regionCode, String networkInterfaceNoListN, String ip, String networkInterfaceName, String serverInstanceName, String subnetName, String pageNo, String pageSize, NetworkInterfaceStatusCode networkInterfaceStatusCode);

    /**
     * 네트워크 인터페이스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkInterfaceNoListN 네트워크 인터페이스 번호 리스트
     * @param ip IP 주소
     * @param networkInterfaceName 네트워크 인터페이스 이름
     * @param serverInstanceName 서버 인스턴스 이름
     * @param subnetName 서브넷 이름
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param networkInterfaceStatusCode 네트워크 인터페이스 상태 코드. Possible values include: 'SET', 'UNSET', 'USED', 'NOTUSED'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceListResponse object
     */
    Observable<ServiceResponse<NetworkInterfaceListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String networkInterfaceNoListN, String ip, String networkInterfaceName, String serverInstanceName, String subnetName, String pageNo, String pageSize, NetworkInterfaceStatusCode networkInterfaceStatusCode);

    /**
     * 네트워크 인터페이스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceDetailResponse object if successful.
     */
    NetworkInterfaceDetailResponse getDetail(String responseFormatType, String networkInterfaceNo);

    /**
     * 네트워크 인터페이스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkInterfaceDetailResponse> getDetailAsync(String responseFormatType, String networkInterfaceNo, final ServiceCallback<NetworkInterfaceDetailResponse> serviceCallback);

    /**
     * 네트워크 인터페이스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceDetailResponse object
     */
    Observable<NetworkInterfaceDetailResponse> getDetailAsync(String responseFormatType, String networkInterfaceNo);

    /**
     * 네트워크 인터페이스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceDetailResponse object
     */
    Observable<ServiceResponse<NetworkInterfaceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String networkInterfaceNo);
    /**
     * 네트워크 인터페이스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceDetailResponse object if successful.
     */
    NetworkInterfaceDetailResponse getDetail(String responseFormatType, String networkInterfaceNo, String regionCode);

    /**
     * 네트워크 인터페이스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkInterfaceDetailResponse> getDetailAsync(String responseFormatType, String networkInterfaceNo, String regionCode, final ServiceCallback<NetworkInterfaceDetailResponse> serviceCallback);

    /**
     * 네트워크 인터페이스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceDetailResponse object
     */
    Observable<NetworkInterfaceDetailResponse> getDetailAsync(String responseFormatType, String networkInterfaceNo, String regionCode);

    /**
     * 네트워크 인터페이스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceDetailResponse object
     */
    Observable<ServiceResponse<NetworkInterfaceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String networkInterfaceNo, String regionCode);

    /**
     * 네트워크 인터페이스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceResponse object if successful.
     */
    NetworkInterfaceResponse create(String responseFormatType);

    /**
     * 네트워크 인터페이스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkInterfaceResponse> createAsync(String responseFormatType, final ServiceCallback<NetworkInterfaceResponse> serviceCallback);

    /**
     * 네트워크 인터페이스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    Observable<NetworkInterfaceResponse> createAsync(String responseFormatType);

    /**
     * 네트워크 인터페이스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    Observable<ServiceResponse<NetworkInterfaceResponse>> createWithServiceResponseAsync(String responseFormatType);
    /**
     * 네트워크 인터페이스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceName 네트워크 인터페이스 이름
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param ip IP 주소
     * @param networkInterfaceDescription 네트워크 인터페이스 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceResponse object if successful.
     */
    NetworkInterfaceResponse create(String responseFormatType, String regionCode, String vpcNo, String subnetNo, String networkInterfaceName, String accessControlGroupNoListN, String serverInstanceNo, String ip, String networkInterfaceDescription);

    /**
     * 네트워크 인터페이스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceName 네트워크 인터페이스 이름
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param ip IP 주소
     * @param networkInterfaceDescription 네트워크 인터페이스 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkInterfaceResponse> createAsync(String responseFormatType, String regionCode, String vpcNo, String subnetNo, String networkInterfaceName, String accessControlGroupNoListN, String serverInstanceNo, String ip, String networkInterfaceDescription, final ServiceCallback<NetworkInterfaceResponse> serviceCallback);

    /**
     * 네트워크 인터페이스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceName 네트워크 인터페이스 이름
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param ip IP 주소
     * @param networkInterfaceDescription 네트워크 인터페이스 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    Observable<NetworkInterfaceResponse> createAsync(String responseFormatType, String regionCode, String vpcNo, String subnetNo, String networkInterfaceName, String accessControlGroupNoListN, String serverInstanceNo, String ip, String networkInterfaceDescription);

    /**
     * 네트워크 인터페이스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcNo VPC 번호
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceName 네트워크 인터페이스 이름
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param ip IP 주소
     * @param networkInterfaceDescription 네트워크 인터페이스 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    Observable<ServiceResponse<NetworkInterfaceResponse>> createWithServiceResponseAsync(String responseFormatType, String regionCode, String vpcNo, String subnetNo, String networkInterfaceName, String accessControlGroupNoListN, String serverInstanceNo, String ip, String networkInterfaceDescription);

    /**
     * 네트워크 인터페이스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceResponse object if successful.
     */
    NetworkInterfaceResponse delete(String responseFormatType);

    /**
     * 네트워크 인터페이스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkInterfaceResponse> deleteAsync(String responseFormatType, final ServiceCallback<NetworkInterfaceResponse> serviceCallback);

    /**
     * 네트워크 인터페이스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    Observable<NetworkInterfaceResponse> deleteAsync(String responseFormatType);

    /**
     * 네트워크 인터페이스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    Observable<ServiceResponse<NetworkInterfaceResponse>> deleteWithServiceResponseAsync(String responseFormatType);
    /**
     * 네트워크 인터페이스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceResponse object if successful.
     */
    NetworkInterfaceResponse delete(String responseFormatType, String regionCode, String networkInterfaceNo);

    /**
     * 네트워크 인터페이스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkInterfaceResponse> deleteAsync(String responseFormatType, String regionCode, String networkInterfaceNo, final ServiceCallback<NetworkInterfaceResponse> serviceCallback);

    /**
     * 네트워크 인터페이스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    Observable<NetworkInterfaceResponse> deleteAsync(String responseFormatType, String regionCode, String networkInterfaceNo);

    /**
     * 네트워크 인터페이스 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    Observable<ServiceResponse<NetworkInterfaceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String regionCode, String networkInterfaceNo);

    /**
     * 네트워크 인터페이스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceResponse object if successful.
     */
    NetworkInterfaceResponse attach(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo);

    /**
     * 네트워크 인터페이스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkInterfaceResponse> attachAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, final ServiceCallback<NetworkInterfaceResponse> serviceCallback);

    /**
     * 네트워크 인터페이스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    Observable<NetworkInterfaceResponse> attachAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo);

    /**
     * 네트워크 인터페이스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    Observable<ServiceResponse<NetworkInterfaceResponse>> attachWithServiceResponseAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo);
    /**
     * 네트워크 인터페이스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceResponse object if successful.
     */
    NetworkInterfaceResponse attach(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, String regionCode);

    /**
     * 네트워크 인터페이스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkInterfaceResponse> attachAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, String regionCode, final ServiceCallback<NetworkInterfaceResponse> serviceCallback);

    /**
     * 네트워크 인터페이스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    Observable<NetworkInterfaceResponse> attachAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, String regionCode);

    /**
     * 네트워크 인터페이스를 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    Observable<ServiceResponse<NetworkInterfaceResponse>> attachWithServiceResponseAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, String regionCode);

    /**
     * 네트워크 인터페이스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceResponse object if successful.
     */
    NetworkInterfaceResponse detach(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo);

    /**
     * 네트워크 인터페이스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkInterfaceResponse> detachAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, final ServiceCallback<NetworkInterfaceResponse> serviceCallback);

    /**
     * 네트워크 인터페이스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    Observable<NetworkInterfaceResponse> detachAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo);

    /**
     * 네트워크 인터페이스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    Observable<ServiceResponse<NetworkInterfaceResponse>> detachWithServiceResponseAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo);
    /**
     * 네트워크 인터페이스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceResponse object if successful.
     */
    NetworkInterfaceResponse detach(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, String regionCode);

    /**
     * 네트워크 인터페이스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkInterfaceResponse> detachAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, String regionCode, final ServiceCallback<NetworkInterfaceResponse> serviceCallback);

    /**
     * 네트워크 인터페이스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    Observable<NetworkInterfaceResponse> detachAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, String regionCode);

    /**
     * 네트워크 인터페이스를 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceResponse object
     */
    Observable<ServiceResponse<NetworkInterfaceResponse>> detachWithServiceResponseAsync(String responseFormatType, String subnetNo, String networkInterfaceNo, String serverInstanceNo, String regionCode);

    /**
     * 네트워크 인터페이스의 ACG를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceAccessControlGroupResponse object if successful.
     */
    NetworkInterfaceAccessControlGroupResponse addACG(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN);

    /**
     * 네트워크 인터페이스의 ACG를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkInterfaceAccessControlGroupResponse> addACGAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, final ServiceCallback<NetworkInterfaceAccessControlGroupResponse> serviceCallback);

    /**
     * 네트워크 인터페이스의 ACG를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceAccessControlGroupResponse object
     */
    Observable<NetworkInterfaceAccessControlGroupResponse> addACGAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN);

    /**
     * 네트워크 인터페이스의 ACG를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceAccessControlGroupResponse object
     */
    Observable<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>> addACGWithServiceResponseAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN);
    /**
     * 네트워크 인터페이스의 ACG를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceAccessControlGroupResponse object if successful.
     */
    NetworkInterfaceAccessControlGroupResponse addACG(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, String regionCode);

    /**
     * 네트워크 인터페이스의 ACG를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkInterfaceAccessControlGroupResponse> addACGAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, String regionCode, final ServiceCallback<NetworkInterfaceAccessControlGroupResponse> serviceCallback);

    /**
     * 네트워크 인터페이스의 ACG를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceAccessControlGroupResponse object
     */
    Observable<NetworkInterfaceAccessControlGroupResponse> addACGAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, String regionCode);

    /**
     * 네트워크 인터페이스의 ACG를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceAccessControlGroupResponse object
     */
    Observable<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>> addACGWithServiceResponseAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, String regionCode);

    /**
     * 네트워크 인터페이스의 ACG를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceAccessControlGroupResponse object if successful.
     */
    NetworkInterfaceAccessControlGroupResponse removeACG(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN);

    /**
     * 네트워크 인터페이스의 ACG를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkInterfaceAccessControlGroupResponse> removeACGAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, final ServiceCallback<NetworkInterfaceAccessControlGroupResponse> serviceCallback);

    /**
     * 네트워크 인터페이스의 ACG를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceAccessControlGroupResponse object
     */
    Observable<NetworkInterfaceAccessControlGroupResponse> removeACGAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN);

    /**
     * 네트워크 인터페이스의 ACG를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceAccessControlGroupResponse object
     */
    Observable<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>> removeACGWithServiceResponseAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN);
    /**
     * 네트워크 인터페이스의 ACG를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceAccessControlGroupResponse object if successful.
     */
    NetworkInterfaceAccessControlGroupResponse removeACG(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, String regionCode);

    /**
     * 네트워크 인터페이스의 ACG를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkInterfaceAccessControlGroupResponse> removeACGAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, String regionCode, final ServiceCallback<NetworkInterfaceAccessControlGroupResponse> serviceCallback);

    /**
     * 네트워크 인터페이스의 ACG를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceAccessControlGroupResponse object
     */
    Observable<NetworkInterfaceAccessControlGroupResponse> removeACGAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, String regionCode);

    /**
     * 네트워크 인터페이스의 ACG를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkInterfaceNo 네트워크 인터페이스 번호
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceAccessControlGroupResponse object
     */
    Observable<ServiceResponse<NetworkInterfaceAccessControlGroupResponse>> removeACGWithServiceResponseAsync(String responseFormatType, String networkInterfaceNo, String accessControlGroupNoListN, String regionCode);

}
