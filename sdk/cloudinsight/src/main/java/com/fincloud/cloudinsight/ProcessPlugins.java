/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.ProcessPluginDetailResponse;
import com.fincloud.cloudinsight.models.ProcessPluginParameter;
import com.fincloud.cloudinsight.models.ProcessPluginRequest;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ProcessPlugins.
 */
public interface ProcessPlugins {
    /**
     * Process Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Process 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create(ProcessPluginRequest parameters);

    /**
     * Process Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Process 정보
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(ProcessPluginRequest parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * Process Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Process 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync(ProcessPluginRequest parameters);

    /**
     * Process Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Process 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync(ProcessPluginRequest parameters);

    /**
     * 사용자의 Process Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ProcessPluginParameter&gt; object if successful.
     */
    List<ProcessPluginParameter> list();

    /**
     * 사용자의 Process Plugin 설정을 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<ProcessPluginParameter>> listAsync(final ServiceCallback<List<ProcessPluginParameter>> serviceCallback);

    /**
     * 사용자의 Process Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ProcessPluginParameter&gt; object
     */
    Observable<List<ProcessPluginParameter>> listAsync();

    /**
     * 사용자의 Process Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ProcessPluginParameter&gt; object
     */
    Observable<ServiceResponse<List<ProcessPluginParameter>>> listWithServiceResponseAsync();

    /**
     * 서버 인스턴스에 적용된 Process Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ProcessPluginDetailResponse object if successful.
     */
    ProcessPluginDetailResponse get(String instanceNo);

    /**
     * 서버 인스턴스에 적용된 Process Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ProcessPluginDetailResponse> getAsync(String instanceNo, final ServiceCallback<ProcessPluginDetailResponse> serviceCallback);

    /**
     * 서버 인스턴스에 적용된 Process Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProcessPluginDetailResponse object
     */
    Observable<ProcessPluginDetailResponse> getAsync(String instanceNo);

    /**
     * 서버 인스턴스에 적용된 Process Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProcessPluginDetailResponse object
     */
    Observable<ServiceResponse<ProcessPluginDetailResponse>> getWithServiceResponseAsync(String instanceNo);

}
