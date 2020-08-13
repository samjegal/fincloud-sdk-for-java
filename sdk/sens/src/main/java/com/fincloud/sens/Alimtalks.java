/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens;

import com.fincloud.sens.models.AlimTalkMessageRequestParameter;
import com.fincloud.sens.models.AlimTalkMessageResponseParameter;
import com.fincloud.sens.models.AlimTalkRequestResponseParameter;
import com.fincloud.sens.models.AlimTalkResultResponseParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Alimtalks.
 */
public interface Alimtalks {
    /**
     * 알림톡 발송 요청 조회.
     *
     * @param serviceId serviceId
     * @param requestId 요청 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AlimTalkRequestResponseParameter object if successful.
     */
    AlimTalkRequestResponseParameter getRequest(String serviceId, String requestId);

    /**
     * 알림톡 발송 요청 조회.
     *
     * @param serviceId serviceId
     * @param requestId 요청 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AlimTalkRequestResponseParameter> getRequestAsync(String serviceId, String requestId, final ServiceCallback<AlimTalkRequestResponseParameter> serviceCallback);

    /**
     * 알림톡 발송 요청 조회.
     *
     * @param serviceId serviceId
     * @param requestId 요청 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AlimTalkRequestResponseParameter object
     */
    Observable<AlimTalkRequestResponseParameter> getRequestAsync(String serviceId, String requestId);

    /**
     * 알림톡 발송 요청 조회.
     *
     * @param serviceId serviceId
     * @param requestId 요청 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AlimTalkRequestResponseParameter object
     */
    Observable<ServiceResponse<AlimTalkRequestResponseParameter>> getRequestWithServiceResponseAsync(String serviceId, String requestId);

    /**
     * 알림톡 발송 요청.
     *
     * @param serviceId serviceId
     * @param request the AlimTalkMessageRequestParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AlimTalkMessageResponseParameter object if successful.
     */
    AlimTalkMessageResponseParameter create(String serviceId, AlimTalkMessageRequestParameter request);

    /**
     * 알림톡 발송 요청.
     *
     * @param serviceId serviceId
     * @param request the AlimTalkMessageRequestParameter value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AlimTalkMessageResponseParameter> createAsync(String serviceId, AlimTalkMessageRequestParameter request, final ServiceCallback<AlimTalkMessageResponseParameter> serviceCallback);

    /**
     * 알림톡 발송 요청.
     *
     * @param serviceId serviceId
     * @param request the AlimTalkMessageRequestParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AlimTalkMessageResponseParameter object
     */
    Observable<AlimTalkMessageResponseParameter> createAsync(String serviceId, AlimTalkMessageRequestParameter request);

    /**
     * 알림톡 발송 요청.
     *
     * @param serviceId serviceId
     * @param request the AlimTalkMessageRequestParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AlimTalkMessageResponseParameter object
     */
    Observable<ServiceResponse<AlimTalkMessageResponseParameter>> createWithServiceResponseAsync(String serviceId, AlimTalkMessageRequestParameter request);

    /**
     * 알림톡 발송 결과 조회.
     *
     * @param serviceId serviceId
     * @param messageId messageId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AlimTalkResultResponseParameter object if successful.
     */
    AlimTalkResultResponseParameter getResult(String serviceId, String messageId);

    /**
     * 알림톡 발송 결과 조회.
     *
     * @param serviceId serviceId
     * @param messageId messageId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AlimTalkResultResponseParameter> getResultAsync(String serviceId, String messageId, final ServiceCallback<AlimTalkResultResponseParameter> serviceCallback);

    /**
     * 알림톡 발송 결과 조회.
     *
     * @param serviceId serviceId
     * @param messageId messageId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AlimTalkResultResponseParameter object
     */
    Observable<AlimTalkResultResponseParameter> getResultAsync(String serviceId, String messageId);

    /**
     * 알림톡 발송 결과 조회.
     *
     * @param serviceId serviceId
     * @param messageId messageId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AlimTalkResultResponseParameter object
     */
    Observable<ServiceResponse<AlimTalkResultResponseParameter>> getResultWithServiceResponseAsync(String serviceId, String messageId);

    /**
     * 예약 메시지 삭제.
     *
     * @param serviceId serviceId
     * @param reserveId reserveId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void deleteReservation(String serviceId, String reserveId);

    /**
     * 예약 메시지 삭제.
     *
     * @param serviceId serviceId
     * @param reserveId reserveId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteReservationAsync(String serviceId, String reserveId, final ServiceCallback<Void> serviceCallback);

    /**
     * 예약 메시지 삭제.
     *
     * @param serviceId serviceId
     * @param reserveId reserveId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteReservationAsync(String serviceId, String reserveId);

    /**
     * 예약 메시지 삭제.
     *
     * @param serviceId serviceId
     * @param reserveId reserveId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteReservationWithServiceResponseAsync(String serviceId, String reserveId);

    /**
     * 스케쥴 메시지 삭제.
     *
     * @param serviceId serviceId
     * @param scheduleCode scheduleCode
     * @param messageId messageId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void deleteSchedule(String serviceId, String scheduleCode, String messageId);

    /**
     * 스케쥴 메시지 삭제.
     *
     * @param serviceId serviceId
     * @param scheduleCode scheduleCode
     * @param messageId messageId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteScheduleAsync(String serviceId, String scheduleCode, String messageId, final ServiceCallback<Void> serviceCallback);

    /**
     * 스케쥴 메시지 삭제.
     *
     * @param serviceId serviceId
     * @param scheduleCode scheduleCode
     * @param messageId messageId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteScheduleAsync(String serviceId, String scheduleCode, String messageId);

    /**
     * 스케쥴 메시지 삭제.
     *
     * @param serviceId serviceId
     * @param scheduleCode scheduleCode
     * @param messageId messageId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteScheduleWithServiceResponseAsync(String serviceId, String scheduleCode, String messageId);

}
