/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.sens.implementation;

import retrofit2.Retrofit;
import com.fincloud.sens.Schedules;
import com.fincloud.sens.models.PushScheduleFetchAllParameter;
import com.fincloud.sens.models.PushScheduleFetchParameter;
import com.fincloud.sens.models.PushScheduleRegisterParameter;
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
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Schedules.
 */
public class SchedulesImpl implements Schedules {
    /** The Retrofit service to perform REST calls. */
    private SchedulesService service;
    /** The service client containing this operation class. */
    private SENSManagementClientImpl client;

    /**
     * Initializes an instance of Schedules.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SchedulesImpl(Retrofit retrofit, SENSManagementClientImpl client) {
        this.service = retrofit.create(SchedulesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Schedules to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SchedulesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.Schedules list" })
        @GET("push/v2/services/{serviceId}/schedules")
        Observable<Response<ResponseBody>> list(@Path(value = "serviceId", encoded = true) String serviceId, @Query("page") Integer page, @Query("scheduleCode") String scheduleCode, @Query("size") Integer size, @Query("sort") String sort);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.Schedules create" })
        @POST("push/v2/services/{serviceId}/schedules")
        Observable<Response<ResponseBody>> create(@Path(value = "serviceId", encoded = true) String serviceId, @Body PushScheduleRegisterParameter parameter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.Schedules get" })
        @GET("push/v2/services/{serviceId}/schedules/{scheduleCode}")
        Observable<Response<ResponseBody>> get(@Path(value = "serviceId", encoded = true) String serviceId, @Path("scheduleCode") String scheduleCode);

        @Headers({ "Content-Type: application/json; charset=UTF-8", "x-ms-logging-context: com.fincloud.sens.Schedules put" })
        @PUT("push/v2/services/{serviceId}/schedules/{scheduleCode}")
        Observable<Response<ResponseBody>> put(@Path(value = "serviceId", encoded = true) String serviceId, @Path("scheduleCode") String scheduleCode, @Body PushScheduleRegisterParameter parameter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.sens.Schedules delete" })
        @HTTP(path = "push/v2/services/{serviceId}/schedules/{scheduleCode}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path(value = "serviceId", encoded = true) String serviceId, @Path("scheduleCode") String scheduleCode);

    }

    /**
     * 스케줄 목록 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PushScheduleFetchAllParameter object if successful.
     */
    public PushScheduleFetchAllParameter list(String serviceId) {
        return listWithServiceResponseAsync(serviceId).toBlocking().single().body();
    }

