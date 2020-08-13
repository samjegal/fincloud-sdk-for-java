/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.registry;

import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ContainerRegistryImages.
 */
public interface ContainerRegistryImages {
    /**
     * 레지스트리의 이미지에 등록된 Tag 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getTagList(String registry, String imageName);

    /**
     * 레지스트리의 이미지에 등록된 Tag 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getTagListAsync(String registry, String imageName, final ServiceCallback<Object> serviceCallback);

    /**
     * 레지스트리의 이미지에 등록된 Tag 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getTagListAsync(String registry, String imageName);

    /**
     * 레지스트리의 이미지에 등록된 Tag 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getTagListWithServiceResponseAsync(String registry, String imageName);
    /**
     * 레지스트리의 이미지에 등록된 Tag 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param page Start page number. It must be greater than zero.
     * @param pagesize Start
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getTagList(String registry, String imageName, Integer page, Integer pagesize);

    /**
     * 레지스트리의 이미지에 등록된 Tag 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param page Start page number. It must be greater than zero.
     * @param pagesize Start
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getTagListAsync(String registry, String imageName, Integer page, Integer pagesize, final ServiceCallback<Object> serviceCallback);

    /**
     * 레지스트리의 이미지에 등록된 Tag 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param page Start page number. It must be greater than zero.
     * @param pagesize Start
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getTagListAsync(String registry, String imageName, Integer page, Integer pagesize);

    /**
     * 레지스트리의 이미지에 등록된 Tag 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param page Start page number. It must be greater than zero.
     * @param pagesize Start
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getTagListWithServiceResponseAsync(String registry, String imageName, Integer page, Integer pagesize);

    /**
     * 레지스트리의 이미지에 등록된 특정 Tag의 상세 정보를 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param reference 상세 정보를 조회할 태그 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object getTagReference(String registry, String imageName, String reference);

    /**
     * 레지스트리의 이미지에 등록된 특정 Tag의 상세 정보를 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param reference 상세 정보를 조회할 태그 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> getTagReferenceAsync(String registry, String imageName, String reference, final ServiceCallback<Object> serviceCallback);

    /**
     * 레지스트리의 이미지에 등록된 특정 Tag의 상세 정보를 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param reference 상세 정보를 조회할 태그 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> getTagReferenceAsync(String registry, String imageName, String reference);

    /**
     * 레지스트리의 이미지에 등록된 특정 Tag의 상세 정보를 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param reference 상세 정보를 조회할 태그 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> getTagReferenceWithServiceResponseAsync(String registry, String imageName, String reference);

}
