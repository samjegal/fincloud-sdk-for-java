/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server;

import com.fincloud.server.models.ServerProductListResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ServerProducts.
 */
public interface ServerProducts {
    /**
     * 서버 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerProductListResponse object if successful.
     */
    ServerProductListResponse getList(String responseFormatType, String serverImageProductCode);

    /**
     * 서버 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerProductListResponse> getListAsync(String responseFormatType, String serverImageProductCode, final ServiceCallback<ServerProductListResponse> serviceCallback);

    /**
     * 서버 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerProductListResponse object
     */
    Observable<ServerProductListResponse> getListAsync(String responseFormatType, String serverImageProductCode);

    /**
     * 서버 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerProductListResponse object
     */
    Observable<ServiceResponse<ServerProductListResponse>> getListWithServiceResponseAsync(String responseFormatType, String serverImageProductCode);
    /**
     * 서버 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param regionCode REGION 코드
     * @param zoneCode ZONE 코드
     * @param exclusionProductCode 제외할 상품 코드
     * @param productCode 조회할 상품 코드
     * @param generationCode 세대 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerProductListResponse object if successful.
     */
    ServerProductListResponse getList(String responseFormatType, String serverImageProductCode, String regionCode, String zoneCode, String exclusionProductCode, String productCode, String generationCode);

    /**
     * 서버 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param regionCode REGION 코드
     * @param zoneCode ZONE 코드
     * @param exclusionProductCode 제외할 상품 코드
     * @param productCode 조회할 상품 코드
     * @param generationCode 세대 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ServerProductListResponse> getListAsync(String responseFormatType, String serverImageProductCode, String regionCode, String zoneCode, String exclusionProductCode, String productCode, String generationCode, final ServiceCallback<ServerProductListResponse> serviceCallback);

    /**
     * 서버 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param regionCode REGION 코드
     * @param zoneCode ZONE 코드
     * @param exclusionProductCode 제외할 상품 코드
     * @param productCode 조회할 상품 코드
     * @param generationCode 세대 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerProductListResponse object
     */
    Observable<ServerProductListResponse> getListAsync(String responseFormatType, String serverImageProductCode, String regionCode, String zoneCode, String exclusionProductCode, String productCode, String generationCode);

    /**
     * 서버 상품 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverImageProductCode 서버 이미지 상품 코드
     * @param regionCode REGION 코드
     * @param zoneCode ZONE 코드
     * @param exclusionProductCode 제외할 상품 코드
     * @param productCode 조회할 상품 코드
     * @param generationCode 세대 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerProductListResponse object
     */
    Observable<ServiceResponse<ServerProductListResponse>> getListWithServiceResponseAsync(String responseFormatType, String serverImageProductCode, String regionCode, String zoneCode, String exclusionProductCode, String productCode, String generationCode);

}
