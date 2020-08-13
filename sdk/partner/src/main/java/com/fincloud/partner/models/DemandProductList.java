/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.partner.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DemandProductList model.
 */
public class DemandProductList {
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
     * 청구연월.
     */
    @JsonProperty(value = "demandYm")
    private String demandYm;

    /**
     * 청구 유형 크레딧 상품 코드.
     */
    @JsonProperty(value = "demandTypeCreditProductCode")
    private String demandTypeCreditProductCode;

    /**
     * 청구 유형 크레딧 상품 코드명.
     */
    @JsonProperty(value = "demandTypeCreditProductCodeName")
    private String demandTypeCreditProductCodeName;

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
     * 상품 할인 금액.
     */
    @JsonProperty(value = "productDiscountAmount")
    private String productDiscountAmount;

    /**
     * 크레딧 할인 금액.
     */
    @JsonProperty(value = "creditDiscountAmount")
    private String creditDiscountAmount;

    /**
     * 위약 금액.
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
     * @return the DemandProductList object itself.
     */
    public DemandProductList withPartnerMemberNo(String partnerMemberNo) {
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
     * @return the DemandProductList object itself.
     */
    public DemandProductList withPartnerMemberLoginId(String partnerMemberLoginId) {
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
     * @return the DemandProductList object itself.
     */
    public DemandProductList withPartnerMemberName(String partnerMemberName) {
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
     * @return the DemandProductList object itself.
     */
    public DemandProductList withMemberNo(String memberNo) {
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
     * @return the DemandProductList object itself.
     */
    public DemandProductList withLoginId(String loginId) {
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
     * @return the DemandProductList object itself.
     */
    public DemandProductList withMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    /**
     * Get 청구연월.
     *
     * @return the demandYm value
     */
    public String demandYm() {
        return this.demandYm;
    }

    /**
     * Set 청구연월.
     *
     * @param demandYm the demandYm value to set
     * @return the DemandProductList object itself.
     */
    public DemandProductList withDemandYm(String demandYm) {
        this.demandYm = demandYm;
        return this;
    }

    /**
     * Get 청구 유형 크레딧 상품 코드.
     *
     * @return the demandTypeCreditProductCode value
     */
    public String demandTypeCreditProductCode() {
        return this.demandTypeCreditProductCode;
    }

    /**
     * Set 청구 유형 크레딧 상품 코드.
     *
     * @param demandTypeCreditProductCode the demandTypeCreditProductCode value to set
     * @return the DemandProductList object itself.
     */
    public DemandProductList withDemandTypeCreditProductCode(String demandTypeCreditProductCode) {
        this.demandTypeCreditProductCode = demandTypeCreditProductCode;
        return this;
    }

    /**
     * Get 청구 유형 크레딧 상품 코드명.
     *
     * @return the demandTypeCreditProductCodeName value
     */
    public String demandTypeCreditProductCodeName() {
        return this.demandTypeCreditProductCodeName;
    }

    /**
     * Set 청구 유형 크레딧 상품 코드명.
     *
     * @param demandTypeCreditProductCodeName the demandTypeCreditProductCodeName value to set
     * @return the DemandProductList object itself.
     */
    public DemandProductList withDemandTypeCreditProductCodeName(String demandTypeCreditProductCodeName) {
        this.demandTypeCreditProductCodeName = demandTypeCreditProductCodeName;
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
     * @return the DemandProductList object itself.
     */
    public DemandProductList withPromiseDiscountAmount(String promiseDiscountAmount) {
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
     * @return the DemandProductList object itself.
     */
    public DemandProductList withPromotionDiscountAmount(String promotionDiscountAmount) {
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
     * @return the DemandProductList object itself.
     */
    public DemandProductList withEtcDiscountAmount(String etcDiscountAmount) {
        this.etcDiscountAmount = etcDiscountAmount;
        return this;
    }

    /**
     * Get 상품 할인 금액.
     *
     * @return the productDiscountAmount value
     */
    public String productDiscountAmount() {
        return this.productDiscountAmount;
    }

    /**
     * Set 상품 할인 금액.
     *
     * @param productDiscountAmount the productDiscountAmount value to set
     * @return the DemandProductList object itself.
     */
    public DemandProductList withProductDiscountAmount(String productDiscountAmount) {
        this.productDiscountAmount = productDiscountAmount;
        return this;
    }

    /**
     * Get 크레딧 할인 금액.
     *
     * @return the creditDiscountAmount value
     */
    public String creditDiscountAmount() {
        return this.creditDiscountAmount;
    }

    /**
     * Set 크레딧 할인 금액.
     *
     * @param creditDiscountAmount the creditDiscountAmount value to set
     * @return the DemandProductList object itself.
     */
    public DemandProductList withCreditDiscountAmount(String creditDiscountAmount) {
        this.creditDiscountAmount = creditDiscountAmount;
        return this;
    }

    /**
     * Get 위약 금액.
     *
     * @return the defaultAmount value
     */
    public String defaultAmount() {
        return this.defaultAmount;
    }

    /**
     * Set 위약 금액.
     *
     * @param defaultAmount the defaultAmount value to set
     * @return the DemandProductList object itself.
     */
    public DemandProductList withDefaultAmount(String defaultAmount) {
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
     * @return the DemandProductList object itself.
     */
    public DemandProductList withUseAmount(String useAmount) {
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
     * @return the DemandProductList object itself.
     */
    public DemandProductList withDemandAmount(String demandAmount) {
        this.demandAmount = demandAmount;
        return this;
    }

}
