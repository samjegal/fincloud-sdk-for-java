/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.partner;

import com.fincloud.partner.models.ContractProductDemandListResponse;
import com.fincloud.partner.models.DemandListResponse;
import com.fincloud.partner.models.DemandProductListResponse;
import com.fincloud.partner.models.PartnerDemandListResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Partners.
 */
public interface Partners {
    /**
     * 계약 상품 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ContractProductDemandListResponse object if successful.
     */
    ContractProductDemandListResponse getContractProductDemandList(String responseFormatType);

    /**
     * 계약 상품 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ContractProductDemandListResponse> getContractProductDemandListAsync(String responseFormatType, final ServiceCallback<ContractProductDemandListResponse> serviceCallback);

    /**
     * 계약 상품 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ContractProductDemandListResponse object
     */
    Observable<ContractProductDemandListResponse> getContractProductDemandListAsync(String responseFormatType);

    /**
     * 계약 상품 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ContractProductDemandListResponse object
     */
    Observable<ServiceResponse<ContractProductDemandListResponse>> getContractProductDemandListWithServiceResponseAsync(String responseFormatType);
    /**
     * 계약 상품 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ContractProductDemandListResponse object if successful.
     */
    ContractProductDemandListResponse getContractProductDemandList(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId);

    /**
     * 계약 상품 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ContractProductDemandListResponse> getContractProductDemandListAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId, final ServiceCallback<ContractProductDemandListResponse> serviceCallback);

    /**
     * 계약 상품 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ContractProductDemandListResponse object
     */
    Observable<ContractProductDemandListResponse> getContractProductDemandListAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId);

    /**
     * 계약 상품 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ContractProductDemandListResponse object
     */
    Observable<ServiceResponse<ContractProductDemandListResponse>> getContractProductDemandListWithServiceResponseAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId);

    /**
     * 청구 상품 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DemandProductListResponse object if successful.
     */
    DemandProductListResponse getDemandProductList(String responseFormatType);

    /**
     * 청구 상품 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DemandProductListResponse> getDemandProductListAsync(String responseFormatType, final ServiceCallback<DemandProductListResponse> serviceCallback);

    /**
     * 청구 상품 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DemandProductListResponse object
     */
    Observable<DemandProductListResponse> getDemandProductListAsync(String responseFormatType);

    /**
     * 청구 상품 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DemandProductListResponse object
     */
    Observable<ServiceResponse<DemandProductListResponse>> getDemandProductListWithServiceResponseAsync(String responseFormatType);
    /**
     * 청구 상품 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DemandProductListResponse object if successful.
     */
    DemandProductListResponse getDemandProductList(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId);

    /**
     * 청구 상품 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DemandProductListResponse> getDemandProductListAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId, final ServiceCallback<DemandProductListResponse> serviceCallback);

    /**
     * 청구 상품 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DemandProductListResponse object
     */
    Observable<DemandProductListResponse> getDemandProductListAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId);

    /**
     * 청구 상품 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DemandProductListResponse object
     */
    Observable<ServiceResponse<DemandProductListResponse>> getDemandProductListWithServiceResponseAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId);

    /**
     * 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DemandListResponse object if successful.
     */
    DemandListResponse getDemandList(String responseFormatType);

    /**
     * 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DemandListResponse> getDemandListAsync(String responseFormatType, final ServiceCallback<DemandListResponse> serviceCallback);

    /**
     * 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DemandListResponse object
     */
    Observable<DemandListResponse> getDemandListAsync(String responseFormatType);

    /**
     * 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DemandListResponse object
     */
    Observable<ServiceResponse<DemandListResponse>> getDemandListWithServiceResponseAsync(String responseFormatType);
    /**
     * 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DemandListResponse object if successful.
     */
    DemandListResponse getDemandList(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId);

    /**
     * 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DemandListResponse> getDemandListAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId, final ServiceCallback<DemandListResponse> serviceCallback);

    /**
     * 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DemandListResponse object
     */
    Observable<DemandListResponse> getDemandListAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId);

    /**
     * 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DemandListResponse object
     */
    Observable<ServiceResponse<DemandListResponse>> getDemandListWithServiceResponseAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId);

    /**
     * 파트너 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PartnerDemandListResponse object if successful.
     */
    PartnerDemandListResponse getPartnerDemandList(String responseFormatType);

    /**
     * 파트너 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PartnerDemandListResponse> getPartnerDemandListAsync(String responseFormatType, final ServiceCallback<PartnerDemandListResponse> serviceCallback);

    /**
     * 파트너 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnerDemandListResponse object
     */
    Observable<PartnerDemandListResponse> getPartnerDemandListAsync(String responseFormatType);

    /**
     * 파트너 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnerDemandListResponse object
     */
    Observable<ServiceResponse<PartnerDemandListResponse>> getPartnerDemandListWithServiceResponseAsync(String responseFormatType);
    /**
     * 파트너 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PartnerDemandListResponse object if successful.
     */
    PartnerDemandListResponse getPartnerDemandList(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId);

    /**
     * 파트너 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<PartnerDemandListResponse> getPartnerDemandListAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId, final ServiceCallback<PartnerDemandListResponse> serviceCallback);

    /**
     * 파트너 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnerDemandListResponse object
     */
    Observable<PartnerDemandListResponse> getPartnerDemandListAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId);

    /**
     * 파트너 청구 리스트.
     *
     * @param responseFormatType 리턴 타입
     * @param pageNo 페이지 번호
     * @param pageSize 페이지 사이즈
     * @param startMonth 시작 년월
     * @param endMonth 마지막 년월
     * @param loginId 로그인 아이디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnerDemandListResponse object
     */
    Observable<ServiceResponse<PartnerDemandListResponse>> getPartnerDemandListWithServiceResponseAsync(String responseFormatType, Integer pageNo, Integer pageSize, String startMonth, String endMonth, String loginId);

}
