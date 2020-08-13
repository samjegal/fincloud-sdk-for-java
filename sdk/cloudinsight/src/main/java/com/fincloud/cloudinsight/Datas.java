/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.CloudInsightDataInfoParameter;
import com.fincloud.cloudinsight.models.CloudInsightQueryMultipleParameter;
import com.fincloud.cloudinsight.models.CloudInsightQueryParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Datas.
 */
public interface Datas {
    /**
     * Metric information for the data to be retrieved.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void preview();

    /**
     * Metric information for the data to be retrieved.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> previewAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Metric information for the data to be retrieved.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> previewAsync();

    /**
     * Metric information for the data to be retrieved.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> previewWithServiceResponseAsync();

    /**
     * Get widget data preview for dashboard widget.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;List&lt;Double&gt;&gt; object if successful.
     */
    List<List<Double>> query(CloudInsightQueryParameter parameters);

    /**
     * Get widget data preview for dashboard widget.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<List<Double>>> queryAsync(CloudInsightQueryParameter parameters, final ServiceCallback<List<List<Double>>> serviceCallback);

    /**
     * Get widget data preview for dashboard widget.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;List&lt;Double&gt;&gt; object
     */
    Observable<List<List<Double>>> queryAsync(CloudInsightQueryParameter parameters);

    /**
     * Get widget data preview for dashboard widget.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;List&lt;Double&gt;&gt; object
     */
    Observable<ServiceResponse<List<List<Double>>>> queryWithServiceResponseAsync(CloudInsightQueryParameter parameters);

    /**
     * Query multiple metric data for a specific product with specified criteria.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;CloudInsightDataInfoParameter&gt; object if successful.
     */
    List<CloudInsightDataInfoParameter> queryMultiple(CloudInsightQueryMultipleParameter parameters);

    /**
     * Query multiple metric data for a specific product with specified criteria.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<CloudInsightDataInfoParameter>> queryMultipleAsync(CloudInsightQueryMultipleParameter parameters, final ServiceCallback<List<CloudInsightDataInfoParameter>> serviceCallback);

    /**
     * Query multiple metric data for a specific product with specified criteria.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;CloudInsightDataInfoParameter&gt; object
     */
    Observable<List<CloudInsightDataInfoParameter>> queryMultipleAsync(CloudInsightQueryMultipleParameter parameters);

    /**
     * Query multiple metric data for a specific product with specified criteria.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;CloudInsightDataInfoParameter&gt; object
     */
    Observable<ServiceResponse<List<CloudInsightDataInfoParameter>>> queryMultipleWithServiceResponseAsync(CloudInsightQueryMultipleParameter parameters);

}
