/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.geolocation.implementation;

import retrofit2.Retrofit;
import com.fincloud.geolocation.GeoLocationQuotas;
import com.fincloud.geolocation.models.GeoLocationQuotaParameter;
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
 * in GeoLocationQuotas.
 */
public class GeoLocationQuotasImpl implements GeoLocationQuotas {
    /** The Retrofit service to perform REST calls. */
    private GeoLocationQuotasService service;
    /** The service client containing this operation class. */
    private GeoLocationManagementClientImpl client;

    /**
     * Initializes an instance of GeoLocationQuotas.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public GeoLocationQuotasImpl(Retrofit retrofit, GeoLocationManagementClientImpl client) {
        this.service = retrofit.create(GeoLocationQuotasService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for GeoLocationQuotas to be
     * used by Retrofit to perform actually REST calls.
     */
    interface GeoLocationQuotasService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.geolocation.GeoLocationQuotas get" })
        @GET("geolocation/v2/quota")
        Observable<Response<ResponseBody>> get();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.geolocation.GeoLocationQuotas set" })
        @POST("geolocation/v2/quota")
        Observable<Response<ResponseBody>> set(@Query("quota") String quota);

    }

    /**
     * GeoLocation 월간 최대 호출 가능량 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GeoLocationQuotaParameter object if successful.
     */
    public GeoLocationQuotaParameter get() {
        return getWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * GeoLocation 월간 최대 호출 가능량 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GeoLocationQuotaParameter> getAsync(final ServiceCallback<GeoLocationQuotaParameter> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * GeoLocation 월간 최대 호출 가능량 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GeoLocationQuotaParameter object
     */
    public Observable<GeoLocationQuotaParameter> getAsync() {
        return getWithServiceResponseAsync().map(new Func1<ServiceResponse<GeoLocationQuotaParameter>, GeoLocationQuotaParameter>() {
            @Override
            public GeoLocationQuotaParameter call(ServiceResponse<GeoLocationQuotaParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * GeoLocation 월간 최대 호출 가능량 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GeoLocationQuotaParameter object
     */
    public Observable<ServiceResponse<GeoLocationQuotaParameter>> getWithServiceResponseAsync() {
        return service.get()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GeoLocationQuotaParameter>>>() {
                @Override
                public Observable<ServiceResponse<GeoLocationQuotaParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GeoLocationQuotaParameter> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<GeoLocationQuotaParameter> getDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<GeoLocationQuotaParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<GeoLocationQuotaParameter>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * GeoLocation 월간 최대 사용량(Quota) 수정.
     *
     * @param quota unlimit 또는 제한량(ex:100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void set(String quota) {
        setWithServiceResponseAsync(quota).toBlocking().single().body();
    }

    /**
     * GeoLocation 월간 최대 사용량(Quota) 수정.
     *
     * @param quota unlimit 또는 제한량(ex:100)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> setAsync(String quota, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(setWithServiceResponseAsync(quota), serviceCallback);
    }

    /**
     * GeoLocation 월간 최대 사용량(Quota) 수정.
     *
     * @param quota unlimit 또는 제한량(ex:100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> setAsync(String quota) {
        return setWithServiceResponseAsync(quota).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * GeoLocation 월간 최대 사용량(Quota) 수정.
     *
     * @param quota unlimit 또는 제한량(ex:100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> setWithServiceResponseAsync(String quota) {
        if (quota == null) {
            throw new IllegalArgumentException("Parameter quota is required and cannot be null.");
        }
        return service.set(quota)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = setDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> setDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, RestException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .register(404, new TypeToken<Void>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
