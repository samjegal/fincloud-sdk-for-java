/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.kms.implementation;

import retrofit2.Retrofit;
import com.fincloud.kms.KMS;
import com.fincloud.kms.models.CreateCustomKeyRequest;
import com.fincloud.kms.models.DecryptRequestKey;
import com.fincloud.kms.models.EncryptRequestKey;
import com.fincloud.kms.models.ReencryptRequestKey;
import com.fincloud.kms.models.SignRequest;
import com.fincloud.kms.models.VerifyRequest;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in KMS.
 */
public class KMSImpl implements KMS {
    /** The Retrofit service to perform REST calls. */
    private KMSService service;
    /** The service client containing this operation class. */
    private KmsManagementClientImpl client;

    /**
     * Initializes an instance of KMS.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public KMSImpl(Retrofit retrofit, KmsManagementClientImpl client) {
        this.service = retrofit.create(KMSService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for KMS to be
     * used by Retrofit to perform actually REST calls.
     */
    interface KMSService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.kms.KMS createCustomKey" })
        @POST("key/v1/{keyTag}/createCustomKey")
        Observable<Response<ResponseBody>> createCustomKey(@Path("keyTag") String keyTag, @Body CreateCustomKeyRequest parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.kms.KMS descrypt" })
        @POST("key/v1/{keyTag}/decrypt")
        Observable<Response<ResponseBody>> descrypt(@Path("keyTag") String keyTag, @Body DecryptRequestKey parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.kms.KMS encrypt" })
        @POST("key/v1/{keyTag}/encrypt")
        Observable<Response<ResponseBody>> encrypt(@Path("keyTag") String keyTag, @Body EncryptRequestKey parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.kms.KMS reencrypt" })
        @POST("key/v1/{keyTag}/reencrypt")
        Observable<Response<ResponseBody>> reencrypt(@Path("keyTag") String keyTag, @Body ReencryptRequestKey parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.kms.KMS sign" })
        @POST("key/v1/{keyTag}/sign")
        Observable<Response<ResponseBody>> sign(@Path("keyTag") String keyTag, @Body SignRequest parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.kms.KMS verify" })
        @POST("key/v1/{keyTag}/verify")
        Observable<Response<ResponseBody>> verify(@Path("keyTag") String keyTag, @Body VerifyRequest parameters);

    }

    /**
     * 임의의 high-entropy 키를 주어진 bit로 생성합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param parameters 요청 바디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void createCustomKey(String keyTag, CreateCustomKeyRequest parameters) {
        createCustomKeyWithServiceResponseAsync(keyTag, parameters).toBlocking().single().body();
    }

    /**
     * 임의의 high-entropy 키를 주어진 bit로 생성합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param parameters 요청 바디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> createCustomKeyAsync(String keyTag, CreateCustomKeyRequest parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createCustomKeyWithServiceResponseAsync(keyTag, parameters), serviceCallback);
    }

    /**
     * 임의의 high-entropy 키를 주어진 bit로 생성합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param parameters 요청 바디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> createCustomKeyAsync(String keyTag, CreateCustomKeyRequest parameters) {
        return createCustomKeyWithServiceResponseAsync(keyTag, parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 임의의 high-entropy 키를 주어진 bit로 생성합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param parameters 요청 바디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> createCustomKeyWithServiceResponseAsync(String keyTag, CreateCustomKeyRequest parameters) {
        if (keyTag == null) {
            throw new IllegalArgumentException("Parameter keyTag is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.createCustomKey(keyTag, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = createCustomKeyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> createCustomKeyDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 지정된 마스터키로 암호문을 복호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param ciphertext 복호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void descrypt(String keyTag, String ciphertext) {
        descryptWithServiceResponseAsync(keyTag, ciphertext).toBlocking().single().body();
    }

    /**
     * 지정된 마스터키로 암호문을 복호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param ciphertext 복호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> descryptAsync(String keyTag, String ciphertext, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(descryptWithServiceResponseAsync(keyTag, ciphertext), serviceCallback);
    }

    /**
     * 지정된 마스터키로 암호문을 복호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param ciphertext 복호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> descryptAsync(String keyTag, String ciphertext) {
        return descryptWithServiceResponseAsync(keyTag, ciphertext).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 지정된 마스터키로 암호문을 복호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param ciphertext 복호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> descryptWithServiceResponseAsync(String keyTag, String ciphertext) {
        if (keyTag == null) {
            throw new IllegalArgumentException("Parameter keyTag is required and cannot be null.");
        }
        if (ciphertext == null) {
            throw new IllegalArgumentException("Parameter ciphertext is required and cannot be null.");
        }
        DecryptRequestKey parameters = new DecryptRequestKey();
        parameters.withCiphertext(ciphertext);
        return service.descrypt(keyTag, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = descryptDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> descryptDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 지정된 마스터키의 현재 버전으로 최대 32KB 데이터를 암호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param plaintext 암호화할 데이터 (최대 32KB) (Base64 Encoding이 필요합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void encrypt(String keyTag, String plaintext) {
        encryptWithServiceResponseAsync(keyTag, plaintext).toBlocking().single().body();
    }

    /**
     * 지정된 마스터키의 현재 버전으로 최대 32KB 데이터를 암호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param plaintext 암호화할 데이터 (최대 32KB) (Base64 Encoding이 필요합니다)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> encryptAsync(String keyTag, String plaintext, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(encryptWithServiceResponseAsync(keyTag, plaintext), serviceCallback);
    }

    /**
     * 지정된 마스터키의 현재 버전으로 최대 32KB 데이터를 암호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param plaintext 암호화할 데이터 (최대 32KB) (Base64 Encoding이 필요합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> encryptAsync(String keyTag, String plaintext) {
        return encryptWithServiceResponseAsync(keyTag, plaintext).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 지정된 마스터키의 현재 버전으로 최대 32KB 데이터를 암호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param plaintext 암호화할 데이터 (최대 32KB) (Base64 Encoding이 필요합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> encryptWithServiceResponseAsync(String keyTag, String plaintext) {
        if (keyTag == null) {
            throw new IllegalArgumentException("Parameter keyTag is required and cannot be null.");
        }
        if (plaintext == null) {
            throw new IllegalArgumentException("Parameter plaintext is required and cannot be null.");
        }
        EncryptRequestKey parameters = new EncryptRequestKey();
        parameters.withPlaintext(plaintext);
        return service.encrypt(keyTag, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = encryptDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> encryptDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 암호문을 지정된 마스터키의 가장 최신 버전으로 재암호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param ciphertext 재암호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void reencrypt(String keyTag, String ciphertext) {
        reencryptWithServiceResponseAsync(keyTag, ciphertext).toBlocking().single().body();
    }

    /**
     * 암호문을 지정된 마스터키의 가장 최신 버전으로 재암호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param ciphertext 재암호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> reencryptAsync(String keyTag, String ciphertext, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(reencryptWithServiceResponseAsync(keyTag, ciphertext), serviceCallback);
    }

    /**
     * 암호문을 지정된 마스터키의 가장 최신 버전으로 재암호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param ciphertext 재암호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> reencryptAsync(String keyTag, String ciphertext) {
        return reencryptWithServiceResponseAsync(keyTag, ciphertext).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 암호문을 지정된 마스터키의 가장 최신 버전으로 재암호화합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param ciphertext 재암호화할 데이터 (kms prefix와 Base64 Encoding된 암호문으로 구성되어야합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> reencryptWithServiceResponseAsync(String keyTag, String ciphertext) {
        if (keyTag == null) {
            throw new IllegalArgumentException("Parameter keyTag is required and cannot be null.");
        }
        if (ciphertext == null) {
            throw new IllegalArgumentException("Parameter ciphertext is required and cannot be null.");
        }
        ReencryptRequestKey parameters = new ReencryptRequestKey();
        parameters.withCiphertext(ciphertext);
        return service.reencrypt(keyTag, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = reencryptDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> reencryptDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 지정된 마스터키(비밀키)로 최대 8KB 데이터의 서명값을 생성합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param data 서명값을 생성할 데이터 (최대 8KB) (Base64 Encoding이 필요합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void sign(String keyTag, String data) {
        signWithServiceResponseAsync(keyTag, data).toBlocking().single().body();
    }

    /**
     * 지정된 마스터키(비밀키)로 최대 8KB 데이터의 서명값을 생성합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param data 서명값을 생성할 데이터 (최대 8KB) (Base64 Encoding이 필요합니다)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> signAsync(String keyTag, String data, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(signWithServiceResponseAsync(keyTag, data), serviceCallback);
    }

    /**
     * 지정된 마스터키(비밀키)로 최대 8KB 데이터의 서명값을 생성합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param data 서명값을 생성할 데이터 (최대 8KB) (Base64 Encoding이 필요합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> signAsync(String keyTag, String data) {
        return signWithServiceResponseAsync(keyTag, data).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 지정된 마스터키(비밀키)로 최대 8KB 데이터의 서명값을 생성합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param data 서명값을 생성할 데이터 (최대 8KB) (Base64 Encoding이 필요합니다)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> signWithServiceResponseAsync(String keyTag, String data) {
        if (keyTag == null) {
            throw new IllegalArgumentException("Parameter keyTag is required and cannot be null.");
        }
        if (data == null) {
            throw new IllegalArgumentException("Parameter data is required and cannot be null.");
        }
        SignRequest parameters = new SignRequest();
        parameters.withData(data);
        return service.sign(keyTag, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = signDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> signDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * 지정된 마스터키(공개키)로 최대 8KB 데이터와 서명값을 비교하여 일치 여부를 반환합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param parameters 요청 바디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void verify(String keyTag, VerifyRequest parameters) {
        verifyWithServiceResponseAsync(keyTag, parameters).toBlocking().single().body();
    }

    /**
     * 지정된 마스터키(공개키)로 최대 8KB 데이터와 서명값을 비교하여 일치 여부를 반환합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param parameters 요청 바디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> verifyAsync(String keyTag, VerifyRequest parameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(verifyWithServiceResponseAsync(keyTag, parameters), serviceCallback);
    }

    /**
     * 지정된 마스터키(공개키)로 최대 8KB 데이터와 서명값을 비교하여 일치 여부를 반환합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param parameters 요청 바디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> verifyAsync(String keyTag, VerifyRequest parameters) {
        return verifyWithServiceResponseAsync(keyTag, parameters).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * 지정된 마스터키(공개키)로 최대 8KB 데이터와 서명값을 비교하여 일치 여부를 반환합니다.
     *
     * @param keyTag 생성된 키 봉인에 사용할 마스터키의 tag 값
     * @param parameters 요청 바디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> verifyWithServiceResponseAsync(String keyTag, VerifyRequest parameters) {
        if (keyTag == null) {
            throw new IllegalArgumentException("Parameter keyTag is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.verify(keyTag, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = verifyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> verifyDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
