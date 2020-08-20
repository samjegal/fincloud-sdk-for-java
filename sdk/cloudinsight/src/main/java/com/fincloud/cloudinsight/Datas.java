/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.MultipleDataParameter;
import com.fincloud.cloudinsight.models.QueryMultipleRequest;
import com.fincloud.cloudinsight.models.QueryRequest;
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
     * Cloud Insight에서 수집한 time-series 데이터를 쿼리합니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;List&lt;Double&gt;&gt; object if successful.
     */
    List<List<Double>> query(QueryRequest parameters);

    /**
     * Cloud Insight에서 수집한 time-series 데이터를 쿼리합니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<List<Double>>> queryAsync(QueryRequest parameters, final ServiceCallback<List<List<Double>>> serviceCallback);

    /**
     * Cloud Insight에서 수집한 time-series 데이터를 쿼리합니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;List&lt;Double&gt;&gt; object
     */
    Observable<List<List<Double>>> queryAsync(QueryRequest parameters);

    /**
     * Cloud Insight에서 수집한 time-series 데이터를 쿼리합니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;List&lt;Double&gt;&gt; object
     */
    Observable<ServiceResponse<List<List<Double>>>> queryWithServiceResponseAsync(QueryRequest parameters);

    /**
     * Cloud Insight에서 수집한 여러개의 time-series 데이터를 쿼리합니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;MultipleDataParameter&gt; object if successful.
     */
    List<MultipleDataParameter> queryMultiple(QueryMultipleRequest parameters);

    /**
     * Cloud Insight에서 수집한 여러개의 time-series 데이터를 쿼리합니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<MultipleDataParameter>> queryMultipleAsync(QueryMultipleRequest parameters, final ServiceCallback<List<MultipleDataParameter>> serviceCallback);

    /**
     * Cloud Insight에서 수집한 여러개의 time-series 데이터를 쿼리합니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MultipleDataParameter&gt; object
     */
    Observable<List<MultipleDataParameter>> queryMultipleAsync(QueryMultipleRequest parameters);

    /**
     * Cloud Insight에서 수집한 여러개의 time-series 데이터를 쿼리합니다.
     *
     * @param parameters Cloud Insight Custom 메트릭 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MultipleDataParameter&gt; object
     */
    Observable<ServiceResponse<List<MultipleDataParameter>>> queryMultipleWithServiceResponseAsync(QueryMultipleRequest parameters);

}
