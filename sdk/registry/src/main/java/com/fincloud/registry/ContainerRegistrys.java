/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.registry;

import com.fincloud.registry.models.MessageResponse;
import com.fincloud.registry.models.UpdateRepositoryImageRequest;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ContainerRegistrys.
 */
public interface ContainerRegistrys {
    /**
     * Container Registry에 등록된 Registry 목록을 반환합니다.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getList();

    /**
     * Container Registry에 등록된 Registry 목록을 반환합니다.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getListAsync(final ServiceCallback<Object> serviceCallback);

    /**
     * Container Registry에 등록된 Registry 목록을 반환합니다.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getListAsync();

    /**
     * Container Registry에 등록된 Registry 목록을 반환합니다.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getListWithServiceResponseAsync();
    /**
     * Container Registry에 등록된 Registry 목록을 반환합니다.
     *
     * @param page Start page number. It must be greater than zero.
     * @param pagesize Start
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getList(Integer page, Integer pagesize);

    /**
     * Container Registry에 등록된 Registry 목록을 반환합니다.
     *
     * @param page Start page number. It must be greater than zero.
     * @param pagesize Start
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getListAsync(Integer page, Integer pagesize, final ServiceCallback<Object> serviceCallback);

    /**
     * Container Registry에 등록된 Registry 목록을 반환합니다.
     *
     * @param page Start page number. It must be greater than zero.
     * @param pagesize Start
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getListAsync(Integer page, Integer pagesize);

    /**
     * Container Registry에 등록된 Registry 목록을 반환합니다.
     *
     * @param page Start page number. It must be greater than zero.
     * @param pagesize Start
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getListWithServiceResponseAsync(Integer page, Integer pagesize);

    /**
     * 레지스트리 내 등록된 Image들의 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getImageList(String registry);

    /**
     * 레지스트리 내 등록된 Image들의 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getImageListAsync(String registry, final ServiceCallback<Object> serviceCallback);

    /**
     * 레지스트리 내 등록된 Image들의 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getImageListAsync(String registry);

    /**
     * 레지스트리 내 등록된 Image들의 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getImageListWithServiceResponseAsync(String registry);
    /**
     * 레지스트리 내 등록된 Image들의 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param page Start page number. It must be greater than zero.
     * @param pagesize Start
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getImageList(String registry, Integer page, Integer pagesize);

    /**
     * 레지스트리 내 등록된 Image들의 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param page Start page number. It must be greater than zero.
     * @param pagesize Start
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getImageListAsync(String registry, Integer page, Integer pagesize, final ServiceCallback<Object> serviceCallback);

    /**
     * 레지스트리 내 등록된 Image들의 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param page Start page number. It must be greater than zero.
     * @param pagesize Start
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getImageListAsync(String registry, Integer page, Integer pagesize);

    /**
     * 레지스트리 내 등록된 Image들의 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param page Start page number. It must be greater than zero.
     * @param pagesize Start
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getImageListWithServiceResponseAsync(String registry, Integer page, Integer pagesize);

    /**
     * Object Storage의 Bucket과 연동된 Registry를 생성합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param bucket 생성될 레지스트리와 연동될 Object Storage의 Bucket 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MessageResponse object if successful.
     */
    MessageResponse create(String registry, String bucket);

    /**
     * Object Storage의 Bucket과 연동된 Registry를 생성합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param bucket 생성될 레지스트리와 연동될 Object Storage의 Bucket 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<MessageResponse> createAsync(String registry, String bucket, final ServiceCallback<MessageResponse> serviceCallback);

    /**
     * Object Storage의 Bucket과 연동된 Registry를 생성합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param bucket 생성될 레지스트리와 연동될 Object Storage의 Bucket 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    Observable<MessageResponse> createAsync(String registry, String bucket);

    /**
     * Object Storage의 Bucket과 연동된 Registry를 생성합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param bucket 생성될 레지스트리와 연동될 Object Storage의 Bucket 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    Observable<ServiceResponse<MessageResponse>> createWithServiceResponseAsync(String registry, String bucket);

    /**
     * 특정 Registry를 삭제합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MessageResponse object if successful.
     */
    MessageResponse delete(String registry);

