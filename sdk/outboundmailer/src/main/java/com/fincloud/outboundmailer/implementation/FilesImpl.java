/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.implementation;

import retrofit2.Retrofit;
import com.fincloud.outboundmailer.Files;
import com.fincloud.outboundmailer.models.ErrorResponse;
import com.fincloud.outboundmailer.models.FileUploadResponse;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.InputStream;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Multipart;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Files.
 */
public class FilesImpl implements Files {
    /** The Retrofit service to perform REST calls. */
    private FilesService service;
    /** The service client containing this operation class. */
    private CloudOutboundMailerManagementClientImpl client;

    /**
     * Initializes an instance of Files.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public FilesImpl(Retrofit retrofit, CloudOutboundMailerManagementClientImpl client) {
        this.service = retrofit.create(FilesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Files to be
     * used by Retrofit to perform actually REST calls.
     */
    interface FilesService {
        @Multipart
        @POST("files")
        Observable<Response<ResponseBody>> create(@Header("X-NCP-LANG") String xNCPLANG, @Part("fileList") RequestBody fileList);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.outboundmailer.Files get" })
        @GET("files/{tempRequestId}")
        Observable<Response<ResponseBody>> get(@Path("tempRequestId") String tempRequestId, @Header("X-NCP-LANG") String xNCPLANG);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.fincloud.outboundmailer.Files delete" })
        @HTTP(path = "files/{tempRequestId}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("tempRequestId") String tempRequestId, @Header("X-NCP-LANG") String xNCPLANG);

    }

    /**
     * 파일을 업로드 할 수 있는 기능을 제공.
     *
     * @param fileList 파일 업로드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FileUploadResponse object if successful.
     */
    public FileUploadResponse create(byte[] fileList) {
        return createWithServiceResponseAsync(fileList).toBlocking().single().body();
    }

