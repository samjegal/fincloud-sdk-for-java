/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.implementation;

import retrofit2.Retrofit;
import com.fincloud.outboundmailer.Mails;
import com.fincloud.outboundmailer.models.EmailListResponse;
import com.fincloud.outboundmailer.models.EmailResponse;
import com.fincloud.outboundmailer.models.EmailSendListResponse;
import com.fincloud.outboundmailer.models.ErrorResponse;
import com.fincloud.outboundmailer.models.MailRequestParameter;
import com.fincloud.outboundmailer.models.MailResponseParameter;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.CollectionFormat;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Mails.
 */
public class MailsImpl implements Mails {
    /** The Retrofit service to perform REST calls. */
    private MailsService service;
    /** The service client containing this operation class. */
    private CloudOutboundMailerManagementClientImpl client;

    /**
     * Initializes an instance of Mails.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MailsImpl(Retrofit retrofit, CloudOutboundMailerManagementClientImpl client) {
        this.service = retrofit.create(MailsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Mails to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MailsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.outboundmailer.Mails create" })
        @POST("mails")
        Observable<Response<ResponseBody>> create(@Body MailRequestParameter parameter);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.outboundmailer.Mails get" })
        @GET("mails/{mailId}")
        Observable<Response<ResponseBody>> get(@Path("mailId") String mailId, @Header("X-NCP-LANG") String xNCPLANG);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.outboundmailer.Mails getRequestList" })
        @GET("mails/requests")
        Observable<Response<ResponseBody>> getRequestList(@Header("X-NCP-LANG") String xNCPLANG, @Query("dispatchType") String dispatchType, @Query("endDateTime") String endDateTime, @Query("endUtc") Long endUtc, @Query("mailId") String mailId, @Query("page") Integer page, @Query("recipientAddress") String recipientAddress, @Query("senderAddress") String senderAddress, @Query("sendStatus") String sendStatus, @Query("size") Integer size, @Query("sort") String sort, @Query("startDateTime") String startDateTime, @Query("startUtc") Long startUtc, @Query("templateSid") Integer templateSid, @Query("title") String title);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.outboundmailer.Mails getListByRequestId" })
        @GET("mails/requests/{requestId}/mails")
        Observable<Response<ResponseBody>> getListByRequestId(@Path("requestId") String requestId, @Header("X-NCP-LANG") String xNCPLANG, @Query("mailId") String mailId, @Query("page") Integer page, @Query("recipientAddress") String recipientAddress, @Query("sendStatus") String sendStatus, @Query("size") Integer size, @Query("sort") String sort, @Query("title") String title);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.outboundmailer.Mails getStatusByRequestId" })
        @GET("mails/requests/{requestId}/status")
        Observable<Response<ResponseBody>> getStatusByRequestId(@Path("requestId") String requestId, @Header("X-NCP-LANG") String xNCPLANG, @Query("mailId") String mailId, @Query("page") Integer page, @Query("recipientAddress") String recipientAddress, @Query("sendStatus") String sendStatus, @Query("size") Integer size, @Query("sort") String sort, @Query("title") String title);

    }

    /**
     * Email 발송을 요청.
     *
     * @param parameter 메일 발송 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MailResponseParameter object if successful.
     */
    public MailResponseParameter create(MailRequestParameter parameter) {
        return createWithServiceResponseAsync(parameter).toBlocking().single().body();
    }

