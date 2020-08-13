/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MailRequestParameter model.
 */
public class MailRequestParameter {
    /**
     * 발송자 Email 주소.
     */
    @JsonProperty(value = "senderAddress", required = true)
    private String senderAddress;

    /**
     * 발송자 이름.
     */
    @JsonProperty(value = "senderName")
    private String senderName;

    /**
     * 템플릿 ID.
     */
    @JsonProperty(value = "templateSid")
    private Integer templateSid;

    /**
     * 메일 제목.
     */
    @JsonProperty(value = "title", required = true)
    private String title;

    /**
     * 메일 본문.
     */
    @JsonProperty(value = "body", required = true)
    private String body;

    /**
     * 개인발송여부.
     */
    @JsonProperty(value = "individual")
    private Boolean individual;

    /**
     * 확인 후 발송 여부.
     */
    @JsonProperty(value = "confirmAndSend")
    private Boolean confirmAndSend;

    /**
     * 광고메일여부.
     */
    @JsonProperty(value = "advertising")
    private Boolean advertising;

    /**
     * 치환 파라미터.
     */
    @JsonProperty(value = "parameters")
    private Object parameters;

    /**
     * 특정 메일을 모아서 보기 위해 네이버 메일에서 지원하는 기능.
     */
    @JsonProperty(value = "referencesHeader")
    private String referencesHeader;

    /**
     * 예약 발송 일시.
     */
    @JsonProperty(value = "reservationUtc")
    private Double reservationUtc;

    /**
     * 예약 발송 일시, reservationUtc 값이 우선.
     */
    @JsonProperty(value = "reservationDateTime")
    private String reservationDateTime;

    /**
     * 첨부파일 ID 목록.
     */
    @JsonProperty(value = "attachFileIds")
    private List<String> attachFileIds;

    /**
     * 수신자 목록.
     */
    @JsonProperty(value = "recipients", required = true)
    private List<RecipientForRequest> recipients;

    /**
     * 수신자 그룹 조합 발송 조건.
     */
    @JsonProperty(value = "recipientGroupFilter")
    private Object recipientGroupFilter;

    /**
     * 광고 메일일 경우 기본 수신 거부 문구 사용 여부.
     */
    @JsonProperty(value = "useBasicUnsubscribeMsg")
    private Boolean useBasicUnsubscribeMsg;

    /**
     * 사용자 정의 수신 거부 문구.
     */
    @JsonProperty(value = "unsubscribeMessage")
    private String unsubscribeMessage;

    /**
     * Get 발송자 Email 주소.
     *
     * @return the senderAddress value
     */
    public String senderAddress() {
        return this.senderAddress;
    }

