/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.partner.implementation;

import retrofit2.Retrofit;
import com.fincloud.partner.Partners;
import com.fincloud.partner.models.ContractProductDemandListResponse;
import com.fincloud.partner.models.DemandListResponse;
import com.fincloud.partner.models.DemandProductListResponse;
import com.fincloud.partner.models.PartnerDemandListResponse;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Partners.
 */
public class PartnersImpl implements Partners {
    /** The Retrofit service to perform REST calls. */
    private PartnersService service;
    /** The service client containing this operation class. */
    private PartnerManagementClientImpl client;

    /**
     * Initializes an instance of Partners.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PartnersImpl(Retrofit retrofit, PartnerManagementClientImpl client) {
        this.service = retrofit.create(PartnersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Partners to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PartnersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.partner.Partners getContractProductDemandList" })
        @GET("getContractProductDemandList")
        Observable<Response<ResponseBody>> getContractProductDemandList(@Query("responseFormatType") String responseFormatType, @Query("pageNo") Integer pageNo, @Query("pageSize") Integer pageSize, @Query("startMonth") String startMonth, @Query("endMonth") String endMonth, @Query("loginId") String loginId);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.partner.Partners getDemandProductList" })
        @GET("getDemandProductList")
        Observable<Response<ResponseBody>> getDemandProductList(@Query("responseFormatType") String responseFormatType, @Query("pageNo") Integer pageNo, @Query("pageSize") Integer pageSize, @Query("startMonth") String startMonth, @Query("endMonth") String endMonth, @Query("loginId") String loginId);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.partner.Partners getDemandList" })
        @GET("getDemandList")
        Observable<Response<ResponseBody>> getDemandList(@Query("responseFormatType") String responseFormatType, @Query("pageNo") Integer pageNo, @Query("pageSize") Integer pageSize, @Query("startMonth") String startMonth, @Query("endMonth") String endMonth, @Query("loginId") String loginId);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.partner.Partners getPartnerDemandList" })
        @GET("getPartnerDemandList")
        Observable<Response<ResponseBody>> getPartnerDemandList(@Query("responseFormatType") String responseFormatType, @Query("pageNo") Integer pageNo, @Query("pageSize") Integer pageSize, @Query("startMonth") String startMonth, @Query("endMonth") String endMonth, @Query("loginId") String loginId);

    }

    /**
     * 계약 상품 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ContractProductDemandListResponse object if successful.
     */
    public ContractProductDemandListResponse getContractProductDemandList(String responseFormatType) {
        return getContractProductDemandListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 계약 상품 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ContractProductDemandListResponse> getContractProductDemandListAsync(String responseFormatType, final ServiceCallback<ContractProductDemandListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getContractProductDemandListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 계약 상품 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ContractProductDemandListResponse object
     */
    public Observable<ContractProductDemandListResponse> getContractProductDemandListAsync(String responseFormatType) {
        return getContractProductDemandListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<ContractProductDemandListResponse>, ContractProductDemandListResponse>() {
            @Override
            public ContractProductDemandListResponse call(ServiceResponse<ContractProductDemandListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 계약 상품 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ContractProductDemandListResponse object
     */
    public Observable<ServiceResponse<ContractProductDemandListResponse>> getContractProductDemandListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final Integer pageNo = null;
        final Integer pageSize = null;
        final String startMonth = null;
        final String endMonth = null;
        final String loginId = null;
        return service.getContractProductDemandList(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ContractProductDemandListResponse>>>() {
                @Override
                public Observable<ServiceResponse<ContractProductDemandListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ContractProductDemandListResponse> clientResponse = getContractProductDemandListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 계약 상품 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ContractProductDemandListResponse object if successful.
     */
    public ContractProductDemandListResponse getContractProductDemandList(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId) {
        return getContractProductDemandListWithServiceResponseAsync(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId).toBlocking().single().body();
    }

    /**
     * 계약 상품 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ContractProductDemandListResponse> getContractProductDemandListAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId, final ServiceCallback<ContractProductDemandListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getContractProductDemandListWithServiceResponseAsync(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId), serviceCallback);
    }

    /**
     * 계약 상품 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ContractProductDemandListResponse object
     */
    public Observable<ContractProductDemandListResponse> getContractProductDemandListAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId) {
        return getContractProductDemandListWithServiceResponseAsync(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId).map(new Func1<ServiceResponse<ContractProductDemandListResponse>, ContractProductDemandListResponse>() {
            @Override
            public ContractProductDemandListResponse call(ServiceResponse<ContractProductDemandListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 계약 상품 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ContractProductDemandListResponse object
     */
    public Observable<ServiceResponse<ContractProductDemandListResponse>> getContractProductDemandListWithServiceResponseAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getContractProductDemandList(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ContractProductDemandListResponse>>>() {
                @Override
                public Observable<ServiceResponse<ContractProductDemandListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ContractProductDemandListResponse> clientResponse = getContractProductDemandListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ContractProductDemandListResponse> getContractProductDemandListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ContractProductDemandListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ContractProductDemandListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 청구 상품 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DemandProductListResponse object if successful.
     */
    public DemandProductListResponse getDemandProductList(String responseFormatType) {
        return getDemandProductListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 청구 상품 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DemandProductListResponse> getDemandProductListAsync(String responseFormatType, final ServiceCallback<DemandProductListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDemandProductListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 청구 상품 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DemandProductListResponse object
     */
    public Observable<DemandProductListResponse> getDemandProductListAsync(String responseFormatType) {
        return getDemandProductListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<DemandProductListResponse>, DemandProductListResponse>() {
            @Override
            public DemandProductListResponse call(ServiceResponse<DemandProductListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 청구 상품 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DemandProductListResponse object
     */
    public Observable<ServiceResponse<DemandProductListResponse>> getDemandProductListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final Integer pageNo = null;
        final Integer pageSize = null;
        final String startMonth = null;
        final String endMonth = null;
        final String loginId = null;
        return service.getDemandProductList(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DemandProductListResponse>>>() {
                @Override
                public Observable<ServiceResponse<DemandProductListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DemandProductListResponse> clientResponse = getDemandProductListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 청구 상품 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DemandProductListResponse object if successful.
     */
    public DemandProductListResponse getDemandProductList(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId) {
        return getDemandProductListWithServiceResponseAsync(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId).toBlocking().single().body();
    }

    /**
     * 청구 상품 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DemandProductListResponse> getDemandProductListAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId, final ServiceCallback<DemandProductListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDemandProductListWithServiceResponseAsync(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId), serviceCallback);
    }

    /**
     * 청구 상품 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DemandProductListResponse object
     */
    public Observable<DemandProductListResponse> getDemandProductListAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId) {
        return getDemandProductListWithServiceResponseAsync(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId).map(new Func1<ServiceResponse<DemandProductListResponse>, DemandProductListResponse>() {
            @Override
            public DemandProductListResponse call(ServiceResponse<DemandProductListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 청구 상품 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DemandProductListResponse object
     */
    public Observable<ServiceResponse<DemandProductListResponse>> getDemandProductListWithServiceResponseAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getDemandProductList(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DemandProductListResponse>>>() {
                @Override
                public Observable<ServiceResponse<DemandProductListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DemandProductListResponse> clientResponse = getDemandProductListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DemandProductListResponse> getDemandProductListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DemandProductListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DemandProductListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DemandListResponse object if successful.
     */
    public DemandListResponse getDemandList(String responseFormatType) {
        return getDemandListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DemandListResponse> getDemandListAsync(String responseFormatType, final ServiceCallback<DemandListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDemandListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DemandListResponse object
     */
    public Observable<DemandListResponse> getDemandListAsync(String responseFormatType) {
        return getDemandListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<DemandListResponse>, DemandListResponse>() {
            @Override
            public DemandListResponse call(ServiceResponse<DemandListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DemandListResponse object
     */
    public Observable<ServiceResponse<DemandListResponse>> getDemandListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final Integer pageNo = null;
        final Integer pageSize = null;
        final String startMonth = null;
        final String endMonth = null;
        final String loginId = null;
        return service.getDemandList(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DemandListResponse>>>() {
                @Override
                public Observable<ServiceResponse<DemandListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DemandListResponse> clientResponse = getDemandListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DemandListResponse object if successful.
     */
    public DemandListResponse getDemandList(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId) {
        return getDemandListWithServiceResponseAsync(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId).toBlocking().single().body();
    }

    /**
     * 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DemandListResponse> getDemandListAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId, final ServiceCallback<DemandListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getDemandListWithServiceResponseAsync(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId), serviceCallback);
    }

    /**
     * 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DemandListResponse object
     */
    public Observable<DemandListResponse> getDemandListAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId) {
        return getDemandListWithServiceResponseAsync(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId).map(new Func1<ServiceResponse<DemandListResponse>, DemandListResponse>() {
            @Override
            public DemandListResponse call(ServiceResponse<DemandListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DemandListResponse object
     */
    public Observable<ServiceResponse<DemandListResponse>> getDemandListWithServiceResponseAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getDemandList(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DemandListResponse>>>() {
                @Override
                public Observable<ServiceResponse<DemandListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DemandListResponse> clientResponse = getDemandListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DemandListResponse> getDemandListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DemandListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DemandListResponse>() { }.getType())
                .build(response);
    }

    /**
     * 파트너 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PartnerDemandListResponse object if successful.
     */
    public PartnerDemandListResponse getPartnerDemandList(String responseFormatType) {
        return getPartnerDemandListWithServiceResponseAsync(responseFormatType).toBlocking().single().body();
    }

    /**
     * 파트너 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PartnerDemandListResponse> getPartnerDemandListAsync(String responseFormatType, final ServiceCallback<PartnerDemandListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getPartnerDemandListWithServiceResponseAsync(responseFormatType), serviceCallback);
    }

    /**
     * 파트너 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnerDemandListResponse object
     */
    public Observable<PartnerDemandListResponse> getPartnerDemandListAsync(String responseFormatType) {
        return getPartnerDemandListWithServiceResponseAsync(responseFormatType).map(new Func1<ServiceResponse<PartnerDemandListResponse>, PartnerDemandListResponse>() {
            @Override
            public PartnerDemandListResponse call(ServiceResponse<PartnerDemandListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 파트너 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnerDemandListResponse object
     */
    public Observable<ServiceResponse<PartnerDemandListResponse>> getPartnerDemandListWithServiceResponseAsync(String responseFormatType) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        final Integer pageNo = null;
        final Integer pageSize = null;
        final String startMonth = null;
        final String endMonth = null;
        final String loginId = null;
        return service.getPartnerDemandList(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PartnerDemandListResponse>>>() {
                @Override
                public Observable<ServiceResponse<PartnerDemandListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PartnerDemandListResponse> clientResponse = getPartnerDemandListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 파트너 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PartnerDemandListResponse object if successful.
     */
    public PartnerDemandListResponse getPartnerDemandList(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId) {
        return getPartnerDemandListWithServiceResponseAsync(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId).toBlocking().single().body();
    }

    /**
     * 파트너 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PartnerDemandListResponse> getPartnerDemandListAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId, final ServiceCallback<PartnerDemandListResponse> serviceCallback) {
        return ServiceFuture.fromResponse(getPartnerDemandListWithServiceResponseAsync(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId), serviceCallback);
    }

    /**
     * 파트너 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnerDemandListResponse object
     */
    public Observable<PartnerDemandListResponse> getPartnerDemandListAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId) {
        return getPartnerDemandListWithServiceResponseAsync(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId).map(new Func1<ServiceResponse<PartnerDemandListResponse>, PartnerDemandListResponse>() {
            @Override
            public PartnerDemandListResponse call(ServiceResponse<PartnerDemandListResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 파트너 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnerDemandListResponse object
     */
    public Observable<ServiceResponse<PartnerDemandListResponse>> getPartnerDemandListWithServiceResponseAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId) {
        if (responseFormatType == null) {
            throw new IllegalArgumentException("Parameter responseFormatType is required and cannot be null.");
        }
        return service.getPartnerDemandList(responseFormatType, pageNo, pageSize, startMonth, endMonth, loginId)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PartnerDemandListResponse>>>() {
                @Override
                public Observable<ServiceResponse<PartnerDemandListResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PartnerDemandListResponse> clientResponse = getPartnerDemandListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PartnerDemandListResponse> getPartnerDemandListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PartnerDemandListResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PartnerDemandListResponse>() { }.getType())
                .build(response);
    }

}
