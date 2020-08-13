/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server;

import com.fincloud.server.models.AccessControlGroupInboundRuleResponse;
import com.fincloud.server.models.ProtocolTypeCode;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ACGInbounds.
 */
public interface ACGInbounds {
    /**
     * ACG Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupInboundRuleResponse object if successful.
     */
    AccessControlGroupInboundRuleResponse addRule(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode);

    /**
     * ACG Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AccessControlGroupInboundRuleResponse> addRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, final ServiceCallback<AccessControlGroupInboundRuleResponse> serviceCallback);

    /**
     * ACG Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupInboundRuleResponse object
     */
    Observable<AccessControlGroupInboundRuleResponse> addRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode);

    /**
     * ACG Inbound Rule을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupInboundRuleResponse object
     */
    Observable<ServiceResponse<AccessControlGroupInboundRuleResponse>> addRuleWithServiceResponseAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode);
    /**
     * ACG Inbound Rule을 추가.
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
     * @return the AccessControlGroupInboundRuleResponse object if successful.
     */
    AccessControlGroupInboundRuleResponse addRule(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange, String accessControlGroupRuleListNaccessControlGroupRuleDescription);

    /**
     * ACG Inbound Rule을 추가.
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
    ServiceFuture<AccessControlGroupInboundRuleResponse> addRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange, String accessControlGroupRuleListNaccessControlGroupRuleDescription, final ServiceCallback<AccessControlGroupInboundRuleResponse> serviceCallback);

    /**
     * ACG Inbound Rule을 추가.
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
     * @return the observable to the AccessControlGroupInboundRuleResponse object
     */
    Observable<AccessControlGroupInboundRuleResponse> addRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange, String accessControlGroupRuleListNaccessControlGroupRuleDescription);

    /**
     * ACG Inbound Rule을 추가.
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
     * @return the observable to the AccessControlGroupInboundRuleResponse object
     */
    Observable<ServiceResponse<AccessControlGroupInboundRuleResponse>> addRuleWithServiceResponseAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange, String accessControlGroupRuleListNaccessControlGroupRuleDescription);

    /**
     * ACG Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessControlGroupInboundRuleResponse object if successful.
     */
    AccessControlGroupInboundRuleResponse removeRule(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode);

    /**
     * ACG Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AccessControlGroupInboundRuleResponse> removeRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, final ServiceCallback<AccessControlGroupInboundRuleResponse> serviceCallback);

    /**
     * ACG Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupInboundRuleResponse object
     */
    Observable<AccessControlGroupInboundRuleResponse> removeRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode);

    /**
     * ACG Inbound Rule을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param accessControlGroupNo ACG 번호
     * @param accessControlGroupRuleListNprotocolTypeCode 프로토콜 유형 코드. Possible values include: 'TCP', 'UDP', 'ICMP'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessControlGroupInboundRuleResponse object
     */
    Observable<ServiceResponse<AccessControlGroupInboundRuleResponse>> removeRuleWithServiceResponseAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode);
    /**
     * ACG Inbound Rule을 제거.
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
     * @return the AccessControlGroupInboundRuleResponse object if successful.
     */
    AccessControlGroupInboundRuleResponse removeRule(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange);

    /**
     * ACG Inbound Rule을 제거.
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
    ServiceFuture<AccessControlGroupInboundRuleResponse> removeRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange, final ServiceCallback<AccessControlGroupInboundRuleResponse> serviceCallback);

    /**
     * ACG Inbound Rule을 제거.
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
     * @return the observable to the AccessControlGroupInboundRuleResponse object
     */
    Observable<AccessControlGroupInboundRuleResponse> removeRuleAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange);

    /**
     * ACG Inbound Rule을 제거.
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
     * @return the observable to the AccessControlGroupInboundRuleResponse object
     */
    Observable<ServiceResponse<AccessControlGroupInboundRuleResponse>> removeRuleWithServiceResponseAsync(String responseFormatType, String vpcNo, String accessControlGroupNo, ProtocolTypeCode accessControlGroupRuleListNprotocolTypeCode, String regionCode, String accessControlGroupRuleListNipBlock, String accessControlGroupRuleListNaccessControlGroupSequence, String accessControlGroupRuleListNportRange);

}
