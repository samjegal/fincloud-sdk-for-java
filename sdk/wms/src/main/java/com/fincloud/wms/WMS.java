/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.wms;

import com.fincloud.wms.models.WMSReturnParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in WMS.
 */
public interface WMS {
    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO 전체 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object list();

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO 전체 목록을 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> listAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO 전체 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> listAsync();

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO 전체 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> listWithServiceResponseAsync();

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 세부 정보를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object detail(String scriptId);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 세부 정보를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> detailAsync(String scriptId, final ServiceCallback<Object> serviceCallback);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 세부 정보를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> detailAsync(String scriptId);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 세부 정보를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> detailWithServiceResponseAsync(String scriptId);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 모니터링 결과를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object result(String scriptId);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 모니터링 결과를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> resultAsync(String scriptId, final ServiceCallback<Object> serviceCallback);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 모니터링 결과를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> resultAsync(String scriptId);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 모니터링 결과를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> resultWithServiceResponseAsync(String scriptId);
    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 모니터링 결과를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @param timestamp 조회 시간 기준
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object result(String scriptId, String timestamp);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 모니터링 결과를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @param timestamp 조회 시간 기준
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> resultAsync(String scriptId, String timestamp, final ServiceCallback<Object> serviceCallback);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 모니터링 결과를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @param timestamp 조회 시간 기준
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> resultAsync(String scriptId, String timestamp);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 모니터링 결과를 조회.
     *
     * @param scriptId 스크립트 아이디
     * @param timestamp 조회 시간 기준
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> resultWithServiceResponseAsync(String scriptId, String timestamp);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 상태를 “시작”으로 변경.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WMSReturnParameter object if successful.
     */
    WMSReturnParameter start(String scriptId);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 상태를 “시작”으로 변경.
     *
     * @param scriptId 스크립트 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<WMSReturnParameter> startAsync(String scriptId, final ServiceCallback<WMSReturnParameter> serviceCallback);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 상태를 “시작”으로 변경.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WMSReturnParameter object
     */
    Observable<WMSReturnParameter> startAsync(String scriptId);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 상태를 “시작”으로 변경.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WMSReturnParameter object
     */
    Observable<ServiceResponse<WMSReturnParameter>> startWithServiceResponseAsync(String scriptId);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 상태를 “정지”로 변경.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WMSReturnParameter object if successful.
     */
    WMSReturnParameter stop(String scriptId);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 상태를 “정지”로 변경.
     *
     * @param scriptId 스크립트 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<WMSReturnParameter> stopAsync(String scriptId, final ServiceCallback<WMSReturnParameter> serviceCallback);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 상태를 “정지”로 변경.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WMSReturnParameter object
     */
    Observable<WMSReturnParameter> stopAsync(String scriptId);

    /**
     * WMS에 등록되어 있는 URL 및 SCENARIO의 상태를 “정지”로 변경.
     *
     * @param scriptId 스크립트 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WMSReturnParameter object
     */
    Observable<ServiceResponse<WMSReturnParameter>> stopWithServiceResponseAsync(String scriptId);

}
