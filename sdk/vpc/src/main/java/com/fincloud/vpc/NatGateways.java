/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc;

import com.fincloud.vpc.models.NatGatewayInstanceStatusCode;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in NatGateways.
 */
public interface NatGateways {
    /**
     * NAT Gateway 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getList(String responseFormatType);

    /**
     * NAT Gateway 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getListAsync(String responseFormatType, final ServiceCallback<Void> serviceCallback);

    /**
     * NAT Gateway 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getListAsync(String responseFormatType);

    /**
     * NAT Gateway 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getListWithServiceResponseAsync(String responseFormatType);
    /**
     * NAT Gateway 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param natGatewayInstanceNoListN NAT Gateway 인스턴스 번호 리스트
     * @param publicIp 공인 IP 주소
     * @param vpcName VPC 이름
     * @param natGatewayName NAT Gateway 이름
     * @param natGatewayInstanceStatusCode NAT Gateway 인스턴스 상태 코드. Possible values include: 'INIT', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getList(String responseFormatType, String regionCode, String natGatewayInstanceNoListN, String publicIp, String vpcName, String natGatewayName, NatGatewayInstanceStatusCode natGatewayInstanceStatusCode, String pageNo, String pageSize);

    /**
     * NAT Gateway 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param natGatewayInstanceNoListN NAT Gateway 인스턴스 번호 리스트
     * @param publicIp 공인 IP 주소
     * @param vpcName VPC 이름
     * @param natGatewayName NAT Gateway 이름
     * @param natGatewayInstanceStatusCode NAT Gateway 인스턴스 상태 코드. Possible values include: 'INIT', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getListAsync(String responseFormatType, String regionCode, String natGatewayInstanceNoListN, String publicIp, String vpcName, String natGatewayName, NatGatewayInstanceStatusCode natGatewayInstanceStatusCode, String pageNo, String pageSize, final ServiceCallback<Void> serviceCallback);

    /**
     * NAT Gateway 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param natGatewayInstanceNoListN NAT Gateway 인스턴스 번호 리스트
     * @param publicIp 공인 IP 주소
     * @param vpcName VPC 이름
     * @param natGatewayName NAT Gateway 이름
     * @param natGatewayInstanceStatusCode NAT Gateway 인스턴스 상태 코드. Possible values include: 'INIT', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getListAsync(String responseFormatType, String regionCode, String natGatewayInstanceNoListN, String publicIp, String vpcName, String natGatewayName, NatGatewayInstanceStatusCode natGatewayInstanceStatusCode, String pageNo, String pageSize);

    /**
     * NAT Gateway 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param natGatewayInstanceNoListN NAT Gateway 인스턴스 번호 리스트
     * @param publicIp 공인 IP 주소
     * @param vpcName VPC 이름
     * @param natGatewayName NAT Gateway 이름
     * @param natGatewayInstanceStatusCode NAT Gateway 인스턴스 상태 코드. Possible values include: 'INIT', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String natGatewayInstanceNoListN, String publicIp, String vpcName, String natGatewayName, NatGatewayInstanceStatusCode natGatewayInstanceStatusCode, String pageNo, String pageSize);

    /**
     * NAT Gateway 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getDetail(String responseFormatType, String natGatewayInstanceNo);

    /**
     * NAT Gateway 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getDetailAsync(String responseFormatType, String natGatewayInstanceNo, final ServiceCallback<Void> serviceCallback);

    /**
     * NAT Gateway 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getDetailAsync(String responseFormatType, String natGatewayInstanceNo);

    /**
     * NAT Gateway 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getDetailWithServiceResponseAsync(String responseFormatType, String natGatewayInstanceNo);
    /**
     * NAT Gateway 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getDetail(String responseFormatType, String natGatewayInstanceNo, String regionCode);

    /**
     * NAT Gateway 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getDetailAsync(String responseFormatType, String natGatewayInstanceNo, String regionCode, final ServiceCallback<Void> serviceCallback);

    /**
     * NAT Gateway 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getDetailAsync(String responseFormatType, String natGatewayInstanceNo, String regionCode);

    /**
     * NAT Gateway 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getDetailWithServiceResponseAsync(String responseFormatType, String natGatewayInstanceNo, String regionCode);

    /**
     * NAT Gateway 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create(String responseFormatType, String vpcNo, String zoneCode);

    /**
     * NAT Gateway 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(String responseFormatType, String vpcNo, String zoneCode, final ServiceCallback<Void> serviceCallback);

    /**
     * NAT Gateway 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync(String responseFormatType, String vpcNo, String zoneCode);

    /**
     * NAT Gateway 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync(String responseFormatType, String vpcNo, String zoneCode);
    /**
     * NAT Gateway 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @param regionCode REGION 코드
     * @param natGatewayName NAT Gateway 이름
     * @param natGatewayDescription NAT Gateway 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create(String responseFormatType, String vpcNo, String zoneCode, String regionCode, String natGatewayName, String natGatewayDescription);

    /**
     * NAT Gateway 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @param regionCode REGION 코드
     * @param natGatewayName NAT Gateway 이름
     * @param natGatewayDescription NAT Gateway 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(String responseFormatType, String vpcNo, String zoneCode, String regionCode, String natGatewayName, String natGatewayDescription, final ServiceCallback<Void> serviceCallback);

    /**
     * NAT Gateway 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @param regionCode REGION 코드
     * @param natGatewayName NAT Gateway 이름
     * @param natGatewayDescription NAT Gateway 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync(String responseFormatType, String vpcNo, String zoneCode, String regionCode, String natGatewayName, String natGatewayDescription);

    /**
     * NAT Gateway 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcNo VPC 번호
     * @param zoneCode ZONE 코드
     * @param regionCode REGION 코드
     * @param natGatewayName NAT Gateway 이름
     * @param natGatewayDescription NAT Gateway 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync(String responseFormatType, String vpcNo, String zoneCode, String regionCode, String natGatewayName, String natGatewayDescription);

    /**
     * NAT Gateway 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String responseFormatType, String natGatewayInstanceNo);

    /**
     * NAT Gateway 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String responseFormatType, String natGatewayInstanceNo, final ServiceCallback<Void> serviceCallback);

    /**
     * NAT Gateway 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String responseFormatType, String natGatewayInstanceNo);

    /**
     * NAT Gateway 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String responseFormatType, String natGatewayInstanceNo);
    /**
     * NAT Gateway 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String responseFormatType, String natGatewayInstanceNo, String regionCode);

    /**
     * NAT Gateway 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String responseFormatType, String natGatewayInstanceNo, String regionCode, final ServiceCallback<Void> serviceCallback);

    /**
     * NAT Gateway 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String responseFormatType, String natGatewayInstanceNo, String regionCode);

    /**
     * NAT Gateway 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param natGatewayInstanceNo NAT Gateway 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String responseFormatType, String natGatewayInstanceNo, String regionCode);

}
