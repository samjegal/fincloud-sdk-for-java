/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.partner.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DemandList model.
 */
public class DemandList {
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
     * 청구번호.
     */
    @JsonProperty(value = "demandNo")
    private String demandNo;

    /**
     * 통합 청구번호.
     */
    @JsonProperty(value = "integrationDemandNo")
    private String integrationDemandNo;

    /**
     * 청구 속성 코드.
     */
    @JsonProperty(value = "demandAttributeCode")
    private String demandAttributeCode;

    /**
     * 청구 속성 코드명.
     */
    @JsonProperty(value = "demandAttributeCodeName")
    private String demandAttributeCodeName;

    /**
     * 청구연월.
     */
    @JsonProperty(value = "demandYm")
    private String demandYm;

    /**
     * 빌링 청구 여부.
     */
    @JsonProperty(value = "billingDemandYn")
    private String billingDemandYn;

    /**
     * 총 사용 금액.
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
     * 당월 청구 금액.
     */
    @JsonProperty(value = "thisMonthDemandAmount")
    private String thisMonthDemandAmount;

    /**
     * 당월 부가세 비율.
     */
    @JsonProperty(value = "thisMonthVatRatio")
    private String thisMonthVatRatio;

    /**
     * 당월 부가가치세 금액.
     */
    @JsonProperty(value = "thisMonthVatAmount")
    private String thisMonthVatAmount;

    /**
     * 당월 청구 부가가치세 합계 금액.
     */
    @JsonProperty(value = "thisMonthDemandVatSumAmount")
    private String thisMonthDemandVatSumAmount;

    /**
     * 총 청구 금액.
     */
    @JsonProperty(value = "totalDemandAmount")
    private String totalDemandAmount;

    /**
     * 작성 일시.
     */
    @JsonProperty(value = "writeYmdt")
    private String writeYmdt;

    /**
     * 납입 여부.
     */
    @JsonProperty(value = "paidUpYn")
    private String paidUpYn;

    /**
     * 납입 일시.
     */
    @JsonProperty(value = "paidUpYmdt")
    private String paidUpYmdt;

    /**
     * 당월 연체 여부.
     */
    @JsonProperty(value = "thisMonthOverDueYn")
    private String thisMonthOverDueYn;

    /**
     * 당월 연체 누적 차수.
     */
    @JsonProperty(value = "thisMonthOverDueDegreeCount")
    private String thisMonthOverDueDegreeCount;

    /**
     * 연체 가산 금액.
     */
    @JsonProperty(value = "overDuePlusAmount")
    private String overDuePlusAmount;

    /**
     * 연체 가산 금액 비율.
     */
    @JsonProperty(value = "overDuePlusAmountRatio")
    private String overDuePlusAmountRatio;

    /**
     * 당월 가산 금액.
     */
    @JsonProperty(value = "thisMonthOverDueAmount")
    private String thisMonthOverDueAmount;

    /**
     * 전월 청구 번호.
     */
    @JsonProperty(value = "beforeMonthDemandNo")
    private String beforeMonthDemandNo;

    /**
     * 전월 청구 금액.
     */
    @JsonProperty(value = "beforeMonthDemandAmount")
    private String beforeMonthDemandAmount;

    /**
     * 전월 연체 금액.
     */
    @JsonProperty(value = "beforeMonthOverDueAmount")
    private String beforeMonthOverDueAmount;

    /**
     * 총 연체 금액.
     */
    @JsonProperty(value = "totalOverDueAmount")
    private String totalOverDueAmount;

    /**
     * 처리 수단 코드.
     */
    @JsonProperty(value = "treatmentMeansCode")
    private String treatmentMeansCode;