    /**
     * 스케줄 목록 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PushScheduleFetchAllParameter> listAsync(String serviceId, final ServiceCallback<PushScheduleFetchAllParameter> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(serviceId), serviceCallback);
    }

    /**
     * 스케줄 목록 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchAllParameter object
     */
    public Observable<PushScheduleFetchAllParameter> listAsync(String serviceId) {
        return listWithServiceResponseAsync(serviceId).map(new Func1<ServiceResponse<PushScheduleFetchAllParameter>, PushScheduleFetchAllParameter>() {
            @Override
            public PushScheduleFetchAllParameter call(ServiceResponse<PushScheduleFetchAllParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 스케줄 목록 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchAllParameter object
     */
    public Observable<ServiceResponse<PushScheduleFetchAllParameter>> listWithServiceResponseAsync(String serviceId) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        final Integer page = null;
        final String scheduleCode = null;
        final Integer size = null;
        final String sort = null;
        return service.list(serviceId, page, scheduleCode, size, sort)
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
    public PushScheduleFetchAllParameter list(String serviceId, Integer page, String scheduleCode, Integer size, String sort) {
        return listWithServiceResponseAsync(serviceId, page, scheduleCode, size, sort).toBlocking().single().body();
    }

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
    public ServiceFuture<PushScheduleFetchAllParameter> listAsync(String serviceId, Integer page, String scheduleCode, Integer size, String sort, final ServiceCallback<PushScheduleFetchAllParameter> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(serviceId, page, scheduleCode, size, sort), serviceCallback);
    }

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
    public Observable<PushScheduleFetchAllParameter> listAsync(String serviceId, Integer page, String scheduleCode, Integer size, String sort) {
        return listWithServiceResponseAsync(serviceId, page, scheduleCode, size, sort).map(new Func1<ServiceResponse<PushScheduleFetchAllParameter>, PushScheduleFetchAllParameter>() {
            @Override
            public PushScheduleFetchAllParameter call(ServiceResponse<PushScheduleFetchAllParameter> response) {
                return response.body();
            }
        });
    }

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
    public Observable<ServiceResponse<PushScheduleFetchAllParameter>> listWithServiceResponseAsync(String serviceId, Integer page, String scheduleCode, Integer size, String sort) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        return service.list(serviceId, page, scheduleCode, size, sort)
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
     * 스케줄 등록.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter the PushScheduleRegisterParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void create(String serviceId, PushScheduleRegisterParameter parameter) {
        createWithServiceResponseAsync(serviceId, parameter).toBlocking().single().body();
    }

    /**
     * 스케줄 등록.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter the PushScheduleRegisterParameter value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> createAsync(String serviceId, PushScheduleRegisterParameter parameter, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(serviceId, parameter), serviceCallback);
    }

    /**
     * 스케줄 등록.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter the PushScheduleRegisterParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> createAsync(String serviceId, PushScheduleRegisterParameter parameter) {
        return createWithServiceResponseAsync(serviceId, parameter).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 스케줄 등록.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param parameter the PushScheduleRegisterParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> createWithServiceResponseAsync(String serviceId, PushScheduleRegisterParameter parameter) {
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
     * 스케쥴 단건 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PushScheduleFetchParameter object if successful.
     */
    public PushScheduleFetchParameter get(String serviceId, String scheduleCode) {
        return getWithServiceResponseAsync(serviceId, scheduleCode).toBlocking().single().body();
    }

    /**
     * 스케쥴 단건 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PushScheduleFetchParameter> getAsync(String serviceId, String scheduleCode, final ServiceCallback<PushScheduleFetchParameter> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(serviceId, scheduleCode), serviceCallback);
    }

    /**
     * 스케쥴 단건 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchParameter object
     */
    public Observable<PushScheduleFetchParameter> getAsync(String serviceId, String scheduleCode) {
        return getWithServiceResponseAsync(serviceId, scheduleCode).map(new Func1<ServiceResponse<PushScheduleFetchParameter>, PushScheduleFetchParameter>() {
            @Override
            public PushScheduleFetchParameter call(ServiceResponse<PushScheduleFetchParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 스케쥴 단건 조회.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchParameter object
     */
    public Observable<ServiceResponse<PushScheduleFetchParameter>> getWithServiceResponseAsync(String serviceId, String scheduleCode) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (scheduleCode == null) {
            throw new IllegalArgumentException("Parameter scheduleCode is required and cannot be null.");
        }
        return service.get(serviceId, scheduleCode)
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
    public PushScheduleFetchParameter put(String serviceId, String scheduleCode, PushScheduleRegisterParameter parameter) {
        return putWithServiceResponseAsync(serviceId, scheduleCode, parameter).toBlocking().single().body();
    }

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
    public ServiceFuture<PushScheduleFetchParameter> putAsync(String serviceId, String scheduleCode, PushScheduleRegisterParameter parameter, final ServiceCallback<PushScheduleFetchParameter> serviceCallback) {
        return ServiceFuture.fromResponse(putWithServiceResponseAsync(serviceId, scheduleCode, parameter), serviceCallback);
    }

    /**
     * 스케쥴 수정.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param parameter the PushScheduleRegisterParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchParameter object
     */
    public Observable<PushScheduleFetchParameter> putAsync(String serviceId, String scheduleCode, PushScheduleRegisterParameter parameter) {
        return putWithServiceResponseAsync(serviceId, scheduleCode, parameter).map(new Func1<ServiceResponse<PushScheduleFetchParameter>, PushScheduleFetchParameter>() {
            @Override
            public PushScheduleFetchParameter call(ServiceResponse<PushScheduleFetchParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 스케쥴 수정.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param parameter the PushScheduleRegisterParameter value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PushScheduleFetchParameter object
     */
    public Observable<ServiceResponse<PushScheduleFetchParameter>> putWithServiceResponseAsync(String serviceId, String scheduleCode, PushScheduleRegisterParameter parameter) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (scheduleCode == null) {
            throw new IllegalArgumentException("Parameter scheduleCode is required and cannot be null.");
        }
        if (parameter == null) {
            throw new IllegalArgumentException("Parameter parameter is required and cannot be null.");
        }
        Validator.validate(parameter);
        return service.put(serviceId, scheduleCode, parameter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PushScheduleFetchParameter>>>() {
                @Override
                public Observable<ServiceResponse<PushScheduleFetchParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PushScheduleFetchParameter> clientResponse = putDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PushScheduleFetchParameter> putDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
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
     * 스케쥴 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String serviceId, String scheduleCode) {
        deleteWithServiceResponseAsync(serviceId, scheduleCode).toBlocking().single().body();
    }

    /**
     * 스케쥴 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String serviceId, String scheduleCode, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(serviceId, scheduleCode), serviceCallback);
    }

    /**
     * 스케쥴 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String serviceId, String scheduleCode) {
        return deleteWithServiceResponseAsync(serviceId, scheduleCode).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 스케쥴 삭제.
     *
     * @param serviceId 프로젝트 등록 시 발급받은 서비스 아이디
     * @param scheduleCode 등록하려는 스케줄 코드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String serviceId, String scheduleCode) {
        if (serviceId == null) {
            throw new IllegalArgumentException("Parameter serviceId is required and cannot be null.");
        }
        if (scheduleCode == null) {
            throw new IllegalArgumentException("Parameter scheduleCode is required and cannot be null.");
        }
        return service.delete(serviceId, scheduleCode)
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
