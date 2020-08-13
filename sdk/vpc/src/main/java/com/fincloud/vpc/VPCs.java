/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc;

import com.fincloud.vpc.models.VpcDetailResponse;
import com.fincloud.vpc.models.VpcListResponse;
import com.fincloud.vpc.models.VpcResponse;
import com.fincloud.vpc.models.VpcStatusCode;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in VPCs.
 */
public interface VPCs {
    /**
     * VPC 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcListResponse object if successful.
     */
    VpcListResponse getList(String responseFormatType);

    /**
     * VPC 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VpcListResponse> getListAsync(String responseFormatType, final ServiceCallback<VpcListResponse> serviceCallback);

    /**
     * VPC 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcListResponse object
     */
    Observable<VpcListResponse> getListAsync(String responseFormatType);

    /**
     * VPC 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcListResponse object
     */
    Observable<ServiceResponse<VpcListResponse>> getListWithServiceResponseAsync(String responseFormatType);
    /**
     * VPC 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcStatusCode VPC 상태 코드. Possible values include: 'INIT', 'CREATING', 'RUN', 'TERMTING'
     * @param vpcName VPC 이름
     * @param vpcNoListN VPC 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcListResponse object if successful.
     */
    VpcListResponse getList(String responseFormatType, String regionCode, VpcStatusCode vpcStatusCode, String vpcName, String vpcNoListN);

    /**
     * VPC 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcStatusCode VPC 상태 코드. Possible values include: 'INIT', 'CREATING', 'RUN', 'TERMTING'
     * @param vpcName VPC 이름
     * @param vpcNoListN VPC 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VpcListResponse> getListAsync(String responseFormatType, String regionCode, VpcStatusCode vpcStatusCode, String vpcName, String vpcNoListN, final ServiceCallback<VpcListResponse> serviceCallback);

    /**
     * VPC 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcStatusCode VPC 상태 코드. Possible values include: 'INIT', 'CREATING', 'RUN', 'TERMTING'
     * @param vpcName VPC 이름
     * @param vpcNoListN VPC 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcListResponse object
     */
    Observable<VpcListResponse> getListAsync(String responseFormatType, String regionCode, VpcStatusCode vpcStatusCode, String vpcName, String vpcNoListN);

