/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc;

import com.fincloud.vpc.models.NetworkAclDetailResponse;
import com.fincloud.vpc.models.NetworkAclInboundRuleResponse;
import com.fincloud.vpc.models.NetworkAclListResponse;
import com.fincloud.vpc.models.NetworkAclOutboundRuleResponse;
import com.fincloud.vpc.models.NetworkAclResponse;
import com.fincloud.vpc.models.NetworkAclRuleListResponse;
import com.fincloud.vpc.models.NetworkAclRuleTypeCode;
import com.fincloud.vpc.models.NetworkAclStatusCode;
import com.fincloud.vpc.models.ProtocolTypeCode;
import com.fincloud.vpc.models.RuleActionCode;
import com.fincloud.vpc.models.SubnetNetworkAclResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in NetworkACLs.
 */
public interface NetworkACLs {
    /**
     * 네트워크 ACL 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclListResponse object if successful.
     */
    NetworkAclListResponse getList(String responseFormatType);

    /**
     * 네트워크 ACL 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclListResponse> getListAsync(String responseFormatType, final ServiceCallback<NetworkAclListResponse> serviceCallback);

    /**
     * 네트워크 ACL 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclListResponse object
     */
    Observable<NetworkAclListResponse> getListAsync(String responseFormatType);

    /**
     * 네트워크 ACL 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclListResponse object
     */
    Observable<ServiceResponse<NetworkAclListResponse>> getListWithServiceResponseAsync(String responseFormatType);
    /**
     * 네트워크 ACL 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkAclName 네트워크 ACL 이름
     * @param networkAclStatusCode 네트워크 ACL 상태 코드. Possible values include: 'INIT', 'SET', 'RUN', 'TERMTING'
     * @param networkAclNoListN 네트워크 ACL 번호 리스트
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclListResponse object if successful.
     */
    NetworkAclListResponse getList(String responseFormatType, String regionCode, String networkAclName, NetworkAclStatusCode networkAclStatusCode, String networkAclNoListN, String pageNo, String pageSize, String vpcNo);

    /**
     * 네트워크 ACL 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkAclName 네트워크 ACL 이름
     * @param networkAclStatusCode 네트워크 ACL 상태 코드. Possible values include: 'INIT', 'SET', 'RUN', 'TERMTING'
     * @param networkAclNoListN 네트워크 ACL 번호 리스트
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclListResponse> getListAsync(String responseFormatType, String regionCode, String networkAclName, NetworkAclStatusCode networkAclStatusCode, String networkAclNoListN, String pageNo, String pageSize, String vpcNo, final ServiceCallback<NetworkAclListResponse> serviceCallback);

    /**
     * 네트워크 ACL 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkAclName 네트워크 ACL 이름
     * @param networkAclStatusCode 네트워크 ACL 상태 코드. Possible values include: 'INIT', 'SET', 'RUN', 'TERMTING'
     * @param networkAclNoListN 네트워크 ACL 번호 리스트
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclListResponse object
     */
    Observable<NetworkAclListResponse> getListAsync(String responseFormatType, String regionCode, String networkAclName, NetworkAclStatusCode networkAclStatusCode, String networkAclNoListN, String pageNo, String pageSize, String vpcNo);

