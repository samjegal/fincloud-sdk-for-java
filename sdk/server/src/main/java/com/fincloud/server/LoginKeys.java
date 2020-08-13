/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server;

import com.fincloud.server.models.CreateLoginKeyResponse;
import com.fincloud.server.models.DeleteLoginKeysResponse;
import com.fincloud.server.models.LoginKeyListResponse;
import com.fincloud.server.models.LoginKeyResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in LoginKeys.
 */
public interface LoginKeys {
    /**
     * 로그인 키 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LoginKeyListResponse object if successful.
     */
    LoginKeyListResponse getList(String responseFormatType);

    /**
     * 로그인 키 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<LoginKeyListResponse> getListAsync(String responseFormatType, final ServiceCallback<LoginKeyListResponse> serviceCallback);

    /**
     * 로그인 키 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginKeyListResponse object
     */
    Observable<LoginKeyListResponse> getListAsync(String responseFormatType);

    /**
     * 로그인 키 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginKeyListResponse object
     */
    Observable<ServiceResponse<LoginKeyListResponse>> getListWithServiceResponseAsync(String responseFormatType);
    /**
     * 로그인 키 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LoginKeyListResponse object if successful.
     */
    LoginKeyListResponse getList(String responseFormatType, String pageNo, String pageSize);

    /**
     * 로그인 키 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<LoginKeyListResponse> getListAsync(String responseFormatType, String pageNo, String pageSize, final ServiceCallback<LoginKeyListResponse> serviceCallback);

    /**
     * 로그인 키 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginKeyListResponse object
     */
    Observable<LoginKeyListResponse> getListAsync(String responseFormatType, String pageNo, String pageSize);

    /**
     * 로그인 키 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginKeyListResponse object
     */
    Observable<ServiceResponse<LoginKeyListResponse>> getListWithServiceResponseAsync(String responseFormatType, String pageNo, String pageSize);

    /**
     * 로그인 키를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CreateLoginKeyResponse object if successful.
     */
    CreateLoginKeyResponse create(String responseFormatType);

    /**
     * 로그인 키를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<CreateLoginKeyResponse> createAsync(String responseFormatType, final ServiceCallback<CreateLoginKeyResponse> serviceCallback);

    /**
     * 로그인 키를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CreateLoginKeyResponse object
     */
    Observable<CreateLoginKeyResponse> createAsync(String responseFormatType);

    /**
     * 로그인 키를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CreateLoginKeyResponse object
     */
    Observable<ServiceResponse<CreateLoginKeyResponse>> createWithServiceResponseAsync(String responseFormatType);
    /**
     * 로그인 키를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param keyName 키 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CreateLoginKeyResponse object if successful.
     */
    CreateLoginKeyResponse create(String responseFormatType, String keyName);

    /**
     * 로그인 키를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param keyName 키 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<CreateLoginKeyResponse> createAsync(String responseFormatType, String keyName, final ServiceCallback<CreateLoginKeyResponse> serviceCallback);

    /**
     * 로그인 키를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param keyName 키 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CreateLoginKeyResponse object
     */
    Observable<CreateLoginKeyResponse> createAsync(String responseFormatType, String keyName);

    /**
     * 로그인 키를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param keyName 키 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CreateLoginKeyResponse object
     */
    Observable<ServiceResponse<CreateLoginKeyResponse>> createWithServiceResponseAsync(String responseFormatType, String keyName);

    /**
     * 로그인 키를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param keyNameListN 키 이름 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DeleteLoginKeysResponse object if successful.
     */
    DeleteLoginKeysResponse delete(String responseFormatType, String keyNameListN);

    /**
     * 로그인 키를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param keyNameListN 키 이름 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DeleteLoginKeysResponse> deleteAsync(String responseFormatType, String keyNameListN, final ServiceCallback<DeleteLoginKeysResponse> serviceCallback);

    /**
     * 로그인 키를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param keyNameListN 키 이름 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteLoginKeysResponse object
     */
    Observable<DeleteLoginKeysResponse> deleteAsync(String responseFormatType, String keyNameListN);

    /**
     * 로그인 키를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param keyNameListN 키 이름 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteLoginKeysResponse object
     */
    Observable<ServiceResponse<DeleteLoginKeysResponse>> deleteWithServiceResponseAsync(String responseFormatType, String keyNameListN);

    /**
     * 사용자가 생성한 로그인 키를 Import.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicKey 공개키
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LoginKeyResponse object if successful.
     */
    LoginKeyResponse importMethod(String responseFormatType, String publicKey);

    /**
     * 사용자가 생성한 로그인 키를 Import.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicKey 공개키
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<LoginKeyResponse> importMethodAsync(String responseFormatType, String publicKey, final ServiceCallback<LoginKeyResponse> serviceCallback);

    /**
     * 사용자가 생성한 로그인 키를 Import.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicKey 공개키
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginKeyResponse object
     */
    Observable<LoginKeyResponse> importMethodAsync(String responseFormatType, String publicKey);

    /**
     * 사용자가 생성한 로그인 키를 Import.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicKey 공개키
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginKeyResponse object
     */
    Observable<ServiceResponse<LoginKeyResponse>> importMethodWithServiceResponseAsync(String responseFormatType, String publicKey);
    /**
     * 사용자가 생성한 로그인 키를 Import.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicKey 공개키
     * @param keyName 키 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LoginKeyResponse object if successful.
     */
    LoginKeyResponse importMethod(String responseFormatType, String publicKey, String keyName);

    /**
     * 사용자가 생성한 로그인 키를 Import.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicKey 공개키
     * @param keyName 키 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<LoginKeyResponse> importMethodAsync(String responseFormatType, String publicKey, String keyName, final ServiceCallback<LoginKeyResponse> serviceCallback);

    /**
     * 사용자가 생성한 로그인 키를 Import.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicKey 공개키
     * @param keyName 키 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginKeyResponse object
     */
    Observable<LoginKeyResponse> importMethodAsync(String responseFormatType, String publicKey, String keyName);

    /**
     * 사용자가 생성한 로그인 키를 Import.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicKey 공개키
     * @param keyName 키 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginKeyResponse object
     */
    Observable<ServiceResponse<LoginKeyResponse>> importMethodWithServiceResponseAsync(String responseFormatType, String publicKey, String keyName);

}
