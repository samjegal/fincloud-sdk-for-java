/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kms;

import com.fincloud.kms.models.CreateCustomKeyRequest;
import com.fincloud.kms.models.VerifyRequest;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in KMS.
 */
public interface KMS {
    /**
     * 임의의 high-entropy 키를 주어진 bit로 생성합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param parameters 요청 바디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void createCustomKey(String keyTag, CreateCustomKeyRequest parameters);

    /**
     * 임의의 high-entropy 키를 주어진 bit로 생성합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param parameters 요청 바디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createCustomKeyAsync(String keyTag, CreateCustomKeyRequest parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * 임의의 high-entropy 키를 주어진 bit로 생성합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param parameters 요청 바디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createCustomKeyAsync(String keyTag, CreateCustomKeyRequest parameters);

    /**
     * 임의의 high-entropy 키를 주어진 bit로 생성합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param parameters 요청 바디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createCustomKeyWithServiceResponseAsync(String keyTag, CreateCustomKeyRequest parameters);

    /**
     * 지정된 마스터키로 암호문을 복호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param ciphertext 복호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void descrypt(String keyTag, String ciphertext);

    /**
     * 지정된 마스터키로 암호문을 복호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param ciphertext 복호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> descryptAsync(String keyTag, String ciphertext, final ServiceCallback<Void> serviceCallback);

    /**
     * 지정된 마스터키로 암호문을 복호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param ciphertext 복호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> descryptAsync(String keyTag, String ciphertext);

    /**
     * 지정된 마스터키로 암호문을 복호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param ciphertext 복호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> descryptWithServiceResponseAsync(String keyTag, String ciphertext);

    /**
     * 지정된 마스터키의 현재 버전으로 최대 32KB 데이터를 암호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param plaintext 암호화할 데이터 (최대 32KB) (Base64 Encoding이 필요합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void encrypt(String keyTag, String plaintext);

    /**
     * 지정된 마스터키의 현재 버전으로 최대 32KB 데이터를 암호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param plaintext 암호화할 데이터 (최대 32KB) (Base64 Encoding이 필요합니다)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> encryptAsync(String keyTag, String plaintext, final ServiceCallback<Void> serviceCallback);

    /**
     * 지정된 마스터키의 현재 버전으로 최대 32KB 데이터를 암호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param plaintext 암호화할 데이터 (최대 32KB) (Base64 Encoding이 필요합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> encryptAsync(String keyTag, String plaintext);

    /**
     * 지정된 마스터키의 현재 버전으로 최대 32KB 데이터를 암호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param plaintext 암호화할 데이터 (최대 32KB) (Base64 Encoding이 필요합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> encryptWithServiceResponseAsync(String keyTag, String plaintext);

    /**
     * 암호문을 지정된 마스터키의 가장 최신 버전으로 재암호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param ciphertext 재암호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void reencrypt(String keyTag, String ciphertext);

    /**
     * 암호문을 지정된 마스터키의 가장 최신 버전으로 재암호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param ciphertext 재암호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> reencryptAsync(String keyTag, String ciphertext, final ServiceCallback<Void> serviceCallback);

    /**
     * 암호문을 지정된 마스터키의 가장 최신 버전으로 재암호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param ciphertext 재암호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> reencryptAsync(String keyTag, String ciphertext);

    /**
     * 암호문을 지정된 마스터키의 가장 최신 버전으로 재암호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param ciphertext 재암호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> reencryptWithServiceResponseAsync(String keyTag, String ciphertext);

    /**
     * 지정된 마스터키(비밀키)로 최대 8KB 데이터의 서명값을 생성합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param data 서명값을 생성할 데이터 (최대 8KB) (Base64 Encoding이 필요합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void sign(String keyTag, String data);

    /**
     * 지정된 마스터키(비밀키)로 최대 8KB 데이터의 서명값을 생성합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param data 서명값을 생성할 데이터 (최대 8KB) (Base64 Encoding이 필요합니다)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> signAsync(String keyTag, String data, final ServiceCallback<Void> serviceCallback);

    /**
     * 지정된 마스터키(비밀키)로 최대 8KB 데이터의 서명값을 생성합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param data 서명값을 생성할 데이터 (최대 8KB) (Base64 Encoding이 필요합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> signAsync(String keyTag, String data);

    /**
     * 지정된 마스터키(비밀키)로 최대 8KB 데이터의 서명값을 생성합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param data 서명값을 생성할 데이터 (최대 8KB) (Base64 Encoding이 필요합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> signWithServiceResponseAsync(String keyTag, String data);

    /**
     * 지정된 마스터키(공개키)로 최대 8KB 데이터와 서명값을 비교하여 일치 여부를 반환합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param parameters 요청 바디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void verify(String keyTag, VerifyRequest parameters);

    /**
     * 지정된 마스터키(공개키)로 최대 8KB 데이터와 서명값을 비교하여 일치 여부를 반환합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param parameters 요청 바디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> verifyAsync(String keyTag, VerifyRequest parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * 지정된 마스터키(공개키)로 최대 8KB 데이터와 서명값을 비교하여 일치 여부를 반환합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param parameters 요청 바디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> verifyAsync(String keyTag, VerifyRequest parameters);

    /**
     * 지정된 마스터키(공개키)로 최대 8KB 데이터와 서명값을 비교하여 일치 여부를 반환합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param parameters 요청 바디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> verifyWithServiceResponseAsync(String keyTag, VerifyRequest parameters);

}
