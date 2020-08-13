/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.registry.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RepositoryImageItem model.
 */
public class RepositoryImageItem {
    /**
     * 사용하지 않음.
     */
    @JsonProperty(value = "user")
    private String user;

    /**
     * 이미지 이름.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 레지스트리 이름.
     */
    @JsonProperty(value = "namespace")
    private String namespace;

    /**
     * 사용하지 않음.
     */
    @JsonProperty(value = "repository_type")
    private String repositoryType;

    /**
     * 사용하지 않음.
     */
    @JsonProperty(value = "status")
    private Double status;

    /**
     * 이미지에 대한 short description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * 사용하지 않음.
     */
    @JsonProperty(value = "is_private")
    private Boolean isPrivate;

    /**
     * 사용하지 않음.
     */
    @JsonProperty(value = "is_automated")
    private Boolean isAutomated;

    /**
     * 사용하지 않음.
     */
    @JsonProperty(value = "can_edit")
    private Boolean canEdit;

    /**
     * 사용하지 않음.
     */
    @JsonProperty(value = "star_count")
    private Double starCount;

    /**
     * 이미지에 대한 총 Pull count 값.
     */
    @JsonProperty(value = "pull_count")
    private Double pullCount;

    /**
     * 이미지의 최종 변경일.
     */
    @JsonProperty(value = "last_updated")
    private Double lastUpdated;

    /**
     * Get 사용하지 않음.
     *
     * @return the user value
     */
    public String user() {
        return this.user;
    }

    /**
     * Set 사용하지 않음.
     *
     * @param user the user value to set
     * @return the RepositoryImageItem object itself.
     */
    public RepositoryImageItem withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Get 이미지 이름.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set 이미지 이름.
     *
     * @param name the name value to set
     * @return the RepositoryImageItem object itself.
     */
    public RepositoryImageItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get 레지스트리 이름.
     *
     * @return the namespace value
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set 레지스트리 이름.
     *
     * @param namespace the namespace value to set
     * @return the RepositoryImageItem object itself.
     */
    public RepositoryImageItem withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get 사용하지 않음.
     *
     * @return the repositoryType value
     */
    public String repositoryType() {
        return this.repositoryType;
    }

    /**
     * Set 사용하지 않음.
     *
     * @param repositoryType the repositoryType value to set
     * @return the RepositoryImageItem object itself.
     */
    public RepositoryImageItem withRepositoryType(String repositoryType) {
        this.repositoryType = repositoryType;
        return this;
    }

    /**
     * Get 사용하지 않음.
     *
     * @return the status value
     */
    public Double status() {
        return this.status;
    }

    /**
     * Set 사용하지 않음.
     *
     * @param status the status value to set
     * @return the RepositoryImageItem object itself.
     */
    public RepositoryImageItem withStatus(Double status) {
        this.status = status;
        return this;
    }

    /**
     * Get 이미지에 대한 short description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set 이미지에 대한 short description.
     *
     * @param description the description value to set
     * @return the RepositoryImageItem object itself.
     */
    public RepositoryImageItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get 사용하지 않음.
     *
     * @return the isPrivate value
     */
    public Boolean isPrivate() {
        return this.isPrivate;
    }

    /**
     * Set 사용하지 않음.
     *
     * @param isPrivate the isPrivate value to set
     * @return the RepositoryImageItem object itself.
     */
    public RepositoryImageItem withIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }

    /**
     * Get 사용하지 않음.
     *
     * @return the isAutomated value
     */
    public Boolean isAutomated() {
        return this.isAutomated;
    }

    /**
     * Set 사용하지 않음.
     *
     * @param isAutomated the isAutomated value to set
     * @return the RepositoryImageItem object itself.
     */
    public RepositoryImageItem withIsAutomated(Boolean isAutomated) {
        this.isAutomated = isAutomated;
        return this;
    }

    /**
     * Get 사용하지 않음.
     *
     * @return the canEdit value
     */
    public Boolean canEdit() {
        return this.canEdit;
    }

    /**
     * Set 사용하지 않음.
     *
     * @param canEdit the canEdit value to set
     * @return the RepositoryImageItem object itself.
     */
    public RepositoryImageItem withCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }

    /**
     * Get 사용하지 않음.
     *
     * @return the starCount value
     */
    public Double starCount() {
        return this.starCount;
    }

    /**
     * Set 사용하지 않음.
     *
     * @param starCount the starCount value to set
     * @return the RepositoryImageItem object itself.
     */
    public RepositoryImageItem withStarCount(Double starCount) {
        this.starCount = starCount;
        return this;
    }

    /**
     * Get 이미지에 대한 총 Pull count 값.
     *
     * @return the pullCount value
     */
    public Double pullCount() {
        return this.pullCount;
    }

    /**
     * Set 이미지에 대한 총 Pull count 값.
     *
     * @param pullCount the pullCount value to set
     * @return the RepositoryImageItem object itself.
     */
    public RepositoryImageItem withPullCount(Double pullCount) {
        this.pullCount = pullCount;
        return this;
    }

    /**
     * Get 이미지의 최종 변경일.
     *
     * @return the lastUpdated value
     */
    public Double lastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Set 이미지의 최종 변경일.
     *
     * @param lastUpdated the lastUpdated value to set
     * @return the RepositoryImageItem object itself.
     */
    public RepositoryImageItem withLastUpdated(Double lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

}
