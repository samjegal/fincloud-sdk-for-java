/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc;

import com.fincloud.vpc.models.SubnetDetailResponse;
import com.fincloud.vpc.models.SubnetListResponse;
import com.fincloud.vpc.models.SubnetResponse;
import com.fincloud.vpc.models.SubnetStatusCode;
import com.fincloud.vpc.models.SubnetTypeCode;
import com.fincloud.vpc.models.UsageTypeCode;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Subnets.
 */
public interface Subnets {
    /**
     * Subnet 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetListResponse object if successful.
     */
    SubnetListResponse getList(String responseFormatType);

    /**
     * Subnet 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SubnetListResponse> getListAsync(String responseFormatType, final ServiceCallback<SubnetListResponse> serviceCallback);

    /**
     * Subnet 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetListResponse object
     */
    Observable<SubnetListResponse> getListAsync(String responseFormatType);

    /**
     * Subnet 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetListResponse object
     */
    Observable<ServiceResponse<SubnetListResponse>> getListWithServiceResponseAsync(String responseFormatType);
    /**
     * Subnet 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param subnetNoListN 서브넷 번호 리스트
     * @param subnetName 서브넷 이름
     * @param subnet 서브넷
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param usageTypeCode 용도 유형 코드. Possible values include: 'GEN', 'LOADB', 'BM'
     * @param networkAclNo 네트워크 ACL 번호
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param subnetStatusCode 서브넷 상태 코드. Possible values include: 'INIT', 'CREATING', 'RUN', 'TERMTING'
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetListResponse object if successful.
     */
    SubnetListResponse getList(String responseFormatType, String regionCode, String subnetNoListN, String subnetName, String subnet, SubnetTypeCode subnetTypeCode, UsageTypeCode usageTypeCode, String networkAclNo, String pageNo, String pageSize, SubnetStatusCode subnetStatusCode, String vpcNo, String zoneCode);

    /**
     * Subnet 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param subnetNoListN 서브넷 번호 리스트
     * @param subnetName 서브넷 이름
     * @param subnet 서브넷
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param usageTypeCode 용도 유형 코드. Possible values include: 'GEN', 'LOADB', 'BM'
     * @param networkAclNo 네트워크 ACL 번호
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param subnetStatusCode 서브넷 상태 코드. Possible values include: 'INIT', 'CREATING', 'RUN', 'TERMTING'
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SubnetListResponse> getListAsync(String responseFormatType, String regionCode, String subnetNoListN, String subnetName, String subnet, SubnetTypeCode subnetTypeCode, UsageTypeCode usageTypeCode, String networkAclNo, String pageNo, String pageSize, SubnetStatusCode subnetStatusCode, String vpcNo, String zoneCode, final ServiceCallback<SubnetListResponse> serviceCallback);

    /**
     * Subnet 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param subnetNoListN 서브넷 번호 리스트
     * @param subnetName 서브넷 이름
     * @param subnet 서브넷
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param usageTypeCode 용도 유형 코드. Possible values include: 'GEN', 'LOADB', 'BM'
     * @param networkAclNo 네트워크 ACL 번호
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param subnetStatusCode 서브넷 상태 코드. Possible values include: 'INIT', 'CREATING', 'RUN', 'TERMTING'
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetListResponse object
     */
    Observable<SubnetListResponse> getListAsync(String responseFormatType, String regionCode, String subnetNoListN, String subnetName, String subnet, SubnetTypeCode subnetTypeCode, UsageTypeCode usageTypeCode, String networkAclNo, String pageNo, String pageSize, SubnetStatusCode subnetStatusCode, String vpcNo, String zoneCode);

