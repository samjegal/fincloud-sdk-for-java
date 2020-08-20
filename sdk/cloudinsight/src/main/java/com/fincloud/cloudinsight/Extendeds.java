/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.SchemaExtendedDisableResponse;
import com.fincloud.cloudinsight.models.SchemaExtendedEnableResponse;
import com.fincloud.cloudinsight.models.SchemaExtendedStatusParameter;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Extendeds.
 */
public interface Extendeds {
    /**
     * NCP 상품의 extended 설정을 해제합니다.
     *
     * @param cwKey Extended 설정을 해지하려는 상품의 cw_key
     * @param instanceIds Extended 설정을 해지하려는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SchemaExtendedDisableResponse object if successful.
     */
    SchemaExtendedDisableResponse disable(String cwKey, String instanceIds);

    /**
     * NCP 상품의 extended 설정을 해제합니다.
     *
     * @param cwKey Extended 설정을 해지하려는 상품의 cw_key
     * @param instanceIds Extended 설정을 해지하려는 instanceId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SchemaExtendedDisableResponse> disableAsync(String cwKey, String instanceIds, final ServiceCallback<SchemaExtendedDisableResponse> serviceCallback);

    /**
     * NCP 상품의 extended 설정을 해제합니다.
     *
     * @param cwKey Extended 설정을 해지하려는 상품의 cw_key
     * @param instanceIds Extended 설정을 해지하려는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaExtendedDisableResponse object
     */
    Observable<SchemaExtendedDisableResponse> disableAsync(String cwKey, String instanceIds);

    /**
     * NCP 상품의 extended 설정을 해제합니다.
     *
     * @param cwKey Extended 설정을 해지하려는 상품의 cw_key
     * @param instanceIds Extended 설정을 해지하려는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaExtendedDisableResponse object
     */
    Observable<ServiceResponse<SchemaExtendedDisableResponse>> disableWithServiceResponseAsync(String cwKey, String instanceIds);

    /**
     * NCP 상품의 extended 설정을 합니다.
     *
     * @param cwKey Extended 설정을 하려는 상품의 cw_key
     * @param instanceIds Extended 설정을 하려는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SchemaExtendedEnableResponse object if successful.
     */
    SchemaExtendedEnableResponse enable(String cwKey, String instanceIds);

    /**
     * NCP 상품의 extended 설정을 합니다.
     *
     * @param cwKey Extended 설정을 하려는 상품의 cw_key
     * @param instanceIds Extended 설정을 하려는 instanceId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SchemaExtendedEnableResponse> enableAsync(String cwKey, String instanceIds, final ServiceCallback<SchemaExtendedEnableResponse> serviceCallback);

    /**
     * NCP 상품의 extended 설정을 합니다.
     *
     * @param cwKey Extended 설정을 하려는 상품의 cw_key
     * @param instanceIds Extended 설정을 하려는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaExtendedEnableResponse object
     */
    Observable<SchemaExtendedEnableResponse> enableAsync(String cwKey, String instanceIds);

    /**
     * NCP 상품의 extended 설정을 합니다.
     *
     * @param cwKey Extended 설정을 하려는 상품의 cw_key
     * @param instanceIds Extended 설정을 하려는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaExtendedEnableResponse object
     */
    Observable<ServiceResponse<SchemaExtendedEnableResponse>> enableWithServiceResponseAsync(String cwKey, String instanceIds);

    /**
     * Instance의 Extended 설정 여부를 조회합니다.
     *
     * @param cwKey 상품의 cw_key
     * @param instanceIds Extended 설정 여부를 조회하고자하는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;SchemaExtendedStatusParameter&gt; object if successful.
     */
    List<SchemaExtendedStatusParameter> status(String cwKey, String instanceIds);

    /**
     * Instance의 Extended 설정 여부를 조회합니다.
     *
     * @param cwKey 상품의 cw_key
     * @param instanceIds Extended 설정 여부를 조회하고자하는 instanceId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<SchemaExtendedStatusParameter>> statusAsync(String cwKey, String instanceIds, final ServiceCallback<List<SchemaExtendedStatusParameter>> serviceCallback);

    /**
     * Instance의 Extended 설정 여부를 조회합니다.
     *
     * @param cwKey 상품의 cw_key
     * @param instanceIds Extended 설정 여부를 조회하고자하는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;SchemaExtendedStatusParameter&gt; object
     */
    Observable<List<SchemaExtendedStatusParameter>> statusAsync(String cwKey, String instanceIds);

    /**
     * Instance의 Extended 설정 여부를 조회합니다.
     *
     * @param cwKey 상품의 cw_key
     * @param instanceIds Extended 설정 여부를 조회하고자하는 instanceId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;SchemaExtendedStatusParameter&gt; object
     */
    Observable<ServiceResponse<List<SchemaExtendedStatusParameter>>> statusWithServiceResponseAsync(String cwKey, String instanceIds);

}