    /**
     * 특정 Registry를 삭제합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<MessageResponse> deleteAsync(String registry, final ServiceCallback<MessageResponse> serviceCallback);

    /**
     * 특정 Registry를 삭제합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    Observable<MessageResponse> deleteAsync(String registry);

    /**
     * 특정 Registry를 삭제합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    Observable<ServiceResponse<MessageResponse>> deleteWithServiceResponseAsync(String registry);

    /**
     * 레지스트리 내 등록된 Image의 상세 정보를 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getImageDetail(String registry, String imageName);

    /**
     * 레지스트리 내 등록된 Image의 상세 정보를 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getImageDetailAsync(String registry, String imageName, final ServiceCallback<Object> serviceCallback);

    /**
     * 레지스트리 내 등록된 Image의 상세 정보를 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getImageDetailAsync(String registry, String imageName);

    /**
     * 레지스트리 내 등록된 Image의 상세 정보를 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getImageDetailWithServiceResponseAsync(String registry, String imageName);

    /**
     * 레지스트리에 등록된 이미지에 대한 description, full_description을 업데이트 합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param parameters 요청 바디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MessageResponse object if successful.
     */
    MessageResponse updateImage(String registry, String imageName, UpdateRepositoryImageRequest parameters);

    /**
     * 레지스트리에 등록된 이미지에 대한 description, full_description을 업데이트 합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param parameters 요청 바디
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<MessageResponse> updateImageAsync(String registry, String imageName, UpdateRepositoryImageRequest parameters, final ServiceCallback<MessageResponse> serviceCallback);

    /**
     * 레지스트리에 등록된 이미지에 대한 description, full_description을 업데이트 합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param parameters 요청 바디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    Observable<MessageResponse> updateImageAsync(String registry, String imageName, UpdateRepositoryImageRequest parameters);

    /**
     * 레지스트리에 등록된 이미지에 대한 description, full_description을 업데이트 합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param parameters 요청 바디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    Observable<ServiceResponse<MessageResponse>> updateImageWithServiceResponseAsync(String registry, String imageName, UpdateRepositoryImageRequest parameters);

    /**
     * 레지스트리에 등록된 이미지를 삭제합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MessageResponse object if successful.
     */
    MessageResponse deleteImage(String registry, String imageName);

    /**
     * 레지스트리에 등록된 이미지를 삭제합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<MessageResponse> deleteImageAsync(String registry, String imageName, final ServiceCallback<MessageResponse> serviceCallback);

    /**
     * 레지스트리에 등록된 이미지를 삭제합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    Observable<MessageResponse> deleteImageAsync(String registry, String imageName);

    /**
     * 레지스트리에 등록된 이미지를 삭제합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    Observable<ServiceResponse<MessageResponse>> deleteImageWithServiceResponseAsync(String registry, String imageName);

    /**
     * 레지스트리의 이미지에 등록된 특정 Tag를 제거합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param reference 상세 정보를 조회할 태그 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MessageResponse object if successful.
     */
    MessageResponse deleteTagReference(String registry, String imageName, String reference);

    /**
     * 레지스트리의 이미지에 등록된 특정 Tag를 제거합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param reference 상세 정보를 조회할 태그 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<MessageResponse> deleteTagReferenceAsync(String registry, String imageName, String reference, final ServiceCallback<MessageResponse> serviceCallback);

    /**
     * 레지스트리의 이미지에 등록된 특정 Tag를 제거합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param reference 상세 정보를 조회할 태그 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    Observable<MessageResponse> deleteTagReferenceAsync(String registry, String imageName, String reference);

    /**
     * 레지스트리의 이미지에 등록된 특정 Tag를 제거합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param reference 상세 정보를 조회할 태그 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    Observable<ServiceResponse<MessageResponse>> deleteTagReferenceWithServiceResponseAsync(String registry, String imageName, String reference);

}
