/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.implementation;

import retrofit2.Retrofit;
import com.fincloud.sens.Messages;
import com.fincloud.sens.models.PushMessageRequestParameter;
import com.fincloud.sens.models.PushMessageResponseParameter;
import com.fincloud.sens.models.PushMessageResultResponseParameter;
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
 * in Messages.
 */
public class MessagesImpl implements Messages {
    /** The Retrofit service to perform REST calls. */
    private MessagesService service;
    /** The service client containing this operation class. */
    private SENSManagementClientImpl client;

    /**
     * Initializes an instance of Messages.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MessagesImpl(Retrofit retrofit, SENSManagementClientImpl client) {
        this.service = retrofit.create(MessagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Messages to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MessagesService {
        @Headers({ "Content-Type: application/json; charset=UTF-8", "x-ms-logging-context: com.fincloud.sens.Messages send" })
        @POST("push/v2/services/{serviceId}/messages")
        Observable<Response<ResponseBody>> send(@Path(value = "serviceId", encoded = true) String serviceId, @Body PushMessageRequestParameter parameter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.Messages getResult" })
        @GET("push/v2/services/{serviceId}/messages/{requestId}")
        Observable<Response<ResponseBody>> getResult(@Path(value = "serviceId", encoded = true) String serviceId, @Path("requestId") String requestId);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.Messages delete" })
        @HTTP(path = "push/v2/services/{serviceId}/reservations/{reserveId}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path(value = "serviceId", encoded = true) String serviceId, @Path("reserveId") String reserveId);

    }

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
    public PushMessageResponseParameter send(String serviceId, PushMessageRequestParameter parameter) {
        return sendWithServiceResponseAsync(serviceId, parameter).toBlocking().single().body();
    }

    /**
     * 메시지 발송.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter 생성할 채널
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PushMessageResponseParameter> sendAsync(String serviceId, PushMessageRequestParameter parameter, final ServiceCallback<PushMessageResponseParameter> serviceCallback) {
        return ServiceFuture.fromResponse(sendWithServiceResponseAsync(serviceId, parameter), serviceCallback);
    }

    /**
     * 메시지 발송.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter 생성할 채널
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushMessageResponseParameter object
     */
    public Observable<PushMessageResponseParameter> sendAsync(String serviceId, PushMessageRequestParameter parameter) {
        return sendWithServiceResponseAsync(serviceId, parameter).map(new Func1<ServiceResponse<PushMessageResponseParameter>, PushMessageResponseParameter>() {
            @Override
            public PushMessageResponseParameter call(ServiceResponse<PushMessageResponseParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 메시지 발송.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter 생성할 채널
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushMessageResponseParameter object
     */
    public Observable<ServiceResponse<PushMessageResponseParameter>> sendWithServiceResponseAsync(String serviceId, PushMessageRequestParameter parameter) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (parameter == null) {
            throw new IllegalArgumentException("Parameter parameter is required and cannot be null.");
        }
        Validator.validate(parameter);
        return service.send(serviceId, parameter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PushMessageResponseParameter>>>() {
                @Override
                public Observable<ServiceResponse<PushMessageResponseParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PushMessageResponseParameter> clientResponse = sendDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PushMessageResponseParameter> sendDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PushMessageResponseParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(202, new TypeToken<PushMessageResponseParameter>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

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
    public PushMessageResultResponseParameter getResult(String serviceId, String requestId) {
        return getResultWithServiceResponseAsync(serviceId, requestId).toBlocking().single().body();
    }

    /**
     * 메시지 결과 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param requestId 메시지 발송시 반환되는 요청 식별자
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PushMessageResultResponseParameter> getResultAsync(String serviceId, String requestId, final ServiceCallback<PushMessageResultResponseParameter> serviceCallback) {
        return ServiceFuture.fromResponse(getResultWithServiceResponseAsync(serviceId, requestId), serviceCallback);
    }

    /**
     * 메시지 결과 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param requestId 메시지 발송시 반환되는 요청 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushMessageResultResponseParameter object
     */
    public Observable<PushMessageResultResponseParameter> getResultAsync(String serviceId, String requestId) {
        return getResultWithServiceResponseAsync(serviceId, requestId).map(new Func1<ServiceResponse<PushMessageResultResponseParameter>, PushMessageResultResponseParameter>() {
            @Override
            public PushMessageResultResponseParameter call(ServiceResponse<PushMessageResultResponseParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 메시지 결과 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param requestId 메시지 발송시 반환되는 요청 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushMessageResultResponseParameter object
     */
    public Observable<ServiceResponse<PushMessageResultResponseParameter>> getResultWithServiceResponseAsync(String serviceId, String requestId) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (requestId == null) {
            throw new IllegalArgumentException("Parameter requestId is required and cannot be null.");
        }
        return service.getResult(serviceId, requestId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PushMessageResultResponseParameter>>>() {
                @Override
                public Observable<ServiceResponse<PushMessageResultResponseParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PushMessageResultResponseParameter> clientResponse = getResultDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PushMessageResultResponseParameter> getResultDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PushMessageResultResponseParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PushMessageResultResponseParameter>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 예약 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param reserveId 예약 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String serviceId, String reserveId) {
        deleteWithServiceResponseAsync(serviceId, reserveId).toBlocking().single().body();
    }

    /**
     * 예약 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param reserveId 예약 발송 요청 조회시 반환되는 메시지 식별자
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String serviceId, String reserveId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(serviceId, reserveId), serviceCallback);
    }

    /**
     * 예약 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param reserveId 예약 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String serviceId, String reserveId) {
        return deleteWithServiceResponseAsync(serviceId, reserveId).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 예약 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param reserveId 예약 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String serviceId, String reserveId) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (reserveId == null) {
            throw new IllegalArgumentException("Parameter reserveId is required and cannot be null.");
        }
        return service.delete(serviceId, reserveId)
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
