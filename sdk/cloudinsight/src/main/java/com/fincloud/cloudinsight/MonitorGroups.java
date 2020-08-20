/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.MonitorGroupParameter;
import com.fincloud.cloudinsight.models.RemoveResourceFromRulesParameter;
import com.fincloud.cloudinsight.models.TypeGroupRelatedRuleParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in MonitorGroups.
 */
public interface MonitorGroups {
    /**
     * 감시 대상 그룹과 관련된 모든 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void deleteForce(String prodKey, List<TypeGroupRelatedRuleParameter> parameters);

    /**
     * 감시 대상 그룹과 관련된 모든 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters Rule group for deletion
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteForceAsync(String prodKey, List<TypeGroupRelatedRuleParameter> parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * 감시 대상 그룹과 관련된 모든 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteForceAsync(String prodKey, List<TypeGroupRelatedRuleParameter> parameters);

    /**
     * 감시 대상 그룹과 관련된 모든 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteForceWithServiceResponseAsync(String prodKey, List<TypeGroupRelatedRuleParameter> parameters);

    /**
     * 감시 대상 그룹과 관련된 Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 조회하려는 감시 대상 그룹의 Id이며, 여러개의 감시 대상 그룹을 한번에 조회할 수 있습니다.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getByMonitorGroupIds(String prodKey, List<String> parameters);

    /**
     * 감시 대상 그룹과 관련된 Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 조회하려는 감시 대상 그룹의 Id이며, 여러개의 감시 대상 그룹을 한번에 조회할 수 있습니다.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> getByMonitorGroupIdsAsync(String prodKey, List<String> parameters, final ServiceCallback<String> serviceCallback);

    /**
     * 감시 대상 그룹과 관련된 Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 조회하려는 감시 대상 그룹의 Id이며, 여러개의 감시 대상 그룹을 한번에 조회할 수 있습니다.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> getByMonitorGroupIdsAsync(String prodKey, List<String> parameters);

    /**
     * 감시 대상 그룹과 관련된 Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 조회하려는 감시 대상 그룹의 Id이며, 여러개의 감시 대상 그룹을 한번에 조회할 수 있습니다.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> getByMonitorGroupIdsWithServiceResponseAsync(String prodKey, List<String> parameters);

    /**
     * 감시 대상 그룹과 관련된 모든 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 감시 대상 그룹 혹은 감시 항목 그룹과 관련된 모든 Event Rule 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String deleteForce1(String prodKey, List<TypeGroupRelatedRuleParameter> parameters);

    /**
     * 감시 대상 그룹과 관련된 모든 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 감시 대상 그룹 혹은 감시 항목 그룹과 관련된 모든 Event Rule 리스트
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> deleteForce1Async(String prodKey, List<TypeGroupRelatedRuleParameter> parameters, final ServiceCallback<String> serviceCallback);

    /**
     * 감시 대상 그룹과 관련된 모든 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 감시 대상 그룹 혹은 감시 항목 그룹과 관련된 모든 Event Rule 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> deleteForce1Async(String prodKey, List<TypeGroupRelatedRuleParameter> parameters);

    /**
     * 감시 대상 그룹과 관련된 모든 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 감시 대상 그룹 혹은 감시 항목 그룹과 관련된 모든 Event Rule 리스트
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> deleteForce1WithServiceResponseAsync(String prodKey, List<TypeGroupRelatedRuleParameter> parameters);

    /**
     * Event Rule의 감시 대상 그룹에서 특정 감시 대상을 삭제합니다.
     *
     * @param parameters Remove info
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void removeResourceFromRules(RemoveResourceFromRulesParameter parameters);

    /**
     * Event Rule의 감시 대상 그룹에서 특정 감시 대상을 삭제합니다.
     *
     * @param parameters Remove info
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> removeResourceFromRulesAsync(RemoveResourceFromRulesParameter parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * Event Rule의 감시 대상 그룹에서 특정 감시 대상을 삭제합니다.
     *
     * @param parameters Remove info
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> removeResourceFromRulesAsync(RemoveResourceFromRulesParameter parameters);

    /**
     * Event Rule의 감시 대상 그룹에서 특정 감시 대상을 삭제합니다.
     *
     * @param parameters Remove info
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> removeResourceFromRulesWithServiceResponseAsync(RemoveResourceFromRulesParameter parameters);

    /**
     * 해당 상품에 대한 모든 감시 항목 그룹(템플릿)을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;MonitorGroupParameter&gt; object if successful.
     */
    List<MonitorGroupParameter> list(String prodKey);

    /**
     * 해당 상품에 대한 모든 감시 항목 그룹(템플릿)을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<MonitorGroupParameter>> listAsync(String prodKey, final ServiceCallback<List<MonitorGroupParameter>> serviceCallback);

    /**
     * 해당 상품에 대한 모든 감시 항목 그룹(템플릿)을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MonitorGroupParameter&gt; object
     */
    Observable<List<MonitorGroupParameter>> listAsync(String prodKey);

    /**
     * 해당 상품에 대한 모든 감시 항목 그룹(템플릿)을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;MonitorGroupParameter&gt; object
     */
    Observable<ServiceResponse<List<MonitorGroupParameter>>> listWithServiceResponseAsync(String prodKey);

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹에 대한 상세정보를 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MonitorGroupParameter object if successful.
     */
    MonitorGroupParameter get(String prodKey, String id);

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹에 대한 상세정보를 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<MonitorGroupParameter> getAsync(String prodKey, String id, final ServiceCallback<MonitorGroupParameter> serviceCallback);

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹에 대한 상세정보를 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MonitorGroupParameter object
     */
    Observable<MonitorGroupParameter> getAsync(String prodKey, String id);

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹에 대한 상세정보를 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MonitorGroupParameter object
     */
    Observable<ServiceResponse<MonitorGroupParameter>> getWithServiceResponseAsync(String prodKey, String id);

}
