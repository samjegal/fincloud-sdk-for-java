/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.implementation;

import retrofit2.Retrofit;
import com.fincloud.sens.Channels;
import com.fincloud.sens.models.PushChannelRequestParameter;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Channels.
 */
public class ChannelsImpl implements Channels {
    /** The Retrofit service to perform REST calls. */
    private ChannelsService service;
    /** The service client containing this operation class. */
    private SENSManagementClientImpl client;

    /**
     * Initializes an instance of Channels.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ChannelsImpl(Retrofit retrofit, SENSManagementClientImpl client) {
        this.service = retrofit.create(ChannelsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Channels to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ChannelsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.Channels create" })
        @POST("push/v2/services/{serviceId}/channels")
        Observable<Response<ResponseBody>> create(@Path(value = "serviceId", encoded = true) String serviceId, @Body PushChannelRequestParameter channel);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.Channels addUser" })
        @POST("push/v2/services/{serviceId}/channels/{channelName}/users/{userId}")
        Observable<Response<ResponseBody>> addUser(@Path(value = "serviceId", encoded = true) String serviceId, @Path("channelName") String channelName, @Path("userId") String userId);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.Channels deleteUser" })
        @HTTP(path = "push/v2/services/{serviceId}/channels/{channelName}/users/{userId}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteUser(@Path(value = "serviceId", encoded = true) String serviceId, @Path("channelName") String channelName, @Path("userId") String userId);

    }

    /**
     * 채널 생성.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channel 생성할 채널명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void create(String serviceId, PushChannelRequestParameter channel) {
        createWithServiceResponseAsync(serviceId, channel).toBlocking().single().body();
    }

    /**
     * 채널 생성.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channel 생성할 채널명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> createAsync(String serviceId, PushChannelRequestParameter channel, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(serviceId, channel), serviceCallback);
    }

    /**
     * 채널 생성.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channel 생성할 채널명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> createAsync(String serviceId, PushChannelRequestParameter channel) {
        return createWithServiceResponseAsync(serviceId, channel).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 채널 생성.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channel 생성할 채널명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> createWithServiceResponseAsync(String serviceId, PushChannelRequestParameter channel) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (channel == null) {
            throw new IllegalArgumentException("Parameter channel is required and cannot be null.");
        }
        Validator.validate(channel);
        return service.create(serviceId, channel)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<Void>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(409, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

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
    public void addUser(String serviceId, String channelName, String userId) {
        addUserWithServiceResponseAsync(serviceId, channelName, userId).toBlocking().single().body();
    }

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
    public ServiceFuture<Void> addUserAsync(String serviceId, String channelName, String userId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(addUserWithServiceResponseAsync(serviceId, channelName, userId), serviceCallback);
    }

    /**
     * 채널에 사용자 추가.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channelName 사용자를 추가할 채널명
     * @param userId 디바이스 토큰 등록 시 바인딩한 사용자 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> addUserAsync(String serviceId, String channelName, String userId) {
        return addUserWithServiceResponseAsync(serviceId, channelName, userId).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 채널에 사용자 추가.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channelName 사용자를 추가할 채널명
     * @param userId 디바이스 토큰 등록 시 바인딩한 사용자 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> addUserWithServiceResponseAsync(String serviceId, String channelName, String userId) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (channelName == null) {
            throw new IllegalArgumentException("Parameter channelName is required and cannot be null.");
        }
        if (userId == null) {
            throw new IllegalArgumentException("Parameter userId is required and cannot be null.");
        }
        return service.addUser(serviceId, channelName, userId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = addUserDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> addUserDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<Void>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

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
    public void deleteUser(String serviceId, String channelName, String userId) {
        deleteUserWithServiceResponseAsync(serviceId, channelName, userId).toBlocking().single().body();
    }

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
    public ServiceFuture<Void> deleteUserAsync(String serviceId, String channelName, String userId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteUserWithServiceResponseAsync(serviceId, channelName, userId), serviceCallback);
    }

    /**
     * 채널에서 사용자 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channelName 사용자를 추가할 채널명
     * @param userId 디바이스 토큰 등록 시 바인딩한 사용자 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteUserAsync(String serviceId, String channelName, String userId) {
        return deleteUserWithServiceResponseAsync(serviceId, channelName, userId).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 채널에서 사용자 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param channelName 사용자를 추가할 채널명
     * @param userId 디바이스 토큰 등록 시 바인딩한 사용자 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteUserWithServiceResponseAsync(String serviceId, String channelName, String userId) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (channelName == null) {
            throw new IllegalArgumentException("Parameter channelName is required and cannot be null.");
        }
        if (userId == null) {
            throw new IllegalArgumentException("Parameter userId is required and cannot be null.");
        }
        return service.deleteUser(serviceId, channelName, userId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteUserDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteUserDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
