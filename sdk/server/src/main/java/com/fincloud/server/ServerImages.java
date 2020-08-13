/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server;

import com.fincloud.server.models.MemberServerImageInstanceListResponse;
import com.fincloud.server.models.MemberServerImageInstanceResponse;
import com.fincloud.server.models.MemberServerImageInstanceStatusCode;
import com.fincloud.server.models.PlatformTypeCode;
import com.fincloud.server.models.SortingOrder;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ServerImages.
 */
public interface ServerImages {
    /**
     * 회원 서버 이미지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MemberServerImageInstanceListResponse object if successful.
     */
    MemberServerImageInstanceListResponse getList(String responseFormatType);

    /**
     * 회원 서버 이미지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<MemberServerImageInstanceListResponse> getListAsync(String responseFormatType, final ServiceCallback<MemberServerImageInstanceListResponse> serviceCallback);

    /**
     * 회원 서버 이미지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceListResponse object
     */
    Observable<MemberServerImageInstanceListResponse> getListAsync(String responseFormatType);

    /**
     * 회원 서버 이미지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceListResponse object
     */
    Observable<ServiceResponse<MemberServerImageInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType);
    /**
     * 회원 서버 이미지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param memberServerImageName 회원 서버 이미지 이름
     * @param memberServerImageInstanceStatusCode 회원 서버 이미지 인스턴스 상태 코드. Possible values include: 'INIT', 'CREATE'
     * @param memberServerImageInstanceNoListN 회원 서버 이미지 인스턴스 번호 리스트
     * @param platformTypeCodeListN 플랫폼 유형 코드 리스트. Possible values include: 'LNX32', 'LNX64', 'WND32', 'WND64', 'UBD64', 'UBS64'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MemberServerImageInstanceListResponse object if successful.
     */
    MemberServerImageInstanceListResponse getList(String responseFormatType, String regionCode, String memberServerImageName, MemberServerImageInstanceStatusCode memberServerImageInstanceStatusCode, String memberServerImageInstanceNoListN, PlatformTypeCode platformTypeCodeListN, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder);

    /**
     * 회원 서버 이미지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param memberServerImageName 회원 서버 이미지 이름
     * @param memberServerImageInstanceStatusCode 회원 서버 이미지 인스턴스 상태 코드. Possible values include: 'INIT', 'CREATE'
     * @param memberServerImageInstanceNoListN 회원 서버 이미지 인스턴스 번호 리스트
     * @param platformTypeCodeListN 플랫폼 유형 코드 리스트. Possible values include: 'LNX32', 'LNX64', 'WND32', 'WND64', 'UBD64', 'UBS64'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<MemberServerImageInstanceListResponse> getListAsync(String responseFormatType, String regionCode, String memberServerImageName, MemberServerImageInstanceStatusCode memberServerImageInstanceStatusCode, String memberServerImageInstanceNoListN, PlatformTypeCode platformTypeCodeListN, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, final ServiceCallback<MemberServerImageInstanceListResponse> serviceCallback);

    /**
     * 회원 서버 이미지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param memberServerImageName 회원 서버 이미지 이름
     * @param memberServerImageInstanceStatusCode 회원 서버 이미지 인스턴스 상태 코드. Possible values include: 'INIT', 'CREATE'
     * @param memberServerImageInstanceNoListN 회원 서버 이미지 인스턴스 번호 리스트
     * @param platformTypeCodeListN 플랫폼 유형 코드 리스트. Possible values include: 'LNX32', 'LNX64', 'WND32', 'WND64', 'UBD64', 'UBS64'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceListResponse object
     */
    Observable<MemberServerImageInstanceListResponse> getListAsync(String responseFormatType, String regionCode, String memberServerImageName, MemberServerImageInstanceStatusCode memberServerImageInstanceStatusCode, String memberServerImageInstanceNoListN, PlatformTypeCode platformTypeCodeListN, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder);

    /**
     * 회원 서버 이미지 인스턴스 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param memberServerImageName 회원 서버 이미지 이름
     * @param memberServerImageInstanceStatusCode 회원 서버 이미지 인스턴스 상태 코드. Possible values include: 'INIT', 'CREATE'
     * @param memberServerImageInstanceNoListN 회원 서버 이미지 인스턴스 번호 리스트
     * @param platformTypeCodeListN 플랫폼 유형 코드 리스트. Possible values include: 'LNX32', 'LNX64', 'WND32', 'WND64', 'UBD64', 'UBS64'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceListResponse object
     */
    Observable<ServiceResponse<MemberServerImageInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String memberServerImageName, MemberServerImageInstanceStatusCode memberServerImageInstanceStatusCode, String memberServerImageInstanceNoListN, PlatformTypeCode platformTypeCodeListN, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder);

    /**
     * 회원 서버 이미지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MemberServerImageInstanceListResponse object if successful.
     */
    MemberServerImageInstanceListResponse getDetail(String responseFormatType, String memberServerImageInstanceNo);

    /**
     * 회원 서버 이미지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<MemberServerImageInstanceListResponse> getDetailAsync(String responseFormatType, String memberServerImageInstanceNo, final ServiceCallback<MemberServerImageInstanceListResponse> serviceCallback);

    /**
     * 회원 서버 이미지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceListResponse object
     */
    Observable<MemberServerImageInstanceListResponse> getDetailAsync(String responseFormatType, String memberServerImageInstanceNo);

    /**
     * 회원 서버 이미지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceListResponse object
     */
    Observable<ServiceResponse<MemberServerImageInstanceListResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String memberServerImageInstanceNo);
    /**
     * 회원 서버 이미지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MemberServerImageInstanceListResponse object if successful.
     */
    MemberServerImageInstanceListResponse getDetail(String responseFormatType, String memberServerImageInstanceNo, String regionCode);

    /**
     * 회원 서버 이미지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<MemberServerImageInstanceListResponse> getDetailAsync(String responseFormatType, String memberServerImageInstanceNo, String regionCode, final ServiceCallback<MemberServerImageInstanceListResponse> serviceCallback);

    /**
     * 회원 서버 이미지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceListResponse object
     */
    Observable<MemberServerImageInstanceListResponse> getDetailAsync(String responseFormatType, String memberServerImageInstanceNo, String regionCode);

    /**
     * 회원 서버 이미지 인스턴스 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param memberServerImageInstanceNo 회원 서버 이미지 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceListResponse object
     */
    Observable<ServiceResponse<MemberServerImageInstanceListResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String memberServerImageInstanceNo, String regionCode);

    /**
     * 회원 서버 이미지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MemberServerImageInstanceResponse object if successful.
     */
    MemberServerImageInstanceResponse create(String responseFormatType, String serverInstanceNo);

    /**
     * 회원 서버 이미지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<MemberServerImageInstanceResponse> createAsync(String responseFormatType, String serverInstanceNo, final ServiceCallback<MemberServerImageInstanceResponse> serviceCallback);

    /**
     * 회원 서버 이미지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceResponse object
     */
    Observable<MemberServerImageInstanceResponse> createAsync(String responseFormatType, String serverInstanceNo);

    /**
     * 회원 서버 이미지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceResponse object
     */
    Observable<ServiceResponse<MemberServerImageInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String serverInstanceNo);
    /**
     * 회원 서버 이미지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param memberServerImageName 회원 서버 이미지 이름
     * @param memberServerImageDescription 회원 서버 이미지 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MemberServerImageInstanceResponse object if successful.
     */
    MemberServerImageInstanceResponse create(String responseFormatType, String serverInstanceNo, String regionCode, String memberServerImageName, String memberServerImageDescription);

    /**
     * 회원 서버 이미지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param memberServerImageName 회원 서버 이미지 이름
     * @param memberServerImageDescription 회원 서버 이미지 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<MemberServerImageInstanceResponse> createAsync(String responseFormatType, String serverInstanceNo, String regionCode, String memberServerImageName, String memberServerImageDescription, final ServiceCallback<MemberServerImageInstanceResponse> serviceCallback);

    /**
     * 회원 서버 이미지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param memberServerImageName 회원 서버 이미지 이름
     * @param memberServerImageDescription 회원 서버 이미지 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceResponse object
     */
    Observable<MemberServerImageInstanceResponse> createAsync(String responseFormatType, String serverInstanceNo, String regionCode, String memberServerImageName, String memberServerImageDescription);

    /**
     * 회원 서버 이미지 인스턴스를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param memberServerImageName 회원 서버 이미지 이름
     * @param memberServerImageDescription 회원 서버 이미지 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceResponse object
     */
    Observable<ServiceResponse<MemberServerImageInstanceResponse>> createWithServiceResponseAsync(String responseFormatType, String serverInstanceNo, String regionCode, String memberServerImageName, String memberServerImageDescription);

    /**
     * 회원 서버 이미지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MemberServerImageInstanceResponse object if successful.
     */
    MemberServerImageInstanceResponse delete(String responseFormatType);

    /**
     * 회원 서버 이미지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<MemberServerImageInstanceResponse> deleteAsync(String responseFormatType, final ServiceCallback<MemberServerImageInstanceResponse> serviceCallback);

    /**
     * 회원 서버 이미지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceResponse object
     */
    Observable<MemberServerImageInstanceResponse> deleteAsync(String responseFormatType);

    /**
     * 회원 서버 이미지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceResponse object
     */
    Observable<ServiceResponse<MemberServerImageInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType);
    /**
     * 회원 서버 이미지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param memberServerImageInstanceNoListN 회원 서버 이미지 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MemberServerImageInstanceResponse object if successful.
     */
    MemberServerImageInstanceResponse delete(String responseFormatType, String regionCode, String memberServerImageInstanceNoListN);

    /**
     * 회원 서버 이미지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param memberServerImageInstanceNoListN 회원 서버 이미지 인스턴스 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<MemberServerImageInstanceResponse> deleteAsync(String responseFormatType, String regionCode, String memberServerImageInstanceNoListN, final ServiceCallback<MemberServerImageInstanceResponse> serviceCallback);

    /**
     * 회원 서버 이미지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param memberServerImageInstanceNoListN 회원 서버 이미지 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceResponse object
     */
    Observable<MemberServerImageInstanceResponse> deleteAsync(String responseFormatType, String regionCode, String memberServerImageInstanceNoListN);

    /**
     * 회원 서버 이미지 인스턴스를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param memberServerImageInstanceNoListN 회원 서버 이미지 인스턴스 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MemberServerImageInstanceResponse object
     */
    Observable<ServiceResponse<MemberServerImageInstanceResponse>> deleteWithServiceResponseAsync(String responseFormatType, String regionCode, String memberServerImageInstanceNoListN);

}
