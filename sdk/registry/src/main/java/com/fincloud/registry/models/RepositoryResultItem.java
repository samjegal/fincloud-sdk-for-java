/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.registry.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RepositoryResultItem model.
 */
public class RepositoryResultItem {
    /**
     * Registry 이름.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 이미지가 저장될 Object Storage의 Bucket 이름.
     */
    @JsonProperty(value = "bucket")
    private String bucket;

    /**
     * Registry에 접근 하기위해 docker client가 사용할 엔드포인트.
     */
    @JsonProperty(value = "end_point")
    private String endPoint;

    /**
     * Registry가 이용한 Object Storage의 크기.
     */
    @JsonProperty(value = "usage")
    private String usage;

    /**
     * Registry가 생성된 일시의 타임스탬프.
     */
    @JsonProperty(value = "created")
    private Double created;

    /**
     * 현재 Registry의 상태. Possible values include: 'running', 'disconnected'.
     */
    @JsonProperty(value = "status")
    private RepositoryStatus status;

    /**
     * Get registry 이름.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set registry 이름.
     *
     * @param name the name value to set
     * @return the RepositoryResultItem object itself.
     */
    public RepositoryResultItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get 이미지가 저장될 Object Storage의 Bucket 이름.
     *
     * @return the bucket value
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * Set 이미지가 저장될 Object Storage의 Bucket 이름.
     *
     * @param bucket the bucket value to set
     * @return the RepositoryResultItem object itself.
     */
    public RepositoryResultItem withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * Get registry에 접근 하기위해 docker client가 사용할 엔드포인트.
     *
     * @return the endPoint value
     */
    public String endPoint() {
        return this.endPoint;
    }

    /**
     * Set registry에 접근 하기위해 docker client가 사용할 엔드포인트.
     *
     * @param endPoint the endPoint value to set
     * @return the RepositoryResultItem object itself.
     */
    public RepositoryResultItem withEndPoint(String endPoint) {
        this.endPoint = endPoint;
        return this;
    }

    /**
     * Get registry가 이용한 Object Storage의 크기.
     *
     * @return the usage value
     */
    public String usage() {
        return this.usage;
    }

    /**
     * Set registry가 이용한 Object Storage의 크기.
     *
     * @param usage the usage value to set
     * @return the RepositoryResultItem object itself.
     */
    public RepositoryResultItem withUsage(String usage) {
        this.usage = usage;
        return this;
    }

    /**
     * Get registry가 생성된 일시의 타임스탬프.
     *
     * @return the created value
     */
    public Double created() {
        return this.created;
    }

    /**
     * Set registry가 생성된 일시의 타임스탬프.
     *
     * @param created the created value to set
     * @return the RepositoryResultItem object itself.
     */
    public RepositoryResultItem withCreated(Double created) {
        this.created = created;
        return this;
    }

    /**
     * Get 현재 Registry의 상태. Possible values include: 'running', 'disconnected'.
     *
     * @return the status value
     */
    public RepositoryStatus status() {
        return this.status;
    }

    /**
     * Set 현재 Registry의 상태. Possible values include: 'running', 'disconnected'.
     *
     * @param status the status value to set
     * @return the RepositoryResultItem object itself.
     */
    public RepositoryResultItem withStatus(RepositoryStatus status) {
        this.status = status;
        return this;
    }

}