    /**
     * Subnet 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param subnetNoListN 서브넷 번호 리스트
     * @param subnetName 서브넷 이름
     * @param subnet 서브넷
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param usageTypeCode 용도 유형 코드. Possible values include: 'GEN', 'LOADB', 'BM'
     * @param networkAclNo 네트워크 ACL 번호
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param subnetStatusCode 서브넷 상태 코드. Possible values include: 'INIT', 'CREATING', 'RUN', 'TERMTING'
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetListResponse object
     */
    Observable<ServiceResponse<SubnetListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String subnetNoListN, String subnetName, String subnet, SubnetTypeCode subnetTypeCode, UsageTypeCode usageTypeCode, String networkAclNo, String pageNo, String pageSize, SubnetStatusCode subnetStatusCode, String vpcNo, String zoneCode);

    /**
     * Subnet 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetDetailResponse object if successful.
     */
    SubnetDetailResponse getDetail(String responseFormatType, String subnetNo);

    /**
     * Subnet 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SubnetDetailResponse> getDetailAsync(String responseFormatType, String subnetNo, final ServiceCallback<SubnetDetailResponse> serviceCallback);

    /**
     * Subnet 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetDetailResponse object
     */
    Observable<SubnetDetailResponse> getDetailAsync(String responseFormatType, String subnetNo);

    /**
     * Subnet 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetDetailResponse object
     */
    Observable<ServiceResponse<SubnetDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String subnetNo);
    /**
     * Subnet 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetDetailResponse object if successful.
     */
    SubnetDetailResponse getDetail(String responseFormatType, String subnetNo, String regionCode);

    /**
     * Subnet 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SubnetDetailResponse> getDetailAsync(String responseFormatType, String subnetNo, String regionCode, final ServiceCallback<SubnetDetailResponse> serviceCallback);

    /**
     * Subnet 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetDetailResponse object
     */
    Observable<SubnetDetailResponse> getDetailAsync(String responseFormatType, String subnetNo, String regionCode);

    /**
     * Subnet 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetDetailResponse object
     */
    Observable<ServiceResponse<SubnetDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String subnetNo, String regionCode);

    /**
     * Subnet을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param zoneCode ZONE 코드
     * @param vpcNo VPC 번호
     * @param subnet 서브넷
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetResponse object if successful.
     */
    SubnetResponse create(String responseFormatType, String zoneCode, String vpcNo, String subnet, String networkAclNo, SubnetTypeCode subnetTypeCode);

    /**
     * Subnet을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param zoneCode ZONE 코드
     * @param vpcNo VPC 번호
     * @param subnet 서브넷
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SubnetResponse> createAsync(String responseFormatType, String zoneCode, String vpcNo, String subnet, String networkAclNo, SubnetTypeCode subnetTypeCode, final ServiceCallback<SubnetResponse> serviceCallback);

    /**
     * Subnet을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param zoneCode ZONE 코드
     * @param vpcNo VPC 번호
     * @param subnet 서브넷
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetResponse object
     */
    Observable<SubnetResponse> createAsync(String responseFormatType, String zoneCode, String vpcNo, String subnet, String networkAclNo, SubnetTypeCode subnetTypeCode);

    /**
     * Subnet을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param zoneCode ZONE 코드
     * @param vpcNo VPC 번호
     * @param subnet 서브넷
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetResponse object
     */
    Observable<ServiceResponse<SubnetResponse>> createWithServiceResponseAsync(String responseFormatType, String zoneCode, String vpcNo, String subnet, String networkAclNo, SubnetTypeCode subnetTypeCode);
    /**
     * Subnet을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param zoneCode ZONE 코드
     * @param vpcNo VPC 번호
     * @param subnet 서브넷
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param regionCode REGION 코드
     * @param subnetName 서브넷 이름
     * @param usageTypeCode 용도 유형 코드. Possible values include: 'GEN', 'LOADB', 'BM'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetResponse object if successful.
     */
    SubnetResponse create(String responseFormatType, String zoneCode, String vpcNo, String subnet, String networkAclNo, SubnetTypeCode subnetTypeCode, String regionCode, String subnetName, UsageTypeCode usageTypeCode);

    /**
     * Subnet을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param zoneCode ZONE 코드
     * @param vpcNo VPC 번호
     * @param subnet 서브넷
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param regionCode REGION 코드
     * @param subnetName 서브넷 이름
     * @param usageTypeCode 용도 유형 코드. Possible values include: 'GEN', 'LOADB', 'BM'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SubnetResponse> createAsync(String responseFormatType, String zoneCode, String vpcNo, String subnet, String networkAclNo, SubnetTypeCode subnetTypeCode, String regionCode, String subnetName, UsageTypeCode usageTypeCode, final ServiceCallback<SubnetResponse> serviceCallback);

    /**
     * Subnet을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param zoneCode ZONE 코드
     * @param vpcNo VPC 번호
     * @param subnet 서브넷
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param regionCode REGION 코드
     * @param subnetName 서브넷 이름
     * @param usageTypeCode 용도 유형 코드. Possible values include: 'GEN', 'LOADB', 'BM'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetResponse object
     */
    Observable<SubnetResponse> createAsync(String responseFormatType, String zoneCode, String vpcNo, String subnet, String networkAclNo, SubnetTypeCode subnetTypeCode, String regionCode, String subnetName, UsageTypeCode usageTypeCode);

    /**
     * Subnet을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param zoneCode ZONE 코드
     * @param vpcNo VPC 번호
     * @param subnet 서브넷
     * @param networkAclNo 네트워크 ACL 번호
     * @param subnetTypeCode 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param regionCode REGION 코드
     * @param subnetName 서브넷 이름
     * @param usageTypeCode 용도 유형 코드. Possible values include: 'GEN', 'LOADB', 'BM'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetResponse object
     */
    Observable<ServiceResponse<SubnetResponse>> createWithServiceResponseAsync(String responseFormatType, String zoneCode, String vpcNo, String subnet, String networkAclNo, SubnetTypeCode subnetTypeCode, String regionCode, String subnetName, UsageTypeCode usageTypeCode);

    /**
     * Subnet을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetResponse object if successful.
     */
    SubnetResponse delete(String responseFormatType, String subnetNo);

    /**
     * Subnet을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SubnetResponse> deleteAsync(String responseFormatType, String subnetNo, final ServiceCallback<SubnetResponse> serviceCallback);

    /**
     * Subnet을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetResponse object
     */
    Observable<SubnetResponse> deleteAsync(String responseFormatType, String subnetNo);

    /**
     * Subnet을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetResponse object
     */
    Observable<ServiceResponse<SubnetResponse>> deleteWithServiceResponseAsync(String responseFormatType, String subnetNo);
    /**
     * Subnet을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubnetResponse object if successful.
     */
    SubnetResponse delete(String responseFormatType, String subnetNo, String regionCode);

    /**
     * Subnet을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SubnetResponse> deleteAsync(String responseFormatType, String subnetNo, String regionCode, final ServiceCallback<SubnetResponse> serviceCallback);

    /**
     * Subnet을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetResponse object
     */
    Observable<SubnetResponse> deleteAsync(String responseFormatType, String subnetNo, String regionCode);

    /**
     * Subnet을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param subnetNo 서브넷 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubnetResponse object
     */
    Observable<ServiceResponse<SubnetResponse>> deleteWithServiceResponseAsync(String responseFormatType, String subnetNo, String regionCode);

}
