/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.DirectRuleGroupCreateRequest;
import com.fincloud.cloudinsight.models.RuleGroupCopyForAsgGroupRequest;
import com.fincloud.cloudinsight.models.RuleGroupCopySettingRequest;
import com.fincloud.cloudinsight.models.RuleGroupDeleteItemParameter;
import com.fincloud.cloudinsight.models.RuleGroupItemListParameter;
import com.fincloud.cloudinsight.models.RuleGroupListQueryRequest;
import com.fincloud.cloudinsight.models.RuleGroupListQueryResponse;
import com.fincloud.cloudinsight.models.RuleGroupParameter;
import com.fincloud.cloudinsight.models.RuleGroupRequest;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in RuleGroups.
 */
public interface RuleGroups {
    /**
     * 감시 대상 그룹과 관련된 Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 조회하려는 감시 대상 그룹의 Id이며, 여러개의 감시 대상 그룹을 한번에 조회할 수 있습니다.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;RuleGroupItemListParameter&gt; object if successful.
     */
    List<RuleGroupItemListParameter> getByMonitorGroupIds(String prodKey, List<String> parameters);

    /**
     * 감시 대상 그룹과 관련된 Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 조회하려는 감시 대상 그룹의 Id이며, 여러개의 감시 대상 그룹을 한번에 조회할 수 있습니다.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<RuleGroupItemListParameter>> getByMonitorGroupIdsAsync(String prodKey, List<String> parameters, final ServiceCallback<List<RuleGroupItemListParameter>> serviceCallback);

    /**
     * 감시 대상 그룹과 관련된 Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 조회하려는 감시 대상 그룹의 Id이며, 여러개의 감시 대상 그룹을 한번에 조회할 수 있습니다.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;RuleGroupItemListParameter&gt; object
     */
    Observable<List<RuleGroupItemListParameter>> getByMonitorGroupIdsAsync(String prodKey, List<String> parameters);

    /**
     * 감시 대상 그룹과 관련된 Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters 조회하려는 감시 대상 그룹의 Id이며, 여러개의 감시 대상 그룹을 한번에 조회할 수 있습니다.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;RuleGroupItemListParameter&gt; object
     */
    Observable<ServiceResponse<List<RuleGroupItemListParameter>>> getByMonitorGroupIdsWithServiceResponseAsync(String prodKey, List<String> parameters);

    /**
     * Event Rule을 생성합니다.
     *
     * @param parameters 이벤트 룰 그룹 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the long object if successful.
     */
    long create(RuleGroupRequest parameters);

    /**
     * Event Rule을 생성합니다.
     *
     * @param parameters 이벤트 룰 그룹 요청
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Long> createAsync(RuleGroupRequest parameters, final ServiceCallback<Long> serviceCallback);

    /**
     * Event Rule을 생성합니다.
     *
     * @param parameters 이벤트 룰 그룹 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the long object
     */
    Observable<Long> createAsync(RuleGroupRequest parameters);

    /**
     * Event Rule을 생성합니다.
     *
     * @param parameters 이벤트 룰 그룹 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the long object
     */
    Observable<ServiceResponse<Long>> createWithServiceResponseAsync(RuleGroupRequest parameters);

    /**
     * Copy new rules according to proto asgGroupNo.
     *
     * @param parameters Copy rule for asgGroup
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;Object&gt; object if successful.
     */
    List<Object> copyAsgGroup(RuleGroupCopyForAsgGroupRequest parameters);

    /**
     * Copy new rules according to proto asgGroupNo.
     *
     * @param parameters Copy rule for asgGroup
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<Object>> copyAsgGroupAsync(RuleGroupCopyForAsgGroupRequest parameters, final ServiceCallback<List<Object>> serviceCallback);

    /**
     * Copy new rules according to proto asgGroupNo.
     *
     * @param parameters Copy rule for asgGroup
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Object&gt; object
     */
    Observable<List<Object>> copyAsgGroupAsync(RuleGroupCopyForAsgGroupRequest parameters);

    /**
     * Copy new rules according to proto asgGroupNo.
     *
     * @param parameters Copy rule for asgGroup
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Object&gt; object
     */
    Observable<ServiceResponse<List<Object>>> copyAsgGroupWithServiceResponseAsync(RuleGroupCopyForAsgGroupRequest parameters);

    /**
     * Event Rule을 복제합니다.
     *
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String copy(String id);

    /**
     * Event Rule을 복제합니다.
     *
     * @param id 감시 항목 그룹(템플릿)의 id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> copyAsync(String id, final ServiceCallback<String> serviceCallback);

    /**
     * Event Rule을 복제합니다.
     *
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> copyAsync(String id);

    /**
     * Event Rule을 복제합니다.
     *
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> copyWithServiceResponseAsync(String id);

    /**
     * Event Rule의 설정을 복사하여 지정한 resource에 대한 새로운 Event Rule을 생성합니다.
     *
     * @param parameters copy given rule's settings into the resourceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;Long&gt; object if successful.
     */
    List<Long> copySettings(RuleGroupCopySettingRequest parameters);

    /**
     * Event Rule의 설정을 복사하여 지정한 resource에 대한 새로운 Event Rule을 생성합니다.
     *
     * @param parameters copy given rule's settings into the resourceId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<Long>> copySettingsAsync(RuleGroupCopySettingRequest parameters, final ServiceCallback<List<Long>> serviceCallback);

    /**
     * Event Rule의 설정을 복사하여 지정한 resource에 대한 새로운 Event Rule을 생성합니다.
     *
     * @param parameters copy given rule's settings into the resourceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Long&gt; object
     */
    Observable<List<Long>> copySettingsAsync(RuleGroupCopySettingRequest parameters);