    /**
     * 파일을 업로드 할 수 있는 기능을 제공.
     *
     * @param fileList 파일 업로드
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<FileUploadResponse> createAsync(byte[] fileList, final ServiceCallback<FileUploadResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(fileList), serviceCallback);
    }

    /**
     * 파일을 업로드 할 수 있는 기능을 제공.
     *
     * @param fileList 파일 업로드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FileUploadResponse object
     */
    public Observable<FileUploadResponse> createAsync(byte[] fileList) {
        return createWithServiceResponseAsync(fileList).map(new Func1<ServiceResponse<FileUploadResponse>, FileUploadResponse>() {
            @Override
            public FileUploadResponse call(ServiceResponse<FileUploadResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 파일을 업로드 할 수 있는 기능을 제공.
     *
     * @param fileList 파일 업로드
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FileUploadResponse object
     */
    public Observable<ServiceResponse<FileUploadResponse>> createWithServiceResponseAsync(byte[] fileList) {
        if (fileList == null) {
            throw new IllegalArgumentException("Parameter fileList is required and cannot be null.");
        }
        final String xNCPLANG = null;
        RequestBody fileListConverted = RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), fileList);
        return service.create(xNCPLANG, fileListConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<FileUploadResponse>>>() {
                @Override
                public Observable<ServiceResponse<FileUploadResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<FileUploadResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

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
    public FileUploadResponse create(byte[] fileList, String xNCPLANG) {
        return createWithServiceResponseAsync(fileList, xNCPLANG).toBlocking().single().body();
    }

    /**
     * 파일을 업로드 할 수 있는 기능을 제공.
     *
     * @param fileList 파일 업로드
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<FileUploadResponse> createAsync(byte[] fileList, String xNCPLANG, final ServiceCallback<FileUploadResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(fileList, xNCPLANG), serviceCallback);
    }

    /**
     * 파일을 업로드 할 수 있는 기능을 제공.
     *
     * @param fileList 파일 업로드
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FileUploadResponse object
     */
    public Observable<FileUploadResponse> createAsync(byte[] fileList, String xNCPLANG) {
        return createWithServiceResponseAsync(fileList, xNCPLANG).map(new Func1<ServiceResponse<FileUploadResponse>, FileUploadResponse>() {
            @Override
            public FileUploadResponse call(ServiceResponse<FileUploadResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 파일을 업로드 할 수 있는 기능을 제공.
     *
     * @param fileList 파일 업로드
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FileUploadResponse object
     */
    public Observable<ServiceResponse<FileUploadResponse>> createWithServiceResponseAsync(byte[] fileList, String xNCPLANG) {
        if (fileList == null) {
            throw new IllegalArgumentException("Parameter fileList is required and cannot be null.");
        }
        RequestBody fileListConverted = RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), fileList);
        return service.create(xNCPLANG, fileListConverted)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<FileUploadResponse>>>() {
                @Override
                public Observable<ServiceResponse<FileUploadResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<FileUploadResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<FileUploadResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<FileUploadResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<FileUploadResponse>() { }.getType())
                .build(response);
    }

    /**
     * 저장된 파일 조회.
     *
     * @param tempRequestId tempRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object get(String tempRequestId) {
        return getWithServiceResponseAsync(tempRequestId).toBlocking().single().body();
    }

    /**
     * 저장된 파일 조회.
     *
     * @param tempRequestId tempRequestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getAsync(String tempRequestId, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(tempRequestId), serviceCallback);
    }

    /**
     * 저장된 파일 조회.
     *
     * @param tempRequestId tempRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAsync(String tempRequestId) {
        return getWithServiceResponseAsync(tempRequestId).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * 저장된 파일 조회.
     *
     * @param tempRequestId tempRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getWithServiceResponseAsync(String tempRequestId) {
        if (tempRequestId == null) {
            throw new IllegalArgumentException("Parameter tempRequestId is required and cannot be null.");
        }
        final String xNCPLANG = null;
        return service.get(tempRequestId, xNCPLANG)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

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
    public Object get(String tempRequestId, String xNCPLANG) {
        return getWithServiceResponseAsync(tempRequestId, xNCPLANG).toBlocking().single().body();
    }

    /**
     * 저장된 파일 조회.
     *
     * @param tempRequestId tempRequestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> getAsync(String tempRequestId, String xNCPLANG, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(tempRequestId, xNCPLANG), serviceCallback);
    }

    /**
     * 저장된 파일 조회.
     *
     * @param tempRequestId tempRequestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> getAsync(String tempRequestId, String xNCPLANG) {
        return getWithServiceResponseAsync(tempRequestId, xNCPLANG).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * 저장된 파일 조회.
     *
     * @param tempRequestId tempRequestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> getWithServiceResponseAsync(String tempRequestId, String xNCPLANG) {
        if (tempRequestId == null) {
            throw new IllegalArgumentException("Parameter tempRequestId is required and cannot be null.");
        }
        return service.get(tempRequestId, xNCPLANG)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> getDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<FileUploadResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(403, new TypeToken<ErrorResponse>() { }.getType())
                .register(405, new TypeToken<ErrorResponse>() { }.getType())
                .register(415, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

    /**
     * 저장된 파일 삭제.
     *
     * @param tempRequestId tempRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    public Object delete(String tempRequestId) {
        return deleteWithServiceResponseAsync(tempRequestId).toBlocking().single().body();
    }

    /**
     * 저장된 파일 삭제.
     *
     * @param tempRequestId tempRequestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> deleteAsync(String tempRequestId, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(tempRequestId), serviceCallback);
    }

    /**
     * 저장된 파일 삭제.
     *
     * @param tempRequestId tempRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> deleteAsync(String tempRequestId) {
        return deleteWithServiceResponseAsync(tempRequestId).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * 저장된 파일 삭제.
     *
     * @param tempRequestId tempRequestId
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deleteWithServiceResponseAsync(String tempRequestId) {
        if (tempRequestId == null) {
            throw new IllegalArgumentException("Parameter tempRequestId is required and cannot be null.");
        }
        final String xNCPLANG = null;
        return service.delete(tempRequestId, xNCPLANG)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

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
    public Object delete(String tempRequestId, String xNCPLANG) {
        return deleteWithServiceResponseAsync(tempRequestId, xNCPLANG).toBlocking().single().body();
    }

    /**
     * 저장된 파일 삭제.
     *
     * @param tempRequestId tempRequestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Object> deleteAsync(String tempRequestId, String xNCPLANG, final ServiceCallback<Object> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(tempRequestId, xNCPLANG), serviceCallback);
    }

    /**
     * 저장된 파일 삭제.
     *
     * @param tempRequestId tempRequestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<Object> deleteAsync(String tempRequestId, String xNCPLANG) {
        return deleteWithServiceResponseAsync(tempRequestId, xNCPLANG).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.body();
            }
        });
    }

    /**
     * 저장된 파일 삭제.
     *
     * @param tempRequestId tempRequestId
     * @param xNCPLANG 언어 (ko-KR, en-US, zh-CN), default:en-US
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deleteWithServiceResponseAsync(String tempRequestId, String xNCPLANG) {
        if (tempRequestId == null) {
            throw new IllegalArgumentException("Parameter tempRequestId is required and cannot be null.");
        }
        return service.delete(tempRequestId, xNCPLANG)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> deleteDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Object, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<FileUploadResponse>() { }.getType())
                .register(400, new TypeToken<ErrorResponse>() { }.getType())
                .register(403, new TypeToken<ErrorResponse>() { }.getType())
                .register(405, new TypeToken<ErrorResponse>() { }.getType())
                .register(415, new TypeToken<ErrorResponse>() { }.getType())
                .register(500, new TypeToken<ErrorResponse>() { }.getType())
                .build(response);
    }

}
