/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.registry.implementation;

import retrofit2.Retrofit;
import com.fincloud.registry.ContainerRegistryImages;
import com.fincloud.registry.models.MessageResponse;
import com.fincloud.registry.models.RepositoryImageTagListResponse;
import com.fincloud.registry.models.RepositoryImageTagReferenceResponse;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ContainerRegistryImages.
 */
public class ContainerRegistryImagesImpl implements ContainerRegistryImages {
    /** The Retrofit service to perform REST calls. */
    private ContainerRegistryImagesService service;
    /** The service client containing this operation class. */
    private ContainerRegistryManagementClientImpl client;

    /**
     * Initializes an instance of ContainerRegistryImages.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ContainerRegistryImagesImpl(Retrofit retrofit, ContainerRegistryManagementClientImpl client) {
        this.service = retrofit.create(ContainerRegistryImagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ContainerRegistryImages to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ContainerRegistryImagesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.registry.ContainerRegistryImages getTagList" })
        @GET("ncr/api/v2/repositories/{registry}/{imageName}/tags")
        Observable<Response<ResponseBody>> getTagList(@Path("registry") String registry, @Path("imageName") String imageName, @Query("page") Integer page, @Query("pagesize") Integer pagesize);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.registry.ContainerRegistryImages getTagReference" })
        @GET("ncr/api/v2/repositories/{registry}/{imageName}/tags/{reference}")
        Observable<Response<ResponseBody>> getTagReference(@Path("registry") String registry, @Path("imageName") String imageName, @Path("reference") String reference);

    }

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
    public Object getTagList(String registry, String imageName) {
        return getTagListWithServiceResponseAsync(registry, imageName).toBlocking().single().body();
    }

    /**
     * 레지스트리의 이미지에 등록된 Tag 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getTagListAsync(String registry, String imageName, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getTagListWithServiceResponseAsync(registry, imageName), serviceCallback);
    }

    /**
     * 레지스트리의 이미지에 등록된 Tag 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getTagListAsync(String registry, String imageName) {
        return getTagListWithServiceResponseAsync(registry, imageName).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * 레지스트리의 이미지에 등록된 Tag 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getTagListWithServiceResponseAsync(String registry, String imageName) {
        if (registry == null) {
            throw new IllegalArgumentException("Parameter registry is required and cannot be null.");
        }
        if (imageName == null) {
            throw new IllegalArgumentException("Parameter imageName is required and cannot be null.");
        }
        final Integer page = null;
        final Integer pagesize = null;
        return service.getTagList(registry, imageName, page, pagesize)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getTagListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

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
    public Object getTagList(String registry, String imageName, Integer page, Integer pagesize) {
        return getTagListWithServiceResponseAsync(registry, imageName, page, pagesize).toBlocking().single().body();
    }

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
    public ServiceFuture<Object> getTagListAsync(String registry, String imageName, Integer page, Integer pagesize, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getTagListWithServiceResponseAsync(registry, imageName, page, pagesize), serviceCallback);
    }

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
    public Observable<Object> getTagListAsync(String registry, String imageName, Integer page, Integer pagesize) {
        return getTagListWithServiceResponseAsync(registry, imageName, page, pagesize).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

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
    public Observable<ServiceResponse<Object>> getTagListWithServiceResponseAsync(String registry, String imageName, Integer page, Integer pagesize) {
        if (registry == null) {
            throw new IllegalArgumentException("Parameter registry is required and cannot be null.");
        }
        if (imageName == null) {
            throw new IllegalArgumentException("Parameter imageName is required and cannot be null.");
        }
        return service.getTagList(registry, imageName, page, pagesize)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getTagListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getTagListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RepositoryImageTagListResponse>() { }.getType())
                .register(400, new TypeToken<MessageResponse>() { }.getType())
                .register(401, new TypeToken<MessageResponse>() { }.getType())
                .register(403, new TypeToken<MessageResponse>() { }.getType())
                .register(500, new TypeToken<MessageResponse>() { }.getType())
                .build(response);
    }

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
    public Object getTagReference(String registry, String imageName, String reference) {
        return getTagReferenceWithServiceResponseAsync(registry, imageName, reference).toBlocking().single().body();
    }

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
    public ServiceFuture<Object> getTagReferenceAsync(String registry, String imageName, String reference, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getTagReferenceWithServiceResponseAsync(registry, imageName, reference), serviceCallback);
    }

    /**
     * 레지스트리의 이미지에 등록된 특정 Tag의 상세 정보를 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param reference 상세 정보를 조회할 태그 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getTagReferenceAsync(String registry, String imageName, String reference) {
        return getTagReferenceWithServiceResponseAsync(registry, imageName, reference).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * 레지스트리의 이미지에 등록된 특정 Tag의 상세 정보를 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param reference 상세 정보를 조회할 태그 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getTagReferenceWithServiceResponseAsync(String registry, String imageName, String reference) {
        if (registry == null) {
            throw new IllegalArgumentException("Parameter registry is required and cannot be null.");
        }
        if (imageName == null) {
            throw new IllegalArgumentException("Parameter imageName is required and cannot be null.");
        }
        if (reference == null) {
            throw new IllegalArgumentException("Parameter reference is required and cannot be null.");
        }
        return service.getTagReference(registry, imageName, reference)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getTagReferenceDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getTagReferenceDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RepositoryImageTagReferenceResponse>() { }.getType())
                .register(400, new TypeToken<MessageResponse>() { }.getType())
                .register(401, new TypeToken<MessageResponse>() { }.getType())
                .register(403, new TypeToken<MessageResponse>() { }.getType())
                .register(500, new TypeToken<MessageResponse>() { }.getType())
                .build(response);
    }

}