    /**
     * Event Rule의 설정을 복사하여 지정한 resource에 대한 새로운 Event Rule을 생성합니다.
     *
     * @param parameters copy given rule's settings into the resourceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Long&gt; object
     */
    Observable<ServiceResponse<List<Long>>> copySettingsWithServiceResponseAsync(RuleGroupCopySettingRequest parameters);

    /**
     * 감시 대상 그룹과 감시 항목 그룹 생성 없이 감시 대상과 감시 항목을 지정하여 바로 Event Rule을 생성합니다.
     *
     * @param parameters 감시 대상 그룹, 감시 항목 그룹 생성 없이 Event Rule 생성
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String createDirectly(DirectRuleGroupCreateRequest parameters);

    /**
     * 감시 대상 그룹과 감시 항목 그룹 생성 없이 감시 대상과 감시 항목을 지정하여 바로 Event Rule을 생성합니다.
     *
     * @param parameters 감시 대상 그룹, 감시 항목 그룹 생성 없이 Event Rule 생성
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> createDirectlyAsync(DirectRuleGroupCreateRequest parameters, final ServiceCallback<String> serviceCallback);

    /**
     * 감시 대상 그룹과 감시 항목 그룹 생성 없이 감시 대상과 감시 항목을 지정하여 바로 Event Rule을 생성합니다.
     *
     * @param parameters 감시 대상 그룹, 감시 항목 그룹 생성 없이 Event Rule 생성
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> createDirectlyAsync(DirectRuleGroupCreateRequest parameters);

    /**
     * 감시 대상 그룹과 감시 항목 그룹 생성 없이 감시 대상과 감시 항목을 지정하여 바로 Event Rule을 생성합니다.
     *
     * @param parameters 감시 대상 그룹, 감시 항목 그룹 생성 없이 Event Rule 생성
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> createDirectlyWithServiceResponseAsync(DirectRuleGroupCreateRequest parameters);

    /**
     * Event Rule을 삭제합니다.
     *
     * @param items rule group List
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(List<RuleGroupDeleteItemParameter> items);

    /**
     * Event Rule을 삭제합니다.
     *
     * @param items rule group List
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(List<RuleGroupDeleteItemParameter> items, final ServiceCallback<Void> serviceCallback);

    /**
     * Event Rule을 삭제합니다.
     *
     * @param items rule group List
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(List<RuleGroupDeleteItemParameter> items);

    /**
     * Event Rule을 삭제합니다.
     *
     * @param items rule group List
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(List<RuleGroupDeleteItemParameter> items);

    /**
     * Event Rule id로 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void deleteByProdKeyAndId(String prodKey, String id);

    /**
     * Event Rule id로 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteByProdKeyAndIdAsync(String prodKey, String id, final ServiceCallback<Void> serviceCallback);

    /**
     * Event Rule id로 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteByProdKeyAndIdAsync(String prodKey, String id);

    /**
     * Event Rule id로 Event Rule을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteByProdKeyAndIdWithServiceResponseAsync(String prodKey, String id);

    /**
     * Event Rule을 조회합니다.
     *
     * @param parameters Rule group list query item
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RuleGroupListQueryResponse object if successful.
     */
    RuleGroupListQueryResponse query(RuleGroupListQueryRequest parameters);

    /**
     * Event Rule을 조회합니다.
     *
     * @param parameters Rule group list query item
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RuleGroupListQueryResponse> queryAsync(RuleGroupListQueryRequest parameters, final ServiceCallback<RuleGroupListQueryResponse> serviceCallback);

    /**
     * Event Rule을 조회합니다.
     *
     * @param parameters Rule group list query item
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RuleGroupListQueryResponse object
     */
    Observable<RuleGroupListQueryResponse> queryAsync(RuleGroupListQueryRequest parameters);

    /**
     * Event Rule을 조회합니다.
     *
     * @param parameters Rule group list query item
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RuleGroupListQueryResponse object
     */
    Observable<ServiceResponse<RuleGroupListQueryResponse>> queryWithServiceResponseAsync(RuleGroupListQueryRequest parameters);

    /**
     * Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RuleGroupParameter object if successful.
     */
    RuleGroupParameter queryByProdKeyAndId(String prodKey, String id);

    /**
     * Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<RuleGroupParameter> queryByProdKeyAndIdAsync(String prodKey, String id, final ServiceCallback<RuleGroupParameter> serviceCallback);

    /**
     * Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RuleGroupParameter object
     */
    Observable<RuleGroupParameter> queryByProdKeyAndIdAsync(String prodKey, String id);

    /**
     * Event Rule을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RuleGroupParameter object
     */
    Observable<ServiceResponse<RuleGroupParameter>> queryByProdKeyAndIdWithServiceResponseAsync(String prodKey, String id);

    /**
     * Event Rule을 수정합니다.
     *
     * @param parameters Event Rule 생성/수정 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void update(RuleGroupRequest parameters);

    /**
     * Event Rule을 수정합니다.
     *
     * @param parameters Event Rule 생성/수정 요청
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> updateAsync(RuleGroupRequest parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * Event Rule을 수정합니다.
     *
     * @param parameters Event Rule 생성/수정 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> updateAsync(RuleGroupRequest parameters);

    /**
     * Event Rule을 수정합니다.
     *
     * @param parameters Event Rule 생성/수정 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(RuleGroupRequest parameters);

}
