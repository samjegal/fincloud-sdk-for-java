/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.MetricListRequest;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Metrics.
 */
public interface Metrics {
    /**
     * 감시 항목 id를 할당받습니다.
     *
     * @param count MetricGroupItem id 개수
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;String&gt; object if successful.
     */
    List<String> getGroupItemsId(int count);

    /**
     * 감시 항목 id를 할당받습니다.
     *
     * @param count MetricGroupItem id 개수
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<String>> getGroupItemsIdAsync(int count, final ServiceCallback<List<String>> serviceCallback);

    /**
     * 감시 항목 id를 할당받습니다.
     *
     * @param count MetricGroupItem id 개수
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;String&gt; object
     */
    Observable<List<String>> getGroupItemsIdAsync(int count);

    /**
     * 감시 항목 id를 할당받습니다.
     *
     * @param count MetricGroupItem id 개수
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;String&gt; object
     */
    Observable<ServiceResponse<List<String>>> getGroupItemsIdWithServiceResponseAsync(int count);

    /**
     * 감시대상 그룹에서 조회가능한 항목(metric) 리스트를 조회합니다.
     *
     * @param parameters Search metric list
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void searchList(MetricListRequest parameters);

    /**
     * 감시대상 그룹에서 조회가능한 항목(metric) 리스트를 조회합니다.
     *
     * @param parameters Search metric list
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> searchListAsync(MetricListRequest parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * 감시대상 그룹에서 조회가능한 항목(metric) 리스트를 조회합니다.
     *
     * @param parameters Search metric list
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> searchListAsync(MetricListRequest parameters);

    /**
     * 감시대상 그룹에서 조회가능한 항목(metric) 리스트를 조회합니다.
     *
     * @param parameters Search metric list
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> searchListWithServiceResponseAsync(MetricListRequest parameters);

}
