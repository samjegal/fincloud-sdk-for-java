/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc;

import com.fincloud.vpc.models.RouteListResponse;
import com.fincloud.vpc.models.RouteResponse;
import com.fincloud.vpc.models.TargetTypeCode;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Routes.
 */
public interface Routes {
    /**
     * 라우트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteListResponse object if successful.
     */
    RouteListResponse getList(String responseFormatType, String routeTableNo, String vpcNo);

    /**
     * 라우트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteListResponse> getListAsync(String responseFormatType, String routeTableNo, String vpcNo, final ServiceCallback<RouteListResponse> serviceCallback);

    /**
     * 라우트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteListResponse object
     */
    Observable<RouteListResponse> getListAsync(String responseFormatType, String routeTableNo, String vpcNo);

    /**
     * 라우트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteListResponse object
     */
    Observable<ServiceResponse<RouteListResponse>> getListWithServiceResponseAsync(String responseFormatType, String routeTableNo, String vpcNo);
    /**
     * 라우트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteListResponse object if successful.
     */
    RouteListResponse getList(String responseFormatType, String routeTableNo, String vpcNo, String regionCode);

    /**
     * 라우트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteListResponse> getListAsync(String responseFormatType, String routeTableNo, String vpcNo, String regionCode, final ServiceCallback<RouteListResponse> serviceCallback);

    /**
     * 라우트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteListResponse object
     */
    Observable<RouteListResponse> getListAsync(String responseFormatType, String routeTableNo, String vpcNo, String regionCode);

    /**
     * 라우트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteListResponse object
     */
    Observable<ServiceResponse<RouteListResponse>> getListWithServiceResponseAsync(String responseFormatType, String routeTableNo, String vpcNo, String regionCode);

    /**
     * 라우트를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteResponse object if successful.
     */
    RouteResponse add(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName);

    /**
     * 라우트를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteResponse> addAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, final ServiceCallback<RouteResponse> serviceCallback);

    /**
     * 라우트를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteResponse object
     */
    Observable<RouteResponse> addAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName);

    /**
     * 라우트를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteResponse object
     */
    Observable<ServiceResponse<RouteResponse>> addWithServiceResponseAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName);
    /**
     * 라우트를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteResponse object if successful.
     */
    RouteResponse add(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, String regionCode);

    /**
     * 라우트를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteResponse> addAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, String regionCode, final ServiceCallback<RouteResponse> serviceCallback);

    /**
     * 라우트를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteResponse object
     */
    Observable<RouteResponse> addAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, String regionCode);

    /**
     * 라우트를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteResponse object
     */
    Observable<ServiceResponse<RouteResponse>> addWithServiceResponseAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, String regionCode);

    /**
     * 라우트를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteResponse object if successful.
     */
    RouteResponse remove(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName);

    /**
     * 라우트를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteResponse> removeAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, final ServiceCallback<RouteResponse> serviceCallback);

    /**
     * 라우트를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteResponse object
     */
    Observable<RouteResponse> removeAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName);

    /**
     * 라우트를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteResponse object
     */
    Observable<ServiceResponse<RouteResponse>> removeWithServiceResponseAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName);
    /**
     * 라우트를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteResponse object if successful.
     */
    RouteResponse remove(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, String regionCode);

    /**
     * 라우트를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteResponse> removeAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, String regionCode, final ServiceCallback<RouteResponse> serviceCallback);

    /**
     * 라우트를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteResponse object
     */
    Observable<RouteResponse> removeAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, String regionCode);

    /**
     * 라우트를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param routeListNdestinationCidrBlock 목적지 CIDR 블록
     * @param routeListNtargetTypeCode 목적지 유형 코드. Possible values include: 'NATGW', 'VPCPEERING', 'VGW'
     * @param routeListNtargetNo 목적지 번호
     * @param routeListNtargetName 목적지 이름
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteResponse object
     */
    Observable<ServiceResponse<RouteResponse>> removeWithServiceResponseAsync(String responseFormatType, String vpcNo, String routeTableNo, String routeListNdestinationCidrBlock, TargetTypeCode routeListNtargetTypeCode, String routeListNtargetNo, String routeListNtargetName, String regionCode);

}
