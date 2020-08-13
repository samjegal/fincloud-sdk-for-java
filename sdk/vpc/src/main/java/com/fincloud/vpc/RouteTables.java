/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc;

import com.fincloud.vpc.models.RouteTableDetailResponse;
import com.fincloud.vpc.models.RouteTableListResponse;
import com.fincloud.vpc.models.RouteTableResponse;
import com.fincloud.vpc.models.SortingOrder;
import com.fincloud.vpc.models.SupportedSubnetTypeCode;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in RouteTables.
 */
public interface RouteTables {
    /**
     * 라우트 테이블 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableListResponse object if successful.
     */
    RouteTableListResponse getList(String responseFormatType);

    /**
     * 라우트 테이블 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteTableListResponse> getListAsync(String responseFormatType, final ServiceCallback<RouteTableListResponse> serviceCallback);

    /**
     * 라우트 테이블 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableListResponse object
     */
    Observable<RouteTableListResponse> getListAsync(String responseFormatType);

    /**
     * 라우트 테이블 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableListResponse object
     */
    Observable<ServiceResponse<RouteTableListResponse>> getListWithServiceResponseAsync(String responseFormatType);
    /**
     * 라우트 테이블 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param routeTableNoListN 라우트 테이블 번호 리스트
     * @param routeTableName 라우트 테이블 이름
     * @param supportedSubnetTypeCode 지원하는 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableListResponse object if successful.
     */
    RouteTableListResponse getList(String responseFormatType, String regionCode, String routeTableNoListN, String routeTableName, SupportedSubnetTypeCode supportedSubnetTypeCode, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, String vpcNo);

    /**
     * 라우트 테이블 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param routeTableNoListN 라우트 테이블 번호 리스트
     * @param routeTableName 라우트 테이블 이름
     * @param supportedSubnetTypeCode 지원하는 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteTableListResponse> getListAsync(String responseFormatType, String regionCode, String routeTableNoListN, String routeTableName, SupportedSubnetTypeCode supportedSubnetTypeCode, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, String vpcNo, final ServiceCallback<RouteTableListResponse> serviceCallback);

    /**
     * 라우트 테이블 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param routeTableNoListN 라우트 테이블 번호 리스트
     * @param routeTableName 라우트 테이블 이름
     * @param supportedSubnetTypeCode 지원하는 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableListResponse object
     */
    Observable<RouteTableListResponse> getListAsync(String responseFormatType, String regionCode, String routeTableNoListN, String routeTableName, SupportedSubnetTypeCode supportedSubnetTypeCode, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, String vpcNo);

