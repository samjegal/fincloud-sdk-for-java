/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server;

import com.fincloud.server.models.AccessControlGroupOutboundRuleResponse;
import com.fincloud.server.models.ProtocolTypeCode;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ACGOutbounds.
 */
public interface ACGOutbounds {
    /**
     * ACG Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupOutboundRuleResponse object if successful.
     */
    AccessControlGroupOutboundRuleResponse addRule(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode);

    /**
     * ACG Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AccessControlGroupOutboundRuleResponse> addRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, final ServiceCallback<AccessControlGroupOutboundRuleResponse> serviceCallback);

    /**
     * ACG Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupOutboundRuleResponse object
     */
    Observable<AccessControlGroupOutboundRuleResponse> addRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode);

    /**
     * ACG Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupOutboundRuleResponse object
     */
    Observable<ServiceResponse<AccessControlGroupOutboundRuleResponse>> addRuleWithServiceResponseAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode);
    /**
     * ACG Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleListNipBlock IP 블록
     * @param accessControlGroupRuleListNaccessControlGroupSequence 접근 소스 ACG
     * @param accessControlGroupRuleListNportRange 포트 범위
     * @param accessControlGroupRuleListNaccessControlGroupRuleDescription ACG Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupOutboundRuleResponse object if successful.
     */
    AccessControlGroupOutboundRuleResponse addRule(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange, String accessControlGroupRuleListNaccessControlGroupRuleDescription);

    /**
     * ACG Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleListNipBlock IP 블록
     * @param accessControlGroupRuleListNaccessControlGroupSequence 접근 소스 ACG
     * @param accessControlGroupRuleListNportRange 포트 범위
     * @param accessControlGroupRuleListNaccessControlGroupRuleDescription ACG Rule 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AccessControlGroupOutboundRuleResponse> addRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange, String accessControlGroupRuleListNaccessControlGroupRuleDescription, final ServiceCallback<AccessControlGroupOutboundRuleResponse> serviceCallback);

    /**
     * ACG Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleListNipBlock IP 블록
     * @param accessControlGroupRuleListNaccessControlGroupSequence 접근 소스 ACG
     * @param accessControlGroupRuleListNportRange 포트 범위
     * @param accessControlGroupRuleListNaccessControlGroupRuleDescription ACG Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupOutboundRuleResponse object
     */
    Observable<AccessControlGroupOutboundRuleResponse> addRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange, String accessControlGroupRuleListNaccessControlGroupRuleDescription);

    /**
     * ACG Outbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleListNipBlock IP 블록
     * @param accessControlGroupRuleListNaccessControlGroupSequence 접근 소스 ACG
     * @param accessControlGroupRuleListNportRange 포트 범위
     * @param accessControlGroupRuleListNaccessControlGroupRuleDescription ACG Rule 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupOutboundRuleResponse object
     */
    Observable<ServiceResponse<AccessControlGroupOutboundRuleResponse>> addRuleWithServiceResponseAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange, String accessControlGroupRuleListNaccessControlGroupRuleDescription);

    /**
     * ACG Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupOutboundRuleResponse object if successful.
     */
    AccessControlGroupOutboundRuleResponse removeRule(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode);

    /**
     * ACG Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AccessControlGroupOutboundRuleResponse> removeRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, final ServiceCallback<AccessControlGroupOutboundRuleResponse> serviceCallback);

    /**
     * ACG Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupOutboundRuleResponse object
     */
    Observable<AccessControlGroupOutboundRuleResponse> removeRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode);

    /**
     * ACG Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupOutboundRuleResponse object
     */
    Observable<ServiceResponse<AccessControlGroupOutboundRuleResponse>> removeRuleWithServiceResponseAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode);
    /**
     * ACG Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleListNipBlock IP 블록
     * @param accessControlGroupRuleListNaccessControlGroupSequence 접근 소스 ACG
     * @param accessControlGroupRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupOutboundRuleResponse object if successful.
     */
    AccessControlGroupOutboundRuleResponse removeRule(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange);

    /**
     * ACG Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleListNipBlock IP 블록
     * @param accessControlGroupRuleListNaccessControlGroupSequence 접근 소스 ACG
     * @param accessControlGroupRuleListNportRange 포트 범위
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AccessControlGroupOutboundRuleResponse> removeRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange, final ServiceCallback<AccessControlGroupOutboundRuleResponse> serviceCallback);

    /**
     * ACG Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleListNipBlock IP 블록
     * @param accessControlGroupRuleListNaccessControlGroupSequence 접근 소스 ACG
     * @param accessControlGroupRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupOutboundRuleResponse object
     */
    Observable<AccessControlGroupOutboundRuleResponse> removeRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange);

    /**
     * ACG Outbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param regionCode REGION 코드
     * @param accessControlGroupRuleListNipBlock IP 블록
     * @param accessControlGroupRuleListNaccessControlGroupSequence 접근 소스 ACG
     * @param accessControlGroupRuleListNportRange 포트 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupOutboundRuleResponse object
     */
    Observable<ServiceResponse<AccessControlGroupOutboundRuleResponse>> removeRuleWithServiceResponseAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange);

}
