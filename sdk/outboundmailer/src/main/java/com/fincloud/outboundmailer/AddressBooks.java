/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer;

import com.fincloud.outboundmailer.models.AddressBookDeleteRelationRequest;
import com.fincloud.outboundmailer.models.AddressBookGenerateRequestGroupsItem;
import com.fincloud.outboundmailer.models.AddressBookInitResponse;
import com.fincloud.outboundmailer.models.AddressBookResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in AddressBooks.
 */
public interface AddressBooks {
    /**
     * 수신자 주소/그룹 일괄로 입력받아 주소록 생성을 요청.
     *
     * @param groups 수신자 이메일 주소를 포함한 수신자 그룹목록
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    AddressBookResponse create(List<AddressBookGenerateRequestGroupsItem> groups);

    /**
     * 수신자 주소/그룹 일괄로 입력받아 주소록 생성을 요청.
     *
     * @param groups 수신자 이메일 주소를 포함한 수신자 그룹목록
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AddressBookResponse> createAsync(List<AddressBookGenerateRequestGroupsItem> groups, final ServiceCallback<AddressBookResponse> serviceCallback);

    /**
     * 수신자 주소/그룹 일괄로 입력받아 주소록 생성을 요청.
     *
     * @param groups 수신자 이메일 주소를 포함한 수신자 그룹목록
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<AddressBookResponse> createAsync(List<AddressBookGenerateRequestGroupsItem> groups);

    /**
     * 수신자 주소/그룹 일괄로 입력받아 주소록 생성을 요청.
     *
     * @param groups 수신자 이메일 주소를 포함한 수신자 그룹목록
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<ServiceResponse<AddressBookResponse>> createWithServiceResponseAsync(List<AddressBookGenerateRequestGroupsItem> groups);
    /**
     * 수신자 주소/그룹 일괄로 입력받아 주소록 생성을 요청.
     *
     * @param groups 수신자 이메일 주소를 포함한 수신자 그룹목록
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    AddressBookResponse create(List<AddressBookGenerateRequestGroupsItem> groups, String xNCPLANG);

    /**
     * 수신자 주소/그룹 일괄로 입력받아 주소록 생성을 요청.
     *
     * @param groups 수신자 이메일 주소를 포함한 수신자 그룹목록
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AddressBookResponse> createAsync(List<AddressBookGenerateRequestGroupsItem> groups, String xNCPLANG, final ServiceCallback<AddressBookResponse> serviceCallback);

    /**
     * 수신자 주소/그룹 일괄로 입력받아 주소록 생성을 요청.
     *
     * @param groups 수신자 이메일 주소를 포함한 수신자 그룹목록
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<AddressBookResponse> createAsync(List<AddressBookGenerateRequestGroupsItem> groups, String xNCPLANG);

    /**
     * 수신자 주소/그룹 일괄로 입력받아 주소록 생성을 요청.
     *
     * @param groups 수신자 이메일 주소를 포함한 수신자 그룹목록
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<ServiceResponse<AddressBookResponse>> createWithServiceResponseAsync(List<AddressBookGenerateRequestGroupsItem> groups, String xNCPLANG);

    /**
     * 주소록 현황 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    AddressBookResponse get();

    /**
     * 주소록 현황 조회.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AddressBookResponse> getAsync(final ServiceCallback<AddressBookResponse> serviceCallback);

    /**
     * 주소록 현황 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<AddressBookResponse> getAsync();

    /**
     * 주소록 현황 조회.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<ServiceResponse<AddressBookResponse>> getWithServiceResponseAsync();
    /**
     * 주소록 현황 조회.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    AddressBookResponse get(String xNCPLANG);

    /**
     * 주소록 현황 조회.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AddressBookResponse> getAsync(String xNCPLANG, final ServiceCallback<AddressBookResponse> serviceCallback);

    /**
     * 주소록 현황 조회.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<AddressBookResponse> getAsync(String xNCPLANG);

    /**
     * 주소록 현황 조회.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<ServiceResponse<AddressBookResponse>> getWithServiceResponseAsync(String xNCPLANG);

    /**
     * 주소록 초기화.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookInitResponse object if successful.
     */
    AddressBookInitResponse delete();

    /**
     * 주소록 초기화.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AddressBookInitResponse> deleteAsync(final ServiceCallback<AddressBookInitResponse> serviceCallback);

    /**
     * 주소록 초기화.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookInitResponse object
     */
    Observable<AddressBookInitResponse> deleteAsync();

