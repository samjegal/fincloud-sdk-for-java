/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server;

import com.fincloud.server.models.InitScriptDetailResponse;
import com.fincloud.server.models.InitScriptListResponse;
import com.fincloud.server.models.InitScriptResponse;
import com.fincloud.server.models.OsTypeCode;
import com.fincloud.server.models.SortingOrder;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in InitScripts.
 */
public interface InitScripts {
    /**
     * 초기화 스크립트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InitScriptListResponse object if successful.
     */
    InitScriptListResponse getList(String responseFormatType);

    /**
     * 초기화 스크립트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<InitScriptListResponse> getListAsync(String responseFormatType, final ServiceCallback<InitScriptListResponse> serviceCallback);

    /**
     * 초기화 스크립트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptListResponse object
     */
    Observable<InitScriptListResponse> getListAsync(String responseFormatType);

    /**
     * 초기화 스크립트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptListResponse object
     */
    Observable<ServiceResponse<InitScriptListResponse>> getListWithServiceResponseAsync(String responseFormatType);
    /**
     * 초기화 스크립트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param osTypeCode OS 유형 코드. Possible values include: 'LNX', 'WND'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param initScriptName 초기화 스크립트 이름
     * @param initScriptNoListN 초기화 스크립트 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InitScriptListResponse object if successful.
     */
    InitScriptListResponse getList(String responseFormatType, String regionCode, OsTypeCode osTypeCode, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, String initScriptName, String initScriptNoListN);

    /**
     * 초기화 스크립트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param osTypeCode OS 유형 코드. Possible values include: 'LNX', 'WND'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param initScriptName 초기화 스크립트 이름
     * @param initScriptNoListN 초기화 스크립트 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<InitScriptListResponse> getListAsync(String responseFormatType, String regionCode, OsTypeCode osTypeCode, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, String initScriptName, String initScriptNoListN, final ServiceCallback<InitScriptListResponse> serviceCallback);

    /**
     * 초기화 스크립트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param osTypeCode OS 유형 코드. Possible values include: 'LNX', 'WND'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param initScriptName 초기화 스크립트 이름
     * @param initScriptNoListN 초기화 스크립트 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptListResponse object
     */
    Observable<InitScriptListResponse> getListAsync(String responseFormatType, String regionCode, OsTypeCode osTypeCode, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, String initScriptName, String initScriptNoListN);

