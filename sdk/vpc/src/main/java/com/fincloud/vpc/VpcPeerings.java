/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.vpc;

import com.fincloud.vpc.models.SortedBy;
import com.fincloud.vpc.models.SortingOrder;
import com.fincloud.vpc.models.VpcPeeringInstanceResponse;
import com.fincloud.vpc.models.VpcPeeringInstanceStatusCode;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in VpcPeerings.
 */
public interface VpcPeerings {
    /**
     * VPC Peering 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getList(String responseFormatType);

    /**
     * VPC Peering 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getListAsync(String responseFormatType, final ServiceCallback<Void> serviceCallback);

    /**
     * VPC Peering 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getListAsync(String responseFormatType);

    /**
     * VPC Peering 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getListWithServiceResponseAsync(String responseFormatType);
    /**
     * VPC Peering 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcPeeringInstanceNoListN VPC Peering 인스턴스 번호 리스트
     * @param sourceVpcName 요청 VPC 이름
     * @param vpcPeeringName VPC Peering 이름
     * @param targetVpcName 수락 VPC 이름
     * @param vpcPeeringInstanceStatusCode VPC Peering 인스턴스 상태 코드. Possible values include: 'INIT', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상. Possible values include: 'vpcPeeringName', 'sourceVpcName', 'targetVpcName'
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getList(String responseFormatType, String regionCode, String vpcPeeringInstanceNoListN, String sourceVpcName, String vpcPeeringName, String targetVpcName, VpcPeeringInstanceStatusCode vpcPeeringInstanceStatusCode, String pageNo, String pageSize, SortedBy sortedBy, SortingOrder sortingOrder);

    /**
     * VPC Peering 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcPeeringInstanceNoListN VPC Peering 인스턴스 번호 리스트
     * @param sourceVpcName 요청 VPC 이름
     * @param vpcPeeringName VPC Peering 이름
     * @param targetVpcName 수락 VPC 이름
     * @param vpcPeeringInstanceStatusCode VPC Peering 인스턴스 상태 코드. Possible values include: 'INIT', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상. Possible values include: 'vpcPeeringName', 'sourceVpcName', 'targetVpcName'
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getListAsync(String responseFormatType, String regionCode, String vpcPeeringInstanceNoListN, String sourceVpcName, String vpcPeeringName, String targetVpcName, VpcPeeringInstanceStatusCode vpcPeeringInstanceStatusCode, String pageNo, String pageSize, SortedBy sortedBy, SortingOrder sortingOrder, final ServiceCallback<Void> serviceCallback);

    /**
     * VPC Peering 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcPeeringInstanceNoListN VPC Peering 인스턴스 번호 리스트
     * @param sourceVpcName 요청 VPC 이름
     * @param vpcPeeringName VPC Peering 이름
     * @param targetVpcName 수락 VPC 이름
     * @param vpcPeeringInstanceStatusCode VPC Peering 인스턴스 상태 코드. Possible values include: 'INIT', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상. Possible values include: 'vpcPeeringName', 'sourceVpcName', 'targetVpcName'
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getListAsync(String responseFormatType, String regionCode, String vpcPeeringInstanceNoListN, String sourceVpcName, String vpcPeeringName, String targetVpcName, VpcPeeringInstanceStatusCode vpcPeeringInstanceStatusCode, String pageNo, String pageSize, SortedBy sortedBy, SortingOrder sortingOrder);

    /**
     * VPC Peering 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param vpcPeeringInstanceNoListN VPC Peering 인스턴스 번호 리스트
     * @param sourceVpcName 요청 VPC 이름
     * @param vpcPeeringName VPC Peering 이름
     * @param targetVpcName 수락 VPC 이름
     * @param vpcPeeringInstanceStatusCode VPC Peering 인스턴스 상태 코드. Possible values include: 'INIT', 'RUN', 'TERMTING'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상. Possible values include: 'vpcPeeringName', 'sourceVpcName', 'targetVpcName'
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String vpcPeeringInstanceNoListN, String sourceVpcName, String vpcPeeringName, String targetVpcName, VpcPeeringInstanceStatusCode vpcPeeringInstanceStatusCode, String pageNo, String pageSize, SortedBy sortedBy, SortingOrder sortingOrder);

    /**
     * VPC Peering 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getDetail(String responseFormatType, String vpcPeeringInstanceNo);

    /**
     * VPC Peering 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getDetailAsync(String responseFormatType, String vpcPeeringInstanceNo, final ServiceCallback<Void> serviceCallback);

    /**
     * VPC Peering 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getDetailAsync(String responseFormatType, String vpcPeeringInstanceNo);

    /**
     * VPC Peering 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getDetailWithServiceResponseAsync(String responseFormatType, String vpcPeeringInstanceNo);
    /**
     * VPC Peering 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getDetail(String responseFormatType, String vpcPeeringInstanceNo, String regionCode);

    /**
     * VPC Peering 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getDetailAsync(String responseFormatType, String vpcPeeringInstanceNo, String regionCode, final ServiceCallback<Void> serviceCallback);

    /**
     * VPC Peering 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getDetailAsync(String responseFormatType, String vpcPeeringInstanceNo, String regionCode);

    /**
     * VPC Peering 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getDetailWithServiceResponseAsync(String responseFormatType, String vpcPeeringInstanceNo, String regionCode);

    /**
     * VPC Peering 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param sourceVpcNo 요청 VPC 번호
     * @param targetVpcNo 수락 VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcPeeringInstanceResponse object if successful.
     */
    VpcPeeringInstanceResponse create(String responseFormatType, String sourceVpcNo, String targetVpcNo);