    /**
     * 네트워크 ACL 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param networkAclName 네트워크 ACL 이름
     * @param networkAclStatusCode 네트워크 ACL 상태 코드. Possible values include: 'INIT', 'SET', 'RUN', 'TERMTING'
     * @param networkAclNoListN 네트워크 ACL 번호 리스트
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclListResponse object
     */
    Observable<ServiceResponse<NetworkAclListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String networkAclName, NetworkAclStatusCode networkAclStatusCode, String networkAclNoListN, String pageNo, String pageSize, String vpcNo);

    /**
     * 네트워크 ACL 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclDetailResponse object if successful.
     */
    NetworkAclDetailResponse getDetail(String responseFormatType, String networkAclNo);

    /**
     * 네트워크 ACL 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclDetailResponse> getDetailAsync(String responseFormatType, String networkAclNo, final ServiceCallback<NetworkAclDetailResponse> serviceCallback);

    /**
     * 네트워크 ACL 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclDetailResponse object
     */
    Observable<NetworkAclDetailResponse> getDetailAsync(String responseFormatType, String networkAclNo);

    /**
     * 네트워크 ACL 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclDetailResponse object
     */
    Observable<ServiceResponse<NetworkAclDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String networkAclNo);
    /**
     * 네트워크 ACL 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclDetailResponse object if successful.
     */
    NetworkAclDetailResponse getDetail(String responseFormatType, String networkAclNo, String regionCode);

    /**
     * 네트워크 ACL 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclDetailResponse> getDetailAsync(String responseFormatType, String networkAclNo, String regionCode, final ServiceCallback<NetworkAclDetailResponse> serviceCallback);

    /**
     * 네트워크 ACL 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclDetailResponse object
     */
    Observable<NetworkAclDetailResponse> getDetailAsync(String responseFormatType, String networkAclNo, String regionCode);

    /**
     * 네트워크 ACL 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclDetailResponse object
     */
    Observable<ServiceResponse<NetworkAclDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String networkAclNo, String regionCode);

    /**
     * 네트워크 ACL을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclResponse object if successful.
     */
    NetworkAclResponse create(String responseFormatType, String vpcNo);

    /**
     * 네트워크 ACL을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclResponse> createAsync(String responseFormatType, String vpcNo, final ServiceCallback<NetworkAclResponse> serviceCallback);

    /**
     * 네트워크 ACL을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclResponse object
     */
    Observable<NetworkAclResponse> createAsync(String responseFormatType, String vpcNo);

    /**
     * 네트워크 ACL을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclResponse object
     */
    Observable<ServiceResponse<NetworkAclResponse>> createWithServiceResponseAsync(String responseFormatType, String vpcNo);
    /**
     * 네트워크 ACL을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param networkAclName 네트워크 ACL 이름
     * @param networkAclDescription 네트워크 ACL 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclResponse object if successful.
     */
    NetworkAclResponse create(String responseFormatType, String vpcNo, String regionCode, String networkAclName, String networkAclDescription);

    /**
     * 네트워크 ACL을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param networkAclName 네트워크 ACL 이름
     * @param networkAclDescription 네트워크 ACL 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclResponse> createAsync(String responseFormatType, String vpcNo, String regionCode, String networkAclName, String networkAclDescription, final ServiceCallback<NetworkAclResponse> serviceCallback);

    /**
     * 네트워크 ACL을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param networkAclName 네트워크 ACL 이름
     * @param networkAclDescription 네트워크 ACL 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclResponse object
     */
    Observable<NetworkAclResponse> createAsync(String responseFormatType, String vpcNo, String regionCode, String networkAclName, String networkAclDescription);

    /**
     * 네트워크 ACL을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param networkAclName 네트워크 ACL 이름
     * @param networkAclDescription 네트워크 ACL 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclResponse object
     */
    Observable<ServiceResponse<NetworkAclResponse>> createWithServiceResponseAsync(String responseFormatType, String vpcNo, String regionCode, String networkAclName, String networkAclDescription);

    /**
     * 네트워크 ACL을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclResponse object if successful.
     */
    NetworkAclResponse delete(String responseFormatType, String networkAclNo);

    /**
     * 네트워크 ACL을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclResponse> deleteAsync(String responseFormatType, String networkAclNo, final ServiceCallback<NetworkAclResponse> serviceCallback);

    /**
     * 네트워크 ACL을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclResponse object
     */
    Observable<NetworkAclResponse> deleteAsync(String responseFormatType, String networkAclNo);

    /**
     * 네트워크 ACL을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclResponse object
     */
    Observable<ServiceResponse<NetworkAclResponse>> deleteWithServiceResponseAsync(String responseFormatType, String networkAclNo);
    /**
     * 네트워크 ACL을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclResponse object if successful.
     */
    NetworkAclResponse delete(String responseFormatType, String networkAclNo, String regionCode);

    /**
     * 네트워크 ACL을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclResponse> deleteAsync(String responseFormatType, String networkAclNo, String regionCode, final ServiceCallback<NetworkAclResponse> serviceCallback);

    /**
     * 네트워크 ACL을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclResponse object
     */
    Observable<NetworkAclResponse> deleteAsync(String responseFormatType, String networkAclNo, String regionCode);

    /**
     * 네트워크 ACL을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclResponse object
     */
    Observable<ServiceResponse<NetworkAclResponse>> deleteWithServiceResponseAsync(String responseFormatType, String networkAclNo, String regionCode);

    /**
     * 서브넷의 네트워크 ACL을 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetNetworkAclResponse object if successful.
     */
    SubnetNetworkAclResponse setSubnet(String responseFormatType, String networkAclNo, String subnetNo);

    /**
     * 서브넷의 네트워크 ACL을 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetNo 서브넷 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SubnetNetworkAclResponse> setSubnetAsync(String responseFormatType, String networkAclNo, String subnetNo, final ServiceCallback<SubnetNetworkAclResponse> serviceCallback);

    /**
     * 서브넷의 네트워크 ACL을 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetNetworkAclResponse object
     */
    Observable<SubnetNetworkAclResponse> setSubnetAsync(String responseFormatType, String networkAclNo, String subnetNo);

    /**
     * 서브넷의 네트워크 ACL을 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetNetworkAclResponse object
     */
    Observable<ServiceResponse<SubnetNetworkAclResponse>> setSubnetWithServiceResponseAsync(String responseFormatType, String networkAclNo, String subnetNo);
    /**
     * 서브넷의 네트워크 ACL을 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetNetworkAclResponse object if successful.
     */
    SubnetNetworkAclResponse setSubnet(String responseFormatType, String networkAclNo, String subnetNo, String regionCode);

    /**
     * 서브넷의 네트워크 ACL을 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SubnetNetworkAclResponse> setSubnetAsync(String responseFormatType, String networkAclNo, String subnetNo, String regionCode, final ServiceCallback<SubnetNetworkAclResponse> serviceCallback);

    /**
     * 서브넷의 네트워크 ACL을 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetNetworkAclResponse object
     */
    Observable<SubnetNetworkAclResponse> setSubnetAsync(String responseFormatType, String networkAclNo, String subnetNo, String regionCode);

    /**
     * 서브넷의 네트워크 ACL을 설정.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetNetworkAclResponse object
     */
    Observable<ServiceResponse<SubnetNetworkAclResponse>> setSubnetWithServiceResponseAsync(String responseFormatType, String networkAclNo, String subnetNo, String regionCode);

    /**
     * 네트워크 ACL의 Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclRuleListResponse object if successful.
     */
    NetworkAclRuleListResponse getRuleList(String responseFormatType, String networkAclNo);

    /**
     * 네트워크 ACL의 Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclRuleListResponse> getRuleListAsync(String responseFormatType, String networkAclNo, final ServiceCallback<NetworkAclRuleListResponse> serviceCallback);

    /**
     * 네트워크 ACL의 Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclRuleListResponse object
     */
    Observable<NetworkAclRuleListResponse> getRuleListAsync(String responseFormatType, String networkAclNo);

    /**
     * 네트워크 ACL의 Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclRuleListResponse object
     */
    Observable<ServiceResponse<NetworkAclRuleListResponse>> getRuleListWithServiceResponseAsync(String responseFormatType, String networkAclNo);
    /**
     * 네트워크 ACL의 Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @param networkAclRuleTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'INBND', 'OTBND'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclRuleListResponse object if successful.
     */
    NetworkAclRuleListResponse getRuleList(String responseFormatType, String networkAclNo, String regionCode, NetworkAclRuleTypeCode networkAclRuleTypeCode);

    /**
     * 네트워크 ACL의 Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @param networkAclRuleTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'INBND', 'OTBND'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclRuleListResponse> getRuleListAsync(String responseFormatType, String networkAclNo, String regionCode, NetworkAclRuleTypeCode networkAclRuleTypeCode, final ServiceCallback<NetworkAclRuleListResponse> serviceCallback);

    /**
     * 네트워크 ACL의 Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @param networkAclRuleTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'INBND', 'OTBND'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclRuleListResponse object
     */
    Observable<NetworkAclRuleListResponse> getRuleListAsync(String responseFormatType, String networkAclNo, String regionCode, NetworkAclRuleTypeCode networkAclRuleTypeCode);

    /**
     * 네트워크 ACL의 Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param regionCode REGION 코드
     * @param networkAclRuleTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'INBND', 'OTBND'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclRuleListResponse object
     */
    Observable<ServiceResponse<NetworkAclRuleListResponse>> getRuleListWithServiceResponseAsync(String responseFormatType, String networkAclNo, String regionCode, NetworkAclRuleTypeCode networkAclRuleTypeCode);

    /**
     * 네트워크 ACL의 Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclInboundRuleResponse object if successful.
     */
    NetworkAclInboundRuleResponse addInboundRule(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode);

    /**
     * 네트워크 ACL의 Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclInboundRuleResponse> addInboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, final ServiceCallback<NetworkAclInboundRuleResponse> serviceCallback);

    /**
     * 네트워크 ACL의 Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclInboundRuleResponse object
     */
    Observable<NetworkAclInboundRuleResponse> addInboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode);

    /**
     * 네트워크 ACL의 Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclInboundRuleResponse object
     */
    Observable<ServiceResponse<NetworkAclInboundRuleResponse>> addInboundRuleWithServiceResponseAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode);
    /**
     * 네트워크 ACL의 Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param networkAclRuleListNnetworkAclRuleDescription 네트워크 ACL Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclInboundRuleResponse object if successful.
     */
    NetworkAclInboundRuleResponse addInboundRule(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, String networkAclRuleListNnetworkAclRuleDescription);

    /**
     * 네트워크 ACL의 Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param networkAclRuleListNnetworkAclRuleDescription 네트워크 ACL Rule 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclInboundRuleResponse> addInboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, String networkAclRuleListNnetworkAclRuleDescription, final ServiceCallback<NetworkAclInboundRuleResponse> serviceCallback);

    /**
     * 네트워크 ACL의 Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param networkAclRuleListNnetworkAclRuleDescription 네트워크 ACL Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclInboundRuleResponse object
     */
    Observable<NetworkAclInboundRuleResponse> addInboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, String networkAclRuleListNnetworkAclRuleDescription);

    /**
     * 네트워크 ACL의 Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param networkAclRuleListNnetworkAclRuleDescription 네트워크 ACL Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclInboundRuleResponse object
     */
    Observable<ServiceResponse<NetworkAclInboundRuleResponse>> addInboundRuleWithServiceResponseAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, String networkAclRuleListNnetworkAclRuleDescription);

    /**
     * 네트워크 ACL의 Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclOutboundRuleResponse object if successful.
     */
    NetworkAclOutboundRuleResponse addOutboundRule(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode);

    /**
     * 네트워크 ACL의 Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclOutboundRuleResponse> addOutboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, final ServiceCallback<NetworkAclOutboundRuleResponse> serviceCallback);

    /**
     * 네트워크 ACL의 Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclOutboundRuleResponse object
     */
    Observable<NetworkAclOutboundRuleResponse> addOutboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode);

    /**
     * 네트워크 ACL의 Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclOutboundRuleResponse object
     */
    Observable<ServiceResponse<NetworkAclOutboundRuleResponse>> addOutboundRuleWithServiceResponseAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode);
    /**
     * 네트워크 ACL의 Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param networkAclRuleListNnetworkAclRuleDescription 네트워크 ACL Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclOutboundRuleResponse object if successful.
     */
    NetworkAclOutboundRuleResponse addOutboundRule(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, String networkAclRuleListNnetworkAclRuleDescription);

    /**
     * 네트워크 ACL의 Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param networkAclRuleListNnetworkAclRuleDescription 네트워크 ACL Rule 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclOutboundRuleResponse> addOutboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, String networkAclRuleListNnetworkAclRuleDescription, final ServiceCallback<NetworkAclOutboundRuleResponse> serviceCallback);

    /**
     * 네트워크 ACL의 Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param networkAclRuleListNnetworkAclRuleDescription 네트워크 ACL Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclOutboundRuleResponse object
     */
    Observable<NetworkAclOutboundRuleResponse> addOutboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, String networkAclRuleListNnetworkAclRuleDescription);

    /**
     * 네트워크 ACL의 Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param networkAclRuleListNnetworkAclRuleDescription 네트워크 ACL Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclOutboundRuleResponse object
     */
    Observable<ServiceResponse<NetworkAclOutboundRuleResponse>> addOutboundRuleWithServiceResponseAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, String networkAclRuleListNnetworkAclRuleDescription);

    /**
     * 네트워크 ACL의 Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclInboundRuleResponse object if successful.
     */
    NetworkAclInboundRuleResponse removeInboundRule(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode);

    /**
     * 네트워크 ACL의 Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclInboundRuleResponse> removeInboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, final ServiceCallback<NetworkAclInboundRuleResponse> serviceCallback);

    /**
     * 네트워크 ACL의 Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclInboundRuleResponse object
     */
    Observable<NetworkAclInboundRuleResponse> removeInboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode);

    /**
     * 네트워크 ACL의 Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclInboundRuleResponse object
     */
    Observable<ServiceResponse<NetworkAclInboundRuleResponse>> removeInboundRuleWithServiceResponseAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode);
    /**
     * 네트워크 ACL의 Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclInboundRuleResponse object if successful.
     */
    NetworkAclInboundRuleResponse removeInboundRule(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange);

    /**
     * 네트워크 ACL의 Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclInboundRuleResponse> removeInboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, final ServiceCallback<NetworkAclInboundRuleResponse> serviceCallback);

    /**
     * 네트워크 ACL의 Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclInboundRuleResponse object
     */
    Observable<NetworkAclInboundRuleResponse> removeInboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange);

    /**
     * 네트워크 ACL의 Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclInboundRuleResponse object
     */
    Observable<ServiceResponse<NetworkAclInboundRuleResponse>> removeInboundRuleWithServiceResponseAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange);

    /**
     * 네트워크 ACL의 Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclOutboundRuleResponse object if successful.
     */
    NetworkAclOutboundRuleResponse removeOutboundRule(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode);

    /**
     * 네트워크 ACL의 Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclOutboundRuleResponse> removeOutboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, final ServiceCallback<NetworkAclOutboundRuleResponse> serviceCallback);

    /**
     * 네트워크 ACL의 Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclOutboundRuleResponse object
     */
    Observable<NetworkAclOutboundRuleResponse> removeOutboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode);

    /**
     * 네트워크 ACL의 Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclOutboundRuleResponse object
     */
    Observable<ServiceResponse<NetworkAclOutboundRuleResponse>> removeOutboundRuleWithServiceResponseAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode);
    /**
     * 네트워크 ACL의 Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkAclOutboundRuleResponse object if successful.
     */
    NetworkAclOutboundRuleResponse removeOutboundRule(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange);

    /**
     * 네트워크 ACL의 Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NetworkAclOutboundRuleResponse> removeOutboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange, final ServiceCallback<NetworkAclOutboundRuleResponse> serviceCallback);

    /**
     * 네트워크 ACL의 Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclOutboundRuleResponse object
     */
    Observable<NetworkAclOutboundRuleResponse> removeOutboundRuleAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange);

    /**
     * 네트워크 ACL의 Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param networkAclNo 네트워크 ACL 번호
     * @param networkAclRuleListNpriority 우선순위
     * @param networkAclRuleListNprotocolTypeCode 네트워크 ACL Rule 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param networkAclRuleListNipBlock IP 블록
     * @param networkAclRuleListNruleActionCode Rule 액션 코드. Possible values include: 'ALLOW', 'DROP'
     * @param regionCode REGION 코드
     * @param networkAclRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkAclOutboundRuleResponse object
     */
    Observable<ServiceResponse<NetworkAclOutboundRuleResponse>> removeOutboundRuleWithServiceResponseAsync(String responseFormatType, String networkAclNo, String networkAclRuleListNpriority, ProtocolTypeCode networkAclRuleListNprotocolTypeCode, String networkAclRuleListNipBlock, RuleActionCode networkAclRuleListNruleActionCode, String regionCode, String networkAclRuleListNportRange);

}
