/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.registry.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The UpdateRepositoryImageRequest model.
 */
public class UpdateRepositoryImageRequest {
    /**
     * 이미지에 대한 짧은 설명 작성.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * 이미지에 대한 상세 설명 작성.
     */
    @JsonProperty(value = "full_description")
    private String fullDescription;

    /**
     * Get 이미지에 대한 짧은 설명 작성.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set 이미지에 대한 짧은 설명 작성.
     *
     * @param description the description value to set
     * @return the UpdateRepositoryImageRequest object itself.
     */
    public UpdateRepositoryImageRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get 이미지에 대한 상세 설명 작성.
     *
     * @return the fullDescription value
     */
    public String fullDescription() {
        return this.fullDescription;
    }

    /**
     * Set 이미지에 대한 상세 설명 작성.
     *
     * @param fullDescription the fullDescription value to set
     * @return the UpdateRepositoryImageRequest object itself.
     */
    public UpdateRepositoryImageRequest withFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
        return this;
    }

}
