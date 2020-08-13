/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server;

import com.fincloud.server.models.AccessControlGroupDetailResponse;
import com.fincloud.server.models.AccessControlGroupListResponse;
import com.fincloud.server.models.AccessControlGroupResponse;
import com.fincloud.server.models.AccessControlGroupRuleListResponse;
import com.fincloud.server.models.AccessControlGroupRuleTypeCode;
import com.fincloud.server.models.AccessControlGroupStatusCode;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ACGs.
 */
public interface ACGs {
    /**
     * ACG 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupListResponse object if successful.
     */
    AccessControlGroupListResponse getList(String responseFormatType);

    /**
     * ACG 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AccessControlGroupListResponse> getListAsync(String responseFormatType, final ServiceCallback<AccessControlGroupListResponse> serviceCallback);

    /**
     * ACG 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupListResponse object
     */
    Observable<AccessControlGroupListResponse> getListAsync(String responseFormatType);

    /**
     * ACG 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupListResponse object
     */
    Observable<ServiceResponse<AccessControlGroupListResponse>> getListWithServiceResponseAsync(String responseFormatType);
    /**
     * ACG 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param accessControlGroupName ACG 이름
     * @param accessControlGroupStatusCode ACG 상태 코드. Possible values include: 'INIT', 'SET', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupListResponse object if successful.
     */
    AccessControlGroupListResponse getList(String responseFormatType, String regionCode, String accessControlGroupNoListN, String accessControlGroupName, AccessControlGroupStatusCode accessControlGroupStatusCode, String pageNo, String pageSize, String vpcNo);

    /**
     * ACG 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param accessControlGroupName ACG 이름
     * @param accessControlGroupStatusCode ACG 상태 코드. Possible values include: 'INIT', 'SET', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AccessControlGroupListResponse> getListAsync(String responseFormatType, String regionCode, String accessControlGroupNoListN, String accessControlGroupName, AccessControlGroupStatusCode accessControlGroupStatusCode, String pageNo, String pageSize, String vpcNo, final ServiceCallback<AccessControlGroupListResponse> serviceCallback);

    /**
     * ACG 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param accessControlGroupName ACG 이름
     * @param accessControlGroupStatusCode ACG 상태 코드. Possible values include: 'INIT', 'SET', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupListResponse object
     */
    Observable<AccessControlGroupListResponse> getListAsync(String responseFormatType, String regionCode, String accessControlGroupNoListN, String accessControlGroupName, AccessControlGroupStatusCode accessControlGroupStatusCode, String pageNo, String pageSize, String vpcNo);

