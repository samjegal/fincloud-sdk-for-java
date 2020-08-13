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
 * in Servers.
 */
public interface Servers {
    /**
     * Target metric (mem_usert/avg_cpu_user_rto/fs_usert).
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void creatTop();

    /**
     * Target metric (mem_usert/avg_cpu_user_rto/fs_usert).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> creatTopAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Target metric (mem_usert/avg_cpu_user_rto/fs_usert).
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> creatTopAsync();

    /**
     * Target metric (mem_usert/avg_cpu_user_rto/fs_usert).
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> creatTopWithServiceResponseAsync();
    /**
     * Target metric (mem_usert/avg_cpu_user_rto/fs_usert).
     *
     * @param query Target metric (mem_usert/avg_cpu_user_rto/fs_usert)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void creatTop(String query);

    /**
     * Target metric (mem_usert/avg_cpu_user_rto/fs_usert).
     *
     * @param query Target metric (mem_usert/avg_cpu_user_rto/fs_usert)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> creatTopAsync(String query, final ServiceCallback<Void> serviceCallback);

    /**
     * Target metric (mem_usert/avg_cpu_user_rto/fs_usert).
     *
     * @param query Target metric (mem_usert/avg_cpu_user_rto/fs_usert)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> creatTopAsync(String query);

    /**
     * Target metric (mem_usert/avg_cpu_user_rto/fs_usert).
     *
     * @param query Target metric (mem_usert/avg_cpu_user_rto/fs_usert)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> creatTopWithServiceResponseAsync(String query);

}
