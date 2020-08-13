/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.geolocation;

import com.fincloud.geolocation.models.GeoLocationQuotaParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in GeoLocationQuotas.
 */
public interface GeoLocationQuotas {
    /**
     * GeoLocation 월간 최대 호출 가능량 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GeoLocationQuotaParameter object if successful.
     */
    GeoLocationQuotaParameter get();

    /**
     * GeoLocation 월간 최대 호출 가능량 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<GeoLocationQuotaParameter> getAsync(final ServiceCallback<GeoLocationQuotaParameter> serviceCallback);

    /**
     * GeoLocation 월간 최대 호출 가능량 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GeoLocationQuotaParameter object
     */
    Observable<GeoLocationQuotaParameter> getAsync();

    /**
     * GeoLocation 월간 최대 호출 가능량 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GeoLocationQuotaParameter object
     */
    Observable<ServiceResponse<GeoLocationQuotaParameter>> getWithServiceResponseAsync();

    /**
     * GeoLocation 월간 최대 사용량(Quota) 수정.
     *
     * @param quota unlimit 또는 제한량(ex:100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void set(String quota);

    /**
     * GeoLocation 월간 최대 사용량(Quota) 수정.
     *
     * @param quota unlimit 또는 제한량(ex:100)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> setAsync(String quota, final ServiceCallback<Void> serviceCallback);

    /**
     * GeoLocation 월간 최대 사용량(Quota) 수정.
     *
     * @param quota unlimit 또는 제한량(ex:100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> setAsync(String quota);

    /**
     * GeoLocation 월간 최대 사용량(Quota) 수정.
     *
     * @param quota unlimit 또는 제한량(ex:100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> setWithServiceResponseAsync(String quota);

}
