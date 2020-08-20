/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.MetricGroupListResponse;
import com.fincloud.cloudinsight.models.MetricsGroupParameter;
import com.fincloud.cloudinsight.models.MetricsGroupRequest;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in MetricGroups.
 */
public interface MetricGroups {
    /**
     * 감시 항목 그룹(템플릿)을 생성합니다.
     *
     * @param parameters Create or update event rule metrics group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String create(MetricsGroupRequest parameters);

    /**
     * 감시 항목 그룹(템플릿)을 생성합니다.
     *
     * @param parameters Create or update event rule metrics group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> createAsync(MetricsGroupRequest parameters, final ServiceCallback<String> serviceCallback);

    /**
     * 감시 항목 그룹(템플릿)을 생성합니다.
     *
     * @param parameters Create or update event rule metrics group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> createAsync(MetricsGroupRequest parameters);

    /**
     * 감시 항목 그룹(템플릿)을 생성합니다.
     *
     * @param parameters Create or update event rule metrics group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> createWithServiceResponseAsync(MetricsGroupRequest parameters);

    /**
     * 감시 항목 그룹(템플릿)을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String prodKey, List<String> parameters);

    /**
     * 감시 항목 그룹(템플릿)을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters Rule group for deletion
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String prodKey, List<String> parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * 감시 항목 그룹(템플릿)을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String prodKey, List<String> parameters);

    /**
     * 감시 항목 그룹(템플릿)을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String prodKey, List<String> parameters);

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void deleteByProdKeyAndId(String prodKey, String id);

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteByProdKeyAndIdAsync(String prodKey, String id, final ServiceCallback<Void> serviceCallback);

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteByProdKeyAndIdAsync(String prodKey, String id);

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹을 삭제합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteByProdKeyAndIdWithServiceResponseAsync(String prodKey, String id);

    /**
     * 해당 상품에 대한 모든 감시 항목 그룹(템플릿)을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MetricGroupListResponse object if successful.
     */
    MetricGroupListResponse list(String prodKey);

    /**
     * 해당 상품에 대한 모든 감시 항목 그룹(템플릿)을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<MetricGroupListResponse> listAsync(String prodKey, final ServiceCallback<MetricGroupListResponse> serviceCallback);

    /**
     * 해당 상품에 대한 모든 감시 항목 그룹(템플릿)을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricGroupListResponse object
     */
    Observable<MetricGroupListResponse> listAsync(String prodKey);

    /**
     * 해당 상품에 대한 모든 감시 항목 그룹(템플릿)을 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricGroupListResponse object
     */
    Observable<ServiceResponse<MetricGroupListResponse>> listWithServiceResponseAsync(String prodKey);

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹에 대한 상세정보를 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MetricsGroupParameter object if successful.
     */
    MetricsGroupParameter get(String prodKey, String id);

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹에 대한 상세정보를 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<MetricsGroupParameter> getAsync(String prodKey, String id, final ServiceCallback<MetricsGroupParameter> serviceCallback);

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹에 대한 상세정보를 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricsGroupParameter object
     */
    Observable<MetricsGroupParameter> getAsync(String prodKey, String id);

    /**
     * 감시 항목 그룹(템플릿) id로 감시 항목 그룹에 대한 상세정보를 조회합니다.
     *
     * @param prodKey 상품의 cw_key
     * @param id 감시 항목 그룹(템플릿)의 Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MetricsGroupParameter object
     */
    Observable<ServiceResponse<MetricsGroupParameter>> getWithServiceResponseAsync(String prodKey, String id);

    /**
     * 감시 항목 그룹(템플릿)을 수정합니다.
     *
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void update(MetricsGroupRequest parameters);

    /**
     * 감시 항목 그룹(템플릿)을 수정합니다.
     *
     * @param parameters Rule group for deletion
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> updateAsync(MetricsGroupRequest parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * 감시 항목 그룹(템플릿)을 수정합니다.
     *
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> updateAsync(MetricsGroupRequest parameters);

    /**
     * 감시 항목 그룹(템플릿)을 수정합니다.
     *
     * @param parameters Rule group for deletion
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(MetricsGroupRequest parameters);

}
