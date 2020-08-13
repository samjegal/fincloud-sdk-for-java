/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens;

import com.fincloud.sens.models.PushScheduleFetchAllParameter;
import com.fincloud.sens.models.PushScheduleFetchParameter;
import com.fincloud.sens.models.PushScheduleRegisterParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Schedules.
 */
public interface Schedules {
    /**
     * 스케줄 목록 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PushScheduleFetchAllParameter object if successful.
     */
    PushScheduleFetchAllParameter list(String serviceId);

    /**
     * 스케줄 목록 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PushScheduleFetchAllParameter> listAsync(String serviceId, final ServiceCallback<PushScheduleFetchAllParameter> serviceCallback);

    /**
     * 스케줄 목록 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchAllParameter object
     */
    Observable<PushScheduleFetchAllParameter> listAsync(String serviceId);

    /**
     * 스케줄 목록 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchAllParameter object
     */
    Observable<ServiceResponse<PushScheduleFetchAllParameter>> listWithServiceResponseAsync(String serviceId);
    /**
     * 스케줄 목록 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param page 페이지 (0부터 시작)
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param size 페이지 크기 (기본 20)
     * @param sort 정렬 항목 (asc|desc)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PushScheduleFetchAllParameter object if successful.
     */
    PushScheduleFetchAllParameter list(String serviceId, Integer page, String scheduleCode, Integer size, String sort);

    /**
     * 스케줄 목록 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param page 페이지 (0부터 시작)
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param size 페이지 크기 (기본 20)
     * @param sort 정렬 항목 (asc|desc)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PushScheduleFetchAllParameter> listAsync(String serviceId, Integer page, String scheduleCode, Integer size, String sort, final ServiceCallback<PushScheduleFetchAllParameter> serviceCallback);

    /**
     * 스케줄 목록 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param page 페이지 (0부터 시작)
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param size 페이지 크기 (기본 20)
     * @param sort 정렬 항목 (asc|desc)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchAllParameter object
     */
    Observable<PushScheduleFetchAllParameter> listAsync(String serviceId, Integer page, String scheduleCode, Integer size, String sort);

    /**
     * 스케줄 목록 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param page 페이지 (0부터 시작)
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param size 페이지 크기 (기본 20)
     * @param sort 정렬 항목 (asc|desc)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchAllParameter object
     */
    Observable<ServiceResponse<PushScheduleFetchAllParameter>> listWithServiceResponseAsync(String serviceId, Integer page, String scheduleCode, Integer size, String sort);

    /**
     * 스케줄 등록.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter the PushScheduleRegisterParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create(String serviceId, PushScheduleRegisterParameter parameter);

    /**
     * 스케줄 등록.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter the PushScheduleRegisterParameter value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(String serviceId, PushScheduleRegisterParameter parameter, final ServiceCallback<Void> serviceCallback);

    /**
     * 스케줄 등록.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter the PushScheduleRegisterParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync(String serviceId, PushScheduleRegisterParameter parameter);

    /**
     * 스케줄 등록.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter the PushScheduleRegisterParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync(String serviceId, PushScheduleRegisterParameter parameter);

    /**
     * 스케쥴 단건 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PushScheduleFetchParameter object if successful.
     */
    PushScheduleFetchParameter get(String serviceId, String scheduleCode);

    /**
     * 스케쥴 단건 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PushScheduleFetchParameter> getAsync(String serviceId, String scheduleCode, final ServiceCallback<PushScheduleFetchParameter> serviceCallback);

    /**
     * 스케쥴 단건 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchParameter object
     */
    Observable<PushScheduleFetchParameter> getAsync(String serviceId, String scheduleCode);

    /**
     * 스케쥴 단건 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchParameter object
     */
    Observable<ServiceResponse<PushScheduleFetchParameter>> getWithServiceResponseAsync(String serviceId, String scheduleCode);

    /**
     * 스케쥴 수정.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param parameter the PushScheduleRegisterParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PushScheduleFetchParameter object if successful.
     */
    PushScheduleFetchParameter put(String serviceId, String scheduleCode, PushScheduleRegisterParameter parameter);

    /**
     * 스케쥴 수정.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param parameter the PushScheduleRegisterParameter value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PushScheduleFetchParameter> putAsync(String serviceId, String scheduleCode, PushScheduleRegisterParameter parameter, final ServiceCallback<PushScheduleFetchParameter> serviceCallback);

    /**
     * 스케쥴 수정.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param parameter the PushScheduleRegisterParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchParameter object
     */
    Observable<PushScheduleFetchParameter> putAsync(String serviceId, String scheduleCode, PushScheduleRegisterParameter parameter);

    /**
     * 스케쥴 수정.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param parameter the PushScheduleRegisterParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchParameter object
     */
    Observable<ServiceResponse<PushScheduleFetchParameter>> putWithServiceResponseAsync(String serviceId, String scheduleCode, PushScheduleRegisterParameter parameter);

    /**
     * 스케쥴 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String serviceId, String scheduleCode);

    /**
     * 스케쥴 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String serviceId, String scheduleCode, final ServiceCallback<Void> serviceCallback);

    /**
     * 스케쥴 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String serviceId, String scheduleCode);

    /**
     * 스케쥴 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String serviceId, String scheduleCode);

}
