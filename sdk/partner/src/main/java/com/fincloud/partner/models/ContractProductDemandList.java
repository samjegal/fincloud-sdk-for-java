/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.partner.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ContractProductDemandList model.
 */
public class ContractProductDemandList {
    /**
     * 파트너 회원번호 (오너).
     */
    @JsonProperty(value = "partnerMemberNo")
    private String partnerMemberNo;

    /**
     * 파트너 회원 로그인 아이디 (오너).
     */
    @JsonProperty(value = "partnerMemberLoginId")
    private String partnerMemberLoginId;

    /**
     * 파트너 회원명 (오너).
     */
    @JsonProperty(value = "partnerMemberName")
    private String partnerMemberName;

    /**
     * 파트너 회원번호 (멤버).
     */
    @JsonProperty(value = "memberNo")
    private String memberNo;

    /**
     * 파트너 회원 로그인 아이디 (멤버).
     */
    @JsonProperty(value = "loginId")
    private String loginId;

    /**
     * 파트너 회원명 (멤버).
     */
    @JsonProperty(value = "memberName")
    private String memberName;

    /**
     * 청구 연월.
     */
    @JsonProperty(value = "demandYm")
    private String demandYm;

    /**
     * 청구 유형 코드.
     */
    @JsonProperty(value = "demandTypeCode")
    private String demandTypeCode;

    /**
     * 청구 유형 코드명.
     */
    @JsonProperty(value = "demandTypeCodeName")
    private String demandTypeCodeName;

    /**
     * 청구 유형 상세코드.
     */
    @JsonProperty(value = "demandTypeDetailCode")
    private String demandTypeDetailCode;

    /**
     * 청구 유형 상세코드명.
     */
    @JsonProperty(value = "demandTypeDetailCodeName")
    private String demandTypeDetailCodeName;

    /**
     * 계약번호.
     */
    @JsonProperty(value = "contractNo")
    private String contractNo;

    /**
     * 계약상품 일련 번호.
     */
    @JsonProperty(value = "contractProductSequence")
    private String contractProductSequence;

    /**
     * 인스턴스 번호.
     */
    @JsonProperty(value = "instanceNo")
    private String instanceNo;

    /**
     * 상품가격 (정산기준).
     */
    @JsonProperty(value = "productPrice")
    private String productPrice;

    /**
     * 사용량.
     */
    @JsonProperty(value = "useQuantity")
    private String useQuantity;

    /**
     * 단위 사용량.
     */
    @JsonProperty(value = "unitUseQuantity")
    private String unitUseQuantity;

    /**
     * 무료 사용량.
     */
    @JsonProperty(value = "freeUseQuantity")
    private String freeUseQuantity;

    /**
     * 무료 단위 사용량.
     */
    @JsonProperty(value = "freeUnitUseQuantity")
    private String freeUnitUseQuantity;

    /**
     * 총 사용량.
     */
    @JsonProperty(value = "totalUseQuantity")
    private String totalUseQuantity;

    /**
     * 총 단위 사용량.
     */
    @JsonProperty(value = "totalUnitUseQuantity")
    private String totalUnitUseQuantity;

    /**
     * 약정 할인 금액.
     */
    @JsonProperty(value = "promiseDiscountAmount")
    private String promiseDiscountAmount;

    /**
     * 프로모션 할인 금액.
     */
    @JsonProperty(value = "promotionDiscountAmount")
    private String promotionDiscountAmount;

    /**
     * 기타 할인 금액.
     */
    @JsonProperty(value = "etcDiscountAmount")
    private String etcDiscountAmount;

    /**
     * 위약 할인 금액.
     */
    @JsonProperty(value = "defaultAmount")
    private String defaultAmount;

    /**
     * 사용 금액.
     */
    @JsonProperty(value = "useAmount")
    private String useAmount;

    /**
     * 청구 금액.
     */
    @JsonProperty(value = "demandAmount")
    private String demandAmount;

    /**
     * 리전 번호.
     */
    @JsonProperty(value = "regionNo")
    private String regionNo;

