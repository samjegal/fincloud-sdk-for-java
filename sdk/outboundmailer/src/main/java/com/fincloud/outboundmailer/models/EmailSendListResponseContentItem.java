/**
 * FINCLOUD_APACHE_NO_VERSION
 */

package com.fincloud.outboundmailer.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EmailSendListResponseContentItem model.
 */
public class EmailSendListResponseContentItem {
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
     * The emailStatus property.
     */
    @JsonProperty(value = "emailStatus")
    private EmailSendListResponseContentItemEmailStatus emailStatus;

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
     * Email 발송요청 도구 (CONSOLE : NCP Console 화면을 통한 요청, API : API 호출을 통한 요청).
     */
    @JsonProperty(value = "dispatchType")
    private String dispatchType;

    /**
     * 발송완료 일시.
     */
    @JsonProperty(value = "sendDate")
    private NesDateTime sendDate;

    /**
     * 예약 발송 일시.
     */
    @JsonProperty(value = "reservationDate")
    private NesDateTime reservationDate;

    /**
     * 발송 메일 건수 (개별 발송일 경우 recipientCount 와 동일).
     */
    @JsonProperty(value = "requestCount")
    private Integer requestCount;

    /**
     * 발송 수신자/참조/숨은참조자 수 총합(개별 발송일 경우 requestCount 와 동일하지만 일반발송의 경우
     * requestCount 보다 같거나 크다).
     */
    @JsonProperty(value = "recipientCount")
    private Integer recipientCount;

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
     * @return the EmailSendListResponseContentItem object itself.
     */
    public EmailSendListResponseContentItem withRequestId(String requestId) {
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
     * @return the EmailSendListResponseContentItem object itself.
     */
    public EmailSendListResponseContentItem withRequestDate(NesDateTime requestDate) {
        this.requestDate = requestDate;
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
     * @return the EmailSendListResponseContentItem object itself.
     */
    public EmailSendListResponseContentItem withTemplateSid(Integer templateSid) {
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
     * @return the EmailSendListResponseContentItem object itself.
     */
    public EmailSendListResponseContentItem withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * Get the emailStatus value.
     *
     * @return the emailStatus value
     */
    public EmailSendListResponseContentItemEmailStatus emailStatus() {
        return this.emailStatus;
    }

    /**
     * Set the emailStatus value.
     *
     * @param emailStatus the emailStatus value to set
     * @return the EmailSendListResponseContentItem object itself.
     */
    public EmailSendListResponseContentItem withEmailStatus(EmailSendListResponseContentItemEmailStatus emailStatus) {
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
     * @return the EmailSendListResponseContentItem object itself.
     */
    public EmailSendListResponseContentItem withSenderAddress(String senderAddress) {
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
     * @return the EmailSendListResponseContentItem object itself.
     */
    public EmailSendListResponseContentItem withSenderName(String senderName) {
        this.senderName = senderName;
        return this;
    }

    /**
     * Get email 발송요청 도구 (CONSOLE : NCP Console 화면을 통한 요청, API : API 호출을 통한 요청).
     *
     * @return the dispatchType value
     */
    public String dispatchType() {
        return this.dispatchType;
    }

    /**
     * Set email 발송요청 도구 (CONSOLE : NCP Console 화면을 통한 요청, API : API 호출을 통한 요청).
     *
     * @param dispatchType the dispatchType value to set
     * @return the EmailSendListResponseContentItem object itself.
     */
    public EmailSendListResponseContentItem withDispatchType(String dispatchType) {
        this.dispatchType = dispatchType;
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
     * @return the EmailSendListResponseContentItem object itself.
     */
    public EmailSendListResponseContentItem withSendDate(NesDateTime sendDate) {
        this.sendDate = sendDate;
        return this;
    }

    /**
     * Get 예약 발송 일시.
     *
     * @return the reservationDate value
     */
    public NesDateTime reservationDate() {
        return this.reservationDate;
    }

    /**
     * Set 예약 발송 일시.
     *
     * @param reservationDate the reservationDate value to set
     * @return the EmailSendListResponseContentItem object itself.
     */
    public EmailSendListResponseContentItem withReservationDate(NesDateTime reservationDate) {
        this.reservationDate = reservationDate;
        return this;
    }

    /**
     * Get 발송 메일 건수 (개별 발송일 경우 recipientCount 와 동일).
     *
     * @return the requestCount value
     */
    public Integer requestCount() {
        return this.requestCount;
    }

    /**
     * Set 발송 메일 건수 (개별 발송일 경우 recipientCount 와 동일).
     *
     * @param requestCount the requestCount value to set
     * @return the EmailSendListResponseContentItem object itself.
     */
    public EmailSendListResponseContentItem withRequestCount(Integer requestCount) {
        this.requestCount = requestCount;
        return this;
    }

    /**
     * Get 발송 수신자/참조/숨은참조자 수 총합(개별 발송일 경우 requestCount 와 동일하지만 일반발송의 경우 requestCount 보다 같거나 크다).
     *
     * @return the recipientCount value
     */
    public Integer recipientCount() {
        return this.recipientCount;
    }

    /**
     * Set 발송 수신자/참조/숨은참조자 수 총합(개별 발송일 경우 requestCount 와 동일하지만 일반발송의 경우 requestCount 보다 같거나 크다).
     *
     * @param recipientCount the recipientCount value to set
     * @return the EmailSendListResponseContentItem object itself.
     */
    public EmailSendListResponseContentItem withRecipientCount(Integer recipientCount) {
        this.recipientCount = recipientCount;
        return this;
    }

}
