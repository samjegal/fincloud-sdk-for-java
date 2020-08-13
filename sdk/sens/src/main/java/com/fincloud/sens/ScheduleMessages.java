/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens;

import com.fincloud.sens.models.PushScheduleFetchAllParameter;
import com.fincloud.sens.models.PushScheduleFetchParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ScheduleMessages.
 */
public interface ScheduleMessages {
    /**
     * 스케쥴 메시지 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PushScheduleFetchAllParameter object if successful.
     */
    PushScheduleFetchAllParameter list(String serviceId, String scheduleCode);

    /**
     * 스케쥴 메시지 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PushScheduleFetchAllParameter> listAsync(String serviceId, String scheduleCode, final ServiceCallback<PushScheduleFetchAllParameter> serviceCallback);

    /**
     * 스케쥴 메시지 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchAllParameter object
     */
    Observable<PushScheduleFetchAllParameter> listAsync(String serviceId, String scheduleCode);

    /**
     * 스케쥴 메시지 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchAllParameter object
     */
    Observable<ServiceResponse<PushScheduleFetchAllParameter>> listWithServiceResponseAsync(String serviceId, String scheduleCode);
    /**
     * 스케쥴 메시지 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param page 페이지 번호 (0부터 시작)
     * @param size 페이지 사이즈 (기본 20)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PushScheduleFetchAllParameter object if successful.
     */
    PushScheduleFetchAllParameter list(String serviceId, String scheduleCode, Integer page, Integer size);

    /**
     * 스케쥴 메시지 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param page 페이지 번호 (0부터 시작)
     * @param size 페이지 사이즈 (기본 20)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PushScheduleFetchAllParameter> listAsync(String serviceId, String scheduleCode, Integer page, Integer size, final ServiceCallback<PushScheduleFetchAllParameter> serviceCallback);

    /**
     * 스케쥴 메시지 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param page 페이지 번호 (0부터 시작)
     * @param size 페이지 사이즈 (기본 20)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchAllParameter object
     */
    Observable<PushScheduleFetchAllParameter> listAsync(String serviceId, String scheduleCode, Integer page, Integer size);

    /**
     * 스케쥴 메시지 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param page 페이지 번호 (0부터 시작)
     * @param size 페이지 사이즈 (기본 20)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchAllParameter object
     */
    Observable<ServiceResponse<PushScheduleFetchAllParameter>> listWithServiceResponseAsync(String serviceId, String scheduleCode, Integer page, Integer size);

    /**
     * 스케쥴 메시지 단건 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PushScheduleFetchParameter object if successful.
     */
    PushScheduleFetchParameter get(String serviceId, String scheduleCode, String messageId);

    /**
     * 스케쥴 메시지 단건 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PushScheduleFetchParameter> getAsync(String serviceId, String scheduleCode, String messageId, final ServiceCallback<PushScheduleFetchParameter> serviceCallback);

    /**
     * 스케쥴 메시지 단건 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchParameter object
     */
    Observable<PushScheduleFetchParameter> getAsync(String serviceId, String scheduleCode, String messageId);

    /**
     * 스케쥴 메시지 단건 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchParameter object
     */
    Observable<ServiceResponse<PushScheduleFetchParameter>> getWithServiceResponseAsync(String serviceId, String scheduleCode, String messageId);

    /**
     * 스케쥴 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String serviceId, String scheduleCode, String messageId);

    /**
     * 스케쥴 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String serviceId, String scheduleCode, String messageId, final ServiceCallback<Void> serviceCallback);

    /**
     * 스케쥴 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String serviceId, String scheduleCode, String messageId);

    /**
     * 스케쥴 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String serviceId, String scheduleCode, String messageId);

}
