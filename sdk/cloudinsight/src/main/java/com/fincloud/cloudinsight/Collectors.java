/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.CloudInsightCollectorParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Collectors.
 */
public interface Collectors {
    /**
     * Collector API.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void push(CloudInsightCollectorParameter parameters);

    /**
     * Collector API.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> pushAsync(CloudInsightCollectorParameter parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * Collector API.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> pushAsync(CloudInsightCollectorParameter parameters);

    /**
     * Collector API.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> pushWithServiceResponseAsync(CloudInsightCollectorParameter parameters);

}
