/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.implementation;

import retrofit2.Retrofit;
import com.fincloud.sens.Devices;
import com.fincloud.sens.models.PushUserRequestParameter;
import com.fincloud.sens.models.PushUserResponseParameter;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Devices.
 */
public class DevicesImpl implements Devices {
    /** The Retrofit service to perform REST calls. */
    private DevicesService service;
    /** The service client containing this operation class. */
    private SENSManagementClientImpl client;

    /**
     * Initializes an instance of Devices.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DevicesImpl(Retrofit retrofit, SENSManagementClientImpl client) {
        this.service = retrofit.create(DevicesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Devices to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DevicesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.Devices create" })
        @POST("push/v2/services/{serviceId}/users")
        Observable<Response<ResponseBody>> create(@Path(value = "serviceId", encoded = true) String serviceId, @Body PushUserRequestParameter parameter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.Devices get" })
        @GET("push/v2/services/{serviceId}/users/{userId}")
        Observable<Response<ResponseBody>> get(@Path(value = "serviceId", encoded = true) String serviceId, @Path("userId") String userId);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.Devices delete" })
        @HTTP(path = "push/v2/services/{serviceId}/users/{userId}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path(value = "serviceId", encoded = true) String serviceId, @Path("userId") String userId);

    }

    /**
     * 디바이스 등록.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter the PushUserRequestParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void create(String serviceId, PushUserRequestParameter parameter) {
        createWithServiceResponseAsync(serviceId, parameter).toBlocking().single().body();
    }

    /**
     * 디바이스 등록.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter the PushUserRequestParameter value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> createAsync(String serviceId, PushUserRequestParameter parameter, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(serviceId, parameter), serviceCallback);
    }

    /**
     * 디바이스 등록.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter the PushUserRequestParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> createAsync(String serviceId, PushUserRequestParameter parameter) {
        return createWithServiceResponseAsync(serviceId, parameter).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 디바이스 등록.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter the PushUserRequestParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> createWithServiceResponseAsync(String serviceId, PushUserRequestParameter parameter) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (parameter == null) {
            throw new IllegalArgumentException("Parameter parameter is required and cannot be null.");
        }
        Validator.validate(parameter);
        return service.create(serviceId, parameter)
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
     * 디바이스 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param userId 사용자를 식별하는 아이디. 최대 128자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PushUserResponseParameter object if successful.
     */
    public PushUserResponseParameter get(String serviceId, String userId) {
        return getWithServiceResponseAsync(serviceId, userId).toBlocking().single().body();
    }

    /**
     * 디바이스 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param userId 사용자를 식별하는 아이디. 최대 128자
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PushUserResponseParameter> getAsync(String serviceId, String userId, final ServiceCallback<PushUserResponseParameter> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(serviceId, userId), serviceCallback);
    }

    /**
     * 디바이스 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param userId 사용자를 식별하는 아이디. 최대 128자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushUserResponseParameter object
     */
    public Observable<PushUserResponseParameter> getAsync(String serviceId, String userId) {
        return getWithServiceResponseAsync(serviceId, userId).map(new Func1<ServiceResponse<PushUserResponseParameter>, PushUserResponseParameter>() {
            @Override
            public PushUserResponseParameter call(ServiceResponse<PushUserResponseParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 디바이스 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param userId 사용자를 식별하는 아이디. 최대 128자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushUserResponseParameter object
     */
    public Observable<ServiceResponse<PushUserResponseParameter>> getWithServiceResponseAsync(String serviceId, String userId) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (userId == null) {
            throw new IllegalArgumentException("Parameter userId is required and cannot be null.");
        }
        return service.get(serviceId, userId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PushUserResponseParameter>>>() {
                @Override
                public Observable<ServiceResponse<PushUserResponseParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PushUserResponseParameter> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PushUserResponseParameter> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PushUserResponseParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PushUserResponseParameter>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 디바이스 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param userId 사용자를 식별하는 아이디. 최대 128자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String serviceId, String userId) {
        deleteWithServiceResponseAsync(serviceId, userId).toBlocking().single().body();
    }

    /**
     * 디바이스 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param userId 사용자를 식별하는 아이디. 최대 128자
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String serviceId, String userId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(serviceId, userId), serviceCallback);
    }

    /**
     * 디바이스 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param userId 사용자를 식별하는 아이디. 최대 128자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String serviceId, String userId) {
        return deleteWithServiceResponseAsync(serviceId, userId).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 디바이스 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param userId 사용자를 식별하는 아이디. 최대 128자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String serviceId, String userId) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (userId == null) {
            throw new IllegalArgumentException("Parameter userId is required and cannot be null.");
        }
        return service.delete(serviceId, userId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
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
