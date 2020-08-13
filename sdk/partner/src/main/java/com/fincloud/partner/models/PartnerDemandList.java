/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.partner.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PartnerDemandList model.
 */
public class PartnerDemandList {
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
     * 파트너 회원번호 (오너).
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
     * 청구년월.
     */
    @JsonProperty(value = "demandYm")
    private String demandYm;

    /**
     * 총 사용금액.
     */
    @JsonProperty(value = "totalUseAmount")
    private String totalUseAmount;

    /**
     * 총 약정 할인 금액.
     */
    @JsonProperty(value = "totalPromiseDiscountAmount")
    private String totalPromiseDiscountAmount;

    /**
     * 총 프로모션 할인 금액.
     */
    @JsonProperty(value = "totalPromotionDiscountAmount")
    private String totalPromotionDiscountAmount;

    /**
     * 총 기타 할인 금액.
     */
    @JsonProperty(value = "totalEtcDiscountAmount")
    private String totalEtcDiscountAmount;

    /**
     * 총 고객 할인 금액.
     */
    @JsonProperty(value = "totalCustomerDiscountAmount")
    private String totalCustomerDiscountAmount;

    /**
     * 총 상품 할인 금액.
     */
    @JsonProperty(value = "totalProductDiscountAmount")
    private String totalProductDiscountAmount;

    /**
     * 총 크레딧 할인 금액.
     */
    @JsonProperty(value = "totalCreditDiscountAmount")
    private String totalCreditDiscountAmount;

    /**
     * 1000원 미만 할인 금액.
     */
    @JsonProperty(value = "under1000DiscountAmount")
    private String under1000DiscountAmount;

    /**
     * 100원 미만 할인 금액.
     */
    @JsonProperty(value = "under100DiscountAmount")
    private String under100DiscountAmount;

    /**
     * 총 위약 금액.
     */
    @JsonProperty(value = "totalDefaultAmount")
    private String totalDefaultAmount;

    /**
     * 총 청구 금액.
     */
    @JsonProperty(value = "totalDemandAmount")
    private String totalDemandAmount;

    /**
     * 총 커미션 예외 상품 사용 금액.
     */
    @JsonProperty(value = "totalCommissionExceptionProductUseAmount")
    private String totalCommissionExceptionProductUseAmount;

    /**
     * 총 예외 상품 커미션 금액.
     */
    @JsonProperty(value = "totalExceptionProductCommissionAmount")
    private String totalExceptionProductCommissionAmount;

    /**
     * 커미션 비율.
     */
    @JsonProperty(value = "commissionRatio")
    private String commissionRatio;

    /**
     * 커미션 금액.
     */
    @JsonProperty(value = "commissionAmount")
    private String commissionAmount;

    /**
     * 인센티브 금액.
     */
    @JsonProperty(value = "incentiveAmount")
    private String incentiveAmount;

    /**
     * 파트너 할인 금액.
     */
    @JsonProperty(value = "partnerDiscountAmount")
    private String partnerDiscountAmount;

    /**
     * 파트너 비용 금액.
     */
    @JsonProperty(value = "partnerCostAmount")
    private String partnerCostAmount;

    /**
     * 파트너 고객 할인 금액.
     */
    @JsonProperty(value = "partnerCustomerDiscountAmount")
    private String partnerCustomerDiscountAmount;

    /**
     * 파트너 고객 매출 금액.
     */
    @JsonProperty(value = "partnerCustomerSellingAmount")
    private String partnerCustomerSellingAmount;

    /**
     * 파트너 총 매출 금액.
     */
    @JsonProperty(value = "partnerTotalSellingAmount")
    private String partnerTotalSellingAmount;

