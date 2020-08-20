/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.MonitorGroupRequest;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Monitors.
 */
public interface Monitors {
    /**
     * 감시 대상 그룹을 생성합니다.
     *
     * @param parameters 감시 대상 그룹 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String create(MonitorGroupRequest parameters);

    /**
     * 감시 대상 그룹을 생성합니다.
     *
     * @param parameters 감시 대상 그룹 요청
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> createAsync(MonitorGroupRequest parameters, final ServiceCallback<String> serviceCallback);

    /**
     * 감시 대상 그룹을 생성합니다.
     *
     * @param parameters 감시 대상 그룹 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> createAsync(MonitorGroupRequest parameters);

    /**
     * 감시 대상 그룹을 생성합니다.
     *
     * @param parameters 감시 대상 그룹 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> createWithServiceResponseAsync(MonitorGroupRequest parameters);

}
