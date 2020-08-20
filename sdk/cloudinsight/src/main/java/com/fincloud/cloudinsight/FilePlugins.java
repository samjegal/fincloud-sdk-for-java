/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.FilePluginDetailResponse;
import com.fincloud.cloudinsight.models.FilePluginParameter;
import com.fincloud.cloudinsight.models.FilePluginRequest;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in FilePlugins.
 */
public interface FilePlugins {
    /**
     * Plugin에 설정할 File 정보.
     *
     * @param parameters Plugin에 설정할 File 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create(FilePluginRequest parameters);

    /**
     * Plugin에 설정할 File 정보.
     *
     * @param parameters Plugin에 설정할 File 정보
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(FilePluginRequest parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * Plugin에 설정할 File 정보.
     *
     * @param parameters Plugin에 설정할 File 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync(FilePluginRequest parameters);

    /**
     * Plugin에 설정할 File 정보.
     *
     * @param parameters Plugin에 설정할 File 정보
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync(FilePluginRequest parameters);

    /**
     * 사용자의 File Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;FilePluginParameter&gt; object if successful.
     */
    List<FilePluginParameter> list();

    /**
     * 사용자의 File Plugin 설정을 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<FilePluginParameter>> listAsync(final ServiceCallback<List<FilePluginParameter>> serviceCallback);

    /**
     * 사용자의 File Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;FilePluginParameter&gt; object
     */
    Observable<List<FilePluginParameter>> listAsync();

    /**
     * 사용자의 File Plugin 설정을 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;FilePluginParameter&gt; object
     */
    Observable<ServiceResponse<List<FilePluginParameter>>> listWithServiceResponseAsync();

    /**
     * 서버 인스턴스에 적용된 File Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FilePluginDetailResponse object if successful.
     */
    FilePluginDetailResponse get(String instanceNo);

    /**
     * 서버 인스턴스에 적용된 File Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<FilePluginDetailResponse> getAsync(String instanceNo, final ServiceCallback<FilePluginDetailResponse> serviceCallback);

    /**
     * 서버 인스턴스에 적용된 File Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FilePluginDetailResponse object
     */
    Observable<FilePluginDetailResponse> getAsync(String instanceNo);

    /**
     * 서버 인스턴스에 적용된 File Plugin 설정을 조회.
     *
     * @param instanceNo 인스턴스 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FilePluginDetailResponse object
     */
    Observable<ServiceResponse<FilePluginDetailResponse>> getWithServiceResponseAsync(String instanceNo);

}