    /**
     * 주소록 초기화.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookInitResponse object
     */
    Observable<ServiceResponse<AddressBookInitResponse>> deleteWithServiceResponseAsync();
    /**
     * 주소록 초기화.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookInitResponse object if successful.
     */
    AddressBookInitResponse delete(String xNCPLANG);

    /**
     * 주소록 초기화.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AddressBookInitResponse> deleteAsync(String xNCPLANG, final ServiceCallback<AddressBookInitResponse> serviceCallback);

    /**
     * 주소록 초기화.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookInitResponse object
     */
    Observable<AddressBookInitResponse> deleteAsync(String xNCPLANG);

    /**
     * 주소록 초기화.
     *
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookInitResponse object
     */
    Observable<ServiceResponse<AddressBookInitResponse>> deleteWithServiceResponseAsync(String xNCPLANG);

    /**
     * 수신자 그룹 삭제.
     *
     * @param groupName 수신자 그룸명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    AddressBookResponse deleteRecipientGroup(String groupName);

    /**
     * 수신자 그룹 삭제.
     *
     * @param groupName 수신자 그룸명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AddressBookResponse> deleteRecipientGroupAsync(String groupName, final ServiceCallback<AddressBookResponse> serviceCallback);

    /**
     * 수신자 그룹 삭제.
     *
     * @param groupName 수신자 그룸명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<AddressBookResponse> deleteRecipientGroupAsync(String groupName);

    /**
     * 수신자 그룹 삭제.
     *
     * @param groupName 수신자 그룸명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<ServiceResponse<AddressBookResponse>> deleteRecipientGroupWithServiceResponseAsync(String groupName);
    /**
     * 수신자 그룹 삭제.
     *
     * @param groupName 수신자 그룸명
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    AddressBookResponse deleteRecipientGroup(String groupName, String xNCPLANG);

    /**
     * 수신자 그룹 삭제.
     *
     * @param groupName 수신자 그룸명
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AddressBookResponse> deleteRecipientGroupAsync(String groupName, String xNCPLANG, final ServiceCallback<AddressBookResponse> serviceCallback);

    /**
     * 수신자 그룹 삭제.
     *
     * @param groupName 수신자 그룸명
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<AddressBookResponse> deleteRecipientGroupAsync(String groupName, String xNCPLANG);

    /**
     * 수신자 그룹 삭제.
     *
     * @param groupName 수신자 그룸명
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<ServiceResponse<AddressBookResponse>> deleteRecipientGroupWithServiceResponseAsync(String groupName, String xNCPLANG);

    /**
     * 이메일 주소 삭제.
     *
     * @param emailAddresses the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    AddressBookResponse deleteAddress(List<String> emailAddresses);

    /**
     * 이메일 주소 삭제.
     *
     * @param emailAddresses the List&lt;String&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AddressBookResponse> deleteAddressAsync(List<String> emailAddresses, final ServiceCallback<AddressBookResponse> serviceCallback);

    /**
     * 이메일 주소 삭제.
     *
     * @param emailAddresses the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<AddressBookResponse> deleteAddressAsync(List<String> emailAddresses);

    /**
     * 이메일 주소 삭제.
     *
     * @param emailAddresses the List&lt;String&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<ServiceResponse<AddressBookResponse>> deleteAddressWithServiceResponseAsync(List<String> emailAddresses);
    /**
     * 이메일 주소 삭제.
     *
     * @param emailAddresses the List&lt;String&gt; value
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    AddressBookResponse deleteAddress(List<String> emailAddresses, String xNCPLANG);

    /**
     * 이메일 주소 삭제.
     *
     * @param emailAddresses the List&lt;String&gt; value
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AddressBookResponse> deleteAddressAsync(List<String> emailAddresses, String xNCPLANG, final ServiceCallback<AddressBookResponse> serviceCallback);

    /**
     * 이메일 주소 삭제.
     *
     * @param emailAddresses the List&lt;String&gt; value
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<AddressBookResponse> deleteAddressAsync(List<String> emailAddresses, String xNCPLANG);

    /**
     * 이메일 주소 삭제.
     *
     * @param emailAddresses the List&lt;String&gt; value
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<ServiceResponse<AddressBookResponse>> deleteAddressWithServiceResponseAsync(List<String> emailAddresses, String xNCPLANG);

    /**
     * 수신자 그룹에서 이메일 주소 삭제.
     *
     * @param requestBody 수신자 그룹에서 이메일 주소 삭제 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    AddressBookResponse deleteRecipientGroupByAddress(AddressBookDeleteRelationRequest requestBody);

    /**
     * 수신자 그룹에서 이메일 주소 삭제.
     *
     * @param requestBody 수신자 그룹에서 이메일 주소 삭제 요청
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AddressBookResponse> deleteRecipientGroupByAddressAsync(AddressBookDeleteRelationRequest requestBody, final ServiceCallback<AddressBookResponse> serviceCallback);

    /**
     * 수신자 그룹에서 이메일 주소 삭제.
     *
     * @param requestBody 수신자 그룹에서 이메일 주소 삭제 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<AddressBookResponse> deleteRecipientGroupByAddressAsync(AddressBookDeleteRelationRequest requestBody);

    /**
     * 수신자 그룹에서 이메일 주소 삭제.
     *
     * @param requestBody 수신자 그룹에서 이메일 주소 삭제 요청
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<ServiceResponse<AddressBookResponse>> deleteRecipientGroupByAddressWithServiceResponseAsync(AddressBookDeleteRelationRequest requestBody);
    /**
     * 수신자 그룹에서 이메일 주소 삭제.
     *
     * @param requestBody 수신자 그룹에서 이메일 주소 삭제 요청
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    AddressBookResponse deleteRecipientGroupByAddress(AddressBookDeleteRelationRequest requestBody, String xNCPLANG);

    /**
     * 수신자 그룹에서 이메일 주소 삭제.
     *
     * @param requestBody 수신자 그룹에서 이메일 주소 삭제 요청
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AddressBookResponse> deleteRecipientGroupByAddressAsync(AddressBookDeleteRelationRequest requestBody, String xNCPLANG, final ServiceCallback<AddressBookResponse> serviceCallback);

    /**
     * 수신자 그룹에서 이메일 주소 삭제.
     *
     * @param requestBody 수신자 그룹에서 이메일 주소 삭제 요청
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<AddressBookResponse> deleteRecipientGroupByAddressAsync(AddressBookDeleteRelationRequest requestBody, String xNCPLANG);

    /**
     * 수신자 그룹에서 이메일 주소 삭제.
     *
     * @param requestBody 수신자 그룹에서 이메일 주소 삭제 요청
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<ServiceResponse<AddressBookResponse>> deleteRecipientGroupByAddressWithServiceResponseAsync(AddressBookDeleteRelationRequest requestBody, String xNCPLANG);

    /**
     * 수신자 그룹에서 모든 이메일 주소 연관 정보 삭제 (비우기).
     *
     * @param groupName 수신자 그룸명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    AddressBookResponse deleteEmptyRecipientGroup(String groupName);

    /**
     * 수신자 그룹에서 모든 이메일 주소 연관 정보 삭제 (비우기).
     *
     * @param groupName 수신자 그룸명
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AddressBookResponse> deleteEmptyRecipientGroupAsync(String groupName, final ServiceCallback<AddressBookResponse> serviceCallback);

    /**
     * 수신자 그룹에서 모든 이메일 주소 연관 정보 삭제 (비우기).
     *
     * @param groupName 수신자 그룸명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<AddressBookResponse> deleteEmptyRecipientGroupAsync(String groupName);

    /**
     * 수신자 그룹에서 모든 이메일 주소 연관 정보 삭제 (비우기).
     *
     * @param groupName 수신자 그룸명
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<ServiceResponse<AddressBookResponse>> deleteEmptyRecipientGroupWithServiceResponseAsync(String groupName);
    /**
     * 수신자 그룹에서 모든 이메일 주소 연관 정보 삭제 (비우기).
     *
     * @param groupName 수신자 그룸명
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AddressBookResponse object if successful.
     */
    AddressBookResponse deleteEmptyRecipientGroup(String groupName, String xNCPLANG);

    /**
     * 수신자 그룹에서 모든 이메일 주소 연관 정보 삭제 (비우기).
     *
     * @param groupName 수신자 그룸명
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AddressBookResponse> deleteEmptyRecipientGroupAsync(String groupName, String xNCPLANG, final ServiceCallback<AddressBookResponse> serviceCallback);

    /**
     * 수신자 그룹에서 모든 이메일 주소 연관 정보 삭제 (비우기).
     *
     * @param groupName 수신자 그룸명
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<AddressBookResponse> deleteEmptyRecipientGroupAsync(String groupName, String xNCPLANG);

    /**
     * 수신자 그룹에서 모든 이메일 주소 연관 정보 삭제 (비우기).
     *
     * @param groupName 수신자 그룸명
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AddressBookResponse object
     */
    Observable<ServiceResponse<AddressBookResponse>> deleteEmptyRecipientGroupWithServiceResponseAsync(String groupName, String xNCPLANG);

}