    /**
     * 처리 수단 코드명.
     */
    @JsonProperty(value = "treatmentMeansCodeName")
    private String treatmentMeansCodeName;

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
     * @return the DemandList object itself.
     */
    public DemandList withPartnerMemberNo(String partnerMemberNo) {
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
     * @return the DemandList object itself.
     */
    public DemandList withPartnerMemberLoginId(String partnerMemberLoginId) {
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
     * @return the DemandList object itself.
     */
    public DemandList withPartnerMemberName(String partnerMemberName) {
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
     * @return the DemandList object itself.
     */
    public DemandList withMemberNo(String memberNo) {
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
     * @return the DemandList object itself.
     */
    public DemandList withLoginId(String loginId) {
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
     * @return the DemandList object itself.
     */
    public DemandList withMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    /**
     * Get 청구번호.
     *
     * @return the demandNo value
     */
    public String demandNo() {
        return this.demandNo;
    }

    /**
     * Set 청구번호.
     *
     * @param demandNo the demandNo value to set
     * @return the DemandList object itself.
     */
    public DemandList withDemandNo(String demandNo) {
        this.demandNo = demandNo;
        return this;
    }

    /**
     * Get 통합 청구번호.
     *
     * @return the integrationDemandNo value
     */
    public String integrationDemandNo() {
        return this.integrationDemandNo;
    }

    /**
     * Set 통합 청구번호.
     *
     * @param integrationDemandNo the integrationDemandNo value to set
     * @return the DemandList object itself.
     */
    public DemandList withIntegrationDemandNo(String integrationDemandNo) {
        this.integrationDemandNo = integrationDemandNo;
        return this;
    }

    /**
     * Get 청구 속성 코드.
     *
     * @return the demandAttributeCode value
     */
    public String demandAttributeCode() {
        return this.demandAttributeCode;
    }

    /**
     * Set 청구 속성 코드.
     *
     * @param demandAttributeCode the demandAttributeCode value to set
     * @return the DemandList object itself.
     */
    public DemandList withDemandAttributeCode(String demandAttributeCode) {
        this.demandAttributeCode = demandAttributeCode;
        return this;
    }

    /**
     * Get 청구 속성 코드명.
     *
     * @return the demandAttributeCodeName value
     */
    public String demandAttributeCodeName() {
        return this.demandAttributeCodeName;
    }

    /**
     * Set 청구 속성 코드명.
     *
     * @param demandAttributeCodeName the demandAttributeCodeName value to set
     * @return the DemandList object itself.
     */
    public DemandList withDemandAttributeCodeName(String demandAttributeCodeName) {
        this.demandAttributeCodeName = demandAttributeCodeName;
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
     * @return the DemandList object itself.
     */
    public DemandList withDemandYm(String demandYm) {
        this.demandYm = demandYm;
        return this;
    }

    /**
     * Get 빌링 청구 여부.
     *
     * @return the billingDemandYn value
     */
    public String billingDemandYn() {
        return this.billingDemandYn;
    }

    /**
     * Set 빌링 청구 여부.
     *
     * @param billingDemandYn the billingDemandYn value to set
     * @return the DemandList object itself.
     */
    public DemandList withBillingDemandYn(String billingDemandYn) {
        this.billingDemandYn = billingDemandYn;
        return this;
    }

    /**
     * Get 총 사용 금액.
     *
     * @return the totalUseAmount value
     */
    public String totalUseAmount() {
        return this.totalUseAmount;
    }

    /**
     * Set 총 사용 금액.
     *
     * @param totalUseAmount the totalUseAmount value to set
     * @return the DemandList object itself.
     */
    public DemandList withTotalUseAmount(String totalUseAmount) {
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
     * @return the DemandList object itself.
     */
    public DemandList withTotalPromiseDiscountAmount(String totalPromiseDiscountAmount) {
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
     * @return the DemandList object itself.
     */
    public DemandList withTotalPromotionDiscountAmount(String totalPromotionDiscountAmount) {
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
     * @return the DemandList object itself.
     */
    public DemandList withTotalEtcDiscountAmount(String totalEtcDiscountAmount) {
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
     * @return the DemandList object itself.
     */
    public DemandList withTotalCustomerDiscountAmount(String totalCustomerDiscountAmount) {
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
     * @return the DemandList object itself.
     */
    public DemandList withTotalProductDiscountAmount(String totalProductDiscountAmount) {
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
     * @return the DemandList object itself.
     */
    public DemandList withTotalCreditDiscountAmount(String totalCreditDiscountAmount) {
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
     * @return the DemandList object itself.
     */
    public DemandList withUnder1000DiscountAmount(String under1000DiscountAmount) {
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
     * @return the DemandList object itself.
     */
    public DemandList withUnder100DiscountAmount(String under100DiscountAmount) {
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
     * @return the DemandList object itself.
     */
    public DemandList withTotalDefaultAmount(String totalDefaultAmount) {
        this.totalDefaultAmount = totalDefaultAmount;
        return this;
    }

    /**
     * Get 당월 청구 금액.
     *
     * @return the thisMonthDemandAmount value
     */
    public String thisMonthDemandAmount() {
        return this.thisMonthDemandAmount;
    }

    /**
     * Set 당월 청구 금액.
     *
     * @param thisMonthDemandAmount the thisMonthDemandAmount value to set
     * @return the DemandList object itself.
     */
    public DemandList withThisMonthDemandAmount(String thisMonthDemandAmount) {
        this.thisMonthDemandAmount = thisMonthDemandAmount;
        return this;
    }

    /**
     * Get 당월 부가세 비율.
     *
     * @return the thisMonthVatRatio value
     */
    public String thisMonthVatRatio() {
        return this.thisMonthVatRatio;
    }

    /**
     * Set 당월 부가세 비율.
     *
     * @param thisMonthVatRatio the thisMonthVatRatio value to set
     * @return the DemandList object itself.
     */
    public DemandList withThisMonthVatRatio(String thisMonthVatRatio) {
        this.thisMonthVatRatio = thisMonthVatRatio;
        return this;
    }

    /**
     * Get 당월 부가가치세 금액.
     *
     * @return the thisMonthVatAmount value
     */
    public String thisMonthVatAmount() {
        return this.thisMonthVatAmount;
    }

    /**
     * Set 당월 부가가치세 금액.
     *
     * @param thisMonthVatAmount the thisMonthVatAmount value to set
     * @return the DemandList object itself.
     */
    public DemandList withThisMonthVatAmount(String thisMonthVatAmount) {
        this.thisMonthVatAmount = thisMonthVatAmount;
        return this;
    }

    /**
     * Get 당월 청구 부가가치세 합계 금액.
     *
     * @return the thisMonthDemandVatSumAmount value
     */
    public String thisMonthDemandVatSumAmount() {
        return this.thisMonthDemandVatSumAmount;
    }

    /**
     * Set 당월 청구 부가가치세 합계 금액.
     *
     * @param thisMonthDemandVatSumAmount the thisMonthDemandVatSumAmount value to set
     * @return the DemandList object itself.
     */
    public DemandList withThisMonthDemandVatSumAmount(String thisMonthDemandVatSumAmount) {
        this.thisMonthDemandVatSumAmount = thisMonthDemandVatSumAmount;
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
     * @return the DemandList object itself.
     */
    public DemandList withTotalDemandAmount(String totalDemandAmount) {
        this.totalDemandAmount = totalDemandAmount;
        return this;
    }

    /**
     * Get 작성 일시.
     *
     * @return the writeYmdt value
     */
    public String writeYmdt() {
        return this.writeYmdt;
    }

    /**
     * Set 작성 일시.
     *
     * @param writeYmdt the writeYmdt value to set
     * @return the DemandList object itself.
     */
    public DemandList withWriteYmdt(String writeYmdt) {
        this.writeYmdt = writeYmdt;
        return this;
    }

    /**
     * Get 납입 여부.
     *
     * @return the paidUpYn value
     */
    public String paidUpYn() {
        return this.paidUpYn;
    }

    /**
     * Set 납입 여부.
     *
     * @param paidUpYn the paidUpYn value to set
     * @return the DemandList object itself.
     */
    public DemandList withPaidUpYn(String paidUpYn) {
        this.paidUpYn = paidUpYn;
        return this;
    }

    /**
     * Get 납입 일시.
     *
     * @return the paidUpYmdt value
     */
    public String paidUpYmdt() {
        return this.paidUpYmdt;
    }

    /**
     * Set 납입 일시.
     *
     * @param paidUpYmdt the paidUpYmdt value to set
     * @return the DemandList object itself.
     */
    public DemandList withPaidUpYmdt(String paidUpYmdt) {
        this.paidUpYmdt = paidUpYmdt;
        return this;
    }

    /**
     * Get 당월 연체 여부.
     *
     * @return the thisMonthOverDueYn value
     */
    public String thisMonthOverDueYn() {
        return this.thisMonthOverDueYn;
    }

    /**
     * Set 당월 연체 여부.
     *
     * @param thisMonthOverDueYn the thisMonthOverDueYn value to set
     * @return the DemandList object itself.
     */
    public DemandList withThisMonthOverDueYn(String thisMonthOverDueYn) {
        this.thisMonthOverDueYn = thisMonthOverDueYn;
        return this;
    }

    /**
     * Get 당월 연체 누적 차수.
     *
     * @return the thisMonthOverDueDegreeCount value
     */
    public String thisMonthOverDueDegreeCount() {
        return this.thisMonthOverDueDegreeCount;
    }

    /**
     * Set 당월 연체 누적 차수.
     *
     * @param thisMonthOverDueDegreeCount the thisMonthOverDueDegreeCount value to set
     * @return the DemandList object itself.
     */
    public DemandList withThisMonthOverDueDegreeCount(String thisMonthOverDueDegreeCount) {
        this.thisMonthOverDueDegreeCount = thisMonthOverDueDegreeCount;
        return this;
    }

    /**
     * Get 연체 가산 금액.
     *
     * @return the overDuePlusAmount value
     */
    public String overDuePlusAmount() {
        return this.overDuePlusAmount;
    }

    /**
     * Set 연체 가산 금액.
     *
     * @param overDuePlusAmount the overDuePlusAmount value to set
     * @return the DemandList object itself.
     */
    public DemandList withOverDuePlusAmount(String overDuePlusAmount) {
        this.overDuePlusAmount = overDuePlusAmount;
        return this;
    }

    /**
     * Get 연체 가산 금액 비율.
     *
     * @return the overDuePlusAmountRatio value
     */
    public String overDuePlusAmountRatio() {
        return this.overDuePlusAmountRatio;
    }

    /**
     * Set 연체 가산 금액 비율.
     *
     * @param overDuePlusAmountRatio the overDuePlusAmountRatio value to set
     * @return the DemandList object itself.
     */
    public DemandList withOverDuePlusAmountRatio(String overDuePlusAmountRatio) {
        this.overDuePlusAmountRatio = overDuePlusAmountRatio;
        return this;
    }

    /**
     * Get 당월 가산 금액.
     *
     * @return the thisMonthOverDueAmount value
     */
    public String thisMonthOverDueAmount() {
        return this.thisMonthOverDueAmount;
    }

    /**
     * Set 당월 가산 금액.
     *
     * @param thisMonthOverDueAmount the thisMonthOverDueAmount value to set
     * @return the DemandList object itself.
     */
    public DemandList withThisMonthOverDueAmount(String thisMonthOverDueAmount) {
        this.thisMonthOverDueAmount = thisMonthOverDueAmount;
        return this;
    }

    /**
     * Get 전월 청구 번호.
     *
     * @return the beforeMonthDemandNo value
     */
    public String beforeMonthDemandNo() {
        return this.beforeMonthDemandNo;
    }

    /**
     * Set 전월 청구 번호.
     *
     * @param beforeMonthDemandNo the beforeMonthDemandNo value to set
     * @return the DemandList object itself.
     */
    public DemandList withBeforeMonthDemandNo(String beforeMonthDemandNo) {
        this.beforeMonthDemandNo = beforeMonthDemandNo;
        return this;
    }

    /**
     * Get 전월 청구 금액.
     *
     * @return the beforeMonthDemandAmount value
     */
    public String beforeMonthDemandAmount() {
        return this.beforeMonthDemandAmount;
    }

    /**
     * Set 전월 청구 금액.
     *
     * @param beforeMonthDemandAmount the beforeMonthDemandAmount value to set
     * @return the DemandList object itself.
     */
    public DemandList withBeforeMonthDemandAmount(String beforeMonthDemandAmount) {
        this.beforeMonthDemandAmount = beforeMonthDemandAmount;
        return this;
    }

    /**
     * Get 전월 연체 금액.
     *
     * @return the beforeMonthOverDueAmount value
     */
    public String beforeMonthOverDueAmount() {
        return this.beforeMonthOverDueAmount;
    }

    /**
     * Set 전월 연체 금액.
     *
     * @param beforeMonthOverDueAmount the beforeMonthOverDueAmount value to set
     * @return the DemandList object itself.
     */
    public DemandList withBeforeMonthOverDueAmount(String beforeMonthOverDueAmount) {
        this.beforeMonthOverDueAmount = beforeMonthOverDueAmount;
        return this;
    }

    /**
     * Get 총 연체 금액.
     *
     * @return the totalOverDueAmount value
     */
    public String totalOverDueAmount() {
        return this.totalOverDueAmount;
    }

    /**
     * Set 총 연체 금액.
     *
     * @param totalOverDueAmount the totalOverDueAmount value to set
     * @return the DemandList object itself.
     */
    public DemandList withTotalOverDueAmount(String totalOverDueAmount) {
        this.totalOverDueAmount = totalOverDueAmount;
        return this;
    }

    /**
     * Get 처리 수단 코드.
     *
     * @return the treatmentMeansCode value
     */
    public String treatmentMeansCode() {
        return this.treatmentMeansCode;
    }

    /**
     * Set 처리 수단 코드.
     *
     * @param treatmentMeansCode the treatmentMeansCode value to set
     * @return the DemandList object itself.
     */
    public DemandList withTreatmentMeansCode(String treatmentMeansCode) {
        this.treatmentMeansCode = treatmentMeansCode;
        return this;
    }

    /**
     * Get 처리 수단 코드명.
     *
     * @return the treatmentMeansCodeName value
     */
    public String treatmentMeansCodeName() {
        return this.treatmentMeansCodeName;
    }

    /**
     * Set 처리 수단 코드명.
     *
     * @param treatmentMeansCodeName the treatmentMeansCodeName value to set
     * @return the DemandList object itself.
     */
    public DemandList withTreatmentMeansCodeName(String treatmentMeansCodeName) {
        this.treatmentMeansCodeName = treatmentMeansCodeName;
        return this;
    }

}