    /**
     * 파트너 차익 금액 (손익 금액).
     */
    @JsonProperty(value = "partnerMarginalProfitAmount")
    private String partnerMarginalProfitAmount;

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
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withPartnerMemberNo(String partnerMemberNo) {
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
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withPartnerMemberLoginId(String partnerMemberLoginId) {
        this.partnerMemberLoginId = partnerMemberLoginId;
        return this;
    }

    /**
     * Get 파트너 회원번호 (오너).
     *
     * @return the partnerMemberName value
     */
    public String partnerMemberName() {
        return this.partnerMemberName;
    }

    /**
     * Set 파트너 회원번호 (오너).
     *
     * @param partnerMemberName the partnerMemberName value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withPartnerMemberName(String partnerMemberName) {
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
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withMemberNo(String memberNo) {
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
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withLoginId(String loginId) {
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
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    /**
     * Get 청구년월.
     *
     * @return the demandYm value
     */
    public String demandYm() {
        return this.demandYm;
    }

    /**
     * Set 청구년월.
     *
     * @param demandYm the demandYm value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withDemandYm(String demandYm) {
        this.demandYm = demandYm;
        return this;
    }

    /**
     * Get 총 사용금액.
     *
     * @return the totalUseAmount value
     */
    public String totalUseAmount() {
        return this.totalUseAmount;
    }

    /**
     * Set 총 사용금액.
     *
     * @param totalUseAmount the totalUseAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withTotalUseAmount(String totalUseAmount) {
        this.totalUseAmount = totalUseAmount;
        return this;
    }

    /**
     * Get 총 약정 할인 금액.
     *
     * @return the totalPromiseDiscountAmount value
     */
    public String totalPromiseDiscountAmount() {
        return this.totalPromiseDiscountAmount;
    }

    /**
     * Set 총 약정 할인 금액.
     *
     * @param totalPromiseDiscountAmount the totalPromiseDiscountAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withTotalPromiseDiscountAmount(String totalPromiseDiscountAmount) {
        this.totalPromiseDiscountAmount = totalPromiseDiscountAmount;
        return this;
    }

    /**
     * Get 총 프로모션 할인 금액.
     *
     * @return the totalPromotionDiscountAmount value
     */
    public String totalPromotionDiscountAmount() {
        return this.totalPromotionDiscountAmount;
    }

    /**
     * Set 총 프로모션 할인 금액.
     *
     * @param totalPromotionDiscountAmount the totalPromotionDiscountAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withTotalPromotionDiscountAmount(String totalPromotionDiscountAmount) {
        this.totalPromotionDiscountAmount = totalPromotionDiscountAmount;
        return this;
    }

    /**
     * Get 총 기타 할인 금액.
     *
     * @return the totalEtcDiscountAmount value
     */
    public String totalEtcDiscountAmount() {
        return this.totalEtcDiscountAmount;
    }

    /**
     * Set 총 기타 할인 금액.
     *
     * @param totalEtcDiscountAmount the totalEtcDiscountAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withTotalEtcDiscountAmount(String totalEtcDiscountAmount) {
        this.totalEtcDiscountAmount = totalEtcDiscountAmount;
        return this;
    }

    /**
     * Get 총 고객 할인 금액.
     *
     * @return the totalCustomerDiscountAmount value
     */
    public String totalCustomerDiscountAmount() {
        return this.totalCustomerDiscountAmount;
    }

    /**
     * Set 총 고객 할인 금액.
     *
     * @param totalCustomerDiscountAmount the totalCustomerDiscountAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withTotalCustomerDiscountAmount(String totalCustomerDiscountAmount) {
        this.totalCustomerDiscountAmount = totalCustomerDiscountAmount;
        return this;
    }

    /**
     * Get 총 상품 할인 금액.
     *
     * @return the totalProductDiscountAmount value
     */
    public String totalProductDiscountAmount() {
        return this.totalProductDiscountAmount;
    }

    /**
     * Set 총 상품 할인 금액.
     *
     * @param totalProductDiscountAmount the totalProductDiscountAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withTotalProductDiscountAmount(String totalProductDiscountAmount) {
        this.totalProductDiscountAmount = totalProductDiscountAmount;
        return this;
    }

    /**
     * Get 총 크레딧 할인 금액.
     *
     * @return the totalCreditDiscountAmount value
     */
    public String totalCreditDiscountAmount() {
        return this.totalCreditDiscountAmount;
    }

    /**
     * Set 총 크레딧 할인 금액.
     *
     * @param totalCreditDiscountAmount the totalCreditDiscountAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withTotalCreditDiscountAmount(String totalCreditDiscountAmount) {
        this.totalCreditDiscountAmount = totalCreditDiscountAmount;
        return this;
    }

    /**
     * Get 1000원 미만 할인 금액.
     *
     * @return the under1000DiscountAmount value
     */
    public String under1000DiscountAmount() {
        return this.under1000DiscountAmount;
    }

    /**
     * Set 1000원 미만 할인 금액.
     *
     * @param under1000DiscountAmount the under1000DiscountAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withUnder1000DiscountAmount(String under1000DiscountAmount) {
        this.under1000DiscountAmount = under1000DiscountAmount;
        return this;
    }

    /**
     * Get 100원 미만 할인 금액.
     *
     * @return the under100DiscountAmount value
     */
    public String under100DiscountAmount() {
        return this.under100DiscountAmount;
    }

    /**
     * Set 100원 미만 할인 금액.
     *
     * @param under100DiscountAmount the under100DiscountAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withUnder100DiscountAmount(String under100DiscountAmount) {
        this.under100DiscountAmount = under100DiscountAmount;
        return this;
    }

    /**
     * Get 총 위약 금액.
     *
     * @return the totalDefaultAmount value
     */
    public String totalDefaultAmount() {
        return this.totalDefaultAmount;
    }

    /**
     * Set 총 위약 금액.
     *
     * @param totalDefaultAmount the totalDefaultAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withTotalDefaultAmount(String totalDefaultAmount) {
        this.totalDefaultAmount = totalDefaultAmount;
        return this;
    }

    /**
     * Get 총 청구 금액.
     *
     * @return the totalDemandAmount value
     */
    public String totalDemandAmount() {
        return this.totalDemandAmount;
    }

    /**
     * Set 총 청구 금액.
     *
     * @param totalDemandAmount the totalDemandAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withTotalDemandAmount(String totalDemandAmount) {
        this.totalDemandAmount = totalDemandAmount;
        return this;
    }

    /**
     * Get 총 커미션 예외 상품 사용 금액.
     *
     * @return the totalCommissionExceptionProductUseAmount value
     */
    public String totalCommissionExceptionProductUseAmount() {
        return this.totalCommissionExceptionProductUseAmount;
    }

    /**
     * Set 총 커미션 예외 상품 사용 금액.
     *
     * @param totalCommissionExceptionProductUseAmount the totalCommissionExceptionProductUseAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withTotalCommissionExceptionProductUseAmount(String totalCommissionExceptionProductUseAmount) {
        this.totalCommissionExceptionProductUseAmount = totalCommissionExceptionProductUseAmount;
        return this;
    }

    /**
     * Get 총 예외 상품 커미션 금액.
     *
     * @return the totalExceptionProductCommissionAmount value
     */
    public String totalExceptionProductCommissionAmount() {
        return this.totalExceptionProductCommissionAmount;
    }

    /**
     * Set 총 예외 상품 커미션 금액.
     *
     * @param totalExceptionProductCommissionAmount the totalExceptionProductCommissionAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withTotalExceptionProductCommissionAmount(String totalExceptionProductCommissionAmount) {
        this.totalExceptionProductCommissionAmount = totalExceptionProductCommissionAmount;
        return this;
    }

    /**
     * Get 커미션 비율.
     *
     * @return the commissionRatio value
     */
    public String commissionRatio() {
        return this.commissionRatio;
    }

    /**
     * Set 커미션 비율.
     *
     * @param commissionRatio the commissionRatio value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withCommissionRatio(String commissionRatio) {
        this.commissionRatio = commissionRatio;
        return this;
    }

    /**
     * Get 커미션 금액.
     *
     * @return the commissionAmount value
     */
    public String commissionAmount() {
        return this.commissionAmount;
    }

    /**
     * Set 커미션 금액.
     *
     * @param commissionAmount the commissionAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withCommissionAmount(String commissionAmount) {
        this.commissionAmount = commissionAmount;
        return this;
    }

    /**
     * Get 인센티브 금액.
     *
     * @return the incentiveAmount value
     */
    public String incentiveAmount() {
        return this.incentiveAmount;
    }

    /**
     * Set 인센티브 금액.
     *
     * @param incentiveAmount the incentiveAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withIncentiveAmount(String incentiveAmount) {
        this.incentiveAmount = incentiveAmount;
        return this;
    }

    /**
     * Get 파트너 할인 금액.
     *
     * @return the partnerDiscountAmount value
     */
    public String partnerDiscountAmount() {
        return this.partnerDiscountAmount;
    }

    /**
     * Set 파트너 할인 금액.
     *
     * @param partnerDiscountAmount the partnerDiscountAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withPartnerDiscountAmount(String partnerDiscountAmount) {
        this.partnerDiscountAmount = partnerDiscountAmount;
        return this;
    }

    /**
     * Get 파트너 비용 금액.
     *
     * @return the partnerCostAmount value
     */
    public String partnerCostAmount() {
        return this.partnerCostAmount;
    }

    /**
     * Set 파트너 비용 금액.
     *
     * @param partnerCostAmount the partnerCostAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withPartnerCostAmount(String partnerCostAmount) {
        this.partnerCostAmount = partnerCostAmount;
        return this;
    }

    /**
     * Get 파트너 고객 할인 금액.
     *
     * @return the partnerCustomerDiscountAmount value
     */
    public String partnerCustomerDiscountAmount() {
        return this.partnerCustomerDiscountAmount;
    }

    /**
     * Set 파트너 고객 할인 금액.
     *
     * @param partnerCustomerDiscountAmount the partnerCustomerDiscountAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withPartnerCustomerDiscountAmount(String partnerCustomerDiscountAmount) {
        this.partnerCustomerDiscountAmount = partnerCustomerDiscountAmount;
        return this;
    }

    /**
     * Get 파트너 고객 매출 금액.
     *
     * @return the partnerCustomerSellingAmount value
     */
    public String partnerCustomerSellingAmount() {
        return this.partnerCustomerSellingAmount;
    }

    /**
     * Set 파트너 고객 매출 금액.
     *
     * @param partnerCustomerSellingAmount the partnerCustomerSellingAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withPartnerCustomerSellingAmount(String partnerCustomerSellingAmount) {
        this.partnerCustomerSellingAmount = partnerCustomerSellingAmount;
        return this;
    }

    /**
     * Get 파트너 총 매출 금액.
     *
     * @return the partnerTotalSellingAmount value
     */
    public String partnerTotalSellingAmount() {
        return this.partnerTotalSellingAmount;
    }

    /**
     * Set 파트너 총 매출 금액.
     *
     * @param partnerTotalSellingAmount the partnerTotalSellingAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withPartnerTotalSellingAmount(String partnerTotalSellingAmount) {
        this.partnerTotalSellingAmount = partnerTotalSellingAmount;
        return this;
    }

    /**
     * Get 파트너 차익 금액 (손익 금액).
     *
     * @return the partnerMarginalProfitAmount value
     */
    public String partnerMarginalProfitAmount() {
        return this.partnerMarginalProfitAmount;
    }

    /**
     * Set 파트너 차익 금액 (손익 금액).
     *
     * @param partnerMarginalProfitAmount the partnerMarginalProfitAmount value to set
     * @return the PartnerDemandList object itself.
     */
    public PartnerDemandList withPartnerMarginalProfitAmount(String partnerMarginalProfitAmount) {
        this.partnerMarginalProfitAmount = partnerMarginalProfitAmount;
        return this;
    }

}