    /**
     * 리전 코드.
     */
    @JsonProperty(value = "regionCode")
    private String regionCode;

    /**
     * 리전명.
     */
    @JsonProperty(value = "regionName")
    private String regionName;

    /**
     * 단품 계약 구분 코드.
     */
    @JsonProperty(value = "singleProductContractTypeCode")
    private String singleProductContractTypeCode;

    /**
     * 단품 계약 구분 코드명.
     */
    @JsonProperty(value = "singleProductContractTypeCodeName")
    private String singleProductContractTypeCodeName;

    /**
     * 인스턴스명.
     */
    @JsonProperty(value = "instanceName")
    private String instanceName;

    /**
     * 계약 시작 일시.
     */
    @JsonProperty(value = "contractStatusCode")
    private String contractStatusCode;

    /**
     * 계약 종료 일시.
     */
    @JsonProperty(value = "contractStatusCodeName")
    private String contractStatusCodeName;

    /**
     * 플랫폼 유형 코드.
     */
    @JsonProperty(value = "platformTypeCode")
    private String platformTypeCode;

    /**
     * 계약 상태 코드.
     */
    @JsonProperty(value = "contractProductTypeCode")
    private String contractProductTypeCode;

    /**
     * 계약 상태 코드명.
     */
    @JsonProperty(value = "contractProductTypeCodeName")
    private String contractProductTypeCodeName;

    /**
     * 상품 코드.
     */
    @JsonProperty(value = "productCode")
    private String productCode;

    /**
     * 상품명.
     */
    @JsonProperty(value = "productName")
    private String productName;

    /**
     * 상품 설명.
     */
    @JsonProperty(value = "productDescription")
    private String productDescription;

    /**
     * 블록스토리지 사이즈.
     */
    @JsonProperty(value = "blockStorageSize")
    private String blockStorageSize;

    /**
     * 블록스토리지 용도 구분 코드.
     */
    @JsonProperty(value = "blockStorageUsageTypeCode")
    private String blockStorageUsageTypeCode;

    /**
     * 블록스토리지 용도 구분 코드명.
     */
    @JsonProperty(value = "blockStorageUsageTypeCodeName")
    private String blockStorageUsageTypeCodeName;

    /**
     * 상품수.
     */
    @JsonProperty(value = "productCount")
    private String productCount;

    /**
     * 서비스 시작 일시.
     */
    @JsonProperty(value = "serviceStatusCode")
    private String serviceStatusCode;

    /**
     * 서비스 종료 일시.
     */
    @JsonProperty(value = "serviceStatusCodeName")
    private String serviceStatusCodeName;

    /**
     * 상품 과금 유형 코드.
     */
    @JsonProperty(value = "productRatingTypeCode")
    private String productRatingTypeCode;

    /**
     * 상품 과금 유형 코드명.
     */
    @JsonProperty(value = "productRatingTypeCodeName")
    private String productRatingTypeCodeName;

    /**
     * 최종 계약 상품 여부.
     */
    @JsonProperty(value = "lastContractProductYn")
    private String lastContractProductYn;

    /**
     * 변경 유형 코드.
     */
    @JsonProperty(value = "changeTypeCode")
    private String changeTypeCode;

    /**
     * 변경 유형 코드명.
     */
    @JsonProperty(value = "changeTypeCodeName")
    private String changeTypeCodeName;

    /**
     * 상품 가격.
     */
    @JsonProperty(value = "feeSystemProductPrice")
    private String feeSystemProductPrice;

    /**
     * 정지 상품 가격.
     */
    @JsonProperty(value = "feeSystemBaseProductPrice")
    private String feeSystemBaseProductPrice;

    /**
     * 요금제 구분 코드.
     */
    @JsonProperty(value = "feeSystemTypeCode")
    private String feeSystemTypeCode;

    /**
     * 요금제 구분 코드명.
     */
    @JsonProperty(value = "feeSystemTypeCodeName")
    private String feeSystemTypeCodeName;

