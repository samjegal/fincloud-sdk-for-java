/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens;

import com.fincloud.sens.models.PushChannelRequestParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Channels.
 */
public interface Channels {
    /**
     * 채널 생성.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channel 생성할 채널명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create(String serviceId, PushChannelRequestParameter channel);

    /**
     * 채널 생성.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channel 생성할 채널명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(String serviceId, PushChannelRequestParameter channel, final ServiceCallback<Void> serviceCallback);

    /**
     * 채널 생성.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channel 생성할 채널명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync(String serviceId, PushChannelRequestParameter channel);

    /**
     * 채널 생성.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channel 생성할 채널명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync(String serviceId, PushChannelRequestParameter channel);

    /**
     * 채널에 사용자 추가.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channelName 사용자를 추가할 채널명
     * @param userId 디바이스 토큰 등록 시 바인딩한 사용자 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void addUser(String serviceId, String channelName, String userId);

    /**
     * 채널에 사용자 추가.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channelName 사용자를 추가할 채널명
     * @param userId 디바이스 토큰 등록 시 바인딩한 사용자 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> addUserAsync(String serviceId, String channelName, String userId, final ServiceCallback<Void> serviceCallback);

    /**
     * 채널에 사용자 추가.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channelName 사용자를 추가할 채널명
     * @param userId 디바이스 토큰 등록 시 바인딩한 사용자 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> addUserAsync(String serviceId, String channelName, String userId);

    /**
     * 채널에 사용자 추가.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channelName 사용자를 추가할 채널명
     * @param userId 디바이스 토큰 등록 시 바인딩한 사용자 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> addUserWithServiceResponseAsync(String serviceId, String channelName, String userId);

    /**
     * 채널에서 사용자 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channelName 사용자를 추가할 채널명
     * @param userId 디바이스 토큰 등록 시 바인딩한 사용자 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void deleteUser(String serviceId, String channelName, String userId);

    /**
     * 채널에서 사용자 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channelName 사용자를 추가할 채널명
     * @param userId 디바이스 토큰 등록 시 바인딩한 사용자 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteUserAsync(String serviceId, String channelName, String userId, final ServiceCallback<Void> serviceCallback);

    /**
     * 채널에서 사용자 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channelName 사용자를 추가할 채널명
     * @param userId 디바이스 토큰 등록 시 바인딩한 사용자 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteUserAsync(String serviceId, String channelName, String userId);

    /**
     * 채널에서 사용자 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channelName 사용자를 추가할 채널명
     * @param userId 디바이스 토큰 등록 시 바인딩한 사용자 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteUserWithServiceResponseAsync(String serviceId, String channelName, String userId);

}
