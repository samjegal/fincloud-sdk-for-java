/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EmailListResponseContentItem model.
 */
public class EmailListResponseContentItem {
    /**
     * Email 발송 요청 ID (각 요청을 구분하는 ID, 한번에 여러건에 메일 발송을 요청할 경우 requestId가 여러개의
     * mailId를 포함할 수 있다.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /**
     * 요청일시.
     */
    @JsonProperty(value = "requestDate")
    private NesDateTime requestDate;

    /**
     * Email ID (각 메일 한 건을 구분하는 ID).
     */
    @JsonProperty(value = "mailId")
    private String mailId;

    /**
     * 템플릿 ID.
     */
    @JsonProperty(value = "templateSid")
    private Integer templateSid;

    /**
     * 템플릿 제목.
     */
    @JsonProperty(value = "templateName")
    private String templateName;

    /**
     * Mail 제목.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * Email 발송상태.
     */
    @JsonProperty(value = "emailStatus")
    private EmailListResponseContentItemEmailStatus emailStatus;

    /**
     * 발송자 Email 주소.
     */
    @JsonProperty(value = "senderAddress")
    private String senderAddress;

    /**
     * 발송자 이름.
     */
    @JsonProperty(value = "senderName")
    private String senderName;

    /**
     * 발송완료 일시.
     */
    @JsonProperty(value = "sendDate")
    private NesDateTime sendDate;

    /**
     * 예약발송 여부.
     */
    @JsonProperty(value = "reservationStatus")
    private EmailListResponseContentItemReservationStatus reservationStatus;

    /**
     * 광고메일 여부.
     */
    @JsonProperty(value = "advertising")
    private Boolean advertising;

    /**
     * 수신자 목록 축약표현 (참조/숨은참조 포함하여 총 10명에게 발송된 메일의 경우 xxx@domain.com(9) 의 형태로
     * 표시됨).
     */
    @JsonProperty(value = "representativeRecipient")
    private String representativeRecipient;

    /**
     * Get email 발송 요청 ID (각 요청을 구분하는 ID, 한번에 여러건에 메일 발송을 요청할 경우 requestId가 여러개의 mailId를 포함할 수 있다.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set email 발송 요청 ID (각 요청을 구분하는 ID, 한번에 여러건에 메일 발송을 요청할 경우 requestId가 여러개의 mailId를 포함할 수 있다.
     *
     * @param requestId the requestId value to set
     * @return the EmailListResponseContentItem object itself.
     */
    public EmailListResponseContentItem withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get 요청일시.
     *
     * @return the requestDate value
     */
    public NesDateTime requestDate() {
        return this.requestDate;
    }

    /**
     * Set 요청일시.
     *
     * @param requestDate the requestDate value to set
     * @return the EmailListResponseContentItem object itself.
     */
    public EmailListResponseContentItem withRequestDate(NesDateTime requestDate) {
        this.requestDate = requestDate;
        return this;
    }

    /**
     * Get email ID (각 메일 한 건을 구분하는 ID).
     *
     * @return the mailId value
     */
    public String mailId() {
        return this.mailId;
    }

    /**
     * Set email ID (각 메일 한 건을 구분하는 ID).
     *
     * @param mailId the mailId value to set
     * @return the EmailListResponseContentItem object itself.
     */
    public EmailListResponseContentItem withMailId(String mailId) {
        this.mailId = mailId;
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
     * @return the EmailListResponseContentItem object itself.
     */
    public EmailListResponseContentItem withTemplateSid(Integer templateSid) {
        this.templateSid = templateSid;
        return this;
    }

    /**
     * Get 템플릿 제목.
     *
     * @return the templateName value
     */
    public String templateName() {
        return this.templateName;
    }

    /**
     * Set 템플릿 제목.
     *
     * @param templateName the templateName value to set
     * @return the EmailListResponseContentItem object itself.
     */
    public EmailListResponseContentItem withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * Get mail 제목.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set mail 제목.
     *
     * @param title the title value to set
     * @return the EmailListResponseContentItem object itself.
     */
    public EmailListResponseContentItem withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get email 발송상태.
     *
     * @return the emailStatus value
     */
    public EmailListResponseContentItemEmailStatus emailStatus() {
        return this.emailStatus;
    }

    /**
     * Set email 발송상태.
     *
     * @param emailStatus the emailStatus value to set
     * @return the EmailListResponseContentItem object itself.
     */
    public EmailListResponseContentItem withEmailStatus(EmailListResponseContentItemEmailStatus emailStatus) {
        this.emailStatus = emailStatus;
        return this;
    }

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
     * @return the EmailListResponseContentItem object itself.
     */
    public EmailListResponseContentItem withSenderAddress(String senderAddress) {
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
     * @return the EmailListResponseContentItem object itself.
     */
    public EmailListResponseContentItem withSenderName(String senderName) {
        this.senderName = senderName;
        return this;
    }

    /**
     * Get 발송완료 일시.
     *
     * @return the sendDate value
     */
    public NesDateTime sendDate() {
        return this.sendDate;
    }

    /**
     * Set 발송완료 일시.
     *
     * @param sendDate the sendDate value to set
     * @return the EmailListResponseContentItem object itself.
     */
    public EmailListResponseContentItem withSendDate(NesDateTime sendDate) {
        this.sendDate = sendDate;
        return this;
    }

    /**
     * Get 예약발송 여부.
     *
     * @return the reservationStatus value
     */
    public EmailListResponseContentItemReservationStatus reservationStatus() {
        return this.reservationStatus;
    }

    /**
     * Set 예약발송 여부.
     *
     * @param reservationStatus the reservationStatus value to set
     * @return the EmailListResponseContentItem object itself.
     */
    public EmailListResponseContentItem withReservationStatus(EmailListResponseContentItemReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
        return this;
    }

    /**
     * Get 광고메일 여부.
     *
     * @return the advertising value
     */
    public Boolean advertising() {
        return this.advertising;
    }

    /**
     * Set 광고메일 여부.
     *
     * @param advertising the advertising value to set
     * @return the EmailListResponseContentItem object itself.
     */
    public EmailListResponseContentItem withAdvertising(Boolean advertising) {
        this.advertising = advertising;
        return this;
    }

    /**
     * Get 수신자 목록 축약표현 (참조/숨은참조 포함하여 총 10명에게 발송된 메일의 경우 xxx@domain.com(9) 의 형태로 표시됨).
     *
     * @return the representativeRecipient value
     */
    public String representativeRecipient() {
        return this.representativeRecipient;
    }

    /**
     * Set 수신자 목록 축약표현 (참조/숨은참조 포함하여 총 10명에게 발송된 메일의 경우 xxx@domain.com(9) 의 형태로 표시됨).
     *
     * @param representativeRecipient the representativeRecipient value to set
     * @return the EmailListResponseContentItem object itself.
     */
    public EmailListResponseContentItem withRepresentativeRecipient(String representativeRecipient) {
        this.representativeRecipient = representativeRecipient;
        return this;
    }

}
