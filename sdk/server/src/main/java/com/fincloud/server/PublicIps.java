/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server;

import com.fincloud.server.models.PublicIpFromServerInstanceResponse;
import com.fincloud.server.models.PublicIpInstanceDetailResponse;
import com.fincloud.server.models.PublicIpInstanceListResponse;
import com.fincloud.server.models.PublicIpInstanceResponse;
import com.fincloud.server.models.PublicIpTargetServerInstanceListResponse;
import com.fincloud.server.models.PublicIpWithServerInstanceResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PublicIps.
 */
public interface PublicIps {
    /**
     * 공인 IP 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpInstanceListResponse object if successful.
     */
    PublicIpInstanceListResponse getList(String responseFormatType);

    /**
     * 공인 IP 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PublicIpInstanceListResponse> getListAsync(String responseFormatType, final ServiceCallback<PublicIpInstanceListResponse> serviceCallback);

    /**
     * 공인 IP 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceListResponse object
     */
    Observable<PublicIpInstanceListResponse> getListAsync(String responseFormatType);

    /**
     * 공인 IP 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceListResponse object
     */
    Observable<ServiceResponse<PublicIpInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType);
    /**
     * 공인 IP 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param publicIpInstanceNoListN 공인 IP 인스턴스 번호 리스트
     * @param publicIp 공인 IP 주소
     * @param privateIp 비공인 IP 주소
     * @param isAssociated 할당 여부
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpInstanceListResponse object if successful.
     */
    PublicIpInstanceListResponse getList(String responseFormatType, String regionCode, String publicIpInstanceNoListN, String publicIp, String privateIp, Boolean isAssociated);

    /**
     * 공인 IP 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param publicIpInstanceNoListN 공인 IP 인스턴스 번호 리스트
     * @param publicIp 공인 IP 주소
     * @param privateIp 비공인 IP 주소
     * @param isAssociated 할당 여부
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PublicIpInstanceListResponse> getListAsync(String responseFormatType, String regionCode, String publicIpInstanceNoListN, String publicIp, String privateIp, Boolean isAssociated, final ServiceCallback<PublicIpInstanceListResponse> serviceCallback);

    /**
     * 공인 IP 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param publicIpInstanceNoListN 공인 IP 인스턴스 번호 리스트
     * @param publicIp 공인 IP 주소
     * @param privateIp 비공인 IP 주소
     * @param isAssociated 할당 여부
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceListResponse object
     */
    Observable<PublicIpInstanceListResponse> getListAsync(String responseFormatType, String regionCode, String publicIpInstanceNoListN, String publicIp, String privateIp, Boolean isAssociated);

    /**
     * 공인 IP 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param publicIpInstanceNoListN 공인 IP 인스턴스 번호 리스트
     * @param publicIp 공인 IP 주소
     * @param privateIp 비공인 IP 주소
     * @param isAssociated 할당 여부
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceListResponse object
     */
    Observable<ServiceResponse<PublicIpInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String publicIpInstanceNoListN, String publicIp, String privateIp, Boolean isAssociated);

    /**
     * 공인 IP 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpInstanceDetailResponse object if successful.
     */
    PublicIpInstanceDetailResponse getDetail(String responseFormatType, String publicIpInstanceNo);

    /**
     * 공인 IP 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PublicIpInstanceDetailResponse> getDetailAsync(String responseFormatType, String publicIpInstanceNo, final ServiceCallback<PublicIpInstanceDetailResponse> serviceCallback);

    /**
     * 공인 IP 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceDetailResponse object
     */
    Observable<PublicIpInstanceDetailResponse> getDetailAsync(String responseFormatType, String publicIpInstanceNo);

    /**
     * 공인 IP 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceDetailResponse object
     */
    Observable<ServiceResponse<PublicIpInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String publicIpInstanceNo);
    /**
     * 공인 IP 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpInstanceDetailResponse object if successful.
     */
    PublicIpInstanceDetailResponse getDetail(String responseFormatType, String publicIpInstanceNo, String regionCode);

    /**
     * 공인 IP 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PublicIpInstanceDetailResponse> getDetailAsync(String responseFormatType, String publicIpInstanceNo, String regionCode, final ServiceCallback<PublicIpInstanceDetailResponse> serviceCallback);

    /**
     * 공인 IP 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceDetailResponse object
     */
    Observable<PublicIpInstanceDetailResponse> getDetailAsync(String responseFormatType, String publicIpInstanceNo, String regionCode);

    /**
     * 공인 IP 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceDetailResponse object
     */
    Observable<ServiceResponse<PublicIpInstanceDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String publicIpInstanceNo, String regionCode);

    /**
     * 공인 IP 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpInstanceResponse object if successful.
     */
    PublicIpInstanceResponse create(String responseFormatType);

    /**
     * 공인 IP 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PublicIpInstanceResponse> createAsync(String responseFormatType, final ServiceCallback<PublicIpInstanceResponse> serviceCallback);

    /**
     * 공인 IP 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceResponse object
     */
    Observable<PublicIpInstanceResponse> createAsync(String responseFormatType);

    /**
     * 공인 IP 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceResponse object
     */
    Observable<ServiceResponse<PublicIpInstanceResponse>> createWithServiceResponseAsync(String responseFormatType);
    /**
     * 공인 IP 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param publicIpDescription 공인 IP 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpInstanceResponse object if successful.
     */
    PublicIpInstanceResponse create(String responseFormatType, String regionCode, String serverInstanceNo, String publicIpDescription);

    /**
     * 공인 IP 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param publicIpDescription 공인 IP 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PublicIpInstanceResponse> createAsync(String responseFormatType, String regionCode, String serverInstanceNo, String publicIpDescription, final ServiceCallback<PublicIpInstanceResponse> serviceCallback);

    /**
     * 공인 IP 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param publicIpDescription 공인 IP 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceResponse object
     */
    Observable<PublicIpInstanceResponse> createAsync(String responseFormatType, String regionCode, String serverInstanceNo, String publicIpDescription);

    /**
     * 공인 IP 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param publicIpDescription 공인 IP 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceResponse object
     */
    Observable<ServiceResponse<PublicIpInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String regionCode, String serverInstanceNo, String publicIpDescription);

    /**
     * 공인 IP 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpInstanceResponse object if successful.
     */
    PublicIpInstanceResponse delete(String responseFormatType, String publicIpInstanceNo);

    /**
     * 공인 IP 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PublicIpInstanceResponse> deleteAsync(String responseFormatType, String publicIpInstanceNo, final ServiceCallback<PublicIpInstanceResponse> serviceCallback);

    /**
     * 공인 IP 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceResponse object
     */
    Observable<PublicIpInstanceResponse> deleteAsync(String responseFormatType, String publicIpInstanceNo);

    /**
     * 공인 IP 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceResponse object
     */
    Observable<ServiceResponse<PublicIpInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String publicIpInstanceNo);
    /**
     * 공인 IP 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpInstanceResponse object if successful.
     */
    PublicIpInstanceResponse delete(String responseFormatType, String publicIpInstanceNo, String regionCode);

    /**
     * 공인 IP 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PublicIpInstanceResponse> deleteAsync(String responseFormatType, String publicIpInstanceNo, String regionCode, final ServiceCallback<PublicIpInstanceResponse> serviceCallback);

    /**
     * 공인 IP 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceResponse object
     */
    Observable<PublicIpInstanceResponse> deleteAsync(String responseFormatType, String publicIpInstanceNo, String regionCode);

    /**
     * 공인 IP 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpInstanceResponse object
     */
    Observable<ServiceResponse<PublicIpInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String publicIpInstanceNo, String regionCode);

    /**
     * 공인 IP 할당 가능한 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpTargetServerInstanceListResponse object if successful.
     */
    PublicIpTargetServerInstanceListResponse getTargetList(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo);

    /**
     * 공인 IP 할당 가능한 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PublicIpTargetServerInstanceListResponse> getTargetListAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, final ServiceCallback<PublicIpTargetServerInstanceListResponse> serviceCallback);

    /**
     * 공인 IP 할당 가능한 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpTargetServerInstanceListResponse object
     */
    Observable<PublicIpTargetServerInstanceListResponse> getTargetListAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo);

    /**
     * 공인 IP 할당 가능한 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpTargetServerInstanceListResponse object
     */
    Observable<ServiceResponse<PublicIpTargetServerInstanceListResponse>> getTargetListWithServiceResponseAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo);
    /**
     * 공인 IP 할당 가능한 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpTargetServerInstanceListResponse object if successful.
     */
    PublicIpTargetServerInstanceListResponse getTargetList(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, String regionCode);

    /**
     * 공인 IP 할당 가능한 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PublicIpTargetServerInstanceListResponse> getTargetListAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, String regionCode, final ServiceCallback<PublicIpTargetServerInstanceListResponse> serviceCallback);

    /**
     * 공인 IP 할당 가능한 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpTargetServerInstanceListResponse object
     */
    Observable<PublicIpTargetServerInstanceListResponse> getTargetListAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, String regionCode);

    /**
     * 공인 IP 할당 가능한 서버 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpTargetServerInstanceListResponse object
     */
    Observable<ServiceResponse<PublicIpTargetServerInstanceListResponse>> getTargetListWithServiceResponseAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, String regionCode);

    /**
     * 공인 IP를 서버 인스턴스에 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpWithServerInstanceResponse object if successful.
     */
    PublicIpWithServerInstanceResponse associate(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo);

    /**
     * 공인 IP를 서버 인스턴스에 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PublicIpWithServerInstanceResponse> associateAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, final ServiceCallback<PublicIpWithServerInstanceResponse> serviceCallback);

    /**
     * 공인 IP를 서버 인스턴스에 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpWithServerInstanceResponse object
     */
    Observable<PublicIpWithServerInstanceResponse> associateAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo);

    /**
     * 공인 IP를 서버 인스턴스에 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpWithServerInstanceResponse object
     */
    Observable<ServiceResponse<PublicIpWithServerInstanceResponse>> associateWithServiceResponseAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo);
    /**
     * 공인 IP를 서버 인스턴스에 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpWithServerInstanceResponse object if successful.
     */
    PublicIpWithServerInstanceResponse associate(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, String regionCode);

    /**
     * 공인 IP를 서버 인스턴스에 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PublicIpWithServerInstanceResponse> associateAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, String regionCode, final ServiceCallback<PublicIpWithServerInstanceResponse> serviceCallback);

    /**
     * 공인 IP를 서버 인스턴스에 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpWithServerInstanceResponse object
     */
    Observable<PublicIpWithServerInstanceResponse> associateAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, String regionCode);

    /**
     * 공인 IP를 서버 인스턴스에 할당.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpWithServerInstanceResponse object
     */
    Observable<ServiceResponse<PublicIpWithServerInstanceResponse>> associateWithServiceResponseAsync(String responseFormatType, String publicIpInstanceNo, String serverInstanceNo, String regionCode);

    /**
     * 공인 IP를 서버 인스턴스에서 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpFromServerInstanceResponse object if successful.
     */
    PublicIpFromServerInstanceResponse disassociate(String responseFormatType);

    /**
     * 공인 IP를 서버 인스턴스에서 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PublicIpFromServerInstanceResponse> disassociateAsync(String responseFormatType, final ServiceCallback<PublicIpFromServerInstanceResponse> serviceCallback);

    /**
     * 공인 IP를 서버 인스턴스에서 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpFromServerInstanceResponse object
     */
    Observable<PublicIpFromServerInstanceResponse> disassociateAsync(String responseFormatType);

    /**
     * 공인 IP를 서버 인스턴스에서 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpFromServerInstanceResponse object
     */
    Observable<ServiceResponse<PublicIpFromServerInstanceResponse>> disassociateWithServiceResponseAsync(String responseFormatType);
    /**
     * 공인 IP를 서버 인스턴스에서 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublicIpFromServerInstanceResponse object if successful.
     */
    PublicIpFromServerInstanceResponse disassociate(String responseFormatType, String regionCode, String publicIpInstanceNo, String serverInstanceNo);

    /**
     * 공인 IP를 서버 인스턴스에서 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PublicIpFromServerInstanceResponse> disassociateAsync(String responseFormatType, String regionCode, String publicIpInstanceNo, String serverInstanceNo, final ServiceCallback<PublicIpFromServerInstanceResponse> serviceCallback);

    /**
     * 공인 IP를 서버 인스턴스에서 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpFromServerInstanceResponse object
     */
    Observable<PublicIpFromServerInstanceResponse> disassociateAsync(String responseFormatType, String regionCode, String publicIpInstanceNo, String serverInstanceNo);

    /**
     * 공인 IP를 서버 인스턴스에서 할당 해제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param publicIpInstanceNo 공인 IP 인스턴스 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublicIpFromServerInstanceResponse object
     */
    Observable<ServiceResponse<PublicIpFromServerInstanceResponse>> disassociateWithServiceResponseAsync(String responseFormatType, String regionCode, String publicIpInstanceNo, String serverInstanceNo);

}
