/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens;

import com.fincloud.sens.models.PushUserRequestParameter;
import com.fincloud.sens.models.PushUserResponseParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Devices.
 */
public interface Devices {
    /**
     * 디바이스 등록.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter the PushUserRequestParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create(String serviceId, PushUserRequestParameter parameter);

    /**
     * 디바이스 등록.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter the PushUserRequestParameter value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(String serviceId, PushUserRequestParameter parameter, final ServiceCallback<Void> serviceCallback);

    /**
     * 디바이스 등록.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter the PushUserRequestParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync(String serviceId, PushUserRequestParameter parameter);

    /**
     * 디바이스 등록.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter the PushUserRequestParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync(String serviceId, PushUserRequestParameter parameter);

    /**
     * 디바이스 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param userId 사용자를 식별하는 아이디. 최대 128자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PushUserResponseParameter object if successful.
     */
    PushUserResponseParameter get(String serviceId, String userId);

    /**
     * 디바이스 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param userId 사용자를 식별하는 아이디. 최대 128자
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PushUserResponseParameter> getAsync(String serviceId, String userId, final ServiceCallback<PushUserResponseParameter> serviceCallback);

    /**
     * 디바이스 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param userId 사용자를 식별하는 아이디. 최대 128자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushUserResponseParameter object
     */
    Observable<PushUserResponseParameter> getAsync(String serviceId, String userId);

    /**
     * 디바이스 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param userId 사용자를 식별하는 아이디. 최대 128자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushUserResponseParameter object
     */
    Observable<ServiceResponse<PushUserResponseParameter>> getWithServiceResponseAsync(String serviceId, String userId);

    /**
     * 디바이스 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param userId 사용자를 식별하는 아이디. 최대 128자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String serviceId, String userId);

    /**
     * 디바이스 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param userId 사용자를 식별하는 아이디. 최대 128자
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String serviceId, String userId, final ServiceCallback<Void> serviceCallback);

    /**
     * 디바이스 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param userId 사용자를 식별하는 아이디. 최대 128자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String serviceId, String userId);

    /**
     * 디바이스 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param userId 사용자를 식별하는 아이디. 최대 128자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String serviceId, String userId);

}