    /**
     * VPC Peering 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param sourceVpcNo 요청 VPC 번호
     * @param targetVpcNo 수락 VPC 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VpcPeeringInstanceResponse> createAsync(String responseFormatType, String sourceVpcNo, String targetVpcNo, final ServiceCallback<VpcPeeringInstanceResponse> serviceCallback);

    /**
     * VPC Peering 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param sourceVpcNo 요청 VPC 번호
     * @param targetVpcNo 수락 VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    Observable<VpcPeeringInstanceResponse> createAsync(String responseFormatType, String sourceVpcNo, String targetVpcNo);

    /**
     * VPC Peering 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param sourceVpcNo 요청 VPC 번호
     * @param targetVpcNo 수락 VPC 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    Observable<ServiceResponse<VpcPeeringInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String sourceVpcNo, String targetVpcNo);
    /**
     * VPC Peering 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param sourceVpcNo 요청 VPC 번호
     * @param targetVpcNo 수락 VPC 번호
     * @param regionCode REGION 코드
     * @param vpcPeeringName VPC Peering 이름
     * @param targetVpcName 수락 VPC 이름
     * @param targetVpcLoginId 수락 VPC 소유자 ID
     * @param vpcPeeringDescription VPC Peering 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcPeeringInstanceResponse object if successful.
     */
    VpcPeeringInstanceResponse create(String responseFormatType, String sourceVpcNo, String targetVpcNo, String regionCode, String vpcPeeringName, String targetVpcName, String targetVpcLoginId, String vpcPeeringDescription);

    /**
     * VPC Peering 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param sourceVpcNo 요청 VPC 번호
     * @param targetVpcNo 수락 VPC 번호
     * @param regionCode REGION 코드
     * @param vpcPeeringName VPC Peering 이름
     * @param targetVpcName 수락 VPC 이름
     * @param targetVpcLoginId 수락 VPC 소유자 ID
     * @param vpcPeeringDescription VPC Peering 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VpcPeeringInstanceResponse> createAsync(String responseFormatType, String sourceVpcNo, String targetVpcNo, String regionCode, String vpcPeeringName, String targetVpcName, String targetVpcLoginId, String vpcPeeringDescription, final ServiceCallback<VpcPeeringInstanceResponse> serviceCallback);

    /**
     * VPC Peering 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param sourceVpcNo 요청 VPC 번호
     * @param targetVpcNo 수락 VPC 번호
     * @param regionCode REGION 코드
     * @param vpcPeeringName VPC Peering 이름
     * @param targetVpcName 수락 VPC 이름
     * @param targetVpcLoginId 수락 VPC 소유자 ID
     * @param vpcPeeringDescription VPC Peering 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    Observable<VpcPeeringInstanceResponse> createAsync(String responseFormatType, String sourceVpcNo, String targetVpcNo, String regionCode, String vpcPeeringName, String targetVpcName, String targetVpcLoginId, String vpcPeeringDescription);

    /**
     * VPC Peering 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param sourceVpcNo 요청 VPC 번호
     * @param targetVpcNo 수락 VPC 번호
     * @param regionCode REGION 코드
     * @param vpcPeeringName VPC Peering 이름
     * @param targetVpcName 수락 VPC 이름
     * @param targetVpcLoginId 수락 VPC 소유자 ID
     * @param vpcPeeringDescription VPC Peering 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    Observable<ServiceResponse<VpcPeeringInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String sourceVpcNo, String targetVpcNo, String regionCode, String vpcPeeringName, String targetVpcName, String targetVpcLoginId, String vpcPeeringDescription);

    /**
     * VPC Peering 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcPeeringInstanceResponse object if successful.
     */
    VpcPeeringInstanceResponse delete(String responseFormatType, String vpcPeeringInstanceNo);

