/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens;

import com.fincloud.sens.models.SMSMessageParameter;
import com.fincloud.sens.models.SMSMessageRequestParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in SMS.
 */
public interface SMS {
    /**
     * 메시지 발송 요청 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param requestId 발송 요청 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SMSMessageParameter object if successful.
     */
    SMSMessageParameter getRequest(String serviceId, String requestId);

    /**
     * 메시지 발송 요청 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param requestId 발송 요청 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SMSMessageParameter> getRequestAsync(String serviceId, String requestId, final ServiceCallback<SMSMessageParameter> serviceCallback);

    /**
     * 메시지 발송 요청 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param requestId 발송 요청 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SMSMessageParameter object
     */
    Observable<SMSMessageParameter> getRequestAsync(String serviceId, String requestId);

    /**
     * 메시지 발송 요청 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param requestId 발송 요청 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SMSMessageParameter object
     */
    Observable<ServiceResponse<SMSMessageParameter>> getRequestWithServiceResponseAsync(String serviceId, String requestId);

    /**
     * SMS 메시지 발송 요청.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter SMS 메시지 요청 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SMSMessageParameter object if successful.
     */
    SMSMessageParameter request(String serviceId, SMSMessageRequestParameter parameter);

    /**
     * SMS 메시지 발송 요청.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter SMS 메시지 요청 정보
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SMSMessageParameter> requestAsync(String serviceId, SMSMessageRequestParameter parameter, final ServiceCallback<SMSMessageParameter> serviceCallback);

    /**
     * SMS 메시지 발송 요청.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter SMS 메시지 요청 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SMSMessageParameter object
     */
    Observable<SMSMessageParameter> requestAsync(String serviceId, SMSMessageRequestParameter parameter);

    /**
     * SMS 메시지 발송 요청.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter SMS 메시지 요청 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SMSMessageParameter object
     */
    Observable<ServiceResponse<SMSMessageParameter>> requestWithServiceResponseAsync(String serviceId, SMSMessageRequestParameter parameter);

    /**
     * 메시지 발송 결과 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param messageId 메시지 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SMSMessageParameter object if successful.
     */
    SMSMessageParameter getResult(String serviceId, String messageId);

    /**
     * 메시지 발송 결과 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param messageId 메시지 발송 요청 조회시 반환되는 메시지 식별자
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SMSMessageParameter> getResultAsync(String serviceId, String messageId, final ServiceCallback<SMSMessageParameter> serviceCallback);

    /**
     * 메시지 발송 결과 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param messageId 메시지 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SMSMessageParameter object
     */
    Observable<SMSMessageParameter> getResultAsync(String serviceId, String messageId);

    /**
     * 메시지 발송 결과 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param messageId 메시지 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SMSMessageParameter object
     */
    Observable<ServiceResponse<SMSMessageParameter>> getResultWithServiceResponseAsync(String serviceId, String messageId);

    /**
     * 예약 메시지를 취소.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param reserveId 예약 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void deleteReservation(String serviceId, String reserveId);

    /**
     * 예약 메시지를 취소.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param reserveId 예약 발송 요청 조회시 반환되는 메시지 식별자
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteReservationAsync(String serviceId, String reserveId, final ServiceCallback<Void> serviceCallback);

    /**
     * 예약 메시지를 취소.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param reserveId 예약 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteReservationAsync(String serviceId, String reserveId);

    /**
     * 예약 메시지를 취소.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param reserveId 예약 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteReservationWithServiceResponseAsync(String serviceId, String reserveId);

    /**
     * 스케쥴 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 스케줄 등록시 사용한 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void deleteSchedule(String serviceId, String scheduleCode, String messageId);

    /**
     * 스케쥴 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 스케줄 등록시 사용한 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteScheduleAsync(String serviceId, String scheduleCode, String messageId, final ServiceCallback<Void> serviceCallback);

    /**
     * 스케쥴 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 스케줄 등록시 사용한 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteScheduleAsync(String serviceId, String scheduleCode, String messageId);

    /**
     * 스케쥴 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 스케줄 등록시 사용한 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteScheduleWithServiceResponseAsync(String serviceId, String scheduleCode, String messageId);

}