    /**
     * ACG 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param accessControlGroupNoListN ACG 번호 리스트
     * @param accessControlGroupName ACG 이름
     * @param accessControlGroupStatusCode ACG 상태 코드. Possible values include: 'INIT', 'SET', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupListResponse object
     */
    Observable<ServiceResponse<AccessControlGroupListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String accessControlGroupNoListN, String accessControlGroupName, AccessControlGroupStatusCode accessControlGroupStatusCode, String pageNo, String pageSize, String vpcNo);

    /**
     * ACG 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupDetailResponse object if successful.
     */
    AccessControlGroupDetailResponse getDetail(String responseFormatType, String accessControlGroupNo);

    /**
     * ACG 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AccessControlGroupDetailResponse> getDetailAsync(String responseFormatType, String accessControlGroupNo, final ServiceCallback<AccessControlGroupDetailResponse> serviceCallback);

    /**
     * ACG 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupDetailResponse object
     */
    Observable<AccessControlGroupDetailResponse> getDetailAsync(String responseFormatType, String accessControlGroupNo);

    /**
     * ACG 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupDetailResponse object
     */
    Observable<ServiceResponse<AccessControlGroupDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String accessControlGroupNo);
    /**
     * ACG 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupDetailResponse object if successful.
     */
    AccessControlGroupDetailResponse getDetail(String responseFormatType, String accessControlGroupNo, String regionCode);

    /**
     * ACG 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AccessControlGroupDetailResponse> getDetailAsync(String responseFormatType, String accessControlGroupNo, String regionCode, final ServiceCallback<AccessControlGroupDetailResponse> serviceCallback);

    /**
     * ACG 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupDetailResponse object
     */
    Observable<AccessControlGroupDetailResponse> getDetailAsync(String responseFormatType, String accessControlGroupNo, String regionCode);

    /**
     * ACG 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupDetailResponse object
     */
    Observable<ServiceResponse<AccessControlGroupDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String accessControlGroupNo, String regionCode);

    /**
     * ACG를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupResponse object if successful.
     */
    AccessControlGroupResponse create(String responseFormatType, String vpcNo);

    /**
     * ACG를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AccessControlGroupResponse> createAsync(String responseFormatType, String vpcNo, final ServiceCallback<AccessControlGroupResponse> serviceCallback);

    /**
     * ACG를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupResponse object
     */
    Observable<AccessControlGroupResponse> createAsync(String responseFormatType, String vpcNo);

    /**
     * ACG를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupResponse object
     */
    Observable<ServiceResponse<AccessControlGroupResponse>> createWithServiceResponseAsync(String responseFormatType, String vpcNo);
    /**
     * ACG를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param accessControlGroupName ACG 이름
     * @param accessControlGroupDescription ACG 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupResponse object if successful.
     */
    AccessControlGroupResponse create(String responseFormatType, String vpcNo, String regionCode, String accessControlGroupName, String accessControlGroupDescription);

    /**
     * ACG를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param accessControlGroupName ACG 이름
     * @param accessControlGroupDescription ACG 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AccessControlGroupResponse> createAsync(String responseFormatType, String vpcNo, String regionCode, String accessControlGroupName, String accessControlGroupDescription, final ServiceCallback<AccessControlGroupResponse> serviceCallback);

    /**
     * ACG를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param accessControlGroupName ACG 이름
     * @param accessControlGroupDescription ACG 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupResponse object
     */
    Observable<AccessControlGroupResponse> createAsync(String responseFormatType, String vpcNo, String regionCode, String accessControlGroupName, String accessControlGroupDescription);

    /**
     * ACG를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param accessControlGroupName ACG 이름
     * @param accessControlGroupDescription ACG 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupResponse object
     */
    Observable<ServiceResponse<AccessControlGroupResponse>> createWithServiceResponseAsync(String responseFormatType, String vpcNo, String regionCode, String accessControlGroupName, String accessControlGroupDescription);

    /**
     * ACG를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupResponse object if successful.
     */
    AccessControlGroupResponse delete(String responseFormatType, String vpcNo, String accessControlGroupNo);

    /**
     * ACG를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AccessControlGroupResponse> deleteAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, final ServiceCallback<AccessControlGroupResponse> serviceCallback);

    /**
     * ACG를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupResponse object
     */
    Observable<AccessControlGroupResponse> deleteAsync(String responseFormatType, String vpcNo, String accessControlGroupNo);

    /**
     * ACG를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupResponse object
     */
    Observable<ServiceResponse<AccessControlGroupResponse>> deleteWithServiceResponseAsync(String responseFormatType, String vpcNo, String accessControlGroupNo);
    /**
     * ACG를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupResponse object if successful.
     */
    AccessControlGroupResponse delete(String responseFormatType, String vpcNo, String accessControlGroupNo, String regionCode);

    /**
     * ACG를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AccessControlGroupResponse> deleteAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, String regionCode, final ServiceCallback<AccessControlGroupResponse> serviceCallback);

    /**
     * ACG를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupResponse object
     */
    Observable<AccessControlGroupResponse> deleteAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, String regionCode);

    /**
     * ACG를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupResponse object
     */
    Observable<ServiceResponse<AccessControlGroupResponse>> deleteWithServiceResponseAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, String regionCode);

    /**
     * ACG Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupRuleListResponse object if successful.
     */
    AccessControlGroupRuleListResponse getRuleList(String responseFormatType, String accessControlGroupNo);

    /**
     * ACG Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AccessControlGroupRuleListResponse> getRuleListAsync(String responseFormatType, String accessControlGroupNo, final ServiceCallback<AccessControlGroupRuleListResponse> serviceCallback);

    /**
     * ACG Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupRuleListResponse object
     */
    Observable<AccessControlGroupRuleListResponse> getRuleListAsync(String responseFormatType, String accessControlGroupNo);

    /**
     * ACG Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupRuleListResponse object
     */
    Observable<ServiceResponse<AccessControlGroupRuleListResponse>> getRuleListWithServiceResponseAsync(String responseFormatType, String accessControlGroupNo);
    /**
     * ACG Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleTypeCode ACG Rule 유형 코드. Possible values include: 'INBND', 'OTBND'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupRuleListResponse object if successful.
     */
    AccessControlGroupRuleListResponse getRuleList(String responseFormatType, String accessControlGroupNo, String regionCode, AccessControlGroupRuleTypeCode accessControlGroupRuleTypeCode);

    /**
     * ACG Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleTypeCode ACG Rule 유형 코드. Possible values include: 'INBND', 'OTBND'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AccessControlGroupRuleListResponse> getRuleListAsync(String responseFormatType, String accessControlGroupNo, String regionCode, AccessControlGroupRuleTypeCode accessControlGroupRuleTypeCode, final ServiceCallback<AccessControlGroupRuleListResponse> serviceCallback);

    /**
     * ACG Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleTypeCode ACG Rule 유형 코드. Possible values include: 'INBND', 'OTBND'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupRuleListResponse object
     */
    Observable<AccessControlGroupRuleListResponse> getRuleListAsync(String responseFormatType, String accessControlGroupNo, String regionCode, AccessControlGroupRuleTypeCode accessControlGroupRuleTypeCode);

    /**
     * ACG Rule 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param accessControlGroupNo ACG 번호
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleTypeCode ACG Rule 유형 코드. Possible values include: 'INBND', 'OTBND'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupRuleListResponse object
     */
    Observable<ServiceResponse<AccessControlGroupRuleListResponse>> getRuleListWithServiceResponseAsync(String responseFormatType, String accessControlGroupNo, String regionCode, AccessControlGroupRuleTypeCode accessControlGroupRuleTypeCode);

}
