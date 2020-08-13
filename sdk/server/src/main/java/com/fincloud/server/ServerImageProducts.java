/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server;

import com.fincloud.server.models.PlatformTypeCode;
import com.fincloud.server.models.ServerImageProductListResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ServerImageProducts.
 */
public interface ServerImageProducts {
    /**
     * 서버 이미지 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerImageProductListResponse object if successful.
     */
    ServerImageProductListResponse getList(String responseFormatType);

    /**
     * 서버 이미지 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerImageProductListResponse> getListAsync(String responseFormatType, final ServiceCallback<ServerImageProductListResponse> serviceCallback);

    /**
     * 서버 이미지 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerImageProductListResponse object
     */
    Observable<ServerImageProductListResponse> getListAsync(String responseFormatType);

    /**
     * 서버 이미지 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerImageProductListResponse object
     */
    Observable<ServiceResponse<ServerImageProductListResponse>> getListWithServiceResponseAsync(String responseFormatType);
    /**
     * 서버 이미지 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param blockStorageSize 블록스토리지 사이즈
     * @param exclusionProductCode 제외할 상품 코드
     * @param productCode 조회할 상품 코드
     * @param platformTypeCodeListN 플랫폼 유형 코드 리스트. Possible values include: 'LNX32', 'LNX64', 'WND32', 'WND64', 'UBD64', 'UBS64'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerImageProductListResponse object if successful.
     */
    ServerImageProductListResponse getList(String responseFormatType, String regionCode, String blockStorageSize, String exclusionProductCode, String productCode, PlatformTypeCode platformTypeCodeListN);

    /**
     * 서버 이미지 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param blockStorageSize 블록스토리지 사이즈
     * @param exclusionProductCode 제외할 상품 코드
     * @param productCode 조회할 상품 코드
     * @param platformTypeCodeListN 플랫폼 유형 코드 리스트. Possible values include: 'LNX32', 'LNX64', 'WND32', 'WND64', 'UBD64', 'UBS64'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerImageProductListResponse> getListAsync(String responseFormatType, String regionCode, String blockStorageSize, String exclusionProductCode, String productCode, PlatformTypeCode platformTypeCodeListN, final ServiceCallback<ServerImageProductListResponse> serviceCallback);

    /**
     * 서버 이미지 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param blockStorageSize 블록스토리지 사이즈
     * @param exclusionProductCode 제외할 상품 코드
     * @param productCode 조회할 상품 코드
     * @param platformTypeCodeListN 플랫폼 유형 코드 리스트. Possible values include: 'LNX32', 'LNX64', 'WND32', 'WND64', 'UBD64', 'UBS64'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerImageProductListResponse object
     */
    Observable<ServerImageProductListResponse> getListAsync(String responseFormatType, String regionCode, String blockStorageSize, String exclusionProductCode, String productCode, PlatformTypeCode platformTypeCodeListN);

    /**
     * 서버 이미지 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param regionCode REGION 코드
     * @param blockStorageSize 블록스토리지 사이즈
     * @param exclusionProductCode 제외할 상품 코드
     * @param productCode 조회할 상품 코드
     * @param platformTypeCodeListN 플랫폼 유형 코드 리스트. Possible values include: 'LNX32', 'LNX64', 'WND32', 'WND64', 'UBD64', 'UBS64'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerImageProductListResponse object
     */
    Observable<ServiceResponse<ServerImageProductListResponse>> getListWithServiceResponseAsync(String responseFormatType, String regionCode, String blockStorageSize, String exclusionProductCode, String productCode, PlatformTypeCode platformTypeCodeListN);

}
