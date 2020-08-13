/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.implementation;

import retrofit2.Retrofit;
import com.fincloud.server.RootPasswords;
import com.fincloud.server.models.RootPassword;
import com.fincloud.server.models.RootPasswordServerInstanceListResponse;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in RootPasswords.
 */
public class RootPasswordsImpl implements RootPasswords {
    /** The Retrofit service to perform REST calls. */
    private RootPasswordsService service;
    /** The service client containing this operation class. */
    private ServerManagementClientImpl client;

    /**
     * Initializes an instance of RootPasswords.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RootPasswordsImpl(Retrofit retrofit, ServerManagementClientImpl client) {
        this.service = retrofit.create(RootPasswordsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for RootPasswords to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RootPasswordsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.RootPasswords get" })
        @POST("vserver/v2/getRootPassword")
        Observable<Response<ResponseBody>> get(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("serverInstanceNo") String serverInstanceNo, @Query("privateKey") String privateKey);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.server.RootPasswords getList" })
        @POST("vserver/v2/getRootPasswordServerInstanceList")
        Observable<Response<ResponseBody>> getList(@Query("responseFormatType") String responseFormatType, @Query("regionCode") String regionCode, @Query("rootPasswordServerInstanceList.N.serverInstanceNo") String rootPasswordServerInstanceListNserverInstanceNo, @Query("rootPasswordServerInstanceList.N.privateKey") String rootPasswordServerInstanceListNprivateKey);

    }

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
    public RootPassword get(String responseFormatType, String serverInstanceNo) {
        return getWithServiceResponseAsync(responseFormatType, serverInstanceNo).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RootPassword> getAsync(String responseFormatType, String serverInstanceNo, final ServiceCallback<RootPassword> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(responseFormatType, serverInstanceNo), serviceCallback);
    }

    /**
     * 서버 인스턴스의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RootPassword object
     */
    public Observable<RootPassword> getAsync(String responseFormatType, String serverInstanceNo) {
        return getWithServiceResponseAsync(responseFormatType, serverInstanceNo).map(new Func1<ServiceResponse<RootPassword>, RootPassword>() {
            @Override
            public RootPassword call(ServiceResponse<RootPassword> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param serverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RootPassword object
     */
    public Observable<ServiceResponse<RootPassword>> getWithServiceResponseAsync(String responseFormatType, String serverInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        final String privateKey = null;
        return service.get(responseFormatType, regionCode, serverInstanceNo, privateKey)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RootPassword>>>() {
                @Override
                public Observable<ServiceResponse<RootPassword>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RootPassword> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

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
    public RootPassword get(String responseFormatType, String serverInstanceNo, String regionCode, String privateKey) {
        return getWithServiceResponseAsync(responseFormatType, serverInstanceNo, regionCode, privateKey).toBlocking().single().body();
    }

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
    public ServiceFuture<RootPassword> getAsync(String responseFormatType, String serverInstanceNo, String regionCode, String privateKey, final ServiceCallback<RootPassword> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(responseFormatType, serverInstanceNo, regionCode, privateKey), serviceCallback);
    }

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
    public Observable<RootPassword> getAsync(String responseFormatType, String serverInstanceNo, String regionCode, String privateKey) {
        return getWithServiceResponseAsync(responseFormatType, serverInstanceNo, regionCode, privateKey).map(new Func1<ServiceResponse<RootPassword>, RootPassword>() {
            @Override
            public RootPassword call(ServiceResponse<RootPassword> response) {
                return response.body();
            }
        });
    }

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
    public Observable<ServiceResponse<RootPassword>> getWithServiceResponseAsync(String responseFormatType, String serverInstanceNo, String regionCode, String privateKey) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (serverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter serverInstanceNo is required and cannot be null.");
        }
        return service.get(responseFormatType, regionCode, serverInstanceNo, privateKey)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RootPassword>>>() {
                @Override
                public Observable<ServiceResponse<RootPassword>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RootPassword> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RootPassword> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RootPassword, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RootPassword>() { }.getType())
                .build(response);
    }

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
    public RootPasswordServerInstanceListResponse getList(String responseFormatType, String rootPasswordServerInstanceListNserverInstanceNo) {
        return getListWithServiceResponseAsync(responseFormatType, rootPasswordServerInstanceListNserverInstanceNo).toBlocking().single().body();
    }

    /**
     * 서버 인스턴스 리스트의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param rootPasswordServerInstanceListNserverInstanceNo 서버 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RootPasswordServerInstanceListResponse> getListAsync(String responseFormatType, String rootPasswordServerInstanceListNserverInstanceNo, final ServiceCallback<RootPasswordServerInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, rootPasswordServerInstanceListNserverInstanceNo), serviceCallback);
    }

    /**
     * 서버 인스턴스 리스트의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param rootPasswordServerInstanceListNserverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RootPasswordServerInstanceListResponse object
     */
    public Observable<RootPasswordServerInstanceListResponse> getListAsync(String responseFormatType, String rootPasswordServerInstanceListNserverInstanceNo) {
        return getListWithServiceResponseAsync(responseFormatType, rootPasswordServerInstanceListNserverInstanceNo).map(new Func1<ServiceResponse<RootPasswordServerInstanceListResponse>, RootPasswordServerInstanceListResponse>() {
            @Override
            public RootPasswordServerInstanceListResponse call(ServiceResponse<RootPasswordServerInstanceListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 서버 인스턴스 리스트의 루트 패스워드를 조회.
     *
     * @param responseFormatType 반환 데이터 포맷 타입
     * @param rootPasswordServerInstanceListNserverInstanceNo 서버 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RootPasswordServerInstanceListResponse object
     */
    public Observable<ServiceResponse<RootPasswordServerInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType, String rootPasswordServerInstanceListNserverInstanceNo) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (rootPasswordServerInstanceListNserverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter rootPasswordServerInstanceListNserverInstanceNo is required and cannot be null.");
        }
        final String regionCode = null;
        final String rootPasswordServerInstanceListNprivateKey = null;
        return service.getList(responseFormatType, regionCode, rootPasswordServerInstanceListNserverInstanceNo, rootPasswordServerInstanceListNprivateKey)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RootPasswordServerInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<RootPasswordServerInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RootPasswordServerInstanceListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

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
    public RootPasswordServerInstanceListResponse getList(String responseFormatType, String rootPasswordServerInstanceListNserverInstanceNo, String regionCode, String rootPasswordServerInstanceListNprivateKey) {
        return getListWithServiceResponseAsync(responseFormatType, rootPasswordServerInstanceListNserverInstanceNo, regionCode, rootPasswordServerInstanceListNprivateKey).toBlocking().single().body();
    }

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
    public ServiceFuture<RootPasswordServerInstanceListResponse> getListAsync(String responseFormatType, String rootPasswordServerInstanceListNserverInstanceNo, String regionCode, String rootPasswordServerInstanceListNprivateKey, final ServiceCallback<RootPasswordServerInstanceListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(responseFormatType, rootPasswordServerInstanceListNserverInstanceNo, regionCode, rootPasswordServerInstanceListNprivateKey), serviceCallback);
    }

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
    public Observable<RootPasswordServerInstanceListResponse> getListAsync(String responseFormatType, String rootPasswordServerInstanceListNserverInstanceNo, String regionCode, String rootPasswordServerInstanceListNprivateKey) {
        return getListWithServiceResponseAsync(responseFormatType, rootPasswordServerInstanceListNserverInstanceNo, regionCode, rootPasswordServerInstanceListNprivateKey).map(new Func1<ServiceResponse<RootPasswordServerInstanceListResponse>, RootPasswordServerInstanceListResponse>() {
            @Override
            public RootPasswordServerInstanceListResponse call(ServiceResponse<RootPasswordServerInstanceListResponse> response) {
                return response.body();
            }
        });
    }

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
    public Observable<ServiceResponse<RootPasswordServerInstanceListResponse>> getListWithServiceResponseAsync(String responseFormatType, String rootPasswordServerInstanceListNserverInstanceNo, String regionCode, String rootPasswordServerInstanceListNprivateKey) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        if (rootPasswordServerInstanceListNserverInstanceNo == null) {
            throw new IllegalArgumentException("Parameter rootPasswordServerInstanceListNserverInstanceNo is required and cannot be null.");
        }
        return service.getList(responseFormatType, regionCode, rootPasswordServerInstanceListNserverInstanceNo, rootPasswordServerInstanceListNprivateKey)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RootPasswordServerInstanceListResponse>>>() {
                @Override
                public Observable<ServiceResponse<RootPasswordServerInstanceListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RootPasswordServerInstanceListResponse> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RootPasswordServerInstanceListResponse> getListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RootPasswordServerInstanceListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RootPasswordServerInstanceListResponse>() { }.getType())
                .build(response);
    }

}