    /**
     * Email 발송을 요청.
     *
     * @param parameter 메일 발송 요청
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MailResponseParameter> createAsync(MailRequestParameter parameter, final ServiceCallback<MailResponseParameter> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(parameter), serviceCallback);
    }

    /**
     * Email 발송을 요청.
     *
     * @param parameter 메일 발송 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MailResponseParameter object
     */
    public Observable<MailResponseParameter> createAsync(MailRequestParameter parameter) {
        return createWithServiceResponseAsync(parameter).map(new Func1<ServiceResponse<MailResponseParameter>, MailResponseParameter>() {
            @Override
            public MailResponseParameter call(ServiceResponse<MailResponseParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * Email 발송을 요청.
     *
     * @param parameter 메일 발송 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MailResponseParameter object
     */
    public Observable<ServiceResponse<MailResponseParameter>> createWithServiceResponseAsync(MailRequestParameter parameter) {
        if (parameter == null) {
            throw new IllegalArgumentException("Parameter parameter is required and cannot be null.");
        }
        Validator.validate(parameter);
        return service.create(parameter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MailResponseParameter>>>() {
                @Override
                public Observable<ServiceResponse<MailResponseParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MailResponseParameter> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MailResponseParameter> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MailResponseParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<MailResponseParameter>() { }.getType())
                .register(400, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Email 발송요청 상세 조회 발송 요청한 목록을 조회.
     *
     * @param mailId 메일 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object get(String mailId) {
        return getWithServiceResponseAsync(mailId).toBlocking().single().body();
    }

    /**
     * Email 발송요청 상세 조회 발송 요청한 목록을 조회.
     *
     * @param mailId 메일 Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getAsync(String mailId, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(mailId), serviceCallback);
    }

    /**
     * Email 발송요청 상세 조회 발송 요청한 목록을 조회.
     *
     * @param mailId 메일 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAsync(String mailId) {
        return getWithServiceResponseAsync(mailId).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Email 발송요청 상세 조회 발송 요청한 목록을 조회.
     *
     * @param mailId 메일 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getWithServiceResponseAsync(String mailId) {
        if (mailId == null) {
            throw new IllegalArgumentException("Parameter mailId is required and cannot be null.");
        }
        final String xNCPLANG = null;
        return service.get(mailId, xNCPLANG)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Email 발송요청 상세 조회 발송 요청한 목록을 조회.
     *
     * @param mailId 메일 Id
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object get(String mailId, String xNCPLANG) {
        return getWithServiceResponseAsync(mailId, xNCPLANG).toBlocking().single().body();
    }

    /**
     * Email 발송요청 상세 조회 발송 요청한 목록을 조회.
     *
     * @param mailId 메일 Id
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getAsync(String mailId, String xNCPLANG, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(mailId, xNCPLANG), serviceCallback);
    }

    /**
     * Email 발송요청 상세 조회 발송 요청한 목록을 조회.
     *
     * @param mailId 메일 Id
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAsync(String mailId, String xNCPLANG) {
        return getWithServiceResponseAsync(mailId, xNCPLANG).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Email 발송요청 상세 조회 발송 요청한 목록을 조회.
     *
     * @param mailId 메일 Id
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getWithServiceResponseAsync(String mailId, String xNCPLANG) {
        if (mailId == null) {
            throw new IllegalArgumentException("Parameter mailId is required and cannot be null.");
        }
        return service.get(mailId, xNCPLANG)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EmailResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(403, new TypeToken<ErrorResponse>() { }.getType())
                .register(405, new TypeToken<ErrorResponse>() { }.getType())
                .register(415, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * 발송 요청한 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getRequestList() {
        return getRequestListWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * 발송 요청한 목록을 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getRequestListAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getRequestListWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * 발송 요청한 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getRequestListAsync() {
        return getRequestListWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * 발송 요청한 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getRequestListWithServiceResponseAsync() {
        final String xNCPLANG = null;
        final String dispatchType = null;
        final String endDateTime = null;
        final Long endUtc = null;
        final String mailId = null;
        final Integer page = null;
        final String recipientAddress = null;
        final String senderAddress = null;
        final List<String> sendStatus = null;
        final Integer size = null;
        final String sort = null;
        final String startDateTime = null;
        final Long startUtc = null;
        final Integer templateSid = null;
        final String title = null;
        String sendStatusConverted = this.client.serializerAdapter().serializeList(sendStatus, CollectionFormat.MULTI);
        return service.getRequestList(xNCPLANG, dispatchType, endDateTime, endUtc, mailId, page, recipientAddress, senderAddress, sendStatusConverted, size, sort, startDateTime, startUtc, templateSid, title)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getRequestListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 발송 요청한 목록을 조회.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param dispatchType Email 발송요청 도구 (CONSOLE : NCP Console 화면을 통한 요청, API : API 호출을 통한 요청)
     * @param endDateTime 다음과 같은 형태의 요청 종료 일시 ('yyyy-MM-dd HH:mm' UTC+09:00), endUtc 값이 우선한다.
     * @param endUtc 요청 종료 일시 ( 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수 ),  endDateTime 값보다 이 값이 우선 적용된다.
     * @param mailId Email ID (각 메일 한 건을 구분하는 ID)
     * @param page 결과를 받고 싶은 페이지 index (0..N) (default:0)
     * @param recipientAddress 수신자 Email 주소
     * @param senderAddress 발송자 Email 주소
     * @param sendStatus Email 발송 상태 (P: 발송준비중, R: 발송준비, I: 발송중, S: 발송성공, F: 발송실패, U: 수신거부, C:발송취소, PF: 일부실패)
     * @param size 한페이지에 당 레코드 개수 (default:10)
     * @param sort 정렬기준 필드 (형식 : property(,asc|desc)) : 기본정렬 방향은 오름차순(asc)이며, 복수의 필드를 정렬기준으로 사용할 수 있다. 정렬가능한 필드는 다음과 같다. (createUtc : 생성일시, recipientCount : 수신자 수, reservationUtc : 예약일시, sendUtc : 발송완료일시, statusCode : 발송상태)
     * @param startDateTime 다음과 같은 형태의 요청 시작 일시 ('yyyy-MM-dd HH:mm' UTC+09:00), startUtc 값이 우선한다.
     * @param startUtc 요청 시작 일시 ( 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수 ),  startDateTime 값보다 이 값이 우선 적용된다.
     * @param templateSid 템플릿 ID
     * @param title 메일 제목
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getRequestList(String xNCPLANG, String dispatchType, String endDateTime, Long endUtc, String mailId, Integer page, String recipientAddress, String senderAddress, List<String> sendStatus, Integer size, String sort, String startDateTime, Long startUtc, Integer templateSid, String title) {
        return getRequestListWithServiceResponseAsync(xNCPLANG, dispatchType, endDateTime, endUtc, mailId, page, recipientAddress, senderAddress, sendStatus, size, sort, startDateTime, startUtc, templateSid, title).toBlocking().single().body();
    }

    /**
     * 발송 요청한 목록을 조회.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param dispatchType Email 발송요청 도구 (CONSOLE : NCP Console 화면을 통한 요청, API : API 호출을 통한 요청)
     * @param endDateTime 다음과 같은 형태의 요청 종료 일시 ('yyyy-MM-dd HH:mm' UTC+09:00), endUtc 값이 우선한다.
     * @param endUtc 요청 종료 일시 ( 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수 ),  endDateTime 값보다 이 값이 우선 적용된다.
     * @param mailId Email ID (각 메일 한 건을 구분하는 ID)
     * @param page 결과를 받고 싶은 페이지 index (0..N) (default:0)
     * @param recipientAddress 수신자 Email 주소
     * @param senderAddress 발송자 Email 주소
     * @param sendStatus Email 발송 상태 (P: 발송준비중, R: 발송준비, I: 발송중, S: 발송성공, F: 발송실패, U: 수신거부, C:발송취소, PF: 일부실패)
     * @param size 한페이지에 당 레코드 개수 (default:10)
     * @param sort 정렬기준 필드 (형식 : property(,asc|desc)) : 기본정렬 방향은 오름차순(asc)이며, 복수의 필드를 정렬기준으로 사용할 수 있다. 정렬가능한 필드는 다음과 같다. (createUtc : 생성일시, recipientCount : 수신자 수, reservationUtc : 예약일시, sendUtc : 발송완료일시, statusCode : 발송상태)
     * @param startDateTime 다음과 같은 형태의 요청 시작 일시 ('yyyy-MM-dd HH:mm' UTC+09:00), startUtc 값이 우선한다.
     * @param startUtc 요청 시작 일시 ( 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수 ),  startDateTime 값보다 이 값이 우선 적용된다.
     * @param templateSid 템플릿 ID
     * @param title 메일 제목
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getRequestListAsync(String xNCPLANG, String dispatchType, String endDateTime, Long endUtc, String mailId, Integer page, String recipientAddress, String senderAddress, List<String> sendStatus, Integer size, String sort, String startDateTime, Long startUtc, Integer templateSid, String title, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getRequestListWithServiceResponseAsync(xNCPLANG, dispatchType, endDateTime, endUtc, mailId, page, recipientAddress, senderAddress, sendStatus, size, sort, startDateTime, startUtc, templateSid, title), serviceCallback);
    }

    /**
     * 발송 요청한 목록을 조회.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param dispatchType Email 발송요청 도구 (CONSOLE : NCP Console 화면을 통한 요청, API : API 호출을 통한 요청)
     * @param endDateTime 다음과 같은 형태의 요청 종료 일시 ('yyyy-MM-dd HH:mm' UTC+09:00), endUtc 값이 우선한다.
     * @param endUtc 요청 종료 일시 ( 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수 ),  endDateTime 값보다 이 값이 우선 적용된다.
     * @param mailId Email ID (각 메일 한 건을 구분하는 ID)
     * @param page 결과를 받고 싶은 페이지 index (0..N) (default:0)
     * @param recipientAddress 수신자 Email 주소
     * @param senderAddress 발송자 Email 주소
     * @param sendStatus Email 발송 상태 (P: 발송준비중, R: 발송준비, I: 발송중, S: 발송성공, F: 발송실패, U: 수신거부, C:발송취소, PF: 일부실패)
     * @param size 한페이지에 당 레코드 개수 (default:10)
     * @param sort 정렬기준 필드 (형식 : property(,asc|desc)) : 기본정렬 방향은 오름차순(asc)이며, 복수의 필드를 정렬기준으로 사용할 수 있다. 정렬가능한 필드는 다음과 같다. (createUtc : 생성일시, recipientCount : 수신자 수, reservationUtc : 예약일시, sendUtc : 발송완료일시, statusCode : 발송상태)
     * @param startDateTime 다음과 같은 형태의 요청 시작 일시 ('yyyy-MM-dd HH:mm' UTC+09:00), startUtc 값이 우선한다.
     * @param startUtc 요청 시작 일시 ( 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수 ),  startDateTime 값보다 이 값이 우선 적용된다.
     * @param templateSid 템플릿 ID
     * @param title 메일 제목
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getRequestListAsync(String xNCPLANG, String dispatchType, String endDateTime, Long endUtc, String mailId, Integer page, String recipientAddress, String senderAddress, List<String> sendStatus, Integer size, String sort, String startDateTime, Long startUtc, Integer templateSid, String title) {
        return getRequestListWithServiceResponseAsync(xNCPLANG, dispatchType, endDateTime, endUtc, mailId, page, recipientAddress, senderAddress, sendStatus, size, sort, startDateTime, startUtc, templateSid, title).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * 발송 요청한 목록을 조회.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param dispatchType Email 발송요청 도구 (CONSOLE : NCP Console 화면을 통한 요청, API : API 호출을 통한 요청)
     * @param endDateTime 다음과 같은 형태의 요청 종료 일시 ('yyyy-MM-dd HH:mm' UTC+09:00), endUtc 값이 우선한다.
     * @param endUtc 요청 종료 일시 ( 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수 ),  endDateTime 값보다 이 값이 우선 적용된다.
     * @param mailId Email ID (각 메일 한 건을 구분하는 ID)
     * @param page 결과를 받고 싶은 페이지 index (0..N) (default:0)
     * @param recipientAddress 수신자 Email 주소
     * @param senderAddress 발송자 Email 주소
     * @param sendStatus Email 발송 상태 (P: 발송준비중, R: 발송준비, I: 발송중, S: 발송성공, F: 발송실패, U: 수신거부, C:발송취소, PF: 일부실패)
     * @param size 한페이지에 당 레코드 개수 (default:10)
     * @param sort 정렬기준 필드 (형식 : property(,asc|desc)) : 기본정렬 방향은 오름차순(asc)이며, 복수의 필드를 정렬기준으로 사용할 수 있다. 정렬가능한 필드는 다음과 같다. (createUtc : 생성일시, recipientCount : 수신자 수, reservationUtc : 예약일시, sendUtc : 발송완료일시, statusCode : 발송상태)
     * @param startDateTime 다음과 같은 형태의 요청 시작 일시 ('yyyy-MM-dd HH:mm' UTC+09:00), startUtc 값이 우선한다.
     * @param startUtc 요청 시작 일시 ( 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수 ),  startDateTime 값보다 이 값이 우선 적용된다.
     * @param templateSid 템플릿 ID
     * @param title 메일 제목
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getRequestListWithServiceResponseAsync(String xNCPLANG, String dispatchType, String endDateTime, Long endUtc, String mailId, Integer page, String recipientAddress, String senderAddress, List<String> sendStatus, Integer size, String sort, String startDateTime, Long startUtc, Integer templateSid, String title) {
        Validator.validate(sendStatus);
        String sendStatusConverted = this.client.serializerAdapter().serializeList(sendStatus, CollectionFormat.MULTI);
        return service.getRequestList(xNCPLANG, dispatchType, endDateTime, endUtc, mailId, page, recipientAddress, senderAddress, sendStatusConverted, size, sort, startDateTime, startUtc, templateSid, title)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getRequestListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getRequestListDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EmailSendListResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(403, new TypeToken<ErrorResponse>() { }.getType())
                .register(405, new TypeToken<ErrorResponse>() { }.getType())
                .register(415, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * 발송 요청한 특정 요청ID에 의해 생성된 메일 목록을 조회.
     *
     * @param requestId requestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getListByRequestId(String requestId) {
        return getListByRequestIdWithServiceResponseAsync(requestId).toBlocking().single().body();
    }

    /**
     * 발송 요청한 특정 요청ID에 의해 생성된 메일 목록을 조회.
     *
     * @param requestId requestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getListByRequestIdAsync(String requestId, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getListByRequestIdWithServiceResponseAsync(requestId), serviceCallback);
    }

    /**
     * 발송 요청한 특정 요청ID에 의해 생성된 메일 목록을 조회.
     *
     * @param requestId requestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getListByRequestIdAsync(String requestId) {
        return getListByRequestIdWithServiceResponseAsync(requestId).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * 발송 요청한 특정 요청ID에 의해 생성된 메일 목록을 조회.
     *
     * @param requestId requestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getListByRequestIdWithServiceResponseAsync(String requestId) {
        if (requestId == null) {
            throw new IllegalArgumentException("Parameter requestId is required and cannot be null.");
        }
        final String xNCPLANG = null;
        final String mailId = null;
        final Integer page = null;
        final String recipientAddress = null;
        final List<String> sendStatus = null;
        final Integer size = null;
        final List<String> sort = null;
        final String title = null;
        String sendStatusConverted = this.client.serializerAdapter().serializeList(sendStatus, CollectionFormat.MULTI);String sortConverted = this.client.serializerAdapter().serializeList(sort, CollectionFormat.MULTI);
        return service.getListByRequestId(requestId, xNCPLANG, mailId, page, recipientAddress, sendStatusConverted, size, sortConverted, title)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getListByRequestIdDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 발송 요청한 특정 요청ID에 의해 생성된 메일 목록을 조회.
     *
     * @param requestId requestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param mailId Email ID (각 메일 한 건을 구분하는 ID)
     * @param page 결과를 받고 싶은 페이지 index (0..N) (default:0)
     * @param recipientAddress 수신자 Email 주소
     * @param sendStatus Email 발송 상태 (R: 발송준비, I: 발송중, S: 발송성공, F: 발송실패, U: 수신거부, C:발송취소, PF: 일부실패)
     * @param size 한페이지에 당 레코드 개수 (default:10)
     * @param sort 정렬기준 필드 (형식 : property(,asc|desc)) : 기본정렬 방향은 오름차순(asc)이며, 복수의 필드를 정렬기준으로 사용할 수 있다. 정렬가능한 필드는 다음과 같다. (id : mailId, createUtc : 생성일시, statusCode : 발송상태)
     * @param title 메일 제목
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getListByRequestId(String requestId, String xNCPLANG, String mailId, Integer page, String recipientAddress, List<String> sendStatus, Integer size, List<String> sort, String title) {
        return getListByRequestIdWithServiceResponseAsync(requestId, xNCPLANG, mailId, page, recipientAddress, sendStatus, size, sort, title).toBlocking().single().body();
    }

    /**
     * 발송 요청한 특정 요청ID에 의해 생성된 메일 목록을 조회.
     *
     * @param requestId requestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param mailId Email ID (각 메일 한 건을 구분하는 ID)
     * @param page 결과를 받고 싶은 페이지 index (0..N) (default:0)
     * @param recipientAddress 수신자 Email 주소
     * @param sendStatus Email 발송 상태 (R: 발송준비, I: 발송중, S: 발송성공, F: 발송실패, U: 수신거부, C:발송취소, PF: 일부실패)
     * @param size 한페이지에 당 레코드 개수 (default:10)
     * @param sort 정렬기준 필드 (형식 : property(,asc|desc)) : 기본정렬 방향은 오름차순(asc)이며, 복수의 필드를 정렬기준으로 사용할 수 있다. 정렬가능한 필드는 다음과 같다. (id : mailId, createUtc : 생성일시, statusCode : 발송상태)
     * @param title 메일 제목
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getListByRequestIdAsync(String requestId, String xNCPLANG, String mailId, Integer page, String recipientAddress, List<String> sendStatus, Integer size, List<String> sort, String title, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getListByRequestIdWithServiceResponseAsync(requestId, xNCPLANG, mailId, page, recipientAddress, sendStatus, size, sort, title), serviceCallback);
    }

    /**
     * 발송 요청한 특정 요청ID에 의해 생성된 메일 목록을 조회.
     *
     * @param requestId requestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param mailId Email ID (각 메일 한 건을 구분하는 ID)
     * @param page 결과를 받고 싶은 페이지 index (0..N) (default:0)
     * @param recipientAddress 수신자 Email 주소
     * @param sendStatus Email 발송 상태 (R: 발송준비, I: 발송중, S: 발송성공, F: 발송실패, U: 수신거부, C:발송취소, PF: 일부실패)
     * @param size 한페이지에 당 레코드 개수 (default:10)
     * @param sort 정렬기준 필드 (형식 : property(,asc|desc)) : 기본정렬 방향은 오름차순(asc)이며, 복수의 필드를 정렬기준으로 사용할 수 있다. 정렬가능한 필드는 다음과 같다. (id : mailId, createUtc : 생성일시, statusCode : 발송상태)
     * @param title 메일 제목
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getListByRequestIdAsync(String requestId, String xNCPLANG, String mailId, Integer page, String recipientAddress, List<String> sendStatus, Integer size, List<String> sort, String title) {
        return getListByRequestIdWithServiceResponseAsync(requestId, xNCPLANG, mailId, page, recipientAddress, sendStatus, size, sort, title).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * 발송 요청한 특정 요청ID에 의해 생성된 메일 목록을 조회.
     *
     * @param requestId requestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param mailId Email ID (각 메일 한 건을 구분하는 ID)
     * @param page 결과를 받고 싶은 페이지 index (0..N) (default:0)
     * @param recipientAddress 수신자 Email 주소
     * @param sendStatus Email 발송 상태 (R: 발송준비, I: 발송중, S: 발송성공, F: 발송실패, U: 수신거부, C:발송취소, PF: 일부실패)
     * @param size 한페이지에 당 레코드 개수 (default:10)
     * @param sort 정렬기준 필드 (형식 : property(,asc|desc)) : 기본정렬 방향은 오름차순(asc)이며, 복수의 필드를 정렬기준으로 사용할 수 있다. 정렬가능한 필드는 다음과 같다. (id : mailId, createUtc : 생성일시, statusCode : 발송상태)
     * @param title 메일 제목
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getListByRequestIdWithServiceResponseAsync(String requestId, String xNCPLANG, String mailId, Integer page, String recipientAddress, List<String> sendStatus, Integer size, List<String> sort, String title) {
        if (requestId == null) {
            throw new IllegalArgumentException("Parameter requestId is required and cannot be null.");
        }
        Validator.validate(sendStatus);
        Validator.validate(sort);
        String sendStatusConverted = this.client.serializerAdapter().serializeList(sendStatus, CollectionFormat.MULTI);String sortConverted = this.client.serializerAdapter().serializeList(sort, CollectionFormat.MULTI);
        return service.getListByRequestId(requestId, xNCPLANG, mailId, page, recipientAddress, sendStatusConverted, size, sortConverted, title)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getListByRequestIdDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getListByRequestIdDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EmailListResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(403, new TypeToken<ErrorResponse>() { }.getType())
                .register(405, new TypeToken<ErrorResponse>() { }.getType())
                .register(415, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * 발송 요청한 requestId 를 전달하여 해당 요청으로 발송중인 메일 현황과 상태별 개수를 조회.
     *
     * @param requestId requestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getStatusByRequestId(String requestId) {
        return getStatusByRequestIdWithServiceResponseAsync(requestId).toBlocking().single().body();
    }

    /**
     * 발송 요청한 requestId 를 전달하여 해당 요청으로 발송중인 메일 현황과 상태별 개수를 조회.
     *
     * @param requestId requestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getStatusByRequestIdAsync(String requestId, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getStatusByRequestIdWithServiceResponseAsync(requestId), serviceCallback);
    }

    /**
     * 발송 요청한 requestId 를 전달하여 해당 요청으로 발송중인 메일 현황과 상태별 개수를 조회.
     *
     * @param requestId requestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getStatusByRequestIdAsync(String requestId) {
        return getStatusByRequestIdWithServiceResponseAsync(requestId).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * 발송 요청한 requestId 를 전달하여 해당 요청으로 발송중인 메일 현황과 상태별 개수를 조회.
     *
     * @param requestId requestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getStatusByRequestIdWithServiceResponseAsync(String requestId) {
        if (requestId == null) {
            throw new IllegalArgumentException("Parameter requestId is required and cannot be null.");
        }
        final String xNCPLANG = null;
        final String mailId = null;
        final Integer page = null;
        final String recipientAddress = null;
        final List<String> sendStatus = null;
        final Integer size = null;
        final List<String> sort = null;
        final String title = null;
        String sendStatusConverted = this.client.serializerAdapter().serializeList(sendStatus, CollectionFormat.MULTI);String sortConverted = this.client.serializerAdapter().serializeList(sort, CollectionFormat.MULTI);
        return service.getStatusByRequestId(requestId, xNCPLANG, mailId, page, recipientAddress, sendStatusConverted, size, sortConverted, title)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getStatusByRequestIdDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 발송 요청한 requestId 를 전달하여 해당 요청으로 발송중인 메일 현황과 상태별 개수를 조회.
     *
     * @param requestId requestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param mailId Email ID (각 메일 한 건을 구분하는 ID)
     * @param page 결과를 받고 싶은 페이지 index (0..N) (default:0)
     * @param recipientAddress 수신자 Email 주소
     * @param sendStatus Email 발송 상태 (R: 발송준비, I: 발송중, S: 발송성공, F: 발송실패, U: 수신거부, C:발송취소, PF: 일부실패)
     * @param size 한페이지에 당 레코드 개수 (default:10)
     * @param sort 정렬기준 필드 (형식 : property(,asc|desc)) : 기본정렬 방향은 오름차순(asc)이며, 복수의 필드를 정렬기준으로 사용할 수 있다. 정렬가능한 필드는 다음과 같다. (id : mailId, createUtc : 생성일시, statusCode : 발송상태)
     * @param title 메일 제목
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getStatusByRequestId(String requestId, String xNCPLANG, String mailId, Integer page, String recipientAddress, List<String> sendStatus, Integer size, List<String> sort, String title) {
        return getStatusByRequestIdWithServiceResponseAsync(requestId, xNCPLANG, mailId, page, recipientAddress, sendStatus, size, sort, title).toBlocking().single().body();
    }

    /**
     * 발송 요청한 requestId 를 전달하여 해당 요청으로 발송중인 메일 현황과 상태별 개수를 조회.
     *
     * @param requestId requestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param mailId Email ID (각 메일 한 건을 구분하는 ID)
     * @param page 결과를 받고 싶은 페이지 index (0..N) (default:0)
     * @param recipientAddress 수신자 Email 주소
     * @param sendStatus Email 발송 상태 (R: 발송준비, I: 발송중, S: 발송성공, F: 발송실패, U: 수신거부, C:발송취소, PF: 일부실패)
     * @param size 한페이지에 당 레코드 개수 (default:10)
     * @param sort 정렬기준 필드 (형식 : property(,asc|desc)) : 기본정렬 방향은 오름차순(asc)이며, 복수의 필드를 정렬기준으로 사용할 수 있다. 정렬가능한 필드는 다음과 같다. (id : mailId, createUtc : 생성일시, statusCode : 발송상태)
     * @param title 메일 제목
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getStatusByRequestIdAsync(String requestId, String xNCPLANG, String mailId, Integer page, String recipientAddress, List<String> sendStatus, Integer size, List<String> sort, String title, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getStatusByRequestIdWithServiceResponseAsync(requestId, xNCPLANG, mailId, page, recipientAddress, sendStatus, size, sort, title), serviceCallback);
    }

    /**
     * 발송 요청한 requestId 를 전달하여 해당 요청으로 발송중인 메일 현황과 상태별 개수를 조회.
     *
     * @param requestId requestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param mailId Email ID (각 메일 한 건을 구분하는 ID)
     * @param page 결과를 받고 싶은 페이지 index (0..N) (default:0)
     * @param recipientAddress 수신자 Email 주소
     * @param sendStatus Email 발송 상태 (R: 발송준비, I: 발송중, S: 발송성공, F: 발송실패, U: 수신거부, C:발송취소, PF: 일부실패)
     * @param size 한페이지에 당 레코드 개수 (default:10)
     * @param sort 정렬기준 필드 (형식 : property(,asc|desc)) : 기본정렬 방향은 오름차순(asc)이며, 복수의 필드를 정렬기준으로 사용할 수 있다. 정렬가능한 필드는 다음과 같다. (id : mailId, createUtc : 생성일시, statusCode : 발송상태)
     * @param title 메일 제목
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getStatusByRequestIdAsync(String requestId, String xNCPLANG, String mailId, Integer page, String recipientAddress, List<String> sendStatus, Integer size, List<String> sort, String title) {
        return getStatusByRequestIdWithServiceResponseAsync(requestId, xNCPLANG, mailId, page, recipientAddress, sendStatus, size, sort, title).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * 발송 요청한 requestId 를 전달하여 해당 요청으로 발송중인 메일 현황과 상태별 개수를 조회.
     *
     * @param requestId requestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param mailId Email ID (각 메일 한 건을 구분하는 ID)
     * @param page 결과를 받고 싶은 페이지 index (0..N) (default:0)
     * @param recipientAddress 수신자 Email 주소
     * @param sendStatus Email 발송 상태 (R: 발송준비, I: 발송중, S: 발송성공, F: 발송실패, U: 수신거부, C:발송취소, PF: 일부실패)
     * @param size 한페이지에 당 레코드 개수 (default:10)
     * @param sort 정렬기준 필드 (형식 : property(,asc|desc)) : 기본정렬 방향은 오름차순(asc)이며, 복수의 필드를 정렬기준으로 사용할 수 있다. 정렬가능한 필드는 다음과 같다. (id : mailId, createUtc : 생성일시, statusCode : 발송상태)
     * @param title 메일 제목
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getStatusByRequestIdWithServiceResponseAsync(String requestId, String xNCPLANG, String mailId, Integer page, String recipientAddress, List<String> sendStatus, Integer size, List<String> sort, String title) {
        if (requestId == null) {
            throw new IllegalArgumentException("Parameter requestId is required and cannot be null.");
        }
        Validator.validate(sendStatus);
        Validator.validate(sort);
        String sendStatusConverted = this.client.serializerAdapter().serializeList(sendStatus, CollectionFormat.MULTI);String sortConverted = this.client.serializerAdapter().serializeList(sort, CollectionFormat.MULTI);
        return service.getStatusByRequestId(requestId, xNCPLANG, mailId, page, recipientAddress, sendStatusConverted, size, sortConverted, title)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getStatusByRequestIdDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getStatusByRequestIdDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EmailListResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(403, new TypeToken<ErrorResponse>() { }.getType())
                .register(405, new TypeToken<ErrorResponse>() { }.getType())
                .register(415, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

}