    /**
     * 단위 구분 코드.
     */
    @JsonProperty(value = "ratingUnitTypeCode")
    private String ratingUnitTypeCode;

    /**
     * 단위 구분 코드명.
     */
    @JsonProperty(value = "ratingUnitTypeCodeName")
    private String ratingUnitTypeCodeName;

    /**
     * Get 파트너 회원번호 (오너).
     *
     * @return the partnerMemberNo value
     */
    public String partnerMemberNo() {
        return this.partnerMemberNo;
    }

    /**
     * Set 파트너 회원번호 (오너).
     *
     * @param partnerMemberNo the partnerMemberNo value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withPartnerMemberNo(String partnerMemberNo) {
        this.partnerMemberNo = partnerMemberNo;
        return this;
    }

    /**
     * Get 파트너 회원 로그인 아이디 (오너).
     *
     * @return the partnerMemberLoginId value
     */
    public String partnerMemberLoginId() {
        return this.partnerMemberLoginId;
    }

    /**
     * Set 파트너 회원 로그인 아이디 (오너).
     *
     * @param partnerMemberLoginId the partnerMemberLoginId value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withPartnerMemberLoginId(String partnerMemberLoginId) {
        this.partnerMemberLoginId = partnerMemberLoginId;
        return this;
    }

    /**
     * Get 파트너 회원명 (오너).
     *
     * @return the partnerMemberName value
     */
    public String partnerMemberName() {
        return this.partnerMemberName;
    }

    /**
     * Set 파트너 회원명 (오너).
     *
     * @param partnerMemberName the partnerMemberName value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withPartnerMemberName(String partnerMemberName) {
        this.partnerMemberName = partnerMemberName;
        return this;
    }

    /**
     * Get 파트너 회원번호 (멤버).
     *
     * @return the memberNo value
     */
    public String memberNo() {
        return this.memberNo;
    }

    /**
     * Set 파트너 회원번호 (멤버).
     *
     * @param memberNo the memberNo value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withMemberNo(String memberNo) {
        this.memberNo = memberNo;
        return this;
    }

    /**
     * Get 파트너 회원 로그인 아이디 (멤버).
     *
     * @return the loginId value
     */
    public String loginId() {
        return this.loginId;
    }

    /**
     * Set 파트너 회원 로그인 아이디 (멤버).
     *
     * @param loginId the loginId value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withLoginId(String loginId) {
        this.loginId = loginId;
        return this;
    }

    /**
     * Get 파트너 회원명 (멤버).
     *
     * @return the memberName value
     */
    public String memberName() {
        return this.memberName;
    }

    /**
     * Set 파트너 회원명 (멤버).
     *
     * @param memberName the memberName value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    /**
     * Get 청구 연월.
     *
     * @return the demandYm value
     */
    public String demandYm() {
        return this.demandYm;
    }

    /**
     * Set 청구 연월.
     *
     * @param demandYm the demandYm value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withDemandYm(String demandYm) {
        this.demandYm = demandYm;
        return this;
    }

    /**
     * Get 청구 유형 코드.
     *
     * @return the demandTypeCode value
     */
    public String demandTypeCode() {
        return this.demandTypeCode;
    }

    /**
     * Set 청구 유형 코드.
     *
     * @param demandTypeCode the demandTypeCode value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withDemandTypeCode(String demandTypeCode) {
        this.demandTypeCode = demandTypeCode;
        return this;
    }

    /**
     * Get 청구 유형 코드명.
     *
     * @return the demandTypeCodeName value
     */
    public String demandTypeCodeName() {
        return this.demandTypeCodeName;
    }

    /**
     * Set 청구 유형 코드명.
     *
     * @param demandTypeCodeName the demandTypeCodeName value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withDemandTypeCodeName(String demandTypeCodeName) {
        this.demandTypeCodeName = demandTypeCodeName;
        return this;
    }

    /**
     * Get 청구 유형 상세코드.
     *
     * @return the demandTypeDetailCode value
     */
    public String demandTypeDetailCode() {
        return this.demandTypeDetailCode;
    }

