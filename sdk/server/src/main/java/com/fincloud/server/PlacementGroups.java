/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server;

import com.fincloud.server.models.PlacementGroupDetailResponse;
import com.fincloud.server.models.PlacementGroupListResponse;
import com.fincloud.server.models.PlacementGroupResponse;
import com.fincloud.server.models.PlacementGroupServerInstanceResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PlacementGroups.
 */
public interface PlacementGroups {
    /**
     * 치 그룹 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupListResponse object if successful.
     */
    PlacementGroupListResponse getList(String responseFormatType);

    /**
     * 치 그룹 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PlacementGroupListResponse> getListAsync(String responseFormatType, final ServiceCallback<PlacementGroupListResponse> serviceCallback);

    /**
     * 치 그룹 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupListResponse object
     */
    Observable<PlacementGroupListResponse> getListAsync(String responseFormatType);

    /**
     * 치 그룹 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupListResponse object
     */
    Observable<ServiceResponse<PlacementGroupListResponse>> getListWithServiceResponseAsync(String responseFormatType);
    /**
     * 치 그룹 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupName 물리 배치 그룹 이름
     * @param placementGroupNoListN 물리 배치 그룹 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupListResponse object if successful.
     */
    PlacementGroupListResponse getList(String responseFormatType, String regionCode, String placementGroupName, String placementGroupNoListN);

    /**
     * 치 그룹 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupName 물리 배치 그룹 이름
     * @param placementGroupNoListN 물리 배치 그룹 번호 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PlacementGroupListResponse> getListAsync(String responseFormatType, String regionCode, String placementGroupName, String placementGroupNoListN, final ServiceCallback<PlacementGroupListResponse> serviceCallback);

    /**
     * 치 그룹 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupName 물리 배치 그룹 이름
     * @param placementGroupNoListN 물리 배치 그룹 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupListResponse object
     */
    Observable<PlacementGroupListResponse> getListAsync(String responseFormatType, String regionCode, String placementGroupName, String placementGroupNoListN);

