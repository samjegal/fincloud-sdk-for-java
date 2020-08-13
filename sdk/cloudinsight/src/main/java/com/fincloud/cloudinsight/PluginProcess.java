/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.PluginProcessParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PluginProcess.
 */
public interface PluginProcess {
    /**
     * Process Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Process 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create(PluginProcessParameter parameters);

    /**
     * Process Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Process 정보
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(PluginProcessParameter parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * Process Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Process 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync(PluginProcessParameter parameters);

    /**
     * Process Plugin을 설정.
     *
     * @param parameters Plugin에 설정할 Process 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync(PluginProcessParameter parameters);

    /**
     * 사용자의 Process Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PluginProcessParameter&gt; object if successful.
     */
    List<PluginProcessParameter> list();

    /**
     * 사용자의 Process Plugin 설정을 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<PluginProcessParameter>> listAsync(final ServiceCallback<List<PluginProcessParameter>> serviceCallback);

    /**
     * 사용자의 Process Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PluginProcessParameter&gt; object
     */
    Observable<List<PluginProcessParameter>> listAsync();

    /**
     * 사용자의 Process Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PluginProcessParameter&gt; object
     */
    Observable<ServiceResponse<List<PluginProcessParameter>>> listWithServiceResponseAsync();

    /**
     * 서버 인스턴스에 적용된 Process Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PluginProcessParameter object if successful.
     */
    PluginProcessParameter get(String instanceNo);

    /**
     * 서버 인스턴스에 적용된 Process Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PluginProcessParameter> getAsync(String instanceNo, final ServiceCallback<PluginProcessParameter> serviceCallback);

    /**
     * 서버 인스턴스에 적용된 Process Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PluginProcessParameter object
     */
    Observable<PluginProcessParameter> getAsync(String instanceNo);

    /**
     * 서버 인스턴스에 적용된 Process Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PluginProcessParameter object
     */
    Observable<ServiceResponse<PluginProcessParameter>> getWithServiceResponseAsync(String instanceNo);

}
