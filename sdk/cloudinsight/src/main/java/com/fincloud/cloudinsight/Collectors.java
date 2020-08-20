/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.CollectorRequest;
import com.fincloud.cloudinsight.models.CollectorResponse;
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
     * JSON 데이터를 Cloud Insight Collector로 보냅니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CollectorResponse object if successful.
     */
    CollectorResponse send(CollectorRequest parameters);

    /**
     * JSON 데이터를 Cloud Insight Collector로 보냅니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<CollectorResponse> sendAsync(CollectorRequest parameters, final ServiceCallback<CollectorResponse> serviceCallback);

    /**
     * JSON 데이터를 Cloud Insight Collector로 보냅니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CollectorResponse object
     */
    Observable<CollectorResponse> sendAsync(CollectorRequest parameters);

    /**
     * JSON 데이터를 Cloud Insight Collector로 보냅니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CollectorResponse object
     */
    Observable<ServiceResponse<CollectorResponse>> sendWithServiceResponseAsync(CollectorRequest parameters);

}