    /**
     * Set 발송자 Email 주소.
     *
     * @param senderAddress the senderAddress value to set
     * @return the MailRequestParameter object itself.
     */
    public MailRequestParameter withSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
        return this;
    }

    /**
     * Get 발송자 이름.
     *
     * @return the senderName value
     */
    public String senderName() {
        return this.senderName;
    }

    /**
     * Set 발송자 이름.
     *
     * @param senderName the senderName value to set
     * @return the MailRequestParameter object itself.
     */
    public MailRequestParameter withSenderName(String senderName) {
        this.senderName = senderName;
        return this;
    }

    /**
     * Get 템플릿 ID.
     *
     * @return the templateSid value
     */
    public Integer templateSid() {
        return this.templateSid;
    }

    /**
     * Set 템플릿 ID.
     *
     * @param templateSid the templateSid value to set
     * @return the MailRequestParameter object itself.
     */
    public MailRequestParameter withTemplateSid(Integer templateSid) {
        this.templateSid = templateSid;
        return this;
    }

    /**
     * Get 메일 제목.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set 메일 제목.
     *
     * @param title the title value to set
     * @return the MailRequestParameter object itself.
     */
    public MailRequestParameter withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get 메일 본문.
     *
     * @return the body value
     */
    public String body() {
        return this.body;
    }

    /**
     * Set 메일 본문.
     *
     * @param body the body value to set
     * @return the MailRequestParameter object itself.
     */
    public MailRequestParameter withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get 개인발송여부.
     *
     * @return the individual value
     */
    public Boolean individual() {
        return this.individual;
    }

    /**
     * Set 개인발송여부.
     *
     * @param individual the individual value to set
     * @return the MailRequestParameter object itself.
     */
    public MailRequestParameter withIndividual(Boolean individual) {
        this.individual = individual;
        return this;
    }

    /**
     * Get 확인 후 발송 여부.
     *
     * @return the confirmAndSend value
     */
    public Boolean confirmAndSend() {
        return this.confirmAndSend;
    }

    /**
     * Set 확인 후 발송 여부.
     *
     * @param confirmAndSend the confirmAndSend value to set
     * @return the MailRequestParameter object itself.
     */
    public MailRequestParameter withConfirmAndSend(Boolean confirmAndSend) {
        this.confirmAndSend = confirmAndSend;
        return this;
    }

    /**
     * Get 광고메일여부.
     *
     * @return the advertising value
     */
    public Boolean advertising() {
        return this.advertising;
    }

    /**
     * Set 광고메일여부.
     *
     * @param advertising the advertising value to set
     * @return the MailRequestParameter object itself.
     */
    public MailRequestParameter withAdvertising(Boolean advertising) {
        this.advertising = advertising;
        return this;
    }

    /**
     * Get 치환 파라미터.
     *
     * @return the parameters value
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set 치환 파라미터.
     *
     * @param parameters the parameters value to set
     * @return the MailRequestParameter object itself.
     */
    public MailRequestParameter withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get 특정 메일을 모아서 보기 위해 네이버 메일에서 지원하는 기능.
     *
     * @return the referencesHeader value
     */
    public String referencesHeader() {
        return this.referencesHeader;
    }

    /**
     * Set 특정 메일을 모아서 보기 위해 네이버 메일에서 지원하는 기능.
     *
     * @param referencesHeader the referencesHeader value to set
     * @return the MailRequestParameter object itself.
     */
    public MailRequestParameter withReferencesHeader(String referencesHeader) {
        this.referencesHeader = referencesHeader;
        return this;
    }

    /**
     * Get 예약 발송 일시.
     *
     * @return the reservationUtc value
     */
    public Double reservationUtc() {
        return this.reservationUtc;
    }

    /**
     * Set 예약 발송 일시.
     *
     * @param reservationUtc the reservationUtc value to set
     * @return the MailRequestParameter object itself.
     */
    public MailRequestParameter withReservationUtc(Double reservationUtc) {
        this.reservationUtc = reservationUtc;
        return this;
    }

    /**
     * Get 예약 발송 일시, reservationUtc 값이 우선.
     *
     * @return the reservationDateTime value
     */
    public String reservationDateTime() {
        return this.reservationDateTime;
    }

    /**
     * Set 예약 발송 일시, reservationUtc 값이 우선.
     *
     * @param reservationDateTime the reservationDateTime value to set
     * @return the MailRequestParameter object itself.
     */
    public MailRequestParameter withReservationDateTime(String reservationDateTime) {
        this.reservationDateTime = reservationDateTime;
        return this;
    }

    /**
     * Get 첨부파일 ID 목록.
     *
     * @return the attachFileIds value
     */
    public List<String> attachFileIds() {
        return this.attachFileIds;
    }

    /**
     * Set 첨부파일 ID 목록.
     *
     * @param attachFileIds the attachFileIds value to set
     * @return the MailRequestParameter object itself.
     */
    public MailRequestParameter withAttachFileIds(List<String> attachFileIds) {
        this.attachFileIds = attachFileIds;
        return this;
    }

    /**
     * Get 수신자 목록.
     *
     * @return the recipients value
     */
    public List<RecipientForRequest> recipients() {
        return this.recipients;
    }

    /**
     * Set 수신자 목록.
     *
     * @param recipients the recipients value to set
     * @return the MailRequestParameter object itself.
     */
    public MailRequestParameter withRecipients(List<RecipientForRequest> recipients) {
        this.recipients = recipients;
        return this;
    }

    /**
     * Get 수신자 그룹 조합 발송 조건.
     *
     * @return the recipientGroupFilter value
     */
    public Object recipientGroupFilter() {
        return this.recipientGroupFilter;
    }

    /**
     * Set 수신자 그룹 조합 발송 조건.
     *
     * @param recipientGroupFilter the recipientGroupFilter value to set
     * @return the MailRequestParameter object itself.
     */
    public MailRequestParameter withRecipientGroupFilter(Object recipientGroupFilter) {
        this.recipientGroupFilter = recipientGroupFilter;
        return this;
    }

    /**
     * Get 광고 메일일 경우 기본 수신 거부 문구 사용 여부.
     *
     * @return the useBasicUnsubscribeMsg value
     */
    public Boolean useBasicUnsubscribeMsg() {
        return this.useBasicUnsubscribeMsg;
    }

    /**
     * Set 광고 메일일 경우 기본 수신 거부 문구 사용 여부.
     *
     * @param useBasicUnsubscribeMsg the useBasicUnsubscribeMsg value to set
     * @return the MailRequestParameter object itself.
     */
    public MailRequestParameter withUseBasicUnsubscribeMsg(Boolean useBasicUnsubscribeMsg) {
        this.useBasicUnsubscribeMsg = useBasicUnsubscribeMsg;
        return this;
    }

    /**
     * Get 사용자 정의 수신 거부 문구.
     *
     * @return the unsubscribeMessage value
     */
    public String unsubscribeMessage() {
        return this.unsubscribeMessage;
    }

    /**
     * Set 사용자 정의 수신 거부 문구.
     *
     * @param unsubscribeMessage the unsubscribeMessage value to set
     * @return the MailRequestParameter object itself.
     */
    public MailRequestParameter withUnsubscribeMessage(String unsubscribeMessage) {
        this.unsubscribeMessage = unsubscribeMessage;
        return this;
    }

}