    /**
     * Set 청구 유형 상세코드.
     *
     * @param demandTypeDetailCode the demandTypeDetailCode value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withDemandTypeDetailCode(String demandTypeDetailCode) {
        this.demandTypeDetailCode = demandTypeDetailCode;
        return this;
    }

    /**
     * Get 청구 유형 상세코드명.
     *
     * @return the demandTypeDetailCodeName value
     */
    public String demandTypeDetailCodeName() {
        return this.demandTypeDetailCodeName;
    }

    /**
     * Set 청구 유형 상세코드명.
     *
     * @param demandTypeDetailCodeName the demandTypeDetailCodeName value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withDemandTypeDetailCodeName(String demandTypeDetailCodeName) {
        this.demandTypeDetailCodeName = demandTypeDetailCodeName;
        return this;
    }

    /**
     * Get 계약번호.
     *
     * @return the contractNo value
     */
    public String contractNo() {
        return this.contractNo;
    }

    /**
     * Set 계약번호.
     *
     * @param contractNo the contractNo value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }

    /**
     * Get 계약상품 일련 번호.
     *
     * @return the contractProductSequence value
     */
    public String contractProductSequence() {
        return this.contractProductSequence;
    }

    /**
     * Set 계약상품 일련 번호.
     *
     * @param contractProductSequence the contractProductSequence value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withContractProductSequence(String contractProductSequence) {
        this.contractProductSequence = contractProductSequence;
        return this;
    }

    /**
     * Get 인스턴스 번호.
     *
     * @return the instanceNo value
     */
    public String instanceNo() {
        return this.instanceNo;
    }

    /**
     * Set 인스턴스 번호.
     *
     * @param instanceNo the instanceNo value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withInstanceNo(String instanceNo) {
        this.instanceNo = instanceNo;
        return this;
    }

    /**
     * Get 상품가격 (정산기준).
     *
     * @return the productPrice value
     */
    public String productPrice() {
        return this.productPrice;
    }

    /**
     * Set 상품가격 (정산기준).
     *
     * @param productPrice the productPrice value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withProductPrice(String productPrice) {
        this.productPrice = productPrice;
        return this;
    }

    /**
     * Get 사용량.
     *
     * @return the useQuantity value
     */
    public String useQuantity() {
        return this.useQuantity;
    }

    /**
     * Set 사용량.
     *
     * @param useQuantity the useQuantity value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withUseQuantity(String useQuantity) {
        this.useQuantity = useQuantity;
        return this;
    }

    /**
     * Get 단위 사용량.
     *
     * @return the unitUseQuantity value
     */
    public String unitUseQuantity() {
        return this.unitUseQuantity;
    }

    /**
     * Set 단위 사용량.
     *
     * @param unitUseQuantity the unitUseQuantity value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withUnitUseQuantity(String unitUseQuantity) {
        this.unitUseQuantity = unitUseQuantity;
        return this;
    }

    /**
     * Get 무료 사용량.
     *
     * @return the freeUseQuantity value
     */
    public String freeUseQuantity() {
        return this.freeUseQuantity;
    }

    /**
     * Set 무료 사용량.
     *
     * @param freeUseQuantity the freeUseQuantity value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withFreeUseQuantity(String freeUseQuantity) {
        this.freeUseQuantity = freeUseQuantity;
        return this;
    }

    /**
     * Get 무료 단위 사용량.
     *
     * @return the freeUnitUseQuantity value
     */
    public String freeUnitUseQuantity() {
        return this.freeUnitUseQuantity;
    }

    /**
     * Set 무료 단위 사용량.
     *
     * @param freeUnitUseQuantity the freeUnitUseQuantity value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withFreeUnitUseQuantity(String freeUnitUseQuantity) {
        this.freeUnitUseQuantity = freeUnitUseQuantity;
        return this;
    }

    /**
     * Get 총 사용량.
     *
     * @return the totalUseQuantity value
     */
    public String totalUseQuantity() {
        return this.totalUseQuantity;
    }

