/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.ServerTopMetricParameter;
import com.fincloud.cloudinsight.models.SeverTargetMetric;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Servers.
 */
public interface Servers {
    /**
     * 사용자의 Server 중 CPU, Memory, File system 별 사용량 top5에 해당하는 server를 조회합니다.
     *
     * @param query Target metric (mem_usert/avg_cpu_user_rto/fs_usert). Possible values include: 'avg_cpu_used_rto', 'mem_usert', 'avg_fs_usert'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ServerTopMetricParameter&gt; object if successful.
     */
    List<ServerTopMetricParameter> getTop(SeverTargetMetric query);

    /**
     * 사용자의 Server 중 CPU, Memory, File system 별 사용량 top5에 해당하는 server를 조회합니다.
     *
     * @param query Target metric (mem_usert/avg_cpu_user_rto/fs_usert). Possible values include: 'avg_cpu_used_rto', 'mem_usert', 'avg_fs_usert'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<ServerTopMetricParameter>> getTopAsync(SeverTargetMetric query, final ServiceCallback<List<ServerTopMetricParameter>> serviceCallback);

    /**
     * 사용자의 Server 중 CPU, Memory, File system 별 사용량 top5에 해당하는 server를 조회합니다.
     *
     * @param query Target metric (mem_usert/avg_cpu_user_rto/fs_usert). Possible values include: 'avg_cpu_used_rto', 'mem_usert', 'avg_fs_usert'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ServerTopMetricParameter&gt; object
     */
    Observable<List<ServerTopMetricParameter>> getTopAsync(SeverTargetMetric query);

    /**
     * 사용자의 Server 중 CPU, Memory, File system 별 사용량 top5에 해당하는 server를 조회합니다.
     *
     * @param query Target metric (mem_usert/avg_cpu_user_rto/fs_usert). Possible values include: 'avg_cpu_used_rto', 'mem_usert', 'avg_fs_usert'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ServerTopMetricParameter&gt; object
     */
    Observable<ServiceResponse<List<ServerTopMetricParameter>>> getTopWithServiceResponseAsync(SeverTargetMetric query);

}
