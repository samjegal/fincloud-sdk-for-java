/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc;

import com.fincloud.vpc.models.RouteTableSubnetListResponse;
import com.fincloud.vpc.models.RouteTableSubnetResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in RouteTableSubnets.
 */
public interface RouteTableSubnets {
    /**
     * 라우트 테이블에 연관된 서브넷 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableSubnetListResponse object if successful.
     */
    RouteTableSubnetListResponse getList(String responseFormatType, String routeTableNo);

    /**
     * 라우트 테이블에 연관된 서브넷 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteTableSubnetListResponse> getListAsync(String responseFormatType, String routeTableNo, final ServiceCallback<RouteTableSubnetListResponse> serviceCallback);

    /**
     * 라우트 테이블에 연관된 서브넷 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetListResponse object
     */
    Observable<RouteTableSubnetListResponse> getListAsync(String responseFormatType, String routeTableNo);

    /**
     * 라우트 테이블에 연관된 서브넷 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetListResponse object
     */
    Observable<ServiceResponse<RouteTableSubnetListResponse>> getListWithServiceResponseAsync(String responseFormatType, String routeTableNo);
    /**
     * 라우트 테이블에 연관된 서브넷 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableSubnetListResponse object if successful.
     */
    RouteTableSubnetListResponse getList(String responseFormatType, String routeTableNo, String regionCode);

    /**
     * 라우트 테이블에 연관된 서브넷 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteTableSubnetListResponse> getListAsync(String responseFormatType, String routeTableNo, String regionCode, final ServiceCallback<RouteTableSubnetListResponse> serviceCallback);

    /**
     * 라우트 테이블에 연관된 서브넷 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetListResponse object
     */
    Observable<RouteTableSubnetListResponse> getListAsync(String responseFormatType, String routeTableNo, String regionCode);

    /**
     * 라우트 테이블에 연관된 서브넷 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetListResponse object
     */
    Observable<ServiceResponse<RouteTableSubnetListResponse>> getListWithServiceResponseAsync(String responseFormatType, String routeTableNo, String regionCode);

    /**
     * 라우트 테이블의 연관 서브넷을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableSubnetResponse object if successful.
     */
    RouteTableSubnetResponse add(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN);

    /**
     * 라우트 테이블의 연관 서브넷을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteTableSubnetResponse> addAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, final ServiceCallback<RouteTableSubnetResponse> serviceCallback);

    /**
     * 라우트 테이블의 연관 서브넷을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetResponse object
     */
    Observable<RouteTableSubnetResponse> addAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN);

    /**
     * 라우트 테이블의 연관 서브넷을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetResponse object
     */
    Observable<ServiceResponse<RouteTableSubnetResponse>> addWithServiceResponseAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN);
    /**
     * 라우트 테이블의 연관 서브넷을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableSubnetResponse object if successful.
     */
    RouteTableSubnetResponse add(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, String regionCode);

    /**
     * 라우트 테이블의 연관 서브넷을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteTableSubnetResponse> addAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, String regionCode, final ServiceCallback<RouteTableSubnetResponse> serviceCallback);

    /**
     * 라우트 테이블의 연관 서브넷을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetResponse object
     */
    Observable<RouteTableSubnetResponse> addAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, String regionCode);

    /**
     * 라우트 테이블의 연관 서브넷을 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetResponse object
     */
    Observable<ServiceResponse<RouteTableSubnetResponse>> addWithServiceResponseAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, String regionCode);

    /**
     * 라우트 테이블의 연관 서브넷을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableSubnetResponse object if successful.
     */
    RouteTableSubnetResponse remove(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN);

    /**
     * 라우트 테이블의 연관 서브넷을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteTableSubnetResponse> removeAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, final ServiceCallback<RouteTableSubnetResponse> serviceCallback);

    /**
     * 라우트 테이블의 연관 서브넷을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetResponse object
     */
    Observable<RouteTableSubnetResponse> removeAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN);

    /**
     * 라우트 테이블의 연관 서브넷을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetResponse object
     */
    Observable<ServiceResponse<RouteTableSubnetResponse>> removeWithServiceResponseAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN);
    /**
     * 라우트 테이블의 연관 서브넷을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableSubnetResponse object if successful.
     */
    RouteTableSubnetResponse remove(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, String regionCode);

    /**
     * 라우트 테이블의 연관 서브넷을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteTableSubnetResponse> removeAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, String regionCode, final ServiceCallback<RouteTableSubnetResponse> serviceCallback);

    /**
     * 라우트 테이블의 연관 서브넷을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetResponse object
     */
    Observable<RouteTableSubnetResponse> removeAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, String regionCode);

    /**
     * 라우트 테이블의 연관 서브넷을 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param routeTableNo 라우트 테이블 번호
     * @param subnetNoListN 서브넷 번호 리스트
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableSubnetResponse object
     */
    Observable<ServiceResponse<RouteTableSubnetResponse>> removeWithServiceResponseAsync(String responseFormatType, String vpcNo, String routeTableNo, String subnetNoListN, String regionCode);

}
