/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.registry.implementation;

import retrofit2.Retrofit;
import com.fincloud.registry.ContainerRegistrys;
import com.fincloud.registry.models.MessageResponse;
import com.fincloud.registry.models.RepositoryGetListResponse;
import com.fincloud.registry.models.RepositoryImageDetailResponse;
import com.fincloud.registry.models.RepositoryImageListResponse;
import com.fincloud.registry.models.RepositoryRequest;
import com.fincloud.registry.models.UpdateRepositoryImageRequest;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ContainerRegistrys.
 */
public class ContainerRegistrysImpl implements ContainerRegistrys {
    /** The Retrofit service to perform REST calls. */
    private ContainerRegistrysService service;
    /** The service client containing this operation class. */
    private ContainerRegistryManagementClientImpl client;

    /**
     * Initializes an instance of ContainerRegistrys.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ContainerRegistrysImpl(Retrofit retrofit, ContainerRegistryManagementClientImpl client) {
        this.service = retrofit.create(ContainerRegistrysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ContainerRegistrys to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ContainerRegistrysService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.registry.ContainerRegistrys getList" })
        @GET("ncr/api/v2/repositories")
        Observable<Response<ResponseBody>> getList(@Query("page") Integer page, @Query("pagesize") Integer pagesize);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.registry.ContainerRegistrys getImageList" })
        @GET("ncr/api/v2/repositories/{registry}")
        Observable<Response<ResponseBody>> getImageList(@Path("registry") String registry, @Query("page") Integer page, @Query("pagesize") Integer pagesize);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.registry.ContainerRegistrys create" })
        @POST("ncr/api/v2/repositories/{registry}")
        Observable<Response<ResponseBody>> create(@Path("registry") String registry, @Body RepositoryRequest parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.registry.ContainerRegistrys delete" })
        @HTTP(path = "ncr/api/v2/repositories/{registry}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("registry") String registry);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.registry.ContainerRegistrys getImageDetail" })
        @GET("ncr/api/v2/repositories/{registry}/{imageName}")
        Observable<Response<ResponseBody>> getImageDetail(@Path("registry") String registry, @Path("imageName") String imageName);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.registry.ContainerRegistrys updateImage" })
        @PUT("ncr/api/v2/repositories/{registry}/{imageName}")
        Observable<Response<ResponseBody>> updateImage(@Path("registry") String registry, @Path("imageName") String imageName, @Body UpdateRepositoryImageRequest parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.registry.ContainerRegistrys deleteImage" })
        @HTTP(path = "ncr/api/v2/repositories/{registry}/{imageName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteImage(@Path("registry") String registry, @Path("imageName") String imageName);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.registry.ContainerRegistrys deleteTagReference" })
        @HTTP(path = "ncr/api/v2/repositories/{registry}/{imageName}/tags/{reference}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteTagReference(@Path("registry") String registry, @Path("imageName") String imageName, @Path("reference") String reference);

    }

    /**
     * Container Registry에 등록된 Registry 목록을 반환합니다.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getList() {
        return getListWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Container Registry에 등록된 Registry 목록을 반환합니다.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getListAsync(final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Container Registry에 등록된 Registry 목록을 반환합니다.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getListAsync() {
        return getListWithServiceResponseAsync().map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Container Registry에 등록된 Registry 목록을 반환합니다.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getListWithServiceResponseAsync() {
        final Integer page = null;
        final Integer pagesize = null;
        return service.getList(page, pagesize)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

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
    public Object getList(Integer page, Integer pagesize) {
        return getListWithServiceResponseAsync(page, pagesize).toBlocking().single().body();
    }

    /**
     * Container Registry에 등록된 Registry 목록을 반환합니다.
     *
     * @param page Start page number. It must be greater than zero.
     * @param pagesize Start
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getListAsync(Integer page, Integer pagesize, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getListWithServiceResponseAsync(page, pagesize), serviceCallback);
    }

    /**
     * Container Registry에 등록된 Registry 목록을 반환합니다.
     *
     * @param page Start page number. It must be greater than zero.
     * @param pagesize Start
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getListAsync(Integer page, Integer pagesize) {
        return getListWithServiceResponseAsync(page, pagesize).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * Container Registry에 등록된 Registry 목록을 반환합니다.
     *
     * @param page Start page number. It must be greater than zero.
     * @param pagesize Start
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getListWithServiceResponseAsync(Integer page, Integer pagesize) {
        return service.getList(page, pagesize)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getListDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RepositoryGetListResponse>() { }.getType())
                .register(400, new TypeToken<MessageResponse>() { }.getType())
                .register(401, new TypeToken<MessageResponse>() { }.getType())
                .register(403, new TypeToken<MessageResponse>() { }.getType())
                .register(500, new TypeToken<MessageResponse>() { }.getType())
                .build(response);
    }

    /**
     * 레지스트리 내 등록된 Image들의 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object getImageList(String registry) {
        return getImageListWithServiceResponseAsync(registry).toBlocking().single().body();
    }

    /**
     * 레지스트리 내 등록된 Image들의 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getImageListAsync(String registry, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getImageListWithServiceResponseAsync(registry), serviceCallback);
    }

    /**
     * 레지스트리 내 등록된 Image들의 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getImageListAsync(String registry) {
        return getImageListWithServiceResponseAsync(registry).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * 레지스트리 내 등록된 Image들의 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getImageListWithServiceResponseAsync(String registry) {
        if (registry == null) {
            throw new IllegalArgumentException("Parameter registry is required and cannot be null.");
        }
        final Integer page = null;
        final Integer pagesize = null;
        return service.getImageList(registry, page, pagesize)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getImageListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

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
    public Object getImageList(String registry, Integer page, Integer pagesize) {
        return getImageListWithServiceResponseAsync(registry, page, pagesize).toBlocking().single().body();
    }

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
    public ServiceFuture<Object> getImageListAsync(String registry, Integer page, Integer pagesize, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getImageListWithServiceResponseAsync(registry, page, pagesize), serviceCallback);
    }

    /**
     * 레지스트리 내 등록된 Image들의 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param page Start page number. It must be greater than zero.
     * @param pagesize Start
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getImageListAsync(String registry, Integer page, Integer pagesize) {
        return getImageListWithServiceResponseAsync(registry, page, pagesize).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * 레지스트리 내 등록된 Image들의 목록을 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param page Start page number. It must be greater than zero.
     * @param pagesize Start
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getImageListWithServiceResponseAsync(String registry, Integer page, Integer pagesize) {
        if (registry == null) {
            throw new IllegalArgumentException("Parameter registry is required and cannot be null.");
        }
        return service.getImageList(registry, page, pagesize)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getImageListDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getImageListDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RepositoryImageListResponse>() { }.getType())
                .register(400, new TypeToken<MessageResponse>() { }.getType())
                .register(401, new TypeToken<MessageResponse>() { }.getType())
                .register(403, new TypeToken<MessageResponse>() { }.getType())
                .register(404, new TypeToken<MessageResponse>() { }.getType())
                .register(500, new TypeToken<MessageResponse>() { }.getType())
                .build(response);
    }

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
    public MessageResponse create(String registry, String bucket) {
        return createWithServiceResponseAsync(registry, bucket).toBlocking().single().body();
    }

    /**
     * Object Storage의 Bucket과 연동된 Registry를 생성합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param bucket 생성될 레지스트리와 연동될 Object Storage의 Bucket 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MessageResponse> createAsync(String registry, String bucket, final ServiceCallback<MessageResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(registry, bucket), serviceCallback);
    }

    /**
     * Object Storage의 Bucket과 연동된 Registry를 생성합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param bucket 생성될 레지스트리와 연동될 Object Storage의 Bucket 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    public Observable<MessageResponse> createAsync(String registry, String bucket) {
        return createWithServiceResponseAsync(registry, bucket).map(new Func1<ServiceResponse<MessageResponse>, MessageResponse>() {
            @Override
            public MessageResponse call(ServiceResponse<MessageResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Object Storage의 Bucket과 연동된 Registry를 생성합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param bucket 생성될 레지스트리와 연동될 Object Storage의 Bucket 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    public Observable<ServiceResponse<MessageResponse>> createWithServiceResponseAsync(String registry, String bucket) {
        if (registry == null) {
            throw new IllegalArgumentException("Parameter registry is required and cannot be null.");
        }
        if (bucket == null) {
            throw new IllegalArgumentException("Parameter bucket is required and cannot be null.");
        }
        RepositoryRequest parameters = new RepositoryRequest();
        parameters.withBucket(bucket);
        return service.create(registry, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MessageResponse>>>() {
                @Override
                public Observable<ServiceResponse<MessageResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MessageResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MessageResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MessageResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(400, new TypeToken<MessageResponse>() { }.getType())
                .register(401, new TypeToken<MessageResponse>() { }.getType())
                .register(403, new TypeToken<MessageResponse>() { }.getType())
                .register(409, new TypeToken<MessageResponse>() { }.getType())
                .register(500, new TypeToken<MessageResponse>() { }.getType())
                .build(response);
    }

    /**
     * 특정 Registry를 삭제합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MessageResponse object if successful.
     */
    public MessageResponse delete(String registry) {
        return deleteWithServiceResponseAsync(registry).toBlocking().single().body();
    }