    /**
     * VPC Peering 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VpcPeeringInstanceResponse> deleteAsync(String responseFormatType, String vpcPeeringInstanceNo, final ServiceCallback<VpcPeeringInstanceResponse> serviceCallback);

    /**
     * VPC Peering 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    Observable<VpcPeeringInstanceResponse> deleteAsync(String responseFormatType, String vpcPeeringInstanceNo);

    /**
     * VPC Peering 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    Observable<ServiceResponse<VpcPeeringInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String vpcPeeringInstanceNo);
    /**
     * VPC Peering 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcPeeringInstanceResponse object if successful.
     */
    VpcPeeringInstanceResponse delete(String responseFormatType, String vpcPeeringInstanceNo, String regionCode);

    /**
     * VPC Peering 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VpcPeeringInstanceResponse> deleteAsync(String responseFormatType, String vpcPeeringInstanceNo, String regionCode, final ServiceCallback<VpcPeeringInstanceResponse> serviceCallback);

    /**
     * VPC Peering 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    Observable<VpcPeeringInstanceResponse> deleteAsync(String responseFormatType, String vpcPeeringInstanceNo, String regionCode);

    /**
     * VPC Peering 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    Observable<ServiceResponse<VpcPeeringInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String vpcPeeringInstanceNo, String regionCode);

    /**
     * VPC Peering 요청을 수락/거절.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param isAccept 수락 여부
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcPeeringInstanceResponse object if successful.
     */
    VpcPeeringInstanceResponse acceptOrReject(String responseFormatType, String vpcPeeringInstanceNo, String isAccept);

    /**
     * VPC Peering 요청을 수락/거절.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param isAccept 수락 여부
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VpcPeeringInstanceResponse> acceptOrRejectAsync(String responseFormatType, String vpcPeeringInstanceNo, String isAccept, final ServiceCallback<VpcPeeringInstanceResponse> serviceCallback);

    /**
     * VPC Peering 요청을 수락/거절.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param isAccept 수락 여부
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    Observable<VpcPeeringInstanceResponse> acceptOrRejectAsync(String responseFormatType, String vpcPeeringInstanceNo, String isAccept);

    /**
     * VPC Peering 요청을 수락/거절.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param isAccept 수락 여부
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    Observable<ServiceResponse<VpcPeeringInstanceResponse>> acceptOrRejectWithServiceResponseAsync(String responseFormatType, String vpcPeeringInstanceNo, String isAccept);
    /**
     * VPC Peering 요청을 수락/거절.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param isAccept 수락 여부
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VpcPeeringInstanceResponse object if successful.
     */
    VpcPeeringInstanceResponse acceptOrReject(String responseFormatType, String vpcPeeringInstanceNo, String isAccept, String regionCode);

    /**
     * VPC Peering 요청을 수락/거절.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param isAccept 수락 여부
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VpcPeeringInstanceResponse> acceptOrRejectAsync(String responseFormatType, String vpcPeeringInstanceNo, String isAccept, String regionCode, final ServiceCallback<VpcPeeringInstanceResponse> serviceCallback);

    /**
     * VPC Peering 요청을 수락/거절.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param isAccept 수락 여부
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    Observable<VpcPeeringInstanceResponse> acceptOrRejectAsync(String responseFormatType, String vpcPeeringInstanceNo, String isAccept, String regionCode);

    /**
     * VPC Peering 요청을 수락/거절.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param vpcPeeringInstanceNo VPC Peering 인스턴스 번호
     * @param isAccept 수락 여부
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VpcPeeringInstanceResponse object
     */
    Observable<ServiceResponse<VpcPeeringInstanceResponse>> acceptOrRejectWithServiceResponseAsync(String responseFormatType, String vpcPeeringInstanceNo, String isAccept, String regionCode);

}
