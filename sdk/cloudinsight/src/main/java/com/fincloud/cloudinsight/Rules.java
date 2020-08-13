/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Rules.
 */
public interface Rules {
    /**
     * Create a new event rule.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void create();

    /**
     * Create a new event rule.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> createAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Create a new event rule.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> createAsync();

    /**
     * Create a new event rule.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> createWithServiceResponseAsync();

    /**
     * Get rule list.
     *
     * @param pageNum 페이지 번호
     * @param pageSize 페이지 크기
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getList(String pageNum, String pageSize);

    /**
     * Get rule list.
     *
     * @param pageNum 페이지 번호
     * @param pageSize 페이지 크기
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getListAsync(String pageNum, String pageSize, final ServiceCallback<Void> serviceCallback);

    /**
     * Get rule list.
     *
     * @param pageNum 페이지 번호
     * @param pageSize 페이지 크기
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getListAsync(String pageNum, String pageSize);

    /**
     * Get rule list.
     *
     * @param pageNum 페이지 번호
     * @param pageSize 페이지 크기
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getListWithServiceResponseAsync(String pageNum, String pageSize);

    /**
     * Get event rule by ID.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void get(String ruleId);

    /**
     * Get event rule by ID.
     *
     * @param ruleId Rule 고유 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getAsync(String ruleId, final ServiceCallback<Void> serviceCallback);

    /**
     * Get event rule by ID.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getAsync(String ruleId);

    /**
     * Get event rule by ID.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getWithServiceResponseAsync(String ruleId);

    /**
     * Update an existing event rule.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void update(String ruleId);

    /**
     * Update an existing event rule.
     *
     * @param ruleId Rule 고유 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> updateAsync(String ruleId, final ServiceCallback<Void> serviceCallback);

    /**
     * Update an existing event rule.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> updateAsync(String ruleId);

    /**
     * Update an existing event rule.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(String ruleId);

    /**
     * Delete selected event rule.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String ruleId);

    /**
     * Delete selected event rule.
     *
     * @param ruleId Rule 고유 번호
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String ruleId, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete selected event rule.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String ruleId);

    /**
     * Delete selected event rule.
     *
     * @param ruleId Rule 고유 번호
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String ruleId);

}