    /**
     * Set 총 사용량.
     *
     * @param totalUseQuantity the totalUseQuantity value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withTotalUseQuantity(String totalUseQuantity) {
        this.totalUseQuantity = totalUseQuantity;
        return this;
    }

    /**
     * Get 총 단위 사용량.
     *
     * @return the totalUnitUseQuantity value
     */
    public String totalUnitUseQuantity() {
        return this.totalUnitUseQuantity;
    }

    /**
     * Set 총 단위 사용량.
     *
     * @param totalUnitUseQuantity the totalUnitUseQuantity value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withTotalUnitUseQuantity(String totalUnitUseQuantity) {
        this.totalUnitUseQuantity = totalUnitUseQuantity;
        return this;
    }

    /**
     * Get 약정 할인 금액.
     *
     * @return the promiseDiscountAmount value
     */
    public String promiseDiscountAmount() {
        return this.promiseDiscountAmount;
    }

    /**
     * Set 약정 할인 금액.
     *
     * @param promiseDiscountAmount the promiseDiscountAmount value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withPromiseDiscountAmount(String promiseDiscountAmount) {
        this.promiseDiscountAmount = promiseDiscountAmount;
        return this;
    }

    /**
     * Get 프로모션 할인 금액.
     *
     * @return the promotionDiscountAmount value
     */
    public String promotionDiscountAmount() {
        return this.promotionDiscountAmount;
    }

    /**
     * Set 프로모션 할인 금액.
     *
     * @param promotionDiscountAmount the promotionDiscountAmount value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withPromotionDiscountAmount(String promotionDiscountAmount) {
        this.promotionDiscountAmount = promotionDiscountAmount;
        return this;
    }

    /**
     * Get 기타 할인 금액.
     *
     * @return the etcDiscountAmount value
     */
    public String etcDiscountAmount() {
        return this.etcDiscountAmount;
    }

    /**
     * Set 기타 할인 금액.
     *
     * @param etcDiscountAmount the etcDiscountAmount value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withEtcDiscountAmount(String etcDiscountAmount) {
        this.etcDiscountAmount = etcDiscountAmount;
        return this;
    }

    /**
     * Get 위약 할인 금액.
     *
     * @return the defaultAmount value
     */
    public String defaultAmount() {
        return this.defaultAmount;
    }

    /**
     * Set 위약 할인 금액.
     *
     * @param defaultAmount the defaultAmount value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withDefaultAmount(String defaultAmount) {
        this.defaultAmount = defaultAmount;
        return this;
    }

    /**
     * Get 사용 금액.
     *
     * @return the useAmount value
     */
    public String useAmount() {
        return this.useAmount;
    }

    /**
     * Set 사용 금액.
     *
     * @param useAmount the useAmount value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withUseAmount(String useAmount) {
        this.useAmount = useAmount;
        return this;
    }

    /**
     * Get 청구 금액.
     *
     * @return the demandAmount value
     */
    public String demandAmount() {
        return this.demandAmount;
    }

    /**
     * Set 청구 금액.
     *
     * @param demandAmount the demandAmount value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withDemandAmount(String demandAmount) {
        this.demandAmount = demandAmount;
        return this;
    }

    /**
     * Get 리전 번호.
     *
     * @return the regionNo value
     */
    public String regionNo() {
        return this.regionNo;
    }

    /**
     * Set 리전 번호.
     *
     * @param regionNo the regionNo value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }

    /**
     * Get 리전 코드.
     *
     * @return the regionCode value
     */
    public String regionCode() {
        return this.regionCode;
    }

    /**
     * Set 리전 코드.
     *
     * @param regionCode the regionCode value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * Get 리전명.
     *
     * @return the regionName value
     */
    public String regionName() {
        return this.regionName;
    }

    /**
     * Set 리전명.
     *
     * @param regionName the regionName value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * Get 단품 계약 구분 코드.
     *
     * @return the singleProductContractTypeCode value
     */
    public String singleProductContractTypeCode() {
        return this.singleProductContractTypeCode;
    }

