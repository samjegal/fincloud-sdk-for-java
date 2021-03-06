/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.PortPluginDetailResponse;
import com.fincloud.cloudinsight.models.PortPluginParameter;
import com.fincloud.cloudinsight.models.PortPluginRequest;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PortPlugins.
 */
public interface PortPlugins {
    /**
     * Port Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Port 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create(PortPluginRequest parameters);

    /**
     * Port Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Port 정보
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(PortPluginRequest parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * Port Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Port 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync(PortPluginRequest parameters);

    /**
     * Port Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Port 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync(PortPluginRequest parameters);

    /**
     * 사용자의 Port Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PortPluginParameter&gt; object if successful.
     */
    List<PortPluginParameter> list();

    /**
     * 사용자의 Port Plugin 설정을 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<PortPluginParameter>> listAsync(final ServiceCallback<List<PortPluginParameter>> serviceCallback);

    /**
     * 사용자의 Port Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PortPluginParameter&gt; object
     */
    Observable<List<PortPluginParameter>> listAsync();

    /**
     * 사용자의 Port Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PortPluginParameter&gt; object
     */
    Observable<ServiceResponse<List<PortPluginParameter>>> listWithServiceResponseAsync();

    /**
     * 서버 인스턴스에 적용된 Port Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PortPluginDetailResponse object if successful.
     */
    PortPluginDetailResponse get(String instanceNo);

    /**
     * 서버 인스턴스에 적용된 Port Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PortPluginDetailResponse> getAsync(String instanceNo, final ServiceCallback<PortPluginDetailResponse> serviceCallback);

    /**
     * 서버 인스턴스에 적용된 Port Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortPluginDetailResponse object
     */
    Observable<PortPluginDetailResponse> getAsync(String instanceNo);

    /**
     * 서버 인스턴스에 적용된 Port Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PortPluginDetailResponse object
     */
    Observable<ServiceResponse<PortPluginDetailResponse>> getWithServiceResponseAsync(String instanceNo);

}
