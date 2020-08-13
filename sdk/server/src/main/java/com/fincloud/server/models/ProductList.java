/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ProductList model.
 */
public class ProductList {
    /**
     * 제품 코드.
     */
    @JsonProperty(value = "productCode")
    private String productCode;

    /**
     * 제품 이름.
     */
    @JsonProperty(value = "productName")
    private String productName;

    /**
     * 제품 타입.
     */
    @JsonProperty(value = "productType")
    private ProductType productType;

    /**
     * 제품 설명.
     */
    @JsonProperty(value = "productDescription")
    private String productDescription;

    /**
     * 인프라 리소스 타입.
     */
    @JsonProperty(value = "infraResourceType")
    private InfraResourceType infraResourceType;

    /**
     * CPU 코어 개수.
     */
    @JsonProperty(value = "cpuCount")
    private Double cpuCount;

    /**
     * 메모리 크기.
     */
    @JsonProperty(value = "memorySize")
    private Double memorySize;

    /**
     * 기본 블럭 스토리지 크기.
     */
    @JsonProperty(value = "baseBlockStorageSize")
    private Double baseBlockStorageSize;

    /**
     * 플랫폼 타입.
     */
    @JsonProperty(value = "platformType")
    private PlatformType platformType;

    /**
     * OS 정보.
     */
    @JsonProperty(value = "osInformation")
    private String osInformation;

    /**
     * 데이터베이스 종류 코드.
     */
    @JsonProperty(value = "dbKindCode")
    private String dbKindCode;

    /**
     * 추가 블럭 스토리지 크기.
     */
    @JsonProperty(value = "addBlockStorageSize")
    private Double addBlockStorageSize;

    /**
     * 생성 코드.
     */
    @JsonProperty(value = "generationCode")
    private String generationCode;

    /**
     * Get 제품 코드.
     *
     * @return the productCode value
     */
    public String productCode() {
        return this.productCode;
    }

    /**
     * Set 제품 코드.
     *
     * @param productCode the productCode value to set
     * @return the ProductList object itself.
     */
    public ProductList withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    /**
     * Get 제품 이름.
     *
     * @return the productName value
     */
    public String productName() {
        return this.productName;
    }

    /**
     * Set 제품 이름.
     *
     * @param productName the productName value to set
     * @return the ProductList object itself.
     */
    public ProductList withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * Get 제품 타입.
     *
     * @return the productType value
     */
    public ProductType productType() {
        return this.productType;
    }

    /**
     * Set 제품 타입.
     *
     * @param productType the productType value to set
     * @return the ProductList object itself.
     */
    public ProductList withProductType(ProductType productType) {
        this.productType = productType;
        return this;
    }

    /**
     * Get 제품 설명.
     *
     * @return the productDescription value
     */
    public String productDescription() {
        return this.productDescription;
    }

    /**
     * Set 제품 설명.
     *
     * @param productDescription the productDescription value to set
     * @return the ProductList object itself.
     */
    public ProductList withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * Get 인프라 리소스 타입.
     *
     * @return the infraResourceType value
     */
    public InfraResourceType infraResourceType() {
        return this.infraResourceType;
    }

    /**
     * Set 인프라 리소스 타입.
     *
     * @param infraResourceType the infraResourceType value to set
     * @return the ProductList object itself.
     */
    public ProductList withInfraResourceType(InfraResourceType infraResourceType) {
        this.infraResourceType = infraResourceType;
        return this;
    }

    /**
     * Get cPU 코어 개수.
     *
     * @return the cpuCount value
     */
    public Double cpuCount() {
        return this.cpuCount;
    }

    /**
     * Set cPU 코어 개수.
     *
     * @param cpuCount the cpuCount value to set
     * @return the ProductList object itself.
     */
    public ProductList withCpuCount(Double cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    /**
     * Get 메모리 크기.
     *
     * @return the memorySize value
     */
    public Double memorySize() {
        return this.memorySize;
    }

    /**
     * Set 메모리 크기.
     *
     * @param memorySize the memorySize value to set
     * @return the ProductList object itself.
     */
    public ProductList withMemorySize(Double memorySize) {
        this.memorySize = memorySize;
        return this;
    }

    /**
     * Get 기본 블럭 스토리지 크기.
     *
     * @return the baseBlockStorageSize value
     */
    public Double baseBlockStorageSize() {
        return this.baseBlockStorageSize;
    }

    /**
     * Set 기본 블럭 스토리지 크기.
     *
     * @param baseBlockStorageSize the baseBlockStorageSize value to set
     * @return the ProductList object itself.
     */
    public ProductList withBaseBlockStorageSize(Double baseBlockStorageSize) {
        this.baseBlockStorageSize = baseBlockStorageSize;
        return this;
    }

    /**
     * Get 플랫폼 타입.
     *
     * @return the platformType value
     */
    public PlatformType platformType() {
        return this.platformType;
    }

    /**
     * Set 플랫폼 타입.
     *
     * @param platformType the platformType value to set
     * @return the ProductList object itself.
     */
    public ProductList withPlatformType(PlatformType platformType) {
        this.platformType = platformType;
        return this;
    }

    /**
     * Get oS 정보.
     *
     * @return the osInformation value
     */
    public String osInformation() {
        return this.osInformation;
    }

    /**
     * Set oS 정보.
     *
     * @param osInformation the osInformation value to set
     * @return the ProductList object itself.
     */
    public ProductList withOsInformation(String osInformation) {
        this.osInformation = osInformation;
        return this;
    }

    /**
     * Get 데이터베이스 종류 코드.
     *
     * @return the dbKindCode value
     */
    public String dbKindCode() {
        return this.dbKindCode;
    }

    /**
     * Set 데이터베이스 종류 코드.
     *
     * @param dbKindCode the dbKindCode value to set
     * @return the ProductList object itself.
     */
    public ProductList withDbKindCode(String dbKindCode) {
        this.dbKindCode = dbKindCode;
        return this;
    }

    /**
     * Get 추가 블럭 스토리지 크기.
     *
     * @return the addBlockStorageSize value
     */
    public Double addBlockStorageSize() {
        return this.addBlockStorageSize;
    }

    /**
     * Set 추가 블럭 스토리지 크기.
     *
     * @param addBlockStorageSize the addBlockStorageSize value to set
     * @return the ProductList object itself.
     */
    public ProductList withAddBlockStorageSize(Double addBlockStorageSize) {
        this.addBlockStorageSize = addBlockStorageSize;
        return this;
    }

    /**
     * Get 생성 코드.
     *
     * @return the generationCode value
     */
    public String generationCode() {
        return this.generationCode;
    }

    /**
     * Set 생성 코드.
     *
     * @param generationCode the generationCode value to set
     * @return the ProductList object itself.
     */
    public ProductList withGenerationCode(String generationCode) {
        this.generationCode = generationCode;
        return this;
    }

}