    /**
     * 특정 Registry를 삭제합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MessageResponse> deleteAsync(String registry, final ServiceCallback<MessageResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(registry), serviceCallback);
    }

    /**
     * 특정 Registry를 삭제합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    public Observable<MessageResponse> deleteAsync(String registry) {
        return deleteWithServiceResponseAsync(registry).map(new Func1<ServiceResponse<MessageResponse>, MessageResponse>() {
            @Override
            public MessageResponse call(ServiceResponse<MessageResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 특정 Registry를 삭제합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    public Observable<ServiceResponse<MessageResponse>> deleteWithServiceResponseAsync(String registry) {
        if (registry == null) {
            throw new IllegalArgumentException("Parameter registry is required and cannot be null.");
        }
        return service.delete(registry)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MessageResponse>>>() {
                @Override
                public Observable<ServiceResponse<MessageResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MessageResponse> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MessageResponse> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MessageResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .register(400, new TypeToken<MessageResponse>() { }.getType())
                .register(401, new TypeToken<MessageResponse>() { }.getType())
                .register(403, new TypeToken<MessageResponse>() { }.getType())
                .register(404, new TypeToken<MessageResponse>() { }.getType())
                .register(500, new TypeToken<MessageResponse>() { }.getType())
                .build(response);
    }

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
    public Object getImageDetail(String registry, String imageName) {
        return getImageDetailWithServiceResponseAsync(registry, imageName).toBlocking().single().body();
    }

    /**
     * 레지스트리 내 등록된 Image의 상세 정보를 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getImageDetailAsync(String registry, String imageName, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getImageDetailWithServiceResponseAsync(registry, imageName), serviceCallback);
    }

    /**
     * 레지스트리 내 등록된 Image의 상세 정보를 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getImageDetailAsync(String registry, String imageName) {
        return getImageDetailWithServiceResponseAsync(registry, imageName).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * 레지스트리 내 등록된 Image의 상세 정보를 반환합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getImageDetailWithServiceResponseAsync(String registry, String imageName) {
        if (registry == null) {
            throw new IllegalArgumentException("Parameter registry is required and cannot be null.");
        }
        if (imageName == null) {
            throw new IllegalArgumentException("Parameter imageName is required and cannot be null.");
        }
        return service.getImageDetail(registry, imageName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getImageDetailDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getImageDetailDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RepositoryImageDetailResponse>() { }.getType())
                .register(400, new TypeToken<MessageResponse>() { }.getType())
                .register(401, new TypeToken<MessageResponse>() { }.getType())
                .register(403, new TypeToken<MessageResponse>() { }.getType())
                .register(404, new TypeToken<MessageResponse>() { }.getType())
                .register(500, new TypeToken<MessageResponse>() { }.getType())
                .build(response);
    }

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
    public MessageResponse updateImage(String registry, String imageName, UpdateRepositoryImageRequest parameters) {
        return updateImageWithServiceResponseAsync(registry, imageName, parameters).toBlocking().single().body();
    }

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
    public ServiceFuture<MessageResponse> updateImageAsync(String registry, String imageName, UpdateRepositoryImageRequest parameters, final ServiceCallback<MessageResponse> serviceCallback) {
        return ServiceFuture.fromResponse(updateImageWithServiceResponseAsync(registry, imageName, parameters), serviceCallback);
    }

    /**
     * 레지스트리에 등록된 이미지에 대한 description, full_description을 업데이트 합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param parameters 요청 바디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    public Observable<MessageResponse> updateImageAsync(String registry, String imageName, UpdateRepositoryImageRequest parameters) {
        return updateImageWithServiceResponseAsync(registry, imageName, parameters).map(new Func1<ServiceResponse<MessageResponse>, MessageResponse>() {
            @Override
            public MessageResponse call(ServiceResponse<MessageResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 레지스트리에 등록된 이미지에 대한 description, full_description을 업데이트 합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param parameters 요청 바디
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    public Observable<ServiceResponse<MessageResponse>> updateImageWithServiceResponseAsync(String registry, String imageName, UpdateRepositoryImageRequest parameters) {
        if (registry == null) {
            throw new IllegalArgumentException("Parameter registry is required and cannot be null.");
        }
        if (imageName == null) {
            throw new IllegalArgumentException("Parameter imageName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.updateImage(registry, imageName, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MessageResponse>>>() {
                @Override
                public Observable<ServiceResponse<MessageResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MessageResponse> clientResponse = updateImageDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MessageResponse> updateImageDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MessageResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<MessageResponse>() { }.getType())
                .register(400, new TypeToken<MessageResponse>() { }.getType())
                .register(401, new TypeToken<MessageResponse>() { }.getType())
                .register(403, new TypeToken<MessageResponse>() { }.getType())
                .register(500, new TypeToken<MessageResponse>() { }.getType())
                .build(response);
    }

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
    public MessageResponse deleteImage(String registry, String imageName) {
        return deleteImageWithServiceResponseAsync(registry, imageName).toBlocking().single().body();
    }

    /**
     * 레지스트리에 등록된 이미지를 삭제합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MessageResponse> deleteImageAsync(String registry, String imageName, final ServiceCallback<MessageResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteImageWithServiceResponseAsync(registry, imageName), serviceCallback);
    }

    /**
     * 레지스트리에 등록된 이미지를 삭제합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    public Observable<MessageResponse> deleteImageAsync(String registry, String imageName) {
        return deleteImageWithServiceResponseAsync(registry, imageName).map(new Func1<ServiceResponse<MessageResponse>, MessageResponse>() {
            @Override
            public MessageResponse call(ServiceResponse<MessageResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 레지스트리에 등록된 이미지를 삭제합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    public Observable<ServiceResponse<MessageResponse>> deleteImageWithServiceResponseAsync(String registry, String imageName) {
        if (registry == null) {
            throw new IllegalArgumentException("Parameter registry is required and cannot be null.");
        }
        if (imageName == null) {
            throw new IllegalArgumentException("Parameter imageName is required and cannot be null.");
        }
        return service.deleteImage(registry, imageName)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MessageResponse>>>() {
                @Override
                public Observable<ServiceResponse<MessageResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MessageResponse> clientResponse = deleteImageDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MessageResponse> deleteImageDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MessageResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<MessageResponse>() { }.getType())
                .register(400, new TypeToken<MessageResponse>() { }.getType())
                .register(401, new TypeToken<MessageResponse>() { }.getType())
                .register(403, new TypeToken<MessageResponse>() { }.getType())
                .register(500, new TypeToken<MessageResponse>() { }.getType())
                .build(response);
    }

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
    public MessageResponse deleteTagReference(String registry, String imageName, String reference) {
        return deleteTagReferenceWithServiceResponseAsync(registry, imageName, reference).toBlocking().single().body();
    }

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
    public ServiceFuture<MessageResponse> deleteTagReferenceAsync(String registry, String imageName, String reference, final ServiceCallback<MessageResponse> serviceCallback) {
        return ServiceFuture.fromResponse(deleteTagReferenceWithServiceResponseAsync(registry, imageName, reference), serviceCallback);
    }

    /**
     * 레지스트리의 이미지에 등록된 특정 Tag를 제거합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param reference 상세 정보를 조회할 태그 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    public Observable<MessageResponse> deleteTagReferenceAsync(String registry, String imageName, String reference) {
        return deleteTagReferenceWithServiceResponseAsync(registry, imageName, reference).map(new Func1<ServiceResponse<MessageResponse>, MessageResponse>() {
            @Override
            public MessageResponse call(ServiceResponse<MessageResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 레지스트리의 이미지에 등록된 특정 Tag를 제거합니다.
     *
     * @param registry 이미지 목록을 조회할 레지스트리 이름
     * @param imageName 상세 정보 조회 대상 이미지 이름
     * @param reference 상세 정보를 조회할 태그 이름
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MessageResponse object
     */
    public Observable<ServiceResponse<MessageResponse>> deleteTagReferenceWithServiceResponseAsync(String registry, String imageName, String reference) {
        if (registry == null) {
            throw new IllegalArgumentException("Parameter registry is required and cannot be null.");
        }
        if (imageName == null) {
            throw new IllegalArgumentException("Parameter imageName is required and cannot be null.");
        }
        if (reference == null) {
            throw new IllegalArgumentException("Parameter reference is required and cannot be null.");
        }
        return service.deleteTagReference(registry, imageName, reference)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MessageResponse>>>() {
                @Override
                public Observable<ServiceResponse<MessageResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MessageResponse> clientResponse = deleteTagReferenceDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MessageResponse> deleteTagReferenceDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MessageResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<MessageResponse>() { }.getType())
                .register(400, new TypeToken<MessageResponse>() { }.getType())
                .register(401, new TypeToken<MessageResponse>() { }.getType())
                .register(403, new TypeToken<MessageResponse>() { }.getType())
                .register(500, new TypeToken<MessageResponse>() { }.getType())
                .build(response);
    }

}
