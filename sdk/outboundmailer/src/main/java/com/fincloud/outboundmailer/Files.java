/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer;

import com.fincloud.outboundmailer.models.FileUploadResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Files.
 */
public interface Files {
    /**
     * 파일을 업로드 할 수 있는 기능을 제공.
     *
     * @param fileList 파일 업로드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FileUploadResponse object if successful.
     */
    FileUploadResponse create(byte[] fileList);

    /**
     * 파일을 업로드 할 수 있는 기능을 제공.
     *
     * @param fileList 파일 업로드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<FileUploadResponse> createAsync(byte[] fileList, final ServiceCallback<FileUploadResponse> serviceCallback);

    /**
     * 파일을 업로드 할 수 있는 기능을 제공.
     *
     * @param fileList 파일 업로드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FileUploadResponse object
     */
    Observable<FileUploadResponse> createAsync(byte[] fileList);

    /**
     * 파일을 업로드 할 수 있는 기능을 제공.
     *
     * @param fileList 파일 업로드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FileUploadResponse object
     */
    Observable<ServiceResponse<FileUploadResponse>> createWithServiceResponseAsync(byte[] fileList);
    /**
     * 파일을 업로드 할 수 있는 기능을 제공.
     *
     * @param fileList 파일 업로드
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FileUploadResponse object if successful.
     */
    FileUploadResponse create(byte[] fileList, String xNCPLANG);

    /**
     * 파일을 업로드 할 수 있는 기능을 제공.
     *
     * @param fileList 파일 업로드
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<FileUploadResponse> createAsync(byte[] fileList, String xNCPLANG, final ServiceCallback<FileUploadResponse> serviceCallback);

    /**
     * 파일을 업로드 할 수 있는 기능을 제공.
     *
     * @param fileList 파일 업로드
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FileUploadResponse object
     */
    Observable<FileUploadResponse> createAsync(byte[] fileList, String xNCPLANG);

    /**
     * 파일을 업로드 할 수 있는 기능을 제공.
     *
     * @param fileList 파일 업로드
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FileUploadResponse object
     */
    Observable<ServiceResponse<FileUploadResponse>> createWithServiceResponseAsync(byte[] fileList, String xNCPLANG);

    /**
     * 저장된 파일 조회.
     *
     * @param tempRequestId tempRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object get(String tempRequestId);

    /**
     * 저장된 파일 조회.
     *
     * @param tempRequestId tempRequestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getAsync(String tempRequestId, final ServiceCallback<Object> serviceCallback);

    /**
     * 저장된 파일 조회.
     *
     * @param tempRequestId tempRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getAsync(String tempRequestId);

    /**
     * 저장된 파일 조회.
     *
     * @param tempRequestId tempRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getWithServiceResponseAsync(String tempRequestId);
    /**
     * 저장된 파일 조회.
     *
     * @param tempRequestId tempRequestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object get(String tempRequestId, String xNCPLANG);

    /**
     * 저장된 파일 조회.
     *
     * @param tempRequestId tempRequestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getAsync(String tempRequestId, String xNCPLANG, final ServiceCallback<Object> serviceCallback);

    /**
     * 저장된 파일 조회.
     *
     * @param tempRequestId tempRequestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getAsync(String tempRequestId, String xNCPLANG);

    /**
     * 저장된 파일 조회.
     *
     * @param tempRequestId tempRequestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getWithServiceResponseAsync(String tempRequestId, String xNCPLANG);

    /**
     * 저장된 파일 삭제.
     *
     * @param tempRequestId tempRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object delete(String tempRequestId);

    /**
     * 저장된 파일 삭제.
     *
     * @param tempRequestId tempRequestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> deleteAsync(String tempRequestId, final ServiceCallback<Object> serviceCallback);

    /**
     * 저장된 파일 삭제.
     *
     * @param tempRequestId tempRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> deleteAsync(String tempRequestId);

    /**
     * 저장된 파일 삭제.
     *
     * @param tempRequestId tempRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> deleteWithServiceResponseAsync(String tempRequestId);
    /**
     * 저장된 파일 삭제.
     *
     * @param tempRequestId tempRequestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object delete(String tempRequestId, String xNCPLANG);

    /**
     * 저장된 파일 삭제.
     *
     * @param tempRequestId tempRequestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> deleteAsync(String tempRequestId, String xNCPLANG, final ServiceCallback<Object> serviceCallback);

    /**
     * 저장된 파일 삭제.
     *
     * @param tempRequestId tempRequestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> deleteAsync(String tempRequestId, String xNCPLANG);

    /**
     * 저장된 파일 삭제.
     *
     * @param tempRequestId tempRequestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> deleteWithServiceResponseAsync(String tempRequestId, String xNCPLANG);

}
