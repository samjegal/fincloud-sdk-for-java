/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.geolocation;

import com.fincloud.geolocation.models.GeoLocationResultParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in GeoLocations.
 */
public interface GeoLocations {
    /**
     * 위치정보 조회.
     *
     * @param ip 쿼리 IP 주소 (x.x.x.x)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GeoLocationResultParameter object if successful.
     */
    GeoLocationResultParameter get(String ip);

    /**
     * 위치정보 조회.
     *
     * @param ip 쿼리 IP 주소 (x.x.x.x)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<GeoLocationResultParameter> getAsync(String ip, final ServiceCallback<GeoLocationResultParameter> serviceCallback);

    /**
     * 위치정보 조회.
     *
     * @param ip 쿼리 IP 주소 (x.x.x.x)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GeoLocationResultParameter object
     */
    Observable<GeoLocationResultParameter> getAsync(String ip);

    /**
     * 위치정보 조회.
     *
     * @param ip 쿼리 IP 주소 (x.x.x.x)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GeoLocationResultParameter object
     */
    Observable<ServiceResponse<GeoLocationResultParameter>> getWithServiceResponseAsync(String ip);
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
    GeoLocationResultParameter get(String ip, String enc, String ext, String responseFormatType);

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
    ServiceFuture<GeoLocationResultParameter> getAsync(String ip, String enc, String ext, String responseFormatType, final ServiceCallback<GeoLocationResultParameter> serviceCallback);

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
    Observable<GeoLocationResultParameter> getAsync(String ip, String enc, String ext, String responseFormatType);

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
    Observable<ServiceResponse<GeoLocationResultParameter>> getWithServiceResponseAsync(String ip, String enc, String ext, String responseFormatType);

}