    /**
     * 라우트 테이블 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param routeTableNoListN 라우트 테이블 번호 리스트
     * @param routeTableName 라우트 테이블 이름
     * @param supportedSubnetTypeCode 지원하는 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableListResponse object
     */
    Observable<ServiceResponse<RouteTableListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String routeTableNoListN, String routeTableName, SupportedSubnetTypeCode supportedSubnetTypeCode, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, String vpcNo);

    /**
     * 라우트 테이블 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableDetailResponse object if successful.
     */
    RouteTableDetailResponse getDetail(String responseFormatType, String routeTableNo);

    /**
     * 라우트 테이블 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteTableDetailResponse> getDetailAsync(String responseFormatType, String routeTableNo, final ServiceCallback<RouteTableDetailResponse> serviceCallback);

    /**
     * 라우트 테이블 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableDetailResponse object
     */
    Observable<RouteTableDetailResponse> getDetailAsync(String responseFormatType, String routeTableNo);

    /**
     * 라우트 테이블 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableDetailResponse object
     */
    Observable<ServiceResponse<RouteTableDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String routeTableNo);
    /**
     * 라우트 테이블 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableDetailResponse object if successful.
     */
    RouteTableDetailResponse getDetail(String responseFormatType, String routeTableNo, String regionCode);

    /**
     * 라우트 테이블 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteTableDetailResponse> getDetailAsync(String responseFormatType, String routeTableNo, String regionCode, final ServiceCallback<RouteTableDetailResponse> serviceCallback);

    /**
     * 라우트 테이블 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableDetailResponse object
     */
    Observable<RouteTableDetailResponse> getDetailAsync(String responseFormatType, String routeTableNo, String regionCode);

    /**
     * 라우트 테이블 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableDetailResponse object
     */
    Observable<ServiceResponse<RouteTableDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String routeTableNo, String regionCode);

    /**
     * 라우트 테이블을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableResponse object if successful.
     */
    RouteTableResponse create(String responseFormatType, String vpcNo);

    /**
     * 라우트 테이블을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteTableResponse> createAsync(String responseFormatType, String vpcNo, final ServiceCallback<RouteTableResponse> serviceCallback);

    /**
     * 라우트 테이블을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableResponse object
     */
    Observable<RouteTableResponse> createAsync(String responseFormatType, String vpcNo);

    /**
     * 라우트 테이블을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableResponse object
     */
    Observable<ServiceResponse<RouteTableResponse>> createWithServiceResponseAsync(String responseFormatType, String vpcNo);
    /**
     * 라우트 테이블을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param routeTableName 라우트 테이블 이름
     * @param supportedSubnetTypeCode 지원하는 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param routeTableDescription 라우트 테이블 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableResponse object if successful.
     */
    RouteTableResponse create(String responseFormatType, String vpcNo, String regionCode, String routeTableName, SupportedSubnetTypeCode supportedSubnetTypeCode, String routeTableDescription);

    /**
     * 라우트 테이블을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param routeTableName 라우트 테이블 이름
     * @param supportedSubnetTypeCode 지원하는 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param routeTableDescription 라우트 테이블 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteTableResponse> createAsync(String responseFormatType, String vpcNo, String regionCode, String routeTableName, SupportedSubnetTypeCode supportedSubnetTypeCode, String routeTableDescription, final ServiceCallback<RouteTableResponse> serviceCallback);

    /**
     * 라우트 테이블을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param routeTableName 라우트 테이블 이름
     * @param supportedSubnetTypeCode 지원하는 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param routeTableDescription 라우트 테이블 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableResponse object
     */
    Observable<RouteTableResponse> createAsync(String responseFormatType, String vpcNo, String regionCode, String routeTableName, SupportedSubnetTypeCode supportedSubnetTypeCode, String routeTableDescription);

    /**
     * 라우트 테이블을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param regionCode REGION 코드
     * @param routeTableName 라우트 테이블 이름
     * @param supportedSubnetTypeCode 지원하는 서브넷 유형 코드. Possible values include: 'PUBLIC', 'PRIVATE'
     * @param routeTableDescription 라우트 테이블 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableResponse object
     */
    Observable<ServiceResponse<RouteTableResponse>> createWithServiceResponseAsync(String responseFormatType, String vpcNo, String regionCode, String routeTableName, SupportedSubnetTypeCode supportedSubnetTypeCode, String routeTableDescription);

    /**
     * 라우트 테이블을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableResponse object if successful.
     */
    RouteTableResponse delete(String responseFormatType, String routeTableNo);

    /**
     * 라우트 테이블을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteTableResponse> deleteAsync(String responseFormatType, String routeTableNo, final ServiceCallback<RouteTableResponse> serviceCallback);

    /**
     * 라우트 테이블을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableResponse object
     */
    Observable<RouteTableResponse> deleteAsync(String responseFormatType, String routeTableNo);

    /**
     * 라우트 테이블을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableResponse object
     */
    Observable<ServiceResponse<RouteTableResponse>> deleteWithServiceResponseAsync(String responseFormatType, String routeTableNo);
    /**
     * 라우트 테이블을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RouteTableResponse object if successful.
     */
    RouteTableResponse delete(String responseFormatType, String routeTableNo, String regionCode);

    /**
     * 라우트 테이블을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RouteTableResponse> deleteAsync(String responseFormatType, String routeTableNo, String regionCode, final ServiceCallback<RouteTableResponse> serviceCallback);

    /**
     * 라우트 테이블을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableResponse object
     */
    Observable<RouteTableResponse> deleteAsync(String responseFormatType, String routeTableNo, String regionCode);

    /**
     * 라우트 테이블을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param routeTableNo 라우트 테이블 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RouteTableResponse object
     */
    Observable<ServiceResponse<RouteTableResponse>> deleteWithServiceResponseAsync(String responseFormatType, String routeTableNo, String regionCode);

}
