/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.implementation;

import retrofit2.Retrofit;
import com.fincloud.outboundmailer.Unsubscribers;
import com.fincloud.outboundmailer.models.ErrorResponse;
import com.fincloud.outboundmailer.models.UnsubscribeListResponse;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Unsubscribers.
 */
public class UnsubscribersImpl implements Unsubscribers {
    /** The Retrofit service to perform REST calls. */
    private UnsubscribersService service;
    /** The service client containing this operation class. */
    private CloudOutboundMailerManagementClientImpl client;

    /**
     * Initializes an instance of Unsubscribers.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public UnsubscribersImpl(Retrofit retrofit, CloudOutboundMailerManagementClientImpl client) {
        this.service = retrofit.create(UnsubscribersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Unsubscribers to be
     * used by Retrofit to perform actually REST calls.
     */
    interface UnsubscribersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.outboundmailer.Unsubscribers get" })
        @GET("api/v1/unsubscribers")
        Observable<Response<ResponseBody>> get(@Header("X-NCP-LANG") String xNCPLANG, @Query("emailAddress") String emailAddress, @Query("endDateTime") String endDateTime, @Query("endUtc") Long endUtc, @Query("isRegByManager") Boolean isRegByManager, @Query("page") Integer page, @Query("size") Integer size, @Query("sort") String sort, @Query("startDateTime") String startDateTime, @Query("startUtc") Long startUtc);

    }

    /**
     * 수신거부 이메일 주소 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object get() {
        return getWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * 수신거부 이메일 주소 목록을 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * 수신거부 이메일 주소 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAsync() {
        return getWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * 수신거부 이메일 주소 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getWithServiceResponseAsync() {
        final String xNCPLANG = null;
        final String emailAddress = null;
        final String endDateTime = null;
        final Long endUtc = null;
        final Boolean isRegByManager = null;
        final Integer page = null;
        final Integer size = null;
        final String sort = null;
        final String startDateTime = null;
        final Long startUtc = null;
        return service.get(xNCPLANG, emailAddress, endDateTime, endUtc, isRegByManager, page, size, sort, startDateTime, startUtc)
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
     * 수신거부 이메일 주소 목록을 조회.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param emailAddress Email 주소
     * @param endDateTime 수신거부 등록일 검색 기준 종료 일시, 문자열 포멧('yyyy-MM-dd HH:mm' UTC+09:00), endUtc 값이 우선한다.
     * @param endUtc 수신거부 등록일 검색 기준 종료 일시, UTC ( 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수 ),  endDateTime 값보다 이 값이 우선 적용된다.
     * @param isRegByManager 관리자 등록 여부
     * @param page 결과를 받고 싶은 페이지 index (0..N) (default:0)
     * @param size 한페이지에 당 레코드 개수 (default:10)
     * @param sort 정렬기준 필드 (형식 : property(,asc|desc)) : 기본정렬 방향은 오름차순(asc)이며, 복수의 필드를 정렬기준으로 사용할 수 있다. 정렬가능한 필드는 다음과 같다. (createUtc : 등록일시, adminRegYn : 관리자 등록 여부 )
     * @param startDateTime 수신거부 등록일 검색 기준 시작 일시, 문자열 포멧('yyyy-MM-dd HH:mm' UTC+09:00), startUtc 값이 우선한다.
     * @param startUtc 수신거부 등록일 검색 기준 시작 일시, UTC( 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수 ),  startDateTime 값보다 이 값이 우선 적용된다.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object get(String xNCPLANG, String emailAddress, String endDateTime, Long endUtc, Boolean isRegByManager, Integer page, Integer size, String sort, String startDateTime, Long startUtc) {
        return getWithServiceResponseAsync(xNCPLANG, emailAddress, endDateTime, endUtc, isRegByManager, page, size, sort, startDateTime, startUtc).toBlocking().single().body();
    }

    /**
     * 수신거부 이메일 주소 목록을 조회.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param emailAddress Email 주소
     * @param endDateTime 수신거부 등록일 검색 기준 종료 일시, 문자열 포멧('yyyy-MM-dd HH:mm' UTC+09:00), endUtc 값이 우선한다.
     * @param endUtc 수신거부 등록일 검색 기준 종료 일시, UTC ( 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수 ),  endDateTime 값보다 이 값이 우선 적용된다.
     * @param isRegByManager 관리자 등록 여부
     * @param page 결과를 받고 싶은 페이지 index (0..N) (default:0)
     * @param size 한페이지에 당 레코드 개수 (default:10)
     * @param sort 정렬기준 필드 (형식 : property(,asc|desc)) : 기본정렬 방향은 오름차순(asc)이며, 복수의 필드를 정렬기준으로 사용할 수 있다. 정렬가능한 필드는 다음과 같다. (createUtc : 등록일시, adminRegYn : 관리자 등록 여부 )
     * @param startDateTime 수신거부 등록일 검색 기준 시작 일시, 문자열 포멧('yyyy-MM-dd HH:mm' UTC+09:00), startUtc 값이 우선한다.
     * @param startUtc 수신거부 등록일 검색 기준 시작 일시, UTC( 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수 ),  startDateTime 값보다 이 값이 우선 적용된다.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getAsync(String xNCPLANG, String emailAddress, String endDateTime, Long endUtc, Boolean isRegByManager, Integer page, Integer size, String sort, String startDateTime, Long startUtc, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(xNCPLANG, emailAddress, endDateTime, endUtc, isRegByManager, page, size, sort, startDateTime, startUtc), serviceCallback);
    }

    /**
     * 수신거부 이메일 주소 목록을 조회.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param emailAddress Email 주소
     * @param endDateTime 수신거부 등록일 검색 기준 종료 일시, 문자열 포멧('yyyy-MM-dd HH:mm' UTC+09:00), endUtc 값이 우선한다.
     * @param endUtc 수신거부 등록일 검색 기준 종료 일시, UTC ( 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수 ),  endDateTime 값보다 이 값이 우선 적용된다.
     * @param isRegByManager 관리자 등록 여부
     * @param page 결과를 받고 싶은 페이지 index (0..N) (default:0)
     * @param size 한페이지에 당 레코드 개수 (default:10)
     * @param sort 정렬기준 필드 (형식 : property(,asc|desc)) : 기본정렬 방향은 오름차순(asc)이며, 복수의 필드를 정렬기준으로 사용할 수 있다. 정렬가능한 필드는 다음과 같다. (createUtc : 등록일시, adminRegYn : 관리자 등록 여부 )
     * @param startDateTime 수신거부 등록일 검색 기준 시작 일시, 문자열 포멧('yyyy-MM-dd HH:mm' UTC+09:00), startUtc 값이 우선한다.
     * @param startUtc 수신거부 등록일 검색 기준 시작 일시, UTC( 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수 ),  startDateTime 값보다 이 값이 우선 적용된다.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAsync(String xNCPLANG, String emailAddress, String endDateTime, Long endUtc, Boolean isRegByManager, Integer page, Integer size, String sort, String startDateTime, Long startUtc) {
        return getWithServiceResponseAsync(xNCPLANG, emailAddress, endDateTime, endUtc, isRegByManager, page, size, sort, startDateTime, startUtc).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * 수신거부 이메일 주소 목록을 조회.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param emailAddress Email 주소
     * @param endDateTime 수신거부 등록일 검색 기준 종료 일시, 문자열 포멧('yyyy-MM-dd HH:mm' UTC+09:00), endUtc 값이 우선한다.
     * @param endUtc 수신거부 등록일 검색 기준 종료 일시, UTC ( 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수 ),  endDateTime 값보다 이 값이 우선 적용된다.
     * @param isRegByManager 관리자 등록 여부
     * @param page 결과를 받고 싶은 페이지 index (0..N) (default:0)
     * @param size 한페이지에 당 레코드 개수 (default:10)
     * @param sort 정렬기준 필드 (형식 : property(,asc|desc)) : 기본정렬 방향은 오름차순(asc)이며, 복수의 필드를 정렬기준으로 사용할 수 있다. 정렬가능한 필드는 다음과 같다. (createUtc : 등록일시, adminRegYn : 관리자 등록 여부 )
     * @param startDateTime 수신거부 등록일 검색 기준 시작 일시, 문자열 포멧('yyyy-MM-dd HH:mm' UTC+09:00), startUtc 값이 우선한다.
     * @param startUtc 수신거부 등록일 검색 기준 시작 일시, UTC( 1970년 1월 1일 00:00:00 협정 세계시(UTC) 부터의 경과 시간을  1/1000초로 환산한 정수 ),  startDateTime 값보다 이 값이 우선 적용된다.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getWithServiceResponseAsync(String xNCPLANG, String emailAddress, String endDateTime, Long endUtc, Boolean isRegByManager, Integer page, Integer size, String sort, String startDateTime, Long startUtc) {
        return service.get(xNCPLANG, emailAddress, endDateTime, endUtc, isRegByManager, page, size, sort, startDateTime, startUtc)
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

    private ServiceResponse<Object> getDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<UnsubscribeListResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(403, new TypeToken<ErrorResponse>() { }.getType())
                .register(405, new TypeToken<ErrorResponse>() { }.getType())
                .register(415, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

}
