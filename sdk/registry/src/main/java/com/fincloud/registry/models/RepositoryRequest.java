/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.registry.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RepositoryRequest model.
 */
public class RepositoryRequest {
    /**
     * 생성될 레지스트리와 연동될 Object Storage의 Bucket 이름.
     */
    @JsonProperty(value = "bucket", required = true)
    private String bucket;

    /**
     * Get 생성될 레지스트리와 연동될 Object Storage의 Bucket 이름.
     *
     * @return the bucket value
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * Set 생성될 레지스트리와 연동될 Object Storage의 Bucket 이름.
     *
     * @param bucket the bucket value to set
     * @return the RepositoryRequest object itself.
     */
    public RepositoryRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

}