    /**
     * 치 그룹 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupName 물리 배치 그룹 이름
     * @param placementGroupNoListN 물리 배치 그룹 번호 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupListResponse object
     */
    Observable<ServiceResponse<PlacementGroupListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String placementGroupName, String placementGroupNoListN);

    /**
     * 물리 배치 그룹 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupDetailResponse object if successful.
     */
    PlacementGroupDetailResponse getDetail(String responseFormatType);

    /**
     * 물리 배치 그룹 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PlacementGroupDetailResponse> getDetailAsync(String responseFormatType, final ServiceCallback<PlacementGroupDetailResponse> serviceCallback);

    /**
     * 물리 배치 그룹 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupDetailResponse object
     */
    Observable<PlacementGroupDetailResponse> getDetailAsync(String responseFormatType);

    /**
     * 물리 배치 그룹 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupDetailResponse object
     */
    Observable<ServiceResponse<PlacementGroupDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType);
    /**
     * 물리 배치 그룹 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupNo 물리 배치 그룹 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupDetailResponse object if successful.
     */
    PlacementGroupDetailResponse getDetail(String responseFormatType, String regionCode, String placementGroupNo);

    /**
     * 물리 배치 그룹 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PlacementGroupDetailResponse> getDetailAsync(String responseFormatType, String regionCode, String placementGroupNo, final ServiceCallback<PlacementGroupDetailResponse> serviceCallback);

    /**
     * 물리 배치 그룹 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupNo 물리 배치 그룹 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupDetailResponse object
     */
    Observable<PlacementGroupDetailResponse> getDetailAsync(String responseFormatType, String regionCode, String placementGroupNo);

    /**
     * 물리 배치 그룹 상세 정보를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupNo 물리 배치 그룹 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupDetailResponse object
     */
    Observable<ServiceResponse<PlacementGroupDetailResponse>> getDetailWithServiceResponseAsync(String responseFormatType, String regionCode, String placementGroupNo);

    /**
     * 물리 배치 그룹을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupResponse object if successful.
     */
    PlacementGroupResponse create(String responseFormatType);

    /**
     * 물리 배치 그룹을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PlacementGroupResponse> createAsync(String responseFormatType, final ServiceCallback<PlacementGroupResponse> serviceCallback);

    /**
     * 물리 배치 그룹을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupResponse object
     */
    Observable<PlacementGroupResponse> createAsync(String responseFormatType);

    /**
     * 물리 배치 그룹을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupResponse object
     */
    Observable<ServiceResponse<PlacementGroupResponse>> createWithServiceResponseAsync(String responseFormatType);
    /**
     * 물리 배치 그룹을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupName 물리 배치 그룹 이름
     * @param placementGroupTypeCode 물리 배치 그룹 유형 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupResponse object if successful.
     */
    PlacementGroupResponse create(String responseFormatType, String regionCode, String placementGroupName, String placementGroupTypeCode);

    /**
     * 물리 배치 그룹을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupName 물리 배치 그룹 이름
     * @param placementGroupTypeCode 물리 배치 그룹 유형 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PlacementGroupResponse> createAsync(String responseFormatType, String regionCode, String placementGroupName, String placementGroupTypeCode, final ServiceCallback<PlacementGroupResponse> serviceCallback);

    /**
     * 물리 배치 그룹을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupName 물리 배치 그룹 이름
     * @param placementGroupTypeCode 물리 배치 그룹 유형 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupResponse object
     */
    Observable<PlacementGroupResponse> createAsync(String responseFormatType, String regionCode, String placementGroupName, String placementGroupTypeCode);

    /**
     * 물리 배치 그룹을 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param placementGroupName 물리 배치 그룹 이름
     * @param placementGroupTypeCode 물리 배치 그룹 유형 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupResponse object
     */
    Observable<ServiceResponse<PlacementGroupResponse>> createWithServiceResponseAsync(String responseFormatType, String regionCode, String placementGroupName, String placementGroupTypeCode);

    /**
     * 물리 배치 그룹을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupResponse object if successful.
     */
    PlacementGroupResponse delete(String responseFormatType, String placementGroupNo);

    /**
     * 물리 배치 그룹을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PlacementGroupResponse> deleteAsync(String responseFormatType, String placementGroupNo, final ServiceCallback<PlacementGroupResponse> serviceCallback);

    /**
     * 물리 배치 그룹을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupResponse object
     */
    Observable<PlacementGroupResponse> deleteAsync(String responseFormatType, String placementGroupNo);

    /**
     * 물리 배치 그룹을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupResponse object
     */
    Observable<ServiceResponse<PlacementGroupResponse>> deleteWithServiceResponseAsync(String responseFormatType, String placementGroupNo);
    /**
     * 물리 배치 그룹을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupResponse object if successful.
     */
    PlacementGroupResponse delete(String responseFormatType, String placementGroupNo, String regionCode);

    /**
     * 물리 배치 그룹을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PlacementGroupResponse> deleteAsync(String responseFormatType, String placementGroupNo, String regionCode, final ServiceCallback<PlacementGroupResponse> serviceCallback);

    /**
     * 물리 배치 그룹을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupResponse object
     */
    Observable<PlacementGroupResponse> deleteAsync(String responseFormatType, String placementGroupNo, String regionCode);

    /**
     * 물리 배치 그룹을 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupResponse object
     */
    Observable<ServiceResponse<PlacementGroupResponse>> deleteWithServiceResponseAsync(String responseFormatType, String placementGroupNo, String regionCode);

    /**
     * 물리 배치 그룹에 서버 인스턴스를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupServerInstanceResponse object if successful.
     */
    PlacementGroupServerInstanceResponse add(String responseFormatType, String placementGroupNo, String serverInstanceNo);

    /**
     * 물리 배치 그룹에 서버 인스턴스를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PlacementGroupServerInstanceResponse> addAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo, final ServiceCallback<PlacementGroupServerInstanceResponse> serviceCallback);

    /**
     * 물리 배치 그룹에 서버 인스턴스를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupServerInstanceResponse object
     */
    Observable<PlacementGroupServerInstanceResponse> addAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo);

    /**
     * 물리 배치 그룹에 서버 인스턴스를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupServerInstanceResponse object
     */
    Observable<ServiceResponse<PlacementGroupServerInstanceResponse>> addWithServiceResponseAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo);
    /**
     * 물리 배치 그룹에 서버 인스턴스를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupServerInstanceResponse object if successful.
     */
    PlacementGroupServerInstanceResponse add(String responseFormatType, String placementGroupNo, String serverInstanceNo, String regionCode);

    /**
     * 물리 배치 그룹에 서버 인스턴스를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PlacementGroupServerInstanceResponse> addAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo, String regionCode, final ServiceCallback<PlacementGroupServerInstanceResponse> serviceCallback);

    /**
     * 물리 배치 그룹에 서버 인스턴스를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupServerInstanceResponse object
     */
    Observable<PlacementGroupServerInstanceResponse> addAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo, String regionCode);

    /**
     * 물리 배치 그룹에 서버 인스턴스를 추가.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupServerInstanceResponse object
     */
    Observable<ServiceResponse<PlacementGroupServerInstanceResponse>> addWithServiceResponseAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo, String regionCode);

    /**
     * 물리 배치 그룹에서 서버 인스턴스를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupServerInstanceResponse object if successful.
     */
    PlacementGroupServerInstanceResponse remove(String responseFormatType, String placementGroupNo, String serverInstanceNo);

    /**
     * 물리 배치 그룹에서 서버 인스턴스를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PlacementGroupServerInstanceResponse> removeAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo, final ServiceCallback<PlacementGroupServerInstanceResponse> serviceCallback);

    /**
     * 물리 배치 그룹에서 서버 인스턴스를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupServerInstanceResponse object
     */
    Observable<PlacementGroupServerInstanceResponse> removeAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo);

    /**
     * 물리 배치 그룹에서 서버 인스턴스를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupServerInstanceResponse object
     */
    Observable<ServiceResponse<PlacementGroupServerInstanceResponse>> removeWithServiceResponseAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo);
    /**
     * 물리 배치 그룹에서 서버 인스턴스를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PlacementGroupServerInstanceResponse object if successful.
     */
    PlacementGroupServerInstanceResponse remove(String responseFormatType, String placementGroupNo, String serverInstanceNo, String regionCode);

    /**
     * 물리 배치 그룹에서 서버 인스턴스를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PlacementGroupServerInstanceResponse> removeAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo, String regionCode, final ServiceCallback<PlacementGroupServerInstanceResponse> serviceCallback);

    /**
     * 물리 배치 그룹에서 서버 인스턴스를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupServerInstanceResponse object
     */
    Observable<PlacementGroupServerInstanceResponse> removeAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo, String regionCode);

    /**
     * 물리 배치 그룹에서 서버 인스턴스를 제거.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param placementGroupNo 물리 배치 그룹 번호
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PlacementGroupServerInstanceResponse object
     */
    Observable<ServiceResponse<PlacementGroupServerInstanceResponse>> removeWithServiceResponseAsync(String responseFormatType, String placementGroupNo, String serverInstanceNo, String regionCode);

}