    /**
     * Set 단품 계약 구분 코드.
     *
     * @param singleProductContractTypeCode the singleProductContractTypeCode value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withSingleProductContractTypeCode(String singleProductContractTypeCode) {
        this.singleProductContractTypeCode = singleProductContractTypeCode;
        return this;
    }

    /**
     * Get 단품 계약 구분 코드명.
     *
     * @return the singleProductContractTypeCodeName value
     */
    public String singleProductContractTypeCodeName() {
        return this.singleProductContractTypeCodeName;
    }

    /**
     * Set 단품 계약 구분 코드명.
     *
     * @param singleProductContractTypeCodeName the singleProductContractTypeCodeName value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withSingleProductContractTypeCodeName(String singleProductContractTypeCodeName) {
        this.singleProductContractTypeCodeName = singleProductContractTypeCodeName;
        return this;
    }

    /**
     * Get 인스턴스명.
     *
     * @return the instanceName value
     */
    public String instanceName() {
        return this.instanceName;
    }

    /**
     * Set 인스턴스명.
     *
     * @param instanceName the instanceName value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * Get 계약 시작 일시.
     *
     * @return the contractStatusCode value
     */
    public String contractStatusCode() {
        return this.contractStatusCode;
    }

    /**
     * Set 계약 시작 일시.
     *
     * @param contractStatusCode the contractStatusCode value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withContractStatusCode(String contractStatusCode) {
        this.contractStatusCode = contractStatusCode;
        return this;
    }

    /**
     * Get 계약 종료 일시.
     *
     * @return the contractStatusCodeName value
     */
    public String contractStatusCodeName() {
        return this.contractStatusCodeName;
    }

    /**
     * Set 계약 종료 일시.
     *
     * @param contractStatusCodeName the contractStatusCodeName value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withContractStatusCodeName(String contractStatusCodeName) {
        this.contractStatusCodeName = contractStatusCodeName;
        return this;
    }

    /**
     * Get 플랫폼 유형 코드.
     *
     * @return the platformTypeCode value
     */
    public String platformTypeCode() {
        return this.platformTypeCode;
    }

    /**
     * Set 플랫폼 유형 코드.
     *
     * @param platformTypeCode the platformTypeCode value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withPlatformTypeCode(String platformTypeCode) {
        this.platformTypeCode = platformTypeCode;
        return this;
    }

    /**
     * Get 계약 상태 코드.
     *
     * @return the contractProductTypeCode value
     */
    public String contractProductTypeCode() {
        return this.contractProductTypeCode;
    }

    /**
     * Set 계약 상태 코드.
     *
     * @param contractProductTypeCode the contractProductTypeCode value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withContractProductTypeCode(String contractProductTypeCode) {
        this.contractProductTypeCode = contractProductTypeCode;
        return this;
    }

    /**
     * Get 계약 상태 코드명.
     *
     * @return the contractProductTypeCodeName value
     */
    public String contractProductTypeCodeName() {
        return this.contractProductTypeCodeName;
    }

    /**
     * Set 계약 상태 코드명.
     *
     * @param contractProductTypeCodeName the contractProductTypeCodeName value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withContractProductTypeCodeName(String contractProductTypeCodeName) {
        this.contractProductTypeCodeName = contractProductTypeCodeName;
        return this;
    }

    /**
     * Get 상품 코드.
     *
     * @return the productCode value
     */
    public String productCode() {
        return this.productCode;
    }

    /**
     * Set 상품 코드.
     *
     * @param productCode the productCode value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    /**
     * Get 상품명.
     *
     * @return the productName value
     */
    public String productName() {
        return this.productName;
    }

    /**
     * Set 상품명.
     *
     * @param productName the productName value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * Get 상품 설명.
     *
     * @return the productDescription value
     */
    public String productDescription() {
        return this.productDescription;
    }

    /**
     * Set 상품 설명.
     *
     * @param productDescription the productDescription value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * Get 블록스토리지 사이즈.
     *
     * @return the blockStorageSize value
     */
    public String blockStorageSize() {
        return this.blockStorageSize;
    }

