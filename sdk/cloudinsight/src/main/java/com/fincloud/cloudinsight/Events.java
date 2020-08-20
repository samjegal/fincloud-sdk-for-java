/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.cloudinsight;

import com.fincloud.cloudinsight.models.EventSearchRequest;
import com.fincloud.cloudinsight.models.EventSearchResultParameter;
import com.fincloud.cloudinsight.models.SearchEventCountConsoleRequest;
import com.fincloud.cloudinsight.models.SearchEventCountConsoleResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Events.
 */
public interface Events {
    /**
     * Event id와 Rule id로 Event를 상세 조회합니다.
     *
     * @param parameters Event search criteria
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;EventSearchResultParameter&gt; object if successful.
     */
    List<EventSearchResultParameter> searchById(EventSearchRequest parameters);

    /**
     * Event id와 Rule id로 Event를 상세 조회합니다.
     *
     * @param parameters Event search criteria
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<EventSearchResultParameter>> searchByIdAsync(EventSearchRequest parameters, final ServiceCallback<List<EventSearchResultParameter>> serviceCallback);

    /**
     * Event id와 Rule id로 Event를 상세 조회합니다.
     *
     * @param parameters Event search criteria
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;EventSearchResultParameter&gt; object
     */
    Observable<List<EventSearchResultParameter>> searchByIdAsync(EventSearchRequest parameters);

    /**
     * Event id와 Rule id로 Event를 상세 조회합니다.
     *
     * @param parameters Event search criteria
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;EventSearchResultParameter&gt; object
     */
    Observable<ServiceResponse<List<EventSearchResultParameter>>> searchByIdWithServiceResponseAsync(EventSearchRequest parameters);

    /**
     * Search event count console.
     *
     * @param parameters the SearchEventCountConsoleRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SearchEventCountConsoleResponse object if successful.
     */
    SearchEventCountConsoleResponse searchEventCount(SearchEventCountConsoleRequest parameters);

    /**
     * Search event count console.
     *
     * @param parameters the SearchEventCountConsoleRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SearchEventCountConsoleResponse> searchEventCountAsync(SearchEventCountConsoleRequest parameters, final ServiceCallback<SearchEventCountConsoleResponse> serviceCallback);

    /**
     * Search event count console.
     *
     * @param parameters the SearchEventCountConsoleRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SearchEventCountConsoleResponse object
     */
    Observable<SearchEventCountConsoleResponse> searchEventCountAsync(SearchEventCountConsoleRequest parameters);

    /**
     * Search event count console.
     *
     * @param parameters the SearchEventCountConsoleRequest value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SearchEventCountConsoleResponse object
     */
    Observable<ServiceResponse<SearchEventCountConsoleResponse>> searchEventCountWithServiceResponseAsync(SearchEventCountConsoleRequest parameters);

}