    /**
     * VPC 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcStatusCode VPC 상태 코드. Possible values include: 'INIT', 'CREATING', 'RUN', 'TERMTING'
     * @param vpcName VPC 이름
     * @param vpcNoListN VPC 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcListResponse object
     */
    Observable<ServiceResponse<VpcListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, VpcStatusCode vpcStatusCode, String vpcName, String vpcNoListN);

    /**
     * VPC 상세정보를 조회.
     *
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcDetailResponse object if successful.
     */
    VpcDetailResponse getDetail(String vpcNo);

    /**
     * VPC 상세정보를 조회.
     *
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VpcDetailResponse> getDetailAsync(String vpcNo, final ServiceCallback<VpcDetailResponse> serviceCallback);

    /**
     * VPC 상세정보를 조회.
     *
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcDetailResponse object
     */
    Observable<VpcDetailResponse> getDetailAsync(String vpcNo);

    /**
     * VPC 상세정보를 조회.
     *
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcDetailResponse object
     */
    Observable<ServiceResponse<VpcDetailResponse>> getDetailWithServiceResponseAsync(String vpcNo);
    /**
     * VPC 상세정보를 조회.
     *
     * @param vpcNo VPC 번호
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcDetailResponse object if successful.
     */
    VpcDetailResponse getDetail(String vpcNo, String responseFormatType, String regionCode);

    /**
     * VPC 상세정보를 조회.
     *
     * @param vpcNo VPC 번호
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VpcDetailResponse> getDetailAsync(String vpcNo, String responseFormatType, String regionCode, final ServiceCallback<VpcDetailResponse> serviceCallback);

    /**
     * VPC 상세정보를 조회.
     *
     * @param vpcNo VPC 번호
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcDetailResponse object
     */
    Observable<VpcDetailResponse> getDetailAsync(String vpcNo, String responseFormatType, String regionCode);

    /**
     * VPC 상세정보를 조회.
     *
     * @param vpcNo VPC 번호
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcDetailResponse object
     */
    Observable<ServiceResponse<VpcDetailResponse>> getDetailWithServiceResponseAsync(String vpcNo, String responseFormatType, String regionCode);

    /**
     * VPC를 생성.
     *
     * @param ipv4CidrBlock IP 주소 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcResponse object if successful.
     */
    VpcResponse create(String ipv4CidrBlock);

    /**
     * VPC를 생성.
     *
     * @param ipv4CidrBlock IP 주소 범위
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VpcResponse> createAsync(String ipv4CidrBlock, final ServiceCallback<VpcResponse> serviceCallback);

    /**
     * VPC를 생성.
     *
     * @param ipv4CidrBlock IP 주소 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcResponse object
     */
    Observable<VpcResponse> createAsync(String ipv4CidrBlock);

    /**
     * VPC를 생성.
     *
     * @param ipv4CidrBlock IP 주소 범위
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcResponse object
     */
    Observable<ServiceResponse<VpcResponse>> createWithServiceResponseAsync(String ipv4CidrBlock);
    /**
     * VPC를 생성.
     *
     * @param ipv4CidrBlock IP 주소 범위
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcName VPC 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcResponse object if successful.
     */
    VpcResponse create(String ipv4CidrBlock, String responseFormatType, String regionCode, String vpcName);

    /**
     * VPC를 생성.
     *
     * @param ipv4CidrBlock IP 주소 범위
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcName VPC 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VpcResponse> createAsync(String ipv4CidrBlock, String responseFormatType, String regionCode, String vpcName, final ServiceCallback<VpcResponse> serviceCallback);

    /**
     * VPC를 생성.
     *
     * @param ipv4CidrBlock IP 주소 범위
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcName VPC 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcResponse object
     */
    Observable<VpcResponse> createAsync(String ipv4CidrBlock, String responseFormatType, String regionCode, String vpcName);

    /**
     * VPC를 생성.
     *
     * @param ipv4CidrBlock IP 주소 범위
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcName VPC 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcResponse object
     */
    Observable<ServiceResponse<VpcResponse>> createWithServiceResponseAsync(String ipv4CidrBlock, String responseFormatType, String regionCode, String vpcName);

    /**
     * VPC를 삭제.
     *
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcResponse object if successful.
     */
    VpcResponse delete(String vpcNo);

    /**
     * VPC를 삭제.
     *
     * @param vpcNo VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VpcResponse> deleteAsync(String vpcNo, final ServiceCallback<VpcResponse> serviceCallback);

    /**
     * VPC를 삭제.
     *
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcResponse object
     */
    Observable<VpcResponse> deleteAsync(String vpcNo);

    /**
     * VPC를 삭제.
     *
     * @param vpcNo VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcResponse object
     */
    Observable<ServiceResponse<VpcResponse>> deleteWithServiceResponseAsync(String vpcNo);
    /**
     * VPC를 삭제.
     *
     * @param vpcNo VPC 번호
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcResponse object if successful.
     */
    VpcResponse delete(String vpcNo, String responseFormatType, String regionCode);

    /**
     * VPC를 삭제.
     *
     * @param vpcNo VPC 번호
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VpcResponse> deleteAsync(String vpcNo, String responseFormatType, String regionCode, final ServiceCallback<VpcResponse> serviceCallback);

    /**
     * VPC를 삭제.
     *
     * @param vpcNo VPC 번호
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcResponse object
     */
    Observable<VpcResponse> deleteAsync(String vpcNo, String responseFormatType, String regionCode);

    /**
     * VPC를 삭제.
     *
     * @param vpcNo VPC 번호
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcResponse object
     */
    Observable<ServiceResponse<VpcResponse>> deleteWithServiceResponseAsync(String vpcNo, String responseFormatType, String regionCode);

}