    /**
     * Set 블록스토리지 사이즈.
     *
     * @param blockStorageSize the blockStorageSize value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withBlockStorageSize(String blockStorageSize) {
        this.blockStorageSize = blockStorageSize;
        return this;
    }

    /**
     * Get 블록스토리지 용도 구분 코드.
     *
     * @return the blockStorageUsageTypeCode value
     */
    public String blockStorageUsageTypeCode() {
        return this.blockStorageUsageTypeCode;
    }

    /**
     * Set 블록스토리지 용도 구분 코드.
     *
     * @param blockStorageUsageTypeCode the blockStorageUsageTypeCode value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withBlockStorageUsageTypeCode(String blockStorageUsageTypeCode) {
        this.blockStorageUsageTypeCode = blockStorageUsageTypeCode;
        return this;
    }

    /**
     * Get 블록스토리지 용도 구분 코드명.
     *
     * @return the blockStorageUsageTypeCodeName value
     */
    public String blockStorageUsageTypeCodeName() {
        return this.blockStorageUsageTypeCodeName;
    }

    /**
     * Set 블록스토리지 용도 구분 코드명.
     *
     * @param blockStorageUsageTypeCodeName the blockStorageUsageTypeCodeName value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withBlockStorageUsageTypeCodeName(String blockStorageUsageTypeCodeName) {
        this.blockStorageUsageTypeCodeName = blockStorageUsageTypeCodeName;
        return this;
    }

    /**
     * Get 상품수.
     *
     * @return the productCount value
     */
    public String productCount() {
        return this.productCount;
    }

    /**
     * Set 상품수.
     *
     * @param productCount the productCount value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withProductCount(String productCount) {
        this.productCount = productCount;
        return this;
    }

    /**
     * Get 서비스 시작 일시.
     *
     * @return the serviceStatusCode value
     */
    public String serviceStatusCode() {
        return this.serviceStatusCode;
    }

    /**
     * Set 서비스 시작 일시.
     *
     * @param serviceStatusCode the serviceStatusCode value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withServiceStatusCode(String serviceStatusCode) {
        this.serviceStatusCode = serviceStatusCode;
        return this;
    }

    /**
     * Get 서비스 종료 일시.
     *
     * @return the serviceStatusCodeName value
     */
    public String serviceStatusCodeName() {
        return this.serviceStatusCodeName;
    }

    /**
     * Set 서비스 종료 일시.
     *
     * @param serviceStatusCodeName the serviceStatusCodeName value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withServiceStatusCodeName(String serviceStatusCodeName) {
        this.serviceStatusCodeName = serviceStatusCodeName;
        return this;
    }

    /**
     * Get 상품 과금 유형 코드.
     *
     * @return the productRatingTypeCode value
     */
    public String productRatingTypeCode() {
        return this.productRatingTypeCode;
    }

    /**
     * Set 상품 과금 유형 코드.
     *
     * @param productRatingTypeCode the productRatingTypeCode value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withProductRatingTypeCode(String productRatingTypeCode) {
        this.productRatingTypeCode = productRatingTypeCode;
        return this;
    }

    /**
     * Get 상품 과금 유형 코드명.
     *
     * @return the productRatingTypeCodeName value
     */
    public String productRatingTypeCodeName() {
        return this.productRatingTypeCodeName;
    }

    /**
     * Set 상품 과금 유형 코드명.
     *
     * @param productRatingTypeCodeName the productRatingTypeCodeName value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withProductRatingTypeCodeName(String productRatingTypeCodeName) {
        this.productRatingTypeCodeName = productRatingTypeCodeName;
        return this;
    }

    /**
     * Get 최종 계약 상품 여부.
     *
     * @return the lastContractProductYn value
     */
    public String lastContractProductYn() {
        return this.lastContractProductYn;
    }

    /**
     * Set 최종 계약 상품 여부.
     *
     * @param lastContractProductYn the lastContractProductYn value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withLastContractProductYn(String lastContractProductYn) {
        this.lastContractProductYn = lastContractProductYn;
        return this;
    }

    /**
     * Get 변경 유형 코드.
     *
     * @return the changeTypeCode value
     */
    public String changeTypeCode() {
        return this.changeTypeCode;
    }

