/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.implementation;

import retrofit2.Retrofit;
import com.fincloud.sens.SMS;
import com.fincloud.sens.models.SMSMessageParameter;
import com.fincloud.sens.models.SMSMessageRequestParameter;
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
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in SMS.
 */
public class SMSImpl implements SMS {
    /** The Retrofit service to perform REST calls. */
    private SMSService service;
    /** The service client containing this operation class. */
    private SENSManagementClientImpl client;

    /**
     * Initializes an instance of SMS.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SMSImpl(Retrofit retrofit, SENSManagementClientImpl client) {
        this.service = retrofit.create(SMSService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SMS to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SMSService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.SMS getRequest" })
        @GET("sms/v2/services/{serviceId}/messages")
        Observable<Response<ResponseBody>> getRequest(@Path(value = "serviceId", encoded = true) String serviceId, @Query("requestId") String requestId);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.SMS request" })
        @POST("sms/v2/services/{serviceId}/messages")
        Observable<Response<ResponseBody>> request(@Path(value = "serviceId", encoded = true) String serviceId, @Body SMSMessageRequestParameter parameter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.SMS getResult" })
        @GET("sms/v2/services/{serviceId}/messages/{messageId}")
        Observable<Response<ResponseBody>> getResult(@Path(value = "serviceId", encoded = true) String serviceId, @Path("messageId") String messageId);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.SMS deleteReservation" })
        @HTTP(path = "sms/v2/services/{serviceId}/reservations/{reserveId}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteReservation(@Path(value = "serviceId", encoded = true) String serviceId, @Path("reserveId") String reserveId);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.SMS deleteSchedule" })
        @HTTP(path = "sms/v2/services/{serviceId}/schedules/{scheduleCode}/messages/{messageId}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteSchedule(@Path(value = "serviceId", encoded = true) String serviceId, @Path("scheduleCode") String scheduleCode, @Path("messageId") String messageId);

    }

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
    public SMSMessageParameter getRequest(String serviceId, String requestId) {
        return getRequestWithServiceResponseAsync(serviceId, requestId).toBlocking().single().body();
    }

    /**
     * 메시지 발송 요청 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param requestId 발송 요청 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SMSMessageParameter> getRequestAsync(String serviceId, String requestId, final ServiceCallback<SMSMessageParameter> serviceCallback) {
        return ServiceFuture.fromResponse(getRequestWithServiceResponseAsync(serviceId, requestId), serviceCallback);
    }

    /**
     * 메시지 발송 요청 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param requestId 발송 요청 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SMSMessageParameter object
     */
    public Observable<SMSMessageParameter> getRequestAsync(String serviceId, String requestId) {
        return getRequestWithServiceResponseAsync(serviceId, requestId).map(new Func1<ServiceResponse<SMSMessageParameter>, SMSMessageParameter>() {
            @Override
            public SMSMessageParameter call(ServiceResponse<SMSMessageParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 메시지 발송 요청 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param requestId 발송 요청 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SMSMessageParameter object
     */
    public Observable<ServiceResponse<SMSMessageParameter>> getRequestWithServiceResponseAsync(String serviceId, String requestId) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (requestId == null) {
            throw new IllegalArgumentException("Parameter requestId is required and cannot be null.");
        }
        return service.getRequest(serviceId, requestId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SMSMessageParameter>>>() {
                @Override
                public Observable<ServiceResponse<SMSMessageParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SMSMessageParameter> clientResponse = getRequestDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SMSMessageParameter> getRequestDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SMSMessageParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SMSMessageParameter>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

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
    public SMSMessageParameter request(String serviceId, SMSMessageRequestParameter parameter) {
        return requestWithServiceResponseAsync(serviceId, parameter).toBlocking().single().body();
    }

    /**
     * SMS 메시지 발송 요청.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter SMS 메시지 요청 정보
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SMSMessageParameter> requestAsync(String serviceId, SMSMessageRequestParameter parameter, final ServiceCallback<SMSMessageParameter> serviceCallback) {
        return ServiceFuture.fromResponse(requestWithServiceResponseAsync(serviceId, parameter), serviceCallback);
    }

    /**
     * SMS 메시지 발송 요청.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter SMS 메시지 요청 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SMSMessageParameter object
     */
    public Observable<SMSMessageParameter> requestAsync(String serviceId, SMSMessageRequestParameter parameter) {
        return requestWithServiceResponseAsync(serviceId, parameter).map(new Func1<ServiceResponse<SMSMessageParameter>, SMSMessageParameter>() {
            @Override
            public SMSMessageParameter call(ServiceResponse<SMSMessageParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * SMS 메시지 발송 요청.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter SMS 메시지 요청 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SMSMessageParameter object
     */
    public Observable<ServiceResponse<SMSMessageParameter>> requestWithServiceResponseAsync(String serviceId, SMSMessageRequestParameter parameter) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (parameter == null) {
            throw new IllegalArgumentException("Parameter parameter is required and cannot be null.");
        }
        Validator.validate(parameter);
        return service.request(serviceId, parameter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SMSMessageParameter>>>() {
                @Override
                public Observable<ServiceResponse<SMSMessageParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SMSMessageParameter> clientResponse = requestDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SMSMessageParameter> requestDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SMSMessageParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(202, new TypeToken<SMSMessageParameter>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(429, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

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
    public SMSMessageParameter getResult(String serviceId, String messageId) {
        return getResultWithServiceResponseAsync(serviceId, messageId).toBlocking().single().body();
    }

    /**
     * 메시지 발송 결과 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param messageId 메시지 발송 요청 조회시 반환되는 메시지 식별자
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SMSMessageParameter> getResultAsync(String serviceId, String messageId, final ServiceCallback<SMSMessageParameter> serviceCallback) {
        return ServiceFuture.fromResponse(getResultWithServiceResponseAsync(serviceId, messageId), serviceCallback);
    }

    /**
     * 메시지 발송 결과 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param messageId 메시지 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SMSMessageParameter object
     */
    public Observable<SMSMessageParameter> getResultAsync(String serviceId, String messageId) {
        return getResultWithServiceResponseAsync(serviceId, messageId).map(new Func1<ServiceResponse<SMSMessageParameter>, SMSMessageParameter>() {
            @Override
            public SMSMessageParameter call(ServiceResponse<SMSMessageParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 메시지 발송 결과 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param messageId 메시지 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SMSMessageParameter object
     */
    public Observable<ServiceResponse<SMSMessageParameter>> getResultWithServiceResponseAsync(String serviceId, String messageId) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (messageId == null) {
            throw new IllegalArgumentException("Parameter messageId is required and cannot be null.");
        }
        return service.getResult(serviceId, messageId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SMSMessageParameter>>>() {
                @Override
                public Observable<ServiceResponse<SMSMessageParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SMSMessageParameter> clientResponse = getResultDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SMSMessageParameter> getResultDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SMSMessageParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SMSMessageParameter>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 예약 메시지를 취소.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param reserveId 예약 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void deleteReservation(String serviceId, String reserveId) {
        deleteReservationWithServiceResponseAsync(serviceId, reserveId).toBlocking().single().body();
    }

    /**
     * 예약 메시지를 취소.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param reserveId 예약 발송 요청 조회시 반환되는 메시지 식별자
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteReservationAsync(String serviceId, String reserveId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteReservationWithServiceResponseAsync(serviceId, reserveId), serviceCallback);
    }

    /**
     * 예약 메시지를 취소.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param reserveId 예약 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteReservationAsync(String serviceId, String reserveId) {
        return deleteReservationWithServiceResponseAsync(serviceId, reserveId).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 예약 메시지를 취소.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param reserveId 예약 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteReservationWithServiceResponseAsync(String serviceId, String reserveId) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (reserveId == null) {
            throw new IllegalArgumentException("Parameter reserveId is required and cannot be null.");
        }
        return service.deleteReservation(serviceId, reserveId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteReservationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteReservationDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

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
    public void deleteSchedule(String serviceId, String scheduleCode, String messageId) {
        deleteScheduleWithServiceResponseAsync(serviceId, scheduleCode, messageId).toBlocking().single().body();
    }

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
    public ServiceFuture<Void> deleteScheduleAsync(String serviceId, String scheduleCode, String messageId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteScheduleWithServiceResponseAsync(serviceId, scheduleCode, messageId), serviceCallback);
    }

    /**
     * 스케쥴 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 스케줄 등록시 사용한 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteScheduleAsync(String serviceId, String scheduleCode, String messageId) {
        return deleteScheduleWithServiceResponseAsync(serviceId, scheduleCode, messageId).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 스케쥴 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 스케줄 등록시 사용한 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteScheduleWithServiceResponseAsync(String serviceId, String scheduleCode, String messageId) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (scheduleCode == null) {
            throw new IllegalArgumentException("Parameter scheduleCode is required and cannot be null.");
        }
        if (messageId == null) {
            throw new IllegalArgumentException("Parameter messageId is required and cannot be null.");
        }
        return service.deleteSchedule(serviceId, scheduleCode, messageId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteScheduleDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteScheduleDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
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
