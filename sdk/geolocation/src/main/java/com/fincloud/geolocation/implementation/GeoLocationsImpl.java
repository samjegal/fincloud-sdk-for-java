/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.geolocation.implementation;

import retrofit2.Retrofit;
import com.fincloud.geolocation.GeoLocations;
import com.fincloud.geolocation.models.GeoLocationResultParameter;
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
 * in GeoLocations.
 */
public class GeoLocationsImpl implements GeoLocations {
    /** The Retrofit service to perform REST calls. */
    private GeoLocationsService service;
    /** The service client containing this operation class. */
    private GeoLocationManagementClientImpl client;

    /**
     * Initializes an instance of GeoLocations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public GeoLocationsImpl(Retrofit retrofit, GeoLocationManagementClientImpl client) {
        this.service = retrofit.create(GeoLocationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for GeoLocations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface GeoLocationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.geolocation.GeoLocations get" })
        @GET("geolocation/v2/geoLocation")
        Observable<Response<ResponseBody>> get(@Query("enc") String enc, @Query("ext") String ext, @Query("ip") String ip, @Query("responseFormatType") String responseFormatType);

    }

    /**
     * 위치정보 조회.
     *
     * @param ip 쿼리 IP 주소 (x.x.x.x)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GeoLocationResultParameter object if successful.
     */
    public GeoLocationResultParameter get(String ip) {
        return getWithServiceResponseAsync(ip).toBlocking().single().body();
    }

    /**
     * 위치정보 조회.
     *
     * @param ip 쿼리 IP 주소 (x.x.x.x)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GeoLocationResultParameter> getAsync(String ip, final ServiceCallback<GeoLocationResultParameter> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(ip), serviceCallback);
    }

    /**
     * 위치정보 조회.
     *
     * @param ip 쿼리 IP 주소 (x.x.x.x)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GeoLocationResultParameter object
     */
    public Observable<GeoLocationResultParameter> getAsync(String ip) {
        return getWithServiceResponseAsync(ip).map(new Func1<ServiceResponse<GeoLocationResultParameter>, GeoLocationResultParameter>() {
            @Override
            public GeoLocationResultParameter call(ServiceResponse<GeoLocationResultParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 위치정보 조회.
     *
     * @param ip 쿼리 IP 주소 (x.x.x.x)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GeoLocationResultParameter object
     */
    public Observable<ServiceResponse<GeoLocationResultParameter>> getWithServiceResponseAsync(String ip) {
        if (ip == null) {
            throw new IllegalArgumentException("Parameter ip is required and cannot be null.");
        }
        final String enc = null;
        final String ext = null;
        final String responseFormatType = null;
        return service.get(enc, ext, ip, responseFormatType)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GeoLocationResultParameter>>>() {
                @Override
                public Observable<ServiceResponse<GeoLocationResultParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GeoLocationResultParameter> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 위치정보 조회.
     *
     * @param ip 쿼리 IP 주소 (x.x.x.x)
     * @param enc 인코딩 타입 utf8(기본값) 또는 euckr
     * @param ext 추가 정보 포함 여부 t 또는 f(기본값)
     * @param responseFormatType 응답 결과 포맷 xml 또는 json(기본값)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GeoLocationResultParameter object if successful.
     */
    public GeoLocationResultParameter get(String ip, String enc, String ext, String responseFormatType) {
        return getWithServiceResponseAsync(ip, enc, ext, responseFormatType).toBlocking().single().body();
    }

    /**
     * 위치정보 조회.
     *
     * @param ip 쿼리 IP 주소 (x.x.x.x)
     * @param enc 인코딩 타입 utf8(기본값) 또는 euckr
     * @param ext 추가 정보 포함 여부 t 또는 f(기본값)
     * @param responseFormatType 응답 결과 포맷 xml 또는 json(기본값)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<GeoLocationResultParameter> getAsync(String ip, String enc, String ext, String responseFormatType, final ServiceCallback<GeoLocationResultParameter> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(ip, enc, ext, responseFormatType), serviceCallback);
    }

    /**
     * 위치정보 조회.
     *
     * @param ip 쿼리 IP 주소 (x.x.x.x)
     * @param enc 인코딩 타입 utf8(기본값) 또는 euckr
     * @param ext 추가 정보 포함 여부 t 또는 f(기본값)
     * @param responseFormatType 응답 결과 포맷 xml 또는 json(기본값)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GeoLocationResultParameter object
     */
    public Observable<GeoLocationResultParameter> getAsync(String ip, String enc, String ext, String responseFormatType) {
        return getWithServiceResponseAsync(ip, enc, ext, responseFormatType).map(new Func1<ServiceResponse<GeoLocationResultParameter>, GeoLocationResultParameter>() {
            @Override
            public GeoLocationResultParameter call(ServiceResponse<GeoLocationResultParameter> response) {
                return response.body();
            }
        });
    }

    /**
     * 위치정보 조회.
     *
     * @param ip 쿼리 IP 주소 (x.x.x.x)
     * @param enc 인코딩 타입 utf8(기본값) 또는 euckr
     * @param ext 추가 정보 포함 여부 t 또는 f(기본값)
     * @param responseFormatType 응답 결과 포맷 xml 또는 json(기본값)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GeoLocationResultParameter object
     */
    public Observable<ServiceResponse<GeoLocationResultParameter>> getWithServiceResponseAsync(String ip, String enc, String ext, String responseFormatType) {
        if (ip == null) {
            throw new IllegalArgumentException("Parameter ip is required and cannot be null.");
        }
        return service.get(enc, ext, ip, responseFormatType)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<GeoLocationResultParameter>>>() {
                @Override
                public Observable<ServiceResponse<GeoLocationResultParameter>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<GeoLocationResultParameter> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<GeoLocationResultParameter> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<GeoLocationResultParameter, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<GeoLocationResultParameter>() { }.getType())
                .build(response);
    }

}
