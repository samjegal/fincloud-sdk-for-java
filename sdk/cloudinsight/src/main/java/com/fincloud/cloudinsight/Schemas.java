/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.ScehmaUpdateResponse;
import com.fincloud.cloudinsight.models.SchemaRegisterResponse;
import com.fincloud.cloudinsight.models.SchemaRequest;
import com.fincloud.cloudinsight.models.SchemaResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Schemas.
 */
public interface Schemas {
    /**
     * 사용자가 정의한 스키마를 조회합니다.
     *
     * @param prodName 상품의 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SchemaResponse object if successful.
     */
    SchemaResponse get(String prodName);

    /**
     * 사용자가 정의한 스키마를 조회합니다.
     *
     * @param prodName 상품의 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SchemaResponse> getAsync(String prodName, final ServiceCallback<SchemaResponse> serviceCallback);

    /**
     * 사용자가 정의한 스키마를 조회합니다.
     *
     * @param prodName 상품의 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaResponse object
     */
    Observable<SchemaResponse> getAsync(String prodName);

    /**
     * 사용자가 정의한 스키마를 조회합니다.
     *
     * @param prodName 상품의 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaResponse object
     */
    Observable<ServiceResponse<SchemaResponse>> getWithServiceResponseAsync(String prodName);
    /**
     * 사용자가 정의한 스키마를 조회합니다.
     *
     * @param prodName 상품의 이름
     * @param cwKey 상품의 cw_key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SchemaResponse object if successful.
     */
    SchemaResponse get(String prodName, String cwKey);

    /**
     * 사용자가 정의한 스키마를 조회합니다.
     *
     * @param prodName 상품의 이름
     * @param cwKey 상품의 cw_key
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SchemaResponse> getAsync(String prodName, String cwKey, final ServiceCallback<SchemaResponse> serviceCallback);

    /**
     * 사용자가 정의한 스키마를 조회합니다.
     *
     * @param prodName 상품의 이름
     * @param cwKey 상품의 cw_key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaResponse object
     */
    Observable<SchemaResponse> getAsync(String prodName, String cwKey);

    /**
     * 사용자가 정의한 스키마를 조회합니다.
     *
     * @param prodName 상품의 이름
     * @param cwKey 상품의 cw_key
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaResponse object
     */
    Observable<ServiceResponse<SchemaResponse>> getWithServiceResponseAsync(String prodName, String cwKey);

    /**
     * Cloud Insight에서 사용자 정의 스키마를 등록합니다.
     *
     * @param parameters 상품의 스키마 정의
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SchemaRegisterResponse object if successful.
     */
    SchemaRegisterResponse register(SchemaRequest parameters);

    /**
     * Cloud Insight에서 사용자 정의 스키마를 등록합니다.
     *
     * @param parameters 상품의 스키마 정의
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SchemaRegisterResponse> registerAsync(SchemaRequest parameters, final ServiceCallback<SchemaRegisterResponse> serviceCallback);

    /**
     * Cloud Insight에서 사용자 정의 스키마를 등록합니다.
     *
     * @param parameters 상품의 스키마 정의
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaRegisterResponse object
     */
    Observable<SchemaRegisterResponse> registerAsync(SchemaRequest parameters);

    /**
     * Cloud Insight에서 사용자 정의 스키마를 등록합니다.
     *
     * @param parameters 상품의 스키마 정의
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SchemaRegisterResponse object
     */
    Observable<ServiceResponse<SchemaRegisterResponse>> registerWithServiceResponseAsync(SchemaRequest parameters);

    /**
     * Update schema for an existing product.
     *
     * @param parameters 상품의 스키마 정의
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ScehmaUpdateResponse object if successful.
     */
    ScehmaUpdateResponse update(SchemaRequest parameters);

    /**
     * Update schema for an existing product.
     *
     * @param parameters 상품의 스키마 정의
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ScehmaUpdateResponse> updateAsync(SchemaRequest parameters, final ServiceCallback<ScehmaUpdateResponse> serviceCallback);

    /**
     * Update schema for an existing product.
     *
     * @param parameters 상품의 스키마 정의
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ScehmaUpdateResponse object
     */
    Observable<ScehmaUpdateResponse> updateAsync(SchemaRequest parameters);

    /**
     * Update schema for an existing product.
     *
     * @param parameters 상품의 스키마 정의
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ScehmaUpdateResponse object
     */
    Observable<ServiceResponse<ScehmaUpdateResponse>> updateWithServiceResponseAsync(SchemaRequest parameters);

    /**
     * Delete schema for an application.
     *
     * @param cwKey 상품의 cw_key
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String cwKey, String prodName);

    /**
     * Delete schema for an application.
     *
     * @param cwKey 상품의 cw_key
     * @param prodName Product 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String cwKey, String prodName, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete schema for an application.
     *
     * @param cwKey 상품의 cw_key
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String cwKey, String prodName);

    /**
     * Delete schema for an application.
     *
     * @param cwKey 상품의 cw_key
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String cwKey, String prodName);

}
