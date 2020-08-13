/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.implementation;

import retrofit2.Retrofit;
import com.fincloud.sens.ScheduleMessages;
import com.fincloud.sens.models.PushScheduleFetchAllParameter;
import com.fincloud.sens.models.PushScheduleFetchParameter;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ScheduleMessages.
 */
public class ScheduleMessagesImpl implements ScheduleMessages {
    /** The Retrofit service to perform REST calls. */
    private ScheduleMessagesService service;
    /** The service client containing this operation class. */
    private SENSManagementClientImpl client;

    /**
     * Initializes an instance of ScheduleMessages.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ScheduleMessagesImpl(Retrofit retrofit, SENSManagementClientImpl client) {
        this.service = retrofit.create(ScheduleMessagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ScheduleMessages to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ScheduleMessagesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.ScheduleMessages list" })
        @GET("push/v2/services/{serviceId}/schedules/{scheduleCode}/messages")
        Observable<Response<ResponseBody>> list(@Path(value = "serviceId", encoded = true) String serviceId, @Path("scheduleCode") String scheduleCode, @Query("page") Integer page, @Query("size") Integer size);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.ScheduleMessages get" })
        @GET("push/v2/services/{serviceId}/schedules/{scheduleCode}/messages/{messageId}")
        Observable<Response<ResponseBody>> get(@Path(value = "serviceId", encoded = true) String serviceId, @Path("scheduleCode") String scheduleCode, @Path("messageId") String messageId);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.ScheduleMessages delete" })
        @HTTP(path = "push/v2/services/{serviceId}/schedules/{scheduleCode}/messages/{messageId}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path(value = "serviceId", encoded = true) String serviceId, @Path("scheduleCode") String scheduleCode, @Path("messageId") String messageId);

    }

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
    public PushScheduleFetchAllParameter list(String serviceId, String scheduleCode) {
        return listWithServiceResponseAsync(serviceId, scheduleCode).toBlocking().single().body();
    }

    /**
     * 스케쥴 메시지 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PushScheduleFetchAllParameter> listAsync(String serviceId, String scheduleCode, final ServiceCallback<PushScheduleFetchAllParameter> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(serviceId, scheduleCode), serviceCallback);
    }

    /**
     * 스케쥴 메시지 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchAllParameter object
     */
    public Observable<PushScheduleFetchAllParameter> listAsync(String serviceId, String scheduleCode) {
        return listWithServiceResponseAsync(serviceId, scheduleCode).map(new Func1<ServiceResponse<PushScheduleFetchAllParameter>, PushScheduleFetchAllParameter>() {
            @Override
            public PushScheduleFetchAllParameter call(ServiceResponse<PushScheduleFetchAllParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 스케쥴 메시지 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchAllParameter object
     */
    public Observable<ServiceResponse<PushScheduleFetchAllParameter>> listWithServiceResponseAsync(String serviceId, String scheduleCode) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (scheduleCode == null) {
            throw new IllegalArgumentException("Parameter scheduleCode is required and cannot be null.");
        }
        final Integer page = null;
        final Integer size = null;
        return service.list(serviceId, scheduleCode, page, size)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PushScheduleFetchAllParameter>>>() {
                @Override
                public Observable<ServiceResponse<PushScheduleFetchAllParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PushScheduleFetchAllParameter> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

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
    public PushScheduleFetchAllParameter list(String serviceId, String scheduleCode, Integer page, Integer size) {
        return listWithServiceResponseAsync(serviceId, scheduleCode, page, size).toBlocking().single().body();
    }

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
    public ServiceFuture<PushScheduleFetchAllParameter> listAsync(String serviceId, String scheduleCode, Integer page, Integer size, final ServiceCallback<PushScheduleFetchAllParameter> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(serviceId, scheduleCode, page, size), serviceCallback);
    }

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
    public Observable<PushScheduleFetchAllParameter> listAsync(String serviceId, String scheduleCode, Integer page, Integer size) {
        return listWithServiceResponseAsync(serviceId, scheduleCode, page, size).map(new Func1<ServiceResponse<PushScheduleFetchAllParameter>, PushScheduleFetchAllParameter>() {
            @Override
            public PushScheduleFetchAllParameter call(ServiceResponse<PushScheduleFetchAllParameter> response) {
                return response.body();
            }
        });
    }

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
    public Observable<ServiceResponse<PushScheduleFetchAllParameter>> listWithServiceResponseAsync(String serviceId, String scheduleCode, Integer page, Integer size) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (scheduleCode == null) {
            throw new IllegalArgumentException("Parameter scheduleCode is required and cannot be null.");
        }
        return service.list(serviceId, scheduleCode, page, size)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PushScheduleFetchAllParameter>>>() {
                @Override
                public Observable<ServiceResponse<PushScheduleFetchAllParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PushScheduleFetchAllParameter> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PushScheduleFetchAllParameter> listDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PushScheduleFetchAllParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PushScheduleFetchAllParameter>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(401, new TypeToken<Void>() { }.getType())
                .register(403, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

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
    public PushScheduleFetchParameter get(String serviceId, String scheduleCode, String messageId) {
        return getWithServiceResponseAsync(serviceId, scheduleCode, messageId).toBlocking().single().body();
    }

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
    public ServiceFuture<PushScheduleFetchParameter> getAsync(String serviceId, String scheduleCode, String messageId, final ServiceCallback<PushScheduleFetchParameter> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(serviceId, scheduleCode, messageId), serviceCallback);
    }

    /**
     * 스케쥴 메시지 단건 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchParameter object
     */
    public Observable<PushScheduleFetchParameter> getAsync(String serviceId, String scheduleCode, String messageId) {
        return getWithServiceResponseAsync(serviceId, scheduleCode, messageId).map(new Func1<ServiceResponse<PushScheduleFetchParameter>, PushScheduleFetchParameter>() {
            @Override
            public PushScheduleFetchParameter call(ServiceResponse<PushScheduleFetchParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 스케쥴 메시지 단건 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchParameter object
     */
    public Observable<ServiceResponse<PushScheduleFetchParameter>> getWithServiceResponseAsync(String serviceId, String scheduleCode, String messageId) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (scheduleCode == null) {
            throw new IllegalArgumentException("Parameter scheduleCode is required and cannot be null.");
        }
        if (messageId == null) {
            throw new IllegalArgumentException("Parameter messageId is required and cannot be null.");
        }
        return service.get(serviceId, scheduleCode, messageId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PushScheduleFetchParameter>>>() {
                @Override
                public Observable<ServiceResponse<PushScheduleFetchParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PushScheduleFetchParameter> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PushScheduleFetchParameter> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PushScheduleFetchParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PushScheduleFetchParameter>() { }.getType())
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
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String serviceId, String scheduleCode, String messageId) {
        deleteWithServiceResponseAsync(serviceId, scheduleCode, messageId).toBlocking().single().body();
    }

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
    public ServiceFuture<Void> deleteAsync(String serviceId, String scheduleCode, String messageId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(serviceId, scheduleCode, messageId), serviceCallback);
    }

    /**
     * 스케쥴 메시지 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String serviceId, String scheduleCode, String messageId) {
        return deleteWithServiceResponseAsync(serviceId, scheduleCode, messageId).map(new Func1<ServiceResponse<Void>, Void>() {
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
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param messageId 스케줄 발송 요청 조회시 반환되는 메시지 식별자
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String serviceId, String scheduleCode, String messageId) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (scheduleCode == null) {
            throw new IllegalArgumentException("Parameter scheduleCode is required and cannot be null.");
        }
        if (messageId == null) {
            throw new IllegalArgumentException("Parameter messageId is required and cannot be null.");
        }
        return service.delete(serviceId, scheduleCode, messageId)
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
