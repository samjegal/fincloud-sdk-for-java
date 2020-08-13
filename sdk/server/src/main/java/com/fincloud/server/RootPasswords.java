/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server;

import com.fincloud.server.models.RootPassword;
import com.fincloud.server.models.RootPasswordServerInstanceListResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in RootPasswords.
 */
public interface RootPasswords {
    /**
     * 서버 인스턴스의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RootPassword object if successful.
     */
    RootPassword get(String responseFormatType, String serverInstanceNo);

    /**
     * 서버 인스턴스의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RootPassword> getAsync(String responseFormatType, String serverInstanceNo, final ServiceCallback<RootPassword> serviceCallback);

    /**
     * 서버 인스턴스의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RootPassword object
     */
    Observable<RootPassword> getAsync(String responseFormatType, String serverInstanceNo);

    /**
     * 서버 인스턴스의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RootPassword object
     */
    Observable<ServiceResponse<RootPassword>> getWithServiceResponseAsync(String responseFormatType, String serverInstanceNo);
    /**
     * 서버 인스턴스의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param privateKey 개인키
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RootPassword object if successful.
     */
    RootPassword get(String responseFormatType, String serverInstanceNo, String regionCode, String privateKey);

    /**
     * 서버 인스턴스의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param privateKey 개인키
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RootPassword> getAsync(String responseFormatType, String serverInstanceNo, String regionCode, String privateKey, final ServiceCallback<RootPassword> serviceCallback);

    /**
     * 서버 인스턴스의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param privateKey 개인키
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RootPassword object
     */
    Observable<RootPassword> getAsync(String responseFormatType, String serverInstanceNo, String regionCode, String privateKey);

    /**
     * 서버 인스턴스의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param privateKey 개인키
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RootPassword object
     */
    Observable<ServiceResponse<RootPassword>> getWithServiceResponseAsync(String responseFormatType, String serverInstanceNo, String regionCode, String privateKey);

    /**
     * 서버 인스턴스 리스트의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param rootPasswordServerInstanceListNserverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RootPasswordServerInstanceListResponse object if successful.
     */
    RootPasswordServerInstanceListResponse getList(String responseFormatType, String rootPasswordServerInstanceListNserverInstanceNo);

    /**
     * 서버 인스턴스 리스트의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param rootPasswordServerInstanceListNserverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RootPasswordServerInstanceListResponse> getListAsync(String responseFormatType, String rootPasswordServerInstanceListNserverInstanceNo, final ServiceCallback<RootPasswordServerInstanceListResponse> serviceCallback);

    /**
     * 서버 인스턴스 리스트의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param rootPasswordServerInstanceListNserverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RootPasswordServerInstanceListResponse object
     */
    Observable<RootPasswordServerInstanceListResponse> getListAsync(String responseFormatType, String rootPasswordServerInstanceListNserverInstanceNo);

    /**
     * 서버 인스턴스 리스트의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param rootPasswordServerInstanceListNserverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RootPasswordServerInstanceListResponse object
     */
    Observable<ServiceResponse<RootPasswordServerInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType, String rootPasswordServerInstanceListNserverInstanceNo);
    /**
     * 서버 인스턴스 리스트의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param rootPasswordServerInstanceListNserverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param rootPasswordServerInstanceListNprivateKey 개인키
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RootPasswordServerInstanceListResponse object if successful.
     */
    RootPasswordServerInstanceListResponse getList(String responseFormatType, String rootPasswordServerInstanceListNserverInstanceNo, String regionCode, String rootPasswordServerInstanceListNprivateKey);

    /**
     * 서버 인스턴스 리스트의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param rootPasswordServerInstanceListNserverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param rootPasswordServerInstanceListNprivateKey 개인키
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RootPasswordServerInstanceListResponse> getListAsync(String responseFormatType, String rootPasswordServerInstanceListNserverInstanceNo, String regionCode, String rootPasswordServerInstanceListNprivateKey, final ServiceCallback<RootPasswordServerInstanceListResponse> serviceCallback);

    /**
     * 서버 인스턴스 리스트의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param rootPasswordServerInstanceListNserverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param rootPasswordServerInstanceListNprivateKey 개인키
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RootPasswordServerInstanceListResponse object
     */
    Observable<RootPasswordServerInstanceListResponse> getListAsync(String responseFormatType, String rootPasswordServerInstanceListNserverInstanceNo, String regionCode, String rootPasswordServerInstanceListNprivateKey);

    /**
     * 서버 인스턴스 리스트의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param rootPasswordServerInstanceListNserverInstanceNo 서버 인스턴스 번호
     * @param regionCode REGION 코드
     * @param rootPasswordServerInstanceListNprivateKey 개인키
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RootPasswordServerInstanceListResponse object
     */
    Observable<ServiceResponse<RootPasswordServerInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType, String rootPasswordServerInstanceListNserverInstanceNo, String regionCode, String rootPasswordServerInstanceListNprivateKey);

}
