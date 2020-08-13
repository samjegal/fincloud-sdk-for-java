/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer;

import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Unsubscribers.
 */
public interface Unsubscribers {
    /**
     * 수신거부 이메일 주소 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object get();

    /**
     * 수신거부 이메일 주소 목록을 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * 수신거부 이메일 주소 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getAsync();

    /**
     * 수신거부 이메일 주소 목록을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getWithServiceResponseAsync();
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
    Object get(String xNCPLANG, String emailAddress, String endDateTime, Long endUtc, Boolean isRegByManager, Integer page, Integer size, String sort, String startDateTime, Long startUtc);

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
    ServiceFuture<Object> getAsync(String xNCPLANG, String emailAddress, String endDateTime, Long endUtc, Boolean isRegByManager, Integer page, Integer size, String sort, String startDateTime, Long startUtc, final ServiceCallback<Object> serviceCallback);

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
    Observable<Object> getAsync(String xNCPLANG, String emailAddress, String endDateTime, Long endUtc, Boolean isRegByManager, Integer page, Integer size, String sort, String startDateTime, Long startUtc);

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
    Observable<ServiceResponse<Object>> getWithServiceResponseAsync(String xNCPLANG, String emailAddress, String endDateTime, Long endUtc, Boolean isRegByManager, Integer page, Integer size, String sort, String startDateTime, Long startUtc);

}
