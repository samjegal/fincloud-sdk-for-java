/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer;

import com.fincloud.outboundmailer.models.MailRequestParameter;
import com.fincloud.outboundmailer.models.MailResponseParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Mails.
 */
public interface Mails {
    /**
     * Email 발송을 요청.
     *
     * @param parameter 메일 발송 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MailResponseParameter object if successful.
     */
    MailResponseParameter create(MailRequestParameter parameter);

    /**
     * Email 발송을 요청.
     *
     * @param parameter 메일 발송 요청
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<MailResponseParameter> createAsync(MailRequestParameter parameter, final ServiceCallback<MailResponseParameter> serviceCallback);

    /**
     * Email 발송을 요청.
     *
     * @param parameter 메일 발송 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MailResponseParameter object
     */
    Observable<MailResponseParameter> createAsync(MailRequestParameter parameter);

    /**
     * Email 발송을 요청.
     *
     * @param parameter 메일 발송 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MailResponseParameter object
     */
    Observable<ServiceResponse<MailResponseParameter>> createWithServiceResponseAsync(MailRequestParameter parameter);

    /**
     * Email 발송요청 상세 조회 발송 요청한 목록을 조회.
     *
     * @param mailId 메일 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object get(String mailId);

    /**
     * Email 발송요청 상세 조회 발송 요청한 목록을 조회.
     *
     * @param mailId 메일 Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getAsync(String mailId, final ServiceCallback<Object> serviceCallback);

    /**
     * Email 발송요청 상세 조회 발송 요청한 목록을 조회.
     *
     * @param mailId 메일 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getAsync(String mailId);

    /**
     * Email 발송요청 상세 조회 발송 요청한 목록을 조회.
     *
     * @param mailId 메일 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getWithServiceResponseAsync(String mailId);
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
    Object get(String mailId, String xNCPLANG);

    /**
     * Email 발송요청 상세 조회 발송 요청한 목록을 조회.
     *
     * @param mailId 메일 Id
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getAsync(String mailId, String xNCPLANG, final ServiceCallback<Object> serviceCallback);

    /**
     * Email 발송요청 상세 조회 발송 요청한 목록을 조회.
     *
     * @param mailId 메일 Id
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getAsync(String mailId, String xNCPLANG);

    /**
     * Email 발송요청 상세 조회 발송 요청한 목록을 조회.
     *
     * @param mailId 메일 Id
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getWithServiceResponseAsync(String mailId, String xNCPLANG);

    /**
     * 발송 요청한 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getRequestList();

    /**
     * 발송 요청한 목록을 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getRequestListAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * 발송 요청한 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getRequestListAsync();

    /**
     * 발송 요청한 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getRequestListWithServiceResponseAsync();
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
    Object getRequestList(String xNCPLANG, String dispatchType, String endDateTime, Long endUtc, String mailId, Integer page, String recipientAddress, String senderAddress, List<String> sendStatus, Integer size, String sort, String startDateTime, Long startUtc, Integer templateSid, String title);

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
    ServiceFuture<Object> getRequestListAsync(String xNCPLANG, String dispatchType, String endDateTime, Long endUtc, String mailId, Integer page, String recipientAddress, String senderAddress, List<String> sendStatus, Integer size, String sort, String startDateTime, Long startUtc, Integer templateSid, String title, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getRequestListAsync(String xNCPLANG, String dispatchType, String endDateTime, Long endUtc, String mailId, Integer page, String recipientAddress, String senderAddress, List<String> sendStatus, Integer size, String sort, String startDateTime, Long startUtc, Integer templateSid, String title);

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
    Observable<ServiceResponse<Object>> getRequestListWithServiceResponseAsync(String xNCPLANG, String dispatchType, String endDateTime, Long endUtc, String mailId, Integer page, String recipientAddress, String senderAddress, List<String> sendStatus, Integer size, String sort, String startDateTime, Long startUtc, Integer templateSid, String title);

    /**
     * 발송 요청한 특정 요청ID에 의해 생성된 메일 목록을 조회.
     *
     * @param requestId requestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getListByRequestId(String requestId);

    /**
     * 발송 요청한 특정 요청ID에 의해 생성된 메일 목록을 조회.
     *
     * @param requestId requestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getListByRequestIdAsync(String requestId, final ServiceCallback<Object> serviceCallback);

    /**
     * 발송 요청한 특정 요청ID에 의해 생성된 메일 목록을 조회.
     *
     * @param requestId requestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getListByRequestIdAsync(String requestId);

    /**
     * 발송 요청한 특정 요청ID에 의해 생성된 메일 목록을 조회.
     *
     * @param requestId requestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getListByRequestIdWithServiceResponseAsync(String requestId);
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
    Object getListByRequestId(String requestId, String xNCPLANG, String mailId, Integer page, String recipientAddress, List<String> sendStatus, Integer size, List<String> sort, String title);

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
    ServiceFuture<Object> getListByRequestIdAsync(String requestId, String xNCPLANG, String mailId, Integer page, String recipientAddress, List<String> sendStatus, Integer size, List<String> sort, String title, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getListByRequestIdAsync(String requestId, String xNCPLANG, String mailId, Integer page, String recipientAddress, List<String> sendStatus, Integer size, List<String> sort, String title);

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
    Observable<ServiceResponse<Object>> getListByRequestIdWithServiceResponseAsync(String requestId, String xNCPLANG, String mailId, Integer page, String recipientAddress, List<String> sendStatus, Integer size, List<String> sort, String title);

    /**
     * 발송 요청한 requestId 를 전달하여 해당 요청으로 발송중인 메일 현황과 상태별 개수를 조회.
     *
     * @param requestId requestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getStatusByRequestId(String requestId);

    /**
     * 발송 요청한 requestId 를 전달하여 해당 요청으로 발송중인 메일 현황과 상태별 개수를 조회.
     *
     * @param requestId requestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getStatusByRequestIdAsync(String requestId, final ServiceCallback<Object> serviceCallback);

    /**
     * 발송 요청한 requestId 를 전달하여 해당 요청으로 발송중인 메일 현황과 상태별 개수를 조회.
     *
     * @param requestId requestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getStatusByRequestIdAsync(String requestId);

    /**
     * 발송 요청한 requestId 를 전달하여 해당 요청으로 발송중인 메일 현황과 상태별 개수를 조회.
     *
     * @param requestId requestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getStatusByRequestIdWithServiceResponseAsync(String requestId);
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
    Object getStatusByRequestId(String requestId, String xNCPLANG, String mailId, Integer page, String recipientAddress, List<String> sendStatus, Integer size, List<String> sort, String title);

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
    ServiceFuture<Object> getStatusByRequestIdAsync(String requestId, String xNCPLANG, String mailId, Integer page, String recipientAddress, List<String> sendStatus, Integer size, List<String> sort, String title, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getStatusByRequestIdAsync(String requestId, String xNCPLANG, String mailId, Integer page, String recipientAddress, List<String> sendStatus, Integer size, List<String> sort, String title);

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
    Observable<ServiceResponse<Object>> getStatusByRequestIdWithServiceResponseAsync(String requestId, String xNCPLANG, String mailId, Integer page, String recipientAddress, List<String> sendStatus, Integer size, List<String> sort, String title);

}