    /**
     * Set 변경 유형 코드.
     *
     * @param changeTypeCode the changeTypeCode value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withChangeTypeCode(String changeTypeCode) {
        this.changeTypeCode = changeTypeCode;
        return this;
    }

    /**
     * Get 변경 유형 코드명.
     *
     * @return the changeTypeCodeName value
     */
    public String changeTypeCodeName() {
        return this.changeTypeCodeName;
    }

    /**
     * Set 변경 유형 코드명.
     *
     * @param changeTypeCodeName the changeTypeCodeName value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withChangeTypeCodeName(String changeTypeCodeName) {
        this.changeTypeCodeName = changeTypeCodeName;
        return this;
    }

    /**
     * Get 상품 가격.
     *
     * @return the feeSystemProductPrice value
     */
    public String feeSystemProductPrice() {
        return this.feeSystemProductPrice;
    }

    /**
     * Set 상품 가격.
     *
     * @param feeSystemProductPrice the feeSystemProductPrice value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withFeeSystemProductPrice(String feeSystemProductPrice) {
        this.feeSystemProductPrice = feeSystemProductPrice;
        return this;
    }

    /**
     * Get 정지 상품 가격.
     *
     * @return the feeSystemBaseProductPrice value
     */
    public String feeSystemBaseProductPrice() {
        return this.feeSystemBaseProductPrice;
    }

    /**
     * Set 정지 상품 가격.
     *
     * @param feeSystemBaseProductPrice the feeSystemBaseProductPrice value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withFeeSystemBaseProductPrice(String feeSystemBaseProductPrice) {
        this.feeSystemBaseProductPrice = feeSystemBaseProductPrice;
        return this;
    }

    /**
     * Get 요금제 구분 코드.
     *
     * @return the feeSystemTypeCode value
     */
    public String feeSystemTypeCode() {
        return this.feeSystemTypeCode;
    }

    /**
     * Set 요금제 구분 코드.
     *
     * @param feeSystemTypeCode the feeSystemTypeCode value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withFeeSystemTypeCode(String feeSystemTypeCode) {
        this.feeSystemTypeCode = feeSystemTypeCode;
        return this;
    }

    /**
     * Get 요금제 구분 코드명.
     *
     * @return the feeSystemTypeCodeName value
     */
    public String feeSystemTypeCodeName() {
        return this.feeSystemTypeCodeName;
    }

    /**
     * Set 요금제 구분 코드명.
     *
     * @param feeSystemTypeCodeName the feeSystemTypeCodeName value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withFeeSystemTypeCodeName(String feeSystemTypeCodeName) {
        this.feeSystemTypeCodeName = feeSystemTypeCodeName;
        return this;
    }

    /**
     * Get 단위 구분 코드.
     *
     * @return the ratingUnitTypeCode value
     */
    public String ratingUnitTypeCode() {
        return this.ratingUnitTypeCode;
    }

    /**
     * Set 단위 구분 코드.
     *
     * @param ratingUnitTypeCode the ratingUnitTypeCode value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withRatingUnitTypeCode(String ratingUnitTypeCode) {
        this.ratingUnitTypeCode = ratingUnitTypeCode;
        return this;
    }

    /**
     * Get 단위 구분 코드명.
     *
     * @return the ratingUnitTypeCodeName value
     */
    public String ratingUnitTypeCodeName() {
        return this.ratingUnitTypeCodeName;
    }

    /**
     * Set 단위 구분 코드명.
     *
     * @param ratingUnitTypeCodeName the ratingUnitTypeCodeName value to set
     * @return the ContractProductDemandList object itself.
     */
    public ContractProductDemandList withRatingUnitTypeCodeName(String ratingUnitTypeCodeName) {
        this.ratingUnitTypeCodeName = ratingUnitTypeCodeName;
        return this;
    }

}
