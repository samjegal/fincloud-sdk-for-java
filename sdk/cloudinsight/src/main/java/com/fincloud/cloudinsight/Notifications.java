/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.EventRuleResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Notifications.
 */
public interface Notifications {
    /**
     * Get notification rule with a given group Id.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EventRuleResponse object if successful.
     */
    EventRuleResponse get();

    /**
     * Get notification rule with a given group Id.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<EventRuleResponse> getAsync(final ServiceCallback<EventRuleResponse> serviceCallback);

    /**
     * Get notification rule with a given group Id.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventRuleResponse object
     */
    Observable<EventRuleResponse> getAsync();

    /**
     * Get notification rule with a given group Id.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventRuleResponse object
     */
    Observable<ServiceResponse<EventRuleResponse>> getWithServiceResponseAsync();
    /**
     * Get notification rule with a given group Id.
     *
     * @param grpId Notification GroupId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EventRuleResponse object if successful.
     */
    EventRuleResponse get(String grpId);

    /**
     * Get notification rule with a given group Id.
     *
     * @param grpId Notification GroupId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<EventRuleResponse> getAsync(String grpId, final ServiceCallback<EventRuleResponse> serviceCallback);

    /**
     * Get notification rule with a given group Id.
     *
     * @param grpId Notification GroupId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventRuleResponse object
     */
    Observable<EventRuleResponse> getAsync(String grpId);

    /**
     * Get notification rule with a given group Id.
     *
     * @param grpId Notification GroupId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventRuleResponse object
     */
    Observable<ServiceResponse<EventRuleResponse>> getWithServiceResponseAsync(String grpId);

}
