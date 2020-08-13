/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.implementation;

import retrofit2.Retrofit;
import com.fincloud.server.LoginKeys;
import com.fincloud.server.models.CreateLoginKeyResponse;
import com.fincloud.server.models.DeleteLoginKeysResponse;
import com.fincloud.server.models.LoginKeyListResponse;
import com.fincloud.server.models.LoginKeyResponse;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in LoginKeys.
 */
public class LoginKeysImpl implements LoginKeys {
    /** The Retrofit service to perform REST calls. */
    private LoginKeysService service;
    /** The service client containing this operation class. */
    private ServerManagementClientImpl client;

    /**
     * Initializes an instance of LoginKeys.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LoginKeysImpl(Retrofit retrofit, ServerManagementClientImpl client) {
        this.service = retrofit.create(LoginKeysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for LoginKeys to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LoginKeysService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.LoginKeys getList" })
        @GET("vserver/v2/getLoginKeyList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("pageNo") String pageNo, @Query("pageSize") String pageSize);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.LoginKeys create" })
        @POST("vserver/v2/createLoginKey")
        Observable<Response<ResponseBody>> create(@Query("responseFormatType") String responseFormatType, @Query("keyName") String keyName);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.LoginKeys delete" })
        @POST("vserver/v2/deleteLoginKeys")
        Observable<Response<ResponseBody>> delete(@Query("responseFormatType") String responseFormatType, @Query("keyNameList.N") String keyNameListN);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.LoginKeys importMethod" })
        @POST("vserver/v2/importLoginKey")
        Observable<Response<ResponseBody>> importMethod(@Query("responseFormatType") String responseFormatType, @Query("keyName") String keyName, @Query("publicKey") String publicKey);

    }

    /**
     * 로그인 키 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LoginKeyListResponse object if successful.
     */
    public LoginKeyListResponse getList(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 로그인 키 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LoginKeyListResponse> getListAsync(String responseFormatType, final ServiceCallback<LoginKeyListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 로그인 키 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginKeyListResponse object
     */
    public Observable<LoginKeyListResponse> getListAsync(String responseFormatType) {
        return getListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<LoginKeyListResponse>, LoginKeyListResponse>() {
            @Override
            public LoginKeyListResponse call(ServiceResponse<LoginKeyListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 로그인 키 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginKeyListResponse object
     */
    public Observable<ServiceResponse<LoginKeyListResponse>> getListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String pageNo = null;
        final String pageSize = null;
        return service.getList(responseFormatType, pageNo, pageSize)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LoginKeyListResponse>>>() {
                @Override
                public Observable<ServiceResponse<LoginKeyListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LoginKeyListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

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
    public LoginKeyListResponse getList(String responseFormatType, String pageNo, String pageSize) {
        return getListWithServiceResponseAsync(responseFormatType, pageNo, pageSize).toBlocking().single().body();
    }

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
    public ServiceFuture<LoginKeyListResponse> getListAsync(String responseFormatType, String pageNo, String pageSize, final ServiceCallback<LoginKeyListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, pageNo, pageSize), serviceCallback);
    }

    /**
     * 로그인 키 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginKeyListResponse object
     */
    public Observable<LoginKeyListResponse> getListAsync(String responseFormatType, String pageNo, String pageSize) {
        return getListWithServiceResponseAsync(responseFormatType, pageNo, pageSize).map(new Func1<ServiceResponse<LoginKeyListResponse>, LoginKeyListResponse>() {
            @Override
            public LoginKeyListResponse call(ServiceResponse<LoginKeyListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 로그인 키 리스트를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginKeyListResponse object
     */
    public Observable<ServiceResponse<LoginKeyListResponse>> getListWithServiceResponseAsync(String responseFormatType, String pageNo, String pageSize) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getList(responseFormatType, pageNo, pageSize)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LoginKeyListResponse>>>() {
                @Override
                public Observable<ServiceResponse<LoginKeyListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LoginKeyListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LoginKeyListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<LoginKeyListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<LoginKeyListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 로그인 키를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CreateLoginKeyResponse object if successful.
     */
    public CreateLoginKeyResponse create(String responseFormatType) {
        return createWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 로그인 키를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CreateLoginKeyResponse> createAsync(String responseFormatType, final ServiceCallback<CreateLoginKeyResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 로그인 키를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CreateLoginKeyResponse object
     */
    public Observable<CreateLoginKeyResponse> createAsync(String responseFormatType) {
        return createWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<CreateLoginKeyResponse>, CreateLoginKeyResponse>() {
            @Override
            public CreateLoginKeyResponse call(ServiceResponse<CreateLoginKeyResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 로그인 키를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CreateLoginKeyResponse object
     */
    public Observable<ServiceResponse<CreateLoginKeyResponse>> createWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final String keyName = null;
        return service.create(responseFormatType, keyName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CreateLoginKeyResponse>>>() {
                @Override
                public Observable<ServiceResponse<CreateLoginKeyResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CreateLoginKeyResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

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
    public CreateLoginKeyResponse create(String responseFormatType, String keyName) {
        return createWithServiceResponseAsync(responseFormatType, keyName).toBlocking().single().body();
    }

    /**
     * 로그인 키를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param keyName 키 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CreateLoginKeyResponse> createAsync(String responseFormatType, String keyName, final ServiceCallback<CreateLoginKeyResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(responseFormatType, keyName), serviceCallback);
    }

    /**
     * 로그인 키를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param keyName 키 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CreateLoginKeyResponse object
     */
    public Observable<CreateLoginKeyResponse> createAsync(String responseFormatType, String keyName) {
        return createWithServiceResponseAsync(responseFormatType, keyName).map(new Func1<ServiceResponse<CreateLoginKeyResponse>, CreateLoginKeyResponse>() {
            @Override
            public CreateLoginKeyResponse call(ServiceResponse<CreateLoginKeyResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 로그인 키를 생성.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param keyName 키 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CreateLoginKeyResponse object
     */
    public Observable<ServiceResponse<CreateLoginKeyResponse>> createWithServiceResponseAsync(String responseFormatType, String keyName) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.create(responseFormatType, keyName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CreateLoginKeyResponse>>>() {
                @Override
                public Observable<ServiceResponse<CreateLoginKeyResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CreateLoginKeyResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<CreateLoginKeyResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<CreateLoginKeyResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<CreateLoginKeyResponse>() { }.getType())
                .build(response);
    }

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
    public DeleteLoginKeysResponse delete(String responseFormatType, String keyNameListN) {
        return deleteWithServiceResponseAsync(responseFormatType, keyNameListN).toBlocking().single().body();
    }

    /**
     * 로그인 키를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param keyNameListN 키 이름 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DeleteLoginKeysResponse> deleteAsync(String responseFormatType, String keyNameListN, final ServiceCallback<DeleteLoginKeysResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(responseFormatType, keyNameListN), serviceCallback);
    }

    /**
     * 로그인 키를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param keyNameListN 키 이름 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteLoginKeysResponse object
     */
    public Observable<DeleteLoginKeysResponse> deleteAsync(String responseFormatType, String keyNameListN) {
        return deleteWithServiceResponseAsync(responseFormatType, keyNameListN).map(new Func1<ServiceResponse<DeleteLoginKeysResponse>, DeleteLoginKeysResponse>() {
            @Override
            public DeleteLoginKeysResponse call(ServiceResponse<DeleteLoginKeysResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 로그인 키를 삭제.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param keyNameListN 키 이름 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DeleteLoginKeysResponse object
     */
    public Observable<ServiceResponse<DeleteLoginKeysResponse>> deleteWithServiceResponseAsync(String responseFormatType, String keyNameListN) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (keyNameListN == null) {
            throw new IllegalArgumentException("Parameter keyNameListN is required and cannot be null.");
        }
        return service.delete(responseFormatType, keyNameListN)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DeleteLoginKeysResponse>>>() {
                @Override
                public Observable<ServiceResponse<DeleteLoginKeysResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DeleteLoginKeysResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DeleteLoginKeysResponse> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DeleteLoginKeysResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DeleteLoginKeysResponse>() { }.getType())
                .build(response);
    }

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
    public LoginKeyResponse importMethod(String responseFormatType, String publicKey) {
        return importMethodWithServiceResponseAsync(responseFormatType, publicKey).toBlocking().single().body();
    }

    /**
     * 사용자가 생성한 로그인 키를 Import.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicKey 공개키
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LoginKeyResponse> importMethodAsync(String responseFormatType, String publicKey, final ServiceCallback<LoginKeyResponse> serviceCallback) {
        return ServiceFuture.fromResponse(importMethodWithServiceResponseAsync(responseFormatType, publicKey), serviceCallback);
    }

    /**
     * 사용자가 생성한 로그인 키를 Import.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicKey 공개키
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginKeyResponse object
     */
    public Observable<LoginKeyResponse> importMethodAsync(String responseFormatType, String publicKey) {
        return importMethodWithServiceResponseAsync(responseFormatType, publicKey).map(new Func1<ServiceResponse<LoginKeyResponse>, LoginKeyResponse>() {
            @Override
            public LoginKeyResponse call(ServiceResponse<LoginKeyResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 사용자가 생성한 로그인 키를 Import.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicKey 공개키
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginKeyResponse object
     */
    public Observable<ServiceResponse<LoginKeyResponse>> importMethodWithServiceResponseAsync(String responseFormatType, String publicKey) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (publicKey == null) {
            throw new IllegalArgumentException("Parameter publicKey is required and cannot be null.");
        }
        final String keyName = null;
        return service.importMethod(responseFormatType, keyName, publicKey)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LoginKeyResponse>>>() {
                @Override
                public Observable<ServiceResponse<LoginKeyResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LoginKeyResponse> clientResponse = importMethodDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

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
    public LoginKeyResponse importMethod(String responseFormatType, String publicKey, String keyName) {
        return importMethodWithServiceResponseAsync(responseFormatType, publicKey, keyName).toBlocking().single().body();
    }

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
    public ServiceFuture<LoginKeyResponse> importMethodAsync(String responseFormatType, String publicKey, String keyName, final ServiceCallback<LoginKeyResponse> serviceCallback) {
        return ServiceFuture.fromResponse(importMethodWithServiceResponseAsync(responseFormatType, publicKey, keyName), serviceCallback);
    }

    /**
     * 사용자가 생성한 로그인 키를 Import.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicKey 공개키
     * @param keyName 키 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginKeyResponse object
     */
    public Observable<LoginKeyResponse> importMethodAsync(String responseFormatType, String publicKey, String keyName) {
        return importMethodWithServiceResponseAsync(responseFormatType, publicKey, keyName).map(new Func1<ServiceResponse<LoginKeyResponse>, LoginKeyResponse>() {
            @Override
            public LoginKeyResponse call(ServiceResponse<LoginKeyResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 사용자가 생성한 로그인 키를 Import.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param publicKey 공개키
     * @param keyName 키 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoginKeyResponse object
     */
    public Observable<ServiceResponse<LoginKeyResponse>> importMethodWithServiceResponseAsync(String responseFormatType, String publicKey, String keyName) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (publicKey == null) {
            throw new IllegalArgumentException("Parameter publicKey is required and cannot be null.");
        }
        return service.importMethod(responseFormatType, keyName, publicKey)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LoginKeyResponse>>>() {
                @Override
                public Observable<ServiceResponse<LoginKeyResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LoginKeyResponse> clientResponse = importMethodDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LoginKeyResponse> importMethodDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<LoginKeyResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<LoginKeyResponse>() { }.getType())
                .build(response);
    }

}
