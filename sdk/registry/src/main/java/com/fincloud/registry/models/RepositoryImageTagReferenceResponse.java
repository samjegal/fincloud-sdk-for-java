/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.registry.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RepositoryImageTagReferenceResponse model.
 */
public class RepositoryImageTagReferenceResponse {
    /**
     * 이미지 태그 이름.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 이미지 태그 사이즈.
     */
    @JsonProperty(value = "full_size")
    private Double fullSize;

    /**
     * The images property.
     */
    @JsonProperty(value = "images")
    private List<ImageTagResultImagesItem> images;

    /**
     * 이미지 태그의 아이디.
     */
    @JsonProperty(value = "id")
    private Double id;

    /**
     * 레지스트리 아이디.
     */
    @JsonProperty(value = "repository")
    private Double repository;

    /**
     * 해당 태그의 이미지를 생성한 사람의 id.
     */
    @JsonProperty(value = "creator")
    private String creator;

    /**
     * 해당 태그의 이미지를 업데이트 한 사람 id.
     */
    @JsonProperty(value = "last_updater")
    private String lastUpdater;

    /**
     * 마지막 업데이트 일자.
     */
    @JsonProperty(value = "last_updated")
    private Double lastUpdated;

    /**
     * 해당 태그의 아이디.
     */
    @JsonProperty(value = "image_id")
    private Double imageId;

    /**
     * 이미지에 대한 v2 스펙 적용 유무.
     */
    @JsonProperty(value = "v2")
    private Boolean v2;

    /**
     * Get 이미지 태그 이름.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set 이미지 태그 이름.
     *
     * @param name the name value to set
     * @return the RepositoryImageTagReferenceResponse object itself.
     */
    public RepositoryImageTagReferenceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get 이미지 태그 사이즈.
     *
     * @return the fullSize value
     */
    public Double fullSize() {
        return this.fullSize;
    }

    /**
     * Set 이미지 태그 사이즈.
     *
     * @param fullSize the fullSize value to set
     * @return the RepositoryImageTagReferenceResponse object itself.
     */
    public RepositoryImageTagReferenceResponse withFullSize(Double fullSize) {
        this.fullSize = fullSize;
        return this;
    }

    /**
     * Get the images value.
     *
     * @return the images value
     */
    public List<ImageTagResultImagesItem> images() {
        return this.images;
    }

    /**
     * Set the images value.
     *
     * @param images the images value to set
     * @return the RepositoryImageTagReferenceResponse object itself.
     */
    public RepositoryImageTagReferenceResponse withImages(List<ImageTagResultImagesItem> images) {
        this.images = images;
        return this;
    }

    /**
     * Get 이미지 태그의 아이디.
     *
     * @return the id value
     */
    public Double id() {
        return this.id;
    }

    /**
     * Set 이미지 태그의 아이디.
     *
     * @param id the id value to set
     * @return the RepositoryImageTagReferenceResponse object itself.
     */
    public RepositoryImageTagReferenceResponse withId(Double id) {
        this.id = id;
        return this;
    }

    /**
     * Get 레지스트리 아이디.
     *
     * @return the repository value
     */
    public Double repository() {
        return this.repository;
    }

    /**
     * Set 레지스트리 아이디.
     *
     * @param repository the repository value to set
     * @return the RepositoryImageTagReferenceResponse object itself.
     */
    public RepositoryImageTagReferenceResponse withRepository(Double repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get 해당 태그의 이미지를 생성한 사람의 id.
     *
     * @return the creator value
     */
    public String creator() {
        return this.creator;
    }

    /**
     * Set 해당 태그의 이미지를 생성한 사람의 id.
     *
     * @param creator the creator value to set
     * @return the RepositoryImageTagReferenceResponse object itself.
     */
    public RepositoryImageTagReferenceResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * Get 해당 태그의 이미지를 업데이트 한 사람 id.
     *
     * @return the lastUpdater value
     */
    public String lastUpdater() {
        return this.lastUpdater;
    }

    /**
     * Set 해당 태그의 이미지를 업데이트 한 사람 id.
     *
     * @param lastUpdater the lastUpdater value to set
     * @return the RepositoryImageTagReferenceResponse object itself.
     */
    public RepositoryImageTagReferenceResponse withLastUpdater(String lastUpdater) {
        this.lastUpdater = lastUpdater;
        return this;
    }

    /**
     * Get 마지막 업데이트 일자.
     *
     * @return the lastUpdated value
     */
    public Double lastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Set 마지막 업데이트 일자.
     *
     * @param lastUpdated the lastUpdated value to set
     * @return the RepositoryImageTagReferenceResponse object itself.
     */
    public RepositoryImageTagReferenceResponse withLastUpdated(Double lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * Get 해당 태그의 아이디.
     *
     * @return the imageId value
     */
    public Double imageId() {
        return this.imageId;
    }

    /**
     * Set 해당 태그의 아이디.
     *
     * @param imageId the imageId value to set
     * @return the RepositoryImageTagReferenceResponse object itself.
     */
    public RepositoryImageTagReferenceResponse withImageId(Double imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * Get 이미지에 대한 v2 스펙 적용 유무.
     *
     * @return the v2 value
     */
    public Boolean v2() {
        return this.v2;
    }

    /**
     * Set 이미지에 대한 v2 스펙 적용 유무.
     *
     * @param v2 the v2 value to set
     * @return the RepositoryImageTagReferenceResponse object itself.
     */
    public RepositoryImageTagReferenceResponse withV2(Boolean v2) {
        this.v2 = v2;
        return this;
    }

}
