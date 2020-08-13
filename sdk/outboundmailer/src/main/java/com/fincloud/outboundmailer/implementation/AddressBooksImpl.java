/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.implementation;

import retrofit2.Retrofit;
import com.fincloud.outboundmailer.AddressBooks;
import com.fincloud.outboundmailer.models.AddressBookDeleteAddressRequest;
import com.fincloud.outboundmailer.models.AddressBookDeleteRelationRequest;
import com.fincloud.outboundmailer.models.AddressBookGenerateRequest;
import com.fincloud.outboundmailer.models.AddressBookGenerateRequestGroupsItem;
import com.fincloud.outboundmailer.models.AddressBookInitResponse;
import com.fincloud.outboundmailer.models.AddressBookResponse;
import com.google.common.reflect.TypeToken;
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
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in AddressBooks.
 */
public class AddressBooksImpl implements AddressBooks {
    /** The Retrofit service to perform REST calls. */
    private AddressBooksService service;
    /** The service client containing this operation class. */
    private CloudOutboundMailerManagementClientImpl client;

    /**
     * Initializes an instance of AddressBooks.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AddressBooksImpl(Retrofit retrofit, CloudOutboundMailerManagementClientImpl client) {
        this.service = retrofit.create(AddressBooksService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for AddressBooks to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AddressBooksService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.outboundmailer.AddressBooks create" })
        @POST("api/v1/address-book")
        Observable<Response<ResponseBody>> create(@Header("X-NCP-LANG") String xNCPLANG, @Body AddressBookGenerateRequest requestBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.outboundmailer.AddressBooks get" })
        @GET("api/v1/address-book")
        Observable<Response<ResponseBody>> get(@Header("X-NCP-LANG") String xNCPLANG);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.outboundmailer.AddressBooks delete" })
        @HTTP(path = "api/v1/address-book", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Header("X-NCP-LANG") String xNCPLANG);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.outboundmailer.AddressBooks deleteRecipientGroup" })
        @HTTP(path = "api/v1/address-book/recipient-groups", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteRecipientGroup(@Header("X-NCP-LANG") String xNCPLANG, @Query("groupName") String groupName);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.outboundmailer.AddressBooks deleteAddress" })
        @HTTP(path = "api/v1/address-book/address", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteAddress(@Header("X-NCP-LANG") String xNCPLANG, @Body AddressBookDeleteAddressRequest requestBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.outboundmailer.AddressBooks deleteRecipientGroupByAddress" })
        @HTTP(path = "api/v1/address-book/recipient-groups/address", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteRecipientGroupByAddress(@Body AddressBookDeleteRelationRequest requestBody, @Header("X-NCP-LANG") String xNCPLANG);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.outboundmailer.AddressBooks deleteEmptyRecipientGroup" })
        @HTTP(path = "api/v1/address-book/recipient-groups/address/empty", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteEmptyRecipientGroup(@Header("X-NCP-LANG") String xNCPLANG, @Query("groupName") String groupName);

    }

    /**
     * 수신자 주소/그룹 일괄로 입력받아 주소록 생성을 요청.
     *
     * @param groups 수신자 이메일 주소를 포함한 수신자 그룹목록
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    public AddressBookResponse create(List<AddressBookGenerateRequestGroupsItem> groups) {
        return createWithServiceResponseAsync(groups).toBlocking().single().body();
    }

    /**
     * 수신자 주소/그룹 일괄로 입력받아 주소록 생성을 요청.
     *
     * @param groups 수신자 이메일 주소를 포함한 수신자 그룹목록
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddressBookResponse> createAsync(List<AddressBookGenerateRequestGroupsItem> groups, final ServiceCallback<AddressBookResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(groups), serviceCallback);
    }

    /**
     * 수신자 주소/그룹 일괄로 입력받아 주소록 생성을 요청.
     *
     * @param groups 수신자 이메일 주소를 포함한 수신자 그룹목록
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<AddressBookResponse> createAsync(List<AddressBookGenerateRequestGroupsItem> groups) {
        return createWithServiceResponseAsync(groups).map(new Func1<ServiceResponse<AddressBookResponse>, AddressBookResponse>() {
            @Override
            public AddressBookResponse call(ServiceResponse<AddressBookResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 수신자 주소/그룹 일괄로 입력받아 주소록 생성을 요청.
     *
     * @param groups 수신자 이메일 주소를 포함한 수신자 그룹목록
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<ServiceResponse<AddressBookResponse>> createWithServiceResponseAsync(List<AddressBookGenerateRequestGroupsItem> groups) {
        if (groups == null) {
            throw new IllegalArgumentException("Parameter groups is required and cannot be null.");
        }
        Validator.validate(groups);
        final String xNCPLANG = null;
        AddressBookGenerateRequest requestBody = new AddressBookGenerateRequest();
        requestBody.withGroups(groups);
        return service.create(xNCPLANG, requestBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddressBookResponse>>>() {
                @Override
                public Observable<ServiceResponse<AddressBookResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddressBookResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 수신자 주소/그룹 일괄로 입력받아 주소록 생성을 요청.
     *
     * @param groups 수신자 이메일 주소를 포함한 수신자 그룹목록
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    public AddressBookResponse create(List<AddressBookGenerateRequestGroupsItem> groups, String xNCPLANG) {
        return createWithServiceResponseAsync(groups, xNCPLANG).toBlocking().single().body();
    }

    /**
     * 수신자 주소/그룹 일괄로 입력받아 주소록 생성을 요청.
     *
     * @param groups 수신자 이메일 주소를 포함한 수신자 그룹목록
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddressBookResponse> createAsync(List<AddressBookGenerateRequestGroupsItem> groups, String xNCPLANG, final ServiceCallback<AddressBookResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(groups, xNCPLANG), serviceCallback);
    }

    /**
     * 수신자 주소/그룹 일괄로 입력받아 주소록 생성을 요청.
     *
     * @param groups 수신자 이메일 주소를 포함한 수신자 그룹목록
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<AddressBookResponse> createAsync(List<AddressBookGenerateRequestGroupsItem> groups, String xNCPLANG) {
        return createWithServiceResponseAsync(groups, xNCPLANG).map(new Func1<ServiceResponse<AddressBookResponse>, AddressBookResponse>() {
            @Override
            public AddressBookResponse call(ServiceResponse<AddressBookResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 수신자 주소/그룹 일괄로 입력받아 주소록 생성을 요청.
     *
     * @param groups 수신자 이메일 주소를 포함한 수신자 그룹목록
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<ServiceResponse<AddressBookResponse>> createWithServiceResponseAsync(List<AddressBookGenerateRequestGroupsItem> groups, String xNCPLANG) {
        if (groups == null) {
            throw new IllegalArgumentException("Parameter groups is required and cannot be null.");
        }
        Validator.validate(groups);
        AddressBookGenerateRequest requestBody = new AddressBookGenerateRequest();
        requestBody.withGroups(groups);
        return service.create(xNCPLANG, requestBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddressBookResponse>>>() {
                @Override
                public Observable<ServiceResponse<AddressBookResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddressBookResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AddressBookResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AddressBookResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<AddressBookResponse>() { }.getType())
                .build(response);
    }

    /**
     * 주소록 현황 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    public AddressBookResponse get() {
        return getWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * 주소록 현황 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddressBookResponse> getAsync(final ServiceCallback<AddressBookResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * 주소록 현황 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<AddressBookResponse> getAsync() {
        return getWithServiceResponseAsync().map(new Func1<ServiceResponse<AddressBookResponse>, AddressBookResponse>() {
            @Override
            public AddressBookResponse call(ServiceResponse<AddressBookResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 주소록 현황 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<ServiceResponse<AddressBookResponse>> getWithServiceResponseAsync() {
        final String xNCPLANG = null;
        return service.get(xNCPLANG)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddressBookResponse>>>() {
                @Override
                public Observable<ServiceResponse<AddressBookResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddressBookResponse> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 주소록 현황 조회.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    public AddressBookResponse get(String xNCPLANG) {
        return getWithServiceResponseAsync(xNCPLANG).toBlocking().single().body();
    }

    /**
     * 주소록 현황 조회.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddressBookResponse> getAsync(String xNCPLANG, final ServiceCallback<AddressBookResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(xNCPLANG), serviceCallback);
    }

    /**
     * 주소록 현황 조회.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<AddressBookResponse> getAsync(String xNCPLANG) {
        return getWithServiceResponseAsync(xNCPLANG).map(new Func1<ServiceResponse<AddressBookResponse>, AddressBookResponse>() {
            @Override
            public AddressBookResponse call(ServiceResponse<AddressBookResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 주소록 현황 조회.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<ServiceResponse<AddressBookResponse>> getWithServiceResponseAsync(String xNCPLANG) {
        return service.get(xNCPLANG)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddressBookResponse>>>() {
                @Override
                public Observable<ServiceResponse<AddressBookResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddressBookResponse> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AddressBookResponse> getDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<AddressBookResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AddressBookResponse>() { }.getType())
                .build(response);
    }

    /**
     * 주소록 초기화.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookInitResponse object if successful.
     */
    public AddressBookInitResponse delete() {
        return deleteWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * 주소록 초기화.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddressBookInitResponse> deleteAsync(final ServiceCallback<AddressBookInitResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * 주소록 초기화.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookInitResponse object
     */
    public Observable<AddressBookInitResponse> deleteAsync() {
        return deleteWithServiceResponseAsync().map(new Func1<ServiceResponse<AddressBookInitResponse>, AddressBookInitResponse>() {
            @Override
            public AddressBookInitResponse call(ServiceResponse<AddressBookInitResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 주소록 초기화.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookInitResponse object
     */
    public Observable<ServiceResponse<AddressBookInitResponse>> deleteWithServiceResponseAsync() {
        final String xNCPLANG = null;
        return service.delete(xNCPLANG)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddressBookInitResponse>>>() {
                @Override
                public Observable<ServiceResponse<AddressBookInitResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddressBookInitResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 주소록 초기화.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookInitResponse object if successful.
     */
    public AddressBookInitResponse delete(String xNCPLANG) {
        return deleteWithServiceResponseAsync(xNCPLANG).toBlocking().single().body();
    }

    /**
     * 주소록 초기화.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddressBookInitResponse> deleteAsync(String xNCPLANG, final ServiceCallback<AddressBookInitResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(xNCPLANG), serviceCallback);
    }

    /**
     * 주소록 초기화.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookInitResponse object
     */
    public Observable<AddressBookInitResponse> deleteAsync(String xNCPLANG) {
        return deleteWithServiceResponseAsync(xNCPLANG).map(new Func1<ServiceResponse<AddressBookInitResponse>, AddressBookInitResponse>() {
            @Override
            public AddressBookInitResponse call(ServiceResponse<AddressBookInitResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 주소록 초기화.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookInitResponse object
     */
    public Observable<ServiceResponse<AddressBookInitResponse>> deleteWithServiceResponseAsync(String xNCPLANG) {
        return service.delete(xNCPLANG)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddressBookInitResponse>>>() {
                @Override
                public Observable<ServiceResponse<AddressBookInitResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddressBookInitResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AddressBookInitResponse> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<AddressBookInitResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AddressBookInitResponse>() { }.getType())
                .build(response);
    }

    /**
     * 수신자 그룹 삭제.
     *
     * @param groupName 수신자 그룸명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    public AddressBookResponse deleteRecipientGroup(String groupName) {
        return deleteRecipientGroupWithServiceResponseAsync(groupName).toBlocking().single().body();
    }

    /**
     * 수신자 그룹 삭제.
     *
     * @param groupName 수신자 그룸명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddressBookResponse> deleteRecipientGroupAsync(String groupName, final ServiceCallback<AddressBookResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteRecipientGroupWithServiceResponseAsync(groupName), serviceCallback);
    }

    /**
     * 수신자 그룹 삭제.
     *
     * @param groupName 수신자 그룸명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<AddressBookResponse> deleteRecipientGroupAsync(String groupName) {
        return deleteRecipientGroupWithServiceResponseAsync(groupName).map(new Func1<ServiceResponse<AddressBookResponse>, AddressBookResponse>() {
            @Override
            public AddressBookResponse call(ServiceResponse<AddressBookResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 수신자 그룹 삭제.
     *
     * @param groupName 수신자 그룸명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<ServiceResponse<AddressBookResponse>> deleteRecipientGroupWithServiceResponseAsync(String groupName) {
        if (groupName == null) {
            throw new IllegalArgumentException("Parameter groupName is required and cannot be null.");
        }
        final String xNCPLANG = null;
        return service.deleteRecipientGroup(xNCPLANG, groupName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddressBookResponse>>>() {
                @Override
                public Observable<ServiceResponse<AddressBookResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddressBookResponse> clientResponse = deleteRecipientGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 수신자 그룹 삭제.
     *
     * @param groupName 수신자 그룸명
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    public AddressBookResponse deleteRecipientGroup(String groupName, String xNCPLANG) {
        return deleteRecipientGroupWithServiceResponseAsync(groupName, xNCPLANG).toBlocking().single().body();
    }

    /**
     * 수신자 그룹 삭제.
     *
     * @param groupName 수신자 그룸명
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddressBookResponse> deleteRecipientGroupAsync(String groupName, String xNCPLANG, final ServiceCallback<AddressBookResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteRecipientGroupWithServiceResponseAsync(groupName, xNCPLANG), serviceCallback);
    }

    /**
     * 수신자 그룹 삭제.
     *
     * @param groupName 수신자 그룸명
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<AddressBookResponse> deleteRecipientGroupAsync(String groupName, String xNCPLANG) {
        return deleteRecipientGroupWithServiceResponseAsync(groupName, xNCPLANG).map(new Func1<ServiceResponse<AddressBookResponse>, AddressBookResponse>() {
            @Override
            public AddressBookResponse call(ServiceResponse<AddressBookResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 수신자 그룹 삭제.
     *
     * @param groupName 수신자 그룸명
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<ServiceResponse<AddressBookResponse>> deleteRecipientGroupWithServiceResponseAsync(String groupName, String xNCPLANG) {
        if (groupName == null) {
            throw new IllegalArgumentException("Parameter groupName is required and cannot be null.");
        }
        return service.deleteRecipientGroup(xNCPLANG, groupName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddressBookResponse>>>() {
                @Override
                public Observable<ServiceResponse<AddressBookResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddressBookResponse> clientResponse = deleteRecipientGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AddressBookResponse> deleteRecipientGroupDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AddressBookResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AddressBookResponse>() { }.getType())
                .build(response);
    }

    /**
     * 이메일 주소 삭제.
     *
     * @param emailAddresses the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    public AddressBookResponse deleteAddress(List<String> emailAddresses) {
        return deleteAddressWithServiceResponseAsync(emailAddresses).toBlocking().single().body();
    }

    /**
     * 이메일 주소 삭제.
     *
     * @param emailAddresses the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddressBookResponse> deleteAddressAsync(List<String> emailAddresses, final ServiceCallback<AddressBookResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteAddressWithServiceResponseAsync(emailAddresses), serviceCallback);
    }

    /**
     * 이메일 주소 삭제.
     *
     * @param emailAddresses the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<AddressBookResponse> deleteAddressAsync(List<String> emailAddresses) {
        return deleteAddressWithServiceResponseAsync(emailAddresses).map(new Func1<ServiceResponse<AddressBookResponse>, AddressBookResponse>() {
            @Override
            public AddressBookResponse call(ServiceResponse<AddressBookResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 이메일 주소 삭제.
     *
     * @param emailAddresses the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<ServiceResponse<AddressBookResponse>> deleteAddressWithServiceResponseAsync(List<String> emailAddresses) {
        if (emailAddresses == null) {
            throw new IllegalArgumentException("Parameter emailAddresses is required and cannot be null.");
        }
        Validator.validate(emailAddresses);
        final String xNCPLANG = null;
        AddressBookDeleteAddressRequest requestBody = new AddressBookDeleteAddressRequest();
        requestBody.withEmailAddresses(emailAddresses);
        return service.deleteAddress(xNCPLANG, requestBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddressBookResponse>>>() {
                @Override
                public Observable<ServiceResponse<AddressBookResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddressBookResponse> clientResponse = deleteAddressDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 이메일 주소 삭제.
     *
     * @param emailAddresses the List&lt;String&gt; value
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    public AddressBookResponse deleteAddress(List<String> emailAddresses, String xNCPLANG) {
        return deleteAddressWithServiceResponseAsync(emailAddresses, xNCPLANG).toBlocking().single().body();
    }

    /**
     * 이메일 주소 삭제.
     *
     * @param emailAddresses the List&lt;String&gt; value
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddressBookResponse> deleteAddressAsync(List<String> emailAddresses, String xNCPLANG, final ServiceCallback<AddressBookResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteAddressWithServiceResponseAsync(emailAddresses, xNCPLANG), serviceCallback);
    }

    /**
     * 이메일 주소 삭제.
     *
     * @param emailAddresses the List&lt;String&gt; value
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<AddressBookResponse> deleteAddressAsync(List<String> emailAddresses, String xNCPLANG) {
        return deleteAddressWithServiceResponseAsync(emailAddresses, xNCPLANG).map(new Func1<ServiceResponse<AddressBookResponse>, AddressBookResponse>() {
            @Override
            public AddressBookResponse call(ServiceResponse<AddressBookResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 이메일 주소 삭제.
     *
     * @param emailAddresses the List&lt;String&gt; value
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<ServiceResponse<AddressBookResponse>> deleteAddressWithServiceResponseAsync(List<String> emailAddresses, String xNCPLANG) {
        if (emailAddresses == null) {
            throw new IllegalArgumentException("Parameter emailAddresses is required and cannot be null.");
        }
        Validator.validate(emailAddresses);
        AddressBookDeleteAddressRequest requestBody = new AddressBookDeleteAddressRequest();
        requestBody.withEmailAddresses(emailAddresses);
        return service.deleteAddress(xNCPLANG, requestBody)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddressBookResponse>>>() {
                @Override
                public Observable<ServiceResponse<AddressBookResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddressBookResponse> clientResponse = deleteAddressDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AddressBookResponse> deleteAddressDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AddressBookResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AddressBookResponse>() { }.getType())
                .build(response);
    }

    /**
     * 수신자 그룹에서 이메일 주소 삭제.
     *
     * @param requestBody 수신자 그룹에서 이메일 주소 삭제 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    public AddressBookResponse deleteRecipientGroupByAddress(AddressBookDeleteRelationRequest requestBody) {
        return deleteRecipientGroupByAddressWithServiceResponseAsync(requestBody).toBlocking().single().body();
    }

    /**
     * 수신자 그룹에서 이메일 주소 삭제.
     *
     * @param requestBody 수신자 그룹에서 이메일 주소 삭제 요청
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddressBookResponse> deleteRecipientGroupByAddressAsync(AddressBookDeleteRelationRequest requestBody, final ServiceCallback<AddressBookResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteRecipientGroupByAddressWithServiceResponseAsync(requestBody), serviceCallback);
    }

    /**
     * 수신자 그룹에서 이메일 주소 삭제.
     *
     * @param requestBody 수신자 그룹에서 이메일 주소 삭제 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<AddressBookResponse> deleteRecipientGroupByAddressAsync(AddressBookDeleteRelationRequest requestBody) {
        return deleteRecipientGroupByAddressWithServiceResponseAsync(requestBody).map(new Func1<ServiceResponse<AddressBookResponse>, AddressBookResponse>() {
            @Override
            public AddressBookResponse call(ServiceResponse<AddressBookResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 수신자 그룹에서 이메일 주소 삭제.
     *
     * @param requestBody 수신자 그룹에서 이메일 주소 삭제 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<ServiceResponse<AddressBookResponse>> deleteRecipientGroupByAddressWithServiceResponseAsync(AddressBookDeleteRelationRequest requestBody) {
        if (requestBody == null) {
            throw new IllegalArgumentException("Parameter requestBody is required and cannot be null.");
        }
        Validator.validate(requestBody);
        final String xNCPLANG = null;
        return service.deleteRecipientGroupByAddress(requestBody, xNCPLANG)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddressBookResponse>>>() {
                @Override
                public Observable<ServiceResponse<AddressBookResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddressBookResponse> clientResponse = deleteRecipientGroupByAddressDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 수신자 그룹에서 이메일 주소 삭제.
     *
     * @param requestBody 수신자 그룹에서 이메일 주소 삭제 요청
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    public AddressBookResponse deleteRecipientGroupByAddress(AddressBookDeleteRelationRequest requestBody, String xNCPLANG) {
        return deleteRecipientGroupByAddressWithServiceResponseAsync(requestBody, xNCPLANG).toBlocking().single().body();
    }

    /**
     * 수신자 그룹에서 이메일 주소 삭제.
     *
     * @param requestBody 수신자 그룹에서 이메일 주소 삭제 요청
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddressBookResponse> deleteRecipientGroupByAddressAsync(AddressBookDeleteRelationRequest requestBody, String xNCPLANG, final ServiceCallback<AddressBookResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteRecipientGroupByAddressWithServiceResponseAsync(requestBody, xNCPLANG), serviceCallback);
    }

    /**
     * 수신자 그룹에서 이메일 주소 삭제.
     *
     * @param requestBody 수신자 그룹에서 이메일 주소 삭제 요청
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<AddressBookResponse> deleteRecipientGroupByAddressAsync(AddressBookDeleteRelationRequest requestBody, String xNCPLANG) {
        return deleteRecipientGroupByAddressWithServiceResponseAsync(requestBody, xNCPLANG).map(new Func1<ServiceResponse<AddressBookResponse>, AddressBookResponse>() {
            @Override
            public AddressBookResponse call(ServiceResponse<AddressBookResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 수신자 그룹에서 이메일 주소 삭제.
     *
     * @param requestBody 수신자 그룹에서 이메일 주소 삭제 요청
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<ServiceResponse<AddressBookResponse>> deleteRecipientGroupByAddressWithServiceResponseAsync(AddressBookDeleteRelationRequest requestBody, String xNCPLANG) {
        if (requestBody == null) {
            throw new IllegalArgumentException("Parameter requestBody is required and cannot be null.");
        }
        Validator.validate(requestBody);
        return service.deleteRecipientGroupByAddress(requestBody, xNCPLANG)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddressBookResponse>>>() {
                @Override
                public Observable<ServiceResponse<AddressBookResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddressBookResponse> clientResponse = deleteRecipientGroupByAddressDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AddressBookResponse> deleteRecipientGroupByAddressDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AddressBookResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AddressBookResponse>() { }.getType())
                .build(response);
    }

    /**
     * 수신자 그룹에서 모든 이메일 주소 연관 정보 삭제 (비우기).
     *
     * @param groupName 수신자 그룸명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    public AddressBookResponse deleteEmptyRecipientGroup(String groupName) {
        return deleteEmptyRecipientGroupWithServiceResponseAsync(groupName).toBlocking().single().body();
    }

    /**
     * 수신자 그룹에서 모든 이메일 주소 연관 정보 삭제 (비우기).
     *
     * @param groupName 수신자 그룸명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddressBookResponse> deleteEmptyRecipientGroupAsync(String groupName, final ServiceCallback<AddressBookResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteEmptyRecipientGroupWithServiceResponseAsync(groupName), serviceCallback);
    }

    /**
     * 수신자 그룹에서 모든 이메일 주소 연관 정보 삭제 (비우기).
     *
     * @param groupName 수신자 그룸명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<AddressBookResponse> deleteEmptyRecipientGroupAsync(String groupName) {
        return deleteEmptyRecipientGroupWithServiceResponseAsync(groupName).map(new Func1<ServiceResponse<AddressBookResponse>, AddressBookResponse>() {
            @Override
            public AddressBookResponse call(ServiceResponse<AddressBookResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 수신자 그룹에서 모든 이메일 주소 연관 정보 삭제 (비우기).
     *
     * @param groupName 수신자 그룸명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<ServiceResponse<AddressBookResponse>> deleteEmptyRecipientGroupWithServiceResponseAsync(String groupName) {
        if (groupName == null) {
            throw new IllegalArgumentException("Parameter groupName is required and cannot be null.");
        }
        final String xNCPLANG = null;
        return service.deleteEmptyRecipientGroup(xNCPLANG, groupName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddressBookResponse>>>() {
                @Override
                public Observable<ServiceResponse<AddressBookResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddressBookResponse> clientResponse = deleteEmptyRecipientGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 수신자 그룹에서 모든 이메일 주소 연관 정보 삭제 (비우기).
     *
     * @param groupName 수신자 그룸명
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    public AddressBookResponse deleteEmptyRecipientGroup(String groupName, String xNCPLANG) {
        return deleteEmptyRecipientGroupWithServiceResponseAsync(groupName, xNCPLANG).toBlocking().single().body();
    }

    /**
     * 수신자 그룹에서 모든 이메일 주소 연관 정보 삭제 (비우기).
     *
     * @param groupName 수신자 그룸명
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AddressBookResponse> deleteEmptyRecipientGroupAsync(String groupName, String xNCPLANG, final ServiceCallback<AddressBookResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteEmptyRecipientGroupWithServiceResponseAsync(groupName, xNCPLANG), serviceCallback);
    }

    /**
     * 수신자 그룹에서 모든 이메일 주소 연관 정보 삭제 (비우기).
     *
     * @param groupName 수신자 그룸명
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<AddressBookResponse> deleteEmptyRecipientGroupAsync(String groupName, String xNCPLANG) {
        return deleteEmptyRecipientGroupWithServiceResponseAsync(groupName, xNCPLANG).map(new Func1<ServiceResponse<AddressBookResponse>, AddressBookResponse>() {
            @Override
            public AddressBookResponse call(ServiceResponse<AddressBookResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 수신자 그룹에서 모든 이메일 주소 연관 정보 삭제 (비우기).
     *
     * @param groupName 수신자 그룸명
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    public Observable<ServiceResponse<AddressBookResponse>> deleteEmptyRecipientGroupWithServiceResponseAsync(String groupName, String xNCPLANG) {
        if (groupName == null) {
            throw new IllegalArgumentException("Parameter groupName is required and cannot be null.");
        }
        return service.deleteEmptyRecipientGroup(xNCPLANG, groupName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AddressBookResponse>>>() {
                @Override
                public Observable<ServiceResponse<AddressBookResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AddressBookResponse> clientResponse = deleteEmptyRecipientGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AddressBookResponse> deleteEmptyRecipientGroupDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AddressBookResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AddressBookResponse>() { }.getType())
                .build(response);
    }

}
