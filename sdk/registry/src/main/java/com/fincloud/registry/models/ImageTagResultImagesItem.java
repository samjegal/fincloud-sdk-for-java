/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.registry.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ImageTagResultImagesItem model.
 */
public class ImageTagResultImagesItem {
    /**
     * 이미지 사이즈.
     */
    @JsonProperty(value = "size")
    private Double size;

    /**
     * CPU 아키텍쳐.
     */
    @JsonProperty(value = "architecture")
    private String architecture;

    /**
     * 사용하지 않음.
     */
    @JsonProperty(value = "variant")
    private String variant;

    /**
     * 사용하지 않음.
     */
    @JsonProperty(value = "features")
    private String features;

    /**
     * 운영체제.
     */
    @JsonProperty(value = "os")
    private String os;

    /**
     * 사용하지 않음.
     */
    @JsonProperty(value = "os_version")
    private String osVersion;

    /**
     * 사용하지 않음.
     */
    @JsonProperty(value = "os_features")
    private String osFeatures;

    /**
     * 이미지 최초 생성일.
     */
    @JsonProperty(value = "created")
    private Double created;

    /**
     * Get 이미지 사이즈.
     *
     * @return the size value
     */
    public Double size() {
        return this.size;
    }

    /**
     * Set 이미지 사이즈.
     *
     * @param size the size value to set
     * @return the ImageTagResultImagesItem object itself.
     */
    public ImageTagResultImagesItem withSize(Double size) {
        this.size = size;
        return this;
    }

    /**
     * Get cPU 아키텍쳐.
     *
     * @return the architecture value
     */
    public String architecture() {
        return this.architecture;
    }

    /**
     * Set cPU 아키텍쳐.
     *
     * @param architecture the architecture value to set
     * @return the ImageTagResultImagesItem object itself.
     */
    public ImageTagResultImagesItem withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * Get 사용하지 않음.
     *
     * @return the variant value
     */
    public String variant() {
        return this.variant;
    }

    /**
     * Set 사용하지 않음.
     *
     * @param variant the variant value to set
     * @return the ImageTagResultImagesItem object itself.
     */
    public ImageTagResultImagesItem withVariant(String variant) {
        this.variant = variant;
        return this;
    }

    /**
     * Get 사용하지 않음.
     *
     * @return the features value
     */
    public String features() {
        return this.features;
    }

    /**
     * Set 사용하지 않음.
     *
     * @param features the features value to set
     * @return the ImageTagResultImagesItem object itself.
     */
    public ImageTagResultImagesItem withFeatures(String features) {
        this.features = features;
        return this;
    }

    /**
     * Get 운영체제.
     *
     * @return the os value
     */
    public String os() {
        return this.os;
    }

    /**
     * Set 운영체제.
     *
     * @param os the os value to set
     * @return the ImageTagResultImagesItem object itself.
     */
    public ImageTagResultImagesItem withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * Get 사용하지 않음.
     *
     * @return the osVersion value
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Set 사용하지 않음.
     *
     * @param osVersion the osVersion value to set
     * @return the ImageTagResultImagesItem object itself.
     */
    public ImageTagResultImagesItem withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * Get 사용하지 않음.
     *
     * @return the osFeatures value
     */
    public String osFeatures() {
        return this.osFeatures;
    }

    /**
     * Set 사용하지 않음.
     *
     * @param osFeatures the osFeatures value to set
     * @return the ImageTagResultImagesItem object itself.
     */
    public ImageTagResultImagesItem withOsFeatures(String osFeatures) {
        this.osFeatures = osFeatures;
        return this;
    }

    /**
     * Get 이미지 최초 생성일.
     *
     * @return the created value
     */
    public Double created() {
        return this.created;
    }

    /**
     * Set 이미지 최초 생성일.
     *
     * @param created the created value to set
     * @return the ImageTagResultImagesItem object itself.
     */
    public ImageTagResultImagesItem withCreated(Double created) {
        this.created = created;
        return this;
    }

}
