/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.ChartDataWidgetRequest;
import com.fincloud.cloudinsight.models.WidgetMetricInfoResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Charts.
 */
public interface Charts {
    /**
     * 간단하게 Metric 데이터와 함께 Preview Chart를 조회합니다.
     *
     * @param parameters Metric information for the data to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WidgetMetricInfoResponse object if successful.
     */
    WidgetMetricInfoResponse preview(ChartDataWidgetRequest parameters);

    /**
     * 간단하게 Metric 데이터와 함께 Preview Chart를 조회합니다.
     *
     * @param parameters Metric information for the data to be retrieved
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<WidgetMetricInfoResponse> previewAsync(ChartDataWidgetRequest parameters, final ServiceCallback<WidgetMetricInfoResponse> serviceCallback);

    /**
     * 간단하게 Metric 데이터와 함께 Preview Chart를 조회합니다.
     *
     * @param parameters Metric information for the data to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WidgetMetricInfoResponse object
     */
    Observable<WidgetMetricInfoResponse> previewAsync(ChartDataWidgetRequest parameters);

    /**
     * 간단하게 Metric 데이터와 함께 Preview Chart를 조회합니다.
     *
     * @param parameters Metric information for the data to be retrieved
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WidgetMetricInfoResponse object
     */
    Observable<ServiceResponse<WidgetMetricInfoResponse>> previewWithServiceResponseAsync(ChartDataWidgetRequest parameters);

}
