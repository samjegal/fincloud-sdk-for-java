/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.CloudInsightSchemaParameter;
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
     * Get schema information of the specific product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void get();

    /**
     * Get schema information of the specific product.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get schema information of the specific product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getAsync();

    /**
     * Get schema information of the specific product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getWithServiceResponseAsync();
    /**
     * Get schema information of the specific product.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void get(String prodName);

    /**
     * Get schema information of the specific product.
     *
     * @param prodName Product 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getAsync(String prodName, final ServiceCallback<Void> serviceCallback);

    /**
     * Get schema information of the specific product.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getAsync(String prodName);

    /**
     * Get schema information of the specific product.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getWithServiceResponseAsync(String prodName);

    /**
     * Create schema for user application. If product does not exist, it will registered automatically.
     *
     * @param parameters Cloud Insight Custom 메트릭 생성 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create(CloudInsightSchemaParameter parameters);

    /**
     * Create schema for user application. If product does not exist, it will registered automatically.
     *
     * @param parameters Cloud Insight Custom 메트릭 생성 데이터
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(CloudInsightSchemaParameter parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * Create schema for user application. If product does not exist, it will registered automatically.
     *
     * @param parameters Cloud Insight Custom 메트릭 생성 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync(CloudInsightSchemaParameter parameters);

    /**
     * Create schema for user application. If product does not exist, it will registered automatically.
     *
     * @param parameters Cloud Insight Custom 메트릭 생성 데이터
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync(CloudInsightSchemaParameter parameters);
    /**
     * Create schema for user application. If product does not exist, it will registered automatically.
     *
     * @param parameters Cloud Insight Custom 메트릭 생성 데이터
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create(CloudInsightSchemaParameter parameters, String prodName);

    /**
     * Create schema for user application. If product does not exist, it will registered automatically.
     *
     * @param parameters Cloud Insight Custom 메트릭 생성 데이터
     * @param prodName Product 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(CloudInsightSchemaParameter parameters, String prodName, final ServiceCallback<Void> serviceCallback);

    /**
     * Create schema for user application. If product does not exist, it will registered automatically.
     *
     * @param parameters Cloud Insight Custom 메트릭 생성 데이터
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync(CloudInsightSchemaParameter parameters, String prodName);

    /**
     * Create schema for user application. If product does not exist, it will registered automatically.
     *
     * @param parameters Cloud Insight Custom 메트릭 생성 데이터
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync(CloudInsightSchemaParameter parameters, String prodName);

    /**
     * Update schema for an existing product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void update();

    /**
     * Update schema for an existing product.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> updateAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Update schema for an existing product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> updateAsync();

    /**
     * Update schema for an existing product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> updateWithServiceResponseAsync();
    /**
     * Update schema for an existing product.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void update(String prodName);

    /**
     * Update schema for an existing product.
     *
     * @param prodName Product 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> updateAsync(String prodName, final ServiceCallback<Void> serviceCallback);

    /**
     * Update schema for an existing product.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> updateAsync(String prodName);

    /**
     * Update schema for an existing product.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(String prodName);

    /**
     * Delete schema for an application.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete();

    /**
     * Delete schema for an application.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Delete schema for an application.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync();

    /**
     * Delete schema for an application.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync();
    /**
     * Delete schema for an application.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String prodName);

    /**
     * Delete schema for an application.
     *
     * @param prodName Product 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String prodName, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete schema for an application.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String prodName);

    /**
     * Delete schema for an application.
     *
     * @param prodName Product 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String prodName);

    /**
     * Disable the extended metrics for a product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void disable();

    /**
     * Disable the extended metrics for a product.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> disableAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Disable the extended metrics for a product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> disableAsync();

    /**
     * Disable the extended metrics for a product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> disableWithServiceResponseAsync();
    /**
     * Disable the extended metrics for a product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void disable(String cwKey, String instanceIds);

    /**
     * Disable the extended metrics for a product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> disableAsync(String cwKey, String instanceIds, final ServiceCallback<Void> serviceCallback);

    /**
     * Disable the extended metrics for a product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> disableAsync(String cwKey, String instanceIds);

    /**
     * Disable the extended metrics for a product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> disableWithServiceResponseAsync(String cwKey, String instanceIds);

    /**
     * Enable the extended metrics for a product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void enable();

    /**
     * Enable the extended metrics for a product.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> enableAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Enable the extended metrics for a product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> enableAsync();

    /**
     * Enable the extended metrics for a product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> enableWithServiceResponseAsync();
    /**
     * Enable the extended metrics for a product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void enable(String cwKey, String instanceIds);

    /**
     * Enable the extended metrics for a product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> enableAsync(String cwKey, String instanceIds, final ServiceCallback<Void> serviceCallback);

    /**
     * Enable the extended metrics for a product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> enableAsync(String cwKey, String instanceIds);

    /**
     * Enable the extended metrics for a product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> enableWithServiceResponseAsync(String cwKey, String instanceIds);

    /**
     * Query the status of extended metrics of those product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void queryStatus();

    /**
     * Query the status of extended metrics of those product.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> queryStatusAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Query the status of extended metrics of those product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> queryStatusAsync();

    /**
     * Query the status of extended metrics of those product.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> queryStatusWithServiceResponseAsync();
    /**
     * Query the status of extended metrics of those product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void queryStatus(String cwKey, String instanceIds);

    /**
     * Query the status of extended metrics of those product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> queryStatusAsync(String cwKey, String instanceIds, final ServiceCallback<Void> serviceCallback);

    /**
     * Query the status of extended metrics of those product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> queryStatusAsync(String cwKey, String instanceIds);

    /**
     * Query the status of extended metrics of those product.
     *
     * @param cwKey Product key
     * @param instanceIds Target instance id, string separated by commas
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> queryStatusWithServiceResponseAsync(String cwKey, String instanceIds);

    /**
     * Get schema list.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getList();

    /**
     * Get schema list.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getListAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get schema list.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getListAsync();

    /**
     * Get schema list.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getListWithServiceResponseAsync();

}