    /**
     * 초기화 스크립트 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param osTypeCode OS 유형 코드. Possible values include: 'LNX', 'WND'
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param sortedBy 정렬 대상
     * @param sortingOrder 정렬 순서. Possible values include: 'ASC', 'DESC'
     * @param initScriptName 초기화 스크립트 이름
     * @param initScriptNoListN 초기화 스크립트 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptListResponse object
     */
    Observable<ServiceResponse<InitScriptListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, OsTypeCode osTypeCode, String pageNo, String pageSize, String sortedBy, SortingOrder sortingOrder, String initScriptName, String initScriptNoListN);

    /**
     * 초기화 스크립트 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InitScriptDetailResponse object if successful.
     */
    InitScriptDetailResponse getDetail(String responseFormatType);

    /**
     * 초기화 스크립트 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<InitScriptDetailResponse> getDetailAsync(String responseFormatType, final ServiceCallback<InitScriptDetailResponse> serviceCallback);

    /**
     * 초기화 스크립트 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptDetailResponse object
     */
    Observable<InitScriptDetailResponse> getDetailAsync(String responseFormatType);

    /**
     * 초기화 스크립트 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptDetailResponse object
     */
    Observable<ServiceResponse<InitScriptDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType);
    /**
     * 초기화 스크립트 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param initScriptNo 초기화 스크립트 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InitScriptDetailResponse object if successful.
     */
    InitScriptDetailResponse getDetail(String responseFormatType, String regionCode, String initScriptNo);

    /**
     * 초기화 스크립트 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param initScriptNo 초기화 스크립트 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<InitScriptDetailResponse> getDetailAsync(String responseFormatType, String regionCode, String initScriptNo, final ServiceCallback<InitScriptDetailResponse> serviceCallback);

    /**
     * 초기화 스크립트 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param initScriptNo 초기화 스크립트 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptDetailResponse object
     */
    Observable<InitScriptDetailResponse> getDetailAsync(String responseFormatType, String regionCode, String initScriptNo);

    /**
     * 초기화 스크립트 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param initScriptNo 초기화 스크립트 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptDetailResponse object
     */
    Observable<ServiceResponse<InitScriptDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String regionCode, String initScriptNo);

    /**
     * 초기화 스크립트를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param initScriptContent 초기화 스크립트 내용
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InitScriptResponse object if successful.
     */
    InitScriptResponse create(String responseFormatType, String initScriptContent);

    /**
     * 초기화 스크립트를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param initScriptContent 초기화 스크립트 내용
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<InitScriptResponse> createAsync(String responseFormatType, String initScriptContent, final ServiceCallback<InitScriptResponse> serviceCallback);

    /**
     * 초기화 스크립트를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param initScriptContent 초기화 스크립트 내용
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptResponse object
     */
    Observable<InitScriptResponse> createAsync(String responseFormatType, String initScriptContent);

    /**
     * 초기화 스크립트를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param initScriptContent 초기화 스크립트 내용
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptResponse object
     */
    Observable<ServiceResponse<InitScriptResponse>> createWithServiceResponseAsync(String responseFormatType, String initScriptContent);
    /**
     * 초기화 스크립트를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param initScriptContent 초기화 스크립트 내용
     * @param regionCode REGION 코드
     * @param osTypeCode OS 유형 코드. Possible values include: 'LNX', 'WND'
     * @param initScriptName 초기화 스크립트 이름
     * @param initScriptDescription 초기화 스크립트 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InitScriptResponse object if successful.
     */
    InitScriptResponse create(String responseFormatType, String initScriptContent, String regionCode, OsTypeCode osTypeCode, String initScriptName, String initScriptDescription);

    /**
     * 초기화 스크립트를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param initScriptContent 초기화 스크립트 내용
     * @param regionCode REGION 코드
     * @param osTypeCode OS 유형 코드. Possible values include: 'LNX', 'WND'
     * @param initScriptName 초기화 스크립트 이름
     * @param initScriptDescription 초기화 스크립트 설명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<InitScriptResponse> createAsync(String responseFormatType, String initScriptContent, String regionCode, OsTypeCode osTypeCode, String initScriptName, String initScriptDescription, final ServiceCallback<InitScriptResponse> serviceCallback);

    /**
     * 초기화 스크립트를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param initScriptContent 초기화 스크립트 내용
     * @param regionCode REGION 코드
     * @param osTypeCode OS 유형 코드. Possible values include: 'LNX', 'WND'
     * @param initScriptName 초기화 스크립트 이름
     * @param initScriptDescription 초기화 스크립트 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptResponse object
     */
    Observable<InitScriptResponse> createAsync(String responseFormatType, String initScriptContent, String regionCode, OsTypeCode osTypeCode, String initScriptName, String initScriptDescription);

    /**
     * 초기화 스크립트를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param initScriptContent 초기화 스크립트 내용
     * @param regionCode REGION 코드
     * @param osTypeCode OS 유형 코드. Possible values include: 'LNX', 'WND'
     * @param initScriptName 초기화 스크립트 이름
     * @param initScriptDescription 초기화 스크립트 설명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptResponse object
     */
    Observable<ServiceResponse<InitScriptResponse>> createWithServiceResponseAsync(String responseFormatType, String initScriptContent, String regionCode, OsTypeCode osTypeCode, String initScriptName, String initScriptDescription);

    /**
     * 초기화 스크립트를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InitScriptResponse object if successful.
     */
    InitScriptResponse delete(String responseFormatType);

    /**
     * 초기화 스크립트를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<InitScriptResponse> deleteAsync(String responseFormatType, final ServiceCallback<InitScriptResponse> serviceCallback);

    /**
     * 초기화 스크립트를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptResponse object
     */
    Observable<InitScriptResponse> deleteAsync(String responseFormatType);

    /**
     * 초기화 스크립트를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptResponse object
     */
    Observable<ServiceResponse<InitScriptResponse>> deleteWithServiceResponseAsync(String responseFormatType);
    /**
     * 초기화 스크립트를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param initScriptNoListN 초기화 스크립트 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InitScriptResponse object if successful.
     */
    InitScriptResponse delete(String responseFormatType, String regionCode, String initScriptNoListN);

    /**
     * 초기화 스크립트를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param initScriptNoListN 초기화 스크립트 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<InitScriptResponse> deleteAsync(String responseFormatType, String regionCode, String initScriptNoListN, final ServiceCallback<InitScriptResponse> serviceCallback);

    /**
     * 초기화 스크립트를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param initScriptNoListN 초기화 스크립트 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptResponse object
     */
    Observable<InitScriptResponse> deleteAsync(String responseFormatType, String regionCode, String initScriptNoListN);

    /**
     * 초기화 스크립트를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param initScriptNoListN 초기화 스크립트 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InitScriptResponse object
     */
    Observable<ServiceResponse<InitScriptResponse>> deleteWithServiceResponseAsync(String responseFormatType, String regionCode, String initScriptNoListN);

}
