/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens;

import com.fincloud.sens.models.PushMessageRequestParameter;
import com.fincloud.sens.models.PushMessageResponseParameter;
import com.fincloud.sens.models.PushMessageResultResponseParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Messages.
 */
public interface Messages {
    /**
     * 메시지 발송.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter 생성할 채널
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PushMessageResponseParameter object if successful.
     */
    PushMessageResponseParameter send(String serviceId, PushMessageRequestParameter parameter);

    /**
     * 메시지 발송.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter 생성할 채널
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PushMessageResponseParameter> sendAsync(String serviceId, PushMessageRequestParameter parameter, final ServiceCallback<PushMessageResponseParameter> serviceCallback);

    /**
     * 메시지 발송.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter 생성할 채널
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushMessageResponseParameter object
     */
    Observable<PushMessageResponseParameter> sendAsync(String serviceId, PushMessageRequestParameter parameter);

    /**
     * 메시지 발송.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter 생성할 채널
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushMessageResponseParameter object
     */
    Observable<ServiceResponse<PushMessageResponseParameter>> sendWithServiceResponseAsync(String serviceId, PushMessageRequestParameter parameter);

    /**
     * 메시지 결과 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param requestId 메시지 발송시 반환되는 요청 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PushMessageResultResponseParameter object if successful.
     */
    PushMessageResultResponseParameter getResult(String serviceId, String requestId);

    /**
     * 메시지 결과 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param requestId 메시지 발송시 반환되는 요청 식별자
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PushMessageResultResponseParameter> getResultAsync(String serviceId, String requestId, final ServiceCallback<PushMessageResultResponseParameter> serviceCallback);

    /**
     * 메시지 결과 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param requestId 메시지 발송시 반환되는 요청 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushMessageResultResponseParameter object
     */
    Observable<PushMessageResultResponseParameter> getResultAsync(String serviceId, String requestId);

    /**
     * 메시지 결과 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param requestId 메시지 발송시 반환되는 요청 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushMessageResultResponseParameter object
     */
    Observable<ServiceResponse<PushMessageResultResponseParameter>> getResultWithServiceResponseAsync(String serviceId, String requestId);

    /**
     * 예약 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param reserveId 예약 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String serviceId, String reserveId);

    /**
     * 예약 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param reserveId 예약 발송 요청 조회시 반환되는 메시지 식별자
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String serviceId, String reserveId, final ServiceCallback<Void> serviceCallback);

    /**
     * 예약 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param reserveId 예약 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String serviceId, String reserveId);

    /**
     * 예약 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param reserveId 예약 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String serviceId, String reserveId);

}
